package com.zing.zalo.p077ui.widget.edittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zing.zalo.p077ui.widget.RobotoEditText;

/* loaded from: classes6.dex */
public class ActionDoneEditText extends RobotoEditText {
    public ActionDoneEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    public ActionDoneEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
