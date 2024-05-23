package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mk */
/* loaded from: classes2.dex */
final class C4763mk implements InterfaceC4615ik {

    /* renamed from: a */
    private final C4655jo f24623a;

    /* renamed from: b */
    private final int f24624b;

    /* renamed from: c */
    private final int f24625c;

    /* renamed from: d */
    private int f24626d;

    /* renamed from: e */
    private int f24627e;

    public C4763mk(C4504fk c4504fk) {
        C4655jo c4655jo = c4504fk.f20142P0;
        this.f24623a = c4655jo;
        c4655jo.m23686v(12);
        this.f24625c = c4655jo.m23673i() & 255;
        this.f24624b = c4655jo.m23673i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final int zza() {
        return this.f24624b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final int zzb() {
        int i11 = this.f24625c;
        if (i11 == 8) {
            return this.f24623a.m23671g();
        }
        if (i11 == 16) {
            return this.f24623a.m23674j();
        }
        int i12 = this.f24626d;
        this.f24626d = i12 + 1;
        if (i12 % 2 == 0) {
            int m23671g = this.f24623a.m23671g();
            this.f24627e = m23671g;
            return (m23671g & 240) >> 4;
        }
        return this.f24627e & 15;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4615ik
    public final boolean zzc() {
        return false;
    }
}
