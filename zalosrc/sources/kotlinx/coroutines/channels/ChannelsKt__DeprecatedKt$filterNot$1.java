package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m145345f = "Deprecated.kt", m145346l = {222}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filterNot$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106155t;

    /* renamed from: u */
    /* synthetic */ Object f106156u;

    /* renamed from: v */
    final /* synthetic */ InterfaceC18509p f106157v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$filterNot$1(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(2, continuation);
        this.f106157v = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.f106157v, continuation);
        channelsKt__DeprecatedKt$filterNot$1.f106156u = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106155t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Object obj2 = this.f106156u;
            InterfaceC18509p interfaceC18509p = this.f106157v;
            this.f106155t = 1;
            obj = interfaceC18509p.mo240pC(obj2, this);
            if (obj == m142578e) {
                return m142578e;
            }
        }
        return AbstractC29094b.m145339a(!((Boolean) obj).booleanValue());
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) mo238a(obj, continuation)).mo239o(C24848g0.f119245a);
    }
}
