package com.company.project.core;

/**
 * 服务（业务）异常如“ 账号或密码错误 ”，该异常只做INFO级别的日志记录 @see WebMvcConfigurer
 */
public class BusinessServiceException extends RuntimeException {

    public BusinessServiceException(String message) {
        super(message);
    }

    public BusinessServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
