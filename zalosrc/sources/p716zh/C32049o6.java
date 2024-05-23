package p716zh;

import ag0.AbstractC0837p0;
import bo.C3063z0;
import com.androidquery.util.C3979l;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.C23278z2;
import mm0.AbstractC23352g;
import p354n3.C23528a;
import p379o3.C23999j;
import pm0.C24848g0;

/* renamed from: zh.o6 */
/* loaded from: classes3.dex */
public final class C32049o6 {

    /* renamed from: a */
    public static final C32049o6 f147573a = new C32049o6();

    /* renamed from: b */
    private static final String f147574b;

    /* renamed from: c */
    private static final Map f147575c;

    /* renamed from: d */
    private static final Object f147576d;

    /* renamed from: e */
    private static final b f147577e;

    /* renamed from: zh.o6$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo44791a(C3979l c3979l, boolean z11);
    }

    /* renamed from: zh.o6$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo154650a(String str, C3979l c3979l, boolean z11);
    }

    /* renamed from: zh.o6$c */
    /* loaded from: classes3.dex */
    public static final class c implements b {
        c() {
        }

        @Override // p716zh.C32049o6.b
        /* renamed from: a */
        public void mo154650a(String str, C3979l c3979l, boolean z11) {
            AbstractC19074t.m100208f(str, "key");
            try {
                C32049o6 c32049o6 = C32049o6.f147573a;
                synchronized (c32049o6.m154646b()) {
                    try {
                        List<a> list = (List) c32049o6.m154647c().remove(str);
                        List list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            for (a aVar : list) {
                                if (aVar != null) {
                                    aVar.mo44791a(c3979l, z11);
                                }
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    static {
        String m104874i0 = AbstractC20130d.m104874i0();
        AbstractC19074t.m100207e(m104874i0, "getPictureExternalStorageDirectory(...)");
        f147574b = m104874i0;
        f147575c = new HashMap();
        f147576d = new Object();
        f147577e = new c();
    }

    private C32049o6() {
    }

    /* renamed from: a */
    public final String m154645a() {
        return f147574b;
    }

    /* renamed from: b */
    public final Object m154646b() {
        return f147576d;
    }

    /* renamed from: c */
    public final Map m154647c() {
        return f147575c;
    }

    /* renamed from: d */
    public final void m154648d(C3063z0 c3063z0, int i11, float f11, C23528a c23528a, a aVar, boolean z11) {
        try {
            if (c3063z0 == null) {
                if (aVar != null) {
                    aVar.mo44791a(null, false);
                }
                m154649e("feedLocation null");
                return;
            }
            String m122788d = AbstractC23352g.m122788d("FEED_LOCATION_" + c3063z0.m153169a() + "_" + c3063z0.m153170b());
            String str = f147574b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(m122788d);
            String sb3 = sb2.toString();
            C3979l m125676A2 = C23999j.m125676A2(sb3, C23278z2.m120096T().f116260a, C23278z2.m120096T().f116266g);
            if (m125676A2 != null) {
                if (aVar != null) {
                    aVar.mo44791a(m125676A2, true);
                }
                m154649e("src on MEM");
                return;
            }
            if (z11) {
                return;
            }
            synchronized (f147576d) {
                try {
                    Map map = f147575c;
                    List list = (List) map.get(sb3);
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        list.add(aVar);
                        f147573a.m154649e("add exist task");
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    map.put(sb3, arrayList);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new RunnableC32004l6(c3063z0, i11, f11, c23528a, f147577e));
                    f147573a.m154649e("start new task");
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m154649e(String str) {
        AbstractC19074t.m100208f(str, "msg");
    }
}
