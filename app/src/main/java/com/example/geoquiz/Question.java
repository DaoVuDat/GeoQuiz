package com.example.geoquiz;

import androidx.annotation.StringRes;

public class Question {

    @StringRes
    private int textResId;

    private Boolean answer;


    public Question(int textResId, Boolean answer) {
        this.textResId = textResId;
        this.answer = answer;
    }

    public int getTextResId() {
        return textResId;
    }

    public void setTextResId(int textResId) {
        this.textResId = textResId;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }
}
