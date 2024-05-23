package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.j */
/* loaded from: classes3.dex */
public final class C6671j extends AbstractC6683v {

    /* renamed from: a */
    private static C6671j f36796a;

    private C6671j() {
    }

    /* renamed from: e */
    public static synchronized C6671j m34094e() {
        C6671j c6671j;
        synchronized (C6671j.class) {
            try {
                if (f36796a == null) {
                    f36796a = new C6671j();
                }
                c6671j = f36796a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6671j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34095d() {
        return 600L;
    }
}
