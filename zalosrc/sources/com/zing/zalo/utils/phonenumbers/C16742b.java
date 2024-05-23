package com.zing.zalo.utils.phonenumbers;

import java.io.Serializable;

/* renamed from: com.zing.zalo.utils.phonenumbers.b */
/* loaded from: classes4.dex */
public class C16742b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: B */
    private boolean f84979B;

    /* renamed from: D */
    private boolean f84981D;

    /* renamed from: p */
    private boolean f84983p;

    /* renamed from: r */
    private boolean f84985r;

    /* renamed from: t */
    private boolean f84987t;

    /* renamed from: v */
    private boolean f84989v;

    /* renamed from: x */
    private boolean f84991x;

    /* renamed from: z */
    private boolean f84993z;

    /* renamed from: q */
    private int f84984q = 0;

    /* renamed from: s */
    private long f84986s = 0;

    /* renamed from: u */
    private String f84988u = "";

    /* renamed from: w */
    private boolean f84990w = false;

    /* renamed from: y */
    private int f84992y = 1;

    /* renamed from: A */
    private String f84978A = "";

    /* renamed from: E */
    private String f84982E = "";

    /* renamed from: C */
    private a f84980C = a.UNSPECIFIED;

    /* renamed from: com.zing.zalo.utils.phonenumbers.b$a */
    /* loaded from: classes4.dex */
    public enum a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    /* renamed from: a */
    public C16742b m89360a() {
        this.f84979B = false;
        this.f84980C = a.UNSPECIFIED;
        return this;
    }

    /* renamed from: b */
    public boolean m89361b(C16742b c16742b) {
        if (c16742b == null) {
            return false;
        }
        if (this == c16742b) {
            return true;
        }
        if (this.f84984q != c16742b.f84984q || this.f84986s != c16742b.f84986s || !this.f84988u.equals(c16742b.f84988u) || this.f84990w != c16742b.f84990w || this.f84992y != c16742b.f84992y || !this.f84978A.equals(c16742b.f84978A) || this.f84980C != c16742b.f84980C || !this.f84982E.equals(c16742b.f84982E) || m89373n() != c16742b.m89373n()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int m89362c() {
        return this.f84984q;
    }

    /* renamed from: d */
    public a m89363d() {
        return this.f84980C;
    }

    /* renamed from: e */
    public String m89364e() {
        return this.f84988u;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C16742b) && m89361b((C16742b) obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long m89365f() {
        return this.f84986s;
    }

    /* renamed from: g */
    public int m89366g() {
        return this.f84992y;
    }

    /* renamed from: h */
    public String m89367h() {
        return this.f84982E;
    }

    public int hashCode() {
        int i11;
        int m89362c = (((((2173 + m89362c()) * 53) + Long.valueOf(m89365f()).hashCode()) * 53) + m89364e().hashCode()) * 53;
        int i12 = 1237;
        if (m89375p()) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int m89366g = (((((((((m89362c + i11) * 53) + m89366g()) * 53) + m89368i().hashCode()) * 53) + m89363d().hashCode()) * 53) + m89367h().hashCode()) * 53;
        if (m89373n()) {
            i12 = 1231;
        }
        return m89366g + i12;
    }

    /* renamed from: i */
    public String m89368i() {
        return this.f84978A;
    }

    /* renamed from: j */
    public boolean m89369j() {
        return this.f84979B;
    }

    /* renamed from: k */
    public boolean m89370k() {
        return this.f84987t;
    }

    /* renamed from: l */
    public boolean m89371l() {
        return this.f84989v;
    }

    /* renamed from: m */
    public boolean m89372m() {
        return this.f84991x;
    }

    /* renamed from: n */
    public boolean m89373n() {
        return this.f84981D;
    }

    /* renamed from: o */
    public boolean m89374o() {
        return this.f84993z;
    }

    /* renamed from: p */
    public boolean m89375p() {
        return this.f84990w;
    }

    /* renamed from: q */
    public C16742b m89376q(int i11) {
        this.f84983p = true;
        this.f84984q = i11;
        return this;
    }

    /* renamed from: r */
    public C16742b m89377r(a aVar) {
        aVar.getClass();
        this.f84979B = true;
        this.f84980C = aVar;
        return this;
    }

    /* renamed from: s */
    public C16742b m89378s(String str) {
        str.getClass();
        this.f84987t = true;
        this.f84988u = str;
        return this;
    }

    /* renamed from: t */
    public C16742b m89379t(boolean z11) {
        this.f84989v = true;
        this.f84990w = z11;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Country Code: ");
        sb2.append(this.f84984q);
        sb2.append(" National Number: ");
        sb2.append(this.f84986s);
        if (m89371l() && m89375p()) {
            sb2.append(" Leading Zero(s): true");
        }
        if (m89372m()) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.f84992y);
        }
        if (m89370k()) {
            sb2.append(" Extension: ");
            sb2.append(this.f84988u);
        }
        if (m89369j()) {
            sb2.append(" Country Code Source: ");
            sb2.append(this.f84980C);
        }
        if (m89373n()) {
            sb2.append(" Preferred Domestic Carrier Code: ");
            sb2.append(this.f84982E);
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public C16742b m89380u(long j11) {
        this.f84985r = true;
        this.f84986s = j11;
        return this;
    }

    /* renamed from: v */
    public C16742b m89381v(int i11) {
        this.f84991x = true;
        this.f84992y = i11;
        return this;
    }

    /* renamed from: w */
    public C16742b m89382w(String str) {
        str.getClass();
        this.f84981D = true;
        this.f84982E = str;
        return this;
    }

    /* renamed from: x */
    public C16742b m89383x(String str) {
        str.getClass();
        this.f84993z = true;
        this.f84978A = str;
        return this;
    }
}
