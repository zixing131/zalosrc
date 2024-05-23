package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.g */
/* loaded from: classes3.dex */
public final class C6668g extends AbstractC6683v {

    /* renamed from: a */
    private static C6668g f36793a;

    private C6668g() {
    }

    /* renamed from: e */
    public static synchronized C6668g m34088e() {
        C6668g c6668g;
        synchronized (C6668g.class) {
            try {
                if (f36793a == null) {
                    f36793a = new C6668g();
                }
                c6668g = f36793a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6668g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34089d() {
        return 70L;
    }
}
