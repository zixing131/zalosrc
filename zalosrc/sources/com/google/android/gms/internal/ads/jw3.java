package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jw3 implements wv3 {

    /* renamed from: a */
    private final zv3 f23013a;

    /* renamed from: b */
    private final String f23014b;

    /* renamed from: c */
    private final Object[] f23015c;

    /* renamed from: d */
    private final int f23016d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jw3(zv3 zv3Var, String str, Object[] objArr) {
        this.f23013a = zv3Var;
        this.f23014b = str;
        this.f23015c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f23016d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 >= 55296) {
                i11 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            } else {
                this.f23016d = i11 | (charAt2 << i12);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m23766a() {
        return this.f23014b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m23767b() {
        return this.f23015c;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final zv3 zza() {
        return this.f23013a;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final boolean zzb() {
        return (this.f23016d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final int zzc() {
        return (this.f23016d & 1) == 1 ? 1 : 2;
    }
}
