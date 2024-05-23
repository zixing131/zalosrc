package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m145345f = "Deprecated.kt", m145346l = {321, 322, 322}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106178t;

    /* renamed from: u */
    int f106179u;

    /* renamed from: v */
    private /* synthetic */ Object f106180v;

    /* renamed from: w */
    final /* synthetic */ ReceiveChannel f106181w;

    /* renamed from: x */
    final /* synthetic */ InterfaceC18509p f106182x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106181w = receiveChannel;
        this.f106182x = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.f106181w, this.f106182x, continuation);
        channelsKt__DeprecatedKt$flatMap$1.f106180v = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:8:0x0054). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ChannelIterator it;
        ProducerScope producerScope;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$12;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106179u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        it = (ChannelIterator) this.f106178t;
                        producerScope = (ProducerScope) this.f106180v;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ChannelIterator channelIterator2 = (ChannelIterator) this.f106178t;
                    ProducerScope producerScope3 = (ProducerScope) this.f106180v;
                    AbstractC24862s.m129228b(obj);
                    producerScope2 = producerScope3;
                    channelIterator = channelIterator2;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$flatMap$1 = this;
                    channelsKt__DeprecatedKt$flatMap$1.f106180v = producerScope2;
                    channelsKt__DeprecatedKt$flatMap$1.f106178t = channelIterator;
                    channelsKt__DeprecatedKt$flatMap$1.f106179u = 3;
                    if (ChannelsKt.m113125s((ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                        return obj2;
                    }
                    channelsKt__DeprecatedKt$flatMap$12 = channelsKt__DeprecatedKt$flatMap$1;
                    m142578e = obj2;
                    it = channelIterator;
                    producerScope = producerScope2;
                    channelsKt__DeprecatedKt$flatMap$12.f106180v = producerScope;
                    channelsKt__DeprecatedKt$flatMap$12.f106178t = it;
                    channelsKt__DeprecatedKt$flatMap$12.f106179u = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$flatMap$12);
                    if (mo113028a != m142578e) {
                        return m142578e;
                    }
                    Object obj3 = m142578e;
                    channelsKt__DeprecatedKt$flatMap$1 = channelsKt__DeprecatedKt$flatMap$12;
                    obj = mo113028a;
                    producerScope2 = producerScope;
                    channelIterator = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = channelIterator.next();
                        InterfaceC18509p interfaceC18509p = channelsKt__DeprecatedKt$flatMap$1.f106182x;
                        channelsKt__DeprecatedKt$flatMap$1.f106180v = producerScope2;
                        channelsKt__DeprecatedKt$flatMap$1.f106178t = channelIterator;
                        channelsKt__DeprecatedKt$flatMap$1.f106179u = 2;
                        obj = interfaceC18509p.mo240pC(next, channelsKt__DeprecatedKt$flatMap$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        channelsKt__DeprecatedKt$flatMap$1.f106180v = producerScope2;
                        channelsKt__DeprecatedKt$flatMap$1.f106178t = channelIterator;
                        channelsKt__DeprecatedKt$flatMap$1.f106179u = 3;
                        if (ChannelsKt.m113125s((ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                }
            } else {
                ChannelIterator channelIterator3 = (ChannelIterator) this.f106178t;
                ProducerScope producerScope4 = (ProducerScope) this.f106180v;
                AbstractC24862s.m129228b(obj);
                producerScope2 = producerScope4;
                channelIterator = channelIterator3;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$flatMap$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope5 = (ProducerScope) this.f106180v;
            it = this.f106181w.iterator();
            producerScope = producerScope5;
        }
        channelsKt__DeprecatedKt$flatMap$12 = this;
        channelsKt__DeprecatedKt$flatMap$12.f106180v = producerScope;
        channelsKt__DeprecatedKt$flatMap$12.f106178t = it;
        channelsKt__DeprecatedKt$flatMap$12.f106179u = 1;
        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$flatMap$12);
        if (mo113028a != m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
