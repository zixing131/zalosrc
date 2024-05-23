package p382o6;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p500s1.C26086a;
import p500s1.C26087b;
import p500s1.C26088c;

/* renamed from: o6.a */
/* loaded from: classes3.dex */
public abstract class AbstractC24041a {

    /* renamed from: a */
    public static final TimeInterpolator f116358a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f116359b = new C26087b();

    /* renamed from: c */
    public static final TimeInterpolator f116360c = new C26086a();

    /* renamed from: d */
    public static final TimeInterpolator f116361d = new C26088c();

    /* renamed from: e */
    public static final TimeInterpolator f116362e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m125910a(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    /* renamed from: b */
    public static float m125911b(float f11, float f12, float f13, float f14, float f15) {
        if (f15 < f13) {
            return f11;
        }
        if (f15 > f14) {
            return f12;
        }
        return m125910a(f11, f12, (f15 - f13) / (f14 - f13));
    }

    /* renamed from: c */
    public static int m125912c(int i11, int i12, float f11) {
        return i11 + Math.round(f11 * (i12 - i11));
    }
}
