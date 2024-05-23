package jh0;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import fh0.C18938c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Locale;

/* renamed from: jh0.a */
/* loaded from: classes.dex */
public abstract class AbstractC21254a {

    /* renamed from: a */
    public static Boolean f103559a = Boolean.FALSE;

    /* renamed from: b */
    private static int f103560b = 5;

    /* renamed from: a */
    public static void m110059a(String str) {
        m110060b("ZDK", str);
    }

    /* renamed from: b */
    public static void m110060b(String str, String str2) {
        m110064f(3, str, str2);
    }

    /* renamed from: c */
    public static void m110061c(Exception exc) {
        m110062d("ZDK", exc);
    }

    /* renamed from: d */
    public static void m110062d(String str, Exception exc) {
        m110064f(6, str, Log.getStackTraceString(exc));
    }

    /* renamed from: e */
    public static void m110063e(String str, String str2) {
        m110064f(6, str, str2);
    }

    /* renamed from: f */
    private static void m110064f(int i11, String str, String str2) {
        if (i11 < f103560b) {
            return;
        }
        Log.println(i11, str, str2);
        m110074p(i11, str, str2);
    }

    /* renamed from: g */
    private static void m110065g(int i11, String str, String str2, Object... objArr) {
        if (str2 == null) {
            return;
        }
        String format = String.format(Locale.getDefault(), str2, objArr);
        m110064f(i11, str, format);
        m110074p(i11, str, format);
    }

    /* renamed from: h */
    private static File m110066h() {
        Context m99239a = C18938c.m99237b().m99239a();
        if (m99239a == null) {
            return null;
        }
        File file = new File(m99239a.getExternalFilesDir(null) + "zalosdk-log-trace.txt");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        return file;
    }

    /* renamed from: i */
    private static void m110067i() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/com.google.android.zdt.data/zalosdk-log-trace.txt");
        file.getParentFile().mkdirs();
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: j */
    public static void m110068j(String str) {
        m110069k("ZDK", str);
    }

    /* renamed from: k */
    public static void m110069k(String str, String str2) {
        m110064f(2, str, str2);
    }

    /* renamed from: l */
    public static void m110070l(String str, String str2, Object... objArr) {
        m110065g(2, str, str2, objArr);
    }

    /* renamed from: m */
    public static void m110071m(String str) {
        m110072n("ZDK", str);
    }

    /* renamed from: n */
    public static void m110072n(String str, String str2) {
        m110064f(5, str, str2);
    }

    /* renamed from: o */
    private static void m110073o(String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write(str);
        outputStreamWriter.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /* renamed from: p */
    private static void m110074p(int i11, String str, String str2) {
        if (f103559a.booleanValue()) {
            if (i11 == 6 || i11 == 5) {
                m110075q(str + "\n\t" + str2 + "\n\n");
                return;
            }
            return;
        }
        m110067i();
    }

    /* renamed from: q */
    private static void m110075q(String str) {
        try {
            m110073o(str, m110066h());
        } catch (Exception unused) {
        }
    }
}
