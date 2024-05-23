package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ff */
/* loaded from: classes.dex */
public final class C5380ff implements InterfaceC5363ef {

    /* renamed from: a */
    public static final AbstractC5677x6 f32380a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32381b;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32380a = m29622a.m29627f("measurement.sgtm.client.dev", false);
        f32381b = m29622a.m29627f("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5363ef
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5363ef
    public final boolean zzb() {
        return ((Boolean) f32380a.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5363ef
    public final boolean zzc() {
        return ((Boolean) f32381b.m30014b()).booleanValue();
    }
}
