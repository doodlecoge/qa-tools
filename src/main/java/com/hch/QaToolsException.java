package com.hch;

/**
 * User: huaiwang
 * Date: 13-11-26
 * Time: 上午8:49
 */
public class QaToolsException extends RuntimeException {
    public QaToolsException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public QaToolsException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public QaToolsException(String message, Throwable cause) {
        super(message, cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public QaToolsException(Throwable cause) {
        super(cause);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
