package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m145345f = "Deprecated.kt", m145346l = {198, 199, 199}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filter$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106142t;

    /* renamed from: u */
    Object f106143u;

    /* renamed from: v */
    int f106144v;

    /* renamed from: w */
    private /* synthetic */ Object f106145w;

    /* renamed from: x */
    final /* synthetic */ ReceiveChannel f106146x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC18509p f106147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106146x = receiveChannel;
        this.f106147y = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.f106146x, this.f106147y, continuation);
        channelsKt__DeprecatedKt$filter$1.f106145w = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:            r11 = r0;        r0 = r1;        r1 = r6;        r6 = r8;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ChannelIterator it;
        ProducerScope producerScope;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1;
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$12;
        ProducerScope producerScope2;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106144v;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        it = (ChannelIterator) this.f106142t;
                        producerScope = (ProducerScope) this.f106145w;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Object obj3 = this.f106143u;
                    channelIterator = (ChannelIterator) this.f106142t;
                    ProducerScope producerScope3 = (ProducerScope) this.f106145w;
                    AbstractC24862s.m129228b(obj);
                    ProducerScope producerScope4 = producerScope3;
                    Object obj4 = obj3;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$filter$1 = this;
                    if (((Boolean) obj).booleanValue()) {
                        channelsKt__DeprecatedKt$filter$1.f106145w = producerScope4;
                        channelsKt__DeprecatedKt$filter$1.f106142t = channelIterator;
                        channelsKt__DeprecatedKt$filter$1.f106143u = null;
                        channelsKt__DeprecatedKt$filter$1.f106144v = 3;
                        if (producerScope4.mo112908S(obj4, channelsKt__DeprecatedKt$filter$1) == obj2) {
                            return obj2;
                        }
                    }
                    channelsKt__DeprecatedKt$filter$12 = channelsKt__DeprecatedKt$filter$1;
                    m142578e = obj2;
                    it = channelIterator;
                    producerScope = producerScope4;
                    channelsKt__DeprecatedKt$filter$12.f106145w = producerScope;
                    channelsKt__DeprecatedKt$filter$12.f106142t = it;
                    channelsKt__DeprecatedKt$filter$12.f106143u = null;
                    channelsKt__DeprecatedKt$filter$12.f106144v = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filter$12);
                    if (mo113028a == m142578e) {
                        return m142578e;
                    }
                    Object obj5 = m142578e;
                    channelsKt__DeprecatedKt$filter$1 = channelsKt__DeprecatedKt$filter$12;
                    obj = mo113028a;
                    producerScope2 = producerScope;
                    channelIterator = it;
                    obj2 = obj5;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = channelIterator.next();
                        InterfaceC18509p interfaceC18509p = channelsKt__DeprecatedKt$filter$1.f106147y;
                        channelsKt__DeprecatedKt$filter$1.f106145w = producerScope2;
                        channelsKt__DeprecatedKt$filter$1.f106142t = channelIterator;
                        channelsKt__DeprecatedKt$filter$1.f106143u = next;
                        channelsKt__DeprecatedKt$filter$1.f106144v = 2;
                        Object mo240pC = interfaceC18509p.mo240pC(next, channelsKt__DeprecatedKt$filter$1);
                        if (mo240pC == obj2) {
                            return obj2;
                        }
                        ProducerScope producerScope5 = producerScope2;
                        obj4 = next;
                        obj = mo240pC;
                        producerScope4 = producerScope5;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        channelsKt__DeprecatedKt$filter$12 = channelsKt__DeprecatedKt$filter$1;
                        m142578e = obj2;
                        it = channelIterator;
                        producerScope = producerScope4;
                        channelsKt__DeprecatedKt$filter$12.f106145w = producerScope;
                        channelsKt__DeprecatedKt$filter$12.f106142t = it;
                        channelsKt__DeprecatedKt$filter$12.f106143u = null;
                        channelsKt__DeprecatedKt$filter$12.f106144v = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filter$12);
                        if (mo113028a == m142578e) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                }
            } else {
                ChannelIterator channelIterator2 = (ChannelIterator) this.f106142t;
                ProducerScope producerScope6 = (ProducerScope) this.f106145w;
                AbstractC24862s.m129228b(obj);
                producerScope2 = producerScope6;
                channelIterator = channelIterator2;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$filter$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope7 = (ProducerScope) this.f106145w;
            it = this.f106146x.iterator();
            producerScope = producerScope7;
        }
        channelsKt__DeprecatedKt$filter$12 = this;
        channelsKt__DeprecatedKt$filter$12.f106145w = producerScope;
        channelsKt__DeprecatedKt$filter$12.f106142t = it;
        channelsKt__DeprecatedKt$filter$12.f106143u = null;
        channelsKt__DeprecatedKt$filter$12.f106144v = 1;
        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filter$12);
        if (mo113028a == m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filter$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
