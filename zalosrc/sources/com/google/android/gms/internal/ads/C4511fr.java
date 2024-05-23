package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.BinderC4273d;

/* renamed from: com.google.android.gms.internal.ads.fr */
/* loaded from: classes2.dex */
public final class C4511fr extends AppOpenAd {

    /* renamed from: a */
    private final InterfaceC4658jr f20252a;

    /* renamed from: b */
    private final String f20253b;

    /* renamed from: c */
    private final BinderC4548gr f20254c = new BinderC4548gr();

    /* renamed from: d */
    FullScreenContentCallback f20255d;

    /* renamed from: e */
    private OnPaidEventListener f20256e;

    public C4511fr(InterfaceC4658jr interfaceC4658jr, String str) {
        this.f20252a = interfaceC4658jr;
        this.f20253b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f20253b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20255d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20256e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar;
        try {
            zzdhVar = this.f20252a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            zzdhVar = null;
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f20255d = fullScreenContentCallback;
        this.f20254c.m22513N(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z11) {
        try {
            this.f20252a.mo23002u2(z11);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f20256e = onPaidEventListener;
        try {
            this.f20252a.mo23001E1(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f20252a.mo23003x3(BinderC4273d.m19913I3(activity), this.f20254c);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
