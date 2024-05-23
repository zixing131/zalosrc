package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.k */
/* loaded from: classes3.dex */
public final class C6672k extends AbstractC6683v {

    /* renamed from: a */
    private static C6672k f36797a;

    protected C6672k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6672k m34096e() {
        C6672k c6672k;
        synchronized (C6672k.class) {
            try {
                if (f36797a == null) {
                    f36797a = new C6672k();
                }
                c6672k = f36797a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6672k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m34097d() {
        return "";
    }
}
