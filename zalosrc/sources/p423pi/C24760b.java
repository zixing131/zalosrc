package p423pi;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: pi.b */
/* loaded from: classes3.dex */
public final class C24760b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f118919a = -1;

    /* renamed from: b */
    private long f118920b;

    /* renamed from: c */
    private final InterfaceC24854k f118921c;

    /* renamed from: d */
    private final InterfaceC24854k f118922d;

    /* renamed from: pi.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24760b m128699a(String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C24760b c24760b = new C24760b();
                    c24760b.m128696e(jSONObject.optInt("CURRENT_TIME_FRAME_KEY", -1));
                    c24760b.m128697f(jSONObject.optLong("CURRENT_TIME_FRAME_MILLIS_KEY", 0L));
                    JSONArray optJSONArray = jSONObject.optJSONArray("NEW_MSG_QUOTA_GROUP_KEY");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            c24760b.m128695d()[i11] = Long.valueOf(optJSONArray.getLong(i11));
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("NEW_MSG_QUOTA_11_KEY");
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            c24760b.m128694c()[i12] = Long.valueOf(optJSONArray2.getLong(i12));
                        }
                        return c24760b;
                    }
                    return c24760b;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new C24760b();
                }
            }
            return new C24760b();
        }
    }

    /* renamed from: pi.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f118923q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long[] mo12V4() {
            Long[] lArr = new Long[3];
            for (int i11 = 0; i11 < 3; i11++) {
                lArr[i11] = 0L;
            }
            return lArr;
        }
    }

    /* renamed from: pi.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f118924q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long[] mo12V4() {
            Long[] lArr = new Long[3];
            for (int i11 = 0; i11 < 3; i11++) {
                lArr[i11] = 0L;
            }
            return lArr;
        }
    }

    public C24760b() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(c.f118924q);
        this.f118921c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f118923q);
        this.f118922d = m129210a2;
    }

    /* renamed from: a */
    public final int m128692a() {
        return this.f118919a;
    }

    /* renamed from: b */
    public final long m128693b() {
        return this.f118920b;
    }

    /* renamed from: c */
    public final Long[] m128694c() {
        return (Long[]) this.f118922d.getValue();
    }

    /* renamed from: d */
    public final Long[] m128695d() {
        return (Long[]) this.f118921c.getValue();
    }

    /* renamed from: e */
    public final void m128696e(int i11) {
        this.f118919a = i11;
    }

    /* renamed from: f */
    public final void m128697f(long j11) {
        this.f118920b = j11;
    }

    /* renamed from: g */
    public final JSONObject m128698g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("CURRENT_TIME_FRAME_KEY", this.f118919a);
        jSONObject.put("CURRENT_TIME_FRAME_MILLIS_KEY", this.f118920b);
        jSONObject.put("NEW_MSG_QUOTA_GROUP_KEY", new JSONArray(m128695d()));
        jSONObject.put("NEW_MSG_QUOTA_11_KEY", new JSONArray(m128694c()));
        return jSONObject;
    }
}
