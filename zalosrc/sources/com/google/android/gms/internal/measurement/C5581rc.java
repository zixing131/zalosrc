package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rc */
/* loaded from: classes.dex */
public final class C5581rc implements InterfaceC5564qc {

    /* renamed from: a */
    public static final AbstractC5677x6 f32769a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32770b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32771c;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32769a = m29622a.m29627f("measurement.collection.event_safelist", true);
        f32770b = m29622a.m29627f("measurement.service.store_null_safelist", true);
        f32771c = m29622a.m29627f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5564qc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5564qc
    public final boolean zzb() {
        return ((Boolean) f32770b.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5564qc
    public final boolean zzc() {
        return ((Boolean) f32771c.m30014b()).booleanValue();
    }
}
