package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.o */
/* loaded from: classes3.dex */
public final class C6676o extends AbstractC6683v {

    /* renamed from: a */
    private static C6676o f36801a;

    private C6676o() {
    }

    /* renamed from: e */
    public static synchronized C6676o m34104e() {
        C6676o c6676o;
        synchronized (C6676o.class) {
            try {
                if (f36801a == null) {
                    f36801a = new C6676o();
                }
                c6676o = f36801a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6676o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m34105d() {
        return 240L;
    }
}
