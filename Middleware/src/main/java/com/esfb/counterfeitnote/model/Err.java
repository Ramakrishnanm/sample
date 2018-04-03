package com.esfb.counterfeitnote.model;

import java.io.Serializable;

import com.esfb.counterfeitnote.config.ErrCode;
import com.esfb.counterfeitnote.util.SpringUtils;

public class Err implements Serializable {

    private static final long serialVersionUID = -1543448945678398245L;

    private ErrCode code;
    private String message;

    public Err() {
        super();
    }

    public Err(ErrCode code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public Err(ErrCode code) {
        this.setCode(code);
        this.setMessage(getMessage(code.toString()));
    }

    public Err(String message) {
        this.setCode(ErrCode.UNKNOWN);
        this.setMessage(message);
    }

    public ErrCode getCode() {
        return code;
    }

    public void setCode(ErrCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(String key) {
        return SpringUtils.getMessageSource().getMessage(key, null, SpringUtils.getLocale());
    }
}
