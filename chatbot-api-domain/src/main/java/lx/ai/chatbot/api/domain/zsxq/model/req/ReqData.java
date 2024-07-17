package lx.ai.chatbot.api.domain.zsxq.model.req;

/**
 * @Author : lx
 * @Date: 2024/7/17 15:38
 * @Description:
 */
public class ReqData {

    private String text;
    private String[] image_ids = new String[]{};
    private String[] mentioned_user_ids = new String[]{};

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getImage_ids() {
        return image_ids;
    }

    public void setImage_ids(String[] image_ids) {
        this.image_ids = image_ids;
    }

    public String[] getMentioned_user_ids() {
        return mentioned_user_ids;
    }

    public void setMentioned_user_ids(String[] mentioned_user_ids) {
        this.mentioned_user_ids = mentioned_user_ids;
    }

    public ReqData(String text) {
        this.text = text;
    }
}
