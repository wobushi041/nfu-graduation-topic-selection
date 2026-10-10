package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 获取教师题目上限请求
 *
 * @author wobushi041
 */
@Data
public class GetTeacherTopicAmountRequest implements Serializable {

    /**
     * 教师 ID
     */
    @NotNull(message = "教师标识不合法")
    @Min(value = 1, message = "教师标识不合法")
    private Long teacherId;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
