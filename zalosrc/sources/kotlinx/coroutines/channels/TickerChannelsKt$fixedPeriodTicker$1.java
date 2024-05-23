package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.TickerChannelsKt", m145345f = "TickerChannels.kt", m145346l = {84, 88, 94, 96}, m145347m = "fixedPeriodTicker")
/* loaded from: classes7.dex */
public final class TickerChannelsKt$fixedPeriodTicker$1 extends AbstractC29096d {

    /* renamed from: s */
    long f106309s;

    /* renamed from: t */
    long f106310t;

    /* renamed from: u */
    Object f106311u;

    /* renamed from: v */
    /* synthetic */ Object f106312v;

    /* renamed from: w */
    int f106313w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TickerChannelsKt$fixedPeriodTicker$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113199d;
        this.f106312v = obj;
        this.f106313w |= Integer.MIN_VALUE;
        m113199d = TickerChannelsKt.m113199d(0L, 0L, null, this);
        return m113199d;
    }
}
