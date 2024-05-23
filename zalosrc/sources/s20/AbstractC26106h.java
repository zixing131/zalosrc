package s20;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25332a0;

/* renamed from: s20.h */
/* loaded from: classes5.dex */
public abstract class AbstractC26106h {
    /* renamed from: a */
    public static final ArrayList m134351a(Parcel parcel) {
        AbstractC19074t.m100208f(parcel, "<this>");
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            Serializable readSerializable = parcel.readSerializable();
            AbstractC19074t.m100206d(readSerializable, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) readSerializable;
            for (int i11 = 0; i11 < readInt; i11++) {
                Parcelable readParcelable = parcel.readParcelable(cls.getClassLoader());
                AbstractC19074t.m100205c(readParcelable);
                arrayList.add(readParcelable);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final Parcelable m134352b(Parcel parcel) {
        Class cls;
        AbstractC19074t.m100208f(parcel, "<this>");
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof Class) {
            cls = (Class) readSerializable;
        } else {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        return parcel.readParcelable(cls.getClassLoader());
    }

    /* renamed from: c */
    public static final void m134353c(Parcel parcel, List list, int i11) {
        Object m131205e0;
        AbstractC19074t.m100208f(parcel, "<this>");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            parcel.writeInt(list.size());
            m131205e0 = AbstractC25332a0.m131205e0(list);
            parcel.writeSerializable(m131205e0.getClass());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i11);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: d */
    public static final void m134354d(Parcel parcel, Parcelable parcelable, int i11) {
        AbstractC19074t.m100208f(parcel, "<this>");
        if (parcelable == null) {
            parcel.writeSerializable(null);
        } else {
            parcel.writeSerializable(parcelable.getClass());
            parcel.writeParcelable(parcelable, i11);
        }
    }
}
