package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import nn0.AbstractC23900i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29103k;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.JobSupport$children$1", m145345f = "JobSupport.kt", m145346l = {955, 957}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class JobSupport$children$1 extends AbstractC29103k implements InterfaceC18509p {

    /* renamed from: r */
    Object f105919r;

    /* renamed from: s */
    Object f105920s;

    /* renamed from: t */
    int f105921t;

    /* renamed from: u */
    private /* synthetic */ Object f105922u;

    /* renamed from: v */
    final /* synthetic */ JobSupport f105923v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation continuation) {
        super(2, continuation);
        this.f105923v = jobSupport;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f105923v, continuation);
        jobSupport$children$1.f105922u = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        NodeList mo112682a;
        AbstractC23900i abstractC23900i;
        JobSupport$children$1 jobSupport$children$1;
        LockFreeLinkedListHead lockFreeLinkedListHead;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f105921t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) this.f105920s;
                    lockFreeLinkedListHead = (LockFreeLinkedListHead) this.f105919r;
                    abstractC23900i = (AbstractC23900i) this.f105922u;
                    AbstractC24862s.m129228b(obj);
                    jobSupport$children$1 = this;
                    lockFreeLinkedListNode = lockFreeLinkedListNode.m113657k();
                    if (!AbstractC19074t.m100204b(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                        if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                            ChildJob childJob = ((ChildHandleNode) lockFreeLinkedListNode).f105821t;
                            jobSupport$children$1.f105922u = abstractC23900i;
                            jobSupport$children$1.f105919r = lockFreeLinkedListHead;
                            jobSupport$children$1.f105920s = lockFreeLinkedListNode;
                            jobSupport$children$1.f105921t = 2;
                            if (abstractC23900i.mo124992a(childJob, jobSupport$children$1) == m142578e) {
                                return m142578e;
                            }
                        }
                        lockFreeLinkedListNode = lockFreeLinkedListNode.m113657k();
                        if (!AbstractC19074t.m100204b(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
            }
        } else {
            AbstractC24862s.m129228b(obj);
            AbstractC23900i abstractC23900i2 = (AbstractC23900i) this.f105922u;
            Object m112815G0 = this.f105923v.m112815G0();
            if (m112815G0 instanceof ChildHandleNode) {
                ChildJob childJob2 = ((ChildHandleNode) m112815G0).f105821t;
                this.f105921t = 1;
                if (abstractC23900i2.mo124992a(childJob2, this) == m142578e) {
                    return m142578e;
                }
            } else if ((m112815G0 instanceof Incomplete) && (mo112682a = ((Incomplete) m112815G0).mo112682a()) != null) {
                Object m113656j = mo112682a.m113656j();
                AbstractC19074t.m100206d(m113656j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) m113656j;
                abstractC23900i = abstractC23900i2;
                jobSupport$children$1 = this;
                lockFreeLinkedListHead = mo112682a;
                lockFreeLinkedListNode = lockFreeLinkedListNode2;
                if (!AbstractC19074t.m100204b(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                }
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(AbstractC23900i abstractC23900i, Continuation continuation) {
        return ((JobSupport$children$1) mo238a(abstractC23900i, continuation)).mo239o(C24848g0.f119245a);
    }
}
