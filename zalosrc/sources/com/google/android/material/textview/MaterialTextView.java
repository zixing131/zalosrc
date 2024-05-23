package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28773b;
import p599w6.AbstractC28774c;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* renamed from: f */
    private void m33244f(Resources.Theme theme, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i11, AbstractC23587l.MaterialTextAppearance);
        int m33247j = m33247j(getContext(), obtainStyledAttributes, AbstractC23587l.MaterialTextAppearance_android_lineHeight, AbstractC23587l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m33247j >= 0) {
            setLineHeight(m33247j);
        }
    }

    /* renamed from: h */
    private static boolean m33245h(Context context) {
        return AbstractC28773b.m143970b(context, AbstractC23577b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: i */
    private static int m33246i(Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC23587l.MaterialTextView, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC23587l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: j */
    private static int m33247j(Context context, TypedArray typedArray, int... iArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < iArr.length && i11 < 0; i12++) {
            i11 = AbstractC28774c.m143975c(context, typedArray, iArr[i12], -1);
        }
        return i11;
    }

    /* renamed from: k */
    private static boolean m33248k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC23587l.MaterialTextView, i11, i12);
        int m33247j = m33247j(context, obtainStyledAttributes, AbstractC23587l.MaterialTextView_android_lineHeight, AbstractC23587l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (m33247j != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (m33245h(context)) {
            m33244f(context.getTheme(), i11);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, i12), attributeSet, i11);
        int m33246i;
        Context context2 = getContext();
        if (m33245h(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m33248k(context2, theme, attributeSet, i11, i12) || (m33246i = m33246i(theme, attributeSet, i11, i12)) == -1) {
                return;
            }
            m33244f(theme, m33246i);
        }
    }
}
