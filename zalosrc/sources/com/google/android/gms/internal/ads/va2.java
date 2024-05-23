package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class va2 extends zzbr {

    /* renamed from: p */
    private final zzq f29240p;

    /* renamed from: q */
    private final Context f29241q;

    /* renamed from: r */
    private final jo2 f29242r;

    /* renamed from: s */
    private final String f29243s;

    /* renamed from: t */
    private final zzcgv f29244t;

    /* renamed from: u */
    private final na2 f29245u;

    /* renamed from: v */
    private final kp2 f29246v;

    /* renamed from: w */
    private jg1 f29247w;

    /* renamed from: x */
    private boolean f29248x = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20932A0)).booleanValue();

    public va2(Context context, zzq zzqVar, String str, jo2 jo2Var, na2 na2Var, kp2 kp2Var, zzcgv zzcgvVar) {
        this.f29240p = zzqVar;
        this.f29243s = str;
        this.f29241q = context;
        this.f29242r = jo2Var;
        this.f29245u = na2Var;
        this.f29246v = kp2Var;
        this.f29244t = zzcgvVar;
    }

    /* renamed from: I3 */
    private final synchronized boolean m27191I3() {
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null) {
            if (!jg1Var.m23612h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        AbstractC4205o.m19717f("resume must be called on the main UI thread.");
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null) {
            jg1Var.m27146d().m27183D0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
        AbstractC4205o.m19717f("setAdListener must be called on the main UI thread.");
        this.f29245u.m24872o(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        AbstractC4205o.m19717f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
        AbstractC4205o.m19717f("setAppEventListener must be called on the main UI thread.");
        this.f29245u.m24868Y(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(InterfaceC4770mr interfaceC4770mr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcgVar) {
        this.f29245u.m24869Z(zzcgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzL(boolean z11) {
        AbstractC4205o.m19717f("setImmersiveMode must be called on the main UI thread.");
        this.f29248x = z11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(xd0 xd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z11) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(InterfaceC4407cy interfaceC4407cy) {
        AbstractC4205o.m19717f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f29242r.m23701h(interfaceC4407cy);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
        AbstractC4205o.m19717f("setPaidEventListener must be called on the main UI thread.");
        this.f29245u.m24874t(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(ae0 ae0Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(ig0 ig0Var) {
        this.f29246v.m24013t(ig0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzW(InterfaceC4271b interfaceC4271b) {
        if (this.f29247w == null) {
            yk0.zzj("Interstitial can not be shown before loaded.");
            this.f29245u.mo22412z(cs2.m20999d(9, null, null));
        } else {
            this.f29247w.m23613i(this.f29248x, (Activity) BinderC4273d.m19914Q(interfaceC4271b));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
        AbstractC4205o.m19717f("showInterstitial must be called on the main UI thread.");
        jg1 jg1Var = this.f29247w;
        if (jg1Var == null) {
            yk0.zzj("Interstitial can not be shown before loaded.");
            this.f29245u.mo22412z(cs2.m20999d(9, null, null));
        } else {
            jg1Var.m23613i(this.f29248x, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.f29242r.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzZ() {
        AbstractC4205o.m19717f("isLoaded must be called on the main UI thread.");
        return m27191I3();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0051, B:15:0x0055, B:17:0x005e, B:21:0x0068, B:25:0x0070, B:28:0x0040), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(zzl zzlVar) {
        boolean z11;
        try {
            if (((Boolean) AbstractC5149wy.f30261i.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                    z11 = true;
                    if (this.f29244t.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                        AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
                    }
                    zzt.zzp();
                    if (!zzs.zzD(this.f29241q) && zzlVar.zzs == null) {
                        yk0.zzg("Failed to load the ad because app ID is missing.");
                        na2 na2Var = this.f29245u;
                        if (na2Var != null) {
                            na2Var.mo20715a(cs2.m20999d(4, null, null));
                        }
                        return false;
                    }
                    if (!m27191I3()) {
                        return false;
                    }
                    wr2.m27704a(this.f29241q, zzlVar.zzf);
                    this.f29247w = null;
                    return this.f29242r.mo21338a(zzlVar, this.f29243s, new co2(this.f29240p), new ua2(this));
                }
            }
            z11 = false;
            if (this.f29244t.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue()) {
            }
            AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
            zzt.zzp();
            if (!zzs.zzD(this.f29241q)) {
            }
            if (!m27191I3()) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        AbstractC4205o.m19717f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return this.f29245u.m24870g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return this.f29245u.m24871n();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized zzdh zzk() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21097Q5)).booleanValue()) {
            return null;
        }
        jg1 jg1Var = this.f29247w;
        if (jg1Var == null) {
            return null;
        }
        return jg1Var.m27145c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final InterfaceC4271b zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.f29243s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null && jg1Var.m27145c() != null) {
            return jg1Var.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null && jg1Var.m27145c() != null) {
            return jg1Var.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null) {
            jg1Var.m27146d().m27181B0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzlVar, zzbi zzbiVar) {
        this.f29245u.m24873r(zzbiVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        AbstractC4205o.m19717f("pause must be called on the main UI thread.");
        jg1 jg1Var = this.f29247w;
        if (jg1Var != null) {
            jg1Var.m27146d().m27182C0(null);
        }
    }
}
