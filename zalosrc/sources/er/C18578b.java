package er;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.util.SparseIntArray;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import er.C18578b;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gr.C19590b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C32123ta;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import vg.C28203u6;

/* renamed from: er.b */
/* loaded from: classes4.dex */
public final class C18578b {

    /* renamed from: a */
    public static final C18578b f93336a = new C18578b();

    /* renamed from: b */
    private static List f93337b;

    /* renamed from: c */
    private static List f93338c;

    /* renamed from: d */
    private static Map f93339d;

    /* renamed from: e */
    private static final SparseIntArray f93340e;

    /* renamed from: f */
    private static String f93341f;

    /* renamed from: g */
    private static String f93342g;

    /* renamed from: h */
    private static String f93343h;

    /* renamed from: i */
    private static final Object f93344i;

    /* renamed from: j */
    private static final List f93345j;

    /* renamed from: k */
    private static int f93346k;

    /* renamed from: er.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo98067a(C19590b c19590b);

        /* renamed from: b */
        void mo98068b(C19590b c19590b);
    }

    /* renamed from: er.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f93347a;

        b(String str) {
            this.f93347a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42484o4(CoreUtility.f89233i, this.f93347a);
        }
    }

    /* renamed from: er.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f93348a;

        c(List list) {
            this.f93348a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42494p4(CoreUtility.f89233i, this.f93348a);
        }
    }

    /* renamed from: er.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m98070d(List list, String str) {
            for (Iterator it = C18578b.f93345j.iterator(); it.hasNext(); it = it) {
                a aVar = (a) it.next();
                C18578b c18578b = C18578b.f93336a;
                String m98057o = c18578b.m98057o();
                String m98048f = c18578b.m98048f();
                String m98049g = c18578b.m98049g();
                AbstractC19074t.m100205c(list);
                AbstractC19074t.m100205c(str);
                aVar.mo98067a(new C19590b(m98057o, m98048f, m98049g, list, false, false, str, true, true, 0, 0, 1024, null));
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String str;
            String str2;
            Object m131216p0;
            String str3 = null;
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, CoreUtility.f89233i, null, 2, null);
            C18578b c18578b = C18578b.f93336a;
            if (m141798e != null) {
                str = m141798e.f42434r;
            } else {
                str = null;
            }
            final String str4 = "";
            if (str == null) {
                str = "";
            }
            c18578b.m98065w(str);
            if (m141798e != null) {
                str2 = m141798e.f42437s;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            c18578b.m98061s(str2);
            if (m141798e != null) {
                str3 = m141798e.f42446v;
            }
            if (str3 == null) {
                str3 = "";
            }
            c18578b.m98060r(str3);
            final List m42310X6 = C7960e.m41971c6().m42310X6(CoreUtility.f89233i);
            List list = m42310X6;
            if (list != null && !list.isEmpty()) {
                AbstractC19074t.m100205c(m42310X6);
                m131216p0 = AbstractC25332a0.m131216p0(m42310X6);
                str4 = ((C32123ta) m131216p0).f148138h;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: er.c
                @Override // java.lang.Runnable
                public final void run() {
                    C18578b.d.m98070d(m42310X6, str4);
                }
            });
        }
    }

    /* renamed from: er.b$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f93349a;

        /* renamed from: b */
        final /* synthetic */ boolean f93350b;

        /* renamed from: c */
        final /* synthetic */ boolean f93351c;

        /* renamed from: er.b$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42538t3(CoreUtility.f89233i);
            }
        }

        /* renamed from: er.b$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C32123ta f93352a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f93353b;

            b(C32123ta c32123ta, JSONObject jSONObject) {
                this.f93352a = c32123ta;
                this.f93353b = jSONObject;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42165J8(CoreUtility.f89233i, this.f93352a.f148138h, this.f93353b.toString());
            }
        }

        e(String str, boolean z11, boolean z12) {
            this.f93349a = str;
            this.f93350b = z11;
            this.f93351c = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m98073e(List list, boolean z11, boolean z12, String str, boolean z13, int i11) {
            AbstractC19074t.m100208f(list, "$result");
            AbstractC19074t.m100208f(str, "$lastId");
            C18578b c18578b = C18578b.f93336a;
            c18578b.m98062t(c18578b.m98053k() + 1);
            for (Iterator it = C18578b.f93345j.iterator(); it.hasNext(); it = it) {
                a aVar = (a) it.next();
                C18578b c18578b2 = C18578b.f93336a;
                aVar.mo98068b(new C19590b(c18578b2.m98057o(), c18578b2.m98048f(), c18578b2.m98049g(), list, z11, z12, str, z13, true, 0, i11));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m98074f(boolean z11, boolean z12, C20096c c20096c) {
            List m131502j;
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            C18578b c18578b = C18578b.f93336a;
            c18578b.m98062t(c18578b.m98053k() + 1);
            for (a aVar : C18578b.f93345j) {
                C18578b c18578b2 = C18578b.f93336a;
                String m98057o = c18578b2.m98057o();
                String m98048f = c18578b2.m98048f();
                String m98049g = c18578b2.m98049g();
                m131502j = AbstractC25368s.m131502j();
                aVar.mo98068b(new C19590b(m98057o, m98048f, m98049g, m131502j, z11, z12, "", false, false, c20096c.m104491c(), 0, 1024, null));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final boolean z11 = this.f93350b;
            final boolean z12 = this.f93351c;
            AbstractC19444a.m101694b(new Runnable() { // from class: er.d
                @Override // java.lang.Runnable
                public final void run() {
                    C18578b.e.m98074f(z11, z12, c20096c);
                }
            }, 300L);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            final String str5;
            final boolean z11;
            final int i11;
            JSONArray jSONArray;
            C32123ta c32123ta;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                final ArrayList arrayList = new ArrayList();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("uid");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString("avt");
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString("dpName");
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                C18578b c18578b = C18578b.f93336a;
                if (AbstractC19074t.m100204b(c18578b.m98057o(), "") || !AbstractC19074t.m100204b(str, "0")) {
                    c18578b.m98065w(str);
                }
                if (AbstractC19074t.m100204b(c18578b.m98048f(), "") || !AbstractC19074t.m100204b(str2, "")) {
                    c18578b.m98060r(str2);
                }
                if (AbstractC19074t.m100204b(c18578b.m98049g(), "") || !AbstractC19074t.m100204b(str3, "")) {
                    c18578b.m98061s(str3);
                }
                if (optJSONObject != null) {
                    str4 = optJSONObject.optString("lastStoryId");
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (optJSONObject != null) {
                    z11 = optJSONObject.optBoolean("lmore");
                } else {
                    z11 = false;
                }
                if (optJSONObject != null) {
                    i11 = optJSONObject.optInt("totalStoryArchive", 0);
                } else {
                    i11 = 0;
                }
                boolean m100204b = AbstractC19074t.m100204b(this.f93349a, "0");
                if (m100204b) {
                    C0824j.m2153b(new a());
                }
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.optJSONArray("listStory");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i12);
                        if (jSONObject != null) {
                            c32123ta = new C32123ta(jSONObject);
                        } else {
                            c32123ta = null;
                        }
                        if (c32123ta != null) {
                            arrayList.add(c32123ta);
                            if (m100204b) {
                                C0824j.m2153b(new b(c32123ta, jSONObject));
                            }
                        }
                    }
                }
                final boolean z12 = this.f93350b;
                final boolean z13 = this.f93351c;
                AbstractC19444a.m101695c(new Runnable() { // from class: er.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18578b.e.m98073e(arrayList, z12, z13, str5, z11, i11);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    static {
        List m131502j;
        List m131502j2;
        Map m131404i;
        m131502j = AbstractC25368s.m131502j();
        f93337b = m131502j;
        m131502j2 = AbstractC25368s.m131502j();
        f93338c = m131502j2;
        m131404i = AbstractC25363p0.m131404i();
        f93339d = m131404i;
        f93340e = new SparseIntArray();
        f93341f = "";
        f93342g = "";
        f93343h = "";
        f93344i = new Object();
        f93345j = new ArrayList();
        f93346k = 1;
    }

    private C18578b() {
    }

    /* renamed from: b */
    public final void m98044b(a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        List list = f93345j;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }

    /* renamed from: c */
    public final void m98045c() {
        List m131502j;
        List m131502j2;
        Map m131404i;
        synchronized (f93344i) {
            m131502j = AbstractC25368s.m131502j();
            f93337b = m131502j;
            m131502j2 = AbstractC25368s.m131502j();
            f93338c = m131502j2;
            m131404i = AbstractC25363p0.m131404i();
            f93339d = m131404i;
            f93340e.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: d */
    public final void m98046d(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        C0824j.m2153b(new b(str));
    }

    /* renamed from: e */
    public final void m98047e(List list) {
        AbstractC19074t.m100208f(list, "storyIds");
        C0824j.m2153b(new c(list));
    }

    /* renamed from: f */
    public final String m98048f() {
        return f93342g;
    }

    /* renamed from: g */
    public final String m98049g() {
        return f93343h;
    }

    /* renamed from: h */
    public final Object m98050h() {
        return f93344i;
    }

    /* renamed from: i */
    public final void m98051i() {
        Object m131216p0;
        try {
            synchronized (f93344i) {
                try {
                    if (!f93337b.isEmpty()) {
                        m131216p0 = AbstractC25332a0.m131216p0(f93337b);
                        String str = ((C32123ta) m131216p0).f148138h;
                        for (a aVar : f93345j) {
                            String str2 = f93341f;
                            String str3 = f93342g;
                            String str4 = f93343h;
                            List list = f93337b;
                            AbstractC19074t.m100205c(str);
                            aVar.mo98067a(new C19590b(str2, str3, str4, list, false, false, str, true, true, 0, 0, 1024, null));
                            str = str;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            C0824j.m2153b(new d());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public final SparseIntArray m98052j() {
        return f93340e;
    }

    /* renamed from: k */
    public final int m98053k() {
        return f93346k;
    }

    /* renamed from: l */
    public final void m98054l(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "lastStoryId");
        if (f93346k == 0) {
            return;
        }
        e eVar = new e(str, !AbstractC19074t.m100204b(str, "0"), z11);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(eVar);
        f93346k--;
        c0766k.m1826T(str, z11, z12);
    }

    /* renamed from: m */
    public final List m98055m() {
        return f93337b;
    }

    /* renamed from: n */
    public final Map m98056n() {
        return f93339d;
    }

    /* renamed from: o */
    public final String m98057o() {
        return f93341f;
    }

    /* renamed from: p */
    public final List m98058p() {
        return f93338c;
    }

    /* renamed from: q */
    public final void m98059q(a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        f93345j.remove(aVar);
    }

    /* renamed from: r */
    public final void m98060r(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f93342g = str;
    }

    /* renamed from: s */
    public final void m98061s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f93343h = str;
    }

    /* renamed from: t */
    public final void m98062t(int i11) {
        f93346k = i11;
    }

    /* renamed from: u */
    public final void m98063u(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        f93337b = list;
    }

    /* renamed from: v */
    public final void m98064v(Map map) {
        AbstractC19074t.m100208f(map, "<set-?>");
        f93339d = map;
    }

    /* renamed from: w */
    public final void m98065w(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f93341f = str;
    }

    /* renamed from: x */
    public final void m98066x(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        f93338c = list;
    }
}
