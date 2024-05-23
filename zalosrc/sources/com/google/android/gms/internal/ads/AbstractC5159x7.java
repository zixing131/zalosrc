package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.x7 */
/* loaded from: classes2.dex */
public abstract class AbstractC5159x7 {
    /* renamed from: a */
    public static long m27855a(ByteBuffer byteBuffer) {
        m27861g(byteBuffer);
        return m27859e(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: b */
    public static long m27856b(ByteBuffer byteBuffer) {
        m27861g(byteBuffer);
        return m27859e(byteBuffer, byteBuffer.position() + 12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Pair m27857c(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair m27860f = m27860f(randomAccessFile, 0);
        if (m27860f != null) {
            return m27860f;
        }
        return m27860f(randomAccessFile, 65535);
    }

    /* renamed from: d */
    public static void m27858d(ByteBuffer byteBuffer, long j11) {
        m27861g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j11 >= 0 && j11 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j11);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j11);
    }

    /* renamed from: e */
    private static long m27859e(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getInt(i11) & 4294967295L;
    }

    /* renamed from: f */
    private static Pair m27860f(RandomAccessFile randomAccessFile, int i11) {
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
        m27861g(allocate);
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
    private static void m27861g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
