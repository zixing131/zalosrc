package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class kb2 implements db2 {

    /* renamed from: a */
    private final br2 f23201a;

    /* renamed from: b */
    private final vs0 f23202b;

    /* renamed from: c */
    private final Context f23203c;

    /* renamed from: d */
    private final ab2 f23204d;

    /* renamed from: e */
    private final xw2 f23205e;

    /* renamed from: f */
    private j41 f23206f;

    public kb2(vs0 vs0Var, Context context, ab2 ab2Var, br2 br2Var) {
        this.f23202b = vs0Var;
        this.f23203c = context;
        this.f23204d = ab2Var;
        this.f23201a = br2Var;
        this.f23205e = vs0Var.mo22590B();
        br2Var.m20683L(ab2Var.m20051d());
    }

    @Override // com.google.android.gms.internal.ads.db2
    /* renamed from: a */
    public final boolean mo21338a(zzl zzlVar, String str, bb2 bb2Var, cb2 cb2Var) {
        vw2 vw2Var;
        zzt.zzp();
        if (zzs.zzD(this.f23203c) && zzlVar.zzs == null) {
            yk0.zzg("Failed to load the ad because app ID is missing.");
            this.f23202b.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fb2
                @Override // java.lang.Runnable
                public final void run() {
                    kb2.this.m23866e();
                }
            });
            return false;
        }
        if (str == null) {
            yk0.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.f23202b.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gb2
                @Override // java.lang.Runnable
                public final void run() {
                    kb2.this.m23867f();
                }
            });
            return false;
        }
        wr2.m27704a(this.f23203c, zzlVar.zzf);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && zzlVar.zzf) {
            this.f23202b.mo22603o().m21182m(true);
        }
        int i11 = ((eb2) bb2Var).f19581a;
        br2 br2Var = this.f23201a;
        br2Var.m20693e(zzlVar);
        br2Var.m20688Q(i11);
        dr2 m20695g = br2Var.m20695g();
        kw2 m23765b = jw2.m23765b(this.f23203c, uw2.m27080f(m20695g), 8, zzlVar);
        zzbz zzbzVar = m20695g.f19408n;
        if (zzbzVar != null) {
            this.f23204d.m20051d().m24868Y(zzbzVar);
        }
        gi1 mo22600l = this.f23202b.mo22600l();
        f71 f71Var = new f71();
        f71Var.m21958c(this.f23203c);
        f71Var.m21961f(m20695g);
        mo22600l.mo20240e(f71Var.m21962g());
        ld1 ld1Var = new ld1();
        ld1Var.m24225n(this.f23204d.m20051d(), this.f23202b.mo22592b());
        mo22600l.mo20241h(ld1Var.m24228q());
        mo22600l.mo20238c(this.f23204d.m20050c());
        mo22600l.mo20239d(new o11(null));
        hi1 zzg = mo22600l.zzg();
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            vw2 mo21064e = zzg.mo21064e();
            mo21064e.m27367h(8);
            mo21064e.m27361b(zzlVar.zzp);
            vw2Var = mo21064e;
        } else {
            vw2Var = null;
        }
        this.f23202b.mo22614z().m28593c(1);
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        ScheduledExecutorService mo22593c = this.f23202b.mo22593c();
        a51 mo21060a = zzg.mo21060a();
        j41 j41Var = new j41(uc3Var, mo22593c, mo21060a.m19995h(mo21060a.m19996i()));
        this.f23206f = j41Var;
        j41Var.m23519e(new jb2(this, cb2Var, vw2Var, m23765b, zzg));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m23866e() {
        this.f23204d.m20048a().mo20715a(cs2.m20999d(4, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m23867f() {
        this.f23204d.m20048a().mo20715a(cs2.m20999d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.db2
    public final boolean zza() {
        j41 j41Var = this.f23206f;
        if (j41Var != null && j41Var.m23520f()) {
            return true;
        }
        return false;
    }
}
