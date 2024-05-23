package p229i5;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: i5.r */
/* loaded from: classes.dex */
public abstract class AbstractC20297r {

    /* renamed from: a */
    private static String f100248a;

    /* renamed from: b */
    private static int f100249b;

    /* renamed from: a */
    public static String m105960a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f100248a == null) {
            int i11 = f100249b;
            if (i11 == 0) {
                i11 = Process.myPid();
                f100249b = i11;
            }
            String str2 = null;
            str2 = null;
            str2 = null;
            BufferedReader bufferedReader2 = null;
            if (i11 > 0) {
                try {
                    str = "/proc/" + i11 + "/cmdline";
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(str));
                    try {
                        String readLine = bufferedReader.readLine();
                        AbstractC4205o.m19722k(readLine);
                        str2 = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        AbstractC20291l.m105939a(bufferedReader2);
                        throw th;
                    }
                    AbstractC20291l.m105939a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            f100248a = str2;
        }
        return f100248a;
    }
}
