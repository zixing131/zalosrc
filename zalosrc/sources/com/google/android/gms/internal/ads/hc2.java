package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class hc2 implements rh2 {

    /* renamed from: a */
    public final zzq f21625a;

    /* renamed from: b */
    public final String f21626b;

    /* renamed from: c */
    public final boolean f21627c;

    /* renamed from: d */
    public final String f21628d;

    /* renamed from: e */
    public final float f21629e;

    /* renamed from: f */
    public final int f21630f;

    /* renamed from: g */
    public final int f21631g;

    /* renamed from: h */
    public final String f21632h;

    /* renamed from: i */
    public final boolean f21633i;

    public hc2(zzq zzqVar, String str, boolean z11, String str2, float f11, int i11, int i12, String str3, boolean z12) {
        AbstractC4205o.m19723l(zzqVar, "the adSize must not be null");
        this.f21625a = zzqVar;
        this.f21626b = str;
        this.f21627c = z11;
        this.f21628d = str2;
        this.f21629e = f11;
        this.f21630f = i11;
        this.f21631g = i12;
        this.f21632h = str3;
        this.f21633i = z12;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        boolean z11;
        boolean z12;
        Bundle bundle = (Bundle) obj;
        if (this.f21625a.zze == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        nr2.m24987f(bundle, "smart_w", "full", z11);
        if (this.f21625a.zzb == -2) {
            z12 = true;
        } else {
            z12 = false;
        }
        nr2.m24987f(bundle, "smart_h", "auto", z12);
        nr2.m24988g(bundle, "ene", true, this.f21625a.zzj);
        nr2.m24987f(bundle, "rafmt", "102", this.f21625a.zzm);
        nr2.m24987f(bundle, "rafmt", "103", this.f21625a.zzn);
        nr2.m24987f(bundle, "rafmt", "105", this.f21625a.zzo);
        nr2.m24988g(bundle, "inline_adaptive_slot", true, this.f21633i);
        nr2.m24988g(bundle, "interscroller_slot", true, this.f21625a.zzo);
        nr2.m24984c(bundle, "format", this.f21626b);
        nr2.m24987f(bundle, "fluid", "height", this.f21627c);
        nr2.m24987f(bundle, "sz", this.f21628d, !TextUtils.isEmpty(r0));
        bundle.putFloat("u_sd", this.f21629e);
        bundle.putInt("sw", this.f21630f);
        bundle.putInt("sh", this.f21631g);
        nr2.m24987f(bundle, "sc", this.f21632h, !TextUtils.isEmpty(r0));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.f21625a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f21625a.zzb);
            bundle2.putInt("width", this.f21625a.zze);
            bundle2.putBoolean("is_fluid_height", this.f21625a.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
