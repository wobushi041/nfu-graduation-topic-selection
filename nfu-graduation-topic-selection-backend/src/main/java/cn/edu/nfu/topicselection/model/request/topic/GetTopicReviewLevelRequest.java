package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 获取题目审核等级请求
 *
 * @author wobushi041
 */
@Data
public class GetTopicReviewLevelRequest implements Serializable {

    /**
     * 题目要求
     */
    private String requirement;

    /**
     * 题目类型
     */
    private String type;

    /**
     * 题目标题
     */
    @NotBlank(message = "题目标题不能为空")
    @Size(max = 255, message = "题目标题不能超过 255 个字符")
    private String topic;

    /**
     * 题目描述
     */
    @NotBlank(message = "题目描述不能为空, 并且不能少于 5 个字符")
    @Size(min = 5, message = "题目描述不能为空, 并且不能少于 5 个字符")
    @Size(max = 5000, message = "题目描述不能超过 5000 个字符")
    private String description;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
