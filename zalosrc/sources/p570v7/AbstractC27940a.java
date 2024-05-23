package p570v7;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import p358n7.AbstractC23600d;
import p600w7.AbstractC28790a;

/* renamed from: v7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC27940a {

    /* renamed from: a */
    private static final OutputStream f130248a = new a();

    /* renamed from: v7.a$a */
    /* loaded from: classes3.dex */
    static class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            AbstractC23600d.m123736g(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            AbstractC23600d.m123736g(bArr);
        }
    }

    /* renamed from: a */
    private static byte[] m140793a(Deque deque, int i11) {
        byte[] bArr = new byte[i11];
        int i12 = i11;
        while (i12 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i12, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i11 - i12, min);
            i12 -= min;
        }
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m140794b(InputStream inputStream) {
        AbstractC23600d.m123736g(inputStream);
        return m140795c(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: c */
    private static byte[] m140795c(InputStream inputStream, Deque deque, int i11) {
        int i12 = 8192;
        while (i11 < 2147483639) {
            int min = Math.min(i12, 2147483639 - i11);
            byte[] bArr = new byte[min];
            deque.add(bArr);
            int i13 = 0;
            while (i13 < min) {
                int read = inputStream.read(bArr, i13, min - i13);
                if (read == -1) {
                    return m140793a(deque, i11);
                }
                i13 += read;
                i11 += read;
            }
            i12 = AbstractC28790a.m144036a(i12, 2);
        }
        if (inputStream.read() == -1) {
            return m140793a(deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
