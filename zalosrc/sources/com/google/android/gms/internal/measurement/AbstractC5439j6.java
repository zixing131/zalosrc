package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p665y0.C30245g;

/* renamed from: com.google.android.gms.internal.measurement.j6 */
/* loaded from: classes.dex */
public abstract class AbstractC5439j6 {

    /* renamed from: a */
    private static volatile AbstractC5355e7 f32436a;

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|(1:10)|11|12|13)|14|(5:16|(1:18)|11|12|13)|19|(2:21|(1:23))|24|25|26|27|28|29|30|(1:32)(1:83)|33|(10:35|36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:82)|65|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006f, code lost:            r3 = com.google.android.gms.internal.measurement.AbstractC5355e7.m29081c();     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5355e7 m29280a(Context context) {
        AbstractC5355e7 abstractC5355e7;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        AbstractC5355e7 m29081c;
        AbstractC5355e7 m29081c2;
        boolean isDeviceProtectedStorage;
        synchronized (AbstractC5439j6.class) {
            try {
                abstractC5355e7 = f32436a;
                if (abstractC5355e7 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        m29081c2 = AbstractC5355e7.m29081c();
                        abstractC5355e7 = m29081c2;
                        f32436a = abstractC5355e7;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        m29081c2 = AbstractC5355e7.m29081c();
                        abstractC5355e7 = m29081c2;
                        f32436a = abstractC5355e7;
                    }
                    if (AbstractC5659w5.m29981b()) {
                        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                        if (!isDeviceProtectedStorage) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    if (file.exists()) {
                        m29081c = AbstractC5355e7.m29082d(file);
                    } else {
                        m29081c = AbstractC5355e7.m29081c();
                    }
                    if (m29081c.mo28879b()) {
                        File file2 = (File) m29081c.mo28878a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                C30245g c30245g = new C30245g();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Invalid: ");
                                        sb2.append(readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!c30245g.containsKey(str3)) {
                                            c30245g.put(str3, new C30245g());
                                        }
                                        ((C30245g) c30245g.get(str3)).put(decode, str4);
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = context.getPackageName();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Parsed ");
                                sb3.append(obj);
                                sb3.append(" for Android package ");
                                sb3.append(packageName);
                                C5303b6 c5303b6 = new C5303b6(c30245g);
                                bufferedReader.close();
                                m29081c2 = AbstractC5355e7.m29082d(c5303b6);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (IOException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        m29081c2 = AbstractC5355e7.m29081c();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    abstractC5355e7 = m29081c2;
                    f32436a = abstractC5355e7;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            } finally {
            }
        }
        return abstractC5355e7;
    }
}
