package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.d33;
import com.google.android.gms.internal.ads.e33;
import com.google.android.gms.internal.ads.f33;
import com.google.android.gms.internal.ads.g33;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.n43;
import com.google.android.gms.internal.ads.p33;
import com.google.android.gms.internal.ads.r33;
import com.google.android.gms.internal.ads.s33;
import com.google.android.gms.internal.ads.t33;
import com.google.android.gms.internal.ads.u33;
import com.google.android.gms.internal.ads.zq0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzw {
    private s33 zzf;
    private zq0 zzc = null;
    private boolean zze = false;
    private String zza = null;
    private f33 zzd = null;
    private String zzb = null;

    private final u33 zzl() {
        t33 m26837c = u33.m26837c();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21130T8)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            m26837c.mo19974a(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                m26837c.mo19975b(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return m26837c.mo19976c();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zq0 zq0Var, Context context) {
        this.zzc = zq0Var;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        f33 f33Var;
        if (this.zze && (f33Var = this.zzd) != null) {
            f33Var.mo21878d(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final void zzc() {
        f33 f33Var;
        if (this.zze && (f33Var = this.zzd) != null) {
            d33 m21612c = e33.m21612c();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21130T8)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
                m21612c.mo21254a(this.zzb);
            } else {
                String str = this.zza;
                if (str != null) {
                    m21612c.mo21255b(str);
                } else {
                    zzf("Missing session token and/or appId", "onLMDupdate");
                }
            }
            f33Var.mo21875a(m21612c.mo21256c(), this.zzf);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        f33 f33Var;
        if (this.zze && (f33Var = this.zzd) != null) {
            f33Var.mo21876b(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str, Map map) {
        zq0 zq0Var = this.zzc;
        if (zq0Var != null) {
            zq0Var.mo23552V(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(r33 r33Var) {
        if (!TextUtils.isEmpty(r33Var.mo25948b())) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21130T8)).booleanValue()) {
                this.zza = r33Var.mo25948b();
            }
        }
        switch (r33Var.mo25947a()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, String.valueOf(r33Var.mo25947a()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(zq0 zq0Var, p33 p33Var) {
        if (zq0Var == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zq0Var;
        if (!this.zze && !zzk(zq0Var.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21130T8)).booleanValue()) {
            this.zzb = p33Var.mo25393g();
        }
        zzm();
        f33 f33Var = this.zzd;
        if (f33Var != null) {
            f33Var.mo21877c(p33Var, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!n43.m24853a(context)) {
            return false;
        }
        try {
            this.zzd = g33.m22275a(context);
        } catch (NullPointerException e11) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
