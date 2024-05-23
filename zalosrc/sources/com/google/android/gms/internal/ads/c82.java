package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
final class c82 implements g91 {

    /* renamed from: a */
    boolean f18154a = false;

    /* renamed from: b */
    final /* synthetic */ f32 f18155b;

    /* renamed from: c */
    final /* synthetic */ pl0 f18156c;

    /* renamed from: d */
    final /* synthetic */ d82 f18157d;

    public c82(d82 d82Var, f32 f32Var, pl0 pl0Var) {
        this.f18157d = d82Var;
        this.f18155b = f32Var;
        this.f18156c = pl0Var;
    }

    /* renamed from: c */
    private final synchronized void m20820c(zze zzeVar) {
        int i11 = 1;
        if (true == ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20946B4)).booleanValue()) {
            i11 = 3;
        }
        this.f18156c.zze(new zzehg(i11, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.g91
    /* renamed from: a */
    public final synchronized void mo20821a(int i11) {
        if (this.f18154a) {
            return;
        }
        this.f18154a = true;
        m20820c(new zze(i11, d82.m21279e(this.f18155b.f19948a, i11), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.g91
    /* renamed from: b */
    public final synchronized void mo20822b(int i11, String str) {
        try {
            if (this.f18154a) {
                return;
            }
            this.f18154a = true;
            if (str == null) {
                str = d82.m21279e(this.f18155b.f19948a, i11);
            }
            m20820c(new zze(i11, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final synchronized void zzb(zze zzeVar) {
        if (this.f18154a) {
            return;
        }
        this.f18154a = true;
        m20820c(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final synchronized void zzd() {
        this.f18156c.zzd(null);
    }
}
