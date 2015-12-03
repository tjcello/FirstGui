package firstgui;

public class MessageService {

    private String msgPrefix = "Hello";

    public String createMessage(String suffix) {
        return msgPrefix + suffix;

    }

    public String getMsgPrefix() {
        return msgPrefix;
    }

    public void setMsgPrefix(String msgPrefix) {
        this.msgPrefix = msgPrefix;
    }
}
