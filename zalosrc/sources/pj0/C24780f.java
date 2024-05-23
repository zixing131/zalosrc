package pj0;

import android.text.TextUtils;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23352g;
import vg.AbstractC28110k3;

/* renamed from: pj0.f */
/* loaded from: classes7.dex */
public final class C24780f {

    /* renamed from: a */
    public static final C24780f f119009a = new C24780f();

    /* renamed from: b */
    private static String f119010b = "raw";

    /* renamed from: c */
    private static float f119011c = 0.1f;

    /* renamed from: d */
    private static float f119012d = 0.3f;

    /* renamed from: e */
    private static String f119013e = "";

    /* renamed from: f */
    private static final AtomicBoolean f119014f = new AtomicBoolean(false);

    private C24780f() {
    }

    /* renamed from: a */
    public final File m128799a(String str) {
        AbstractC19074t.m100208f(str, "path");
        File m128779s = C24777c.m128779s(AbstractC23352g.m122788d(str), f119010b);
        AbstractC19074t.m100207e(m128779s, "getCacheFile(Md5Generato…md5(path), directoryName)");
        return m128779s;
    }

    /* renamed from: b */
    public final File m128800b(String str, InterfaceC18505l interfaceC18505l) {
        BufferedReader bufferedReader;
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(interfaceC18505l, "calculateFileOrDirChecksum");
        String m122788d = AbstractC23352g.m122788d(str);
        File m128779s = C24777c.m128779s(m122788d, f119010b);
        AbstractC19074t.m100207e(m128779s, "getCacheFile(target, directoryName)");
        File m128779s2 = C24777c.m128779s(m122788d + "_c", f119010b);
        AbstractC19074t.m100207e(m128779s2, "getCacheFile(target + \"_c\", directoryName)");
        BufferedReader bufferedReader2 = null;
        if (!m128779s.exists() || m128779s2.length() != 32) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(m128779s2));
        } catch (Exception e11) {
            e = e11;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC28110k3.m141585a(bufferedReader2);
            throw th;
        }
        try {
            try {
                if (!TextUtils.equals(bufferedReader.readLine(), (CharSequence) interfaceC18505l.mo205i9(m128779s))) {
                    m128779s = null;
                }
                AbstractC28110k3.m141585a(bufferedReader);
                return m128779s;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                AbstractC28110k3.m141585a(bufferedReader2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
            AbstractC28110k3.m141585a(bufferedReader);
            return null;
        }
    }
}
