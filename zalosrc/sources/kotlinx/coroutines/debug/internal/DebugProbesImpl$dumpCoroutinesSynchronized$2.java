package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* loaded from: classes7.dex */
final class DebugProbesImpl$dumpCoroutinesSynchronized$2 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    public static final DebugProbesImpl$dumpCoroutinesSynchronized$2 f106388q = new DebugProbesImpl$dumpCoroutinesSynchronized$2();

    DebugProbesImpl$dumpCoroutinesSynchronized$2() {
        super(1);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean mo205i9(DebugProbesImpl.CoroutineOwner coroutineOwner) {
        boolean m113247f;
        m113247f = DebugProbesImpl.f106373a.m113247f(coroutineOwner);
        return Boolean.valueOf(!m113247f);
    }
}
