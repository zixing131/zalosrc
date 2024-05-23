package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.m */
/* loaded from: classes3.dex */
public final class C6674m extends AbstractC6683v {

    /* renamed from: a */
    private static C6674m f36799a;

    private C6674m() {
    }

    /* renamed from: e */
    public static synchronized C6674m m34100e() {
        C6674m c6674m;
        synchronized (C6674m.class) {
            try {
                if (f36799a == null) {
                    f36799a = new C6674m();
                }
                c6674m = f36799a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6674m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34101d() {
        return 0L;
    }
}
