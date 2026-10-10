package cn.edu.nfu.topicselection.model.request.organization;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 教师选题组额度更新请求
 *
 * @author wobushi041
 */
@Data
public class TeacherGroupQuotaUpdateRequest implements Serializable {

    /**
     * 教师账号
     */
    @NotBlank(message = "教师账号和选题组不能为空")
    private String teacherAccount;

    /**
     * 选题组 id
     */
    @NotNull(message = "教师账号和选题组不能为空")
    private Long topicGroupId;

    /**
     * 最大出题数量
     */
    @NotNull(message = "最大出题数量必须在 0 到 20 之间")
    @Min(value = 0, message = "最大出题数量必须在 0 到 20 之间")
    @Max(value = 20, message = "最大出题数量必须在 0 到 20 之间")
    private Integer maxTopics;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
