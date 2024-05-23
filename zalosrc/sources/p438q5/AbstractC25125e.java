package p438q5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC25125e {

    /* renamed from: a */
    private static final ClassLoader f120653a = AbstractC25125e.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m130219a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m130220b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static void m130221c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
