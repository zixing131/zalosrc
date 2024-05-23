package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.BroadcastChannelImpl", m145345f = "BroadcastChannel.kt", m145346l = {230}, m145347m = "send")
/* loaded from: classes7.dex */
public final class BroadcastChannelImpl$send$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f105985s;

    /* renamed from: t */
    Object f105986t;

    /* renamed from: u */
    Object f105987u;

    /* renamed from: v */
    /* synthetic */ Object f105988v;

    /* renamed from: w */
    final /* synthetic */ BroadcastChannelImpl f105989w;

    /* renamed from: x */
    int f105990x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl broadcastChannelImpl, Continuation continuation) {
        super(continuation);
        this.f105989w = broadcastChannelImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f105988v = obj;
        this.f105990x |= Integer.MIN_VALUE;
        return this.f105989w.mo112908S(null, this);
    }
}
