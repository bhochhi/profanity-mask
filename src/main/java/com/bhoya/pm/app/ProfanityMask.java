package com.bhoya.pm.app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProfanityMask {
    private String text;
    private String maskedText;

    private List<String> whiteList;

    @JsonIgnore
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMaskedText() {
        return maskedText;
    }

    @JsonIgnore
    public void setMaskedText(String maskedText) {
        this.maskedText = maskedText;
    }

    @JsonIgnore
    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }
}
