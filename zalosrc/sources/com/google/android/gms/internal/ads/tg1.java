package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class tg1 implements j04 {

    /* renamed from: a */
    private final ng1 f28313a;

    /* renamed from: b */
    private final w04 f28314b;

    /* renamed from: c */
    private final w04 f28315c;

    /* renamed from: d */
    private final w04 f28316d;

    /* renamed from: e */
    private final w04 f28317e;

    public tg1(ng1 ng1Var, w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f28313a = ng1Var;
        this.f28314b = w04Var;
        this.f28315c = w04Var2;
        this.f28316d = w04Var3;
        this.f28317e = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f28314b.zzb();
        final zzcgv m24707a = ((mt0) this.f28315c).m24707a();
        final iq2 m24112a = ((l41) this.f28316d).m24112a();
        final dr2 m24483a = ((m71) this.f28317e).m24483a();
        return new if1(new l91() { // from class: com.google.android.gms.internal.ads.mg1
            @Override // com.google.android.gms.internal.ads.l91
            public final void zzn() {
                zzt.zzs().zzn(context, m24707a.f32030p, m24112a.f22290D.toString(), m24483a.f19400f);
            }
        }, kl0.f23368f);
    }
}
