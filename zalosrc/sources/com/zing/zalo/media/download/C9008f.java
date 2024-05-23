package com.zing.zalo.media.download;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import mm0.AbstractC23350e;
import p587vv.C28631a;

/* renamed from: com.zing.zalo.media.download.f */
/* loaded from: classes4.dex */
public class C9008f extends InputStream {

    /* renamed from: w */
    private static final String f48221w = "f";

    /* renamed from: p */
    private File f48222p;

    /* renamed from: q */
    private RandomAccessFile f48223q;

    /* renamed from: r */
    private File f48224r;

    /* renamed from: s */
    private RandomAccessFile f48225s;

    /* renamed from: t */
    private byte[] f48226t;

    /* renamed from: u */
    private long f48227u;

    /* renamed from: v */
    private long f48228v;

    public C9008f(String str, String str2, long j11, long j12) {
        this.f48228v = 0L;
        this.f48222p = new File(str);
        m48145a();
        this.f48224r = new File(str2);
        m48146b();
        this.f48228v = j12;
        this.f48227u = j11;
    }

    /* renamed from: a */
    private void m48145a() {
        if (this.f48223q == null && this.f48222p.exists()) {
            this.f48223q = new RandomAccessFile(this.f48222p, "r");
        }
    }

    /* renamed from: b */
    private void m48146b() {
        if (this.f48225s == null && this.f48224r.exists()) {
            this.f48225s = new RandomAccessFile(this.f48224r, "r");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        long j11 = this.f48227u - this.f48228v;
        if (j11 > 2147483647L) {
            j11 = 2147483647L;
        }
        if (j11 < 0) {
            j11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("call available:");
        sb2.append(j11);
        return (int) j11;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.f48223q;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        RandomAccessFile randomAccessFile2 = this.f48225s;
        if (randomAccessFile2 != null) {
            randomAccessFile2.close();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("call mark:");
        sb2.append(i11);
        throw new RuntimeException("Not supported");
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f48226t == null) {
            this.f48226t = new byte[1];
        }
        if (read(this.f48226t) == -1) {
            return -1;
        }
        return this.f48226t[0] & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("call skip:");
        sb2.append(j11);
        throw new RuntimeException("Not supported");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        try {
            if (this.f48227u - this.f48228v <= 0) {
                return -1;
            }
            for (int i13 = 0; i13 < 500 && !C28631a.m143197d(); i13++) {
                m48145a();
                RandomAccessFile randomAccessFile = this.f48223q;
                if (randomAccessFile != null) {
                    long length = randomAccessFile.length() - this.f48228v;
                    if (this.f48222p.exists() && length > 0) {
                        if (i12 > length) {
                            i12 = (int) length;
                        }
                        this.f48223q.seek(this.f48228v);
                        int read = this.f48223q.read(bArr, i11, i12);
                        if (read > 0) {
                            this.f48228v += read;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("call read - result:");
                        sb2.append(read);
                        return read;
                    }
                }
                m48146b();
                RandomAccessFile randomAccessFile2 = this.f48225s;
                if (randomAccessFile2 != null) {
                    long length2 = randomAccessFile2.length() - this.f48228v;
                    if (this.f48224r.exists() && length2 > 0) {
                        if (i12 > length2) {
                            i12 = (int) length2;
                        }
                        this.f48225s.seek(this.f48228v);
                        int read2 = this.f48225s.read(bArr, i11, i12);
                        if (read2 > 0) {
                            this.f48228v += read2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("call read - result:");
                        sb3.append(read2);
                        return read2;
                    }
                }
                try {
                    wait(100L);
                } catch (InterruptedException e11) {
                    AbstractC23350e.m122774d(f48221w, "" + e11);
                }
            }
            return -1;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
