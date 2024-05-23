package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p233i9.AbstractC20428a;

/* renamed from: com.google.firebase.perf.config.f */
/* loaded from: classes3.dex */
public final class C6667f extends AbstractC6683v {

    /* renamed from: a */
    private static C6667f f36791a;

    /* renamed from: b */
    private static final Map f36792b = Collections.unmodifiableMap(new a());

    /* renamed from: com.google.firebase.perf.config.f$a */
    /* loaded from: classes3.dex */
    class a extends HashMap {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private C6667f() {
    }

    /* renamed from: e */
    public static synchronized C6667f m34084e() {
        C6667f c6667f;
        synchronized (C6667f.class) {
            try {
                if (f36791a == null) {
                    f36791a = new C6667f();
                }
                c6667f = f36791a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6667f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static String m34085f(long j11) {
        return (String) f36792b.get(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static boolean m34086g(long j11) {
        return f36792b.containsKey(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: a */
    public String mo34078a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6683v
    /* renamed from: c */
    public String mo34080c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m34087d() {
        return AbstractC20428a.f100598c;
    }
}
