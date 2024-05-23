package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lk */
/* loaded from: classes2.dex */
final class C4725lk implements InterfaceC4615ik {

    /* renamed from: a */
    private final int f23953a;

    /* renamed from: b */
    private final int f23954b;

    /* renamed from: c */
    private final C4655jo f23955c;

    public C4725lk(C4504fk c4504fk) {
        C4655jo c4655jo = c4504fk.f20142P0;
        this.f23955c = c4655jo;
        c4655jo.m23686v(12);
        this.f23953a = c4655jo.m23673i();
        this.f23954b = c4655jo.m23673i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final int zza() {
        return this.f23954b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final int zzb() {
        int i11 = this.f23953a;
        if (i11 == 0) {
            return this.f23955c.m23673i();
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final boolean zzc() {
        return this.f23953a != 0;
    }
}
