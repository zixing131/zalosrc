package is;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p348mi.AbstractC23309i;
import p398oo.C24380u;
import p688yo.EnumC31036b;

/* renamed from: is.x0 */
/* loaded from: classes4.dex */
public final class C20830x0 {

    /* renamed from: a */
    public static final C20830x0 f102390a;

    /* renamed from: b */
    private static final MutableSharedFlow f102391b;

    /* renamed from: c */
    private static final MutableSharedFlow f102392c;

    /* renamed from: d */
    private static final MutableSharedFlow f102393d;

    /* renamed from: e */
    private static int f102394e;

    /* renamed from: is.x0$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f102395a;

        static {
            int[] iArr = new int[EnumC31036b.values().length];
            try {
                iArr[EnumC31036b.f143137p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31036b.f143138q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102395a = iArr;
        }
    }

    static {
        C20830x0 c20830x0 = new C20830x0();
        f102390a = c20830x0;
        MutableSharedFlow m113478b = SharedFlowKt.m113478b(1, 0, null, 6, null);
        m113478b.mo113433d(Integer.valueOf(c20830x0.m108863f()));
        f102391b = m113478b;
        MutableSharedFlow m113478b2 = SharedFlowKt.m113478b(1, 0, null, 6, null);
        m113478b2.mo113433d(Integer.valueOf(c20830x0.m108859b()));
        f102392c = m113478b2;
        MutableSharedFlow m113478b3 = SharedFlowKt.m113478b(1, 0, null, 6, null);
        m113478b3.mo113433d(Integer.valueOf(c20830x0.m108861d()));
        f102393d = m113478b3;
    }

    private C20830x0() {
    }

    /* renamed from: h */
    public static final int m108856h() {
        return f102394e;
    }

    /* renamed from: p */
    public static final void m108857p(int i11) {
        f102394e = i11;
    }

    /* renamed from: a */
    public final int m108858a() {
        return m108859b();
    }

    /* renamed from: b */
    public final int m108859b() {
        return AbstractC0924m0.m3418S4();
    }

    /* renamed from: c */
    public final MutableSharedFlow m108860c() {
        return f102392c;
    }

    /* renamed from: d */
    public final int m108861d() {
        return AbstractC0924m0.m3447T4();
    }

    /* renamed from: e */
    public final MutableSharedFlow m108862e() {
        return f102393d;
    }

    /* renamed from: f */
    public final int m108863f() {
        return AbstractC0924m0.m3803f7();
    }

    /* renamed from: g */
    public final MutableSharedFlow m108864g() {
        return f102391b;
    }

    /* renamed from: i */
    public final int m108865i() {
        return AbstractC23309i.m122571x9();
    }

    /* renamed from: j */
    public final boolean m108866j() {
        if (System.currentTimeMillis() - AbstractC0924m0.m3620Z3() > C24380u.f117739a.m127511d() * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final int m108867k(EnumC31036b enumC31036b) {
        AbstractC19074t.m100208f(enumC31036b, "tab");
        int i11 = a.f102395a[enumC31036b.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return m108861d();
            }
            throw new NoWhenBranchMatchedException();
        }
        return m108859b();
    }

    /* renamed from: l */
    public final void m108868l(int i11) {
        AbstractC0924m0.m3117Hm(i11);
        AbstractC20833z.m108895J();
        f102392c.mo113433d(Integer.valueOf(i11));
    }

    /* renamed from: m */
    public final void m108869m(int i11) {
        if (i11 > 0 && AbstractC0924m0.m3447T4() == 0) {
            AbstractC0924m0.m4324wl(System.currentTimeMillis());
        }
        AbstractC0924m0.m3146Im(i11);
        f102393d.mo113433d(Integer.valueOf(i11));
    }

    /* renamed from: n */
    public final void m108870n(EnumC31036b enumC31036b, int i11) {
        AbstractC19074t.m100208f(enumC31036b, "tab");
        int i12 = a.f102395a[enumC31036b.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                m108869m(i11);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        m108868l(i11);
    }

    /* renamed from: o */
    public final void m108871o(int i11) {
        AbstractC0924m0.m3613Yp(i11);
        AbstractC20833z.m108895J();
        f102391b.mo113433d(Integer.valueOf(i11));
    }

    /* renamed from: q */
    public final void m108872q(int i11) {
        AbstractC23309i.m122146lu(i11);
    }
}
