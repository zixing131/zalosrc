package et;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26236a;

/* renamed from: et.q */
/* loaded from: classes4.dex */
public class C18610q {

    /* renamed from: a */
    public int f93578a;

    /* renamed from: b */
    public int f93579b;

    /* renamed from: c */
    public int f93580c;

    /* renamed from: d */
    public int f93581d;

    /* renamed from: e */
    public int f93582e;

    /* renamed from: f */
    public int f93583f;

    /* renamed from: g */
    public int f93584g;

    /* renamed from: h */
    public int f93585h;

    /* renamed from: i */
    public int f93586i;

    /* renamed from: j */
    public int f93587j;

    /* renamed from: k */
    public int f93588k;

    /* renamed from: l */
    private int f93589l;

    /* renamed from: m */
    private int f93590m;

    /* renamed from: n */
    private int f93591n;

    /* renamed from: o */
    private int f93592o;

    /* renamed from: a */
    public void m98342a() {
        GLES20.glDetachShader(this.f93578a, this.f93589l);
        GLES20.glDetachShader(this.f93578a, this.f93590m);
        GLES20.glDetachShader(this.f93579b, this.f93591n);
        GLES20.glDetachShader(this.f93579b, this.f93592o);
        GLES20.glDeleteShader(this.f93589l);
        GLES20.glDeleteShader(this.f93590m);
        GLES20.glDeleteShader(this.f93591n);
        GLES20.glDeleteShader(this.f93592o);
        GLES20.glDeleteProgram(this.f93578a);
        GLES20.glDeleteProgram(this.f93579b);
    }

    /* renamed from: b */
    public void m98343b(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, float f11) {
        GLES20.glUseProgram(this.f93579b);
        GLES20.glEnableVertexAttribArray(this.f93584g);
        GLES20.glEnableVertexAttribArray(this.f93585h);
        GLES20.glVertexAttribPointer(this.f93585h, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glVertexAttribPointer(this.f93584g, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glUniform1f(this.f93588k, f11);
        GLES20.glUniform1i(this.f93586i, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i11);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f93584g);
        GLES20.glDisableVertexAttribArray(this.f93585h);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: c */
    public void m98344c() {
        this.f93589l = AbstractC26236a.m134897d("uniform mat4 u_MVPMatrix;attribute vec4 a_Position;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {   gl_Position = u_MVPMatrix * a_Position;   v_texCoord = a_texCoord;}");
        this.f93590m = AbstractC26236a.m134895b("precision mediump float;uniform float alphaFactor;uniform sampler2D u_texture;varying vec2 v_texCoord;void main() {   lowp vec4 textureColor = texture2D(u_texture, v_texCoord);   gl_FragColor = vec4(textureColor.rgb, textureColor.a * alphaFactor);}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f93578a = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.f93589l);
        GLES20.glAttachShader(this.f93578a, this.f93590m);
        GLES20.glLinkProgram(this.f93578a);
        this.f93580c = GLES20.glGetUniformLocation(this.f93578a, "u_MVPMatrix");
        this.f93581d = GLES20.glGetAttribLocation(this.f93578a, "a_Position");
        this.f93582e = GLES20.glGetAttribLocation(this.f93578a, "a_texCoord");
        this.f93583f = GLES20.glGetUniformLocation(this.f93578a, "u_texture");
        this.f93587j = GLES20.glGetUniformLocation(this.f93578a, "alphaFactor");
        this.f93591n = AbstractC26236a.m134897d("attribute vec4 a_Position;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {   gl_Position = a_Position;   v_texCoord = a_texCoord;}");
        this.f93592o = AbstractC26236a.m134895b("precision mediump float;uniform float alphaFactor;uniform sampler2D u_texture;varying vec2 v_texCoord;void main() {   gl_FragColor = alphaFactor * texture2D(u_texture, v_texCoord);}");
        int glCreateProgram2 = GLES20.glCreateProgram();
        this.f93579b = glCreateProgram2;
        GLES20.glAttachShader(glCreateProgram2, this.f93591n);
        GLES20.glAttachShader(this.f93579b, this.f93592o);
        GLES20.glLinkProgram(this.f93579b);
        this.f93584g = GLES20.glGetAttribLocation(this.f93579b, "a_Position");
        this.f93585h = GLES20.glGetAttribLocation(this.f93579b, "a_texCoord");
        this.f93586i = GLES20.glGetUniformLocation(this.f93579b, "u_texture");
        this.f93588k = GLES20.glGetUniformLocation(this.f93579b, "alphaFactor");
    }
}
