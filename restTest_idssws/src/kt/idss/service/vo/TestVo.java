package kt.idss.service.vo;

public class TestVo {

    private String systemCode;
    private String systemMessage;
    private String responseCode;
    private String responseMessage;

    public TestVo() {}
    public TestVo(String systemCode
                 ,String systemMessage
                 ,String responseCode
                 ,String responseMessage) {
        this.systemCode = systemCode;
        this.systemMessage = systemMessage;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public String getSystemCode() {
        return systemCode;
    }
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
    public String getSystemMessage() {
        return systemMessage;
    }
    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public String toString() {
        return String.format("{systemCode=%s,systemMessage=%s,responseCode=%s,responseMessage=%s}", systemCode, systemMessage, responseCode, responseMessage);
    }
}
