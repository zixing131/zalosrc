package com.androidquery.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import fg0.ThreadFactoryC18928a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p379o3.C23999j;
import p620wt.AbstractC29237l;
import sh0.C26253e;

/* renamed from: com.androidquery.util.e */
/* loaded from: classes.dex */
public abstract class AbstractC3972e {

    /* renamed from: f */
    private static Object f15698f;

    /* renamed from: g */
    private static Thread.UncaughtExceptionHandler f15699g;

    /* renamed from: i */
    private static Handler f15701i;

    /* renamed from: j */
    private static ScheduledExecutorService f15702j;

    /* renamed from: k */
    private static File f15703k;

    /* renamed from: l */
    private static File f15704l;

    /* renamed from: m */
    private static File f15705m;

    /* renamed from: n */
    private static File f15706n;

    /* renamed from: o */
    private static Context f15707o;

    /* renamed from: a */
    public static int[] f15693a = {10000, 10000, 10000, 20000, 10000};

    /* renamed from: b */
    public static int[] f15694b = {15000, 15000, 15000, 20000, 15000};

    /* renamed from: c */
    public static int[] f15695c = {15000, 15000, 15000, 20000, 15000};

    /* renamed from: d */
    protected static final String f15696d = AbstractC3972e.class.getSimpleName();

    /* renamed from: e */
    private static boolean f15697e = false;

    /* renamed from: h */
    private static final Map f15700h = new HashMap();

