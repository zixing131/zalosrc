package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class re4 {

    /* renamed from: a */
    private final qm4 f27176a;

    /* renamed from: b */
    private final Map f27177b = new HashMap();

    /* renamed from: c */
    private final Set f27178c = new HashSet();

    /* renamed from: d */
    private final Map f27179d = new HashMap();

    /* renamed from: e */
    private pi2 f27180e;

    public re4(qm4 qm4Var) {
        this.f27176a = qm4Var;
    }

    /* renamed from: a */
    public final void m26074a(pi2 pi2Var) {
        if (pi2Var != this.f27180e) {
            this.f27180e = pi2Var;
            this.f27177b.clear();
            this.f27179d.clear();
        }
    }
}
