package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.DelayKt", m145345f = "Delay.kt", m145346l = {163}, m145347m = "awaitCancellation")
/* loaded from: classes7.dex */
public final class DelayKt$awaitCancellation$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f105857s;

    /* renamed from: t */
    int f105858t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DelayKt$awaitCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f105857s = obj;
        this.f105858t |= Integer.MIN_VALUE;
        return DelayKt.m112665a(this);
    }
}
