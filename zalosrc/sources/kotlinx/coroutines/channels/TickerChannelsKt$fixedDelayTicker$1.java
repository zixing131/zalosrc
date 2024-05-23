package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.TickerChannelsKt", m145345f = "TickerChannels.kt", m145346l = {106, 108, 109}, m145347m = "fixedDelayTicker")
/* loaded from: classes7.dex */
public final class TickerChannelsKt$fixedDelayTicker$1 extends AbstractC29096d {

    /* renamed from: s */
    long f106305s;

    /* renamed from: t */
    Object f106306t;

    /* renamed from: u */
    /* synthetic */ Object f106307u;

    /* renamed from: v */
    int f106308v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TickerChannelsKt$fixedDelayTicker$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113198c;
        this.f106307u = obj;
        this.f106308v |= Integer.MIN_VALUE;
        m113198c = TickerChannelsKt.m113198c(0L, 0L, null, this);
        return m113198c;
    }
}
