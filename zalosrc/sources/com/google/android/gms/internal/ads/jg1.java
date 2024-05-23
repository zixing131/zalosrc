package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class jg1 extends v31 {

    /* renamed from: i */
    private final Context f22808i;

    /* renamed from: j */
    private final WeakReference f22809j;

    /* renamed from: k */
    private final ye1 f22810k;

    /* renamed from: l */
    private final sh1 f22811l;

    /* renamed from: m */
    private final p41 f22812m;

    /* renamed from: n */
    private final j03 f22813n;

    /* renamed from: o */
    private final j81 f22814o;

    /* renamed from: p */
    private boolean f22815p;

    public jg1(u31 u31Var, Context context, zq0 zq0Var, ye1 ye1Var, sh1 sh1Var, p41 p41Var, j03 j03Var, j81 j81Var) {
        super(u31Var);
        this.f22815p = false;
        this.f22808i = context;
        this.f22809j = new WeakReference(zq0Var);
        this.f22810k = ye1Var;
        this.f22811l = sh1Var;
        this.f22812m = p41Var;
        this.f22813n = j03Var;
        this.f22814o = j81Var;
    }

    public final void finalize() {
        try {
            zq0 zq0Var = (zq0) this.f22809j.get();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21077O5)).booleanValue()) {
                if (!this.f22815p && zq0Var != null) {
                    kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ig1
                        public /* synthetic */ ig1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zq0.this.destroy();
                        }
                    });
                }
            } else if (zq0Var != null) {
                zq0Var.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* renamed from: h */
    public final boolean m23612h() {
        return this.f22812m.m25397a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /* renamed from: i */
    public final boolean m23613i(boolean z11, Activity activity) {
        this.f22810k.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21427y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.f22808i)) {
                yk0.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f22814o.zzb();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21437z0)).booleanValue()) {
                    this.f22813n.m23498a(this.f29152a.f28473b.f27823b.f24014b);
                }
                return false;
            }
        }
        if (this.f22815p) {
            yk0.zzj("The interstitial ad has been showed.");
            this.f22814o.mo20033a(cs2.m20999d(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.f22815p) {
            if (activity == null) {
                activity2 = this.f22808i;
            }
            try {
                this.f22811l.mo21616a(z11, activity2, this.f22814o);
                this.f22810k.zza();
                this.f22815p = true;
                return true;
            } catch (zzdmo e11) {
                this.f22814o.mo20034l0(e11);
            }
        }
        return false;
    }
}
