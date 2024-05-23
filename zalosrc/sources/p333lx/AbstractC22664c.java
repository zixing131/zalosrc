package p333lx;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Parcel;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* renamed from: lx.c */
/* loaded from: classes4.dex */
public abstract class AbstractC22664c {

    /* renamed from: a */
    private static int f111093a;

    /* renamed from: b */
    private static int f111094b;

    /* renamed from: c */
    private static float f111095c;

    /* renamed from: d */
    private static float f111096d;

    /* renamed from: e */
    private static float f111097e;

    /* renamed from: f */
    private static HashMap f111098f = new HashMap();

    /* renamed from: g */
    private static HashMap f111099g = new HashMap();

    /* renamed from: h */
    private static HashMap f111100h = new HashMap();

    /* renamed from: i */
    private static BigDecimal f111101i = BigDecimal.valueOf(100L);

    /* renamed from: j */
    private static Debug.MemoryInfo f111102j;

    /* renamed from: k */
    private static ActivityManager f111103k;

    /* renamed from: l */
    private static Context f111104l;

    /* renamed from: m */
    private static Runtime f111105m;

    /* renamed from: n */
    private static int f111106n;

    /* renamed from: a */
    private static void m117286a(long j11) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/stat"));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + f111106n + "/stat"));
                try {
                    String[] split = bufferedReader2.readLine().split("[ ]+", 18);
                    String[] split2 = bufferedReader.readLine().split("[ ]+", 9);
                    BigDecimal add = BigDecimal.valueOf(Long.parseLong(split[13])).add(BigDecimal.valueOf(Long.parseLong(split[14]))).add(BigDecimal.valueOf(Long.parseLong(split[15]))).add(BigDecimal.valueOf(Long.parseLong(split[16])));
                    BigDecimal add2 = BigDecimal.valueOf(Long.parseLong(split2[1])).add(BigDecimal.valueOf(Long.parseLong(split2[2]))).add(BigDecimal.valueOf(Long.parseLong(split2[3])));
                    BigDecimal add3 = add2.add(BigDecimal.valueOf(Long.parseLong(split2[4]))).add(BigDecimal.valueOf(Long.parseLong(split2[5]))).add(BigDecimal.valueOf(Long.parseLong(split2[6]))).add(BigDecimal.valueOf(Long.parseLong(split2[7])));
                    if (f111098f.get(Long.valueOf(j11)) != null) {
                        BigDecimal subtract = add3.subtract((BigDecimal) f111098f.get(Long.valueOf(j11)));
                        BigDecimal subtract2 = add2.subtract((BigDecimal) f111099g.get(Long.valueOf(j11)));
                        BigDecimal subtract3 = add.subtract((BigDecimal) f111100h.get(Long.valueOf(j11)));
                        if (subtract2.compareTo(subtract3) == -1) {
                            m117286a(j11);
                            bufferedReader2.close();
                            bufferedReader.close();
                            return;
                        }
                        f111093a = subtract2.multiply(f111101i).divide(subtract, 2, RoundingMode.HALF_DOWN).intValue();
                        f111094b = subtract3.multiply(f111101i).divide(subtract, 2, RoundingMode.HALF_UP).intValue();
                    }
                    f111098f.put(Long.valueOf(j11), add3);
                    f111099g.put(Long.valueOf(j11), add2);
                    f111100h.put(Long.valueOf(j11), add);
                    bufferedReader2.close();
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    private static float[] m117287b() {
        float readInt;
        String memoryStat;
        f111102j = f111103k.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        if (Build.VERSION.SDK_INT >= 23) {
            memoryStat = f111102j.getMemoryStat("summary.java-heap");
            readInt = Float.parseFloat(memoryStat);
        } else {
            Parcel obtain = Parcel.obtain();
            f111102j.writeToParcel(obtain, 0);
            obtain.setDataPosition(428);
            int readInt2 = obtain.readInt();
            obtain.readInt();
            readInt = f111102j.dalvikPrivateDirty + readInt2 + obtain.readInt();
        }
        return new float[]{readInt / 1024.0f, ((float) f111105m.maxMemory()) / 1048576.0f, f111102j.nativePrivateDirty / 1024.0f};
    }

    /* renamed from: c */
    private static void m117288c() {
        float[] m117287b = m117287b();
        float f11 = m117287b[0];
        f111095c = f11;
        f111097e = (f11 * 100.0f) / m117287b[1];
        f111096d = m117287b[2];
    }

    /* renamed from: d */
    public static void m117289d(long j11) {
        f111098f.remove(Long.valueOf(j11));
        f111099g.remove(Long.valueOf(j11));
        f111100h.remove(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m117290e(Context context) {
        f111104l = context;
        f111103k = (ActivityManager) context.getSystemService("activity");
        f111105m = Runtime.getRuntime();
        f111106n = Process.myPid();
    }

    /* renamed from: f */
    public static C22662a m117291f(long j11) {
        int i11;
        int i12;
        if (Build.VERSION.SDK_INT < 26) {
            m117286a(j11);
            Thread.sleep(25L);
            m117286a(j11);
            i11 = f111094b;
            i12 = f111093a;
        } else {
            i11 = -1;
            i12 = -1;
        }
        m117288c();
        return new C22662a(f111097e, i11, i12, f111095c, f111096d);
    }
}
