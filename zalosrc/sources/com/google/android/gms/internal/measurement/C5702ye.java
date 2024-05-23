package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ye */
/* loaded from: classes.dex */
public final class C5702ye implements InterfaceC5685xe {

    /* renamed from: a */
    public static final AbstractC5677x6 f32949a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32950b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32951c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32952d;

    /* renamed from: e */
    public static final AbstractC5677x6 f32953e;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32949a = m29622a.m29627f("measurement.client.sessions.background_sessions_enabled", true);
        f32950b = m29622a.m29627f("measurement.client.sessions.enable_fix_background_engagement", false);
        f32951c = m29622a.m29627f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f32952d = m29622a.m29627f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f32953e = m29622a.m29627f("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5685xe
    public final boolean zza() {
        return ((Boolean) f32950b.m30014b()).booleanValue();
    }
}
