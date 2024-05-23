package jm0;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.UrlQuerySanitizer;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import fm0.InterfaceC19024a;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.MessageDigest;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23356k;
import mm0.C23357l;
import org.json.JSONObject;

/* renamed from: jm0.s */
/* loaded from: classes.dex */
public abstract class AbstractC21309s {
    /* JADX WARN: Can't wrap try/catch for region: R(18:49|(2:51|52)|53|(15:55|56|57|58|(1:60)|61|(2:63|(1:65))|67|68|70|71|72|(1:74)(1:78)|75|76)|88|57|58|(0)|61|(0)|67|68|70|71|72|(0)(0)|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03c2, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03c6, code lost:            r0.printStackTrace();        r0 = 0;        r13 = r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c4, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03c5, code lost:            r13 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x039a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03aa, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026d A[Catch: Exception -> 0x0231, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x0231, blocks: (B:151:0x022c, B:161:0x026d), top: B:14:0x020b, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[Catch: Exception -> 0x0233, SYNTHETIC, TRY_LEAVE, TryCatch #30 {Exception -> 0x0233, blocks: (B:200:0x0271, B:155:0x0229, B:183:0x028b, B:182:0x0288, B:190:0x027d, B:167:0x0268, B:163:0x0262, B:186:0x0277, B:177:0x0282, B:151:0x022c, B:161:0x026d, B:150:0x0223), top: B:14:0x020b, inners: #11, #21, #26, #31, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01e2 A[Catch: Exception -> 0x01a5, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x01a5, blocks: (B:221:0x01a0, B:231:0x01e2), top: B:9:0x017f, outer: #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[Catch: Exception -> 0x01a7, SYNTHETIC, TRY_LEAVE, TryCatch #36 {Exception -> 0x01a7, blocks: (B:271:0x01e6, B:225:0x019d, B:253:0x0200, B:252:0x01fd, B:260:0x01f2, B:237:0x01dd, B:256:0x01ec, B:233:0x01d7, B:247:0x01f7, B:220:0x0197, B:221:0x01a0, B:231:0x01e2), top: B:9:0x017f, inners: #0, #7, #20, #32, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02ac A[Catch: Exception -> 0x02df, TryCatch #5 {Exception -> 0x02df, blocks: (B:21:0x0297, B:24:0x02a6, B:26:0x02ac, B:28:0x02b2), top: B:20:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0150 A[Catch: Exception -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #28 {Exception -> 0x0104, blocks: (B:287:0x00fd, B:390:0x0150), top: B:4:0x0018, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:? A[Catch: Exception -> 0x0107, SYNTHETIC, TRY_LEAVE, TryCatch #25 {Exception -> 0x0107, blocks: (B:431:0x0154, B:294:0x00fa, B:410:0x016e, B:409:0x016b, B:417:0x0160, B:396:0x014b, B:404:0x0165, B:286:0x00f4, B:413:0x015a, B:287:0x00fd, B:390:0x0150, B:392:0x0145), top: B:4:0x0018, inners: #1, #2, #6, #28, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0344 A[Catch: Exception -> 0x0358, TryCatch #42 {Exception -> 0x0358, blocks: (B:47:0x033e, B:49:0x0344, B:51:0x0352, B:53:0x037b, B:55:0x0381, B:91:0x035e, B:93:0x0368, B:95:0x0370, B:97:0x0376), top: B:46:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0381 A[Catch: Exception -> 0x0358, TRY_LEAVE, TryCatch #42 {Exception -> 0x0358, blocks: (B:47:0x033e, B:49:0x0344, B:51:0x0352, B:53:0x037b, B:55:0x0381, B:91:0x035e, B:93:0x0368, B:95:0x0370, B:97:0x0376), top: B:46:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0393 A[Catch: Exception -> 0x039a, TryCatch #33 {Exception -> 0x039a, blocks: (B:58:0x038d, B:60:0x0393, B:61:0x039c, B:63:0x03a2), top: B:57:0x038d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a2 A[Catch: Exception -> 0x039a, TRY_LEAVE, TryCatch #33 {Exception -> 0x039a, blocks: (B:58:0x038d, B:60:0x0393, B:61:0x039c, B:63:0x03a2), top: B:57:0x038d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035a  */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v47, types: [int] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x0271 -> B:17:0x028d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x01e6 -> B:12:0x0202). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:377:0x0154 -> B:276:0x0100). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m110337a() {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        int i19;
        int i21;
        int i22;
        String str8;
        String quote;
        int i23;
        SubscriptionManager from;
        List list2;
        int size;
        InterfaceC19024a m93148a;
        int i24;
        int i25;
        int i26;
        ?? r102;
        ?? r82;
        int i27;
        Throwable th2;
        FileReader fileReader;
        BufferedReader bufferedReader;
        Throwable th3;
        FileReader fileReader2;
        ?? r22;
        int i28;
        Intent registerReceiver;
        String action;
        int i29;
        BufferedReader bufferedReader2;
        FileReader fileReader3;
        FileReader fileReader4;
        FileReader fileReader5;
        BufferedReader bufferedReader3;
        Throwable th4;
        String str9 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";
        ?? r32 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";
        long currentTimeMillis = System.currentTimeMillis();
        int i31 = 1;
        try {
        } catch (Exception e11) {
            e = e11;
            list = null;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
        }
        try {
            try {
            } catch (Exception e12) {
                e12.printStackTrace();
                r82 = r82;
                r102 = r102;
            }
        } catch (Exception e13) {
            e = e13;
            str = "";
            list = null;
            i11 = 1;
            i24 = -1;
            i25 = -1;
            i12 = i24;
            i13 = i25;
            f11 = 0.0f;
            i15 = i12;
            i14 = i13;
            i16 = 0;
            i18 = i15;
            i17 = i14;
            e.printStackTrace();
            str6 = str;
            str7 = "";
            i21 = i18;
            i19 = i17;
            try {
                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
            } catch (Exception e14) {
                e14.printStackTrace();
                i22 = 0;
            }
            try {
                i23 = Build.VERSION.SDK_INT;
                if (i23 >= 23) {
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
        if (!new File("/proc/cpuinfo").exists()) {
            str2 = "";
            str3 = str2;
            str4 = str3;
            str5 = str4;
            i27 = 0;
            if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").exists()) {
            }
            if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
            }
            list = null;
            registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
            }
            if (!TextUtils.isEmpty(action)) {
            }
            str6 = "";
            i29 = 0;
            f11 = 0.0f;
            i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
            i16 = i29;
            str7 = Build.MODEL;
            i21 = r82;
            i19 = r102;
            i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
            i23 = Build.VERSION.SDK_INT;
            if (i23 >= 23) {
            }
        } else {
            try {
                fileReader5 = new FileReader(new File("/proc/cpuinfo"));
                try {
                    bufferedReader3 = new BufferedReader(fileReader5);
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    String str10 = str5;
                    i26 = 0;
                    while (true) {
                        try {
                            try {
                                String readLine = bufferedReader3.readLine();
                                if (readLine != null) {
                                    try {
                                        r82 = readLine.trim().startsWith("Processor");
                                        r102 = ":";
                                        if (r82 != 0) {
                                            String[] split = readLine.split(":");
                                            if (split != null && (r82 = split.length) == 2) {
                                                str4 = split[1].trim();
                                            }
                                        } else {
                                            r82 = readLine.trim();
                                            if (r82.startsWith("Hardware")) {
                                                String[] split2 = readLine.split(":");
                                                if (split2 != null && split2.length == 2) {
                                                    str2 = split2[1].trim();
                                                }
                                            } else {
                                                r82 = "CPU architecture";
                                                if (readLine.trim().startsWith("CPU architecture")) {
                                                    String[] split3 = readLine.split(":");
                                                    if (split3 != null && split3.length == 2) {
                                                        str5 = split3[1].trim();
                                                    }
                                                } else {
                                                    r82 = "model name";
                                                    if (readLine.trim().startsWith("model name") && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                                                        String[] split4 = readLine.split(":");
                                                        if (split4 != null && split4.length == 2) {
                                                            str3 = split4[1].trim();
                                                        }
                                                    } else {
                                                        r82 = "processor";
                                                        if (readLine.trim().startsWith("processor")) {
                                                            String[] split5 = readLine.split(":");
                                                            if (split5 != null && split5.length == 2) {
                                                                str10 = split5[1].trim();
                                                            }
                                                            if (!TextUtils.isEmpty(str10) && Integer.parseInt(str10) >= 0) {
                                                                i26++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e16) {
                                        e16.printStackTrace();
                                    }
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e17) {
                                        e17.printStackTrace();
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th4 = th;
                                if (fileReader5 != null) {
                                    try {
                                        fileReader5.close();
                                    } catch (Exception e18) {
                                        e18.printStackTrace();
                                    }
                                }
                                if (bufferedReader3 != null) {
                                    try {
                                        bufferedReader3.close();
                                        throw th4;
                                    } catch (Exception e19) {
                                        e19.printStackTrace();
                                        throw th4;
                                    }
                                }
                                throw th4;
                            }
                        } catch (Exception e21) {
                            e = e21;
                            e.printStackTrace();
                            if (fileReader5 != null) {
                                try {
                                    fileReader5.close();
                                } catch (Exception e22) {
                                    e22.printStackTrace();
                                }
                            }
                            if (bufferedReader3 != null) {
                                bufferedReader3.close();
                                r82 = r82;
                                r102 = r102;
                            }
                            i27 = i26;
                            try {
                                try {
                                    if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").exists()) {
                                    }
                                } catch (Exception e23) {
                                    e23.printStackTrace();
                                }
                                try {
                                } catch (Exception e24) {
                                    e = e24;
                                    list = null;
                                    str = "";
                                    i11 = 1;
                                    i12 = -1;
                                    i13 = r102;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                str = "";
                                list = null;
                                i11 = 1;
                                i24 = -1;
                                i25 = r102;
                                i12 = i24;
                                i13 = i25;
                                f11 = 0.0f;
                                i15 = i12;
                                i14 = i13;
                                i16 = 0;
                                i18 = i15;
                                i17 = i14;
                                e.printStackTrace();
                                str6 = str;
                                str7 = "";
                                i21 = i18;
                                i19 = i17;
                                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                i23 = Build.VERSION.SDK_INT;
                                if (i23 >= 23) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                                        }
                                    } catch (Exception e26) {
                                        e26.printStackTrace();
                                    }
                                    try {
                                        list = null;
                                        registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                        if (registerReceiver != null) {
                                        }
                                        if (!TextUtils.isEmpty(action)) {
                                        }
                                        str6 = "";
                                        i29 = 0;
                                        f11 = 0.0f;
                                        try {
                                            i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                                            try {
                                                i16 = i29;
                                                str7 = Build.MODEL;
                                                i21 = r82;
                                                i19 = r102;
                                            } catch (Exception e27) {
                                                e = e27;
                                                i16 = i29;
                                                str = str6;
                                                i18 = r82;
                                                i17 = r102;
                                                e.printStackTrace();
                                                str6 = str;
                                                str7 = "";
                                                i21 = i18;
                                                i19 = i17;
                                                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                                i23 = Build.VERSION.SDK_INT;
                                                if (i23 >= 23) {
                                                }
                                            }
                                        } catch (Exception e28) {
                                            e = e28;
                                            i16 = i29;
                                            str = str6;
                                            i11 = 1;
                                            i18 = r82;
                                            i17 = r102;
                                        }
                                    } catch (Exception e29) {
                                        e = e29;
                                        list = null;
                                    }
                                } catch (Exception e31) {
                                    e = e31;
                                    str = "";
                                    list = null;
                                    i28 = r82;
                                    i11 = 1;
                                    i24 = i28;
                                    i25 = r102;
                                    i12 = i24;
                                    i13 = i25;
                                    f11 = 0.0f;
                                    i15 = i12;
                                    i14 = i13;
                                    i16 = 0;
                                    i18 = i15;
                                    i17 = i14;
                                    e.printStackTrace();
                                    str6 = str;
                                    str7 = "";
                                    i21 = i18;
                                    i19 = i17;
                                    i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                    i23 = Build.VERSION.SDK_INT;
                                    if (i23 >= 23) {
                                    }
                                }
                                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                i23 = Build.VERSION.SDK_INT;
                                if (i23 >= 23) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    }
                    fileReader5.close();
                    bufferedReader3.close();
                    r82 = r82;
                    r102 = r102;
                } catch (Exception e32) {
                    e = e32;
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    bufferedReader3 = null;
                    i26 = 0;
                    e.printStackTrace();
                    if (fileReader5 != null) {
                    }
                    if (bufferedReader3 != null) {
                    }
                    i27 = i26;
                    if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").exists()) {
                    }
                    if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                    }
                    list = null;
                    registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver != null) {
                    }
                    if (!TextUtils.isEmpty(action)) {
                    }
                    str6 = "";
                    i29 = 0;
                    f11 = 0.0f;
                    i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                    i16 = i29;
                    str7 = Build.MODEL;
                    i21 = r82;
                    i19 = r102;
                    i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                    i23 = Build.VERSION.SDK_INT;
                    if (i23 >= 23) {
                    }
                } catch (Throwable th7) {
                    th4 = th7;
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    bufferedReader3 = null;
                    if (fileReader5 != null) {
                    }
                    if (bufferedReader3 != null) {
                    }
                }
            } catch (Exception e33) {
                e = e33;
                str2 = "";
                str3 = str2;
                str4 = str3;
                str5 = str4;
                fileReader5 = null;
            } catch (Throwable th8) {
                th = th8;
                str2 = "";
                str3 = str2;
                str4 = str3;
                str5 = str4;
                fileReader5 = null;
                bufferedReader3 = null;
                th4 = th;
                if (fileReader5 != null) {
                }
                if (bufferedReader3 != null) {
                }
            }
            i27 = i26;
            try {
            } catch (Exception e34) {
                e = e34;
                list = null;
                str = "";
                i11 = 1;
                i12 = -1;
                i13 = -1;
                f11 = 0.0f;
                i15 = i12;
                i14 = i13;
                i16 = 0;
                i18 = i15;
                i17 = i14;
                e.printStackTrace();
                str6 = str;
                str7 = "";
                i21 = i18;
                i19 = i17;
                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                i23 = Build.VERSION.SDK_INT;
                if (i23 >= 23) {
                }
            }
            try {
                if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").exists()) {
                    try {
                        fileReader4 = new FileReader(new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
                    } catch (Exception e35) {
                        e = e35;
                        r32 = 0;
                        fileReader4 = null;
                    } catch (Throwable th9) {
                        th = th9;
                        r32 = 0;
                        r82 = 0;
                        r102 = -1;
                        th2 = th;
                        bufferedReader = r32;
                        fileReader = r82;
                        r102 = r102;
                        if (fileReader != null) {
                        }
                        if (bufferedReader == null) {
                        }
                    }
                    try {
                        r32 = new BufferedReader(fileReader4);
                        r102 = -1;
                        while (true) {
                            try {
                                String readLine2 = r32.readLine();
                                if (readLine2 == null) {
                                    try {
                                        break;
                                    } catch (Exception e36) {
                                        Exception exc = e36;
                                        exc.printStackTrace();
                                        r82 = exc;
                                    }
                                } else {
                                    int parseInt = Integer.parseInt(readLine2) / 1000;
                                    if (parseInt > r102) {
                                        r102 = parseInt;
                                    }
                                }
                            } catch (Exception e37) {
                                e = e37;
                                e.printStackTrace();
                                r82 = fileReader4;
                                if (fileReader4 != null) {
                                    try {
                                        fileReader4.close();
                                        r82 = fileReader4;
                                    } catch (Exception e38) {
                                        Exception exc2 = e38;
                                        exc2.printStackTrace();
                                        r82 = exc2;
                                    }
                                }
                                if (r32 != 0) {
                                    r32.close();
                                }
                                if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                                }
                                list = null;
                                registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                if (registerReceiver != null) {
                                }
                                if (!TextUtils.isEmpty(action)) {
                                }
                                str6 = "";
                                i29 = 0;
                                f11 = 0.0f;
                                i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                                i16 = i29;
                                str7 = Build.MODEL;
                                i21 = r82;
                                i19 = r102;
                                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                i23 = Build.VERSION.SDK_INT;
                                if (i23 >= 23) {
                                }
                            }
                        }
                        fileReader4.close();
                        r82 = fileReader4;
                        r32.close();
                    } catch (Exception e39) {
                        e = e39;
                        r32 = 0;
                        fileReader4 = fileReader4;
                        r102 = -1;
                        e.printStackTrace();
                        r82 = fileReader4;
                        if (fileReader4 != null) {
                        }
                        if (r32 != 0) {
                        }
                        if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                        }
                        list = null;
                        registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        if (registerReceiver != null) {
                        }
                        if (!TextUtils.isEmpty(action)) {
                        }
                        str6 = "";
                        i29 = 0;
                        f11 = 0.0f;
                        i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                        i16 = i29;
                        str7 = Build.MODEL;
                        i21 = r82;
                        i19 = r102;
                        i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                        i23 = Build.VERSION.SDK_INT;
                        if (i23 >= 23) {
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                        bufferedReader = null;
                        r102 = -1;
                        fileReader = fileReader4;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Exception e41) {
                                e41.printStackTrace();
                            }
                        }
                        if (bufferedReader == null) {
                            try {
                                bufferedReader.close();
                                throw th2;
                            } catch (Exception e42) {
                                e42.printStackTrace();
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                } else {
                    r102 = -1;
                }
                if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                    try {
                        fileReader3 = new FileReader(new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
                        try {
                            bufferedReader2 = new BufferedReader(fileReader3);
                            r82 = -1;
                            while (true) {
                                try {
                                    String readLine3 = bufferedReader2.readLine();
                                    if (readLine3 == null) {
                                        try {
                                            break;
                                        } catch (Exception e43) {
                                            e43.printStackTrace();
                                        }
                                    } else {
                                        int parseInt2 = Integer.parseInt(readLine3) / 1000;
                                        if (parseInt2 > r82) {
                                            r82 = parseInt2;
                                        }
                                    }
                                } catch (Exception e44) {
                                    e = e44;
                                    e.printStackTrace();
                                    if (fileReader3 != null) {
                                        try {
                                            fileReader3.close();
                                        } catch (Exception e45) {
                                            e45.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                    list = null;
                                    registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                    if (registerReceiver != null) {
                                    }
                                    if (!TextUtils.isEmpty(action)) {
                                    }
                                    str6 = "";
                                    i29 = 0;
                                    f11 = 0.0f;
                                    i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                                    i16 = i29;
                                    str7 = Build.MODEL;
                                    i21 = r82;
                                    i19 = r102;
                                    i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                    i23 = Build.VERSION.SDK_INT;
                                    if (i23 >= 23) {
                                    }
                                }
                            }
                            fileReader3.close();
                            bufferedReader2.close();
                        } catch (Exception e46) {
                            e = e46;
                            bufferedReader2 = null;
                            fileReader3 = fileReader3;
                            r82 = -1;
                            e.printStackTrace();
                            if (fileReader3 != null) {
                            }
                            if (bufferedReader2 != null) {
                            }
                            list = null;
                            registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (registerReceiver != null) {
                            }
                            if (!TextUtils.isEmpty(action)) {
                            }
                            str6 = "";
                            i29 = 0;
                            f11 = 0.0f;
                            i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                            i16 = i29;
                            str7 = Build.MODEL;
                            i21 = r82;
                            i19 = r102;
                            i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                            i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23) {
                            }
                        } catch (Throwable th11) {
                            th3 = th11;
                            r22 = 0;
                            r82 = -1;
                            fileReader2 = fileReader3;
                            if (fileReader2 != null) {
                            }
                            if (r22 == 0) {
                            }
                        }
                    } catch (Exception e47) {
                        e = e47;
                        bufferedReader2 = null;
                        fileReader3 = null;
                    } catch (Throwable th12) {
                        th = th12;
                        str9 = null;
                        r32 = 0;
                        r82 = -1;
                        th3 = th;
                        r22 = str9;
                        fileReader2 = r32;
                        r82 = r82;
                        if (fileReader2 != null) {
                            try {
                                fileReader2.close();
                            } catch (Exception e48) {
                                e48.printStackTrace();
                            }
                        }
                        if (r22 == 0) {
                            try {
                                r22.close();
                                throw th3;
                            } catch (Exception e49) {
                                e49.printStackTrace();
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                } else {
                    r82 = -1;
                }
                list = null;
                try {
                    registerReceiver = CoreUtility.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver != null) {
                        action = "";
                    } else {
                        try {
                            action = registerReceiver.getAction();
                        } catch (Exception e51) {
                            e = e51;
                            str = "";
                            i28 = r82;
                            i11 = 1;
                            i24 = i28;
                            i25 = r102;
                            i12 = i24;
                            i13 = i25;
                            f11 = 0.0f;
                            i15 = i12;
                            i14 = i13;
                            i16 = 0;
                            i18 = i15;
                            i17 = i14;
                            e.printStackTrace();
                            str6 = str;
                            str7 = "";
                            i21 = i18;
                            i19 = i17;
                            i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                            i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23) {
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(action) || !action.equals("android.intent.action.BATTERY_CHANGED")) {
                        str6 = "";
                        i29 = 0;
                        f11 = 0.0f;
                    } else {
                        str = registerReceiver.getExtras().getString("technology");
                        try {
                            float intExtra = registerReceiver.getIntExtra("temperature", 0) / 10.0f;
                            try {
                                f11 = intExtra;
                                str6 = str;
                                i29 = registerReceiver.getIntExtra("voltage", 1);
                            } catch (Exception e52) {
                                e = e52;
                                f11 = intExtra;
                                i11 = 1;
                                i15 = r82;
                                i14 = r102;
                                i16 = 0;
                                i18 = i15;
                                i17 = i14;
                                e.printStackTrace();
                                str6 = str;
                                str7 = "";
                                i21 = i18;
                                i19 = i17;
                                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                                i23 = Build.VERSION.SDK_INT;
                                if (i23 >= 23) {
                                }
                            }
                        } catch (Exception e53) {
                            e = e53;
                            i11 = 1;
                            i12 = r82;
                            i13 = r102;
                            f11 = 0.0f;
                            i15 = i12;
                            i14 = i13;
                            i16 = 0;
                            i18 = i15;
                            i17 = i14;
                            e.printStackTrace();
                            str6 = str;
                            str7 = "";
                            i21 = i18;
                            i19 = i17;
                            i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                            i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23) {
                            }
                        }
                    }
                    i11 = Math.max(i27, Runtime.getRuntime().availableProcessors());
                    i16 = i29;
                    str7 = Build.MODEL;
                    i21 = r82;
                    i19 = r102;
                } catch (Exception e54) {
                    e = e54;
                    str = "";
                    i11 = 1;
                    i12 = r82;
                    i13 = r102;
                    f11 = 0.0f;
                    i15 = i12;
                    i14 = i13;
                    i16 = 0;
                    i18 = i15;
                    i17 = i14;
                    e.printStackTrace();
                    str6 = str;
                    str7 = "";
                    i21 = i18;
                    i19 = i17;
                    i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                    i23 = Build.VERSION.SDK_INT;
                    if (i23 >= 23) {
                    }
                }
                i22 = Settings.Secure.getInt(CoreUtility.getAppContext().getContentResolver(), "install_non_market_apps");
                i23 = Build.VERSION.SDK_INT;
                if (i23 >= 23) {
                    TelephonyManager telephonyManager = (TelephonyManager) CoreUtility.getAppContext().getSystemService("phone");
                    if (telephonyManager != null) {
                        size = telephonyManager.getPhoneCount();
                        i31 = size;
                    }
                    m93148a = CoreUtility.m93148a();
                    if (m93148a != null) {
                        str8 = m93148a.mo100076d();
                        if (TextUtils.isEmpty(str4)) {
                            str4 = System.getProperty("os.arch");
                        }
                        if (TextUtils.isEmpty(str2)) {
                            if (!TextUtils.isEmpty(str3)) {
                                str2 = str3;
                            }
                        }
                        PackageManager packageManager = CoreUtility.getAppContext().getPackageManager();
                        boolean z11 = packageManager.hasSystemFeature("android.hardware.sensor.stepcounter");
                        int i32 = packageManager.hasSystemFeature("android.hardware.sensor.accelerometer");
                        ?? r13 = z11;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("{");
                        sb2.append("\"CPU_Processor\":");
                        sb2.append(JSONObject.quote(str4));
                        sb2.append(",");
                        sb2.append("\"CPU_Hardware\":");
                        sb2.append(JSONObject.quote(str2));
                        sb2.append(",");
                        sb2.append("\"CPU_Architecture\":");
                        sb2.append(JSONObject.quote(str5));
                        sb2.append(",");
                        sb2.append("\"CPU_MAXFreq\":");
                        sb2.append(JSONObject.quote(String.valueOf(i21)));
                        sb2.append(",");
                        sb2.append("\"CPU_MINFreq\":");
                        sb2.append(JSONObject.quote(String.valueOf(i19)));
                        sb2.append(",");
                        sb2.append("\"CPU_NumCore\":");
                        sb2.append(JSONObject.quote(String.valueOf(i11)));
                        sb2.append(",");
                        sb2.append("\"Model\":");
                        sb2.append(JSONObject.quote(str7));
                        sb2.append(",");
                        sb2.append("\"Battery_Technology\":");
                        sb2.append(JSONObject.quote(str6));
                        sb2.append(",");
                        sb2.append("\"Temperature\":");
                        sb2.append(JSONObject.quote(String.valueOf(f11)));
                        sb2.append(",");
                        sb2.append("\"Voltage\":");
                        sb2.append(JSONObject.quote(String.valueOf(i16)));
                        sb2.append(",");
                        sb2.append("\"SimCardSlot\":");
                        sb2.append(JSONObject.quote(String.valueOf(i31)));
                        sb2.append(",");
                        sb2.append("\"SimCardNumber\":");
                        if (TextUtils.isEmpty(str8)) {
                            quote = JSONObject.quote(String.valueOf(str8));
                        } else {
                            quote = JSONObject.quote("");
                        }
                        sb2.append(quote);
                        sb2.append(",");
                        sb2.append("\"SensorStepCount\":");
                        sb2.append(JSONObject.quote(String.valueOf((int) r13)));
                        sb2.append(",");
                        sb2.append("\"SensorAccelerator\":");
                        sb2.append(JSONObject.quote(String.valueOf(i32)));
                        sb2.append(",");
                        sb2.append("\"NonMarketAllowed\":");
                        sb2.append(JSONObject.quote(String.valueOf(i22)));
                        sb2.append("}");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("createDeviceInfosJsonFormat: ");
                        sb3.append(System.currentTimeMillis() - currentTimeMillis);
                        return sb2.toString();
                    }
                    str8 = "";
                    if (TextUtils.isEmpty(str4)) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    PackageManager packageManager2 = CoreUtility.getAppContext().getPackageManager();
                    boolean z112 = packageManager2.hasSystemFeature("android.hardware.sensor.stepcounter");
                    int i322 = packageManager2.hasSystemFeature("android.hardware.sensor.accelerometer");
                    ?? r132 = z112;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("{");
                    sb22.append("\"CPU_Processor\":");
                    sb22.append(JSONObject.quote(str4));
                    sb22.append(",");
                    sb22.append("\"CPU_Hardware\":");
                    sb22.append(JSONObject.quote(str2));
                    sb22.append(",");
                    sb22.append("\"CPU_Architecture\":");
                    sb22.append(JSONObject.quote(str5));
                    sb22.append(",");
                    sb22.append("\"CPU_MAXFreq\":");
                    sb22.append(JSONObject.quote(String.valueOf(i21)));
                    sb22.append(",");
                    sb22.append("\"CPU_MINFreq\":");
                    sb22.append(JSONObject.quote(String.valueOf(i19)));
                    sb22.append(",");
                    sb22.append("\"CPU_NumCore\":");
                    sb22.append(JSONObject.quote(String.valueOf(i11)));
                    sb22.append(",");
                    sb22.append("\"Model\":");
                    sb22.append(JSONObject.quote(str7));
                    sb22.append(",");
                    sb22.append("\"Battery_Technology\":");
                    sb22.append(JSONObject.quote(str6));
                    sb22.append(",");
                    sb22.append("\"Temperature\":");
                    sb22.append(JSONObject.quote(String.valueOf(f11)));
                    sb22.append(",");
                    sb22.append("\"Voltage\":");
                    sb22.append(JSONObject.quote(String.valueOf(i16)));
                    sb22.append(",");
                    sb22.append("\"SimCardSlot\":");
                    sb22.append(JSONObject.quote(String.valueOf(i31)));
                    sb22.append(",");
                    sb22.append("\"SimCardNumber\":");
                    if (TextUtils.isEmpty(str8)) {
                    }
                    sb22.append(quote);
                    sb22.append(",");
                    sb22.append("\"SensorStepCount\":");
                    sb22.append(JSONObject.quote(String.valueOf((int) r132)));
                    sb22.append(",");
                    sb22.append("\"SensorAccelerator\":");
                    sb22.append(JSONObject.quote(String.valueOf(i322)));
                    sb22.append(",");
                    sb22.append("\"NonMarketAllowed\":");
                    sb22.append(JSONObject.quote(String.valueOf(i22)));
                    sb22.append("}");
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("createDeviceInfosJsonFormat: ");
                    sb32.append(System.currentTimeMillis() - currentTimeMillis);
                    return sb22.toString();
                }
                if (i23 >= 22) {
                    from = SubscriptionManager.from(CoreUtility.getAppContext());
                    if (from != null) {
                        list2 = from.getActiveSubscriptionInfoList();
                    } else {
                        list2 = list;
                    }
                    if (list2 != null && list2.size() > 0) {
                        size = list2.size();
                        i31 = size;
                    }
                }
                m93148a = CoreUtility.m93148a();
                if (m93148a != null) {
                }
                str8 = "";
                if (TextUtils.isEmpty(str4)) {
                }
                if (TextUtils.isEmpty(str2)) {
                }
                PackageManager packageManager22 = CoreUtility.getAppContext().getPackageManager();
                boolean z1122 = packageManager22.hasSystemFeature("android.hardware.sensor.stepcounter");
                int i3222 = packageManager22.hasSystemFeature("android.hardware.sensor.accelerometer");
                ?? r1322 = z1122;
                StringBuilder sb222 = new StringBuilder();
                sb222.append("{");
                sb222.append("\"CPU_Processor\":");
                sb222.append(JSONObject.quote(str4));
                sb222.append(",");
                sb222.append("\"CPU_Hardware\":");
                sb222.append(JSONObject.quote(str2));
                sb222.append(",");
                sb222.append("\"CPU_Architecture\":");
                sb222.append(JSONObject.quote(str5));
                sb222.append(",");
                sb222.append("\"CPU_MAXFreq\":");
                sb222.append(JSONObject.quote(String.valueOf(i21)));
                sb222.append(",");
                sb222.append("\"CPU_MINFreq\":");
                sb222.append(JSONObject.quote(String.valueOf(i19)));
                sb222.append(",");
                sb222.append("\"CPU_NumCore\":");
                sb222.append(JSONObject.quote(String.valueOf(i11)));
                sb222.append(",");
                sb222.append("\"Model\":");
                sb222.append(JSONObject.quote(str7));
                sb222.append(",");
                sb222.append("\"Battery_Technology\":");
                sb222.append(JSONObject.quote(str6));
                sb222.append(",");
                sb222.append("\"Temperature\":");
                sb222.append(JSONObject.quote(String.valueOf(f11)));
                sb222.append(",");
                sb222.append("\"Voltage\":");
                sb222.append(JSONObject.quote(String.valueOf(i16)));
                sb222.append(",");
                sb222.append("\"SimCardSlot\":");
                sb222.append(JSONObject.quote(String.valueOf(i31)));
                sb222.append(",");
                sb222.append("\"SimCardNumber\":");
                if (TextUtils.isEmpty(str8)) {
                }
                sb222.append(quote);
                sb222.append(",");
                sb222.append("\"SensorStepCount\":");
                sb222.append(JSONObject.quote(String.valueOf((int) r1322)));
                sb222.append(",");
                sb222.append("\"SensorAccelerator\":");
                sb222.append(JSONObject.quote(String.valueOf(i3222)));
                sb222.append(",");
                sb222.append("\"NonMarketAllowed\":");
                sb222.append(JSONObject.quote(String.valueOf(i22)));
                sb222.append("}");
                StringBuilder sb322 = new StringBuilder();
                sb322.append("createDeviceInfosJsonFormat: ");
                sb322.append(System.currentTimeMillis() - currentTimeMillis);
                return sb222.toString();
            } catch (Throwable th13) {
                th = th13;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m110338b(String str, String str2) {
        String str3;
        synchronized (AbstractC21309s.class) {
            str3 = "";
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update((str + str2).getBytes("utf8"));
                byte[] digest = messageDigest.digest();
                str3 = AbstractC23356k.m122800f(digest, 0, digest.length);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return str3;
    }

    /* renamed from: c */
    public static synchronized String m110339c(Map map) {
        synchronized (AbstractC21309s.class) {
            try {
                String str = new String("");
                if (map.size() == 0) {
                    return str;
                }
                C23357l c23357l = new C23357l();
                for (String str2 : map.keySet()) {
                    c23357l.m122801a(str2 + "=" + ((String) map.get(str2)));
                }
                c23357l.m122804d();
                String str3 = new String("");
                for (int i11 = 0; i11 < c23357l.m122803c(); i11++) {
                    str3 = str3 + c23357l.m122802b(i11);
                }
                return CoreUtils.m93449d(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static Hashtable m110340d(String str, String str2, String[] strArr, String[] strArr2) {
        Hashtable hashtable = new Hashtable();
        m110343g(str, str2, strArr, strArr2, hashtable);
        return hashtable;
    }

    /* renamed from: e */
    public static Hashtable m110341e(String str, String str2, String[] strArr, String[] strArr2, String str3, String str4, String str5, long j11) {
        Hashtable hashtable = new Hashtable();
        m110342f(str, str2, strArr, strArr2, str3, str4, str5, j11, hashtable);
        return hashtable;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0019, B:5:0x0027, B:7:0x0031, B:9:0x0038, B:11:0x0051, B:13:0x0057, B:14:0x005b, B:16:0x0061, B:19:0x0083, B:21:0x008b, B:23:0x0092, B:24:0x0095, B:25:0x009e, B:27:0x00a5, B:28:0x00a8, B:31:0x00b8, B:34:0x00c6, B:35:0x00d6, B:37:0x00d9, B:39:0x00e3, B:41:0x00e9, B:44:0x010d, B:46:0x0113, B:47:0x0124, B:49:0x012a, B:50:0x0139, B:52:0x013f, B:53:0x0152, B:60:0x0071, B:62:0x0078, B:63:0x007c, B:64:0x0022), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m110342f(String str, String str2, String[] strArr, String[] strArr2, String str3, String str4, String str5, long j11, Hashtable hashtable) {
        Hashtable hashtable2;
        boolean z11;
        String str6;
        String str7;
        StringBuilder sb2 = new StringBuilder();
        try {
            if (hashtable != null) {
                hashtable.clear();
                hashtable2 = hashtable;
            } else {
                hashtable2 = new Hashtable();
            }
            int indexOf = str.indexOf(63);
            if (indexOf >= 0 && indexOf < str.length() - 1) {
                sb2.append(str);
                String substring = str.substring(indexOf + 1);
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.parseQuery(substring);
                List<UrlQuerySanitizer.ParameterValuePair> parameterList = urlQuerySanitizer.getParameterList();
                if (parameterList != null && parameterList.size() > 0) {
                    for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                        hashtable2.put(parameterValuePair.mParameter, parameterValuePair.mValue);
                    }
                    z11 = true;
                    if (!TextUtils.isEmpty(str2)) {
                        hashtable2.put("method", str2);
                        if (z11) {
                            sb2.append('&');
                        }
                        sb2.append("method=");
                        sb2.append(str2);
                        z11 = true;
                    }
                    hashtable2.put("api_key", str4);
                    if (z11) {
                        sb2.append('&');
                    }
                    sb2.append("api_key=");
                    sb2.append(str4);
                    if (str5 != null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    hashtable2.put("session_key", str6);
                    sb2.append("&session_key=");
                    if (str5 != null) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    sb2.append(str7);
                    hashtable2.put("sign", str3);
                    sb2.append("&sign=");
                    sb2.append(str3);
                    for (int i11 = 0; i11 < strArr.length; i11++) {
                        if (strArr[i11].equals("deviceInfo")) {
                            strArr2[i11] = m110337a();
                        }
                        hashtable2.put(strArr[i11], strArr2[i11]);
                        sb2.append("&");
                        sb2.append(strArr[i11]);
                        sb2.append("=");
                        sb2.append(AbstractC21305o.m110332a(strArr2[i11], "UTF-8"));
                    }
                    if (!hashtable2.contains("ts")) {
                        hashtable2.put("ts", String.valueOf(j11));
                        sb2.append("&ts=");
                        sb2.append(j11);
                    }
                    if (!hashtable2.contains("clientType")) {
                        hashtable2.put("clientType", String.valueOf(1));
                        sb2.append("&clientType=");
                        sb2.append(1);
                    }
                    if (!hashtable2.contains("clientVersion")) {
                        hashtable2.put("clientVersion", String.valueOf(CoreUtility.f89236l));
                        sb2.append("&clientVersion=");
                        sb2.append(CoreUtility.f89236l);
                    }
                    return sb2.toString();
                }
            } else if (indexOf == str.length() - 1) {
                sb2.append(str);
            } else {
                sb2.append(str);
                sb2.append('?');
            }
            z11 = false;
            if (!TextUtils.isEmpty(str2)) {
            }
            hashtable2.put("api_key", str4);
            if (z11) {
            }
            sb2.append("api_key=");
            sb2.append(str4);
            if (str5 != null) {
            }
            hashtable2.put("session_key", str6);
            sb2.append("&session_key=");
            if (str5 != null) {
            }
            sb2.append(str7);
            hashtable2.put("sign", str3);
            sb2.append("&sign=");
            sb2.append(str3);
            while (i11 < strArr.length) {
            }
            if (!hashtable2.contains("ts")) {
            }
            if (!hashtable2.contains("clientType")) {
            }
            if (!hashtable2.contains("clientVersion")) {
            }
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m110343g(String str, String str2, String[] strArr, String[] strArr2, Map map) {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            try {
                map.clear();
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        int indexOf = str.indexOf(63);
        int i11 = 0;
        if (indexOf >= 0 && indexOf < str.length() - 1) {
            sb2.append(str);
            String substring = str.substring(indexOf + 1);
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseQuery(substring);
            List<UrlQuerySanitizer.ParameterValuePair> parameterList = urlQuerySanitizer.getParameterList();
            if (parameterList != null && parameterList.size() > 0) {
                for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                    if (map != null) {
                        map.put(parameterValuePair.mParameter, parameterValuePair.mValue);
                    }
                }
                z11 = true;
                if (!TextUtils.isEmpty(str2)) {
                    if (map != null) {
                        map.put("method", str2);
                    }
                    if (z11) {
                        sb2.append('&');
                    }
                    sb2.append("method=");
                    sb2.append(str2);
                    z11 = true;
                }
                while (i11 < strArr.length) {
                    if (map != null) {
                        map.put(strArr[i11], strArr2[i11]);
                    }
                    if (z11) {
                        sb2.append("&");
                    }
                    sb2.append(strArr[i11]);
                    sb2.append("=");
                    sb2.append(AbstractC21305o.m110332a(strArr2[i11], "UTF-8"));
                    i11++;
                    z11 = true;
                }
                return sb2.toString();
            }
        } else if (indexOf == str.length() - 1) {
            sb2.append(str);
        } else {
            sb2.append(str);
            sb2.append('?');
        }
        z11 = false;
        if (!TextUtils.isEmpty(str2)) {
        }
        while (i11 < strArr.length) {
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m110344h(String str, String str2, String str3, Hashtable hashtable) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (hashtable != null) {
                hashtable.clear();
            } else {
                hashtable = new Hashtable();
            }
            int indexOf = str.indexOf(63);
            if (indexOf >= 0 && indexOf < str.length() - 1) {
                sb2.append(str);
                String substring = str.substring(indexOf + 1);
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.parseQuery(substring);
                List<UrlQuerySanitizer.ParameterValuePair> parameterList = urlQuerySanitizer.getParameterList();
                if (parameterList != null && parameterList.size() > 0) {
                    for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                        hashtable.put(parameterValuePair.mParameter, parameterValuePair.mValue);
                    }
                    sb2.append('&');
                }
            } else if (indexOf == str.length() - 1) {
                sb2.append(str);
            } else {
                sb2.append(str);
                sb2.append('?');
            }
            hashtable.put("api_key", str2);
            sb2.append("api_key=");
            sb2.append(str2);
            hashtable.put("data", str3);
            sb2.append("&data=");
            sb2.append(str3);
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
