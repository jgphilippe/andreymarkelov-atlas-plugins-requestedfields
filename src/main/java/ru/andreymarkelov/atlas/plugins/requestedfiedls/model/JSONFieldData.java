package ru.andreymarkelov.atlas.plugins.requestedfiedls.model;

public class JSONFieldData {
    private String url;
    private String user;
    private String password;
    private String reqHeaders;
    private String reqType;
    private String reqData;
    private String reqPath;
    private String reqDataType;

    public JSONFieldData() {
    }

    public JSONFieldData(
            String url,
            String user,
            String password,
            String reqHeaders,
            String reqType,
            String reqDataType,
            String reqData,
            String reqPath) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.reqHeaders = reqHeaders;
        this.reqType = reqType;
        this.reqDataType = reqDataType;
        this.reqData = reqData;
        this.reqPath = reqPath;
    }

    public String getPassword() {
        return password;
    }

    public String getReqHeaders() {
        return reqHeaders;
    }

    public String getReqData() {
        return reqData;
    }

    public String getReqDataType() {
        return reqDataType;
    }

    public String getReqPath() {
        return reqPath;
    }

    public String getReqType() {
        return reqType;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setReqHeaders(String reqHeaders) {
        this.reqHeaders = reqHeaders;
    }

    public void setReqData(String reqData) {
        this.reqData = reqData;
    }

    public void setReqDataType(String reqDataType) {
        this.reqDataType = reqDataType;
    }

    public void setReqPath(String reqPath) {
        this.reqPath = reqPath;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "JSONFieldData[url=" + url + ", user=" + user + ", password="
                + password + ", reqHeaders=" + reqHeaders + ", reqType=" + reqType + ", reqData=" + reqData + ", reqPath=" + reqPath +
                ", reqDataType=" + reqDataType + "]";
    }
}
