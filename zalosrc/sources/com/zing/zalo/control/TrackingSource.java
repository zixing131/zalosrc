package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.C3020p0;
import com.zing.zalo.p077ui.chat.C11318b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p461qu.AbstractC25495a;
import vg.C28203u6;

/* loaded from: classes3.dex */
public class TrackingSource implements Parcelable {
    public static final Parcelable.Creator<TrackingSource> CREATOR = new C7893a();

    /* renamed from: p */
    private int f42683p;

    /* renamed from: q */
    private HashMap f42684q;

    /* renamed from: r */
    private final HashMap f42685r;

    /* renamed from: com.zing.zalo.control.TrackingSource$a */
    /* loaded from: classes3.dex */
    class C7893a implements Parcelable.Creator {
        C7893a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackingSource createFromParcel(Parcel parcel) {
            return new TrackingSource(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackingSource[] newArray(int i11) {
            return new TrackingSource[i11];
        }
    }

    /* renamed from: com.zing.zalo.control.TrackingSource$b */
    /* loaded from: classes3.dex */
    public static class C7894b {

        /* renamed from: a */
        private int f42686a = -1;

        /* renamed from: b */
        private String f42687b = "";

        /* renamed from: c */
        private int f42688c = -1;

        /* renamed from: d */
        private String f42689d = "";

        /* renamed from: e */
        private String f42690e = "";

        /* renamed from: f */
        private int f42691f = -1;

        /* renamed from: a */
        public String m40689a() {
            String str = "";
            try {
                JSONObject jSONObject = new JSONObject();
                int i11 = this.f42686a;
                if (i11 != 10) {
                    if (i11 == 11) {
                        jSONObject.put("feedid", this.f42687b);
                        jSONObject.put("cmtid", this.f42690e);
                        jSONObject.put("feedOwner", this.f42689d);
                        str = jSONObject.toString();
                    }
                } else {
                    jSONObject.put("feedid", this.f42687b);
                    jSONObject.put("feedtype", this.f42688c);
                    jSONObject.put("feedOwner", this.f42689d);
                    jSONObject.put("feedLayoutMode", this.f42691f);
                    str = jSONObject.toString();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return str;
        }

        /* renamed from: b */
        public C7894b m40690b(String str) {
            this.f42690e = str;
            return this;
        }

        /* renamed from: c */
        public C7894b m40691c(String str) {
            this.f42687b = str;
            return this;
        }

        /* renamed from: d */
        public C7894b m40692d(String str) {
            this.f42689d = str;
            return this;
        }

        /* renamed from: e */
        public C7894b m40693e(int i11) {
            this.f42688c = i11;
            return this;
        }

        /* renamed from: f */
        public C7894b m40694f(int i11) {
            this.f42686a = i11;
            return this;
        }

        /* renamed from: g */
        public C7894b m40695g(int i11) {
            this.f42691f = i11;
            return this;
        }
    }

    /* renamed from: c */
    public static int m40664c(int i11) {
        return i11 != 1 ? 0 : 11;
    }

    /* renamed from: d */
    public static String m40665d(int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourceView", i11);
            return jSONObject.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static int m40666e() {
        String m60513g = C11318b.m60507e().m60513g();
        if (m60513g.isEmpty()) {
            return 30;
        }
        try {
            if (AbstractC25495a.m132079d(m60513g)) {
                return 31;
            }
            if (!AbstractC21935u.m114518H(m60513g)) {
                return 30;
            }
            return 33;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 30;
        }
    }

    /* renamed from: f */
    public static int m40667f(C3020p0 c3020p0) {
        if (c3020p0 == null) {
            return 10;
        }
        try {
            if (c3020p0.f12058q != 100) {
                return 10;
            }
            return 224;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 10;
        }
    }

    /* renamed from: g */
    public static int m40668g(String str) {
        if (str == null || str.isEmpty()) {
            return 410;
        }
        if (AbstractC25495a.m132079d(str)) {
            return 411;
        }
        if (!AbstractC25495a.m132078c(str)) {
            return 410;
        }
        return 412;
    }

    /* renamed from: h */
    public static String m40669h(int i11) {
        String m60513g = C11318b.m60507e().m60513g();
        if (m60513g.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (i11 != 30) {
                if (i11 != 31) {
                    if (i11 != 33) {
                        return "";
                    }
                    jSONObject.put("pageId", m60513g);
                    return jSONObject.toString();
                }
                jSONObject.put("groupId", AbstractC25495a.m132088m(m60513g));
                return jSONObject.toString();
            }
            jSONObject.put("uidTo", m60513g);
            ContactProfile m141811g = C28203u6.f131407a.m141811g(m60513g);
            if (m141811g != null && m141811g.m40435x0()) {
                jSONObject.put("profile_stt", m141811g.f42394Y0);
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static String m40670i(int i11, String str) {
        String str2 = "";
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                switch (i11) {
                    case 410:
                    case 412:
                        jSONObject.put("uid", str);
                        str2 = jSONObject.toString();
                        break;
                    case 411:
                        jSONObject.put("groupId", AbstractC25495a.m132088m(str));
                        str2 = jSONObject.toString();
                        break;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return str2;
    }

    /* renamed from: j */
    public static String m40671j(long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smId", j11);
            return jSONObject.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    public static String m40672k(int i11, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            switch (i11) {
                case 220:
                case 221:
                case 222:
                case 223:
                case 224:
                    jSONObject.put("campaignId", str);
                    return jSONObject.toString();
                default:
                    return "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
        e11.printStackTrace();
        return "";
    }

    /* renamed from: p */
    public static String m40673p() {
        return "sourceParams";
    }

    /* renamed from: q */
    public static String m40674q(TrackingSource trackingSource) {
        if (trackingSource != null) {
            return trackingSource.m40682o();
        }
        return "";
    }

    /* renamed from: u */
    public static String m40675u() {
        return "sourceType";
    }

    /* renamed from: w */
    public static String m40676w(TrackingSource trackingSource) {
        if (trackingSource != null) {
            return String.valueOf(trackingSource.m40683t());
        }
        return "";
    }

    /* renamed from: a */
    public void m40677a(String str, Object obj) {
        HashMap hashMap = this.f42684q;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    /* renamed from: b */
    public void m40678b(String str, Object obj) {
        HashMap hashMap = this.f42685r;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public Object m40679l(String str) {
        HashMap hashMap = this.f42684q;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.f42684q.get(str);
        }
        HashMap hashMap2 = this.f42685r;
        if (hashMap2 != null) {
            return hashMap2.get(str);
        }
        return null;
    }

    /* renamed from: m */
    public HashMap m40680m() {
        return this.f42684q;
    }

    /* renamed from: n */
    public byte[] m40681n() {
        try {
            String m40682o = m40682o();
            if (!TextUtils.isEmpty(m40682o)) {
                return m40682o.getBytes("UTF-8");
            }
            return new byte[0];
        } catch (Exception e11) {
            e11.printStackTrace();
            return new byte[0];
        }
    }

    /* renamed from: o */
    public String m40682o() {
        try {
            HashMap hashMap = this.f42684q;
            if (hashMap != null && hashMap.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : this.f42684q.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                return jSONObject.toString();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: t */
    public int m40683t() {
        return this.f42683p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("srcType=");
        sb2.append(this.f42683p);
        sb2.append("; srcParams=");
        Object obj = this.f42684q;
        if (obj == null) {
            obj = "NULL";
        }
        sb2.append(obj);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42683p);
        parcel.writeValue(this.f42684q);
    }

    /* renamed from: x */
    public boolean m40684x() {
        int i11 = this.f42683p;
        return i11 == 41 || i11 == 42 || i11 == 44 || i11 == 90;
    }

    /* renamed from: y */
    public void m40685y(HashMap hashMap) {
        if (hashMap != null) {
            this.f42684q = hashMap;
        }
    }

    /* renamed from: z */
    public String m40686z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcType", this.f42683p);
            jSONObject.put("srcParams", m40682o());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public TrackingSource(int i11) {
        this.f42684q = new HashMap();
        this.f42685r = new HashMap();
        this.f42683p = i11;
    }

    public TrackingSource(short s7) {
        this.f42684q = new HashMap();
        this.f42685r = new HashMap();
        this.f42683p = s7;
    }

    private TrackingSource(Parcel parcel) {
        this.f42684q = new HashMap();
        this.f42685r = new HashMap();
        this.f42683p = parcel.readInt();
        this.f42684q = (HashMap) parcel.readValue(null);
    }

    public TrackingSource(String str) {
        this.f42684q = new HashMap();
        this.f42685r = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("srcType")) {
                this.f42683p = jSONObject.getInt("srcType");
            }
            if (!jSONObject.has("srcParams") || TextUtils.isEmpty(jSONObject.getString("srcParams"))) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("srcParams"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                m40677a(next, jSONObject2.get(next));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public TrackingSource(JSONObject jSONObject) {
        this.f42684q = new HashMap();
        this.f42685r = new HashMap();
        try {
            this.f42683p = jSONObject.optInt("sourceId");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m40677a(next, optJSONObject.get(next));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
