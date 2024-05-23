package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.me */
/* loaded from: classes.dex */
public final class C5498me implements InterfaceC5481le {

    /* renamed from: a */
    public static final AbstractC5677x6 f32538a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32539b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32540c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32541d;

    /* renamed from: e */
    public static final AbstractC5677x6 f32542e;

    /* renamed from: f */
    public static final AbstractC5677x6 f32543f;

    /* renamed from: g */
    public static final AbstractC5677x6 f32544g;

    /* renamed from: h */
    public static final AbstractC5677x6 f32545h;

    /* renamed from: i */
    public static final AbstractC5677x6 f32546i;

    /* renamed from: j */
    public static final AbstractC5677x6 f32547j;

    /* renamed from: k */
    public static final AbstractC5677x6 f32548k;

    /* renamed from: l */
    public static final AbstractC5677x6 f32549l;

    /* renamed from: m */
    public static final AbstractC5677x6 f32550m;

    /* renamed from: n */
    public static final AbstractC5677x6 f32551n;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29623b().m29622a();
        f32538a = m29622a.m29627f("measurement.redaction.app_instance_id", true);
        f32539b = m29622a.m29627f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f32540c = m29622a.m29627f("measurement.redaction.config_redacted_fields", true);
        f32541d = m29622a.m29627f("measurement.redaction.device_info", true);
        f32542e = m29622a.m29627f("measurement.redaction.e_tag", true);
        f32543f = m29622a.m29627f("measurement.redaction.enhanced_uid", true);
        f32544g = m29622a.m29627f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f32545h = m29622a.m29627f("measurement.redaction.google_signals", true);
        f32546i = m29622a.m29627f("measurement.redaction.no_aiid_in_config_request", true);
        f32547j = m29622a.m29627f("measurement.redaction.retain_major_os_version", true);
        f32548k = m29622a.m29627f("measurement.redaction.scion_payload_generator", true);
        f32549l = m29622a.m29627f("measurement.redaction.upload_redacted_fields", true);
        f32550m = m29622a.m29627f("measurement.redaction.upload_subdomain_override", true);
        f32551n = m29622a.m29627f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5481le
    public final boolean zza() {
        return ((Boolean) f32547j.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5481le
    public final boolean zzb() {
        return ((Boolean) f32548k.m30014b()).booleanValue();
    }
}
