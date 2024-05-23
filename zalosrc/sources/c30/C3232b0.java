package c30;

import fn0.AbstractC19060k;
import ho0.AbstractC20110a;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;
import vg.C28020b3;

/* renamed from: c30.b0 */
/* loaded from: classes5.dex */
public final class C3232b0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f13801a;

    /* renamed from: b */
    private C3247j f13802b;

    /* renamed from: c */
    private C25809a f13803c;

    /* renamed from: d */
    private C25811c f13804d;

    /* renamed from: c30.b0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C3232b0(int i11) {
        this.f13801a = i11;
    }

    /* renamed from: a */
    public final C3251l m16402a() {
        int i11;
        String str;
        C3251l c3251l = new C3251l(2);
        try {
            C25630b c25630b = new C25630b();
            C3247j c3247j = this.f13802b;
            if (c3247j != null) {
                i11 = c3247j.f13890c;
            } else {
                i11 = -1;
            }
            c25630b.m132405O(i11);
            c25630b.m132404N(-10);
            C25811c c25811c = this.f13804d;
            if (c25811c == null || (str = c25811c.m133090b()) == null) {
                str = "";
            }
            c25630b.m132428f0(str);
            c25630b.m132407Q(C28020b3.f130648a.m141209z(str));
            c3251l.m16521k(this.f13804d);
            c3251l.m16522l(c25630b);
            c3251l.m16520j(this.f13803c);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return c3251l;
    }

    /* renamed from: b */
    public final int m16403b() {
        int i11 = this.f13801a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return 0;
                }
                C25811c c25811c = this.f13804d;
                if (c25811c != null && c25811c.m133095g() == 1) {
                    return -10;
                }
                return -5;
            }
            return -4;
        }
        C3247j c3247j = this.f13802b;
        if (c3247j == null) {
            return 0;
        }
        return c3247j.f13888a;
    }

    /* renamed from: c */
    public final int m16404c() {
        C3247j c3247j;
        if (this.f13801a != 0 || (c3247j = this.f13802b) == null) {
            return 0;
        }
        return c3247j.f13896i;
    }

    /* renamed from: d */
    public final String m16405d() {
        C25809a c25809a;
        String m133082d;
        if (this.f13801a != 1 || (c25809a = this.f13803c) == null || (m133082d = c25809a.m133082d()) == null) {
            return "";
        }
        return m133082d;
    }

    /* renamed from: e */
    public final C25809a m16406e() {
        return this.f13803c;
    }

    /* renamed from: f */
    public final String m16407f() {
        String num;
        C25811c c25811c;
        int i11 = this.f13801a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 || (c25811c = this.f13804d) == null || (num = c25811c.m133092d()) == null) {
                    return "";
                }
            } else {
                C25809a c25809a = this.f13803c;
                if (c25809a == null || (num = c25809a.m133081c()) == null) {
                    return "";
                }
            }
        } else {
            C3247j c3247j = this.f13802b;
            if (c3247j == null || (num = Integer.valueOf(c3247j.f13890c).toString()) == null) {
                return "";
            }
        }
        return num;
    }

    /* renamed from: g */
    public final String m16408g() {
        String str;
        if (this.f13801a != 0) {
            return "";
        }
        C3247j c3247j = this.f13802b;
        if (c3247j != null) {
            str = c3247j.f13894g;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    public final int m16409h() {
        C3247j c3247j;
        if (this.f13801a != 0 || (c3247j = this.f13802b) == null) {
            return 0;
        }
        return c3247j.f13889b;
    }

    /* renamed from: i */
    public final String m16410i() {
        C25811c c25811c;
        String m133096h;
        if (this.f13801a != 2 || (c25811c = this.f13804d) == null || (m133096h = c25811c.m133096h()) == null) {
            return "";
        }
        return m133096h;
    }

    /* renamed from: j */
    public final C25811c m16411j() {
        return this.f13804d;
    }

    /* renamed from: k */
    public final C3247j m16412k() {
        return this.f13802b;
    }

    /* renamed from: l */
    public final String m16413l() {
        String str;
        if (this.f13801a != 0) {
            return "";
        }
        C3247j c3247j = this.f13802b;
        if (c3247j != null) {
            str = c3247j.f13891d;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public final String m16414m() {
        String str;
        if (this.f13801a != 0) {
            return "";
        }
        C3247j c3247j = this.f13802b;
        if (c3247j != null) {
            str = c3247j.f13893f;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: n */
    public final String m16415n() {
        String str;
        if (this.f13801a != 0) {
            return "";
        }
        C3247j c3247j = this.f13802b;
        if (c3247j != null) {
            str = c3247j.f13892e;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: o */
    public final int m16416o() {
        return this.f13801a;
    }

    /* renamed from: p */
    public final void m16417p(C25809a c25809a) {
        this.f13803c = c25809a;
    }

    /* renamed from: q */
    public final void m16418q(C25811c c25811c) {
        this.f13804d = c25811c;
    }

    /* renamed from: r */
    public final void m16419r(C3247j c3247j) {
        this.f13802b = c3247j;
    }
}
