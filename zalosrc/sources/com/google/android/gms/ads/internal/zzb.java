package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.zzcaq;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final yh0 zzc;
    private final zzcaq zzd = new zzcaq(false, Collections.emptyList());

    public zzb(Context context, yh0 yh0Var, zzcaq zzcaqVar) {
        this.zza = context;
        this.zzc = yh0Var;
    }

    private final boolean zzd() {
        yh0 yh0Var = this.zzc;
        if ((yh0Var != null && yh0Var.zza().f32023u) || this.zzd.f31996p) {
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (!zzd()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        yh0 yh0Var = this.zzc;
        if (yh0Var != null) {
            yh0Var.mo26962a(str, null, 3);
            return;
        }
        zzcaq zzcaqVar = this.zzd;
        if (zzcaqVar.f31996p && (list = zzcaqVar.f31997q) != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        if (zzd() && !this.zzb) {
            return false;
        }
        return true;
    }
}
