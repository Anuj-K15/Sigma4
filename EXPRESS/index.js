const express = require('express');
const app = express();

let port = 8080;

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

app.get('/', (req, res) => {
    res.send('hello you  contacted root path');
});

app.get('/:username/:id', (req, res) => {
    console.log(req.params);
    res.send('hello you');
});

app.get('/search', (req, res) => {
    let {q}= req.query;
    res.send(`<h1>search results for query ${q}</h1>`);
});