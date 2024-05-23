package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.zf */
/* loaded from: classes2.dex */
public final class C5241zf {

    /* renamed from: a */
    private final C4719le f31484a;

    /* renamed from: b */
    private final String f31485b;

    /* renamed from: c */
    private final String f31486c;

    /* renamed from: e */
    private final Class[] f31488e;

    /* renamed from: d */
    private volatile Method f31487d = null;

    /* renamed from: f */
    private final CountDownLatch f31489f = new CountDownLatch(1);

    public C5241zf(C4719le c4719le, String str, String str2, Class... clsArr) {
        this.f31484a = c4719le;
        this.f31485b = str;
        this.f31486c = str2;
        this.f31488e = clsArr;
        c4719le.m24248k().submit(new RunnableC5204yf(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m28497b(C5241zf c5241zf) {
        CountDownLatch countDownLatch;
        Class<?> loadClass;
        try {
            try {
                C4719le c4719le = c5241zf.f31484a;
                loadClass = c4719le.m24246i().loadClass(c5241zf.m28498c(c4719le.m24256u(), c5241zf.f31485b));
            } catch (NullPointerException unused) {
                countDownLatch = c5241zf.f31489f;
            } catch (Throwable th2) {
                c5241zf.f31489f.countDown();
                throw th2;
            }
        } catch (zzapj | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (loadClass == null) {
            countDownLatch = c5241zf.f31489f;
        } else {
            c5241zf.f31487d = loadClass.getMethod(c5241zf.m28498c(c5241zf.f31484a.m24256u(), c5241zf.f31486c), c5241zf.f31488e);
            if (c5241zf.f31487d == null) {
                countDownLatch = c5241zf.f31489f;
            }
            countDownLatch = c5241zf.f31489f;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m28498c(byte[] bArr, String str) {
        return new String(this.f31484a.m24243e().m26276b(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method m28499a() {
        if (this.f31487d != null) {
            return this.f31487d;
        }
        try {
            if (!this.f31489f.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f31487d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
