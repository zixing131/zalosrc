package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.BufferedChannel", m145345f = "BufferedChannel.kt", m145346l = {3056}, m145347m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes7.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106034s;

    /* renamed from: t */
    Object f106035t;

    /* renamed from: u */
    int f106036u;

    /* renamed from: v */
    long f106037v;

    /* renamed from: w */
    /* synthetic */ Object f106038w;

    /* renamed from: x */
    final /* synthetic */ BufferedChannel f106039x;

    /* renamed from: y */
    int f106040y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, Continuation continuation) {
        super(continuation);
        this.f106039x = bufferedChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m112933F0;
        Object m142578e;
        this.f106038w = obj;
        this.f106040y |= Integer.MIN_VALUE;
        m112933F0 = this.f106039x.m112933F0(null, 0, 0L, this);
        m142578e = AbstractC28298d.m142578e();
        return m112933F0 == m142578e ? m112933F0 : ChannelResult.m113081b(m112933F0);
    }
}
