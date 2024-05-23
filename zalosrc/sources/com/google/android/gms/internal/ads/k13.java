package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public abstract class k13 {
    /* renamed from: a */
    public static File m23801a(File file, boolean z11) {
        if (z11 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static File m23802b(String str, String str2, File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(m23803c(str, file), str2);
        }
        return null;
    }

    /* renamed from: c */
    public static File m23803c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m23801a(file2, false);
        return file2;
    }

    /* renamed from: d */
    public static boolean m23804d(File file) {
        boolean z11;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z11 = true;
            for (File file2 : listFiles) {
                if (file2 != null && m23804d(file2) && z11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        } else {
            z11 = true;
        }
        if (file.delete() && z11) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m23805e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            AbstractC20291l.m105939a(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            AbstractC20291l.m105939a(fileOutputStream2);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            AbstractC20291l.m105939a(fileOutputStream2);
            throw th;
        }
    }
}
