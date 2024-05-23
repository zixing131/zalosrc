package androidx.work;

import com.google.common.util.concurrent.InterfaceFutureC6534a;
import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: androidx.work.s */
/* loaded from: classes2.dex */
public final class C2251s extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ InterfaceFutureC6534a f9465q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2251s(InterfaceFutureC6534a interfaceFutureC6534a) {
        super(1);
        this.f9465q = interfaceFutureC6534a;
    }

    /* renamed from: a */
    public final void m11888a(Throwable th2) {
        this.f9465q.cancel(false);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m11888a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
