package p647xj;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p105dn.EnumC18030a;

/* renamed from: xj.a */
/* loaded from: classes3.dex */
public final class C29675a {

    /* renamed from: a */
    private final ArrayList f137092a;

    /* renamed from: b */
    private final HashSet f137093b;

    /* renamed from: c */
    private final HashSet f137094c;

    /* renamed from: d */
    private final HashSet f137095d;

    /* renamed from: e */
    private int f137096e;

    /* renamed from: f */
    private int f137097f;

    /* renamed from: g */
    private int f137098g;

    public C29675a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f137092a = new ArrayList();
        this.f137093b = new HashSet();
        this.f137094c = new HashSet();
        this.f137095d = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray("stickerPromote");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                AbstractC19074t.m100205c(optJSONObject);
                C29676b c29676b = new C29676b(optJSONObject);
                this.f137092a.add(c29676b);
                int m147605c = c29676b.m147605c();
                if (m147605c != 0) {
                    if (m147605c != 1) {
                        if (m147605c != 2) {
                            this.f137095d.addAll(c29676b.m147603a());
                        } else {
                            this.f137095d.addAll(c29676b.m147603a());
                        }
                    } else {
                        this.f137094c.addAll(c29676b.m147603a());
                    }
                } else {
                    this.f137093b.addAll(c29676b.m147603a());
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("promote_sticker_setting");
        if (optJSONObject2 != null) {
            this.f137096e = optJSONObject2.optInt("total_sticker_show");
            this.f137097f = optJSONObject2.optInt("limit_promote_keyword");
            this.f137098g = optJSONObject2.optInt("limit_promote_sticker");
        }
    }

    /* renamed from: a */
    public final C29676b m147600a(int i11) {
        Iterator it = this.f137092a.iterator();
        while (it.hasNext()) {
            C29676b c29676b = (C29676b) it.next();
            if (c29676b.m147603a().contains(Integer.valueOf(i11))) {
                return c29676b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int m147601b() {
        return this.f137096e;
    }

    /* renamed from: c */
    public final boolean m147602c(int i11, EnumC18030a enumC18030a) {
        AbstractC19074t.m100208f(enumC18030a, "chatMode");
        if (enumC18030a == EnumC18030a.SINGLE_USER && this.f137093b.contains(Integer.valueOf(i11))) {
            return true;
        }
        if (enumC18030a == EnumC18030a.GROUP && this.f137094c.contains(Integer.valueOf(i11))) {
            return true;
        }
        return this.f137095d.contains(Integer.valueOf(i11));
    }
}
