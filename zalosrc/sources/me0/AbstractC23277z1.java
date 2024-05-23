package me0;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.regex.Pattern;
import p239ih.C20556f;

/* renamed from: me0.z1 */
/* loaded from: classes4.dex */
public abstract class AbstractC23277z1 {

    /* renamed from: a */
    private static final Pattern f112792a = Pattern.compile(".*[1-9].*");

    /* renamed from: a */
    public static int m120057a(C20556f c20556f) {
        C23257x1 m106833e;
        try {
            m106833e = c20556f.m106833e();
        } catch (Exception unused) {
        }
        if (m106833e == null) {
            return 0;
        }
        String m119906g = m106833e.m119906g("Orientation");
        if (!TextUtils.isEmpty(m119906g)) {
            int parseInt = Integer.parseInt(m119906g);
            if (parseInt != 3) {
                if (parseInt != 6) {
                    if (parseInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m120058b(String str) {
        return m120057a(new C20556f(str));
    }

    /* renamed from: c */
    public static void m120059c(C23267y1 c23267y1, File file) {
        try {
            c23267y1.m120026c(new C23257x1(file));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
