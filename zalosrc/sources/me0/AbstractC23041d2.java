package me0;

import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import mm0.AbstractC23350e;
import p239ih.C20551a;
import p239ih.C20556f;
import p324lh.AbstractC22485a;

/* renamed from: me0.d2 */
/* loaded from: classes.dex */
public abstract class AbstractC23041d2 {

    /* renamed from: a */
    private static final SimpleDateFormat f112042a = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    /* renamed from: A */
    public static boolean m118194A(String str) {
        return new C20556f(str).m106830b();
    }

    /* renamed from: B */
    public static boolean m118195B(String str) {
        try {
            File file = new File(str);
            if (!file.isDirectory() && !file.isFile()) {
                return false;
            }
            if (file.getCanonicalPath().startsWith(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: C */
    public static String m118196C(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append("\n");
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    bufferedReader.close();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            } catch (Exception e12) {
                e = e12;
                AbstractC20110a.m104539h(e);
                return sb2.toString();
            }
        } catch (OutOfMemoryError e13) {
            e = e13;
            AbstractC20110a.m104539h(e);
            return sb2.toString();
        }
        return sb2.toString();
    }

    /* renamed from: D */
    public static String m118197D(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb2.append(readLine);
                            } else {
                                String sb3 = sb2.toString();
                                bufferedReader.close();
                                inputStreamReader.close();
                                fileInputStream.close();
                                return sb3;
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: E */
    public static String m118198E(File file) {
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        int length = (int) file.length();
                        byte[] bArr = new byte[length];
                        int i11 = 0;
                        while (length > 0) {
                            int read = fileInputStream2.read(bArr, i11, length);
                            if (read >= 0) {
                                i11 += read;
                                length -= read;
                            } else {
                                throw new IOException();
                            }
                        }
                        String str = new String(bArr);
                        try {
                            fileInputStream2.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        return str;
                    } catch (Exception e12) {
                        e = e12;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return "";
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                return "";
                            }
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e14) {
                                e14.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                return "";
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    /* renamed from: F */
    public static String m118199F(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: G */
    public static File m118200G(File file, String str) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        File m118200G = m118200G(file2, str);
                        if (m118200G != null) {
                            return m118200G;
                        }
                    }
                    return null;
                }
                return null;
            }
            if (file.getName().equals(str)) {
                return file;
            }
            return null;
        }
        return null;
    }

