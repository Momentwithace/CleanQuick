package com.momentwithace.cleanquick.exception;

public class VerificationTokenNotFoundException extends RuntimeException{
    public VerificationTokenNotFoundException(String message) {
        super(message);
    }
}
