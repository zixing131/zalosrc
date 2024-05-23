package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m145345f = "Deprecated.kt", m145346l = {254, 255}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106247t;

    /* renamed from: u */
    int f106248u;

    /* renamed from: v */
    int f106249v;

    /* renamed from: w */
    private /* synthetic */ Object f106250w;

    /* renamed from: x */
    final /* synthetic */ int f106251x;

    /* renamed from: y */
    final /* synthetic */ ReceiveChannel f106252y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$take$1(int i11, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f106251x = i11;
        this.f106252y = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f106251x, this.f106252y, continuation);
        channelsKt__DeprecatedKt$take$1.f106250w = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:6:0x0082). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ProducerScope producerScope;
        int i11;
        boolean z11;
        ChannelIterator it;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$12;
        ProducerScope producerScope2;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i12 = this.f106249v;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    i11 = this.f106248u;
                    it = (ChannelIterator) this.f106247t;
                    ProducerScope producerScope3 = (ProducerScope) this.f106250w;
                    AbstractC24862s.m129228b(obj);
                    producerScope = producerScope3;
                    channelsKt__DeprecatedKt$take$1 = this;
                    i11--;
                    if (i11 == 0) {
                        return C24848g0.f119245a;
                    }
                    channelsKt__DeprecatedKt$take$1.f106250w = producerScope;
                    channelsKt__DeprecatedKt$take$1.f106247t = it;
                    channelsKt__DeprecatedKt$take$1.f106248u = i11;
                    channelsKt__DeprecatedKt$take$1.f106249v = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$take$1);
                    if (mo113028a == m142578e) {
                        return m142578e;
                    }
                    ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$13 = channelsKt__DeprecatedKt$take$1;
                    producerScope2 = producerScope;
                    obj = mo113028a;
                    channelsKt__DeprecatedKt$take$12 = channelsKt__DeprecatedKt$take$13;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        channelsKt__DeprecatedKt$take$12.f106250w = producerScope2;
                        channelsKt__DeprecatedKt$take$12.f106247t = it;
                        channelsKt__DeprecatedKt$take$12.f106248u = i11;
                        channelsKt__DeprecatedKt$take$12.f106249v = 2;
                        if (producerScope2.mo112908S(next, channelsKt__DeprecatedKt$take$12) == m142578e) {
                            return m142578e;
                        }
                        producerScope = producerScope2;
                        channelsKt__DeprecatedKt$take$1 = channelsKt__DeprecatedKt$take$12;
                        i11--;
                        if (i11 == 0) {
                        }
                        channelsKt__DeprecatedKt$take$1.f106250w = producerScope;
                        channelsKt__DeprecatedKt$take$1.f106247t = it;
                        channelsKt__DeprecatedKt$take$1.f106248u = i11;
                        channelsKt__DeprecatedKt$take$1.f106249v = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$take$1);
                        if (mo113028a == m142578e) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i11 = this.f106248u;
                it = (ChannelIterator) this.f106247t;
                producerScope2 = (ProducerScope) this.f106250w;
                AbstractC24862s.m129228b(obj);
                channelsKt__DeprecatedKt$take$12 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f106250w;
            i11 = this.f106251x;
            if (i11 == 0) {
                return C24848g0.f119245a;
            }
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                it = this.f106252y.iterator();
                channelsKt__DeprecatedKt$take$1 = this;
                channelsKt__DeprecatedKt$take$1.f106250w = producerScope;
                channelsKt__DeprecatedKt$take$1.f106247t = it;
                channelsKt__DeprecatedKt$take$1.f106248u = i11;
                channelsKt__DeprecatedKt$take$1.f106249v = 1;
                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$take$1);
                if (mo113028a == m142578e) {
                }
            } else {
                throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
            }
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$take$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
