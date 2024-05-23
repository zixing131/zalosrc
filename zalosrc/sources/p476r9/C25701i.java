package p476r9;

import java.util.concurrent.TimeUnit;

/* renamed from: r9.i */
/* loaded from: classes3.dex */
public class C25701i {

    /* renamed from: a */
    private long f122715a;

    /* renamed from: b */
    private long f122716b;

    /* renamed from: c */
    private TimeUnit f122717c;

    /* renamed from: r9.i$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f122718a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f122718a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122718a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122718a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C25701i(long j11, long j12, TimeUnit timeUnit) {
        this.f122715a = j11;
        this.f122716b = j12;
        this.f122717c = timeUnit;
    }

    /* renamed from: a */
    public double m132615a() {
        int i11 = a.f122718a[this.f122717c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return this.f122715a / this.f122717c.toSeconds(this.f122716b);
                }
                return (this.f122715a / this.f122716b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f122715a / this.f122716b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f122715a / this.f122716b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
