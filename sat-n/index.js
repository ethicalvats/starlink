const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
    res.set({
        "Access-Control-Allow-Origin": "http://localhost:9000",
        'Access-Control-Allow-Methods': 'GET'
    })
    return res.send('Affirmative!')
})

app.listen(port, () => console.log(`Satellite Node :: listening at http://localhost:${port}`))