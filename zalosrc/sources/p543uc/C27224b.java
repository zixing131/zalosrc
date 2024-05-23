package p543uc;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import on0.AbstractC24337r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p128ed.C18390e;
import vc.EnumC27961a;
import vi.C28257c;
import vi.C28260f;
import vi.C28261g;
import vi.InterfaceC28256b;

/* renamed from: uc.b */
/* loaded from: classes3.dex */
public final class C27224b {

    /* renamed from: a */
    public static final C27224b f127988a = new C27224b();

    private C27224b() {
    }

    /* renamed from: g */
    private final boolean m139320g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() >= 30) {
            if (jSONObject2.length() < 30) {
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
        }
        if (jSONObject != null) {
            jSONObject.put(str, str2);
            return false;
        }
        C18390e.m97413u("Max quota gg count properties per zip file", false, 2, null);
        return true;
    }

    /* renamed from: a */
    public final String m139321a(String str) {
        AbstractC19074t.m100208f(str, "driveId");
        return "https://www.googleapis.com/drive/v3/files/" + str + "?alt=media";
    }

    /* renamed from: b */
    public final String m139322b() {
        return "appDataFolder";
    }

    /* renamed from: c */
    public final String m139323c() {
        C18390e c18390e = C18390e.f92781a;
        String str = "'" + f127988a.m139322b() + "' in parents and properties has {key='user' and value='" + CoreUtility.f89233i + "'} and properties has {key='local_type' and value='type_image'}";
        AbstractC19074t.m100207e(str, "toString(...)");
        return c18390e.m97416c(str);
    }

    /* renamed from: d */
    public final String m139324d() {
        C18390e c18390e = C18390e.f92781a;
        String str = "'" + f127988a.m139322b() + "' in parents and properties has {key='user' and value='" + CoreUtility.f89233i + "'} and ( properties has {key='local_type' and value='type_zip'} or properties has {key='local_type' and value='type_image'} )";
        AbstractC19074t.m100207e(str, "toString(...)");
        return c18390e.m97416c(str);
    }

    /* renamed from: e */
    public final String m139325e() {
        return "https://www.googleapis.com/drive/v3/about?fields=storageQuota(limit, usage)";
    }

    /* renamed from: f */
    public final String m139326f(C28261g c28261g) {
        int i11;
        AbstractC19074t.m100208f(c28261g, "zipFileMDWithAction");
        C28260f m142319h = c28261g.m142319h();
        EnumC27961a m142293e = c28261g.m142293e();
        JSONObject jSONObject = new JSONObject();
        try {
            if (m142293e == EnumC27961a.f130358q) {
                jSONObject.put("name", m142319h.mo142291d());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(f127988a.m139322b());
                jSONObject.put("parents", jSONArray);
                jSONObject.put("mimeType", m142319h.m142307i());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("user", CoreUtility.f89233i.toString());
            jSONObject2.put("local_type", "type_zip");
            jSONObject2.put("timestamp", m142319h.m142308j());
            JSONObject jSONObject3 = new JSONObject();
            StringBuilder sb2 = new StringBuilder();
            String str = "f1";
            int i12 = 1;
            for (InterfaceC28256b interfaceC28256b : m142319h.m142309k().values()) {
                if (!(interfaceC28256b instanceof C28257c) || ((C28257c) interfaceC28256b).m142293e() != EnumC27961a.f130361t) {
                    String mo142291d = interfaceC28256b.mo142291d();
                    if (sb2.length() > 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (sb2.length() + i11 + mo142291d.length() < 124 - str.length()) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(mo142291d);
                    } else {
                        String sb3 = sb2.toString();
                        AbstractC19074t.m100207e(sb3, "toString(...)");
                        if (m139320g(str, sb3, jSONObject2, jSONObject3)) {
                            break;
                        }
                        AbstractC24337r.m127103i(sb2);
                        sb2.append(mo142291d);
                        i12++;
                        str = "f" + i12;
                    }
                }
            }
            if (sb2.length() > 0) {
                String sb4 = sb2.toString();
                AbstractC19074t.m100207e(sb4, "toString(...)");
                m139320g(str, sb4, jSONObject2, jSONObject3);
            }
            jSONObject.put("properties", jSONObject2);
            jSONObject.put("appProperties", jSONObject3);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        String jSONObject4 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        return jSONObject4;
    }
}
