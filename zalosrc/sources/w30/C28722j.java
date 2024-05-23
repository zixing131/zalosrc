package w30;

import am.AbstractC0924m0;
import ho0.AbstractC20110a;
import p173fz.C19172a;
import p348mi.AbstractC23306f;

/* renamed from: w30.j */
/* loaded from: classes5.dex */
public final class C28722j {

    /* renamed from: a */
    public static final C28722j f133241a = new C28722j();

    private C28722j() {
    }

    /* renamed from: a */
    public final long m143851a() {
        try {
            return AbstractC0924m0.m4222t6() - AbstractC23306f.m120579F1().mo124314i();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1L;
        }
    }

    /* renamed from: b */
    public final boolean m143852b() {
        if (C19172a.m100600k("text_to_speech@enable", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m143853c() {
        if (C19172a.m100600k("text_to_speech@show_beta", 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m143854d(long j11) {
        if (j11 <= 0) {
            return;
        }
        AbstractC0924m0.m3851gp(AbstractC23306f.m120579F1().mo124314i() + j11);
    }
}
