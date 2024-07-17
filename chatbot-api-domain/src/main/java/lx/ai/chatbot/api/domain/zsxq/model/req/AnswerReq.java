package lx.ai.chatbot.api.domain.zsxq.model.req;

/**
 * @Author : lx
 * @Date: 2024/7/17 15:40
 * @Description:
 */
public class AnswerReq {

    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }
}
