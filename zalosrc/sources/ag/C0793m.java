package ag;

import android.content.Context;
import bg.C2794a;

/* renamed from: ag.m */
/* loaded from: classes3.dex */
public class C0793m extends C2794a {

    /* renamed from: e */
    public int f2736e;

    /* renamed from: f */
    public int f2737f;

    /* renamed from: g */
    public int f2738g;

    /* renamed from: h */
    public int f2739h;

    /* renamed from: i */
    public int f2740i;

    /* renamed from: i */
    public void m2005i(Context context) {
        m13465g("shader/normal_mvp_v.glsl", "shader/opacity_normal_f.glsl", context);
        this.f2736e = m13460b("uMVPMatrix");
        this.f2737f = m13460b("position");
        this.f2738g = m13460b("inputTextureCoordinate");
        this.f2740i = m13460b("inputImageTexture");
        this.f2739h = m13460b("opacity");
    }
}
