package p394oj;

import am.AbstractC0924m0;
import nh0.C23793c;

/* renamed from: oj.a */
/* loaded from: classes3.dex */
public class C24275a {

    /* renamed from: a */
    private int f117234a;

    /* renamed from: b */
    private String f117235b;

    /* renamed from: c */
    private long f117236c;

    /* renamed from: d */
    private long f117237d;

    /* renamed from: e */
    private int f117238e;

    public C24275a() {
        this.f117235b = "";
        this.f117236c = 0L;
        this.f117234a = 1;
        this.f117237d = 0L;
        this.f117238e = 3;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C24275a clone() {
        C24275a c24275a = new C24275a();
        c24275a.m126776m(m126769f());
        c24275a.m126778o(m126771h());
        c24275a.m126775l(m126768e());
        c24275a.m126774k(m126766c());
        c24275a.m126777n(m126770g());
        return c24275a;
    }

    /* renamed from: b */
    public boolean m126765b() {
        int mo124314i = (int) ((C23793c.m124316k().mo124314i() - this.f117236c) / 1000);
        if (m126772i() && mo124314i >= AbstractC0924m0.m3181K() * 3600) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public long m126766c() {
        return this.f117237d;
    }

    /* renamed from: d */
    public long m126767d() {
        return this.f117236c + (System.currentTimeMillis() - C23793c.m124316k().mo124314i()) + this.f117237d;
    }

    /* renamed from: e */
    public long m126768e() {
        return this.f117236c;
    }

    /* renamed from: f */
    public int m126769f() {
        return this.f117234a;
    }

    /* renamed from: g */
    public int m126770g() {
        return this.f117238e;
    }

    /* renamed from: h */
    public String m126771h() {
        return this.f117235b;
    }

    /* renamed from: i */
    public boolean m126772i() {
        if (m126766c() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m126773j() {
        if (m126766c() != 3600000 && m126766c() != 14400000 && !m126772i()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m126774k(long j11) {
        this.f117237d = j11;
    }

    /* renamed from: l */
    public void m126775l(long j11) {
        this.f117236c = j11;
    }

    /* renamed from: m */
    public void m126776m(int i11) {
        this.f117234a = i11;
    }

    /* renamed from: n */
    public void m126777n(int i11) {
        if (i11 == 0) {
            i11 = 3;
        }
        this.f117238e = i11;
    }

    /* renamed from: o */
    public void m126778o(String str) {
        this.f117235b = str;
    }

    public String toString() {
        return m126771h();
    }

    public C24275a(String str, long j11, long j12, int i11, int i12) {
        this.f117235b = str;
        this.f117236c = j11;
        this.f117234a = i11;
        this.f117237d = j12;
        m126777n(i12);
    }
}
