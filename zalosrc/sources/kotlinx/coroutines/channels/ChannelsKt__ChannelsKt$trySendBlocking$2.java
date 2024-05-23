package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m145345f = "Channels.kt", m145346l = {39}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106079t;

    /* renamed from: u */
    private /* synthetic */ Object f106080u;

    /* renamed from: v */
    final /* synthetic */ SendChannel f106081v;

    /* renamed from: w */
    final /* synthetic */ Object f106082w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(SendChannel sendChannel, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f106081v = sendChannel;
        this.f106082w = obj;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f106081v, this.f106082w, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.f106080u = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Object m129218b;
        Object m113091a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106079t;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                SendChannel sendChannel = this.f106081v;
                Object obj2 = this.f106082w;
                C24861r.a aVar = C24861r.f119264q;
                this.f106079t = 1;
                if (sendChannel.mo112908S(obj2, this) == m142578e) {
                    return m142578e;
                }
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129224h(m129218b)) {
            m113091a = ChannelResult.f106070b.m113093c(C24848g0.f119245a);
        } else {
            m113091a = ChannelResult.f106070b.m113091a(C24861r.m129221e(m129218b));
        }
        return ChannelResult.m113081b(m113091a);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
