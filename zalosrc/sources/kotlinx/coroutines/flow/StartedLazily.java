package kotlinx.coroutines.flow;

/* loaded from: classes7.dex */
final class StartedLazily implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    /* renamed from: a */
    public Flow mo113489a(StateFlow stateFlow) {
        return FlowKt.m113265A(new StartedLazily$command$1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
