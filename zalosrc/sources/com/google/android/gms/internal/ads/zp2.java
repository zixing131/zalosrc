package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class zp2 extends tg0 {

    /* renamed from: p */
    private final up2 f31666p;

    /* renamed from: q */
    private final kp2 f31667q;

    /* renamed from: r */
    private final String f31668r;

    /* renamed from: s */
    private final uq2 f31669s;

    /* renamed from: t */
    private final Context f31670t;

    /* renamed from: u */
    private final zzcgv f31671u;

    /* renamed from: v */
    private np1 f31672v;

    /* renamed from: w */
    private boolean f31673w = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20932A0)).booleanValue();

    public zp2(String str, up2 up2Var, Context context, kp2 kp2Var, uq2 uq2Var, zzcgv zzcgvVar) {
        this.f31668r = str;
        this.f31666p = up2Var;
        this.f31667q = kp2Var;
        this.f31669s = uq2Var;
        this.f31670t = context;
        this.f31671u = zzcgvVar;
    }

    /* renamed from: W4 */
    private final synchronized void m28584W4(zzl zzlVar, bh0 bh0Var, int i11) {
        try {
            boolean z11 = false;
            if (((Boolean) AbstractC5149wy.f30264l.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                    z11 = true;
                }
            }
            if (this.f31671u.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
            }
            this.f31667q.m24012r(bh0Var);
            zzt.zzp();
            if (zzs.zzD(this.f31670t) && zzlVar.zzs == null) {
                yk0.zzg("Failed to load the ad because app ID is missing.");
                this.f31667q.mo20715a(cs2.m20999d(4, null, null));
                return;
            }
            if (this.f31672v != null) {
                return;
            }
            mp2 mp2Var = new mp2(null);
            this.f31666p.m27037i(i11);
            this.f31666p.mo21338a(zzlVar, this.f31668r, mp2Var, new yp2(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final Bundle zzb() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        np1 np1Var = this.f31672v;
        if (np1Var != null) {
            return np1Var.m24969h();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final zzdh zzc() {
        np1 np1Var;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21097Q5)).booleanValue() || (np1Var = this.f31672v) == null) {
            return null;
        }
        return np1Var.m27145c();
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final rg0 zzd() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        np1 np1Var = this.f31672v;
        if (np1Var != null) {
            return np1Var.m24970i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized String zze() {
        np1 np1Var = this.f31672v;
        if (np1Var != null && np1Var.m27145c() != null) {
            return np1Var.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzf(zzl zzlVar, bh0 bh0Var) {
        m28584W4(zzlVar, bh0Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzg(zzl zzlVar, bh0 bh0Var) {
        m28584W4(zzlVar, bh0Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzh(boolean z11) {
        AbstractC4205o.m19717f("setImmersiveMode must be called on the main UI thread.");
        this.f31673w = z11;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzi(zzdb zzdbVar) {
        if (zzdbVar == null) {
            this.f31667q.m24009k(null);
        } else {
            this.f31667q.m24009k(new wp2(this, zzdbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzj(zzde zzdeVar) {
        AbstractC4205o.m19717f("setOnPaidEventListener must be called on the main UI thread.");
        this.f31667q.m24010n(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzk(xg0 xg0Var) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        this.f31667q.m24011o(xg0Var);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzl(zzccz zzcczVar) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        uq2 uq2Var = this.f31669s;
        uq2Var.f29029a = zzcczVar.f32016p;
        uq2Var.f29030b = zzcczVar.f32017q;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzm(InterfaceC4271b interfaceC4271b) {
        zzn(interfaceC4271b, this.f31673w);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final synchronized void zzn(InterfaceC4271b interfaceC4271b, boolean z11) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        if (this.f31672v == null) {
            yk0.zzj("Rewarded can not be shown before loaded");
            this.f31667q.mo22412z(cs2.m20999d(9, null, null));
        } else {
            this.f31672v.m24975n(z11, (Activity) BinderC4273d.m19914Q(interfaceC4271b));
        }
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final boolean zzo() {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        np1 np1Var = this.f31672v;
        if (np1Var != null && !np1Var.m24973l()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzp(ch0 ch0Var) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        this.f31667q.m24007Z(ch0Var);
    }
}
