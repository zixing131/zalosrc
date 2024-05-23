package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.AbstractC1408c;

/* renamed from: androidx.core.graphics.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1406a {

    /* renamed from: androidx.core.graphics.a$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static ColorFilter m7129a(int i11, Object obj) {
            return new BlendModeColorFilter(i11, (BlendMode) obj);
        }
    }

    /* renamed from: a */
    public static ColorFilter m7128a(int i11, EnumC1407b enumC1407b) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object m7131a = AbstractC1408c.b.m7131a(enumC1407b);
            if (m7131a == null) {
                return null;
            }
            return a.m7129a(i11, m7131a);
        }
        PorterDuff.Mode m7130a = AbstractC1408c.m7130a(enumC1407b);
        if (m7130a == null) {
            return null;
        }
        return new PorterDuffColorFilter(i11, m7130a);
    }
}
