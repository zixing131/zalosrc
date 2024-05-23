package zw;

import android.text.TextUtils;

/* renamed from: zw.b */
/* loaded from: classes4.dex */
public abstract class AbstractC32562b {

    /* renamed from: a */
    protected long f150496a;

    /* renamed from: b */
    protected int f150497b;

    /* renamed from: c */
    protected String f150498c;

    /* renamed from: d */
    protected int f150499d;

    /* renamed from: e */
    protected C32561a f150500e;

    /* renamed from: a */
    public long m157670a() {
        return this.f150496a;
    }

    /* renamed from: b */
    public String m157671b() {
        return this.f150498c;
    }

    /* renamed from: c */
    public void m157672c(int i11) {
        this.f150499d = i11;
    }

    /* renamed from: d */
    public void m157673d(C32561a c32561a) {
        C32561a c32561a2 = new C32561a();
        this.f150500e = c32561a2;
        c32561a2.f150491a = c32561a.f150491a;
        c32561a2.f150492b = c32561a.f150492b;
        c32561a2.f150493c = c32561a.f150493c;
        c32561a2.f150494d = c32561a.f150494d;
        c32561a2.f150495e = c32561a.f150495e;
    }

    /* renamed from: e */
    public void m157674e(long j11) {
        this.f150496a = j11;
    }

    /* renamed from: f */
    public void m157675f(int i11) {
        this.f150497b = i11;
    }

    /* renamed from: g */
    public void m157676g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        this.f150498c = str;
    }
}
