package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kw1 implements zzo, ls0 {

    /* renamed from: p */
    private final Context f23619p;

    /* renamed from: q */
    private final zzcgv f23620q;

    /* renamed from: r */
    private cw1 f23621r;

    /* renamed from: s */
    private zq0 f23622s;

    /* renamed from: t */
    private boolean f23623t;

    /* renamed from: u */
    private boolean f23624u;

    /* renamed from: v */
    private long f23625v;

    /* renamed from: w */
    private zzcy f23626w;

    /* renamed from: x */
    private boolean f23627x;

    public kw1(Context context, zzcgv zzcgvVar) {
        this.f23619p = context;
        this.f23620q = zzcgvVar;
    }

    /* renamed from: f */
    private final synchronized boolean m24048f(zzcy zzcyVar) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
            yk0.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(cs2.m20999d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f23621r == null) {
            yk0.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(cs2.m20999d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f23623t && !this.f23624u) {
            if (zzt.zzB().mo105913a() >= this.f23625v + ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21009H7)).intValue()) {
                return true;
            }
        }
        yk0.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzcyVar.zze(cs2.m20999d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    /* renamed from: a */
    public final Activity m24049a() {
        zq0 zq0Var = this.f23622s;
        if (zq0Var != null && !zq0Var.mo26709v()) {
            return this.f23622s.zzk();
        }
        return null;
    }

    /* renamed from: b */
    public final void m24050b(cw1 cw1Var) {
        this.f23621r = cw1Var;
    }

    /* renamed from: c */
    public final /* synthetic */ void m24051c(String str) {
        JSONObject m21174e = this.f23621r.m21174e();
        if (!TextUtils.isEmpty(str)) {
            try {
                m21174e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f23622s.mo23553c("window.inspectorInfo", m21174e.toString());
    }

    /* renamed from: d */
    public final synchronized void m24052d(zzcy zzcyVar, d40 d40Var, o40 o40Var) {
        if (!m24048f(zzcyVar)) {
            return;
        }
        try {
            zzt.zzz();
            zq0 m24980a = nr0.m24980a(this.f23619p, ps0.m25531a(), "", false, false, null, null, this.f23620q, null, null, null, C4808ns.m24989a(), null, null);
            this.f23622s = m24980a;
            ns0 zzP = m24980a.zzP();
            if (zzP == null) {
                yk0.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    zzcyVar.zze(cs2.m20999d(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            this.f23626w = zzcyVar;
            zzP.mo23372i0(null, null, null, null, null, false, null, null, null, null, null, null, null, null, d40Var, null, new u40(this.f23619p), o40Var);
            zzP.mo23358F(this);
            this.f23622s.loadUrl((String) zzay.zzc().m21823b(AbstractC4554gx.f20989F7));
            zzt.zzi();
            zzm.zza(this.f23619p, new AdOverlayInfoParcel(this, this.f23622s, 1, this.f23620q), true);
            this.f23625v = zzt.zzB().mo105913a();
        } catch (zzcna e11) {
            yk0.zzk("Failed to obtain a web view for the ad inspector", e11);
            try {
                zzcyVar.zze(cs2.m20999d(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException unused2) {
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m24053e(String str) {
        if (this.f23623t && this.f23624u) {
            kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jw1

                /* renamed from: q */
                public final /* synthetic */ String f23012q;

                public /* synthetic */ jw1(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kw1.this.m24051c(r2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ls0
    public final synchronized void zza(boolean z11) {
        if (z11) {
            zze.zza("Ad inspector loaded.");
            this.f23623t = true;
            m24053e("");
        } else {
            yk0.zzj("Ad inspector failed to load.");
            try {
                zzcy zzcyVar = this.f23626w;
                if (zzcyVar != null) {
                    zzcyVar.zze(cs2.m20999d(17, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.f23627x = true;
            this.f23622s.destroy();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.f23624u = true;
        m24053e("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i11) {
        this.f23622s.destroy();
        if (!this.f23627x) {
            zze.zza("Inspector closed.");
            zzcy zzcyVar = this.f23626w;
            if (zzcyVar != null) {
                try {
                    zzcyVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f23624u = false;
        this.f23623t = false;
        this.f23625v = 0L;
        this.f23627x = false;
        this.f23626w = null;
    }
}
