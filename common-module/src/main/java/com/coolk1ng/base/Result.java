package com.coolk1ng.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回对象
 *
 * @author CodeSniper
 * @since 2022-01-01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    /**
     * 成功/失败状态
     */
    private boolean flag;

    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 成功时返回信息
     * @param message
     * @return ResResult
     */
    public static Result success(String message){
        return new Result(true,null,"-1",message);
    }

    /**
     * 成功时返回信息
     * @param data
     * @return ResResult
     */
    public static Result success(Object data){
        return new Result(true,data,"-1","success");
    }

    /**
     * 成功时返回信息
     * @param data
     * @return ResResult
     */
    public static Result success(String message,Object data){
        return new Result(true,data,"-1",message);
    }

    /**
     * 请求失败返回信息
     * @param message
     * @return ResResult
     */
    public static Result fail(String message){
        return new Result(false,null,"400",message);
    }

    /**
     * 错误时返回信息
     * @param errorCode
     * @param message
     * @param data
     * @return ResResult
     */
    public static Result fail(String errorCode,String message, Object data){
        return new Result(false,data,errorCode,message);
    }

    public static Result fail(Object data){
        return new Result(false,data,"400","fail");
    }
}
