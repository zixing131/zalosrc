package kotlinx.coroutines;

import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public abstract class JobNode extends CompletionHandlerBase implements DisposableHandle, Incomplete {

    /* renamed from: s */
    public JobSupport f105901s;

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public NodeList mo112682a() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: c */
    public boolean mo112683c() {
        return true;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        m112774s().m112824d1(this);
    }

    /* renamed from: s */
    public final JobSupport m112774s() {
        JobSupport jobSupport = this.f105901s;
        if (jobSupport != null) {
            return jobSupport;
        }
        AbstractC19074t.m100223u("job");
        return null;
    }

    /* renamed from: t */
    public final void m112775t(JobSupport jobSupport) {
        this.f105901s = jobSupport;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return DebugStringsKt.m112647a(this) + '@' + DebugStringsKt.m112648b(this) + "[job@" + DebugStringsKt.m112648b(m112774s()) + ']';
    }
}
