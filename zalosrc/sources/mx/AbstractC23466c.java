package mx;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import com.zing.zalocore.CoreUtility;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me0.AbstractC23204s0;
import p171fx.AbstractC19166g;
import zw.AbstractC32562b;

/* renamed from: mx.c */
/* loaded from: classes4.dex */
public abstract class AbstractC23466c {

    /* renamed from: a */
    private static final List f113980a = new ArrayList();

    /* renamed from: b */
    public static void m123199b() {
        try {
            File file = new File(m123206i("/zalo/zam/"));
            if (!file.exists()) {
                file.mkdirs();
            }
            if (AbstractC19166g.m100564n()) {
                File file2 = new File(m123206i("/zalo/zam_user/"));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            File file3 = new File(m123207j("network/", true, false, false));
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File file4 = new File(m123207j("database/", true, false, false));
            if (!file4.exists()) {
                file4.mkdirs();
            }
            File file5 = new File(m123207j("disk/", true, false, false));
            if (!file5.exists()) {
                file5.mkdirs();
            }
            File file6 = new File(m123207j("disk/disk_usage_history/", true, false, false));
            if (!file6.exists()) {
                file6.mkdirs();
            }
            File file7 = new File(m123207j("uithread/", true, false, false));
            if (!file7.exists()) {
                file7.mkdirs();
            }
            File file8 = new File(m123207j("worker/", true, false, false));
            if (!file8.exists()) {
                file8.mkdirs();
            }
            File file9 = new File(m123207j("core_flow/", true, false, false));
            if (!file9.exists()) {
                file9.mkdirs();
            }
            File file10 = new File(m123207j("img_cache_io/", true, false, false));
            if (!file10.exists()) {
                file10.mkdirs();
            }
            File file11 = new File(m123207j("cacheimg_life/", true, false, false));
            if (!file11.exists()) {
                file11.mkdirs();
            }
            File file12 = new File(m123207j("sysinfo/", true, false, false));
            if (!file12.exists()) {
                file12.mkdirs();
            }
            File file13 = new File(m123207j("custom_log/", true, false, false));
            if (!file13.exists()) {
                file13.mkdirs();
            }
            File file14 = new File(m123207j("battery/wakelock/", true, false, false));
            if (!file14.exists()) {
                file14.mkdirs();
            }
            File file15 = new File(m123207j("battery/wakeup/", true, false, false));
            if (!file15.exists()) {
                file15.mkdirs();
            }
            File file16 = new File(m123207j("battery/bg_network/", true, false, false));
            if (!file16.exists()) {
                file16.mkdirs();
            }
            File file17 = new File(m123207j("media_recorder/", true, false, false));
            if (!file17.exists()) {
                file17.mkdirs();
            }
            File file18 = new File(m123207j("battery/gps/", true, false, false));
            if (!file18.exists()) {
                file18.mkdirs();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m123200c() {
        if (m123201d("network/", true) && m123201d("chat_head_hit_io/", true) && m123201d("database/", true) && m123201d("disk/", true) && m123201d("disk/disk_usage_history/", true) && m123201d("uithread/", true) && m123201d("network_traffic/", true) && m123201d("worker/", true) && m123201d("core_flow/", true) && m123201d("img_cache_io/", true) && m123201d("cacheimg_life/", true) && m123201d("sysinfo/", true) && m123201d("custom_log/", true) && m123201d("battery/wakelock/", true) && m123201d("battery/wakeup/", true) && m123201d("battery/bg_network/", true) && m123201d("media_recorder/", true) && m123201d("battery/gps/", true) && m123201d("/zalo/zam/", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m123201d(String str, boolean z11) {
        try {
            File file = new File(m123212o(str));
            if (file.isDirectory()) {
                String[] list = file.list();
                if (list == null) {
                    return true;
                }
                for (int i11 = 0; i11 < list.length; i11++) {
                    String replace = list[i11].replace(".txt", "").replace(".bin", "");
                    File file2 = new File(file, list[i11]);
                    if (!file2.isDirectory() && (replace.endsWith(".zip") || z11)) {
                        file2.delete();
                    }
                }
            } else if (file.exists()) {
                file.delete();
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    private static void m123202e(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                m123202e(file2);
            } else if (file2.getAbsolutePath().endsWith(".txt")) {
                f113980a.add(file2.getAbsolutePath());
            }
        }
    }

    /* renamed from: f */
    public static List m123203f(File file, long j11, int i11) {
        File[] listFiles = file.listFiles();
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            arrayList.add(AbstractC23477n.m123255c(file2.getPath(), m123204g(file2), j11, i11, 3));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static long m123204g(File file) {
        long m123204g;
        long j11 = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    m123204g = file2.length();
                } else {
                    m123204g = m123204g(file2);
                }
                j11 += m123204g;
            }
            return j11;
        }
        if (!file.isFile()) {
            return 0L;
        }
        return file.length();
    }

    /* renamed from: h */
    public static C1483e m123205h(File file) {
        long j11 = 0;
        long j12 = Long.MAX_VALUE;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        j11 += file2.length();
                        if (file2.lastModified() < j12) {
                            j12 = file2.lastModified();
                        }
                    } else {
                        j11 += m123204g(file2);
                    }
                }
            } else {
                return new C1483e(0L, Long.MAX_VALUE);
            }
        } else if (file.isFile()) {
            j11 = file.length();
        }
        return new C1483e(Long.valueOf(j11), Long.valueOf(j12));
    }

    /* renamed from: i */
    public static String m123206i(String str) {
        return m123207j(str, false, false, false);
    }

    /* renamed from: j */
    public static String m123207j(String str, boolean z11, boolean z12, boolean z13) {
        String absolutePath;
        if (z13) {
            absolutePath = AbstractC23204s0.m119554e().getAbsolutePath();
        } else {
            absolutePath = CoreUtility.getAppContext().getFilesDir().getAbsolutePath();
        }
        String str2 = "/zalo/zam/";
        if (!str.endsWith("/zalo/zam/") && !str.endsWith("/zalo/zam_user/")) {
            if (!z11 && !z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                if (AbstractC19166g.m100564n()) {
                    str2 = "/zalo/zam_user/";
                }
                sb2.append(str2);
                sb2.append(str);
                return sb2.toString();
            }
            return absolutePath + "/zalo/zam/" + str;
        }
        return absolutePath + str;
    }

    /* renamed from: k */
    public static String m123208k(String str) {
        return m123209l(str, false, false, false);
    }

    /* renamed from: l */
    public static String m123209l(String str, boolean z11, boolean z12, boolean z13) {
        String absolutePath;
        if (z13) {
            absolutePath = AbstractC23204s0.m119554e().getAbsolutePath();
        } else {
            absolutePath = CoreUtility.getAppContext().getFilesDir().getAbsolutePath();
        }
        String str2 = "/zalo/zam_debug/";
        if (!str.endsWith("/zalo/zam_debug/") && !str.endsWith("/zalo/zam_user/")) {
            if (!z11 && !z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                if (AbstractC19166g.m100564n()) {
                    str2 = "/zalo/zam_user/";
                }
                sb2.append(str2);
                sb2.append(str);
                return sb2.toString();
            }
            return absolutePath + "/zalo/zam_debug/" + str;
        }
        return absolutePath + str;
    }

    /* renamed from: m */
    public static String m123210m(String str) {
        return m123209l(str, false, false, true);
    }

    /* renamed from: n */
    public static String m123211n(String str) {
        return m123207j(str, false, false, true);
    }

    /* renamed from: o */
    public static String m123212o(String str) {
        return m123207j(str, false, true, false);
    }

    /* renamed from: p */
    public static List m123213p(File file, long j11, int i11, int i12) {
        Object obj;
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        if (length <= i12) {
            return m123203f(file, j11, i11);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : listFiles) {
            arrayList2.add(new C1483e(file2.getPath(), Long.valueOf(m123204g(file2))));
        }
        Collections.sort(arrayList2, new Comparator() { // from class: mx.b
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int m123217t;
                m123217t = AbstractC23466c.m123217t((C1483e) obj2, (C1483e) obj3);
                return m123217t;
            }
        });
        for (int i13 = 0; i13 < length && i13 < i12; i13++) {
            C1483e c1483e = (C1483e) arrayList2.get(i13);
            if (c1483e != null && (obj = c1483e.f6375b) != null) {
                arrayList.add(AbstractC23477n.m123255c((String) c1483e.f6374a, ((Long) obj).longValue(), j11, i11, 3));
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public static File m123214q() {
        return new File(m123206i("/zalo/zam/"));
    }

    /* renamed from: r */
    public static List m123215r(boolean z11) {
        File file;
        if (z11) {
            file = new File(m123208k("/zalo/zam_debug/"));
        } else {
            file = new File(m123206i("/zalo/zam/"));
        }
        List list = f113980a;
        list.clear();
        m123202e(file);
        return list;
    }

    /* renamed from: s */
    public static String m123216s(String str, long j11, int i11, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/ZAM_" + str + "_zippedLog_" + j11);
        if (i11 > 0) {
            sb2.append("_" + i11);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("_" + str2.replace("/", "-"));
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append("_" + str3);
        }
        sb2.append(".zip");
        return sb2.toString();
    }

    /* renamed from: t */
    public static /* synthetic */ int m123217t(C1483e c1483e, C1483e c1483e2) {
        Object obj;
        Object obj2;
        if (c1483e != null && (obj = c1483e.f6375b) != null) {
            if (c1483e2 != null && (obj2 = c1483e2.f6375b) != null) {
                return -((Long) obj).compareTo((Long) obj2);
            }
            return -1;
        }
        return 1;
    }

    /* renamed from: u */
    public static void m123218u(Context context, List list) {
        int size = list.size();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((AbstractC32562b) list.get(i11)).toString());
        }
        m123221x(sb2.toString(), m123212o("disk/"));
    }

    /* renamed from: v */
    public static void m123219v(String str, String str2) {
        m123220w(str, str2, true);
    }

    /* renamed from: w */
    private static void m123220w(String str, String str2, boolean z11) {
        try {
            if (C23476m.m123248f() && !TextUtils.isEmpty(str)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                File file = new File(str2 + String.valueOf(calendar.getTimeInMillis()) + ".txt");
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                m123222y(str, file, true, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public static void m123221x(String str, String str2) {
        m123220w(str, str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: IOException -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x0060, blocks: (B:19:0x005c, B:86:0x008d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[Catch: all -> 0x001f, SYNTHETIC, TRY_LEAVE, TryCatch #18 {all -> 0x001f, blocks: (B:13:0x001b, B:15:0x0027, B:27:0x002c, B:30:0x0024, B:60:0x006c, B:52:0x0076, B:57:0x007e, B:56:0x007b, B:63:0x0071, B:43:0x0047, B:39:0x0051, B:46:0x004c), top: B:3:0x0001, inners: #0, #3, #12, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m123222y(String str, File file, boolean z11, boolean z12) {
        BufferedOutputStream bufferedOutputStream;
        BufferedWriter bufferedWriter;
        ?? fileWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream((File) file, z12));
                        try {
                            fileWriter = new FileWriter((File) file, z12);
                            try {
                                file = new BufferedWriter(fileWriter);
                            } catch (Exception e11) {
                                e = e11;
                                file = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                file = 0;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            file = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            file = 0;
                        }
                        try {
                            file.write(str);
                            file.flush();
                            try {
                                fileWriter.close();
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        } catch (Exception e14) {
                            e = e14;
                            bufferedWriter2 = fileWriter;
                            file = file;
                            try {
                                e.printStackTrace();
                                if (bufferedWriter2 != null) {
                                    try {
                                        bufferedWriter2.close();
                                    } catch (Exception e15) {
                                        e15.printStackTrace();
                                    }
                                }
                                if (file != 0) {
                                    try {
                                        file.close();
                                    } catch (Exception e16) {
                                        e = e16;
                                        e.printStackTrace();
                                        bufferedWriter = file;
                                        bufferedOutputStream.close();
                                        if (bufferedWriter == null) {
                                        }
                                    }
                                }
                                bufferedWriter = file;
                                bufferedOutputStream.close();
                                if (bufferedWriter == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (bufferedWriter2 != null) {
                                    try {
                                        bufferedWriter2.close();
                                    } catch (Exception e17) {
                                        e17.printStackTrace();
                                    }
                                }
                                if (file == 0) {
                                    try {
                                        file.close();
                                        throw th;
                                    } catch (Exception e18) {
                                        e18.printStackTrace();
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedWriter2 = fileWriter;
                            if (bufferedWriter2 != null) {
                            }
                            if (file == 0) {
                            }
                        }
                        try {
                            file.close();
                        } catch (Exception e19) {
                            e = e19;
                            e.printStackTrace();
                            bufferedWriter = file;
                            bufferedOutputStream.close();
                            if (bufferedWriter == null) {
                            }
                        }
                        bufferedWriter = file;
                        bufferedOutputStream.close();
                    } catch (Throwable th6) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (IOException e21) {
                    e21.printStackTrace();
                    if (0 != 0) {
                        bufferedWriter2.close();
                    } else {
                        return;
                    }
                }
                if (bufferedWriter == null) {
                    bufferedWriter.close();
                }
            } catch (Throwable th8) {
                if (0 != 0) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                }
                throw th8;
            }
        } catch (IOException e23) {
            e23.printStackTrace();
        }
    }
}
