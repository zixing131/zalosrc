package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class DebugProbesImpl$startWeakRefCleanerThread$1 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public static final DebugProbesImpl$startWeakRefCleanerThread$1 f106389q = new DebugProbesImpl$startWeakRefCleanerThread$1();

    DebugProbesImpl$startWeakRefCleanerThread$1() {
        super(0);
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public /* bridge */ /* synthetic */ Object mo12V4() {
        m113256a();
        return C24848g0.f119245a;
    }

    /* renamed from: a */
    public final void m113256a() {
        ConcurrentWeakMap concurrentWeakMap;
        concurrentWeakMap = DebugProbesImpl.f106380h;
        concurrentWeakMap.m113212l();
    }
}
