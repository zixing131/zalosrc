package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class oe2 implements sh2 {

    /* renamed from: a */
    private final Context f25612a;

    /* renamed from: b */
    private final uc3 f25613b;

    public oe2(Context context, uc3 uc3Var) {
        this.f25612a = context;
        this.f25613b = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f25613b.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ne2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                zzt.zzp();
                C4881pq zzg = zzt.zzo().m22936h().zzg();
                Bundle bundle = null;
                if (zzg != null && (!zzt.zzo().m22936h().zzM() || !zzt.zzo().m22936h().zzN())) {
                    if (zzg.m25520h()) {
                        zzg.m25519g();
                    }
                    C4510fq m25513a = zzg.m25513a();
                    if (m25513a != null) {
                        zzj = m25513a.m22126d();
                        str = m25513a.m22127e();
                        zzk = m25513a.m22128f();
                        if (zzj != null) {
                            zzt.zzo().m22936h().zzw(zzj);
                        }
                        if (zzk != null) {
                            zzt.zzo().m22936h().zzy(zzk);
                        }
                    } else {
                        zzj = zzt.zzo().m22936h().zzj();
                        zzk = zzt.zzo().m22936h().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzt.zzo().m22936h().zzN()) {
                        if (zzk != null && !TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", zzk);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzj != null && !zzt.zzo().m22936h().zzM()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new pe2(bundle);
            }
        });
    }
}
