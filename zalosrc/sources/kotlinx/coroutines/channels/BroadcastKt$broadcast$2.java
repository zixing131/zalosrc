package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m145345f = "Broadcast.kt", m145346l = {56, 57}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BroadcastKt$broadcast$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f105994t;

    /* renamed from: u */
    int f105995u;

    /* renamed from: v */
    private /* synthetic */ Object f105996v;

    /* renamed from: w */
    final /* synthetic */ ReceiveChannel f105997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroadcastKt$broadcast$2(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f105997w = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.f105997w, continuation);
        broadcastKt$broadcast$2.f105996v = obj;
        return broadcastKt$broadcast$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0068 -> B:7:0x003e). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ProducerScope producerScope;
        ChannelIterator it;
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2;
        Object mo113028a;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f105995u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    it = (ChannelIterator) this.f105994t;
                    ProducerScope producerScope2 = (ProducerScope) this.f105996v;
                    AbstractC24862s.m129228b(obj);
                    producerScope = producerScope2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                it = (ChannelIterator) this.f105994t;
                ProducerScope producerScope3 = (ProducerScope) this.f105996v;
                AbstractC24862s.m129228b(obj);
                BroadcastKt$broadcast$2 broadcastKt$broadcast$22 = this;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    broadcastKt$broadcast$22.f105996v = producerScope3;
                    broadcastKt$broadcast$22.f105994t = it;
                    broadcastKt$broadcast$22.f105995u = 2;
                    if (producerScope3.mo112908S(next, broadcastKt$broadcast$22) == m142578e) {
                        return m142578e;
                    }
                    producerScope = producerScope3;
                    broadcastKt$broadcast$2 = broadcastKt$broadcast$22;
                    broadcastKt$broadcast$2.f105996v = producerScope;
                    broadcastKt$broadcast$2.f105994t = it;
                    broadcastKt$broadcast$2.f105995u = 1;
                    mo113028a = it.mo113028a(broadcastKt$broadcast$2);
                    if (mo113028a != m142578e) {
                        return m142578e;
                    }
                    BroadcastKt$broadcast$2 broadcastKt$broadcast$23 = broadcastKt$broadcast$2;
                    producerScope3 = producerScope;
                    obj = mo113028a;
                    broadcastKt$broadcast$22 = broadcastKt$broadcast$23;
                    if (!((Boolean) obj).booleanValue()) {
                        return C24848g0.f119245a;
                    }
                }
            }
        } else {
            AbstractC24862s.m129228b(obj);
            producerScope = (ProducerScope) this.f105996v;
            it = this.f105997w.iterator();
        }
        broadcastKt$broadcast$2 = this;
        broadcastKt$broadcast$2.f105996v = producerScope;
        broadcastKt$broadcast$2.f105994t = it;
        broadcastKt$broadcast$2.f105995u = 1;
        mo113028a = it.mo113028a(broadcastKt$broadcast$2);
        if (mo113028a != m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((BroadcastKt$broadcast$2) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
