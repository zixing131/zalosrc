package p097db;

import com.vng.zing.vn.zrtc.GroupCallback;

/* renamed from: db.e */
/* loaded from: classes3.dex */
public class C17846e {

    /* renamed from: b */
    private static volatile C17846e f90157b;

    /* renamed from: a */
    private volatile C17847f f90158a = null;

    private C17846e() {
    }

    /* renamed from: f */
    public static C17846e m94223f() {
        C17846e c17846e = f90157b;
        if (c17846e == null) {
            synchronized (C17846e.class) {
                try {
                    c17846e = f90157b;
                    if (c17846e == null) {
                        c17846e = new C17846e();
                        f90157b = c17846e;
                    }
                } finally {
                }
            }
        }
        return c17846e;
    }

    /* renamed from: A */
    public int m94224A(Object obj) {
        if (this.f90158a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90158a.m94287z(obj);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: B */
    public void m94225B(int i11) {
        if (this.f90158a != null) {
            this.f90158a.m94256A(i11);
        }
    }

    /* renamed from: C */
    public void m94226C(boolean z11) {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94257B(z11);
    }

    /* renamed from: D */
    public boolean m94227D(boolean z11) {
        if (this.f90158a == null) {
            return false;
        }
        return this.f90158a.m94258C(z11);
    }

    /* renamed from: E */
    public void m94228E() {
        if (this.f90158a != null) {
            this.f90158a.m94259D();
        }
    }

    /* renamed from: F */
    public void m94229F() {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94260E();
    }

    /* renamed from: G */
    public boolean m94230G(String str) {
        if (this.f90158a == null) {
            return false;
        }
        return this.f90158a.m94261F(str);
    }

    /* renamed from: a */
    public int m94231a(int i11, Object obj) {
        if (this.f90158a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90158a.m94262a(i11, obj);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: b */
    public int m94232b(String str) {
        if (this.f90158a == null) {
            return -1;
        }
        return this.f90158a.m94263b(str);
    }

    /* renamed from: c */
    public void m94233c() {
        if (this.f90158a != null) {
            this.f90158a.m94264c();
        }
    }

    /* renamed from: d */
    public String m94234d() {
        if (this.f90158a == null) {
            return "";
        }
        return this.f90158a.m94266e();
    }

    /* renamed from: e */
    public int m94235e() {
        if (this.f90158a == null) {
            return 0;
        }
        return this.f90158a.m94267f();
    }

    /* renamed from: g */
    public String m94236g(String str) {
        if (this.f90158a == null) {
            return "";
        }
        return this.f90158a.m94268g(str);
    }

    /* renamed from: h */
    public int m94237h(int i11, String str, String str2) {
        if (this.f90158a == null) {
            return -1;
        }
        return this.f90158a.m94269h(i11, str, str2);
    }

    /* renamed from: i */
    public int m94238i(String str) {
        if (this.f90158a == null) {
            return -1;
        }
        return this.f90158a.m94270i(str);
    }

    /* renamed from: j */
    public boolean m94239j() {
        if (this.f90158a == null) {
            return false;
        }
        return this.f90158a.m94271j();
    }

    /* renamed from: k */
    public void m94240k(boolean z11) {
        if (this.f90158a != null) {
            this.f90158a.m94272k(z11);
        }
    }

    /* renamed from: l */
    public boolean m94241l(boolean z11) {
        if (this.f90158a == null) {
            return false;
        }
        return this.f90158a.m94273l(z11);
    }

    /* renamed from: m */
    public int m94242m(int i11, String str, String str2) {
        if (this.f90158a == null) {
            return -1;
        }
        return this.f90158a.m94274m(i11, str, str2);
    }

    /* renamed from: n */
    public void m94243n(boolean z11) {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94275n(z11);
    }

    /* renamed from: o */
    public void m94244o(int i11, int i12) {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94276o(i11, i12);
    }

    /* renamed from: p */
    public void m94245p(int i11, int i12) {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94277p(i11, i12);
    }

    /* renamed from: q */
    public void m94246q(boolean z11) {
        if (this.f90158a != null) {
            this.f90158a.m94278q(z11);
        }
    }

    /* renamed from: r */
    public int m94247r(byte[] bArr, int i11, int i12, int i13, long j11) {
        if (this.f90158a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90158a.m94279r(bArr, i11, i12, i13, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: s */
    public int m94248s(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        if (this.f90158a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90158a.m94280s(i11, i12, i13, fArr, i14, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: t */
    public void m94249t(int i11) {
    }

    /* renamed from: u */
    public void m94250u(GroupCallback groupCallback) {
        if (this.f90158a != null) {
            this.f90158a.m94281t(groupCallback);
        }
    }

    /* renamed from: v */
    public void m94251v(int i11, int i12) {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94282u(i11, i12);
    }

    /* renamed from: w */
    public boolean m94252w() {
        if (this.f90158a == null) {
            return false;
        }
        return this.f90158a.m94283v();
    }

    /* renamed from: x */
    public void m94253x() {
        if (this.f90158a == null) {
            return;
        }
        this.f90158a.m94284w();
    }

    /* renamed from: y */
    public int m94254y(Object obj) {
        if (this.f90158a == null) {
            this.f90158a = new C17847f();
        }
        return this.f90158a.m94285x(obj);
    }

    /* renamed from: z */
    public int m94255z(Object obj) {
        if (this.f90158a == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return this.f90158a.m94286y(obj);
    }
}
