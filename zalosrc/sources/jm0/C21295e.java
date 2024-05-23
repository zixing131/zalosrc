package jm0;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import mm0.AbstractC23350e;

/* renamed from: jm0.e */
/* loaded from: classes7.dex */
public class C21295e extends AbstractC21293c {

    /* renamed from: f */
    private final File f103733f;

    /* renamed from: g */
    private final long f103734g;

    /* renamed from: h */
    private long f103735h;

    /* renamed from: i */
    private long f103736i;

    /* renamed from: j */
    private InterfaceC21304n f103737j;

    public C21295e(String str, String str2, String str3, File file) {
        super(str, str2, str3);
        this.f103735h = 0L;
        this.f103736i = 0L;
        this.f103733f = file;
        this.f103734g = file.length();
    }

    @Override // jm0.AbstractC21293c
    /* renamed from: c */
    public long mo110259c() {
        long j11 = this.f103736i;
        long m110260d = m110260d();
        if (j11 > 0) {
            return m110260d + this.f103736i;
        }
        return (m110260d + this.f103734g) - this.f103735h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:            r5.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:            r2.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #4 {all -> 0x001b, blocks: (B:7:0x0010, B:9:0x0016, B:10:0x0024, B:12:0x002a, B:47:0x0064, B:26:0x009a, B:62:0x00aa, B:61:0x00a7, B:63:0x00ab, B:64:0x00b2, B:68:0x0020, B:56:0x00a1, B:15:0x0031, B:16:0x0038, B:18:0x003e, B:19:0x004b, B:21:0x0052, B:29:0x005e, B:32:0x006d, B:34:0x007a, B:35:0x007b, B:37:0x007f, B:39:0x008d), top: B:6:0x0010, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab A[Catch: all -> 0x001b, TryCatch #4 {all -> 0x001b, blocks: (B:7:0x0010, B:9:0x0016, B:10:0x0024, B:12:0x002a, B:47:0x0064, B:26:0x009a, B:62:0x00aa, B:61:0x00a7, B:63:0x00ab, B:64:0x00b2, B:68:0x0020, B:56:0x00a1, B:15:0x0031, B:16:0x0038, B:18:0x003e, B:19:0x004b, B:21:0x0052, B:29:0x005e, B:32:0x006d, B:34:0x007a, B:35:0x007b, B:37:0x007f, B:39:0x008d), top: B:6:0x0010, inners: #0, #1, #2 }] */
    @Override // jm0.AbstractC21293c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo110262f(OutputStream outputStream) {
        long j11;
        int i11;
        byte[] bArr;
        long j12;
        long j13;
        if (this.f103733f == null) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f103733f);
        long j14 = 0;
        try {
            try {
                j13 = this.f103735h;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (j13 > 0) {
            j11 = fileInputStream.skip(j13);
            if (j11 != this.f103735h) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    byte[] bArr2 = new byte[16384];
                    long j15 = this.f103735h;
                    long j16 = -1;
                    long j17 = 0;
                    while (true) {
                        long j18 = this.f103736i;
                        if (j18 > j14) {
                            i11 = (int) Math.min(16384, j18 - j17);
                        } else {
                            i11 = 16384;
                        }
                        int read = bufferedInputStream.read(bArr2, 0, i11);
                        if (read <= 0) {
                            break;
                        }
                        long j19 = this.f103736i;
                        if (j19 > 0 && j17 >= j19) {
                            break;
                        }
                        if (mo110257a()) {
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return;
                        }
                        outputStream.write(bArr2, 0, read);
                        long j21 = read;
                        long j22 = j15 + j21;
                        if (this.f103736i > 0) {
                            j17 += j21;
                        }
                        InterfaceC21304n interfaceC21304n = this.f103737j;
                        if (interfaceC21304n != null) {
                            bArr = bArr2;
                            j12 = j22;
                            long j23 = (100 * j22) / this.f103734g;
                            if (j23 != j16) {
                                interfaceC21304n.mo87256a(j23);
                                j16 = j23;
                            }
                        } else {
                            bArr = bArr2;
                            j12 = j22;
                        }
                        bArr2 = bArr;
                        j14 = 0;
                        j15 = j12;
                    }
                } finally {
                }
            } else {
                throw new IOException("Skip bytes failed.");
            }
        }
        j11 = 0;
        if (j11 != this.f103735h) {
        }
    }

    /* renamed from: h */
    public void m110264h(InterfaceC21304n interfaceC21304n) {
        this.f103737j = interfaceC21304n;
    }
}
