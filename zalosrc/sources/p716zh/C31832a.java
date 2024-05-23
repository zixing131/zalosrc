package p716zh;

import com.zing.zalo.data.entity.chat.message.MessageId;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zh.a */
/* loaded from: classes3.dex */
public class C31832a {

    /* renamed from: a */
    private boolean f146078a;

    /* renamed from: b */
    private final List f146079b = new ArrayList();

    /* renamed from: c */
    private String f146080c;

    /* renamed from: zh.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private int f146081a;

        /* renamed from: b */
        private String f146082b;

        /* renamed from: c */
        private boolean f146083c;

        /* renamed from: d */
        private final List f146084d = new ArrayList();

        public a(JSONObject jSONObject, boolean z11) {
            String str;
            try {
                this.f146081a = jSONObject.optInt("di");
                StringBuilder sb2 = new StringBuilder();
                if (z11) {
                    str = "group_";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(this.f146081a);
                this.f146082b = sb2.toString();
                boolean z12 = true;
                if (jSONObject.optInt("seen") != 1) {
                    z12 = false;
                }
                this.f146083c = z12;
                JSONArray jSONArray = jSONObject.getJSONArray("msg");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f146084d.add(new b(jSONArray.getJSONObject(i11), this.f146082b));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: a */
        public int m152947a() {
            return this.f146081a;
        }

        /* renamed from: b */
        public List m152948b() {
            return this.f146084d;
        }

        /* renamed from: c */
        public String m152949c() {
            return this.f146082b;
        }

        /* renamed from: d */
        public boolean m152950d() {
            return this.f146083c;
        }
    }

    /* renamed from: zh.a$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final int f146085a;

        /* renamed from: b */
        final MessageId f146086b;

        /* renamed from: c */
        private final long f146087c;

        /* renamed from: d */
        private final int f146088d;

        /* renamed from: e */
        private final int f146089e;

        /* renamed from: f */
        private final int f146090f;

        /* renamed from: g */
        private final String f146091g;

        /* renamed from: h */
        private final String f146092h;

        /* renamed from: i */
        int f146093i;

        /* renamed from: j */
        private int f146094j;

        public b(JSONObject jSONObject, String str) {
            this.f146085a = jSONObject.optInt("sid");
            this.f146086b = MessageId.m41037d(jSONObject.optLong("cmi", 0L), jSONObject.optLong("gmi", 0L), str, "");
            this.f146087c = jSONObject.optLong("ts");
            this.f146094j = jSONObject.optInt("ackT");
            this.f146089e = jSONObject.optInt("fromDI");
            this.f146088d = jSONObject.optInt("deviceId");
            this.f146090f = jSONObject.optInt("retry");
            this.f146093i = jSONObject.optInt("err");
            this.f146091g = jSONObject.optString("request_retry");
            this.f146092h = jSONObject.optString("retry_key");
        }

        /* renamed from: a */
        public int m152951a() {
            return this.f146088d;
        }

        /* renamed from: b */
        public String m152952b() {
            return this.f146092h;
        }

        /* renamed from: c */
        public int m152953c() {
            return this.f146089e;
        }

        /* renamed from: d */
        public MessageId m152954d() {
            return this.f146086b;
        }

        /* renamed from: e */
        public String m152955e() {
            return this.f146091g;
        }

        /* renamed from: f */
        public int m152956f() {
            return this.f146085a;
        }

        /* renamed from: g */
        public long m152957g() {
            return this.f146087c;
        }

        /* renamed from: h */
        public boolean m152958h() {
            return this.f146094j != 2;
        }

        /* renamed from: i */
        public boolean m152959i() {
            return this.f146093i != 0;
        }

        /* renamed from: j */
        public boolean m152960j() {
            return this.f146090f > 0;
        }
    }

    public C31832a(JSONObject jSONObject, boolean z11) {
        this.f146080c = "";
        try {
            if (jSONObject.length() > 0) {
                boolean z12 = true;
                if (jSONObject.optInt("more") != 1) {
                    z12 = false;
                }
                this.f146078a = z12;
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f146079b.add(new a(jSONArray.getJSONObject(i11), z11));
                }
                jSONObject.remove("more");
                this.f146080c = jSONObject.toString();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a */
    public List m152944a() {
        return this.f146079b;
    }

    /* renamed from: b */
    public String m152945b() {
        return this.f146080c;
    }

    /* renamed from: c */
    public boolean m152946c() {
        return this.f146078a;
    }
}
