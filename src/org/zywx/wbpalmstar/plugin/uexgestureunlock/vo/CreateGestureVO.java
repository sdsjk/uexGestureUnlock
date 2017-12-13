package org.zywx.wbpalmstar.plugin.uexgestureunlock.vo;

import java.io.Serializable;

public class CreateGestureVO implements Serializable{
    private static final long serialVersionUID = 2960775873944652949L;
    private boolean isNeedVerifyBeforeCreate = true;
    private String promptStr;

    public String getPromptStr() {
        return promptStr;
    }

    public void setPromptStr(String promptStr) {
        this.promptStr = promptStr;
    }

    public boolean isNeedVerifyBeforeCreate() {
        return isNeedVerifyBeforeCreate;
    }

    public void setIsNeedVerifyBeforeCreate(boolean isNeedVerifyBeforeCreate) {
        this.isNeedVerifyBeforeCreate = isNeedVerifyBeforeCreate;
    }
}
