package p716zh;

/* renamed from: zh.aa */
/* loaded from: classes3.dex */
public class C31843aa {

    /* renamed from: a */
    private String f146158a;

    /* renamed from: b */
    private int f146159b;

    /* renamed from: c */
    private long f146160c;

    /* renamed from: d */
    private long f146161d;

    /* renamed from: a */
    public int m152988a() {
        return this.f146159b & 15;
    }

    /* renamed from: b */
    public boolean m152989b() {
        return (this.f146159b & 16) == 16;
    }

    /* renamed from: c */
    public void m152990c(long j11) {
        this.f146161d = j11;
    }

    /* renamed from: d */
    public void m152991d(long j11) {
        this.f146160c = j11;
    }

    /* renamed from: e */
    public void m152992e(int i11) {
        this.f146159b = i11;
    }

    /* renamed from: f */
    public void m152993f(String str) {
        this.f146158a = str;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f146160c);
        sb2.append(" uid=");
        String str2 = this.f146158a;
        if (str2 == null) {
            str2 = "NULL";
        }
        sb2.append(str2);
        sb2.append("; state=");
        if (m152988a() == 1) {
            str = "SEEN FIRST";
        } else if (m152988a() == 2) {
            str = "SEEN SECOND";
        } else if (m152989b()) {
            str = "CAPTURE SCREEN";
        } else {
            str = "ERROR";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
