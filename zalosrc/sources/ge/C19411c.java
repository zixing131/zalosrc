package ge;

import android.text.TextUtils;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import gw.AbstractC19620d0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23160o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ge.c */
/* loaded from: classes3.dex */
public class C19411c {

    /* renamed from: A */
    public int f96259A;

    /* renamed from: B */
    public int f96260B;

    /* renamed from: a */
    public String f96261a;

    /* renamed from: b */
    public long f96262b;

    /* renamed from: c */
    public long f96263c;

    /* renamed from: d */
    public long f96264d;

    /* renamed from: e */
    public long f96265e;

    /* renamed from: f */
    public int f96266f;

    /* renamed from: g */
    public long f96267g;

    /* renamed from: h */
    public long f96268h;

    /* renamed from: i */
    public int[] f96269i;

    /* renamed from: j */
    public JSONArray f96270j;

    /* renamed from: k */
    public c f96271k;

    /* renamed from: l */
    public int f96272l;

    /* renamed from: m */
    public String f96273m;

    /* renamed from: n */
    public String f96274n;

    /* renamed from: o */
    public InviteContactProfile f96275o;

    /* renamed from: p */
    public int f96276p;

    /* renamed from: q */
    public int f96277q;

    /* renamed from: r */
    public String f96278r;

    /* renamed from: s */
    public int f96279s;

    /* renamed from: t */
    public String f96280t;

    /* renamed from: u */
    public a f96281u;

    /* renamed from: v */
    public b f96282v;

    /* renamed from: w */
    public ArrayList f96283w;

    /* renamed from: x */
    public C19418j f96284x;

    /* renamed from: y */
    public C19409a f96285y;

    /* renamed from: z */
    public String f96286z;

    /* renamed from: ge.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f96287a;

        /* renamed from: b */
        public c f96288b;

        /* renamed from: c */
        public e f96289c;

        /* renamed from: d */
        public C32826a f96290d;

        /* renamed from: e */
        public b f96291e;

        /* renamed from: f */
        public d f96292f;

        /* renamed from: g */
        public boolean f96293g;

        /* renamed from: ge.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C32826a {

            /* renamed from: a */
            public ArrayList f96294a = new ArrayList();

            /* renamed from: ge.c$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static class C32827a {

                /* renamed from: a */
                public int f96295a;

                /* renamed from: b */
                public boolean f96296b;

                /* renamed from: c */
                public String f96297c;

