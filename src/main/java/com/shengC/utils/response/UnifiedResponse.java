package com.shengC.utils.response;


import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * 统一的返回格式类
 *
 * @author sc
 * @create 2018-07-03-16:24
 **/
public class UnifiedResponse {
    private String code;
    private String message;
    private Object data;
    private Long timestamp;

    private UnifiedResponse(String code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public static UnifiedResponse getSuccessInstance(){
        return getSuccessInstance("success!");
    }

    public static UnifiedResponse getSuccessInstance(String msg){
        return new UnifiedResponse("0",msg);
    }

    public static UnifiedResponse getFailInstance(){
        return getFailInstance("fail!");
    }

    public static UnifiedResponse getFailInstance(String msg){
        return new UnifiedResponse("-1",msg);
    }

    @Override
    public String toString() {
        return toJSONString(this,true);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public UnifiedResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public static void main(String[] args) {
        System.out.println(        UnifiedResponse.getSuccessInstance().toString());
    }
}
