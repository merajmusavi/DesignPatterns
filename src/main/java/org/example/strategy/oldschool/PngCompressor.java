package org.example.strategy.oldschool;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("compressing png");
    }
}
