package b50;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.text.TextUtils;
import b50.C2553a;
import com.zing.zalo.AbstractC16803z;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p320ld.C22447s;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import s00.C26076k;
import si.C26263i;

/* renamed from: b50.d */
/* loaded from: classes5.dex */
public final class C2556d {

    /* renamed from: e */
    public static final int[] f10467e = {AbstractC16803z.background_reddot_new_remind, AbstractC16803z.ic_icn_reddot_warning};

    /* renamed from: a */
    private volatile C2553a f10468a;

    /* renamed from: b */
    private volatile boolean f10469b = false;

    /* renamed from: c */
    private volatile boolean f10470c = false;

    /* renamed from: d */
    private volatile boolean f10471d = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b50.d$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        static final C2556d f10472a = new C2556d();
    }

    /* renamed from: b50.d$b */
    /* loaded from: classes5.dex */
    public static class b implements Runnable {

        /* renamed from: p */
        private final int f10473p;

        /* renamed from: q */
        private final C2556d f10474q;

        public b(C2556d c2556d, int i11) {
            this.f10474q = c2556d;
            this.f10473p = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:            if (r1 != false) goto L10;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z11;
            try {
                C2553a m12980n = this.f10474q.m12980n();
                if (m12980n == null) {
                    return;
                }
                boolean m12987H = this.f10474q.m12987H();
                boolean z12 = false;
                switch (this.f10473p) {
                    case 0:
                        boolean m12968a0 = this.f10474q.m12968a0();
                        this.f10474q.m12992S(this.f10474q.m12970b0());
                        z11 = m12968a0;
                        z12 = true;
                        break;
                    case 1:
                    case 2:
                        z11 = this.f10474q.m12968a0();
                        boolean m12970b0 = this.f10474q.m12970b0();
                        if (m12987H && z11 && !m12970b0 && this.f10474q.m12986G()) {
                            this.f10474q.m12992S(false);
                            z12 = true;
                        }
                        if (m12987H && !z11) {
                            z12 = true;
                            break;
                        }
                        break;
                    case 3:
                        if (m12987H && m12980n.m12946i()) {
                            this.f10474q.m12989N(m12980n, "4", "");
                            z11 = false;
                            z12 = true;
                            break;
                        }
                        z11 = m12987H;
                        break;
                    case 4:
                        if (m12987H && this.f10474q.m12986G()) {
                            this.f10474q.m12992S(false);
                            this.f10474q.m12957D();
                            this.f10474q.m12989N(m12980n, "2", "");
                            z11 = m12987H;
                            z12 = true;
                            break;
                        }
                        z11 = m12987H;
                        break;
                    case 5:
                        if (m12987H) {
                            this.f10474q.m12966U(1L);
                            z11 = false;
                            z12 = true;
                            break;
                        }
                        z11 = m12987H;
                        break;
                    case 6:
                        break;
                    default:
                        z11 = m12987H;
                        break;
                }
                if (z12) {
                    if (m12987H && !z11) {
                        this.f10474q.m12956C();
                        this.f10474q.m12964R();
                    }
                    this.f10474q.m12965T(z11);
                    this.f10474q.m12963Q();
                    if (!m12987H && z11) {
                        this.f10474q.m12989N(m12980n, "1", "");
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: A */
    private boolean m12955A(C2553a.b bVar) {
        if (C2553a.b.m12948c() <= bVar.m12952a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m12956C() {
        if (!m12958F()) {
            C2553a c2553a = this.f10468a;
            long m12941d = c2553a.m12941d();
            int m12942e = c2553a.m12942e();
            long m12939b = c2553a.m12939b();
            int m12940c = c2553a.m12940c();
            int i11 = 0;
            if (m12942e <= 0 && m12940c <= 0) {
                m12993V(0);
                return;
            }
            int m13006w = m13006w();
            int i12 = 1;
            int m13004u = m13004u() + 1;
            if (m13006w == 0) {
                if (m13004u > m12942e) {
                    if (m12940c > 0) {
                        m12941d = m12939b;
                        i11 = 1;
                        m13004u = 1;
                    }
                    i11 = m13006w;
                    m13004u = 1;
                }
                i11 = m13006w;
            } else {
                if (m13006w == 1) {
                    if (m13004u > m12940c) {
                        if (m12942e <= 0) {
                            m12941d = m12939b;
                            i11 = m13006w;
                        }
                        m13004u = 1;
                    } else {
                        m12941d = m12939b;
                    }
                }
                i11 = m13006w;
            }
            m12997Z(i11);
            m12995X(m13004u);
            m12996Y(C23793c.m124316k().mo124314i() + (m12941d * 1000));
            int i13 = m12942e + m12940c;
            int m13003t = m13003t() + 1;
            if (m13003t > i13) {
                long m12982p = m12982p();
                long j11 = 1;
                if (m12982p != Long.MAX_VALUE) {
                    j11 = 1 + m12982p;
                }
                m12966U(j11);
            } else {
                i12 = m13003t;
            }
            m12994W(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m12957D() {
        if (!m12958F()) {
            C2553a.b m12944g = this.f10468a.m12944g();
            int m12952a = m12944g.m12952a();
            long m12953b = m12944g.m12953b();
            int m12948c = C2553a.b.m12948c();
            if (m12948c > m12952a) {
                return;
            }
            C2553a.b.m12950f(m12948c + 1);
            C2553a.b.m12951g(C23793c.m124316k().mo124314i() + (m12953b * 1000));
        }
    }

    /* renamed from: F */
    private boolean m12958F() {
        return this.f10468a == null;
    }

    /* renamed from: J */
    private boolean m12959J() {
        if (C23793c.m124316k().mo124314i() >= m13005v() && m12988I()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private boolean m12960K() {
        if (C23793c.m124316k().mo124314i() >= C2553a.b.m12949d()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m12961L() {
        boolean z11;
        try {
            String m3384R = AbstractC0924m0.m3384R();
            if (!TextUtils.isEmpty(m3384R)) {
                this.f10468a = C2553a.m12938a(new JSONObject(m3384R));
                z11 = false;
            } else {
                this.f10468a = new C2553a();
                z11 = true;
            }
            if (this.f10468a.m12942e() > 0 || this.f10468a.m12940c() > 0) {
                m12993V(1);
            }
            m12983y(z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m12962M(String str, String str2) {
        m12989N(m12980n(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m12963Q() {
        try {
            C23744a.m124114c().m124116d(6003, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("SMLRemindBackupPassword").mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m12964R() {
        C2553a.b.m12950f(0);
        C2553a.b.m12951g(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m12965T(boolean z11) {
        this.f10469b = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m12966U(long j11) {
        AbstractC0924m0.m4056nk(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public boolean m12968a0() {
        boolean z11;
        boolean z12;
        if (this.f10468a != null && this.f10468a.m12945h()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!C26263i.m135053s() && C22447s.m116055r() && AbstractC23309i.m121640Yf()) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean m12959J = m12959J();
        if (!z11 || !z12 || !m12959J) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public boolean m12970b0() {
        C2553a m12980n = m12980n();
        if (m12980n == null) {
            return false;
        }
        C2553a.b m12944g = m12980n.m12944g();
        if (m12944g.m12952a() <= 0) {
            return false;
        }
        boolean m12960K = m12960K();
        boolean m12955A = m12955A(m12944g);
        if (!m12960K || !m12955A) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public C2553a m12980n() {
        return this.f10468a;
    }

    /* renamed from: o */
    public static C2556d m12981o() {
        return a.f10472a;
    }

    /* renamed from: p */
    private long m12982p() {
        return AbstractC0924m0.m4039n3();
    }

    /* renamed from: y */
    private void m12983y(boolean z11) {
        if (m12958F()) {
            return;
        }
        boolean z12 = this.f10471d;
        this.f10471d = !z11;
        m13007x(z12 ? 1 : 0);
    }

    /* renamed from: B */
    public void m12984B() {
        if (m12987H()) {
            m12965T(false);
        }
        if (m12986G()) {
            m12992S(false);
        }
    }

    /* renamed from: E */
    public void m12985E() {
        C26076k.m134208q().m134220p().execute(new Runnable() { // from class: b50.b
            @Override // java.lang.Runnable
            public final void run() {
                C2556d.this.m12961L();
            }
        });
    }

    /* renamed from: G */
    public boolean m12986G() {
        return this.f10470c;
    }

    /* renamed from: H */
    public boolean m12987H() {
        return this.f10469b;
    }

    /* renamed from: I */
    public boolean m12988I() {
        if (AbstractC0924m0.m3448T5() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public void m12989N(C2553a c2553a, String str, String str2) {
        int m12940c;
        if (c2553a == null) {
            return;
        }
        try {
            int m13006w = m13006w();
            if (m13006w == 0) {
                m12940c = c2553a.m12942e();
            } else {
                m12940c = c2553a.m12940c();
            }
            C0815e1.m2075D().m2093L(str, String.valueOf(m13006w), String.valueOf(m12940c), String.valueOf(m13004u()), String.valueOf(m12982p()), str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: O */
    public void m12990O(final String str, final String str2) {
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: b50.c
            @Override // java.lang.Runnable
            public final void run() {
                C2556d.this.m12962M(str, str2);
            }
        });
    }

    /* renamed from: P */
    public void m12991P(String str) {
        try {
            if (m12999m()) {
                m12990O(str, "");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: S */
    public void m12992S(boolean z11) {
        this.f10470c = z11;
    }

    /* renamed from: V */
    public void m12993V(int i11) {
        AbstractC0924m0.m4327wo(i11);
    }

    /* renamed from: W */
    public void m12994W(int i11) {
        AbstractC0924m0.m4181rp(i11);
    }

    /* renamed from: X */
    public void m12995X(int i11) {
        AbstractC0924m0.m4270up(i11);
    }

    /* renamed from: Y */
    public void m12996Y(long j11) {
        AbstractC0924m0.m3004Dp(j11);
    }

    /* renamed from: Z */
    public void m12997Z(int i11) {
        AbstractC0924m0.m3381Qp(i11);
    }

    /* renamed from: l */
    public boolean m12998l() {
        return m12987H();
    }

    /* renamed from: m */
    public boolean m12999m() {
        if (m12987H() && m12986G()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public String[] m13000q(String str, String str2, String str3) {
        int m12940c;
        C2553a m12980n = m12980n();
        if (m12980n == null) {
            return null;
        }
        int m13006w = m13006w();
        if (m13006w == 0) {
            m12940c = m12980n.m12942e();
        } else {
            m12940c = m12980n.m12940c();
        }
        return new String[]{str, str2, String.valueOf(m13006w), String.valueOf(m12940c), String.valueOf(m13004u()), String.valueOf(m12982p()), str3};
    }

    /* renamed from: r */
    public C2553a.a m13001r() {
        if (this.f10468a != null) {
            return this.f10468a.m12943f();
        }
        return null;
    }

    /* renamed from: s */
    public C2553a.b m13002s() {
        if (this.f10468a != null) {
            return this.f10468a.m12944g();
        }
        return null;
    }

    /* renamed from: t */
    public int m13003t() {
        return AbstractC0924m0.m3014E6();
    }

    /* renamed from: u */
    public int m13004u() {
        return AbstractC0924m0.m3101H6();
    }

    /* renamed from: v */
    public long m13005v() {
        return AbstractC0924m0.m3362Q6();
    }

    /* renamed from: w */
    public int m13006w() {
        return AbstractC0924m0.m3623Z6();
    }

    /* renamed from: x */
    public void m13007x(int i11) {
        C26076k.m134208q().m134220p().execute(new b(this, i11));
    }

    /* renamed from: z */
    public void m13008z() {
        m12965T(false);
        m12992S(false);
        this.f10471d = false;
        this.f10468a = null;
    }
}
