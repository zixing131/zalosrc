package p153f8;

import android.util.Log;

/* renamed from: f8.f */
/* loaded from: classes.dex */
public class C18821f {

    /* renamed from: c */
    static final C18821f f94106c = new C18821f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f94107a;

    /* renamed from: b */
    private int f94108b = 4;

    public C18821f(String str) {
        this.f94107a = str;
    }

    /* renamed from: a */
    private boolean m98794a(int i11) {
        if (this.f94108b > i11 && !Log.isLoggable(this.f94107a, i11)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static C18821f m98795f() {
        return f94106c;
    }

    /* renamed from: b */
    public void m98796b(String str) {
        m98797c(str, null);
    }

    /* renamed from: c */
    public void m98797c(String str, Throwable th2) {
        m98794a(3);
    }

    /* renamed from: d */
    public void m98798d(String str) {
        m98799e(str, null);
    }

    /* renamed from: e */
    public void m98799e(String str, Throwable th2) {
        m98794a(6);
    }

    /* renamed from: g */
    public void m98800g(String str) {
        m98801h(str, null);
    }

    /* renamed from: h */
    public void m98801h(String str, Throwable th2) {
        m98794a(4);
    }

    /* renamed from: i */
    public void m98802i(String str) {
        m98803j(str, null);
    }

    /* renamed from: j */
    public void m98803j(String str, Throwable th2) {
        m98794a(2);
    }

    /* renamed from: k */
    public void m98804k(String str) {
        m98805l(str, null);
    }

    /* renamed from: l */
    public void m98805l(String str, Throwable th2) {
        m98794a(5);
    }
}
