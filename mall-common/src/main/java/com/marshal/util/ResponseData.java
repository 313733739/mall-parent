package com.marshal.util;

import java.io.Serializable;
import java.util.List;

public class ResponseData implements Serializable {

    private long total;
    private List rows;
    private boolean success;
    private String message;

    public ResponseData() {
    }

    public ResponseData(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public ResponseData(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ResponseData(long total, List rows, boolean success, String message) {
        this.total = total;
        this.rows = rows;
        this.success = success;
        this.message = message;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
