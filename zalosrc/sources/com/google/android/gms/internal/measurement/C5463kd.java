package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kd */
/* loaded from: classes.dex */
public final class C5463kd implements InterfaceC5446jd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32464a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32465b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32466c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32467d;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32464a = m29622a.m29627f("measurement.client.global_params", true);
        f32465b = m29622a.m29627f("measurement.service.global_params_in_payload", true);
        f32466c = m29622a.m29627f("measurement.service.clear_global_params_on_uninstall", true);
        f32467d = m29622a.m29627f("measurement.service.global_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5446jd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5446jd
    public final boolean zzb() {
        return ((Boolean) f32466c.m30014b()).booleanValue();
    }
}
