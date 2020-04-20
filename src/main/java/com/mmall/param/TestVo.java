package com.mmall.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author qiuheng
 * @date 2020/3/22 - 20:06
 */
@Getter
@Setter
public class TestVo {

    @NotBlank
    private String msg;

    @NotNull(message = "id 不可以为空")
    @Max(value = 10,message = "id 不能大于10")
    @Min(value = 0,message = "id 至少大于等于0")
    private Integer id;

    //@NotEmpty
    private List<String> str;
}
