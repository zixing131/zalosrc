package yh0;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import yh0.AbstractC30984a;

/* renamed from: yh0.b */
/* loaded from: classes7.dex */
public final class C30985b extends AbstractC30984a {

    /* renamed from: g */
    final EGL10 f142952g;

    /* renamed from: h */
    EGLContext f142953h;

    /* renamed from: i */
    EGLConfig f142954i;

    /* renamed from: j */
    EGLDisplay f142955j;

    /* renamed from: k */
    EGLSurface f142956k;

    /* renamed from: l */
    C30985b f142957l;

    /* renamed from: yh0.b$a */
    /* loaded from: classes7.dex */
    public static class a extends AbstractC30984a.a {

        /* renamed from: a */
        final EGLContext f142958a;

        public a(EGLContext eGLContext) {
            this.f142958a = eGLContext;
        }
    }

    public C30985b(C30985b c30985b, int[] iArr) {
        this(c30985b != null ? (a) c30985b.m150617g() : null, iArr);
        this.f142957l = c30985b;
    }

    /* renamed from: a */
    void m150611a() {
        if (this.f142955j != EGL10.EGL_NO_DISPLAY && this.f142953h != EGL10.EGL_NO_CONTEXT && this.f142954i != null) {
        } else {
            throw new RuntimeException("This object has been released");
        }
    }

    /* renamed from: b */
    public void m150612b() {
        m150614d(1, 1);
    }

    /* renamed from: c */
    EGLContext m150613c(a aVar, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eglCreateContext;
        if (aVar != null && aVar.f142958a == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, 2, 12344};
        if (aVar == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        } else {
            eGLContext = aVar.f142958a;
        }
        synchronized (AbstractC30984a.f142946a) {
            eglCreateContext = this.f142952g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
    }

    /* renamed from: d */
    public void m150614d(int i11, int i12) {
        m150611a();
        EGLSurface eGLSurface = this.f142956k;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EGLSurface eglCreatePbufferSurface = this.f142952g.eglCreatePbufferSurface(this.f142955j, this.f142954i, new int[]{12375, i11, 12374, i12, 12344});
            this.f142956k = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != eGLSurface2) {
                return;
            }
            throw new RuntimeException("Failed to create pixel buffer surface with size " + i11 + "x" + i12 + ": 0x" + Integer.toHexString(this.f142952g.eglGetError()));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    /* renamed from: e */
    public void m150615e() {
        synchronized (AbstractC30984a.f142946a) {
            try {
                EGL10 egl10 = this.f142952g;
                EGLDisplay eGLDisplay = this.f142955j;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public C30985b m150616f() {
        return this.f142957l;
    }

    /* renamed from: g */
    public AbstractC30984a.a m150617g() {
        return new a(this.f142953h);
    }

    /* renamed from: h */
    EGLConfig m150618h(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (this.f142952g.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                throw new RuntimeException("eglChooseConfig returned null");
            }
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
    }

    /* renamed from: i */
    public EGLContext m150619i() {
        return this.f142953h;
    }

    /* renamed from: j */
    EGLDisplay m150620j() {
        EGLDisplay eglGetDisplay = this.f142952g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f142952g.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            throw new RuntimeException("Unable to initialize EGL10: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
        }
        throw new RuntimeException("Unable to get EGL10 display: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
    }

    /* renamed from: k */
    public void m150621k() {
        m150611a();
        if (this.f142956k != EGL10.EGL_NO_SURFACE) {
            synchronized (AbstractC30984a.f142946a) {
                try {
                    EGL10 egl10 = this.f142952g;
                    EGLDisplay eGLDisplay = this.f142955j;
                    EGLSurface eGLSurface = this.f142956k;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f142953h)) {
                        throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.f142952g.eglGetError()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    /* renamed from: l */
    public void m150622l() {
        m150611a();
        m150623m();
        m150615e();
        this.f142952g.eglDestroyContext(this.f142955j, this.f142953h);
        this.f142952g.eglTerminate(this.f142955j);
        this.f142953h = EGL10.EGL_NO_CONTEXT;
        this.f142955j = EGL10.EGL_NO_DISPLAY;
        this.f142954i = null;
        this.f142957l = null;
    }

    /* renamed from: m */
    public void m150623m() {
        EGLSurface eGLSurface = this.f142956k;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f142952g.eglDestroySurface(this.f142955j, eGLSurface);
            this.f142956k = eGLSurface2;
        }
    }

    public C30985b(a aVar, int[] iArr) {
        this.f142956k = EGL10.EGL_NO_SURFACE;
        this.f142952g = (EGL10) EGLContext.getEGL();
        EGLDisplay m150620j = m150620j();
        this.f142955j = m150620j;
        EGLConfig m150618h = m150618h(m150620j, iArr);
        this.f142954i = m150618h;
        this.f142953h = m150613c(aVar, this.f142955j, m150618h);
    }

    public C30985b(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        this.f142956k = EGL10.EGL_NO_SURFACE;
        this.f142952g = egl10;
        this.f142955j = eGLDisplay;
        this.f142953h = eGLContext;
        this.f142954i = m150618h(eGLDisplay, AbstractC30984a.f142950e);
    }
}
