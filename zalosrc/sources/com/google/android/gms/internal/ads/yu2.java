package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class yu2 {

    /* renamed from: d */
    private static final tc3 f31219d = kc3.m23877i(null);

    /* renamed from: a */
    private final uc3 f31220a;

    /* renamed from: b */
    private final ScheduledExecutorService f31221b;

    /* renamed from: c */
    private final av2 f31222c;

    public yu2(uc3 uc3Var, ScheduledExecutorService scheduledExecutorService, av2 av2Var) {
        this.f31220a = uc3Var;
        this.f31221b = scheduledExecutorService;
        this.f31222c = av2Var;
    }

    /* renamed from: a */
    public final ou2 m28360a(Object obj, tc3... tc3VarArr) {
        return new ou2(this, obj, Arrays.asList(tc3VarArr), null);
    }

    /* renamed from: b */
    public final xu2 m28361b(Object obj, tc3 tc3Var) {
        return new xu2(this, obj, tc3Var, Collections.singletonList(tc3Var), tc3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo23054f(Object obj);
}
