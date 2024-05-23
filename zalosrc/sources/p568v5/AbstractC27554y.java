package p568v5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v5.y */
/* loaded from: classes2.dex */
public abstract class AbstractC27554y {

    /* renamed from: a */
    private static final ClassLoader f129516a = AbstractC27554y.class.getClassLoader();

    /* renamed from: a */
    public static void m140764a(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    /* renamed from: b */
    public static Parcelable m140765b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m140766c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
