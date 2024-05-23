package kotlinx.coroutines.internal;

import com.google.android.gms.internal.ads.ya3;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* loaded from: classes7.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* renamed from: p */
    private static final AtomicReferenceFieldUpdater f107351p = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");

    /* renamed from: q */
    private static final AtomicReferenceFieldUpdater f107352q = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public ConcurrentLinkedListNode(ConcurrentLinkedListNode concurrentLinkedListNode) {
        this._prev = concurrentLinkedListNode;
    }

    /* renamed from: c */
    private final ConcurrentLinkedListNode m113589c() {
        ConcurrentLinkedListNode m113594g = m113594g();
        while (m113594g != null && m113594g.mo113595h()) {
            m113594g = (ConcurrentLinkedListNode) f107352q.get(m113594g);
        }
        return m113594g;
    }

    /* renamed from: d */
    private final ConcurrentLinkedListNode m113590d() {
        ConcurrentLinkedListNode m113593e = m113593e();
        AbstractC19074t.m100205c(m113593e);
        while (m113593e.mo113595h()) {
            ConcurrentLinkedListNode m113593e2 = m113593e.m113593e();
            if (m113593e2 == null) {
                return m113593e;
            }
            m113593e = m113593e2;
        }
        return m113593e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final Object m113591f() {
        return f107351p.get(this);
    }

    /* renamed from: b */
    public final void m113592b() {
        f107352q.lazySet(this, null);
    }

    /* renamed from: e */
    public final ConcurrentLinkedListNode m113593e() {
        Object m113591f = m113591f();
        if (m113591f == ConcurrentLinkedListKt.m113585a()) {
            return null;
        }
        return (ConcurrentLinkedListNode) m113591f;
    }

    /* renamed from: g */
    public final ConcurrentLinkedListNode m113594g() {
        return (ConcurrentLinkedListNode) f107352q.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo113595h();

    /* renamed from: i */
    public final boolean m113596i() {
        if (m113593e() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m113597j() {
        return ya3.m28173a(f107351p, this, null, ConcurrentLinkedListKt.m113585a());
    }

    /* renamed from: k */
    public final void m113598k() {
        Object obj;
        ConcurrentLinkedListNode concurrentLinkedListNode;
        if (m113596i()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode m113589c = m113589c();
            ConcurrentLinkedListNode m113590d = m113590d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107352q;
            do {
                obj = atomicReferenceFieldUpdater.get(m113590d);
                if (((ConcurrentLinkedListNode) obj) == null) {
                    concurrentLinkedListNode = null;
                } else {
                    concurrentLinkedListNode = m113589c;
                }
            } while (!ya3.m28173a(atomicReferenceFieldUpdater, m113590d, obj, concurrentLinkedListNode));
            if (m113589c != null) {
                f107351p.set(m113589c, m113590d);
            }
            if (!m113590d.mo113595h() || m113590d.m113596i()) {
                if (m113589c == null || !m113589c.mo113595h()) {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean m113599l(ConcurrentLinkedListNode concurrentLinkedListNode) {
        return ya3.m28173a(f107351p, this, null, concurrentLinkedListNode);
    }
}
