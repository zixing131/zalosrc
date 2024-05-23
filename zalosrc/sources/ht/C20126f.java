package ht;

import android.graphics.Bitmap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import mm0.AbstractC23350e;
import p575vf.C28000c;

/* renamed from: ht.f */
/* loaded from: classes4.dex */
public class C20126f {

    /* renamed from: a */
    private C20124d f99243a;

    /* renamed from: b */
    private int f99244b;

    /* renamed from: c */
    private int f99245c;

    /* renamed from: d */
    private EGL10 f99246d;

    /* renamed from: e */
    private EGLDisplay f99247e;

    /* renamed from: f */
    private EGLConfig[] f99248f;

    /* renamed from: g */
    private EGLConfig f99249g;

    /* renamed from: h */
    private EGLContext f99250h;

    /* renamed from: i */
    private EGLSurface f99251i;

    /* renamed from: j */
    private GL10 f99252j;

    /* renamed from: k */
    private String f99253k;

    public C20126f(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PixelBuffer(");
        sb2.append(i11);
        sb2.append(",");
        sb2.append(i12);
        sb2.append(")");
        this.f99244b = i11;
        this.f99245c = i12;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f99246d = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f99247e = eglGetDisplay;
        this.f99246d.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig m104744a = m104744a();
        this.f99249g = m104744a;
        this.f99250h = this.f99246d.eglCreateContext(this.f99247e, m104744a, EGL10.EGL_NO_CONTEXT, m104745d());
        EGLSurface eglCreatePbufferSurface = this.f99246d.eglCreatePbufferSurface(this.f99247e, this.f99249g, m104746e());
        this.f99251i = eglCreatePbufferSurface;
        this.f99246d.eglMakeCurrent(this.f99247e, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f99250h);
        this.f99252j = (GL10) this.f99250h.getGL();
        this.f99253k = Thread.currentThread().getName();
    }

    /* renamed from: a */
    private EGLConfig m104744a() {
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        this.f99246d.eglChooseConfig(this.f99247e, iArr, null, 0, iArr2);
        int i11 = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i11];
        this.f99248f = eGLConfigArr;
        this.f99246d.eglChooseConfig(this.f99247e, iArr, eGLConfigArr, i11, iArr2);
        return this.f99248f[0];
    }

    /* renamed from: d */
    private int[] m104745d() {
        return new int[]{12440, 2, 12344};
    }

    /* renamed from: e */
    private int[] m104746e() {
        return new int[]{12375, this.f99244b, 12374, this.f99245c, 12344};
    }

    /* renamed from: b */
    public void m104747b() {
        this.f99243a.onDrawFrame(this.f99252j);
        this.f99243a.onDrawFrame(this.f99252j);
        EGL10 egl10 = this.f99246d;
        EGLDisplay eGLDisplay = this.f99247e;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f99246d.eglDestroySurface(this.f99247e, this.f99251i);
        this.f99246d.eglDestroyContext(this.f99247e, this.f99250h);
        this.f99246d.eglTerminate(this.f99247e);
        C28000c.m141116b().m141117a();
    }

    /* renamed from: c */
    public Bitmap m104748c() {
        if (this.f99243a == null) {
            AbstractC23350e.m122774d("PixelBuffer", "getBitmap(): Renderer was not set.");
            return null;
        }
        if (!Thread.currentThread().getName().equals(this.f99253k)) {
            AbstractC23350e.m122774d("PixelBuffer", "getBitmap(): This thread does not own the OpenGL context.");
            return null;
        }
        this.f99243a.onDrawFrame(this.f99252j);
        this.f99243a.onDrawFrame(this.f99252j);
        return this.f99243a.m104737l();
    }

    /* renamed from: f */
    public void m104749f(C20124d c20124d) {
        this.f99243a = c20124d;
        if (!Thread.currentThread().getName().equals(this.f99253k)) {
            AbstractC23350e.m122774d("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
        } else {
            this.f99243a.onSurfaceCreated(this.f99252j, this.f99249g);
            this.f99243a.onSurfaceChanged(this.f99252j, this.f99244b, this.f99245c);
        }
    }
}