    /* renamed from: p */
    private static final FileFilter f15708p = new FileFilter() { // from class: com.androidquery.util.b
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            boolean m18768Y;
            m18768Y = AbstractC3972e.m18768Y(file);
            return m18768Y;
        }
    };

    /* renamed from: q */
    public static Pattern f15709q = Pattern.compile("[\\-0-9]+");

    /* renamed from: A */
    public static String m18744A() {
        return AbstractC20130d.m104831G();
    }

    /* renamed from: B */
    public static File m18745B(File file, String str) {
        File m18808u = m18808u(file, str);
        if (m18808u != null && m18808u.exists()) {
            return m18808u;
        }
        return null;
    }

    /* renamed from: C */
    public static File m18746C(File file, String str, int i11) {
        File m18809v = m18809v(file, str, i11);
        if (m18809v != null && m18809v.exists()) {
            return m18809v;
        }
        return null;
    }

    /* renamed from: D */
    public static File m18747D(File file, String str) {
        File m18745B = m18745B(file, str);
        if (m18745B != null) {
            m18769Z(m18745B);
        }
        return m18745B;
    }

    /* renamed from: E */
    public static File m18748E(File file, String str, int i11) {
        File m18746C = m18746C(file, str, i11);
        if (m18746C != null) {
            m18769Z(m18746C);
        }
        return m18746C;
    }

    /* renamed from: F */
    public static File m18749F(Context context) {
        if (f15705m == null) {
            File file = new File(context.getCacheDir(), "aquery");
            f15705m = file;
            file.mkdirs();
        }
        return f15705m;
    }

    /* renamed from: G */
    public static File m18750G(Context context, int i11) {
        if (i11 == 1) {
            File file = f15706n;
            if (file != null) {
                return file;
            }
            File file2 = new File(m18749F(context), "persistent");
            f15706n = file2;
            file2.mkdirs();
            return f15706n;
        }
        return m18749F(context);
    }

    /* renamed from: H */
    private static ScheduledExecutorService m18751H() {
        if (f15702j == null) {
            f15702j = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18928a("AQUtility"));
        }
        return f15702j;
    }

    /* renamed from: I */
    public static Handler m18752I() {
        if (f15701i == null) {
            f15701i = new Handler(Looper.getMainLooper());
        }
        return f15701i;
    }

    /* renamed from: J */
    private static byte[] m18753J(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e11) {
            m18779e0(e11);
            return null;
        }
    }

    /* renamed from: K */
    private static String m18754K(String str) {
        return new BigInteger(m18753J(str.getBytes())).abs().toString(36);
    }

    /* renamed from: L */
    public static int m18755L(int i11) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f15707o.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return f15694b[i11];
            }
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1) {
                return f15693a[i11];
            }
            if (type == 0 && (subtype == 1 || subtype == 2)) {
                return f15695c[i11];
            }
            return f15694b[i11];
        } catch (Exception e11) {
            e11.printStackTrace();
            return f15694b[i11];
        }
    }

    /* renamed from: M */
    public static Resources m18756M() {
        return m18812y().getResources();
    }

    /* renamed from: N */
    public static String m18757N(String str, int i11) {
        try {
            File file = new File(str);
            if (!file.exists() || !file.isDirectory()) {
                return "";
            }
            File[] listFiles = file.listFiles(f15708p);
            if (listFiles != null && i11 >= listFiles.length) {
                i11 = 0;
            }
            if (listFiles == null || listFiles.length <= 0) {
                return "";
            }
            Arrays.sort(listFiles, new Comparator() { // from class: com.androidquery.util.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m18767X;
                    m18767X = AbstractC3972e.m18767X((File) obj, (File) obj2);
                    return m18767X;
                }
            });
            return listFiles[i11].getAbsolutePath();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: O */
    public static File m18758O() {
        File file = new File(m18806s(f15707o), "temp");
        file.mkdirs();
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* renamed from: P */
    public static String m18759P(String str) {
        URL url;
        String str2;
        String m18863c;
        try {
            url = new URL(str);
            str2 = url.getProtocol() + "://" + url.getHost();
            m18863c = C3982o.m18861d().m18863c(str2);
        } catch (Exception e11) {
            AbstractC20110a.m104540i(e11, "url: %s", str);
        }
        if (!m18863c.equals("")) {
            String replace = str.replace(str2, m18863c);
            AbstractC20110a.m104535d("MappingDomain: %s -> %s", str, replace);
            return replace;
        }
        String host = url.getHost();
        String m18863c2 = C3982o.m18861d().m18863c(host);
        if (!m18863c2.equals("")) {
            String replace2 = str.replace(host, m18863c2);
            AbstractC20110a.m104535d("MappingDomain: %s -> %s", str, replace2);
            return replace2;
        }
        return str;
    }

    /* renamed from: Q */
    public static Object m18760Q(Object obj, String str, boolean z11, boolean z12, Class[] clsArr, Class[] clsArr2, Object... objArr) {
        try {
            return m18762S(obj, str, z11, clsArr, clsArr2, objArr);
        } catch (Exception e11) {
            if (z12) {
                m18779e0(e11);
                return null;
            }
            m18796n(e11);
            return null;
        }
    }

    /* renamed from: R */
    public static Object m18761R(Object obj, String str, boolean z11, boolean z12, Class[] clsArr, Object... objArr) {
        return m18760Q(obj, str, z11, z12, clsArr, null, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    private static Object m18762S(Object obj, String str, boolean z11, Class[] clsArr, Class[] clsArr2, Object... objArr) {
        if (obj != null && str != null) {
            if (clsArr == null) {
                try {
                    clsArr = new Class[0];
                } catch (NoSuchMethodException unused) {
                    if (z11) {
                        try {
                            if (clsArr2 == null) {
                                return obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
                            }
                            return obj.getClass().getMethod(str, clsArr2).invoke(obj, objArr);
                        } catch (NoSuchMethodException e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                }
            }
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        }
        return null;
    }

    /* renamed from: T */
    public static boolean m18763T() {
        return C23999j.f116213f1;
    }

    /* renamed from: U */
    public static boolean m18764U() {
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m18765V() {
        return C23999j.f116212e1;
    }

    /* renamed from: W */
    public static /* synthetic */ boolean m18766W(File file, String str) {
        return str.toLowerCase().endsWith(".png");
    }

    /* renamed from: X */
    public static /* synthetic */ int m18767X(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }

    /* renamed from: Y */
    public static /* synthetic */ boolean m18768Y(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        String m118220s = AbstractC23041d2.m118220s(file.getAbsolutePath());
        if (TextUtils.isEmpty(m118220s)) {
            return false;
        }
        if (!m118220s.equalsIgnoreCase(".png") && !m118220s.equalsIgnoreCase(".jpg")) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private static void m18769Z(File file) {
        file.setLastModified(System.currentTimeMillis());
    }

    /* renamed from: a0 */
    private static File m18771a0(File file, String str) {
        return new File(file, str);
    }

    /* renamed from: b0 */
    public static Integer m18773b0(String str) {
        int i11 = 0;
        if (str == null) {
            return i11;
        }
        try {
            Matcher matcher = f15709q.matcher(str);
            if (matcher.find()) {
                return Integer.valueOf(Integer.parseInt(matcher.group(0)));
            }
            return i11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return i11;
        }
    }

    /* renamed from: c0 */
    public static void m18775c0(Runnable runnable) {
        m18752I().post(runnable);
    }

    /* renamed from: d */
    public static boolean m18776d(String str) {
        File file = new File(str);
        if (file.length() >= 24) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[16];
                    if (fileInputStream.read(bArr, 0, 16) == 16) {
                        boolean m119960s = AbstractC23258x2.m119960s(bArr);
                        fileInputStream.close();
                        return m119960s;
                    }
                    fileInputStream.close();
                } finally {
                }
            } catch (IOException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: d0 */
    public static void m18777d0(Runnable runnable, long j11) {
        m18752I().postDelayed(runnable, j11);
    }

    /* renamed from: e */
    public static void m18778e(File file, long j11, long j12) {
        File[] listFiles;
        try {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 == null) {
                return;
            }
            Arrays.sort(listFiles2, new RunnableC3975h());
            if (m18799o0(listFiles2, j11)) {
                m18780f(listFiles2, j12);
            }
            File m18758O = m18758O();
            if (m18758O != null && m18758O.exists() && (listFiles = m18758O.listFiles()) != null) {
                m18780f(listFiles, 0L);
            }
        } catch (Exception e11) {
            m18779e0(e11);
        }
    }

    /* renamed from: e0 */
    public static void m18779e0(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            m18803q0("reporting", AbstractC23350e.m122779i(th2));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f15699g;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    private static void m18780f(File[] fileArr, long j11) {
        long j12 = 0;
        int i11 = 0;
        for (File file : fileArr) {
            if (file.isFile()) {
                j12 += file.length();
                if (j12 >= j11) {
                    file.delete();
                    i11++;
                }
            }
        }
        m18794m("deleted", Integer.valueOf(i11));
    }

    /* renamed from: f0 */
    public static void m18781f0(InterfaceC3968a interfaceC3968a) {
        if (interfaceC3968a != null) {
            try {
                interfaceC3968a.setImageInfo(null);
                interfaceC3968a.setTag(1090453505, null);
                interfaceC3968a.setTag(1090453509, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public static void m18782g(Context context, long j11, long j12) {
        try {
            m18751H().schedule(new RunnableC3975h().m18832e(2, m18806s(context), Long.valueOf(j11), Long.valueOf(j12)), 0L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            m18779e0(e11);
        }
    }

    /* renamed from: g0 */
    public static void m18783g0(InterfaceC3968a interfaceC3968a) {
        if (interfaceC3968a != null) {
            try {
                interfaceC3968a.setTag(1090453505, null);
                interfaceC3968a.setTag(1090453509, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public static void m18784h() {
        File file = new File(AbstractC23204s0.m119554e().getPath() + "/zalo/full_thumbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: h0 */
    public static boolean m18785h0() {
        if (!Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("unmounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
            return false;
        }
        StatFs statFs = new StatFs(AbstractC23204s0.m119554e().getPath());
        if ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576 <= 5) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[Catch: Exception -> 0x0137, TryCatch #1 {Exception -> 0x0137, blocks: (B:54:0x0105, B:56:0x010b, B:58:0x012c, B:60:0x012f), top: B:53:0x0105 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m18786i(String str, int i11) {
        File file;
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            if (AbstractC23041d2.m118194A(str)) {
                String parent = new File(str).getParent();
                file = new File(parent);
                try {
                    String str2 = parent + "/metadata";
                    C26253e m135004b = C26253e.Companion.m135004b(str, 2);
                    int mo88375b = m135004b.mo88375b();
                    if (mo88375b > 0) {
                        ArrayList arrayList = new ArrayList();
                        bitmap = null;
                        for (int i12 = 0; i12 < mo88375b; i12++) {
                            arrayList.add(Integer.valueOf(m135004b.mo88376c(i12)));
                            Bitmap mo88377d = m135004b.mo88377d(i12);
                            if (mo88377d != null) {
                                if (m18787i0()) {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(parent + "/" + (i12 + 1) + ".png"));
                                    mo88377d.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                }
                                if (i12 == i11) {
                                    bitmap = mo88377d;
                                }
                            }
                        }
                        if (AbstractC23041d2.m118194A(str2)) {
                            AbstractC23041d2.m118208g(str2);
                        }
                        if (bitmap != null) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            if (arrayList.size() > 0) {
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    jSONArray.put(arrayList.get(i13));
                                }
                            } else {
                                jSONArray.put(200);
                            }
                            jSONObject.put("duration", jSONArray);
                            jSONObject.put("fkey", i11);
                            String jSONObject2 = jSONObject.toString();
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str2), true));
                            try {
                                bufferedWriter.write(jSONObject2);
                                bufferedWriter.flush();
                                bufferedWriter.close();
                            } finally {
                            }
                        }
                    } else {
                        bitmap = null;
                    }
                    m135004b.mo88374a();
                    bitmap2 = bitmap;
                } catch (Exception e11) {
                    e = e11;
                    AbstractC23350e.m122778h(e);
                    if (bitmap2 == null) {
                        try {
                            if (file.exists()) {
                            }
                        } catch (Exception e12) {
                            AbstractC23350e.m122778h(e12);
                        }
                    }
                    return bitmap2;
                }
            } else {
                file = null;
            }
        } catch (Exception e13) {
            e = e13;
            file = null;
        }
        if (bitmap2 == null && file != null) {
            if (file.exists()) {
                AbstractC23041d2.m118208g(file.getPath() + "/metadata");
                File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.androidquery.util.d
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str3) {
                        boolean m18766W;
                        m18766W = AbstractC3972e.m18766W(file2, str3);
                        return m18766W;
                    }
                });
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
            }
        }
        return bitmap2;
    }

    /* renamed from: i0 */
    public static boolean m18787i0() {
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: j */
    public static void m18788j(InputStream inputStream, OutputStream outputStream) {
        m18790k(inputStream, outputStream, 0, null);
    }

    /* renamed from: j0 */
    public static void m18789j0(File file) {
        f15703k = file;
        if (file != null) {
            file.mkdirs();
        }
    }

    /* renamed from: k */
    public static void m18790k(InputStream inputStream, OutputStream outputStream, int i11, RunnableC3984q runnableC3984q) {
        m18794m("content header", Integer.valueOf(i11));
        if (runnableC3984q != null) {
            runnableC3984q.m18870d();
            runnableC3984q.m18871e(i11);
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            if (runnableC3984q != null) {
                runnableC3984q.m18869c(read);
            }
        }
        if (runnableC3984q != null) {
            runnableC3984q.m18868b();
        }
    }

    /* renamed from: k0 */
    public static void m18791k0(Context context) {
        f15707o = context.getApplicationContext();
    }

    /* renamed from: l */
    public static void m18792l(Object obj) {
        if (f15697e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("");
        }
    }

    /* renamed from: l0 */
    public static void m18793l0(File file) {
        f15705m = file;
        if (file != null) {
            file.mkdirs();
        }
    }

    /* renamed from: m */
    public static void m18794m(Object obj, Object obj2) {
        if (f15697e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(":");
            sb2.append(obj2);
        }
    }

    /* renamed from: m0 */
    public static void m18795m0(File file, byte[] bArr) {
        if (file != null) {
            try {
                m18805r0(file, bArr);
            } catch (Exception e11) {
                m18779e0(e11);
            }
        }
    }

    /* renamed from: n */
    public static void m18796n(Throwable th2) {
        if (f15697e) {
            AbstractC23350e.m122779i(th2);
        }
    }

    /* renamed from: n0 */
    public static void m18797n0(File file, byte[] bArr, long j11) {
        m18751H().schedule(new RunnableC3975h().m18832e(1, file, bArr), j11, TimeUnit.MILLISECONDS);
    }

    /* renamed from: o */
    public static void m18798o() {
        Object obj;
        if (f15697e && (obj = f15698f) != null) {
            synchronized (obj) {
                f15698f.notifyAll();
            }
        }
    }

    /* renamed from: o0 */
    private static boolean m18799o0(File[] fileArr, long j11) {
        long j12 = 0;
        for (File file : fileArr) {
            j12 += file.length();
            if (j12 > j11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static Bitmap m18800p(Drawable drawable) {
        Bitmap bitmap = null;
        if (drawable == null) {
            return null;
        }
        try {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (Exception e11) {
            e11.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: p0 */
    public static byte[] m18801p0(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m18788j(inputStream, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            m18779e0(e11);
            bArr = null;
        }
        AbstractC29237l.m145996a(inputStream);
        return bArr;
    }

    /* renamed from: q */
    public static Bitmap m18802q(int i11, String str, int i12, String str2) {
        Bitmap bitmap = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                C26253e m135004b = C26253e.Companion.m135004b(str, 2);
                try {
                    File m18745B = m18745B(m18807t(f15707o, 1), str2);
                    if (m18745B == null) {
                        m18745B = m18745B(m18807t(f15707o, 0), str2);
                    }
                    if (m18745B != null && m18745B.exists()) {
                        m18745B.delete();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                if (!new File(str2).exists()) {
                    String str3 = C20131e.f99303a.m104946c0() + i11;
                    if (!AbstractC23041d2.m118194A(str3)) {
                        new File(str3).mkdir();
                    }
                    if (m135004b != null) {
                        bitmap = m135004b.mo88377d(i12);
                    }
                    try {
                        if (m18787i0() && bitmap != null && !str2.equals("")) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                    } catch (Exception e12) {
                        AbstractC23350e.m122778h(e12);
                        if (AbstractC23041d2.m118194A(str2)) {
                            AbstractC23041d2.m118208g(str2);
                        }
                    }
                }
                if (m135004b != null) {
                    m135004b.mo88374a();
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122778h(e13);
        }
        return bitmap;
    }

    /* renamed from: q0 */
    public static void m18803q0(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(":");
        sb2.append(obj2);
    }

    /* renamed from: r */
    public static String m18804r() {
        return AbstractC20130d.m104895t();
    }

    /* renamed from: r0 */
    public static void m18805r0(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e11) {
            m18779e0(e11);
        }
    }

    /* renamed from: s */
    public static File m18806s(Context context) {
        if (f15703k == null) {
            File file = new File(context.getCacheDir(), "aquery");
            f15703k = file;
            file.mkdirs();
        }
        return f15703k;
    }

    /* renamed from: t */
    public static File m18807t(Context context, int i11) {
        if (i11 == 1) {
            File file = f15704l;
            if (file != null) {
                return file;
            }
            File file2 = new File(m18806s(context), "persistent");
            f15704l = file2;
            file2.mkdirs();
            return f15704l;
        }
        return m18806s(context);
    }

    /* renamed from: u */
    public static File m18808u(File file, String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(File.separator)) {
            return new File(str);
        }
        return m18771a0(file, m18810w(str));
    }

    /* renamed from: v */
    public static File m18809v(File file, String str, int i11) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(File.separator)) {
            return new File(str);
        }
        return m18771a0(file, m18811x(str, i11));
    }

    /* renamed from: w */
    public static String m18810w(String str) {
        return m18754K(str);
    }

    /* renamed from: x */
    public static String m18811x(String str, int i11) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (i11 > 0) {
            obj = Integer.valueOf(i11);
        } else {
            obj = "";
        }
        sb2.append(obj);
        return m18754K(sb2.toString());
    }

    /* renamed from: y */
    public static Context m18812y() {
        return f15707o;
    }

    /* renamed from: z */
    public static String m18813z() {
        return AbstractC20130d.m104829F();
    }
}
