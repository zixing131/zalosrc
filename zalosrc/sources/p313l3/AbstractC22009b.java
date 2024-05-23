package p313l3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.AbstractC1388a;
import com.adtima.Adtima;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: l3.b */
/* loaded from: classes2.dex */
public abstract class AbstractC22009b {

    /* renamed from: a */
    private static final String f108377a = "b";

    /* renamed from: a */
    public static Uri m114894a(Context context, String str) {
        Uri uri = null;
        try {
            Uri contentUri = MediaStore.Files.getContentUri("external");
            Cursor query = context.getContentResolver().query(contentUri, new String[]{"_id"}, "_display_name LIKE ?", new String[]{str}, null);
            if (query != null && query.moveToFirst()) {
                uri = Uri.withAppendedPath(contentUri, String.valueOf(query.getLong(query.getColumnIndex("_id"))));
                if (uri != null) {
                    Adtima.m18328e(f108377a, "getUriFromFilePath : " + uri.getPath());
                }
                query.close();
            }
        } catch (Exception e11) {
            Adtima.m18328e(f108377a, e11.getMessage());
        }
        return uri;
    }

    /* renamed from: b */
    public static String m114895b(String str) {
        try {
            File file = new File(str);
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m114896c() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m114897d(Context context) {
        try {
            return AbstractC1388a.m6959a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m114898e(Context context, Uri uri) {
        try {
            return context.getContentResolver().delete(uri, null, null) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:            if (r6 == null) goto L47;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m114899f(Context context, String str) {
        IOException e11;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
        } catch (Exception e12) {
            Adtima.m18329e(f108377a, "readFromExternalFile4", e12);
            return str2;
        }
        if (!m114896c() || !m114897d(context)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Uri m114894a = m114894a(context, ((String) str) + ".aac");
            if (m114894a == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getContentResolver().openInputStream(m114894a)));
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        Adtima.m18328e(f108377a, "readFromExternalFile: " + str2);
                        return str2;
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                    }
                    str2 = readLine;
                }
            } catch (Exception e13) {
                Adtima.m18329e(f108377a, "readFromExternalFile1", e13);
                return str2;
            }
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                try {
                    bufferedReader = new BufferedReader(new FileReader(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), ((String) str) + ".aac")));
                } catch (IOException e14) {
                    e11 = e14;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th;
                }
                while (true) {
                    try {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            sb2.append(readLine2);
                            sb2.append("\n");
                        }
                    } catch (IOException e16) {
                        e11 = e16;
                        Adtima.m18329e(f108377a, "readFromExternalFile2", e11);
                    }
                    try {
                        break;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                Adtima.m18328e(f108377a, "readFromExternalFile3: " + sb3);
                return sb3;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Adtima.m18329e(f108377a, "readFromExternalFile4", e12);
        return str2;
    }
}
