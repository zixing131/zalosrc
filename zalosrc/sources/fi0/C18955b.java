package fi0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2809c;
import bi0.AbstractC2815i;
import fn0.AbstractC19074t;

/* renamed from: fi0.b */
/* loaded from: classes7.dex */
public final class C18955b {

    /* renamed from: a */
    public static final C18955b f94642a = new C18955b();

    private C18955b() {
    }

    /* renamed from: a */
    public static final C18954a m99467a(Context context, int i11) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Drawable drawable;
        Drawable drawable2;
        ColorStateList colorStateList;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC19074t.m100208f(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC2809c.btn_supportive_icon_size_medium);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC2815i.ZDesignButtonAttrs);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…eable.ZDesignButtonAttrs)");
        Integer num9 = null;
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_layout_width)) {
            num = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_layout_width, -2));
        } else {
            num = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_layout_height)) {
            num2 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_layout_height, -2));
        } else {
            num2 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_minWidth)) {
            num3 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_minWidth, 0));
        } else {
            num3 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_minHeight)) {
            num4 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_minHeight, 0));
        } else {
            num4 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_paddingLeft)) {
            num5 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_paddingLeft, 0));
        } else {
            num5 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_paddingTop)) {
            num6 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_paddingTop, 0));
        } else {
            num6 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_paddingRight)) {
            num7 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_paddingRight, 0));
        } else {
            num7 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_paddingBottom)) {
            num8 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_android_paddingBottom, 0));
        } else {
            num8 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_android_background)) {
            drawable = obtainStyledAttributes.getDrawable(AbstractC2815i.ZDesignButtonAttrs_android_background);
        } else {
            drawable = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIcon)) {
            drawable2 = obtainStyledAttributes.getDrawable(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIcon);
        } else {
            drawable2 = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconTint)) {
            colorStateList = obtainStyledAttributes.getColorStateList(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconTint);
        } else {
            colorStateList = null;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconSize)) {
            dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconSize, dimensionPixelSize);
        }
        int i16 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPadding)) {
            i12 = obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPadding, 0);
        } else {
            i12 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPaddingNoText)) {
            num9 = Integer.valueOf(obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPaddingNoText, 0));
        }
        Integer num10 = num9;
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPosition)) {
            i13 = obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnSupportiveIconPosition, 0);
        } else {
            i13 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnFixHeight)) {
            i14 = obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnFixHeight, (int) context.getResources().getDimension(AbstractC2809c.btn_large_height));
        } else {
            i14 = 0;
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZDesignButtonAttrs_btnType)) {
            i15 = obtainStyledAttributes.getLayoutDimension(AbstractC2815i.ZDesignButtonAttrs_btnType, 0);
        } else {
            i15 = 0;
        }
        obtainStyledAttributes.recycle();
        return new C18954a(num, num2, num3, num4, num5, num6, num7, num8, drawable, drawable2, colorStateList, i16, i12, num10, i13, i14, i15);
    }
}
