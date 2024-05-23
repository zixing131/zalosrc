package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import java.util.Collections;

/* loaded from: classes2.dex */
public final class o92 extends zzbr {

    /* renamed from: p */
    private final Context f25503p;

    /* renamed from: q */
    private final zzbf f25504q;

    /* renamed from: r */
    private final dr2 f25505r;

    /* renamed from: s */
    private final s11 f25506s;

    /* renamed from: t */
    private final ViewGroup f25507t;

    public o92(Context context, zzbf zzbfVar, dr2 dr2Var, s11 s11Var) {
        this.f25503p = context;
        this.f25504q = zzbfVar;
        this.f25505r = dr2Var;
        this.f25506s = s11Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View mo20377i = s11Var.mo20377i();
        zzt.zzp();
        frameLayout.addView(mo20377i, zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f25507t = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        this.f25506s.mo20381m();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        this.f25506s.m27146d().m27183D0(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
        yk0.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
        yk0.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        yk0.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzqVar) {
        AbstractC4205o.m19717f("setAdSize must be called on the main UI thread.");
        s11 s11Var = this.f25506s;
        if (s11Var != null) {
            s11Var.mo20382n(this.f25507t, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
        na2 na2Var = this.f25505r.f19397c;
        if (na2Var != null) {
            na2Var.m24868Y(zzbzVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(InterfaceC4770mr interfaceC4770mr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z11) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(xd0 xd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z11) {
        yk0.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(InterfaceC4407cy interfaceC4407cy) {
        yk0.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
        yk0.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(ae0 ae0Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(ig0 ig0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzffVar) {
        yk0.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(InterfaceC4271b interfaceC4271b) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzlVar) {
        yk0.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcdVar) {
        yk0.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        yk0.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        AbstractC4205o.m19717f("getAdSize must be called on the main UI thread.");
        return hr2.m23005a(this.f25503p, Collections.singletonList(this.f25506s.mo20379k()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return this.f25504q;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return this.f25505r.f19408n;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        return this.f25506s.m27145c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return this.f25506s.mo20378j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final InterfaceC4271b zzn() {
        return BinderC4273d.m19913I3(this.f25507t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        return this.f25505r.f19400f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        if (this.f25506s.m27145c() != null) {
            return this.f25506s.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        if (this.f25506s.m27145c() != null) {
            return this.f25506s.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        this.f25506s.mo23795a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzlVar, zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        this.f25506s.m27146d().m27182C0(null);
    }
}
