package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.profileinstaller.p */
/* loaded from: classes2.dex */
public abstract class AbstractC1860p {

    /* renamed from: a */
    static final byte[] f7602a = {112, 114, 111, 0};

    /* renamed from: b */
    static final byte[] f7603b = {112, 114, 109, 0};

    /* renamed from: A */
    private static void m9583A(InputStream inputStream) {
        AbstractC1850f.m9557h(inputStream);
        int m9559j = AbstractC1850f.m9559j(inputStream);
        if (m9559j == 6 || m9559j == 7) {
            return;
        }
        while (m9559j > 0) {
            AbstractC1850f.m9559j(inputStream);
            for (int m9559j2 = AbstractC1850f.m9559j(inputStream); m9559j2 > 0; m9559j2--) {
                AbstractC1850f.m9557h(inputStream);
            }
            m9559j--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m9584B(OutputStream outputStream, byte[] bArr, C1849e[] c1849eArr) {
        if (Arrays.equals(bArr, AbstractC1862r.f7614a)) {
            m9596N(outputStream, c1849eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1862r.f7615b)) {
            m9595M(outputStream, c1849eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1862r.f7617d)) {
            m9593K(outputStream, c1849eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1862r.f7616c)) {
            m9594L(outputStream, c1849eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1862r.f7618e)) {
            m9592J(outputStream, c1849eArr);
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private static void m9585C(OutputStream outputStream, C1849e c1849e) {
        int i11 = 0;
        for (int i12 : c1849e.f7583h) {
            Integer valueOf = Integer.valueOf(i12);
            AbstractC1850f.m9565p(outputStream, valueOf.intValue() - i11);
            i11 = valueOf.intValue();
        }
    }

    /* renamed from: D */
    private static C1863s m9586D(C1849e[] c1849eArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC1850f.m9565p(byteArrayOutputStream, c1849eArr.length);
            int i11 = 2;
            for (C1849e c1849e : c1849eArr) {
                AbstractC1850f.m9566q(byteArrayOutputStream, c1849e.f7578c);
                AbstractC1850f.m9566q(byteArrayOutputStream, c1849e.f7579d);
                AbstractC1850f.m9566q(byteArrayOutputStream, c1849e.f7582g);
                String m9607j = m9607j(c1849e.f7576a, c1849e.f7577b, AbstractC1862r.f7614a);
                int m9560k = AbstractC1850f.m9560k(m9607j);
                AbstractC1850f.m9565p(byteArrayOutputStream, m9560k);
                i11 = i11 + 14 + m9560k;
                AbstractC1850f.m9563n(byteArrayOutputStream, m9607j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i11 == byteArray.length) {
                C1863s c1863s = new C1863s(EnumC1851g.DEX_FILES, i11, byteArray, false);
                byteArrayOutputStream.close();
                return c1863s;
            }
            throw AbstractC1850f.m9552c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static void m9587E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f7602a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    private static void m9588F(OutputStream outputStream, C1849e c1849e) {
        m9591I(outputStream, c1849e);
        m9585C(outputStream, c1849e);
        m9590H(outputStream, c1849e);
    }

    /* renamed from: G */
    private static void m9589G(OutputStream outputStream, C1849e c1849e, String str) {
        AbstractC1850f.m9565p(outputStream, AbstractC1850f.m9560k(str));
        AbstractC1850f.m9565p(outputStream, c1849e.f7580e);
        AbstractC1850f.m9566q(outputStream, c1849e.f7581f);
        AbstractC1850f.m9566q(outputStream, c1849e.f7578c);
        AbstractC1850f.m9566q(outputStream, c1849e.f7582g);
        AbstractC1850f.m9563n(outputStream, str);
    }

    /* renamed from: H */
    private static void m9590H(OutputStream outputStream, C1849e c1849e) {
        byte[] bArr = new byte[m9608k(c1849e.f7582g)];
        for (Map.Entry entry : c1849e.f7584i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m9623z(bArr, 2, intValue, c1849e);
            }
            if ((intValue2 & 4) != 0) {
                m9623z(bArr, 4, intValue, c1849e);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    private static void m9591I(OutputStream outputStream, C1849e c1849e) {
        int i11 = 0;
        for (Map.Entry entry : c1849e.f7584i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC1850f.m9565p(outputStream, intValue - i11);
                AbstractC1850f.m9565p(outputStream, 0);
                i11 = intValue;
            }
        }
    }

    /* renamed from: J */
    private static void m9592J(OutputStream outputStream, C1849e[] c1849eArr) {
        AbstractC1850f.m9565p(outputStream, c1849eArr.length);
        for (C1849e c1849e : c1849eArr) {
            String m9607j = m9607j(c1849e.f7576a, c1849e.f7577b, AbstractC1862r.f7618e);
            AbstractC1850f.m9565p(outputStream, AbstractC1850f.m9560k(m9607j));
            AbstractC1850f.m9565p(outputStream, c1849e.f7584i.size());
            AbstractC1850f.m9565p(outputStream, c1849e.f7583h.length);
            AbstractC1850f.m9566q(outputStream, c1849e.f7578c);
            AbstractC1850f.m9563n(outputStream, m9607j);
            Iterator it = c1849e.f7584i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC1850f.m9565p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i11 : c1849e.f7583h) {
                AbstractC1850f.m9565p(outputStream, i11);
            }
        }
    }

    /* renamed from: K */
    private static void m9593K(OutputStream outputStream, C1849e[] c1849eArr) {
        AbstractC1850f.m9567r(outputStream, c1849eArr.length);
        for (C1849e c1849e : c1849eArr) {
            int size = c1849e.f7584i.size() * 4;
            String m9607j = m9607j(c1849e.f7576a, c1849e.f7577b, AbstractC1862r.f7617d);
            AbstractC1850f.m9565p(outputStream, AbstractC1850f.m9560k(m9607j));
            AbstractC1850f.m9565p(outputStream, c1849e.f7583h.length);
            AbstractC1850f.m9566q(outputStream, size);
            AbstractC1850f.m9566q(outputStream, c1849e.f7578c);
            AbstractC1850f.m9563n(outputStream, m9607j);
            Iterator it = c1849e.f7584i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC1850f.m9565p(outputStream, ((Integer) it.next()).intValue());
                AbstractC1850f.m9565p(outputStream, 0);
            }
            for (int i11 : c1849e.f7583h) {
                AbstractC1850f.m9565p(outputStream, i11);
            }
        }
    }

    /* renamed from: L */
    private static void m9594L(OutputStream outputStream, C1849e[] c1849eArr) {
        byte[] m9599b = m9599b(c1849eArr, AbstractC1862r.f7616c);
        AbstractC1850f.m9567r(outputStream, c1849eArr.length);
        AbstractC1850f.m9562m(outputStream, m9599b);
    }

    /* renamed from: M */
    private static void m9595M(OutputStream outputStream, C1849e[] c1849eArr) {
        byte[] m9599b = m9599b(c1849eArr, AbstractC1862r.f7615b);
        AbstractC1850f.m9567r(outputStream, c1849eArr.length);
        AbstractC1850f.m9562m(outputStream, m9599b);
    }

    /* renamed from: N */
    private static void m9596N(OutputStream outputStream, C1849e[] c1849eArr) {
        m9597O(outputStream, c1849eArr);
    }

    /* renamed from: O */
    private static void m9597O(OutputStream outputStream, C1849e[] c1849eArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m9586D(c1849eArr));
        arrayList.add(m9600c(c1849eArr));
        arrayList.add(m9601d(c1849eArr));
        long length2 = AbstractC1862r.f7614a.length + f7602a.length + 4 + (arrayList.size() * 16);
        AbstractC1850f.m9566q(outputStream, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C1863s c1863s = (C1863s) arrayList.get(i11);
            AbstractC1850f.m9566q(outputStream, c1863s.f7621a.m9569c());
            AbstractC1850f.m9566q(outputStream, length2);
            if (c1863s.f7624d) {
                byte[] bArr = c1863s.f7623c;
                long length3 = bArr.length;
                byte[] m9551b = AbstractC1850f.m9551b(bArr);
                arrayList2.add(m9551b);
                AbstractC1850f.m9566q(outputStream, m9551b.length);
                AbstractC1850f.m9566q(outputStream, length3);
                length = m9551b.length;
            } else {
                arrayList2.add(c1863s.f7623c);
                AbstractC1850f.m9566q(outputStream, c1863s.f7623c.length);
                AbstractC1850f.m9566q(outputStream, 0L);
                length = c1863s.f7623c.length;
            }
            length2 += length;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            outputStream.write((byte[]) arrayList2.get(i12));
        }
    }

    /* renamed from: a */
    private static int m9598a(C1849e c1849e) {
        Iterator it = c1849e.f7584i.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i11;
    }

    /* renamed from: b */
    private static byte[] m9599b(C1849e[] c1849eArr, byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        for (C1849e c1849e : c1849eArr) {
            i12 += AbstractC1850f.m9560k(m9607j(c1849e.f7576a, c1849e.f7577b, bArr)) + 16 + (c1849e.f7580e * 2) + c1849e.f7581f + m9608k(c1849e.f7582g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        if (Arrays.equals(bArr, AbstractC1862r.f7616c)) {
            int length = c1849eArr.length;
            while (i11 < length) {
                C1849e c1849e2 = c1849eArr[i11];
                m9589G(byteArrayOutputStream, c1849e2, m9607j(c1849e2.f7576a, c1849e2.f7577b, bArr));
                m9588F(byteArrayOutputStream, c1849e2);
                i11++;
            }
        } else {
            for (C1849e c1849e3 : c1849eArr) {
                m9589G(byteArrayOutputStream, c1849e3, m9607j(c1849e3.f7576a, c1849e3.f7577b, bArr));
            }
            int length2 = c1849eArr.length;
            while (i11 < length2) {
                m9588F(byteArrayOutputStream, c1849eArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == i12) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC1850f.m9552c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i12);
    }

    /* renamed from: c */
    private static C1863s m9600c(C1849e[] c1849eArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < c1849eArr.length; i12++) {
            try {
                C1849e c1849e = c1849eArr[i12];
                AbstractC1850f.m9565p(byteArrayOutputStream, i12);
                AbstractC1850f.m9565p(byteArrayOutputStream, c1849e.f7580e);
                i11 = i11 + 4 + (c1849e.f7580e * 2);
                m9585C(byteArrayOutputStream, c1849e);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            C1863s c1863s = new C1863s(EnumC1851g.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return c1863s;
        }
        throw AbstractC1850f.m9552c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    private static C1863s m9601d(C1849e[] c1849eArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < c1849eArr.length; i12++) {
            try {
                C1849e c1849e = c1849eArr[i12];
                int m9598a = m9598a(c1849e);
                byte[] m9602e = m9602e(c1849e);
                byte[] m9603f = m9603f(c1849e);
                AbstractC1850f.m9565p(byteArrayOutputStream, i12);
                int length = m9602e.length + 2 + m9603f.length;
                AbstractC1850f.m9566q(byteArrayOutputStream, length);
                AbstractC1850f.m9565p(byteArrayOutputStream, m9598a);
                byteArrayOutputStream.write(m9602e);
                byteArrayOutputStream.write(m9603f);
                i11 = i11 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            C1863s c1863s = new C1863s(EnumC1851g.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return c1863s;
        }
        throw AbstractC1850f.m9552c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    private static byte[] m9602e(C1849e c1849e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m9590H(byteArrayOutputStream, c1849e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: f */
    private static byte[] m9603f(C1849e c1849e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m9591I(byteArrayOutputStream, c1849e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: g */
    private static String m9604g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    /* renamed from: h */
    private static String m9605h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: i */
    private static C1849e m9606i(C1849e[] c1849eArr, String str) {
        if (c1849eArr.length <= 0) {
            return null;
        }
        String m9605h = m9605h(str);
        for (int i11 = 0; i11 < c1849eArr.length; i11++) {
            if (c1849eArr[i11].f7577b.equals(m9605h)) {
                return c1849eArr[i11];
            }
        }
        return null;
    }

    /* renamed from: j */
    private static String m9607j(String str, String str2, byte[] bArr) {
        String m9630a = AbstractC1862r.m9630a(bArr);
        if (str.length() <= 0) {
            return m9604g(str2, m9630a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + AbstractC1862r.m9630a(bArr) + str2;
        }
        return m9604g(str2, m9630a);
    }

    /* renamed from: k */
    private static int m9608k(int i11) {
        return m9622y(i11 * 2) / 8;
    }

    /* renamed from: l */
    private static int m9609l(int i11, int i12, int i13) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 4) {
                    return i12 + i13;
                }
                throw AbstractC1850f.m9552c("Unexpected flag: " + i11);
            }
            return i12;
        }
        throw AbstractC1850f.m9552c("HOT methods are not stored in the bitmap");
    }

    /* renamed from: m */
    private static int[] m9610m(InputStream inputStream, int i11) {
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += AbstractC1850f.m9557h(inputStream);
            iArr[i13] = i12;
        }
        return iArr;
    }

    /* renamed from: n */
    private static int m9611n(BitSet bitSet, int i11, int i12) {
        int i13 = 2;
        if (!bitSet.get(m9609l(2, i11, i12))) {
            i13 = 0;
        }
        if (bitSet.get(m9609l(4, i11, i12))) {
            return i13 | 4;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static byte[] m9612o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC1850f.m9553d(inputStream, bArr.length))) {
            return AbstractC1850f.m9553d(inputStream, AbstractC1862r.f7615b.length);
        }
        throw AbstractC1850f.m9552c("Invalid magic");
    }

    /* renamed from: p */
    private static void m9613p(InputStream inputStream, C1849e c1849e) {
        int available = inputStream.available() - c1849e.f7581f;
        int i11 = 0;
        while (inputStream.available() > available) {
            i11 += AbstractC1850f.m9557h(inputStream);
            c1849e.f7584i.put(Integer.valueOf(i11), 1);
            for (int m9557h = AbstractC1850f.m9557h(inputStream); m9557h > 0; m9557h--) {
                m9583A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw AbstractC1850f.m9552c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static C1849e[] m9614q(InputStream inputStream, byte[] bArr, byte[] bArr2, C1849e[] c1849eArr) {
        if (Arrays.equals(bArr, AbstractC1862r.f7619f)) {
            if (!Arrays.equals(AbstractC1862r.f7614a, bArr2)) {
                return m9615r(inputStream, bArr, c1849eArr);
            }
            throw AbstractC1850f.m9552c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, AbstractC1862r.f7620g)) {
            return m9617t(inputStream, bArr2, c1849eArr);
        }
        throw AbstractC1850f.m9552c("Unsupported meta version");
    }

    /* renamed from: r */
    static C1849e[] m9615r(InputStream inputStream, byte[] bArr, C1849e[] c1849eArr) {
        if (Arrays.equals(bArr, AbstractC1862r.f7619f)) {
            int m9559j = AbstractC1850f.m9559j(inputStream);
            byte[] m9554e = AbstractC1850f.m9554e(inputStream, (int) AbstractC1850f.m9558i(inputStream), (int) AbstractC1850f.m9558i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m9554e);
                try {
                    C1849e[] m9616s = m9616s(byteArrayInputStream, m9559j, c1849eArr);
                    byteArrayInputStream.close();
                    return m9616s;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw AbstractC1850f.m9552c("Content found after the end of file");
        }
        throw AbstractC1850f.m9552c("Unsupported meta version");
    }

    /* renamed from: s */
    private static C1849e[] m9616s(InputStream inputStream, int i11, C1849e[] c1849eArr) {
        if (inputStream.available() == 0) {
            return new C1849e[0];
        }
        if (i11 == c1849eArr.length) {
            String[] strArr = new String[i11];
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int m9557h = AbstractC1850f.m9557h(inputStream);
                iArr[i12] = AbstractC1850f.m9557h(inputStream);
                strArr[i12] = AbstractC1850f.m9555f(inputStream, m9557h);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                C1849e c1849e = c1849eArr[i13];
                if (c1849e.f7577b.equals(strArr[i13])) {
                    int i14 = iArr[i13];
                    c1849e.f7580e = i14;
                    c1849e.f7583h = m9610m(inputStream, i14);
                } else {
                    throw AbstractC1850f.m9552c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c1849eArr;
        }
        throw AbstractC1850f.m9552c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: t */
    static C1849e[] m9617t(InputStream inputStream, byte[] bArr, C1849e[] c1849eArr) {
        int m9557h = AbstractC1850f.m9557h(inputStream);
        byte[] m9554e = AbstractC1850f.m9554e(inputStream, (int) AbstractC1850f.m9558i(inputStream), (int) AbstractC1850f.m9558i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m9554e);
            try {
                C1849e[] m9618u = m9618u(byteArrayInputStream, bArr, m9557h, c1849eArr);
                byteArrayInputStream.close();
                return m9618u;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw AbstractC1850f.m9552c("Content found after the end of file");
    }

    /* renamed from: u */
    private static C1849e[] m9618u(InputStream inputStream, byte[] bArr, int i11, C1849e[] c1849eArr) {
        if (inputStream.available() == 0) {
            return new C1849e[0];
        }
        if (i11 == c1849eArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                AbstractC1850f.m9557h(inputStream);
                String m9555f = AbstractC1850f.m9555f(inputStream, AbstractC1850f.m9557h(inputStream));
                long m9558i = AbstractC1850f.m9558i(inputStream);
                int m9557h = AbstractC1850f.m9557h(inputStream);
                C1849e m9606i = m9606i(c1849eArr, m9555f);
                if (m9606i != null) {
                    m9606i.f7579d = m9558i;
                    int[] m9610m = m9610m(inputStream, m9557h);
                    if (Arrays.equals(bArr, AbstractC1862r.f7618e)) {
                        m9606i.f7580e = m9557h;
                        m9606i.f7583h = m9610m;
                    }
                } else {
                    throw AbstractC1850f.m9552c("Missing profile key: " + m9555f);
                }
            }
            return c1849eArr;
        }
        throw AbstractC1850f.m9552c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    private static void m9619v(InputStream inputStream, C1849e c1849e) {
        BitSet valueOf = BitSet.valueOf(AbstractC1850f.m9553d(inputStream, AbstractC1850f.m9550a(c1849e.f7582g * 2)));
        int i11 = 0;
        while (true) {
            int i12 = c1849e.f7582g;
            if (i11 < i12) {
                int m9611n = m9611n(valueOf, i11, i12);
                if (m9611n != 0) {
                    Integer num = (Integer) c1849e.f7584i.get(Integer.valueOf(i11));
                    if (num == null) {
                        num = 0;
                    }
                    c1849e.f7584i.put(Integer.valueOf(i11), Integer.valueOf(m9611n | num.intValue()));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static C1849e[] m9620w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, AbstractC1862r.f7615b)) {
            int m9559j = AbstractC1850f.m9559j(inputStream);
            byte[] m9554e = AbstractC1850f.m9554e(inputStream, (int) AbstractC1850f.m9558i(inputStream), (int) AbstractC1850f.m9558i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m9554e);
                try {
                    C1849e[] m9621x = m9621x(byteArrayInputStream, str, m9559j);
                    byteArrayInputStream.close();
                    return m9621x;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw AbstractC1850f.m9552c("Content found after the end of file");
        }
        throw AbstractC1850f.m9552c("Unsupported version");
    }

    /* renamed from: x */
    private static C1849e[] m9621x(InputStream inputStream, String str, int i11) {
        if (inputStream.available() == 0) {
            return new C1849e[0];
        }
        C1849e[] c1849eArr = new C1849e[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int m9557h = AbstractC1850f.m9557h(inputStream);
            int m9557h2 = AbstractC1850f.m9557h(inputStream);
            long m9558i = AbstractC1850f.m9558i(inputStream);
            c1849eArr[i12] = new C1849e(str, AbstractC1850f.m9555f(inputStream, m9557h), AbstractC1850f.m9558i(inputStream), 0L, m9557h2, (int) m9558i, (int) AbstractC1850f.m9558i(inputStream), new int[m9557h2], new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            C1849e c1849e = c1849eArr[i13];
            m9613p(inputStream, c1849e);
            c1849e.f7583h = m9610m(inputStream, c1849e.f7580e);
            m9619v(inputStream, c1849e);
        }
        return c1849eArr;
    }

    /* renamed from: y */
    private static int m9622y(int i11) {
        return (i11 + 7) & (-8);
    }

    /* renamed from: z */
    private static void m9623z(byte[] bArr, int i11, int i12, C1849e c1849e) {
        int m9609l = m9609l(i11, i12, c1849e.f7582g);
        int i13 = m9609l / 8;
        bArr[i13] = (byte) ((1 << (m9609l % 8)) | bArr[i13]);
    }
}
