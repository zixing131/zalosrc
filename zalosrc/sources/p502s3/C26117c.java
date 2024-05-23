package p502s3;

import android.graphics.Bitmap;
import ho0.AbstractC20110a;
import p379o3.C23999j;

/* renamed from: s3.c */
/* loaded from: classes.dex */
public class C26117c {

    /* renamed from: b */
    private static C26117c f124332b;

    /* renamed from: c */
    private static int f124333c;

    /* renamed from: a */
    private final InterfaceC26116b f124334a = new C26119e(m134453c());

    private C26117c() {
    }

    /* renamed from: a */
    public static synchronized void m134452a() {
        synchronized (C26117c.class) {
            C26117c c26117c = f124332b;
            if (c26117c != null) {
                c26117c.f124334a.mo134451d();
            }
        }
    }

    /* renamed from: c */
    public static int m134453c() {
        int i11 = f124333c;
        if (i11 != 0) {
            return i11;
        }
        return C23999j.m125754y2() / 3;
    }

    /* renamed from: d */
    public static synchronized C26117c m134454d() {
        C26117c c26117c;
        synchronized (C26117c.class) {
            try {
                if (f124332b == null) {
                    f124332b = new C26117c();
                }
                c26117c = f124332b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26117c;
    }

    /* renamed from: f */
    public static void m134455f(int i11) {
        f124333c = i11;
    }

    /* renamed from: g */
    public static synchronized void m134456g(int i11) {
        synchronized (C26117c.class) {
            C26117c c26117c = f124332b;
            if (c26117c != null) {
                c26117c.f124334a.mo134450c(i11);
            }
        }
    }

    /* renamed from: b */
    public synchronized Bitmap m134457b(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmap;
        try {
            bitmap = this.f124334a.mo134449b(i11, i12, config);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            bitmap = null;
        }
        return bitmap;
    }

    /* renamed from: e */
    public synchronized void m134458e(Bitmap bitmap) {
        this.f124334a.mo134448a(bitmap);
    }
}
