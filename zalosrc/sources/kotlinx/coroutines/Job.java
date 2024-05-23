package kotlinx.coroutines;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import nn0.InterfaceC23898g;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public interface Job extends InterfaceC27315f.b {

    /* renamed from: m */
    public static final Key f105897m = Key.f105898p;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ void m112740a(Job job, CancellationException cancellationException, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    cancellationException = null;
                }
                job.mo112734a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static Object m112741b(Job job, Object obj, InterfaceC18509p interfaceC18509p) {
            return InterfaceC27315f.b.a.m139852a(job, obj, interfaceC18509p);
        }

        /* renamed from: c */
        public static InterfaceC27315f.b m112742c(Job job, InterfaceC27315f.c cVar) {
            return InterfaceC27315f.b.a.m139853b(job, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ DisposableHandle m112743d(Job job, boolean z11, boolean z12, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                if ((i11 & 2) != 0) {
                    z12 = true;
                }
                return job.mo112738w0(z11, z12, interfaceC18505l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static InterfaceC27315f m112744e(Job job, InterfaceC27315f.c cVar) {
            return InterfaceC27315f.b.a.m139854c(job, cVar);
        }

        /* renamed from: f */
        public static InterfaceC27315f m112745f(Job job, InterfaceC27315f interfaceC27315f) {
            return InterfaceC27315f.b.a.m139855d(job, interfaceC27315f);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements InterfaceC27315f.c {

        /* renamed from: p */
        static final /* synthetic */ Key f105898p = new Key();

        private Key() {
        }
    }

    /* renamed from: A */
    CancellationException mo112732A();

    /* renamed from: M */
    DisposableHandle mo112733M(InterfaceC18505l interfaceC18505l);

    /* renamed from: a */
    void mo112734a(CancellationException cancellationException);

    /* renamed from: b */
    InterfaceC23898g mo112735b();

    /* renamed from: c */
    boolean mo112496c();

    /* renamed from: c0 */
    Object mo112736c0(Continuation continuation);

    /* renamed from: f */
    boolean mo112737f();

    Job getParent();

    boolean isCancelled();

    boolean start();

    /* renamed from: w0 */
    DisposableHandle mo112738w0(boolean z11, boolean z12, InterfaceC18505l interfaceC18505l);

    /* renamed from: y0 */
    ChildHandle mo112739y0(ChildJob childJob);
}
