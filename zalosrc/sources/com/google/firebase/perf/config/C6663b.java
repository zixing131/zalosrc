package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.b */
/* loaded from: classes3.dex */
public final class C6663b extends AbstractC6683v {

    /* renamed from: a */
    private static C6663b f36787a;

    private C6663b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6663b m34074e() {
        C6663b c6663b;
        synchronized (C6663b.class) {
            try {
                if (f36787a == null) {
                    f36787a = new C6663b();
                }
                c6663b = f36787a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6663b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: b */
    public String mo34075b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m34076d() {
        return Boolean.FALSE;
    }
}
