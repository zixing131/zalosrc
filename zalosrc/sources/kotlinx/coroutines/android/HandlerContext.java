package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import ln0.AbstractC22543l;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private volatile HandlerContext _immediate;

    /* renamed from: r */
    private final Handler f105961r;

    /* renamed from: s */
    private final String f105962s;

    /* renamed from: t */
    private final boolean f105963t;

    /* renamed from: u */
    private final HandlerContext f105964u;

    private HandlerContext(Handler handler, String str, boolean z11) {
        super(null);
        this.f105961r = handler;
        this.f105962s = str;
        this.f105963t = z11;
        this._immediate = z11 ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.f105964u = handlerContext;
    }

    /* renamed from: K0 */
    private final void m112889K0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        JobKt.m112750c(interfaceC27315f, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.m112680b().mo9279z0(interfaceC27315f, runnable);
    }

    /* renamed from: M0 */
    public static final void m112890M0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f105961r.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: E0 */
    public boolean mo9278E0(InterfaceC27315f interfaceC27315f) {
        if (this.f105963t && AbstractC19074t.m100204b(Looper.myLooper(), this.f105961r.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* renamed from: L0 */
    public HandlerContext mo112861G0() {
        return this.f105964u;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HandlerContext) && ((HandlerContext) obj).f105961r == this.f105961r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f105961r);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: q */
    public void mo112663q(long j11, CancellableContinuation cancellableContinuation) {
        long m116585h;
        HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1 handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1 = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1

            /* renamed from: q */
            final /* synthetic */ HandlerContext f105966q;

            public HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1(HandlerContext this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CancellableContinuation.this.mo112542D(r2, C24848g0.f119245a);
            }
        };
        Handler handler = this.f105961r;
        m116585h = AbstractC22543l.m116585h(j11, 4611686018427387903L);
        if (handler.postDelayed(handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1, m116585h)) {
            cancellableContinuation.mo112543I(new HandlerContext$scheduleResumeAfterDelay$1(this, handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1));
        } else {
            m112889K0(cancellableContinuation.getContext(), handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1);
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String m112862H0 = m112862H0();
        if (m112862H0 == null) {
            String str = this.f105962s;
            if (str == null) {
                str = this.f105961r.toString();
            }
            if (this.f105963t) {
                return str + ".immediate";
            }
            return str;
        }
        return m112862H0;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        long m116585h;
        Handler handler = this.f105961r;
        m116585h = AbstractC22543l.m116585h(j11, 4611686018427387903L);
        if (handler.postDelayed(runnable, m116585h)) {
            return new DisposableHandle() { // from class: kotlinx.coroutines.android.a

                /* renamed from: q */
                public final /* synthetic */ Runnable f105972q;

                public /* synthetic */ C21795a(Runnable runnable2) {
                    r2 = runnable2;
                }

                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    HandlerContext.m112890M0(HandlerContext.this, r2);
                }
            };
        }
        m112889K0(interfaceC27315f, runnable2);
        return NonDisposableHandle.f105937p;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        if (!this.f105961r.post(runnable)) {
            m112889K0(interfaceC27315f, runnable);
        }
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i11, AbstractC19060k abstractC19060k) {
        this(handler, (i11 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
