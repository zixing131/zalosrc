package p128ed;

import am.AbstractC0924m0;
import p348mi.AbstractC23306f;

/* renamed from: ed.d */
/* loaded from: classes3.dex */
public final class C18389d {

    /* renamed from: a */
    public static final C18389d f92780a = new C18389d();

    private C18389d() {
    }

    /* renamed from: a */
    public static final boolean m97401a() {
        long m132998q = AbstractC23306f.m120688m().m132998q();
        if (!AbstractC23306f.m120676j().m128397N() || AbstractC0924m0.m4214ss() <= 0) {
            return false;
        }
        if (System.currentTimeMillis() - m132998q <= AbstractC23306f.m120676j().m128424t()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m97402b() {
        if (!m97401a()) {
            return false;
        }
        if (AbstractC0924m0.m4191s5() == AbstractC0924m0.m4214ss()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final void m97403c() {
        AbstractC0924m0.m3031En(AbstractC0924m0.m4214ss());
    }
}
