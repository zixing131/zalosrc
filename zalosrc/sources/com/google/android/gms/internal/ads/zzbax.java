package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes2.dex */
public final class zzbax extends Surface {

    /* renamed from: r */
    private static boolean f31873r;

    /* renamed from: s */
    private static boolean f31874s;

    /* renamed from: p */
    private final HandlerThreadC5027to f31875p;

    /* renamed from: q */
    private boolean f31876q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbax(HandlerThreadC5027to handlerThreadC5027to, SurfaceTexture surfaceTexture, boolean z11, AbstractC5064uo abstractC5064uo) {
        super(surfaceTexture);
        this.f31875p = handlerThreadC5027to;
    }

    /* renamed from: a */
    public static zzbax m28696a(Context context, boolean z11) {
        if (AbstractC4916qo.f26898a >= 17) {
            boolean z12 = true;
            if (z11 && !m28697b(context)) {
                z12 = false;
            }
            AbstractC4361bo.m20613e(z12);
            return new HandlerThreadC5027to().m26632a(z11);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:            if (r6.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") == false) goto L24;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized boolean m28697b(Context context) {
        boolean z11;
        synchronized (zzbax.class) {
            try {
                if (!f31874s) {
                    int i11 = AbstractC4916qo.f26898a;
                    if (i11 >= 17) {
                        boolean z12 = false;
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            if (i11 == 24) {
                                String str = AbstractC4916qo.f26901d;
                                if (!str.startsWith("SM-G950")) {
                                    if (str.startsWith("SM-G955")) {
                                    }
                                }
                            }
                            z12 = true;
                        }
                        f31873r = z12;
                    }
                    f31874s = true;
                }
                z11 = f31873r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f31875p) {
            try {
                if (!this.f31876q) {
                    this.f31875p.m26633b();
                    this.f31876q = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
