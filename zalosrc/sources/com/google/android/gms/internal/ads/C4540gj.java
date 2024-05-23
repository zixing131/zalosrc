package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj */
/* loaded from: classes2.dex */
public final class C4540gj implements InterfaceC4911qj {

    /* renamed from: a */
    public final int[] f20606a;

    /* renamed from: b */
    public final long[] f20607b;

    /* renamed from: c */
    public final long[] f20608c;

    /* renamed from: d */
    public final long[] f20609d;

    /* renamed from: e */
    private final long f20610e;

    public C4540gj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20606a = iArr;
        this.f20607b = jArr;
        this.f20608c = jArr2;
        this.f20609d = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i11 = length - 1;
            this.f20610e = jArr2[i11] + jArr3[i11];
        } else {
            this.f20610e = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    /* renamed from: a */
    public final long mo22451a(long j11) {
        return this.f20607b[AbstractC4916qo.m25827c(this.f20609d, j11, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    public final long zza() {
        return this.f20610e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    public final boolean zzc() {
        return true;
    }
}
