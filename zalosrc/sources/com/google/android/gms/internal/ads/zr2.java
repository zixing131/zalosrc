package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zr2 {

    /* renamed from: a */
    private final Deque f31682a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable f31683b;

    /* renamed from: c */
    private final uc3 f31684c;

    public zr2(Callable callable, uc3 uc3Var) {
        this.f31683b = callable;
        this.f31684c = uc3Var;
    }

    /* renamed from: a */
    public final synchronized tc3 m28591a() {
        m28593c(1);
        return (tc3) this.f31682a.poll();
    }

    /* renamed from: b */
    public final synchronized void m28592b(tc3 tc3Var) {
        this.f31682a.addFirst(tc3Var);
    }

    /* renamed from: c */
    public final synchronized void m28593c(int i11) {
        int size = i11 - this.f31682a.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f31682a.add(this.f31684c.mo21339R(this.f31683b));
        }
    }
}
