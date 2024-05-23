package gp;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;

/* renamed from: gp.a */
/* loaded from: classes4.dex */
public final class C19528a {

    /* renamed from: a */
    private int f96974a;

    /* renamed from: b */
    private int f96975b;

    /* renamed from: c */
    private long f96976c;

    /* renamed from: d */
    private int f96977d;

    /* renamed from: e */
    private int f96978e;

    /* renamed from: f */
    private int f96979f;

    public C19528a(int i11, int i12, long j11, int i13, int i14, int i15) {
        this.f96974a = i11;
        this.f96975b = i12;
        this.f96976c = j11;
        this.f96977d = i13;
        this.f96978e = i14;
        this.f96979f = i15;
    }

    /* renamed from: b */
    private final String m102077b(long j11) {
        long j12 = j11 / 1000;
        long j13 = 3600;
        long j14 = j12 / j13;
        long j15 = 60;
        long j16 = (j12 % j13) / j15;
        long j17 = j12 % j15;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j16), Long.valueOf(j17)}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: a */
    public final void m102078a() {
        this.f96974a = 0;
        this.f96975b = 0;
        this.f96976c = 0L;
        this.f96977d = -1;
        this.f96978e = -1;
        this.f96979f = -1;
    }

    /* renamed from: c */
    public final void m102079c(long j11) {
        this.f96976c = j11;
    }

    /* renamed from: d */
    public final void m102080d(int i11) {
        this.f96979f = i11;
    }

    /* renamed from: e */
    public final void m102081e(int i11) {
        this.f96978e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19528a)) {
            return false;
        }
        C19528a c19528a = (C19528a) obj;
        return this.f96974a == c19528a.f96974a && this.f96975b == c19528a.f96975b && this.f96976c == c19528a.f96976c && this.f96977d == c19528a.f96977d && this.f96978e == c19528a.f96978e && this.f96979f == c19528a.f96979f;
    }

    /* renamed from: f */
    public final void m102082f(int i11) {
        this.f96977d = i11;
    }

    /* renamed from: g */
    public final void m102083g(int i11) {
        this.f96975b = i11;
    }

    /* renamed from: h */
    public final void m102084h(int i11) {
        this.f96974a = i11;
    }

    public int hashCode() {
        return (((((((((this.f96974a * 31) + this.f96975b) * 31) + AbstractC2147g0.m11521a(this.f96976c)) * 31) + this.f96977d) * 31) + this.f96978e) * 31) + this.f96979f;
    }

    public String toString() {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("Video Width: %4d px", Arrays.copyOf(new Object[]{Integer.valueOf(this.f96974a)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        String format2 = String.format("Video Height: %4d px", Arrays.copyOf(new Object[]{Integer.valueOf(this.f96975b)}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        String format3 = String.format("Current Time: %12s", Arrays.copyOf(new Object[]{m102077b(this.f96976c)}, 1));
        AbstractC19074t.m100207e(format3, "format(...)");
        String format4 = String.format("Time Duration: %11s", Arrays.copyOf(new Object[]{m102077b(this.f96977d * 1000)}, 1));
        AbstractC19074t.m100207e(format4, "format(...)");
        String format5 = String.format("Min Duration: %13s", Arrays.copyOf(new Object[]{m102077b(this.f96978e * 1000)}, 1));
        AbstractC19074t.m100207e(format5, "format(...)");
        String format6 = String.format("Max Duration: %13s", Arrays.copyOf(new Object[]{m102077b(this.f96979f * 1000)}, 1));
        AbstractC19074t.m100207e(format6, "format(...)");
        return format + "\n" + format2 + "\n" + format3 + "\n" + format4 + "\n" + format5 + "\n" + format6;
    }

    public /* synthetic */ C19528a(int i11, int i12, long j11, int i13, int i14, int i15, int i16, AbstractC19060k abstractC19060k) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) == 0 ? i12 : 0, (i16 & 4) != 0 ? 0L : j11, (i16 & 8) != 0 ? -1 : i13, (i16 & 16) != 0 ? -1 : i14, (i16 & 32) != 0 ? -1 : i15);
    }
}
