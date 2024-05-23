package tr;

import am.AbstractC0924m0;
import bo.C2998k3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import is.AbstractC20833z;
import is.C20830x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;
import p604wb.C28905e;
import p688yo.EnumC31036b;
import p716zh.C32145v4;
import qm0.AbstractC25361o0;
import tr.C26883g;

/* renamed from: tr.a */
/* loaded from: classes4.dex */
public final class C26877a {

    /* renamed from: a */
    public static final C26877a f127182a = new C26877a();

    private C26877a() {
    }

    /* renamed from: e */
    private final void m138440e(JSONObject jSONObject, String str, Map map, int i11) {
        JSONArray optJSONArray;
        C3025q0 c3025q0;
        C3025q0.d dVar;
        String str2;
        C3025q0.c cVar;
        List list;
        try {
            if (jSONObject.has(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    C3000l0 m108750B0 = AbstractC20826v0.m108750B0(optJSONArray.getJSONObject(i12));
                    if (m108750B0 != null && m108750B0.f11897r > 0) {
                        m138441i(m108750B0, i11);
                        if (m108750B0.m14295G0()) {
                            C3020p0 m14322a0 = m108750B0.m14322a0();
                            C32145v4 c32145v4 = null;
                            if (m14322a0 != null) {
                                c3025q0 = m14322a0.f12023C;
                            } else {
                                c3025q0 = null;
                            }
                            if (c3025q0 != null && (cVar = m14322a0.f12023C.f12135z) != null && (list = cVar.f12156g) != null) {
                                dVar = (C3025q0.d) list.get(0);
                            } else if (m14322a0.f12039S != null) {
                                dVar = new C3025q0.d();
                                dVar.f12174e = m14322a0.f12039S;
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                c32145v4 = dVar.f12174e;
                            }
                            if (c32145v4 != null) {
                                int i13 = m108750B0.f11893p;
                                if (i13 != 13 && i13 != 14) {
                                    if (i13 != 16) {
                                        str2 = m14322a0.f12057p;
                                    } else {
                                        C32145v4 c32145v42 = dVar.f12174e;
                                        str2 = c32145v42.f148248a + c32145v42.f148249b;
                                    }
                                } else {
                                    C32145v4 c32145v43 = dVar.f12174e;
                                    str2 = c32145v43.f148248a + c32145v43.f148249b;
                                }
                                C28905e.m144373n().m144383L(40, m14322a0.m14515l(), str2);
                                C28905e.m144373n().m144383L(50, m14322a0.m14515l(), str2);
                            }
                        }
                        List list2 = m108750B0.f11899s;
                        if (list2 != null && list2.size() > 0) {
                            int i14 = m108750B0.f11897r;
                            List list3 = (List) map.get(Integer.valueOf(i14));
                            if (list3 != null) {
                                list3.add(m108750B0);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(m108750B0);
                                map.put(Integer.valueOf(i14), arrayList);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    private final void m138441i(C3000l0 c3000l0, int i11) {
        if (c3000l0 != null) {
            c3000l0.f11896q0 = i11;
        }
    }

    /* renamed from: a */
    public final void m138442a(int i11) {
        try {
            if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.Companion.m125984a().m125977u()) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        C20830x0.f102390a.m108869m(0);
                    }
                } else {
                    C20830x0.f102390a.m108868l(0);
                }
                AbstractC20833z.m108895J();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m138443b(JSONObject jSONObject, int i11) {
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
            if (i11 == EnumC31036b.f143137p.m150864c()) {
                C26883g.a aVar = C26883g.Companion;
                aVar.m138535a(i11).m138526d(4);
                if (jSONObject.has("sug_video_channel")) {
                    C26884h c26884h = new C26884h();
                    C2998k3 m138545d = c26884h.m138545d(jSONObject);
                    if (m138545d != null) {
                        aVar.m138535a(i11).m138531q(m138545d);
                    }
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    aVar.m138535a(i11).m138533s(c26884h.m138543b(jSONObject2));
                    return;
                }
                aVar.m138535a(i11).m138533s("");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m138444c(JSONObject jSONObject) {
        String str;
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
            String str2 = "";
            if (jSONObject.has("promote_friend")) {
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "promote_friend");
                if (m96091j != null) {
                    str = m96091j.toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
            }
            AbstractC23309i.m121953gq(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void m138445d(JSONObject jSONObject) {
        String str;
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
            String str2 = "";
            if (jSONObject.has("sug_friend")) {
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "sug_friend");
                if (m96091j != null) {
                    str = m96091j.toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
            }
            AbstractC23309i.m121288Ox(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public final void m138446f(JSONObject jSONObject, boolean z11, int i11, boolean z12) {
        int m131400e;
        AbstractC19074t.m100208f(jSONObject, "json");
        if (z12) {
            C26883g.a aVar = C26883g.Companion;
            aVar.m138535a(i11).m138534t(true);
            if (z11) {
                aVar.m138535a(i11).m138525c();
                aVar.m138535a(i11).m138530p(null);
            }
            HashMap hashMap = new HashMap();
            m138440e(jSONObject, "sug_mulphoto", hashMap, i11);
            m138440e(jSONObject, "sug_mullink", hashMap, i11);
            m138440e(jSONObject, "sug_feed", hashMap, i11);
            m138440e(jSONObject, "sug_page", hashMap, i11);
            m138440e(jSONObject, "sug_app", hashMap, i11);
            m138440e(jSONObject, "sug_link", hashMap, i11);
            m138440e(jSONObject, "sug_banner", hashMap, i11);
            m138440e(jSONObject, "sug_oa", hashMap, i11);
            m131400e = AbstractC25361o0.m131400e(hashMap.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap.put(Integer.valueOf(((Number) entry.getKey()).intValue() - 1), entry.getValue());
            }
            if (!hashMap.isEmpty()) {
                C26883g.a aVar2 = C26883g.Companion;
                aVar2.m138535a(i11).m138532r(linkedHashMap);
                aVar2.m138535a(i11).m138530p(jSONObject);
            }
        }
    }

    /* renamed from: g */
    public final void m138447g(int i11, long j11) {
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC0924m0.m4409zj(j11);
                }
            } else {
                AbstractC0924m0.m4380yj(j11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final boolean m138448h(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3;
    }
}
