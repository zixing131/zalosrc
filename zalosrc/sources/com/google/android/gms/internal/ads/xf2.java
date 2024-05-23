package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class xf2 implements sh2 {

    /* renamed from: a */
    private final uc3 f30438a;

    /* renamed from: b */
    private final Context f30439b;

    /* renamed from: c */
    private final Set f30440c;

    public xf2(uc3 uc3Var, Context context, Set set) {
        this.f30438a = uc3Var;
        this.f30439b = context;
        this.f30440c = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ yf2 m27885a() {
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21251g4;
        String str = null;
        if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            Set set = this.f30440c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.zzA();
                if (true == ((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    str = "a.1.3.31-google_20220407";
                }
                return new yf2(str);
            }
        }
        return new yf2(null);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f30438a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.wf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return xf2.this.m27885a();
            }
        });
    }
}
