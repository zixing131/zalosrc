package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractC1245a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.p */
/* loaded from: classes3.dex */
class ScheduledFutureC6561p extends AbstractC1245a implements ScheduledFuture {

    /* renamed from: w */
    private final ScheduledFuture f36457w;

    /* renamed from: com.google.firebase.concurrent.p$a */
    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.b
        /* renamed from: a */
        public void mo33522a(Throwable th2) {
            ScheduledFutureC6561p.this.m5912w(th2);
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC6561p.b
        public void set(Object obj) {
            ScheduledFutureC6561p.this.mo5911v(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.concurrent.p$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo33522a(Throwable th2);

        void set(Object obj);
    }

    /* renamed from: com.google.firebase.concurrent.p$c */
    /* loaded from: classes3.dex */
    interface c {
        /* renamed from: a */
        ScheduledFuture mo33494a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledFutureC6561p(c cVar) {
        this.f36457w = cVar.mo33494a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f36457w.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.AbstractC1245a
    /* renamed from: d */
    protected void mo5908d() {
        this.f36457w.cancel(m5913y());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f36457w.getDelay(timeUnit);
    }
}
