package ag0;

import android.os.Build;
import android.os.Process;
import fg0.ThreadFactoryC18928a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p471r3.C25630b;

/* renamed from: ag0.r */
/* loaded from: classes6.dex */
public abstract class AbstractC0840r {

    /* renamed from: i */
    private static final ThreadPoolExecutor f2956i = m2250e();

    /* renamed from: j */
    private static final List f2957j = new ArrayList();

    /* renamed from: k */
    private static final List f2958k = new ArrayList();

    /* renamed from: l */
    private static final HashMap f2959l = new HashMap();

    /* renamed from: m */
    private static int f2960m = 0;

    /* renamed from: n */
    static final String f2961n = AbstractC0840r.class.getSimpleName();

    /* renamed from: a */
    String f2962a;

    /* renamed from: b */
    final k f2963b;

    /* renamed from: c */
    final h f2964c;

    /* renamed from: d */
    private volatile i f2965d = i.PENDING;

    /* renamed from: e */
    private final AtomicBoolean f2966e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f2967f = new AtomicBoolean();

    /* renamed from: g */
    protected j f2968g;

    /* renamed from: h */
    protected Object f2969h;

    /* renamed from: ag0.r$a */
    /* loaded from: classes6.dex */
    class a extends k {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC0840r.this.f2967f.set(true);
            Process.setThreadPriority(10);
            AbstractC0840r abstractC0840r = AbstractC0840r.this;
            return abstractC0840r.m2263s(abstractC0840r.mo2215f(this.f2981a));
        }
    }

    /* renamed from: ag0.r$b */
    /* loaded from: classes6.dex */
    class b extends h {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC0840r.this.m2264t(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                AbstractC0840r.this.m2264t(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occured while executing doInBackground()", e11.getCause());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.r$c */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2972a;

        static {
            int[] iArr = new int[i.values().length];
            f2972a = iArr;
            try {
                iArr[i.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2972a[i.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ag0.r$d */
    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: a */
        final AbstractC0840r f2973a;

        /* renamed from: b */
        final Object[] f2974b;

        d(AbstractC0840r abstractC0840r, Object... objArr) {
            this.f2973a = abstractC0840r;
            this.f2974b = objArr;
        }
    }

    /* renamed from: ag0.r$e */
    /* loaded from: classes6.dex */
    public static abstract class e extends j {
        /* renamed from: c */
        public abstract void mo2265c(C25630b c25630b);
    }

    /* renamed from: ag0.r$f */
    /* loaded from: classes6.dex */
    public static abstract class f extends j {
        /* renamed from: c */
        public abstract void mo2266c(List list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ag0.r$g */
    /* loaded from: classes6.dex */
    public static class g implements Comparator {
        private g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (runnable == null && runnable2 == null) {
                return 0;
            }
            if (runnable == null) {
                return 1;
            }
            if (runnable2 == null) {
                return -1;
            }
            boolean z11 = runnable instanceof h;
            if (!z11 && !(runnable2 instanceof h)) {
                return 0;
            }
            if (!z11) {
                return -1;
            }
            if (!(runnable2 instanceof h)) {
                return 1;
            }
            h hVar = (h) runnable;
            int i11 = hVar.f2975p;
            long j11 = hVar.f2976q;
            h hVar2 = (h) runnable2;
            int i12 = hVar2.f2975p;
            long j12 = hVar2.f2976q;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            return Long.compare(j11, j12);
        }
    }

    /* renamed from: ag0.r$h */
    /* loaded from: classes6.dex */
    public static class h extends FutureTask {

        /* renamed from: p */
        public int f2975p;

        /* renamed from: q */
        public long f2976q;

        public h(Callable callable) {
            super(callable);
            this.f2975p = 2;
        }
    }

    /* renamed from: ag0.r$i */
    /* loaded from: classes6.dex */
    public enum i {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: ag0.r$j */
    /* loaded from: classes6.dex */
    public static abstract class j {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2269a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public void mo2270b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.r$k */
    /* loaded from: classes6.dex */
    public static abstract class k implements Callable {

        /* renamed from: a */
        Object[] f2981a;

        k() {
        }
    }

    public AbstractC0840r(j jVar, Object obj) {
        this.f2968g = jVar;
        this.f2969h = obj;
        a aVar = new a();
        this.f2963b = aVar;
        this.f2964c = new b(aVar);
    }

    /* renamed from: c */
    public static void m2248c(String str) {
        for (AbstractC0840r abstractC0840r : f2958k) {
            if (abstractC0840r.f2962a.equals(str)) {
                abstractC0840r.m2252b(true);
                f2958k.remove(abstractC0840r);
                return;
            }
        }
        for (AbstractC0840r abstractC0840r2 : f2957j) {
            if (abstractC0840r2.f2962a.equals(str)) {
                abstractC0840r2.m2252b(true);
                f2957j.remove(abstractC0840r2);
                return;
            }
        }
    }

    /* renamed from: d */
    static void m2249d(String str, int i11) {
        if (i11 == 1) {
            int size = f2957j.size();
            for (int i12 = 0; i12 < size; i12++) {
                List list = f2957j;
                if (((AbstractC0840r) list.get(i12)).f2962a.equals(str)) {
                    f2958k.add((AbstractC0840r) list.remove(i12));
                    return;
                }
            }
        }
        if (i11 == 3) {
            int size2 = f2958k.size();
            for (int i13 = 0; i13 < size2; i13++) {
                List list2 = f2958k;
                if (((AbstractC0840r) list2.get(i13)).f2962a.equals(str)) {
                    list2.add(0, (AbstractC0840r) list2.remove(i13));
                    return;
                }
            }
            int size3 = f2957j.size();
            for (int i14 = 0; i14 < size3; i14++) {
                List list3 = f2957j;
                if (((AbstractC0840r) list3.get(i14)).f2962a.equals(str)) {
                    f2958k.add(0, (AbstractC0840r) list3.remove(i14));
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    private static ThreadPoolExecutor m2250e() {
        int i11;
        if (Build.VERSION.SDK_INT >= 24) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, i11, 30L, TimeUnit.SECONDS, new PriorityBlockingQueue(2, new g()), new ThreadFactoryC18928a("ParseStickerAsyncTask"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: h */
    public static void m2251h(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = f2956i;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(runnable);
        }
    }

    /* renamed from: b */
    public final boolean m2252b(boolean z11) {
        this.f2966e.set(true);
        return this.f2964c.cancel(z11);
    }

    /* renamed from: f */
    protected abstract Object mo2215f(Object... objArr);

    /* renamed from: g */
    public final AbstractC0840r m2253g(Object... objArr) {
        return m2255j(f2956i, 1, objArr);
    }

    /* renamed from: i */
    public final AbstractC0840r m2254i(Object... objArr) {
        return m2255j(f2956i, 3, objArr);
    }

    /* renamed from: j */
    public final AbstractC0840r m2255j(Executor executor, int i11, Object... objArr) {
        Object obj;
        Object obj2;
        if (this.f2965d != i.PENDING) {
            int i12 = c.f2972a[this.f2965d.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
        this.f2963b.f2981a = objArr;
        mo2216r();
        this.f2965d = i.RUNNING;
        m2262q();
        h hVar = this.f2964c;
        hVar.f2975p = i11;
        hVar.f2976q = System.currentTimeMillis();
        synchronized (AbstractC0840r.class) {
            try {
                HashMap hashMap = f2959l;
                HashMap hashMap2 = (HashMap) hashMap.get(this.f2962a);
                if (hashMap2 != null) {
                    j jVar = this.f2968g;
                    if (jVar != null && (obj2 = this.f2969h) != null) {
                        hashMap2.put(obj2, jVar);
                    }
                    m2249d(this.f2962a, i11);
                } else {
                    HashMap hashMap3 = new HashMap();
                    hashMap.put(this.f2962a, hashMap3);
                    j jVar2 = this.f2968g;
                    if (jVar2 != null && (obj = this.f2969h) != null) {
                        hashMap3.put(obj, jVar2);
                    }
                    if (f2960m < f2956i.getCorePoolSize()) {
                        f2960m++;
                        executor.execute(this.f2964c);
                    } else if (i11 == 3) {
                        f2958k.add(0, this);
                    } else if (i11 == 1) {
                        f2958k.add(this);
                    } else {
                        f2957j.add(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    /* renamed from: k */
    void m2256k(Object obj) {
        if (m2258m()) {
            m2260o(obj);
        } else {
            m2261p(obj);
        }
        this.f2965d = i.FINISHED;
        synchronized (AbstractC0840r.class) {
            try {
                f2960m--;
                List list = f2958k;
                if (list.size() > 0) {
                    f2956i.execute(((AbstractC0840r) list.remove(0)).f2964c);
                    f2960m++;
                } else {
                    List list2 = f2957j;
                    if (list2.size() > 0) {
                        f2956i.execute(((AbstractC0840r) list2.remove(0)).f2964c);
                        f2960m++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public HashMap m2257l() {
        HashMap hashMap;
        synchronized (AbstractC0840r.class) {
            try {
                HashMap hashMap2 = f2959l;
                if (hashMap2.containsKey(this.f2962a)) {
                    hashMap = (HashMap) hashMap2.remove(this.f2962a);
                } else {
                    hashMap = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    public final boolean m2258m() {
        return this.f2966e.get();
    }

    /* renamed from: n */
    protected void m2259n() {
    }

    /* renamed from: o */
    protected void m2260o(Object obj) {
        m2259n();
    }

    /* renamed from: p */
    protected void m2261p(Object obj) {
    }

    /* renamed from: q */
    protected void m2262q() {
    }

    /* renamed from: r */
    protected abstract void mo2216r();

    /* renamed from: s */
    Object m2263s(Object obj) {
        d dVar = new d(this, obj);
        dVar.f2973a.m2256k(dVar.f2974b[0]);
        return obj;
    }

    /* renamed from: t */
    void m2264t(Object obj) {
        if (!this.f2967f.get()) {
            m2263s(obj);
        }
    }
}
