package k00;

import android.graphics.Bitmap;
import i00.C20180c;

/* renamed from: k00.c */
/* loaded from: classes4.dex */
public abstract class AbstractC21426c {
    /* renamed from: a */
    public static final boolean m110930a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() < 1 || bitmap.getHeight() < 1 || bitmap.getByteCount() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m110931b(int i11, int i12) {
        return i11 >= 2 && i12 >= 2;
    }

    /* renamed from: c */
    public static final boolean m110932c(C20180c c20180c) {
        if (c20180c == null || c20180c.m105275k() != 3 || c20180c.m105271g() != 3) {
            return false;
        }
        if (c20180c.m105268c(2, 2) != 1.0d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wrong type of a transform matrix, M[2][2] must be 1.0, currently M[2][2] = %s");
            sb2.append(c20180c.m105268c(2, 2));
            return false;
        }
        return true;
    }
}
