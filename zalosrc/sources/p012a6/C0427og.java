package p012a6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.AbstractC1440f;
import androidx.core.os.C1443i;
import com.google.android.gms.common.internal.C4196l;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.text.internal.C6780n;
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

/* renamed from: a6.og */
/* loaded from: classes2.dex */
public final class C0427og {

    /* renamed from: k */
    private static AbstractC0430p0 f1731k;

    /* renamed from: l */
    private static final AbstractC0468r0 f1732l = AbstractC0468r0.m860c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f1733a;

    /* renamed from: b */
    private final String f1734b;

    /* renamed from: c */
    private final InterfaceC0237eg f1735c;

    /* renamed from: d */
    private final C20470m f1736d;

    /* renamed from: e */
    private final AbstractC22888j f1737e;

    /* renamed from: f */
    private final AbstractC22888j f1738f;

    /* renamed from: g */
    private final String f1739g;

    /* renamed from: h */
    private final int f1740h;

    /* renamed from: i */
    private final Map f1741i = new HashMap();

    /* renamed from: j */
    private final Map f1742j = new HashMap();

    public C0427og(Context context, C20470m c20470m, InterfaceC0237eg interfaceC0237eg, String str) {
        int i11;
        this.f1733a = context.getPackageName();
        this.f1734b = AbstractC20452c.m106484a(context);
        this.f1736d = c20470m;
        this.f1735c = interfaceC0237eg;
        C0162ah.m616a();
        this.f1739g = str;
        this.f1737e = C20460g.m106488a().m106491b(new Callable() { // from class: a6.ig
            public /* synthetic */ CallableC0313ig() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0427og.this.m811b();
            }
        });
        C20460g m106488a = C20460g.m106488a();
        c20470m.getClass();
        this.f1738f = m106488a.m106491b(new Callable() { // from class: a6.jg
            public /* synthetic */ CallableC0332jg() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C20470m.this.m106515a();
            }
        });
        AbstractC0468r0 abstractC0468r0 = f1732l;
        if (abstractC0468r0.containsKey(str)) {
            i11 = DynamiteModule.m19919c(context, (String) abstractC0468r0.get(str));
        } else {
            i11 = -1;
        }
        this.f1740h = i11;
    }

    /* renamed from: a */
    static long m807a(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: i */
    private static synchronized AbstractC0430p0 m808i() {
        synchronized (C0427og.class) {
            try {
                AbstractC0430p0 abstractC0430p0 = f1731k;
                if (abstractC0430p0 != null) {
                    return abstractC0430p0;
                }
                C1443i m7346a = AbstractC1440f.m7346a(Resources.getSystem().getConfiguration());
                C0373m0 c0373m0 = new C0373m0();
                for (int i11 = 0; i11 < m7346a.m7355d(); i11++) {
                    c0373m0.m787a(AbstractC20452c.m106485b(m7346a.m7354c(i11)));
                }
                AbstractC0430p0 m788b = c0373m0.m788b();
                f1731k = m788b;
                return m788b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private final String m809j() {
        if (this.f1737e.mo117588q()) {
            return (String) this.f1737e.mo117584m();
        }
        return C4196l.m19698a().m19699b(this.f1739g);
    }

    /* renamed from: k */
    private final boolean m810k(EnumC0252fc enumC0252fc, long j11, long j12) {
        if (this.f1741i.get(enumC0252fc) == null || j11 - ((Long) this.f1741i.get(enumC0252fc)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ String m811b() {
        return C4196l.m19698a().m19699b(this.f1739g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m812c(InterfaceC0218dg interfaceC0218dg, EnumC0252fc enumC0252fc, String str) {
        String m106515a;
        interfaceC0218dg.mo657b(enumC0252fc);
        String zzd = interfaceC0218dg.zzd();
        C0198cf c0198cf = new C0198cf();
        c0198cf.m638b(this.f1733a);
        c0198cf.m639c(this.f1734b);
        c0198cf.m644h(m808i());
        c0198cf.m643g(Boolean.TRUE);
        c0198cf.m648l(zzd);
        c0198cf.m646j(str);
        if (this.f1738f.mo117588q()) {
            m106515a = (String) this.f1738f.mo117584m();
        } else {
            m106515a = this.f1736d.m106515a();
        }
        c0198cf.m645i(m106515a);
        c0198cf.m640d(10);
        c0198cf.m647k(Integer.valueOf(this.f1740h));
        interfaceC0218dg.mo658c(c0198cf);
        this.f1735c.mo693a(interfaceC0218dg);
    }

    /* renamed from: d */
    public final void m813d(InterfaceC0218dg interfaceC0218dg, EnumC0252fc enumC0252fc) {
        m814e(interfaceC0218dg, enumC0252fc, m809j());
    }

    /* renamed from: e */
    public final void m814e(InterfaceC0218dg interfaceC0218dg, EnumC0252fc enumC0252fc, String str) {
        C20460g.m106489d().execute(new Runnable() { // from class: a6.kg

            /* renamed from: q */
            public final /* synthetic */ InterfaceC0218dg f1570q;

            /* renamed from: r */
            public final /* synthetic */ EnumC0252fc f1571r;

            /* renamed from: s */
            public final /* synthetic */ String f1572s;

            public /* synthetic */ RunnableC0351kg(InterfaceC0218dg interfaceC0218dg2, EnumC0252fc enumC0252fc2, String str2) {
                r2 = interfaceC0218dg2;
                r3 = enumC0252fc2;
                r4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0427og.this.m812c(r2, r3, r4);
            }
        });
    }

    /* renamed from: f */
    public final void m815f(InterfaceC0408ng interfaceC0408ng, EnumC0252fc enumC0252fc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m810k(enumC0252fc, elapsedRealtime, 30L)) {
            return;
        }
        this.f1741i.put(enumC0252fc, Long.valueOf(elapsedRealtime));
        m814e(interfaceC0408ng.zza(), enumC0252fc, m809j());
    }

    /* renamed from: g */
    public final /* synthetic */ void m816g(EnumC0252fc enumC0252fc, C6780n c6780n) {
        InterfaceC0525u0 interfaceC0525u0 = (InterfaceC0525u0) this.f1742j.get(enumC0252fc);
        if (interfaceC0525u0 != null) {
            for (Object obj : interfaceC0525u0.zzo()) {
                ArrayList arrayList = new ArrayList(interfaceC0525u0.mo660b(obj));
                Collections.sort(arrayList);
                C0289hb c0289hb = new C0289hb();
                Iterator it = arrayList.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ((Long) it.next()).longValue();
                }
                c0289hb.m751a(Long.valueOf(j11 / arrayList.size()));
                c0289hb.m753c(Long.valueOf(m807a(arrayList, 100.0d)));
                c0289hb.m756f(Long.valueOf(m807a(arrayList, 75.0d)));
                c0289hb.m754d(Long.valueOf(m807a(arrayList, 50.0d)));
                c0289hb.m752b(Long.valueOf(m807a(arrayList, 25.0d)));
                c0289hb.m755e(Long.valueOf(m807a(arrayList, 0.0d)));
                m814e(c6780n.m34606a(obj, arrayList.size(), c0289hb.m757g()), enumC0252fc, m809j());
            }
            this.f1742j.remove(enumC0252fc);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m817h(EnumC0252fc enumC0252fc, Object obj, long j11, C6780n c6780n) {
        if (!this.f1742j.containsKey(enumC0252fc)) {
            this.f1742j.put(enumC0252fc, C0486s.m870n());
        }
        ((InterfaceC0525u0) this.f1742j.get(enumC0252fc)).mo743a(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m810k(enumC0252fc, elapsedRealtime, 30L)) {
            return;
        }
        this.f1741i.put(enumC0252fc, Long.valueOf(elapsedRealtime));
        C20460g.m106489d().execute(new Runnable() { // from class: a6.mg

            /* renamed from: q */
            public final /* synthetic */ EnumC0252fc f1652q;

            /* renamed from: r */
            public final /* synthetic */ C6780n f1653r;

            public /* synthetic */ RunnableC0389mg(EnumC0252fc enumC0252fc2, C6780n c6780n2) {
                r2 = enumC0252fc2;
                r3 = c6780n2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0427og.this.m816g(r2, r3);
            }
        });
    }
}
