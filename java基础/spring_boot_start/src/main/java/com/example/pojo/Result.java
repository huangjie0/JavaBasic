package com.example.pojo;

public class Result {
    private Integer code;
    private String msg;
    private Object data;
    public Result(){};
    public Result(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //定义静态方法 帮助我们快速构造result对象
    public static Result success(Object data){
        return new Result(1,"success",data);
    }

    public static Result success(){
        return new Result(1,"success",null);
    }

    public static Result success(String msg){
        return new Result(1,msg,null);
    }
}
