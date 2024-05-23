package p227i3;

import com.adtima.Adtima;

/* renamed from: i3.n */
/* loaded from: classes2.dex */
public class C20210n {

    /* renamed from: a */
    private static final String f99944a = "n";

    /* renamed from: b */
    private static C20210n f99945b;

    /* renamed from: a */
    public static C20210n m105453a() {
        if (f99945b == null) {
            f99945b = new C20210n();
        }
        return f99945b;
    }

    /* renamed from: b */
    public void m105454b(boolean z11) {
        long j11;
        try {
            if (z11) {
                AbstractC20202f.f99787O = true;
                long currentTimeMillis = System.currentTimeMillis();
                if (AbstractC20202f.f99788P.longValue() + AbstractC20202f.f99791S.longValue() >= currentTimeMillis) {
                    return;
                } else {
                    j11 = Long.valueOf(currentTimeMillis);
                }
            } else {
                AbstractC20202f.f99787O = false;
                j11 = 0L;
            }
            AbstractC20202f.f99788P = j11;
        } catch (Exception e11) {
            Adtima.m18328e(f99944a, e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m105455c() {
        if (m105456d()) {
            return AbstractC20202f.f99790R;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m105456d() {
        try {
            if (AbstractC20202f.f99789Q && AbstractC20202f.f99787O) {
                return AbstractC20202f.f99788P.longValue() + AbstractC20202f.f99791S.longValue() >= System.currentTimeMillis();
            }
            return false;
        } catch (Exception e11) {
            Adtima.m18328e(f99944a, e11.toString());
            return false;
        }
    }
}
