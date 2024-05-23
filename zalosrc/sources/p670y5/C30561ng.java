package p670y5;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.AbstractC1440f;
import androidx.core.os.C1443i;
import com.google.android.gms.common.internal.C4196l;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.barcode.internal.C6758g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p234ia.AbstractC20452c;
import p234ia.C20460g;
import p234ia.C20470m;
import p342m6.AbstractC22888j;

/* renamed from: y5.ng */
/* loaded from: classes2.dex */
public final class C30561ng {

    /* renamed from: k */
    private static AbstractC30375e1 f141557k;

    /* renamed from: l */
    private static final AbstractC30413g1 f141558l = AbstractC30413g1.m149505c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f141559a;

    /* renamed from: b */
    private final String f141560b;

    /* renamed from: c */
    private final InterfaceC30371dg f141561c;

    /* renamed from: d */
    private final C20470m f141562d;

    /* renamed from: e */
    private final AbstractC22888j f141563e;

    /* renamed from: f */
    private final AbstractC22888j f141564f;

    /* renamed from: g */
    private final String f141565g;

    /* renamed from: h */
    private final int f141566h;

    /* renamed from: i */
    private final Map f141567i = new HashMap();

    /* renamed from: j */
    private final Map f141568j = new HashMap();

    public C30561ng(Context context, C20470m c20470m, InterfaceC30371dg interfaceC30371dg, String str) {
        int i11;
        this.f141559a = context.getPackageName();
        this.f141560b = AbstractC20452c.m106484a(context);
        this.f141562d = c20470m;
        this.f141561c = interfaceC30371dg;
        C30789zg.m149740a();
        this.f141565g = str;
        this.f141563e = C20460g.m106488a().m106491b(new Callable() { // from class: y5.hg
            public /* synthetic */ CallableC30447hg() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C30561ng.this.m149585b();
            }
        });
        C20460g m106488a = C20460g.m106488a();
        c20470m.getClass();
        this.f141564f = m106488a.m106491b(new Callable() { // from class: y5.ig
            public /* synthetic */ CallableC30466ig() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C20470m.this.m106515a();
            }
        });
        AbstractC30413g1 abstractC30413g1 = f141558l;
        if (abstractC30413g1.containsKey(str)) {
            i11 = DynamiteModule.m19919c(context, (String) abstractC30413g1.get(str));
        } else {
            i11 = -1;
        }
        this.f141566h = i11;
    }

    /* renamed from: a */
    static long m149581a(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: i */
    private static synchronized AbstractC30375e1 m149582i() {
        synchronized (C30561ng.class) {
            try {
                AbstractC30375e1 abstractC30375e1 = f141557k;
                if (abstractC30375e1 != null) {
                    return abstractC30375e1;
                }
                C1443i m7346a = AbstractC1440f.m7346a(Resources.getSystem().getConfiguration());
                C30318b1 c30318b1 = new C30318b1();
                for (int i11 = 0; i11 < m7346a.m7355d(); i11++) {
                    c30318b1.m149464e(AbstractC20452c.m106485b(m7346a.m7354c(i11)));
                }
                AbstractC30375e1 m149466g = c30318b1.m149466g();
                f141557k = m149466g;
                return m149466g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private final String m149583j() {
        if (this.f141563e.mo117588q()) {
            return (String) this.f141563e.mo117584m();
        }
        return C4196l.m19698a().m19699b(this.f141565g);
    }

    /* renamed from: k */
    private final boolean m149584k(EnumC30405fc enumC30405fc, long j11, long j12) {
        if (this.f141567i.get(enumC30405fc) == null || j11 - ((Long) this.f141567i.get(enumC30405fc)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ String m149585b() {
        return C4196l.m19698a().m19699b(this.f141565g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m149586c(InterfaceC30352cg interfaceC30352cg, EnumC30405fc enumC30405fc, String str) {
        String m106515a;
        interfaceC30352cg.mo149474c(enumC30405fc);
        String zzd = interfaceC30352cg.zzd();
        C30768ye c30768ye = new C30768ye();
        c30768ye.m149722b(this.f141559a);
        c30768ye.m149723c(this.f141560b);
        c30768ye.m149728h(m149582i());
        c30768ye.m149727g(Boolean.TRUE);
        c30768ye.m149732l(zzd);
        c30768ye.m149730j(str);
        if (this.f141564f.mo117588q()) {
            m106515a = (String) this.f141564f.mo117584m();
        } else {
            m106515a = this.f141562d.m106515a();
        }
        c30768ye.m149729i(m106515a);
        c30768ye.m149724d(10);
        c30768ye.m149731k(Integer.valueOf(this.f141566h));
        interfaceC30352cg.mo149473b(c30768ye);
        this.f141561c.mo149479a(interfaceC30352cg);
    }

    /* renamed from: d */
    public final void m149587d(InterfaceC30352cg interfaceC30352cg, EnumC30405fc enumC30405fc) {
        m149588e(interfaceC30352cg, enumC30405fc, m149583j());
    }

    /* renamed from: e */
    public final void m149588e(InterfaceC30352cg interfaceC30352cg, EnumC30405fc enumC30405fc, String str) {
        C20460g.m106489d().execute(new Runnable() { // from class: y5.jg

            /* renamed from: q */
            public final /* synthetic */ InterfaceC30352cg f141407q;

            /* renamed from: r */
            public final /* synthetic */ EnumC30405fc f141408r;

            /* renamed from: s */
            public final /* synthetic */ String f141409s;

            public /* synthetic */ RunnableC30485jg(InterfaceC30352cg interfaceC30352cg2, EnumC30405fc enumC30405fc2, String str2) {
                r2 = interfaceC30352cg2;
                r3 = enumC30405fc2;
                r4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30561ng.this.m149586c(r2, r3, r4);
            }
        });
    }

    /* renamed from: f */
    public final void m149589f(InterfaceC30542mg interfaceC30542mg, EnumC30405fc enumC30405fc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m149584k(enumC30405fc, elapsedRealtime, 30L)) {
            return;
        }
        this.f141567i.put(enumC30405fc, Long.valueOf(elapsedRealtime));
        m149588e(interfaceC30542mg.zza(), enumC30405fc, m149583j());
    }

    /* renamed from: g */
    public final /* synthetic */ void m149590g(EnumC30405fc enumC30405fc, C6758g c6758g) {
        InterfaceC30470j1 interfaceC30470j1 = (InterfaceC30470j1) this.f141568j.get(enumC30405fc);
        if (interfaceC30470j1 != null) {
            for (Object obj : interfaceC30470j1.zzo()) {
                ArrayList arrayList = new ArrayList(interfaceC30470j1.mo149553b(obj));
                Collections.sort(arrayList);
                C30461ib c30461ib = new C30461ib();
                Iterator it = arrayList.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ((Long) it.next()).longValue();
                }
                c30461ib.m149538a(Long.valueOf(j11 / arrayList.size()));
                c30461ib.m149540c(Long.valueOf(m149581a(arrayList, 100.0d)));
                c30461ib.m149543f(Long.valueOf(m149581a(arrayList, 75.0d)));
                c30461ib.m149541d(Long.valueOf(m149581a(arrayList, 50.0d)));
                c30461ib.m149539b(Long.valueOf(m149581a(arrayList, 25.0d)));
                c30461ib.m149542e(Long.valueOf(m149581a(arrayList, 0.0d)));
                m149588e(c6758g.m34577a(obj, arrayList.size(), c30461ib.m149544g()), enumC30405fc, m149583j());
            }
            this.f141568j.remove(enumC30405fc);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m149591h(EnumC30405fc enumC30405fc, Object obj, long j11, C6758g c6758g) {
        if (!this.f141568j.containsKey(enumC30405fc)) {
            this.f141568j.put(enumC30405fc, C30431h0.m149525n());
        }
        ((InterfaceC30470j1) this.f141568j.get(enumC30405fc)).mo149484a(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m149584k(enumC30405fc, elapsedRealtime, 30L)) {
            return;
        }
        this.f141567i.put(enumC30405fc, Long.valueOf(elapsedRealtime));
        C20460g.m106489d().execute(new Runnable() { // from class: y5.lg

            /* renamed from: q */
            public final /* synthetic */ EnumC30405fc f141489q;

            /* renamed from: r */
            public final /* synthetic */ C6758g f141490r;

            public /* synthetic */ RunnableC30523lg(EnumC30405fc enumC30405fc2, C6758g c6758g2) {
                r2 = enumC30405fc2;
                r3 = c6758g2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30561ng.this.m149590g(r2, r3);
            }
        });
    }
}
