package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class np1 extends v31 {

    /* renamed from: i */
    private final Context f25286i;

    /* renamed from: j */
    private final WeakReference f25287j;

    /* renamed from: k */
    private final sh1 f25288k;

    /* renamed from: l */
    private final ye1 f25289l;

    /* renamed from: m */
    private final j81 f25290m;

    /* renamed from: n */
    private final r91 f25291n;

    /* renamed from: o */
    private final p41 f25292o;

    /* renamed from: p */
    private final rg0 f25293p;

    /* renamed from: q */
    private final j03 f25294q;

    /* renamed from: r */
    private final vq2 f25295r;

    /* renamed from: s */
    private boolean f25296s;

    public np1(u31 u31Var, Context context, zq0 zq0Var, sh1 sh1Var, ye1 ye1Var, j81 j81Var, r91 r91Var, p41 p41Var, iq2 iq2Var, j03 j03Var, vq2 vq2Var) {
        super(u31Var);
        String str;
        int i11;
        this.f25296s = false;
        this.f25286i = context;
        this.f25288k = sh1Var;
        this.f25287j = new WeakReference(zq0Var);
        this.f25289l = ye1Var;
        this.f25290m = j81Var;
        this.f25291n = r91Var;
        this.f25292o = p41Var;
        this.f25294q = j03Var;
        zzcce zzcceVar = iq2Var.f22337m;
        if (zzcceVar != null) {
            str = zzcceVar.f32014p;
        } else {
            str = "";
        }
        if (zzcceVar != null) {
            i11 = zzcceVar.f32015q;
        } else {
            i11 = 1;
        }
        this.f25293p = new lh0(str, i11);
        this.f25295r = vq2Var;
    }

    public final void finalize() {
        try {
            zq0 zq0Var = (zq0) this.f25287j.get();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21077O5)).booleanValue()) {
                if (!this.f25296s && zq0Var != null) {
                    kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mp1
                        public /* synthetic */ mp1() {
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
    public final Bundle m24969h() {
        return this.f25291n.m25997B0();
    }

    /* renamed from: i */
    public final rg0 m24970i() {
        return this.f25293p;
    }

    /* renamed from: j */
    public final vq2 m24971j() {
        return this.f25295r;
    }

    /* renamed from: k */
    public final boolean m24972k() {
        return this.f25292o.m25397a();
    }

    /* renamed from: l */
    public final boolean m24973l() {
        return this.f25296s;
    }

    /* renamed from: m */
    public final boolean m24974m() {
        zq0 zq0Var = (zq0) this.f25287j.get();
        if (zq0Var != null && !zq0Var.mo26688T()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /* renamed from: n */
    public final boolean m24975n(boolean z11, Activity activity) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21427y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.f25286i)) {
                yk0.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f25290m.zzb();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21437z0)).booleanValue()) {
                    this.f25294q.m23498a(this.f29152a.f28473b.f27823b.f24014b);
                }
                return false;
            }
        }
        if (this.f25296s) {
            yk0.zzj("The rewarded ad have been showed.");
            this.f25290m.mo20033a(cs2.m20999d(10, null, null));
            return false;
        }
        this.f25296s = true;
        this.f25289l.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f25286i;
        }
        try {
            this.f25288k.mo21616a(z11, activity2, this.f25290m);
            this.f25289l.zza();
            return true;
        } catch (zzdmo e11) {
            this.f25290m.mo20034l0(e11);
            return false;
        }
    }
}
