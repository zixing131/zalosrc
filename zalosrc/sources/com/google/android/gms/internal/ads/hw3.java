package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hw3 {

    /* renamed from: c */
    private static final hw3 f21933c = new hw3();

    /* renamed from: b */
    private final ConcurrentMap f21935b = new ConcurrentHashMap();

    /* renamed from: a */
    private final uw3 f21934a = new sv3();

    private hw3() {
    }

    /* renamed from: a */
    public static hw3 m23056a() {
        return f21933c;
    }

    /* renamed from: b */
    public final tw3 m23057b(Class cls) {
        dv3.m21551f(cls, "messageType");
        tw3 tw3Var = (tw3) this.f21935b.get(cls);
        if (tw3Var == null) {
            tw3Var = this.f21934a.mo26443a(cls);
            dv3.m21551f(cls, "messageType");
            dv3.m21551f(tw3Var, "schema");
            tw3 tw3Var2 = (tw3) this.f21935b.putIfAbsent(cls, tw3Var);
            if (tw3Var2 != null) {
                return tw3Var2;
            }
        }
        return tw3Var;
    }
}
