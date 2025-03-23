let nums = [10,20,30,40,50,60];

// let ans = nums.every((el) => el % 10 == 0);

// console.log(ans);
let min = nums.reduce((min, el) => {
    if (min < el) {
        return min;
    } else {
        return el;
    }
});
console.log(min);