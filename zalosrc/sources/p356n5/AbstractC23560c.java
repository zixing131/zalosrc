package p356n5;

import android.os.Parcel;

/* renamed from: n5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC23560c {

    /* renamed from: a */
    private static final ClassLoader f114364a = AbstractC23560c.class.getClassLoader();

    /* renamed from: a */
    public static void m123627a(Parcel parcel, boolean z11) {
        parcel.writeInt(1);
    }

    /* renamed from: b */
    public static boolean m123628b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
