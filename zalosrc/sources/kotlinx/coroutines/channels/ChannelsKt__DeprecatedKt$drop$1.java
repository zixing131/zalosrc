package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m145345f = "Deprecated.kt", m145346l = {164, 169, 170}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$drop$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106118t;

    /* renamed from: u */
    int f106119u;

    /* renamed from: v */
    int f106120v;

    /* renamed from: w */
    private /* synthetic */ Object f106121w;

    /* renamed from: x */
    final /* synthetic */ int f106122x;

    /* renamed from: y */
    final /* synthetic */ ReceiveChannel f106123y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$drop$1(int i11, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f106122x = i11;
        this.f106123y = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f106122x, this.f106123y, continuation);
        channelsKt__DeprecatedKt$drop$1.f106121w = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c8 -> B:7:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0077 -> B:24:0x007e). Please report as a decompilation issue!!! */
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
        Object obj2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1;
        ChannelIterator it;
        ProducerScope producerScope2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$12;
        ChannelIterator it2;
        Object mo113028a;
        ProducerScope producerScope3;
        Object mo113028a2;
        m142578e = AbstractC28298d.m142578e();
        int i12 = this.f106120v;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ChannelIterator channelIterator = (ChannelIterator) this.f106118t;
                        ProducerScope producerScope4 = (ProducerScope) this.f106121w;
                        AbstractC24862s.m129228b(obj);
                        producerScope = producerScope4;
                        it2 = channelIterator;
                        obj2 = m142578e;
                        channelsKt__DeprecatedKt$drop$1 = this;
                        channelsKt__DeprecatedKt$drop$1.f106121w = producerScope;
                        channelsKt__DeprecatedKt$drop$1.f106118t = it2;
                        channelsKt__DeprecatedKt$drop$1.f106120v = 2;
                        mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$drop$1);
                        if (mo113028a2 != obj2) {
                            return obj2;
                        }
                        producerScope3 = producerScope;
                        obj = mo113028a2;
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = it2.next();
                            channelsKt__DeprecatedKt$drop$1.f106121w = producerScope3;
                            channelsKt__DeprecatedKt$drop$1.f106118t = it2;
                            channelsKt__DeprecatedKt$drop$1.f106120v = 3;
                            if (producerScope3.mo112908S(next, channelsKt__DeprecatedKt$drop$1) == obj2) {
                                return obj2;
                            }
                            producerScope = producerScope3;
                            channelsKt__DeprecatedKt$drop$1.f106121w = producerScope;
                            channelsKt__DeprecatedKt$drop$1.f106118t = it2;
                            channelsKt__DeprecatedKt$drop$1.f106120v = 2;
                            mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$drop$1);
                            if (mo113028a2 != obj2) {
                            }
                        } else {
                            return C24848g0.f119245a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ChannelIterator channelIterator2 = (ChannelIterator) this.f106118t;
                    ProducerScope producerScope5 = (ProducerScope) this.f106121w;
                    AbstractC24862s.m129228b(obj);
                    producerScope3 = producerScope5;
                    it2 = channelIterator2;
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$drop$1 = this;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                int i13 = this.f106119u;
                ChannelIterator channelIterator3 = (ChannelIterator) this.f106118t;
                ProducerScope producerScope6 = (ProducerScope) this.f106121w;
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope7 = producerScope6;
                ChannelIterator channelIterator4 = channelIterator3;
                int i14 = i13;
                obj2 = m142578e;
                channelsKt__DeprecatedKt$drop$1 = this;
                if (((Boolean) obj).booleanValue()) {
                    channelIterator4.next();
                    int i15 = i14 - 1;
                    if (i15 != 0) {
                        it = channelIterator4;
                        producerScope2 = producerScope7;
                        Object obj3 = obj2;
                        i11 = i15;
                        channelsKt__DeprecatedKt$drop$12 = channelsKt__DeprecatedKt$drop$1;
                        m142578e = obj3;
                        channelsKt__DeprecatedKt$drop$12.f106121w = producerScope2;
                        channelsKt__DeprecatedKt$drop$12.f106118t = it;
                        channelsKt__DeprecatedKt$drop$12.f106119u = i11;
                        channelsKt__DeprecatedKt$drop$12.f106120v = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$drop$12);
                        if (mo113028a != m142578e) {
                            return m142578e;
                        }
                        Object obj4 = m142578e;
                        channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                        obj = mo113028a;
                        producerScope7 = producerScope2;
                        channelIterator4 = it;
                        i14 = i11;
                        obj2 = obj4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                producerScope = producerScope7;
                it2 = channelsKt__DeprecatedKt$drop$1.f106123y.iterator();
                channelsKt__DeprecatedKt$drop$1.f106121w = producerScope;
                channelsKt__DeprecatedKt$drop$1.f106118t = it2;
                channelsKt__DeprecatedKt$drop$1.f106120v = 2;
                mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$drop$1);
                if (mo113028a2 != obj2) {
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f106121w;
            i11 = this.f106122x;
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > 0) {
                    it = this.f106123y.iterator();
                    producerScope2 = producerScope;
                    channelsKt__DeprecatedKt$drop$12 = this;
                    channelsKt__DeprecatedKt$drop$12.f106121w = producerScope2;
                    channelsKt__DeprecatedKt$drop$12.f106118t = it;
                    channelsKt__DeprecatedKt$drop$12.f106119u = i11;
                    channelsKt__DeprecatedKt$drop$12.f106120v = 1;
                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$drop$12);
                    if (mo113028a != m142578e) {
                    }
                } else {
                    obj2 = m142578e;
                    channelsKt__DeprecatedKt$drop$1 = this;
                    it2 = channelsKt__DeprecatedKt$drop$1.f106123y.iterator();
                    channelsKt__DeprecatedKt$drop$1.f106121w = producerScope;
                    channelsKt__DeprecatedKt$drop$1.f106118t = it2;
                    channelsKt__DeprecatedKt$drop$1.f106120v = 2;
                    mo113028a2 = it2.mo113028a(channelsKt__DeprecatedKt$drop$1);
                    if (mo113028a2 != obj2) {
                    }
                }
            } else {
                throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
            }
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
