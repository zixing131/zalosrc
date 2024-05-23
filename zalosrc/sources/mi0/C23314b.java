package mi0;

import android.content.Context;
import android.content.res.TypedArray;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.EnumC17026p0;
import fn0.AbstractC19074t;

/* renamed from: mi0.b */
/* loaded from: classes7.dex */
public final class C23314b {

    /* renamed from: a */
    public static final C23314b f113509a = new C23314b();

    private C23314b() {
    }

    /* renamed from: a */
    public static final C23313a m122698a(Context context, int i11) {
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC2815i.ZdesignProgressBarAttrs);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr….ZdesignProgressBarAttrs)");
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressType)) {
            i12 = obtainStyledAttributes.getInt(AbstractC2815i.ZdesignProgressBarAttrs_progressType, EnumC17026p0.CIRCLE.m91165c());
        } else {
            i12 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_isCountDown)) {
            z11 = obtainStyledAttributes.getBoolean(AbstractC2815i.ZdesignProgressBarAttrs_isCountDown, false);
        } else {
            z11 = false;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressBarFixHeight)) {
            i13 = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.ZdesignProgressBarAttrs_progressBarFixHeight, AbstractC2809c.progress_horizontal_height);
        } else {
            i13 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_android_indeterminateOnly)) {
            z12 = obtainStyledAttributes.getBoolean(AbstractC2815i.ZdesignProgressBarAttrs_android_indeterminateOnly, false);
        } else {
            z12 = false;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressIndicatorColor)) {
            i14 = obtainStyledAttributes.getColor(AbstractC2815i.ZdesignProgressBarAttrs_progressIndicatorColor, AbstractC2816j.Companion.m13592a(context, AbstractC2807a.progress_indicator_blue));
        } else {
            i14 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressBackgroundColor)) {
            i15 = obtainStyledAttributes.getColor(AbstractC2815i.ZdesignProgressBarAttrs_progressBackgroundColor, AbstractC2816j.Companion.m13592a(context, AbstractC2807a.progress_track_background_black));
        } else {
            i15 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressTextColor)) {
            i16 = obtainStyledAttributes.getColor(AbstractC2815i.ZdesignProgressBarAttrs_progressTextColor, AbstractC2816j.Companion.m13592a(context, AbstractC2807a.text_01));
        } else {
            i16 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdesignProgressBarAttrs_progressIconColor)) {
            i17 = obtainStyledAttributes.getColor(AbstractC2815i.ZdesignProgressBarAttrs_progressIconColor, AbstractC2816j.Companion.m13592a(context, AbstractC2807a.icon_02));
        } else {
            i17 = 0;
        }
        obtainStyledAttributes.recycle();
        return new C23313a(i13, i12, z11, i14, i15, i16, i17, z12);
    }
}
