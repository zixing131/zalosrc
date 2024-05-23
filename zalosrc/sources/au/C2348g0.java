package au;

import fn0.AbstractC19074t;
import on0.AbstractC24342w;
import qm0.AbstractC25358n;

/* renamed from: au.g0 */
/* loaded from: classes4.dex */
public final class C2348g0 {

    /* renamed from: a */
    public static final C2348g0 f9864a = new C2348g0();

    /* renamed from: b */
    private static final int[][] f9865b = {null, null, null, null, null, null, null, null, new int[]{4}, new int[]{4, 3}, new int[]{4, 3}, new int[]{4, 4}, new int[]{4, 4}, new int[]{4, 3, 3}, new int[]{4, 4, 3}, new int[]{4, 4, 4}, new int[]{4, 4, 4}};

    /* renamed from: c */
    private static final int[] f9866c = {3, 3, 3};

    private C2348g0() {
    }

    /* renamed from: a */
    public final CharSequence m12318a(CharSequence charSequence, int[] iArr) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(iArr, "pattern");
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length2) {
            int i13 = iArr[i11] + i12;
            sb2.append(charSequence, i12, i13);
            sb2.append(' ');
            i11++;
            i12 = i13;
        }
        sb2.append(charSequence, i12, length);
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: b */
    public final CharSequence m12319b(CharSequence charSequence) {
        Object m131364L;
        CharSequence m12318a;
        AbstractC19074t.m100208f(charSequence, "<this>");
        m131364L = AbstractC25358n.m131364L(f9865b, charSequence.length());
        int[] iArr = (int[]) m131364L;
        if (iArr != null && (m12318a = f9864a.m12318a(charSequence, iArr)) != null) {
            return m12318a;
        }
        return charSequence;
    }

    /* renamed from: c */
    public final CharSequence m12320c(CharSequence charSequence) {
        boolean m127138H0;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() == 12) {
            m127138H0 = AbstractC24342w.m127138H0(charSequence, "+84", false, 2, null);
            if (m127138H0) {
                return m12318a(charSequence, f9866c);
            }
        }
        return m12319b(charSequence);
    }
}
