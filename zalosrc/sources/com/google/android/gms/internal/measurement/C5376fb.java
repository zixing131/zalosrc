package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* loaded from: classes.dex */
final class C5376fb implements InterfaceC5596sa {

    /* renamed from: a */
    private final InterfaceC5647va f32373a;

    /* renamed from: b */
    private final String f32374b;

    /* renamed from: c */
    private final Object[] f32375c;

    /* renamed from: d */
    private final int f32376d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5376fb(InterfaceC5647va interfaceC5647va, String str, Object[] objArr) {
        this.f32373a = interfaceC5647va;
        this.f32374b = str;
        this.f32375c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f32376d = charAt;
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
                this.f32376d = i11 | (charAt2 << i13);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m29142a() {
        return this.f32374b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m29143b() {
        return this.f32375c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5596sa
    public final InterfaceC5647va zza() {
        return this.f32373a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5596sa
    public final boolean zzb() {
        return (this.f32376d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5596sa
    public final int zzc() {
        return (this.f32376d & 1) == 1 ? 1 : 2;
    }
}
