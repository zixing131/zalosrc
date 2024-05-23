package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class yb2 implements sh2 {

    /* renamed from: a */
    private final uc3 f30877a;

    /* renamed from: b */
    private final dr2 f30878b;

    /* renamed from: c */
    private final or2 f30879c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yb2(uc3 uc3Var, dr2 dr2Var, or2 or2Var) {
        this.f30877a = uc3Var;
        this.f30878b = dr2Var;
        this.f30879c = or2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zb2 m28177a() {
        String str = null;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21323n6)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.f30878b.f19398d))) {
            str = or2.m25246a();
        }
        return new zb2(str);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f30877a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.xb2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yb2.this.m28177a();
            }
        });
    }
}
