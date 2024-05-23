package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class o71 extends zzdg {

    /* renamed from: p */
    private final String f25464p;

    /* renamed from: q */
    private final String f25465q;

    /* renamed from: r */
    private final String f25466r;

    /* renamed from: s */
    private final String f25467s;

    /* renamed from: t */
    private final List f25468t;

    /* renamed from: u */
    private final long f25469u;

    /* renamed from: v */
    private final String f25470v;

    /* renamed from: w */
    private final g32 f25471w;

    /* renamed from: x */
    private final Bundle f25472x;

    public o71(iq2 iq2Var, String str, g32 g32Var, lq2 lq2Var, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (iq2Var == null) {
            str3 = null;
        } else {
            str3 = iq2Var.f22318c0;
        }
        this.f25465q = str3;
        this.f25466r = str2;
        if (lq2Var == null) {
            str4 = null;
        } else {
            str4 = lq2Var.f24014b;
        }
        this.f25467s = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str6 = iq2Var.f22351w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f25464p = str6 != null ? str6 : str;
        this.f25468t = g32Var.m22270c();
        this.f25471w = g32Var;
        this.f25469u = zzt.zzB().mo105913a() / 1000;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21127T5)).booleanValue() && lq2Var != null) {
            this.f25472x = lq2Var.f24022j;
        } else {
            this.f25472x = new Bundle();
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21149V7)).booleanValue() && lq2Var != null && !TextUtils.isEmpty(lq2Var.f24020h)) {
            str5 = lq2Var.f24020h;
        } else {
            str5 = "";
        }
        this.f25470v = str5;
    }

    public final long zzc() {
        return this.f25469u;
    }

    public final String zzd() {
        return this.f25470v;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.f25472x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() {
        g32 g32Var = this.f25471w;
        if (g32Var != null) {
            return g32Var.m22268a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.f25464p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.f25466r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzi() {
        return this.f25465q;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzj() {
        return this.f25468t;
    }

    public final String zzk() {
        return this.f25467s;
    }
}
