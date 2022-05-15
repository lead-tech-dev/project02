package com.hemebiotech.analytics;

public class FileEmptyException extends RuntimeException {
    public FileEmptyException(String msg) {
        super(msg);
    }
}
