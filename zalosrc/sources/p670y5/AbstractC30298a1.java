package p670y5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y5.a1 */
/* loaded from: classes2.dex */
public abstract class AbstractC30298a1 {

    /* renamed from: a */
    private static final ClassLoader f140677a = AbstractC30298a1.class.getClassLoader();

    /* renamed from: a */
    public static void m149440a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m149441b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
