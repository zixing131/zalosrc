package p459qs;

import ag0.C0824j;
import am.AbstractC0939u;
import am.C0918j0;
import am.C0943w;
import android.content.ContentValues;
import android.database.Cursor;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32058p1;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import th.C26688i;

/* renamed from: qs.b */
/* loaded from: classes.dex */
public final class C25489b {

    /* renamed from: a */
    public static final C25489b f122105a = new C25489b();

    /* renamed from: b */
    private static final Map f122106b;

    /* renamed from: c */
    private static boolean f122107c;

    /* renamed from: d */
    private static final Map f122108d;

    /* renamed from: qs.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f122109q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(C32058p1 c32058p1, C32058p1 c32058p12) {
            int m104526b;
            AbstractC19074t.m100205c(c32058p12);
            long m154672f = c32058p12.m154672f();
            AbstractC19074t.m100205c(c32058p1);
            m104526b = AbstractC20104d.m104526b(m154672f - c32058p1.m154672f());
            return Integer.valueOf(m104526b);
        }
    }

    /* renamed from: qs.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f122110a;

        b(String str) {
            this.f122110a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C25489b.f122105a.m132034h(this.f122110a);
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f122106b = synchronizedMap;
        f122108d = Collections.synchronizedMap(new LinkedHashMap());
    }

    private C25489b() {
    }

    /* renamed from: c */
    private final void m132033c() {
        f122108d.clear();
        synchronized (this) {
            f122107c = false;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: h */
    public final void m132034h(String str) {
        try {
            int m2863d = C7960e.m41971c6().m42200M6().m2863d("tbl_deleted_group_info", "current_user_uid = ? AND thread_id = ?", new String[]{CoreUtility.f89233i, str});
            if (m2863d > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteFromDatabase threadId= ");
                sb2.append(str);
                sb2.append(", count= ");
                sb2.append(m2863d);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    private final C32058p1 m132035i(String str) {
        boolean z11;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("id");
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("avatar");
            JSONArray optJSONArray = jSONObject.optJSONArray("avatarByMember");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(optJSONArray.getString(i11));
                }
            }
            long optLong = jSONObject.optLong("last_msg_ts");
            if (jSONObject.optInt("hidden") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            String optString3 = jSONObject.optString("delete_type", "");
            long optLong2 = jSONObject.optLong("delete_time");
            int optInt = jSONObject.optInt("group_type", 0);
            String m132088m = AbstractC25495a.m132088m(string);
            AbstractC19074t.m100205c(optString);
            C31973j5 c31973j5 = new C31973j5(m132088m, optString, optString2, arrayList, optInt);
            AbstractC19074t.m100205c(optString3);
            C32058p1 c32058p1 = new C32058p1(c31973j5, optString3, optLong2, optLong);
            c32058p1.m154676j(z11);
            return c32058p1;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: l */
    public static final int m132036l(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: n */
    private final void m132037n(C32058p1 c32058p1) {
        try {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_user_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", c32058p1.m154674h());
            String m132043u = m132043u(c32058p1);
            contentValues.put("thread_info", m132043u);
            long m2868i = m42200M6.m2868i("tbl_deleted_group_info", null, contentValues);
            String m154674h = c32058p1.m154674h();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insertToDatabase threadId= ");
            sb2.append(m154674h);
            sb2.append(", rowId= ");
            sb2.append(m2868i);
            sb2.append(", info=");
            sb2.append(m132043u);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    private final void m132038o() {
        synchronized (this) {
            try {
                if (f122107c) {
                    return;
                }
                try {
                    if (C7960e.m41971c6().m42075B9("tbl_deleted_group_info")) {
                        Cursor m2871l = C7960e.m41971c6().m42200M6().m2871l("tbl_deleted_group_info", new String[]{"thread_info"}, "current_user_uid = ?", new String[]{CoreUtility.f89233i}, null, null, null);
                        if (m2871l != null && m2871l.getCount() > 0) {
                            int columnIndex = m2871l.getColumnIndex("thread_info");
                            m2871l.moveToFirst();
                            do {
                                String string = m2871l.getString(columnIndex);
                                C25489b c25489b = f122105a;
                                AbstractC19074t.m100205c(string);
                                C32058p1 m132035i = c25489b.m132035i(string);
                                if (m132035i != null) {
                                    Map map = f122108d;
                                    AbstractC19074t.m100207e(map, "deletedGroupInfoMap");
                                    map.put(m132035i.m154674h(), m132035i);
                                    f122106b.put(m132035i.m154674h(), m132035i.m154668b());
                                }
                            } while (m2871l.moveToNext());
                            int count = m2871l.getCount();
                            int size = f122108d.size();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("loadFromDatabase cursor:");
                            sb2.append(count);
                            sb2.append(" size:");
                            sb2.append(size);
                        }
                        if (m2871l != null) {
                            m2871l.close();
                        }
                    }
                    f122107c = true;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    private final void m132039p(String str, String str2) {
        long j11;
        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
        if (m4472f != null) {
            Conversation m103201R = C19669z.Companion.m103232a().m103201R(str);
            long mo124314i = AbstractC23306f.m120579F1().mo124314i();
            if (m103201R != null && m103201R.m41008l() > 0) {
                j11 = m103201R.m41008l();
            } else {
                j11 = mo124314i;
            }
            C32058p1 c32058p1 = new C32058p1(m4472f, str2, mo124314i, j11);
            c32058p1.m154676j(C21927m.m114302u().m114345m(str));
            Map map = f122108d;
            AbstractC19074t.m100207e(map, "deletedGroupInfoMap");
            map.put(str, c32058p1);
            m132037n(c32058p1);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m132040r(C25489b c25489b, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        c25489b.m132051q(str, str2, z11);
    }

    /* renamed from: s */
    private final void m132041s(String str) {
        C32058p1 c32058p1 = (C32058p1) f122108d.remove(str);
        C0824j.m2153b(new b(str));
        if (c32058p1 != null) {
            if (AbstractC23306f.m120584H0().m2634q(str) != null) {
                AbstractC23306f.m120584H0().m2629l(str);
            }
            C23744a.Companion.m124119a().m124116d(149, c32058p1);
        }
    }

    /* renamed from: t */
    public static final void m132042t(String str) {
        AbstractC19074t.m100208f(str, "uidGroupWithPrefix");
        f122106b.remove(str);
        if (C26688i.f126427a.m137069c()) {
            f122105a.m132041s(str);
        }
    }

    /* renamed from: u */
    private final String m132043u(C32058p1 c32058p1) {
        JSONObject jSONObject = new JSONObject();
        C31973j5 m154671e = c32058p1.m154671e();
        jSONObject.put("id", c32058p1.m154674h());
        jSONObject.put("name", m154671e.m153793y());
        jSONObject.put("avatar", m154671e.m153756e());
        List m153762h = m154671e.m153762h();
        JSONArray jSONArray = new JSONArray();
        Iterator it = m153762h.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("avatarByMember", jSONArray);
        jSONObject.put("last_msg_ts", c32058p1.m154672f());
        jSONObject.put("hidden", c32058p1.m154675i() ? 1 : 0);
        jSONObject.put("delete_type", c32058p1.m154668b());
        jSONObject.put("delete_time", c32058p1.m154669c());
        jSONObject.put("group_type", m154671e.m153738R());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: d */
    public final void m132044d() {
        m132045e();
        m132033c();
    }

    /* renamed from: e */
    public final void m132045e() {
        f122106b.clear();
    }

    /* renamed from: f */
    public final boolean m132046f(String str) {
        AbstractC19074t.m100208f(str, "uidGroupWithPrefix");
        m132038o();
        return f122106b.containsKey(str);
    }

    /* renamed from: g */
    public final void m132047g() {
        try {
            C7960e m41971c6 = C7960e.m41971c6();
            C0918j0 m42200M6 = m41971c6.m42200M6();
            if (!m41971c6.m42075B9("tbl_deleted_group_info")) {
                m42200M6.m2865f("CREATE TABLE tbl_deleted_group_info\n (current_user_uid,\n  thread_id,\n  thread_info,\n  UNIQUE(current_user_uid,thread_id) ON CONFLICT REPLACE)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public final C32058p1 m132048j(String str) {
        AbstractC19074t.m100208f(str, "uidGroupWithPrefix");
        m132038o();
        return (C32058p1) f122108d.get(str);
    }

    /* renamed from: k */
    public final List m132049k() {
        List m131177E0;
        m132038o();
        Collection values = f122108d.values();
        final a aVar = a.f122109q;
        m131177E0 = AbstractC25332a0.m131177E0(values, new Comparator() { // from class: qs.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m132036l;
                m132036l = C25489b.m132036l(InterfaceC18509p.this, obj, obj2);
                return m132036l;
            }
        });
        return m131177E0;
    }

    /* renamed from: m */
    public final String m132050m(String str) {
        AbstractC19074t.m100208f(str, "uidGroupWithPrefix");
        m132038o();
        String str2 = (String) f122106b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: q */
    public final void m132051q(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "uidGroupWithPrefix");
        AbstractC19074t.m100208f(str2, "deleteType");
        f122106b.put(str, str2);
        if (z11 && C26688i.f126427a.m137069c()) {
            m132039p(str, str2);
        }
    }
}
