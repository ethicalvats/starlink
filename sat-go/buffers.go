package main

import (
	"bytes"
	"fmt"
)

func buffers(){
	var b bytes.Buffer
	b.Write([]byte("I am a buffer!"))
	fmt.Println(b)
	fmt.Println(b.String())
}
