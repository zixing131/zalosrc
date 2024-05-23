package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lz2 {

    /* renamed from: a */
    private final BlockingQueue f24318a;

    /* renamed from: b */
    private final ThreadPoolExecutor f24319b;

    /* renamed from: c */
    private final ArrayDeque f24320c = new ArrayDeque();

    /* renamed from: d */
    private kz2 f24321d = null;

    public lz2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24318a = linkedBlockingQueue;
        this.f24319b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m24422c() {
        kz2 kz2Var = (kz2) this.f24320c.poll();
        this.f24321d = kz2Var;
        if (kz2Var != null) {
            kz2Var.executeOnExecutor(this.f24319b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m24423a(kz2 kz2Var) {
        this.f24321d = null;
        m24422c();
    }

    /* renamed from: b */
    public final void m24424b(kz2 kz2Var) {
        kz2Var.m24100b(this);
        this.f24320c.add(kz2Var);
        if (this.f24321d == null) {
            m24422c();
        }
    }
}
