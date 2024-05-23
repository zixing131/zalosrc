package b40;

import ag0.C0815e1;
import am.C0943w;
import android.text.TextUtils;
import cf.C3450a;
import cg.AbstractC3460h;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17988o1;
import dj.C17990p0;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.C23250w4;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p361nb.C23648e;
import p361nb.C23649f;
import p361nb.C23662s;
import p461qu.AbstractC25495a;
import p559uv.C27373c;
import p560uw.EnumC27374a;
import p716zh.C31973j5;
import p716zh.C32080q9;
import p716zh.C32094r9;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vg.C28203u6;

/* renamed from: b40.d */
/* loaded from: classes5.dex */
public final class C2526d {

    /* renamed from: a */
    public static final C2526d f10270a = new C2526d();

    /* renamed from: b */
    private static String f10271b = "0";

    /* renamed from: c */
    private static final HashMap f10272c = new HashMap();

    /* renamed from: d */
    private static Map f10273d = new ConcurrentHashMap();

    /* renamed from: b40.d$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final int f10274a;

        /* renamed from: b */
        private final String f10275b;

        /* renamed from: c */
        private final String f10276c;

        public a(int i11, String str, String str2) {
            AbstractC19074t.m100208f(str, "entryPoint");
            AbstractC19074t.m100208f(str2, "logChatType");
            this.f10274a = i11;
            this.f10275b = str;
            this.f10276c = str2;
        }

        /* renamed from: a */
        public final String m12736a() {
            return this.f10275b;
        }

        /* renamed from: b */
        public final String m12737b() {
            return this.f10276c;
        }

        /* renamed from: c */
        public final int m12738c() {
            return this.f10274a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10274a == aVar.f10274a && AbstractC19074t.m100204b(this.f10275b, aVar.f10275b) && AbstractC19074t.m100204b(this.f10276c, aVar.f10276c);
        }

        public int hashCode() {
            return (((this.f10274a * 31) + this.f10275b.hashCode()) * 31) + this.f10276c.hashCode();
        }

