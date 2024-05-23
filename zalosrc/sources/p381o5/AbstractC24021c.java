package p381o5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC24021c {

    /* renamed from: a */
    private static final ClassLoader f116333a = AbstractC24021c.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m125897a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m125898b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m125899c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
