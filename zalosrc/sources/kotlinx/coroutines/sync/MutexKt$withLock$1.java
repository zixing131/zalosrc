package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.sync.MutexKt", m145345f = "Mutex.kt", m145346l = {125}, m145347m = "withLock")
/* loaded from: classes7.dex */
public final class MutexKt$withLock$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f107591s;

    /* renamed from: t */
    Object f107592t;

    /* renamed from: u */
    Object f107593u;

    /* renamed from: v */
    /* synthetic */ Object f107594v;

    /* renamed from: w */
    int f107595w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutexKt$withLock$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107594v = obj;
        this.f107595w |= Integer.MIN_VALUE;
        return MutexKt.m113913e(null, null, null, this);
    }
}
