package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.de */
/* loaded from: classes.dex */
public final class C5345de implements InterfaceC5328ce {

    /* renamed from: a */
    public static final AbstractC5677x6 f32340a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32341b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32342c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32343d;

    /* renamed from: e */
    public static final AbstractC5677x6 f32344e;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32340a = m29622a.m29627f("measurement.test.boolean_flag", false);
        f32341b = m29622a.m29624c("measurement.test.double_flag", -3.0d);
        f32342c = m29622a.m29625d("measurement.test.int_flag", -2L);
        f32343d = m29622a.m29625d("measurement.test.long_flag", -1L);
        f32344e = m29622a.m29626e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5328ce
    public final double zza() {
        return ((Double) f32341b.m30014b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5328ce
    public final long zzb() {
        return ((Long) f32342c.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5328ce
    public final long zzc() {
        return ((Long) f32343d.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5328ce
    public final String zzd() {
        return (String) f32344e.m30014b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5328ce
    public final boolean zze() {
        return ((Boolean) f32340a.m30014b()).booleanValue();
    }
}
