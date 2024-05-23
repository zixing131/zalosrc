package p716zh;

import ag0.AbstractC0837p0;
import android.graphics.Typeface;
import bo.C3013n3;
import com.androidquery.util.C3979l;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.widget.C13718q1;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23352g;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31903ea;
import pm0.C24848g0;

/* renamed from: zh.ea */
/* loaded from: classes3.dex */
public final class C31903ea {

    /* renamed from: a */
    public static final C31903ea f146582a = new C31903ea();

    /* renamed from: b */
    private static final String f146583b;

    /* renamed from: c */
    private static final C23528a f146584c;

    /* renamed from: d */
    private static final Map f146585d;

    /* renamed from: e */
    private static final Object f146586e;

    /* renamed from: f */
    private static final Typeface f146587f;

    /* renamed from: g */
    private static final a f146588g;

    /* renamed from: zh.ea$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo153347a(String str, C3979l c3979l);
    }

    /* renamed from: zh.ea$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo46919a(C3979l c3979l);
    }

    /* renamed from: zh.ea$c */
    /* loaded from: classes3.dex */
    public static final class c implements a {
        c() {
        }

        /* renamed from: c */
        public static final void m153349c(String str, C3979l c3979l) {
            AbstractC19074t.m100208f(str, "$key");
            try {
                C31903ea c31903ea = C31903ea.f146582a;
                synchronized (c31903ea.m153337b()) {
                    try {
                        List<b> list = (List) c31903ea.m153339d().remove(str);
                        if (list != null) {
                            for (b bVar : list) {
                                if (bVar != null) {
                                    bVar.mo46919a(c3979l);
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

        @Override // p716zh.C31903ea.a
        /* renamed from: a */
        public void mo153347a(String str, C3979l c3979l) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.fa

                /* renamed from: p */
                public final /* synthetic */ String f146634p;

                /* renamed from: q */
                public final /* synthetic */ C3979l f146635q;

                public /* synthetic */ RunnableC31918fa(String str2, C3979l c3979l2) {
                    r1 = str2;
                    r2 = c3979l2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31903ea.c.m153349c(r1, r2);
                }
            });
        }
    }

    static {
        String m104874i0 = AbstractC20130d.m104874i0();
        AbstractC19074t.m100207e(m104874i0, "getPictureExternalStorageDirectory(...)");
        f146583b = m104874i0;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        f146584c = new C23528a(c6895a.m35500c());
        f146585d = new HashMap();
        f146586e = new Object();
        f146587f = C13718q1.m76694c(c6895a.m35500c(), 5);
        f146588g = new c();
    }

    private C31903ea() {
    }

    /* renamed from: a */
    public final Typeface m153336a() {
        return f146587f;
    }

    /* renamed from: b */
    public final Object m153337b() {
        return f146586e;
    }

    /* renamed from: c */
    public final C23528a m153338c() {
        return f146584c;
    }

    /* renamed from: d */
    public final Map m153339d() {
        return f146585d;
    }

    /* renamed from: e */
    public final C3979l m153340e(String str, int i11, int i12, C24003n c24003n) {
        AbstractC19074t.m100208f(str, "caption");
        AbstractC19074t.m100208f(c24003n, "options");
        return C23999j.m125676A2(m153342g(str, i11, i12), c24003n.f116260a, c24003n.f116266g);
    }

    /* renamed from: f */
    public final C3979l m153341f(String str, int i11) {
        AbstractC19074t.m100208f(str, "caption");
        String m153343h = m153343h(str, i11);
        BaseZaloActivity.C10924a c10924a = BaseZaloActivity.Companion;
        C3979l m56697a = c10924a.m56697a(m153343h);
        if (m56697a == null) {
            m56697a = c10924a.m56697a(m153344i(str, i11));
        }
        if (m56697a == null) {
            m56697a = c10924a.m56697a(m153342g(str, i11, 0));
        }
        if (m56697a == null) {
            m56697a = c10924a.m56697a(m153342g(str, i11, 1));
        }
        if (m56697a == null) {
            return c10924a.m56697a(m153342g(str, i11, 2));
        }
        return m56697a;
    }

    /* renamed from: g */
    public final String m153342g(String str, int i11, int i12) {
        String str2;
        AbstractC19074t.m100208f(str, "caption");
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        str2 = "STATUS_STORY_THUMB";
                    } else {
                        str2 = "STATUS_STORY_THUMB_ARCHIVE";
                    }
                } else {
                    str2 = "STATUS_STORY_THUMB_LARGE_RECTANGLE";
                }
            } else {
                str2 = "STATUS_STORY_THUMB_CIRCLE";
            }
        } else {
            str2 = "STATUS_STORY_THUMB_RECTANGLE";
        }
        try {
            String m122788d = AbstractC23352g.m122788d(str2 + "_" + i11 + "_" + str);
            return f146583b + m122788d;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: h */
    public final String m153343h(String str, int i11) {
        AbstractC19074t.m100208f(str, "caption");
        try {
            String m122788d = AbstractC23352g.m122788d("STATUS_STORY_THUMB_FULL_" + i11 + "_" + str);
            return f146583b + m122788d;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: i */
    public final String m153344i(String str, int i11) {
        AbstractC19074t.m100208f(str, "caption");
        try {
            String m122788d = AbstractC23352g.m122788d("STATUS_STORY_THUMB_PRELOAD_" + i11 + "_" + str);
            return f146583b + m122788d;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: j */
    public final boolean m153345j(String str, int i11, int i12, C24003n c24003n) {
        AbstractC19074t.m100208f(str, "caption");
        AbstractC19074t.m100208f(c24003n, "options");
        if (m153340e(str, i11, i12, c24003n) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m153346k(String str, int i11, C3013n3 c3013n3, C24003n c24003n, int i12, b bVar) {
        AbstractC19074t.m100208f(str, "caption");
        AbstractC19074t.m100208f(c24003n, "options");
        try {
            C3979l m153340e = m153340e(str, i11, i12, c24003n);
            if (m153340e != null && bVar != null) {
                bVar.mo46919a(m153340e);
                return;
            }
            String m122788d = AbstractC23352g.m122788d(i11 + "_" + str);
            synchronized (f146586e) {
                try {
                    Map map = f146585d;
                    List list = (List) map.get(m122788d);
                    if (list != null && !list.isEmpty()) {
                        list.add(bVar);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bVar);
                    AbstractC19074t.m100205c(m122788d);
                    map.put(m122788d, arrayList);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new RunnableC32019m6(m122788d, str, i11, c3013n3, i12, c24003n, f146588g));
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
