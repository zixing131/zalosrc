package kotlinx.coroutines.flow;

/* loaded from: classes7.dex */
public interface SharingStarted {

    /* renamed from: a */
    public static final Companion f107140a = Companion.f107141a;

    /* loaded from: classes7.dex */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f107141a = new Companion();

        /* renamed from: b */
        private static final SharingStarted f107142b = new StartedEagerly();

        /* renamed from: c */
        private static final SharingStarted f107143c = new StartedLazily();

        private Companion() {
        }

        /* renamed from: b */
        public static /* synthetic */ SharingStarted m113490b(Companion companion, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = 0;
            }
            if ((i11 & 2) != 0) {
                j12 = Long.MAX_VALUE;
            }
            return companion.m113491a(j11, j12);
        }

        /* renamed from: a */
        public final SharingStarted m113491a(long j11, long j12) {
            return new StartedWhileSubscribed(j11, j12);
        }

        /* renamed from: c */
        public final SharingStarted m113492c() {
            return f107142b;
        }

        /* renamed from: d */
        public final SharingStarted m113493d() {
            return f107143c;
        }
    }

    /* renamed from: a */
    Flow mo113489a(StateFlow stateFlow);
}
