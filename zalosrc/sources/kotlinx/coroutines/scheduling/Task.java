package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public abstract class Task implements Runnable {

    /* renamed from: p */
    public long f107486p;

    /* renamed from: q */
    public TaskContext f107487q;

    public Task(long j11, TaskContext taskContext) {
        this.f107486p = j11;
        this.f107487q = taskContext;
    }

    public Task() {
        this(0L, TasksKt.f107496g);
    }
}
