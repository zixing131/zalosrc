package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m145345f = "DebugCoroutineInfoImpl.kt", m145346l = {163}, m145347m = "yieldFrames")
/* loaded from: classes7.dex */
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106367s;

    /* renamed from: t */
    Object f106368t;

    /* renamed from: u */
    Object f106369u;

    /* renamed from: v */
    /* synthetic */ Object f106370v;

    /* renamed from: w */
    final /* synthetic */ DebugCoroutineInfoImpl f106371w;

    /* renamed from: x */
    int f106372x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, Continuation continuation) {
        super(continuation);
        this.f106371w = debugCoroutineInfoImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113235i;
        this.f106370v = obj;
        this.f106372x |= Integer.MIN_VALUE;
        m113235i = this.f106371w.m113235i(null, null, this);
        return m113235i;
    }
}