        public String toString() {
            return "MsgLogInfo(msgIndex=" + this.f10274a + ", entryPoint=" + this.f10275b + ", logChatType=" + this.f10276c + ")";
        }
    }

    private C2526d() {
    }

    /* renamed from: A0 */
    private final C23649f m12647A0(MediaStoreItem mediaStoreItem, int i11) {
        C23649f c23649f = new C23649f(AbstractC25495a.m132089n(mediaStoreItem.m40599m().mo95039W2()), mediaStoreItem.m40599m().m95313z4(), C23250w4.f112644a.m119826N(mediaStoreItem), i11, mediaStoreItem.m40599m().m95030V4(), false, 32, null);
        c23649f.m123943k(mediaStoreItem.m40599m().m94862C4() + "_" + mediaStoreItem.m40571M().m41044h());
        c23649f.m123944l(AbstractC19074t.m100204b(mediaStoreItem.m40599m().m94862C4(), CoreUtility.f89233i));
        c23649f.m123942j(false);
        return c23649f;
    }

    /* renamed from: B */
    public static final void m12648B(String str, String str2, String str3) {
        String str4;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "params");
        AbstractC19074t.m100208f(str3, "entryPoint");
        if (str.length() > 0) {
            str4 = f10270a.m12733y(str);
        } else {
            str4 = "0";
        }
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(44).m123923p("editor_open").m123924q(0).m123925r(str3).m123926s(str4, str2), false);
    }

    /* renamed from: B0 */
    private final C23649f m12649B0(C17945a0 c17945a0, int i11) {
        C23649f c23649f = new C23649f(AbstractC25495a.m132089n(c17945a0.mo95039W2()), c17945a0.m94974P4(), c17945a0.m95041W4(), i11, c17945a0.m95030V4(), c17945a0.m95170j6());
        c23649f.m123943k(c17945a0.m94862C4() + "_" + c17945a0.m95029V3().m41044h());
        c23649f.m123944l(c17945a0.m95032V6());
        c23649f.m123942j(c17945a0.m95180k8());
        return c23649f;
    }

    /* renamed from: C */
    public static final void m12650C(String str, List list, boolean z11, String str2) {
        String str3;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listTrimInfo");
        AbstractC19074t.m100208f(str2, "entryPoint");
        if (str.length() > 0) {
            str3 = f10270a.m12733y(str);
        } else {
            str3 = "0";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("force_trim", z11 ? 1 : 0);
        jSONObject.put("trim_info", new JSONArray((Collection) list));
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(44).m123923p("chat_video_trim_send").m123924q(0).m123925r(str2).m123926s(str3, jSONObject.toString()), false);
    }

    /* renamed from: C0 */
    static /* synthetic */ C23649f m12651C0(C2526d c2526d, ItemAlbumMobile itemAlbumMobile, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return c2526d.m12673z0(itemAlbumMobile, i11);
    }

    /* renamed from: D */
    public static final void m12652D(String str, C3450a c3450a, String str2) {
        AbstractC19074t.m100208f(str, "logChatType");
        AbstractC19074t.m100208f(c3450a, "mediaEditorLogInfo");
        AbstractC19074t.m100208f(str2, "entryPoint");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_on_screen", c3450a.m17365a() - c3450a.m17366b());
        jSONObject.put("total_time_trim", c3450a.m17367c().m17379i());
        jSONObject.put("ll", c3450a.m17367c().m17373c());
        jSONObject.put("lr", c3450a.m17367c().m17374d());
        jSONObject.put("rl", c3450a.m17367c().m17375e());
        jSONObject.put("rr", c3450a.m17367c().m17376f());
        jSONObject.put("sl", c3450a.m17367c().m17377g());
        jSONObject.put("sr", c3450a.m17367c().m17378h());
        jSONObject.put("change_seekbar", c3450a.m17367c().m17372b());
        jSONObject.put("is_save", c3450a.m17367c().m17387q());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(44).m123923p("chat_video_trim_tot").m123924q(0).m123925r(str2).m123926s(str, jSONObject2), false);
    }

    /* renamed from: D0 */
    static /* synthetic */ C23649f m12653D0(C2526d c2526d, MediaStoreItem mediaStoreItem, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return c2526d.m12647A0(mediaStoreItem, i11);
    }

    /* renamed from: E0 */
    static /* synthetic */ C23649f m12654E0(C2526d c2526d, C17945a0 c17945a0, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return c2526d.m12649B0(c17945a0, i11);
    }

    /* renamed from: P */
    private final void m12655P(List list, int i11, String str, String str2, int i12, String str3, List list2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f10270a.m12649B0((C17945a0) it.next(), i11));
            }
            JSONObject m2116q = C0815e1.m2075D().m2116q(str2, arrayList, list2);
            if (!list.isEmpty()) {
                if (((C17945a0) list.get(0)).m95276v6()) {
                    boolean z11 = !TextUtils.isEmpty(((C17945a0) list.get(0)).m94983Q3());
                    AbstractC19074t.m100205c(m2116q);
                    m12665q(m2116q, (C17945a0) list.get(0), z11, z11);
                }
                AbstractC19074t.m100205c(m2116q);
                m12669t(m2116q, ((C17945a0) list.get(0)).mo95039W2());
            }
            C0815e1.m2075D().m2100V(new C23648e(1, str, i12, str3, str2, m2116q.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    public static final JSONObject m12656d(C27373c c27373c, int i11) {
        JSONObject jSONObject = new JSONObject();
        if (c27373c != null) {
            jSONObject.put("osz", c27373c.m140256j());
            jSONObject.put("od", c27373c.m140261o());
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            if (videoBlendingParam != null) {
                jSONObject.put("nsz", AbstractC3460h.m17437e(videoBlendingParam.f48282v, videoBlendingParam.f48283w, videoBlendingParam.f48265Q, i11));
                jSONObject.put("nd", videoBlendingParam.f48265Q);
                jSONObject.put("start_trim", videoBlendingParam.f48264P);
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static final String m12657e(int i11, List list) {
        ArrayList arrayList;
        int m131511r;
        try {
            if (list != null) {
                List list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                arrayList = new ArrayList(m131511r);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((MediaItem) it.next()).m41130X() / ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE));
                }
            } else {
                arrayList = new ArrayList();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("osz", new JSONArray((Collection) arrayList));
            jSONObject.put("pick_quant", i11);
            jSONObject.put("over_quant", arrayList.size());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: f */
    public static final String m12658f(C27373c c27373c) {
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = "";
        if (c27373c != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(c27373c.m140256j());
                jSONObject.put("osz", jSONArray);
                jSONObject.put("pick_quant", 1);
                jSONObject.put("over_quant", 1);
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                c19059j0.f94941p = jSONObject2;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return (String) c19059j0.f94941p;
    }

    /* renamed from: g0 */
    private final void m12659g0(ArrayList arrayList, String str, C23662s c23662s, String str2) {
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_remove", str2, C0815e1.m2075D().m2117r(str2, arrayList, c23662s)), false);
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m12660i0(C2526d c2526d, List list, String str, C23662s c23662s, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "chat_storedmedia";
        }
        c2526d.m12713h0(list, str, c23662s, str2);
    }

    /* renamed from: k */
    public static final void m12661k(String str, String str2) {
        AbstractC19074t.m100208f(str, "entrypoint");
        AbstractC19074t.m100208f(str2, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(9, str, 0, "contact_copy", str2), false);
    }

    /* renamed from: m */
    private final boolean m12662m(MediaStoreItem mediaStoreItem, String str) {
        if (AbstractC19074t.m100204b(str, "4")) {
            return true;
        }
        if (AbstractC19074t.m100204b(str, "2") && C23793c.Companion.m124321a().mo124311f() - mediaStoreItem.m40599m().m95313z4() >= 1209600000) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m12663n(C17945a0 c17945a0, String str) {
        if (AbstractC19074t.m100204b(str, "4")) {
            return true;
        }
        if (AbstractC19074t.m100204b(str, "2") && C23793c.Companion.m124321a().mo124311f() - c17945a0.m94974P4() >= 1209600000) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private final void m12664p(JSONObject jSONObject, MediaStoreItem mediaStoreItem, boolean z11, boolean z12) {
        String m95223p3;
        if (mediaStoreItem.m40585b0()) {
            m95223p3 = "F";
        } else {
            m95223p3 = mediaStoreItem.m40599m().m95223p3();
            if (m95223p3 == null) {
                m95223p3 = "";
            }
        }
        m12667r(jSONObject, m95223p3, mediaStoreItem.m40599m().m95238r3(), z11, z12, mediaStoreItem.m40596j0());
        m12668s(jSONObject, mediaStoreItem.m40599m().mo95039W2());
    }

    /* renamed from: q */
    private final void m12665q(JSONObject jSONObject, C17945a0 c17945a0, boolean z11, boolean z12) {
        String str;
        long j11;
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17990p0) {
            C17990p0 c17990p0 = (C17990p0) m94929K2;
            if (c17990p0.m95670k()) {
                str = "F";
            } else {
                str = c17990p0.f91115D;
                AbstractC19074t.m100205c(str);
            }
            j11 = c17990p0.f91113B;
        } else {
            str = "";
            j11 = 0;
        }
        m12667r(jSONObject, str, j11, z11, z12, c17945a0.m95022U7());
        m12668s(jSONObject, c17945a0.mo95039W2());
    }

    /* renamed from: q0 */
    private final int m12666q0(List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            if (((MediaItem) it.next()) instanceof VideoItem) {
                i12++;
            } else {
                i11++;
            }
        }
        if (i11 == 0 && i12 == 0) {
            return -1;
        }
        if (i11 == 0) {
            return 1;
        }
        if (i12 == 0) {
            return 0;
        }
        return 2;
    }

    /* renamed from: r */
    private final void m12667r(JSONObject jSONObject, String str, long j11, boolean z11, boolean z12, boolean z13) {
        try {
            jSONObject.put("ftype", str);
            jSONObject.put("fsize", j11);
            jSONObject.put("is_fd", z11 ? 1 : 0);
            jSONObject.put("is_fd_after", z12 ? 1 : 0);
            jSONObject.put("is_r", z13 ? 1 : 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    private final void m12668s(JSONObject jSONObject, String str) {
        C31973j5 m4472f;
        if (str != null && AbstractC25495a.m132079d(str) && (m4472f = C0943w.f3447a.m4472f(str)) != null) {
            jSONObject.put("tsz", m4472f.m153732O());
        }
    }

    /* renamed from: t */
    private final void m12669t(JSONObject jSONObject, String str) {
        if (AbstractC19074t.m100204b("204278670", str)) {
            C21373a c21373a = C21373a.f104231a;
            if (c21373a.m110807w().m110825b() && c21373a.m110799k() == C11598e.e.f60097q.ordinal()) {
                jSONObject.put("vm", "listing");
            } else {
                jSONObject.put("vm", "csc");
            }
        }
    }

    /* renamed from: t0 */
    private final a m12670t0(MessageId messageId) {
        HashMap hashMap = f10272c;
        if (hashMap.containsKey(messageId)) {
            return (a) hashMap.remove(messageId);
        }
        return null;
    }

    /* renamed from: v0 */
    public static final void m12671v0(String str, String str2) {
        AbstractC19074t.m100208f(str, "entrypoint");
        AbstractC19074t.m100208f(str2, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(9, str, 0, "contact_save", str2), false);
    }

    /* renamed from: x */
    public static final void m12672x(String str, String str2, String str3) {
        String str4;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "params");
        AbstractC19074t.m100208f(str3, "entryPoint");
        if (str.length() > 0) {
            str4 = f10270a.m12733y(str);
        } else {
            str4 = "0";
        }
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(44).m123923p("editor_trim_open").m123924q(1).m123925r(str3).m123926s(str4, str2), false);
    }

    /* renamed from: z0 */
    private final C23649f m12673z0(ItemAlbumMobile itemAlbumMobile, int i11) {
        int i12;
        String str;
        if (itemAlbumMobile.f42591p == 2) {
            i12 = 19;
        } else {
            i12 = 3;
        }
        C23649f c23649f = new C23649f(AbstractC25495a.m132089n(itemAlbumMobile.f42579d0), itemAlbumMobile.f42564O, i12, i11, itemAlbumMobile.f42545A0, false, 32, null);
        String str2 = itemAlbumMobile.f42593q;
        MessageId m40496C = itemAlbumMobile.m40496C();
        if (m40496C == null || (str = m40496C.m41044h()) == null) {
            str = "0";
        }
        c23649f.m123943k(str2 + "_" + str);
        c23649f.m123944l(AbstractC19074t.m100204b(itemAlbumMobile.f42593q, CoreUtility.f89233i));
        c23649f.m123942j(false);
        return c23649f;
    }

    /* renamed from: A */
    public final String m12674A(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (AbstractC25495a.m132078c(str)) {
            return "4";
        }
        if (AbstractC25495a.m132079d(str)) {
            String substring = str.substring(6);
            AbstractC19074t.m100207e(substring, "substring(...)");
            C31973j5 m4473g = C0943w.f3447a.m4473g(substring);
            if (m4473g != null && m4473g.m153745W()) {
                return "5";
            }
            return "2";
        }
        if (AbstractC21935u.m114519I(str)) {
            return "3";
        }
        return "1";
    }

    /* renamed from: E */
    public final void m12675E(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_tap", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: F */
    public final void m12676F(MediaStoreItem mediaStoreItem, String str, String str2) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_copy", str2, C0815e1.m2075D().m2118s(str2, m12653D0(this, mediaStoreItem, 0, 1, null))), false);
    }

    /* renamed from: F0 */
    public final void m12677F0(String str, int i11, boolean z11, boolean z12, EnumC27374a enumC27374a, int i12, boolean z13, String str2, String str3, long j11, long j12, boolean z14, boolean z15) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(enumC27374a, "warningType");
        AbstractC19074t.m100208f(str2, "fullUrl");
        AbstractC19074t.m100208f(str3, "parseUrl");
        String m12733y = m12733y(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", i11);
        jSONObject.put("preview", z11 ? 1 : 0);
        jSONObject.put("thumbnail", z12 ? 1 : 0);
        if (enumC27374a != EnumC27374a.f128965r && enumC27374a != EnumC27374a.f128964q) {
            jSONObject.put("warning", enumC27374a.m140275c());
        }
        jSONObject.put("e2ee", z13 ? 1 : 0);
        if (str2.length() > 0) {
            jSONObject.put("full_url", str2);
        }
        if (str3.length() > 0) {
            jSONObject.put("parsed_url", str3);
        }
        if (i12 != -1) {
            jSONObject.put("contain", i12);
        }
        if (j11 > 0) {
            jSONObject.put("time_load", j11);
        }
        if (j12 > 0) {
            jSONObject.put("thumb_size", j12);
        }
        jSONObject.put("hide_preview", z14 ? 1 : 0);
        jSONObject.put("delete_url", z15 ? 1 : 0);
        C23648e c23648e = new C23648e(1, "csc", 0, "chat_link", m12733y, jSONObject.toString());
        AbstractC20110a.f98889a.mo104548a("Parse link tracking log: " + m12733y + "/ params: " + jSONObject, new Object[0]);
        C0815e1.m2075D().m2100V(c23648e, false);
    }

    /* renamed from: G */
    public final void m12678G(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_copy", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: G0 */
    public final void m12679G0(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(1, "csc_msgmenu", 0, "message_select_text", str), false);
    }

    /* renamed from: H */
    public final void m12680H(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_delete", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: H0 */
    public final void m12681H0(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(1, "csc_msgmenu", 1, "message_select_text_banner", str), false);
    }

    /* renamed from: I */
    public final void m12682I(List list, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list == null || list.isEmpty() || !m12663n((C17945a0) list.get(0), str2)) {
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        C23649f[] m12715j = m12715j(list);
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_delete", str2, m2075D.m2118s(str2, (C23649f[]) Arrays.copyOf(m12715j, m12715j.length))), false);
    }

    /* renamed from: I0 */
    public final void m12683I0(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(44, "csc", 1, "view_video_HD_bottomsheet", str), false);
    }

    /* renamed from: J */
    public final void m12684J(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "message_detail", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: J0 */
    public final void m12685J0(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        C0815e1.m2075D().m2100V(new C23648e(44, "chat_videomsg", 1, "view_video_HD_tag", str), false);
    }

    /* renamed from: K */
    public final void m12686K(ItemAlbumMobile itemAlbumMobile, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (itemAlbumMobile == null) {
            return;
        }
        String str3 = null;
        JSONObject m2114n = C0815e1.m2075D().m2114n(str2, m12651C0(this, itemAlbumMobile, 0, 1, null));
        AbstractC19074t.m100207e(m2114n, "createJsonObjectParamActionLogV2ChatCore(...)");
        MessageId m40496C = itemAlbumMobile.m40496C();
        if (m40496C != null) {
            str3 = m40496C.m41048l();
        }
        m12669t(m2114n, str3);
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_download", str2, m2114n.toString()), false);
    }

    /* renamed from: K0 */
    public final void m12687K0(String str, int i11, boolean z11, long j11, int i12, boolean z12, int i13) {
        AbstractC19074t.m100208f(str, "chatType");
        if (i11 > 0 && !z11 && C19172a.m100601l("features@jump_csc@log_unread_msg_enable", 0, 2, null) == 1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("unread_count", i11);
            jSONObject.put("duration", j11);
            jSONObject.put("visible_unread_msg", i12);
            jSONObject.put("visible_button_unread_msg", z12 ? 1 : 0);
            jSONObject.put("consume_unread_behavior", i13);
            C0815e1.m2075D().m2100V(new C23648e(1, "", 1, "consume_unread_msg", str, jSONObject.toString()), false);
        }
    }

    /* renamed from: L */
    public final void m12688L(MediaStoreItem mediaStoreItem, String str, String str2) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        JSONObject m2114n = C0815e1.m2075D().m2114n(str2, m12653D0(this, mediaStoreItem, 0, 1, null));
        if (mediaStoreItem.m40581Y()) {
            AbstractC19074t.m100205c(m2114n);
            m12664p(m2114n, mediaStoreItem, true, true);
        }
        AbstractC19074t.m100205c(m2114n);
        m12669t(m2114n, mediaStoreItem.m40599m().mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_download", str2, jSONObject), false);
    }

    /* renamed from: M */
    public final void m12689M(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null) {
            return;
        }
        JSONObject m2114n = C0815e1.m2075D().m2114n(str2, m12649B0(c17945a0, i11));
        if (c17945a0.m95276v6()) {
            AbstractC19074t.m100205c(m2114n);
            m12665q(m2114n, c17945a0, true, true);
        }
        AbstractC19074t.m100205c(m2114n);
        m12669t(m2114n, c17945a0.mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_download", str2, jSONObject), false);
    }

    /* renamed from: N */
    public final void m12690N(MediaStoreItem mediaStoreItem, boolean z11, boolean z12, boolean z13) {
        String str;
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        a m12670t0 = m12670t0(mediaStoreItem.m40571M());
        if (m12670t0 == null) {
            return;
        }
        if (z11) {
            str = "message_open";
        } else {
            str = "message_download";
        }
        String str2 = str;
        JSONObject m2114n = C0815e1.m2075D().m2114n(m12670t0.m12737b(), m12647A0(mediaStoreItem, m12670t0.m12738c()));
        if (mediaStoreItem.m40581Y()) {
            AbstractC19074t.m100205c(m2114n);
            m12664p(m2114n, mediaStoreItem, z12, z13);
        }
        AbstractC19074t.m100205c(m2114n);
        m12669t(m2114n, mediaStoreItem.m40599m().mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, m12670t0.m12736a(), 0, str2, m12670t0.m12737b(), jSONObject), false);
    }

    /* renamed from: O */
    public final void m12691O(C17945a0 c17945a0, boolean z11, boolean z12, boolean z13) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "message");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        a m12670t0 = m12670t0(m95029V3);
        if (m12670t0 == null) {
            return;
        }
        if (z11) {
            str = "message_open";
        } else {
            str = "message_download";
        }
        String str2 = str;
        JSONObject m2114n = C0815e1.m2075D().m2114n(m12670t0.m12737b(), m12649B0(c17945a0, m12670t0.m12738c()));
        if (c17945a0.m95276v6()) {
            AbstractC19074t.m100205c(m2114n);
            m12665q(m2114n, c17945a0, z12, z13);
        }
        AbstractC19074t.m100205c(m2114n);
        m12669t(m2114n, c17945a0.mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, m12670t0.m12736a(), 0, str2, m12670t0.m12737b(), jSONObject), false);
    }

    /* renamed from: Q */
    public final void m12692Q(List list, int i11, String str, String str2, List list2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list2 == null) {
            list2 = new ArrayList();
        }
        m12655P(list, i11, str, str2, 0, "message_forward_done", list2);
    }

    /* renamed from: R */
    public final void m12693R(List list, int i11, String str, String str2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        m12655P(list, i11, str, str2, 1, "message_forward", new ArrayList());
    }

    /* renamed from: S */
    public final void m12694S(List list, int i11, String str, String str2, List list2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list2 == null) {
            list2 = new ArrayList();
        }
        m12655P(list, i11, str, str2, 0, "message_forward_newgroup", list2);
    }

    /* renamed from: T */
    public final void m12695T(List list, int i11, String str, String str2, List list2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list2 == null) {
            list2 = new ArrayList();
        }
        m12655P(list, i11, str, str2, 0, "message_forward_otherapp", list2);
    }

    /* renamed from: U */
    public final void m12696U(List list, int i11, String str, String str2, List list2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list2 == null) {
            list2 = new ArrayList();
        }
        m12655P(list, i11, str, str2, 0, "message_forward_story", list2);
    }

    /* renamed from: V */
    public final void m12697V(List list, int i11, String str, String str2, List list2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list2 == null) {
            list2 = new ArrayList();
        }
        m12655P(list, i11, str, str2, 0, "message_forward_timeline", list2);
    }

    /* renamed from: W */
    public final void m12698W(String str, long j11, int i11, String str2, String str3) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "logChatType");
        if (AbstractC19074t.m100204b(str3, "4") || (AbstractC19074t.m100204b(str3, "2") && C23793c.Companion.m124321a().mo124311f() - j11 >= 1209600000)) {
            JSONObject m2114n = C0815e1.m2075D().m2114n(str3, new C23649f(AbstractC25495a.m132089n(str), j11, i11, -1, 0L, false, 48, null));
            AbstractC19074t.m100207e(m2114n, "createJsonObjectParamActionLogV2ChatCore(...)");
            m12669t(m2114n, str);
            C0815e1.m2075D().m2100V(new C23648e(1, str2, 1, "message_edit", str3, m2114n.toString()), false);
        }
    }

    /* renamed from: X */
    public final void m12699X(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "message_menu", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: Y */
    public final void m12700Y(List list, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list == null || list.isEmpty() || !m12663n((C17945a0) list.get(0), str2)) {
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        C23649f[] m12715j = m12715j(list);
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "message_more", str2, m2075D.m2118s(str2, (C23649f[]) Arrays.copyOf(m12715j, m12715j.length))), false);
    }

    /* renamed from: Z */
    public final void m12701Z(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_multiselect", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: a */
    public final void m12702a(long j11, C32080q9 c32080q9) {
        AbstractC19074t.m100208f(c32080q9, "uploadInfo");
        f10273d.put(Long.valueOf(j11), c32080q9);
    }

    /* renamed from: a0 */
    public final void m12703a0(MediaStoreItem mediaStoreItem, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (mediaStoreItem == null) {
            return;
        }
        if (!m12662m(mediaStoreItem, str2) && !mediaStoreItem.m40581Y()) {
            return;
        }
        JSONObject m2114n = C0815e1.m2075D().m2114n(str2, m12653D0(this, mediaStoreItem, 0, 1, null));
        if (mediaStoreItem.m40581Y()) {
            AbstractC19074t.m100205c(m2114n);
            m12664p(m2114n, mediaStoreItem, mediaStoreItem.m40582Z(), mediaStoreItem.m40582Z());
        }
        AbstractC19074t.m100205c(m2114n);
        m12668s(m2114n, mediaStoreItem.m40599m().mo95039W2());
        m12669t(m2114n, mediaStoreItem.m40599m().mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_open", str2, jSONObject), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:            if (r0.equals("4") == false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:            if (r0.equals("3") == false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:            if (r0.equals("2") == false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:            if (r0.equals("1") == false) goto L85;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12704b(String str, C0943w c0943w, String str2, int i11, String str3, String... strArr) {
        int i12;
        ArrayList m131500h;
        C31973j5 m4473g;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c0943w, "groupDAO");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "actionId");
        AbstractC19074t.m100208f(strArr, "params");
        int hashCode = str2.hashCode();
        if (hashCode == -1433478503 ? str2.equals("csc_scroll") : hashCode == 56792825 ? str2.equals("csc_button_arrow_down") : hashCode == 501526891 && str2.equals("csc_leave")) {
            String str4 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str4, "currentUserUid");
            if (Integer.parseInt(str4) % 10 != 0) {
                return;
            }
        }
        if (AbstractC25495a.m132079d(str) && (m4473g = c0943w.m4473g(str)) != null) {
            i12 = m4473g.m153732O();
        } else {
            i12 = 0;
        }
        String str5 = strArr[1];
        String str6 = "1";
        switch (str5.hashCode()) {
            case 49:
                break;
            case 50:
                str6 = "2";
                break;
            case 51:
                break;
            case 52:
                break;
            default:
                str6 = "0";
                break;
        }
        m131500h = AbstractC25368s.m131500h(strArr[0]);
        m131500h.add(str6);
        m131500h.add(String.valueOf(i12));
        String[] strArr2 = (String[]) m131500h.toArray(new String[0]);
        C0815e1.m2075D().m2100V(new C23648e(1, str2, i11, str3, (String[]) Arrays.copyOf(strArr2, strArr2.length)), true);
    }

    /* renamed from: b0 */
    public final void m12705b0(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null) {
            return;
        }
        if (!m12663n(c17945a0, str2) && !c17945a0.m95276v6()) {
            return;
        }
        JSONObject m2114n = C0815e1.m2075D().m2114n(str2, m12649B0(c17945a0, i11));
        if (c17945a0.m95276v6()) {
            boolean z11 = !TextUtils.isEmpty(c17945a0.m94983Q3());
            AbstractC19074t.m100205c(m2114n);
            m12665q(m2114n, c17945a0, z11, z11);
        }
        AbstractC19074t.m100205c(m2114n);
        m12668s(m2114n, c17945a0.mo95039W2());
        m12669t(m2114n, c17945a0.mo95039W2());
        String jSONObject = m2114n.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_open", str2, jSONObject), false);
    }

    /* renamed from: c */
    public final void m12706c(long j11, int i11) {
        long j12 = j11 / ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
        C0815e1.m2075D().m2099U(3, 2, 21, String.valueOf(i11), String.valueOf(j12));
        AbstractC20110a.f98889a.mo104548a("TypeFile: " + i11 + ", SizeFile: " + j12 + " MB", new Object[0]);
    }

    /* renamed from: c0 */
    public final void m12707c0(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_recall", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: d0 */
    public final void m12708d0(List list, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list == null || list.isEmpty() || !m12663n((C17945a0) list.get(0), str2)) {
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        C23649f[] m12715j = m12715j(list);
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_recall", str2, m2075D.m2118s(str2, (C23649f[]) Arrays.copyOf(m12715j, m12715j.length))), false);
    }

    /* renamed from: e0 */
    public final void m12709e0(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "message_reminder", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: f0 */
    public final void m12710f0(ItemAlbumMobile itemAlbumMobile, String str, C23662s c23662s, String str2) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(c23662s, "extraParam");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (itemAlbumMobile != null) {
            m131500h = AbstractC25368s.m131500h(m12651C0(this, itemAlbumMobile, 0, 1, null));
            m12659g0(m131500h, str, c23662s, str2);
        }
    }

    /* renamed from: g */
    public final void m12711g(long j11, C32094r9 c32094r9, boolean z11) {
        C32080q9 c32080q9;
        AbstractC19074t.m100208f(c32094r9, "uploadInfo");
        if (f10273d.containsKey(Long.valueOf(j11)) && (c32080q9 = (C32080q9) f10273d.get(Long.valueOf(j11))) != null && c32080q9.m154783n(c32094r9)) {
            C0815e1.m2075D().m2103Y(c32080q9, z11);
            f10273d.remove(Long.valueOf(j11));
        }
    }

    /* renamed from: h */
    public final void m12712h(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "logChatType");
        int i12 = -1;
        if (i11 != -1) {
            i12 = 3;
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                }
            } else {
                i12 = 2;
            }
        }
        C0815e1.m2075D().m2100V(new C23648e(39, str2, 0, "e2ee_click_entry_point", str3, C0815e1.m2075D().m2120u(str3, str, i12)), false);
    }

    /* renamed from: h0 */
    public final void m12713h0(List list, String str, C23662s c23662s, String str2) {
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(c23662s, "extraParam");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m12654E0(f10270a, (C17945a0) it.next(), 0, 1, null));
        }
        m12659g0(arrayList, str, c23662s, str2);
    }

    /* renamed from: i */
    public final void m12714i(String str, String str2, boolean z11, List list) {
        AbstractC19074t.m100208f(str, "chatType");
        AbstractC19074t.m100208f(list, "items");
        if (str2 != null && str2.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C20215s.f99966b, z11 ? 1 : 0);
            jSONObject.put(AbstractC20216t.f99969a, f10270a.m12666q0(list));
            C0815e1.m2075D().m2100V(new C23648e(44, str2, 0, "click_HD_mode", str, jSONObject.toString()), false);
        }
    }

    /* renamed from: j */
    public final C23649f[] m12715j(List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m12654E0(this, (C17945a0) it.next(), 0, 1, null));
        }
        Object[] array = arrayList.toArray(new C23649f[0]);
        AbstractC19074t.m100207e(array, "toArray(...)");
        return (C23649f[]) array;
    }

    /* renamed from: j0 */
    public final void m12716j0(C17945a0 c17945a0, int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        if (c17945a0 == null || !m12663n(c17945a0, str2)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_reply", str2, C0815e1.m2075D().m2118s(str2, m12649B0(c17945a0, i11))), false);
    }

    /* renamed from: k0 */
    public final void m12717k0(List list, int i11, String str, String str2) {
        List m131502j;
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f10270a.m12649B0((C17945a0) it.next(), i11));
            }
            C0815e1 m2075D = C0815e1.m2075D();
            m131502j = AbstractC25368s.m131502j();
            JSONObject m2116q = m2075D.m2116q(str2, arrayList, m131502j);
            if (!list.isEmpty()) {
                if (((C17945a0) list.get(0)).m95276v6()) {
                    boolean z11 = !TextUtils.isEmpty(((C17945a0) list.get(0)).m94983Q3());
                    AbstractC19074t.m100205c(m2116q);
                    m12665q(m2116q, (C17945a0) list.get(0), z11, z11);
                }
                AbstractC19074t.m100205c(m2116q);
                m12669t(m2116q, ((C17945a0) list.get(0)).mo95039W2());
            }
            C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "message_download", str2, m2116q.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public final void m12718l(int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "logChatType");
        AbstractC19074t.m100208f(str2, "entryPoint");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("preview_count", i11);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            C0815e1.m2075D().m2100V(new C23648e(54, str2, 1, "fullscreen_sticker_preview", str, jSONObject2), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l0 */
    public final void m12719l0(String str, String str2) {
        AbstractC19074t.m100208f(str, "actionId");
        AbstractC19074t.m100208f(str2, "logChatType");
        C0815e1.m2075D().m2100V(new C23648e(1, "", 1, str, str2), false);
    }

    /* renamed from: m0 */
    public final void m12720m0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        String m12733y = m12733y(str);
        JSONObject m2114n = C0815e1.m2075D().m2114n(m12733y, new C23649f[0]);
        try {
            m2114n.put("des_id", str);
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
            if (m141800i != null) {
                m2114n.put("ba", m141800i.m40357A0() ? 1 : 0);
                m2114n.put("stranger", !AbstractC21935u.m114554u(str) ? 1 : 0);
                m2114n.put("from_csc", z11 ? 1 : 0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        C0815e1.m2075D().m2100V(new C23648e(1, "social_profile", 0, "open_csc_from_profile", m12733y, m2114n.toString()), false);
    }

    /* renamed from: n0 */
    public final void m12721n0(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "logChatType");
        C0815e1 m2075D = C0815e1.m2075D();
        C21373a c21373a = C21373a.f104231a;
        C0815e1.m2075D().m2100V(new C23648e(1, str2, 1, "csc_filetransfer", str3, m2075D.m2087A(str3, str, c21373a.m110782A(), c21373a.m110799k())), false);
    }

    /* renamed from: o */
    public final void m12722o(String str, String str2, boolean z11, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "logChatType");
        C0815e1.m2075D().m2100V(new C23648e(39, "csc_e2ee_settings", 1, "e2ee_exit_setting_view", str2, C0815e1.m2075D().m2122w(str2, str, z11, i11)), false);
    }

    /* renamed from: o0 */
    public final void m12723o0(String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "jump_link_permission", str2), false);
    }

    /* renamed from: p0 */
    public final void m12724p0(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view_type", i11);
            jSONObject.put("sticker_fss", z11 ? 1 : 0);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            C0815e1.m2075D().m2100V(new C23648e(54, str, 1, "sticker_open_panel", f10271b, jSONObject2), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r0 */
    public final void m12725r0(String str, boolean z11, int i11, int i12, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "chatType");
        if (i11 >= 0 && i11 <= i12) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mode", z11 ? 1 : 0);
            jSONObject.put("playtime", i11);
            jSONObject.put("duration", i12);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, !z12 ? 1 : 0);
            jSONObject.put("fullscreen", !z13 ? 1 : 0);
            jSONObject.put("skip", z14 ? 1 : 0);
            C0815e1.m2075D().m2100V(new C23648e(44, "csc", 1, "play_video_message", str, jSONObject.toString()), false);
        }
    }

    /* renamed from: s0 */
    public final void m12726s0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", z11 ? 1 : 0);
        C0815e1.m2075D().m2100V(new C23648e(44, str, 0, "remember_media_quality", jSONObject.toString()), false);
    }

    /* renamed from: u */
    public final void m12727u(String str) {
        AbstractC19074t.m100208f(str, "entry");
        C0815e1.m2075D().m2100V(new C23648e(1, "chat_list_item", 1, "inbox_chat_multiselect", "0", str), false);
    }

    /* renamed from: u0 */
    public final void m12728u0(List list, String str, String str2) {
        AbstractC19074t.m100208f(list, "chatContents");
        AbstractC19074t.m100208f(str, "logChatType");
        AbstractC19074t.m100208f(str2, "entryPoint");
        if (list.isEmpty()) {
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        C23649f[] m12715j = m12715j(list);
        C0815e1.m2075D().m2100V(new C23648e(1, str2, 0, "retry_send", str, m2075D.m2118s(str, (C23649f[]) Arrays.copyOf(m12715j, m12715j.length))), false);
    }

    /* renamed from: v */
    public final void m12729v(MessageId messageId, int i11, String str, String str2) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        f10272c.put(messageId, new a(i11, str, str2));
    }

    /* renamed from: w */
    public final void m12730w(C17988o1.a aVar, String str) {
        AbstractC19074t.m100208f(aVar, "typeAction");
        AbstractC19074t.m100208f(str, "globalMsgId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, aVar.m95664c());
        jSONObject.put("msg_id", str);
        C0815e1.m2075D().m2100V(new C23648e(1, "quick_reply_banner", 0, "quick_reply_response", jSONObject.toString()), false);
    }

    /* renamed from: w0 */
    public final void m12731w0(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "chatLogType");
        AbstractC19074t.m100208f(str2, "entryPoint");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jump_link", i11);
        C0815e1.m2075D().m2100V(new C23648e(1, str2, 0, "jump_link_select", str, jSONObject.toString()), false);
    }

    /* renamed from: x0 */
    public final void m12732x0(String str, boolean z11, boolean z12, List list) {
        int i11;
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(list, "items");
        if (!z11) {
            i11 = 0;
        } else if (!z12) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hd", i11);
        jSONObject.put(AbstractC20216t.f99969a, f10270a.m12666q0(list));
        C0815e1.m2075D().m2100V(new C23648e(44, str, 0, "send_photo_video", jSONObject.toString()), false);
    }

    /* renamed from: y */
    public final String m12733y(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (AbstractC25495a.m132078c(str)) {
            return "4";
        }
        if (AbstractC25495a.m132079d(str)) {
            return "2";
        }
        if (AbstractC21935u.m114518H(str)) {
            return "3";
        }
        return "1";
    }

    /* renamed from: y0 */
    public final void m12734y0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f10271b = str;
    }

    /* renamed from: z */
    public final String m12735z(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (AbstractC25495a.m132078c(str)) {
            return "4";
        }
        if (AbstractC25495a.m132079d(str)) {
            String substring = str.substring(6);
            AbstractC19074t.m100207e(substring, "substring(...)");
            C31973j5 m4472f = C0943w.f3447a.m4472f(substring);
            if (m4472f != null && m4472f.m153745W()) {
                return "5";
            }
            return "2";
        }
        if (AbstractC21935u.m114518H(str)) {
            return "3";
        }
        return "1";
    }
}
