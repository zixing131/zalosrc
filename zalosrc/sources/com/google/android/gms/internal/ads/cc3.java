package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class cc3 extends t73 implements Future {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Future mo20860d();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo20860d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo20860d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo20860d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return mo20860d().get(j11, timeUnit);
    }
}
