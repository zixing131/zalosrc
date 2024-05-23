package p361nb;

import java.util.ArrayList;

/* renamed from: nb.h */
/* loaded from: classes3.dex */
public class C23651h extends C23669z {

    /* renamed from: j */
    public static final int[] f114587j;

    /* renamed from: k */
    private static final int f114588k;

    /* renamed from: i */
    private int f114589i;

    static {
        int[] iArr = {0, 3, 7, 3, 5, 5, 3, 3, 3, 3, 8, 5, 3, 2, 2, 2, 2, 5, 8, 7, 4, 2, 3, 3, 4, 5, 5, 4, 8, 1, 7, 2, 3, 8, 0, 0, 7, 6, 6, 4, 2, 4, 7, 3, 3, 2, 3};
        f114587j = iArr;
        f114588k = iArr.length;
    }

    private C23651h() {
        m123962k();
    }

    /* renamed from: g */
    public static C23651h m123959g(int i11) {
        int i12;
        if (i11 <= f114588k && i11 >= 0) {
            C23651h c23651h = new C23651h();
            int[] iArr = f114587j;
            if (i11 < iArr.length) {
                i12 = iArr[i11];
            } else {
                i12 = 0;
            }
            c23651h.f114658e = i12;
            c23651h.f114659f = new String[i12];
            c23651h.f114589i = i11;
            return c23651h;
        }
        return null;
    }

    /* renamed from: h */
    public static C23651h m123960h(int i11, ArrayList arrayList) {
        C23651h c23651h = null;
        if (i11 <= f114588k && i11 >= 0) {
            int i12 = f114587j[i11];
            if (i12 != arrayList.size()) {
                return null;
            }
            c23651h = new C23651h();
            c23651h.f114658e = i12;
            c23651h.f114659f = new String[i12];
            c23651h.f114589i = i11;
            for (int i13 = 0; i13 < i12; i13++) {
                c23651h.f114659f[i13] = (String) arrayList.get(i13);
            }
        }
        return c23651h;
    }

    /* renamed from: i */
    public static C23651h m123961i(int i11, String... strArr) {
        int i12;
        if (i11 > f114588k || i11 < 0 || (i12 = f114587j[i11]) != strArr.length) {
            return null;
        }
        C23651h c23651h = new C23651h();
        c23651h.f114589i = i11;
        c23651h.f114658e = i12;
        String[] strArr2 = new String[i12];
        c23651h.f114659f = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, i12);
        return c23651h;
    }

    /* renamed from: k */
    private void m123962k() {
        this.f114659f = new String[this.f114658e];
    }

    /* renamed from: j */
    public int m123963j() {
        try {
            return f114587j[this.f114589i];
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: l */
    public boolean m123964l() {
        if (this.f114658e >= m123963j()) {
            return true;
        }
        return false;
    }
}
