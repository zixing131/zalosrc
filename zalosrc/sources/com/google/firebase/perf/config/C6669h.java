package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.h */
/* loaded from: classes3.dex */
public final class C6669h extends AbstractC6683v {

    /* renamed from: a */
    private static C6669h f36794a;

    private C6669h() {
    }

    /* renamed from: e */
    public static synchronized C6669h m34090e() {
        C6669h c6669h;
        synchronized (C6669h.class) {
            try {
                if (f36794a == null) {
                    f36794a = new C6669h();
                }
                c6669h = f36794a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6669h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34091d() {
        return 700L;
    }
}
