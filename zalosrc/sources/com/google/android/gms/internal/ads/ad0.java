package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes2.dex */
public final class ad0 {

    /* renamed from: a */
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener f17004a;

    /* renamed from: b */
    private final NativeCustomFormatAd.OnCustomClickListener f17005b;

    /* renamed from: c */
    private NativeCustomFormatAd f17006c;

    public ad0(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.f17004a = onCustomFormatAdLoadedListener;
        this.f17005b = onCustomClickListener;
    }

    /* renamed from: f */
    public final synchronized NativeCustomFormatAd m20083f(e10 e10Var) {
        NativeCustomFormatAd nativeCustomFormatAd = this.f17006c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        bd0 bd0Var = new bd0(e10Var);
        this.f17006c = bd0Var;
        return bd0Var;
    }

    /* renamed from: a */
    public final p10 m20084a() {
        if (this.f17005b == null) {
            return null;
        }
        return new xc0(this, null);
    }

    /* renamed from: b */
    public final s10 m20085b() {
        return new zc0(this, null);
    }
}
