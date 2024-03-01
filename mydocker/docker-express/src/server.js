const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send("Welcome to Express Docker Learning Session");
});

app.listen(3000, function(){
    console.log("Express is listening to port now 3000");
});
