package p168ft;

import android.opengl.GLES20;
import et.C18596c;

/* renamed from: ft.e */
/* loaded from: classes4.dex */
public class C19145e extends C18596c {

    /* renamed from: o */
    private int f95179o;

    /* renamed from: p */
    private float f95180p;

    public C19145e(float f11) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float saturation;\n \n // Values from \"Graphics Shaders: Theory and Practice\" by Bailey and Cunningham\n const mediump vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float luminance = dot(textureColor.rgb, luminanceWeighting);\n    lowp vec3 greyScaleColor = vec3(luminance);\n    \n    gl_FragColor = vec4(mix(greyScaleColor, textureColor.rgb, saturation), textureColor.w);\n     \n }");
        this.f95180p = f11;
    }

    @Override // et.C18596c
    /* renamed from: g */
    public String mo98212g() {
        return "Saturation";
    }

    @Override // et.C18596c
    /* renamed from: l */
    public void mo98215l() {
        super.mo98215l();
        this.f95179o = GLES20.glGetUniformLocation(m98213h(), "saturation");
    }

    @Override // et.C18596c
    /* renamed from: m */
    public void mo98216m() {
        super.mo98216m();
        m100461s(this.f95180p);
    }

    /* renamed from: s */
    public void m100461s(float f11) {
        this.f95180p = f11;
        m98219r(this.f95179o, f11);
    }
}
