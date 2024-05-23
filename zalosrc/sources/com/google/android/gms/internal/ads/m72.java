package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m72 implements sh1 {

    /* renamed from: a */
    private final Context f24417a;

    /* renamed from: b */
    private final jq1 f24418b;

    /* renamed from: c */
    private final dr2 f24419c;

    /* renamed from: d */
    private final zzcgv f24420d;

    /* renamed from: e */
    private final iq2 f24421e;

    /* renamed from: f */
    private final tc3 f24422f;

    /* renamed from: g */
    private final zq0 f24423g;

    /* renamed from: h */
    private final f40 f24424h;

    /* renamed from: i */
    private final boolean f24425i;

    public m72(Context context, jq1 jq1Var, dr2 dr2Var, zzcgv zzcgvVar, iq2 iq2Var, tc3 tc3Var, zq0 zq0Var, f40 f40Var, boolean z11) {
        this.f24417a = context;
        this.f24418b = jq1Var;
        this.f24419c = dr2Var;
        this.f24420d = zzcgvVar;
        this.f24421e = iq2Var;
        this.f24422f = tc3Var;
        this.f24423g = zq0Var;
        this.f24424h = f40Var;
        this.f24425i = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    @Override // com.google.android.gms.internal.ads.sh1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo21616a(boolean z11, Context context, j81 j81Var) {
        f40 f40Var;
        zq0 zq0Var;
        zq0 zq0Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        float f11;
        op1 op1Var = (op1) kc3.m23885q(this.f24422f);
        try {
            iq2 iq2Var = this.f24421e;
            if (!this.f24423g.mo26688T()) {
                zq0Var2 = this.f24423g;
            } else {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20992G0)).booleanValue()) {
                    zq0Var2 = this.f24423g;
                } else {
                    zq0 m23723a = this.f24418b.m23723a(this.f24419c.f19399e, null, null);
                    t40.m26563b(m23723a, op1Var.mo24387i());
                    nq1 nq1Var = new nq1();
                    nq1Var.m24976a(this.f24417a, (View) m23723a);
                    iq1 mo24390l = op1Var.mo24390l();
                    if (this.f24425i) {
                        f40Var = this.f24424h;
                    } else {
                        f40Var = null;
                    }
                    mo24390l.m23337i(m23723a, true, f40Var);
                    m23723a.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.k72

                        /* renamed from: q */
                        public final /* synthetic */ zq0 f23180q;

                        public /* synthetic */ k72(zq0 m23723a2) {
                            r2 = m23723a2;
                        }

                        @Override // com.google.android.gms.internal.ads.ls0
                        public final void zza(boolean z15) {
                            nq1 nq1Var2 = nq1.this;
                            zq0 zq0Var3 = r2;
                            nq1Var2.m24977b();
                            zq0Var3.mo26715z0();
                            zq0Var3.zzP().zzp();
                        }
                    });
                    m23723a2.zzP().mo23362J(new ms0() { // from class: com.google.android.gms.internal.ads.l72
                        public /* synthetic */ l72() {
                        }

                        @Override // com.google.android.gms.internal.ads.ms0
                        public final void zza() {
                            zq0.this.zzZ();
                        }
                    });
                    mq2 mq2Var = iq2Var.f22348t;
                    m23723a2.mo26703p0(mq2Var.f24722b, mq2Var.f24721a, null);
                    zq0Var = m23723a2;
                    zq0Var.mo26705r0(true);
                    if (!this.f24425i) {
                        z12 = this.f24424h.m21945e(false);
                    } else {
                        z12 = false;
                    }
                    zzt.zzp();
                    boolean zzE = zzs.zzE(this.f24417a);
                    z13 = this.f24425i;
                    if (!z13) {
                        z14 = this.f24424h.m21944d();
                    } else {
                        z14 = false;
                    }
                    if (!z13) {
                        f11 = this.f24424h.m21941a();
                    } else {
                        f11 = 0.0f;
                    }
                    iq2 iq2Var2 = this.f24421e;
                    zzj zzjVar = new zzj(z12, zzE, z14, f11, -1, z11, iq2Var2.f22302P, iq2Var2.f22303Q);
                    if (j81Var != null) {
                        j81Var.zzf();
                    }
                    zzt.zzi();
                    ih1 mo24388j = op1Var.mo24388j();
                    iq2 iq2Var3 = this.f24421e;
                    int i11 = iq2Var3.f22304R;
                    zzcgv zzcgvVar = this.f24420d;
                    String str = iq2Var3.f22289C;
                    mq2 mq2Var2 = iq2Var3.f22348t;
                    zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo24388j, (zzz) null, zq0Var, i11, zzcgvVar, str, zzjVar, mq2Var2.f24722b, mq2Var2.f24721a, this.f24419c.f19400f, j81Var), true);
                }
            }
            zq0Var = zq0Var2;
            zq0Var.mo26705r0(true);
            if (!this.f24425i) {
            }
            zzt.zzp();
            boolean zzE2 = zzs.zzE(this.f24417a);
            z13 = this.f24425i;
            if (!z13) {
            }
            if (!z13) {
            }
            iq2 iq2Var22 = this.f24421e;
            zzj zzjVar2 = new zzj(z12, zzE2, z14, f11, -1, z11, iq2Var22.f22302P, iq2Var22.f22303Q);
            if (j81Var != null) {
            }
            zzt.zzi();
            ih1 mo24388j2 = op1Var.mo24388j();
            iq2 iq2Var32 = this.f24421e;
            int i112 = iq2Var32.f22304R;
            zzcgv zzcgvVar2 = this.f24420d;
            String str2 = iq2Var32.f22289C;
            mq2 mq2Var22 = iq2Var32.f22348t;
            zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo24388j2, (zzz) null, zq0Var, i112, zzcgvVar2, str2, zzjVar2, mq2Var22.f24722b, mq2Var22.f24721a, this.f24419c.f19400f, j81Var), true);
        } catch (zzcna e11) {
            yk0.zzh("", e11);
        }
    }
}
