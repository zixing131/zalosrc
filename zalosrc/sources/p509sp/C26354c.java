package p509sp;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;

/* renamed from: sp.c */
/* loaded from: classes4.dex */
public final class C26354c implements InterfaceC26352a {

    /* renamed from: a */
    public static final C26354c f125196a = new C26354c();

    /* renamed from: b */
    private static final C29234i f125197b;

    /* renamed from: c */
    private static final InterfaceC29232g f125198c;

    /* renamed from: sp.c$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f125199q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m4250u5());
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f125197b = m145994a;
        f125198c = AbstractC29233h.m145991b(m145994a, a.f125199q);
    }

    private C26354c() {
    }

    @Override // p509sp.InterfaceC26352a
    /* renamed from: a */
    public boolean mo104102a() {
        if (m135672c() == 1) {
            return true;
        }
        return false;
    }

    @Override // p509sp.InterfaceC26352a
    /* renamed from: b */
    public boolean mo104103b() {
        if (m135672c() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m135672c() {
        return ((Number) f125198c.getValue()).intValue();
    }

    /* renamed from: d */
    public boolean m135673d() {
        if (m135672c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m135674e(int i11) {
        AbstractC0924m0.m3089Gn(i11);
        f125197b.m145993b();
    }
}
