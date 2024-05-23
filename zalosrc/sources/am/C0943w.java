package am;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gw.C19637j;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p142ey.C18633c;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32076q5;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;

/* renamed from: am.w */
/* loaded from: classes3.dex */
public final class C0943w {

    /* renamed from: a */
    public static final C0943w f3447a = new C0943w();

    /* renamed from: b */
    private static final Map f3448b = Collections.synchronizedMap(new LinkedHashMap(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 0.75f, false));

    /* renamed from: c */
    private static final Map f3449c = Collections.synchronizedMap(new LinkedHashMap(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 0.75f, false));

    private C0943w() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* renamed from: j */
    private final java.util.ArrayList m4461j(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: am.C0943w.m4461j(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: l */
    public static final C0943w m4462l() {
        return f3447a;
    }

    /* renamed from: m */
    private final String m4463m(String str) {
        if (AbstractC25495a.m132079d(str)) {
            return AbstractC25495a.m132088m(str);
        }
        return str;
    }

    /* renamed from: o */
    private final void m4464o(C31973j5 c31973j5, C32076q5 c32076q5, C0918j0 c0918j0) {
        String str;
        String str2;
        String str3;
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        String m153781r = c31973j5.m153781r();
        Map map = f3448b;
        C31973j5 c31973j52 = (C31973j5) map.get(m153781r);
        if (c31973j52 != null) {
            c31973j5.m153723J0(c31973j52.m153784s0());
        }
        m4470d(c31973j5.m153781r());
        AbstractC19074t.m100207e(map, "mapGroup");
        map.put(m153781r, c31973j5);
        m4466t(c32076q5);
        c31973j5.m153739R0(C19637j.f97466a.m102860o(c32076q5));
        C19637j.m102803N(c31973j5);
        c31973j5.m153717G0(System.currentTimeMillis());
        List m154718g = c32076q5.m154718g();
        String str4 = "";
        if (!(!m154718g.isEmpty())) {
            str = "";
        } else {
            str = TextUtils.join(";", m154718g);
        }
        List m154716e = c32076q5.m154716e();
        if (!(!m154716e.isEmpty())) {
            str2 = "";
        } else {
            str2 = TextUtils.join(";", m154716e);
        }
        String m153715F = c31973j5.m153715F();
        if (!c31973j5.m153767k().isEmpty()) {
            str4 = TextUtils.join(";", c31973j5.m153767k());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c31973j5.m153781r());
        contentValues.put("name", c31973j5.m153793y());
        contentValues.put("desc", c31973j5.m153765j());
        contentValues.put("creatorId", c31973j5.m153758f());
        contentValues.put("members", str4);
        contentValues.put("ts", c31973j5.m153734P());
        contentValues.put("currentUserUid", CoreUtility.f89233i);
        if (c31973j5.m153784s0()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        contentValues.put("read", str3);
        contentValues.put("admin_uids", str2);
        contentValues.put("totalMem", String.valueOf(c31973j5.m153732O()));
        contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(c31973j5.m153738R()));
        contentValues.put("subType", String.valueOf(c31973j5.m153716G()));
        contentValues.put("settingJson", m153715F);
        contentValues.put("avatar_new", c31973j5.m153756e());
        contentValues.put("member_uids", str);
        contentValues.put("extraInfoJson", c31973j5.m153769l());
        contentValues.put("lastActive", String.valueOf(c31973j5.m153787u()));
        contentValues.put("visibility", String.valueOf(c31973j5.m153740S()));
        contentValues.put("avtFull", c31973j5.m153771m());
        contentValues.put("joinQuestion", c31973j5.m153785t());
        contentValues.put("insertTs", Long.valueOf(c31973j5.m153783s()));
        contentValues.put("requestCount", Integer.valueOf(c31973j5.m153713E()));
        contentValues.put("tsJoinGroup", c31973j5.m153736Q());
        c0918j0.m2868i("group_info_v6", null, contentValues);
        C25489b.m132042t("group_" + m153781r);
    }

    /* renamed from: s */
    private final void m4465s(String str, List list) {
        Map map = f3449c;
        AbstractC19074t.m100207e(map, "mapGroupAdmins");
        synchronized (map) {
            try {
                List list2 = (List) map.get(str);
                if (list2 == null) {
                    map.put(str, new ArrayList(list));
                } else {
                    list2.clear();
                    list2.addAll(list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    private final void m4466t(C32076q5 c32076q5) {
        m4465s(c32076q5.m154719h(), c32076q5.m154716e());
    }

    /* renamed from: a */
    public final void m4467a(C31973j5 c31973j5, String str) {
        C18633c.f93770a.m98471a(c31973j5, str);
    }

    /* renamed from: b */
    public final void m4468b() {
        f3448b.clear();
        f3449c.clear();
    }

    /* renamed from: c */
    public final void m4469c() {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C7960e.m41971c6().m42200M6().m2863d("group_info_v6", "currentUserUid = ? ", new String[]{CoreUtility.f89233i});
            m4468b();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: d */
    public final void m4470d(String str) {
        AbstractC19074t.m100208f(str, "groupId");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C7960e.m41971c6().m42200M6().m2863d("group_info_v6", "id = ? and currentUserUid = ?", new String[]{str, CoreUtility.f89233i});
            f3448b.remove(str);
            f3449c.remove(str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: e */
    public final void m4471e(String str) {
        C18633c.f93770a.m98473d(str);
    }

    /* renamed from: f */
    public final C31973j5 m4472f(String str) {
        Object m131206f0;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i) || str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        String m4463m = m4463m(str);
        Map map = f3448b;
        if (map.containsKey(m4463m)) {
            return (C31973j5) map.get(m4463m);
        }
        if (C25489b.f122105a.m132046f("group_" + m4463m)) {
            return null;
        }
        m131206f0 = AbstractC25332a0.m131206f0(m4461j(m4463m));
        C31973j5 c31973j5 = (C31973j5) m131206f0;
        if (c31973j5 != null && AbstractC19074t.m100204b(c31973j5.m153781r(), m4463m)) {
            return c31973j5;
        }
        AbstractC19074t.m100207e(map, "mapGroup");
        map.put(m4463m, null);
        return null;
    }

    /* renamed from: g */
    public final C31973j5 m4473g(String str) {
        if (str != null && !AbstractC19074t.m100204b(str, "")) {
            return (C31973j5) f3448b.get(m4463m(str));
        }
        return null;
    }

    /* renamed from: h */
    public final ArrayList m4474h() {
        return m4461j(null);
    }

    /* renamed from: i */
    public final List m4475i() {
        List m131202b0;
        m131202b0 = AbstractC25332a0.m131202b0(new ArrayList(f3448b.values()));
        return new ArrayList(m131202b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Type inference failed for: r14v0, types: [am.w] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [zh.q5] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32076q5 m4476k(String str) {
        C31973j5 m4472f;
        C32076q5 c32076q5;
        String str2;
        ?? r42 = 0;
        r4 = null;
        r42 = 0;
        C32076q5 c32076q52 = null;
        r42 = 0;
        Cursor cursor = null;
        if (TextUtils.isEmpty(CoreUtility.f89233i) || str == null || TextUtils.isEmpty(str) || (m4472f = m4472f(str)) == null) {
            return null;
        }
        String m4463m = m4463m(str);
        try {
            try {
                Cursor m2871l = C7960e.m41971c6().m42200M6().m2871l("group_info_v6", new String[]{"member_uids", "admin_uids"}, "id = ? AND currentUserUid = ?", new String[]{m4463m, CoreUtility.f89233i}, null, null, null);
                if (m2871l != null) {
                    try {
                        try {
                            if (m2871l.getCount() > 0) {
                                int columnIndex = m2871l.getColumnIndex("admin_uids");
                                int columnIndex2 = m2871l.getColumnIndex("member_uids");
                                m2871l.moveToFirst();
                                while (true) {
                                    String string = m2871l.getString(columnIndex2);
                                    if (columnIndex != -1) {
                                        str2 = m2871l.getString(columnIndex);
                                    } else {
                                        str2 = "";
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    if (!TextUtils.isEmpty(string)) {
                                        String[] split = TextUtils.split(string, ";");
                                        AbstractC19074t.m100207e(split, "split(...)");
                                        AbstractC25378x.m131549y(arrayList, split);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    if (!TextUtils.isEmpty(str2)) {
                                        String[] split2 = TextUtils.split(str2, ";");
                                        AbstractC19074t.m100207e(split2, "split(...)");
                                        AbstractC25378x.m131549y(arrayList2, split2);
                                    }
                                    c32076q5 = new C32076q5(m4463m);
                                    try {
                                        c32076q5.m154715d(m4472f, arrayList, arrayList2);
                                        if (!m2871l.moveToNext()) {
                                            break;
                                        }
                                        c32076q52 = c32076q5;
                                    } catch (Exception e11) {
                                        e = e11;
                                        cursor = m2871l;
                                        AbstractC23350e.m122776f("GroupDAO", e);
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception e12) {
                                                AbstractC23350e.m122776f("GroupDAO", e12);
                                            }
                                        }
                                        r42 = c32076q5;
                                        if (r42 != 0) {
                                        }
                                        return r42;
                                    }
                                }
                                r42 = c32076q5;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r42 = m2871l;
                            if (r42 != 0) {
                                try {
                                    r42.close();
                                } catch (Exception e13) {
                                    AbstractC23350e.m122776f("GroupDAO", e13);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        c32076q5 = c32076q52;
                    }
                }
                if (m2871l != null) {
                    try {
                        m2871l.close();
                    } catch (Exception e15) {
                        AbstractC23350e.m122776f("GroupDAO", e15);
                    }
                }
            } catch (Exception e16) {
                e = e16;
                c32076q5 = null;
            }
            if (r42 != 0) {
                m4466t(r42);
            }
            return r42;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: n */
    public final void m4477n(C31973j5 c31973j5, C32076q5 c32076q5) {
        C3535c m2634q;
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(c32076q5, "groupMemberInfo");
        try {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            AbstractC19074t.m100205c(m42200M6);
            m4464o(c31973j5, c32076q5, m42200M6);
            String str = "group_" + c31973j5.m153781r();
            if (C11318b.Companion.m60525a().m60520o(str) && (m2634q = AbstractC23306f.m120584H0().m2634q(str)) != null && !TextUtils.isEmpty(c31973j5.m153793y())) {
                m2634q.m17971y0().f42894r = c31973j5.m153793y();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: p */
    public final void m4478p(List list) {
        AbstractC19074t.m100208f(list, "groupList");
        C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
        try {
            try {
                m42200M6.m2860a();
                m4469c();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.first;
                    AbstractC19074t.m100205c(obj);
                    Object obj2 = pair.second;
                    AbstractC19074t.m100207e(obj2, "second");
                    AbstractC19074t.m100205c(m42200M6);
                    m4464o((C31973j5) obj, (C32076q5) obj2, m42200M6);
                }
                m42200M6.m2875p();
                if (!m42200M6.m2870k()) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23309i.m122141lp(15000L);
                AbstractC23350e.m122776f("GroupDAO", e11);
                if (!m42200M6.m2870k()) {
                    return;
                }
            }
            m42200M6.m2864e();
        } catch (Throwable th2) {
            if (m42200M6.m2870k()) {
                m42200M6.m2864e();
            }
            throw th2;
        }
    }

    /* renamed from: q */
    public final boolean m4479q(String str) {
        return m4480r(str, CoreUtility.f89233i);
    }

    /* renamed from: r */
    public final boolean m4480r(String str, String str2) {
        boolean m131196V;
        if (str == null) {
            return false;
        }
        String m4463m = m4463m(str);
        Map map = f3449c;
        List list = (List) map.get(m4463m);
        if (list == null && f3448b.get(m4463m) != null) {
            m4476k(m4463m);
            list = (List) map.get(m4463m);
        }
        if (list != null) {
            m131196V = AbstractC25332a0.m131196V(list, str2);
            if (!m131196V) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m4481u(String str, String str2) {
        AbstractC19074t.m100208f(str, "groupId");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C31973j5 c31973j5 = (C31973j5) f3448b.get(str);
            if (c31973j5 != null) {
                c31973j5.m153708B0(str2, str2);
            }
            Conversation m103201R = C19669z.Companion.m103232a().m103201R("group_" + str);
            if (m103201R != null) {
                m103201R.f42895s = String.valueOf(str2);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("avatar_new", str2);
            contentValues.put("avtFull", str2);
            m42200M6.m2876q("group_info_v6", contentValues, "id = ? and currentUserUid = ?", new String[]{str, CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: v */
    public final void m4482v(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "group");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("desc", c31973j5.m153765j());
            m42200M6.m2876q("group_info_v6", contentValues, "id = ? and currentUserUid = ?", new String[]{c31973j5.m153781r(), CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: w */
    public final void m4483w(C31973j5 c31973j5) {
        if (c31973j5 != null) {
            try {
                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                    C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("extraInfoJson", c31973j5.m153769l());
                    m42200M6.m2876q("group_info_v6", contentValues, "currentUserUid = ? AND id = ?", new String[]{CoreUtility.f89233i, c31973j5.m153781r()});
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("GroupDAO", e11);
            }
        }
    }

    /* renamed from: x */
    public final void m4484x(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "group");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", c31973j5.m153793y());
            contentValues.put("subType", Integer.valueOf(c31973j5.m153716G()));
            m42200M6.m2876q("group_info_v6", contentValues, "id = ? and currentUserUid = ?", new String[]{c31973j5.m153781r(), CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: y */
    public final void m4485y(String str, int i11) {
        AbstractC19074t.m100208f(str, "groupId");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C31973j5 c31973j5 = (C31973j5) f3448b.get(str);
            if (c31973j5 != null) {
                c31973j5.m153725K0(i11);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("requestCount", Integer.valueOf(i11));
            m42200M6.m2876q("group_info_v6", contentValues, "id = ? and currentUserUid = ?", new String[]{str, CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }

    /* renamed from: z */
    public final void m4486z(String str, String str2) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(str2, "tsJoinGroup");
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            C31973j5 c31973j5 = (C31973j5) f3448b.get(str);
            if (c31973j5 != null) {
                c31973j5.m153733O0(str2);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("tsJoinGroup", str2);
            m42200M6.m2876q("group_info_v6", contentValues, "id = ? and currentUserUid = ?", new String[]{str, CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GroupDAO", e11);
        }
    }
}
