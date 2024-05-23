package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Executor;
import p256j5.ExecutorC20917a;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes2.dex */
public final class C4086d {

    /* renamed from: a */
    private final Executor f16286a;

    /* renamed from: b */
    private volatile Object f16287b;

    /* renamed from: c */
    private volatile a f16288c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f16289a;

        /* renamed from: b */
        private final String f16290b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Object obj, String str) {
            this.f16289a = obj;
            this.f16290b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16289a == aVar.f16289a && this.f16290b.equals(aVar.f16290b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16289a) * 31) + this.f16290b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo19394a(Object obj);

        /* renamed from: b */
        void mo19395b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4086d(Looper looper, Object obj, String str) {
        this.f16286a = new ExecutorC20917a(looper);
        this.f16287b = AbstractC4205o.m19723l(obj, "Listener must not be null");
        this.f16288c = new a(obj, AbstractC4205o.m19718g(str));
    }

    /* renamed from: a */
    public void m19390a() {
        this.f16287b = null;
        this.f16288c = null;
    }

    /* renamed from: b */
    public a m19391b() {
        return this.f16288c;
    }

    /* renamed from: c */
    public void m19392c(final b bVar) {
        AbstractC4205o.m19723l(bVar, "Notifier must not be null");
        this.f16286a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                C4086d.this.m19393d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m19393d(b bVar) {
        Object obj = this.f16287b;
        if (obj == null) {
            bVar.mo19395b();
            return;
        }
        try {
            bVar.mo19394a(obj);
        } catch (RuntimeException e11) {
            bVar.mo19395b();
            throw e11;
        }
    }
}
