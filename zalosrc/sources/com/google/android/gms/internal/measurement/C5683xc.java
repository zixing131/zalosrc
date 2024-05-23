package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xc */
/* loaded from: classes.dex */
public final class C5683xc implements InterfaceC5666wc {

    /* renamed from: a */
    public static final AbstractC5677x6 f32916a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32917b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32918c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32919d;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32916a = m29622a.m29627f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f32917b = m29622a.m29627f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f32918c = m29622a.m29627f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f32919d = m29622a.m29627f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5666wc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5666wc
    public final boolean zzb() {
        return ((Boolean) f32917b.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5666wc
    public final boolean zzc() {
        return ((Boolean) f32918c.m30014b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5666wc
    public final boolean zzd() {
        return ((Boolean) f32919d.m30014b()).booleanValue();
    }
}
