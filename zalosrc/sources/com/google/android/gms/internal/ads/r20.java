package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* loaded from: classes2.dex */
public final class r20 {

    /* renamed from: a */
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f27043a;

    /* renamed from: b */
    private final NativeCustomTemplateAd.OnCustomClickListener f27044b;

    /* renamed from: c */
    private NativeCustomTemplateAd f27045c;

    public r20(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f27043a = onCustomTemplateAdLoadedListener;
        this.f27044b = onCustomClickListener;
    }

    /* renamed from: f */
    public final synchronized NativeCustomTemplateAd m25943f(e10 e10Var) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f27045c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        f10 f10Var = new f10(e10Var);
        this.f27045c = f10Var;
        return f10Var;
    }

    /* renamed from: d */
    public final p10 m25944d() {
        if (this.f27044b == null) {
            return null;
        }
        return new o20(this, null);
    }

    /* renamed from: e */
    public final s10 m25945e() {
        return new q20(this, null);
    }
}
