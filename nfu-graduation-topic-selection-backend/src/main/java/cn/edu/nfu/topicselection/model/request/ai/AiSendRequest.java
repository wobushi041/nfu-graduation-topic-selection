package cn.edu.nfu.topicselection.model.request.ai;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * AI 问答请求
 *
 * @author wobushi041
 */
@Data
public class AiSendRequest implements Serializable {

    /**
     * 消息内容
     */
    @NotBlank(message = "消息内容不能为空")
    private String content;

    /// 序列化字段 ///

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

}
