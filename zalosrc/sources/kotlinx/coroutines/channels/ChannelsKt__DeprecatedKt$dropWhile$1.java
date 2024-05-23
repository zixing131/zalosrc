package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m145345f = "Deprecated.kt", m145346l = {181, 182, 183, 187, 188}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106124t;

    /* renamed from: u */
    Object f106125u;

    /* renamed from: v */
    int f106126v;

    /* renamed from: w */
    private /* synthetic */ Object f106127w;

    /* renamed from: x */
    final /* synthetic */ ReceiveChannel f106128x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC18509p f106129y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106128x = receiveChannel;
        this.f106129y = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.f106128x, this.f106129y, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.f106127w = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0102 -> B:9:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b1 -> B:29:0x00b5). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ChannelIterator it;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$12;
        ProducerScope producerScope3;
        Object mo113028a;
        ChannelIterator it2;
        ChannelIterator channelIterator2;
        Object mo113028a2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106126v;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                ChannelIterator channelIterator3 = (ChannelIterator) this.f106124t;
                                ProducerScope producerScope4 = (ProducerScope) this.f106127w;
                                AbstractC24862s.m129228b(obj);
                                it2 = channelIterator3;
                                producerScope2 = producerScope4;
                                obj2 = m142578e;
                                channelsKt__DeprecatedKt$dropWhile$12 = this;
                                channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                                channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                                channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                                mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                                if (mo113028a2 != obj2) {
                                    return obj2;
                                }
                                channelIterator2 = it2;
                                obj = mo113028a2;
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = channelIterator2.next();
                                    channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                                    channelsKt__DeprecatedKt$dropWhile$12.f106124t = channelIterator2;
                                    channelsKt__DeprecatedKt$dropWhile$12.f106126v = 5;
                                    if (producerScope2.mo112908S(next, channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                                        return obj2;
                                    }
                                    it2 = channelIterator2;
                                    channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                                    channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                                    channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                                    mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                                    if (mo113028a2 != obj2) {
                                    }
                                } else {
                                    return C24848g0.f119245a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ChannelIterator channelIterator4 = (ChannelIterator) this.f106124t;
                            ProducerScope producerScope5 = (ProducerScope) this.f106127w;
                            AbstractC24862s.m129228b(obj);
                            producerScope2 = producerScope5;
                            channelIterator2 = channelIterator4;
                            obj2 = m142578e;
                            channelsKt__DeprecatedKt$dropWhile$12 = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        ProducerScope producerScope6 = (ProducerScope) this.f106127w;
                        AbstractC24862s.m129228b(obj);
                        producerScope3 = producerScope6;
                        obj2 = m142578e;
                        channelsKt__DeprecatedKt$dropWhile$12 = this;
                        producerScope2 = producerScope3;
                        it2 = channelsKt__DeprecatedKt$dropWhile$12.f106128x.iterator();
                        channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                        mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                        if (mo113028a2 != obj2) {
                        }
                    }
                } else {
                    Object obj3 = this.f106125u;
                    channelIterator = (ChannelIterator) this.f106124t;
                    ProducerScope producerScope7 = (ProducerScope) this.f106127w;
                    AbstractC24862s.m129228b(obj);
                    producerScope3 = producerScope7;
                    Object obj4 = obj3;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$dropWhile$12 = this;
                    if (((Boolean) obj).booleanValue()) {
                        channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope3;
                        channelsKt__DeprecatedKt$dropWhile$12.f106124t = null;
                        channelsKt__DeprecatedKt$dropWhile$12.f106125u = null;
                        channelsKt__DeprecatedKt$dropWhile$12.f106126v = 3;
                        if (producerScope3.mo112908S(obj4, channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                            return obj2;
                        }
                        producerScope2 = producerScope3;
                        it2 = channelsKt__DeprecatedKt$dropWhile$12.f106128x.iterator();
                        channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                        mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                        if (mo113028a2 != obj2) {
                        }
                    } else {
                        channelsKt__DeprecatedKt$dropWhile$1 = channelsKt__DeprecatedKt$dropWhile$12;
                        m142578e = obj2;
                        it = channelIterator;
                        producerScope = producerScope3;
                        channelsKt__DeprecatedKt$dropWhile$1.f106127w = producerScope;
                        channelsKt__DeprecatedKt$dropWhile$1.f106124t = it;
                        channelsKt__DeprecatedKt$dropWhile$1.f106125u = null;
                        channelsKt__DeprecatedKt$dropWhile$1.f106126v = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$dropWhile$1);
                        if (mo113028a != m142578e) {
                            return m142578e;
                        }
                        Object obj5 = m142578e;
                        channelsKt__DeprecatedKt$dropWhile$12 = channelsKt__DeprecatedKt$dropWhile$1;
                        obj = mo113028a;
                        producerScope2 = producerScope;
                        channelIterator = it;
                        obj2 = obj5;
                        if (((Boolean) obj).booleanValue()) {
                            Object next2 = channelIterator.next();
                            InterfaceC18509p interfaceC18509p = channelsKt__DeprecatedKt$dropWhile$12.f106129y;
                            channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                            channelsKt__DeprecatedKt$dropWhile$12.f106124t = channelIterator;
                            channelsKt__DeprecatedKt$dropWhile$12.f106125u = next2;
                            channelsKt__DeprecatedKt$dropWhile$12.f106126v = 2;
                            Object mo240pC = interfaceC18509p.mo240pC(next2, channelsKt__DeprecatedKt$dropWhile$12);
                            if (mo240pC == obj2) {
                                return obj2;
                            }
                            ProducerScope producerScope8 = producerScope2;
                            obj4 = next2;
                            obj = mo240pC;
                            producerScope3 = producerScope8;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        it2 = channelsKt__DeprecatedKt$dropWhile$12.f106128x.iterator();
                        channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                        channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                        mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                        if (mo113028a2 != obj2) {
                        }
                    }
                }
            } else {
                ChannelIterator channelIterator5 = (ChannelIterator) this.f106124t;
                ProducerScope producerScope9 = (ProducerScope) this.f106127w;
                AbstractC24862s.m129228b(obj);
                producerScope2 = producerScope9;
                channelIterator = channelIterator5;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$dropWhile$12 = this;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = channelsKt__DeprecatedKt$dropWhile$12.f106128x.iterator();
                channelsKt__DeprecatedKt$dropWhile$12.f106127w = producerScope2;
                channelsKt__DeprecatedKt$dropWhile$12.f106124t = it2;
                channelsKt__DeprecatedKt$dropWhile$12.f106126v = 4;
                mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$dropWhile$12);
                if (mo113028a2 != obj2) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope10 = (ProducerScope) this.f106127w;
            it = this.f106128x.iterator();
            producerScope = producerScope10;
            channelsKt__DeprecatedKt$dropWhile$1 = this;
            channelsKt__DeprecatedKt$dropWhile$1.f106127w = producerScope;
            channelsKt__DeprecatedKt$dropWhile$1.f106124t = it;
            channelsKt__DeprecatedKt$dropWhile$1.f106125u = null;
            channelsKt__DeprecatedKt$dropWhile$1.f106126v = 1;
            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$dropWhile$1);
            if (mo113028a != m142578e) {
            }
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
