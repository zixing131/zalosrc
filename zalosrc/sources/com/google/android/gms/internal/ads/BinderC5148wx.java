package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.wx */
/* loaded from: classes2.dex */
public final class BinderC5148wx extends AbstractBinderC5185xx {

    /* renamed from: p */
    private final zzf f30242p;

    /* renamed from: q */
    private final String f30243q;

    /* renamed from: r */
    private final String f30244r;

    public BinderC5148wx(zzf zzfVar, String str, String str2) {
        this.f30242p = zzfVar;
        this.f30243q = str;
        this.f30244r = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5222yx
    public final String zzb() {
        return this.f30243q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5222yx
    public final String zzc() {
        return this.f30244r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5222yx
    public final void zzd(InterfaceC4271b interfaceC4271b) {
        if (interfaceC4271b == null) {
            return;
        }
        this.f30242p.zza((View) BinderC4273d.m19914Q(interfaceC4271b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5222yx
    public final void zze() {
        this.f30242p.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5222yx
    public final void zzf() {
        this.f30242p.zzc();
    }
}
