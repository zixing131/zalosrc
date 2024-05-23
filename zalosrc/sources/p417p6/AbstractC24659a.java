package p417p6;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: p6.a */
/* loaded from: classes3.dex */
public abstract class AbstractC24659a {
    /* renamed from: a */
    public static int m128196a(Canvas canvas, float f11, float f12, float f13, float f14, int i11) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f11, f12, f13, f14, i11);
        }
        return canvas.saveLayerAlpha(f11, f12, f13, f14, i11, 31);
    }
}
