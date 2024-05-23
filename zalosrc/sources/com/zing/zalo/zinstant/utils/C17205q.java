package com.zing.zalo.zinstant.utils;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import mm0.AbstractC23352g;
import p620wt.AbstractC29237l;
import p620wt.AbstractC29238m;

/* renamed from: com.zing.zalo.zinstant.utils.q */
/* loaded from: classes7.dex */
public final class C17205q {

    /* renamed from: a */
    public static final C17205q f87763a = new C17205q();

    private C17205q() {
    }

    /* renamed from: a */
    public static final boolean m91838a(File file, File file2) {
        FileOutputStream fileOutputStream;
        AbstractC19074t.m100208f(file, "source");
        AbstractC19074t.m100208f(file2, "destination");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return true;
                        }
                    }
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* renamed from: b */
    public static final boolean m91839b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m91840c(File file, String str) {
        if (file != null && file.exists() && TextUtils.equals(AbstractC23352g.m122785a(file), str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0019: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:26), block:B:16:0x0019 */
    /* renamed from: d */
    public static final String m91841d(File file) {
        BufferedReader bufferedReader;
        Closeable closeable;
        AbstractC19074t.m100208f(file, "file");
        Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC29237l.m145996a(closeable2);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                AbstractC29237l.m145996a(bufferedReader);
                return readLine;
            } catch (IOException e12) {
                e = e12;
                e.printStackTrace();
                AbstractC29237l.m145996a(bufferedReader);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            AbstractC29237l.m145996a(closeable2);
            throw th;
        }
    }

    /* renamed from: e */
    public final void m91842e(File file, byte[] bArr, String str) {
        AbstractC19074t.m100208f(file, "file");
        AbstractC19074t.m100208f(bArr, "data");
        if (!m91840c(file, str)) {
            AbstractC29238m.m145998b(new ByteArrayInputStream(bArr), new FileOutputStream(file));
        }
    }
}
