package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.i */
/* loaded from: classes3.dex */
public final class C6670i extends AbstractC6683v {

    /* renamed from: a */
    private static C6670i f36795a;

    private C6670i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6670i m34092e() {
        C6670i c6670i;
        synchronized (C6670i.class) {
            try {
                if (f36795a == null) {
                    f36795a = new C6670i();
                }
                c6670i = f36795a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6670i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m34093d() {
        return Float.valueOf(1.0f);
    }
}
