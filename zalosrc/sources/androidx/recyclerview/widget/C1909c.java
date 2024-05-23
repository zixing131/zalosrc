package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AbstractC1915h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes2.dex */
public final class C1909c {

    /* renamed from: a */
    private final Executor f7964a;

    /* renamed from: b */
    private final Executor f7965b;

    /* renamed from: c */
    private final AbstractC1915h.d f7966c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: d */
        private static final Object f7967d = new Object();

        /* renamed from: e */
        private static Executor f7968e;

        /* renamed from: a */
        private Executor f7969a;

        /* renamed from: b */
        private Executor f7970b;

        /* renamed from: c */
        private final AbstractC1915h.d f7971c;

        public a(AbstractC1915h.d dVar) {
            this.f7971c = dVar;
        }

        /* renamed from: a */
        public C1909c m10420a() {
            if (this.f7970b == null) {
                synchronized (f7967d) {
                    try {
                        if (f7968e == null) {
                            f7968e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f7970b = f7968e;
            }
            return new C1909c(this.f7969a, this.f7970b, this.f7971c);
        }

        /* renamed from: b */
        public a m10421b(Executor executor) {
            this.f7970b = executor;
            return this;
        }
    }

    C1909c(Executor executor, Executor executor2, AbstractC1915h.d dVar) {
        this.f7964a = executor;
        this.f7965b = executor2;
        this.f7966c = dVar;
    }

    /* renamed from: a */
    public Executor m10417a() {
        return this.f7965b;
    }

    /* renamed from: b */
    public AbstractC1915h.d m10418b() {
        return this.f7966c;
    }

    /* renamed from: c */
    public Executor m10419c() {
        return this.f7964a;
    }
}
