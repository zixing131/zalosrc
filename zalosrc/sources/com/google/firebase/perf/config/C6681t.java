package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.t */
/* loaded from: classes3.dex */
public final class C6681t extends AbstractC6683v {

    /* renamed from: a */
    private static C6681t f36806a;

    private C6681t() {
    }

    /* renamed from: e */
    public static synchronized C6681t m34114e() {
        C6681t c6681t;
        synchronized (C6681t.class) {
            try {
                if (f36806a == null) {
                    f36806a = new C6681t();
                }
                c6681t = f36806a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6681t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34115d() {
        return 300L;
    }
}
