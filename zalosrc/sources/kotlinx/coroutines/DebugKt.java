package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes.dex */
public final class DebugKt {

    /* renamed from: a */
    private static final boolean f105850a;

    /* renamed from: b */
    private static final boolean f105851b;

    /* renamed from: c */
    private static final AtomicLong f105852c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:            if (r0.equals("on") != false) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:            if (r0.equals("") != false) goto L23;     */
    static {
        boolean z11;
        String m113716d = SystemPropsKt.m113716d("kotlinx.coroutines.debug");
        boolean z12 = true;
        if (m113716d != null) {
            int hashCode = m113716d.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + m113716d + '\'').toString());
            }
            f105850a = z11;
            if (z11 || !SystemPropsKt.m113718f("kotlinx.coroutines.stacktrace.recovery", true)) {
                z12 = false;
            }
            f105851b = z12;
            f105852c = new AtomicLong(0L);
        }
        z11 = false;
        f105850a = z11;
        if (z11) {
        }
        z12 = false;
        f105851b = z12;
        f105852c = new AtomicLong(0L);
    }
}
