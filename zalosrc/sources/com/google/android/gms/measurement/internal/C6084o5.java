package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;
import java.util.List;
import p230i6.AbstractC20322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes.dex */
public final class C6084o5 {

    /* renamed from: A */
    private long f34270A;

    /* renamed from: B */
    private long f34271B;

    /* renamed from: C */
    private long f34272C;

    /* renamed from: D */
    private String f34273D;

    /* renamed from: E */
    private boolean f34274E;

    /* renamed from: F */
    private long f34275F;

    /* renamed from: G */
    private long f34276G;

    /* renamed from: a */
    private final C6127s4 f34277a;

    /* renamed from: b */
    private final String f34278b;

    /* renamed from: c */
    private String f34279c;

    /* renamed from: d */
    private String f34280d;

    /* renamed from: e */
    private String f34281e;

    /* renamed from: f */
    private String f34282f;

    /* renamed from: g */
    private long f34283g;

    /* renamed from: h */
    private long f34284h;

    /* renamed from: i */
    private long f34285i;

    /* renamed from: j */
    private String f34286j;

    /* renamed from: k */
    private long f34287k;

    /* renamed from: l */
    private String f34288l;

    /* renamed from: m */
    private long f34289m;

    /* renamed from: n */
    private long f34290n;

    /* renamed from: o */
    private boolean f34291o;

    /* renamed from: p */
    private boolean f34292p;

    /* renamed from: q */
    private String f34293q;

    /* renamed from: r */
    private Boolean f34294r;

    /* renamed from: s */
    private long f34295s;

    /* renamed from: t */
    private List f34296t;

    /* renamed from: u */
    private String f34297u;

    /* renamed from: v */
    private boolean f34298v;

    /* renamed from: w */
    private long f34299w;

    /* renamed from: x */
    private long f34300x;

    /* renamed from: y */
    private long f34301y;

    /* renamed from: z */
    private long f34302z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6084o5(C6127s4 c6127s4, String str) {
        AbstractC4205o.m19722k(c6127s4);
        AbstractC4205o.m19718g(str);
        this.f34277a = c6127s4;
        this.f34278b = str;
        c6127s4.mo31037v().mo31036g();
    }

    /* renamed from: A */
    public final long m31205A() {
        this.f34277a.mo31037v().mo31036g();
        return 0L;
    }

    /* renamed from: B */
    public final void m31206B(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34285i != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34285i = j11;
    }

    /* renamed from: C */
    public final void m31207C(long j11) {
        boolean z11;
        boolean z12 = false;
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19712a(z11);
        this.f34277a.mo31037v().mo31036g();
        boolean z13 = this.f34274E;
        if (this.f34283g != j11) {
            z12 = true;
        }
        this.f34274E = z13 | z12;
        this.f34283g = j11;
    }

    /* renamed from: D */
    public final void m31208D(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34284h != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34284h = j11;
    }

