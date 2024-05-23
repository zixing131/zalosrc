package p291k7;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: k7.f1 */
/* loaded from: classes3.dex */
public abstract class AbstractC21503f1 {
    /* renamed from: a */
    public static long m111123a(ByteBuffer byteBuffer) {
        m111129g(byteBuffer);
        return m111127e(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: b */
    public static long m111124b(ByteBuffer byteBuffer) {
        m111129g(byteBuffer);
        return m111127e(byteBuffer, byteBuffer.position() + 12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Pair m111125c(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair m111128f = m111128f(randomAccessFile, 0);
        if (m111128f != null) {
            return m111128f;
        }
        return m111128f(randomAccessFile, 65535);
    }

    /* renamed from: d */
    public static void m111126d(ByteBuffer byteBuffer, long j11) {
        m111129g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j11 >= 0 && j11 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j11);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j11);
    }

    /* renamed from: e */
    private static long m111127e(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getInt(i11) & 4294967295L;
    }

    /* renamed from: f */
    private static Pair m111128f(RandomAccessFile randomAccessFile, int i11) {
        int i12;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i11, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m111129g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i13 = capacity2 - 22;
            int min = Math.min(i13, 65535);
            for (int i14 = 0; i14 < min; i14++) {
                i12 = i13 - i14;
                if (allocate.getInt(i12) == 101010256 && ((char) allocate.getShort(i12 + 20)) == i14) {
                    break;
                }
            }
        }
        i12 = -1;
        if (i12 == -1) {
            return null;
        }
        allocate.position(i12);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i12));
    }

    /* renamed from: g */
    private static void m111129g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
