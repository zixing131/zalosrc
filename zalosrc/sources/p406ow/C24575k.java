package p406ow;

import android.net.TrafficStats;
import android.os.Build;
import android.os.StrictMode;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: ow.k */
/* loaded from: classes4.dex */
public class C24575k {

    /* renamed from: b */
    private static final ThreadLocal f118298b = new a();

    /* renamed from: c */
    private static long f118299c = -1;

    /* renamed from: d */
    private static C24573i f118300d = new C24573i();

    /* renamed from: e */
    private static C24565a f118301e = new C24565a();

    /* renamed from: f */
    public static long f118302f = 0;

    /* renamed from: g */
    public static volatile C24575k f118303g;

    /* renamed from: a */
    private String f118304a;

    /* renamed from: ow.k$a */
    /* loaded from: classes4.dex */
    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] initialValue() {
            return new byte[512];
        }
    }

    public C24575k(String str) {
        this.f118304a = str;
    }

    /* renamed from: a */
    public static C24575k m128001a() {
        if (f118303g == null) {
            synchronized (C24575k.class) {
                try {
                    if (f118303g == null) {
                        f118303g = new C24575k("/proc/net/xt_qtaguid/stats");
                    }
                } finally {
                }
            }
        }
        return f118303g;
    }

    /* renamed from: c */
    public static void m128002c() {
        f118299c = -1L;
    }

    /* renamed from: b */
    public long m128003b(int i11) {
        File file = new File(this.f118304a);
        if (Build.VERSION.SDK_INT <= 28 && file.exists() && file.canRead()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f118304a);
                f118300d.m127990b(fileInputStream);
                byte[] bArr = (byte[]) f118298b.get();
                try {
                    f118300d.m127991c();
                    long j11 = 0;
                    int i12 = 2;
                    while (true) {
                        int m127989a = f118300d.m127989a(bArr);
                        if (m127989a == -1) {
                            break;
                        }
                        try {
                            try {
                                f118301e.m127970f(bArr, m127989a);
                                f118301e.m127972j(' ');
                                f118301e.m127971g();
                                if (!f118301e.m127969d("lo")) {
                                    f118301e.m127971g();
                                    if (f118301e.m127968c() == i11) {
                                        f118301e.m127971g();
                                        j11 += f118301e.m127968c();
                                        i12++;
                                    }
                                }
                            } catch (NoSuchElementException unused) {
                                AbstractC20110a.m104543l("QTagParser").mo104551d("Invalid number of tokens on line " + i12 + ".", new Object[0]);
                            }
                        } catch (NumberFormatException unused2) {
                            AbstractC20110a.m104543l("QTagParser").mo104551d("Cannot parse byte count at line" + i12 + ".", new Object[0]);
                        }
                    }
                    fileInputStream.close();
                    long j12 = f118299c;
                    if (j12 == -1) {
                        f118299c = j11;
                        return -1L;
                    }
                    long j13 = j11 - j12;
                    f118302f += j13;
                    f118299c = j11;
                    return j13;
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            } catch (IOException unused3) {
                AbstractC20110a.m104543l("QTagParser").mo104551d("Error reading from /proc/net/xt_qtaguid/stats. Please check if this file exists.", new Object[0]);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } else {
            try {
                long uidRxBytes = TrafficStats.getUidRxBytes(i11);
                long j14 = f118299c;
                if (j14 == -1) {
                    f118299c = uidRxBytes;
                    return -1L;
                }
                long j15 = uidRxBytes - j14;
                f118302f += j15;
                f118299c = uidRxBytes;
                return j15;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return -1L;
    }
}
