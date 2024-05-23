package tz;

import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import su.AbstractC26389c;
import uz.C27386b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: tz.a */
/* loaded from: classes4.dex */
public final class C26906a {

    /* renamed from: a */
    public static final C26906a f127330a;

    /* renamed from: b */
    private static final C23528a f127331b;

    /* renamed from: c */
    private static File f127332c;

    /* renamed from: d */
    private static boolean f127333d;

    /* renamed from: e */
    private static a f127334e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: tz.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f127335p = new a("NotExistsOrExpired", 0);

        /* renamed from: q */
        public static final a f127336q = new a("Downloading", 1);

        /* renamed from: r */
        public static final a f127337r = new a("DownloadFail", 2);

        /* renamed from: s */
        public static final a f127338s = new a("ChecksumFail", 3);

        /* renamed from: t */
        public static final a f127339t = new a("ChecksumSuccess", 4);

        /* renamed from: u */
        public static final a f127340u = new a("UpToDate", 5);

        /* renamed from: v */
        private static final /* synthetic */ a[] f127341v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f127342w;

        static {
            a[] m138703b = m138703b();
            f127341v = m138703b;
            f127342w = AbstractC30166b.m148796a(m138703b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m138703b() {
            return new a[]{f127335p, f127336q, f127337r, f127338s, f127339t, f127340u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f127341v.clone();
        }
    }

    /* renamed from: tz.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ C27386b f127343v0;

        b(C27386b c27386b) {
            this.f127343v0 = c27386b;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            if (file != null && file.exists() && c23995f.m125657h() == 200) {
                C26906a c26906a = C26906a.f127330a;
                C27386b c27386b = this.f127343v0;
                AbstractC19074t.m100205c(file);
                if (c26906a.m138696e(c27386b, file)) {
                    C26906a.f127334e = a.f127339t;
                    return;
                }
                AbstractC20110a.f98889a.mo104554k("Checksum fail", new Object[0]);
                C26906a.f127334e = a.f127338s;
                C26906a.f127333d = false;
                return;
            }
            AbstractC20110a.f98889a.mo104554k("Download model fail", new Object[0]);
            C26906a c26906a2 = C26906a.f127330a;
            C26906a.f127334e = a.f127337r;
            C26906a.f127333d = false;
        }
    }

    static {
        C26906a c26906a = new C26906a();
        f127330a = c26906a;
        f127331b = new C23528a(MainApplication.Companion.m35500c());
        f127332c = new File(c26906a.m138699i(), "classify_qr_new.tflite");
        f127334e = a.f127335p;
    }

    private C26906a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m138696e(C27386b c27386b, File file) {
        try {
            String m135987c = AbstractC26389c.m135987c(file);
            AbstractC19074t.m100205c(m135987c);
            if (m135987c.length() <= 0 || c27386b.m140307a().length() <= 0) {
                return false;
            }
            if (!AbstractC19074t.m100204b(m135987c, c27386b.m140307a())) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: f */
    private final void m138697f(C27386b c27386b) {
        f127333d = true;
        f127334e = a.f127336q;
        AbstractC20110a.f98889a.mo104554k("Downloading model " + c27386b.m140309c(), new Object[0]);
        if (!m138699i().exists()) {
            m138699i().mkdirs();
        }
        if (!m138699i().exists()) {
            f127333d = false;
        } else {
            f127331b.m123600e(c27386b.m140309c(), f127332c, new b(c27386b));
        }
    }

    /* renamed from: g */
    private final void m138698g(C27386b c27386b, C27386b c27386b2) {
        a aVar;
        if (c27386b != null) {
            if (c27386b2 != null && c27386b.m140310d() <= c27386b2.m140310d()) {
                if (m138701h().exists()) {
                    aVar = a.f127340u;
                } else {
                    C26908c.f127344a.m138713h("");
                    aVar = a.f127335p;
                }
                f127334e = aVar;
                return;
            }
            if (!f127333d) {
                m138697f(c27386b);
            }
        }
    }

    /* renamed from: i */
    private final File m138699i() {
        return new File(C20131e.f99303a.m104959j());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m138700d(boolean z11, boolean[] zArr) {
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(zArr, "output");
        C26908c c26908c = C26908c.f127344a;
        C27386b m138710d = c26908c.m138710d();
        C27386b m138711e = c26908c.m138711e();
        if (m138710d != null) {
            m138698g(m138710d, m138711e);
            a aVar = f127334e;
            a aVar2 = a.f127339t;
            if (aVar == aVar2 && z11) {
                zArr[0] = false;
                zArr[1] = false;
                return;
            }
            if (f127334e == aVar2) {
                if (m138711e == null) {
                    AbstractC20110a.f98889a.mo104554k("Placing new model version: " + m138710d.m140310d(), new Object[0]);
                } else {
                    AbstractC20110a.f98889a.mo104554k("Replacing old model version " + m138711e.m140310d() + " to version " + m138710d.m140310d(), new Object[0]);
                }
                m138702j();
                if (m138701h().exists()) {
                    f127334e = a.f127340u;
                    c26908c.m138713h(m138710d.m140308b());
                    f127333d = false;
                    AbstractC20110a.f98889a.mo104554k("Model version " + m138710d.m140310d() + " downloaded.", new Object[0]);
                    z12 = true;
                    if (f127334e != a.f127340u) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zArr[0] = z13;
                    zArr[1] = z12;
                    return;
                }
                f127334e = a.f127335p;
            }
            z12 = false;
            if (f127334e != a.f127340u) {
            }
            zArr[0] = z13;
            zArr[1] = z12;
            return;
        }
        zArr[0] = false;
        zArr[1] = false;
    }

    /* renamed from: h */
    public final File m138701h() {
        return new File(m138699i(), "classify_qr.tflite");
    }

    /* renamed from: j */
    public final void m138702j() {
        if (m138701h().exists()) {
            AbstractC20130d.m104858T0(m138701h());
        }
        f127332c.renameTo(m138701h());
        f127332c = new File(m138699i(), "classify_qr_new.tflite");
    }
}
