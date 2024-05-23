package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ve */
/* loaded from: classes.dex */
public final class C5651ve implements InterfaceC5634ue {

    /* renamed from: a */
    public static final AbstractC5677x6 f32864a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32865b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32866c;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32864a = m29622a.m29627f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f32865b = m29622a.m29627f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f32866c = m29622a.m29627f("measurement.session_stitching_token_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5634ue
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5634ue
    public final boolean zzb() {
        return ((Boolean) f32864a.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5634ue
    public final boolean zzc() {
        return ((Boolean) f32865b.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5634ue
    public final boolean zzd() {
        return ((Boolean) f32866c.m30014b()).booleanValue();
    }
}
