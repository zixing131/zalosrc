package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AbstractC1915h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes2.dex */
public class C1911d {

    /* renamed from: h */
    private static final Executor f7978h = new c();

    /* renamed from: a */
    private final InterfaceC1926s f7979a;

    /* renamed from: b */
    final C1909c f7980b;

    /* renamed from: c */
    Executor f7981c;

    /* renamed from: e */
    private List f7983e;

    /* renamed from: g */
    int f7985g;

    /* renamed from: d */
    private final List f7982d = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List f7984f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ List f7986p;

        /* renamed from: q */
        final /* synthetic */ List f7987q;

        /* renamed from: r */
        final /* synthetic */ int f7988r;

        /* renamed from: s */
        final /* synthetic */ Runnable f7989s;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C32638a extends AbstractC1915h.b {
            C32638a() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1915h.b
            /* renamed from: a */
            public boolean mo421a(int i11, int i12) {
                Object obj = a.this.f7986p.get(i11);
                Object obj2 = a.this.f7987q.get(i12);
                if (obj != null && obj2 != null) {
                    return C1911d.this.f7980b.m10418b().mo10506a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.AbstractC1915h.b
            /* renamed from: b */
            public boolean mo422b(int i11, int i12) {
                Object obj = a.this.f7986p.get(i11);
                Object obj2 = a.this.f7987q.get(i12);
                if (obj != null && obj2 != null) {
                    return C1911d.this.f7980b.m10418b().mo10507b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.AbstractC1915h.b
            /* renamed from: c */
            public Object mo423c(int i11, int i12) {
                Object obj = a.this.f7986p.get(i11);
                Object obj2 = a.this.f7987q.get(i12);
                if (obj != null && obj2 != null) {
                    return C1911d.this.f7980b.m10418b().mo10508c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.AbstractC1915h.b
            /* renamed from: d */
            public int mo424d() {
                return a.this.f7987q.size();
            }

            @Override // androidx.recyclerview.widget.AbstractC1915h.b
            /* renamed from: e */
            public int mo425e() {
                return a.this.f7986p.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes2.dex */
        class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ AbstractC1915h.c f7992p;

            b(AbstractC1915h.c cVar) {
                this.f7992p = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C1911d c1911d = C1911d.this;
                if (c1911d.f7985g == aVar.f7988r) {
                    c1911d.m10445c(aVar.f7987q, this.f7992p, aVar.f7989s);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f7986p = list;
            this.f7987q = list2;
            this.f7988r = i11;
            this.f7989s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1911d.this.f7981c.execute(new b(AbstractC1915h.m10492a(new C32638a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo10448a(List list, List list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes2.dex */
    private static class c implements Executor {

        /* renamed from: p */
        final Handler f7994p = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f7994p.post(runnable);
        }
    }

    public C1911d(InterfaceC1926s interfaceC1926s, C1909c c1909c) {
        this.f7979a = interfaceC1926s;
        this.f7980b = c1909c;
        if (c1909c.m10419c() != null) {
            this.f7981c = c1909c.m10419c();
        } else {
            this.f7981c = f7978h;
        }
    }

    /* renamed from: d */
    private void m10442d(List list, Runnable runnable) {
        Iterator it = this.f7982d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo10448a(list, this.f7984f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m10443a(b bVar) {
        this.f7982d.add(bVar);
    }

    /* renamed from: b */
    public List m10444b() {
        return this.f7984f;
    }

    /* renamed from: c */
    void m10445c(List list, AbstractC1915h.c cVar, Runnable runnable) {
        List list2 = this.f7984f;
        this.f7983e = list;
        this.f7984f = Collections.unmodifiableList(list);
        cVar.m10504d(this.f7979a);
        m10442d(list2, runnable);
    }

    /* renamed from: e */
    public void m10446e(List list) {
        m10447f(list, null);
    }

    /* renamed from: f */
    public void m10447f(List list, Runnable runnable) {
        int i11 = this.f7985g + 1;
        this.f7985g = i11;
        List list2 = this.f7983e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f7984f;
        if (list == null) {
            int size = list2.size();
            this.f7983e = null;
            this.f7984f = Collections.emptyList();
            this.f7979a.mo10407b(0, size);
            m10442d(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.f7983e = list;
            this.f7984f = Collections.unmodifiableList(list);
            this.f7979a.mo10406a(0, list.size());
            m10442d(list3, runnable);
            return;
        }
        this.f7980b.m10417a().execute(new a(list2, list, i11, runnable));
    }
}
