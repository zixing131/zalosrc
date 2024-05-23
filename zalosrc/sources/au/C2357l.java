package au;

/* renamed from: au.l */
/* loaded from: classes4.dex */
public final class C2357l {

    /* renamed from: a */
    public static final C2357l f9883a = new C2357l();

    private C2357l() {
    }

    /* renamed from: a */
    public final String m12351a(int i11) {
        return m12352b(i11, false);
    }

    /* renamed from: b */
    public final String m12352b(int i11, boolean z11) {
        String str;
        int i12 = i11 % 1000;
        if (i12 >= 500) {
            i11 += 1000 - i12;
        }
        int i13 = i11 / 1000;
        int i14 = i13 / 60;
        int i15 = i13 % 60;
        if (i15 == 0 && z11) {
            i15 = 1;
        }
        String str2 = "0";
        if (i14 <= 9) {
            str = "0";
        } else {
            str = "";
        }
        if (i15 > 9) {
            str2 = "";
        }
        return str + i14 + ":" + str2 + i15;
    }
}
