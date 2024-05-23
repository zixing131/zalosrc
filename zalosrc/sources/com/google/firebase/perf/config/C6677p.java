package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.p */
/* loaded from: classes3.dex */
public final class C6677p extends AbstractC6683v {

    /* renamed from: a */
    private static C6677p f36802a;

    private C6677p() {
    }

    /* renamed from: e */
    public static synchronized C6677p m34106e() {
        C6677p c6677p;
        synchronized (C6677p.class) {
            try {
                if (f36802a == null) {
                    f36802a = new C6677p();
                }
                c6677p = f36802a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6677p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34107d() {
        return 0L;
    }
}
