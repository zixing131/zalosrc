package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: okio.c */
/* loaded from: classes7.dex */
public class C24293c implements Serializable, Comparable {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    final byte[] f117282p;

    /* renamed from: q */
    transient int f117283q;

    /* renamed from: r */
    transient String f117284r;

    /* renamed from: s */
    static final char[] f117280s = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: t */
    public static final C24293c f117281t = m126820i(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24293c(byte[] bArr) {
        this.f117282p = bArr;
    }

    /* renamed from: b */
    static int m126817b(String str, int i11) {
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            if (i13 == i11) {
                return i12;
            }
            int codePointAt = str.codePointAt(i12);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i13++;
            i12 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: d */
    public static C24293c m126818d(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    bArr[i11] = (byte) ((m126819e(str.charAt(i12)) << 4) + m126819e(str.charAt(i12 + 1)));
                }
                return m126820i(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    /* renamed from: e */
    private static int m126819e(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 >= 'A' && c11 <= 'F') {
            return c11 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c11);
    }

    /* renamed from: i */
    public static C24293c m126820i(byte... bArr) {
        if (bArr != null) {
            return new C24293c((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: m */
    public static C24293c m126821m(InputStream inputStream, int i11) {
        if (inputStream != null) {
            if (i11 >= 0) {
                byte[] bArr = new byte[i11];
                int i12 = 0;
                while (i12 < i11) {
                    int read = inputStream.read(bArr, i12, i11 - i12);
                    if (read != -1) {
                        i12 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C24293c(bArr);
            }
            throw new IllegalArgumentException("byteCount < 0: " + i11);
        }
        throw new IllegalArgumentException("in == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        C24293c m126821m = m126821m(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = C24293c.class.getDeclaredField("p");
            declaredField.setAccessible(true);
            declaredField.set(this, m126821m.f117282p);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f117282p.length);
        objectOutputStream.write(this.f117282p);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C24293c c24293c) {
        int mo126826q = mo126826q();
        int mo126826q2 = c24293c.mo126826q();
        int min = Math.min(mo126826q, mo126826q2);
        for (int i11 = 0; i11 < min; i11++) {
            int mo126823g = mo126823g(i11) & 255;
            int mo126823g2 = c24293c.mo126823g(i11) & 255;
            if (mo126823g != mo126823g2) {
                if (mo126823g < mo126823g2) {
                    return -1;
                }
                return 1;
            }
        }
        if (mo126826q == mo126826q2) {
            return 0;
        }
        if (mo126826q < mo126826q2) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24293c) {
            C24293c c24293c = (C24293c) obj;
            int mo126826q = c24293c.mo126826q();
            byte[] bArr = this.f117282p;
            if (mo126826q == bArr.length && c24293c.mo126825j(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public byte mo126823g(int i11) {
        return this.f117282p[i11];
    }

    /* renamed from: h */
    public String mo126824h() {
        byte[] bArr = this.f117282p;
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = f117280s;
            cArr[i11] = cArr2[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i11 = this.f117283q;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f117282p);
            this.f117283q = hashCode;
            return hashCode;
        }
        return i11;
    }

    /* renamed from: j */
    public boolean mo126825j(int i11, byte[] bArr, int i12, int i13) {
        if (i11 >= 0) {
            byte[] bArr2 = this.f117282p;
            if (i11 <= bArr2.length - i13 && i12 >= 0 && i12 <= bArr.length - i13 && AbstractC24297g.m126838a(bArr2, i11, bArr, i12, i13)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public int mo126826q() {
        return this.f117282p.length;
    }

    /* renamed from: r */
    public C24293c mo126827r(int i11, int i12) {
        if (i11 >= 0) {
            byte[] bArr = this.f117282p;
            if (i12 <= bArr.length) {
                int i13 = i12 - i11;
                if (i13 >= 0) {
                    if (i11 == 0 && i12 == bArr.length) {
                        return this;
                    }
                    byte[] bArr2 = new byte[i13];
                    System.arraycopy(bArr, i11, bArr2, 0, i13);
                    return new C24293c(bArr2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException("endIndex > length(" + this.f117282p.length + ")");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* renamed from: s */
    public String mo126828s() {
        String str = this.f117284r;
        if (str == null) {
            String str2 = new String(this.f117282p, AbstractC24297g.f117296a);
            this.f117284r = str2;
            return str2;
        }
        return str;
    }

    public String toString() {
        if (this.f117282p.length == 0) {
            return "[size=0]";
        }
        String mo126828s = mo126828s();
        int m126817b = m126817b(mo126828s, 64);
        if (m126817b == -1) {
            if (this.f117282p.length <= 64) {
                return "[hex=" + mo126824h() + "]";
            }
            return "[size=" + this.f117282p.length + " hex=" + mo126827r(0, 64).mo126824h() + "…]";
        }
        String replace = mo126828s.substring(0, m126817b).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m126817b < mo126828s.length()) {
            return "[size=" + this.f117282p.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }
}
