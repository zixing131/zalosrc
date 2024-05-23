package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r2 */
/* loaded from: classes2.dex */
final class C5829r2 implements InterfaceC5751e2 {

    /* renamed from: a */
    private final InterfaceC5775i2 f33418a;

    /* renamed from: b */
    private final String f33419b;

    /* renamed from: c */
    private final Object[] f33420c;

    /* renamed from: d */
    private final int f33421d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5829r2(InterfaceC5775i2 interfaceC5775i2, String str, Object[] objArr) {
        this.f33418a = interfaceC5775i2;
        this.f33419b = str;
        this.f33420c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f33421d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i11 |= (charAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            } else {
                this.f33421d = i11 | (charAt2 << i13);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m30441a() {
        return this.f33419b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m30442b() {
        return this.f33420c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5751e2
    public final InterfaceC5775i2 zza() {
        return this.f33418a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5751e2
    public final boolean zzb() {
        return (this.f33421d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5751e2
    public final int zzc() {
        int i11 = this.f33421d;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }
}
