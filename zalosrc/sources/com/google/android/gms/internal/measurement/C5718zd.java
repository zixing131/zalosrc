package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zd */
/* loaded from: classes.dex */
public final class C5718zd implements InterfaceC5701yd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32967a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32968b;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32967a = m29622a.m29627f("measurement.collection.client.log_target_api_version.dev", false);
        f32968b = m29622a.m29627f("measurement.collection.service.log_target_api_version", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5701yd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5701yd
    public final boolean zzb() {
        return ((Boolean) f32967a.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5701yd
    public final boolean zzc() {
        return ((Boolean) f32968b.m30014b()).booleanValue();
    }
}
