package dj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dj.j0 */
/* loaded from: classes3.dex */
public final class C17972j0 extends C17969i0 {
    public static final a Companion = new a(null);

    /* renamed from: B */
    private final String f91034B;

    /* renamed from: C */
    private final String f91035C;

    /* renamed from: D */
    private final String f91036D;

    /* renamed from: dj.j0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m95614b(String str) {
            String[] strArr = {"", "", ""};
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("bank_name", "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    strArr[0] = optString;
                    String optString2 = jSONObject.optString("number", "");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    strArr[1] = optString2;
                    String optString3 = jSONObject.optString("acc_name", "");
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    strArr[2] = optString3;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return strArr;
        }
    }

    public C17972j0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        String[] m95614b = Companion.m95614b(this.f91017v);
        this.f91034B = m95614b[0];
        this.f91035C = m95614b[1];
        this.f91036D = m95614b[2];
    }

    /* renamed from: g */
    public final String m95610g() {
        return this.f91036D;
    }

    /* renamed from: h */
    public final String m95611h() {
        return this.f91034B;
    }

    /* renamed from: i */
    public final String m95612i() {
        return this.f91035C;
    }
}
