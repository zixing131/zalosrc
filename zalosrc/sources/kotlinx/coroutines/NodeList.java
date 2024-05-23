package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListHead;

/* loaded from: classes.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public NodeList mo112682a() {
        return this;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: c */
    public boolean mo112683c() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return super.toString();
    }
}
