package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public final class h23 extends a23 {

    /* renamed from: p */
    private a63 f21510p;

    /* renamed from: q */
    private a63 f21511q;

    /* renamed from: r */
    private g23 f21512r;

    /* renamed from: s */
    private HttpURLConnection f21513s;

    h23(a63 a63Var, a63 a63Var2, g23 g23Var) {
        this.f21510p = a63Var;
        this.f21511q = a63Var2;
        this.f21512r = g23Var;
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m22682b() {
        return -1;
    }

    /* renamed from: c */
    public static /* synthetic */ Integer m22683c() {
        return -1;
    }

    /* renamed from: o */
    public static void m22686o(HttpURLConnection httpURLConnection) {
        b23.m20371a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m22686o(this.f21513s);
    }

    /* renamed from: h */
    public HttpURLConnection m22687h() {
        b23.m20372b(((Integer) this.f21510p.zza()).intValue(), ((Integer) this.f21511q.zza()).intValue());
        g23 g23Var = this.f21512r;
        g23Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) g23Var.zza();
        this.f21513s = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: i */
    public HttpURLConnection m22688i(g23 g23Var, int i11, int i12) {
        this.f21510p = new a63() { // from class: com.google.android.gms.internal.ads.c23

            /* renamed from: p */
            public final /* synthetic */ int f18092p;

            public /* synthetic */ c23(int i112) {
                r1 = i112;
            }

            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.f21511q = new a63() { // from class: com.google.android.gms.internal.ads.d23

            /* renamed from: p */
            public final /* synthetic */ int f19060p;

            public /* synthetic */ d23(int i122) {
                r1 = i122;
            }

            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.f21512r = g23Var;
        return m22687h();
    }

    public h23() {
        this(e23.f19492p, f23.f19941p, null);
    }
}
