package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$3 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106387q;

    @Override // en0.InterfaceC18505l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object mo205i9(DebugProbesImpl.CoroutineOwner coroutineOwner) {
        boolean m113247f;
        InterfaceC27315f m113236c;
        m113247f = DebugProbesImpl.f106373a.m113247f(coroutineOwner);
        if (m113247f || (m113236c = coroutineOwner.f106384q.m113236c()) == null) {
            return null;
        }
        return this.f106387q.mo240pC(coroutineOwner, m113236c);
    }
}
