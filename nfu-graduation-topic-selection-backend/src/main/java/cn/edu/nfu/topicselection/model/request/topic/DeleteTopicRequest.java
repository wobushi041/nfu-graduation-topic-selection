package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 删除题目请求
 *
 * @author wobushi041
 */
@Data
public class DeleteTopicRequest implements Serializable {

    /**
     * 题目 id
     */
    @NotNull(message = "id 不能为空")
    @Min(value = 1, message = "id 必须是正整数")
    private Long id;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
