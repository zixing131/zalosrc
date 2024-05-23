package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.TimeoutKt", m145345f = "Timeout.kt", m145346l = {104}, m145347m = "withTimeoutOrNull")
/* loaded from: classes7.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends AbstractC29096d {

    /* renamed from: s */
    long f105951s;

    /* renamed from: t */
    Object f105952t;

    /* renamed from: u */
    Object f105953u;

    /* renamed from: v */
    /* synthetic */ Object f105954v;

    /* renamed from: w */
    int f105955w;

    public TimeoutKt$withTimeoutOrNull$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f105954v = obj;
        this.f105955w |= Integer.MIN_VALUE;
        return TimeoutKt.m112879d(0L, null, this);
    }
}
