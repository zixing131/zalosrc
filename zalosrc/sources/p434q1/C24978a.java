package p434q1;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p665y0.C30245g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q1.a */
/* loaded from: classes2.dex */
public class C24978a {

    /* renamed from: g */
    public static final ThreadLocal f119650g = new ThreadLocal();

    /* renamed from: d */
    private c f119654d;

    /* renamed from: a */
    private final C30245g f119651a = new C30245g();

    /* renamed from: b */
    final ArrayList f119652b = new ArrayList();

    /* renamed from: c */
    private final a f119653c = new a();

    /* renamed from: e */
    long f119655e = 0;

    /* renamed from: f */
    private boolean f119656f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.a$a */
    /* loaded from: classes2.dex */
    public class a {
        a() {
        }

        /* renamed from: a */
        void m129693a() {
            C24978a.this.f119655e = SystemClock.uptimeMillis();
            C24978a c24978a = C24978a.this;
            c24978a.m129690c(c24978a.f119655e);
            if (C24978a.this.f119652b.size() > 0) {
                C24978a.this.m129691e().mo129695a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.a$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        boolean mo129694a(long j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.a$c */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        final a f119658a;

        c(a aVar) {
            this.f119658a = aVar;
        }

        /* renamed from: a */
        abstract void mo129695a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1.a$d */
    /* loaded from: classes2.dex */
    public static class d extends c {

        /* renamed from: b */
        private final Choreographer f119659b;

        /* renamed from: c */
        private final Choreographer.FrameCallback f119660c;

        /* renamed from: q1.a$d$a */
        /* loaded from: classes2.dex */
        class a implements Choreographer.FrameCallback {
            a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                d.this.f119658a.m129693a();
            }
        }

        d(a aVar) {
            super(aVar);
            this.f119659b = Choreographer.getInstance();
            this.f119660c = new a();
        }

        @Override // p434q1.C24978a.c
        /* renamed from: a */
        void mo129695a() {
            this.f119659b.postFrameCallback(this.f119660c);
        }
    }

    C24978a() {
    }

    /* renamed from: b */
    private void m129686b() {
        if (this.f119656f) {
            for (int size = this.f119652b.size() - 1; size >= 0; size--) {
                if (this.f119652b.get(size) == null) {
                    this.f119652b.remove(size);
                }
            }
            this.f119656f = false;
        }
    }

    /* renamed from: d */
    public static C24978a m129687d() {
        ThreadLocal threadLocal = f119650g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C24978a());
        }
        return (C24978a) threadLocal.get();
    }

    /* renamed from: f */
    private boolean m129688f(b bVar, long j11) {
        Long l11 = (Long) this.f119651a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() < j11) {
            this.f119651a.remove(bVar);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m129689a(b bVar, long j11) {
        if (this.f119652b.size() == 0) {
            m129691e().mo129695a();
        }
        if (!this.f119652b.contains(bVar)) {
            this.f119652b.add(bVar);
        }
        if (j11 > 0) {
            this.f119651a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j11));
        }
    }

    /* renamed from: c */
    void m129690c(long j11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f119652b.size(); i11++) {
            b bVar = (b) this.f119652b.get(i11);
            if (bVar != null && m129688f(bVar, uptimeMillis)) {
                bVar.mo129694a(j11);
            }
        }
        m129686b();
    }

    /* renamed from: e */
    c m129691e() {
        if (this.f119654d == null) {
            this.f119654d = new d(this.f119653c);
        }
        return this.f119654d;
    }

    /* renamed from: g */
    public void m129692g(b bVar) {
        this.f119651a.remove(bVar);
        int indexOf = this.f119652b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f119652b.set(indexOf, null);
            this.f119656f = true;
        }
    }
}
