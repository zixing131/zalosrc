package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.r */
/* loaded from: classes3.dex */
public final class C6679r extends AbstractC6683v {

    /* renamed from: a */
    private static C6679r f36804a;

    private C6679r() {
    }

    /* renamed from: e */
    public static synchronized C6679r m34110e() {
        C6679r c6679r;
        synchronized (C6679r.class) {
            try {
                if (f36804a == null) {
                    f36804a = new C6679r();
                }
                c6679r = f36804a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6679r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m34111d() {
        return Float.valueOf(0.01f);
    }
}
