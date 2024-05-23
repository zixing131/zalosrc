package kotlinx.coroutines.internal;

import fn0.AbstractC19074t;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@InternalCoroutinesApi
/* loaded from: classes7.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f107433b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    private volatile int _size;

    /* renamed from: a */
    private ThreadSafeHeapNode[] f107434a;

    /* renamed from: f */
    private final ThreadSafeHeapNode[] m113736f() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
        if (threadSafeHeapNodeArr == null) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = new ThreadSafeHeapNode[4];
            this.f107434a = threadSafeHeapNodeArr2;
            return threadSafeHeapNodeArr2;
        }
        if (m113743c() >= threadSafeHeapNodeArr.length) {
            Object[] copyOf = Arrays.copyOf(threadSafeHeapNodeArr, m113743c() * 2);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            ThreadSafeHeapNode[] threadSafeHeapNodeArr3 = (ThreadSafeHeapNode[]) copyOf;
            this.f107434a = threadSafeHeapNodeArr3;
            return threadSafeHeapNodeArr3;
        }
        return threadSafeHeapNodeArr;
    }

    /* renamed from: j */
    private final void m113737j(int i11) {
        f107433b.set(this, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:            if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m113738k(int i11) {
        while (true) {
            int i12 = i11 * 2;
            int i13 = i12 + 1;
            if (i13 >= m113743c()) {
                return;
            }
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
            AbstractC19074t.m100205c(threadSafeHeapNodeArr);
            int i14 = i12 + 2;
            if (i14 < m113743c()) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i14];
                AbstractC19074t.m100205c(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i13];
                AbstractC19074t.m100205c(threadSafeHeapNode2);
            }
            i14 = i13;
            ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[i11];
            AbstractC19074t.m100205c(threadSafeHeapNode3);
            ThreadSafeHeapNode threadSafeHeapNode4 = threadSafeHeapNodeArr[i14];
            AbstractC19074t.m100205c(threadSafeHeapNode4);
            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) <= 0) {
                return;
            }
            m113740m(i11, i14);
            i11 = i14;
        }
    }

    /* renamed from: l */
    private final void m113739l(int i11) {
        while (i11 > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
            AbstractC19074t.m100205c(threadSafeHeapNodeArr);
            int i12 = (i11 - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i12];
            AbstractC19074t.m100205c(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i11];
            AbstractC19074t.m100205c(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            m113740m(i11, i12);
            i11 = i12;
        }
    }

    /* renamed from: m */
    private final void m113740m(int i11, int i12) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
        AbstractC19074t.m100205c(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i12];
        AbstractC19074t.m100205c(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i11];
        AbstractC19074t.m100205c(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i11] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i12] = threadSafeHeapNode2;
        threadSafeHeapNode.mo112711e(i11);
        threadSafeHeapNode2.mo112711e(i12);
    }

    /* renamed from: a */
    public final void m113741a(ThreadSafeHeapNode threadSafeHeapNode) {
        threadSafeHeapNode.mo112709b(this);
        ThreadSafeHeapNode[] m113736f = m113736f();
        int m113743c = m113743c();
        m113737j(m113743c + 1);
        m113736f[m113743c] = threadSafeHeapNode;
        threadSafeHeapNode.mo112711e(m113743c);
        m113739l(m113743c);
    }

    /* renamed from: b */
    public final ThreadSafeHeapNode m113742b() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
        if (threadSafeHeapNodeArr != null) {
            return threadSafeHeapNodeArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m113743c() {
        return f107433b.get(this);
    }

    /* renamed from: d */
    public final boolean m113744d() {
        if (m113743c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final ThreadSafeHeapNode m113745e() {
        ThreadSafeHeapNode m113742b;
        synchronized (this) {
            m113742b = m113742b();
        }
        return m113742b;
    }

    /* renamed from: g */
    public final boolean m113746g(ThreadSafeHeapNode threadSafeHeapNode) {
        boolean z11;
        synchronized (this) {
            if (threadSafeHeapNode.mo112710c() == null) {
                z11 = false;
            } else {
                m113747h(threadSafeHeapNode.mo112712g());
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: h */
    public final ThreadSafeHeapNode m113747h(int i11) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f107434a;
        AbstractC19074t.m100205c(threadSafeHeapNodeArr);
        m113737j(m113743c() - 1);
        if (i11 < m113743c()) {
            m113740m(i11, m113743c());
            int i12 = (i11 - 1) / 2;
            if (i11 > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i11];
                AbstractC19074t.m100205c(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i12];
                AbstractC19074t.m100205c(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    m113740m(i11, i12);
                    m113739l(i12);
                }
            }
            m113738k(i11);
        }
        ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[m113743c()];
        AbstractC19074t.m100205c(threadSafeHeapNode3);
        threadSafeHeapNode3.mo112709b(null);
        threadSafeHeapNode3.mo112711e(-1);
        threadSafeHeapNodeArr[m113743c()] = null;
        return threadSafeHeapNode3;
    }

    /* renamed from: i */
    public final ThreadSafeHeapNode m113748i() {
        ThreadSafeHeapNode threadSafeHeapNode;
        synchronized (this) {
            if (m113743c() > 0) {
                threadSafeHeapNode = m113747h(0);
            } else {
                threadSafeHeapNode = null;
            }
        }
        return threadSafeHeapNode;
    }
}
