package p473r5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC25654c {

    /* renamed from: a */
    private static final ClassLoader f122628a = AbstractC25654c.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m132543a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m132544b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
