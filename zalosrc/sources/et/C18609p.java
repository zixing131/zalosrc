package et;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import et.InterfaceC18608o;
import ho0.AbstractC20110a;
import java.nio.IntBuffer;
import mm0.AbstractC23350e;
import p276jt.AbstractC21351f;
import p276jt.C21361p;

/* renamed from: et.p */
/* loaded from: classes4.dex */
public class C18609p implements InterfaceC18608o {

    /* renamed from: l */
    static final String f93559l = "p";

    /* renamed from: a */
    private AbstractC21351f f93560a;

    /* renamed from: b */
    private Bitmap f93561b;

    /* renamed from: c */
    private b f93562c;

    /* renamed from: d */
    private EGLContext f93563d;

    /* renamed from: f */
    private int f93565f;

    /* renamed from: g */
    private int f93566g;

    /* renamed from: k */
    private InterfaceC18608o.a f93570k;

    /* renamed from: e */
    private boolean f93564e = false;

    /* renamed from: h */
    private float[] f93567h = new float[16];

    /* renamed from: i */
    private float[] f93568i = new float[16];

    /* renamed from: j */
    private float[] f93569j = new float[16];

    /* renamed from: et.p$a */
    /* loaded from: classes4.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C18609p.this.m98336f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: et.p$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        EGLDisplay f93572a = EGL14.EGL_NO_DISPLAY;

        /* renamed from: b */
        EGLContext f93573b = EGL14.EGL_NO_CONTEXT;

        /* renamed from: c */
        EGLSurface f93574c = EGL14.EGL_NO_SURFACE;

        /* renamed from: d */
        IntBuffer f93575d;

        /* renamed from: e */
        int f93576e;

        /* renamed from: f */
        int f93577f;

        public b(int i11, int i12, EGLContext eGLContext) {
            this.f93576e = i11;
            this.f93577f = i12;
            m98338b(eGLContext);
        }

        /* renamed from: a */
        void m98337a(String str) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                return;
            }
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }

        /* renamed from: b */
        void m98338b(EGLContext eGLContext) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f93572a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    EGL14.eglChooseConfig(this.f93572a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                    m98337a("eglCreateContext RGB888+recordable ES2");
                    this.f93573b = EGL14.eglCreateContext(this.f93572a, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
                    m98337a("eglCreateContext");
                    this.f93574c = EGL14.eglCreatePbufferSurface(this.f93572a, eGLConfigArr[0], new int[]{12375, this.f93576e, 12374, this.f93577f, 12344}, 0);
                    m98337a("eglCreateWindowSurface");
                    return;
                }
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }

        /* renamed from: c */
        public IntBuffer m98339c() {
            IntBuffer intBuffer = this.f93575d;
            if (intBuffer == null || intBuffer.capacity() != this.f93576e * this.f93577f) {
                this.f93575d = IntBuffer.allocate(this.f93576e * this.f93577f);
            }
            this.f93575d.rewind();
            GLES20.glReadPixels(0, 0, this.f93576e, this.f93577f, 6408, 5121, this.f93575d);
            return this.f93575d;
        }

        /* renamed from: d */
        public void m98340d() {
            EGLDisplay eGLDisplay = this.f93572a;
            EGLSurface eGLSurface = this.f93574c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f93573b);
            m98337a("eglMakeCurrent");
        }

        /* renamed from: e */
        public void m98341e() {
            EGLDisplay eGLDisplay = this.f93572a;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(this.f93572a, this.f93574c);
                EGL14.eglDestroyContext(this.f93572a, this.f93573b);
                EGL14.eglTerminate(this.f93572a);
            }
            this.f93572a = EGL14.EGL_NO_DISPLAY;
            this.f93573b = EGL14.EGL_NO_CONTEXT;
            this.f93574c = EGL14.EGL_NO_SURFACE;
        }
    }

    public C18609p(int i11, int i12, EGLContext eGLContext, Bitmap bitmap) {
        this.f93561b = bitmap;
        this.f93565f = i11;
        this.f93566g = i12;
        this.f93563d = eGLContext;
    }

    @Override // et.InterfaceC18608o
    /* renamed from: a */
    public void mo98328a(InterfaceC18608o.a aVar) {
        this.f93570k = aVar;
    }

    @Override // et.InterfaceC18608o
    /* renamed from: b */
    public void mo98329b() {
        if (this.f93564e) {
            return;
        }
        this.f93564e = true;
        new a("Z:VideoEncoder").start();
    }

    /* renamed from: c */
    Bitmap m98333c(Bitmap bitmap) {
        IntBuffer m98339c = this.f93562c.m98339c();
        if (bitmap == null || !bitmap.isMutable() || bitmap.getWidth() != this.f93565f || bitmap.getHeight() != this.f93566g) {
            bitmap = Bitmap.createBitmap(this.f93565f, this.f93566g, Bitmap.Config.ARGB_8888);
        }
        if (m98339c == null) {
            return bitmap;
        }
        int[] iArr = new int[this.f93565f];
        int[] array = m98339c.array();
        for (int i11 = 0; i11 < this.f93566g / 2; i11++) {
            int i12 = this.f93565f;
            System.arraycopy(array, i11 * i12, iArr, 0, i12);
            int i13 = (this.f93566g - i11) - 1;
            int i14 = this.f93565f;
            System.arraycopy(array, i13 * i14, array, i11 * i14, i14);
            int i15 = (this.f93566g - i11) - 1;
            int i16 = this.f93565f;
            System.arraycopy(iArr, 0, array, i15 * i16, i16);
        }
        bitmap.copyPixelsFromBuffer(m98339c);
        m98339c.rewind();
        return bitmap;
    }

    /* renamed from: d */
    public void m98334d() {
        GLES20.glViewport(0, 0, this.f93565f, this.f93566g);
        InterfaceC18608o.a aVar = this.f93570k;
        if (aVar != null) {
            aVar.mo98331b(this.f93569j);
        }
        AbstractC21351f abstractC21351f = this.f93560a;
        if (abstractC21351f != null) {
            abstractC21351f.m110603b0(this.f93569j, null);
        }
    }

    /* renamed from: e */
    public void m98335e(int i11, int i12) {
        float f11 = i11;
        Matrix.orthoM(this.f93567h, 0, 0.0f, f11, 0.0f, i12, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f93568i, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f93569j, 0, this.f93567h, 0, this.f93568i, 0);
        Bitmap bitmap = this.f93561b;
        if (bitmap != null && bitmap.getWidth() > 0) {
            try {
                this.f93560a = new C21361p(i11 / 2, i12 / 2, f11 / this.f93561b.getWidth(), this.f93561b);
                return;
            } catch (RuntimeException e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        AbstractC23350e.m122774d(f93559l, "onSurfaceCreated: Overlay bitmap is null!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:            if (r1 == null) goto L14;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m98336f() {
        try {
            try {
                b bVar = new b(this.f93565f, this.f93566g, this.f93563d);
                this.f93562c = bVar;
                bVar.m98340d();
                m98335e(this.f93565f, this.f93566g);
                m98334d();
                InterfaceC18608o.a aVar = this.f93570k;
                if (aVar != null) {
                    aVar.mo98330a(m98333c(aVar.mo98332c()));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                InterfaceC18608o.a aVar2 = this.f93570k;
                if (aVar2 != null) {
                    aVar2.mo98330a(null);
                }
                b bVar2 = this.f93562c;
            }
        } finally {
            b bVar3 = this.f93562c;
            if (bVar3 != null) {
                bVar3.m98341e();
            }
            this.f93564e = false;
        }
    }
}
