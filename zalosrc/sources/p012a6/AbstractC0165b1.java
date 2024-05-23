package p012a6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a6.b1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0165b1 {

    /* renamed from: a */
    private static final ClassLoader f777a = AbstractC0165b1.class.getClassLoader();

    /* renamed from: a */
    public static void m622a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m623b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
