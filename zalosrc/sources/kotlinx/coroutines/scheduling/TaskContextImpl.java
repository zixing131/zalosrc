package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
final class TaskContextImpl implements TaskContext {

    /* renamed from: p */
    private final int f107488p;

    public TaskContextImpl(int i11) {
        this.f107488p = i11;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: i0 */
    public void mo113803i0() {
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: r0 */
    public int mo113804r0() {
        return this.f107488p;
    }
}
