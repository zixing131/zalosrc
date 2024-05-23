package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class a13 {
    /* renamed from: a */
    public static boolean m19956a(int i11) {
        int i12 = i11 - 1;
        return i12 == 2 || i12 == 4 || i12 == 5 || i12 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00cd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m19957b(Context context, xz2 xz2Var) {
        int i11;
        FileInputStream fileInputStream;
        byte[] bArr;
        String str;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            xz2Var.m28093b(5017, "No lib/");
        } else {
            File[] listFiles = file.listFiles(new fa3(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    m19959d(null, e11.toString(), context, xz2Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        m19959d(bArr, null, context, xz2Var);
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s7 = ByteBuffer.wrap(bArr2).getShort();
                        if (s7 != 3) {
                            if (s7 != 40) {
                                if (s7 != 62) {
                                    if (s7 != 183) {
                                        m19959d(bArr, null, context, xz2Var);
                                    } else {
                                        fileInputStream.close();
                                        i11 = 6;
                                    }
                                } else {
                                    fileInputStream.close();
                                    i11 = 7;
                                }
                            } else {
                                fileInputStream.close();
                                i11 = 3;
                            }
                        } else {
                            fileInputStream.close();
                            i11 = 5;
                        }
                        if (i11 == 1000) {
                            String m19958c = m19958c(context, xz2Var);
                            if (TextUtils.isEmpty(m19958c)) {
                                m19959d(null, "Empty dev arch", context, xz2Var);
                            } else if (m19958c.equalsIgnoreCase("i686") || m19958c.equalsIgnoreCase("x86")) {
                                i11 = 5;
                            } else if (m19958c.equalsIgnoreCase("x86_64")) {
                                i11 = 7;
                            } else if (m19958c.equalsIgnoreCase("arm64-v8a")) {
                                i11 = 6;
                            } else if (m19958c.equalsIgnoreCase("armeabi-v7a") || m19958c.equalsIgnoreCase("armv71")) {
                                i11 = 3;
                            } else {
                                m19959d(null, m19958c, context, xz2Var);
                            }
                            i11 = 1;
                        }
                        if (i11 != 1) {
                            if (i11 != 3) {
                                if (i11 != 5) {
                                    if (i11 != 6) {
                                        if (i11 != 7) {
                                            str = "null";
                                        } else {
                                            str = "X86_64";
                                        }
                                    } else {
                                        str = "ARM64";
                                    }
                                } else {
                                    str = "X86";
                                }
                            } else {
                                str = "ARM7";
                            }
                        } else {
                            str = "UNSUPPORTED";
                        }
                        xz2Var.m28093b(5018, str);
                        return i11;
                    }
                }
                fileInputStream.close();
                i11 = 1;
                if (i11 == 1000) {
                }
                if (i11 != 1) {
                }
                xz2Var.m28093b(5018, str);
                return i11;
            }
            xz2Var.m28093b(5017, "No .so");
        }
        i11 = 1000;
        if (i11 == 1000) {
        }
        if (i11 != 1) {
        }
        xz2Var.m28093b(5018, str);
        return i11;
    }

    /* renamed from: c */
    private static final String m19958c(Context context, xz2 xz2Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String m28132b = y53.OS_ARCH.m28132b();
        if (!TextUtils.isEmpty(m28132b) && hashSet.contains(m28132b)) {
            return m28132b;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e11) {
            xz2Var.m28094c(2024, 0L, e11);
        } catch (NoSuchFieldException e12) {
            xz2Var.m28094c(2024, 0L, e12);
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    /* renamed from: d */
    private static final void m19959d(byte[] bArr, String str, Context context, xz2 xz2Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("os.arch:");
        sb2.append(y53.OS_ARCH.m28132b());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        xz2Var.m28093b(4007, sb2.toString());
    }
}
