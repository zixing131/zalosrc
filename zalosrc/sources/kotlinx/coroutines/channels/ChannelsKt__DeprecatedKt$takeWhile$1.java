package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m145345f = "Deprecated.kt", m145346l = {269, 270, 271}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106253t;

    /* renamed from: u */
    Object f106254u;

    /* renamed from: v */
    int f106255v;

    /* renamed from: w */
    private /* synthetic */ Object f106256w;

    /* renamed from: x */
    final /* synthetic */ ReceiveChannel f106257x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC18509p f106258y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106257x = receiveChannel;
        this.f106258y = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.f106257x, this.f106258y, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.f106256w = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a7 -> B:8:0x0057). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ChannelIterator it;
        ProducerScope producerScope;
        Object obj2;
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1;
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$12;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106255v;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        it = (ChannelIterator) this.f106253t;
                        producerScope = (ProducerScope) this.f106256w;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Object obj3 = this.f106254u;
                    ChannelIterator channelIterator2 = (ChannelIterator) this.f106253t;
                    ProducerScope producerScope3 = (ProducerScope) this.f106256w;
                    AbstractC24862s.m129228b(obj);
                    ProducerScope producerScope4 = producerScope3;
                    ChannelIterator channelIterator3 = channelIterator2;
                    Object obj4 = obj3;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$takeWhile$1 = this;
                    if (((Boolean) obj).booleanValue()) {
                        return C24848g0.f119245a;
                    }
                    channelsKt__DeprecatedKt$takeWhile$1.f106256w = producerScope4;
                    channelsKt__DeprecatedKt$takeWhile$1.f106253t = channelIterator3;
                    channelsKt__DeprecatedKt$takeWhile$1.f106254u = null;
                    channelsKt__DeprecatedKt$takeWhile$1.f106255v = 3;
                    if (producerScope4.mo112908S(obj4, channelsKt__DeprecatedKt$takeWhile$1) == obj2) {
                        return obj2;
                    }
                    channelsKt__DeprecatedKt$takeWhile$12 = channelsKt__DeprecatedKt$takeWhile$1;
                    m142578e = obj2;
                    it = channelIterator3;
                    producerScope = producerScope4;
                    channelsKt__DeprecatedKt$takeWhile$12.f106256w = producerScope;
                    channelsKt__DeprecatedKt$takeWhile$12.f106253t = it;
                    channelsKt__DeprecatedKt$takeWhile$12.f106255v = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$takeWhile$12);
                    if (mo113028a != m142578e) {
                        return m142578e;
                    }
                    Object obj5 = m142578e;
                    channelsKt__DeprecatedKt$takeWhile$1 = channelsKt__DeprecatedKt$takeWhile$12;
                    obj = mo113028a;
                    producerScope2 = producerScope;
                    channelIterator = it;
                    obj2 = obj5;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = channelIterator.next();
                        InterfaceC18509p interfaceC18509p = channelsKt__DeprecatedKt$takeWhile$1.f106258y;
                        channelsKt__DeprecatedKt$takeWhile$1.f106256w = producerScope2;
                        channelsKt__DeprecatedKt$takeWhile$1.f106253t = channelIterator;
                        channelsKt__DeprecatedKt$takeWhile$1.f106254u = next;
                        channelsKt__DeprecatedKt$takeWhile$1.f106255v = 2;
                        Object mo240pC = interfaceC18509p.mo240pC(next, channelsKt__DeprecatedKt$takeWhile$1);
                        if (mo240pC == obj2) {
                            return obj2;
                        }
                        ChannelIterator channelIterator4 = channelIterator;
                        obj4 = next;
                        obj = mo240pC;
                        producerScope4 = producerScope2;
                        channelIterator3 = channelIterator4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                }
            } else {
                ChannelIterator channelIterator5 = (ChannelIterator) this.f106253t;
                ProducerScope producerScope5 = (ProducerScope) this.f106256w;
                AbstractC24862s.m129228b(obj);
                producerScope2 = producerScope5;
                channelIterator = channelIterator5;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$takeWhile$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope6 = (ProducerScope) this.f106256w;
            it = this.f106257x.iterator();
            producerScope = producerScope6;
        }
        channelsKt__DeprecatedKt$takeWhile$12 = this;
        channelsKt__DeprecatedKt$takeWhile$12.f106256w = producerScope;
        channelsKt__DeprecatedKt$takeWhile$12.f106253t = it;
        channelsKt__DeprecatedKt$takeWhile$12.f106255v = 1;
        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$takeWhile$12);
        if (mo113028a != m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
