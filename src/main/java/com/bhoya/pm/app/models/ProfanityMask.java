package com.bhoya.pm.app.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ProfanityMask {
    @JsonProperty(access = Access.WRITE_ONLY)
    private String text;

    @JsonProperty(access = Access.READ_ONLY)
    private String maskedText;

    @JsonProperty(access = Access.WRITE_ONLY)
    private List<String> whiteList;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMaskedText() {
        return maskedText;
    }

    public void setMaskedText(String maskedText) {
        this.maskedText = maskedText;
    }

    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }
}
