package dj;

import dj.C17985n1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p304ks.AbstractC21935u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: dj.h0 */
/* loaded from: classes3.dex */
public final class C17966h0 implements C17985n1.b {

    /* renamed from: a */
    private final C17945a0 f90975a;

    /* renamed from: b */
    private int f90976b;

    /* renamed from: c */
    private int f90977c;

    /* renamed from: d */
    private int f90978d;

    /* renamed from: e */
    private int f90979e;

    /* renamed from: f */
    private final InterfaceC24854k f90980f;

    /* renamed from: g */
    private final InterfaceC24854k f90981g;

    /* renamed from: dj.h0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17985n1 mo12V4() {
            return C17966h0.this.m95549d(true);
        }
    }

    /* renamed from: dj.h0$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17985n1 mo12V4() {
            return C17966h0.this.m95549d(false);
        }
    }

    public C17966h0(C17945a0 c17945a0) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f90975a = c17945a0;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f90980f = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new a());
        this.f90981g = m129210a2;
    }

    /* renamed from: b */
    private final void m95548b(C17985n1 c17985n1, boolean z11) {
        int m95550g;
        int i11;
        long m95641k;
        if (c17985n1.m95642l()) {
            m95550g = m95557f();
        } else {
            m95550g = m95550g();
        }
        if (m95550g == 0) {
            c17985n1.m95647q();
            if (z11) {
                c17985n1.m95645o();
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c17985n1.m95640j() >= 5) {
            i11 = C17985n1.Companion.m95656b(currentTimeMillis, c17985n1);
        } else {
            i11 = 0;
        }
        int m95655a = C17985n1.Companion.m95655a(this.f90975a.f90645O0, i11, m95550g);
        if (m95550g != c17985n1.m95640j()) {
            m95641k = currentTimeMillis + m95655a;
        } else {
            m95641k = c17985n1.m95641k();
        }
        if (c17985n1.m95640j() != m95550g) {
            c17985n1.m95650t(i11);
            c17985n1.m95652v(m95550g);
            c17985n1.m95649s(m95655a);
            c17985n1.m95653w(m95641k);
            if (z11) {
                c17985n1.m95646p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final C17985n1 m95549d(boolean z11) {
        if (this.f90975a.m95306y8()) {
            return new C18003t1(z11, this);
        }
        if (!this.f90975a.m94871D7() && !this.f90975a.m95120e6()) {
            return new C17985n1(z11, this);
        }
        return new C17982m1(z11, this);
    }

    /* renamed from: g */
    private final int m95550g() {
        return m95552l().mo95630e(this.f90975a, this.f90976b, this.f90977c, this.f90978d, true);
    }

    /* renamed from: i */
    private final C17985n1 m95551i() {
        return (C17985n1) this.f90981g.getValue();
    }

    /* renamed from: l */
    private final C17985n1 m95552l() {
        return (C17985n1) this.f90980f.getValue();
    }

    /* renamed from: r */
    private final void m95553r() {
        if (m95551i().m95641k() > 0) {
            m95548b(m95551i(), true);
        }
    }

    /* renamed from: u */
    private final void m95554u() {
        if (m95552l().m95641k() > 0) {
            m95548b(m95552l(), true);
        }
    }

    @Override // dj.C17985n1.b
    /* renamed from: c */
    public void mo95555c() {
        m95570x(0);
        m95572z(0);
        m95571y(0);
        m95569w(0);
    }

    /* renamed from: e */
    public final C17985n1 m95556e(boolean z11) {
        if (!z11) {
            m95548b(m95551i(), false);
            if (m95551i().m95643m()) {
                return m95551i();
            }
        }
        m95548b(m95552l(), false);
        return m95552l();
    }

    /* renamed from: f */
    public final int m95557f() {
        return m95551i().mo95629d(this.f90975a, this.f90979e);
    }

    /* renamed from: h */
    public final int m95558h() {
        return C17985n1.m95633f(m95552l(), this.f90975a, this.f90976b, this.f90977c, this.f90978d, false, 16, null);
    }

    /* renamed from: j */
    public final int m95559j() {
        return this.f90978d;
    }

    /* renamed from: k */
    public final int m95560k() {
        return this.f90979e;
    }

    /* renamed from: m */
    public final void m95561m() {
        if (m95551i().m95641k() > 0) {
            m95551i().m95647q();
            m95551i().m95645o();
        }
        m95570x(0);
    }

    /* renamed from: n */
    public final void m95562n() {
        m95552l().m95647q();
        m95552l().m95645o();
        m95571y(0);
    }

    /* renamed from: o */
    public final void m95563o() {
        m95572z(0);
    }

    /* renamed from: p */
    public final void m95564p(int i11) {
        int i12 = this.f90979e;
        if (i11 > i12) {
            if (i11 == 100 || i11 > i12) {
                m95570x(i11);
                this.f90975a.m95128f2(i11);
            }
        }
    }

    /* renamed from: q */
    public final void m95565q(int i11, boolean z11, boolean z12) {
        if (i11 > this.f90979e) {
            this.f90975a.m95148h2(i11);
            if (i11 == 100 || i11 > this.f90979e) {
                if ((!this.f90975a.m95276v6() && z11) || z12) {
                    m95570x(i11);
                    this.f90975a.m95128f2(i11);
                    if (z12 && this.f90975a.m95276v6() && !AbstractC21935u.m114550q(this.f90975a.mo95039W2())) {
                        this.f90975a.m95209n9(this.f90979e);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public final void m95566s(int i11) {
        if (i11 > this.f90978d) {
            m95569w(i11);
            this.f90975a.m95167j2(m95558h());
        }
    }

    /* renamed from: t */
    public final void m95567t(int i11) {
        if (i11 > this.f90977c) {
            m95571y(i11);
            this.f90975a.m95167j2(m95558h());
        }
    }

    /* renamed from: v */
    public final void m95568v(int i11) {
        if (i11 > this.f90976b) {
            m95572z(i11);
            this.f90975a.m95167j2(m95558h());
        }
    }

    /* renamed from: w */
    public final void m95569w(int i11) {
        if (this.f90978d != i11) {
            this.f90978d = i11;
            m95554u();
        }
    }

    /* renamed from: x */
    public final void m95570x(int i11) {
        if (this.f90979e != i11) {
            this.f90979e = i11;
            m95553r();
        }
    }

    /* renamed from: y */
    public final void m95571y(int i11) {
        if (this.f90977c != i11) {
            this.f90977c = i11;
            m95554u();
        }
    }

    /* renamed from: z */
    public final void m95572z(int i11) {
        if (this.f90976b != i11) {
            this.f90976b = i11;
            m95554u();
        }
    }
}