                public C32827a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        this.f96295a = jSONObject.optInt("id");
                        this.f96296b = jSONObject.optInt("isFollow", 1) == 1;
                        this.f96297c = jSONObject.optString("title");
                    }
                }

                /* renamed from: a */
                public JSONObject m101537a() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f96295a);
                        jSONObject.put("isFollow", this.f96296b ? 1 : 0);
                        jSONObject.put("title", this.f96297c);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                    return jSONObject;
                }
            }

            public C32826a(JSONArray jSONArray) {
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            this.f96294a.add(new C32827a(optJSONObject));
                        }
                    }
                }
            }

            /* renamed from: a */
            public boolean m101535a() {
                ArrayList arrayList = this.f96294a;
                if (arrayList == null || arrayList.size() <= 0) {
                    return true;
                }
                Iterator it = this.f96294a.iterator();
                while (it.hasNext()) {
                    if (((C32827a) it.next()).f96296b) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: b */
            public JSONArray m101536b() {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f96294a.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C32827a) it.next()).m101537a());
                }
                return jSONArray;
            }
        }

        /* renamed from: ge.c$a$b */
        /* loaded from: classes3.dex */
        public static class b {

            /* renamed from: a */
            public String f96298a;

            /* renamed from: b */
            public String f96299b;

            /* renamed from: c */
            public String f96300c;

            public b(JSONObject jSONObject) {
                if (jSONObject != null) {
                    this.f96298a = jSONObject.optString("actionType");
                    this.f96299b = jSONObject.optString("actionData");
                    this.f96300c = jSONObject.optString("actionLabel");
                }
            }

            /* renamed from: a */
            public JSONObject m101538a() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("actionType", this.f96298a);
                    jSONObject.put("actionData", this.f96299b);
                    jSONObject.put("actionLabel", this.f96300c);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject;
            }
        }

        /* renamed from: ge.c$a$c */
        /* loaded from: classes3.dex */
        public static class c {

            /* renamed from: a */
            public String f96301a;

            /* renamed from: b */
            public String f96302b;

            public c() {
            }

            public c(String str, String str2) {
                this.f96301a = str;
                this.f96302b = str2;
            }

            /* renamed from: a */
            public JSONObject m101539a() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(this.f96301a)) {
                        jSONObject.put("groupId", Long.parseLong(this.f96301a));
                    }
                    jSONObject.put("name", this.f96302b);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject;
            }
        }

        /* renamed from: ge.c$a$d */
        /* loaded from: classes3.dex */
        public static class d {

            /* renamed from: a */
            public boolean f96303a;

            /* renamed from: b */
            public String f96304b;

            /* renamed from: c */
            public int f96305c;

            public d(JSONObject jSONObject) {
                this.f96303a = false;
                this.f96304b = "";
                if (jSONObject != null) {
                    this.f96303a = jSONObject.optInt("notify", 0) == 1;
                    this.f96304b = jSONObject.optString("icon");
                    this.f96305c = jSONObject.optInt("expireTime");
                }
            }

            /* renamed from: a */
            public JSONObject m101540a() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("notify", this.f96303a ? 1 : 0);
                    jSONObject.put("icon", this.f96304b);
                    jSONObject.put("expireTime", this.f96305c);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject;
            }
        }

        public a() {
            this.f96293g = false;
        }

        /* renamed from: a */
        public JSONObject m101534a() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f96287a)) {
                    jSONObject.put("id", this.f96287a);
                }
                c cVar = this.f96288b;
                if (cVar != null) {
                    jSONObject.put("groupInfo", cVar.m101539a());
                }
                e eVar = this.f96289c;
                if (eVar != null) {
                    jSONObject.put("msg", eVar.m101541a());
                }
                C32826a c32826a = this.f96290d;
                if (c32826a != null) {
                    jSONObject.put("cateInfo", c32826a.m101536b());
                }
                b bVar = this.f96291e;
                if (bVar != null) {
                    jSONObject.put("footerConfig", bVar.m101538a());
                }
                d dVar = this.f96292f;
                if (dVar != null) {
                    jSONObject.put("localNotifInfo", dVar.m101540a());
                }
                jSONObject.put("onlyMe", this.f96293g ? 1 : 0);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: ge.c$a$e */
        /* loaded from: classes3.dex */
        public static class e {

            /* renamed from: a */
            public MessageId f96306a;

            /* renamed from: b */
            public String f96307b;

            /* renamed from: c */
            public String f96308c;

            /* renamed from: d */
            public String f96309d;

            /* renamed from: e */
            public String f96310e;

            /* renamed from: f */
            public int f96311f;

            /* renamed from: g */
            public C7907e f96312g;

            /* renamed from: h */
            public List f96313h;

            public e(MessageId messageId, String str, String str2, String str3, String str4, int i11, C7907e c7907e) {
                this.f96306a = messageId;
                this.f96307b = str;
                this.f96308c = str2;
                this.f96309d = str3;
                this.f96310e = str4;
                this.f96311f = i11;
                this.f96312g = c7907e;
                if (c7907e != null) {
                    this.f96313h = c7907e.m40857g();
                } else {
                    this.f96313h = null;
                }
            }

            /* renamed from: a */
            public JSONObject m101541a() {
                String str;
                JSONObject jSONObject = new JSONObject();
                try {
                    MessageId messageId = this.f96306a;
                    String str2 = "";
                    if (messageId == null) {
                        str = "";
                    } else {
                        str = messageId.m41044h();
                    }
                    jSONObject.put("clientMsgId", str);
                    MessageId messageId2 = this.f96306a;
                    if (messageId2 != null) {
                        str2 = messageId2.m41046j();
                    }
                    jSONObject.put("globalMsgId", str2);
                    jSONObject.put("senderName", this.f96307b);
                    jSONObject.put("senderUid", this.f96308c);
                    jSONObject.put("receiverName", this.f96309d);
                    jSONObject.put("receiverUid", this.f96310e);
                    jSONObject.put("userType", this.f96311f);
                    C7907e c7907e = this.f96312g;
                    if (c7907e != null && c7907e.m40861l() > 0) {
                        jSONObject.put("mentions", this.f96312g.m40862m());
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject;
            }

            public e(JSONObject jSONObject, String str) {
                String str2;
                if (jSONObject != null) {
                    this.f96307b = jSONObject.optString("senderName");
                    this.f96308c = jSONObject.optString("senderUid");
                    this.f96309d = jSONObject.optString("receiverName");
                    this.f96310e = jSONObject.optString("receiverUid");
                    String optString = jSONObject.optString("clientMsgId");
                    String optString2 = jSONObject.optString("globalMsgId");
                    if (str != null && !str.isEmpty()) {
                        str2 = "group_" + str;
                    } else {
                        str2 = this.f96308c.equals(CoreUtility.f89233i) ? this.f96310e : this.f96308c;
                    }
                    this.f96306a = MessageId.m41038e(optString, optString2, str2, this.f96308c);
                    this.f96311f = jSONObject.optInt("userType");
                    JSONArray optJSONArray = jSONObject.optJSONArray("mentions");
                    if (optJSONArray == null) {
                        this.f96312g = null;
                        this.f96313h = null;
                    } else {
                        C7907e c7907e = new C7907e(optJSONArray);
                        this.f96312g = c7907e;
                        this.f96313h = c7907e.m40857g();
                    }
                }
            }
        }

        public a(JSONObject jSONObject) {
            this.f96293g = false;
            this.f96287a = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("groupInfo");
            c cVar = new c();
            this.f96288b = cVar;
            if (optJSONObject != null) {
                cVar.f96301a = optJSONObject.optString("groupId");
                this.f96288b.f96302b = optJSONObject.optString("name");
            }
            this.f96289c = new e(jSONObject.optJSONObject("msg"), this.f96288b.f96301a);
            this.f96290d = new C32826a(jSONObject.optJSONArray("cateInfo"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("footerConfig");
            if (optJSONObject2 != null) {
                this.f96291e = new b(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("localNotifInfo");
            if (optJSONObject3 != null) {
                this.f96292f = new d(optJSONObject3);
            }
            this.f96293g = jSONObject.optInt("onlyMe", 0) == 1;
        }
    }

    /* renamed from: ge.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public String f96314a;

        /* renamed from: b */
        public int f96315b;

        /* renamed from: c */
        public String f96316c;

        /* renamed from: d */
        public String f96317d;

        public b() {
        }

        /* renamed from: a */
        public JSONObject m101542a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("emoji", this.f96314a);
                jSONObject.put("color", this.f96315b);
                jSONObject.put("iconUrl", this.f96316c);
                jSONObject.put("coverUrl", this.f96317d);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public b(JSONObject jSONObject) {
            this.f96314a = jSONObject.optString("emoji");
            this.f96315b = jSONObject.optInt("color");
            this.f96316c = jSONObject.optString("iconUrl");
            this.f96317d = jSONObject.optString("coverUrl");
        }
    }

    /* renamed from: ge.c$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public long[] f96318a;

        public c(String str) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("list_ts");
                if (optJSONArray != null) {
                    this.f96318a = new long[optJSONArray.length()];
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.f96318a[i11] = optJSONArray.getLong(i11);
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:1|(4:3|(2:4|(1:6)(0))|8|9)(0)|7|8|9) */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:            r1 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:            r1.printStackTrace();     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public JSONObject m101543a() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (this.f96318a != null) {
                int i11 = 0;
                while (true) {
                    long[] jArr = this.f96318a;
                    if (i11 < jArr.length) {
                        jSONArray.put(jArr[i11]);
                        i11++;
                    }
                }
                jSONObject.put("list_ts", jSONArray);
                return jSONObject;
            }
            jSONObject.put("list_ts", jSONArray);
            return jSONObject;
        }
    }

    public C19411c() {
        this.f96262b = Long.MIN_VALUE;
        this.f96263c = Long.MIN_VALUE;
        this.f96264d = Long.MIN_VALUE;
        this.f96265e = Long.MIN_VALUE;
        this.f96267g = Long.MIN_VALUE;
        this.f96268h = Long.MIN_VALUE;
        this.f96259A = 0;
        this.f96260B = -1;
    }

    /* renamed from: a */
    public boolean m101526a(int i11, boolean z11) {
        a.C32826a c32826a;
        a aVar = this.f96281u;
        if (aVar == null || (c32826a = aVar.f96290d) == null || c32826a.f96294a == null) {
            return false;
        }
        boolean z12 = false;
        for (int i12 = 0; i12 < this.f96281u.f96290d.f96294a.size(); i12++) {
            a.C32826a.C32827a c32827a = (a.C32826a.C32827a) this.f96281u.f96290d.f96294a.get(i12);
            if (c32827a.f96295a == i11 && c32827a.f96296b != z11) {
                c32827a.f96296b = z11;
                z12 = true;
            }
        }
        return z12;
    }

    /* renamed from: b */
    public long m101527b() {
        int m101529d = m101529d();
        if (m101529d == -1) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance();
        AbstractC23160o0.m119283q1(calendar);
        calendar.add(6, 1);
        long timeInMillis = calendar.getTimeInMillis();
        int m101530e = m101530e();
        if (m101529d != 0) {
            if (m101529d == 1) {
                if (m101530e != 0 && m101530e != 1) {
                    if (m101530e != 2) {
                        if (m101530e == 3 || m101530e == 4) {
                            calendar.setTimeInMillis(this.f96262b);
                            AbstractC23160o0.m119283q1(calendar);
                            return calendar.getTimeInMillis();
                        }
                    } else {
                        int i11 = this.f96260B;
                        if (i11 != 1 && i11 != 2) {
                            return this.f96262b - 1800000;
                        }
                        return this.f96262b;
                    }
                } else {
                    return this.f96262b - 1800000;
                }
            }
        } else if (m101530e != 0) {
            if (m101530e != 1) {
                if (m101530e != 2) {
                    if (m101530e == 3 || m101530e == 4) {
                        return timeInMillis;
                    }
                } else {
                    int i12 = this.f96260B;
                    if (i12 != 0 && i12 != 1) {
                        return this.f96263c;
                    }
                    return timeInMillis;
                }
            } else {
                return this.f96263c;
            }
        } else {
            return this.f96262b + 1800000;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: c */
    public long m101528c() {
        return (this.f96260B == 2 && this.f96266f == 0) ? this.f96263c : this.f96262b;
    }

    /* renamed from: d */
    public int m101529d() {
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        boolean m119247e1 = AbstractC23160o0.m119247e1(this.f96262b);
        int m101530e = m101530e();
        if (m119247e1 && (m101530e == 3 || m101530e == 4 || (m101530e == 2 && ((i11 = this.f96260B) == 1 || ((i11 == 0 && currentTimeMillis >= this.f96262b - 1800000) || (i11 == 2 && currentTimeMillis <= this.f96263c)))))) {
            return 0;
        }
        if (m101530e == 1 && currentTimeMillis >= this.f96262b - 1800000 && currentTimeMillis <= this.f96263c) {
            return 0;
        }
        if (m101530e == 0) {
            long j11 = this.f96262b;
            if (currentTimeMillis >= j11 - 1800000 && currentTimeMillis <= j11 + 1800000) {
                return 0;
            }
        }
        if (currentTimeMillis <= this.f96262b) {
            return 1;
        }
        return -1;
    }

    /* renamed from: e */
    public int m101530e() {
        if (this.f96266f == 1) {
            return this.f96265e - this.f96264d >= 86400000 ? 4 : 3;
        }
        long j11 = this.f96265e;
        long j12 = this.f96264d;
        if (j11 - j12 >= 86400000) {
            return 2;
        }
        return j11 - j12 > 60000 ? 1 : 0;
    }

    /* renamed from: f */
    public void m101531f() {
        a.e eVar;
        List list;
        String str = this.f96273m;
        this.f96286z = str;
        try {
            a aVar = this.f96281u;
            if (aVar != null && (eVar = aVar.f96289c) != null && (list = eVar.f96313h) != null) {
                this.f96286z = AbstractC19620d0.m102674K(list, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m101532g(int i11) {
        a.C32826a c32826a;
        a aVar = this.f96281u;
        if (aVar != null && (c32826a = aVar.f96290d) != null && c32826a.f96294a != null) {
            int i12 = 0;
            while (i12 < this.f96281u.f96290d.f96294a.size()) {
                a.C32826a.C32827a c32827a = (a.C32826a.C32827a) this.f96281u.f96290d.f96294a.get(i12);
                if (c32827a.f96295a == i11) {
                    this.f96281u.f96290d.f96294a.remove(c32827a);
                    i12--;
                }
                i12++;
            }
        }
    }

    /* renamed from: h */
    public JSONObject mo101533h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", this.f96261a);
            jSONObject.put("startTime", this.f96262b);
            jSONObject.put("endTime", this.f96263c);
            jSONObject.put("orgStartTime", this.f96264d);
            jSONObject.put("orgEndTime", this.f96265e);
            jSONObject.put("allDay", this.f96266f);
            jSONObject.put("createTime", this.f96267g);
            jSONObject.put("modifiedTime", this.f96268h);
            JSONArray jSONArray = new JSONArray();
            if (this.f96269i != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr = this.f96269i;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jSONArray.put(iArr[i11]);
                    i11++;
                }
            }
            jSONObject.put("remind", jSONArray);
            JSONArray jSONArray2 = this.f96270j;
            if (jSONArray2 != null) {
                jSONObject.put("repeat", jSONArray2);
            }
            c cVar = this.f96271k;
            if (cVar != null) {
                jSONObject.put("repeatInfo", cVar.m101543a());
            }
            jSONObject.put("calendarType", this.f96272l);
            jSONObject.put("title", this.f96273m);
            jSONObject.put("desc", this.f96274n);
            JSONObject jSONObject2 = new JSONObject();
            InviteContactProfile inviteContactProfile = this.f96275o;
            if (inviteContactProfile != null) {
                jSONObject2.put("id", inviteContactProfile.f42434r);
                jSONObject2.put("dpn", this.f96275o.f42437s);
                jSONObject2.put("avt", this.f96275o.f42446v);
            }
            jSONObject.put("creatorProfile", jSONObject2);
            jSONObject.put("creatorType", this.f96276p);
            jSONObject.put("ownerType", this.f96277q);
            jSONObject.put("ownerId", this.f96278r);
            jSONObject.put("eventType", this.f96279s);
            a aVar = this.f96281u;
            if (aVar != null) {
                jSONObject.put("eventData", aVar.m101534a());
            }
            b bVar = this.f96282v;
            if (bVar != null) {
                jSONObject.put("eventStyle", bVar.m101542a());
            }
            JSONArray jSONArray3 = new JSONArray();
            if (this.f96283w != null) {
                for (int i12 = 0; i12 < this.f96283w.size(); i12++) {
                    jSONArray3.put(((InviteContactProfile) this.f96283w.get(i12)).m40488x1());
                }
            }
            jSONObject.put("attendees", jSONArray3);
            C19418j c19418j = this.f96284x;
            if (c19418j != null) {
                jSONObject.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, c19418j.m101555e());
            }
            C19409a c19409a = this.f96285y;
            if (c19409a != null) {
                jSONObject.put("attend", c19409a.m101524a());
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C19411c(JSONObject jSONObject) {
        this.f96262b = Long.MIN_VALUE;
        this.f96263c = Long.MIN_VALUE;
        this.f96264d = Long.MIN_VALUE;
        this.f96265e = Long.MIN_VALUE;
        this.f96267g = Long.MIN_VALUE;
        this.f96268h = Long.MIN_VALUE;
        this.f96259A = 0;
        this.f96260B = -1;
        try {
            this.f96261a = jSONObject.optString("eventId");
            this.f96262b = jSONObject.optLong("startTime", Long.MIN_VALUE);
            this.f96263c = jSONObject.optLong("endTime", Long.MIN_VALUE);
            this.f96264d = jSONObject.optLong("orgStartTime", Long.MIN_VALUE);
            this.f96265e = jSONObject.optLong("orgEndTime", Long.MIN_VALUE);
            this.f96266f = jSONObject.optInt("allDay", 0);
            this.f96267g = jSONObject.optLong("createTime", Long.MIN_VALUE);
            this.f96268h = jSONObject.optLong("modifiedTime", Long.MIN_VALUE);
            JSONArray optJSONArray = jSONObject.optJSONArray("remind");
            if (optJSONArray != null) {
                this.f96269i = new int[optJSONArray.length()];
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    this.f96269i[i11] = optJSONArray.getInt(i11);
                }
            }
            this.f96270j = jSONObject.optJSONArray("repeat");
            String optString = jSONObject.optString("repeatInfo");
            if (!TextUtils.isEmpty(optString)) {
                this.f96271k = new c(optString);
            }
            this.f96272l = jSONObject.optInt("calendarType");
            this.f96273m = jSONObject.optString("title");
            this.f96274n = jSONObject.optString("desc");
            JSONObject optJSONObject = jSONObject.optJSONObject("creatorProfile");
            if (optJSONObject != null) {
                this.f96275o = new InviteContactProfile(optJSONObject.optString("id"), optJSONObject.optString("avt"), optJSONObject.optString("dpn"));
            }
            this.f96276p = jSONObject.optInt("creatorType");
            this.f96277q = jSONObject.optInt("ownerType");
            this.f96278r = jSONObject.optString("ownerId");
            this.f96279s = jSONObject.optInt("eventType");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("eventData");
            if (optJSONObject2 != null) {
                this.f96280t = optJSONObject2.toString();
                this.f96281u = new a(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("eventStyle");
            if (optJSONObject3 != null) {
                this.f96282v = new b(optJSONObject3);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("attendees");
            if (optJSONArray2 != null) {
                this.f96283w = new ArrayList();
                for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray2.get(i12);
                    String optString2 = jSONObject2.optString("id");
                    String optString3 = jSONObject2.optString("dName");
                    String optString4 = jSONObject2.optString("avatar");
                    jSONObject2.optString("status");
                    jSONObject2.optInt("typeContact", 0);
                    this.f96283w.add(new InviteContactProfile(optString2, optString3, optString4));
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            if (optJSONObject4 != null) {
                this.f96284x = new C19418j(optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("attend");
            if (optJSONObject5 != null) {
                this.f96285y = new C19409a(optJSONObject5);
            }
            m101531f();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
