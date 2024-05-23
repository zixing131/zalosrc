package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o3 */
/* loaded from: classes2.dex */
final class C4820o3 implements InterfaceC4708l3 {

    /* renamed from: a */
    private final x02 f25409a;

    /* renamed from: b */
    private final int f25410b;

    /* renamed from: c */
    private final int f25411c;

    /* renamed from: d */
    private int f25412d;

    /* renamed from: e */
    private int f25413e;

    public C4820o3(C4524g3 c4524g3) {
        x02 x02Var = c4524g3.f20375b;
        this.f25409a = x02Var;
        x02Var.m27775f(12);
        this.f25411c = x02Var.m27791v() & 255;
        this.f25410b = x02Var.m27791v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zzb() {
        return this.f25410b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4708l3
    public final int zzc() {
        int i11 = this.f25411c;
        if (i11 == 8) {
            return this.f25409a.m27788s();
        }
        if (i11 == 16) {
            return this.f25409a.m27792w();
        }
        int i12 = this.f25412d;
        this.f25412d = i12 + 1;
        if (i12 % 2 == 0) {
            int m27788s = this.f25409a.m27788s();
            this.f25413e = m27788s;
            return (m27788s & 240) >> 4;
        }
        return this.f25413e & 15;
    }
}
