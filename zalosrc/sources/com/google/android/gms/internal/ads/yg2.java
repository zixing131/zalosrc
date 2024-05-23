package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class yg2 implements sh2 {

    /* renamed from: a */
    private final String f30930a;

    /* renamed from: b */
    private final uc3 f30931b;

    /* renamed from: c */
    private final ScheduledExecutorService f30932c;

    /* renamed from: d */
    private final Context f30933d;

    /* renamed from: e */
    private final dr2 f30934e;

    /* renamed from: f */
    private final vs0 f30935f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yg2(uc3 uc3Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, dr2 dr2Var, vs0 vs0Var) {
        this.f30931b = uc3Var;
        this.f30932c = scheduledExecutorService;
        this.f30930a = str;
        this.f30933d = context;
        this.f30934e = dr2Var;
        this.f30935f = vs0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ tc3 m28202a(yg2 yg2Var) {
        String str = yg2Var.f30930a;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21283j6)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg mo22606r = yg2Var.f30935f.mo22606r();
        f71 f71Var = new f71();
        f71Var.m21958c(yg2Var.f30933d);
        br2 br2Var = new br2();
        br2Var.m20681J("adUnitId");
        br2Var.m20693e(yg2Var.f30934e.f19398d);
        br2Var.m20680I(new zzq());
        f71Var.m21961f(br2Var.m20695g());
        mo22606r.zza(f71Var.m21962g());
        zzac zzacVar = new zzac();
        zzacVar.zza(str);
        mo22606r.zzb(zzacVar.zzb());
        new ld1();
        return kc3.m23874f(kc3.m23881m((ac3) kc3.m23883o(ac3.m20071D(mo22606r.zzc().zzc()), ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21293k6)).longValue(), TimeUnit.MILLISECONDS, yg2Var.f30932c), new y43() { // from class: com.google.android.gms.internal.ads.wg2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                zzam zzamVar = (zzam) obj;
                return zzamVar != null ? new zg2(zzamVar.zza) : new zg2(null);
            }
        }, yg2Var.f30931b), Exception.class, new y43() { // from class: com.google.android.gms.internal.ads.xg2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                yk0.zzh("", (Exception) obj);
                return new zg2(null);
            }
        }, yg2Var.f30931b);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21273i6)).booleanValue() && !"adUnitId".equals(this.f30934e.f19400f)) {
            return kc3.m23880l(new pb3() { // from class: com.google.android.gms.internal.ads.vg2
                @Override // com.google.android.gms.internal.ads.pb3
                public final tc3 zza() {
                    return yg2.m28202a(yg2.this);
                }
            }, this.f30931b);
        }
        return this.f30931b.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ug2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zg2(null);
            }
        });
    }
}
