package com.esfb.counterfeitnote.config;

import com.esfb.counterfeitnote.model.Err;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = -3238907328933873308L;

    protected Err err;

    public AppException() {
        super();
    }

    public AppException(Err err) {
        super(err.toString());
        this.err = err;
    }

    public AppException(Err err, Throwable cause) {
        super(err.toString(), cause);
        this.err = err;
    }

    public AppException(ErrCode code) {
        this(new Err(code));
    }

    public AppException(ErrCode code, Throwable cause) {
        super(code.toString(), cause);
        this.err = new Err(code);
    }

    public AppException(String message) {
        this(new Err(message));
    }

    public AppException(String message, Throwable cause) {
        this(new Err(message), cause);
    }

    public AppException(Throwable cause) {
        this(ErrCode.UNKNOWN, cause);
    }

    public Err getErr() {
        return err;
    }
}
