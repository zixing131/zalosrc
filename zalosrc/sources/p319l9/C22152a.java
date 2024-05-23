package p319l9;

import java.util.Locale;

/* renamed from: l9.a */
/* loaded from: classes3.dex */
public class C22152a {

    /* renamed from: c */
    private static volatile C22152a f109074c;

    /* renamed from: a */
    private final C22154c f109075a;

    /* renamed from: b */
    private boolean f109076b;

    public C22152a(C22154c c22154c) {
        this.f109076b = false;
        this.f109075a = c22154c == null ? C22154c.m115539c() : c22154c;
    }

    /* renamed from: e */
    public static C22152a m115524e() {
        if (f109074c == null) {
            synchronized (C22152a.class) {
                try {
                    if (f109074c == null) {
                        f109074c = new C22152a();
                    }
                } finally {
                }
            }
        }
        return f109074c;
    }

    /* renamed from: a */
    public void m115525a(String str) {
        if (this.f109076b) {
            this.f109075a.m115540a(str);
        }
    }

    /* renamed from: b */
    public void m115526b(String str, Object... objArr) {
        if (this.f109076b) {
            this.f109075a.m115540a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void m115527c(String str) {
        if (this.f109076b) {
            this.f109075a.m115541b(str);
        }
    }

    /* renamed from: d */
    public void m115528d(String str, Object... objArr) {
        if (this.f109076b) {
            this.f109075a.m115541b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void m115529f(String str) {
        if (this.f109076b) {
            this.f109075a.m115542d(str);
        }
    }

    /* renamed from: g */
    public void m115530g(String str, Object... objArr) {
        if (this.f109076b) {
            this.f109075a.m115542d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean m115531h() {
        return this.f109076b;
    }

    /* renamed from: i */
    public void m115532i(boolean z11) {
        this.f109076b = z11;
    }

    /* renamed from: j */
    public void m115533j(String str) {
        if (this.f109076b) {
            this.f109075a.m115543e(str);
        }
    }

    /* renamed from: k */
    public void m115534k(String str, Object... objArr) {
        if (this.f109076b) {
            this.f109075a.m115543e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C22152a() {
        this(null);
    }
}
