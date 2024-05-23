package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzxj extends Surface {

    /* renamed from: s */
    private static int f32171s;

    /* renamed from: t */
    private static boolean f32172t;

    /* renamed from: p */
    public final boolean f32173p;

    /* renamed from: q */
    private final gk4 f32174q;

    /* renamed from: r */
    private boolean f32175r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzxj(gk4 gk4Var, SurfaceTexture surfaceTexture, boolean z11, hk4 hk4Var) {
        super(surfaceTexture);
        this.f32174q = gk4Var;
        this.f32173p = z11;
    }

    /* renamed from: a */
    public static zzxj m28837a(Context context, boolean z11) {
        int i11 = 0;
        boolean z12 = true;
        if (z11 && !m28838b(context)) {
            z12 = false;
        }
        v71.m27175f(z12);
        gk4 gk4Var = new gk4();
        if (z11) {
            i11 = f32171s;
        }
        return gk4Var.m22464a(i11);
    }

    /* renamed from: b */
    public static synchronized boolean m28838b(Context context) {
        int i11;
        String eglQueryString;
        int i12;
        synchronized (zzxj.class) {
            try {
                if (!f32172t) {
                    int i13 = g92.f20474a;
                    if (i13 >= 24 && ((i13 >= 26 || (!"samsung".equals(g92.f20476c) && !"XT1650".equals(g92.f20477d))) && ((i13 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        i12 = 2;
                        if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                            i12 = 1;
                        }
                        f32171s = i12;
                        f32172t = true;
                    }
                    i12 = 0;
                    f32171s = i12;
                    f32172t = true;
                }
                i11 = f32171s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f32174q) {
            try {
                if (!this.f32175r) {
                    this.f32174q.m22465b();
                    this.f32175r = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
