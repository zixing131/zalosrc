package com.zing.zalo.cameradecor.gl;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import mm0.AbstractC23350e;

/* loaded from: classes3.dex */
public class ZGLSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: A */
    public static ThreadLocal f41833A = new ThreadLocal();

    /* renamed from: B */
    static final C7820g f41834B = new C7820g();

    /* renamed from: p */
    final WeakReference f41835p;

    /* renamed from: q */
    C7819f f41836q;

    /* renamed from: r */
    GLSurfaceView.Renderer f41837r;

    /* renamed from: s */
    boolean f41838s;

    /* renamed from: t */
    GLSurfaceView.EGLConfigChooser f41839t;

    /* renamed from: u */
    GLSurfaceView.EGLContextFactory f41840u;

    /* renamed from: v */
    GLSurfaceView.EGLWindowSurfaceFactory f41841v;

    /* renamed from: w */
    GLSurfaceView.GLWrapper f41842w;

    /* renamed from: x */
    int f41843x;

    /* renamed from: y */
    int f41844y;

    /* renamed from: z */
    boolean f41845z;

    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$a */
    /* loaded from: classes3.dex */
    abstract class AbstractC7814a implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a */
        protected int[] f41846a;

        public AbstractC7814a(int[] iArr) {
            this.f41846a = m39683b(iArr);
        }

        /* renamed from: a */
        abstract EGLConfig mo39682a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* renamed from: b */
        int[] m39683b(int[] iArr) {
            int i11 = ZGLSurfaceView.this.f41844y;
            if (i11 != 2 && i11 != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i12 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            iArr2[i12] = 12352;
            if (ZGLSurfaceView.this.f41844y == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f41846a, null, 0, iArr)) {
                int i11 = iArr[0];
                if (i11 > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f41846a, eGLConfigArr, i11, iArr)) {
                        EGLConfig mo39682a = mo39682a(egl10, eGLDisplay, eGLConfigArr);
                        if (mo39682a != null) {
                            return mo39682a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$b */
    /* loaded from: classes3.dex */
    class C7815b extends AbstractC7814a {

        /* renamed from: c */
        int[] f41848c;

        /* renamed from: d */
        protected int f41849d;

        /* renamed from: e */
        protected int f41850e;

        /* renamed from: f */
        protected int f41851f;

        /* renamed from: g */
        protected int f41852g;

        /* renamed from: h */
        protected int f41853h;

        /* renamed from: i */
        protected int f41854i;

        public C7815b(int i11, int i12, int i13, int i14, int i15, int i16) {
            super(new int[]{12324, i11, 12323, i12, 12322, i13, 12321, i14, 12325, i15, 12326, i16, 12344});
            this.f41848c = new int[1];
            this.f41849d = i11;
            this.f41850e = i12;
            this.f41851f = i13;
            this.f41852g = i14;
            this.f41853h = i15;
            this.f41854i = i16;
        }

        @Override // com.zing.zalo.cameradecor.gl.ZGLSurfaceView.AbstractC7814a
        /* renamed from: a */
        public EGLConfig mo39682a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int m39684c = m39684c(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int m39684c2 = m39684c(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (m39684c >= this.f41853h && m39684c2 >= this.f41854i) {
                    int m39684c3 = m39684c(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int m39684c4 = m39684c(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int m39684c5 = m39684c(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int m39684c6 = m39684c(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (m39684c3 == this.f41849d && m39684c4 == this.f41850e && m39684c5 == this.f41851f && m39684c6 == this.f41852g) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: c */
        int m39684c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, this.f41848c)) {
                return this.f41848c[0];
            }
            return i12;
        }
    }

    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$c */
    /* loaded from: classes3.dex */
    class C7816c implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a */
        int f41856a = 12440;

        C7816c() {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int i11 = this.f41856a;
            int i12 = ZGLSurfaceView.this.f41844y;
            int[] iArr = {i11, i12, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (i12 == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                AbstractC23350e.m122774d("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                C7818e.m39687k("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$d */
    /* loaded from: classes3.dex */
    static class C7817d implements GLSurfaceView.EGLWindowSurfaceFactory {
        C7817d() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e11) {
                AbstractC23350e.m122775e("GLSurfaceView", "eglCreateWindowSurface", e11);
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$e */
    /* loaded from: classes3.dex */
    public static class C7818e {

        /* renamed from: a */
        WeakReference f41858a;

        /* renamed from: b */
        EGL10 f41859b;

        /* renamed from: c */
        EGLDisplay f41860c;

        /* renamed from: d */
        EGLSurface f41861d;

        /* renamed from: e */
        EGLConfig f41862e;

        /* renamed from: f */
        EGLContext f41863f;

        public C7818e(WeakReference weakReference) {
            this.f41858a = weakReference;
        }

        /* renamed from: f */
        public static String m39685f(String str, int i11) {
            return str + " failed: " + AbstractC7823a.m39721a(i11);
        }

        /* renamed from: g */
        public static void m39686g(String str, String str2, int i11) {
            m39685f(str2, i11);
        }

        /* renamed from: k */
        public static void m39687k(String str, int i11) {
            throw new RuntimeException(m39685f(str, i11));
        }

        /* renamed from: a */
        GL m39688a() {
            int i11;
            C7821h c7821h;
            GL gl2 = this.f41863f.getGL();
            ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41858a.get();
            if (zGLSurfaceView != null) {
                GLSurfaceView.GLWrapper gLWrapper = zGLSurfaceView.f41842w;
                if (gLWrapper != null) {
                    gl2 = gLWrapper.wrap(gl2);
                }
                int i12 = zGLSurfaceView.f41843x;
                if ((i12 & 3) != 0) {
                    if ((i12 & 1) != 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if ((i12 & 2) != 0) {
                        c7821h = new C7821h();
                    } else {
                        c7821h = null;
                    }
                    return GLDebugHelper.wrap(gl2, i11, c7821h);
                }
                return gl2;
            }
            return gl2;
        }

        /* renamed from: b */
        public boolean m39689b() {
            if (this.f41859b != null) {
                if (this.f41860c != null) {
                    if (this.f41862e != null) {
                        m39691d();
                        ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41858a.get();
                        if (zGLSurfaceView != null) {
                            this.f41861d = zGLSurfaceView.f41841v.createWindowSurface(this.f41859b, this.f41860c, this.f41862e, zGLSurfaceView.getHolder());
                        } else {
                            this.f41861d = null;
                        }
                        EGLSurface eGLSurface = this.f41861d;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f41859b.eglMakeCurrent(this.f41860c, eGLSurface, eGLSurface, this.f41863f)) {
                                m39686g("EGLHelper", "eglMakeCurrent", this.f41859b.eglGetError());
                                return false;
                            }
                            return true;
                        }
                        if (this.f41859b.eglGetError() == 12299) {
                            AbstractC23350e.m122774d("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                        }
                        return false;
                    }
                    throw new RuntimeException("mEglConfig not initialized");
                }
                throw new RuntimeException("eglDisplay not initialized");
            }
            throw new RuntimeException("egl not initialized");
        }

        /* renamed from: c */
        public void m39690c() {
            m39691d();
        }

        /* renamed from: d */
        void m39691d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f41861d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41858a.get();
                if (zGLSurfaceView != null) {
                    zGLSurfaceView.f41841v.destroySurface(this.f41859b, this.f41860c, this.f41861d);
                }
                this.f41859b.eglMakeCurrent(this.f41860c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.f41861d = null;
            }
        }

        /* renamed from: e */
        public void m39692e() {
            if (this.f41863f != null) {
                ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41858a.get();
                if (zGLSurfaceView != null) {
                    zGLSurfaceView.f41840u.destroyContext(this.f41859b, this.f41860c, this.f41863f);
                }
                this.f41863f = null;
            }
            EGLDisplay eGLDisplay = this.f41860c;
            if (eGLDisplay != null) {
                this.f41859b.eglTerminate(eGLDisplay);
                this.f41860c = null;
            }
        }

        /* renamed from: h */
        public void m39693h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f41859b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f41860c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f41859b.eglInitialize(eglGetDisplay, new int[2])) {
                    ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41858a.get();
                    if (zGLSurfaceView == null) {
                        this.f41862e = null;
                        this.f41863f = null;
                    } else {
                        EGLConfig chooseConfig = zGLSurfaceView.f41839t.chooseConfig(this.f41859b, this.f41860c);
                        this.f41862e = chooseConfig;
                        this.f41863f = zGLSurfaceView.f41840u.createContext(this.f41859b, this.f41860c, chooseConfig);
                    }
                    EGLContext eGLContext = this.f41863f;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.f41863f = null;
                        m39695j("createContext");
                    }
                    this.f41861d = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        /* renamed from: i */
        public int m39694i() {
            if (!this.f41859b.eglSwapBuffers(this.f41860c, this.f41861d)) {
                return this.f41859b.eglGetError();
            }
            return 12288;
        }

        /* renamed from: j */
        void m39695j(String str) {
            m39687k(str, this.f41859b.eglGetError());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$f */
    /* loaded from: classes3.dex */
    public static class C7819f extends Thread {

        /* renamed from: F */
        boolean f41869F;

        /* renamed from: I */
        C7818e f41872I;

        /* renamed from: J */
        WeakReference f41873J;

        /* renamed from: p */
        boolean f41874p;

        /* renamed from: q */
        boolean f41875q;

        /* renamed from: r */
        boolean f41876r;

        /* renamed from: s */
        boolean f41877s;

        /* renamed from: t */
        boolean f41878t;

        /* renamed from: u */
        boolean f41879u;

        /* renamed from: v */
        boolean f41880v;

        /* renamed from: w */
        boolean f41881w;

        /* renamed from: x */
        boolean f41882x;

        /* renamed from: y */
        boolean f41883y;

        /* renamed from: z */
        boolean f41884z;

        /* renamed from: G */
        ArrayList f41870G = new ArrayList();

        /* renamed from: H */
        boolean f41871H = true;

        /* renamed from: A */
        int f41864A = 0;

        /* renamed from: B */
        int f41865B = 0;

        /* renamed from: D */
        boolean f41867D = true;

        /* renamed from: C */
        int f41866C = 1;

        /* renamed from: E */
        boolean f41868E = false;

        C7819f(WeakReference weakReference) {
            this.f41873J = weakReference;
        }

        /* renamed from: a */
        public boolean m39696a() {
            if (this.f41881w && this.f41882x && m39703h()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public int m39697b() {
            int i11;
            synchronized (ZGLSurfaceView.f41834B) {
                i11 = this.f41866C;
            }
            return i11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x018d, code lost:            r2 = (com.zing.zalo.cameradecor.gl.ZGLSurfaceView) r16.f41873J.get();     */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:            if (r2 == null) goto L128;     */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:            r2.f41837r.onSurfaceCreated(r6, r16.f41872I.f41862e);     */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:            r7 = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x01a1, code lost:            if (r10 == false) goto L134;     */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x01a3, code lost:            r2 = (com.zing.zalo.cameradecor.gl.ZGLSurfaceView) r16.f41873J.get();     */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x01ab, code lost:            if (r2 == null) goto L133;     */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x01ad, code lost:            r2.f41837r.onSurfaceChanged(r6, r11, r12);     */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x01b2, code lost:            r10 = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x01b3, code lost:            r2 = (com.zing.zalo.cameradecor.gl.ZGLSurfaceView) r16.f41873J.get();     */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x01bb, code lost:            if (r2 == null) goto L137;     */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x01bd, code lost:            com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41833A.set(java.lang.Boolean.TRUE);        r2.f41837r.onDrawFrame(r6);     */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x01d7, code lost:            if (((java.lang.Boolean) com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41833A.get()).booleanValue() == false) goto L140;     */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x01d9, code lost:            r0 = r16.f41872I.m39694i();     */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x01e2, code lost:            if (r0 == 12288) goto L154;     */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x01e6, code lost:            if (r0 == 12302) goto L153;     */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x01e8, code lost:            com.zing.zalo.cameradecor.gl.ZGLSurfaceView.C7818e.m39686g("GLThread", "eglSwapBuffers", r0);        r2 = com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41834B;     */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x01f1, code lost:            monitor-enter(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x01f3, code lost:            r16.f41879u = true;        r2.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x01f8, code lost:            monitor-exit(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0201, code lost:            if (r14 == false) goto L157;     */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0203, code lost:            r4 = true;        r14 = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x01fd, code lost:            r3 = true;     */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x01e0, code lost:            r0 = 12288;     */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0169, code lost:            r2 = com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41834B;     */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x016b, code lost:            monitor-enter(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x016d, code lost:            r16.f41883y = true;        r16.f41879u = true;        r2.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x0174, code lost:            monitor-exit(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x0146, code lost:            r13.run();        r13 = null;     */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:            if (com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41834B.m39716d() != false) goto L48;     */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:            if (r13 == null) goto L190;     */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:            if (r8 == false) goto L192;     */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0158, code lost:            if (r16.f41872I.m39689b() == false) goto L194;     */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x015a, code lost:            r2 = com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41834B;     */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:            monitor-enter(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:            r16.f41883y = true;        r2.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0163, code lost:            monitor-exit(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:            r8 = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x017a, code lost:            if (r9 == false) goto L124;     */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:            r2 = (javax.microedition.khronos.opengles.GL10) r16.f41872I.m39688a();        com.zing.zalo.cameradecor.gl.ZGLSurfaceView.f41834B.m39713a(r2);        r6 = r2;        r9 = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:            if (r7 == false) goto L129;     */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void m39698c() {
            boolean z11;
            this.f41872I = new C7818e(this.f41873J);
            this.f41881w = false;
            this.f41882x = false;
            this.f41868E = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            GL10 gl10 = null;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int i11 = 0;
            int i12 = 0;
            Runnable runnable = null;
            boolean z19 = false;
            loop0: while (true) {
                try {
                    synchronized (ZGLSurfaceView.f41834B) {
                        while (!this.f41874p) {
                            if (!this.f41870G.isEmpty()) {
                                runnable = (Runnable) this.f41870G.remove(0);
                            } else {
                                boolean z21 = this.f41877s;
                                boolean z22 = this.f41876r;
                                if (z21 != z22) {
                                    this.f41877s = z22;
                                    ZGLSurfaceView.f41834B.notifyAll();
                                } else {
                                    z22 = false;
                                }
                                if (this.f41884z) {
                                    m39710o();
                                    m39709n();
                                    this.f41884z = false;
                                    z14 = true;
                                }
                                if (z12) {
                                    m39710o();
                                    m39709n();
                                    z12 = false;
                                }
                                if (z22 && this.f41882x) {
                                    m39710o();
                                }
                                if (z22) {
                                    if (this.f41881w) {
                                        ZGLSurfaceView zGLSurfaceView = (ZGLSurfaceView) this.f41873J.get();
                                        if (zGLSurfaceView != null) {
                                            if (zGLSurfaceView.f41845z) {
                                            }
                                        }
                                        m39709n();
                                    }
                                }
                                if (z22 && ZGLSurfaceView.f41834B.m39717e()) {
                                    this.f41872I.m39692e();
                                }
                                if (!this.f41878t && !this.f41880v) {
                                    if (this.f41882x) {
                                        m39710o();
                                    }
                                    this.f41880v = true;
                                    this.f41879u = false;
                                    ZGLSurfaceView.f41834B.notifyAll();
                                }
                                if (this.f41878t && this.f41880v) {
                                    this.f41880v = false;
                                    ZGLSurfaceView.f41834B.notifyAll();
                                }
                                if (z13) {
                                    this.f41868E = false;
                                    this.f41869F = true;
                                    ZGLSurfaceView.f41834B.notifyAll();
                                    z13 = false;
                                }
                                if (m39703h()) {
                                    if (!this.f41881w) {
                                        if (z14) {
                                            z14 = false;
                                        } else {
                                            C7820g c7820g = ZGLSurfaceView.f41834B;
                                            if (c7820g.m39719g(this)) {
                                                try {
                                                    this.f41872I.m39693h();
                                                    this.f41881w = true;
                                                    c7820g.notifyAll();
                                                    z15 = true;
                                                } catch (RuntimeException e11) {
                                                    ZGLSurfaceView.f41834B.m39715c(this);
                                                    throw e11;
                                                }
                                            }
                                        }
                                    }
                                    if (this.f41881w && !this.f41882x) {
                                        this.f41882x = true;
                                        z16 = true;
                                        z17 = true;
                                        z18 = true;
                                    }
                                    if (this.f41882x) {
                                        if (this.f41871H) {
                                            i11 = this.f41864A;
                                            i12 = this.f41865B;
                                            this.f41868E = true;
                                            this.f41871H = false;
                                            z11 = false;
                                            z16 = true;
                                            z18 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        this.f41867D = z11;
                                        ZGLSurfaceView.f41834B.notifyAll();
                                        if (this.f41868E) {
                                            z19 = true;
                                        }
                                    }
                                }
                                ZGLSurfaceView.f41834B.wait();
                            }
                        }
                        break loop0;
                    }
                } catch (Throwable th2) {
                    synchronized (ZGLSurfaceView.f41834B) {
                        try {
                            m39710o();
                            m39709n();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        throw th2;
                    }
                }
            }
            synchronized (ZGLSurfaceView.f41834B) {
                try {
                    m39710o();
                    m39709n();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }

        /* renamed from: d */
        public void m39699d() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41876r = true;
                c7820g.notifyAll();
                while (!this.f41875q && !this.f41877s) {
                    try {
                        ZGLSurfaceView.f41834B.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: e */
        public void m39700e() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41876r = false;
                this.f41867D = true;
                this.f41869F = false;
                c7820g.notifyAll();
                while (!this.f41875q && this.f41877s && !this.f41869F) {
                    try {
                        ZGLSurfaceView.f41834B.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: f */
        public void m39701f(int i11, int i12) {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                try {
                    this.f41864A = i11;
                    this.f41865B = i12;
                    this.f41871H = true;
                    this.f41867D = true;
                    this.f41869F = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    c7820g.notifyAll();
                    while (!this.f41875q && !this.f41877s && !this.f41869F && m39696a()) {
                        try {
                            ZGLSurfaceView.f41834B.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: g */
        public void m39702g(Runnable runnable) {
            if (runnable != null) {
                C7820g c7820g = ZGLSurfaceView.f41834B;
                synchronized (c7820g) {
                    this.f41870G.add(runnable);
                    c7820g.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        /* renamed from: h */
        boolean m39703h() {
            return !this.f41877s && this.f41878t && !this.f41879u && this.f41864A > 0 && this.f41865B > 0 && (this.f41867D || this.f41866C == 1);
        }

        /* renamed from: i */
        public void m39704i() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41874p = true;
                c7820g.notifyAll();
                while (!this.f41875q) {
                    try {
                        ZGLSurfaceView.f41834B.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: j */
        public void m39705j() {
            this.f41884z = true;
            ZGLSurfaceView.f41834B.notifyAll();
        }

        /* renamed from: k */
        public void m39706k() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41867D = true;
                c7820g.notifyAll();
            }
        }

        /* renamed from: l */
        public void m39707l() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                try {
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    this.f41868E = true;
                    this.f41867D = true;
                    this.f41869F = false;
                    c7820g.notifyAll();
                    while (!this.f41875q && !this.f41877s && !this.f41869F && m39696a()) {
                        try {
                            ZGLSurfaceView.f41834B.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: m */
        public void m39708m(int i11) {
            if (i11 >= 0 && i11 <= 1) {
                C7820g c7820g = ZGLSurfaceView.f41834B;
                synchronized (c7820g) {
                    this.f41866C = i11;
                    c7820g.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        /* renamed from: n */
        void m39709n() {
            if (this.f41881w) {
                this.f41872I.m39692e();
                this.f41881w = false;
                ZGLSurfaceView.f41834B.m39715c(this);
            }
        }

        /* renamed from: o */
        void m39710o() {
            if (this.f41882x) {
                this.f41882x = false;
                this.f41872I.m39690c();
            }
        }

        /* renamed from: p */
        public void m39711p() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41878t = true;
                this.f41883y = false;
                c7820g.notifyAll();
                while (this.f41880v && !this.f41883y && !this.f41875q) {
                    try {
                        ZGLSurfaceView.f41834B.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: q */
        public void m39712q() {
            C7820g c7820g = ZGLSurfaceView.f41834B;
            synchronized (c7820g) {
                this.f41878t = false;
                c7820g.notifyAll();
                while (!this.f41880v && !this.f41875q) {
                    try {
                        ZGLSurfaceView.f41834B.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("Z:GLThread " + getId());
            try {
                m39698c();
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                ZGLSurfaceView.f41834B.m39718f(this);
                throw th2;
            }
            ZGLSurfaceView.f41834B.m39718f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$g */
    /* loaded from: classes3.dex */
    public static class C7820g {

        /* renamed from: a */
        boolean f41885a;

        /* renamed from: b */
        int f41886b;

        /* renamed from: c */
        boolean f41887c;

        /* renamed from: d */
        boolean f41888d;

        /* renamed from: e */
        boolean f41889e;

        /* renamed from: f */
        C7819f f41890f;

        C7820g() {
        }

        /* renamed from: a */
        public synchronized void m39713a(GL10 gl10) {
            try {
                if (!this.f41887c) {
                    m39714b();
                    String glGetString = gl10.glGetString(7937);
                    if (this.f41886b < 131072) {
                        this.f41888d = !glGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f41889e = !this.f41888d;
                    this.f41887c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        void m39714b() {
            if (this.f41885a) {
                return;
            }
            this.f41886b = 131072;
            this.f41888d = true;
            this.f41885a = true;
        }

        /* renamed from: c */
        public void m39715c(C7819f c7819f) {
            if (this.f41890f == c7819f) {
                this.f41890f = null;
            }
            notifyAll();
        }

        /* renamed from: d */
        public synchronized boolean m39716d() {
            return this.f41889e;
        }

        /* renamed from: e */
        public synchronized boolean m39717e() {
            m39714b();
            return !this.f41888d;
        }

        /* renamed from: f */
        public synchronized void m39718f(C7819f c7819f) {
            try {
                c7819f.f41875q = true;
                if (this.f41890f == c7819f) {
                    this.f41890f = null;
                }
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: g */
        public boolean m39719g(C7819f c7819f) {
            C7819f c7819f2 = this.f41890f;
            if (c7819f2 != c7819f && c7819f2 != null) {
                m39714b();
                if (this.f41888d) {
                    return true;
                }
                C7819f c7819f3 = this.f41890f;
                if (c7819f3 != null) {
                    c7819f3.m39705j();
                    return false;
                }
                return false;
            }
            this.f41890f = c7819f;
            notifyAll();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$h */
    /* loaded from: classes3.dex */
    public static class C7821h extends Writer {

        /* renamed from: p */
        StringBuilder f41891p = new StringBuilder();

        C7821h() {
        }

        /* renamed from: a */
        void m39720a() {
            if (this.f41891p.length() > 0) {
                this.f41891p.toString();
                StringBuilder sb2 = this.f41891p;
                sb2.delete(0, sb2.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m39720a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m39720a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                char c11 = cArr[i11 + i13];
                if (c11 == '\n') {
                    m39720a();
                } else {
                    this.f41891p.append(c11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.cameradecor.gl.ZGLSurfaceView$i */
    /* loaded from: classes3.dex */
    class C7822i extends C7815b {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C7822i(boolean z11) {
            super(8, 8, 8, 0, r6, 0);
            int i11;
            if (z11) {
                i11 = 16;
            } else {
                i11 = 0;
            }
        }
    }

    public ZGLSurfaceView(Context context) {
        super(context);
        this.f41835p = new WeakReference(this);
        m39676n();
    }

    protected void finalize() {
        try {
            C7819f c7819f = this.f41836q;
            if (c7819f != null) {
                c7819f.m39704i();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f41843x;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f41845z;
    }

    public int getRenderMode() {
        return this.f41836q.m39697b();
    }

    /* renamed from: m */
    void m39675m() {
        if (this.f41836q == null) {
        } else {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: n */
    void m39676n() {
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        int i11;
        super.onAttachedToWindow();
        if (this.f41838s && this.f41837r != null) {
            C7819f c7819f = this.f41836q;
            if (c7819f != null) {
                i11 = c7819f.m39697b();
            } else {
                i11 = 1;
            }
            C7819f c7819f2 = new C7819f(this.f41835p);
            this.f41836q = c7819f2;
            if (i11 != 1) {
                c7819f2.m39708m(i11);
            }
            this.f41836q.start();
        }
        this.f41838s = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        C7819f c7819f = this.f41836q;
        if (c7819f != null) {
            c7819f.m39704i();
        }
        this.f41838s = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public void m39677p() {
        this.f41836q.m39699d();
    }

    /* renamed from: q */
    public void mo39678q() {
        this.f41836q.m39700e();
    }

    /* renamed from: r */
    public void m39679r(Runnable runnable) {
        this.f41836q.m39702g(runnable);
    }

    /* renamed from: s */
    public void mo39680s() {
        this.f41836q.m39706k();
    }

    public void setDebugFlags(int i11) {
        this.f41843x = i11;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        m39675m();
        this.f41839t = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i11) {
        m39675m();
        this.f41844y = i11;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        m39675m();
        this.f41840u = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        m39675m();
        this.f41841v = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f41842w = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z11) {
        this.f41845z = z11;
    }

    public void setRenderMode(int i11) {
        this.f41836q.m39708m(i11);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m39675m();
        if (this.f41839t == null) {
            this.f41839t = new C7822i(true);
        }
        if (this.f41840u == null) {
            this.f41840u = new C7816c();
        }
        if (this.f41841v == null) {
            this.f41841v = new C7817d();
        }
        this.f41837r = renderer;
        C7819f c7819f = new C7819f(this.f41835p);
        this.f41836q = c7819f;
        c7819f.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        this.f41836q.m39701f(i12, i13);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f41836q.m39711p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f41836q.m39712q();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        C7819f c7819f = this.f41836q;
        if (c7819f != null) {
            c7819f.m39707l();
        }
    }

    /* renamed from: u */
    public void m39681u(int i11, int i12, int i13, int i14, int i15, int i16) {
        setEGLConfigChooser(new C7815b(i11, i12, i13, i14, i15, i16));
    }

    public void setEGLConfigChooser(boolean z11) {
        setEGLConfigChooser(new C7822i(z11));
    }

    public ZGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41835p = new WeakReference(this);
        m39676n();
    }
}
