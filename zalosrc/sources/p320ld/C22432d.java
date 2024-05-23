package p320ld;

import ag0.AbstractC0837p0;
import bg0.C2797c;
import bg0.InterfaceC2798d;
import ch0.AbstractC3489d;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23160o0;
import p348mi.AbstractC23306f;
import p387oc.C24199c;
import p387oc.C24213q;
import p421pc.C24720a;
import p443qc.EnumC25220d;
import p484ri.C25806c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tw.AbstractC26902d;

/* renamed from: ld.d */
/* loaded from: classes3.dex */
public final class C22432d {

    /* renamed from: a */
    public static final C22432d f109743a = new C22432d();

    /* renamed from: b */
    private static final String f109744b = "SMLActiveAutoBackupHandler";

    /* renamed from: c */
    private static final InterfaceC24854k f109745c;

    /* renamed from: d */
    private static final InterfaceC24854k f109746d;

    /* renamed from: e */
    private static final InterfaceC24854k f109747e;

    /* renamed from: f */
    private static final InterfaceC24854k f109748f;

    /* renamed from: g */
    private static final InterfaceC2798d f109749g;

    /* renamed from: ld.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f109750q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24720a mo12V4() {
            return AbstractC23306f.m120676j();
        }
    }

    /* renamed from: ld.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f109751q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24199c mo12V4() {
            return AbstractC23306f.m120684l();
        }
    }

    /* renamed from: ld.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f109752q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25806c mo12V4() {
            return AbstractC23306f.m120692n();
        }
    }

    /* renamed from: ld.d$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f109753q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24213q mo12V4() {
            return AbstractC23306f.m120696o();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(a.f109750q);
        f109745c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f109752q);
        f109746d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(b.f109751q);
        f109747e = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f109753q);
        f109748f = m129210a4;
        f109749g = new C2797c(AbstractC0837p0.Companion.m2237f());
    }

    private C22432d() {
    }

    /* renamed from: b */
    private final C24720a m115872b() {
        return (C24720a) f109745c.getValue();
    }

    /* renamed from: c */
    private final C25806c m115873c() {
        return (C25806c) f109746d.getValue();
    }

    /* renamed from: d */
    private final C24213q m115874d() {
        return (C24213q) f109748f.getValue();
    }

    /* renamed from: e */
    private final boolean m115875e() {
        if (m115873c().m133062x() >= 3) {
            return false;
        }
        long m133060v = m115873c().m133060v();
        if (m133060v != 0 && AbstractC23160o0.m119242d(System.currentTimeMillis() - m133060v) < 14) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static /* synthetic */ void m115876i(C22432d c22432d, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c22432d.m115880h(z11);
    }

    /* renamed from: a */
    public final void m115877a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "runnable");
        f109749g.mo13474a(runnable);
    }

    /* renamed from: f */
    public final void m115878f(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        if (!m115872b().m128400Q()) {
            return;
        }
        if (AbstractC3489d.m17513u() && m115873c().m133063y() == EnumC25220d.f120981r) {
            return;
        }
        m115876i(this, false, 1, null);
        if (m115872b().m128400Q() && m115875e() && m115872b().m128391H() && m115873c().m133063y() == EnumC25220d.f120981r) {
            m115873c().m133042W();
            m115874d().m126198H(zaloView);
        }
    }

    /* renamed from: g */
    public final void m115879g() {
        m115876i(this, false, 1, null);
    }

    /* renamed from: h */
    public final void m115880h(boolean z11) {
        if (m115872b().m128391H() && m115873c().m133063y() == EnumC25220d.f120982s) {
            m115872b().m128407Y(10);
            m115873c().m133040U(EnumC25220d.f120980q);
            AbstractC26902d.m138659a(f109744b, "validateActiveAuto -> ACTIVE AUTO BACKUP!");
        }
        if (z11) {
            if (!m115872b().m128391H()) {
                AbstractC26902d.m138659a(f109744b, "validateActiveAuto -> not active on old device");
            }
            if (m115873c().m133063y() == EnumC25220d.f120981r) {
                AbstractC26902d.m138659a(f109744b, "validateActiveAuto -> user DENY restore backup");
            }
        }
    }
}
