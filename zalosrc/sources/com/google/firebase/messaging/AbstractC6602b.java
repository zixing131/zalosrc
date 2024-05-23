package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes3.dex */
abstract class AbstractC6602b {

    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes3.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: p */
        private long f36622p;

        /* renamed from: q */
        private long f36623q;

        a(InputStream inputStream, long j11) {
            super(inputStream);
            this.f36623q = -1L;
            this.f36622p = j11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f36622p);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.f36623q = this.f36622p;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f36622p == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f36622p--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f36623q != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f36622p = this.f36623q;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j11) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f36622p));
            this.f36622p -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            long j11 = this.f36622p;
            if (j11 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
            if (read != -1) {
                this.f36622p -= read;
            }
            return read;
        }
    }

    /* renamed from: a */
    private static byte[] m33773a(Queue queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i11) {
            return bArr;
        }
        int length = i11 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i11 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m33774b(InputStream inputStream, long j11) {
        return new a(inputStream, j11);
    }

    /* renamed from: c */
    private static int m33775c(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    /* renamed from: d */
    public static byte[] m33776d(InputStream inputStream) {
        return m33777e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m33777e(InputStream inputStream, Queue queue, int i11) {
        int i12;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i11) * 2));
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i13 = 0;
            while (i13 < min2) {
                int read = inputStream.read(bArr, i13, min2 - i13);
                if (read == -1) {
                    return m33773a(queue, i11);
                }
                i13 += read;
                i11 += read;
            }
            long j11 = min;
            if (min < 4096) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            min = m33775c(j11 * i12);
        }
        if (inputStream.read() == -1) {
            return m33773a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
