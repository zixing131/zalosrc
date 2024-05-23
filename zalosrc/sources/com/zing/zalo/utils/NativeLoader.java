package com.zing.zalo.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.AbstractC1158c0;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lm0.InterfaceC22529a;
import me0.AbstractC23041d2;
import me0.AbstractC23190q8;
import mm0.AbstractC23352g;
import p267jh.C21253b;
import p728zt.C32552a;

/* loaded from: classes.dex */
public abstract class NativeLoader {

    /* renamed from: a */
    private static InterfaceC16735e f84840a;

    /* renamed from: b */
    private static InterfaceC22529a f84841b;

    /* renamed from: c */
    private static final Set f84842c = new C21253b();

    /* renamed from: d */
    private static InterfaceC16736f f84843d;

    /* loaded from: classes.dex */
    public static class MissingLibraryException extends RuntimeException {
        public MissingLibraryException(String str) {
            super(str);
        }
    }

    /* renamed from: com.zing.zalo.utils.NativeLoader$a */
    /* loaded from: classes4.dex */
    public class C16731a implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ File f84844a;

        C16731a(File file) {
            this.f84844a = file;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (!file.equals(this.f84844a) && !"assets".equals(file.getName())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.NativeLoader$b */
    /* loaded from: classes4.dex */
    public class C16732b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f84845a;

        C16732b(String str) {
            this.f84845a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f84845a);
        }
    }

    /* renamed from: com.zing.zalo.utils.NativeLoader$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C16733c {

        /* renamed from: a */
        static final /* synthetic */ int[] f84846a;

