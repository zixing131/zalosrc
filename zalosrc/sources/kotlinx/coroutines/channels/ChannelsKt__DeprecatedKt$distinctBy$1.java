package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m145345f = "Deprecated.kt", m145346l = {387, 388, 390}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106111t;

    /* renamed from: u */
    Object f106112u;

    /* renamed from: v */
    Object f106113v;

    /* renamed from: w */
    int f106114w;

    /* renamed from: x */
    private /* synthetic */ Object f106115x;

    /* renamed from: y */
    final /* synthetic */ ReceiveChannel f106116y;

    /* renamed from: z */
    final /* synthetic */ InterfaceC18509p f106117z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel receiveChannel, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106116y = receiveChannel;
        this.f106117z = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.f106116y, this.f106117z, continuation);
        channelsKt__DeprecatedKt$distinctBy$1.f106115x = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c5 -> B:7:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d2 -> B:8:0x0071). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1;
        HashSet hashSet;
        ChannelIterator it;
        ProducerScope producerScope2;
        HashSet hashSet2;
        Object obj2;
        ChannelIterator channelIterator;
        Object obj3;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$12;
        ProducerScope producerScope3;
        HashSet hashSet3;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106114w;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Object obj4 = this.f106113v;
                        channelIterator = (ChannelIterator) this.f106112u;
                        HashSet hashSet4 = (HashSet) this.f106111t;
                        ProducerScope producerScope4 = (ProducerScope) this.f106115x;
                        AbstractC24862s.m129228b(obj);
                        channelsKt__DeprecatedKt$distinctBy$1 = this;
                        hashSet4.add(obj4);
                        it = channelIterator;
                        hashSet = hashSet4;
                        producerScope = producerScope4;
                        channelsKt__DeprecatedKt$distinctBy$1.f106115x = producerScope;
                        channelsKt__DeprecatedKt$distinctBy$1.f106111t = hashSet;
                        channelsKt__DeprecatedKt$distinctBy$1.f106112u = it;
                        channelsKt__DeprecatedKt$distinctBy$1.f106113v = null;
                        channelsKt__DeprecatedKt$distinctBy$1.f106114w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$distinctBy$1);
                        if (mo113028a != m142578e) {
                            return m142578e;
                        }
                        Object obj5 = m142578e;
                        channelsKt__DeprecatedKt$distinctBy$12 = channelsKt__DeprecatedKt$distinctBy$1;
                        obj = mo113028a;
                        producerScope3 = producerScope;
                        hashSet3 = hashSet;
                        channelIterator = it;
                        obj3 = obj5;
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = channelIterator.next();
                            InterfaceC18509p interfaceC18509p = channelsKt__DeprecatedKt$distinctBy$12.f106117z;
                            channelsKt__DeprecatedKt$distinctBy$12.f106115x = producerScope3;
                            channelsKt__DeprecatedKt$distinctBy$12.f106111t = hashSet3;
                            channelsKt__DeprecatedKt$distinctBy$12.f106112u = channelIterator;
                            channelsKt__DeprecatedKt$distinctBy$12.f106113v = next;
                            channelsKt__DeprecatedKt$distinctBy$12.f106114w = 2;
                            Object mo240pC = interfaceC18509p.mo240pC(next, channelsKt__DeprecatedKt$distinctBy$12);
                            if (mo240pC == obj3) {
                                return obj3;
                            }
                            HashSet hashSet5 = hashSet3;
                            obj2 = next;
                            obj = mo240pC;
                            producerScope2 = producerScope3;
                            hashSet2 = hashSet5;
                            if (hashSet2.contains(obj)) {
                                channelsKt__DeprecatedKt$distinctBy$12.f106115x = producerScope2;
                                channelsKt__DeprecatedKt$distinctBy$12.f106111t = hashSet2;
                                channelsKt__DeprecatedKt$distinctBy$12.f106112u = channelIterator;
                                channelsKt__DeprecatedKt$distinctBy$12.f106113v = obj;
                                channelsKt__DeprecatedKt$distinctBy$12.f106114w = 3;
                                if (producerScope2.mo112908S(obj2, channelsKt__DeprecatedKt$distinctBy$12) == obj3) {
                                    return obj3;
                                }
                                hashSet4 = hashSet2;
                                producerScope4 = producerScope2;
                                Object obj6 = obj3;
                                obj4 = obj;
                                channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                                m142578e = obj6;
                                hashSet4.add(obj4);
                                it = channelIterator;
                                hashSet = hashSet4;
                                producerScope = producerScope4;
                                channelsKt__DeprecatedKt$distinctBy$1.f106115x = producerScope;
                                channelsKt__DeprecatedKt$distinctBy$1.f106111t = hashSet;
                                channelsKt__DeprecatedKt$distinctBy$1.f106112u = it;
                                channelsKt__DeprecatedKt$distinctBy$1.f106113v = null;
                                channelsKt__DeprecatedKt$distinctBy$1.f106114w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$distinctBy$1);
                                if (mo113028a != m142578e) {
                                }
                            } else {
                                channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                                m142578e = obj3;
                                it = channelIterator;
                                hashSet = hashSet2;
                                producerScope = producerScope2;
                                channelsKt__DeprecatedKt$distinctBy$1.f106115x = producerScope;
                                channelsKt__DeprecatedKt$distinctBy$1.f106111t = hashSet;
                                channelsKt__DeprecatedKt$distinctBy$1.f106112u = it;
                                channelsKt__DeprecatedKt$distinctBy$1.f106113v = null;
                                channelsKt__DeprecatedKt$distinctBy$1.f106114w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$distinctBy$1);
                                if (mo113028a != m142578e) {
                                }
                            }
                        } else {
                            return C24848g0.f119245a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Object obj7 = this.f106113v;
                    channelIterator = (ChannelIterator) this.f106112u;
                    HashSet hashSet6 = (HashSet) this.f106111t;
                    ProducerScope producerScope5 = (ProducerScope) this.f106115x;
                    AbstractC24862s.m129228b(obj);
                    producerScope2 = producerScope5;
                    hashSet2 = hashSet6;
                    obj2 = obj7;
                    obj3 = m142578e;
                    channelsKt__DeprecatedKt$distinctBy$12 = this;
                    if (hashSet2.contains(obj)) {
                    }
                }
            } else {
                ChannelIterator channelIterator2 = (ChannelIterator) this.f106112u;
                HashSet hashSet7 = (HashSet) this.f106111t;
                ProducerScope producerScope6 = (ProducerScope) this.f106115x;
                AbstractC24862s.m129228b(obj);
                producerScope3 = producerScope6;
                hashSet3 = hashSet7;
                channelIterator = channelIterator2;
                obj3 = m142578e;
                channelsKt__DeprecatedKt$distinctBy$12 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope7 = (ProducerScope) this.f106115x;
            HashSet hashSet8 = new HashSet();
            producerScope = producerScope7;
            channelsKt__DeprecatedKt$distinctBy$1 = this;
            hashSet = hashSet8;
            it = this.f106116y.iterator();
            channelsKt__DeprecatedKt$distinctBy$1.f106115x = producerScope;
            channelsKt__DeprecatedKt$distinctBy$1.f106111t = hashSet;
            channelsKt__DeprecatedKt$distinctBy$1.f106112u = it;
            channelsKt__DeprecatedKt$distinctBy$1.f106113v = null;
            channelsKt__DeprecatedKt$distinctBy$1.f106114w = 1;
            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$distinctBy$1);
            if (mo113028a != m142578e) {
            }
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
