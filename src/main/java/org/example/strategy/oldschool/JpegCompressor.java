package org.example.strategy.oldschool;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("compressing using jpeg");
    }
}
