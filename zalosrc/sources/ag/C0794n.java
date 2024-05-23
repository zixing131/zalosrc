package ag;

import android.content.Context;
import bg.C2794a;

/* renamed from: ag.n */
/* loaded from: classes3.dex */
public class C0794n extends C2794a {

    /* renamed from: e */
    public int f2741e;

    /* renamed from: f */
    public int f2742f;

    /* renamed from: g */
    public int f2743g;

    /* renamed from: h */
    public int f2744h;

    /* renamed from: i */
    public int f2745i;

    /* renamed from: k */
    private void m2006k() {
        this.f2741e = m13460b("uMVPMatrix");
        this.f2742f = m13460b("position");
        this.f2743g = m13460b("inputTextureCoordinate");
        this.f2745i = m13460b("inputImageTexture");
        this.f2744h = m13460b("opacity");
    }

    /* renamed from: i */
    public void m2007i(Context context) {
        m13465g("shader/normal_mvp_v.glsl", "shader/opacity_oes_f.glsl", context);
        m2006k();
    }

    /* renamed from: j */
    public void m2008j(String str, String str2) {
        m13464f(str, str2);
        m2006k();
    }
}
