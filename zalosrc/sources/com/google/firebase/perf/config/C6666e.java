package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.e */
/* loaded from: classes3.dex */
public final class C6666e extends AbstractC6683v {

    /* renamed from: a */
    private static C6666e f36790a;

    private C6666e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6666e m34082e() {
        C6666e c6666e;
        synchronized (C6666e.class) {
            try {
                if (f36790a == null) {
                    f36790a = new C6666e();
                }
                c6666e = f36790a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6666e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "fragment_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m34083d() {
        return Float.valueOf(0.0f);
    }
}
