package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$5$1 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ Flow[] f107062q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$5$1(Flow[] flowArr) {
        super(0);
        this.f107062q = flowArr;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object[] mo12V4() {
        int length = this.f107062q.length;
        AbstractC19074t.m100213k(0, "T?");
        return new Object[length];
    }
}
