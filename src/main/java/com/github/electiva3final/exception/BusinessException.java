package com.github.electiva3final.exception;

public class BusinessException extends Exception {
    private static final long serialVersionUID = 1L;
    private String violation;

    public BusinessException() {
        super();
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message, String violation) {
        super(message);

        if (violation != null) {
            this.violation = violation;
        } else {
            this.violation = new String();
        }
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

}
