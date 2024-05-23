package jm;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/* renamed from: jm.b */
/* loaded from: classes3.dex */
public abstract class AbstractC21290b {
    /* renamed from: a */
    private static boolean m110252a() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m110253b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:            if (r3 == null) goto L10;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m110254c() {
        Process process;
        String str = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            try {
                str = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            process = null;
        }
        process.destroy();
        if (str != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m110255d() {
        if (!m110252a() && !m110253b() && !m110254c()) {
            return false;
        }
        return true;
    }
}
