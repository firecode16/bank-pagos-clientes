package com.bank.pagos.response;

/**
 *
 * @author FireCode16
 */
public class PagosResponse {

    private String result;
    private String message;
    private Object data;

    public PagosResponse() {
    }

    public PagosResponse(String result, Object data) {
        this.result = result;
        this.data = data;
    }

    public PagosResponse(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
