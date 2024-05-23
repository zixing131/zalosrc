package kotlinx.coroutines;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import um0.AbstractC27310a;
import um0.AbstractC27311b;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public abstract class CoroutineDispatcher extends AbstractC27310a implements InterfaceC27313d {

    /* renamed from: q */
    public static final Key f105835q = new Key(null);

    /* loaded from: classes.dex */
    public static final class Key extends AbstractC27311b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$Key$1 */
        /* loaded from: classes.dex */
        public static final class C217921 extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C217921 f105836q = new C217921();

            C217921() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CoroutineDispatcher mo205i9(InterfaceC27315f.b bVar) {
                if (bVar instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Key(AbstractC19060k abstractC19060k) {
            this();
        }

        private Key() {
            super(InterfaceC27313d.f128556o, C217921.f105836q);
        }
    }

    public CoroutineDispatcher() {
        super(InterfaceC27313d.f128556o);
    }

    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        mo9279z0(interfaceC27315f, runnable);
    }

    /* renamed from: E0 */
    public boolean mo9278E0(InterfaceC27315f interfaceC27315f) {
        return true;
    }

    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        return new LimitedDispatcher(this, i11);
    }

    @Override // um0.AbstractC27310a, um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        return InterfaceC27313d.a.m139847a(this, cVar);
    }

    @Override // um0.AbstractC27310a, um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        return InterfaceC27313d.a.m139848b(this, cVar);
    }

    @Override // um0.InterfaceC27313d
    /* renamed from: o */
    public final void mo112626o(Continuation continuation) {
        AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) continuation).m113609u();
    }

    @Override // um0.InterfaceC27313d
    /* renamed from: s */
    public final Continuation mo112627s(Continuation continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public String toString() {
        return DebugStringsKt.m112647a(this) + '@' + DebugStringsKt.m112648b(this);
    }

    /* renamed from: z0 */
    public abstract void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable);
}
