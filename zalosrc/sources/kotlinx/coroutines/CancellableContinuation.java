package kotlinx.coroutines;

import en0.InterfaceC18505l;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface CancellableContinuation<T> extends Continuation<T> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ boolean m112552a(CancellableContinuation cancellableContinuation, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    th2 = null;
                }
                return cancellableContinuation.mo112550n(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: D */
    void mo112542D(CoroutineDispatcher coroutineDispatcher, Object obj);

    /* renamed from: I */
    void mo112543I(InterfaceC18505l interfaceC18505l);

    /* renamed from: R */
    Object mo112544R(Object obj, Object obj2, InterfaceC18505l interfaceC18505l);

    /* renamed from: U */
    void mo112545U(Object obj);

    /* renamed from: c */
    boolean mo112546c();

    /* renamed from: f */
    boolean mo112547f();

    /* renamed from: j */
    Object mo112548j(Throwable th2);

    /* renamed from: k */
    void mo112549k(CoroutineDispatcher coroutineDispatcher, Throwable th2);

    /* renamed from: n */
    boolean mo112550n(Throwable th2);

    /* renamed from: y */
    void mo112551y(Object obj, InterfaceC18505l interfaceC18505l);
}
