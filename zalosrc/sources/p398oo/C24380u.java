package p398oo;

import fn0.AbstractC19074t;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: oo.u */
/* loaded from: classes4.dex */
public final class C24380u implements InterfaceC24379t {

    /* renamed from: a */
    public static final C24380u f117739a;

    /* renamed from: b */
    private static final C24382w f117740b;

    /* renamed from: c */
    private static final C24384y f117741c;

    /* renamed from: d */
    private static final MutableSharedFlow f117742d;

    static {
        C24380u c24380u = new C24380u();
        f117739a = c24380u;
        f117740b = new C24382w();
        f117741c = new C24384y();
        MutableSharedFlow m113477a = SharedFlowKt.m113477a(1, 1, BufferOverflow.DROP_OLDEST);
        m113477a.mo113433d(Boolean.valueOf(c24380u.mo127507a()));
        f117742d = m113477a;
    }

    private C24380u() {
    }

    /* renamed from: k */
    private final void m127508k() {
        f117742d.mo113433d(Boolean.valueOf(mo127507a()));
    }

    @Override // p398oo.InterfaceC24379t
    /* renamed from: a */
    public boolean mo127507a() {
        if (m127512e() && f117741c.m127535b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m127509b() {
        f117740b.m127526b();
        m127508k();
    }

    /* renamed from: c */
    public Flow m127510c() {
        return f117742d;
    }

    /* renamed from: d */
    public int m127511d() {
        return f117740b.m127529f();
    }

    /* renamed from: e */
    public boolean m127512e() {
        return f117740b.m127528e();
    }

    /* renamed from: f */
    public final boolean m127513f() {
        return mo127507a();
    }

    /* renamed from: g */
    public final boolean m127514g() {
        return mo127507a();
    }

    /* renamed from: h */
    public final boolean m127515h() {
        if (mo127507a() && f117740b.m127527d()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m127516i(String str) {
        AbstractC19074t.m100208f(str, "configString");
        f117740b.m127530h(str);
        m127508k();
    }

    /* renamed from: j */
    public void m127517j(int i11) {
        f117741c.m127537g(i11);
        m127508k();
    }

    /* renamed from: l */
    public void m127518l() {
        f117741c.m127536d();
        m127508k();
    }
}
