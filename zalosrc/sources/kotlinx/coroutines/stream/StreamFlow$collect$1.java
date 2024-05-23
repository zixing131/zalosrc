package kotlinx.coroutines.stream;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.stream.StreamFlow", m145345f = "Stream.kt", m145346l = {26}, m145347m = "collect")
/* loaded from: classes7.dex */
public final class StreamFlow$collect$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107566s;

    /* renamed from: t */
    Object f107567t;

    /* renamed from: u */
    Object f107568u;

    /* renamed from: v */
    /* synthetic */ Object f107569v;

    /* renamed from: w */
    final /* synthetic */ StreamFlow f107570w;

    /* renamed from: x */
    int f107571x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamFlow$collect$1(StreamFlow streamFlow, Continuation continuation) {
        super(continuation);
        this.f107570w = streamFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107569v = obj;
        this.f107571x |= Integer.MIN_VALUE;
        return this.f107570w.mo97893a(null, this);
    }
}
