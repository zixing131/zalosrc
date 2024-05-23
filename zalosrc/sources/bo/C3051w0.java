package bo;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.w0 */
/* loaded from: classes4.dex */
public class C3051w0 {

    /* renamed from: a */
    public List f12301a;

    public C3051w0(C3051w0 c3051w0) {
        if (c3051w0 != null) {
            this.f12301a = c3051w0.f12301a != null ? new ArrayList(c3051w0.f12301a) : null;
        }
    }

    /* renamed from: a */
    public boolean m14637a() {
        List list = this.f12301a;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public JSONObject m14638b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f12301a != null) {
                JSONArray jSONArray = new JSONArray();
                for (ContactProfile contactProfile : this.f12301a) {
                    if (contactProfile != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("uid", contactProfile.f42434r);
                        jSONObject2.put("dpn", contactProfile.f42437s);
                        jSONObject2.put("avt", contactProfile.f42446v);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("list", jSONArray);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C3051w0(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    this.f12301a = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        ContactProfile contactProfile = new ContactProfile(optJSONArray.optJSONObject(i11));
                        if (!contactProfile.f42434r.equalsIgnoreCase(CoreUtility.f89233i)) {
                            this.f12301a.add(contactProfile);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    public C3051w0(List list) {
        if (list != null) {
            this.f12301a = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LikeContactItem likeContactItem = (LikeContactItem) it.next();
                ContactProfile contactProfile = new ContactProfile();
                contactProfile.f42434r = likeContactItem.m56333d();
                contactProfile.f42437s = likeContactItem.m56331b();
                contactProfile.f42446v = likeContactItem.m56330a();
                this.f12301a.add(contactProfile);
            }
        }
    }
}
