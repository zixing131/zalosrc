package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause2;

/* loaded from: classes7.dex */
public interface SendChannel<E> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ boolean m113195a(SendChannel sendChannel, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    th2 = null;
                }
                return sendChannel.mo112906H(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: B */
    void mo112917B(InterfaceC18505l interfaceC18505l);

    /* renamed from: H */
    boolean mo112906H(Throwable th2);

    /* renamed from: S */
    Object mo112908S(Object obj, Continuation continuation);

    /* renamed from: T */
    boolean mo112909T();

    /* renamed from: l */
    SelectClause2 mo113014l();

    /* renamed from: p */
    Object mo112912p(Object obj);
}
