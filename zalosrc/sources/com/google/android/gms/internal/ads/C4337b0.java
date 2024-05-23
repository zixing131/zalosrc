package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b0 */
/* loaded from: classes2.dex */
final class C4337b0 implements InterfaceC4779n {

    /* renamed from: a */
    private final long f17500a;

    /* renamed from: b */
    final /* synthetic */ C4484f0 f17501b;

    public C4337b0(C4484f0 c4484f0, long j11) {
        this.f17501b = c4484f0;
        this.f17500a = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        C4595i0[] c4595i0Arr;
        C4595i0[] c4595i0Arr2;
        C4595i0[] c4595i0Arr3;
        c4595i0Arr = this.f17501b.f19880g;
        C4704l m23088a = c4595i0Arr[0].m23088a(j11);
        int i11 = 1;
        while (true) {
            C4484f0 c4484f0 = this.f17501b;
            c4595i0Arr2 = c4484f0.f19880g;
            if (i11 < c4595i0Arr2.length) {
                c4595i0Arr3 = c4484f0.f19880g;
                C4704l m23088a2 = c4595i0Arr3[i11].m23088a(j11);
                if (m23088a2.f23656a.f25386b < m23088a.f23656a.f25386b) {
                    m23088a = m23088a2;
                }
                i11++;
            } else {
                return m23088a;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f17500a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
