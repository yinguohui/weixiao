package com.xihua.weixiao.filter;

import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.result.ErrorStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author ：ganjie
 * @description：异常统一处理类
 * @date ：Created in 2019-07-27 16:35
 * @modified By：
 */
@ControllerAdvice
public class ExceptionHandlerBean  extends ResponseEntityExceptionHandler {

    /**
     * 处理系统产生的所有异常
     * @param ex
     * @param request
     * @return
     * @throws Exception
     */
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleException(RuntimeException ex, WebRequest request) {
        return getResponseEntity(ex,request);
    }


    /**
     * 根据各种异常构建 ResponseEntity 实体. 服务于以上各种异常
     * @param ex
     * @param request
     * @return
     */
    private ResponseEntity<Object> getResponseEntity(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, ApiResult.failure("系统错误", ErrorStatus.UNKNOWN_ERROR),
                new HttpHeaders(), HttpStatus.OK, request);
    }

}
