package com.gabe.website.models;

public class EmailRequest {
    private String to;
    private String subject;
    private String text;

    // Getters and setters
    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getBody() { return text; }
    public void setBody(String text) { this.text = text; }
}

