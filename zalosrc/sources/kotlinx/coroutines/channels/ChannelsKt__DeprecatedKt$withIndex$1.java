package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.C25345g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m145345f = "Deprecated.kt", m145346l = {370, 371}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106274t;

    /* renamed from: u */
    int f106275u;

    /* renamed from: v */
    int f106276v;

    /* renamed from: w */
    private /* synthetic */ Object f106277w;

    /* renamed from: x */
    final /* synthetic */ ReceiveChannel f106278x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f106278x = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.f106278x, continuation);
        channelsKt__DeprecatedKt$withIndex$1.f106277w = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007f -> B:6:0x0047). Please report as a decompilation issue!!! */
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
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1;
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$12;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        int i12;
        m142578e = AbstractC28298d.m142578e();
        int i13 = this.f106276v;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = this.f106275u;
                    ChannelIterator channelIterator2 = (ChannelIterator) this.f106274t;
                    ProducerScope producerScope3 = (ProducerScope) this.f106277w;
                    AbstractC24862s.m129228b(obj);
                    producerScope = producerScope3;
                    channelsKt__DeprecatedKt$withIndex$1 = this;
                    i11 = i14;
                    it = channelIterator2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i12 = this.f106275u;
                channelIterator = (ChannelIterator) this.f106274t;
                producerScope2 = (ProducerScope) this.f106277w;
                AbstractC24862s.m129228b(obj);
                channelsKt__DeprecatedKt$withIndex$12 = this;
                if (!((Boolean) obj).booleanValue()) {
                    int i15 = i12 + 1;
                    C25345g0 c25345g0 = new C25345g0(i12, channelIterator.next());
                    channelsKt__DeprecatedKt$withIndex$12.f106277w = producerScope2;
                    channelsKt__DeprecatedKt$withIndex$12.f106274t = channelIterator;
                    channelsKt__DeprecatedKt$withIndex$12.f106275u = i15;
                    channelsKt__DeprecatedKt$withIndex$12.f106276v = 2;
                    if (producerScope2.mo112908S(c25345g0, channelsKt__DeprecatedKt$withIndex$12) == m142578e) {
                        return m142578e;
                    }
                    it = channelIterator;
                    producerScope = producerScope2;
                    channelsKt__DeprecatedKt$withIndex$1 = channelsKt__DeprecatedKt$withIndex$12;
                    i11 = i15;
                } else {
                    return C24848g0.f119245a;
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f106277w;
            it = this.f106278x.iterator();
            i11 = 0;
            channelsKt__DeprecatedKt$withIndex$1 = this;
        }
        channelsKt__DeprecatedKt$withIndex$1.f106277w = producerScope;
        channelsKt__DeprecatedKt$withIndex$1.f106274t = it;
        channelsKt__DeprecatedKt$withIndex$1.f106275u = i11;
        channelsKt__DeprecatedKt$withIndex$1.f106276v = 1;
        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$withIndex$1);
        if (mo113028a == m142578e) {
            return m142578e;
        }
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$13 = channelsKt__DeprecatedKt$withIndex$1;
        producerScope2 = producerScope;
        obj = mo113028a;
        channelsKt__DeprecatedKt$withIndex$12 = channelsKt__DeprecatedKt$withIndex$13;
        int i16 = i11;
        channelIterator = it;
        i12 = i16;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
