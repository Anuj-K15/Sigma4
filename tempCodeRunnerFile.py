import heapq

class Node:
    def __init__(self, position, parent=None, g=0, h=0):
        self.position = position
        self.parent = parent
        self.g = g  # Cost from start to node
        self.h = h  # Heuristic estimate from node to goal
        self.f = g + h  # Total cost

    def __lt__(self, other):
        return self.f < other.f  # Needed for priority queue comparison

def a_star(grid, start, end):
    def heuristic(pos0, pos1):
        return abs(pos0[0] - pos1[0]) + abs(pos0[1] - pos1[1])  # Manhattan distance
    
    open_list = []
    closed_set = set()
    heapq.heappush(open_list, Node(start, None, 0, heuristic(start, end)))
    
    while open_list:
        current_node = heapq.heappop(open_list)
        
        if current_node.position == end:
            path = []
            while current_node:
                path.append(current_node.position)
                current_node = current_node.parent
            return path[::-1]  # Return reconstructed path
        
        closed_set.add(current_node.position)
        
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]  # Right, Down, Left, Up
        
        for dir in directions:
            new_position = (current_node.position[0] + dir[0], current_node.position[1] + dir[1])
            
            if (new_position[0] < 0 or new_position[0] >= len(grid) or 
                new_position[1] < 0 or new_position[1] >= len(grid[0]) or
                grid[new_position[0]][new_position[1]] == 1 or
                new_position in closed_set):
                continue
            
            g = current_node.g + 1
            h = heuristic(new_position, end)
            new_node = Node(new_position, current_node, g, h)
            
            if any(node for node in open_list if node.position == new_position and node.g <= g):
                continue
            
            heapq.heappush(open_list, new_node)
    
    return []  # No path found

# Example usage
grid = [
    [0, 0, 0, 0, 0],
    [1, 1, 1, 1, 0],
    [0, 0, 0, 0, 0],
    [0, 1, 1, 1, 1],
    [0, 0, 0, 0, 0]
]

start = (0, 0)
end = (4, 4)
print(a_star(grid, start, end))
