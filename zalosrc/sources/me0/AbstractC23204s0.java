package me0;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: me0.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC23204s0 {
    /* renamed from: a */
    public static void m119550a(String str) {
        try {
            File file = new File(str + ".nomedia");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public static String m119551b(String str) {
        File cacheDir;
        String m119552c = m119552c(str);
        if (TextUtils.isEmpty(m119552c)) {
            try {
                cacheDir = new File(CoreUtility.getAppContext().getCacheDir(), str);
                cacheDir.mkdirs();
            } catch (Exception e11) {
                cacheDir = CoreUtility.getAppContext().getCacheDir();
                AbstractC20110a.m104539h(e11);
            }
            return cacheDir.getAbsolutePath();
        }
        return m119552c;
    }

    /* renamed from: c */
    public static String m119552c(String str) {
        return AbstractC23150n1.m118951l(str);
    }

    /* renamed from: d */
    public static String m119553d(String str, boolean z11) {
        return AbstractC23150n1.m118972u(str, z11);
    }

    /* renamed from: e */
    public static File m119554e() {
        return AbstractC23150n1.m118982z();
    }

    /* renamed from: f */
    public static String m119555f() {
        return AbstractC23150n1.m118872D();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m119556g() {
        BufferedReader bufferedReader;
        Throwable th2;
        Exception e11;
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                if (!readLine.contains("vfat") && !readLine.contains("/mnt")) {
                                }
                                StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                                stringTokenizer.nextToken();
                                String nextToken = stringTokenizer.nextToken();
                                if (!arrayList.contains(nextToken) && readLine.contains("/dev/block/vold") && !readLine.contains("/mnt/secure") && !readLine.contains("/mnt/asec") && !readLine.contains("/mnt/obb") && !readLine.contains("/dev/mapper") && !readLine.contains("tmpfs")) {
                                    if (!new File(nextToken).isDirectory() && (lastIndexOf = nextToken.lastIndexOf(47)) != -1) {
                                        String str = "/storage/" + nextToken.substring(lastIndexOf + 1);
                                        if (new File(str).isDirectory()) {
                                            nextToken = str;
                                        }
                                    }
                                    arrayList.add(nextToken);
                                }
                            } else {
                                try {
                                    break;
                                } catch (Exception e12) {
                                    e = e12;
                                    e.printStackTrace();
                                    return arrayList;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    } catch (Exception e14) {
                        e11 = e14;
                        e11.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e15) {
                                e = e15;
                                e.printStackTrace();
                                return arrayList;
                            }
                        }
                        return arrayList;
                    }
                }
                bufferedReader.close();
            } catch (Exception e16) {
                bufferedReader = null;
                e11 = e16;
            } catch (Throwable th4) {
                bufferedReader = null;
                th2 = th4;
                if (bufferedReader != null) {
                }
                throw th2;
            }
        } catch (Exception e17) {
            e17.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: h */
    public static File m119557h() {
        String m118932e1 = AbstractC23150n1.m118932e1();
        File file = new File(m118932e1);
        m119550a(m118932e1);
        return file;
    }

    /* renamed from: i */
    public static File m119558i() {
        String m118941h1 = AbstractC23150n1.m118941h1();
        File file = new File(m118941h1);
        m119550a(m118941h1);
        return file;
    }
}
