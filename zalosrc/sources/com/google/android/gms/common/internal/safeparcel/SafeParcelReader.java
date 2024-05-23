package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SafeParcelReader {

    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static Double m19752A(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        if (m19763L == 0) {
            return null;
        }
        m19766O(parcel, i11, m19763L, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: B */
    public static float m19753B(Parcel parcel, int i11) {
        m19767P(parcel, i11, 4);
        return parcel.readFloat();
    }

    /* renamed from: C */
    public static Float m19754C(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        if (m19763L == 0) {
            return null;
        }
        m19766O(parcel, i11, m19763L, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: D */
    public static int m19755D(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: E */
    public static IBinder m19756E(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m19763L);
        return readStrongBinder;
    }

    /* renamed from: F */
    public static int m19757F(Parcel parcel, int i11) {
        m19767P(parcel, i11, 4);
        return parcel.readInt();
    }

    /* renamed from: G */
    public static Integer m19758G(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        if (m19763L == 0) {
            return null;
        }
        m19766O(parcel, i11, m19763L, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: H */
    public static void m19759H(Parcel parcel, int i11, List list, ClassLoader classLoader) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + m19763L);
    }

    /* renamed from: I */
    public static long m19760I(Parcel parcel, int i11) {
        m19767P(parcel, i11, 8);
        return parcel.readLong();
    }

    /* renamed from: J */
    public static Long m19761J(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        if (m19763L == 0) {
            return null;
        }
        m19766O(parcel, i11, m19763L, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: K */
    public static short m19762K(Parcel parcel, int i11) {
        m19767P(parcel, i11, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: L */
    public static int m19763L(Parcel parcel, int i11) {
        if ((i11 & (-65536)) != -65536) {
            return (char) (i11 >> 16);
        }
        return parcel.readInt();
    }

    /* renamed from: M */
    public static void m19764M(Parcel parcel, int i11) {
        parcel.setDataPosition(parcel.dataPosition() + m19763L(parcel, i11));
    }

    /* renamed from: N */
    public static int m19765N(Parcel parcel) {
        int m19755D = m19755D(parcel);
        int m19763L = m19763L(parcel, m19755D);
        int dataPosition = parcel.dataPosition();
        if (m19789v(m19755D) == 20293) {
            int i11 = m19763L + dataPosition;
            if (i11 >= dataPosition && i11 <= parcel.dataSize()) {
                return i11;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i11, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m19755D))), parcel);
    }

    /* renamed from: O */
    private static void m19766O(Parcel parcel, int i11, int i12, int i13) {
        if (i12 == i13) {
            return;
        }
        throw new ParseException("Expected size " + i13 + " got " + i12 + " (0x" + Integer.toHexString(i12) + ")", parcel);
    }

    /* renamed from: P */
    private static void m19767P(Parcel parcel, int i11, int i12) {
        int m19763L = m19763L(parcel, i11);
        if (m19763L == i12) {
            return;
        }
        throw new ParseException("Expected size " + i12 + " got " + m19763L + " (0x" + Integer.toHexString(m19763L) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m19768a(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m19763L);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m19769b(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i12] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m19763L);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m19770c(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m19771d(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m19763L);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m19772e(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m19773f(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m19763L);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m19774g(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createByteArray;
    }

    /* renamed from: h */
    public static double[] m19775h(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createDoubleArray;
    }

    /* renamed from: i */
    public static float[] m19776i(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createFloatArray;
    }

    /* renamed from: j */
    public static int[] m19777j(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createIntArray;
    }

    /* renamed from: k */
    public static ArrayList m19778k(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m19763L);
        return arrayList;
    }

    /* renamed from: l */
    public static long[] m19779l(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m19780m(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m19763L);
        parcel.setDataPosition(dataPosition + m19763L);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m19781n(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i12] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i12] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m19763L);
        return parcelArr;
    }

    /* renamed from: o */
    public static Parcelable m19782o(Parcel parcel, int i11, Parcelable.Creator creator) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m19763L);
        return parcelable;
    }

    /* renamed from: p */
    public static String m19783p(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m19763L);
        return readString;
    }

    /* renamed from: q */
    public static String[] m19784q(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m19763L);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList m19785r(Parcel parcel, int i11) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m19763L);
        return createStringArrayList;
    }

    /* renamed from: s */
    public static Object[] m19786s(Parcel parcel, int i11, Parcelable.Creator creator) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m19763L);
        return createTypedArray;
    }

    /* renamed from: t */
    public static ArrayList m19787t(Parcel parcel, int i11, Parcelable.Creator creator) {
        int m19763L = m19763L(parcel, i11);
        int dataPosition = parcel.dataPosition();
        if (m19763L == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m19763L);
        return createTypedArrayList;
    }

    /* renamed from: u */
    public static void m19788u(Parcel parcel, int i11) {
        if (parcel.dataPosition() == i11) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i11, parcel);
    }

    /* renamed from: v */
    public static int m19789v(int i11) {
        return (char) i11;
    }

    /* renamed from: w */
    public static boolean m19790w(Parcel parcel, int i11) {
        m19767P(parcel, i11, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static Boolean m19791x(Parcel parcel, int i11) {
        boolean z11;
        int m19763L = m19763L(parcel, i11);
        if (m19763L == 0) {
            return null;
        }
        m19766O(parcel, i11, m19763L, 4);
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* renamed from: y */
    public static byte m19792y(Parcel parcel, int i11) {
        m19767P(parcel, i11, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: z */
    public static double m19793z(Parcel parcel, int i11) {
        m19767P(parcel, i11, 8);
        return parcel.readDouble();
    }
}
