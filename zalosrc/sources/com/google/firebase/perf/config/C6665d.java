package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.d */
/* loaded from: classes3.dex */
public final class C6665d extends AbstractC6683v {

    /* renamed from: a */
    private static C6665d f36789a;

    private C6665d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6665d m34079e() {
        C6665d c6665d;
        synchronized (C6665d.class) {
            try {
                if (f36789a == null) {
                    f36789a = new C6665d();
                }
                c6665d = f36789a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6665d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m34081d() {
        return Boolean.FALSE;
    }
}
