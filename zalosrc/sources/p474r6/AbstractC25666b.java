package p474r6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: r6.b */
/* loaded from: classes3.dex */
public abstract class AbstractC25666b {
    /* renamed from: a */
    public static void m132552a(RippleDrawable rippleDrawable, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i11);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i11));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e11);
        }
    }

    /* renamed from: b */
    public static PorterDuffColorFilter m132553b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}
