package com.amos.common.api.response;

import com.amos.common.api.pojo.BaseForm;
import com.amos.common.api.pojo.BaseVO;

/**
 * DESCRIPTION: ResponseTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class ResponseTest {

    public static void main(String[] args) {
        print(info(new TestForm().setId("1433233")));
        print(error(new TestForm().setId("1433233")));
        print(errorParam("邮箱格式错误"));
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

    public static GeneralResponse<BaseVO> info(BaseForm form) {
        return GeneralResponse.ofSuccess();
    }

    public static GeneralResponse<BaseVO> error(BaseForm form) {
        return GeneralResponse.ofFailure();
    }

    public static GeneralResponse<BaseVO> errorParam(String message) {
        return GeneralResponse.ofErrorParam(message);
    }

}
