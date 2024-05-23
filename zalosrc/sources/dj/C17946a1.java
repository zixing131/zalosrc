package dj;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dj.a1 */
/* loaded from: classes3.dex */
public final class C17946a1 extends C17969i0 {
    public static final a Companion = new a(null);

    /* renamed from: B */
    private int f90858B;

    /* renamed from: dj.a1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17946a1(int i11) {
        this.f90858B = i11;
        m95392j();
    }

    /* renamed from: i */
    private final void m95391i() {
        try {
            String str = this.f91017v;
            if (str != null && str.length() != 0) {
                this.f90858B = new JSONObject(this.f91017v).optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    private final void m95392j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f90858B);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            this.f91017v = jSONObject2;
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    @Override // dj.C17969i0
    /* renamed from: c */
    public String mo95393c() {
        String str = "{\"params\":" + JSONObject.quote(this.f91017v) + "}";
        AbstractC19074t.m100207e(str, "toString(...)");
        return str;
    }

    /* renamed from: g */
    public final String m95394g() {
        int i11 = this.f90858B;
        if (i11 != 1) {
            if (i11 != 2) {
                return "";
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_self_delete_conversation_section_stop);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_self_delete_conversation_section_start);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        return m118743r02;
    }

    /* renamed from: h */
    public final int m95395h() {
        return this.f90858B;
    }

    public C17946a1(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        String optString = jSONObject.optString("params");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f91017v = optString;
        m95391i();
    }

    public C17946a1(String str) {
        this.f91017v = str == null ? "" : str;
        m95391i();
    }
}
