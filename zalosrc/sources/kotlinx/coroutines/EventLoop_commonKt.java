package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes7.dex */
public final class EventLoop_commonKt {

    /* renamed from: a */
    private static final Symbol f105882a = new Symbol("REMOVED_TASK");

    /* renamed from: b */
    private static final Symbol f105883b = new Symbol("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m112720c(long j11) {
        return j11 / 1000000;
    }

    /* renamed from: d */
    public static final long m112721d(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (j11 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j11;
    }
}
