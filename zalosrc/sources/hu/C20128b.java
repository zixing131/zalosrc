package hu;

import android.app.ActivityManager;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.AbstractC29242q;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p620wt.InterfaceC29240o;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: hu.b */
/* loaded from: classes4.dex */
public final class C20128b {

    /* renamed from: a */
    public static final C20128b f99256a = new C20128b();

    /* renamed from: b */
    private static final C29234i f99257b;

    /* renamed from: c */
    private static final InterfaceC24854k f99258c;

    /* renamed from: d */
    private static final InterfaceC24854k f99259d;

    /* renamed from: e */
    private static final InterfaceC24854k f99260e;

    /* renamed from: f */
    private static final InterfaceC29232g f99261f;

    /* renamed from: g */
    private static final InterfaceC29232g f99262g;

    /* renamed from: h */
    private static final InterfaceC29240o f99263h;

    /* renamed from: hu.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f99264q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(C20128b.m104761h());
        }
    }

    /* renamed from: hu.b$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f99265q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            long j11;
            if (AbstractC23238v2.m119727l()) {
                j11 = AbstractC23238v2.m119723h(C20131e.f99303a.m104979x().getPath());
            } else {
                j11 = 0;
            }
            return Long.valueOf(j11);
        }
    }

    /* renamed from: hu.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f99266q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC23238v2.m119723h(Environment.getDataDirectory().getPath()));
        }
    }

    /* renamed from: hu.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f99267q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    /* renamed from: hu.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f99268q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            boolean m127128x;
            String valueOf = String.valueOf(Build.VERSION.SDK_INT);
            m127128x = AbstractC24341v.m127128x(valueOf);
            if (m127128x) {
                return "UNKNOWN";
            }
            return valueOf;
        }
    }

    /* renamed from: hu.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f99269q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            Object systemService = CoreUtility.getAppContext().getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        C29234i m145994a = AbstractC29235j.m145994a();
        f99257b = m145994a;
        m129210a = AbstractC24856m.m129210a(e.f99268q);
        f99258c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f99267q);
        f99259d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(f.f99269q);
        f99260e = m129210a3;
        f99261f = AbstractC29233h.m145991b(m145994a, c.f99266q);
        f99262g = AbstractC29233h.m145991b(m145994a, b.f99265q);
        f99263h = AbstractC29242q.m146004a(30000L, a.f99264q);
    }

    private C20128b() {
    }

    /* renamed from: a */
    public static final void m104754a() {
        f99257b.m145993b();
    }

    /* renamed from: b */
    public static final long m104755b() {
        Object systemService = CoreUtility.getAppContext().getSystemService("activity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: c */
    public static final int m104756c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            Object systemService = context.getSystemService("batterymanager");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            return ((BatteryManager) systemService).getIntProperty(4);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceInfo", e11);
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: d */
    public static final String m104757d(boolean z11) {
        StringBuilder sb2 = new StringBuilder(" ");
        if (m104767n().length() > 0) {
            sb2.append(m104767n());
            sb2.append(" ");
        }
        if (m104768o().length() > 0) {
            sb2.append(m104768o());
            sb2.append(" ");
        }
        if (z11) {
            String m104771r = m104771r();
            if (m104771r.length() > 0) {
                sb2.append("v.");
                sb2.append(m104771r);
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: e */
    public static /* synthetic */ String m104758e(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m104757d(z11);
    }

    /* renamed from: f */
    private final long m104759f() {
        return ((Number) f99263h.getValue()).longValue();
    }

    /* renamed from: g */
    public static final long m104760g() {
        return f99256a.m104759f();
    }

    /* renamed from: h */
    public static final long m104761h() {
        try {
            if (!AbstractC23238v2.m119727l()) {
                return 0L;
            }
            return AbstractC23238v2.m119722g(C20131e.f99303a.m104979x().getPath());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceInfo", e11);
            return 0L;
        }
    }

    /* renamed from: i */
    private final long m104762i() {
        return ((Number) f99262g.getValue()).longValue();
    }

    /* renamed from: j */
    public static final long m104763j() {
        return f99256a.m104762i();
    }

    /* renamed from: k */
    public static final long m104764k() {
        return AbstractC23238v2.m119722g(Environment.getDataDirectory().getPath());
    }

    /* renamed from: l */
    private final long m104765l() {
        return ((Number) f99261f.getValue()).longValue();
    }

    /* renamed from: m */
    public static final long m104766m() {
        return f99256a.m104765l();
    }

    /* renamed from: n */
    public static final String m104767n() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: o */
    public static final String m104768o() {
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: p */
    private final int m104769p() {
        return ((Number) f99259d.getValue()).intValue();
    }

    /* renamed from: q */
    public static final int m104770q() {
        return f99256a.m104769p();
    }

    /* renamed from: r */
    public static final String m104771r() {
        return f99256a.m104772s();
    }

    /* renamed from: s */
    private final String m104772s() {
        return (String) f99258c.getValue();
    }

    /* renamed from: t */
    public static final long m104773t() {
        return f99256a.m104774u();
    }

    /* renamed from: u */
    private final long m104774u() {
        return ((Number) f99260e.getValue()).longValue();
    }

    /* renamed from: v */
    public static final long m104775v() {
        try {
            return AbstractC20130d.m104857T(new File(C20131e.m104912E())) + AbstractC20130d.m104857T(new File(C20131e.m104913G())) + AbstractC20130d.m104857T(new File(C20131e.m104923r()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceInfo", e11);
            return 0L;
        }
    }

    /* renamed from: w */
    public static final long m104776w() {
        return AbstractC20130d.m104857T(new File(C20131e.m104921q()));
    }

    /* renamed from: x */
    public static final long m104777x() {
        return AbstractC20130d.m104857T(new File(C20131e.m104911D()));
    }

    /* renamed from: y */
    public static final long m104778y() {
        try {
            return m104777x() + m104776w();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceInfo", e11);
            return 0L;
        }
    }
}
