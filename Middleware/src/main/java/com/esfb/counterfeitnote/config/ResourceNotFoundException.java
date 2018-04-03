package com.esfb.counterfeitnote.config;

import com.esfb.counterfeitnote.model.Err;

public class ResourceNotFoundException extends AppException {

    private static final long serialVersionUID = 2212060569469130069L;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(Err err) {
        super(err);
    }

    public ResourceNotFoundException(Err err, Throwable cause) {
        super(err, cause);
    }

    public ResourceNotFoundException(ErrCode code) {
        super(code);
    }

    public ResourceNotFoundException(ErrCode code, Throwable cause) {
        super(code, cause);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
}
