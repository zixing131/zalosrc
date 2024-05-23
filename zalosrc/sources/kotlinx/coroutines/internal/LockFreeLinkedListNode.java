package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC1246b;
import fn0.AbstractC19043b0;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public class LockFreeLinkedListNode {

    /* renamed from: p */
    private static final AtomicReferenceFieldUpdater f107384p = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: q */
    private static final AtomicReferenceFieldUpdater f107385q = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f107386r = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* loaded from: classes.dex */
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        /* renamed from: b */
        public final LockFreeLinkedListNode f107387b;

        /* renamed from: c */
        public LockFreeLinkedListNode f107388c;

        public CondAddOp(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f107387b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo113582b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z11;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (obj == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                lockFreeLinkedListNode2 = this.f107387b;
            } else {
                lockFreeLinkedListNode2 = this.f107388c;
            }
            if (lockFreeLinkedListNode2 != null && AbstractC1246b.m5921a(LockFreeLinkedListNode.f107384p, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z11) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f107387b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f107388c;
                AbstractC19074t.m100205c(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.m113653i(lockFreeLinkedListNode4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:            if (androidx.concurrent.futures.AbstractC1246b.m5921a(r4, r3, r2, ((kotlinx.coroutines.internal.Removed) r5).f107412a) != false) goto L26;     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final LockFreeLinkedListNode m113651g(OpDescriptor opDescriptor) {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) f107385q.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107384p;
                    Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        if (AbstractC1246b.m5921a(f107385q, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            return lockFreeLinkedListNode2;
                        }
                    } else {
                        if (mo113646m()) {
                            return null;
                        }
                        if (obj == opDescriptor) {
                            return lockFreeLinkedListNode2;
                        }
                        if (obj instanceof OpDescriptor) {
                            ((OpDescriptor) obj).mo113581a(lockFreeLinkedListNode2);
                            break;
                        }
                        if (obj instanceof Removed) {
                            if (lockFreeLinkedListNode3 != null) {
                                break;
                            }
                            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) f107385q.get(lockFreeLinkedListNode2);
                        } else {
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                        }
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    /* renamed from: h */
    private final LockFreeLinkedListNode m113652h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo113646m()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f107385q.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m113653i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107385q;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (m113656j() != lockFreeLinkedListNode) {
                return;
            }
        } while (!AbstractC1246b.m5921a(f107385q, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (mo113646m()) {
            lockFreeLinkedListNode.m113651g(null);
        }
    }

    /* renamed from: p */
    private final Removed m113654p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107386r;
        Removed removed = (Removed) atomicReferenceFieldUpdater.get(this);
        if (removed == null) {
            Removed removed2 = new Removed(this);
            atomicReferenceFieldUpdater.lazySet(this, removed2);
            return removed2;
        }
        return removed;
    }

    /* renamed from: f */
    public final boolean m113655f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f107385q.lazySet(lockFreeLinkedListNode, this);
        f107384p.lazySet(lockFreeLinkedListNode, this);
        while (m113656j() == this) {
            if (AbstractC1246b.m5921a(f107384p, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.m113653i(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final Object m113656j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107384p;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo113581a(this);
        }
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode m113657k() {
        return LockFreeLinkedListKt.m113648b(m113656j());
    }

    /* renamed from: l */
    public final LockFreeLinkedListNode m113658l() {
        LockFreeLinkedListNode m113651g = m113651g(null);
        if (m113651g == null) {
            return m113652h((LockFreeLinkedListNode) f107385q.get(this));
        }
        return m113651g;
    }

    /* renamed from: m */
    public boolean mo113646m() {
        return m113656j() instanceof Removed;
    }

    /* renamed from: n */
    public boolean m113659n() {
        if (m113660o() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final LockFreeLinkedListNode m113660o() {
        Object m113656j;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            m113656j = m113656j();
            if (m113656j instanceof Removed) {
                return ((Removed) m113656j).f107412a;
            }
            if (m113656j == this) {
                return (LockFreeLinkedListNode) m113656j;
            }
            AbstractC19074t.m100206d(m113656j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) m113656j;
        } while (!AbstractC1246b.m5921a(f107384p, this, m113656j, lockFreeLinkedListNode.m113654p()));
        lockFreeLinkedListNode.m113651g(null);
        return null;
    }

    /* renamed from: q */
    public final int m113661q(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, CondAddOp condAddOp) {
        f107385q.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107384p;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        condAddOp.f107388c = lockFreeLinkedListNode2;
        if (!AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, condAddOp)) {
            return 0;
        }
        if (condAddOp.mo113581a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new AbstractC19043b0(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // mn0.InterfaceC23368f
            public Object get() {
                return DebugStringsKt.m112647a(this.f94922q);
            }
        } + '@' + DebugStringsKt.m112648b(this);
    }
}
