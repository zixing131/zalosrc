package androidx.recyclerview.widget;

import androidx.core.os.AbstractC1452r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes2.dex */
public final class RunnableC1918k implements Runnable {

    /* renamed from: t */
    static final ThreadLocal f8116t = new ThreadLocal();

    /* renamed from: u */
    static Comparator f8117u = new a();

    /* renamed from: q */
    long f8119q;

    /* renamed from: r */
    long f8120r;

    /* renamed from: p */
    ArrayList f8118p = new ArrayList();

    /* renamed from: s */
    private ArrayList f8121s = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes2.dex */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            boolean z11;
            boolean z12;
            RecyclerView recyclerView = cVar.f8129d;
            if (recyclerView == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (cVar2.f8129d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z13 = cVar.f8126a;
            if (z13 != cVar2.f8126a) {
                if (!z13) {
                    return 1;
                }
                return -1;
            }
            int i11 = cVar2.f8127b - cVar.f8127b;
            if (i11 != 0) {
                return i11;
            }
            int i12 = cVar.f8128c - cVar2.f8128c;
            if (i12 == 0) {
                return 0;
            }
            return i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.AbstractC1888o.c {

        /* renamed from: a */
        int f8122a;

        /* renamed from: b */
        int f8123b;

        /* renamed from: c */
        int[] f8124c;

        /* renamed from: d */
        int f8125d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o.c
        /* renamed from: a */
        public void mo10172a(int i11, int i12) {
            if (i11 >= 0) {
                if (i12 >= 0) {
                    int i13 = this.f8125d;
                    int i14 = i13 * 2;
                    int[] iArr = this.f8124c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f8124c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i14 >= iArr.length) {
                        int[] iArr3 = new int[i13 * 4];
                        this.f8124c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f8124c;
                    iArr4[i14] = i11;
                    iArr4[i14 + 1] = i12;
                    this.f8125d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m10543b() {
            int[] iArr = this.f8124c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f8125d = 0;
        }

        /* renamed from: c */
        void m10544c(RecyclerView recyclerView, boolean z11) {
            this.f8125d = 0;
            int[] iArr = this.f8124c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1888o abstractC1888o = recyclerView.f7692B;
            if (recyclerView.f7690A != null && abstractC1888o != null && abstractC1888o.m10153s0()) {
                if (z11) {
                    if (!recyclerView.f7746s.m10384p()) {
                        abstractC1888o.mo9722C(recyclerView.f7690A.mo10003k(), this);
                    }
                } else if (!recyclerView.m9838L0()) {
                    abstractC1888o.mo9720B(this.f8122a, this.f8123b, recyclerView.f7753v0, this);
                }
                int i11 = this.f8125d;
                if (i11 > abstractC1888o.f7823m) {
                    abstractC1888o.f7823m = i11;
                    abstractC1888o.f7824n = z11;
                    recyclerView.f7742q.m10202K();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m10545d(int i11) {
            if (this.f8124c != null) {
                int i12 = this.f8125d * 2;
                for (int i13 = 0; i13 < i12; i13 += 2) {
                    if (this.f8124c[i13] == i11) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m10546e(int i11, int i12) {
            this.f8122a = i11;
            this.f8123b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.k$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public boolean f8126a;

        /* renamed from: b */
        public int f8127b;

        /* renamed from: c */
        public int f8128c;

        /* renamed from: d */
        public RecyclerView f8129d;

        /* renamed from: e */
        public int f8130e;

        c() {
        }

        /* renamed from: a */
        public void m10547a() {
            this.f8126a = false;
            this.f8127b = 0;
            this.f8128c = 0;
            this.f8129d = null;
            this.f8130e = 0;
        }
    }

    /* renamed from: b */
    private void m10532b() {
        c cVar;
        boolean z11;
        int size = this.f8118p.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView = (RecyclerView) this.f8118p.get(i12);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f7751u0.m10544c(recyclerView, false);
                i11 += recyclerView.f7751u0.f8125d;
            }
        }
        this.f8121s.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f8118p.get(i14);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f7751u0;
                int abs = Math.abs(bVar.f8122a) + Math.abs(bVar.f8123b);
                for (int i15 = 0; i15 < bVar.f8125d * 2; i15 += 2) {
                    if (i13 >= this.f8121s.size()) {
                        cVar = new c();
                        this.f8121s.add(cVar);
                    } else {
                        cVar = (c) this.f8121s.get(i13);
                    }
                    int[] iArr = bVar.f8124c;
                    int i16 = iArr[i15 + 1];
                    if (i16 <= abs) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f8126a = z11;
                    cVar.f8127b = abs;
                    cVar.f8128c = i16;
                    cVar.f8129d = recyclerView2;
                    cVar.f8130e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(this.f8121s, f8117u);
    }

    /* renamed from: c */
    private void m10533c(c cVar, long j11) {
        long j12;
        if (cVar.f8126a) {
            j12 = Long.MAX_VALUE;
        } else {
            j12 = j11;
        }
        RecyclerView.AbstractC1876c0 m10537i = m10537i(cVar.f8129d, cVar.f8130e, j12);
        if (m10537i != null && m10537i.f7785q != null && m10537i.m9938N() && !m10537i.m9939O()) {
            m10536h((RecyclerView) m10537i.f7785q.get(), j11);
        }
    }

    /* renamed from: d */
    private void m10534d(long j11) {
        for (int i11 = 0; i11 < this.f8121s.size(); i11++) {
            c cVar = (c) this.f8121s.get(i11);
            if (cVar.f8129d != null) {
                m10533c(cVar, j11);
                cVar.m10547a();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m10535e(RecyclerView recyclerView, int i11) {
        int m10461j = recyclerView.f7748t.m10461j();
        for (int i12 = 0; i12 < m10461j; i12++) {
            RecyclerView.AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(recyclerView.f7748t.m10460i(i12));
            if (m9776D0.f7786r == i11 && !m9776D0.m9939O()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m10536h(RecyclerView recyclerView, long j11) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f7719R && recyclerView.f7748t.m10461j() != 0) {
            recyclerView.m9903v1();
        }
        b bVar = recyclerView.f7751u0;
        bVar.m10544c(recyclerView, true);
        if (bVar.f8125d != 0) {
            try {
                AbstractC1452r.m7366a("RV Nested Prefetch");
                recyclerView.f7753v0.m10257f(recyclerView.f7690A);
                for (int i11 = 0; i11 < bVar.f8125d * 2; i11 += 2) {
                    m10537i(recyclerView, bVar.f8124c[i11], j11);
                }
            } finally {
                AbstractC1452r.m7367b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC1876c0 m10537i(RecyclerView recyclerView, int i11, long j11) {
        if (m10535e(recyclerView, i11)) {
            return null;
        }
        RecyclerView.C1894u c1894u = recyclerView.f7742q;
        try {
            recyclerView.m9884h1();
            RecyclerView.AbstractC1876c0 m10200I = c1894u.m10200I(i11, false, j11);
            if (m10200I != null) {
                if (m10200I.m9938N() && !m10200I.m9939O()) {
                    c1894u.m10194B(m10200I.f7784p);
                } else {
                    c1894u.m10205a(m10200I, false);
                }
            }
            recyclerView.m9889j1(false);
            return m10200I;
        } catch (Throwable th2) {
            recyclerView.m9889j1(false);
            throw th2;
        }
    }

    /* renamed from: a */
    public void m10538a(RecyclerView recyclerView) {
        this.f8118p.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m10539f(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow() && this.f8119q == 0) {
            this.f8119q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f7751u0.m10546e(i11, i12);
    }

    /* renamed from: g */
    void m10540g(long j11) {
        m10532b();
        m10534d(j11);
    }

    /* renamed from: j */
    public void m10541j(RecyclerView recyclerView) {
        this.f8118p.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC1452r.m7366a("RV Prefetch");
            if (!this.f8118p.isEmpty()) {
                int size = this.f8118p.size();
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) this.f8118p.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j11 = Math.max(recyclerView.getDrawingTime(), j11);
                    }
                }
                if (j11 != 0) {
                    m10540g(TimeUnit.MILLISECONDS.toNanos(j11) + this.f8120r);
                    this.f8119q = 0L;
                    AbstractC1452r.m7367b();
                }
            }
        } finally {
            this.f8119q = 0L;
            AbstractC1452r.m7367b();
        }
    }
}
