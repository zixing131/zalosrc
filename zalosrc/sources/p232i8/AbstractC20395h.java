package p232i8;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import p153f8.C18821f;

/* renamed from: i8.h */
/* loaded from: classes.dex */
public abstract class AbstractC20395h {

    /* renamed from: a */
    private static final char[] f100437a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f100438b = -1;

    /* renamed from: i8.h$a */
    /* loaded from: classes.dex */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: z */
        private static final Map f100450z;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f100450z = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        /* renamed from: b */
        static a m106231b() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C18821f.m98795f().m98802i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f100450z.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }
    }

    /* renamed from: A */
    public static boolean m106201A() {
        boolean m106230z = m106230z();
        String str = Build.TAGS;
        if ((!m106230z && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!m106230z && file.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m106202B(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: C */
    public static String m106203C(String str) {
        return m106225u(str, "SHA-1");
    }

    /* renamed from: D */
    public static String m106204D(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* renamed from: a */
    public static long m106205a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m106206b(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    /* renamed from: c */
    public static boolean m106207c(Context context) {
        if (!m106208d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m106208d(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m106209e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                C18821f.m98795f().m98799e(str, e11);
            }
        }
    }

    /* renamed from: f */
    public static void m106210f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m106211g(String str, String str2, int i11) {
        return Long.parseLong(str.split(str2)[0].trim()) * i11;
    }

    /* renamed from: h */
    public static String m106212h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String sb3 = sb2.toString();
        if (sb3.length() <= 0) {
            return null;
        }
        return m106203C(sb3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:            r2 = r3[1];     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m106213i(File file, String str) {
        ?? exists = file.exists();
        String str2 = null;
        str2 = null;
        str2 = null;
        Closeable closeable = null;
        try {
            if (exists != 0) {
                try {
                    exists = new BufferedReader(new FileReader(file), 1024);
                    while (true) {
                        try {
                            String readLine = exists.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                            if (split.length > 1 && split[0].equals(str)) {
                                break;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            C18821f.m98795f().m98799e("Error parsing " + file, e);
                            m106209e(exists, "Failed to close system file reader.");
                            return str2;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    exists = 0;
                } catch (Throwable th2) {
                    th = th2;
                    m106209e(closeable, "Failed to close system file reader.");
                    throw th;
                }
                m106209e(exists, "Failed to close system file reader.");
            }
            return str2;
        } catch (Throwable th3) {
            th = th3;
            closeable = exists;
        }
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m106214j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m106215k(Context context, String str, boolean z11) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m106222r = m106222r(context, str, "bool");
            if (m106222r > 0) {
                return resources.getBoolean(m106222r);
            }
            int m106222r2 = m106222r(context, str, "string");
            if (m106222r2 > 0) {
                return Boolean.parseBoolean(context.getString(m106222r2));
            }
        }
        return z11;
    }

    /* renamed from: l */
    public static List m106216l(Context context) {
        ArrayList arrayList = new ArrayList();
        int m106222r = m106222r(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int m106222r2 = m106222r(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int m106222r3 = m106222r(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (m106222r != 0 && m106222r2 != 0 && m106222r3 != 0) {
            String[] stringArray = context.getResources().getStringArray(m106222r);
            String[] stringArray2 = context.getResources().getStringArray(m106222r2);
            String[] stringArray3 = context.getResources().getStringArray(m106222r3);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i11 = 0; i11 < stringArray3.length; i11++) {
                    arrayList.add(new C20389e(stringArray[i11], stringArray2[i11], stringArray3[i11]));
                }
                return arrayList;
            }
            C18821f.m98795f().m98796b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        C18821f.m98795f().m98796b(String.format("Could not find resources: %d %d %d", Integer.valueOf(m106222r), Integer.valueOf(m106222r2), Integer.valueOf(m106222r3)));
        return arrayList;
    }

    /* renamed from: m */
    public static int m106217m() {
        return a.m106231b().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: n */
    public static int m106218n() {
        boolean m106230z = m106230z();
        ?? r02 = m106230z;
        if (m106201A()) {
            r02 = (m106230z ? 1 : 0) | 2;
        }
        if (m106229y()) {
            return r02 | 4;
        }
        return r02;
    }

    /* renamed from: o */
    public static String m106219o(Context context) {
        int m106222r = m106222r(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m106222r == 0) {
            m106222r = m106222r(context, "com.crashlytics.android.build_id", "string");
        }
        if (m106222r != 0) {
            return context.getResources().getString(m106222r);
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m106220p(Context context) {
        if (m106230z() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static String m106221q(Context context) {
        int i11 = context.getApplicationContext().getApplicationInfo().icon;
        if (i11 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i11);
                if ("android".equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    /* renamed from: r */
    public static int m106222r(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m106221q(context));
    }

    /* renamed from: s */
    public static SharedPreferences m106223s(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: t */
    public static synchronized long m106224t() {
        long j11;
        synchronized (AbstractC20395h.class) {
            try {
                if (f100438b == -1) {
                    String m106213i = m106213i(new File("/proc/meminfo"), "MemTotal");
                    long j12 = 0;
                    if (!TextUtils.isEmpty(m106213i)) {
                        String upperCase = m106213i.toUpperCase(Locale.US);
                        try {
                            if (upperCase.endsWith("KB")) {
                                j12 = m106211g(upperCase, "KB", 1024);
                            } else if (upperCase.endsWith("MB")) {
                                j12 = m106211g(upperCase, "MB", ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
                            } else if (upperCase.endsWith("GB")) {
                                j12 = m106211g(upperCase, "GB", 1073741824);
                            } else {
                                C18821f.m98795f().m98804k("Unexpected meminfo format while computing RAM: " + upperCase);
                            }
                        } catch (NumberFormatException e11) {
                            C18821f.m98795f().m98799e("Unexpected meminfo format while computing RAM: " + upperCase, e11);
                        }
                    }
                    f100438b = j12;
                }
                j11 = f100438b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    /* renamed from: u */
    private static String m106225u(String str, String str2) {
        return m106226v(str.getBytes(), str2);
    }

    /* renamed from: v */
    private static String m106226v(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m106227w(messageDigest.digest());
        } catch (NoSuchAlgorithmException e11) {
            C18821f.m98795f().m98799e("Could not create hashing algorithm: " + str + ", returning empty string.", e11);
            return "";
        }
    }

    /* renamed from: w */
    public static String m106227w(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f100437a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: x */
    public static boolean m106228x(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m106229y() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m106230z() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }
}
