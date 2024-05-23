package za;

/* renamed from: za.a */
/* loaded from: classes3.dex */
public abstract class AbstractC31728a extends AbstractC31740m {

    /* renamed from: a */
    static final char[] f145789a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f145790b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f145791c = {'A', 'B', 'C', 'D'};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m152686a(char[] cArr, char c11) {
        if (cArr != null) {
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }
}
