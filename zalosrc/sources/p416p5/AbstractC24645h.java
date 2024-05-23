package p416p5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC24645h {

    /* renamed from: a */
    private static final ClassLoader f118571a = AbstractC24645h.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m128184a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m128185b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
