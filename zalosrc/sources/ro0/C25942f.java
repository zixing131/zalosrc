package ro0;

/* renamed from: ro0.f */
/* loaded from: classes7.dex */
public class C25942f {

    /* renamed from: a */
    private int f123698a;

    /* renamed from: b */
    private String f123699b;

    /* renamed from: c */
    private String f123700c;

    /* renamed from: d */
    private int f123701d;

    /* renamed from: e */
    private int f123702e;

    /* renamed from: f */
    private long f123703f;

    /* renamed from: g */
    private long f123704g;

    /* renamed from: h */
    private int f123705h;

    /* renamed from: i */
    private boolean f123706i;

    /* renamed from: j */
    private long f123707j = System.currentTimeMillis();

    /* renamed from: k */
    private boolean f123708k;

    /* renamed from: l */
    private int f123709l;

    /* renamed from: d */
    public static String m133651d(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "REASON_NOT_FOUND" : "LEAVE_ZRTP_FAIL" : "LEAVE_BUSY" : "LEAVE_REJECT" : "LEAVE_RING_RING" : "LEAVE_NOT_RING_RING" : "LEAVE_NORMAL";
    }

    /* renamed from: a */
    public int m133652a() {
        return this.f123702e;
    }

    /* renamed from: b */
    public String m133653b() {
        return this.f123699b;
    }

    /* renamed from: c */
    public long m133654c() {
        return this.f123703f;
    }

    /* renamed from: e */
    public long m133655e() {
        return this.f123707j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25942f)) {
            return false;
        }
        C25942f c25942f = (C25942f) obj;
        if (this.f123698a != c25942f.f123698a || this.f123701d != c25942f.f123701d || this.f123702e != c25942f.f123702e || this.f123705h != c25942f.f123705h) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String m133656f() {
        return this.f123700c;
    }

    /* renamed from: g */
    public String m133657g(int i11) {
        String m133656f = m133656f();
        if (m133656f == null) {
            return "";
        }
        if (m133656f.length() > i11) {
            return m133656f.substring(0, i11) + "...";
        }
        return m133656f;
    }

    /* renamed from: h */
    public int m133658h() {
        return this.f123709l;
    }

    public int hashCode() {
        return this.f123698a;
    }

    /* renamed from: i */
    public int m133659i() {
        return this.f123705h;
    }

    /* renamed from: j */
    public long m133660j() {
        return this.f123704g;
    }

    /* renamed from: k */
    public int m133661k() {
        return this.f123698a;
    }

    /* renamed from: l */
    public int m133662l() {
        return this.f123701d;
    }

    /* renamed from: m */
    public boolean m133663m() {
        return this.f123701d == 1;
    }

    /* renamed from: n */
    public boolean m133664n() {
        return this.f123706i;
    }

    /* renamed from: o */
    public boolean m133665o() {
        return this.f123708k;
    }

    /* renamed from: p */
    public void m133666p(int i11) {
        this.f123702e = i11;
    }

    /* renamed from: q */
    public void m133667q(String str) {
        this.f123699b = str;
    }

    /* renamed from: r */
    public void m133668r(boolean z11) {
        this.f123706i = z11;
    }

    /* renamed from: s */
    public void m133669s(long j11) {
        this.f123703f = j11;
    }

    /* renamed from: t */
    public void m133670t(String str) {
        this.f123700c = str;
    }

    public String toString() {
        return "uid: " + this.f123698a + " isHost: " + this.f123706i + " name: " + this.f123700c + " (au,vi): (" + this.f123702e + "," + this.f123701d + ") state: " + this.f123705h + " ts: " + this.f123703f + " avatar: " + this.f123699b + " localTime: " + this.f123707j;
    }

    /* renamed from: u */
    public void m133671u(boolean z11) {
        this.f123708k = z11;
    }

    /* renamed from: v */
    public void m133672v(int i11) {
        this.f123709l = i11;
    }

    /* renamed from: w */
    public void m133673w(int i11) {
        this.f123705h = i11;
    }

    /* renamed from: x */
    public void m133674x(long j11) {
        this.f123704g = j11;
    }

    /* renamed from: y */
    public void m133675y(int i11) {
        this.f123698a = i11;
    }

    /* renamed from: z */
    public void m133676z(int i11) {
        this.f123701d = i11;
    }
}
