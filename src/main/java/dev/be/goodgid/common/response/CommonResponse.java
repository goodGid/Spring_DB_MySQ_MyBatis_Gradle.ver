package dev.be.goodgid.common.response;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dev.be.goodgid.common.response.enums.ReturnEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class CommonResponse<T> {
    private String returnCode;
    private String returnMessage;
    private Map<String, String> errorDetailMap;
    private T info;

    public CommonResponse() {
    }

    public CommonResponse(ReturnEnum returnEnum) {
        setReturnEnum(returnEnum);
    }

    public CommonResponse(ReturnEnum returnEnum, T info) {
        setReturnEnum(returnEnum);
        setInfo(info);
    }

    public void setReturnEnum(ReturnEnum returnEnum) {
        setReturnCode(returnEnum.getReturnCode());
        setReturnMessage(returnEnum.getReturnMessage());
    }

}
