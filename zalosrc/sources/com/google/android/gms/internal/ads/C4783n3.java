package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n3 */
/* loaded from: classes2.dex */
final class C4783n3 implements InterfaceC4708l3 {

    /* renamed from: a */
    private final int f24983a;

    /* renamed from: b */
    private final int f24984b;

    /* renamed from: c */
    private final x02 f24985c;

    public C4783n3(C4524g3 c4524g3, C4671k3 c4671k3) {
        x02 x02Var = c4524g3.f20375b;
        this.f24985c = x02Var;
        x02Var.m27775f(12);
        int m27791v = x02Var.m27791v();
        if ("audio/raw".equals(c4671k3.f23099l)) {
            int m22331Y = g92.m22331Y(c4671k3.f23082A, c4671k3.f23112y);
            if (m27791v == 0 || m27791v % m22331Y != 0) {
                lr1.m24356e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m22331Y + ", stsz sample size: " + m27791v);
                m27791v = m22331Y;
            }
        }
        this.f24983a = m27791v == 0 ? -1 : m27791v;
        this.f24984b = x02Var.m27791v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zza() {
        return this.f24983a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zzb() {
        return this.f24984b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zzc() {
        int i11 = this.f24983a;
        if (i11 == -1) {
            return this.f24985c.m27791v();
        }
        return i11;
    }
}
