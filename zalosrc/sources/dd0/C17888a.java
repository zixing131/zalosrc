package dd0;

/* renamed from: dd0.a */
/* loaded from: classes4.dex */
public class C17888a {

    /* renamed from: a */
    int f90394a;

    /* renamed from: b */
    boolean f90395b;

    /* renamed from: c */
    long f90396c;

    public C17888a(boolean z11, long j11, int i11) {
        this.f90395b = z11;
        this.f90396c = j11;
        this.f90394a = i11;
    }

    /* renamed from: b */
    public static C17888a m94429b(String str, int i11, int i12) {
        long j11;
        int i13;
        if (i11 >= i12) {
            return null;
        }
        long j12 = 0;
        int i14 = i11;
        while (i14 < i12) {
            char charAt = str.charAt(i14);
            if (charAt >= '0' && charAt <= '9') {
                j12 = (j12 * 16) + (charAt - '0');
            } else {
                if (charAt >= 'A' && charAt <= 'F') {
                    j11 = j12 * 16;
                    i13 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j11 = j12 * 16;
                    i13 = charAt - 'a';
                }
                j12 = j11 + i13 + 10;
            }
            if (j12 > 4294967295L) {
                return null;
            }
            i14++;
        }
        if (i14 == i11) {
            return null;
        }
        return new C17888a(false, j12, i14);
    }

    /* renamed from: a */
    public int m94430a() {
        return this.f90394a;
    }

    /* renamed from: c */
    public int m94431c() {
        return (int) this.f90396c;
    }
}
