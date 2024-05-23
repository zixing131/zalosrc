package fi;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: fi.b */
/* loaded from: classes3.dex */
public final class C18944b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private Set f94482a;

    /* renamed from: b */
    private int f94483b;

    /* renamed from: c */
    private int f94484c;

    /* renamed from: d */
    private int f94485d;

    /* renamed from: e */
    private int f94486e;

    /* renamed from: f */
    private int f94487f;

    /* renamed from: g */
    private int f94488g;

    /* renamed from: h */
    private int f94489h;

    /* renamed from: i */
    private int f94490i;

    /* renamed from: j */
    private ArrayList f94491j;

    /* renamed from: k */
    private int f94492k;

    /* renamed from: l */
    private int f94493l;

    /* renamed from: m */
    private int f94494m;

    /* renamed from: n */
    private int f94495n;

    /* renamed from: o */
    private int f94496o;

    /* renamed from: p */
    private ArrayList f94497p;

    /* renamed from: q */
    private int f94498q;

    /* renamed from: fi.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C18944b(JSONObject jSONObject) {
        String str;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f94482a = new HashSet();
        this.f94491j = new ArrayList();
        this.f94496o = -1;
        this.f94497p = new ArrayList();
        try {
            if (!jSONObject.has("msg_show") || (optJSONObject2 = jSONObject.optJSONObject("msg_show")) == null) {
                str = "weekdays";
            } else {
                int optInt = optJSONObject2.optInt("min_msg");
                str = "weekdays";
                int optInt2 = optJSONObject2.optInt("max_msg");
                if (optInt >= 0 && optInt2 >= 0) {
                    this.f94483b = optInt;
                    this.f94484c = optInt2;
                    this.f94482a.add(0);
                }
            }
            if (jSONObject.has("check_new_friend")) {
                this.f94485d = jSONObject.optInt("check_new_friend");
                this.f94482a.add(1);
            }
            if (jSONObject.has("period") && (optJSONObject = jSONObject.optJSONObject("period")) != null) {
                this.f94486e = optJSONObject.optInt("period_start_time");
                int optInt3 = optJSONObject.optInt("period_end_time");
                this.f94487f = optInt3;
                if (this.f94486e >= 0 && optInt3 >= 0) {
                    this.f94482a.add(2);
                }
            }
            if (jSONObject.has("time_to_last_msg")) {
                int optInt4 = jSONObject.optInt("time_to_last_msg");
                this.f94488g = optInt4;
                if (optInt4 >= 0) {
                    this.f94482a.add(3);
                }
            }
            if (jSONObject.has("check_unread")) {
                int optInt5 = jSONObject.optInt("check_unread");
                this.f94489h = optInt5;
                if (optInt5 >= 0) {
                    this.f94482a.add(4);
                }
            }
            if (jSONObject.has("new_group")) {
                this.f94490i = jSONObject.optInt("new_group");
                this.f94482a.add(5);
            }
            if (jSONObject.has("chatgender") && (optJSONArray2 = jSONObject.optJSONArray("chatgender")) != null) {
                this.f94491j.clear();
                int length = optJSONArray2.length();
                for (int i11 = 0; i11 < length; i11++) {
                    this.f94491j.add(Integer.valueOf(optJSONArray2.optInt(i11)));
                }
                this.f94482a.add(6);
            }
            if (jSONObject.has("isgroup")) {
                this.f94492k = jSONObject.optInt("isgroup");
                this.f94482a.add(7);
            }
            if (jSONObject.has("friendbirthday")) {
                this.f94493l = jSONObject.optInt("friendbirthday");
                this.f94482a.add(8);
            }
            if (jSONObject.has("isfriend")) {
                this.f94494m = jSONObject.optInt("isfriend");
                this.f94482a.add(9);
            }
            if (jSONObject.has("isclosefriend")) {
                this.f94495n = jSONObject.optInt("isclosefriend");
                this.f94482a.add(10);
            }
            if (jSONObject.has("status_last_msg")) {
                this.f94496o = jSONObject.optInt("status_last_msg", -1);
                this.f94482a.add(11);
            }
            String str2 = str;
            if (jSONObject.has(str2) && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
                this.f94497p.clear();
                int length2 = optJSONArray.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    this.f94497p.add(Integer.valueOf(optJSONArray.optInt(i12)));
                }
                this.f94482a.add(12);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: a */
    public final int m99267a() {
        return this.f94493l;
    }

    /* renamed from: b */
    public final ArrayList m99268b() {
        return this.f94491j;
    }

    /* renamed from: c */
    public final int m99269c() {
        return this.f94485d;
    }

    /* renamed from: d */
    public final int m99270d() {
        return this.f94490i;
    }

    /* renamed from: e */
    public final int m99271e() {
        return this.f94498q;
    }

    /* renamed from: f */
    public final Set m99272f() {
        return this.f94482a;
    }

    /* renamed from: g */
    public final int m99273g() {
        return this.f94496o;
    }

    /* renamed from: h */
    public final int m99274h() {
        return this.f94484c;
    }

    /* renamed from: i */
    public final int m99275i() {
        return this.f94483b;
    }

    /* renamed from: j */
    public final int m99276j() {
        return this.f94487f;
    }

    /* renamed from: k */
    public final int m99277k() {
        return this.f94486e;
    }

    /* renamed from: l */
    public final int m99278l() {
        return this.f94488g;
    }

    /* renamed from: m */
    public final int m99279m() {
        return this.f94489h;
    }

    /* renamed from: n */
    public final ArrayList m99280n() {
        return this.f94497p;
    }

    /* renamed from: o */
    public final int m99281o() {
        return this.f94495n;
    }

    /* renamed from: p */
    public final int m99282p() {
        return this.f94494m;
    }

    /* renamed from: q */
    public final int m99283q() {
        return this.f94492k;
    }

    /* renamed from: r */
    public final void m99284r(int i11) {
        this.f94498q = i11;
    }
}
