package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m145345f = "Deprecated.kt", m145346l = {344, 345, 345}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106214t;

    /* renamed from: u */
    Object f106215u;

    /* renamed from: v */
    int f106216v;

    /* renamed from: w */
    int f106217w;

    /* renamed from: x */
    private /* synthetic */ Object f106218x;

    /* renamed from: y */
    final /* synthetic */ ReceiveChannel f106219y;

    /* renamed from: z */
    final /* synthetic */ InterfaceC18510q f106220z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel receiveChannel, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f106219y = receiveChannel;
        this.f106220z = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.f106219y, this.f106220z, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.f106218x = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ab -> B:7:0x005c). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1;
        ChannelIterator it;
        int i11;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$12;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        ProducerScope producerScope3;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$13;
        ProducerScope producerScope4;
        m142578e = AbstractC28298d.m142578e();
        int i12 = this.f106217w;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i11 = this.f106216v;
                        it = (ChannelIterator) this.f106214t;
                        ProducerScope producerScope5 = (ProducerScope) this.f106218x;
                        AbstractC24862s.m129228b(obj);
                        producerScope = producerScope5;
                        channelsKt__DeprecatedKt$mapIndexed$1 = this;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i11 = this.f106216v;
                    producerScope3 = (ProducerScope) this.f106215u;
                    channelIterator = (ChannelIterator) this.f106214t;
                    producerScope2 = (ProducerScope) this.f106218x;
                    AbstractC24862s.m129228b(obj);
                    channelsKt__DeprecatedKt$mapIndexed$12 = this;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106218x = producerScope2;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106214t = channelIterator;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106215u = null;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106216v = i11;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106217w = 3;
                    if (producerScope3.mo112908S(obj, channelsKt__DeprecatedKt$mapIndexed$12) != m142578e) {
                        return m142578e;
                    }
                    it = channelIterator;
                    producerScope = producerScope2;
                    channelsKt__DeprecatedKt$mapIndexed$1 = channelsKt__DeprecatedKt$mapIndexed$12;
                }
            } else {
                i11 = this.f106216v;
                it = (ChannelIterator) this.f106214t;
                producerScope4 = (ProducerScope) this.f106218x;
                AbstractC24862s.m129228b(obj);
                channelsKt__DeprecatedKt$mapIndexed$13 = this;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    InterfaceC18510q interfaceC18510q = channelsKt__DeprecatedKt$mapIndexed$13.f106220z;
                    int i13 = i11 + 1;
                    Integer m145341c = AbstractC29094b.m145341c(i11);
                    channelsKt__DeprecatedKt$mapIndexed$13.f106218x = producerScope4;
                    channelsKt__DeprecatedKt$mapIndexed$13.f106214t = it;
                    channelsKt__DeprecatedKt$mapIndexed$13.f106215u = producerScope4;
                    channelsKt__DeprecatedKt$mapIndexed$13.f106216v = i13;
                    channelsKt__DeprecatedKt$mapIndexed$13.f106217w = 2;
                    obj = interfaceC18510q.mo45599Hr(m145341c, next, channelsKt__DeprecatedKt$mapIndexed$13);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    channelsKt__DeprecatedKt$mapIndexed$12 = channelsKt__DeprecatedKt$mapIndexed$13;
                    i11 = i13;
                    producerScope2 = producerScope4;
                    channelIterator = it;
                    producerScope3 = producerScope2;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106218x = producerScope2;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106214t = channelIterator;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106215u = null;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106216v = i11;
                    channelsKt__DeprecatedKt$mapIndexed$12.f106217w = 3;
                    if (producerScope3.mo112908S(obj, channelsKt__DeprecatedKt$mapIndexed$12) != m142578e) {
                    }
                } else {
                    return C24848g0.f119245a;
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f106218x;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
            it = this.f106219y.iterator();
            i11 = 0;
        }
        channelsKt__DeprecatedKt$mapIndexed$1.f106218x = producerScope;
        channelsKt__DeprecatedKt$mapIndexed$1.f106214t = it;
        channelsKt__DeprecatedKt$mapIndexed$1.f106216v = i11;
        channelsKt__DeprecatedKt$mapIndexed$1.f106217w = 1;
        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$mapIndexed$1);
        if (mo113028a == m142578e) {
            return m142578e;
        }
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$14 = channelsKt__DeprecatedKt$mapIndexed$1;
        producerScope4 = producerScope;
        obj = mo113028a;
        channelsKt__DeprecatedKt$mapIndexed$13 = channelsKt__DeprecatedKt$mapIndexed$14;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
