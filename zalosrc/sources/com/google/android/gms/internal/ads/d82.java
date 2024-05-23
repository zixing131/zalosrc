package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d82 implements c32 {

    /* renamed from: a */
    private final e32 f19128a;

    /* renamed from: b */
    private final i32 f19129b;

    /* renamed from: c */
    private final hv2 f19130c;

    /* renamed from: d */
    private final uc3 f19131d;

    public d82(hv2 hv2Var, uc3 uc3Var, e32 e32Var, i32 i32Var) {
        this.f19130c = hv2Var;
        this.f19131d = uc3Var;
        this.f19129b = i32Var;
        this.f19128a = e32Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static final String m21279e(String str, int i11) {
        return "Error from: " + str + ", code: " + i11;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        if (!iq2Var.f22349u.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(final tq2 tq2Var, final iq2 iq2Var) {
        final f32 f32Var;
        Iterator it = iq2Var.f22349u.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    f32Var = this.f19128a.mo21611a((String) it.next(), iq2Var.f22351w);
                    break;
                } catch (zzfek unused) {
                }
            } else {
                f32Var = null;
                break;
            }
        }
        if (f32Var == null) {
            return kc3.m23876h(new zzekd("Unable to instantiate mediation adapter class."));
        }
        pl0 pl0Var = new pl0();
        f32Var.f19950c.mo22745E(new c82(this, f32Var, pl0Var));
        if (iq2Var.f22300N) {
            Bundle bundle = tq2Var.f28472a.f26941a.f19398d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        hv2 hv2Var = this.f19130c;
        return qu2.m25891d(new ku2() { // from class: com.google.android.gms.internal.ads.z72
            @Override // com.google.android.gms.internal.ads.ku2
            public final void zza() {
                d82.this.m21281d(tq2Var, iq2Var, f32Var);
            }
        }, this.f19131d, bv2.ADAPTER_LOAD_AD_SYN, hv2Var).m28019b(bv2.ADAPTER_LOAD_AD_ACK).m28021d(pl0Var).m28019b(bv2.ADAPTER_WRAP_ADAPTER).m28022e(new ju2() { // from class: com.google.android.gms.internal.ads.a82
            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                return d82.this.m21280c(tq2Var, iq2Var, f32Var, (Void) obj);
            }
        }).m28018a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object m21280c(tq2 tq2Var, iq2 iq2Var, f32 f32Var, Void r42) {
        return this.f19129b.mo20427a(tq2Var, iq2Var, f32Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m21281d(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        this.f19129b.mo20428b(tq2Var, iq2Var, f32Var);
    }
}
