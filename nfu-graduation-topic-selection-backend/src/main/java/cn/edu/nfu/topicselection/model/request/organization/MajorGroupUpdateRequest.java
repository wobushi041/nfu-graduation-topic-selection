package cn.edu.nfu.topicselection.model.request.organization;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 更新专业选题组请求
 *
 * @author wobushi041
 */
@Data
public class MajorGroupUpdateRequest implements Serializable {

    /**
     * 专业 id
     */
    @NotNull(message = "专业和选题组不能为空")
    private Long majorId;

    /**
     * 选题组 id
     */
    @NotNull(message = "专业和选题组不能为空")
    private Long topicGroupId;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
