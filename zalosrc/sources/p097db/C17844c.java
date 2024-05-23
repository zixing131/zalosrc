package p097db;

import android.os.Process;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

/* renamed from: db.c */
/* loaded from: classes3.dex */
public class C17844c {

    /* renamed from: j */
    private static int f90143j;

    /* renamed from: a */
    private long[] f90144a;

    /* renamed from: b */
    private int f90145b;

    /* renamed from: d */
    private int f90147d;

    /* renamed from: e */
    private int f90148e;

    /* renamed from: g */
    private String[] f90150g;

    /* renamed from: h */
    private String[] f90151h;

    /* renamed from: i */
    a f90152i;

    /* renamed from: c */
    private double f90146c = -1.0d;

    /* renamed from: f */
    private boolean f90149f = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: db.c$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        final long f90153a;

        /* renamed from: b */
        final long f90154b;

        /* renamed from: c */
        final long f90155c;

        a(long j11, long j12, long j13) {
            this.f90153a = j11;
            this.f90154b = j12;
            this.f90155c = j13;
        }
    }

    /* renamed from: c */
    private void m94214c() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        Scanner useDelimiter;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/present");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    useDelimiter = new Scanner(bufferedReader).useDelimiter("[-\n]");
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Exception unused) {
        }
        try {
            useDelimiter.nextInt();
            this.f90145b = useDelimiter.nextInt() + 1;
            useDelimiter.close();
            bufferedReader.close();
            fileReader.close();
            int i11 = this.f90145b;
            this.f90144a = new long[i11];
            this.f90150g = new String[i11];
            this.f90151h = new String[i11];
            for (int i12 = 0; i12 < this.f90145b; i12++) {
                this.f90144a[i12] = 0;
                this.f90150g[i12] = "/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq";
                this.f90151h[i12] = "/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/scaling_cur_freq";
            }
            this.f90152i = new a(0L, 0L, 0L);
            f90143j = Process.myPid();
            this.f90149f = true;
        } finally {
        }
    }

    /* renamed from: d */
    private static long m94215d(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: e */
    private long m94216e(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        long j11 = 0;
        try {
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception unused) {
        }
        try {
            Scanner scanner = new Scanner(bufferedReader);
            try {
                j11 = scanner.nextLong();
                scanner.close();
                bufferedReader.close();
                fileReader.close();
                return j11;
            } finally {
            }
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* renamed from: f */
    private a m94217f() {
        long j11;
        long j12;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/stat");
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + f90143j + "/stat"));
                        try {
                            String[] split = bufferedReader.readLine().split("\\s+");
                            int length = split.length;
                            if (length >= 5) {
                                j11 = m94215d(split[1]) + m94215d(split[2]) + m94215d(split[3]);
                                j12 = m94215d(split[4]);
                            } else {
                                j11 = 0;
                                j12 = 0;
                            }
                            if (length >= 8) {
                                j11 = j11 + m94215d(split[5]) + m94215d(split[6]) + m94215d(split[7]);
                            }
                            long j13 = j11;
                            String[] split2 = bufferedReader2.readLine().split("[ ]+", 18);
                            long m94215d = m94215d(split2[13]) + m94215d(split2[14]) + m94215d(split2[15]) + m94215d(split2[16]);
                            bufferedReader2.close();
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return new a(j13, m94215d, j12);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public int m94218a() {
        return this.f90147d;
    }

    /* renamed from: b */
    public int m94219b() {
        return this.f90148e;
    }

    /* renamed from: g */
    public boolean m94220g() {
        double d11;
        int round;
        int round2;
        if (!this.f90149f) {
            m94214c();
        }
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (int i11 = 0; i11 < this.f90145b; i11++) {
            long j14 = this.f90144a[i11];
            if (j14 == 0) {
                long m94216e = m94216e(this.f90150g[i11]);
                if (m94216e > 0) {
                    this.f90144a[i11] = m94216e;
                    this.f90150g[i11] = null;
                    j13 = m94216e;
                }
            } else {
                j13 = j14;
            }
            j12 += m94216e(this.f90151h[i11]);
            j11 += j13;
        }
        if (j11 == 0) {
            return false;
        }
        double d12 = (j12 * 100.0d) / j11;
        double d13 = this.f90146c;
        if (d13 > 0.0d) {
            d11 = (d13 + d12) * 0.5d;
        } else {
            d11 = d12;
        }
        this.f90146c = d12;
        a m94217f = m94217f();
        if (m94217f == null) {
            return false;
        }
        long j15 = m94217f.f90153a;
        a aVar = this.f90152i;
        long j16 = j15 - aVar.f90153a;
        long j17 = m94217f.f90154b - aVar.f90154b;
        long j18 = m94217f.f90155c - aVar.f90155c;
        this.f90152i = m94217f;
        long j19 = j18 + j16;
        if (j19 == 0) {
            round = 0;
        } else {
            round = (int) Math.round((j16 * d11) / j19);
        }
        int max = Math.max(0, Math.min(round, 100));
        if (j19 == 0) {
            round2 = 0;
        } else {
            round2 = (int) Math.round((d11 * j17) / j19);
        }
        int max2 = Math.max(0, Math.min(round2, 100));
        this.f90147d = max;
        this.f90148e = max2;
        return true;
    }
}
