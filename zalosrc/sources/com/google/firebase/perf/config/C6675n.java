package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.n */
/* loaded from: classes3.dex */
public final class C6675n extends AbstractC6683v {

    /* renamed from: a */
    private static C6675n f36800a;

    private C6675n() {
    }

    /* renamed from: e */
    public static synchronized C6675n m34102e() {
        C6675n c6675n;
        synchronized (C6675n.class) {
            try {
                if (f36800a == null) {
                    f36800a = new C6675n();
                }
                c6675n = f36800a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6675n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34103d() {
        return 100L;
    }
}
