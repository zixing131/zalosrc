package kotlinx.coroutines.internal;

import en0.InterfaceC18494a;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes7.dex */
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends LockFreeLinkedListNode.CondAddOp {

    /* renamed from: d */
    final /* synthetic */ InterfaceC18494a f107389d;

    @Override // kotlinx.coroutines.internal.AtomicOp
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object mo112836d(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (((Boolean) this.f107389d.mo12V4()).booleanValue()) {
            return null;
        }
        return LockFreeLinkedListKt.m113647a();
    }
}
