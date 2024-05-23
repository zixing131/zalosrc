package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.u */
/* loaded from: classes3.dex */
public final class C6682u extends AbstractC6683v {

    /* renamed from: a */
    private static C6682u f36807a;

    private C6682u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6682u m34116e() {
        C6682u c6682u;
        synchronized (C6682u.class) {
            try {
                if (f36807a == null) {
                    f36807a = new C6682u();
                }
                c6682u = f36807a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6682u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m34117d() {
        return Float.valueOf(1.0f);
    }
}
