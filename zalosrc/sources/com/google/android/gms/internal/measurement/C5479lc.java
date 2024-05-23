package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.lc */
/* loaded from: classes.dex */
public final class C5479lc implements InterfaceC5462kc {

    /* renamed from: A */
    public static final AbstractC5677x6 f32481A;

    /* renamed from: B */
    public static final AbstractC5677x6 f32482B;

    /* renamed from: C */
    public static final AbstractC5677x6 f32483C;

    /* renamed from: D */
    public static final AbstractC5677x6 f32484D;

    /* renamed from: E */
    public static final AbstractC5677x6 f32485E;

    /* renamed from: F */
    public static final AbstractC5677x6 f32486F;

    /* renamed from: G */
    public static final AbstractC5677x6 f32487G;

    /* renamed from: H */
    public static final AbstractC5677x6 f32488H;

    /* renamed from: I */
    public static final AbstractC5677x6 f32489I;

    /* renamed from: J */
    public static final AbstractC5677x6 f32490J;

    /* renamed from: K */
    public static final AbstractC5677x6 f32491K;

    /* renamed from: L */
    public static final AbstractC5677x6 f32492L;

    /* renamed from: M */
    public static final AbstractC5677x6 f32493M;

    /* renamed from: N */
    public static final AbstractC5677x6 f32494N;

    /* renamed from: O */
    public static final AbstractC5677x6 f32495O;

    /* renamed from: P */
    public static final AbstractC5677x6 f32496P;

    /* renamed from: a */
    public static final AbstractC5677x6 f32497a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32498b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32499c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32500d;

    /* renamed from: e */
    public static final AbstractC5677x6 f32501e;

    /* renamed from: f */
    public static final AbstractC5677x6 f32502f;

    /* renamed from: g */
    public static final AbstractC5677x6 f32503g;

    /* renamed from: h */
    public static final AbstractC5677x6 f32504h;

    /* renamed from: i */
    public static final AbstractC5677x6 f32505i;

    /* renamed from: j */
    public static final AbstractC5677x6 f32506j;

    /* renamed from: k */
    public static final AbstractC5677x6 f32507k;

    /* renamed from: l */
    public static final AbstractC5677x6 f32508l;

    /* renamed from: m */
    public static final AbstractC5677x6 f32509m;

    /* renamed from: n */
    public static final AbstractC5677x6 f32510n;

    /* renamed from: o */
    public static final AbstractC5677x6 f32511o;

    /* renamed from: p */
    public static final AbstractC5677x6 f32512p;

    /* renamed from: q */
    public static final AbstractC5677x6 f32513q;

    /* renamed from: r */
    public static final AbstractC5677x6 f32514r;

    /* renamed from: s */
    public static final AbstractC5677x6 f32515s;

    /* renamed from: t */
    public static final AbstractC5677x6 f32516t;

    /* renamed from: u */
    public static final AbstractC5677x6 f32517u;

    /* renamed from: v */
    public static final AbstractC5677x6 f32518v;

    /* renamed from: w */
    public static final AbstractC5677x6 f32519w;

    /* renamed from: x */
    public static final AbstractC5677x6 f32520x;

    /* renamed from: y */
    public static final AbstractC5677x6 f32521y;

