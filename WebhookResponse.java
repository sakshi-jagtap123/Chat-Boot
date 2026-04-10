package com.example.demo.model;

public class WebhookResponse {

    private String reply;
    private String status;
    private long timestamp;

    public WebhookResponse(String reply) {
        this.reply = reply;
        this.status = "success";
        this.timestamp = System.currentTimeMillis();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}