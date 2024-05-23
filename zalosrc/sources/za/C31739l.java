package za;

import com.google.zxing.EnumC6846a;
import java.util.Map;
import va.C27954b;

/* renamed from: za.l */
/* loaded from: classes3.dex */
public final class C31739l extends AbstractC31741n {

    /* renamed from: b */
    private static final int[] f145807b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f145808c = {3, 1, 1};

    /* renamed from: d */
    private static final int[][] f145809d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.ITF) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                AbstractC31741n.m152696c(str);
                boolean[] zArr = new boolean[(length * 9) + 9];
                int m152695b = AbstractC31741n.m152695b(zArr, 0, f145807b, true);
                for (int i11 = 0; i11 < length; i11 += 2) {
                    int digit = Character.digit(str.charAt(i11), 10);
                    int digit2 = Character.digit(str.charAt(i11 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i12 = 0; i12 < 5; i12++) {
                        int i13 = i12 * 2;
                        int[][] iArr2 = f145809d;
                        iArr[i13] = iArr2[digit][i12];
                        iArr[i13 + 1] = iArr2[digit2][i12];
                    }
                    m152695b += AbstractC31741n.m152695b(zArr, m152695b, iArr, true);
                }
                AbstractC31741n.m152695b(zArr, m152695b, f145808c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
