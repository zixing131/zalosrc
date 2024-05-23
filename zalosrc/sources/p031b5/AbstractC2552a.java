package p031b5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: b5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2552a {
    /* renamed from: A */
    public static void m12907A(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
                return;
            }
            return;
        }
        int m12908B = m12908B(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcelable parcelable = (Parcelable) list.get(i12);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m12911E(parcel, parcelable, 0);
            }
        }
        m12909C(parcel, m12908B);
    }

    /* renamed from: B */
    private static int m12908B(Parcel parcel, int i11) {
        parcel.writeInt(i11 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: C */
    private static void m12909C(Parcel parcel, int i11) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i11 - 4);
        parcel.writeInt(dataPosition - i11);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: D */
    private static void m12910D(Parcel parcel, int i11, int i12) {
        parcel.writeInt(i11 | (i12 << 16));
    }

    /* renamed from: E */
    private static void m12911E(Parcel parcel, Parcelable parcelable, int i11) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i11);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m12912a(Parcel parcel) {
        return m12908B(parcel, 20293);
    }

    /* renamed from: b */
    public static void m12913b(Parcel parcel, int i11) {
        m12909C(parcel, i11);
    }

    /* renamed from: c */
    public static void m12914c(Parcel parcel, int i11, boolean z11) {
        m12910D(parcel, i11, 4);
        parcel.writeInt(z11 ? 1 : 0);
    }

    /* renamed from: d */
    public static void m12915d(Parcel parcel, int i11, Boolean bool, boolean z11) {
        if (bool == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            m12910D(parcel, i11, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: e */
    public static void m12916e(Parcel parcel, int i11, Bundle bundle, boolean z11) {
        if (bundle == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeBundle(bundle);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: f */
    public static void m12917f(Parcel parcel, int i11, byte b11) {
        m12910D(parcel, i11, 4);
        parcel.writeInt(b11);
    }

    /* renamed from: g */
    public static void m12918g(Parcel parcel, int i11, byte[] bArr, boolean z11) {
        if (bArr == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeByteArray(bArr);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: h */
    public static void m12919h(Parcel parcel, int i11, double d11) {
        m12910D(parcel, i11, 8);
        parcel.writeDouble(d11);
    }

    /* renamed from: i */
    public static void m12920i(Parcel parcel, int i11, Double d11, boolean z11) {
        if (d11 == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            m12910D(parcel, i11, 8);
            parcel.writeDouble(d11.doubleValue());
        }
    }

    /* renamed from: j */
    public static void m12921j(Parcel parcel, int i11, float f11) {
        m12910D(parcel, i11, 4);
        parcel.writeFloat(f11);
    }

    /* renamed from: k */
    public static void m12922k(Parcel parcel, int i11, Float f11, boolean z11) {
        if (f11 == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            m12910D(parcel, i11, 4);
            parcel.writeFloat(f11.floatValue());
        }
    }

    /* renamed from: l */
    public static void m12923l(Parcel parcel, int i11, IBinder iBinder, boolean z11) {
        if (iBinder == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeStrongBinder(iBinder);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: m */
    public static void m12924m(Parcel parcel, int i11, int i12) {
        m12910D(parcel, i11, 4);
        parcel.writeInt(i12);
    }

    /* renamed from: n */
    public static void m12925n(Parcel parcel, int i11, int[] iArr, boolean z11) {
        if (iArr == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeIntArray(iArr);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: o */
    public static void m12926o(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
                return;
            }
            return;
        }
        int m12908B = m12908B(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(((Integer) list.get(i12)).intValue());
        }
        m12909C(parcel, m12908B);
    }

    /* renamed from: p */
    public static void m12927p(Parcel parcel, int i11, Integer num, boolean z11) {
        if (num == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            m12910D(parcel, i11, 4);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: q */
    public static void m12928q(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeList(list);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: r */
    public static void m12929r(Parcel parcel, int i11, long j11) {
        m12910D(parcel, i11, 8);
        parcel.writeLong(j11);
    }

    /* renamed from: s */
    public static void m12930s(Parcel parcel, int i11, Long l11, boolean z11) {
        if (l11 == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            m12910D(parcel, i11, 8);
            parcel.writeLong(l11.longValue());
        }
    }

    /* renamed from: t */
    public static void m12931t(Parcel parcel, int i11, Parcel parcel2, boolean z11) {
        if (parcel2 == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: u */
    public static void m12932u(Parcel parcel, int i11, Parcelable parcelable, int i12, boolean z11) {
        if (parcelable == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcelable.writeToParcel(parcel, i12);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: v */
    public static void m12933v(Parcel parcel, int i11, short s7) {
        m12910D(parcel, i11, 4);
        parcel.writeInt(s7);
    }

    /* renamed from: w */
    public static void m12934w(Parcel parcel, int i11, String str, boolean z11) {
        if (str == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeString(str);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: x */
    public static void m12935x(Parcel parcel, int i11, String[] strArr, boolean z11) {
        if (strArr == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeStringArray(strArr);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: y */
    public static void m12936y(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
            }
        } else {
            int m12908B = m12908B(parcel, i11);
            parcel.writeStringList(list);
            m12909C(parcel, m12908B);
        }
    }

    /* renamed from: z */
    public static void m12937z(Parcel parcel, int i11, Parcelable[] parcelableArr, int i12, boolean z11) {
        if (parcelableArr == null) {
            if (z11) {
                m12910D(parcel, i11, 0);
                return;
            }
            return;
        }
        int m12908B = m12908B(parcel, i11);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m12911E(parcel, parcelable, i12);
            }
        }
        m12909C(parcel, m12908B);
    }
}
