package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1635g {

    /* renamed from: androidx.core.widget.g$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m8393a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m8394b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m8395c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m8396d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m8389a(ImageView imageView) {
        return a.m8393a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m8390b(ImageView imageView) {
        return a.m8394b(imageView);
    }

    /* renamed from: c */
    public static void m8391c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i11 = Build.VERSION.SDK_INT;
        a.m8395c(imageView, colorStateList);
        if (i11 == 21 && (drawable = imageView.getDrawable()) != null && a.m8393a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: d */
    public static void m8392d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i11 = Build.VERSION.SDK_INT;
        a.m8396d(imageView, mode);
        if (i11 == 21 && (drawable = imageView.getDrawable()) != null && a.m8393a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
