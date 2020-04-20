package com.mmall.beans;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * @author qiuheng
 * @date 2020/4/19 - 17:31
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    private String subject;

    private String message;

    private Set<String> receivers;
}