    /* renamed from: E */
    public final void m31209E(boolean z11) {
        boolean z12;
        this.f34277a.mo31037v().mo31036g();
        boolean z13 = this.f34274E;
        if (this.f34291o != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f34274E = z13 | z12;
        this.f34291o = z11;
    }

    /* renamed from: F */
    public final void m31210F(Boolean bool) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34294r, bool);
        this.f34294r = bool;
    }

    /* renamed from: G */
    public final void m31211G(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34281e, str);
        this.f34281e = str;
    }

    /* renamed from: H */
    public final void m31212H(List list) {
        ArrayList arrayList;
        this.f34277a.mo31037v().mo31036g();
        if (!AbstractC20322n.m106021a(this.f34296t, list)) {
            this.f34274E = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f34296t = arrayList;
        }
    }

    /* renamed from: I */
    public final void m31213I(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34297u, str);
        this.f34297u = str;
    }

    /* renamed from: J */
    public final void m31214J(boolean z11) {
        boolean z12;
        this.f34277a.mo31037v().mo31036g();
        boolean z13 = this.f34274E;
        if (this.f34298v != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f34274E = z13 | z12;
        this.f34298v = z11;
    }

    /* renamed from: K */
    public final void m31215K(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34299w != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34299w = j11;
    }

    /* renamed from: L */
    public final boolean m31216L() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34292p;
    }

    /* renamed from: M */
    public final boolean m31217M() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34291o;
    }

    /* renamed from: N */
    public final boolean m31218N() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34274E;
    }

    /* renamed from: O */
    public final boolean m31219O() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34298v;
    }

    /* renamed from: P */
    public final long m31220P() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34287k;
    }

    /* renamed from: Q */
    public final long m31221Q() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34275F;
    }

    /* renamed from: R */
    public final long m31222R() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34270A;
    }

    /* renamed from: S */
    public final long m31223S() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34271B;
    }

    /* renamed from: T */
    public final long m31224T() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34302z;
    }

    /* renamed from: U */
    public final long m31225U() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34301y;
    }

    /* renamed from: V */
    public final long m31226V() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34272C;
    }

    /* renamed from: W */
    public final long m31227W() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34300x;
    }

    /* renamed from: X */
    public final long m31228X() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34290n;
    }

    /* renamed from: Y */
    public final long m31229Y() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34295s;
    }

    /* renamed from: Z */
    public final long m31230Z() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34276G;
    }

    /* renamed from: a */
    public final String m31231a() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34273D;
    }

    /* renamed from: a0 */
    public final long m31232a0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34289m;
    }

    /* renamed from: b */
    public final String m31233b() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34281e;
    }

    /* renamed from: b0 */
    public final long m31234b0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34285i;
    }

    /* renamed from: c */
    public final String m31235c() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34297u;
    }

    /* renamed from: c0 */
    public final long m31236c0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34283g;
    }

    /* renamed from: d */
    public final List m31237d() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34296t;
    }

    /* renamed from: d0 */
    public final long m31238d0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34284h;
    }

    /* renamed from: e */
    public final void m31239e() {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E = false;
    }

    /* renamed from: e0 */
    public final long m31240e0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34299w;
    }

    /* renamed from: f */
    public final void m31241f() {
        this.f34277a.mo31037v().mo31036g();
        long j11 = this.f34283g + 1;
        if (j11 > 2147483647L) {
            this.f34277a.mo31033c().m31202w().m31109b("Bundle index overflow. appId", C6082o3.m31193z(this.f34278b));
            j11 = 0;
        }
        this.f34274E = true;
        this.f34283g = j11;
    }

    /* renamed from: f0 */
    public final Boolean m31242f0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34294r;
    }

    /* renamed from: g */
    public final void m31243g(String str) {
        this.f34277a.mo31037v().mo31036g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f34274E |= true ^ AbstractC20322n.m106021a(this.f34293q, str);
        this.f34293q = str;
    }

    /* renamed from: g0 */
    public final String m31244g0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34293q;
    }

    /* renamed from: h */
    public final void m31245h(boolean z11) {
        boolean z12;
        this.f34277a.mo31037v().mo31036g();
        boolean z13 = this.f34274E;
        if (this.f34292p != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f34274E = z13 | z12;
        this.f34292p = z11;
    }

    /* renamed from: h0 */
    public final String m31246h0() {
        this.f34277a.mo31037v().mo31036g();
        String str = this.f34273D;
        m31270z(null);
        return str;
    }

    /* renamed from: i */
    public final void m31247i(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34279c, str);
        this.f34279c = str;
    }

    /* renamed from: i0 */
    public final String m31248i0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34278b;
    }

    /* renamed from: j */
    public final void m31249j(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34288l, str);
        this.f34288l = str;
    }

    /* renamed from: j0 */
    public final String m31250j0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34279c;
    }

    /* renamed from: k */
    public final void m31251k(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34286j, str);
        this.f34286j = str;
    }

    /* renamed from: k0 */
    public final String m31252k0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34288l;
    }

    /* renamed from: l */
    public final void m31253l(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34287k != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34287k = j11;
    }

    /* renamed from: l0 */
    public final String m31254l0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34286j;
    }

    /* renamed from: m */
    public final void m31255m(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34275F != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34275F = j11;
    }

    /* renamed from: m0 */
    public final String m31256m0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34282f;
    }

    /* renamed from: n */
    public final void m31257n(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34270A != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34270A = j11;
    }

    /* renamed from: n0 */
    public final String m31258n0() {
        this.f34277a.mo31037v().mo31036g();
        return this.f34280d;
    }

    /* renamed from: o */
    public final void m31259o(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34271B != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34271B = j11;
    }

    /* renamed from: p */
    public final void m31260p(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34302z != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34302z = j11;
    }

    /* renamed from: q */
    public final void m31261q(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34301y != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34301y = j11;
    }

    /* renamed from: r */
    public final void m31262r(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34272C != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34272C = j11;
    }

    /* renamed from: s */
    public final void m31263s(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34300x != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34300x = j11;
    }

    /* renamed from: t */
    public final void m31264t(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34290n != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34290n = j11;
    }

    /* renamed from: u */
    public final void m31265u(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34295s != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34295s = j11;
    }

    /* renamed from: v */
    public final void m31266v(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34276G != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34276G = j11;
    }

    /* renamed from: w */
    public final void m31267w(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34282f, str);
        this.f34282f = str;
    }

    /* renamed from: x */
    public final void m31268x(String str) {
        this.f34277a.mo31037v().mo31036g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f34274E |= true ^ AbstractC20322n.m106021a(this.f34280d, str);
        this.f34280d = str;
    }

    /* renamed from: y */
    public final void m31269y(long j11) {
        boolean z11;
        this.f34277a.mo31037v().mo31036g();
        boolean z12 = this.f34274E;
        if (this.f34289m != j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34274E = z12 | z11;
        this.f34289m = j11;
    }

    /* renamed from: z */
    public final void m31270z(String str) {
        this.f34277a.mo31037v().mo31036g();
        this.f34274E |= !AbstractC20322n.m106021a(this.f34273D, str);
        this.f34273D = str;
    }
}
