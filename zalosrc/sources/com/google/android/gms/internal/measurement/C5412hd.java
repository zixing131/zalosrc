package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hd */
/* loaded from: classes.dex */
public final class C5412hd implements InterfaceC5395gd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32404a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32405b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32406c;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32404a = m29622a.m29627f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f32405b = m29622a.m29627f("measurement.client.sessions.check_on_startup", true);
        f32406c = m29622a.m29627f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5395gd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5395gd
    public final boolean zzb() {
        return ((Boolean) f32404a.m30014b()).booleanValue();
    }
}
