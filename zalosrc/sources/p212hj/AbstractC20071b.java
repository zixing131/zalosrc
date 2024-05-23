package p212hj;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import org.json.JSONObject;
import p405ov.C24559a;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: hj.b */
/* loaded from: classes3.dex */
public abstract class AbstractC20071b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final HashMap f98683a;

    /* renamed from: b */
    private static final HashMap f98684b;

    /* renamed from: hj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ int m104319d(a aVar, String str, JSONObject jSONObject, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                jSONObject = null;
            }
            return aVar.m104324c(str, jSONObject);
        }

        /* renamed from: f */
        private final int m104320f(String str) {
            Object obj = AbstractC20071b.f98683a.get(str);
            if (obj == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown raw type ");
                sb2.append(str);
                C24559a.m127933c("MessageTypeMapper", "Unknown raw type " + str);
                obj = 10000;
            }
            return ((Number) obj).intValue();
        }

        /* renamed from: g */
        private final int m104321g(JSONObject jSONObject) {
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.optInt("layoutType", 0);
        }

        /* renamed from: a */
        public final boolean m104322a(String str) {
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            if (!AbstractC19074t.m100204b(str, "group.invite") && !AbstractC19074t.m100204b(str, "group.delete") && !AbstractC19074t.m100204b(str, "group.leave") && !AbstractC19074t.m100204b(str, "group.update") && !AbstractC19074t.m100204b(str, "group.reject") && !AbstractC19074t.m100204b(str, "group.invited.cancel") && !AbstractC19074t.m100204b(str, "group.add.admin") && !AbstractC19074t.m100204b(str, "group.remove.admin") && !AbstractC19074t.m100204b(str, "group.update.block") && !AbstractC19074t.m100204b(str, "group.update.setting") && !AbstractC19074t.m100204b(str, "group.force.leave.v2") && !AbstractC19074t.m100204b(str, "group.join.v2") && !AbstractC19074t.m100204b(str, "group.update.topic") && !AbstractC19074t.m100204b(str, "group.remove.topic")) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean m104323b(String str) {
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            if (!AbstractC19074t.m100204b(str, "webchat") && !AbstractC19074t.m100204b(str, "chat.sticker") && !AbstractC19074t.m100204b(str, "chat.voice") && !AbstractC19074t.m100204b(str, "chat.photo") && !AbstractC19074t.m100204b(str, "chat.doodle") && !AbstractC19074t.m100204b(str, "share.file") && !AbstractC19074t.m100204b(str, "chat.recommended") && !AbstractC19074t.m100204b(str, "chat.list.action") && !AbstractC19074t.m100204b(str, "chat.location.new") && !AbstractC19074t.m100204b(str, "chat.video.msg") && !AbstractC19074t.m100204b(str, "chat.ecard") && !AbstractC19074t.m100204b(str, "chat.gif") && !AbstractC19074t.m100204b(str, "chat.video.live.msg") && !AbstractC19074t.m100204b(str, "chat.webcontent") && !AbstractC19074t.m100204b(str, "chat.sync.theme") && !AbstractC19074t.m100204b(str, "chat.livelocation") && !AbstractC19074t.m100204b(str, "group.poll")) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final int m104324c(String str, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "rawType");
            if (AbstractC19074t.m100204b(str, "webchat")) {
                if (m104321g(jSONObject) == 1) {
                    return 20;
                }
                return 0;
            }
            return m104320f(str);
        }

        /* renamed from: e */
        public final String m104325e(int i11) {
            Object obj = AbstractC20071b.f98684b.get(Integer.valueOf(i11));
            if (obj == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown type ");
                sb2.append(i11);
                C24559a.m127933c("MessageTypeMapper", "Unknown type " + i11);
                obj = "";
            }
            return (String) obj;
        }
    }

    static {
        HashMap m131406k;
        HashMap m131406k2;
        m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("chat.photo", 3), AbstractC24866w.m129235a("chat.doodle", 2), AbstractC24866w.m129235a("chat.voice", 6), AbstractC24866w.m129235a("chat.sticker", 10), AbstractC24866w.m129235a("chat.video.msg", 19), AbstractC24866w.m129235a("chat.video.memo", 28), AbstractC24866w.m129235a("chat.gif", 23), AbstractC24866w.m129235a("share.file", 22), AbstractC24866w.m129235a("chat.recommended", 12), AbstractC24866w.m129235a("chat.list.action", 15), AbstractC24866w.m129235a("chat.webcontent", 24), AbstractC24866w.m129235a("chat.location.new", 18), AbstractC24866w.m129235a("chat.livelocation", 32), AbstractC24866w.m129235a("chat.video.live.msg", 25), AbstractC24866w.m129235a("chat.msg.update", 44), AbstractC24866w.m129235a("chat.sync.theme", 29), AbstractC24866w.m129235a("group.poll", 26), AbstractC24866w.m129235a("chat.ecard", 21));
        f98683a = m131406k;
        m131406k2 = AbstractC25363p0.m131406k(AbstractC24866w.m129235a(3, "chat.photo"), AbstractC24866w.m129235a(4, "chat.photo"), AbstractC24866w.m129235a(31, "chat.photo"), AbstractC24866w.m129235a(2, "chat.doodle"), AbstractC24866w.m129235a(6, "chat.voice"), AbstractC24866w.m129235a(10, "chat.sticker"), AbstractC24866w.m129235a(19, "chat.video.msg"), AbstractC24866w.m129235a(28, "chat.video.memo"), AbstractC24866w.m129235a(23, "chat.gif"), AbstractC24866w.m129235a(22, "share.file"), AbstractC24866w.m129235a(12, "chat.recommended"), AbstractC24866w.m129235a(15, "chat.list.action"), AbstractC24866w.m129235a(24, "chat.webcontent"), AbstractC24866w.m129235a(18, "chat.location.new"), AbstractC24866w.m129235a(32, "chat.livelocation"), AbstractC24866w.m129235a(25, "chat.video.live.msg"), AbstractC24866w.m129235a(44, "chat.msg.update"), AbstractC24866w.m129235a(29, "chat.sync.theme"), AbstractC24866w.m129235a(26, "group.poll"), AbstractC24866w.m129235a(21, "chat.ecard"));
        f98684b = m131406k2;
    }
}
