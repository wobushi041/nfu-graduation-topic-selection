package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 题目审核请求
 *
 * @author wobushi041
 */
@Data
public class CheckTopicRequest implements Serializable {

    /**
     * 题目 id
     */
    @NotNull(message = "选题 id 不能为空")
    @Min(value = 1, message = "选题 id 必须是正整数")
    private Long id;

    /**
     * 题目状态
     */
    @NotNull(message = "选题状态不能为空")
    private Integer status;

    /**
     * 审核理由
     */
    @Size(max = 1024, message = "理由过长, 不能超过 1024 符")
    private String reason;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
