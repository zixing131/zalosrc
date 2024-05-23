package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class k11 extends v31 {

    /* renamed from: i */
    private final zq0 f23055i;

    /* renamed from: j */
    private final int f23056j;

    /* renamed from: k */
    private final Context f23057k;

    /* renamed from: l */
    private final s01 f23058l;

    /* renamed from: m */
    private final sh1 f23059m;

    /* renamed from: n */
    private final ye1 f23060n;

    /* renamed from: o */
    private final j81 f23061o;

    /* renamed from: p */
    private final boolean f23062p;

    /* renamed from: q */
    private boolean f23063q;

    public k11(u31 u31Var, Context context, zq0 zq0Var, int i11, s01 s01Var, sh1 sh1Var, ye1 ye1Var, j81 j81Var) {
        super(u31Var);
        this.f23063q = false;
        this.f23055i = zq0Var;
        this.f23057k = context;
        this.f23056j = i11;
        this.f23058l = s01Var;
        this.f23059m = sh1Var;
        this.f23060n = ye1Var;
        this.f23061o = j81Var;
        this.f23062p = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21381t4)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.v31
    /* renamed from: a */
    public final void mo23795a() {
        super.mo23795a();
        zq0 zq0Var = this.f23055i;
        if (zq0Var != null) {
            zq0Var.destroy();
        }
    }

    /* renamed from: h */
    public final int m23796h() {
        return this.f23056j;
    }

    /* renamed from: i */
    public final void m23797i(InterfaceC4437dr interfaceC4437dr) {
        zq0 zq0Var = this.f23055i;
        if (zq0Var != null) {
            zq0Var.mo26708u0(interfaceC4437dr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r3 = r3;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23798j(Activity activity, InterfaceC4919qr interfaceC4919qr, boolean z11) {
        Activity activity2;
        if (activity == null) {
            activity2 = this.f23057k;
        }
        if (this.f23062p) {
            this.f23060n.zzb();
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21427y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(activity2)) {
                yk0.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f23061o.zzb();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21437z0)).booleanValue()) {
                    new j03(activity2.getApplicationContext(), zzt.zzt().zzb()).m23498a(this.f29152a.f28473b.f27823b.f24014b);
                    return;
                }
                return;
            }
        }
        if (this.f23063q) {
            yk0.zzj("App open interstitial ad is already visible.");
            this.f23061o.mo20033a(cs2.m20999d(10, null, null));
        }
        if (!this.f23063q) {
            try {
                this.f23059m.mo21616a(z11, activity2, this.f23061o);
                if (this.f23062p) {
                    this.f23060n.zza();
                }
                this.f23063q = true;
            } catch (zzdmo e11) {
                this.f23061o.mo20034l0(e11);
            }
        }
    }

    /* renamed from: k */
    public final void m23799k(long j11, int i11) {
        this.f23058l.m26220a(j11, i11);
    }
}
