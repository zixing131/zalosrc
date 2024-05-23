package au;

import ho0.AbstractC20110a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: au.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2338b0 {
    /* renamed from: a */
    public static Object m12294a(Object obj) {
        return m12295b(m12296c(obj));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0019: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:26), block:B:39:0x0019 */
    /* renamed from: b */
    public static Object m12295b(byte[] bArr) {
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                } catch (IOException e11) {
                    e = e11;
                    byteArrayInputStream = null;
                } catch (ClassNotFoundException e12) {
                    e = e12;
                    byteArrayInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream2.close();
                    } catch (Exception e13) {
                        AbstractC20110a.m104539h(e13);
                    }
                    throw th;
                }
                try {
                    Object readObject = new ObjectInputStream(byteArrayInputStream).readObject();
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception e14) {
                        AbstractC20110a.m104539h(e14);
                    }
                    return readObject;
                } catch (IOException e15) {
                    e = e15;
                    System.err.println(e);
                    byteArrayInputStream.close();
                    return null;
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    System.err.println(e);
                    byteArrayInputStream.close();
                    return null;
                }
            } catch (Exception e17) {
                AbstractC20110a.m104539h(e17);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
        }
    }

    /* renamed from: c */
    public static byte[] m12296c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr = null;
        bArr = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    throw th;
                }
                try {
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e13) {
                    e = e13;
                    System.err.println(e);
                    byteArrayOutputStream.close();
                    return bArr;
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
        }
    }
}
