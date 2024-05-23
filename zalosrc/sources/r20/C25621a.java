package r20;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p665y0.C30245g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r20.a */
/* loaded from: classes5.dex */
public class C25621a {

    /* renamed from: g */
    public static final ThreadLocal f122488g = new ThreadLocal();

    /* renamed from: d */
    private c f122492d;

    /* renamed from: a */
    private final C30245g f122489a = new C30245g();

    /* renamed from: b */
    final ArrayList f122490b = new ArrayList();

    /* renamed from: c */
    private final a f122491c = new a();

    /* renamed from: e */
    long f122493e = 0;

    /* renamed from: f */
    private boolean f122494f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r20.a$a */
    /* loaded from: classes5.dex */
    public class a {
        a() {
        }

        /* renamed from: a */
        void m132320a() {
            C25621a.this.f122493e = SystemClock.uptimeMillis();
            C25621a c25621a = C25621a.this;
            c25621a.m132317c(c25621a.f122493e);
            if (C25621a.this.f122490b.size() > 0) {
                C25621a.this.m132318e().mo132322a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r20.a$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        boolean mo132321a(long j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r20.a$c */
    /* loaded from: classes5.dex */
    public static abstract class c {

        /* renamed from: a */
        final a f122496a;

        c(a aVar) {
            this.f122496a = aVar;
        }

        /* renamed from: a */
        abstract void mo132322a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r20.a$d */
    /* loaded from: classes5.dex */
    public static class d extends c {

        /* renamed from: b */
        private final Choreographer f122497b;

        /* renamed from: c */
        private final Choreographer.FrameCallback f122498c;

        /* renamed from: r20.a$d$a */
        /* loaded from: classes5.dex */
        class a implements Choreographer.FrameCallback {
            a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                d.this.f122496a.m132320a();
            }
        }

        d(a aVar) {
            super(aVar);
            this.f122497b = Choreographer.getInstance();
            this.f122498c = new a();
        }

        @Override // r20.C25621a.c
        /* renamed from: a */
        void mo132322a() {
            this.f122497b.postFrameCallback(this.f122498c);
        }
    }

    C25621a() {
    }

    /* renamed from: b */
    private void m132313b() {
        if (this.f122494f) {
            for (int size = this.f122490b.size() - 1; size >= 0; size--) {
                if (this.f122490b.get(size) == null) {
                    this.f122490b.remove(size);
                }
            }
            this.f122494f = false;
        }
    }

    /* renamed from: d */
    public static C25621a m132314d() {
        ThreadLocal threadLocal = f122488g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C25621a());
        }
        return (C25621a) threadLocal.get();
    }

    /* renamed from: f */
    private boolean m132315f(b bVar, long j11) {
        Long l11 = (Long) this.f122489a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() < j11) {
            this.f122489a.remove(bVar);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m132316a(b bVar, long j11) {
        if (this.f122490b.size() == 0) {
            m132318e().mo132322a();
        }
        if (!this.f122490b.contains(bVar)) {
            this.f122490b.add(bVar);
        }
        if (j11 > 0) {
            this.f122489a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j11));
        }
    }

    /* renamed from: c */
    void m132317c(long j11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f122490b.size(); i11++) {
            b bVar = (b) this.f122490b.get(i11);
            if (bVar != null && m132315f(bVar, uptimeMillis)) {
                bVar.mo132321a(j11);
            }
        }
        m132313b();
    }

    /* renamed from: e */
    c m132318e() {
        if (this.f122492d == null) {
            this.f122492d = new d(this.f122491c);
        }
        return this.f122492d;
    }

    /* renamed from: g */
    public void m132319g(b bVar) {
        this.f122489a.remove(bVar);
        int indexOf = this.f122490b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f122490b.set(indexOf, null);
            this.f122494f = true;
        }
    }
}
