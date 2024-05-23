package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes2.dex */
public final class C4208p {

    /* renamed from: b */
    private static C4208p f16643b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f16644c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f16645a;

    private C4208p() {
    }

    /* renamed from: b */
    public static synchronized C4208p m19739b() {
        C4208p c4208p;
        synchronized (C4208p.class) {
            try {
                if (f16643b == null) {
                    f16643b = new C4208p();
                }
                c4208p = f16643b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4208p;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration m19740a() {
        return this.f16645a;
    }

    /* renamed from: c */
    public final synchronized void m19741c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f16645a = f16644c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f16645a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.m19621M() >= rootTelemetryConfiguration.m19621M()) {
            return;
        }
        this.f16645a = rootTelemetryConfiguration;
    }
}
