package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.l */
/* loaded from: classes3.dex */
public final class C6673l extends AbstractC6683v {

    /* renamed from: a */
    private static C6673l f36798a;

    protected C6673l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6673l m34098e() {
        C6673l c6673l;
        synchronized (C6673l.class) {
            try {
                if (f36798a == null) {
                    f36798a = new C6673l();
                }
                c6673l = f36798a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6673l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m34099d() {
        return Boolean.TRUE;
    }
}
