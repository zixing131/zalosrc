package hf0;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import p348mi.AbstractC23309i;
import p509sp.InterfaceC26352a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;

/* renamed from: hf0.j */
/* loaded from: classes5.dex */
public final class C20048j implements InterfaceC26352a {

    /* renamed from: a */
    public static final C20048j f98580a = new C20048j();

    /* renamed from: b */
    private static final C29234i f98581b;

    /* renamed from: c */
    private static final InterfaceC29232g f98582c;

    /* renamed from: hf0.j$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f98583q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23309i.m121229Nb());
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f98581b = m145994a;
        f98582c = AbstractC29233h.m145991b(m145994a, a.f98583q);
    }

    private C20048j() {
    }

    @Override // p509sp.InterfaceC26352a
    /* renamed from: a */
    public boolean mo104102a() {
        if (m104104c() == 1) {
            return true;
        }
        return false;
    }

    @Override // p509sp.InterfaceC26352a
    /* renamed from: b */
    public boolean mo104103b() {
        if (m104104c() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m104104c() {
        return ((Number) f98582c.getValue()).intValue();
    }

    /* renamed from: d */
    public boolean m104105d() {
        if (m104104c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m104106e(int i11) {
        AbstractC23309i.m121583Ww(i11);
        f98581b.m145993b();
    }
}
