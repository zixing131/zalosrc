package za0;

import ac.C0708i;
import ac.C0732w;
import ag0.C0815e1;
import bp0.AbstractC3103o;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import gw.C19669z;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p163fl.C18989a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p405ov.C24561c;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;
import pm.C24831b;
import qm0.AbstractC25366r;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: za0.a */
/* loaded from: classes6.dex */
public final class C31747a {

    /* renamed from: a */
    public static final C31747a f145819a = new C31747a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: za0.a$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: q */
        public static final a f145820q = new a("OLD_BIG_FILE", 0, 0);

        /* renamed from: r */
        public static final a f145821r = new a("THREAD_DETAIL", 1, 1);

        /* renamed from: s */
        public static final a f145822s = new a("THREAD_LIST", 2, 2);

        /* renamed from: t */
        public static final a f145823t = new a("MY_CLOUD_CLEANER", 3, 3);

        /* renamed from: u */
        public static final a f145824u = new a("Z_CLOUD_CLEANER_ALL", 4, 4);

        /* renamed from: v */
        public static final a f145825v = new a("Z_CLOUD_CLEANER_THREAD", 5, 5);

        /* renamed from: w */
        private static final /* synthetic */ a[] f145826w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f145827x;

        /* renamed from: p */
        private final int f145828p;

        static {
            a[] m152724b = m152724b();
            f145826w = m152724b;
            f145827x = AbstractC30166b.m148796a(m152724b);
        }

        private a(String str, int i11, int i12) {
            this.f145828p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m152724b() {
            return new a[]{f145820q, f145821r, f145822s, f145823t, f145824u, f145825v};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f145826w.clone();
        }

        /* renamed from: c */
        public final int m152725c() {
            return this.f145828p;
        }
    }

    private C31747a() {
    }

