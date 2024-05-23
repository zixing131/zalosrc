package p633x5;

/* renamed from: x5.i */
/* loaded from: classes2.dex */
public abstract class AbstractC29348i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m146488a(int i11, int i12) {
        if (i12 >= 0) {
            int i13 = i11 + (i11 >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i12 - 1);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                return Integer.MAX_VALUE;
            }
            return i13;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
