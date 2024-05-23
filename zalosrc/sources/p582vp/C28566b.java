package p582vp;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p509sp.InterfaceC26357f;

/* renamed from: vp.b */
/* loaded from: classes4.dex */
public final class C28566b {

    /* renamed from: a */
    private final InterfaceC26357f f132548a;

    /* renamed from: vp.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f132549q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start get list user unfollow";
        }
    }

    /* renamed from: vp.b$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f132550q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(0);
            this.f132550q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Get list user unfollow success: " + this.f132550q;
        }
    }

    /* renamed from: vp.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Exception f132551q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc) {
            super(0);
            this.f132551q = exc;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Get list user unfollow fail: " + this.f132551q;
        }
    }

    /* renamed from: vp.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f132552q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start get type setting";
        }
    }

    /* renamed from: vp.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ JSONObject f132553q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONObject jSONObject) {
            super(0);
            this.f132553q = jSONObject;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Get setting success: " + this.f132553q;
        }
    }

    /* renamed from: vp.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Exception f132554q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Exception exc) {
            super(0);
            this.f132554q = exc;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Get setting fail: " + this.f132554q;
        }
    }

    public C28566b(InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f132548a = interfaceC26357f;
    }

    /* renamed from: a */
    public final List m142970a() {
        JSONArray optJSONArray;
        this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_LIST_UNFOLLOW_NOTIFICATION_NEW_FEED", a.f132549q);
        ArrayList arrayList = new ArrayList();
        try {
            String m120822Cb = AbstractC23309i.m120822Cb();
            if (m120822Cb != null && m120822Cb.length() != 0 && (optJSONArray = new JSONObject(m120822Cb).optJSONArray("list_uid")) != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String optString = optJSONArray.optJSONObject(i11).optString("userId");
                    AbstractC19074t.m100205c(optString);
                    arrayList.add(optString);
                }
            }
            this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_LIST_UNFOLLOW_NOTIFICATION_NEW_FEED", new b(arrayList));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_LIST_UNFOLLOW_NOTIFICATION_NEW_FEED", new c(e11));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int m142971b() {
        this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_TYPE_SETTING_NOTIFICATION_NEW_FEED", d.f132552q);
        try {
            String m120822Cb = AbstractC23309i.m120822Cb();
            if (m120822Cb != null && m120822Cb.length() != 0) {
                JSONObject jSONObject = new JSONObject(m120822Cb);
                this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_TYPE_SETTING_NOTIFICATION_NEW_FEED", new e(jSONObject));
                return jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            return -1;
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f132548a.mo135685a("SETTING_INLINE", "LOCAL_DATA_SOURCE_GET_TYPE_SETTING_NOTIFICATION_NEW_FEED", new f(e11));
            return -1;
        }
    }
}
