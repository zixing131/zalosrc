package kotlinx.coroutines;

/* loaded from: classes.dex */
final class SupervisorJobImpl extends JobImpl {
    public SupervisorJobImpl(Job job) {
        super(job);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: q0 */
    public boolean mo112833q0(Throwable th2) {
        return false;
    }
}
