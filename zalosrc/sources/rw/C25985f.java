package rw;

import android.os.Bundle;

/* renamed from: rw.f */
/* loaded from: classes.dex */
public class C25985f {

    /* renamed from: k */
    private static final Object f123958k = new Object();

    /* renamed from: l */
    private static C25985f f123959l;

    /* renamed from: m */
    private static int f123960m;

    /* renamed from: a */
    public int f123961a;

    /* renamed from: b */
    public int f123962b;

    /* renamed from: c */
    public int f123963c;

    /* renamed from: d */
    public Object f123964d;

    /* renamed from: e */
    int f123965e;

    /* renamed from: f */
    long f123966f;

    /* renamed from: g */
    Bundle f123967g;

    /* renamed from: h */
    C25982c f123968h;

    /* renamed from: i */
    Runnable f123969i;

    /* renamed from: j */
    C25985f f123970j;

    /* renamed from: d */
    public static C25985f m133843d() {
        synchronized (f123958k) {
            try {
                C25985f c25985f = f123959l;
                if (c25985f != null) {
                    f123959l = c25985f.f123970j;
                    c25985f.f123970j = null;
                    c25985f.f123965e = 0;
                    f123960m--;
                    return c25985f;
                }
                return new C25985f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static C25985f m133844e(C25982c c25982c, int i11) {
        C25985f m133843d = m133843d();
        m133843d.f123968h = c25982c;
        m133843d.f123961a = i11;
        return m133843d;
    }

    /* renamed from: f */
    public static C25985f m133845f(C25982c c25982c, int i11, Object obj) {
        C25985f m133843d = m133843d();
        m133843d.f123968h = c25982c;
        m133843d.f123961a = i11;
        m133843d.f123964d = obj;
        return m133843d;
    }

    /* renamed from: a */
    public boolean m133846a() {
        return (this.f123965e & 2) != 0;
    }

    /* renamed from: b */
    public boolean m133847b() {
        return (this.f123965e & 1) == 1;
    }

    /* renamed from: c */
    public void m133848c() {
        this.f123965e |= 1;
    }

    /* renamed from: g */
    public void m133849g() {
        if (m133847b()) {
            return;
        }
        m133850h();
    }

    /* renamed from: h */
    public void m133850h() {
        this.f123965e = 1;
        this.f123961a = 0;
        this.f123962b = 0;
        this.f123963c = 0;
        this.f123964d = null;
        this.f123966f = 0L;
        this.f123968h = null;
        this.f123969i = null;
        this.f123967g = null;
        synchronized (f123958k) {
            try {
                int i11 = f123960m;
                if (i11 < 50) {
                    this.f123970j = f123959l;
                    f123959l = this;
                    f123960m = i11 + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public void m133851i(boolean z11) {
        if (z11) {
            this.f123965e |= 2;
        } else {
            this.f123965e &= -3;
        }
    }
}
