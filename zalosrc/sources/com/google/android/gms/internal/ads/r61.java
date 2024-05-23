package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

/* loaded from: classes2.dex */
public final class r61 implements j04 {

    /* renamed from: a */
    private final w04 f27109a;

    /* renamed from: b */
    private final w04 f27110b;

    /* renamed from: c */
    private final w04 f27111c;

    public r61(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f27109a = w04Var;
        this.f27110b = w04Var2;
        this.f27111c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f27109a.zzb();
        final zzcgv m24707a = ((mt0) this.f27110b).m24707a();
        final dr2 m24483a = ((m71) this.f27111c).m24483a();
        return new y43() { // from class: com.google.android.gms.internal.ads.q61
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcgv zzcgvVar = m24707a;
                dr2 dr2Var = m24483a;
                iq2 iq2Var = (iq2) obj;
                zzas zzasVar = new zzas(context2);
                zzasVar.zzp(iq2Var.f22289C);
                zzasVar.zzq(iq2Var.f22290D.toString());
                zzasVar.zzo(zzcgvVar.f32030p);
                zzasVar.zzn(dr2Var.f19400f);
                return zzasVar;
            }
        };
    }
}
