package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.s */
/* loaded from: classes3.dex */
public final class C6680s extends AbstractC6683v {

    /* renamed from: a */
    private static C6680s f36805a;

    private C6680s() {
    }

    /* renamed from: e */
    public static synchronized C6680s m34112e() {
        C6680s c6680s;
        synchronized (C6680s.class) {
            try {
                if (f36805a == null) {
                    f36805a = new C6680s();
                }
                c6680s = f36805a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6680s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34113d() {
        return 30L;
    }
}
