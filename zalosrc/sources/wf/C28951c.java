package wf;

import android.opengl.Matrix;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.nio.FloatBuffer;
import qm0.AbstractC25356m;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: wf.c */
/* loaded from: classes3.dex */
public final class C28951c extends AbstractC28949a {
    public C28951c() {
        FloatBuffer floatBuffer;
        floatBuffer = AbstractC28952d.f134015a;
        this.f134011S = floatBuffer;
        FloatBuffer m134918c = AbstractC26237b.m134918c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        AbstractC19074t.m100207e(m134918c, "createFloatBuffer(...)");
        this.f134012T = m134918c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wf.AbstractC28949a, wf.AbstractC28955g, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        try {
            this.f134007O.m2008j("\nuniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main(){\n    gl_Position = position;\n    textureCoordinate = (uMVPMatrix * inputTextureCoordinate).xy;\n}\n", "\n#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\n\nuniform samplerExternalOES inputImageTexture;\nvarying vec2 textureCoordinate;\n\nuniform mediump float opacity;\n\nvoid main() {\n    vec4 base = texture2D(inputImageTexture, textureCoordinate);\n\tgl_FragColor = vec4(base.rgb, opacity * base.a);\n}\n");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        AbstractC26236a.m134894a("OESTexture - onInit");
    }

    @Override // wf.AbstractC28955g
    /* renamed from: k0 */
    public void mo144598k0() {
        if (!m144614g0()) {
            return;
        }
        AbstractC20110a.f98889a.mo104554k("update draw info: isTextureFlip = %b, textureOrientation = %d", Boolean.valueOf(m144615h0()), Integer.valueOf(m144612e0()));
        m144600m0(m144612e0());
        Matrix.setIdentityM(this.f134008P, 0);
        this.f134009Q = true;
    }

    /* renamed from: m0 */
    public final void m144600m0(int i11) {
        FloatBuffer floatBuffer;
        if (i11 == 90) {
            floatBuffer = AbstractC28952d.f134016b;
        } else {
            floatBuffer = i11 != 180 ? i11 != 270 ? AbstractC28952d.f134015a : AbstractC28952d.f134018d : AbstractC28952d.f134017c;
        }
        this.f134011S = floatBuffer;
    }

    /* renamed from: n0 */
    public final void m144601n0(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "matrix");
        AbstractC25356m.m131325h(fArr, this.f134008P, 0, 0, 0, 14, null);
    }
}
