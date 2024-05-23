package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qd */
/* loaded from: classes.dex */
public final class C5565qd implements InterfaceC5548pd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32751a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32752b;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32751a = m29622a.m29627f("measurement.item_scoped_custom_parameters.client", true);
        f32752b = m29622a.m29627f("measurement.item_scoped_custom_parameters.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5548pd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5548pd
    public final boolean zzb() {
        return ((Boolean) f32751a.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5548pd
    public final boolean zzc() {
        return ((Boolean) f32752b.m30014b()).booleanValue();
    }
}
