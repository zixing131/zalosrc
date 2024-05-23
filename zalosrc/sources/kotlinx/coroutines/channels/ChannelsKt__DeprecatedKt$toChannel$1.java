package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.SendChannel;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m145345f = "Deprecated.kt", m145346l = {487, 278}, m145347m = "toChannel")
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends SendChannel<? super E>> extends AbstractC29096d {

    /* renamed from: s */
    Object f106259s;

    /* renamed from: t */
    Object f106260t;

    /* renamed from: u */
    Object f106261u;

    /* renamed from: v */
    /* synthetic */ Object f106262v;

    /* renamed from: w */
    int f106263w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$toChannel$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106262v = obj;
        this.f106263w |= Integer.MIN_VALUE;
        return ChannelsKt.m113125s(null, null, this);
    }
}