    /* renamed from: H */
    public static void m118201H(String str, String str2) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str), false));
            try {
                bufferedWriter.write(str2);
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a */
    public static void m118202a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && file.exists()) {
                m118203b(file);
            }
        }
    }

    /* renamed from: b */
    public static void m118203b(File file) {
        File[] listFiles;
        if (file != null && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m118203b(file2);
                }
                file2.delete();
            }
        }
    }

    /* renamed from: c */
    public static String m118204c(String str, String str2) {
        String str3;
        try {
            File file = new File(str);
            if (file.exists()) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf <= -1) {
                    str3 = "";
                } else {
                    str3 = name.substring(lastIndexOf + 1);
                }
                if (TextUtils.isEmpty(str3) || !C20551a.m106808c(str3)) {
                    if (lastIndexOf == -1) {
                        File file2 = new File(str2, name + ".jpg");
                        if (!file2.exists()) {
                            AbstractC23238v2.m119717b(new File(str), file2);
                        }
                        str = file2.getAbsolutePath();
                    }
                }
                return str;
            }
            str = "";
            return str;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: d */
    public static String m118205d(String str, String str2) {
        boolean endsWith = str.endsWith("/");
        boolean startsWith = str2.startsWith("/");
        if (endsWith && startsWith) {
            return str + str2.substring(1);
        }
        if (!endsWith && !startsWith) {
            return str + "/" + str2;
        }
        return str + str2;
    }

    /* renamed from: e */
    public static boolean m118206e(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            m118206e(file2);
                        }
                    }
                    return file.delete();
                }
                return true;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static void m118207f(File file) {
        try {
            if (!file.exists()) {
                return;
            }
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                m118207f(file2);
            }
            file.delete();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    public static void m118208g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: h */
    public static void m118209h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            file.delete();
        }
    }

    /* renamed from: i */
    public static boolean m118210i(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                m118210i(file2);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                    return file.delete();
                }
                return true;
            } catch (Throwable th2) {
                AbstractC20110a.m104539h(th2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static void m118211j(File file) {
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                for (File file2 : listFiles) {
                    m118211j(file2);
                }
            }
            file.delete();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    public static String m118212k(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return "";
    }

    /* renamed from: l */
    public static String m118213l(long j11) {
        if (j11 < 1024) {
            return String.format("%d B", Long.valueOf(j11));
        }
        if (j11 < 1048576) {
            return String.format("%.1f KB", Float.valueOf(((float) j11) / 1024.0f));
        }
        if (j11 < 1073741824) {
            return String.format("%.1f MB", Float.valueOf((((float) j11) / 1024.0f) / 1024.0f));
        }
        return String.format("%.1f GB", Float.valueOf(((((float) j11) / 1024.0f) / 1024.0f) / 1024.0f));
    }

    /* renamed from: m */
    public static String m118214m(Locale locale, long j11) {
        if (j11 < 1024) {
            return String.format(locale, "%d B", Long.valueOf(j11));
        }
        if (j11 < 1048576) {
            return String.format(locale, "%.1f KB", Float.valueOf(((float) j11) / 1024.0f));
        }
        if (j11 < 1073741824) {
            return String.format(locale, "%.1f MB", Float.valueOf((((float) j11) / 1024.0f) / 1024.0f));
        }
        return String.format(locale, "%.1f GB", Float.valueOf(((((float) j11) / 1024.0f) / 1024.0f) / 1024.0f));
    }

    /* renamed from: n */
    public static String m118215n(long j11) {
        if (j11 < 1024) {
            return String.format("%d B", Long.valueOf(j11));
        }
        if (j11 < 1048576) {
            return String.format("%d KB", Long.valueOf(j11 / 1024));
        }
        if (j11 < 1073741824) {
            return String.format("%d MB", Long.valueOf((j11 / 1024) / 1024));
        }
        return String.format("%d GB", Long.valueOf(((j11 / 1024) / 1024) / 1024));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:            if (android.text.TextUtils.isEmpty(r4) != false) goto L48;     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m118216o(String str) {
        String str2;
        String str3 = "";
        try {
            if (AbstractC23254w8.m119859g(str)) {
                Uri m119853a = AbstractC23254w8.m119853a(str);
                if (m119853a == null) {
                    return "";
                }
                str2 = AbstractC22485a.m116268a(CoreUtility.getAppContext().getContentResolver().getType(m119853a));
                try {
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } else {
                str3 = m118222u(str, false, !str.startsWith("http"));
            }
        } catch (Exception e12) {
            str2 = str3;
            AbstractC20110a.m104539h(e12);
        }
        return str3;
        str3 = str2;
        return str3;
    }

    /* renamed from: p */
    public static String m118217p(String str) {
        return m118222u(str, false, false);
    }

    /* renamed from: q */
    public static File m118218q(String str) {
        try {
            return new File(str);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: r */
    public static double m118219r(String str) {
        return new C20556f(str).m106832d();
    }

    /* renamed from: s */
    public static String m118220s(String str) {
        return m118221t(str, true);
    }

    /* renamed from: t */
    public static String m118221t(String str, boolean z11) {
        return m118222u(str, z11, true);
    }

    /* renamed from: u */
    public static String m118222u(String str, boolean z11, boolean z12) {
        int i11;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int lastIndexOf = str.lastIndexOf("?e2esession");
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            if (z12) {
                i11 = str.lastIndexOf("/");
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                str = str.substring(i11 + 1);
            }
            int lastIndexOf2 = str.lastIndexOf(".") + (!z11 ? 1 : 0);
            if (lastIndexOf2 <= 0) {
                return "";
            }
            return str.substring(lastIndexOf2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: v */
    public static long m118223v(File file) {
        File[] listFiles;
        long j11 = 0;
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return file.length();
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove(0);
                if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                    for (File file3 : listFiles) {
                        if (!file3.isDirectory()) {
                            j11 += file3.length();
                        } else {
                            linkedList.add(file3);
                        }
                    }
                }
            }
        }
        return j11;
    }

    /* renamed from: w */
    public static long m118224w(String str) {
        return new C20556f(str).m106845r();
    }

    /* renamed from: x */
    public static String m118225x(String str) {
        if (str != null && !str.isEmpty()) {
            return str.substring(0, str.lastIndexOf(File.separator));
        }
        return "";
    }

    /* renamed from: y */
    public static String m118226y(long j11) {
        String str;
        try {
            if (j11 < 1024) {
                return j11 + "B";
            }
            double d11 = j11;
            double d12 = 1024;
            int log = (int) (Math.log(d11) / Math.log(d12));
            String str2 = "KMGTPE".charAt(log - 1) + "";
            if (str2.equals("K")) {
                str = "%.0f %sB";
            } else {
                str = "%.2f %sB";
            }
            return String.format(str, Double.valueOf(d11 / Math.pow(d12, log)), str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: z */
    public static String m118227z(long j11, boolean z11) {
        int i11;
        String str;
        if (z11) {
            i11 = 1000;
        } else {
            i11 = 1024;
        }
        if (j11 < i11) {
            return j11 + " B";
        }
        double d11 = j11;
        double d12 = i11;
        int log = (int) (Math.log(d11) / Math.log(d12));
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            str = "kmgtpe";
        } else {
            str = "KMGTPE";
        }
        sb2.append(str.charAt(log - 1));
        sb2.append("");
        return String.format("%.1f %sB", Double.valueOf(d11 / Math.pow(d12, log)), sb2.toString());
    }
}
