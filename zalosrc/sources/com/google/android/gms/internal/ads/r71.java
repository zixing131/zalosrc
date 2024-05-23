package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class r71 implements j04 {

    /* renamed from: a */
    private final q71 f27121a;

    /* renamed from: b */
    private final w04 f27122b;

    /* renamed from: c */
    private final w04 f27123c;

    /* renamed from: d */
    private final w04 f27124d;

    /* renamed from: e */
    private final w04 f27125e;

    public r71(q71 q71Var, w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f27121a = q71Var;
        this.f27122b = w04Var;
        this.f27123c = w04Var2;
        this.f27124d = w04Var3;
        this.f27125e = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f27122b.zzb();
        zzcgv m24707a = ((mt0) this.f27123c).m24707a();
        iq2 m24112a = ((l41) this.f27124d).m24112a();
        vh0 vh0Var = new vh0();
        if (m24112a.f22288B != null) {
            return new uh0(context, m24707a, m24112a.f22288B, m24112a.f22348t.f24722b, vh0Var, null);
        }
        return null;
    }
}
