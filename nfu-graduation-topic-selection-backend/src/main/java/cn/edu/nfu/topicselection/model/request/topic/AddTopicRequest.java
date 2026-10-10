package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 添加题目请求
 *
 * @author wobushi041
 */
@Data
public class AddTopicRequest implements Serializable {

    /**
     * 题目
     */
    @NotBlank(message = "题目标题不能为空")
    @Size(max = 255, message = "题目标题不能超过 255 个字符")
    private String topic;

    /**
     * 题目类型
     */
    @NotBlank(message = "题目类型不能为空")
    @Size(max = 255, message = "题目类型不能超过 255 个字符")
    private String type;

    /**
     * 题目描述
     */
    @NotBlank(message = "题目描述不能为空, 并且不能少于 5 个字符")
    @Size(min = 5, message = "题目描述不能为空, 并且不能少于 5 个字符")
    private String description;

    /**
     * 对学生要求
     */
    @NotBlank(message = "题目要求不能为空")
    private String requirement;

    /**
     * 所属选题组 id
     */
    @NotNull(message = "请选择选题组")
    private Long topicGroupId;

    /**
     * 指导老师
     */
    private String teacherName;

    /**
     * 可接收学生总容量
     */
    @Min(value = 1, message = "题目人数必须在 1 到 100 之间")
    @Max(value = 100, message = "题目人数必须在 1 到 100 之间")
    private Integer surplusQuantity;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
