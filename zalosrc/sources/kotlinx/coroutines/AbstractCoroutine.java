package kotlinx.coroutines;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {

    /* renamed from: r */
    private final InterfaceC27315f f105789r;

    public AbstractCoroutine(InterfaceC27315f interfaceC27315f, boolean z11, boolean z12) {
        super(z12);
        if (z11) {
            m112817J0((Job) interfaceC27315f.mo112624d(Job.f105897m));
        }
        this.f105789r = interfaceC27315f.mo112823d0(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: I0 */
    public final void mo112493I0(Throwable th2) {
        CoroutineExceptionHandlerKt.m112629a(this.f105789r, th2);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return this.f105789r;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: R0 */
    public String mo112494R0() {
        String m112613b = CoroutineContextKt.m112613b(this.f105789r);
        if (m112613b == null) {
            return super.mo112494R0();
        }
        return '\"' + m112613b + "\":" + super.mo112494R0();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: Y0 */
    protected final void mo112495Y0(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            mo112499q1(completedExceptionally.f105828a, completedExceptionally.m112604a());
        } else {
            mo112500r1(obj);
        }
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        return super.mo112496c();
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public final void mo112492g(Object obj) {
        Object m112820P0 = m112820P0(CompletionStateKt.m112609d(obj, null, 1, null));
        if (m112820P0 == JobSupportKt.f105928b) {
            return;
        }
        mo112498p1(m112820P0);
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC27315f getContext() {
        return this.f105789r;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: p0 */
    public String mo112497p0() {
        return DebugStringsKt.m112647a(this) + " was cancelled";
    }

    /* renamed from: p1 */
    protected void mo112498p1(Object obj) {
        mo112525h0(obj);
    }

    /* renamed from: q1 */
    protected void mo112499q1(Throwable th2, boolean z11) {
    }

    /* renamed from: r1 */
    protected void mo112500r1(Object obj) {
    }

    /* renamed from: s1 */
    public final void m112501s1(CoroutineStart coroutineStart, Object obj, InterfaceC18509p interfaceC18509p) {
        coroutineStart.m112645c(interfaceC18509p, obj, this);
    }
}
