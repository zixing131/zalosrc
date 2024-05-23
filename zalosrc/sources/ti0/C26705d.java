package ti0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.EnumC13569b3;
import fn0.AbstractC19074t;

/* renamed from: ti0.d */
/* loaded from: classes7.dex */
public final class C26705d {

    /* renamed from: a */
    public static final C26705d f126613a = new C26705d();

    private C26705d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0277  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C26703b m137293a(Context context, int i11) {
        TextUtils.TruncateAt truncateAt;
        Float f11;
        Float valueOf;
        TypedArray obtainStyledAttributes;
        TextUtils.TruncateAt truncateAt2;
        AbstractC19074t.m100208f(context, "context");
        EnumC13569b3 enumC13569b3 = EnumC13569b3.NONE;
        int m76022e = enumC13569b3.m76022e();
        int length = C13778s1.m76961b().length;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, AbstractC2815i.ZDesignTextAppearance);
        AbstractC19074t.m100207e(obtainStyledAttributes2, "context.obtainStyledAttr…le.ZDesignTextAppearance)");
        boolean z11 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_textAllCaps) ? obtainStyledAttributes2.getBoolean(AbstractC2815i.ZDesignTextAppearance_android_textAllCaps, false) : false;
        ColorStateList colorStateList = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_textColor) ? obtainStyledAttributes2.getColorStateList(AbstractC2815i.ZDesignTextAppearance_android_textColor) : null;
        ColorStateList colorStateList2 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_textColorHint) ? obtainStyledAttributes2.getColorStateList(AbstractC2815i.ZDesignTextAppearance_android_textColorHint) : null;
        ColorStateList colorStateList3 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_textColorLink) ? obtainStyledAttributes2.getColorStateList(AbstractC2815i.ZDesignTextAppearance_android_textColorLink) : null;
        Float valueOf2 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_textSize) ? Float.valueOf(obtainStyledAttributes2.getDimension(AbstractC2815i.ZDesignTextAppearance_android_textSize, 0.0f)) : null;
        Boolean valueOf3 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_includeFontPadding) ? Boolean.valueOf(obtainStyledAttributes2.getBoolean(AbstractC2815i.ZDesignTextAppearance_android_includeFontPadding, false)) : null;
        Integer valueOf4 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_minLines) ? Integer.valueOf(obtainStyledAttributes2.getInt(AbstractC2815i.ZDesignTextAppearance_android_minLines, 0)) : null;
        Integer valueOf5 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_maxLines) ? Integer.valueOf(obtainStyledAttributes2.getInt(AbstractC2815i.ZDesignTextAppearance_android_maxLines, 0)) : null;
        Boolean valueOf6 = obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_singleLine) ? Boolean.valueOf(obtainStyledAttributes2.getBoolean(AbstractC2815i.ZDesignTextAppearance_android_singleLine, false)) : null;
        if (obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_ellipsize)) {
            int i12 = obtainStyledAttributes2.getInt(AbstractC2815i.ZDesignTextAppearance_android_ellipsize, -1);
            if (i12 == 1) {
                truncateAt2 = TextUtils.TruncateAt.START;
            } else if (i12 == 2) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i12 != 3) {
                truncateAt2 = i12 != 4 ? null : TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt2 = TextUtils.TruncateAt.END;
            }
            truncateAt = truncateAt2;
        } else {
            truncateAt = null;
        }
        if (obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_lineHeight)) {
            valueOf = Float.valueOf(obtainStyledAttributes2.getDimension(AbstractC2815i.ZDesignTextAppearance_lineHeight, 0.0f));
        } else if (obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_lineHeight)) {
            valueOf = Float.valueOf(obtainStyledAttributes2.getDimension(AbstractC2815i.ZDesignTextAppearance_android_lineHeight, 0.0f));
        } else {
            f11 = null;
            Float valueOf7 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingExtra) ? Float.valueOf(obtainStyledAttributes2.getDimension(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingExtra, 0.0f)) : null;
            Float valueOf8 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingMultiplier) ? Float.valueOf(obtainStyledAttributes2.getFloat(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingMultiplier, 0.0f)) : null;
            Float valueOf9 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_letterSpacing) ? Float.valueOf(obtainStyledAttributes2.getFloat(AbstractC2815i.ZDesignTextAppearance_android_letterSpacing, 0.0f)) : null;
            Integer valueOf10 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowColor) ? Integer.valueOf(obtainStyledAttributes2.getColor(AbstractC2815i.ZDesignTextAppearance_android_shadowColor, 0)) : null;
            Float valueOf11 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowDx) ? Float.valueOf(obtainStyledAttributes2.getFloat(AbstractC2815i.ZDesignTextAppearance_android_shadowDx, 0.0f)) : null;
            Float valueOf12 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowDy) ? Float.valueOf(obtainStyledAttributes2.getFloat(AbstractC2815i.ZDesignTextAppearance_android_shadowDy, 0.0f)) : null;
            Float valueOf13 = !obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowRadius) ? Float.valueOf(obtainStyledAttributes2.getFloat(AbstractC2815i.ZDesignTextAppearance_android_shadowRadius, 0.0f)) : null;
            obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC2815i.RobotoStyleable);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.RobotoStyleable)");
            if (obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_textClass)) {
                m76022e = obtainStyledAttributes.getInt(AbstractC2815i.RobotoStyleable_textClass, enumC13569b3.m76022e());
            }
            int i13 = m76022e;
            Integer valueOf14 = !obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_typeface) ? Integer.valueOf(obtainStyledAttributes.getInt(AbstractC2815i.RobotoStyleable_typeface, 0)) : null;
            String string = !obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_fstyle) ? obtainStyledAttributes.getString(AbstractC2815i.RobotoStyleable_fstyle) : null;
            Boolean valueOf15 = obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_disableScaleTextSize) ? Boolean.valueOf(obtainStyledAttributes.getBoolean(AbstractC2815i.RobotoStyleable_disableScaleTextSize, false)) : null;
            float dimension = !obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_maxScaledTextSize) ? obtainStyledAttributes.getDimension(AbstractC2815i.RobotoStyleable_maxScaledTextSize, Float.MAX_VALUE) : Float.MAX_VALUE;
            float dimension2 = !obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_minScaledTextSize) ? obtainStyledAttributes.getDimension(AbstractC2815i.RobotoStyleable_minScaledTextSize, Float.MAX_VALUE) : Float.MIN_VALUE;
            if (obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_maxScaledTextRatioIndex)) {
                length = obtainStyledAttributes.getInt(AbstractC2815i.RobotoStyleable_maxScaledTextRatioIndex, C13778s1.m76961b().length);
            }
            int i14 = length;
            int i15 = !obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_minScaledTextRatioIndex) ? obtainStyledAttributes.getInt(AbstractC2815i.RobotoStyleable_minScaledTextRatioIndex, 0) : 0;
            obtainStyledAttributes2.recycle();
            obtainStyledAttributes.recycle();
            return new C26703b(Boolean.valueOf(z11), colorStateList, colorStateList2, colorStateList3, valueOf2, f11, valueOf7, valueOf8, valueOf9, valueOf3, valueOf4, valueOf5, valueOf6, truncateAt, valueOf10, valueOf11, valueOf12, valueOf13, new C13694n1(i13, valueOf14 == null ? valueOf14.intValue() : 0, string, valueOf15 == null ? valueOf15.booleanValue() : false, dimension, dimension2, i14, i15));
        }
        f11 = valueOf;
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingExtra)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_lineSpacingMultiplier)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_letterSpacing)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowColor)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowDx)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowDy)) {
        }
        if (!obtainStyledAttributes2.hasValue(AbstractC2815i.ZDesignTextAppearance_android_shadowRadius)) {
        }
        obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC2815i.RobotoStyleable);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.RobotoStyleable)");
        if (obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_textClass)) {
        }
        int i132 = m76022e;
        if (!obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_typeface)) {
        }
        if (!obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_fstyle)) {
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_disableScaleTextSize)) {
        }
        if (!obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_maxScaledTextSize)) {
        }
        if (!obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_minScaledTextSize)) {
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_maxScaledTextRatioIndex)) {
        }
        int i142 = length;
        if (!obtainStyledAttributes.hasValue(AbstractC2815i.RobotoStyleable_minScaledTextRatioIndex)) {
        }
        obtainStyledAttributes2.recycle();
        obtainStyledAttributes.recycle();
        return new C26703b(Boolean.valueOf(z11), colorStateList, colorStateList2, colorStateList3, valueOf2, f11, valueOf7, valueOf8, valueOf9, valueOf3, valueOf4, valueOf5, valueOf6, truncateAt, valueOf10, valueOf11, valueOf12, valueOf13, new C13694n1(i132, valueOf14 == null ? valueOf14.intValue() : 0, string, valueOf15 == null ? valueOf15.booleanValue() : false, dimension, dimension2, i142, i15));
    }
}
