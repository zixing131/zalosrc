package p248iy;

import android.content.Context;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import p620wt.AbstractC29229d;
import p620wt.InterfaceC29228c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: iy.f */
/* loaded from: classes.dex */
public abstract class AbstractC20886f {

    /* renamed from: a */
    private static long f102621a = 86400000;

    /* renamed from: b */
    private static final InterfaceC24854k f102622b;

    /* renamed from: c */
    private static final InterfaceC24854k f102623c;

    /* renamed from: d */
    private static final InterfaceC24854k f102624d;

    /* renamed from: e */
    private static String f102625e;

    /* renamed from: f */
    private static final InterfaceC29228c f102626f;

    /* renamed from: g */
    private static final InterfaceC29228c f102627g;

    /* renamed from: iy.f$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f102628q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC19074t.m100216n(AbstractC20886f.m109204d(), "/log.qos");
        }
    }

    /* renamed from: iy.f$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f102629q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC19074t.m100216n(AbstractC20886f.m109204d(), "/logqos.zip");
        }
    }

    /* renamed from: iy.f$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f102630q = new c();

        c() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:            r0 = on0.AbstractC24341v.m127114D(r2, "/files", "", false, 4, null);     */
        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String mo12V4() {
            File filesDir;
            String m127114D;
            Context appContext = CoreUtility.getAppContext();
            if (appContext == null || (filesDir = appContext.getFilesDir()) == null || (r2 = filesDir.getPath()) == null || m127114D == null) {
                return "";
            }
            return m127114D;
        }
    }

    /* renamed from: iy.f$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f102631q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "https://qos.talk.zing.vn/api/qos/uploadv2";
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(c.f102630q);
        f102622b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f102628q);
        f102623c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(b.f102629q);
        f102624d = m129210a3;
        f102625e = "0.0.0.0";
        InterfaceC29228c m145982a = AbstractC29229d.m145982a(d.f102631q);
        f102626f = m145982a;
        f102627g = m145982a;
    }

    /* renamed from: a */
    public static final String m109201a() {
        return f102625e;
    }

    /* renamed from: b */
    public static final String m109202b() {
        return (String) f102623c.getValue();
    }

    /* renamed from: c */
    public static final String m109203c() {
        return (String) f102624d.getValue();
    }

    /* renamed from: d */
    public static final String m109204d() {
        return (String) f102622b.getValue();
    }

    /* renamed from: e */
    public static final long m109205e() {
        return f102621a;
    }

    /* renamed from: f */
    public static final String m109206f() {
        return (String) f102627g.getValue();
    }

    /* renamed from: g */
    public static final InterfaceC29228c m109207g() {
        return f102626f;
    }

    /* renamed from: h */
    public static final void m109208h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f102625e = str;
    }

    /* renamed from: i */
    public static final void m109209i(long j11) {
        f102621a = j11 * 60000;
    }
}
