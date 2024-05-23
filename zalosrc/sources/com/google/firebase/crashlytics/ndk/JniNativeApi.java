package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153f8.C18821f;

/* loaded from: classes.dex */
class JniNativeApi implements InterfaceC6571h {

    /* renamed from: b */
    private static final boolean f36463b;

    /* renamed from: c */
    private static final FilenameFilter f36464c = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.g
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m33534g;
            m33534g = JniNativeApi.m33534g(file, str);
            return m33534g;
        }
    };

    /* renamed from: a */
    private final Context f36465a;

    static {
        boolean z11;
        try {
            System.loadLibrary("crashlytics");
            z11 = true;
        } catch (UnsatisfiedLinkError e11) {
            C18821f.m98795f().m98798d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e11.getLocalizedMessage());
            z11 = false;
        }
        f36463b = z11;
    }

    public JniNativeApi(Context context) {
        this.f36465a = context;
    }

    /* renamed from: c */
    public static void m33530c(List list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", m33532e(packageInfo)));
        if (!file.exists()) {
            C18821f.m98795f().m98796b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f36464c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        C18821f.m98795f().m98796b("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            C18821f.m98795f().m98796b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    /* renamed from: d */
    private static int m33531d() {
        return Build.VERSION.SDK_INT >= 24 ? 9216 : 1024;
    }

    /* renamed from: e */
    private static String m33532e(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }

    /* renamed from: f */
    public static boolean m33533f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m33534g(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.InterfaceC6571h
    /* renamed from: a */
    public boolean mo33535a(String str, AssetManager assetManager) {
        String[] m33536h = m33536h(Build.CPU_ABI);
        if (m33536h.length < 2) {
            return false;
        }
        String str2 = m33536h[0];
        String str3 = m33536h[1];
        if (!f36463b || !nativeInit(new String[]{str2, str3, str}, assetManager)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String[] m33536h(String str) {
        try {
            PackageInfo packageInfo = this.f36465a.getPackageManager().getPackageInfo(this.f36465a.getPackageName(), m33531d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (m33533f()) {
                m33530c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e11) {
            C18821f.m98795f().m98799e("Unable to compose package paths", e11);
            throw new RuntimeException(e11);
        }
    }
}
