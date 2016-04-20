package com.cddaka.springmvcDemo.util.ajax;

/**
 * Created by Administrator on 2016/2/17.
 *
 * 该类作为ajax对象返回
 *
 */
public class AjaxResult {
    private Integer status; //返回状态 0为成功
    private String message; //返回的状态说明
    private Object data;    //返回的数据

    public AjaxResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public void setData(Object data) {
        this.data = data;
    }
}
