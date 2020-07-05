class buffers{
  init(){
    const buffer = new Buffer.alloc(50)
    buffer.fill("I am a buffer!")
    console.log(buffer)
    console.log(buffer.toString())
  }
}
module.exports = buffers