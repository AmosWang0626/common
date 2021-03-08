package com.amos.common.dto.base;

/**
 * IErrorCode
 *
 * @author amos.wang
 * @date 2021/2/8 16:43
 */
public interface IErrorCode {

    /**
     * get error code
     *
     * @return error code
     */
    String getCode();

    /**
     * get error msg
     *
     * @return error message
     */
    String getMessage();

}
