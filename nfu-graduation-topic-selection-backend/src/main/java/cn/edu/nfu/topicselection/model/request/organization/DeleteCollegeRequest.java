package cn.edu.nfu.topicselection.model.request.organization;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 删除学院请求
 *
 * @author wobushi041
 */
@Data
public class DeleteCollegeRequest implements Serializable {

    /**
     * 学院 id
     */
    @NotNull(message = "学院 id 不能为空")
    private Long collegeId;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
