package kotlinx.coroutines.tasks;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import nn0.InterfaceC23898g;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class TasksKt$asDeferredImpl$3 implements Deferred<Object> {

    /* renamed from: p */
    private final /* synthetic */ CompletableDeferred f107619p;

    @Override // kotlinx.coroutines.Job
    /* renamed from: A */
    public CancellationException mo112732A() {
        return this.f107619p.mo112732A();
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: E */
    public Object mo112598E(Continuation continuation) {
        return this.f107619p.mo112598E(continuation);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: M */
    public DisposableHandle mo112733M(InterfaceC18505l interfaceC18505l) {
        return this.f107619p.mo112733M(interfaceC18505l);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public void mo112734a(CancellationException cancellationException) {
        this.f107619p.mo112734a(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public InterfaceC23898g mo112735b() {
        return this.f107619p.mo112735b();
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        return this.f107619p.mo112496c();
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c0 */
    public Object mo112736c0(Continuation continuation) {
        return this.f107619p.mo112736c0(continuation);
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        return this.f107619p.mo112624d(cVar);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return this.f107619p.mo112823d0(interfaceC27315f);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: f */
    public boolean mo112737f() {
        return this.f107619p.mo112737f();
    }

    @Override // um0.InterfaceC27315f.b
    public InterfaceC27315f.c getKey() {
        return this.f107619p.getKey();
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return this.f107619p.getParent();
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        return this.f107619p.mo112826h(obj, interfaceC18509p);
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        return this.f107619p.mo112625i(cVar);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.f107619p.isCancelled();
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: r */
    public Object mo112599r() {
        return this.f107619p.mo112599r();
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.f107619p.start();
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: t */
    public Throwable mo112661t() {
        return this.f107619p.mo112661t();
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: w0 */
    public DisposableHandle mo112738w0(boolean z11, boolean z12, InterfaceC18505l interfaceC18505l) {
        return this.f107619p.mo112738w0(z11, z12, interfaceC18505l);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: y0 */
    public ChildHandle mo112739y0(ChildJob childJob) {
        return this.f107619p.mo112739y0(childJob);
    }
}
