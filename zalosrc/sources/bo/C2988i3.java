package bo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p471r3.C25630b;

/* renamed from: bo.i3 */
/* loaded from: classes4.dex */
public final class C2988i3 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f11804a;

    /* renamed from: b */
    private String f11805b = "";

    /* renamed from: c */
    private C25630b f11806c;

    /* renamed from: bo.i3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C2988i3() {
    }

    /* renamed from: a */
    public final String m14162a() {
        return this.f11805b;
    }

    /* renamed from: b */
    public final C25630b m14163b() {
        return this.f11806c;
    }

    /* renamed from: c */
    public final int m14164c() {
        return this.f11804a;
    }

    /* renamed from: d */
    public final boolean m14165d() {
        return this.f11804a == 2;
    }

    /* renamed from: e */
    public final boolean m14166e() {
        int i11 = this.f11804a;
        return i11 == 2 || i11 == 1 || i11 == -1;
    }

    /* renamed from: f */
    public final void m14167f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11805b = str;
    }

    /* renamed from: g */
    public final void m14168g(C25630b c25630b) {
        this.f11806c = c25630b;
    }

    /* renamed from: h */
    public final void m14169h(int i11) {
        this.f11804a = i11;
    }

    /* renamed from: i */
    public final JSONObject m14170i() {
        Integer num;
        Integer num2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f11804a);
        JSONObject jSONObject2 = new JSONObject();
        int i11 = this.f11804a;
        if (i11 != 1) {
            if (i11 == 2) {
                C25630b c25630b = this.f11806c;
                String str = null;
                if (c25630b != null) {
                    num = Integer.valueOf(c25630b.m132429g());
                } else {
                    num = null;
                }
                jSONObject2.put("stickerId", num);
                C25630b c25630b2 = this.f11806c;
                if (c25630b2 != null) {
                    num2 = Integer.valueOf(c25630b2.m132427f());
                } else {
                    num2 = null;
                }
                jSONObject2.put("cateId", num2);
                C25630b c25630b3 = this.f11806c;
                if (c25630b3 != null) {
                    str = c25630b3.m132444v();
                }
                jSONObject2.put("thumb", str);
            }
        } else {
            jSONObject2.put("text", this.f11805b);
        }
        jSONObject.put("content", jSONObject2);
        return jSONObject;
    }

    public C2988i3(int i11) {
        this.f11804a = i11;
    }
}
