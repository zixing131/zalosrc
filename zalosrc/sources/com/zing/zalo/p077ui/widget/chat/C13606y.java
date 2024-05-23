package com.zing.zalo.p077ui.widget.chat;

import android.opengl.GLES20;

/* renamed from: com.zing.zalo.ui.widget.chat.y */
/* loaded from: classes6.dex */
public class C13606y {

    /* renamed from: c */
    public static int f70180c;

    /* renamed from: d */
    public static int f70181d;

    /* renamed from: e */
    public static int f70182e;

    /* renamed from: f */
    public static int f70183f;

    /* renamed from: g */
    public static int f70184g;

    /* renamed from: h */
    public static int f70185h;

    /* renamed from: a */
    private int f70186a;

    /* renamed from: b */
    private int f70187b;

    /* renamed from: a */
    public void m76183a() {
        this.f70186a = m76184b(35633, "uniform mat4 u_MVPMatrix;attribute vec4 a_Position;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {  gl_Position = u_MVPMatrix * a_Position;  v_texCoord = a_texCoord;}");
        this.f70187b = m76184b(35632, "precision mediump float;uniform float alphaFactor;uniform sampler2D u_texture;varying vec2 v_texCoord;void main() {   lowp vec4 textureColor = texture2D(u_texture, v_texCoord);   gl_FragColor = alphaFactor * textureColor;}");
        int glCreateProgram = GLES20.glCreateProgram();
        f70180c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, this.f70186a);
        GLES20.glAttachShader(f70180c, this.f70187b);
        GLES20.glLinkProgram(f70180c);
        f70181d = GLES20.glGetUniformLocation(f70180c, "u_MVPMatrix");
        f70182e = GLES20.glGetAttribLocation(f70180c, "a_Position");
        f70183f = GLES20.glGetAttribLocation(f70180c, "a_texCoord");
        f70184g = GLES20.glGetUniformLocation(f70180c, "u_texture");
        f70185h = GLES20.glGetUniformLocation(f70180c, "alphaFactor");
    }

    /* renamed from: b */
    public int m76184b(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }
}
