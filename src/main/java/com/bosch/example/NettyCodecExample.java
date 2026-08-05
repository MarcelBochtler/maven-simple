package com.bosch.example;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/** Demonstrates allocating a small Netty byte buffer. */
public final class NettyCodecExample {
    private NettyCodecExample() {
    }

    public static int bufferSize() {
        ByteBuf buffer = Unpooled.wrappedBuffer(new byte[] {1, 2, 3});
        return buffer.readableBytes();
    }
}
