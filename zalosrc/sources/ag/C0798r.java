package ag;

import android.content.Context;
import bg.C2794a;

/* renamed from: ag.r */
/* loaded from: classes3.dex */
public class C0798r extends C2794a {

    /* renamed from: e */
    public int f2746e;

    /* renamed from: f */
    public int f2747f;

    /* renamed from: g */
    public int f2748g;

    /* renamed from: h */
    public int f2749h;

    /* renamed from: i */
    public int f2750i;

    /* renamed from: j */
    public int f2751j;

    /* renamed from: k */
    public int f2752k;

    /* renamed from: l */
    public int f2753l;

    /* renamed from: i */
    public void m2016i(Context context) {
        m13465g("shader/normal_mvp_v.glsl", "shader/touch_blur_f.glsl", context);
        this.f2746e = m13460b("uMVPMatrix");
        this.f2747f = m13460b("position");
        this.f2748g = m13460b("inputTextureCoordinate");
        this.f2749h = m13460b("inputImageTexture");
        this.f2750i = m13460b("aTouchPosition");
        this.f2751j = m13460b("aLeftTop");
        this.f2752k = m13460b("aRightBot");
        this.f2753l = m13460b("aRadius");
    }
}
