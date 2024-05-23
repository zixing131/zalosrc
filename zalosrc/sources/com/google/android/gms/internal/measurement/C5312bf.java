package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bf */
/* loaded from: classes.dex */
public final class C5312bf implements InterfaceC5295af {

    /* renamed from: a */
    public static final AbstractC5677x6 f32295a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32296b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32297c;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32295a = m29622a.m29627f("measurement.sfmc.client", false);
        f32296b = m29622a.m29627f("measurement.sfmc.service", false);
        f32297c = m29622a.m29625d("measurement.id.sfmc.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5295af
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5295af
    public final boolean zzb() {
        return ((Boolean) f32295a.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5295af
    public final boolean zzc() {
        return ((Boolean) f32296b.m30014b()).booleanValue();
    }
}
