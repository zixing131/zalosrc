package p168ft;

import android.opengl.GLES20;
import et.C18596c;

/* renamed from: ft.c */
/* loaded from: classes4.dex */
public class C19143c extends C18596c {

    /* renamed from: o */
    private int f95175o;

    /* renamed from: p */
    private float f95176p;

    public C19143c() {
        this(1.2f);
    }

    @Override // et.C18596c
    /* renamed from: g */
    public String mo98212g() {
        return "Contrast";
    }

    @Override // et.C18596c
    /* renamed from: l */
    public void mo98215l() {
        super.mo98215l();
        this.f95175o = GLES20.glGetUniformLocation(m98213h(), "contrast");
    }

    @Override // et.C18596c
    /* renamed from: m */
    public void mo98216m() {
        super.mo98216m();
        m100459s(this.f95176p);
    }

    /* renamed from: s */
    public void m100459s(float f11) {
        this.f95176p = f11;
        m98219r(this.f95175o, f11);
    }

    public C19143c(float f11) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float contrast;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(((textureColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), textureColor.w);\n }");
        this.f95176p = f11;
    }
}
