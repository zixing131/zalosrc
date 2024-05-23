package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.AbstractC1414a;
import p229i5.AbstractC20289j;
import p567v4.AbstractC27521a;
import p567v4.AbstractC27522b;
import p567v4.AbstractC27523c;

/* loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    /* renamed from: b */
    private static final int m19821b(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return i14;
                }
                throw new IllegalStateException("Unknown color scheme: " + i11);
            }
            return i13;
        }
        return i12;
    }

    /* renamed from: a */
    public final void m19822a(Resources resources, int i11, int i12) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i13 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i13);
        setMinWidth(i13);
        int i14 = AbstractC27522b.common_google_signin_btn_icon_dark;
        int i15 = AbstractC27522b.common_google_signin_btn_icon_light;
        int m19821b = m19821b(i12, i14, i15, i15);
        int i16 = AbstractC27522b.common_google_signin_btn_text_dark;
        int i17 = AbstractC27522b.common_google_signin_btn_text_light;
        int m19821b2 = m19821b(i12, i16, i17, i17);
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("Unknown button size: " + i11);
            }
        } else {
            m19821b = m19821b2;
        }
        Drawable m7200r = AbstractC1414a.m7200r(resources.getDrawable(m19821b));
        AbstractC1414a.m7197o(m7200r, resources.getColorStateList(AbstractC27521a.common_google_signin_btn_tint));
        AbstractC1414a.m7198p(m7200r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(m7200r);
        int i18 = AbstractC27521a.common_google_signin_btn_text_dark;
        int i19 = AbstractC27521a.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) AbstractC4205o.m19722k(resources.getColorStateList(m19821b(i12, i18, i19, i19))));
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    setText((CharSequence) null);
                } else {
                    throw new IllegalStateException("Unknown button size: " + i11);
                }
            } else {
                setText(resources.getString(AbstractC27523c.common_signin_button_text_long));
            }
        } else {
            setText(resources.getString(AbstractC27523c.common_signin_button_text));
        }
        setTransformationMethod(null);
        if (AbstractC20289j.m105932f(getContext())) {
            setGravity(19);
        }
    }
}