    /* renamed from: a */
    private final JSONArray m152702a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
            JSONObject jSONObject = new JSONObject();
            f145819a.m152722u(threadStorageInfo, jSONObject);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static final void m152703b(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        if (z11) {
            AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119291t0(System.currentTimeMillis()) + "] " + str2, new Object[0]);
        }
        C24831b.m129114g(str2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m152704c(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m152703b(str, str2, z11);
    }

    /* renamed from: d */
    public static final void m152705d(long j11, long j12) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cache_size", C21459a.m111035c(j11));
            jSONObject.put("time_delete", j12);
            f145819a.m152723v(jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m152708g("3", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: e */
    public static final void m152706e(ThreadStorageInfo threadStorageInfo, long j11, long j12, long j13, boolean z11, int i11, long j14) {
        List m131496e;
        AbstractC19074t.m100208f(threadStorageInfo, "threadInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            C31747a c31747a = f145819a;
            m131496e = AbstractC25366r.m131496e(threadStorageInfo);
            jSONObject.put("detail", c31747a.m152702a(m131496e));
            jSONObject.put("count_thread", 1);
            jSONObject.put("conversation_data_size", C21459a.m111035c(j11));
            jSONObject.put("cache_size", C21459a.m111035c(j12));
            jSONObject.put("size_total_delete", C21459a.m111035c(j13));
            jSONObject.put("delete_type", z11 ? 1 : 0);
            jSONObject.put("entry_source", i11);
            jSONObject.put("time_delete", j14);
            c31747a.m152723v(jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m152708g("5", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: f */
    public static final void m152707f(List list, int i11, long j11, long j12, long j13, boolean z11, long j14) {
        AbstractC19074t.m100208f(list, "threads");
        try {
            JSONObject jSONObject = new JSONObject();
            C31747a c31747a = f145819a;
            jSONObject.put("detail", c31747a.m152702a(list));
            jSONObject.put("count_thread", i11);
            jSONObject.put("conversation_data_size", C21459a.m111035c(j11));
            jSONObject.put("cache_size", C21459a.m111035c(j12));
            jSONObject.put("size_total_delete", C21459a.m111035c(j13));
            jSONObject.put("delete_type", z11 ? 1 : 0);
            jSONObject.put("entry_source", 0);
            jSONObject.put("time_delete", j14);
            c31747a.m152723v(jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m152708g("4", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: g */
    public static final void m152708g(String str, String str2) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "params");
        C24561c.m127942b("ToolStorageLog", "trackActionTap(): type=" + str + ", params=" + str2);
        C0815e1.m2075D().m2099U(3, 2, 22, "", str, str2);
    }

    /* renamed from: h */
    public static final void m152709h(String str, String str2) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "params");
        C24561c.m127942b("ToolStorageLog", "trackActionView(): type=" + str + ", params=" + str2);
        C0815e1.m2075D().m2099U(3, 1, 22, "", str, str2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m152710i(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        m152709h(str, str2);
    }

    /* renamed from: j */
    public static final void m152711j(int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entry_source", i11);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m152709h("7", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: k */
    public static final void m152712k() {
        try {
            m152710i("6", null, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: l */
    public static final void m152713l(long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deleted_cache_size", C21459a.m111035c(j11));
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "ts_clear_cache", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: m */
    public static final void m152714m(a aVar, List list, boolean z11) {
        String str;
        long m74777O;
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(list, "threads");
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            int i11 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
                String m74822z = threadStorageInfo.m74822z();
                if (z11) {
                    m74777O = threadStorageInfo.m74776N();
                } else {
                    m74777O = threadStorageInfo.m74777O();
                }
                if (m74777O != j11) {
                    if (AbstractC25495a.m132079d(m74822z)) {
                        i12++;
                        j13 += m74777O;
                    } else {
                        i11++;
                        j12 += m74777O;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("thread_id", AbstractC25495a.m132089n(m74822z));
                    jSONObject.put("thread_type", AbstractC25495a.m132079d(m74822z) ? 1 : 0);
                    jSONObject.put("thread_member_size", AbstractC23184q2.m119450h(m74822z));
                    jSONObject.put("deleted_total_size", C21459a.m111035c(m74777O));
                    AbstractC29231f.m145989g(jSONObject, "a_num", threadStorageInfo.m74811p());
                    AbstractC29231f.m145987e(jSONObject, "a_size", C21459a.m111035c(threadStorageInfo.m74773J()));
                    AbstractC29231f.m145989g(jSONObject, "p_num", threadStorageInfo.m74809o());
                    AbstractC29231f.m145987e(jSONObject, "p_size", C21459a.m111035c(threadStorageInfo.m74772I()));
                    AbstractC29231f.m145989g(jSONObject, "v_num", threadStorageInfo.m74780S());
                    AbstractC29231f.m145987e(jSONObject, "v_size", C21459a.m111035c(threadStorageInfo.m74781T()));
                    AbstractC29231f.m145989g(jSONObject, "f_num", threadStorageInfo.m74813q());
                    AbstractC29231f.m145987e(jSONObject, "f_size", C21459a.m111035c(threadStorageInfo.m74816t()));
                    AbstractC29231f.m145989g(jSONObject, "o_num", threadStorageInfo.m74820x());
                    AbstractC29231f.m145987e(jSONObject, "o_size", C21459a.m111035c(threadStorageInfo.m74821y()));
                    jSONArray.put(jSONObject);
                    j11 = 0;
                }
            }
            if (j12 == j11 && j13 == j11) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deleted_thread_11", i11);
            jSONObject2.put("deleted_thread_group", i12);
            jSONObject2.put("deleted_total_size_11", C21459a.m111035c(j12));
            jSONObject2.put("deleted_total_size_group", C21459a.m111035c(j13));
            jSONObject2.put("list_delete", jSONArray);
            if (z11) {
                str = "ts_delete_only_media";
            } else {
                str = "ts_delete_data";
            }
            String str2 = str;
            C0732w.c cVar = new C0732w.c();
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            cVar.m1192b(jSONObject3);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("source_type", aVar.m152725c());
            C0732w.m1177r(m1189a, str2, null, c0708i, cVar, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: n */
    public static final void m152715n(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_load", j11);
            jSONObject.put("warning", C18989a.Companion.m99711a().m99704i() ? 1 : 0);
            jSONObject.put("device_storage", C21459a.m111035c(j12));
            jSONObject.put("free_storage", C21459a.m111035c(j13));
            jSONObject.put("zalo_size", C21459a.m111035c(j14));
            jSONObject.put("cache_size", C21459a.m111035c(j15));
            jSONObject.put("conversation_data_size", C21459a.m111035c(j16));
            jSONObject.put("other_app_size", C21459a.m111035c(j17));
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "ts_load_complete", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: o */
    public static final void m152716o(long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_load", j11);
            jSONObject.put("device_storage", C21459a.m111035c(C20128b.m104766m()));
            jSONObject.put("zalo_size", C21459a.m111035c(C20128b.m104778y()));
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "ts_load_incomplete", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: p */
    public static final void m152717p(a aVar, List list) {
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(list, "threads");
        if (list.isEmpty()) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            long j11 = 0;
            long j12 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
                String m74822z = threadStorageInfo.m74822z();
                long m74776N = threadStorageInfo.m74776N();
                if (AbstractC25495a.m132079d(m74822z)) {
                    i12++;
                    j12 += m74776N;
                } else {
                    i11++;
                    j11 += m74776N;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("thread_id", AbstractC25495a.m132089n(m74822z));
                jSONObject.put("thread_type", AbstractC25495a.m132079d(m74822z) ? 1 : 0);
                jSONObject.put("thread_member_size", AbstractC23184q2.m119450h(m74822z));
                jSONObject.put("download_total_size", C21459a.m111035c(m74776N));
                AbstractC29231f.m145989g(jSONObject, "a_num", threadStorageInfo.m74811p());
                AbstractC29231f.m145987e(jSONObject, "a_size", C21459a.m111035c(threadStorageInfo.m74773J()));
                AbstractC29231f.m145989g(jSONObject, "p_num", threadStorageInfo.m74809o());
                AbstractC29231f.m145987e(jSONObject, "p_size", C21459a.m111035c(threadStorageInfo.m74772I()));
                AbstractC29231f.m145989g(jSONObject, "v_num", threadStorageInfo.m74780S());
                AbstractC29231f.m145987e(jSONObject, "v_size", C21459a.m111035c(threadStorageInfo.m74781T()));
                AbstractC29231f.m145989g(jSONObject, "f_num", threadStorageInfo.m74813q());
                AbstractC29231f.m145987e(jSONObject, "f_size", C21459a.m111035c(threadStorageInfo.m74816t()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("download_thread_11", i11);
            jSONObject2.put("download_thread_group", i12);
            jSONObject2.put("download_total_size_11", C21459a.m111035c(j11));
            jSONObject2.put("download_total_size_group", C21459a.m111035c(j12));
            jSONObject2.put("list_download", jSONArray);
            C0732w.c cVar = new C0732w.c();
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            cVar.m1192b(jSONObject3);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("source_type", aVar.m152725c());
            C0732w.m1177r(m1189a, "ts_download_file", null, c0708i, cVar, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: q */
    public static final void m152718q(a aVar, String str) {
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(str, "sortType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sort_type", str);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("source_type", aVar.m152725c());
            C0732w.m1177r(m1189a, "ts_sort_items", null, c0708i, cVar, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: r */
    public static final void m152719r(long j11, long j12, long j13, long j14, long j15) {
        long j16 = ((j11 - j12) - j14) - j13;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_load", j15);
            jSONObject.put("conversation_data_size", C21459a.m111035c(j13));
            jSONObject.put("cache_size", C21459a.m111035c(j14));
            jSONObject.put("other_apps_storage", C21459a.m111035c(j16));
            jSONObject.put("free_storage", C21459a.m111035c(j12));
            f145819a.m152723v(jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m152709h("2", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: s */
    public static final void m152720s() {
        try {
            m152710i("1", null, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: t */
    public static final void m152721t(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "entryPoint");
        try {
            if (AbstractC23306f.m120567B1().m99704i()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C0815e1.m2075D().m2100V(new C23648e(42, str, 0, "storage_open_tool", str2), false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ToolStorageLog", e11);
        }
    }

    /* renamed from: u */
    private final void m152722u(ThreadStorageInfo threadStorageInfo, JSONObject jSONObject) {
        String m74822z = threadStorageInfo.m74822z();
        jSONObject.put("owner_id", m74822z);
        jSONObject.put("last_time", threadStorageInfo.m74819w());
        jSONObject.put("position", threadStorageInfo.m74769D());
        jSONObject.put("size_conversation", C21459a.m111035c(threadStorageInfo.m74777O()));
        jSONObject.put("type_0_count", threadStorageInfo.m74805m());
        jSONObject.put("type_0_size", C21459a.m111035c(threadStorageInfo.m74770F()));
        jSONObject.put("type_1_count", threadStorageInfo.m74809o());
        jSONObject.put("type_1_size", C21459a.m111035c(threadStorageInfo.m74772I()));
        jSONObject.put("type_3_count", threadStorageInfo.m74811p());
        jSONObject.put("type_3_size", C21459a.m111035c(threadStorageInfo.m74773J()));
        jSONObject.put("type_2_count", threadStorageInfo.m74795h());
        jSONObject.put("type_2_size", C21459a.m111035c(threadStorageInfo.m74797i()));
        jSONObject.put("type_4_count", threadStorageInfo.m74805m());
        jSONObject.put("type_4_size", C21459a.m111035c(threadStorageInfo.m74777O()));
        Conversation m103202S = C19669z.Companion.m103232a().m103202S(m74822z);
        if (m103202S != null) {
            if (m103202S.m41013q()) {
                jSONObject.put("type_user", 1);
            } else if (AbstractC21935u.m114538e(m74822z) == 1) {
                jSONObject.put("type_user", 2);
            } else {
                jSONObject.put("type_user", 0);
            }
        }
    }

    /* renamed from: v */
    private final void m152723v(JSONObject jSONObject) {
        if (!AbstractC3103o.m15619h(16)) {
            return;
        }
        jSONObject.put("total_mem", C21459a.m111035c(C20128b.m104773t()));
        jSONObject.put("avail_mem", C21459a.m111035c(C20128b.m104755b()));
    }
}
