package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public final class NanoTimeSource extends SchedulerTimeSource {

    /* renamed from: a */
    public static final NanoTimeSource f107480a = new NanoTimeSource();

    private NanoTimeSource() {
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerTimeSource
    /* renamed from: a */
    public long mo113805a() {
        return System.nanoTime();
    }
}
