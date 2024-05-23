package ag;

import bg.C2794a;

/* renamed from: ag.l */
/* loaded from: classes3.dex */
public final class C0792l extends C2794a {

    /* renamed from: e */
    private int f2730e;

    /* renamed from: f */
    private int f2731f;

    /* renamed from: g */
    private int f2732g;

    /* renamed from: h */
    private int f2733h;

    /* renamed from: i */
    private int f2734i;

    /* renamed from: j */
    private int f2735j;

    /* renamed from: i */
    public final int m1998i() {
        return this.f2731f;
    }

    /* renamed from: j */
    public final int m1999j() {
        return this.f2733h;
    }

    /* renamed from: k */
    public final int m2000k() {
        return this.f2732g;
    }

    /* renamed from: l */
    public final int m2001l() {
        return this.f2734i;
    }

    /* renamed from: m */
    public final int m2002m() {
        return this.f2735j;
    }

    /* renamed from: n */
    public final int m2003n() {
        return this.f2730e;
    }

    /* renamed from: o */
    public final void m2004o() {
        m13464f("\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", "\n precision mediump float;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\n\nuniform float intensity;\nvoid main() {\n    mediump vec4 filtered = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n\n    gl_FragColor = intensity * filtered + (1.0 - intensity) * base;\n}\n");
        this.f2730e = m13460b("position");
        this.f2732g = m13460b("inputTextureCoordinate");
        this.f2731f = m13460b("inputTextureCoordinate2");
        this.f2734i = m13460b("inputImageTexture");
        this.f2733h = m13460b("inputImageTexture2");
        this.f2735j = m13460b("intensity");
    }
}
