package p705z5;

/* renamed from: z5.qc */
/* loaded from: classes.dex */
public abstract class AbstractC31532qc {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object[] m152340a(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException("at index " + i12);
            }
        }
        return objArr;
    }
}
