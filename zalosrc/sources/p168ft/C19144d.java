package p168ft;

import android.opengl.GLES20;
import et.C18596c;

/* renamed from: ft.d */
/* loaded from: classes4.dex */
public class C19144d extends C18596c {

    /* renamed from: o */
    private int f95177o;

    /* renamed from: p */
    private float f95178p;

    public C19144d(float f11) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
        this.f95178p = f11;
    }

    @Override // et.C18596c
    /* renamed from: g */
    public String mo98212g() {
        return "Gamma";
    }

    @Override // et.C18596c
    /* renamed from: l */
    public void mo98215l() {
        super.mo98215l();
        this.f95177o = GLES20.glGetUniformLocation(m98213h(), "gamma");
    }

    @Override // et.C18596c
    /* renamed from: m */
    public void mo98216m() {
        super.mo98216m();
        m100460s(this.f95178p);
    }

    /* renamed from: s */
    public void m100460s(float f11) {
        this.f95178p = f11;
        m98219r(this.f95177o, f11);
    }
}
