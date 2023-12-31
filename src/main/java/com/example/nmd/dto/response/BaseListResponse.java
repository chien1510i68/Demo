package com.example.nmd.dto.response;


import lombok.Data;

import java.util.List;

/**
 * @author MinhDV
 */

@Data
public class BaseListResponse<T> extends BaseResponse {

    private DataList data;

    public void setResult(List<T> rows, Integer total) {
        if (rows != null) {
            super.setSuccess(true);
            data = new DataList();
            data.setItems(rows);
            data.setTotal(total);
        }
    }

}
