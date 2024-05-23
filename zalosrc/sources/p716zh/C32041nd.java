package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import gw.C19669z;
import nk0.C23855s0;
import org.json.JSONObject;
import pj0.InterfaceC24775a;

/* renamed from: zh.nd */
/* loaded from: classes3.dex */
public class C32041nd {

    /* renamed from: a */
    private final int f147537a = 3;

    /* renamed from: b */
    private long f147538b;

    /* renamed from: c */
    private long f147539c;

    /* renamed from: d */
    private C17244x0 f147540d;

    /* renamed from: e */
    private C23855s0 f147541e;

    /* renamed from: f */
    private C17244x0 f147542f;

    /* renamed from: g */
    private String f147543g;

    /* renamed from: h */
    private String f147544h;

    /* renamed from: i */
    private int f147545i;

    /* renamed from: j */
    private boolean f147546j;

    /* renamed from: k */
    private boolean f147547k;

    /* renamed from: zh.nd$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC24775a {
        a() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            C32041nd.this.f147547k = true;
            C19669z.m103146Y().m103198O0();
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
        }
    }

    public C32041nd(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f147538b = 0L;
        this.f147539c = 0L;
        this.f147544h = "";
        this.f147545i = 3;
        if (jSONObject == null) {
            return;
        }
        this.f147538b = jSONObject.optLong("ad_id");
        this.f147539c = jSONObject.optLong("campaign_id", 0L);
        this.f147545i = jSONObject.optInt("ad_position", 3);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("ad_tabmsg");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("ZInstantAPIInfo")) != null) {
            this.f147540d = new C17244x0(27, optJSONObject);
        }
        String optString = jSONObject.optString("ad_full");
        this.f147543g = optString;
        if (!TextUtils.isEmpty(optString)) {
            JSONObject jSONObject2 = new JSONObject(this.f147543g);
            this.f147546j = jSONObject2.optInt("preload") == 1;
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("data");
            if (optJSONObject3 != null) {
                this.f147544h = optJSONObject3.optString("title");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("ZInstantAPIInfo");
                if (optJSONObject4 != null) {
                    this.f147542f = new C17244x0(27, optJSONObject4);
                }
            }
        }
    }

    /* renamed from: b */
    public void m154573b() {
        C17244x0 c17244x0 = this.f147542f;
        if (c17244x0 != null && c17244x0.m92064b() != null && this.f147546j && !this.f147547k) {
            AbstractC17148f0.m91695n(this.f147542f.m92064b(), new a());
        }
    }

    /* renamed from: c */
    public long m154574c() {
        return this.f147538b;
    }

    /* renamed from: d */
    public int m154575d() {
        int i11 = this.f147545i;
        if (i11 < 0) {
            return 3;
        }
        return i11;
    }

    /* renamed from: e */
    public int m154576e() {
        return 1;
    }

    /* renamed from: f */
    public long m154577f() {
        return this.f147539c;
    }

    /* renamed from: g */
    public String m154578g() {
        return this.f147543g;
    }

    /* renamed from: h */
    public C17244x0 m154579h() {
        return this.f147540d;
    }

    /* renamed from: i */
    public C23855s0 m154580i() {
        return this.f147541e;
    }

    /* renamed from: j */
    public String m154581j() {
        return this.f147544h;
    }

    /* renamed from: k */
    public boolean m154582k() {
        C17244x0 c17244x0;
        C17244x0 c17244x02 = this.f147540d;
        if (c17244x02 != null && c17244x02.m92064b() != null && ((c17244x0 = this.f147542f) == null || c17244x0.m92064b() == null || !this.f147546j || this.f147547k)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m154583l(C23855s0 c23855s0) {
        this.f147541e = c23855s0;
    }
}
