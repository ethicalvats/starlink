function Buffers() {
  const str = "I am a buffer!"
  let buffer = new ArrayBuffer(str.length*2)
  let bufView = new Uint16Array(buffer)
  for (let i=0, strLen=str.length; i < strLen; i++) {
    bufView[i] = str.charCodeAt(i);
  }
  console.log(buffer)
  console.log(String.fromCharCode.apply(null, new Uint16Array(buffer)))
}