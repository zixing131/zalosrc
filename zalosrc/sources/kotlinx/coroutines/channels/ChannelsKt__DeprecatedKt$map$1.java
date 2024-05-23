package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m145345f = "Deprecated.kt", m145346l = {487, 333, 333}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$map$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: A */
    final /* synthetic */ InterfaceC18509p f106206A;

    /* renamed from: t */
    Object f106207t;

    /* renamed from: u */
    Object f106208u;

    /* renamed from: v */
    Object f106209v;

    /* renamed from: w */
    Object f106210w;

    /* renamed from: x */
    int f106211x;

    /* renamed from: y */
    private /* synthetic */ Object f106212y;

    /* renamed from: z */
    final /* synthetic */ ReceiveChannel f106213z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$map$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106213z = receiveChannel;
        this.f106206A = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.f106213z, this.f106206A, continuation);
        channelsKt__DeprecatedKt$map$1.f106212y = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0022, B:10:0x0079, B:15:0x008e, B:17:0x0096, B:34:0x00cc, B:45:0x0061, B:48:0x0071), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[Catch: all -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0022, B:10:0x0079, B:15:0x008e, B:17:0x0096, B:34:0x00cc, B:45:0x0061, B:48:0x0071), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c6 -> B:10:0x0079). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ReceiveChannel receiveChannel;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1;
        InterfaceC18509p interfaceC18509p;
        ChannelIterator it;
        ReceiveChannel receiveChannel2;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$12;
        ProducerScope producerScope2;
        InterfaceC18509p interfaceC18509p2;
        ChannelIterator channelIterator;
        ProducerScope producerScope3;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$13;
        ProducerScope producerScope4;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106211x;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            it = (ChannelIterator) this.f106209v;
                            receiveChannel = (ReceiveChannel) this.f106208u;
                            interfaceC18509p = (InterfaceC18509p) this.f106207t;
                            ProducerScope producerScope5 = (ProducerScope) this.f106212y;
                            AbstractC24862s.m129228b(obj);
                            producerScope = producerScope5;
                            channelsKt__DeprecatedKt$map$1 = this;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        producerScope3 = (ProducerScope) this.f106210w;
                        channelIterator = (ChannelIterator) this.f106209v;
                        receiveChannel2 = (ReceiveChannel) this.f106208u;
                        interfaceC18509p2 = (InterfaceC18509p) this.f106207t;
                        producerScope2 = (ProducerScope) this.f106212y;
                        try {
                            AbstractC24862s.m129228b(obj);
                            channelsKt__DeprecatedKt$map$12 = this;
                            channelsKt__DeprecatedKt$map$12.f106212y = producerScope2;
                            channelsKt__DeprecatedKt$map$12.f106207t = interfaceC18509p2;
                            channelsKt__DeprecatedKt$map$12.f106208u = receiveChannel2;
                            channelsKt__DeprecatedKt$map$12.f106209v = channelIterator;
                            channelsKt__DeprecatedKt$map$12.f106210w = null;
                            channelsKt__DeprecatedKt$map$12.f106211x = 3;
                            if (producerScope3.mo112908S(obj, channelsKt__DeprecatedKt$map$12) != m142578e) {
                                return m142578e;
                            }
                            it = channelIterator;
                            receiveChannel = receiveChannel2;
                            interfaceC18509p = interfaceC18509p2;
                            producerScope = producerScope2;
                            channelsKt__DeprecatedKt$map$1 = channelsKt__DeprecatedKt$map$12;
                        } catch (Throwable th2) {
                            th = th2;
                            receiveChannel = receiveChannel2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                ChannelsKt.m113108b(receiveChannel, th);
                                throw th3;
                            }
                        }
                    }
                } else {
                    it = (ChannelIterator) this.f106209v;
                    receiveChannel = (ReceiveChannel) this.f106208u;
                    interfaceC18509p = (InterfaceC18509p) this.f106207t;
                    producerScope4 = (ProducerScope) this.f106212y;
                    AbstractC24862s.m129228b(obj);
                    channelsKt__DeprecatedKt$map$13 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        channelsKt__DeprecatedKt$map$13.f106212y = producerScope4;
                        channelsKt__DeprecatedKt$map$13.f106207t = interfaceC18509p;
                        channelsKt__DeprecatedKt$map$13.f106208u = receiveChannel;
                        channelsKt__DeprecatedKt$map$13.f106209v = it;
                        channelsKt__DeprecatedKt$map$13.f106210w = producerScope4;
                        channelsKt__DeprecatedKt$map$13.f106211x = 2;
                        obj = interfaceC18509p.mo240pC(next, channelsKt__DeprecatedKt$map$13);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        channelsKt__DeprecatedKt$map$12 = channelsKt__DeprecatedKt$map$13;
                        producerScope2 = producerScope4;
                        interfaceC18509p2 = interfaceC18509p;
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        producerScope3 = producerScope2;
                        channelsKt__DeprecatedKt$map$12.f106212y = producerScope2;
                        channelsKt__DeprecatedKt$map$12.f106207t = interfaceC18509p2;
                        channelsKt__DeprecatedKt$map$12.f106208u = receiveChannel2;
                        channelsKt__DeprecatedKt$map$12.f106209v = channelIterator;
                        channelsKt__DeprecatedKt$map$12.f106210w = null;
                        channelsKt__DeprecatedKt$map$12.f106211x = 3;
                        if (producerScope3.mo112908S(obj, channelsKt__DeprecatedKt$map$12) != m142578e) {
                        }
                    } else {
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        ChannelsKt.m113108b(receiveChannel, null);
                        return C24848g0.f119245a;
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                producerScope = (ProducerScope) this.f106212y;
                receiveChannel = this.f106213z;
                channelsKt__DeprecatedKt$map$1 = this;
                interfaceC18509p = this.f106206A;
                it = receiveChannel.iterator();
            }
            channelsKt__DeprecatedKt$map$1.f106212y = producerScope;
            channelsKt__DeprecatedKt$map$1.f106207t = interfaceC18509p;
            channelsKt__DeprecatedKt$map$1.f106208u = receiveChannel;
            channelsKt__DeprecatedKt$map$1.f106209v = it;
            channelsKt__DeprecatedKt$map$1.f106211x = 1;
            Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$map$1);
            if (mo113028a == m142578e) {
                return m142578e;
            }
            ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$14 = channelsKt__DeprecatedKt$map$1;
            producerScope4 = producerScope;
            obj = mo113028a;
            channelsKt__DeprecatedKt$map$13 = channelsKt__DeprecatedKt$map$14;
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$map$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
