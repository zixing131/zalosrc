package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.c */
/* loaded from: classes3.dex */
public final class C6664c extends AbstractC6683v {

    /* renamed from: a */
    private static C6664c f36788a;

    private C6664c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static synchronized C6664c m34077d() {
        C6664c c6664c;
        synchronized (C6664c.class) {
            try {
                if (f36788a == null) {
                    f36788a = new C6664c();
                }
                c6664c = f36788a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6664c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "firebase_performance_collection_enabled";
    }
}
