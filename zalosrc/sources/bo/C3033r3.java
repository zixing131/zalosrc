package bo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24334o;

/* renamed from: bo.r3 */
/* loaded from: classes4.dex */
public final class C3033r3 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f12223a;

    /* renamed from: b */
    private String f12224b;

    /* renamed from: c */
    private String f12225c;

    /* renamed from: d */
    private int f12226d;

    /* renamed from: bo.r3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C3033r3(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "videoID");
        AbstractC19074t.m100208f(str2, "playType");
        AbstractC19074t.m100208f(str3, "clickLoc");
        this.f12223a = str;
        this.f12224b = str2;
        this.f12225c = str3;
        this.f12226d = i11;
    }

    /* renamed from: a */
    public final String m14587a() {
        String m127098f;
        m127098f = AbstractC24334o.m127098f("\n        {\n            \"action_common_payload\": {\n                \"video_id\": \"" + this.f12223a + "\",\n                \"select_index_tab\": 1\n            },\n            \"source\": {\n                \"id\": \"feed\",\n                \"info\": {\n                    \"play_type\": \"" + this.f12224b + "\",\n                    \"click_loc\": \"" + this.f12225c + "\",\n                    \"click_time\": " + this.f12226d + "\n                }\n            }\n        }\n    ");
        return m127098f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3033r3)) {
            return false;
        }
        C3033r3 c3033r3 = (C3033r3) obj;
        return AbstractC19074t.m100204b(this.f12223a, c3033r3.f12223a) && AbstractC19074t.m100204b(this.f12224b, c3033r3.f12224b) && AbstractC19074t.m100204b(this.f12225c, c3033r3.f12225c) && this.f12226d == c3033r3.f12226d;
    }

    public int hashCode() {
        return (((((this.f12223a.hashCode() * 31) + this.f12224b.hashCode()) * 31) + this.f12225c.hashCode()) * 31) + this.f12226d;
    }

    public String toString() {
        return "ZaloVideoActionCommonData(videoID=" + this.f12223a + ", playType=" + this.f12224b + ", clickLoc=" + this.f12225c + ", clickTime=" + this.f12226d + ")";
    }
}
