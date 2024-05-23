package kotlinx.coroutines;

import en0.InterfaceC18494a;
import java.util.concurrent.CancellationException;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class InterruptibleKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final Object m112730b(InterfaceC27315f interfaceC27315f, InterfaceC18494a interfaceC18494a) {
        try {
            ThreadState threadState = new ThreadState(JobKt.m112759l(interfaceC27315f));
            threadState.m112875d();
            try {
                return interfaceC18494a.mo12V4();
            } finally {
                threadState.m112873a();
            }
        } catch (InterruptedException e11) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e11);
        }
    }
}
