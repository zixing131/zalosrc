package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: com.google.android.material.internal.w */
/* loaded from: classes3.dex */
public abstract class AbstractC6356w {
    /* renamed from: a */
    public static TextView m32641a(Toolbar toolbar) {
        return m32642b(toolbar, toolbar.getSubtitle());
    }

    /* renamed from: b */
    private static TextView m32642b(Toolbar toolbar, CharSequence charSequence) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static TextView m32643c(Toolbar toolbar) {
        return m32642b(toolbar, toolbar.getTitle());
    }
}
