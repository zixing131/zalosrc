package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.BufferedChannel", m145345f = "BufferedChannel.kt", m145346l = {739}, m145347m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes7.dex */
public final class BufferedChannel$receiveCatching$1<E> extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106031s;

    /* renamed from: t */
    final /* synthetic */ BufferedChannel f106032t;

    /* renamed from: u */
    int f106033u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, Continuation continuation) {
        super(continuation);
        this.f106032t = bufferedChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        this.f106031s = obj;
        this.f106033u |= Integer.MIN_VALUE;
        Object m112932E0 = BufferedChannel.m112932E0(this.f106032t, this);
        m142578e = AbstractC28298d.m142578e();
        return m112932E0 == m142578e ? m112932E0 : ChannelResult.m113081b(m112932E0);
    }
}
