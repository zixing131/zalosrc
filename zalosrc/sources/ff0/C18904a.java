package ff0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: ff0.a */
/* loaded from: classes5.dex */
public class C18904a {

    /* renamed from: a */
    private EGLDisplay f94366a;

    /* renamed from: b */
    private EGLContext f94367b;

    /* renamed from: c */
    private EGLSurface f94368c;

    /* renamed from: d */
    private Surface f94369d;

    public C18904a(Surface surface) {
        this.f94369d = surface;
        m99095b();
    }

    /* renamed from: a */
    private void m99094a(String str) {
        boolean z11 = false;
        while (EGL14.eglGetError() != 12288) {
            z11 = true;
        }
        if (!z11) {
        } else {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    /* renamed from: b */
    private void m99095b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f94366a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f94366a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    this.f94367b = EGL14.eglCreateContext(this.f94366a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m99094a("eglCreateContext");
                    if (this.f94367b != null) {
                        this.f94368c = EGL14.eglCreateWindowSurface(this.f94366a, eGLConfigArr[0], this.f94369d, new int[]{12344}, 0);
                        m99094a("eglCreateWindowSurface");
                        if (this.f94368c != null) {
                            return;
                        } else {
                            throw new RuntimeException("surface was null");
                        }
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.f94366a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* renamed from: c */
    public void m99096c() {
        EGLDisplay eGLDisplay = this.f94366a;
        EGLSurface eGLSurface = this.f94368c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f94367b)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: d */
    public void m99097d() {
        if (EGL14.eglGetCurrentContext().equals(this.f94367b)) {
            EGLDisplay eGLDisplay = this.f94366a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f94366a, this.f94368c);
        EGL14.eglDestroyContext(this.f94366a, this.f94367b);
        this.f94369d.release();
        this.f94366a = null;
        this.f94367b = null;
        this.f94368c = null;
        this.f94369d = null;
    }

    /* renamed from: e */
    public void m99098e() {
        EGLDisplay eGLDisplay = this.f94366a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: f */
    public void m99099f(long j11) {
        EGLExt.eglPresentationTimeANDROID(this.f94366a, this.f94368c, j11);
    }

    /* renamed from: g */
    public boolean m99100g() {
        return EGL14.eglSwapBuffers(this.f94366a, this.f94368c);
    }
}
