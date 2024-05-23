package ch0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import hu.C20131e;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import me0.AbstractC23041d2;
import p128ed.C18390e;
import sg0.C26245a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ch0.b */
/* loaded from: classes7.dex */
public final class C3487b {

    /* renamed from: a */
    public static final C3487b f14598a = new C3487b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ch0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: q */
        public static final a f14599q = new a("Migration", 0, "migration");

        /* renamed from: r */
        public static final a f14600r = new a("Encryption", 1, "encryption");

        /* renamed from: s */
        private static final /* synthetic */ a[] f14601s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f14602t;

        /* renamed from: p */
        private final String f14603p;

        static {
            a[] m17476b = m17476b();
            f14601s = m17476b;
            f14602t = AbstractC30166b.m148796a(m17476b);
        }

        private a(String str, int i11, String str2) {
            this.f14603p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m17476b() {
            return new a[]{f14599q, f14600r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f14601s.clone();
        }

        /* renamed from: c */
        public final String m17477c() {
            return this.f14603p;
        }
    }

    private C3487b() {
    }

    /* renamed from: b */
    private final void m17462b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    private final String m17463c(String str, String str2) {
        Object[] objArr = new Object[1];
        C26245a c26245a = C26245a.f124654a;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        objArr[0] = c26245a.m134954m(str + System.currentTimeMillis());
        String format = String.format("temp_%s", Arrays.copyOf(objArr, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        if (str2 != null && str2.length() != 0) {
            str3 = "." + str2;
        }
        return format + str3;
    }

    /* renamed from: d */
    static /* synthetic */ String m17464d(C3487b c3487b, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return c3487b.m17463c(str, str2);
    }

    /* renamed from: f */
    public static /* synthetic */ File m17465f(C3487b c3487b, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return c3487b.m17467e(str, str2);
    }

    /* renamed from: a */
    public final void m17466a() {
        try {
            AbstractC23041d2.m118209h(m17469h());
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final File m17467e(String str, String str2) {
        return m17475n(a.f14600r, str, str2);
    }

    /* renamed from: g */
    public final File m17468g() {
        return new File(m17469h());
    }

    /* renamed from: h */
    public final String m17469h() {
        return m17474m(a.f14599q);
    }

    /* renamed from: i */
    public final String m17470i(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        return m17469h() + C26245a.f124654a.m134954m(str) + AbstractC23041d2.m118220s(str);
    }

    /* renamed from: j */
    public final File m17471j(String str) {
        return new File(m17468g(), m17464d(this, str, null, 2, null));
    }

    /* renamed from: k */
    public final String m17472k(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        String str2 = m17469h() + "unzip_" + C18390e.f92781a.m97421l(str);
        m17462b(str2);
        return str2;
    }

    /* renamed from: l */
    public final String m17473l(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        return m17469h() + C18390e.f92781a.m97421l(str);
    }

    /* renamed from: m */
    public final String m17474m(a aVar) {
        AbstractC19074t.m100208f(aVar, "folder");
        String str = C20131e.f99303a.m104972s0() + aVar.m17477c();
        m17462b(str);
        return str + File.separator;
    }

    /* renamed from: n */
    public final File m17475n(a aVar, String str, String str2) {
        AbstractC19074t.m100208f(aVar, "folder");
        return new File(m17474m(aVar), m17463c(str, str2));
    }
}
