package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.DebugStringsKt;

/* loaded from: classes.dex */
public final class TaskImpl extends Task {

    /* renamed from: r */
    public final Runnable f107489r;

    public TaskImpl(Runnable runnable, long j11, TaskContext taskContext) {
        super(j11, taskContext);
        this.f107489r = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f107489r.run();
        } finally {
            this.f107487q.mo113803i0();
        }
    }

    public String toString() {
        return "Task[" + DebugStringsKt.m112647a(this.f107489r) + '@' + DebugStringsKt.m112648b(this.f107489r) + ", " + this.f107486p + ", " + this.f107487q + ']';
    }
}
