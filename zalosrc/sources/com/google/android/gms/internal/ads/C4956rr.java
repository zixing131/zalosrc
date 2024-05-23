package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;

/* renamed from: com.google.android.gms.internal.ads.rr */
/* loaded from: classes2.dex */
public final class C4956rr {

    /* renamed from: a */
    private zzbs f27350a;

    /* renamed from: b */
    private final Context f27351b;

    /* renamed from: c */
    private final String f27352c;

    /* renamed from: d */
    private final zzdr f27353d;

    /* renamed from: e */
    private final int f27354e;

    /* renamed from: f */
    private final AppOpenAd.AppOpenAdLoadCallback f27355f;

    /* renamed from: g */
    private final s90 f27356g = new s90();

    /* renamed from: h */
    private final zzp f27357h = zzp.zza;

    public C4956rr(Context context, String str, zzdr zzdrVar, int i11, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f27351b = context;
        this.f27352c = str;
        this.f27353d = zzdrVar;
        this.f27354e = i11;
        this.f27355f = appOpenAdLoadCallback;
    }

    /* renamed from: a */
    public final void m26155a() {
        try {
            this.f27350a = zzaw.zza().zzd(this.f27351b, zzq.zzb(), this.f27352c, this.f27356g);
            com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(this.f27354e);
            zzbs zzbsVar = this.f27350a;
            if (zzbsVar != null) {
                zzbsVar.zzI(zzwVar);
                this.f27350a.zzH(new BinderC4474er(this.f27355f, this.f27352c));
                this.f27350a.zzaa(this.f27357h.zza(this.f27351b, this.f27353d));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
