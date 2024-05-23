package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.e */
/* loaded from: classes2.dex */
abstract class AbstractC1244e extends Drawable {

    /* renamed from: a */
    private static final double f4841a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m5894a(float f11, float f12, boolean z11) {
        return z11 ? (float) (f11 + ((1.0d - f4841a) * f12)) : f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m5895b(float f11, float f12, boolean z11) {
        return z11 ? (float) ((f11 * 1.5f) + ((1.0d - f4841a) * f12)) : f11 * 1.5f;
    }
}
