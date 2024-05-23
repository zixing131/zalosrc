package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class bp0 extends zzb {

    /* renamed from: a */
    final fn0 f17943a;

    /* renamed from: b */
    final kp0 f17944b;

    /* renamed from: c */
    private final String f17945c;

    /* renamed from: d */
    private final String[] f17946d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bp0(fn0 fn0Var, kp0 kp0Var, String str, String[] strArr) {
        this.f17943a = fn0Var;
        this.f17944b = kp0Var;
        this.f17945c = str;
        this.f17946d = strArr;
        zzt.zzy().m20979e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean m20642a() {
        return Boolean.valueOf(this.f17944b.mo24005u(this.f17945c, this.f17946d, this));
    }

    /* renamed from: b */
    public final String m20643b() {
        return this.f17945c;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f17944b.mo24004t(this.f17945c, this.f17946d);
        } finally {
            zzs.zza.post(new ap0(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21033K1)).booleanValue() && (this.f17944b instanceof tp0)) {
            return kl0.f23367e.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.zo0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return bp0.this.m20642a();
                }
            });
        }
        return super.zzb();
    }
}
