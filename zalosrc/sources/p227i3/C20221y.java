package p227i3;

import com.adtima.Adtima;
import java.util.HashMap;

/* renamed from: i3.y */
/* loaded from: classes2.dex */
public class C20221y {

    /* renamed from: a */
    private static final String f100068a = "y";

    /* renamed from: b */
    private static C20221y f100069b;

    /* renamed from: c */
    private static HashMap f100070c;

    private C20221y() {
        m105658a();
    }

    /* renamed from: a */
    private void m105658a() {
        try {
            if (f100070c == null) {
                f100070c = new HashMap();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100068a, "checkOrInitResource", e11);
        }
    }

    /* renamed from: d */
    public static C20221y m105659d() {
        if (f100069b == null) {
            f100069b = new C20221y();
        }
        return f100069b;
    }

    /* renamed from: b */
    public void m105660b(String str, String str2) {
        try {
            HashMap hashMap = f100070c;
            if (hashMap == null) {
                return;
            }
            hashMap.remove(str + "_" + str2);
        } catch (Exception e11) {
            Adtima.m18329e(f100068a, "clearBundleToken", e11);
        }
    }

    /* renamed from: c */
    public void m105661c(String str, String str2, String str3) {
        try {
            m105658a();
            f100070c.put(str + "_" + str2, str3);
        } catch (Exception e11) {
            Adtima.m18329e(f100068a, "setBundleToken", e11);
        }
    }

    /* renamed from: e */
    public String m105662e(String str, String str2) {
        try {
            m105658a();
            return (String) f100070c.get(str + "_" + str2);
        } catch (Exception e11) {
            Adtima.m18329e(f100068a, "getBundleToken", e11);
            return null;
        }
    }
}
