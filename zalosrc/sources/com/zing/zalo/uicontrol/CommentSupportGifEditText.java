package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import fn0.AbstractC19074t;
import p285k1.AbstractC21429c;
import p285k1.AbstractC21432f;
import p716zh.C32205z8;

/* loaded from: classes4.dex */
public final class CommentSupportGifEditText extends ActionEditText {
    public CommentSupportGifEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.zing.zalo.uicontrol.ActionEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AbstractC19074t.m100208f(editorInfo, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC21429c.m110936b(editorInfo, C32205z8.Companion.m155302a());
        if (onCreateInputConnection != null) {
            onCreateInputConnection = AbstractC21432f.m110941c(this, onCreateInputConnection, editorInfo);
        }
        AbstractC19074t.m100205c(onCreateInputConnection);
        return onCreateInputConnection;
    }
}
