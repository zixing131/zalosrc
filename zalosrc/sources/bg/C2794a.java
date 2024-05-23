package bg;

import android.content.Context;
import android.opengl.GLES20;
import java.util.HashMap;
import p620wt.AbstractC29226a;
import se0.AbstractC26236a;

/* renamed from: bg.a */
/* loaded from: classes3.dex */
public class C2794a {

    /* renamed from: a */
    private int f11147a = 0;

    /* renamed from: b */
    private int f11148b = 0;

    /* renamed from: c */
    private int f11149c = 0;

    /* renamed from: d */
    private final HashMap f11150d = new HashMap();

    /* renamed from: a */
    public void m13459a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deleteProgram: ");
        sb2.append(Thread.currentThread().getName());
        GLES20.glDetachShader(this.f11147a, this.f11148b);
        GLES20.glDetachShader(this.f11147a, this.f11149c);
        GLES20.glDeleteShader(this.f11148b);
        GLES20.glDeleteShader(this.f11149c);
        GLES20.glDeleteProgram(this.f11147a);
        AbstractC26236a.m134894a("deleteProgram");
        this.f11149c = 0;
        this.f11148b = 0;
        this.f11147a = 0;
    }

    /* renamed from: b */
    public int m13460b(String str) {
        if (this.f11150d.containsKey(str)) {
            return ((Integer) this.f11150d.get(str)).intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11147a, str);
        if (glGetAttribLocation == -1) {
            glGetAttribLocation = GLES20.glGetUniformLocation(this.f11147a, str);
        }
        if (glGetAttribLocation == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get attrib location for ");
            sb2.append(str);
        }
        this.f11150d.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    /* renamed from: c */
    int m13461c(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                throw new Exception(glGetShaderInfoLog);
            }
        }
        return glCreateShader;
    }

    /* renamed from: d */
    protected void m13462d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onProgramLoaded: ");
        sb2.append(Thread.currentThread().getName());
    }

    /* renamed from: e */
    public int m13463e() {
        return this.f11147a;
    }

    /* renamed from: f */
    public final void m13464f(String str, String str2) {
        this.f11148b = m13461c(35633, str);
        this.f11149c = m13461c(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, this.f11148b);
            GLES20.glAttachShader(glCreateProgram, this.f11149c);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                m13459a();
                throw new Exception(glGetProgramInfoLog);
            }
        }
        this.f11147a = glCreateProgram;
        this.f11150d.clear();
        m13462d();
    }

    /* renamed from: g */
    public void m13465g(String str, String str2, Context context) {
        m13464f(AbstractC29226a.m145977b(str, context), AbstractC29226a.m145977b(str2, context));
    }

    /* renamed from: h */
    public void m13466h() {
        GLES20.glUseProgram(this.f11147a);
    }
}
