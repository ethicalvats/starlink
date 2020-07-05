
document.addEventListener("DOMContentLoaded", function(){
    fetch('http://localhost:9001')
        .then(res => {
            console.log("NODEJS9001 ::", res.body)
        })
    fetch('http://localhost:9002')
        .then(res => {
            console.log("PYTHON9002 ::", res.body)
        })
    fetch('http://localhost:9003')
        .then(res => {
            console.log("JAVA9003 ::", res.body)
        })
    fetch('http://localhost:9004')
        .then(res => {
            console.log("RUBY9004 ::", res.body)
        })
    fetch('http://localhost:9005')
        .then(res => {
            console.log("GO9005 ::", res.body)
        })
    fetch('http://localhost:9006')
        .then(res => {
            console.log("NGINXPHP9006 ::", res.body)
        })

  Buffers()
});