    /* renamed from: z */
    public static final AbstractC5677x6 f32522z;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32497a = m29622a.m29625d("measurement.ad_id_cache_time", 10000L);
        f32498b = m29622a.m29625d("measurement.app_uninstalled_additional_ad_id_cache_time", 0L);
        f32499c = m29622a.m29625d("measurement.max_bundles_per_iteration", 100L);
        f32500d = m29622a.m29625d("measurement.config.cache_time", 86400000L);
        f32501e = m29622a.m29626e("measurement.log_tag", "FA");
        f32502f = m29622a.m29626e("measurement.config.url_authority", "app-measurement.com");
        f32503g = m29622a.m29626e("measurement.config.url_scheme", "https");
        f32504h = m29622a.m29625d("measurement.upload.debug_upload_interval", 1000L);
        f32505i = m29622a.m29625d("measurement.id.app_uninstalled_additional_ad_id_cache_time", 0L);
        f32506j = m29622a.m29625d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f32507k = m29622a.m29625d("measurement.store.max_stored_events_per_app", 100000L);
        f32508l = m29622a.m29625d("measurement.experiment.max_ids", 50L);
        f32509m = m29622a.m29625d("measurement.audience.filter_result_max_count", 200L);
        f32510n = m29622a.m29625d("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f32511o = m29622a.m29625d("measurement.alarm_manager.minimum_interval", 60000L);
        f32512p = m29622a.m29625d("measurement.upload.minimum_delay", 500L);
        f32513q = m29622a.m29625d("measurement.monitoring.sample_period_millis", 86400000L);
        f32514r = m29622a.m29625d("measurement.upload.realtime_upload_interval", 10000L);
        f32515s = m29622a.m29625d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f32516t = m29622a.m29625d("measurement.config.cache_time.service", 3600000L);
        f32517u = m29622a.m29625d("measurement.service_client.idle_disconnect_millis", 5000L);
        f32518v = m29622a.m29626e("measurement.log_tag.service", "FA-SVC");
        f32519w = m29622a.m29625d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f32520x = m29622a.m29625d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f32521y = m29622a.m29625d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f32522z = m29622a.m29625d("measurement.upload.backoff_period", 43200000L);
        f32481A = m29622a.m29625d("measurement.upload.initial_upload_delay_time", 15000L);
        f32482B = m29622a.m29625d("measurement.upload.interval", 3600000L);
        f32483C = m29622a.m29625d("measurement.upload.max_bundle_size", 65536L);
        f32484D = m29622a.m29625d("measurement.upload.max_bundles", 100L);
        f32485E = m29622a.m29625d("measurement.upload.max_conversions_per_day", 500L);
        f32486F = m29622a.m29625d("measurement.upload.max_error_events_per_day", 1000L);
        f32487G = m29622a.m29625d("measurement.upload.max_events_per_bundle", 1000L);
        f32488H = m29622a.m29625d("measurement.upload.max_events_per_day", 100000L);
        f32489I = m29622a.m29625d("measurement.upload.max_public_events_per_day", 50000L);
        f32490J = m29622a.m29625d("measurement.upload.max_queue_time", 2419200000L);
        f32491K = m29622a.m29625d("measurement.upload.max_realtime_events_per_day", 10L);
        f32492L = m29622a.m29625d("measurement.upload.max_batch_size", 65536L);
        f32493M = m29622a.m29625d("measurement.upload.retry_count", 6L);
        f32494N = m29622a.m29625d("measurement.upload.retry_time", 1800000L);
        f32495O = m29622a.m29626e("measurement.upload.url", "https://app-measurement.com/a");
        f32496P = m29622a.m29625d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: a */
    public final long mo29369a() {
        return ((Long) f32481A.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: b */
    public final long mo29370b() {
        return ((Long) f32492L.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: d */
    public final String mo29371d() {
        return (String) f32503g.m30014b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: e */
    public final long mo29372e() {
        return ((Long) f32493M.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: g */
    public final long mo29373g() {
        return ((Long) f32483C.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: h */
    public final String mo29374h() {
        return (String) f32502f.m30014b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: i */
    public final long mo29375i() {
        return ((Long) f32494N.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: k */
    public final long mo29376k() {
        return ((Long) f32485E.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: m */
    public final long mo29377m() {
        return ((Long) f32496P.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    /* renamed from: u */
    public final String mo29378u() {
        return (String) f32495O.m30014b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzA() {
        return ((Long) f32487G.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzB() {
        return ((Long) f32488H.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzC() {
        return ((Long) f32489I.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzD() {
        return ((Long) f32490J.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzE() {
        return ((Long) f32491K.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zza() {
        return ((Long) f32497a.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzb() {
        return ((Long) f32498b.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzc() {
        return ((Long) f32499c.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzd() {
        return ((Long) f32500d.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zze() {
        return ((Long) f32504h.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzf() {
        return ((Long) f32506j.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzg() {
        return ((Long) f32507k.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzh() {
        return ((Long) f32508l.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzi() {
        return ((Long) f32509m.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzj() {
        return ((Long) f32510n.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzk() {
        return ((Long) f32511o.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzl() {
        return ((Long) f32512p.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzm() {
        return ((Long) f32513q.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzn() {
        return ((Long) f32514r.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzo() {
        return ((Long) f32515s.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzp() {
        return ((Long) f32517u.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzq() {
        return ((Long) f32519w.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzr() {
        return ((Long) f32520x.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzs() {
        return ((Long) f32521y.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzt() {
        return ((Long) f32522z.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzv() {
        return ((Long) f32482B.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzx() {
        return ((Long) f32484D.m30014b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5462kc
    public final long zzz() {
        return ((Long) f32486F.m30014b()).longValue();
    }
}
