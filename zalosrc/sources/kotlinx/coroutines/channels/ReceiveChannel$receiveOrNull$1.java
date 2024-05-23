package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ReceiveChannel;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m145345f = "Channel.kt", m145346l = {372}, m145347m = "receiveOrNull")
/* loaded from: classes7.dex */
public final class ReceiveChannel$receiveOrNull$1<E> extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106303s;

    /* renamed from: t */
    int f106304t;

    public ReceiveChannel$receiveOrNull$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106303s = obj;
        this.f106304t |= Integer.MIN_VALUE;
        return ReceiveChannel.DefaultImpls.m113194b(null, this);
    }
}
