package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.wz */
/* loaded from: classes2.dex */
public final class BinderC5150wz extends j00 {

    /* renamed from: p */
    private final Drawable f30273p;

    /* renamed from: q */
    private final Uri f30274q;

    /* renamed from: r */
    private final double f30275r;

    /* renamed from: s */
    private final int f30276s;

    /* renamed from: t */
    private final int f30277t;

    public BinderC5150wz(Drawable drawable, Uri uri, double d11, int i11, int i12) {
        this.f30273p = drawable;
        this.f30274q = uri;
        this.f30275r = d11;
        this.f30276s = i11;
        this.f30277t = i12;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final double zzb() {
        return this.f30275r;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final int zzc() {
        return this.f30277t;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final int zzd() {
        return this.f30276s;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final Uri zze() {
        return this.f30274q;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final InterfaceC4271b zzf() {
        return BinderC4273d.m19913I3(this.f30273p);
    }
}
