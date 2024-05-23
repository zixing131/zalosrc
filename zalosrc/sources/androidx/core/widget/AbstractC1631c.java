package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1631c {

    /* renamed from: a */
    private static Field f6666a;

    /* renamed from: b */
    private static boolean f6667b;

    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m8376a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m8377b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m8378c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m8379d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static Drawable m8380a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m8372a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m8380a(compoundButton);
        }
        if (!f6667b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f6666a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f6667b = true;
        }
        Field field = f6666a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f6666a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m8373b(CompoundButton compoundButton) {
        return a.m8376a(compoundButton);
    }

    /* renamed from: c */
    public static void m8374c(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m8378c(compoundButton, colorStateList);
    }

    /* renamed from: d */
    public static void m8375d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m8379d(compoundButton, mode);
    }
}
