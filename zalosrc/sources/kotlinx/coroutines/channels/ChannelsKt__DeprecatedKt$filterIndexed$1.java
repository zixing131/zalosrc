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

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m145345f = "Deprecated.kt", m145346l = {211, 212, 212}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106148t;

    /* renamed from: u */
    Object f106149u;

    /* renamed from: v */
    int f106150v;

    /* renamed from: w */
    int f106151w;

    /* renamed from: x */
    private /* synthetic */ Object f106152x;

    /* renamed from: y */
    final /* synthetic */ ReceiveChannel f106153y;

    /* renamed from: z */
    final /* synthetic */ InterfaceC18510q f106154z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel receiveChannel, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f106153y = receiveChannel;
        this.f106154z = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.f106153y, this.f106154z, continuation);
        channelsKt__DeprecatedKt$filterIndexed$1.f106152x = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:            r13 = r0;        r0 = r1;        r7 = r8;        r1 = r10;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ProducerScope producerScope;
        ChannelIterator it;
        int i11;
        ProducerScope producerScope2;
        Object obj2;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$12;
        ChannelIterator channelIterator;
        int i12;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i13 = this.f106151w;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        i11 = this.f106150v;
                        it = (ChannelIterator) this.f106148t;
                        producerScope = (ProducerScope) this.f106152x;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    int i14 = this.f106150v;
                    Object obj3 = this.f106149u;
                    ChannelIterator channelIterator2 = (ChannelIterator) this.f106148t;
                    producerScope2 = (ProducerScope) this.f106152x;
                    AbstractC24862s.m129228b(obj);
                    int i15 = i14;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$filterIndexed$1 = this;
                    ChannelIterator channelIterator3 = channelIterator2;
                    Object obj4 = obj3;
                    it = channelIterator3;
                    if (((Boolean) obj).booleanValue()) {
                        channelsKt__DeprecatedKt$filterIndexed$1.f106152x = producerScope2;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106148t = it;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106149u = null;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106150v = i15;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106151w = 3;
                        if (producerScope2.mo112908S(obj4, channelsKt__DeprecatedKt$filterIndexed$1) == obj2) {
                            return obj2;
                        }
                    }
                    channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
                    m142578e = obj2;
                    producerScope = producerScope2;
                    i11 = i15;
                    channelsKt__DeprecatedKt$filterIndexed$12.f106152x = producerScope;
                    channelsKt__DeprecatedKt$filterIndexed$12.f106148t = it;
                    channelsKt__DeprecatedKt$filterIndexed$12.f106149u = null;
                    channelsKt__DeprecatedKt$filterIndexed$12.f106150v = i11;
                    channelsKt__DeprecatedKt$filterIndexed$12.f106151w = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterIndexed$12);
                    if (mo113028a == m142578e) {
                        return m142578e;
                    }
                    Object obj5 = m142578e;
                    channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
                    obj = mo113028a;
                    producerScope2 = producerScope;
                    channelIterator = it;
                    i12 = i11;
                    obj2 = obj5;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = channelIterator.next();
                        InterfaceC18510q interfaceC18510q = channelsKt__DeprecatedKt$filterIndexed$1.f106154z;
                        i15 = i12 + 1;
                        Integer m145341c = AbstractC29094b.m145341c(i12);
                        channelsKt__DeprecatedKt$filterIndexed$1.f106152x = producerScope2;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106148t = channelIterator;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106149u = next;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106150v = i15;
                        channelsKt__DeprecatedKt$filterIndexed$1.f106151w = 2;
                        Object mo45599Hr = interfaceC18510q.mo45599Hr(m145341c, next, channelsKt__DeprecatedKt$filterIndexed$1);
                        if (mo45599Hr == obj2) {
                            return obj2;
                        }
                        channelIterator3 = channelIterator;
                        obj4 = next;
                        obj = mo45599Hr;
                        it = channelIterator3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
                        m142578e = obj2;
                        producerScope = producerScope2;
                        i11 = i15;
                        channelsKt__DeprecatedKt$filterIndexed$12.f106152x = producerScope;
                        channelsKt__DeprecatedKt$filterIndexed$12.f106148t = it;
                        channelsKt__DeprecatedKt$filterIndexed$12.f106149u = null;
                        channelsKt__DeprecatedKt$filterIndexed$12.f106150v = i11;
                        channelsKt__DeprecatedKt$filterIndexed$12.f106151w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterIndexed$12);
                        if (mo113028a == m142578e) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                }
            } else {
                int i16 = this.f106150v;
                ChannelIterator channelIterator4 = (ChannelIterator) this.f106148t;
                ProducerScope producerScope3 = (ProducerScope) this.f106152x;
                AbstractC24862s.m129228b(obj);
                producerScope2 = producerScope3;
                channelIterator = channelIterator4;
                i12 = i16;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$filterIndexed$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f106152x;
            it = this.f106153y.iterator();
            i11 = 0;
        }
        channelsKt__DeprecatedKt$filterIndexed$12 = this;
        channelsKt__DeprecatedKt$filterIndexed$12.f106152x = producerScope;
        channelsKt__DeprecatedKt$filterIndexed$12.f106148t = it;
        channelsKt__DeprecatedKt$filterIndexed$12.f106149u = null;
        channelsKt__DeprecatedKt$filterIndexed$12.f106150v = i11;
        channelsKt__DeprecatedKt$filterIndexed$12.f106151w = 1;
        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterIndexed$12);
        if (mo113028a == m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
