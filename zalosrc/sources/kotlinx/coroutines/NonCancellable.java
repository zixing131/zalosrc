package kotlinx.coroutines;

import en0.InterfaceC18505l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import nn0.AbstractC23904m;
import nn0.InterfaceC23898g;
import um0.AbstractC27310a;

/* loaded from: classes7.dex */
public final class NonCancellable extends AbstractC27310a implements Job {

    /* renamed from: q */
    public static final NonCancellable f105936q = new NonCancellable();

    private NonCancellable() {
        super(Job.f105897m);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: A */
    public CancellationException mo112732A() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: M */
    public DisposableHandle mo112733M(InterfaceC18505l interfaceC18505l) {
        return NonDisposableHandle.f105937p;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public void mo112734a(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public InterfaceC23898g mo112735b() {
        InterfaceC23898g m125016e;
        m125016e = AbstractC23904m.m125016e();
        return m125016e;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c0 */
    public Object mo112736c0(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: f */
    public boolean mo112737f() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: w0 */
    public DisposableHandle mo112738w0(boolean z11, boolean z12, InterfaceC18505l interfaceC18505l) {
        return NonDisposableHandle.f105937p;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: y0 */
    public ChildHandle mo112739y0(ChildJob childJob) {
        return NonDisposableHandle.f105937p;
    }
}
