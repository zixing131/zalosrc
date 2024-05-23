package p014a8;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5656w2;
import com.google.firebase.AbstractC6544b;
import com.google.firebase.C6576e;
import com.google.firebase.analytics.connector.internal.AbstractC6539b;
import com.google.firebase.analytics.connector.internal.C6541d;
import com.google.firebase.analytics.connector.internal.C6543f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p014a8.InterfaceC0650a;
import p199h6.C19882a;
import p230i6.AbstractC20324p;
import p230i6.AbstractC20331w;
import p636x8.AbstractC29471a;
import p636x8.InterfaceC29472b;
import p636x8.InterfaceC29474d;

/* renamed from: a8.b */
/* loaded from: classes.dex */
public class C0651b implements InterfaceC0650a {

    /* renamed from: c */
    private static volatile InterfaceC0650a f2198c;

    /* renamed from: a */
    final C19882a f2199a;

    /* renamed from: b */
    final Map f2200b;

    /* renamed from: a8.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0650a.a {

        /* renamed from: a */
        final /* synthetic */ String f2201a;

        a(String str) {
            this.f2201a = str;
        }
    }

    C0651b(C19882a c19882a) {
        AbstractC4205o.m19722k(c19882a);
        this.f2199a = c19882a;
        this.f2200b = new ConcurrentHashMap();
    }

    /* renamed from: h */
    public static InterfaceC0650a m938h(C6576e c6576e, Context context, InterfaceC29474d interfaceC29474d) {
        AbstractC4205o.m19722k(c6576e);
        AbstractC4205o.m19722k(context);
        AbstractC4205o.m19722k(interfaceC29474d);
        AbstractC4205o.m19722k(context.getApplicationContext());
        if (f2198c == null) {
            synchronized (C0651b.class) {
                try {
                    if (f2198c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c6576e.m33617t()) {
                            interfaceC29474d.mo16920a(AbstractC6544b.class, new Executor() { // from class: a8.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC29472b() { // from class: a8.d
                                @Override // p636x8.InterfaceC29472b
                                /* renamed from: a */
                                public final void mo941a(AbstractC29471a abstractC29471a) {
                                    C0651b.m939i(abstractC29471a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c6576e.m33616s());
                        }
                        f2198c = new C0651b(C5656w2.m29823t(context, null, null, null, bundle).m29841q());
                    }
                } finally {
                }
            }
        }
        return f2198c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m939i(AbstractC29471a abstractC29471a) {
        throw null;
    }

    /* renamed from: j */
    private final boolean m940j(String str) {
        if (!str.isEmpty() && this.f2200b.containsKey(str) && this.f2200b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: a */
    public void mo930a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC6539b.m33467d(str) && AbstractC6539b.m33465b(str2, bundle) && AbstractC6539b.m33464a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f2199a.m103585n(str, str2, bundle);
        }
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: b */
    public void mo931b(InterfaceC0650a.c cVar) {
        String str;
        int i11 = AbstractC6539b.f36393g;
        if (cVar != null && (str = cVar.f2183a) != null && !str.isEmpty()) {
            Object obj = cVar.f2185c;
            if ((obj == null || AbstractC20331w.m106026a(obj) != null) && AbstractC6539b.m33467d(str) && AbstractC6539b.m33468e(str, cVar.f2184b)) {
                String str2 = cVar.f2193k;
                if (str2 == null || (AbstractC6539b.m33465b(str2, cVar.f2194l) && AbstractC6539b.m33464a(str, cVar.f2193k, cVar.f2194l))) {
                    String str3 = cVar.f2190h;
                    if (str3 == null || (AbstractC6539b.m33465b(str3, cVar.f2191i) && AbstractC6539b.m33464a(str, cVar.f2190h, cVar.f2191i))) {
                        String str4 = cVar.f2188f;
                        if (str4 == null || (AbstractC6539b.m33465b(str4, cVar.f2189g) && AbstractC6539b.m33464a(str, cVar.f2188f, cVar.f2189g))) {
                            C19882a c19882a = this.f2199a;
                            Bundle bundle = new Bundle();
                            String str5 = cVar.f2183a;
                            if (str5 != null) {
                                bundle.putString("origin", str5);
                            }
                            String str6 = cVar.f2184b;
                            if (str6 != null) {
                                bundle.putString("name", str6);
                            }
                            Object obj2 = cVar.f2185c;
                            if (obj2 != null) {
                                AbstractC20324p.m106023b(bundle, obj2);
                            }
                            String str7 = cVar.f2186d;
                            if (str7 != null) {
                                bundle.putString("trigger_event_name", str7);
                            }
                            bundle.putLong("trigger_timeout", cVar.f2187e);
                            String str8 = cVar.f2188f;
                            if (str8 != null) {
                                bundle.putString("timed_out_event_name", str8);
                            }
                            Bundle bundle2 = cVar.f2189g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str9 = cVar.f2190h;
                            if (str9 != null) {
                                bundle.putString("triggered_event_name", str9);
                            }
                            Bundle bundle3 = cVar.f2191i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", cVar.f2192j);
                            String str10 = cVar.f2193k;
                            if (str10 != null) {
                                bundle.putString("expired_event_name", str10);
                            }
                            Bundle bundle4 = cVar.f2194l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", cVar.f2195m);
                            bundle.putBoolean("active", cVar.f2196n);
                            bundle.putLong("triggered_timestamp", cVar.f2197o);
                            c19882a.m103589r(bundle);
                        }
                    }
                }
            }
        }
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: c */
    public void mo932c(String str, String str2, Object obj) {
        if (!AbstractC6539b.m33467d(str) || !AbstractC6539b.m33468e(str, str2)) {
            return;
        }
        this.f2199a.m103592u(str, str2, obj);
    }

    @Override // p014a8.InterfaceC0650a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 != null && !AbstractC6539b.m33465b(str2, bundle)) {
            return;
        }
        this.f2199a.m103574b(str, str2, bundle);
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: d */
    public Map mo933d(boolean z11) {
        return this.f2199a.m103584m(null, null, z11);
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: e */
    public InterfaceC0650a.a mo934e(String str, InterfaceC0650a.b bVar) {
        Object obj;
        AbstractC4205o.m19722k(bVar);
        if (!AbstractC6539b.m33467d(str) || m940j(str)) {
            return null;
        }
        C19882a c19882a = this.f2199a;
        if ("fiam".equals(str)) {
            obj = new C6541d(c19882a, bVar);
        } else if ("clx".equals(str)) {
            obj = new C6543f(c19882a, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f2200b.put(str, obj);
        return new a(str);
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: f */
    public int mo935f(String str) {
        return this.f2199a.m103583l(str);
    }

    @Override // p014a8.InterfaceC0650a
    /* renamed from: g */
    public List mo936g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f2199a.m103579g(str, str2)) {
            int i11 = AbstractC6539b.f36393g;
            AbstractC4205o.m19722k(bundle);
            InterfaceC0650a.c cVar = new InterfaceC0650a.c();
            cVar.f2183a = (String) AbstractC4205o.m19722k((String) AbstractC20324p.m106022a(bundle, "origin", String.class, null));
            cVar.f2184b = (String) AbstractC4205o.m19722k((String) AbstractC20324p.m106022a(bundle, "name", String.class, null));
            cVar.f2185c = AbstractC20324p.m106022a(bundle, "value", Object.class, null);
            cVar.f2186d = (String) AbstractC20324p.m106022a(bundle, "trigger_event_name", String.class, null);
            cVar.f2187e = ((Long) AbstractC20324p.m106022a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f2188f = (String) AbstractC20324p.m106022a(bundle, "timed_out_event_name", String.class, null);
            cVar.f2189g = (Bundle) AbstractC20324p.m106022a(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f2190h = (String) AbstractC20324p.m106022a(bundle, "triggered_event_name", String.class, null);
            cVar.f2191i = (Bundle) AbstractC20324p.m106022a(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f2192j = ((Long) AbstractC20324p.m106022a(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f2193k = (String) AbstractC20324p.m106022a(bundle, "expired_event_name", String.class, null);
            cVar.f2194l = (Bundle) AbstractC20324p.m106022a(bundle, "expired_event_params", Bundle.class, null);
            cVar.f2196n = ((Boolean) AbstractC20324p.m106022a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f2195m = ((Long) AbstractC20324p.m106022a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f2197o = ((Long) AbstractC20324p.m106022a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
