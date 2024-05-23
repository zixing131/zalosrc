package k30;

import android.text.TextUtils;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import gw.C19669z;
import hn0.AbstractC20104d;
import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p239ih.C20556f;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;

/* renamed from: k30.a */
/* loaded from: classes5.dex */
public final class C21459a {

    /* renamed from: a */
    public static final C21459a f104477a = new C21459a();

    private C21459a() {
    }

    /* renamed from: a */
    private final String m111033a(int i11) {
        String m127130z;
        if (i11 >= 0) {
            if (i11 > 0) {
                m127130z = AbstractC24341v.m127130z("#", i11);
                return "#." + m127130z;
            }
            return "#";
        }
        throw new IllegalArgumentException("Decimal places must be non-negative".toString());
    }

    /* renamed from: b */
    public static final long m111034b(long j11) {
        return j11 / ((long) Math.pow(1024.0d, 2));
    }

    /* renamed from: c */
    public static final double m111035c(long j11) {
        long m104530f;
        m104530f = AbstractC20104d.m104530f(((j11 * 1.0d) / Math.pow(1024.0d, 2)) * 100.0d);
        return m104530f / 100.0d;
    }

    /* renamed from: d */
    public static final String m111036d(long j11) {
        return m111038f(j11, 0, 2, null);
    }

    /* renamed from: e */
    public static final String m111037e(long j11, int i11) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator(',');
        String m111033a = f104477a.m111033a(i11);
        if (j11 == 0) {
            return "0 B";
        }
        double d11 = j11;
        if (d11 < 1000.0d) {
            String format = new DecimalFormat(m111033a + " B", decimalFormatSymbols).format(j11);
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        double d12 = 2;
        if (d11 < Math.pow(1000.0d, d12)) {
            double d13 = d11 / 1024.0d;
            if (d11 < 1024.0d) {
                d13 = ((int) (d13 * Math.pow(10.0d, r2))) / Math.pow(10.0d, i11);
            }
            String format2 = new DecimalFormat(m111033a + " KB", decimalFormatSymbols).format(d13);
            AbstractC19074t.m100205c(format2);
            return format2;
        }
        double d14 = 3;
        if (d11 < Math.pow(1000.0d, d14)) {
            double pow = d11 / Math.pow(1024.0d, d12);
            if (d11 < Math.pow(1024.0d, d12)) {
                pow = ((int) (pow * Math.pow(10.0d, r13))) / Math.pow(10.0d, i11);
            }
            String format3 = new DecimalFormat(m111033a + " MB", decimalFormatSymbols).format(pow);
            AbstractC19074t.m100205c(format3);
            return format3;
        }
        double pow2 = d11 / Math.pow(1024.0d, d14);
        if (d11 < Math.pow(1024.0d, d14)) {
            pow2 = ((int) (pow2 * Math.pow(10.0d, r2))) / Math.pow(10.0d, i11);
        }
        String format4 = new DecimalFormat(m111033a + " GB", decimalFormatSymbols).format(pow2);
        AbstractC19074t.m100205c(format4);
        return format4;
    }

    /* renamed from: f */
    public static /* synthetic */ String m111038f(long j11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return m111037e(j11, i11);
    }

    /* renamed from: g */
    private final boolean m111039g(String str) {
        boolean m127149O;
        boolean m127149O2;
        m127149O = AbstractC24342w.m127149O(str, BuildConfig.APPLICATION_ID, false, 2, null);
        if (m127149O) {
            m127149O2 = AbstractC24342w.m127149O(str, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE, false, 2, null);
            if (m127149O2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final long m111040i(int i11) {
        return i11 * ((long) Math.pow(1024.0d, 2));
    }

    /* renamed from: j */
    public static final void m111041j() {
        if ((!TextUtils.isEmpty(AbstractC23309i.m122303q0())) && !C19669z.f97568P.get()) {
            C7960e.m41971c6().m42400g7();
        }
    }

    /* renamed from: k */
    public static final long m111042k(String str) {
        AbstractC19074t.m100208f(str, "path");
        if (str.length() == 0 || !f104477a.m111039g(str)) {
            return 0L;
        }
        try {
            File file = new File(str);
            if (!file.exists() || !file.isFile()) {
                return 0L;
            }
            return file.length();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0L;
        }
    }

    /* renamed from: l */
    public static final long m111043l(String str) {
        AbstractC19074t.m100208f(str, "uriPath");
        if (str.length() == 0) {
            return 0L;
        }
        try {
            C20556f c20556f = new C20556f(str);
            if (!c20556f.m106830b()) {
                return 0L;
            }
            return c20556f.m106845r();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0L;
        }
    }

    /* renamed from: h */
    public final boolean m111044h(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (str.length() == 0 || AbstractC21935u.m114550q(str) || AbstractC25495a.m132078c(str) || C19669z.Companion.m103232a().m103202S(str) == null) {
            return true;
        }
        return false;
    }
}
