package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.q */
/* loaded from: classes3.dex */
public final class C6678q extends AbstractC6683v {

    /* renamed from: a */
    private static C6678q f36803a;

    private C6678q() {
    }

    /* renamed from: e */
    public static synchronized C6678q m34108e() {
        C6678q c6678q;
        synchronized (C6678q.class) {
            try {
                if (f36803a == null) {
                    f36803a = new C6678q();
                }
                c6678q = f36803a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6678q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34109d() {
        return 100L;
    }
}
