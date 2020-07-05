package com.github.starlink.satja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

@Service
public class BufferServiceImpl implements BufferService {

    @Autowired
    public BufferServiceImpl(){

    }

    public void init() {
        ByteBuffer buffer = ByteBuffer.allocate(50);
        CharBuffer charBuffer = buffer.asCharBuffer();
        charBuffer.put("I am a buffer!");
        charBuffer.flip();
        String s = charBuffer.toString();
        System.out.println(s);
    }
}