        static {
            int[] iArr = new int[EnumC16734d.values().length];
            f84846a = iArr;
            try {
                iArr[EnumC16734d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84846a[EnumC16734d.APK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84846a[EnumC16734d.SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.zing.zalo.utils.NativeLoader$d */
    /* loaded from: classes.dex */
    public enum EnumC16734d {
        DEFAULT,
        APK,
        SERVER
    }

    /* renamed from: com.zing.zalo.utils.NativeLoader$e */
    /* loaded from: classes.dex */
    public interface InterfaceC16735e {
        /* renamed from: a */
        void mo89247a(EnumC16739a enumC16739a);

        /* renamed from: b */
        void mo89248b(String str, File file);

        /* renamed from: c */
        void mo89249c(EnumC16739a enumC16739a, File file);
    }

    /* renamed from: com.zing.zalo.utils.NativeLoader$f */
    /* loaded from: classes.dex */
    public interface InterfaceC16736f {
        /* renamed from: a */
        C32552a mo89250a(EnumC16739a enumC16739a);

        /* renamed from: b */
        int mo89251b(EnumC16739a enumC16739a);

        /* renamed from: c */
        boolean mo89252c(String str);
    }

    /* renamed from: a */
    public static void m89222a(Context context) {
        String[] list;
        try {
            File m89233l = m89233l(context);
            if (m89233l == null || !m89233l.exists() || !m89233l.isDirectory() || (list = m89233l.list()) == null) {
                return;
            }
            for (String str : list) {
                if (EnumC16739a.m89282j(str) == null) {
                    AbstractC20110a.m104545n("clean deprecated library dir: %s", str);
                    AbstractC23041d2.m118211j(new File(m89233l, str));
                }
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: b */
    private static void m89223b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m89224c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: d */
    public static void m89225d(Context context, String str, int i11) {
        try {
            File m89234m = m89234m(context, str);
            File m89235n = m89235n(context, str, i11);
            if (m89234m != null) {
                for (File file : m89234m.listFiles(new C16731a(m89235n))) {
                    AbstractC23041d2.m118211j(file);
                }
            }
        } catch (Exception unused) {
            InterfaceC22529a interfaceC22529a = f84841b;
            if (interfaceC22529a != null) {
                interfaceC22529a.mo109251c(19108);
            }
        }
    }

    /* renamed from: e */
    public static void m89226e(Context context, String str) {
        try {
            File[] listFiles = m89233l(context).listFiles(new C16732b(System.mapLibraryName(str)));
            for (File file : listFiles) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:            if (r6 == null) goto L115;     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0072: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:115), block:B:62:0x0072 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m89227f(Context context) {
        ZipFile zipFile;
        ZipFile zipFile2;
        InputStream inputStream;
        String m89284g = EnumC16739a.f84885b0.m89284g();
        String m89228g = m89228g(context, m89284g);
        ZipFile zipFile3 = null;
        if (m89228g == null) {
            return null;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        try {
            if (strArr.length > 1) {
                try {
                    zipFile2 = new ZipFile(new File(CoreUtility.getAppContext().getApplicationInfo().sourceDir), 1);
                } catch (Exception e11) {
                    e = e11;
                    zipFile2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (zipFile3 != null) {
                        try {
                            zipFile3.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
                try {
                    for (String str : strArr) {
                        ZipEntry entry = zipFile2.getEntry("lib/" + str + "/" + System.mapLibraryName(m89284g));
                        if (entry == null) {
                            entry = zipFile2.getEntry("assets/libs/" + str + "/" + System.mapLibraryName(m89284g));
                        }
                        try {
                            inputStream = zipFile2.getInputStream(entry);
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                        try {
                            if (m89228g.equals(AbstractC23352g.m122786b(inputStream))) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                try {
                                    zipFile2.close();
                                } catch (IOException unused2) {
                                }
                                return str;
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    AbstractC20110a.m104539h(e);
                }
                try {
                    zipFile2.close();
                } catch (IOException unused3) {
                }
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            zipFile3 = zipFile;
        }
    }

    /* renamed from: g */
    public static String m89228g(Context context, String str) {
        try {
            File file = new File(m89232k(context), System.mapLibraryName(str));
            if (file.exists()) {
                return AbstractC23352g.m122785a(file);
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            InterfaceC22529a interfaceC22529a = f84841b;
            if (interfaceC22529a != null) {
                interfaceC22529a.mo109250b(19107);
                return null;
            }
            return null;
        }
    }

    /* renamed from: h */
    public static String m89229h(Context context, String str) {
        String str2;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
                try {
                    InputStream m89231j = m89231j(context, zipFile2, str);
                    if (m89231j == null) {
                        AbstractC20110a.m104535d("not found SO in main apk", new Object[0]);
                        zipFile2.close();
                        if (context.getApplicationInfo().splitSourceDirs != null) {
                            for (String str3 : context.getApplicationInfo().splitSourceDirs) {
                                ZipFile zipFile3 = new ZipFile(new File(str3), 1);
                                try {
                                    m89231j = m89231j(context, zipFile3, str);
                                    if (m89231j != null) {
                                        zipFile2 = zipFile3;
                                        break;
                                    }
                                    zipFile3.close();
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = null;
                                    zipFile = zipFile3;
                                    AbstractC20110a.m104539h(e);
                                    InterfaceC22529a interfaceC22529a = f84841b;
                                    if (interfaceC22529a != null) {
                                        interfaceC22529a.mo109250b(19106);
                                    }
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return str2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zipFile = zipFile3;
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                        zipFile2 = null;
                    }
                    if (m89231j != null) {
                        String m122786b = AbstractC23352g.m122786b(m89231j);
                        m89223b(m89231j);
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                                return m122786b;
                            } catch (IOException unused3) {
                                return m122786b;
                            }
                        }
                        return m122786b;
                    }
                    throw new MissingLibraryException(str + " not found in apk");
                } catch (Exception e12) {
                    e = e12;
                    str2 = null;
                    zipFile = zipFile2;
                } catch (Throwable th3) {
                    th = th3;
                    zipFile = zipFile2;
                }
            } catch (Exception e13) {
                e = e13;
                str2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: i */
    public static String m89230i(Context context, String str, int i11) {
        try {
            File m89236o = m89236o(context, str, i11);
            if (m89236o.exists()) {
                return AbstractC23352g.m122785a(m89236o);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    private static InputStream m89231j(Context context, ZipFile zipFile, String str) {
        ZipEntry entry;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            entry = null;
            for (String str2 : strArr) {
                ZipEntry entry2 = zipFile.getEntry("lib/" + str2 + "/" + System.mapLibraryName(str));
                if (entry2 == null) {
                    entry = zipFile.getEntry("assets/libs/" + str2 + "/" + System.mapLibraryName(str));
                } else {
                    entry = entry2;
                }
                if (entry != null) {
                    break;
                }
            }
        } else {
            String m119489a = AbstractC23190q8.m119489a(context, "ro.product.cpu.abi");
            if (!"x86".equalsIgnoreCase(m119489a) && !"i686".equalsIgnoreCase(m119489a) && !"x86_64".equalsIgnoreCase(m119489a)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lib/");
                String str3 = Build.CPU_ABI;
                sb2.append(str3);
                sb2.append("/");
                sb2.append(System.mapLibraryName(str));
                ZipEntry entry3 = zipFile.getEntry(sb2.toString());
                if (entry3 == null) {
                    entry3 = zipFile.getEntry("assets/libs/" + str3 + "/" + System.mapLibraryName(str));
                }
                if (entry3 == null) {
                    entry3 = zipFile.getEntry("lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(str));
                }
                entry = entry3;
                if (entry == null) {
                    entry = zipFile.getEntry("assets/libs/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(str));
                }
            } else {
                entry = zipFile.getEntry("lib/x86/" + System.mapLibraryName(str));
                if (entry == null) {
                    entry = zipFile.getEntry("assets/libs/x86/" + System.mapLibraryName(str));
                }
            }
        }
        if (entry == null) {
            return null;
        }
        return zipFile.getInputStream(entry);
    }

    /* renamed from: k */
    public static String m89232k(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    /* renamed from: l */
    private static File m89233l(Context context) {
        return context.getDir("native_lib", 0);
    }

    /* renamed from: m */
    public static File m89234m(Context context, String str) {
        File m89233l = m89233l(context);
        if (m89233l != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(m89233l, str);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    return file;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static File m89235n(Context context, String str, int i11) {
        File m89234m = m89234m(context, str);
        if (m89234m != null) {
            try {
                File file = new File(m89234m, String.valueOf(i11));
                if (!file.exists()) {
                    file.mkdir();
                }
                return file;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static File m89236o(Context context, String str, int i11) {
        return new File(m89235n(context, str, i11), System.mapLibraryName(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m89237p(Context context, boolean z11, EnumC16739a enumC16739a, int i11) {
        boolean z12;
        if (z11) {
            try {
                System.loadLibrary(enumC16739a.m89284g());
                z12 = true;
            } catch (UnsatisfiedLinkError e11) {
                AbstractC20110a.m104539h(e11);
                InterfaceC22529a interfaceC22529a = f84841b;
                if (interfaceC22529a != null) {
                    interfaceC22529a.mo109250b(19109);
                }
            }
            if (!z12) {
                File m89236o = m89236o(context, enumC16739a.m89284g(), i11);
                try {
                    if (!m89236o.exists()) {
                        m89244w(context, enumC16739a.m89284g(), m89236o);
                    }
                    try {
                        AbstractC20110a.m104535d("load workaround lib depend: %s", m89236o.getPath());
                        System.load(m89236o.getAbsolutePath());
                        return;
                    } catch (Throwable th2) {
                        AbstractC20110a.m104539h(th2);
                        InterfaceC22529a interfaceC22529a2 = f84841b;
                        if (interfaceC22529a2 != null) {
                            interfaceC22529a2.mo109250b(19111);
                        }
                        InterfaceC16735e interfaceC16735e = f84840a;
                        if (interfaceC16735e != null) {
                            interfaceC16735e.mo89248b(enumC16739a.m89284g(), m89236o);
                        }
                    }
                } catch (MissingLibraryException unused) {
                    InterfaceC22529a interfaceC22529a3 = f84841b;
                    if (interfaceC22529a3 != null) {
                        interfaceC22529a3.mo109250b(19110);
                    }
                    InterfaceC16735e interfaceC16735e2 = f84840a;
                    if (interfaceC16735e2 != null) {
                        interfaceC16735e2.mo89249c(enumC16739a, m89236o);
                    }
                }
            }
            if (z12 && !z11) {
                try {
                    System.loadLibrary(enumC16739a.m89284g());
                    return;
                } catch (UnsatisfiedLinkError e12) {
                    AbstractC20110a.m104539h(e12);
                    InterfaceC22529a interfaceC22529a4 = f84841b;
                    if (interfaceC22529a4 != null) {
                        interfaceC22529a4.mo109250b(19109);
                        return;
                    }
                    return;
                }
            }
        }
        z12 = false;
        if (!z12) {
        }
        if (z12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c4  */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m89238q(Context context, EnumC16739a enumC16739a) {
        boolean z11;
        C32552a c32552a;
        UnsatisfiedLinkError unsatisfiedLinkError;
        Iterator it;
        String str;
        if (enumC16739a != null && !TextUtils.isEmpty(enumC16739a.m89284g())) {
            if (context != null) {
                int m89285h = enumC16739a.m89285h();
                InterfaceC16736f interfaceC16736f = f84843d;
                if (interfaceC16736f != null) {
                    m89285h = interfaceC16736f.mo89251b(enumC16739a);
                    z11 = f84843d.mo89252c(enumC16739a.m89284g());
                } else {
                    z11 = true;
                }
                if (m89285h == enumC16739a.m89285h() && enumC16739a.f84903r) {
                    if (z11) {
                        try {
                            if (enumC16739a.m89286i()) {
                                m89239r(context, enumC16739a, EnumC16734d.DEFAULT);
                            }
                            System.loadLibrary(enumC16739a.m89284g());
                            return 0;
                        } catch (UnsatisfiedLinkError e11) {
                            AbstractC20110a.m104539h(e11);
                            InterfaceC22529a interfaceC22529a = f84841b;
                            str = e11;
                            if (interfaceC22529a != null) {
                                interfaceC22529a.mo109250b(19109);
                                str = e11;
                            }
                        }
                    } else {
                        str = 0;
                    }
                    File m89236o = m89236o(context, enumC16739a.m89284g(), m89285h);
                    try {
                        if (!m89236o.exists()) {
                            m89244w(context, enumC16739a.m89284g(), m89236o);
                        }
                        try {
                            if (enumC16739a.m89286i()) {
                                m89239r(context, enumC16739a, EnumC16734d.APK);
                            }
                            AbstractC20110a.m104535d("load workaround lib: %s", m89236o.getPath());
                            str = m89236o.getAbsolutePath();
                            System.load(str);
                            return 1;
                        } catch (Throwable th2) {
                            UnsatisfiedLinkError unsatisfiedLinkError2 = th2;
                            AbstractC20110a.m104539h(unsatisfiedLinkError2);
                            InterfaceC22529a interfaceC22529a2 = f84841b;
                            if (interfaceC22529a2 != null) {
                                interfaceC22529a2.mo109250b(19111);
                            }
                            InterfaceC16735e interfaceC16735e = f84840a;
                            unsatisfiedLinkError = unsatisfiedLinkError2;
                            if (interfaceC16735e != null) {
                                interfaceC16735e.mo89248b(enumC16739a.m89284g(), m89236o);
                                unsatisfiedLinkError = unsatisfiedLinkError2;
                            }
                            if (!z11) {
                                try {
                                    if (enumC16739a.m89286i()) {
                                        m89239r(context, enumC16739a, EnumC16734d.DEFAULT);
                                    }
                                    System.loadLibrary(enumC16739a.m89284g());
                                    return 0;
                                } catch (UnsatisfiedLinkError e12) {
                                    unsatisfiedLinkError = e12;
                                    AbstractC20110a.m104539h(unsatisfiedLinkError);
                                    InterfaceC22529a interfaceC22529a3 = f84841b;
                                    if (interfaceC22529a3 != null) {
                                        interfaceC22529a3.mo109250b(19109);
                                    }
                                }
                            }
                            it = f84842c.iterator();
                            if (it.hasNext()) {
                            }
                        }
                    } catch (MissingLibraryException unused) {
                        InterfaceC22529a interfaceC22529a4 = f84841b;
                        if (interfaceC22529a4 != null) {
                            interfaceC22529a4.mo109250b(19110);
                        }
                        InterfaceC16735e interfaceC16735e2 = f84840a;
                        unsatisfiedLinkError = str;
                        if (interfaceC16735e2 != null) {
                            interfaceC16735e2.mo89249c(enumC16739a, m89236o);
                            unsatisfiedLinkError = str;
                        }
                    }
                } else {
                    InterfaceC16736f interfaceC16736f2 = f84843d;
                    if (interfaceC16736f2 != null) {
                        c32552a = interfaceC16736f2.mo89250a(enumC16739a);
                    } else {
                        c32552a = null;
                    }
                    if (c32552a == null) {
                        Iterator it2 = f84842c.iterator();
                        if (it2.hasNext()) {
                            AbstractC1158c0.m5500a(it2.next());
                            throw null;
                        }
                        throw new UnsatisfiedLinkError("can't load zalo library -- missing distributed info!");
                    }
                    if (m89285h != c32552a.f150431b) {
                        Iterator it3 = f84842c.iterator();
                        if (it3.hasNext()) {
                            AbstractC1158c0.m5500a(it3.next());
                            throw null;
                        }
                        throw new UnsatisfiedLinkError("can't load zalo library -- wrong distributed info from server!");
                    }
                    m89225d(context, enumC16739a.m89284g(), c32552a.f150431b);
                    File m89236o2 = m89236o(context, enumC16739a.m89284g(), m89285h);
                    if (m89236o2.exists()) {
                        try {
                            String m122785a = AbstractC23352g.m122785a(m89236o2);
                            if (m122785a != null && m122785a.equalsIgnoreCase(c32552a.f150433d)) {
                                if (enumC16739a.m89286i()) {
                                    m89239r(context, enumC16739a, EnumC16734d.SERVER);
                                }
                                System.load(m89236o2.getAbsolutePath());
                                Iterator it4 = f84842c.iterator();
                                if (!it4.hasNext()) {
                                    return 1;
                                }
                                AbstractC1158c0.m5500a(it4.next());
                                throw null;
                            }
                            throw new UnsatisfiedLinkError("can't load zalo library -- wrong checksum!");
                        } catch (Throwable th3) {
                            AbstractC20110a.m104539h(th3);
                            InterfaceC22529a interfaceC22529a5 = f84841b;
                            if (interfaceC22529a5 != null) {
                                interfaceC22529a5.mo109250b(19111);
                            }
                            InterfaceC16735e interfaceC16735e3 = f84840a;
                            if (interfaceC16735e3 != null) {
                                interfaceC16735e3.mo89248b(enumC16739a.m89284g(), m89236o2);
                            }
                            unsatisfiedLinkError = th3;
                        }
                    } else {
                        unsatisfiedLinkError = null;
                    }
                    if (f84840a != null) {
                        if (enumC16739a.m89286i()) {
                            f84840a.mo89247a(enumC16739a);
                        }
                        f84840a.mo89249c(enumC16739a, m89236o2);
                    }
                }
                it = f84842c.iterator();
                if (it.hasNext()) {
                    if (unsatisfiedLinkError != null) {
                        throw unsatisfiedLinkError;
                    }
                    throw new UnsatisfiedLinkError("can't load zalo library -- unknown error!");
                }
                AbstractC1158c0.m5500a(it.next());
                throw null;
            }
            throw new IllegalArgumentException("Given context is null");
        }
        throw new IllegalArgumentException("Given library is either null or empty");
    }

    /* renamed from: r */
    private static void m89239r(Context context, EnumC16739a enumC16739a, EnumC16734d enumC16734d) {
        EnumC16739a[] m89283e = enumC16739a.m89283e();
        if (m89283e != null && m89283e.length > 0) {
            for (EnumC16739a enumC16739a2 : m89283e) {
                int m89285h = enumC16739a2.m89285h();
                int i11 = C16733c.f84846a[enumC16734d.ordinal()];
                boolean z11 = true;
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        InterfaceC16736f interfaceC16736f = f84843d;
                        if (interfaceC16736f != null) {
                            m89285h = interfaceC16736f.mo89251b(enumC16739a2);
                            z11 = f84843d.mo89252c(enumC16739a2.m89284g());
                        }
                        if (m89285h != enumC16739a2.m89285h()) {
                            File m89236o = m89236o(context, enumC16739a2.m89284g(), m89285h);
                            if (m89236o.exists()) {
                                try {
                                    System.load(m89236o.getAbsolutePath());
                                } catch (Throwable th2) {
                                    AbstractC20110a.m104539h(th2);
                                    InterfaceC22529a interfaceC22529a = f84841b;
                                    if (interfaceC22529a != null) {
                                        interfaceC22529a.mo109250b(19111);
                                    }
                                    InterfaceC16735e interfaceC16735e = f84840a;
                                    if (interfaceC16735e != null) {
                                        interfaceC16735e.mo89248b(enumC16739a2.m89284g(), m89236o);
                                    }
                                }
                            }
                            InterfaceC16735e interfaceC16735e2 = f84840a;
                            if (interfaceC16735e2 != null) {
                                interfaceC16735e2.mo89249c(enumC16739a2, m89236o);
                            }
                            try {
                                System.loadLibrary(enumC16739a2.m89284g());
                            } catch (UnsatisfiedLinkError e11) {
                                AbstractC20110a.m104539h(e11);
                                InterfaceC22529a interfaceC22529a2 = f84841b;
                                if (interfaceC22529a2 != null) {
                                    interfaceC22529a2.mo109250b(19109);
                                }
                            }
                        } else {
                            m89237p(context, z11, enumC16739a2, enumC16739a2.m89285h());
                        }
                    }
                } else {
                    InterfaceC16736f interfaceC16736f2 = f84843d;
                    if (interfaceC16736f2 != null) {
                        z11 = interfaceC16736f2.mo89252c(enumC16739a2.m89284g());
                    }
                    m89237p(context, z11, enumC16739a2, m89285h);
                }
            }
        }
    }

    /* renamed from: s */
    public static int m89240s(Context context, EnumC16739a enumC16739a) {
        try {
            return m89238q(context, enumC16739a);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: t */
    public static void m89241t(InterfaceC16735e interfaceC16735e) {
        f84840a = interfaceC16735e;
    }

    /* renamed from: u */
    public static void m89242u(InterfaceC16736f interfaceC16736f) {
        f84843d = interfaceC16736f;
    }

    /* renamed from: v */
    public static void m89243v(InterfaceC22529a interfaceC22529a) {
        f84841b = interfaceC22529a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:127), block:B:67:0x007e */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m89244w(Context context, String str, File file) {
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        ZipFile zipFile2;
        ZipFile zipFile3 = null;
        try {
            try {
                ZipFile zipFile4 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
                try {
                    ?? m89231j = m89231j(context, zipFile4, str);
                    ?? r32 = m89231j;
                    if (m89231j == 0) {
                        try {
                            AbstractC20110a.m104535d("not found SO in main apk", new Object[0]);
                            zipFile4.close();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                            zipFile2 = m89231j;
                        }
                        try {
                            if (context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i11 = 0;
                                m89231j = m89231j;
                                while (i11 < length) {
                                    ZipFile zipFile5 = new ZipFile(new File(strArr[i11]), 1);
                                    try {
                                        m89231j = m89231j(context, zipFile5, str);
                                        if (m89231j != 0) {
                                            zipFile4 = zipFile5;
                                            r32 = m89231j;
                                            break;
                                        } else {
                                            zipFile5.close();
                                            i11++;
                                            m89231j = m89231j;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                        zipFile3 = m89231j;
                                        m89223b(zipFile3);
                                        m89223b(fileOutputStream);
                                        throw th;
                                    }
                                }
                            }
                            zipFile4 = null;
                            r32 = m89231j;
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                            zipFile2 = m89231j;
                            zipFile3 = zipFile2;
                            m89223b(zipFile3);
                            m89223b(fileOutputStream);
                            throw th;
                        }
                    }
                    if (r32 != 0) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            m89224c(r32, fileOutputStream2);
                            m89223b(r32);
                            m89223b(fileOutputStream2);
                            file.setReadable(true, false);
                            file.setExecutable(true, false);
                            file.setWritable(true);
                            if (zipFile4 != null) {
                                try {
                                    zipFile4.close();
                                    return;
                                } catch (IOException unused) {
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th5) {
                            zipFile3 = r32;
                            fileOutputStream = fileOutputStream2;
                            th = th5;
                            m89223b(zipFile3);
                            m89223b(fileOutputStream);
                            throw th;
                        }
                    }
                    throw new MissingLibraryException(str + " not found in apk");
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
                zipFile3 = zipFile;
                if (zipFile3 != null) {
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (zipFile3 != null) {
                try {
                    zipFile3.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: x */
    public static void m89245x(Context context) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (f84843d == null) {
                return;
            }
            for (EnumC16739a enumC16739a : EnumC16739a.m89281d()) {
                if (f84843d.mo89251b(enumC16739a) == enumC16739a.m89285h()) {
                    File m89236o = m89236o(context, enumC16739a.m89284g(), enumC16739a.m89285h());
                    if (m89236o.exists()) {
                        String m89230i = m89230i(context, enumC16739a.m89284g(), enumC16739a.m89285h());
                        String m89229h = m89229h(context, enumC16739a.m89284g());
                        if (m89229h != null && !m89229h.equals(m89230i)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("delete workaround:");
                            sb2.append(m89236o.getPath());
                            m89236o.delete();
                        }
                    }
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("verifyAllWorkaroundLibShipped:");
            sb3.append(System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
