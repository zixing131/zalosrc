package me0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: me0.l5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23132l5 {
    /* renamed from: a */
    public static byte[] m118633a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: b */
    public static Parcel m118634b(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: c */
    public static Object m118635c(byte[] bArr, Parcelable.Creator creator) {
        return creator.createFromParcel(m118634b(bArr));
    }
}
