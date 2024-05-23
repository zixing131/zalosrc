package me0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import fn0.AbstractC19074t;
import gm.C19490a;
import gm.C19491b;
import gm.C19497h;
import gm.C19498i;
import gm.C19501l;
import gm.C19502m;
import hm.C20092b;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24341v;
import on0.C24329j;
import org.json.JSONObject;
import p405ov.C24559a;
import qm0.AbstractC25358n;
import qm0.AbstractC25370t;

/* renamed from: me0.a2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23008a2 {
    /* renamed from: a */
    public static final JSONObject m117932a(String str, boolean z11) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new JSONObject(str);
                }
                return null;
            } catch (Exception e11) {
                if (z11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ JSONObject m117933b(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m117932a(str, z11);
    }

    /* renamed from: c */
    public static final String m117934c(C17969i0 c17969i0) {
        String str;
        if (c17969i0 == null || (str = c17969i0.f91021z) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    public static final MessageId m117935d(C19490a c19490a) {
        String valueOf;
        String str;
        AbstractC19074t.m100208f(c19490a, "<this>");
        if (c19490a.f96715a != 0) {
            valueOf = "group_" + c19490a.f96719e;
        } else {
            valueOf = String.valueOf(c19490a.f96719e);
        }
        String str2 = valueOf;
        MessageId.C7932a c7932a = MessageId.Companion;
        long j11 = c19490a.f96723i;
        long j12 = c19490a.f96721g;
        Integer valueOf2 = Integer.valueOf(c19490a.f96718d);
        if (valueOf2.intValue() <= 0) {
            valueOf2 = null;
        }
        if (valueOf2 == null || (str = valueOf2.toString()) == null) {
            str = "";
        }
        return c7932a.m41065d(j11, j12, str2, str);
    }

    /* renamed from: e */
    public static final String m117936e(String str, String str2) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "format");
        if (str2.length() > 0 && m117939h(str, str2)) {
            m127114D = AbstractC24341v.m127114D(str, "." + str2, ".jpg", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "/" + str2 + "/", "/jpg/", false, 4, null);
            return m127114D2;
        }
        return str;
    }

    /* renamed from: f */
    public static final String m117937f(String str, String str2) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "format");
        if (str2.length() > 0 && m117938g(str)) {
            m127114D = AbstractC24341v.m127114D(str, ".jpg", "." + str2, false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "/jpg/", "/" + str2 + "/", false, 4, null);
            return m127114D2;
        }
        return str;
    }

    /* renamed from: g */
    public static final boolean m117938g(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m117939h(str, "jpg");
    }

    /* renamed from: h */
    public static final boolean m117939h(String str, String str2) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "format");
        String str3 = "http(s)?://.+/" + str2 + "/.+\\." + str2;
        if (new C24329j(str3).m127018f(str)) {
            if (!new C24329j(str3 + ".+").m127018f(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m117940i(C19490a c19490a) {
        int i11;
        AbstractC19074t.m100208f(c19490a, "<this>");
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() > 0) {
            int i12 = c19490a.f96718d;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            if (i12 == Integer.parseInt(str2) && c19490a.f96716b == 1 && (i11 = c19490a.f96720f) != 36 && i11 != 33) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m117941j(ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(zdbApiCode, "<this>");
        if (zdbApiCode.error_code == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final ZdbApiCode m117942k(ZdbApiCode zdbApiCode, String str, String... strArr) {
        String m131375W;
        AbstractC19074t.m100208f(zdbApiCode, "<this>");
        AbstractC19074t.m100208f(str, "methodName");
        AbstractC19074t.m100208f(strArr, "params");
        if (!m117941j(zdbApiCode)) {
            m131375W = AbstractC25358n.m131375W(strArr, "|", "(", ")", 0, null, null, 56, null);
            C24559a.m127933c("[ZDB-ERROR]", str + m131375W + ": " + zdbApiCode);
        }
        return zdbApiCode;
    }

    /* renamed from: l */
    public static final List m117943l(C19491b c19491b) {
        AbstractC19074t.m100208f(c19491b, "<this>");
        ArrayList arrayList = new ArrayList();
        int m101929d = c19491b.m101929d();
        for (int i11 = 0; i11 < m101929d; i11++) {
            C20092b c20092b = C20092b.f98828a;
            C19490a m101928c = c19491b.m101928c(i11);
            AbstractC19074t.m100207e(m101928c, "get(...)");
            arrayList.add(C20092b.m104473k(c20092b, m101928c, false, 2, null));
        }
        return arrayList;
    }

    /* renamed from: m */
    public static final C19501l m117944m(MessageId messageId, int i11, String str) {
        AbstractC19074t.m100208f(messageId, "<this>");
        AbstractC19074t.m100208f(str, "iconReact");
        C19501l c19501l = new C19501l();
        c19501l.f96828a = messageId.m41045i();
        c19501l.f96829b = messageId.m41047k();
        c19501l.f96830c = messageId.m41051o();
        c19501l.f96831d = i11;
        c19501l.f96832e = str;
        return c19501l;
    }

    /* renamed from: n */
    public static final C19502m m117945n(Iterable iterable, int i11, String str) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(str, "iconReact");
        C19502m c19502m = new C19502m();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c19502m.m101950a(m117944m((MessageId) it.next(), i11, str));
        }
        return c19502m;
    }

    /* renamed from: o */
    public static final C19497h m117946o(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "<this>");
        C19497h c19497h = new C19497h();
        c19497h.f96813b = messageId.m41045i();
        c19497h.f96812a = messageId.m41047k();
        c19497h.f96814c = messageId.m41051o();
        return c19497h;
    }

    /* renamed from: p */
    public static final C19498i m117947p(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "<this>");
        C19498i c19498i = new C19498i();
        c19498i.m101942a(m117946o(messageId));
        return c19498i;
    }

    /* renamed from: q */
    public static final C19498i m117948q(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        C19498i c19498i = new C19498i();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c19498i.m101942a(m117946o((MessageId) it.next()));
        }
        return c19498i;
    }

    /* renamed from: r */
    public static final List m117949r(Iterable iterable) {
        int m131511r;
        AbstractC19074t.m100208f(iterable, "<this>");
        m131511r = AbstractC25370t.m131511r(iterable, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17945a0) it.next()).m95029V3());
        }
        return arrayList;
    }
}
