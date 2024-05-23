package go0;

import android.opengl.GLES20;

/* renamed from: go0.c */
/* loaded from: classes7.dex */
public class C19527c {

    /* renamed from: c */
    public static int f96966c;

    /* renamed from: d */
    public static int f96967d;

    /* renamed from: e */
    public static int f96968e;

    /* renamed from: f */
    public static int f96969f;

    /* renamed from: g */
    public static int f96970g;

    /* renamed from: h */
    public static int f96971h;

    /* renamed from: a */
    private int f96972a;

    /* renamed from: b */
    private int f96973b;

    /* renamed from: a */
    public void m102075a() {
        this.f96972a = m102076b(35633, "uniform mat4 u_MVPMatrix;attribute vec4 a_Position;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {  gl_Position = u_MVPMatrix * a_Position;  v_texCoord = a_texCoord;}");
        this.f96973b = m102076b(35632, "precision mediump float;uniform float alphaFactor;uniform sampler2D u_texture;varying vec2 v_texCoord;void main() {   lowp vec4 textureColor = texture2D(u_texture, v_texCoord);   gl_FragColor = vec4(textureColor.rgb, textureColor.a * alphaFactor);}");
        int glCreateProgram = GLES20.glCreateProgram();
        f96966c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.f96972a);
        GLES20.glAttachShader(f96966c, this.f96973b);
        GLES20.glLinkProgram(f96966c);
        f96967d = GLES20.glGetUniformLocation(f96966c, "u_MVPMatrix");
        f96968e = GLES20.glGetAttribLocation(f96966c, "a_Position");
        f96969f = GLES20.glGetAttribLocation(f96966c, "a_texCoord");
        f96970g = GLES20.glGetUniformLocation(f96966c, "u_texture");
        f96971h = GLES20.glGetUniformLocation(f96966c, "alphaFactor");
    }

    /* renamed from: b */
    public int m102076b(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }
}
