package pl0;

import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: pl0.j */
/* loaded from: classes7.dex */
public class C24829j {

    /* renamed from: a */
    public Bundle f119195a;

    /* renamed from: b */
    public String f119196b;

    /* renamed from: c */
    public long f119197c;

    /* renamed from: d */
    public long f119198d;

    /* renamed from: e */
    public long f119199e;

    /* renamed from: f */
    public final ArrayList f119200f = new ArrayList();

    /* renamed from: g */
    public a f119201g;

    /* renamed from: h */
    public a f119202h;

    /* renamed from: pl0.j$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        public Bundle f119203a;

        /* renamed from: b */
        public final int f119204b;

        /* renamed from: c */
        public String f119205c;

        /* renamed from: d */
        public String f119206d;

        /* renamed from: e */
        public String f119207e;

        /* renamed from: f */
        public String f119208f;

        /* renamed from: g */
        public String f119209g;

        /* renamed from: h */
        public long f119210h;

        /* renamed from: i */
        public int f119211i;

        /* renamed from: j */
        public int f119212j;

        /* renamed from: k */
        public int f119213k;

        /* renamed from: l */
        public int f119214l;

        /* renamed from: m */
        public int f119215m;

        /* renamed from: n */
        public int f119216n;

        /* renamed from: o */
        public int f119217o;

        /* renamed from: p */
        public int f119218p;

        /* renamed from: q */
        public int f119219q;

        /* renamed from: r */
        public long f119220r;

        public a(int i11) {
            this.f119204b = i11;
        }

        /* renamed from: a */
        public String m129102a() {
            long j11 = this.f119210h;
            if (j11 <= 0) {
                return "N/A";
            }
            if (j11 < 1000) {
                return String.format(Locale.US, "%d bit/s", Long.valueOf(j11));
            }
            return String.format(Locale.US, "%d kb/s", Long.valueOf(j11 / 1000));
        }

        /* renamed from: b */
        public String m129103b() {
            if (!TextUtils.isEmpty(this.f119207e)) {
                return this.f119207e;
            }
            return "N/A";
        }

        /* renamed from: c */
        public int m129104c(String str) {
            return m129105d(str, 0);
        }

        /* renamed from: d */
        public int m129105d(String str, int i11) {
            String m129110i = m129110i(str);
            if (TextUtils.isEmpty(m129110i)) {
                return i11;
            }
            try {
                return Integer.parseInt(m129110i);
            } catch (NumberFormatException unused) {
                return i11;
            }
        }

        /* renamed from: e */
        public long m129106e(String str) {
            return m129107f(str, 0L);
        }

        /* renamed from: f */
        public long m129107f(String str, long j11) {
            String m129110i = m129110i(str);
            if (TextUtils.isEmpty(m129110i)) {
                return j11;
            }
            try {
                return Long.parseLong(m129110i);
            } catch (NumberFormatException unused) {
                return j11;
            }
        }

        /* renamed from: g */
        public String m129108g() {
            int i11 = this.f119211i;
            if (i11 > 0 && this.f119212j > 0) {
                if (this.f119217o > 0 && this.f119218p > 0) {
                    return String.format(Locale.US, "%d x %d [SAR %d:%d]", Integer.valueOf(i11), Integer.valueOf(this.f119212j), Integer.valueOf(this.f119217o), Integer.valueOf(this.f119218p));
                }
                return String.format(Locale.US, "%d x %d", Integer.valueOf(i11), Integer.valueOf(this.f119212j));
            }
            return "N/A";
        }

        /* renamed from: h */
        public String m129109h() {
            int i11 = this.f119219q;
            if (i11 <= 0) {
                return "N/A";
            }
            return String.format(Locale.US, "%d Hz", Integer.valueOf(i11));
        }

        /* renamed from: i */
        public String m129110i(String str) {
            return this.f119203a.getString(str);
        }
    }

    /* renamed from: f */
    public static C24829j m129096f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C24829j c24829j = new C24829j();
        c24829j.f119195a = bundle;
        c24829j.f119196b = c24829j.m129101e("format");
        c24829j.f119197c = c24829j.m129098b("duration_us");
        c24829j.f119198d = c24829j.m129098b("start_us");
        c24829j.f119199e = c24829j.m129098b("bitrate");
        int i11 = -1;
        int m129097a = c24829j.m129097a("video", -1);
        int m129097a2 = c24829j.m129097a("audio", -1);
        c24829j.m129097a("timedtext", -1);
        ArrayList m129100d = c24829j.m129100d("streams");
        if (m129100d == null) {
            return c24829j;
        }
        Iterator it = m129100d.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) it.next();
            i11++;
            if (bundle2 != null) {
                a aVar = new a(i11);
                aVar.f119203a = bundle2;
                aVar.f119205c = aVar.m129110i(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                aVar.f119206d = aVar.m129110i("language");
                if (!TextUtils.isEmpty(aVar.f119205c)) {
                    aVar.f119207e = aVar.m129110i("codec_name");
                    aVar.f119208f = aVar.m129110i("codec_profile");
                    aVar.f119209g = aVar.m129110i("codec_long_name");
                    aVar.f119210h = aVar.m129104c("bitrate");
                    if (aVar.f119205c.equalsIgnoreCase("video")) {
                        aVar.f119211i = aVar.m129104c("width");
                        aVar.f119212j = aVar.m129104c("height");
                        aVar.f119213k = aVar.m129104c("fps_num");
                        aVar.f119214l = aVar.m129104c("fps_den");
                        aVar.f119215m = aVar.m129104c("tbr_num");
                        aVar.f119216n = aVar.m129104c("tbr_den");
                        aVar.f119217o = aVar.m129104c("sar_num");
                        aVar.f119218p = aVar.m129104c("sar_den");
                        if (m129097a == i11) {
                            c24829j.f119201g = aVar;
                        }
                    } else if (aVar.f119205c.equalsIgnoreCase("audio")) {
                        aVar.f119219q = aVar.m129104c("sample_rate");
                        aVar.f119220r = aVar.m129106e("channel_layout");
                        if (m129097a2 == i11) {
                            c24829j.f119202h = aVar;
                        }
                    }
                    c24829j.f119200f.add(aVar);
                }
            }
        }
        return c24829j;
    }

    /* renamed from: a */
    public int m129097a(String str, int i11) {
        String m129101e = m129101e(str);
        if (TextUtils.isEmpty(m129101e)) {
            return i11;
        }
        try {
            return Integer.parseInt(m129101e);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    /* renamed from: b */
    public long m129098b(String str) {
        return m129099c(str, 0L);
    }

    /* renamed from: c */
    public long m129099c(String str, long j11) {
        String m129101e = m129101e(str);
        if (TextUtils.isEmpty(m129101e)) {
            return j11;
        }
        try {
            return Long.parseLong(m129101e);
        } catch (NumberFormatException unused) {
            return j11;
        }
    }

    /* renamed from: d */
    public ArrayList m129100d(String str) {
        return this.f119195a.getParcelableArrayList(str);
    }

    /* renamed from: e */
    public String m129101e(String str) {
        return this.f119195a.getString(str);
    }
}
