package p304ks;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.AcceptFriendView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import ls.C22642b;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import mv.InterfaceC23448a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18631a;
import p142ey.C18644n;
import p172fy.C19171b;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p716zh.C31901e8;
import p716zh.C31965ic;
import p716zh.C32020m7;
import p716zh.C32035n7;
import p716zh.C32072q1;
import t00.C26446c;
import vg.C28203u6;

/* renamed from: ks.u */
/* loaded from: classes4.dex */
public abstract class AbstractC21935u {

    /* renamed from: a */
    private static final String f108004a = "u";

    /* renamed from: b */
    private static boolean f108005b = false;

    /* renamed from: c */
    private static final Map f108006c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private static final Map f108007d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static boolean[] f108008e = null;

    /* renamed from: f */
    static boolean f108009f = false;

    /* renamed from: ks.u$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f108010a;

        /* renamed from: b */
        final /* synthetic */ boolean f108011b;

        /* renamed from: c */
        final /* synthetic */ String f108012c;

        a(ContactProfile contactProfile, boolean z11, String str) {
            this.f108010a = contactProfile;
            this.f108011b = z11;
            this.f108012c = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42131G7(this.f108010a, this.f108011b);
            C7960e.m41971c6().m42234Pb(this.f108012c);
        }
    }

    /* renamed from: ks.u$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108013a;

        /* renamed from: b */
        final /* synthetic */ boolean f108014b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f108015c;

        b(String str, boolean z11, ContactProfile contactProfile) {
            this.f108013a = str;
            this.f108014b = z11;
            this.f108015c = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42278Tc(this.f108013a, 0);
            if (this.f108014b) {
                C7960e.m41971c6().m42234Pb(this.f108013a);
            } else if (this.f108015c != null) {
                C7960e.m41971c6().m42221O7(this.f108015c, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.u$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f108016a;

        /* renamed from: b */
        final /* synthetic */ String f108017b;

        c(ContactProfile contactProfile, String str) {
            this.f108016a = contactProfile;
            this.f108017b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42131G7(this.f108016a, true);
            C7960e.m41971c6().m42234Pb(this.f108017b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.u$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108018a;

        d(String str) {
            this.f108018a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42343ac(this.f108018a);
            C7960e.m41971c6().m42376e4(this.f108018a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.u$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f108019a;

        /* renamed from: b */
        final /* synthetic */ String f108020b;

        /* renamed from: c */
        final /* synthetic */ String f108021c;

        e(int i11, String str, String str2) {
            this.f108019a = i11;
            this.f108020b = str;
            this.f108021c = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11 = this.f108019a;
            if (i11 != 5 && i11 != 3) {
                C7960e.m41971c6().m42428ie(this.f108020b, this.f108019a, this.f108021c);
            } else {
                C7960e.m41971c6().m42426ic(this.f108020b, this.f108021c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.u$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ BaseZaloView f108022a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f108023b;

        /* renamed from: c */
        final /* synthetic */ Callable f108024c;

        f(BaseZaloView baseZaloView, ContactProfile contactProfile, Callable callable) {
            this.f108022a = baseZaloView;
            this.f108023b = contactProfile;
            this.f108024c = callable;
        }

        /* renamed from: d */
        public static /* synthetic */ void m114561d(BaseZaloView baseZaloView, ContactProfile contactProfile) {
            AbstractC21935u.m114523M(baseZaloView.m92676n2().mo35579p(), contactProfile);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r2v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                AbstractC21935u.f108009f = z11;
                this.f108022a.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (!jSONObject2.isNull("code")) {
                            int i11 = jSONObject2.getInt("code");
                            if (i11 == 0) {
                                AbstractC23059e9.m118317F(this.f108023b.f42434r);
                                C21927m.m114302u().m114337i(this.f108023b.f42434r);
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestSuccess));
                                AbstractC23074g2.m118375a(0, this.f108023b.f42434r, "", 1);
                                if (this.f108022a.m92676n2() != null) {
                                    this.f108022a.m92676n2().runOnUiThread(new Runnable() { // from class: ks.v

                                        /* renamed from: q */
                                        public final /* synthetic */ ContactProfile f108026q;

                                        public /* synthetic */ RunnableC21936v(ContactProfile contactProfile) {
                                            r2 = contactProfile;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AbstractC21935u.f.m114561d(BaseZaloView.this, r2);
                                        }
                                    });
                                }
                                this.f108024c.call();
                            } else if (!AbstractC23216t1.m119641f(this.f108022a, i11, true)) {
                                ToastUtils.m89259g(i11);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC21935u.f108009f = false;
                this.f108022a.mo78960q3();
            } catch (Throwable th2) {
                AbstractC21935u.f108009f = false;
                this.f108022a.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public static boolean m114511A(String str) {
        try {
            for (String str2 : TextUtils.split(AbstractC23309i.m121935g9(), ",")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m114512B() {
        if (AbstractC23309i.m120781B7() != 0 && ((Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) <= 86400000 || AbstractC23309i.m121366R0() % 8 != 0) && !C18644n.m98531l().f93827g.get() && !C18644n.m98531l().m98557t())) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m114513C(String str) {
        if (TextUtils.isEmpty(str) || C21927m.m114302u().m114367y() == null) {
            return false;
        }
        for (int i11 = 0; i11 < C21927m.m114302u().m114367y().size(); i11++) {
            C32035n7 c32035n7 = (C32035n7) C21927m.m114302u().m114367y().get(i11);
            if (c32035n7 != null && str.equals(c32035n7.m154511b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m114514D() {
        return f108005b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[RETURN, SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m114515E(String str) {
        if (AbstractC25495a.m132079d(str) || AbstractC25495a.m132086k(str) || AbstractC25495a.m132078c(str) || C21927m.m114302u().m114318P(str)) {
            return false;
        }
        if (!C18644n.m98531l().m98559v()) {
            if (C18644n.m98531l().m98558u(str)) {
                return false;
            }
        } else if (!C18644n.m98531l().m98559v() && !C18644n.m98531l().m98557t() && !C18644n.m98531l().f93827g.get() && C18644n.m98531l().m98551n().get()) {
            if (C18644n.m98531l().m98558u(str) || m114516F(str) || AbstractC23304d.f113417o.containsKey(str)) {
                return false;
            }
            return true;
        }
        if (C21928n.m114372h().m114382l(str) || m114516F(str) || AbstractC23304d.f113417o.containsKey(str)) {
            return false;
        }
    }

    /* renamed from: F */
    private static boolean m114516F(String str) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c != null && m141809c.m40387S0()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private static boolean m114517G(String str) {
        ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
        if (m141811g != null && m141811g.m40387S0()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m114518H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (AbstractC25495a.m132086k(str)) {
            return true;
        }
        if (C18644n.m98531l().m98558u(str)) {
            return false;
        }
        if (!AbstractC23304d.f113417o.containsKey(str) && !C21927m.m114302u().m114318P(str) && !m114516F(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m114519I(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (AbstractC25495a.m132086k(str)) {
            return true;
        }
        if (C18644n.m98531l().m98558u(str)) {
            return false;
        }
        if (!AbstractC23304d.f113417o.containsKey(str) && !C21927m.m114302u().m114318P(str) && !m114517G(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static /* synthetic */ void m114520J(InterfaceC23448a interfaceC23448a, String str) {
        if (interfaceC23448a != null) {
            interfaceC23448a.mo87300a(m114555v(str, true));
        }
    }

    /* renamed from: K */
    public static void m114521K(JSONArray jSONArray) {
        f108008e = new boolean[7];
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                int optInt = jSONArray.optInt(i11, 0);
                if (optInt > 0 && optInt < 7) {
                    f108008e[optInt] = true;
                }
            }
        }
    }

    /* renamed from: L */
    public static void m114522L(ContactProfile contactProfile, int i11, C26365a c26365a, BaseZaloView baseZaloView, Callable callable) {
        if (baseZaloView != null && !contactProfile.f42434r.isEmpty()) {
            if (AbstractC23063f2.m118361m(contactProfile.f42434r)) {
                if (C26446c.m136326b().m136329d()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("data", contactProfile.m40373K());
                    bundle.putString("message", contactProfile.m40378N());
                    baseZaloView.m92676n2().mo35581q(AcceptFriendView.class, bundle, 10099, 1, true);
                    return;
                }
                C0766k c0766k = new C0766k();
                baseZaloView.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                c0766k.mo1704o8(new f(baseZaloView, contactProfile, callable));
                c0766k.mo1497O3(contactProfile.f42434r);
                return;
            }
            new C19171b().m101508a(new C19171b.a(baseZaloView.m92676n2(), c26365a, i11, 1));
        }
    }

    /* renamed from: M */
    public static void m114523M(C17487o0 c17487o0, ContactProfile contactProfile) {
        if (C26446c.m136326b().m136328c() == 2 && c17487o0 != null && contactProfile != null) {
            Bundle bundle = new Bundle();
            bundle.putString("data", contactProfile.m40373K());
            bundle.putString("message", contactProfile.m40378N());
            bundle.putInt("accept_mode", 2);
            c17487o0.m93066i2(AcceptFriendView.class, bundle, IMediaPlayer.MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE, 1, true);
        }
    }

    /* renamed from: N */
    public static void m114524N() {
        try {
            String m3476U4 = AbstractC0924m0.m3476U4();
            if (TextUtils.isEmpty(m3476U4)) {
                m3476U4 = AbstractC23309i.m122388sb();
            }
            if (!TextUtils.isEmpty(m3476U4)) {
                m114525O(new JSONObject(m3476U4));
            }
            f108005b = true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f108004a, e11);
        }
    }

    /* renamed from: O */
    public static void m114525O(JSONObject jSONObject) {
        try {
            synchronized (AbstractC21935u.class) {
                if (jSONObject != null) {
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("displayName");
                        if (optJSONObject != null) {
                            String[] stringArray = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_language_as_code);
                            f108006c.clear();
                            if (stringArray != null && stringArray.length > 0) {
                                for (String str : stringArray) {
                                    String optString = optJSONObject.optString(str);
                                    if (!TextUtils.isEmpty(optString)) {
                                        f108006c.put(str, optString);
                                    }
                                }
                            }
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("legacyName");
                            f108007d.clear();
                            if (optJSONObject2 != null && stringArray != null && stringArray.length > 0) {
                                for (String str2 : stringArray) {
                                    String optString2 = optJSONObject2.optString(str2);
                                    if (!TextUtils.isEmpty(optString2)) {
                                        f108007d.put(str2, optString2);
                                    }
                                }
                            }
                            if (jSONObject.has("saved_messages")) {
                                C21373a.f104231a.m110783C(jSONObject.getJSONObject("saved_messages"));
                            } else {
                                C21373a.f104231a.m110795g();
                            }
                        }
                    } finally {
                    }
                }
                f108005b = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f108004a, e11);
        }
    }

    /* renamed from: P */
    public static void m114526P(String str) {
        try {
            String[] split = TextUtils.split(AbstractC23309i.m121935g9(), ",");
            String str2 = "";
            for (int i11 = 0; i11 < split.length; i11++) {
                if (!split[i11].equals(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        str2 = str2 + ",";
                    }
                    str2 = str2 + split[i11];
                }
            }
            AbstractC23309i.m121284Ot(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public static void m114527Q(String str) {
        try {
            if (m114511A(str)) {
                return;
            }
            String m121935g9 = AbstractC23309i.m121935g9();
            if (!TextUtils.isEmpty(m121935g9)) {
                str = m121935g9 + "," + str;
            }
            AbstractC23309i.m121284Ot(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static void m114528R(String str) {
        try {
            if (m114511A(str)) {
                return;
            }
            String m122153m0 = AbstractC23309i.m122153m0();
            if (!TextUtils.isEmpty(m122153m0)) {
                str = m122153m0 + "," + str;
            }
            AbstractC23309i.m122506vi(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public static void m114529S(String str, String str2) {
        if (str2.equals(AbstractC23056e6.f112062a)) {
            return;
        }
        try {
            AbstractC0906d0.m2805k(MainApplication.getAppContext(), str2, Long.parseLong(str));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f108004a, e11);
        }
    }

    /* renamed from: T */
    public static void m114530T(String str) {
        try {
            C21927m.m114302u().m114342k0(str);
            C19669z.m103146Y().m103195J(str);
            C0824j.m2153b(new d(str));
            C31965ic c31965ic = (C31965ic) AbstractC23304d.f113405l.get(CoreUtility.f89233i);
            if (c31965ic != null) {
                int m153681a = c31965ic.m153681a();
                if (m153681a > 0) {
                    m153681a--;
                }
                c31965ic.m153684d(m153681a);
            }
            if (!AbstractC23244v8.m119753q(str)) {
                AbstractC23181q.m119431d(str, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public static void m114531U(boolean z11, ContactProfile contactProfile) {
        m114532V(z11, contactProfile.f42434r, contactProfile);
    }

    /* renamed from: V */
    public static void m114532V(boolean z11, String str, ContactProfile contactProfile) {
        if (z11) {
            boolean m114558y = m114558y(str);
            ContactProfile m98552o = C18644n.m98531l().m98552o(str);
            if (m98552o == null) {
                m98552o = C28203u6.f131407a.m141809c(str);
            }
            if (m98552o != null) {
                contactProfile = m98552o;
            }
            if (contactProfile == null) {
                return;
            }
            C28203u6.f131407a.m141824w(contactProfile);
            C21927m.m114302u().m114350o0(str);
            if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                C21927m.m114302u().m114338i0(arrayList);
            }
            C0824j.m2153b(new a(contactProfile, m114558y, str));
            C19669z.m103146Y().m103198O0();
            C18644n.m98524E();
            return;
        }
        if (C21927m.m114302u().m114312J() != null && C21927m.m114302u().m114312J().m153137g(str)) {
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            boolean m114552s = m114552s(false, str);
            if (m153138j == null) {
                m153138j = C28203u6.f131407a.m141809c(str);
            }
            if (m153138j != null) {
                contactProfile = m153138j;
            }
            if (contactProfile == null) {
                return;
            }
            if (!m114552s) {
                C28203u6.f131407a.m141804B(str, 0);
            }
            C0824j.m2153b(new b(str, m114552s, contactProfile));
            C21927m.m114302u().m114354q0(str);
            C19669z.m103146Y().m103198O0();
            C18644n.m98524E();
        }
    }

    /* renamed from: W */
    public static void m114533W(String str, int i11, String str2) {
        JSONArray optJSONArray;
        int optInt;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(str2)) {
            synchronized (C21927m.f107775T) {
                try {
                    if (C21927m.f107775T.containsKey(String.valueOf(str2)) && C21927m.f107775T.get(str2) != null && ((C32072q1) C21927m.f107775T.get(str2)).f147678j != null) {
                        for (int size = ((C32072q1) C21927m.f107775T.get(str2)).f147678j.size() - 1; size >= 0; size--) {
                            if (((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147410a == 0) {
                                if (((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147412c != null && ((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147412c.f146385a.equals(str)) {
                                    if (i11 == 5) {
                                        ((C32072q1) C21927m.f107775T.get(str2)).f147678j.remove(size);
                                    } else {
                                        ((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147412c.f146400p = i11;
                                    }
                                }
                            } else if (((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147410a == 3 && ((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147413d != null && ((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147413d.m153781r() != null) {
                                if (("group_" + ((C32020m7) ((C32072q1) C21927m.f107775T.get(str2)).f147678j.get(size)).f147413d.m153781r()).equals(str) && i11 == 5) {
                                    ((C32072q1) C21927m.f107775T.get(str2)).f147678j.remove(size);
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            C0824j.m2153b(new e(i11, str, str2));
        }
        String m122233o4 = AbstractC23309i.m122233o4();
        if (!TextUtils.isEmpty(m122233o4)) {
            try {
                JSONObject jSONObject = new JSONObject(m122233o4);
                if (jSONObject.optJSONArray("discover") != null && (optJSONArray = jSONObject.optJSONArray("discover")) != null) {
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        try {
                            JSONObject jSONObject2 = jSONObject.optJSONArray("discover").getJSONObject(i12);
                            if (jSONObject2 != null && (optInt = jSONObject2.optInt("discoverId", -1)) >= 0) {
                                String valueOf = String.valueOf(optInt);
                                synchronized (C21927m.f107775T) {
                                    try {
                                        if (C21927m.f107775T.containsKey(valueOf) && C21927m.f107775T.get(valueOf) != null && ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j != null) {
                                            for (int size2 = ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.size() - 1; size2 >= 0; size2--) {
                                                if (((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147410a == 0) {
                                                    if (((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147412c != null && ((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147412c.f146385a.equals(str)) {
                                                        if (i11 == 5) {
                                                            ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.remove(size2);
                                                        } else {
                                                            ((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147412c.f146400p = i11;
                                                        }
                                                    }
                                                } else if (((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147410a == 3 && ((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147413d != null && ((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147413d.m153781r() != null) {
                                                    if (("group_" + ((C32020m7) ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.get(size2)).f147413d.m153781r()).equals(str) && i11 == 5) {
                                                        ((C32072q1) C21927m.f107775T.get(valueOf)).f147678j.remove(size2);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
        }
        C0824j.m2153b(new e(i11, str, str2));
        e11.printStackTrace();
        C0824j.m2153b(new e(i11, str, str2));
    }

    /* renamed from: b */
    public static void m114535b(String str) {
        ContactProfile contactProfile;
        try {
            boolean m114558y = m114558y(str);
            if (!TextUtils.isEmpty(str)) {
                contactProfile = C18644n.m98531l().m98552o(str);
                if (contactProfile == null) {
                    contactProfile = C28203u6.f131407a.m141809c(str);
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                contactProfile.f42403c1 = false;
                C28203u6.f131407a.m141824w(contactProfile);
                C21927m.m114302u().m114350o0(str);
                if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    C21927m.m114302u().m114338i0(arrayList);
                }
                C0824j.m2153b(new c(contactProfile, str));
                C19669z.m103146Y().m103198O0();
                if (m114558y) {
                    C18644n.m98524E();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m114536c(String str) {
        return m114552s(false, str);
    }

    /* renamed from: d */
    public static void m114537d(String str, InterfaceC23448a interfaceC23448a) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, CoreUtility.f89233i)) {
            if (m114554u(str)) {
                if (interfaceC23448a != null) {
                    interfaceC23448a.mo87300a(true);
                    return;
                }
                return;
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ks.t

                /* renamed from: q */
                public final /* synthetic */ String f108003q;

                public /* synthetic */ RunnableC21934t(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21935u.m114520J(InterfaceC23448a.this, r2);
                }
            });
            return;
        }
        if (interfaceC23448a != null) {
            interfaceC23448a.mo87300a(false);
        }
    }

    /* renamed from: e */
    public static int m114538e(String str) {
        if (AbstractC25495a.m132079d(str)) {
            return 3;
        }
        if (!AbstractC25495a.m132086k(str) && !C21927m.m114302u().m114318P(str)) {
            if (m114558y(str)) {
                return 2;
            }
            if (!m114516F(str) && !AbstractC23304d.f113417o.containsKey(str)) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: f */
    public static String m114539f(String str, String str2, String str3) {
        return m114540g(str, str2, str3, true);
    }

    /* renamed from: g */
    public static String m114540g(String str, String str2, String str3, boolean z11) {
        if (z11) {
            String m98454g = C18631a.m98446i().m98454g(str2);
            if (!TextUtils.isEmpty(m98454g)) {
                return m98454g;
            }
        }
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            return m114541h(str, str3, false);
        }
        return m114543j(str2, str3, z11);
    }

    /* renamed from: h */
    public static String m114541h(String str, String str2, boolean z11) {
        C22642b m114263b;
        if (str.endsWith("84900000001")) {
            String m114547n = m114547n();
            if (!TextUtils.isEmpty(m114547n)) {
                return m114547n;
            }
            return str2;
        }
        if (z11) {
            str = AbstractC23056e6.m118285k(str);
        }
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                if (!str.equals(contactProfile.f42455y)) {
                }
                return str2;
            }
            if (!str.equals(AbstractC23056e6.f112062a)) {
                C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), str);
                if (m2800f != null) {
                    return m2800f.m153295h();
                }
                C21919e c21919e = AbstractC23304d.f113453x;
                if (c21919e != null && c21919e.m114266e(str) && AbstractC23309i.m121715af() && AbstractC23309i.m122377s0() == 1 && (m114263b = AbstractC23304d.f113453x.m114263b(str)) != null && !TextUtils.isEmpty(m114263b.f111044c)) {
                    return m114263b.f111044c;
                }
                return str2;
            }
            return str2;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f108004a, e11);
            return str2;
        }
    }

    /* renamed from: i */
    public static String m114542i(String str, String str2) {
        return m114543j(str, str2, true);
    }

    /* renamed from: j */
    public static String m114543j(String str, String str2, boolean z11) {
        String str3;
        C22642b m114264c;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (AbstractC25495a.m132078c(str)) {
            String m114547n = m114547n();
            if (!TextUtils.isEmpty(m114547n)) {
                return m114547n;
            }
            return str2;
        }
        try {
            if (str.equals(CoreUtility.f89233i)) {
                return str2;
            }
            if (z11) {
                str3 = C18631a.m98446i().m98454g(str);
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str2 = str3;
                    AbstractC23350e.m122776f(f108004a, e);
                    return str2;
                }
            } else {
                str3 = str2;
            }
            C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), str);
            if (m2801g != null && str.equals(String.valueOf(m2801g.m153300r()))) {
                str3 = m2801g.m153295h();
            }
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
            C21919e c21919e = AbstractC23304d.f113453x;
            if (c21919e != null && c21919e.m114267f(str) && AbstractC23309i.m121715af() && AbstractC23309i.m122377s0() == 1 && (m114264c = AbstractC23304d.f113453x.m114264c(str)) != null) {
                TextUtils.isEmpty(m114264c.f111044c);
            }
            return str2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: k */
    public static void m114544k() {
        AbstractC23309i.m121757bj(0);
        AbstractC23309i.m121728as(0L);
    }

    /* renamed from: l */
    public static String m114545l() {
        return m114546m(AbstractC18458a.f93019a);
    }

    /* renamed from: m */
    public static String m114546m(String str) {
        String str2 = "";
        try {
            synchronized (AbstractC21935u.class) {
                try {
                    if (!f108005b) {
                        m114524N();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Map map = f108007d;
                        if (map.containsKey(str)) {
                            str2 = (String) map.get(str);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return str2;
    }

    /* renamed from: n */
    public static String m114547n() {
        return m114548o(AbstractC18458a.f93019a);
    }

    /* renamed from: o */
    public static String m114548o(String str) {
        String str2 = "";
        try {
            synchronized (AbstractC21935u.class) {
                try {
                    if (!f108005b) {
                        m114524N();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Map map = f108006c;
                        if (map.containsKey(str)) {
                            str2 = (String) map.get(str);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return str2;
    }

    /* renamed from: p */
    public static boolean m114549p() {
        boolean z11;
        synchronized (AbstractC21935u.class) {
            try {
                if (!f108005b) {
                    m114524N();
                }
                z11 = !f108007d.isEmpty();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: q */
    public static boolean m114550q(String str) {
        try {
            if (C21927m.m114302u().m114345m(str)) {
                if (!TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: r */
    public static boolean m114551r(String str) {
        if (C21927m.m114302u().m114312J() != null && !C21927m.m114302u().m114312J().isEmpty()) {
            return C21927m.m114302u().m114312J().m153137g(str);
        }
        return C7960e.m41971c6().m42595y9(str);
    }

    /* renamed from: s */
    public static boolean m114552s(boolean z11, String str) {
        if (z11) {
            return false;
        }
        try {
            if (!C18644n.m98531l().m98558u(str)) {
                return false;
            }
            if (!C21927m.m114302u().m114312J().m153137g(str)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m114553t(int i11) {
        if (i11 > 0 && i11 < 7) {
            if (f108008e == null) {
                JSONArray jSONArray = null;
                try {
                    String m3977l1 = AbstractC0924m0.m3977l1();
                    if (!TextUtils.isEmpty(m3977l1)) {
                        jSONArray = new JSONArray(m3977l1);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                m114521K(jSONArray);
            }
            return f108008e[i11];
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m114554u(String str) {
        return m114555v(str, false);
    }

    /* renamed from: v */
    public static boolean m114555v(String str, boolean z11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            boolean m98558u = C18644n.m98531l().m98558u(str);
            if (!m98558u && z11) {
                return C21928n.m114372h().m114382l(str);
            }
            return m98558u;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    public static boolean m114556w(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return C18644n.m98531l().m98558u(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static boolean m114557x(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                if (TextUtils.isEmpty(str2) || !C23302b.f113247a.m120523d(str2) || CoreUtility.f89233i.equals(str)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Empty uid");
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: y */
    public static boolean m114558y(String str) {
        if (!C18644n.m98531l().m98559v() && C18644n.m98531l().m98558u(str)) {
            return true;
        }
        if (!C18644n.m98531l().m98551n().get()) {
            return C21928n.m114372h().m114382l(str);
        }
        return C18644n.m98531l().m98558u(str);
    }

    /* renamed from: z */
    public static int m114559z(String str) {
        ContactProfile contactProfile;
        try {
            if (C21927m.m114302u().m114357s().m153137g(str)) {
                contactProfile = C21927m.m114302u().m114357s().m153138j(str);
            } else {
                contactProfile = null;
            }
            if (contactProfile == null) {
                contactProfile = C28203u6.f131407a.m141809c(str);
            }
            if (contactProfile != null) {
                return contactProfile.f42453x0;
            }
            if (C7960e.m41971c6().m42085C9(str)) {
                return C7960e.m41971c6().m42338a6(str);
            }
            return C7960e.m41971c6().m42328Z5(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return 1;
        }
    }
}
