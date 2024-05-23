package p509sp;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: sp.e */
/* loaded from: classes4.dex */
public final class C26356e implements InterfaceC26353b {

    /* renamed from: b */
    private static boolean f125202b;

    /* renamed from: a */
    public static final C26356e f125201a = new C26356e();

    /* renamed from: c */
    private static boolean f125203c = AbstractC0924m0.m3335P8();

    /* renamed from: sp.e$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f125204q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11) {
            super(0);
            this.f125204q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m135684a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m135684a() {
            AbstractC0924m0.m4259ue(this.f125204q);
        }
    }

    private C26356e() {
    }

    /* renamed from: g */
    private final void m135677g(final InterfaceC18494a interfaceC18494a) {
        try {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sp.d
                @Override // java.lang.Runnable
                public final void run() {
                    C26356e.m135678h(InterfaceC18494a.this);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m135678h(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$function");
        try {
            interfaceC18494a.mo12V4();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p509sp.InterfaceC26353b
    /* renamed from: a */
    public boolean mo117210a() {
        return f125202b;
    }

    @Override // p509sp.InterfaceC26353b
    /* renamed from: b */
    public void mo117211b(boolean z11) {
        f125202b = z11;
    }

    /* renamed from: d */
    public final boolean m135679d() {
        return f125203c;
    }

    /* renamed from: e */
    public final boolean m135680e() {
        return f125202b;
    }

    /* renamed from: f */
    public final void m135681f() {
        f125202b = false;
    }

    /* renamed from: i */
    public final void m135682i(boolean z11) {
        f125203c = z11;
        m135677g(new a(z11));
    }

    /* renamed from: j */
    public final void m135683j(boolean z11) {
        f125202b = z11;
    }
}
