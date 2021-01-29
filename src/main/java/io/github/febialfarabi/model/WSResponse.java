package io.github.febialfarabi.model;

public class WSResponse<D, E> {

    int code ;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    D data ;

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    String message ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    E messageError ;

    public E getMessageError() {
        return messageError;
    }

    public void setMessageError(E messageError) {
        this.messageError = messageError;
    }

    long totalElement ;

    public long getTotalElement() {
        return totalElement;
    }

    int totalPage ;

    public int getTotalPage() {
        return totalPage;
    }

    int pageElement ;

    public int getPageElement() {
        return pageElement;
    }

    public static <D> WSResponse instance(int code, String message, D data){
        WSResponse instance = new WSResponse<>();
        instance.setCode(code);
        instance.setMessage(message);
        instance.setData(data);
        return instance ;
    }

    public static <D> WSResponse instance(int code, String message){
        WSResponse instance = new WSResponse<>();
        instance.setCode(code);
        instance.setMessage(message);
        return instance ;
    }

    public static <E> WSResponse instanceError(int code, String message, E messageError){
        WSResponse instance = new WSResponse<>();
        instance.setCode(code);
        instance.setMessage(message);
        instance.setMessageError(messageError);
        return instance ;
    }

    public static <D> WSResponse instance(int code, D data){
        WSResponse instance = new WSResponse<>();
        instance.setCode(code);
        instance.setData(data);
        return instance ;
    }

    public WSResponse setTotalElement(long totalElement) {
        this.totalElement = totalElement;
        return this ;
    }

    public WSResponse setTotalPage(int totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public WSResponse setPageElement(int pageElement) {
        this.pageElement = pageElement;
        return this ;
    }
}
