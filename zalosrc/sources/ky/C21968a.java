package ky;

import android.os.SystemClock;

/* renamed from: ky.a */
/* loaded from: classes4.dex */
public final class C21968a {

    /* renamed from: a */
    public static final C21968a f108143a = new C21968a();

    /* renamed from: b */
    private static long f108144b;

    /* renamed from: c */
    private static long f108145c;

    private C21968a() {
    }

    /* renamed from: a */
    public final long m114719a() {
        return f108145c + (SystemClock.elapsedRealtime() - f108144b);
    }

    /* renamed from: b */
    public final void m114720b() {
        f108145c = System.currentTimeMillis();
        f108144b = SystemClock.elapsedRealtime();
    }
}
