package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes2.dex */
public final class dn0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, bn0 {

    /* renamed from: Q */
    private static final float[] f19339Q = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private int f19340A;

    /* renamed from: B */
    private int f19341B;

    /* renamed from: C */
    private SurfaceTexture f19342C;

    /* renamed from: D */
    private SurfaceTexture f19343D;

    /* renamed from: E */
    private int f19344E;

    /* renamed from: F */
    private int f19345F;

    /* renamed from: G */
    private int f19346G;

    /* renamed from: H */
    private final FloatBuffer f19347H;

    /* renamed from: I */
    private final CountDownLatch f19348I;

    /* renamed from: J */
    private final Object f19349J;

    /* renamed from: K */
    private EGL10 f19350K;

    /* renamed from: L */
    private EGLDisplay f19351L;

    /* renamed from: M */
    private EGLContext f19352M;

    /* renamed from: N */
    private EGLSurface f19353N;

    /* renamed from: O */
    private volatile boolean f19354O;

    /* renamed from: P */
    private volatile boolean f19355P;

    /* renamed from: p */
    private final cn0 f19356p;

    /* renamed from: q */
    private final float[] f19357q;

    /* renamed from: r */
    private final float[] f19358r;

    /* renamed from: s */
    private final float[] f19359s;

    /* renamed from: t */
    private final float[] f19360t;

    /* renamed from: u */
    private final float[] f19361u;

    /* renamed from: v */
    private final float[] f19362v;

    /* renamed from: w */
    private final float[] f19363w;

    /* renamed from: x */
    private float f19364x;

    /* renamed from: y */
    private float f19365y;

    /* renamed from: z */
    private float f19366z;

