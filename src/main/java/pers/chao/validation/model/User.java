package pers.chao.validation.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author: WangYichao
 * @description:
 * @date: 2018/12/21 22:40
 */
public class User {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "创建时间不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @Pattern(regexp = "^(.{10})|(.{15})$",message = "年龄必须为10或15位")
    @NotBlank(message = "年龄不能为空")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
