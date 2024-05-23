package com.zing.zalo.cameradecor.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import cg.AbstractC3455c;
import com.zing.zalo.cameradecor.gl.ZGLSurfaceView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import mm0.AbstractC23350e;
import xh0.C29643e0;
import xh0.C29667y;
import yh0.C30985b;

/* loaded from: classes3.dex */
public class EGLSharedSurfaceView extends ZGLSurfaceView {

    /* renamed from: E */
    static final ThreadLocal f41901E = new ThreadLocal();

    /* renamed from: C */
    C7824a f41902C;

    /* renamed from: D */
    C7825b f41903D;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.cameradecor.view.EGLSharedSurfaceView$a */
    /* loaded from: classes3.dex */
    public class C7824a implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a */
        final String f41904a;

        /* renamed from: b */
        C30985b f41905b;

        /* renamed from: c */
        AtomicBoolean f41906c;

        /* renamed from: a */
        void m39734a(String str, EGL10 egl10) {
            while (true) {
                int eglGetError = egl10.eglGetError();
                if (eglGetError != 12288) {
                    AbstractC23350e.m122774d(this.f41904a, String.format("%s: EGL error: 0x%x", str, Integer.valueOf(eglGetError)));
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public boolean m39735b() {
            AtomicBoolean atomicBoolean = this.f41906c;
            if (atomicBoolean == null) {
                AbstractC3455c.m17397a("egl-context not yet created");
                return false;
            }
            return atomicBoolean.get();
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            if (C29643e0.m147394c()) {
                this.f41905b = C29667y.m147458p().m147468B();
            }
            if (this.f41905b != null) {
                this.f41906c = new AtomicBoolean(true);
                EGLContext m150619i = this.f41905b.m150619i();
                EGLSharedSurfaceView.f41901E.set(new WeakReference(m150619i));
                return m150619i;
            }
            m39734a("Before eglCreateContext", egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            m39734a("After eglCreateContext", egl10);
            this.f41906c = new AtomicBoolean(false);
            EGLSharedSurfaceView.f41901E.set(new WeakReference(eglCreateContext));
            EGLSharedSurfaceView.this.mo39732x();
            return eglCreateContext;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            try {
                C30985b c30985b = new C30985b(egl10, eGLDisplay, eGLContext);
                c30985b.m150612b();
                c30985b.m150621k();
                EGLSharedSurfaceView.this.mo39728y();
                c30985b.m150615e();
                c30985b.m150623m();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f41906c = null;
            EGLSharedSurfaceView.f41901E.remove();
            if (this.f41905b != null) {
                C29667y.m147458p().m147476l(this.f41905b);
            } else {
                egl10.eglDestroyContext(eGLDisplay, eGLContext);
            }
        }

        private C7824a() {
            this.f41904a = C7824a.class.getSimpleName();
            this.f41906c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.cameradecor.view.EGLSharedSurfaceView$b */
    /* loaded from: classes3.dex */
    public class C7825b implements GLSurfaceView.EGLWindowSurfaceFactory {
        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
                EGLSharedSurfaceView.this.mo39733z();
                return eGLSurface;
            } catch (IllegalArgumentException e11) {
                AbstractC23350e.m122775e("EGLSharedSV", "eglCreateWindowSurface", e11);
                return eGLSurface;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            EGLSharedSurfaceView.this.mo39729A();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        private C7825b() {
        }
    }

    public EGLSharedSurfaceView(Context context) {
        super(context);
        this.f41903D = new C7825b();
        m39730v();
    }

    public static EGLContext getCurrentEGLContext() {
        WeakReference weakReference = (WeakReference) f41901E.get();
        if (weakReference != null) {
            return (EGLContext) weakReference.get();
        }
        return null;
    }

    /* renamed from: A */
    public void mo39729A() {
    }

    /* renamed from: v */
    void m39730v() {
        setEGLContextClientVersion(2);
        m39681u(8, 8, 8, 8, 0, 0);
        getHolder().setFormat(-1);
        C7824a c7824a = new C7824a();
        this.f41902C = c7824a;
        setEGLContextFactory(c7824a);
        setEGLWindowSurfaceFactory(this.f41903D);
    }

    /* renamed from: w */
    public boolean m39731w() {
        return this.f41902C.m39735b();
    }

    /* renamed from: x */
    public void mo39732x() {
    }

    /* renamed from: y */
    public void mo39728y() {
    }

    /* renamed from: z */
    public void mo39733z() {
    }

    public EGLSharedSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41903D = new C7825b();
        m39730v();
    }
}
