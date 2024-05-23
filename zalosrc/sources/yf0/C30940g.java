package yf0;

import com.zing.zalo.zbrowser.cache.MiniProgramDataStorageManager;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import li.AbstractC22490a;
import me0.AbstractC23041d2;
import org.json.JSONArray;
import org.json.JSONObject;
import p140ev.C18617f;
import p307kv.AbstractC21954k;
import vg.AbstractC28207v1;

/* renamed from: yf0.g */
/* loaded from: classes5.dex */
public final class C30940g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC30942h f142824a;

    /* renamed from: b */
    private MiniProgramDataStorageManager f142825b;

    /* renamed from: yf0.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m150490a() {
            C20131e c20131e = C20131e.f99303a;
            MiniProgramDataStorageManager.m90344j(c20131e.m104935Q()).m90353e();
            AbstractC23041d2.m118203b(new File(c20131e.m104935Q()));
        }
    }

    public C30940g(InterfaceC30942h interfaceC30942h) {
        AbstractC19074t.m100208f(interfaceC30942h, "mPDSHelperListener");
        this.f142824a = interfaceC30942h;
        MiniProgramDataStorageManager m90344j = MiniProgramDataStorageManager.m90344j(C20131e.f99303a.m104935Q());
        AbstractC19074t.m100207e(m90344j, "getInstance(...)");
        this.f142825b = m90344j;
    }

    /* renamed from: a */
    private final void m150485a(String str, String str2, long j11) {
        C18617f m98397a = C18617f.Companion.m98397a();
        if (m98397a != null) {
            m98397a.m98391n(m98397a.m98383f() + 1);
            m98397a.m98392o(m98397a.m98384g() + (AbstractC21954k.Companion.m114623r() - j11));
        }
        this.f142824a.mo150454a(str, str2);
    }

    /* renamed from: b */
    private final String m150486b(String str, Exception exc) {
        String str2;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        String m141899N0 = AbstractC28207v1.m141899N0(-101, "Exception: " + str2 + " in [" + str + "]", "action.zbrowser.mpds");
        AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
        return m141899N0;
    }

    /* renamed from: d */
    private final void m150487d(Exception exc, String str) {
        AbstractC22490a.m116282e(new Exception("An exception occurred when perform [" + str + "]", exc));
    }

    /* renamed from: c */
    public final void m150488c() {
        this.f142825b.m90355g(this.f142824a.mo150455b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0065. Please report as an issue. */
    /* renamed from: e */
    public final void m150489e(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        AbstractC19074t.m100208f(jSONObject, "actionData");
        long m114623r = AbstractC21954k.Companion.m114623r();
        try {
            String string = jSONObject.getString("mpds_action");
            JSONObject jSONObject2 = jSONObject.getJSONObject("mpds_data");
            String string2 = jSONObject.getString("appId");
            String mo150455b = this.f142824a.mo150455b();
            if (mo150455b.length() > 0) {
                if (!AbstractC19074t.m100204b(mo150455b, string2)) {
                    String m141899N0 = AbstractC28207v1.m141899N0(-106, "AppId is invalid", "action.zbrowser.mpds");
                    AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                    m150485a(m141899N0, str, m114623r);
                    return;
                }
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1242430479:
                            if (string.equals("mpds.remove.key")) {
                                try {
                                    JSONArray jSONArray = jSONObject2.getJSONArray("keys");
                                    ArrayList arrayList = new ArrayList();
                                    int length = jSONArray.length();
                                    int i11 = 0;
                                    while (i11 < length) {
                                        int i12 = length;
                                        try {
                                            arrayList.add(jSONArray.getString(i11));
                                            i11++;
                                            length = i12;
                                        } catch (Exception e11) {
                                            e = e11;
                                            str2 = string;
                                            AbstractC19074t.m100205c(str2);
                                            m150485a(m150486b(str2, e), str, m114623r);
                                            m150487d(e, str2);
                                            return;
                                        }
                                    }
                                    try {
                                        List m90359s = this.f142825b.m90359s(mo150455b, arrayList);
                                        JSONArray jSONArray2 = new JSONArray();
                                        Iterator it = m90359s.iterator();
                                        while (it.hasNext()) {
                                            jSONArray2.put((String) it.next());
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("error_keys", jSONArray2);
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("mpds_action", "mpds.remove.key");
                                        jSONObject4.put("mpds_data", jSONObject3);
                                        if (m90359s.isEmpty()) {
                                            String m141919S0 = AbstractC28207v1.m141919S0("action.zbrowser.mpds", jSONObject4.toString());
                                            AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
                                            m150485a(m141919S0, str, m114623r);
                                            return;
                                        } else {
                                            String m141903O0 = AbstractC28207v1.m141903O0(-103, "some key had removed fail", jSONObject4.toString(), "action.zbrowser.mpds");
                                            AbstractC19074t.m100207e(m141903O0, "genJsonErrorSpecific(...)");
                                            m150485a(m141903O0, str, m114623r);
                                            return;
                                        }
                                    } catch (Exception e12) {
                                        AbstractC19074t.m100205c(string);
                                        str2 = string;
                                        try {
                                            m150485a(m150486b(str2, e12), str, m114623r);
                                            m150487d(e12, str2);
                                            return;
                                        } catch (Exception e13) {
                                            e = e13;
                                            AbstractC19074t.m100205c(str2);
                                            m150485a(m150486b(str2, e), str, m114623r);
                                            m150487d(e, str2);
                                            return;
                                        }
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    str2 = string;
                                }
                            }
                            break;
                        case -381655915:
                            if (string.equals("mpds.get.size")) {
                                try {
                                    long m90357n = this.f142825b.m90357n(mo150455b);
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("mpds_action", "mpds.get.size");
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("size", m90357n);
                                    jSONObject5.put("mpds_data", jSONObject6);
                                    String m141919S02 = AbstractC28207v1.m141919S0("action.zbrowser.mpds", jSONObject5.toString());
                                    AbstractC19074t.m100207e(m141919S02, "genJsonSuccess(...)");
                                    m150485a(m141919S02, str, m114623r);
                                    return;
                                } catch (Exception e15) {
                                    AbstractC19074t.m100205c(string);
                                    m150485a(m150486b(string, e15), str, m114623r);
                                    m150487d(e15, string);
                                    return;
                                }
                            }
                            break;
                        case 279555290:
                            if (string.equals("mpds.get")) {
                                try {
                                    JSONArray jSONArray3 = jSONObject2.getJSONArray("keys");
                                    ArrayList arrayList2 = new ArrayList();
                                    int length2 = jSONArray3.length();
                                    int i13 = 0;
                                    while (i13 < length2) {
                                        int i14 = length2;
                                        arrayList2.add(jSONArray3.getString(i13));
                                        i13++;
                                        length2 = i14;
                                    }
                                    try {
                                        Map m90356i = this.f142825b.m90356i(mo150455b, arrayList2);
                                        JSONObject jSONObject7 = new JSONObject();
                                        for (Map.Entry entry : m90356i.entrySet()) {
                                            String str4 = (String) entry.getKey();
                                            Object obj = (String) entry.getValue();
                                            if (obj == null) {
                                                obj = JSONObject.NULL;
                                            }
                                            jSONObject7.put(str4, obj);
                                        }
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put("map", jSONObject7);
                                        JSONObject jSONObject9 = new JSONObject();
                                        jSONObject9.put("mpds_action", "mpds.get");
                                        jSONObject9.put("mpds_data", jSONObject8);
                                        String m141919S03 = AbstractC28207v1.m141919S0("action.zbrowser.mpds", jSONObject9.toString());
                                        AbstractC19074t.m100207e(m141919S03, "genJsonSuccess(...)");
                                        m150485a(m141919S03, str, m114623r);
                                        return;
                                    } catch (Exception e16) {
                                        AbstractC19074t.m100205c(string);
                                        m150485a(m150486b(string, e16), str, m114623r);
                                        m150487d(e16, string);
                                        return;
                                    }
                                } catch (Exception e17) {
                                    AbstractC19074t.m100205c(string);
                                    m150485a(m150486b(string, e17), str, m114623r);
                                    m150487d(e17, string);
                                    return;
                                }
                            }
                            break;
                        case 279566822:
                            if (string.equals("mpds.set")) {
                                try {
                                    JSONObject jSONObject10 = jSONObject2.getJSONObject("map");
                                    Iterator<String> keys = jSONObject10.keys();
                                    AbstractC19074t.m100207e(keys, "keys(...)");
                                    HashMap hashMap = new HashMap();
                                    while (keys.hasNext()) {
                                        Iterator<String> it2 = keys;
                                        String next = keys.next();
                                        str3 = string;
                                        try {
                                            String string3 = jSONObject10.getString(next);
                                            AbstractC19074t.m100205c(string3);
                                            hashMap.put(next, string3);
                                            keys = it2;
                                            string = str3;
                                        } catch (Exception e18) {
                                            e = e18;
                                            AbstractC19074t.m100205c(str3);
                                            String str5 = str3;
                                            m150485a(m150486b(str5, e), str, m114623r);
                                            m150487d(e, str5);
                                            return;
                                        }
                                    }
                                    List m90358r = this.f142825b.m90358r(mo150455b, hashMap);
                                    JSONArray jSONArray4 = new JSONArray();
                                    Iterator it3 = m90358r.iterator();
                                    while (it3.hasNext()) {
                                        jSONArray4.put((String) it3.next());
                                    }
                                    JSONObject jSONObject11 = new JSONObject();
                                    jSONObject11.put("error_keys", jSONArray4);
                                    JSONObject jSONObject12 = new JSONObject();
                                    jSONObject12.put("mpds_action", "mpds.get");
                                    jSONObject12.put("mpds_data", jSONObject11);
                                    if (m90358r.isEmpty()) {
                                        String m141919S04 = AbstractC28207v1.m141919S0("action.zbrowser.mpds", jSONObject12.toString());
                                        AbstractC19074t.m100207e(m141919S04, "genJsonSuccess(...)");
                                        m150485a(m141919S04, str, m114623r);
                                        return;
                                    } else {
                                        String m141903O02 = AbstractC28207v1.m141903O0(-103, "some key had set fail", jSONObject12.toString(), "action.zbrowser.mpds");
                                        AbstractC19074t.m100207e(m141903O02, "genJsonErrorSpecific(...)");
                                        m150485a(m141903O02, str, m114623r);
                                        return;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    str3 = string;
                                }
                            }
                            break;
                        case 1477777230:
                            if (string.equals("mpds.clear.appData")) {
                                try {
                                    this.f142825b.m90354f(mo150455b);
                                    String m141915R0 = AbstractC28207v1.m141915R0("action.zbrowser.mpds");
                                    AbstractC19074t.m100207e(m141915R0, "genJsonSuccess(...)");
                                    m150485a(m141915R0, str, m114623r);
                                    return;
                                } catch (Exception e21) {
                                    AbstractC19074t.m100205c(string);
                                    m150485a(m150486b(string, e21), str, m114623r);
                                    m150487d(e21, string);
                                    return;
                                }
                            }
                            break;
                    }
                }
                String m141899N02 = AbstractC28207v1.m141899N0(-100, "Invalid mpds action", "action.zbrowser.mpds");
                AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
                m150485a(m141899N02, str, m114623r);
                return;
            }
            String m141899N03 = AbstractC28207v1.m141899N0(-105, "App id is empty. This action is not called by a MP", "action.zbrowser.mpds");
            AbstractC19074t.m100207e(m141899N03, "genJsonErrorSpecific(...)");
            m150485a(m141899N03, str, m114623r);
        } catch (Exception e22) {
            m150485a(m150486b("Exception before processing mpds action", e22), str, m114623r);
            m150487d(e22, "Exception before processing mpds action");
        }
    }
}
