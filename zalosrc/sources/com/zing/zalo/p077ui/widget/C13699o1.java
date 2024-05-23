package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.ui.widget.o1 */
/* loaded from: classes.dex */
public final class C13699o1 {

    /* renamed from: a */
    public static final C13699o1 f70798a = new C13699o1();

    private C13699o1() {
    }

    /* renamed from: a */
    public final Typeface m76486a(Context context, String str, Integer num) {
        Typeface typeface;
        int i11;
        AbstractC19074t.m100208f(context, "context");
        if (C13778s1.m76960a()) {
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    return null;
                }
                switch (str.hashCode()) {
                    case -1078030475:
                        if (!str.equals("medium")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 7);
                    case -463901120:
                        if (!str.equals("mono_regular")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 10);
                    case 3559065:
                        if (!str.equals("thin")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 1);
                    case 102970646:
                        if (!str.equals("light")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 3);
                    case 1086463900:
                        if (!str.equals("regular")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 5);
                    case 1919999057:
                        if (!str.equals("mono_medium")) {
                            return null;
                        }
                        return C13718q1.m76694c(context, 11);
                    default:
                        return null;
                }
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            typeface = C13718q1.m76694c(context, i11);
            if (typeface == null) {
                return null;
            }
        } else if (!TextUtils.isEmpty(str) && AbstractC19074t.m100204b(str, "medium")) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }

    /* renamed from: b */
    public final void m76487b(TextView textView, String str, Integer num) {
        AbstractC19074t.m100208f(textView, "textView");
        C13699o1 c13699o1 = f70798a;
        Context context = textView.getContext();
        AbstractC19074t.m100207e(context, "context");
        textView.setTypeface(c13699o1.m76486a(context, str, num));
    }

    /* renamed from: c */
    public final C13694n1 m76488c(Context context, AttributeSet attributeSet, int i11, int i12) {
        int i13;
        int i14;
        String str;
        int i15;
        boolean z11;
        float f11;
        float f12;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        AbstractC19074t.m100208f(context, "context");
        EnumC13569b3 enumC13569b3 = EnumC13569b3.NONE;
        int m76022e = enumC13569b3.m76022e();
        int length = C13778s1.m76961b().length;
        String str2 = null;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MIN_VALUE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC13660k1.RobotoStyleable, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            try {
                m76022e = obtainStyledAttributes.getInt(AbstractC13660k1.RobotoStyleable_textClass, enumC13569b3.m76022e());
                i17 = obtainStyledAttributes.getInt(AbstractC13660k1.RobotoStyleable_typeface, 0);
                try {
                    str2 = obtainStyledAttributes.getString(AbstractC13660k1.RobotoStyleable_fstyle);
                    z12 = obtainStyledAttributes.getBoolean(AbstractC13660k1.RobotoStyleable_disableScaleTextSize, false);
                } catch (Exception unused) {
                    z12 = false;
                    i18 = i17;
                    i19 = 0;
                    obtainStyledAttributes.recycle();
                    i16 = i19;
                    z11 = z12;
                    i13 = m76022e;
                    i14 = length;
                    i15 = i18;
                    str = str2;
                    f11 = f13;
                    f12 = f14;
                    return new C13694n1(i13, i15, str, z11, f11, f12, i14, i16);
                }
            } catch (Exception unused2) {
                i17 = 0;
            }
            try {
                f13 = obtainStyledAttributes.getDimension(AbstractC13660k1.RobotoStyleable_maxScaledTextSize, Float.MAX_VALUE);
                f14 = obtainStyledAttributes.getDimension(AbstractC13660k1.RobotoStyleable_minScaledTextSize, Float.MIN_VALUE);
                length = obtainStyledAttributes.getInt(AbstractC13660k1.RobotoStyleable_maxScaledTextRatioIndex, C13778s1.m76961b().length);
                i18 = i17;
                i19 = obtainStyledAttributes.getInt(AbstractC13660k1.RobotoStyleable_minScaledTextRatioIndex, 0);
            } catch (Exception unused3) {
                i18 = i17;
                i19 = 0;
                obtainStyledAttributes.recycle();
                i16 = i19;
                z11 = z12;
                i13 = m76022e;
                i14 = length;
                i15 = i18;
                str = str2;
                f11 = f13;
                f12 = f14;
                return new C13694n1(i13, i15, str, z11, f11, f12, i14, i16);
            }
            obtainStyledAttributes.recycle();
            i16 = i19;
            z11 = z12;
            i13 = m76022e;
            i14 = length;
            i15 = i18;
            str = str2;
            f11 = f13;
            f12 = f14;
        } else {
            i13 = m76022e;
            i14 = length;
            str = null;
            i15 = 0;
            z11 = false;
            f11 = Float.MAX_VALUE;
            f12 = Float.MIN_VALUE;
            i16 = 0;
        }
        return new C13694n1(i13, i15, str, z11, f11, f12, i14, i16);
    }
}
