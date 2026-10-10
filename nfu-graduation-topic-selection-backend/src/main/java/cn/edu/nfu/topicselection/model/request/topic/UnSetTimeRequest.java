package cn.edu.nfu.topicselection.model.request.topic;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * 取消设置选题开放时间请求
 *
 * @author wobushi041
 */
@Data
public class UnSetTimeRequest implements Serializable {

    /**
     * 选题 id 列表
     */
    @NotEmpty(message = "请先选择题目")
    @Size(max = 100, message = "一次最多处理 100 个题目")
    private List<Long> topicIds;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
