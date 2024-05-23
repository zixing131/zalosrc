package kotlinx.coroutines.internal;

import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class LockFreeLinkedListKt {

    /* renamed from: a */
    private static final Object f107383a = new Symbol("CONDITION_FALSE");

    /* renamed from: a */
    public static final Object m113647a() {
        return f107383a;
    }

    /* renamed from: b */
    public static final LockFreeLinkedListNode m113648b(Object obj) {
        Removed removed;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        if (obj instanceof Removed) {
            removed = (Removed) obj;
        } else {
            removed = null;
        }
        if (removed == null || (lockFreeLinkedListNode = removed.f107412a) == null) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (LockFreeLinkedListNode) obj;
        }
        return lockFreeLinkedListNode;
    }
}
