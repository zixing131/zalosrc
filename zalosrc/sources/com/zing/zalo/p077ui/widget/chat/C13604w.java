package com.zing.zalo.p077ui.widget.chat;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: com.zing.zalo.ui.widget.chat.w */
/* loaded from: classes6.dex */
public class C13604w {

    /* renamed from: m */
    static final float[] f70106m = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: n */
    static final float[] f70107n = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    private final FloatBuffer f70108a;

    /* renamed from: b */
    private final FloatBuffer f70109b;

    /* renamed from: c */
    private final int f70110c;

    /* renamed from: d */
    private final int f70111d;

    /* renamed from: e */
    private final int f70112e;

    /* renamed from: f */
    private final int f70113f;

    /* renamed from: g */
    private final int f70114g;

    /* renamed from: h */
    private final int f70115h;

    /* renamed from: i */
    private final int f70116i;

    /* renamed from: j */
    private final int f70117j;

    /* renamed from: k */
    public int f70118k;

    /* renamed from: l */
    public int f70119l;

    public C13604w() {
        int m134908o = AbstractC26236a.m134908o("attribute vec4 position;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main() {  gl_Position = position;  textureCoordinate = inputTextureCoordinate;}", "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;uniform float x1, x2, y1, y2;void main() {   if(textureCoordinate.x > x1 && textureCoordinate.x < x2 && textureCoordinate.y > y1 && textureCoordinate.y < y2) {       gl_FragColor = texture2D(inputImageTexture, textureCoordinate);   } else {       gl_FragColor = vec4(0, 0, 0, 0);   }}");
        this.f70110c = m134908o;
        this.f70111d = GLES20.glGetAttribLocation(m134908o, "position");
        this.f70112e = GLES20.glGetUniformLocation(m134908o, "inputImageTexture");
        this.f70113f = GLES20.glGetAttribLocation(m134908o, "inputTextureCoordinate");
        this.f70114g = GLES20.glGetUniformLocation(m134908o, "x1");
        this.f70115h = GLES20.glGetUniformLocation(m134908o, "x2");
        this.f70116i = GLES20.glGetUniformLocation(m134908o, "y1");
        this.f70117j = GLES20.glGetUniformLocation(m134908o, "y2");
        this.f70108a = AbstractC26237b.m134918c(f70106m);
        this.f70109b = AbstractC26237b.m134918c(f70107n);
    }

    /* renamed from: a */
    public void m76159a(int i11, RectF rectF) {
        GLES20.glUseProgram(this.f70110c);
        GLES20.glVertexAttribPointer(this.f70111d, 2, 5126, false, 0, (Buffer) this.f70108a);
        GLES20.glEnableVertexAttribArray(this.f70111d);
        GLES20.glVertexAttribPointer(this.f70113f, 2, 5126, false, 0, (Buffer) this.f70109b);
        GLES20.glEnableVertexAttribArray(this.f70113f);
        GLES20.glUniform1f(this.f70114g, rectF.left);
        GLES20.glUniform1f(this.f70115h, rectF.right);
        GLES20.glUniform1f(this.f70116i, rectF.top);
        GLES20.glUniform1f(this.f70117j, rectF.bottom);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i11);
            GLES20.glUniform1i(this.f70112e, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f70111d);
        GLES20.glDisableVertexAttribArray(this.f70113f);
        GLES20.glBindTexture(3553, 0);
    }
}
