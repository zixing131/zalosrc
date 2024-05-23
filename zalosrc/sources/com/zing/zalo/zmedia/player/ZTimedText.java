package com.zing.zalo.zmedia.player;

import android.graphics.Rect;

/* loaded from: classes7.dex */
public final class ZTimedText {
    private Rect mTextBounds;
    private String mTextChars;

    public ZTimedText(Rect rect, String str) {
        this.mTextBounds = rect;
        this.mTextChars = str;
    }

    public Rect getBounds() {
        return this.mTextBounds;
    }

    public String getText() {
        return this.mTextChars;
    }
}
