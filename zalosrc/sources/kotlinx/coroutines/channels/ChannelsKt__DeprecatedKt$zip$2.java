package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m145345f = "Deprecated.kt", m145346l = {487, 469, 471}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$zip$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: A */
    final /* synthetic */ ReceiveChannel f106280A;

    /* renamed from: B */
    final /* synthetic */ ReceiveChannel f106281B;

    /* renamed from: C */
    final /* synthetic */ InterfaceC18509p f106282C;

    /* renamed from: t */
    Object f106283t;

    /* renamed from: u */
    Object f106284u;

    /* renamed from: v */
    Object f106285v;

    /* renamed from: w */
    Object f106286w;

    /* renamed from: x */
    Object f106287x;

    /* renamed from: y */
    int f106288y;

    /* renamed from: z */
    private /* synthetic */ Object f106289z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106280A = receiveChannel;
        this.f106281B = receiveChannel2;
        this.f106282C = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.f106280A, this.f106281B, this.f106282C, continuation);
        channelsKt__DeprecatedKt$zip$2.f106289z = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x00b8, B:18:0x00c0, B:39:0x0118, B:50:0x0051), top: B:49:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #2 {all -> 0x010d, blocks: (B:23:0x00e0, B:25:0x00e8), top: B:22:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x00b8, B:18:0x00c0, B:39:0x0118, B:50:0x0051), top: B:49:0x0051 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0105 -> B:10:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0110 -> B:11:0x009a). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ReceiveChannel receiveChannel;
        InterfaceC18509p interfaceC18509p;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2;
        ChannelIterator channelIterator;
        ChannelIterator it;
        ReceiveChannel receiveChannel2;
        ProducerScope producerScope2;
        ChannelIterator channelIterator2;
        InterfaceC18509p interfaceC18509p2;
        ReceiveChannel receiveChannel3;
        Object obj2;
        ChannelIterator channelIterator3;
        Object obj3;
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$22;
        ProducerScope producerScope3;
        ChannelIterator channelIterator4;
        InterfaceC18509p interfaceC18509p3;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106288y;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ChannelIterator channelIterator5 = (ChannelIterator) this.f106286w;
                            ReceiveChannel receiveChannel4 = (ReceiveChannel) this.f106285v;
                            interfaceC18509p = (InterfaceC18509p) this.f106284u;
                            ChannelIterator channelIterator6 = (ChannelIterator) this.f106283t;
                            producerScope = (ProducerScope) this.f106289z;
                            AbstractC24862s.m129228b(obj);
                            channelIterator2 = channelIterator6;
                            receiveChannel3 = receiveChannel4;
                            channelIterator3 = channelIterator5;
                            obj3 = m142578e;
                            channelsKt__DeprecatedKt$zip$22 = this;
                            channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                            m142578e = obj3;
                            it = channelIterator3;
                            receiveChannel = receiveChannel3;
                            channelIterator = channelIterator2;
                            channelsKt__DeprecatedKt$zip$2.f106289z = producerScope;
                            channelsKt__DeprecatedKt$zip$2.f106283t = channelIterator;
                            channelsKt__DeprecatedKt$zip$2.f106284u = interfaceC18509p;
                            channelsKt__DeprecatedKt$zip$2.f106285v = receiveChannel;
                            channelsKt__DeprecatedKt$zip$2.f106286w = it;
                            channelsKt__DeprecatedKt$zip$2.f106287x = null;
                            channelsKt__DeprecatedKt$zip$2.f106288y = 1;
                            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$zip$2);
                            if (mo113028a != m142578e) {
                                return m142578e;
                            }
                            Object obj4 = m142578e;
                            channelsKt__DeprecatedKt$zip$22 = channelsKt__DeprecatedKt$zip$2;
                            obj = mo113028a;
                            producerScope3 = producerScope;
                            channelIterator4 = channelIterator;
                            interfaceC18509p3 = interfaceC18509p;
                            receiveChannel2 = receiveChannel;
                            channelIterator3 = it;
                            obj3 = obj4;
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = channelIterator3.next();
                                channelsKt__DeprecatedKt$zip$22.f106289z = producerScope3;
                                channelsKt__DeprecatedKt$zip$22.f106283t = channelIterator4;
                                channelsKt__DeprecatedKt$zip$22.f106284u = interfaceC18509p3;
                                channelsKt__DeprecatedKt$zip$22.f106285v = receiveChannel2;
                                channelsKt__DeprecatedKt$zip$22.f106286w = channelIterator3;
                                channelsKt__DeprecatedKt$zip$22.f106287x = next;
                                channelsKt__DeprecatedKt$zip$22.f106288y = 2;
                                Object mo113028a2 = channelIterator4.mo113028a(channelsKt__DeprecatedKt$zip$22);
                                if (mo113028a2 == obj3) {
                                    return obj3;
                                }
                                ReceiveChannel receiveChannel5 = receiveChannel2;
                                obj2 = next;
                                obj = mo113028a2;
                                producerScope2 = producerScope3;
                                channelIterator2 = channelIterator4;
                                interfaceC18509p2 = interfaceC18509p3;
                                receiveChannel3 = receiveChannel5;
                                try {
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object mo240pC = interfaceC18509p2.mo240pC(obj2, channelIterator2.next());
                                        channelsKt__DeprecatedKt$zip$22.f106289z = producerScope2;
                                        channelsKt__DeprecatedKt$zip$22.f106283t = channelIterator2;
                                        channelsKt__DeprecatedKt$zip$22.f106284u = interfaceC18509p2;
                                        channelsKt__DeprecatedKt$zip$22.f106285v = receiveChannel3;
                                        channelsKt__DeprecatedKt$zip$22.f106286w = channelIterator3;
                                        channelsKt__DeprecatedKt$zip$22.f106287x = null;
                                        channelsKt__DeprecatedKt$zip$22.f106288y = 3;
                                        if (producerScope2.mo112908S(mo240pC, channelsKt__DeprecatedKt$zip$22) == obj3) {
                                            return obj3;
                                        }
                                        interfaceC18509p = interfaceC18509p2;
                                        producerScope = producerScope2;
                                        channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                                        m142578e = obj3;
                                        it = channelIterator3;
                                        receiveChannel = receiveChannel3;
                                        channelIterator = channelIterator2;
                                        channelsKt__DeprecatedKt$zip$2.f106289z = producerScope;
                                        channelsKt__DeprecatedKt$zip$2.f106283t = channelIterator;
                                        channelsKt__DeprecatedKt$zip$2.f106284u = interfaceC18509p;
                                        channelsKt__DeprecatedKt$zip$2.f106285v = receiveChannel;
                                        channelsKt__DeprecatedKt$zip$2.f106286w = it;
                                        channelsKt__DeprecatedKt$zip$2.f106287x = null;
                                        channelsKt__DeprecatedKt$zip$2.f106288y = 1;
                                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$zip$2);
                                        if (mo113028a != m142578e) {
                                        }
                                    } else {
                                        channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                                        m142578e = obj3;
                                        it = channelIterator3;
                                        receiveChannel = receiveChannel3;
                                        interfaceC18509p = interfaceC18509p2;
                                        channelIterator = channelIterator2;
                                        producerScope = producerScope2;
                                        channelsKt__DeprecatedKt$zip$2.f106289z = producerScope;
                                        channelsKt__DeprecatedKt$zip$2.f106283t = channelIterator;
                                        channelsKt__DeprecatedKt$zip$2.f106284u = interfaceC18509p;
                                        channelsKt__DeprecatedKt$zip$2.f106285v = receiveChannel;
                                        channelsKt__DeprecatedKt$zip$2.f106286w = it;
                                        channelsKt__DeprecatedKt$zip$2.f106287x = null;
                                        channelsKt__DeprecatedKt$zip$2.f106288y = 1;
                                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$zip$2);
                                        if (mo113028a != m142578e) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    receiveChannel = receiveChannel3;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        ChannelsKt.m113108b(receiveChannel, th);
                                        throw th3;
                                    }
                                }
                            } else {
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                ChannelsKt.m113108b(receiveChannel2, null);
                                return C24848g0.f119245a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Object obj5 = this.f106287x;
                        channelIterator3 = (ChannelIterator) this.f106286w;
                        receiveChannel2 = (ReceiveChannel) this.f106285v;
                        InterfaceC18509p interfaceC18509p4 = (InterfaceC18509p) this.f106284u;
                        ChannelIterator channelIterator7 = (ChannelIterator) this.f106283t;
                        ProducerScope producerScope4 = (ProducerScope) this.f106289z;
                        try {
                            AbstractC24862s.m129228b(obj);
                            producerScope2 = producerScope4;
                            channelIterator2 = channelIterator7;
                            interfaceC18509p2 = interfaceC18509p4;
                            receiveChannel3 = receiveChannel2;
                            obj2 = obj5;
                            obj3 = m142578e;
                            channelsKt__DeprecatedKt$zip$22 = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            receiveChannel = receiveChannel2;
                            throw th;
                        }
                    }
                } else {
                    ChannelIterator channelIterator8 = (ChannelIterator) this.f106286w;
                    ReceiveChannel receiveChannel6 = (ReceiveChannel) this.f106285v;
                    InterfaceC18509p interfaceC18509p5 = (InterfaceC18509p) this.f106284u;
                    ChannelIterator channelIterator9 = (ChannelIterator) this.f106283t;
                    ProducerScope producerScope5 = (ProducerScope) this.f106289z;
                    AbstractC24862s.m129228b(obj);
                    producerScope3 = producerScope5;
                    channelIterator4 = channelIterator9;
                    interfaceC18509p3 = interfaceC18509p5;
                    receiveChannel2 = receiveChannel6;
                    channelIterator3 = channelIterator8;
                    obj3 = m142578e;
                    channelsKt__DeprecatedKt$zip$22 = this;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope6 = (ProducerScope) this.f106289z;
                ChannelIterator it2 = this.f106280A.iterator();
                receiveChannel = this.f106281B;
                interfaceC18509p = this.f106282C;
                producerScope = producerScope6;
                channelsKt__DeprecatedKt$zip$2 = this;
                channelIterator = it2;
                it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$zip$2.f106289z = producerScope;
                channelsKt__DeprecatedKt$zip$2.f106283t = channelIterator;
                channelsKt__DeprecatedKt$zip$2.f106284u = interfaceC18509p;
                channelsKt__DeprecatedKt$zip$2.f106285v = receiveChannel;
                channelsKt__DeprecatedKt$zip$2.f106286w = it;
                channelsKt__DeprecatedKt$zip$2.f106287x = null;
                channelsKt__DeprecatedKt$zip$2.f106288y = 1;
                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$zip$2);
                if (mo113028a != m142578e) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$zip$2) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
