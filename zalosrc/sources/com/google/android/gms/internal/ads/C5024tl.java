package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tl */
/* loaded from: classes2.dex */
public final class C5024tl implements InterfaceC5025tm {

    /* renamed from: p */
    private final InterfaceC5025tm[] f28424p;

    public C5024tl(InterfaceC5025tm[] interfaceC5025tmArr) {
        this.f28424p = interfaceC5025tmArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5025tm
    /* renamed from: a */
    public final boolean mo20586a(long j11) {
        boolean z11;
        boolean z12 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z11 = false;
            for (InterfaceC5025tm interfaceC5025tm : this.f28424p) {
                if (interfaceC5025tm.zza() == zza) {
                    z11 |= interfaceC5025tm.mo20586a(j11);
                }
            }
            z12 |= z11;
        } while (z11);
        return z12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5025tm
    public final long zza() {
        long j11 = Long.MAX_VALUE;
        for (InterfaceC5025tm interfaceC5025tm : this.f28424p) {
            long zza = interfaceC5025tm.zza();
            if (zza != Long.MIN_VALUE) {
                j11 = Math.min(j11, zza);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }
}
