package te0;

import android.graphics.Bitmap;
import ho0.AbstractC20110a;
import me0.AbstractC23009a3;
import th.AbstractC26689j;

/* renamed from: te0.c */
/* loaded from: classes4.dex */
public final class C26645c {

    /* renamed from: a */
    public static final C26645c f126108a = new C26645c();

    private C26645c() {
    }

    /* renamed from: a */
    public static final boolean m136774a(float f11, float f12, float f13) {
        return f11 > f12 || f11 < f13;
    }

    /* renamed from: b */
    public static final boolean m136775b(Bitmap bitmap) {
        return m136776c(bitmap, AbstractC26689j.m137096e(), AbstractC26689j.m137097f());
    }

    /* renamed from: c */
    public static final boolean m136776c(Bitmap bitmap, float f11, float f12) {
        if (bitmap == null) {
            return false;
        }
        try {
            return m136774a(bitmap.getWidth() / bitmap.getHeight(), f11, f12);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m136777d(String str) {
        return m136778e(str, AbstractC26689j.m137096e(), AbstractC26689j.m137097f());
    }

    /* renamed from: e */
    public static final boolean m136778e(String str, float f11, float f12) {
        int[] m117954e = AbstractC23009a3.m117954e(str);
        return m136774a(m117954e[0] / m117954e[1], f11, f12);
    }
}
