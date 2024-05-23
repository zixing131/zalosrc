package com.zing.zalo.shortvideo.p072ui.widget.et;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p175g0.AbstractC19178a;

/* loaded from: classes5.dex */
public final class EnterActionEditText extends RobotoEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnterActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AbstractC19074t.m100208f(editorInfo, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions = (editorInfo.imeOptions & (-1073741825)) | 268435456;
        return onCreateInputConnection;
    }

    public /* synthetic */ EnterActionEditText(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? AbstractC19178a.editTextStyle : i11);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text = super.getText();
        return text == null ? new SpannableStringBuilder() : text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterActionEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
