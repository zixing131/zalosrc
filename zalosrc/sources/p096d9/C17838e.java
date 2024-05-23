package p096d9;

import com.google.firebase.installations.C6589h;
import java.util.concurrent.TimeUnit;

/* renamed from: d9.e */
/* loaded from: classes.dex */
class C17838e {

    /* renamed from: d */
    private static final long f90127d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f90128e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C6589h f90129a = C6589h.m33670c();

    /* renamed from: b */
    private long f90130b;

    /* renamed from: c */
    private int f90131c;

    /* renamed from: a */
    private synchronized long m94108a(int i11) {
        if (!m94109c(i11)) {
            return f90127d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f90131c) + this.f90129a.m33676e(), f90128e);
    }

    /* renamed from: c */
    private static boolean m94109c(int i11) {
        return i11 == 429 || (i11 >= 500 && i11 < 600);
    }

    /* renamed from: d */
    private static boolean m94110d(int i11) {
        return (i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404;
    }

    /* renamed from: e */
    private synchronized void m94111e() {
        this.f90131c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m94112b() {
        boolean z11;
        if (this.f90131c != 0) {
            if (this.f90129a.m33674a() <= this.f90130b) {
                z11 = false;
            }
        }
        z11 = true;
        return z11;
    }

    /* renamed from: f */
    public synchronized void m94113f(int i11) {
        if (m94110d(i11)) {
            m94111e();
            return;
        }
        this.f90131c++;
        this.f90130b = this.f90129a.m33674a() + m94108a(i11);
    }
}
