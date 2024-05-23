package kotlinx.coroutines.flow;

/* loaded from: classes7.dex */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    /* renamed from: a */
    public Flow mo113489a(StateFlow stateFlow) {
        return FlowKt.m113266B(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
