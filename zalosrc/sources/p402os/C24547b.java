package p402os;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: os.b */
/* loaded from: classes4.dex */
public class C24547b implements Serializable {

    /* renamed from: s */
    private static final String[] f118166s = {"accessProfile", "sendMsg", "accessFriendsList", "pushFeed"};

    /* renamed from: t */
    private static final int[] f118167t = {AbstractC8020f0.authorization_app_permission_name_access_profile, AbstractC8020f0.authorization_app_permission_name_send_message, AbstractC8020f0.authorization_app_permission_name_access_friend_list, AbstractC8020f0.authorization_app_permission_name_push_feed};

    /* renamed from: u */
    private static final int[] f118168u = {1, 2, 4, 8};

    /* renamed from: p */
    private String f118169p;

    /* renamed from: q */
    private boolean f118170q;

    /* renamed from: r */
    private boolean f118171r;

    /* renamed from: a */
    public static int m127894a(List list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size() && list.size() <= 4; i12++) {
            if (((C24547b) list.get(i12)).m127898d()) {
                i11 |= f118168u[i12];
            }
        }
        return i11;
    }

    /* renamed from: e */
    public static List m127895e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("permission");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("permissionReq");
            if (optJSONObject != null && optJSONObject2 != null) {
                for (int i11 = 0; i11 < 4; i11++) {
                    C24547b c24547b = new C24547b();
                    c24547b.f118171r = optJSONObject.optBoolean(f118166s[i11]);
                    c24547b.f118170q = !optJSONObject2.optBoolean(r4[i11]);
                    c24547b.f118169p = MainApplication.getAppContext().getString(f118167t[i11]);
                    arrayList.add(c24547b);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GameItemPermission", e11);
        }
        return arrayList;
    }

    /* renamed from: b */
    public String m127896b() {
        return this.f118169p;
    }

    /* renamed from: c */
    public boolean m127897c() {
        return this.f118170q;
    }

    /* renamed from: d */
    public boolean m127898d() {
        return this.f118171r;
    }

    /* renamed from: f */
    public void m127899f(boolean z11) {
        this.f118171r = z11;
    }
}
