package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.coroutines.Job;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class SafeCollector_commonKt$checkContext$result$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    final /* synthetic */ SafeCollector f107324q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector safeCollector) {
        super(2);
        this.f107324q = safeCollector;
    }

    /* renamed from: a */
    public final Integer m113564a(int i11, InterfaceC27315f.b bVar) {
        int i12;
        InterfaceC27315f.c key = bVar.getKey();
        InterfaceC27315f.b mo112624d = this.f107324q.f107317t.mo112624d(key);
        if (key != Job.f105897m) {
            if (bVar != mo112624d) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = i11 + 1;
            }
            return Integer.valueOf(i12);
        }
        Job job = (Job) mo112624d;
        AbstractC19074t.m100206d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        Job m113563b = SafeCollector_commonKt.m113563b((Job) bVar, job);
        if (m113563b == job) {
            if (job != null) {
                i11++;
            }
            return Integer.valueOf(i11);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m113563b + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113564a(((Number) obj).intValue(), (InterfaceC27315f.b) obj2);
    }
}
