package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class be1 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: v */
    private static final int[] f17710v = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: p */
    private final Handler f17711p;

    /* renamed from: q */
    private final int[] f17712q = new int[1];

    /* renamed from: r */
    private EGLDisplay f17713r;

    /* renamed from: s */
    private EGLContext f17714s;

    /* renamed from: t */
    private EGLSurface f17715t;

    /* renamed from: u */
    private SurfaceTexture f17716u;

    public be1(Handler handler, ad1 ad1Var) {
        this.f17711p = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture m20486a() {
        SurfaceTexture surfaceTexture = this.f17716u;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void m20487b(int i11) {
        boolean z11;
        boolean z12;
        int[] iArr;
        boolean z13;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z14;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        cg1.m20871a(z11, "eglGetDisplay failed");
        int[] iArr3 = new int[2];
        cg1.m20871a(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
        this.f17713r = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f17710v, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cg1.m20871a(z12, g92.m22349i("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = this.f17713r;
        if (i11 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        cg1.m20871a(z13, "eglCreateContext failed");
        this.f17714s = eglCreateContext;
        EGLDisplay eGLDisplay2 = this.f17713r;
        if (i11 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i11 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            cg1.m20871a(z14, "eglCreatePbufferSurface failed");
        }
        cg1.m20871a(EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.f17715t = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f17712q, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z15 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z15) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z15 = true;
        }
        if (!z15) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17712q[0]);
            this.f17716u = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new zzdk(sb2.toString());
    }

    /* renamed from: c */
    public final void m20488c() {
        this.f17711p.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f17716u;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f17712q, 0);
            }
            EGLDisplay eGLDisplay = this.f17713r;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f17713r;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f17715t;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f17713r, this.f17715t);
            }
            EGLContext eGLContext = this.f17714s;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f17713r, eGLContext);
            }
            int i11 = g92.f20474a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f17713r;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f17713r);
            }
            this.f17713r = null;
            this.f17714s = null;
            this.f17715t = null;
            this.f17716u = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f17713r;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f17713r;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f17715t;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f17713r, this.f17715t);
            }
            EGLContext eGLContext2 = this.f17714s;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f17713r, eGLContext2);
            }
            int i12 = g92.f20474a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f17713r;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f17713r);
            }
            this.f17713r = null;
            this.f17714s = null;
            this.f17715t = null;
            this.f17716u = null;
            throw th2;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17711p.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f17716u;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
