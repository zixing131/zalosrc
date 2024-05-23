package za;

import com.google.zxing.FormatException;

/* renamed from: za.p */
/* loaded from: classes3.dex */
public abstract class AbstractC31743p extends AbstractC31740m {

    /* renamed from: a */
    static final int[] f145812a = {1, 1, 1};

    /* renamed from: b */
    static final int[] f145813b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    static final int[] f145814c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    static final int[][] f145815d;

    /* renamed from: e */
    static final int[][] f145816e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f145815d = iArr;
        int[][] iArr2 = new int[20];
        f145816e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f145815d[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f145816e[i11] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m152699a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i11 = length - 1;
        if (m152700b(charSequence.subSequence(0, i11)) != Character.digit(charSequence.charAt(i11), 10)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m152700b(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int charAt = charSequence.charAt(i12) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i11 += charAt;
            } else {
                throw FormatException.m35250a();
            }
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int charAt2 = charSequence.charAt(i14) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i13 += charAt2;
            } else {
                throw FormatException.m35250a();
            }
        }
        return (1000 - i13) % 10;
    }
}
