package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.text.TextUtils;
import bg0.C2797c;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import p363nh.C23744a;
import p405ov.C24559a;
import p716zh.C31943h5;
import qm0.AbstractC25366r;
import vg.C28203u6;

/* renamed from: zh.h5 */
/* loaded from: classes3.dex */
public final class C31943h5 {

    /* renamed from: a */
    public static final C31943h5 f146766a = new C31943h5();

    /* renamed from: b */
    private static final C2797c f146767b = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: c */
    private static final HashMap f146768c = new HashMap();

    /* renamed from: d */
    private static final HashMap f146769d = new HashMap();

    /* renamed from: e */
    private static final HashSet f146770e = new HashSet();

    /* renamed from: f */
    private static final HashSet f146771f = new HashSet();

    /* renamed from: zh.h5$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f146772a;

        a(String str) {
            this.f146772a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m153513d(String str, String str2) {
            AbstractC19074t.m100208f(str, "$globalUid");
            AbstractC19074t.m100208f(str2, "$uid");
            if (!AbstractC19074t.m100204b(C31943h5.f146769d.get(str), str2)) {
                C31943h5 c31943h5 = C31943h5.f146766a;
                c31943h5.m153510n(str2, str);
                c31943h5.m153511o(str2, str);
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "parseGlobalUidToUid onErrorData: " + c20096c);
            C31943h5.f146771f.remove(this.f146772a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            final String optString;
            C31943h5.f146771f.remove(this.f146772a);
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null && (optJSONObject2 = optJSONObject.optJSONObject("data")) != null && (optString = optJSONObject2.optString(this.f146772a)) != null) {
                final String str = this.f146772a;
                C31943h5.f146767b.mo13474a(new Runnable() { // from class: zh.g5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31943h5.a.m153513d(str, optString);
                    }
                });
                C24559a.m127933c("[E2EE]", "parseGlobalUidToUid network: " + str + " -> " + optString);
            }
        }
    }

    /* renamed from: zh.h5$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f146773a;

        b(String str) {
            this.f146773a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m153515d(String str, String str2) {
            AbstractC19074t.m100208f(str, "$uid");
            AbstractC19074t.m100208f(str2, "$globalUid");
            if (!AbstractC19074t.m100204b(C31943h5.f146768c.get(str), str2)) {
                C31943h5 c31943h5 = C31943h5.f146766a;
                c31943h5.m153510n(str, str2);
                c31943h5.m153511o(str, str2);
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[E2EE]", "parseUidToGlobalUid onErrorData: " + c20096c);
            C31943h5.f146770e.remove(this.f146773a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            final String optString;
            C31943h5.f146770e.remove(this.f146773a);
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null && (optJSONObject2 = optJSONObject.optJSONObject("data")) != null && (optString = optJSONObject2.optString(this.f146773a)) != null) {
                final String str = this.f146773a;
                C31943h5.f146767b.mo13474a(new Runnable() { // from class: zh.i5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31943h5.b.m153515d(str, optString);
                    }
                });
                C24559a.m127933c("[E2EE]", "parseUidToGlobalUid network: " + str + " -> " + optString);
            }
        }
    }

    private C31943h5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m153504j(String str, C19051f0 c19051f0) {
        AbstractC19074t.m100208f(str, "$globalUid");
        AbstractC19074t.m100208f(c19051f0, "$missDb");
        f146766a.m153506h(str, c19051f0.f94928p, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m153505m(String str, C19051f0 c19051f0) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(c19051f0, "$missDb");
        f146766a.m153508k(str, c19051f0.f94928p, true);
    }

    /* renamed from: h */
    public final String m153506h(String str, boolean z11, boolean z12) {
        String str2;
        String str3;
        List m131496e;
        AbstractC19074t.m100208f(str, "globalUid");
        HashMap hashMap = f146769d;
        String str4 = (String) hashMap.get(str);
        if ((str4 == null || str4.length() == 0) && z11) {
            ContactProfile m141814k = C28203u6.f131407a.m141814k(str);
            if (m141814k != null) {
                str2 = m141814k.f42434r;
            } else {
                str2 = null;
            }
            str4 = str2;
            if (str4 != null && str4.length() != 0) {
                m153510n(str4, str);
            } else {
                hashMap.put(str, "");
            }
            if (str4 == null) {
                str3 = "missing";
            } else {
                str3 = str4;
            }
            C24559a.m127933c("[E2EE]", "parseGlobalUidToUid DB: " + str + ": " + str3);
        }
        if ((str4 == null || str4.length() == 0) && z12) {
            HashSet hashSet = f146771f;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(str));
                m131496e = AbstractC25366r.m131496e(str);
                c0766k.m1863p(m131496e);
            }
        }
        return str4;
    }

    /* renamed from: i */
    public final String m153507i(final String str, boolean z11) {
        String str2;
        String str3;
        AbstractC19074t.m100208f(str, "globalUid");
        final C19051f0 c19051f0 = new C19051f0();
        HashMap hashMap = f146769d;
        if (hashMap.containsKey(str)) {
            str2 = (String) hashMap.get(str);
        } else {
            c19051f0.f94928p = true;
            str2 = null;
        }
        if ((str2 == null || str2.length() == 0) && z11 && !f146771f.contains(str)) {
            f146767b.mo13474a(new Runnable() { // from class: zh.f5
                @Override // java.lang.Runnable
                public final void run() {
                    C31943h5.m153504j(str, c19051f0);
                }
            });
        }
        if (str2 != null && str2.length() != 0) {
            str3 = str2;
        } else {
            str3 = "missing";
        }
        C24559a.m127933c("[E2EE]", "parseGlobalUidToUidOnMem: " + str + " -> " + str3);
        return str2;
    }

    /* renamed from: k */
    public final String m153508k(String str, boolean z11, boolean z12) {
        String str2;
        List m131496e;
        AbstractC19074t.m100208f(str, "uid");
        HashMap hashMap = f146768c;
        String str3 = (String) hashMap.get(str);
        if ((str3 == null || str3.length() == 0) && z11) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                str3 = m141798e.m40386S();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0) {
                m153510n(str, str3);
            } else {
                hashMap.put(str, "");
            }
            if (str3 == null) {
                str2 = "missing";
            } else {
                str2 = str3;
            }
            C24559a.m127933c("[E2EE]", "parseUidToGlobalUid DB: " + str + " -> " + str2);
        }
        if ((str3 == null || str3.length() == 0) && z12) {
            HashSet hashSet = f146770e;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(str));
                m131496e = AbstractC25366r.m131496e(Integer.valueOf(Integer.parseInt(str)));
                c0766k.m1799A(m131496e);
            }
        }
        return str3;
    }

    /* renamed from: l */
    public final String m153509l(final String str, boolean z11) {
        String str2;
        String str3;
        AbstractC19074t.m100208f(str, "uid");
        final C19051f0 c19051f0 = new C19051f0();
        HashMap hashMap = f146768c;
        if (hashMap.containsKey(str)) {
            str2 = (String) hashMap.get(str);
        } else {
            c19051f0.f94928p = true;
            str2 = null;
        }
        if ((str2 == null || str2.length() == 0) && z11 && !f146770e.contains(str)) {
            f146767b.mo13474a(new Runnable() { // from class: zh.e5
                @Override // java.lang.Runnable
                public final void run() {
                    C31943h5.m153505m(str, c19051f0);
                }
            });
        }
        if (str2 != null && str2.length() != 0) {
            str3 = str2;
        } else {
            str3 = "missing";
        }
        C24559a.m127933c("[E2EE]", "parseUidToGlobalUidOnMem: " + str + ": " + str3);
        return str2;
    }

    /* renamed from: n */
    public final void m153510n(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "globalUid");
        f146769d.put(str2, str);
        f146768c.put(str, str2);
    }

    /* renamed from: o */
    public final void m153511o(String str, String str2) {
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null && !TextUtils.equals(m141798e.m40386S(), str2)) {
            m141798e.m40407h1(str2);
            C7960e.m41971c6().m42221O7(m141798e, false);
        }
    }
}
