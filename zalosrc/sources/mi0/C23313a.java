package mi0;

/* renamed from: mi0.a */
/* loaded from: classes7.dex */
public final class C23313a {

    /* renamed from: a */
    private final int f113501a;

    /* renamed from: b */
    private final int f113502b;

    /* renamed from: c */
    private final boolean f113503c;

    /* renamed from: d */
    private final int f113504d;

    /* renamed from: e */
    private final int f113505e;

    /* renamed from: f */
    private final int f113506f;

    /* renamed from: g */
    private final int f113507g;

    /* renamed from: h */
    private boolean f113508h;

    public C23313a(int i11, int i12, boolean z11, int i13, int i14, int i15, int i16, boolean z12) {
        this.f113501a = i11;
        this.f113502b = i12;
        this.f113503c = z11;
        this.f113504d = i13;
        this.f113505e = i14;
        this.f113506f = i15;
        this.f113507g = i16;
        this.f113508h = z12;
    }

    /* renamed from: a */
    public final int m122690a() {
        return this.f113505e;
    }

    /* renamed from: b */
    public final int m122691b() {
        return this.f113507g;
    }

    /* renamed from: c */
    public final boolean m122692c() {
        return this.f113508h;
    }

    /* renamed from: d */
    public final int m122693d() {
        return this.f113504d;
    }

    /* renamed from: e */
    public final int m122694e() {
        return this.f113501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23313a)) {
            return false;
        }
        C23313a c23313a = (C23313a) obj;
        return this.f113501a == c23313a.f113501a && this.f113502b == c23313a.f113502b && this.f113503c == c23313a.f113503c && this.f113504d == c23313a.f113504d && this.f113505e == c23313a.f113505e && this.f113506f == c23313a.f113506f && this.f113507g == c23313a.f113507g && this.f113508h == c23313a.f113508h;
    }

    /* renamed from: f */
    public final int m122695f() {
        return this.f113502b;
    }

    /* renamed from: g */
    public final int m122696g() {
        return this.f113506f;
    }

    /* renamed from: h */
    public final boolean m122697h() {
        return this.f113503c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i11 = ((this.f113501a * 31) + this.f113502b) * 31;
        boolean z11 = this.f113503c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (((((((((i11 + i12) * 31) + this.f113504d) * 31) + this.f113505e) * 31) + this.f113506f) * 31) + this.f113507g) * 31;
        boolean z12 = this.f113508h;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "ProgressBarStyle(progressFixHeight=" + this.f113501a + ", progressType=" + this.f113502b + ", isCountDown=" + this.f113503c + ", indicatorColor=" + this.f113504d + ", backgroundColor=" + this.f113505e + ", textColor=" + this.f113506f + ", iconColor=" + this.f113507g + ", inDeterminateOnly=" + this.f113508h + ')';
    }
}
