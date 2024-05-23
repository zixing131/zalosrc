package ff0;

import ag.InterfaceC0797q;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: ff0.b */
/* loaded from: classes5.dex */
public class C18905b implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: p */
    private EGL10 f94370p;

    /* renamed from: t */
    private SurfaceTexture f94374t;

    /* renamed from: u */
    private Surface f94375u;

    /* renamed from: w */
    private boolean f94377w;

    /* renamed from: x */
    private InterfaceC0797q f94378x;

    /* renamed from: q */
    private EGLDisplay f94371q = null;

    /* renamed from: r */
    private EGLContext f94372r = null;

    /* renamed from: s */
    private EGLSurface f94373s = null;

    /* renamed from: v */
    private final Object f94376v = new Object();

    /* renamed from: y */
    private int f94379y = 0;

    /* renamed from: z */
    private float[] f94380z = new float[16];

    public C18905b(InterfaceC0797q interfaceC0797q) {
        m99101e(interfaceC0797q);
    }

    /* renamed from: e */
    private void m99101e(InterfaceC0797q interfaceC0797q) {
        this.f94378x = interfaceC0797q;
        interfaceC0797q.mo2015s();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f94378x.mo2013l());
        this.f94374t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f94375u = new Surface(this.f94374t);
        Matrix.setIdentityM(this.f94380z, 0);
    }

    /* renamed from: a */
    public void m99102a() {
        synchronized (this.f94376v) {
            do {
                if (!this.f94377w) {
                    try {
                        this.f94376v.wait(2500L);
                    } catch (InterruptedException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    this.f94377w = false;
                }
            } while (this.f94377w);
            throw new RuntimeException("Surface frame wait timed out");
        }
        this.f94378x.mo2014p("before updateTexImage");
        this.f94374t.updateTexImage();
        this.f94374t.getTransformMatrix(this.f94380z);
    }

    /* renamed from: b */
    public void m99103b(boolean z11) {
        this.f94378x.mo2012k(this.f94374t, z11, this.f94380z);
    }

    /* renamed from: c */
    public Surface m99104c() {
        return this.f94375u;
    }

    /* renamed from: d */
    public void m99105d() {
        InterfaceC0797q interfaceC0797q = this.f94378x;
        if (interfaceC0797q != null) {
            interfaceC0797q.destroy();
        }
        EGL10 egl10 = this.f94370p;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f94372r)) {
                EGL10 egl102 = this.f94370p;
                EGLDisplay eGLDisplay = this.f94371q;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f94370p.eglDestroySurface(this.f94371q, this.f94373s);
            this.f94370p.eglDestroyContext(this.f94371q, this.f94372r);
        }
        this.f94375u.release();
        this.f94371q = null;
        this.f94372r = null;
        this.f94373s = null;
        this.f94370p = null;
        this.f94378x = null;
        this.f94375u = null;
        this.f94374t = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f94376v) {
            try {
                if (!this.f94377w) {
                    this.f94377w = true;
                    this.f94376v.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
