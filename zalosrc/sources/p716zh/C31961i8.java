package p716zh;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.i8 */
/* loaded from: classes3.dex */
public class C31961i8 {

    /* renamed from: a */
    public String f146880a;

    /* renamed from: b */
    public String f146881b;

    /* renamed from: c */
    public ArrayList f146882c;

    /* renamed from: d */
    public String f146883d;

    /* renamed from: e */
    public String f146884e;

    /* renamed from: f */
    public String f146885f;

    /* renamed from: g */
    public String f146886g;

    /* renamed from: h */
    public int f146887h;

    /* renamed from: i */
    public boolean f146888i;

    /* renamed from: j */
    public boolean f146889j;

    /* renamed from: k */
    public boolean f146890k;

    /* renamed from: l */
    public boolean f146891l;

    /* renamed from: m */
    public boolean f146892m;

    /* renamed from: n */
    public long f146893n;

    /* renamed from: o */
    public long f146894o;

    /* renamed from: p */
    public long f146895p;

    /* renamed from: q */
    public int f146896q;

    /* renamed from: r */
    public int f146897r;

    /* renamed from: s */
    public boolean f146898s;

    /* renamed from: t */
    public ArrayList f146899t;

    /* renamed from: u */
    public boolean f146900u;

    /* renamed from: zh.i8$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f146901a;

        /* renamed from: b */
        public int f146902b;

        /* renamed from: c */
        public boolean f146903c;

        /* renamed from: d */
        public boolean f146904d;

        /* renamed from: e */
        public String f146905e;

        /* renamed from: f */
        public ArrayList f146906f;

        /* renamed from: g */
        public ArrayList f146907g;

        /* renamed from: h */
        public boolean f146908h = false;

        public a(String str, int i11, boolean z11) {
            this.f146901a = str;
            this.f146902b = i11;
            this.f146903c = z11;
        }

