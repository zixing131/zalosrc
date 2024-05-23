package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.to */
/* loaded from: classes2.dex */
public final class HandlerThreadC5027to extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: p */
    private final int[] f28441p;

    /* renamed from: q */
    private Handler f28442q;

    /* renamed from: r */
    private SurfaceTexture f28443r;

    /* renamed from: s */
    private Error f28444s;

    /* renamed from: t */
    private RuntimeException f28445t;

    /* renamed from: u */
    private zzbax f28446u;

    public HandlerThreadC5027to() {
        super("dummySurface");
        this.f28441p = new int[1];
    }

    /* renamed from: a */
    public final zzbax m26632a(boolean z11) {
        boolean z12;
        start();
        this.f28442q = new Handler(getLooper(), this);
        synchronized (this) {
            z12 = false;
            this.f28442q.obtainMessage(1, z11 ? 1 : 0, 0).sendToTarget();
            while (this.f28446u == null && this.f28445t == null && this.f28444s == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f28445t;
        if (runtimeException == null) {
            Error error = this.f28444s;
            if (error == null) {
                return this.f28446u;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void m26633b() {
        this.f28442q.sendEmptyMessage(3);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z11;
        boolean z12;
        boolean z13;
        int[] iArr;
        boolean z14;
        int[] iArr2;
        boolean z15;
        int i11 = message.what;
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return true;
                    }
                    try {
                        this.f28443r.release();
                        quit();
                        return true;
                    } finally {
                        this.f28446u = null;
                        this.f28443r = null;
                        GLES20.glDeleteTextures(1, this.f28441p, 0);
                    }
                }
                this.f28443r.updateTexImage();
                return true;
            }
            try {
                if (message.arg1 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC4361bo.m20614f(z12, "eglGetDisplay failed");
                int[] iArr3 = new int[2];
                AbstractC4361bo.m20614f(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr4, 0) && iArr4[0] > 0 && eGLConfigArr[0] != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC4361bo.m20614f(z13, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (z11) {
                    iArr = new int[]{12440, 2, 12992, 1, 12344};
                } else {
                    iArr = new int[]{12440, 2, 12344};
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                if (eglCreateContext != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AbstractC4361bo.m20614f(z14, "eglCreateContext failed");
                if (z11) {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                } else {
                    iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                }
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr2, 0);
                if (eglCreatePbufferSurface != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AbstractC4361bo.m20614f(z15, "eglCreatePbufferSurface failed");
                AbstractC4361bo.m20614f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f28441p, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28441p[0]);
                this.f28443r = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f28446u = new zzbax(this, this.f28443r, z11, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                this.f28444s = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                this.f28445t = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f28442q.sendEmptyMessage(2);
    }
}