    public dn0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f19339Q;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f19347H = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f19357q = new float[9];
        this.f19358r = new float[9];
        this.f19359s = new float[9];
        this.f19360t = new float[9];
        this.f19361u = new float[9];
        this.f19362v = new float[9];
        this.f19363w = new float[9];
        this.f19364x = Float.NaN;
        cn0 cn0Var = new cn0(context);
        this.f19356p = cn0Var;
        cn0Var.m20956a(this);
        this.f19348I = new CountDownLatch(1);
        this.f19349J = new Object();
    }

    /* renamed from: g */
    private static final void m21495g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(glGetError);
        }
    }

    /* renamed from: h */
    private static final void m21496h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f11 = fArr2[0] * fArr3[0];
        float f12 = fArr2[1];
        float f13 = fArr3[3];
        float f14 = fArr2[2];
        float f15 = fArr3[6];
        fArr[0] = f11 + (f12 * f13) + (f14 * f15);
        float f16 = fArr2[0];
        float f17 = fArr3[1] * f16;
        float f18 = fArr3[4];
        float f19 = fArr3[7];
        fArr[1] = f17 + (f12 * f18) + (f14 * f19);
        float f21 = f16 * fArr3[2];
        float f22 = fArr2[1];
        float f23 = fArr3[5];
        float f24 = fArr3[8];
        fArr[2] = f21 + (f22 * f23) + (f14 * f24);
        float f25 = fArr2[3];
        float f26 = fArr3[0];
        float f27 = fArr2[4];
        float f28 = (f25 * f26) + (f13 * f27);
        float f29 = fArr2[5];
        fArr[3] = f28 + (f29 * f15);
        float f31 = fArr2[3];
        float f32 = fArr3[1];
        fArr[4] = (f31 * f32) + (f27 * f18) + (f29 * f19);
        float f33 = fArr3[2];
        fArr[5] = (f31 * f33) + (fArr2[4] * f23) + (f29 * f24);
        float f34 = fArr2[6] * f26;
        float f35 = fArr2[7];
        float f36 = f34 + (fArr3[3] * f35);
        float f37 = fArr2[8];
        fArr[6] = f36 + (f15 * f37);
        float f38 = fArr2[6];
        fArr[7] = (f32 * f38) + (f35 * fArr3[4]) + (f19 * f37);
        fArr[8] = (f38 * f33) + (fArr2[7] * fArr3[5]) + (f37 * f24);
    }

    /* renamed from: i */
    private static final void m21497i(float[] fArr, float f11) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d11 = f11;
        fArr[4] = (float) Math.cos(d11);
        fArr[5] = (float) (-Math.sin(d11));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d11);
        fArr[8] = (float) Math.cos(d11);
    }

    /* renamed from: j */
    private static final void m21498j(float[] fArr, float f11) {
        double d11 = f11;
        fArr[0] = (float) Math.cos(d11);
        fArr[1] = (float) (-Math.sin(d11));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d11);
        fArr[4] = (float) Math.cos(d11);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: k */
    private static final int m21499k(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        m21495g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m21495g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m21495g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m21495g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not compile shader ");
                sb2.append(i11);
                sb2.append(":");
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                m21495g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public final SurfaceTexture m21500a() {
        if (this.f19343D == null) {
            return null;
        }
        try {
            this.f19348I.await();
        } catch (InterruptedException unused) {
        }
        return this.f19342C;
    }

    /* renamed from: b */
    public final void m21501b(int i11, int i12) {
        synchronized (this.f19349J) {
            this.f19341B = i11;
            this.f19340A = i12;
            this.f19354O = true;
            this.f19349J.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m21502c(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.f19341B = i11;
        this.f19340A = i12;
        this.f19343D = surfaceTexture;
    }

    /* renamed from: d */
    public final void m21503d() {
        synchronized (this.f19349J) {
            this.f19355P = true;
            this.f19343D = null;
            this.f19349J.notifyAll();
        }
    }

    /* renamed from: e */
    public final void m21504e(float f11, float f12) {
        int i11 = this.f19341B;
        int i12 = this.f19340A;
        float f13 = i11 > i12 ? i11 : i12;
        float f14 = (f12 * 1.7453293f) / f13;
        this.f19365y -= (f11 * 1.7453293f) / f13;
        float f15 = this.f19366z - f14;
        this.f19366z = f15;
        if (f15 < -1.5707964f) {
            this.f19366z = -1.5707964f;
            f15 = -1.5707964f;
        }
        if (f15 > 1.5707964f) {
            this.f19366z = 1.5707964f;
        }
    }

    /* renamed from: f */
    final boolean m21505f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f19353N;
        boolean z11 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z11 = this.f19350K.eglDestroySurface(this.f19351L, this.f19353N) | this.f19350K.eglMakeCurrent(this.f19351L, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f19353N = null;
        }
        EGLContext eGLContext = this.f19352M;
        if (eGLContext != null) {
            z11 |= this.f19350K.eglDestroyContext(this.f19351L, eGLContext);
            this.f19352M = null;
        }
        EGLDisplay eGLDisplay = this.f19351L;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.f19350K.eglTerminate(eGLDisplay);
            this.f19351L = null;
            return eglTerminate | z11;
        }
        return z11;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19346G++;
        synchronized (this.f19349J) {
            this.f19349J.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a8  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        EGLConfig eGLConfig;
        boolean z11;
        AbstractC5184xw abstractC5184xw;
        String str;
        int m21499k;
        String str2;
        int glCreateProgram;
        if (this.f19343D != null) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f19350K = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f19351L = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f19350K.eglInitialize(eglGetDisplay, new int[2])) {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f19350K.eglChooseConfig(this.f19351L, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) {
                        eGLConfig = null;
                    } else {
                        eGLConfig = eGLConfigArr[0];
                    }
                    if (eGLConfig != null) {
                        EGL10 egl102 = this.f19350K;
                        EGLDisplay eGLDisplay = this.f19351L;
                        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                        EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                        this.f19352M = eglCreateContext;
                        if (eglCreateContext != null && eglCreateContext != eGLContext) {
                            EGLSurface eglCreateWindowSurface = this.f19350K.eglCreateWindowSurface(this.f19351L, eGLConfig, this.f19343D, null);
                            this.f19353N = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f19350K.eglMakeCurrent(this.f19351L, eglCreateWindowSurface, eglCreateWindowSurface, this.f19352M)) {
                                z11 = true;
                                abstractC5184xw = AbstractC4554gx.f21208c1;
                                if (((String) zzay.zzc().m21823b(abstractC5184xw)).equals(abstractC5184xw.m28039m())) {
                                    str = (String) zzay.zzc().m21823b(abstractC5184xw);
                                } else {
                                    str = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
                                }
                                m21499k = m21499k(35633, str);
                                if (m21499k != 0) {
                                    AbstractC5184xw abstractC5184xw2 = AbstractC4554gx.f21218d1;
                                    if (!((String) zzay.zzc().m21823b(abstractC5184xw2)).equals(abstractC5184xw2.m28039m())) {
                                        str2 = (String) zzay.zzc().m21823b(abstractC5184xw2);
                                    } else {
                                        str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
                                    }
                                    int m21499k2 = m21499k(35632, str2);
                                    if (m21499k2 != 0) {
                                        glCreateProgram = GLES20.glCreateProgram();
                                        m21495g("createProgram");
                                        if (glCreateProgram != 0) {
                                            GLES20.glAttachShader(glCreateProgram, m21499k);
                                            m21495g("attachShader");
                                            GLES20.glAttachShader(glCreateProgram, m21499k2);
                                            m21495g("attachShader");
                                            GLES20.glLinkProgram(glCreateProgram);
                                            m21495g("linkProgram");
                                            int[] iArr2 = new int[1];
                                            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                            m21495g("getProgramiv");
                                            if (iArr2[0] != 1) {
                                                GLES20.glGetProgramInfoLog(glCreateProgram);
                                                GLES20.glDeleteProgram(glCreateProgram);
                                                m21495g("deleteProgram");
                                            } else {
                                                GLES20.glValidateProgram(glCreateProgram);
                                                m21495g("validateProgram");
                                            }
                                        }
                                        this.f19344E = glCreateProgram;
                                        GLES20.glUseProgram(glCreateProgram);
                                        m21495g("useProgram");
                                        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f19344E, "aPosition");
                                        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f19347H);
                                        m21495g("vertexAttribPointer");
                                        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                        m21495g("enableVertexAttribArray");
                                        int[] iArr3 = new int[1];
                                        GLES20.glGenTextures(1, iArr3, 0);
                                        m21495g("genTextures");
                                        int i11 = iArr3[0];
                                        GLES20.glBindTexture(36197, i11);
                                        m21495g("bindTextures");
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        m21495g("texParameteri");
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        m21495g("texParameteri");
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        m21495g("texParameteri");
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        m21495g("texParameteri");
                                        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f19344E, "uVMat");
                                        this.f19345F = glGetUniformLocation;
                                        GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                        int i12 = this.f19344E;
                                        if (!z11 && i12 != 0) {
                                            SurfaceTexture surfaceTexture = new SurfaceTexture(i11);
                                            this.f19342C = surfaceTexture;
                                            surfaceTexture.setOnFrameAvailableListener(this);
                                            this.f19348I.countDown();
                                            this.f19356p.m20957b();
                                            try {
                                                try {
                                                    this.f19354O = true;
                                                    while (!this.f19355P) {
                                                        while (this.f19346G > 0) {
                                                            this.f19342C.updateTexImage();
                                                            this.f19346G--;
                                                        }
                                                        if (this.f19356p.m20959d(this.f19357q)) {
                                                            if (Float.isNaN(this.f19364x)) {
                                                                float[] fArr = this.f19357q;
                                                                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                                float f11 = fArr[0];
                                                                float f12 = fArr2[0];
                                                                float f13 = fArr[1];
                                                                float f14 = fArr2[1];
                                                                float f15 = (f11 * f12) + (f13 * f14);
                                                                float f16 = fArr[2];
                                                                float f17 = fArr2[2];
                                                                float f18 = f15 + (f16 * f17);
                                                                float f19 = (fArr[3] * f12) + (fArr[4] * f14) + (fArr[5] * f17);
                                                                float f21 = fArr[6];
                                                                float f22 = fArr[7];
                                                                float f23 = fArr[8];
                                                                this.f19364x = -(((float) Math.atan2(f19, f18)) - 1.5707964f);
                                                            }
                                                            m21498j(this.f19362v, this.f19364x + this.f19365y);
                                                        } else {
                                                            m21497i(this.f19357q, -1.5707964f);
                                                            m21498j(this.f19362v, this.f19365y);
                                                        }
                                                        m21497i(this.f19358r, 1.5707964f);
                                                        m21496h(this.f19359s, this.f19362v, this.f19358r);
                                                        m21496h(this.f19360t, this.f19357q, this.f19359s);
                                                        m21497i(this.f19361u, this.f19366z);
                                                        m21496h(this.f19363w, this.f19361u, this.f19360t);
                                                        GLES20.glUniformMatrix3fv(this.f19345F, 1, false, this.f19363w, 0);
                                                        GLES20.glDrawArrays(5, 0, 4);
                                                        m21495g("drawArrays");
                                                        GLES20.glFinish();
                                                        this.f19350K.eglSwapBuffers(this.f19351L, this.f19353N);
                                                        if (this.f19354O) {
                                                            GLES20.glViewport(0, 0, this.f19341B, this.f19340A);
                                                            m21495g(ZinstantMetaConstant.VIEWPORT);
                                                            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f19344E, "uFOVx");
                                                            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f19344E, "uFOVy");
                                                            int i13 = this.f19341B;
                                                            int i14 = this.f19340A;
                                                            if (i13 > i14) {
                                                                GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                                GLES20.glUniform1f(glGetUniformLocation3, (this.f19340A * 0.87266463f) / this.f19341B);
                                                            } else {
                                                                GLES20.glUniform1f(glGetUniformLocation2, (i13 * 0.87266463f) / i14);
                                                                GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                            }
                                                            this.f19354O = false;
                                                        }
                                                        try {
                                                            synchronized (this.f19349J) {
                                                                try {
                                                                    if (!this.f19355P && !this.f19354O && this.f19346G == 0) {
                                                                        this.f19349J.wait();
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    throw th2;
                                                                    break;
                                                                }
                                                            }
                                                        } catch (InterruptedException unused) {
                                                        }
                                                    }
                                                    return;
                                                } catch (IllegalStateException unused2) {
                                                    yk0.zzj("SphericalVideoProcessor halted unexpectedly.");
                                                    return;
                                                } catch (Throwable th3) {
                                                    yk0.zzh("SphericalVideoProcessor died.", th3);
                                                    zzt.zzo().m22945t(th3, "SphericalVideoProcessor.run.2");
                                                    return;
                                                }
                                            } finally {
                                                this.f19356p.m20958c();
                                                this.f19342C.setOnFrameAvailableListener(null);
                                                this.f19342C = null;
                                                m21505f();
                                            }
                                        }
                                        String concat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f19350K.eglGetError())));
                                        yk0.zzg(concat);
                                        zzt.zzo().m22945t(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                        m21505f();
                                        this.f19348I.countDown();
                                        return;
                                    }
                                }
                                glCreateProgram = 0;
                                this.f19344E = glCreateProgram;
                                GLES20.glUseProgram(glCreateProgram);
                                m21495g("useProgram");
                                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f19344E, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f19347H);
                                m21495g("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                                m21495g("enableVertexAttribArray");
                                int[] iArr32 = new int[1];
                                GLES20.glGenTextures(1, iArr32, 0);
                                m21495g("genTextures");
                                int i112 = iArr32[0];
                                GLES20.glBindTexture(36197, i112);
                                m21495g("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                m21495g("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                m21495g("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                m21495g("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                m21495g("texParameteri");
                                int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f19344E, "uVMat");
                                this.f19345F = glGetUniformLocation4;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i122 = this.f19344E;
                                if (!z11) {
                                }
                                String concat2 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f19350K.eglGetError())));
                                yk0.zzg(concat2);
                                zzt.zzo().m22945t(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                                m21505f();
                                this.f19348I.countDown();
                                return;
                            }
                        }
                    }
                }
            }
            z11 = false;
            abstractC5184xw = AbstractC4554gx.f21208c1;
            if (((String) zzay.zzc().m21823b(abstractC5184xw)).equals(abstractC5184xw.m28039m())) {
            }
            m21499k = m21499k(35633, str);
            if (m21499k != 0) {
            }
            glCreateProgram = 0;
            this.f19344E = glCreateProgram;
            GLES20.glUseProgram(glCreateProgram);
            m21495g("useProgram");
            int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f19344E, "aPosition");
            GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f19347H);
            m21495g("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
            m21495g("enableVertexAttribArray");
            int[] iArr322 = new int[1];
            GLES20.glGenTextures(1, iArr322, 0);
            m21495g("genTextures");
            int i1122 = iArr322[0];
            GLES20.glBindTexture(36197, i1122);
            m21495g("bindTextures");
            GLES20.glTexParameteri(36197, 10240, 9729);
            m21495g("texParameteri");
            GLES20.glTexParameteri(36197, 10241, 9729);
            m21495g("texParameteri");
            GLES20.glTexParameteri(36197, 10242, 33071);
            m21495g("texParameteri");
            GLES20.glTexParameteri(36197, 10243, 33071);
            m21495g("texParameteri");
            int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f19344E, "uVMat");
            this.f19345F = glGetUniformLocation42;
            GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            int i1222 = this.f19344E;
            if (!z11) {
            }
            String concat22 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f19350K.eglGetError())));
            yk0.zzg(concat22);
            zzt.zzo().m22945t(new Throwable(concat22), "SphericalVideoProcessor.run.1");
            m21505f();
            this.f19348I.countDown();
            return;
        }
        yk0.zzg("SphericalVideoProcessor started with no output texture.");
        this.f19348I.countDown();
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void zza() {
        synchronized (this.f19349J) {
            this.f19349J.notifyAll();
        }
    }
}
