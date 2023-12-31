package com.example.nmd.dto.response;


import lombok.Data;

/**
 * @author MinhDV
 */

@Data
public class BaseItemResponse<T> extends BaseResponse {
    private T data;

    public BaseItemResponse() {
    }

    public BaseItemResponse(T data) {
        this.data = data;
    }

    public void setSuccess(T data) {
        super.setSuccess(true);
        this.data = data;
    }
}
