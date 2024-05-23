package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.sync.SemaphoreKt", m145345f = "Semaphore.kt", m145346l = {86}, m145347m = "withPermit")
/* loaded from: classes7.dex */
public final class SemaphoreKt$withPermit$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f107612s;

    /* renamed from: t */
    Object f107613t;

    /* renamed from: u */
    /* synthetic */ Object f107614u;

    /* renamed from: v */
    int f107615v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SemaphoreKt$withPermit$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107614u = obj;
        this.f107615v |= Integer.MIN_VALUE;
        return SemaphoreKt.m113940k(null, null, this);
    }
}
