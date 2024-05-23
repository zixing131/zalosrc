package sd0;

/* renamed from: sd0.b */
/* loaded from: classes4.dex */
public class C26233b {

    /* renamed from: a */
    public final int f124611a;

    /* renamed from: b */
    public final int f124612b;

    /* renamed from: c */
    public final String f124613c;

    /* renamed from: d */
    public final String f124614d;

    public C26233b(int i11, int i12, String str, String str2) {
        this.f124611a = i11;
        this.f124612b = i12;
        this.f124613c = str;
        this.f124614d = str2;
    }

    /* renamed from: a */
    public static C26233b m134882a(int i11, int i12, String str, String str2) {
        return new C26233b(i11, i12, str, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26233b)) {
            return false;
        }
        C26233b c26233b = (C26233b) obj;
        if (this.f124611a != c26233b.f124611a || this.f124612b != c26233b.f124612b) {
            return false;
        }
        String str = this.f124613c;
        if ((str != null || c26233b.f124613c != null) && (str == null || !str.equals(c26233b.f124613c))) {
            return false;
        }
        String str2 = this.f124614d;
        if ((str2 != null || c26233b.f124614d != null) && (str2 == null || !str2.equals(c26233b.f124614d))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i11 = (((527 + this.f124611a) * 31) + this.f124612b) * 31;
        String str = this.f124613c;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        String str2 = this.f124614d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }
}
