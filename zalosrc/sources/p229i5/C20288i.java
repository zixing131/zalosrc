package p229i5;

import android.os.SystemClock;

/* renamed from: i5.i */
/* loaded from: classes.dex */
public class C20288i implements InterfaceC20285f {

    /* renamed from: a */
    private static final C20288i f100237a = new C20288i();

    private C20288i() {
    }

    /* renamed from: d */
    public static InterfaceC20285f m105926d() {
        return f100237a;
    }

    @Override // p229i5.InterfaceC20285f
    /* renamed from: a */
    public final long mo105913a() {
        return System.currentTimeMillis();
    }

    @Override // p229i5.InterfaceC20285f
    /* renamed from: b */
    public final long mo105914b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p229i5.InterfaceC20285f
    /* renamed from: c */
    public final long mo105915c() {
        return System.nanoTime();
    }
}