        /* renamed from: a */
        public JSONObject m153674a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f146905e);
                jSONObject.put("content", this.f146901a);
                jSONObject.put("numVote", this.f146902b);
                jSONObject.put("isChecked", this.f146903c);
                ArrayList arrayList = this.f146906f;
                if (arrayList != null && arrayList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 = 0; i11 < this.f146906f.size(); i11++) {
                        jSONArray.put(this.f146906f.get(i11));
                    }
                    jSONObject.put("usersVote", jSONArray);
                }
                ArrayList arrayList2 = this.f146907g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i12 = 0; i12 < this.f146907g.size(); i12++) {
                        jSONArray2.put(((InviteContactProfile) this.f146907g.get(i12)).m40489y1());
                    }
                    jSONObject.put("usersVoteProfile", jSONArray2);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public a(JSONObject jSONObject) {
            try {
                this.f146905e = jSONObject.optString("id");
                this.f146901a = jSONObject.optString("content");
                this.f146902b = jSONObject.optInt("numVote");
                boolean optBoolean = jSONObject.optBoolean("isChecked");
                this.f146903c = optBoolean;
                this.f146904d = optBoolean;
                JSONArray optJSONArray = jSONObject.optJSONArray("usersVote");
                if (optJSONArray != null) {
                    this.f146906f = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.f146906f.add(optJSONArray.getString(i11));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("usersVoteProfile");
                if (optJSONArray2 != null) {
                    this.f146907g = new ArrayList();
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i12);
                        if (jSONObject2 != null) {
                            String optString = jSONObject2.optString("uid");
                            String optString2 = jSONObject2.optString("dpn");
                            this.f146907g.add(new InviteContactProfile(optString, jSONObject2.optString("avt"), optString2));
                        }
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public C31961i8() {
        this.f146892m = true;
        this.f146900u = false;
    }

    /* renamed from: d */
    public static String m153663d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pollId", str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public boolean m153664a() {
        if (this.f146890k) {
            return false;
        }
        if (this.f146891l && !m153672j() && !m153671i()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m153665b(C31961i8 c31961i8) {
        this.f146887h = c31961i8.f146887h;
        this.f146888i = c31961i8.f146888i;
        this.f146889j = c31961i8.f146889j;
        this.f146890k = c31961i8.f146890k;
        this.f146891l = c31961i8.f146891l;
        this.f146892m = c31961i8.f146892m;
        this.f146893n = c31961i8.f146893n;
        this.f146894o = c31961i8.f146894o;
        this.f146897r = c31961i8.f146897r;
        this.f146898s = c31961i8.f146898s;
        ArrayList arrayList = c31961i8.f146882c;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f146882c;
            if (arrayList2 == null) {
                this.f146882c = new ArrayList(arrayList);
            } else {
                arrayList2.clear();
                this.f146882c.addAll(arrayList);
            }
        }
    }

    /* renamed from: c */
    public int m153666c() {
        if (this.f146882c == null) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f146882c.size(); i12++) {
            i11 += ((a) this.f146882c.get(i12)).f146902b;
        }
        return i11;
    }

    /* renamed from: e */
    public ArrayList m153667e() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f146882c.size(); i11++) {
            arrayList.add(((a) this.f146882c.get(i11)).f146901a);
        }
        return arrayList;
    }

    /* renamed from: f */
    public String m153668f() {
        if (m153671i()) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_view_action);
        }
        if (m153672j()) {
            if (!this.f146892m) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_view_action);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_update_vote_action);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_vote_action);
    }

    /* renamed from: g */
    public String m153669g() {
        String str = this.f146881b;
        if (str.length() > 30) {
            return str.substring(0, 27) + "...";
        }
        return str;
    }

    /* renamed from: h */
    public boolean m153670h() {
        ArrayList arrayList = this.f146882c;
        if (arrayList != null && arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m153671i() {
        if (this.f146896q != 2 && (this.f146894o <= 0 || AbstractC23160o0.m119186C0() < this.f146894o)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m153672j() {
        ArrayList arrayList = this.f146882c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f146882c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null && aVar.f146903c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public JSONObject m153673k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f146880a);
            jSONObject.put("groupId", this.f146883d);
            jSONObject.put("createUid", this.f146884e);
            jSONObject.put("creatorName", this.f146885f);
            jSONObject.put("creatorAvatar", this.f146886g);
            jSONObject.put("question", this.f146881b);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f146887h);
            jSONObject.put("isMultiChoice", this.f146888i);
            jSONObject.put("isAddAnswer", this.f146889j);
            jSONObject.put("isAnonymous", this.f146890k);
            jSONObject.put("isHideVotePreview", this.f146891l);
            jSONObject.put("enableChangeVote", this.f146892m);
            jSONObject.put("createAt", this.f146893n);
            jSONObject.put("endAt", this.f146894o);
            jSONObject.put("verId", this.f146895p);
            jSONObject.put("state", this.f146896q);
            jSONObject.put("numVote", this.f146897r);
            jSONObject.put("isVoted", this.f146898s);
            if (this.f146882c != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < this.f146882c.size(); i11++) {
                    jSONArray.put(((a) this.f146882c.get(i11)).m153674a());
                }
                jSONObject.put("answers", jSONArray);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C31961i8(JSONObject jSONObject) {
        this.f146892m = true;
        this.f146900u = false;
        try {
            this.f146880a = jSONObject.optString("id");
            this.f146883d = jSONObject.optString("groupId");
            this.f146884e = jSONObject.optString("createUid");
            this.f146885f = jSONObject.optString("creatorName");
            this.f146886g = jSONObject.optString("creatorAvatar");
            this.f146881b = jSONObject.optString("question");
            this.f146887h = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f146888i = jSONObject.optBoolean("isMultiChoice");
            this.f146889j = jSONObject.optBoolean("isAddAnswer");
            this.f146890k = jSONObject.optBoolean("isAnonymous");
            this.f146891l = jSONObject.optBoolean("isHideVotePreview", false);
            this.f146892m = jSONObject.optBoolean("enableChangeVote", true);
            this.f146893n = jSONObject.optLong("createAt");
            this.f146894o = jSONObject.optLong("endAt");
            this.f146895p = jSONObject.optLong("verId");
            this.f146896q = jSONObject.optInt("state");
            this.f146897r = jSONObject.optInt("numVote");
            this.f146898s = jSONObject.optBoolean("isVoted");
            this.f146882c = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("answers");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    this.f146882c.add(new a((JSONObject) optJSONArray.get(i11)));
                }
            }
            this.f146899t = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("votedUids");
            if (optJSONArray2 != null) {
                for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                    this.f146899t.add(optJSONArray2.getString(i12));
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
