package s20;

import android.animation.ValueAnimator;
import android.content.Context;
import android.provider.Settings;
import fn0.AbstractC19074t;
import java.lang.reflect.Field;

/* renamed from: s20.a */
/* loaded from: classes5.dex */
public abstract class AbstractC26099a {
    /* renamed from: a */
    public static final void m134294a(ValueAnimator valueAnimator, Context context, long j11) {
        AbstractC19074t.m100208f(valueAnimator, "<this>");
        AbstractC19074t.m100208f(context, "context");
        try {
            Field declaredField = valueAnimator.getClass().getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            declaredField.set(declaredField, Float.valueOf(1.0f));
            valueAnimator.setDuration(j11);
        } catch (Exception unused) {
            valueAnimator.setDuration(((float) j11) / Settings.Global.getFloat(context.getApplicationContext().getContentResolver(), "animator_duration_scale", 1.0f));
        }
    }
}
