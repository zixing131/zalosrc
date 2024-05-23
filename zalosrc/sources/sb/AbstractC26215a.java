package sb;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import p248iy.AbstractC20887g;
import p361nb.C23650g;

/* renamed from: sb.a */
/* loaded from: classes3.dex */
public abstract class AbstractC26215a {
    /* renamed from: a */
    public static boolean m134771a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:            if (r7 != null) goto L25;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m134772b(Context context, List list) {
        File file;
        FileOutputStream fileOutputStream;
        String m123951g;
        String str = "";
        if (list.size() == 0) {
            return "";
        }
        PrintWriter printWriter = 0;
        printWriter = 0;
        printWriter = 0;
        printWriter = 0;
        if (m134771a()) {
            file = new File(context.getExternalFilesDir(null), "" + System.currentTimeMillis());
        } else {
            file = new File(context.getFilesDir(), "" + System.currentTimeMillis());
        }
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            try {
                PrintWriter printWriter2 = new PrintWriter(fileOutputStream);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C23650g c23650g = (C23650g) it.next();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("1\t");
                        sb2.append(c23650g.m123945a());
                        sb2.append("\t");
                        if (c23650g.m123951g().equals("")) {
                            m123951g = "0";
                        } else {
                            m123951g = c23650g.m123951g();
                        }
                        sb2.append(m123951g);
                        sb2.append("\t0\t");
                        sb2.append(c23650g.m123952h());
                        sb2.append("\t");
                        sb2.append(c23650g.m123947c());
                        sb2.append("\t");
                        sb2.append(c23650g.m123946b());
                        sb2.append("\t");
                        sb2.append(c23650g.m123949e());
                        sb2.append("\t");
                        sb2.append(c23650g.m123948d());
                        sb2.append("\t");
                        sb2.append(c23650g.m123950f());
                        printWriter2.println(sb2.toString());
                    }
                    printWriter2.flush();
                    String absolutePath = file.getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(absolutePath);
                    printWriter = "_gzip";
                    sb3.append("_gzip");
                    str = sb3.toString();
                    AbstractC20887g.m109227e(absolutePath, str);
                    printWriter2.close();
                } catch (Exception e12) {
                    e = e12;
                    printWriter = printWriter2;
                    e.printStackTrace();
                    if (printWriter != 0) {
                        printWriter.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    printWriter = printWriter2;
                    if (printWriter != 0) {
                        printWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    file.delete();
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
            }
            fileOutputStream.close();
            file.delete();
            return str;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
