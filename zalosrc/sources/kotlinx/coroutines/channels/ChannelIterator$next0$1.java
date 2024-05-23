package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelIterator;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m145345f = "Channel.kt", m145346l = {589}, m145347m = "next")
/* loaded from: classes7.dex */
public final class ChannelIterator$next0$1<E> extends AbstractC29096d {

    /* renamed from: s */
    Object f106067s;

    /* renamed from: t */
    /* synthetic */ Object f106068t;

    /* renamed from: u */
    int f106069u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelIterator$next0$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106068t = obj;
        this.f106069u |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.m113077a(null, this);
    }
}
