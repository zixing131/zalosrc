package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", m145345f = "Channels.kt", m145346l = {58}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__ChannelsKt$sendBlocking$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106076t;

    /* renamed from: u */
    final /* synthetic */ SendChannel f106077u;

    /* renamed from: v */
    final /* synthetic */ Object f106078v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__ChannelsKt$sendBlocking$1(SendChannel sendChannel, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f106077u = sendChannel;
        this.f106078v = obj;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new ChannelsKt__ChannelsKt$sendBlocking$1(this.f106077u, this.f106078v, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106076t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            SendChannel sendChannel = this.f106077u;
            Object obj2 = this.f106078v;
            this.f106076t = 1;
            if (sendChannel.mo112908S(obj2, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelsKt__ChannelsKt$sendBlocking$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
