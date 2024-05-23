package s20;

import android.content.Context;
import com.zing.zalocore.CoreUtility;

/* renamed from: s20.e */
/* loaded from: classes5.dex */
public abstract class AbstractC26103e {
    /* renamed from: a */
    public static final int m134327a(Context context, int i11) {
        if (context == null) {
            context = CoreUtility.getAppContext();
        }
        return context.getResources().getColor(i11);
    }

    /* renamed from: b */
    public static final int m134328b(Context context, int i11) {
        if (context == null) {
            context = CoreUtility.getAppContext();
        }
        return context.getResources().getDimensionPixelSize(i11);
    }

    /* renamed from: c */
    public static final float m134329c(Context context, int i11) {
        if (context == null) {
            context = CoreUtility.getAppContext();
        }
        return context.getResources().getDimension(i11);
    }
}
