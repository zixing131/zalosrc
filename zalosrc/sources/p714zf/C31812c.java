package p714zf;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: zf.c */
/* loaded from: classes3.dex */
class C31812c {

    /* renamed from: a */
    private EGLDisplay f145968a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f145969b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLSurface f145970c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private Surface f145971d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31812c(Surface surface, EGLContext eGLContext) {
        surface.getClass();
        this.f145971d = surface;
        m152845b(eGLContext);
    }

    /* renamed from: a */
    private void m152844a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: b */
    private void m152845b(EGLContext eGLContext) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f145968a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGL14.eglChooseConfig(this.f145968a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                m152844a("eglCreateContext RGB888+recordable ES2");
                this.f145969b = EGL14.eglCreateContext(this.f145968a, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
                m152844a("eglCreateContext");
                this.f145970c = EGL14.eglCreateWindowSurface(this.f145968a, eGLConfigArr[0], this.f145971d, new int[]{12344}, 0);
                m152844a("eglCreateWindowSurface");
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* renamed from: c */
    public void m152846c() {
        EGLDisplay eGLDisplay = this.f145968a;
        EGLSurface eGLSurface = this.f145970c;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f145969b);
        m152844a("eglMakeCurrent");
    }

    /* renamed from: d */
    public void m152847d() {
        EGLDisplay eGLDisplay = this.f145968a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f145968a, this.f145970c);
            EGL14.eglDestroyContext(this.f145968a, this.f145969b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f145968a);
        }
        this.f145971d.release();
        this.f145968a = EGL14.EGL_NO_DISPLAY;
        this.f145969b = EGL14.EGL_NO_CONTEXT;
        this.f145970c = EGL14.EGL_NO_SURFACE;
        this.f145971d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m152848e(long j11) {
        EGLExt.eglPresentationTimeANDROID(this.f145968a, this.f145970c, j11);
        m152844a("eglPresentationTimeANDROID");
    }

    /* renamed from: f */
    public boolean m152849f() {
        boolean eglSwapBuffers = EGL14.eglSwapBuffers(this.f145968a, this.f145970c);
        m152844a("eglSwapBuffers");
        return eglSwapBuffers;
    }
}
