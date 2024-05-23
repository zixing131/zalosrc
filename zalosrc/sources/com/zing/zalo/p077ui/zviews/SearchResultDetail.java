package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.AbstractC0857z0;
import ag0.C0809c1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.util.C1483e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import bg0.C2797c;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7207s6;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.SearchResultDetail;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import ga0.C19357r0;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23184q2;
import me0.AbstractC23210s6;
import me0.AbstractC23216t1;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3555w;
import p142ey.C18635e;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p716zh.C31849b1;
import p716zh.C31901e8;
import p716zh.C31934gb;
import p716zh.C31965ic;
import p716zh.C31973j5;
import p716zh.C32002l4;
import p716zh.C32020m7;
import p716zh.C32093r8;
import pm0.C24848g0;
import t00.C26446c;
import v50.C27870vb;
import vg.C28203u6;
import wd0.C28927g;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class SearchResultDetail extends SlidableZaloView implements C7207s6.d, InterfaceC0733x {

    /* renamed from: T1 */
    public static final String f77188T1 = "SearchResultDetail";

    /* renamed from: B1 */
    CheckBox f77190B1;

    /* renamed from: T0 */
    RecyclerView f77212T0;

    /* renamed from: U0 */
    LinearLayoutManager f77213U0;

    /* renamed from: V0 */
    MultiStateView f77214V0;

    /* renamed from: W0 */
    int f77215W0;

    /* renamed from: c1 */
    C7207s6 f77221c1;

    /* renamed from: e1 */
    C23528a f77223e1;

    /* renamed from: h1 */
    EditText f77226h1;

    /* renamed from: i1 */
    View f77227i1;

    /* renamed from: j1 */
    String f77228j1;

    /* renamed from: k1 */
    int f77229k1;

    /* renamed from: o1 */
    View f77233o1;

    /* renamed from: p1 */
    KeyEventCallbackC17462c f77234p1;

    /* renamed from: q1 */
    KeyEventCallbackC17462c f77235q1;

    /* renamed from: r1 */
    C15001v f77236r1;

    /* renamed from: s1 */
    C15003x f77237s1;

    /* renamed from: t1 */
    boolean f77238t1;

    /* renamed from: u1 */
    boolean f77239u1;

    /* renamed from: P0 */
    int f77204P0 = 1;

    /* renamed from: Q0 */
    boolean f77206Q0 = false;

    /* renamed from: R0 */
    boolean f77208R0 = false;

    /* renamed from: S0 */
    String f77210S0 = "";

    /* renamed from: X0 */
    ArrayList f77216X0 = new ArrayList();

    /* renamed from: Y0 */
    long f77217Y0 = 0;

    /* renamed from: Z0 */
    long f77218Z0 = 0;

    /* renamed from: a1 */
    String f77219a1 = "";

    /* renamed from: b1 */
    String f77220b1 = "";

    /* renamed from: d1 */
    ArrayList f77222d1 = new ArrayList();

    /* renamed from: f1 */
    RunnableC15002w f77224f1 = new RunnableC15002w();

    /* renamed from: g1 */
    Handler f77225g1 = new Handler();

    /* renamed from: l1 */
    String f77230l1 = "";

    /* renamed from: m1 */
    Map f77231m1 = new HashMap();

    /* renamed from: n1 */
    Map f77232n1 = new HashMap();

    /* renamed from: v1 */
    ContactProfile f77240v1 = new ContactProfile();

    /* renamed from: w1 */
    Map f77241w1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: x1 */
    boolean f77242x1 = true;

    /* renamed from: y1 */
    private C2797c f77243y1 = new C2797c(AbstractC0837p0.m2225f());

    /* renamed from: z1 */
    ActionBarMenuItem.C17435d f77244z1 = new C14994o();

    /* renamed from: A1 */
    boolean f77189A1 = true;

    /* renamed from: C1 */
    boolean f77191C1 = false;

    /* renamed from: D1 */
    boolean f77192D1 = false;

    /* renamed from: E1 */
    boolean f77193E1 = false;

    /* renamed from: F1 */
    boolean f77194F1 = false;

    /* renamed from: G1 */
    boolean f77195G1 = false;

    /* renamed from: H1 */
    boolean f77196H1 = false;

    /* renamed from: I1 */
    boolean f77197I1 = false;

    /* renamed from: J1 */
    boolean f77198J1 = false;

    /* renamed from: K1 */
    boolean f77199K1 = false;

    /* renamed from: L1 */
    boolean f77200L1 = false;

    /* renamed from: M1 */
    boolean f77201M1 = false;

    /* renamed from: N1 */
    InterfaceC0765j f77202N1 = new C0766k();

    /* renamed from: O1 */
    ContactProfile f77203O1 = null;

    /* renamed from: P1 */
    boolean f77205P1 = false;

    /* renamed from: Q1 */
    InterfaceC0765j f77207Q1 = new C0766k();

    /* renamed from: R1 */
    C0855y0 f77209R1 = new C0855y0();

    /* renamed from: S1 */
    private final List f77211S1 = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$a */
    /* loaded from: classes6.dex */
    public class C14980a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77245a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$a$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77247a;

            a(ContactProfile contactProfile) {
                this.f77247a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f77247a);
            }
        }

        C14980a(ContactProfile contactProfile) {
            this.f77245a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (SearchResultDetail.this.f72421L0.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77194F1 = false;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f77245a.f42434r);
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        if (m141809c == null) {
                            m141809c = this.f77245a;
                            m141809c.f42447v0 = m141809c.f42352K0;
                        } else {
                            m141809c.f42447v0 = m141809c.f42352K0;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f77245a.f42434r)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f77245a.f42434r)).m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(this.f77245a.f42434r)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f77245a.f42434r) != null) {
                                m141809c = C21927m.m114302u().m114357s().m153138j(this.f77245a.f42434r);
                                m141809c.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m141809c.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m141809c.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f77245a.f42434r, false);
                        if (!TextUtils.isEmpty(m141809c.f42434r)) {
                            AbstractC23181q.m119431d(m141809c.f42434r, true);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77194F1 = false;
                searchResultDetail.m83910rN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$b */
    /* loaded from: classes6.dex */
    public class C14981b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77249a;

        C14981b(ContactProfile contactProfile) {
            this.f77249a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83916d() {
            try {
                SearchResultDetail.this.f77221c1.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77195G1 = false;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    new JSONObject();
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89259g(i11);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                            SearchResultDetail searchResultDetail = SearchResultDetail.this;
                            searchResultDetail.f77195G1 = false;
                            searchResultDetail.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f77249a;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.df0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14981b.this.m83916d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                searchResultDetail2.f77195G1 = false;
                searchResultDetail2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                SearchResultDetail searchResultDetail3 = SearchResultDetail.this;
                searchResultDetail3.f77195G1 = false;
                searchResultDetail3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$c */
    /* loaded from: classes6.dex */
    public class C14982c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77251a;

        /* renamed from: b */
        final /* synthetic */ boolean f77252b;

        C14982c(ContactProfile contactProfile, boolean z11) {
            this.f77251a = contactProfile;
            this.f77252b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83918d(ContactProfile contactProfile) {
            try {
                synchronized (SearchResultDetail.this.f77211S1) {
                    int i11 = 0;
                    while (true) {
                        try {
                            if (i11 < SearchResultDetail.this.f77222d1.size()) {
                                if (((C32020m7) SearchResultDetail.this.f77222d1.get(i11)).f147411b != null && ((C32020m7) SearchResultDetail.this.f77222d1.get(i11)).f147411b.f42434r.equals(contactProfile.f42434r)) {
                                    SearchResultDetail.this.f77222d1.remove(i11);
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                SearchResultDetail.this.m83899fN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                        i11 = -1000;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                ToastUtils.m89259g(i11);
            } finally {
                SearchResultDetail.this.f72421L0.mo78960q3();
                SearchResultDetail.this.f77196H1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ContactProfile contactProfile = this.f77251a;
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && AbstractC25495a.m132086k(this.f77251a.f42434r)) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_error_cannot_delete_this_contact));
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            SearchResultDetail.this.f77196H1 = false;
                            AbstractC23088h5.m118426g();
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                            C18644n.m98524E();
                            SearchResultDetail.this.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    C7960e.m41971c6().m42136Gd(this.f77251a.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    c28203u6.m141827z(this.f77251a.f42434r, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f77251a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77251a.f42434r);
                    C18644n.m98531l().m98540I(this.f77251a.f42434r);
                    c28203u6.m141804B(this.f77251a.f42434r, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f77251a.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f77251a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f77251a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f77251a.f42434r) && AbstractC21935u.m114515E(this.f77251a.f42434r) && AbstractC23306f.m120562A().m2529X(this.f77251a.f42434r)) {
                        C7959d.m41638d1().m41774b3(this.f77251a.f42434r, 2);
                    }
                    Map map = AbstractC23304d.f113421p;
                    map.containsKey(this.f77251a.f42434r);
                    synchronized (map) {
                        try {
                            if (map.containsKey(this.f77251a.f42434r)) {
                                C7960e.m41971c6().m42376e4(this.f77251a.f42434r);
                            }
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f77251a.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f77251a.f42434r);
                    C21927m.m114302u().m114352p0(this.f77251a.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f77251a.f42434r);
                    AbstractC0852x.m2332I(this.f77251a.f42434r);
                    if (this.f77252b) {
                        AbstractC0852x.m2355l(SearchResultDetail.this.f72421L0.getContext(), this.f77251a.f42455y, new SensitiveData("phonebook_delete_in_phonebook_tab", "phonebook_delete"));
                    }
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        InterfaceC27218a m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                        final ContactProfile contactProfile2 = this.f77251a;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ef0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14982c.this.m83918d(contactProfile2);
                            }
                        });
                    }
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f77251a.f42434r);
                } catch (Exception e11) {
                    String str = SearchResultDetail.f77188T1;
                    e11.toString();
                }
                SearchResultDetail.this.f77196H1 = false;
                AbstractC23088h5.m118426g();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                C18644n.m98524E();
                SearchResultDetail.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SearchResultDetail.this.f77196H1 = false;
                AbstractC23088h5.m118426g();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                C18644n.m98524E();
                SearchResultDetail.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$d */
    /* loaded from: classes6.dex */
    public class C14983d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77254a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77256a;

            a(ContactProfile contactProfile) {
                this.f77256a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                if (this.f77256a != null) {
                    C7960e.m41971c6().m42131G7(this.f77256a, true);
                }
                C7960e.m41971c6().m42234Pb(C14983d.this.f77254a.f42434r);
            }
        }

        C14983d(ContactProfile contactProfile) {
            this.f77254a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83920d() {
            try {
                SearchResultDetail.this.f77221c1.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                        i11 = -1000;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                ToastUtils.m89259g(i11);
            } finally {
                SearchResultDetail.this.f72421L0.mo78960q3();
                SearchResultDetail.this.f77197I1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89259g(i11);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                            C19669z.m103146Y().m103198O0();
                            AbstractC23088h5.m118426g();
                            C18644n.m98524E();
                            SearchResultDetail.this.f72421L0.mo78960q3();
                            SearchResultDetail.this.f77197I1 = false;
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f77254a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77254a.f42434r);
                    if (m98552o == null) {
                        m98552o = C28203u6.f131407a.m141809c(this.f77254a.f42434r);
                    }
                    if (m98552o == null) {
                        m98552o = this.f77254a;
                    }
                    m98552o.f42403c1 = false;
                    C28203u6.f131407a.m141824w(m98552o);
                    C21927m.m114302u().m114350o0(this.f77254a.f42434r);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f77254a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f77254a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o));
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ff0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14983d.this.m83920d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                SearchResultDetail.this.f72421L0.mo78960q3();
                SearchResultDetail.this.f77197I1 = false;
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                SearchResultDetail.this.f72421L0.mo78960q3();
                SearchResultDetail.this.f77197I1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$e */
    /* loaded from: classes6.dex */
    public class C14984e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77258a;

        C14984e(String str) {
            this.f77258a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83922d(String str) {
            try {
                if (!AbstractC25495a.m132079d(str)) {
                    str = "group_" + str;
                }
                synchronized (SearchResultDetail.this.f77211S1) {
                    int i11 = 0;
                    while (true) {
                        try {
                            if (i11 < SearchResultDetail.this.f77222d1.size()) {
                                if (((C32020m7) SearchResultDetail.this.f77222d1.get(i11)).f147411b != null && ((C32020m7) SearchResultDetail.this.f77222d1.get(i11)).f147411b.f42434r.equals(str)) {
                                    SearchResultDetail.this.f77222d1.remove(i11);
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        } finally {
                        }
                    }
                }
                SearchResultDetail.this.m83899fN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SearchResultDetail searchResultDetail = SearchResultDetail.this;
            boolean z11 = false;
            searchResultDetail.f77198J1 = false;
            searchResultDetail.f72421L0.mo78960q3();
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f77258a);
            if (m4472f != null && m4472f.m153747Y()) {
                z11 = true;
            }
            ToastUtils.m89261i(c20096c, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r4v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    String str = "group_" + this.f77258a;
                    AbstractC23304d.f113421p.containsKey(str);
                    AbstractC23306f.m120584H0().m2629l(str);
                    AbstractC23184q2.m119446d(this.f77258a, str);
                    AbstractC23184q2.m119438C(this.f77258a);
                    C19669z.f97569Q.set(false);
                    C19669z.m103146Y().m103198O0();
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        InterfaceC27218a m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                        final String str2 = this.f77258a;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.gf0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14984e.this.m83922d(str2);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77198J1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$f */
    /* loaded from: classes6.dex */
    public class C14985f implements InterfaceC20094a {
        C14985f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m83925e() {
            try {
                if (!SearchResultDetail.this.f72421L0.m92677nJ() && !SearchResultDetail.this.f72421L0.m92681pJ()) {
                    SearchResultDetail searchResultDetail = SearchResultDetail.this;
                    if (searchResultDetail.f77221c1 != null) {
                        ArrayList arrayList = searchResultDetail.f77222d1;
                        if (arrayList != null) {
                            if (arrayList.size() == 0) {
                            }
                        }
                        EditText editText = SearchResultDetail.this.f77226h1;
                        if (editText == null || TextUtils.isEmpty(editText.getText().toString().trim())) {
                            SearchResultDetail.this.m83899fN();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            SearchResultDetail.this.m83905lN(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m83926f() {
            try {
                SearchResultDetail.this.m83905lN(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.if0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14985f.this.m83926f();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SearchResultDetail.f77188T1, e11.toString());
                }
            } finally {
                SearchResultDetail.this.f77199K1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            SearchResultDetail searchResultDetail;
            JSONObject jSONObject;
            try {
                try {
                    String str = SearchResultDetail.f77188T1;
                    obj.toString();
                    AbstractC23309i.m122481uu(obj.toString());
                    AbstractC23309i.m121022Hq(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2.optInt("error_code", -999) == 0) {
                            JSONArray optJSONArray = jSONObject2.optJSONObject("data").optJSONArray("data");
                            ArrayList arrayList = SearchResultDetail.this.f77216X0;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                    try {
                                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                                        if (jSONObject3 != null) {
                                            int optInt = jSONObject3.optInt("oaType");
                                            if (!SearchResultDetail.this.f77238t1 || optInt == 0 || optInt == 1) {
                                                String optString = jSONObject3.optString("oaid");
                                                if (!C21927m.m114302u().m114318P(optString)) {
                                                    String optString2 = jSONObject3.optString("avatar");
                                                    String optString3 = jSONObject3.optString("displayName");
                                                    int optInt2 = jSONObject3.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                                    String optString4 = jSONObject3.optString("desc");
                                                    String optString5 = jSONObject3.optString("alias");
                                                    ContactProfile contactProfile = new ContactProfile(optString);
                                                    contactProfile.f42437s = optString3;
                                                    contactProfile.f42446v = optString2;
                                                    contactProfile.f42352K0 = optInt2;
                                                    contactProfile.f42436r1 = new SpannableStringBuilder(optString4);
                                                    contactProfile.f42442t1 = optString5;
                                                    if (jSONObject3.has("track_ads") && (jSONObject = jSONObject3.getJSONObject("track_ads")) != null) {
                                                        int i12 = jSONObject.getInt("campid");
                                                        int i13 = jSONObject.getInt("srcidx");
                                                        String string = jSONObject.getString("distribute_id");
                                                        contactProfile.f42350J1 = i12;
                                                        contactProfile.f42376S0 = i13;
                                                        contactProfile.f42422m0 = string;
                                                    }
                                                    SearchResultDetail.this.f77216X0.add(new C32020m7(contactProfile));
                                                    if (C28203u6.f131407a.m141809c(optString) == null) {
                                                        C7960e.m41971c6().m42221O7(contactProfile, false);
                                                    }
                                                    if (SearchResultDetail.this.f77216X0.size() >= SearchResultDetail.this.f77215W0) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            AbstractC23309i.m122481uu("");
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    searchResultDetail = SearchResultDetail.this;
                    searchResultDetail.f77199K1 = false;
                } catch (Exception e13) {
                    AbstractC23350e.m122774d(SearchResultDetail.f77188T1, e13.toString());
                    SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                    searchResultDetail2.f77199K1 = false;
                    if (searchResultDetail2.f72421L0.m92676n2() != null) {
                        m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.hf0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14985f.this.m83925e();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (searchResultDetail.f72421L0.m92676n2() != null) {
                    m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.hf0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchResultDetail.C14985f.this.m83925e();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                SearchResultDetail searchResultDetail3 = SearchResultDetail.this;
                searchResultDetail3.f77199K1 = false;
                if (searchResultDetail3.f72421L0.m92676n2() != null) {
                    SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.hf0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchResultDetail.C14985f.this.m83925e();
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$g */
    /* loaded from: classes6.dex */
    public class C14986g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77261a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77262b;

        C14986g(String str, ContactProfile contactProfile) {
            this.f77261a = str;
            this.f77262b = contactProfile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77200L1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            boolean z11 = true;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null && !jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.isNull("isRequested")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("isRequested");
                        }
                        if (jSONObject2.isNull("isFriend")) {
                            i12 = 0;
                        } else {
                            i12 = jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.isNull("isRequesting")) {
                            i13 = 0;
                        } else {
                            i13 = jSONObject2.getInt("isRequesting");
                        }
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(this.f77261a)) {
                                        SearchResultDetail.this.m83904kN(this.f77262b);
                                        z11 = false;
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(this.f77261a);
                                        SearchResultDetail searchResultDetail = SearchResultDetail.this;
                                        String str = this.f77261a;
                                        searchResultDetail.f77219a1 = str;
                                        AbstractC21935u.m114533W(str, 3, "");
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(this.f77261a);
                                    SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                                    String str2 = this.f77261a;
                                    searchResultDetail2.f77219a1 = str2;
                                    AbstractC21935u.m114533W(str2, 3, "");
                                    if (!AbstractC21935u.m114558y(this.f77261a)) {
                                        SearchResultDetail.this.m83912tN(this.f77261a);
                                    }
                                }
                            } else {
                                SearchResultDetail searchResultDetail3 = SearchResultDetail.this;
                                String str3 = this.f77261a;
                                searchResultDetail3.f77220b1 = str3;
                                if (i13 != 0) {
                                    AbstractC2364o0.m12373p(searchResultDetail3, 15);
                                } else if (i11 != 0) {
                                    AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(str3));
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                    AbstractC23059e9.m118317F(this.f77261a);
                                    AbstractC21935u.m114533W(this.f77261a, 3, "");
                                    SearchResultDetail.this.f77219a1 = this.f77261a;
                                }
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(SearchResultDetail.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            SearchResultDetail.this.f77210S0 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(SearchResultDetail.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SearchResultDetail searchResultDetail4 = SearchResultDetail.this;
                searchResultDetail4.f77200L1 = false;
                searchResultDetail4.m83911sN(z11);
            } catch (Throwable th2) {
                SearchResultDetail searchResultDetail5 = SearchResultDetail.this;
                searchResultDetail5.f77200L1 = false;
                searchResultDetail5.m83911sN(true);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$h */
    /* loaded from: classes6.dex */
    public class C14987h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77264a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77265b;

        C14987h(String str, ContactProfile contactProfile) {
            this.f77264a = str;
            this.f77265b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83928d(ContactProfile contactProfile) {
            AbstractC21935u.m114523M(SearchResultDetail.this.f72421L0.m92662fJ(), contactProfile);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
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
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77201M1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            AbstractC21935u.m114533W(this.f77264a, 3, "");
                            SearchResultDetail searchResultDetail = SearchResultDetail.this;
                            searchResultDetail.f77219a1 = this.f77264a;
                            if (searchResultDetail.f72421L0.m92676n2() != null) {
                                InterfaceC27218a m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                                final ContactProfile contactProfile = this.f77265b;
                                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jf0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SearchResultDetail.C14987h.this.m83928d(contactProfile);
                                    }
                                });
                            }
                        } else if (!AbstractC23216t1.m119641f(SearchResultDetail.this.f72421L0, i11, true)) {
                            ToastUtils.m89259g(i11);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                searchResultDetail2.f77201M1 = false;
                searchResultDetail2.m83910rN();
            } catch (Throwable th2) {
                SearchResultDetail searchResultDetail3 = SearchResultDetail.this;
                searchResultDetail3.f77201M1 = false;
                searchResultDetail3.m83910rN();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$i */
    /* loaded from: classes6.dex */
    public class C14988i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77267a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77268b;

        C14988i(String str, ContactProfile contactProfile) {
            this.f77267a = str;
            this.f77268b = contactProfile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77205P1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(this.f77267a);
                            AbstractC21935u.m114533W(this.f77267a, 3, "");
                            SearchResultDetail.this.f77219a1 = this.f77267a;
                            AbstractC23063f2.m118349a(this.f77268b);
                        } else {
                            AbstractC23063f2.m118357i(i11, this.f77267a);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(SearchResultDetail.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            SearchResultDetail.this.f77210S0 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(SearchResultDetail.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77205P1 = false;
                searchResultDetail.m83910rN();
            } catch (Throwable th2) {
                SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                searchResultDetail2.f77205P1 = false;
                searchResultDetail2.m83910rN();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$j */
    /* loaded from: classes6.dex */
    public class C14989j implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$j$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77271a;

            a(ContactProfile contactProfile) {
                this.f77271a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f77271a.f42434r);
            }
        }

        C14989j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    contactProfile.m40423p1(true);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(SearchResultDetail.f77188T1, e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$k */
    /* loaded from: classes6.dex */
    class C14990k implements C31849b1.d {
        C14990k() {
        }

        @Override // p716zh.C31849b1.d
        /* renamed from: a */
        public void mo83929a(List list) {
            AbstractC23304d.f113437t = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31934gb c31934gb = (C31934gb) it.next();
                ContactProfile contactProfile = new ContactProfile(c31934gb.f146729a);
                contactProfile.f42446v = c31934gb.f146733e;
                contactProfile.f42437s = contactProfile.m40383Q(true, false);
                contactProfile.f42460z1 = c31934gb.f146734f;
                AbstractC23304d.f113437t.add(contactProfile);
            }
        }

        @Override // p716zh.C31849b1.d
        /* renamed from: b */
        public void mo83930b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$l */
    /* loaded from: classes6.dex */
    public class C14991l extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$l$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f77275a;

            /* renamed from: b */
            final /* synthetic */ int f77276b;

            /* renamed from: c */
            final /* synthetic */ List f77277c;

            a(int i11, int i12, List list) {
                this.f77275a = i11;
                this.f77276b = i12;
                this.f77277c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                SearchResultDetail.this.m83888CM(this.f77275a, this.f77276b, this.f77277c);
            }
        }

        C14991l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                SearchResultDetail.this.f77221c1.m36666X(false);
                SearchResultDetail.this.f77221c1.m10008p();
                if (SearchResultDetail.this.f77213U0.m9745c2() >= SearchResultDetail.this.f77221c1.mo10003k() - 1) {
                    SearchResultDetail searchResultDetail = SearchResultDetail.this;
                    if (searchResultDetail.f77206Q0 && !searchResultDetail.f77208R0) {
                        searchResultDetail.f77208R0 = true;
                        searchResultDetail.f77206Q0 = true;
                        searchResultDetail.f77204P0++;
                        searchResultDetail.f77225g1.removeCallbacks(searchResultDetail.f77224f1);
                        SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                        searchResultDetail2.f77225g1.postDelayed(searchResultDetail2.f77224f1, 0L);
                        return;
                    }
                    return;
                }
                return;
            }
            SearchResultDetail.this.f77221c1.m36666X(true);
            EditText editText = SearchResultDetail.this.f77226h1;
            if (editText != null) {
                editText.clearFocus();
                AbstractC2379w.m12430d(SearchResultDetail.this.f77226h1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            try {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                LinearLayoutManager linearLayoutManager = searchResultDetail.f77213U0;
                if (linearLayoutManager != null && searchResultDetail.f77221c1 != null) {
                    C0809c1.m2050b(new a(linearLayoutManager.m9740Y1(), SearchResultDetail.this.f77213U0.m9745c2(), SearchResultDetail.this.f77221c1.m36659O()));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$m */
    /* loaded from: classes6.dex */
    public class C14992m extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77279a;

        /* renamed from: b */
        final /* synthetic */ int f77280b;

        C14992m(ContactProfile contactProfile, int i11) {
            this.f77279a = contactProfile;
            this.f77280b = i11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            SearchResultDetail searchResultDetail = SearchResultDetail.this;
            if (searchResultDetail.f77209R1 == null) {
                searchResultDetail.f77209R1 = new C0855y0();
            }
            HashMap m2384b = SearchResultDetail.this.f77209R1.m2384b();
            if (m2384b.containsKey(this.f77279a.f42434r)) {
                C23669z c23669z = (C23669z) m2384b.get(this.f77279a.f42434r);
                if (c23669z instanceof C23651h) {
                    C23651h c23651h = (C23651h) c23669z;
                    if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l()) {
                        String valueOf = String.valueOf(this.f77280b);
                        if (c23651h.f114659f[2].equals(valueOf)) {
                            String str = c23651h.f114659f[0];
                            if (str == null || str.isEmpty()) {
                                str = "1";
                            }
                            c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                        } else {
                            c23669z.f114656c = System.currentTimeMillis();
                            c23651h.f114659f[0] = String.valueOf(1);
                            c23651h.f114659f[2] = valueOf;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                C23651h m123961i = C23651h.m123961i(9, String.valueOf(1), this.f77279a.f42434r, String.valueOf(this.f77280b));
                if (m123961i == null) {
                    return;
                }
                m123961i.f114654a = 3;
                m123961i.f114655b = 2;
                m123961i.f114657d = 9;
                m2384b.put(this.f77279a.f42434r, m123961i);
            }
            C23669z c23669z2 = (C23669z) m2384b.get(this.f77279a.f42434r);
            if (c23669z2 != null) {
                C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
            }
            SearchResultDetail.this.f77209R1.m2387e(m2384b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$n */
    /* loaded from: classes6.dex */
    public class C14993n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f77282a;

        /* renamed from: b */
        final /* synthetic */ int f77283b;

        /* renamed from: c */
        final /* synthetic */ int f77284c;

        C14993n(List list, int i11, int i12) {
            this.f77282a = list;
            this.f77283b = i11;
            this.f77284c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ContactProfile contactProfile;
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            SearchResultDetail searchResultDetail = SearchResultDetail.this;
            if (searchResultDetail.f77209R1 == null) {
                searchResultDetail.f77209R1 = new C0855y0();
            }
            HashMap m2385c = SearchResultDetail.this.f77209R1.m2385c();
            HashMap m2384b = SearchResultDetail.this.f77209R1.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f77282a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C32020m7 c32020m7 = (C32020m7) this.f77282a.get(i11);
                if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                    String str = c32020m7.f147411b.f42434r;
                    if (m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (c23651h2 = (C23651h) c23669z) != null && (strArr2 = c23651h2.f114659f) != null) {
                            if (!strArr2[2].equals(String.valueOf(i11))) {
                                c23651h2.f114659f[2] = String.valueOf(i11);
                            }
                            c23669z.f114660g = false;
                            hashMap.put(str, (C23669z) m2385c.get(str));
                        }
                    }
                    if (m2384b.containsKey(str)) {
                        C23669z c23669z2 = (C23669z) m2384b.get(str);
                        if ((c23669z2 instanceof C23651h) && (c23651h = (C23651h) c23669z2) != null && (strArr = c23651h.f114659f) != null) {
                            if (!strArr[2].equals(String.valueOf(i11))) {
                                c23651h.f114659f[2] = String.valueOf(i11);
                            }
                            hashMap2.put(str, (C23669z) m2384b.get(str));
                        }
                    }
                }
            }
            SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
            if (searchResultDetail2.f77209R1 == null) {
                searchResultDetail2.f77209R1 = new C0855y0();
            }
            SearchResultDetail.this.f77209R1.m2386d(hashMap);
            SearchResultDetail.this.f77209R1.m2387e(hashMap2);
            SearchResultDetail.this.m83888CM(this.f77283b, this.f77284c, this.f77282a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$o */
    /* loaded from: classes6.dex */
    class C14994o extends ActionBarMenuItem.C17435d {
        C14994o() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            if (!TextUtils.isEmpty(editText.getText())) {
                View view = SearchResultDetail.this.f77227i1;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                View view2 = SearchResultDetail.this.f77227i1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            SearchResultDetail.this.m83902iN(250);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$p */
    /* loaded from: classes6.dex */
    class C14995p extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32020m7 f77287a;

        C14995p(C32020m7 c32020m7) {
            this.f77287a = c32020m7;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42230P7(this.f77287a.f147411b.f42434r, System.currentTimeMillis());
            C7960e.m41971c6().m42211N7(this.f77287a.f147411b.f42434r, System.currentTimeMillis());
            if (!this.f77287a.f147411b.m40374K0() && C28203u6.f131407a.m141809c(this.f77287a.f147411b.f42434r) == null) {
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile = this.f77287a.f147411b;
                m41971c6.m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$q */
    /* loaded from: classes6.dex */
    public class C14996q extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f77289a;

        /* renamed from: b */
        final /* synthetic */ String f77290b;

        /* renamed from: c */
        final /* synthetic */ String f77291c;

        /* renamed from: d */
        final /* synthetic */ ContactProfile f77292d;

        C14996q(String str, String str2, String str3, ContactProfile contactProfile) {
            this.f77289a = str;
            this.f77290b = str2;
            this.f77291c = str3;
            this.f77292d = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42230P7(this.f77289a, System.currentTimeMillis());
            C7960e.m41971c6().m42211N7(this.f77289a, System.currentTimeMillis());
            C7960e.m41971c6().m42423i8(this.f77290b, this.f77289a, this.f77291c, this.f77292d.f42365O1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$r */
    /* loaded from: classes6.dex */
    public class C14997r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77294a;

        C14997r(String str) {
            this.f77294a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m83934f() {
            SearchResultDetail.this.m83899fN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m83935g() {
            SearchResultDetail.this.m83899fN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m83936h(String str) {
            try {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77208R0 = false;
                EditText editText = searchResultDetail.f77226h1;
                if (editText != null && !TextUtils.isEmpty(editText.getText().toString().trim()) && str.equals(SearchResultDetail.this.f77226h1.getText().toString().trim())) {
                    SearchResultDetail.this.m83899fN();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                SearchResultDetail.this.m83899fN();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                InterfaceC27218a m92676n2 = SearchResultDetail.this.f72421L0.m92676n2();
                final String str = this.f77294a;
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchResultDetail.C14997r.this.m83936h(str);
                    }
                });
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            JSONArray jSONArray;
            JSONArray jSONArray2;
            JSONObject jSONObject;
            String optString;
            boolean optBoolean;
            String optString2;
            String optString3;
            int optInt;
            String optString4;
            boolean optBoolean2;
            int optInt2;
            obj.toString();
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("searchResult");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("autoCompleteWords");
                    EditText editText = SearchResultDetail.this.f77226h1;
                    if (editText != null && !TextUtils.isEmpty(editText.getText().toString().trim()) && this.f77294a.equals(SearchResultDetail.this.f77226h1.getText().toString().trim())) {
                        SearchResultDetail searchResultDetail = SearchResultDetail.this;
                        if (optJSONArray != null && optJSONArray.length() >= 50) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        searchResultDetail.f77206Q0 = z11;
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            String[] m119967B = AbstractC23262x6.m119967B(this.f77294a);
                            ArrayList arrayList2 = new ArrayList();
                            int i11 = 0;
                            while (i11 < optJSONArray.length()) {
                                try {
                                    jSONObject = optJSONArray.getJSONObject(i11);
                                    optString = jSONObject.optString("uid");
                                    optBoolean = jSONObject.optBoolean("is_fan");
                                    optString2 = jSONObject.optString("avt");
                                    optString3 = jSONObject.optString("stt");
                                    optInt = jSONObject.optInt("ttf");
                                    optString4 = jSONObject.optString("dpn");
                                    optBoolean2 = jSONObject.optBoolean("chatable");
                                    optInt2 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                    jSONArray = optJSONArray;
                                    jSONArray2 = optJSONArray2;
                                } catch (Exception e11) {
                                    e = e11;
                                    jSONArray = optJSONArray;
                                    jSONArray2 = optJSONArray2;
                                }
                                try {
                                    int optInt3 = jSONObject.optInt("group_msg", 1);
                                    String optString5 = jSONObject.optString("desc");
                                    ContactProfile contactProfile = new ContactProfile(optString);
                                    contactProfile.f42441t0 = optBoolean;
                                    contactProfile.f42446v = optString2;
                                    contactProfile.f42458z = optString3;
                                    contactProfile.f42438s0 = optInt;
                                    contactProfile.f42437s = optString4;
                                    contactProfile.f42444u0 = optBoolean2;
                                    contactProfile.f42447v0 = optInt2;
                                    contactProfile.f42352K0 = optInt2;
                                    contactProfile.f42453x0 = optInt3;
                                    AbstractC23262x6.m119997j(this.f77294a, AbstractC23262x6.m119967B(optString4.trim()), contactProfile, arrayList2, false, new ArrayList());
                                    int size = arrayList2.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        contactProfile.f42399a1.add(Integer.valueOf(((Integer) arrayList2.get(i12)).intValue()));
                                    }
                                    arrayList2.clear();
                                    contactProfile.f42436r1 = AbstractC23217t2.m119654f(optString5, new ArrayList(Arrays.asList(m119967B)));
                                    if (!SearchResultDetail.this.f77231m1.containsKey(contactProfile.f42434r)) {
                                        arrayList.add(new C32020m7(contactProfile));
                                        Map map = SearchResultDetail.this.f77231m1;
                                        String str = contactProfile.f42434r;
                                        map.put(str, str);
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    e.printStackTrace();
                                    i11++;
                                    optJSONArray = jSONArray;
                                    optJSONArray2 = jSONArray2;
                                }
                                i11++;
                                optJSONArray = jSONArray;
                                optJSONArray2 = jSONArray2;
                            }
                        }
                        JSONArray jSONArray3 = optJSONArray2;
                        synchronized (SearchResultDetail.this.f77211S1) {
                            SearchResultDetail.this.f77222d1.addAll(arrayList);
                        }
                        if (jSONArray3 != null && jSONArray3.length() > 0) {
                            int length = jSONArray3.length() - 1;
                            boolean z12 = true;
                            while (length >= 0) {
                                JSONArray jSONArray4 = jSONArray3;
                                String optString6 = jSONArray4.getJSONObject(length).optString("word");
                                ContactProfile contactProfile2 = new ContactProfile("-11");
                                contactProfile2.f42437s = optString6;
                                if (z12) {
                                    contactProfile2.f42405d1 = true;
                                    z12 = false;
                                } else if (length == 0) {
                                    contactProfile2.f42407e1 = true;
                                }
                                if (!SearchResultDetail.this.f77232n1.containsKey(optString6)) {
                                    synchronized (SearchResultDetail.this.f77211S1) {
                                        SearchResultDetail.this.f77222d1.add(0, new C32020m7(contactProfile2));
                                    }
                                    SearchResultDetail.this.f77232n1.put(optString6, optString6);
                                }
                                length--;
                                jSONArray3 = jSONArray4;
                            }
                        }
                        if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                            SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lf0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SearchResultDetail.C14997r.this.m83934f();
                                }
                            });
                        }
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                    if (SearchResultDetail.this.f72421L0.m92676n2() != null) {
                        SearchResultDetail.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.mf0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchResultDetail.C14997r.this.m83935g();
                            }
                        });
                    }
                }
                SearchResultDetail.this.f77208R0 = false;
            } catch (Throwable th2) {
                SearchResultDetail.this.f77208R0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$s */
    /* loaded from: classes6.dex */
    public class C14998s implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77296a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$s$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(C14998s.this.f77296a);
            }
        }

        C14998s(String str) {
            this.f77296a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77191C1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        boolean z12 = true;
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (Integer.parseInt(this.f77296a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            if (!C21927m.m114302u().m114351p().contains(this.f77296a)) {
                                C21927m.m114302u().m114351p().add(this.f77296a);
                                AbstractC21935u.m114527Q(this.f77296a);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a());
                            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77296a);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, this.f77296a, m98552o.f42437s);
                                String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_add_favorite_friend), m114539f, m114539f);
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(this.f77296a, format);
                                }
                            }
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cant_add_favorite_friend));
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77191C1 = false;
                searchResultDetail.f72421L0.mo78960q3();
                C18644n.m98524E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$t */
    /* loaded from: classes6.dex */
    public class C14999t implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77299a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$t$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42415hc(C14999t.this.f77299a);
            }
        }

        C14999t(String str) {
            this.f77299a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77192D1 = z11;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                        boolean z11 = true;
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (Integer.parseInt(this.f77299a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            C21927m.m114302u().m114340j0(this.f77299a);
                            AbstractC21935u.m114526P(this.f77299a);
                            C0824j.m2153b(new a());
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                C18644n.m98524E();
                SearchResultDetail searchResultDetail = SearchResultDetail.this;
                searchResultDetail.f77192D1 = false;
                searchResultDetail.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$u */
    /* loaded from: classes6.dex */
    public class C15000u implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f77302a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$u$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f77304a;

            a(String str) {
                this.f77304a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(this.f77304a);
                C7960e.m41971c6().m42376e4(this.f77304a);
            }
        }

        C15000u(int i11) {
            this.f77302a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SearchResultDetail searchResultDetail;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    searchResultDetail = SearchResultDetail.this;
                    searchResultDetail.f77193E1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SearchResultDetail.this.f77193E1 = false;
                    searchResultDetail = SearchResultDetail.this;
                }
                searchResultDetail.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                searchResultDetail2.f77193E1 = false;
                searchResultDetail2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    String valueOf = String.valueOf(this.f77302a);
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int parseInt = Integer.parseInt(jSONObject.getString("error_code"));
                        if (parseInt == 0) {
                            C21927m.m114302u().m114342k0(valueOf);
                            AbstractC23306f.m120616S().m101508a(new C28927g.b(valueOf));
                            C0824j.m2153b(new a(valueOf));
                            Map map = AbstractC23304d.f113405l;
                            C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a();
                                if (m153681a > 0) {
                                    m153681a--;
                                }
                                ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(m153681a);
                            }
                            if (!TextUtils.isEmpty(valueOf)) {
                                AbstractC23181q.m119431d(valueOf, false);
                            }
                            C19669z.m103146Y().m103198O0();
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_tv_unfollow_success));
                        } else {
                            ToastUtils.m89264l(new C20096c(parseInt, AbstractC23161o1.m119318c(parseInt, "")));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SearchResultDetail.this.m83910rN();
                SearchResultDetail.this.f77193E1 = false;
            } catch (Throwable th2) {
                SearchResultDetail.this.m83910rN();
                SearchResultDetail.this.f77193E1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$v */
    /* loaded from: classes6.dex */
    public class C15001v extends AbstractC0857z0 {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static /* synthetic */ C24848g0 m83939w(List list, CountDownLatch countDownLatch, List list2) {
            list.addAll(list2);
            countDownLatch.countDown();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m83940x(final List list, final CountDownLatch countDownLatch) {
            int i11;
            if (SearchResultDetail.this.f77239u1) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            C19357r0.m101447f(i11, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.of0
                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m83939w;
                    m83939w = SearchResultDetail.C15001v.m83939w(list, countDownLatch, (List) obj);
                    return m83939w;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public Void mo2432g(Void... voidArr) {
            JSONObject jSONObject;
            try {
                SearchResultDetail.this.f77215W0 = AbstractC23309i.m122607y8();
                String m120968G9 = AbstractC23309i.m120968G9();
                if (!TextUtils.isEmpty(m120968G9)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(m120968G9);
                        if (jSONObject2.optInt("error_code", -999) == 0) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                            SearchResultDetail.this.f77217Y0 = optJSONObject.optLong("expired", 0L);
                            SearchResultDetail.this.f77218Z0 = AbstractC23309i.m122045j6();
                            JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                            ArrayList arrayList = SearchResultDetail.this.f77216X0;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                    try {
                                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                                        if (jSONObject3 != null) {
                                            int optInt = jSONObject3.optInt("oaType");
                                            if (!SearchResultDetail.this.f77238t1 || optInt == 0 || optInt == 1) {
                                                String optString = jSONObject3.optString("oaid");
                                                if (!C21927m.m114302u().m114322U(optString)) {
                                                    String optString2 = jSONObject3.optString("avatar");
                                                    String optString3 = jSONObject3.optString("displayName");
                                                    int optInt2 = jSONObject3.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                                    String optString4 = jSONObject3.optString("desc");
                                                    String optString5 = jSONObject3.optString("alias");
                                                    ContactProfile contactProfile = new ContactProfile(optString);
                                                    contactProfile.f42437s = optString3;
                                                    contactProfile.f42446v = optString2;
                                                    contactProfile.f42352K0 = optInt2;
                                                    contactProfile.f42436r1 = new SpannableStringBuilder(optString4);
                                                    contactProfile.f42442t1 = optString5;
                                                    if (jSONObject3.has("track_ads") && (jSONObject = jSONObject3.getJSONObject("track_ads")) != null) {
                                                        int i12 = jSONObject.getInt("campid");
                                                        int i13 = jSONObject.getInt("srcidx");
                                                        String string = jSONObject.getString("distribute_id");
                                                        contactProfile.f42350J1 = i12;
                                                        contactProfile.f42376S0 = i13;
                                                        contactProfile.f42422m0 = string;
                                                    }
                                                    SearchResultDetail.this.f77216X0.add(new C32020m7(contactProfile));
                                                    if (SearchResultDetail.this.f77216X0.size() >= SearchResultDetail.this.f77215W0) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            final List synchronizedList = Collections.synchronizedList(new ArrayList());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.nf0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchResultDetail.C15001v.this.m83940x(synchronizedList, countDownLatch);
                }
            });
            if (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                throw new InterruptedException("CountDownLatch timeout");
            }
            synchronized (SearchResultDetail.this.f77211S1) {
                SearchResultDetail.this.f77211S1.clear();
                SearchResultDetail.this.f77211S1.addAll(synchronizedList);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo2438n(Void r52) {
            try {
                if (!SearchResultDetail.this.f72421L0.m92677nJ() && !SearchResultDetail.this.f72421L0.m92681pJ()) {
                    EditText editText = SearchResultDetail.this.f77226h1;
                    if (editText != null && !TextUtils.isEmpty(editText.getText().toString().trim())) {
                        return;
                    }
                    SearchResultDetail searchResultDetail = SearchResultDetail.this;
                    if (searchResultDetail.f77221c1 != null && searchResultDetail.f77229k1 == 3 && searchResultDetail.f77216X0.size() > 0) {
                        SearchResultDetail.this.f77222d1 = new ArrayList(SearchResultDetail.this.f77216X0);
                        SearchResultDetail.this.m83899fN();
                    }
                    ArrayList arrayList = SearchResultDetail.this.f77222d1;
                    if (arrayList != null && arrayList.size() != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                        if (currentTimeMillis - searchResultDetail2.f77218Z0 <= searchResultDetail2.f77217Y0) {
                            return;
                        }
                    }
                    ArrayList arrayList2 = SearchResultDetail.this.f77222d1;
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        SearchResultDetail.this.m83905lN(true);
                    }
                    SearchResultDetail.this.m83893HM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C15001v() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$w */
    /* loaded from: classes6.dex */
    public class RunnableC15002w implements Runnable {

        /* renamed from: p */
        String f77307p;

        /* renamed from: q */
        byte f77308q;

        /* renamed from: a */
        public void m83943a(String str, byte b11) {
            this.f77307p = str;
            this.f77308q = b11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchResultDetail searchResultDetail = SearchResultDetail.this;
            if (searchResultDetail.f77228j1 != null) {
                searchResultDetail.m83903jN(this.f77307p, this.f77308q);
            }
        }

        private RunnableC15002w() {
            this.f77307p = "";
            this.f77308q = (byte) 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchResultDetail$x */
    /* loaded from: classes6.dex */
    public class C15003x extends AbstractC0857z0 {

        /* renamed from: f */
        String f77310f;

        /* renamed from: g */
        String f77311g;

        /* renamed from: h */
        int f77312h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static /* synthetic */ C24848g0 m83946w(List list, CountDownLatch countDownLatch, List list2) {
            list.addAll(list2);
            countDownLatch.countDown();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m83947x(final List list, final CountDownLatch countDownLatch) {
            int i11;
            if (SearchResultDetail.this.f77239u1) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            C19357r0.m101447f(i11, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.sf0
                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m83946w;
                    m83946w = SearchResultDetail.C15003x.m83946w(list, countDownLatch, (List) obj);
                    return m83946w;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public ArrayList mo2432g(String... strArr) {
            try {
                if (strArr.length > 1) {
                    this.f77310f = strArr[0];
                    this.f77312h = Integer.parseInt(strArr[1]);
                    this.f77311g = strArr[2];
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            final List synchronizedList = Collections.synchronizedList(new ArrayList());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.rf0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchResultDetail.C15003x.this.m83947x(synchronizedList, countDownLatch);
                }
            });
            ArrayList m83891FM = SearchResultDetail.this.m83891FM(this.f77310f);
            if (countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                synchronized (SearchResultDetail.this.f77211S1) {
                    SearchResultDetail.this.f77211S1.clear();
                    SearchResultDetail.this.f77211S1.addAll(synchronizedList);
                }
                return m83891FM;
            }
            throw new InterruptedException("CountDownLatch timeout");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo2438n(ArrayList arrayList) {
            try {
                if (!SearchResultDetail.this.f72421L0.m92677nJ() && !SearchResultDetail.this.f72421L0.m92681pJ() && arrayList != null) {
                    String str = SearchResultDetail.f77188T1;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("textToSearch: ");
                    sb2.append(this.f77310f);
                    sb2.append(" - currentText: ");
                    sb2.append(SearchResultDetail.this.f77226h1.getText().toString().trim());
                    if (SearchResultDetail.this.f77226h1.getText().toString().trim().equals(this.f77310f)) {
                        synchronized (SearchResultDetail.this.f77211S1) {
                            try {
                                SearchResultDetail.this.f77222d1 = arrayList;
                                if (arrayList.size() <= 0) {
                                    if (!TextUtils.isEmpty(this.f77310f)) {
                                        if (SearchResultDetail.this.f77229k1 != 3) {
                                        }
                                    }
                                }
                                SearchResultDetail.this.m83899fN();
                            } finally {
                            }
                        }
                        SearchResultDetail searchResultDetail = SearchResultDetail.this;
                        if (searchResultDetail.f77229k1 == 3) {
                            searchResultDetail.f77225g1.removeCallbacks(searchResultDetail.f77224f1);
                            if (!TextUtils.isEmpty(SearchResultDetail.this.f77230l1)) {
                                if (!TextUtils.isEmpty(this.f77311g) && this.f77311g.equals("1")) {
                                    SearchResultDetail searchResultDetail2 = SearchResultDetail.this;
                                    searchResultDetail2.f77224f1.m83943a(searchResultDetail2.f77226h1.getText().toString().trim(), (byte) 1);
                                } else {
                                    SearchResultDetail searchResultDetail3 = SearchResultDetail.this;
                                    searchResultDetail3.f77224f1.m83943a(searchResultDetail3.f77226h1.getText().toString().trim(), (byte) 2);
                                }
                                SearchResultDetail searchResultDetail4 = SearchResultDetail.this;
                                searchResultDetail4.f77208R0 = true;
                                searchResultDetail4.f77204P0 = 1;
                                searchResultDetail4.f77225g1.postDelayed(searchResultDetail4.f77224f1, this.f77312h);
                                return;
                            }
                            SearchResultDetail.this.m83905lN(false);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C15003x() {
            this.f77312h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static /* synthetic */ int m83848MM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m83849NM(RecyclerView recyclerView, int i11, View view) {
        m83895JM(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ boolean m83850OM(RecyclerView recyclerView, int i11, View view) {
        return m83896KM(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m83851PM(InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ContactProfile contactProfile = this.f77240v1;
        CheckBox checkBox = this.f77190B1;
        if (checkBox != null && checkBox.isChecked()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m83901hN(contactProfile, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m83852QM(View view) {
        CheckBox checkBox = this.f77190B1;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public /* synthetic */ void m83853RM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83886AM(this.f77240v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public /* synthetic */ void m83854SM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83913uN(this.f77203O1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public /* synthetic */ void m83855TM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ContactProfile contactProfile = this.f77203O1;
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            Bundle m140776b = new C27870vb(this.f77203O1.mo2478b()).m140780g(this.f77203O1).m140776b();
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public /* synthetic */ void m83856UM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.ignore_zalouser) {
            this.f72421L0.showDialog(9);
            AbstractC23647d.m123906p("30001273");
            AbstractC23647d.m123893c();
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_unblockuser) {
            this.f72421L0.showDialog(7);
            AbstractC23647d.m123906p("30001274");
            AbstractC23647d.m123893c();
            return;
        }
        if (intValue == AbstractC8020f0.delete_zalouser) {
            this.f72421L0.showDialog(8);
            return;
        }
        if (intValue == AbstractC8020f0.addfavorite_zalouser) {
            if (C21927m.m114302u().m114351p() != null && !C21927m.m114302u().m114351p().contains(this.f77240v1.f42434r)) {
                if (C21927m.m114302u().m114351p().size() < AbstractC23309i.m121115K8()) {
                    m83887BM(this.f77240v1.f42434r);
                    AbstractC23647d.m123906p("30001272");
                    AbstractC23647d.m123893c();
                    return;
                }
                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(AbstractC23309i.m121115K8())));
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.cm_removefavorite_zalouser) {
            if (C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(this.f77240v1.f42434r)) {
                m83900gN(this.f77240v1.f42434r);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.view_detail_zalouser) {
            try {
                ContactProfile contactProfile = this.f77240v1;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                    TrackingSource trackingSource = new TrackingSource(274);
                    trackingSource.m40677a("sourceView", 11);
                    C21927m.m114302u().m114330e0(this.f77240v1.f42434r, trackingSource);
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(this.f77240v1.f42434r, C32002l4.m154264g(25)).m135739F("3250").m135743b(), 0, 1));
                }
                this.f72421L0.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC23647d.m123906p("30001271");
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public /* synthetic */ void m83857VM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile;
        String str;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.context_menu_item_leave_group && (contactProfile = this.f77240v1) != null) {
            if (contactProfile.m40374K0()) {
                str = AbstractC25495a.m132088m(this.f77240v1.mo2478b());
            } else {
                str = "";
            }
            m83906mN(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public /* synthetic */ void m83858WM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.btn_vip_unfollow && (contactProfile = this.f77240v1) != null) {
            m83907nN(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ void m83859XM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.btn_vip_follow && (contactProfile = this.f77240v1) != null) {
            m83892GM(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public /* synthetic */ void m83860YM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83908pN(this.f77240v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m83861ZM(View view) {
        AbstractC2379w.m12432f(this.f77226h1);
        int i11 = this.f77229k1;
        if (i11 == 1) {
            AbstractC23647d.m123906p("3000142");
            AbstractC23647d.m123893c();
        } else if (i11 == 3) {
            AbstractC23647d.m123906p("3000152");
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m83862aN() {
        EditText editText = this.f77226h1;
        if (editText != null) {
            AbstractC2379w.m12432f(editText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m83863bN(String str, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m83890EM(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public /* synthetic */ void m83864cN(ContactProfile contactProfile, String str, InterfaceC17463d interfaceC17463d, int i11) {
        TrackingSource trackingSource;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (contactProfile.f42350J1 != -1) {
            trackingSource = new TrackingSource(281);
            trackingSource.m40677a("campaignId", Integer.valueOf(contactProfile.f42350J1));
            trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
            trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
        } else {
            trackingSource = null;
        }
        m83909qN(Integer.parseInt(str), trackingSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m83865dN(boolean z11) {
        if (z11) {
            try {
                this.f72421L0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C7207s6 c7207s6 = this.f77221c1;
        if (c7207s6 != null) {
            c7207s6.m10008p();
        }
    }

    /* renamed from: oN */
    private void m83875oN(C32020m7 c32020m7, int i11) {
        ContactProfile contactProfile;
        if (this.f77229k1 == 3 && c32020m7 != null && AbstractC23309i.m120962G3(3) == 1 && (contactProfile = c32020m7.f147411b) != null && !contactProfile.f42434r.startsWith("-")) {
            C0809c1.m2050b(new C14992m(contactProfile, i11));
            if (contactProfile.f42350J1 != -1) {
                C28905e.m144373n().m144399u(String.valueOf(contactProfile.f42350J1), 20, 96, contactProfile.f42376S0, System.currentTimeMillis(), contactProfile.f42422m0);
            }
        }
    }

    /* renamed from: AM */
    void m83886AM(ContactProfile contactProfile) {
        if (this.f77197I1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14983d(contactProfile));
        this.f77197I1 = true;
        c0766k.mo1479L9(contactProfile.f42434r, 15);
    }

    /* renamed from: BM */
    void m83887BM(String str) {
        if (this.f77191C1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14998s(str));
        this.f77191C1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1653h8(arrayList);
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: CI */
    public String mo36673CI() {
        return this.f77219a1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        int i11;
        boolean z11;
        boolean z12;
        super.mo37111CJ(bundle);
        boolean z13 = true;
        m92637BK(true);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("keyword_search")) {
                str = m92642L3.getString("keyword_search");
            } else {
                str = "";
            }
            this.f77228j1 = str;
            if (m92642L3.containsKey("title_search")) {
                i11 = m92642L3.getInt("title_search");
            } else {
                i11 = 1;
            }
            this.f77229k1 = i11;
            if (m92642L3.containsKey("only_media") && m92642L3.getBoolean("only_media")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f77238t1 = z11;
            if (m92642L3.containsKey("extra_from_contact") && m92642L3.getBoolean("extra_from_contact")) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f77239u1 = z12;
            if (this.f77238t1 || z12) {
                z13 = false;
            }
            this.f77242x1 = z13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0004, B:7:0x000a, B:15:0x001e, B:17:0x0022, B:20:0x0032, B:22:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x0056, B:31:0x0063, B:33:0x0070, B:35:0x007c, B:39:0x0140, B:40:0x0081, B:42:0x0085, B:44:0x008b, B:47:0x0090, B:49:0x009c, B:51:0x00a2, B:53:0x00aa, B:55:0x00b8, B:57:0x00f4, B:59:0x00fe, B:60:0x0109, B:62:0x010e, B:65:0x00cd, B:68:0x00e6, B:70:0x012d, B:72:0x0135, B:76:0x0146, B:78:0x014a, B:79:0x0151, B:82:0x002b, B:83:0x0017), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0004, B:7:0x000a, B:15:0x001e, B:17:0x0022, B:20:0x0032, B:22:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x0056, B:31:0x0063, B:33:0x0070, B:35:0x007c, B:39:0x0140, B:40:0x0081, B:42:0x0085, B:44:0x008b, B:47:0x0090, B:49:0x009c, B:51:0x00a2, B:53:0x00aa, B:55:0x00b8, B:57:0x00f4, B:59:0x00fe, B:60:0x0109, B:62:0x010e, B:65:0x00cd, B:68:0x00e6, B:70:0x012d, B:72:0x0135, B:76:0x0146, B:78:0x014a, B:79:0x0151, B:82:0x002b, B:83:0x0017), top: B:2:0x0004 }] */
    /* renamed from: CM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83888CM(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        C32020m7 c32020m7;
        ContactProfile contactProfile;
        C23669z c23669z;
        try {
            if (this.f77229k1 != 3 || AbstractC23309i.m120962G3(3) != 1) {
                return;
            }
            char c11 = 0;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size == 0) {
                return;
            }
            C0855y0 c0855y0 = this.f77209R1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            int i13 = 0;
            while (i13 < size) {
                if (list.get(i13) != null && (c32020m7 = (C32020m7) list.get(i13)) != null && (contactProfile = c32020m7.f147411b) != null && !contactProfile.f42434r.startsWith("-")) {
                    ContactProfile contactProfile2 = c32020m7.f147411b;
                    if (i13 >= i11 && i13 <= i12) {
                        String valueOf = String.valueOf(i13);
                        if (m2385c.containsKey(contactProfile2.f42434r)) {
                            C23669z c23669z2 = (C23669z) m2385c.get(contactProfile2.f42434r);
                            if (c23669z2 instanceof C23651h) {
                                C23651h c23651h = (C23651h) c23669z2;
                                if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l()) {
                                    if (!c23669z2.f114660g) {
                                        c23669z2.f114660g = true;
                                        if (c23651h.f114659f[2].equals(valueOf)) {
                                            String str = c23651h.f114659f[c11];
                                            if (str == null || str.isEmpty()) {
                                                str = "1";
                                            }
                                            c23651h.f114659f[c11] = String.valueOf(Integer.parseInt(str) + 1);
                                        } else {
                                            c23669z2.f114656c = System.currentTimeMillis();
                                            c23651h.f114659f[0] = String.valueOf(1);
                                            c23651h.f114659f[2] = valueOf;
                                        }
                                    }
                                }
                            }
                            c23669z = (C23669z) m2385c.get(contactProfile2.f42434r);
                            if (c23669z != null) {
                                C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z);
                            }
                            if (contactProfile2.f42350J1 != -1) {
                                C28905e.m144373n().m144399u(String.valueOf(contactProfile2.f42350J1), 10, 96, contactProfile2.f42376S0, System.currentTimeMillis(), contactProfile2.f42422m0);
                            }
                        } else {
                            C23651h m123961i = C23651h.m123961i(9, String.valueOf(1), contactProfile2.f42434r, valueOf);
                            if (m123961i != null) {
                                m123961i.f114654a = 3;
                                m123961i.f114655b = 1;
                                m123961i.f114657d = 9;
                                m123961i.f114660g = true;
                                m2385c.put(contactProfile2.f42434r, m123961i);
                                c23669z = (C23669z) m2385c.get(contactProfile2.f42434r);
                                if (c23669z != null) {
                                }
                                if (contactProfile2.f42350J1 != -1) {
                                }
                            }
                        }
                        i13++;
                        c11 = 0;
                    } else if (m2385c.containsKey(contactProfile2.f42434r)) {
                        ((C23669z) m2385c.get(contactProfile2.f42434r)).f114660g = false;
                        i13++;
                        c11 = 0;
                    }
                    i13++;
                    c11 = 0;
                }
                i13++;
                c11 = 0;
            }
            if (this.f77209R1 == null) {
                this.f77209R1 = new C0855y0();
            }
            this.f77209R1.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 7) {
                        if (i11 != 8) {
                            if (i11 != 9) {
                                if (i11 != 11) {
                                    if (i11 != 15) {
                                        if (i11 != 100) {
                                            return null;
                                        }
                                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                                        aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f77210S0).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pe0
                                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                            /* renamed from: K8 */
                                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                                SearchResultDetail.this.m83855TM(interfaceC17463d, i12);
                                            }
                                        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
                                        return aVar.m43152a();
                                    }
                                    C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                                    aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.oe0
                                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                        /* renamed from: K8 */
                                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                            SearchResultDetail.this.m83854SM(interfaceC17463d, i12);
                                        }
                                    });
                                    return aVar2.m43152a();
                                }
                                ArrayList arrayList = new ArrayList();
                                HashMap hashMap = new HashMap();
                                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_follow));
                                hashMap.put("id", Integer.valueOf(AbstractC8020f0.btn_vip_follow));
                                arrayList.add(hashMap);
                                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                                ContactProfile contactProfile = this.f77240v1;
                                if (contactProfile != null) {
                                    aVar3.m43172u(contactProfile.f42437s);
                                }
                                aVar3.m43173v(100);
                                aVar3.m43155d(true);
                                aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.af0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchResultDetail.this.m83859XM(simpleAdapter, interfaceC17463d, i12);
                                    }
                                });
                                return aVar3.m43152a();
                            }
                            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                            aVar4.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_ignore_zalo_user)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_popup), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ne0
                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                    SearchResultDetail.this.m83853RM(interfaceC17463d, i12);
                                }
                            });
                            return aVar4.m43152a();
                        }
                        C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar5.m43159h(7).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), this.f77240v1.m40420o0())).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cf0
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                SearchResultDetail.this.m83851PM(interfaceC17463d, i12);
                            }
                        });
                        this.f77190B1 = null;
                        if (AbstractC23309i.m121566Wf()) {
                            try {
                                if (!TextUtils.isEmpty(this.f77240v1.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                                    View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
                                    this.f77190B1 = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
                                    C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.getContext(), this.f77240v1.f42455y);
                                    if (m2800f != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                                        String format = String.format("%s (%s)", m2800f.m153299q(), m2800f.m153297j());
                                        String format2 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phone_number_in_contact), format);
                                        int indexOf = format2.indexOf(format);
                                        SpannableString spannableString = new SpannableString(format2);
                                        spannableString.setSpan(new StyleSpan(1), indexOf, format.length() + indexOf, 33);
                                        ((TextView) inflate.findViewById(AbstractC6918a0.tvRemoveContact)).setText(spannableString);
                                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.me0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                SearchResultDetail.this.m83852QM(view);
                                            }
                                        });
                                        aVar5.m43177z(inflate);
                                    }
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        return aVar5.m43152a();
                    }
                    C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar6.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unlock_friend)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bf0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            SearchResultDetail.this.m83860YM(interfaceC17463d, i12);
                        }
                    });
                    return aVar6.m43152a();
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_unfollow));
                hashMap2.put("id", Integer.valueOf(AbstractC8020f0.btn_vip_unfollow));
                arrayList2.add(hashMap2);
                final SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar7 = new C8009j.a(this.f72421L0.m92648SI());
                ContactProfile contactProfile2 = this.f77240v1;
                if (contactProfile2 != null) {
                    aVar7.m43172u(contactProfile2.f42437s);
                }
                aVar7.m43173v(100);
                aVar7.m43155d(true);
                aVar7.m43153b(simpleAdapter2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ze0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SearchResultDetail.this.m83858WM(simpleAdapter2, interfaceC17463d, i12);
                    }
                });
                return aVar7.m43152a();
            }
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.context_menu_item_leave_group));
            hashMap3.put("id", Integer.valueOf(AbstractC8020f0.context_menu_item_leave_group));
            arrayList3.add(hashMap3);
            final SimpleAdapter simpleAdapter3 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList3, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar8 = new C8009j.a(this.f72421L0.m92648SI());
            ContactProfile contactProfile3 = this.f77240v1;
            if (contactProfile3 != null) {
                aVar8.m43172u(contactProfile3.f42437s);
            }
            aVar8.m43173v(100);
            aVar8.m43155d(true);
            aVar8.m43153b(simpleAdapter3, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ye0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SearchResultDetail.this.m83857VM(simpleAdapter3, interfaceC17463d, i12);
                }
            });
            return aVar8.m43152a();
        }
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        hashMap4.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.view_detail_zalouser));
        hashMap4.put("id", Integer.valueOf(AbstractC8020f0.view_detail_zalouser));
        arrayList4.add(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.addfavorite_zalouser));
        hashMap5.put("id", Integer.valueOf(AbstractC8020f0.addfavorite_zalouser));
        arrayList4.add(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.cm_removefavorite_zalouser));
        hashMap6.put("id", Integer.valueOf(AbstractC8020f0.cm_removefavorite_zalouser));
        arrayList4.add(hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.ignore_zalouser));
        hashMap7.put("id", Integer.valueOf(AbstractC8020f0.ignore_zalouser));
        arrayList4.add(hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_unblockuser));
        hashMap8.put("id", Integer.valueOf(AbstractC8020f0.str_optionM_unblockuser));
        arrayList4.add(hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete_zalouser));
        hashMap9.put("id", Integer.valueOf(AbstractC8020f0.delete_zalouser));
        arrayList4.add(hashMap9);
        for (int size = arrayList4.size() - 1; size >= 0; size--) {
            HashMap hashMap10 = (HashMap) arrayList4.get(size);
            if (C21927m.m114302u().m114351p() != null) {
                if (!C21927m.m114302u().m114351p().contains(this.f77240v1.f42434r)) {
                    if (((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.cm_removefavorite_zalouser) {
                        arrayList4.remove(size);
                    }
                } else if (((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.addfavorite_zalouser) {
                    arrayList4.remove(size);
                }
            }
            if (C21927m.m114302u().m114312J() != null) {
                if (C21927m.m114302u().m114312J().m153137g(this.f77240v1.f42434r)) {
                    if (((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.ignore_zalouser || ((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.addfavorite_zalouser || ((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.cm_removefavorite_zalouser) {
                        arrayList4.remove(size);
                    }
                } else if (((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.str_optionM_unblockuser) {
                    arrayList4.remove(size);
                }
            }
            if (AbstractC25495a.m132086k(this.f77240v1.f42434r) && (((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.ignore_zalouser || ((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.str_optionM_unblockuser || ((Integer) hashMap10.get("id")).intValue() == AbstractC8020f0.delete_zalouser)) {
                arrayList4.remove(size);
            }
        }
        final SimpleAdapter simpleAdapter4 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList4, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar9 = new C8009j.a(this.f72421L0.m92648SI());
        ContactProfile contactProfile4 = this.f77240v1;
        if (contactProfile4 != null) {
            aVar9.m43172u(contactProfile4.m40383Q(true, false));
        }
        aVar9.m43173v(100);
        aVar9.m43155d(true);
        aVar9.m43153b(simpleAdapter4, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.xe0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SearchResultDetail.this.m83856UM(simpleAdapter4, interfaceC17463d, i12);
            }
        });
        return aVar9.m43152a();
    }

    /* renamed from: DM */
    void m83889DM(List list, int i11, int i12) {
        if (this.f77229k1 != 3 || AbstractC23309i.m120962G3(3) != 1) {
            return;
        }
        C0809c1.m2050b(new C14993n(new ArrayList(list), i11, i12));
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: Dr */
    public void mo36674Dr(C32020m7 c32020m7, int i11, int i12, boolean z11) {
        if (c32020m7 != null) {
            try {
                ContactProfile contactProfile = c32020m7.f147411b;
                if (contactProfile != null) {
                    if (i12 == 1) {
                        m83894IM(contactProfile, contactProfile.f42434r, z11);
                    } else if (i12 == 0) {
                        m83913uN(contactProfile);
                    } else if (i12 == 2) {
                        m83892GM(contactProfile);
                    } else if (i12 == 3) {
                        Intent intent = new Intent();
                        Bundle m140776b = new C27870vb(c32020m7.f147411b.mo2478b()).m140780g(c32020m7.f147411b).m140776b();
                        intent.putExtras(m140776b);
                        m83898eN(m140776b);
                        if (!C21927m.m114302u().m114345m(c32020m7.f147411b.f42434r)) {
                            C0824j.m2153b(new C14995p(c32020m7));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: EM */
    void m83890EM(String str, String str2) {
        try {
            if (this.f77198J1) {
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14984e(str));
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f77198J1 = true;
            c0766k.mo1526R8(str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f77188T1, e11);
            this.f72421L0.mo78960q3();
        }
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: F9 */
    public void mo36675F9(C32020m7 c32020m7, int i11, boolean z11, boolean z12, boolean z13) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        int i12;
        super.mo37482FJ(actionBarMenu);
        try {
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(0, 0);
            boolean z11 = this.f77242x1;
            if (z11) {
                i11 = AbstractC7356u0.icn_header_close;
            } else {
                i11 = AbstractC16803z.icn_header_close_white;
            }
            if (z11) {
                i12 = AbstractC16803z.search_grey;
            } else {
                i12 = AbstractC16803z.search_cursor_white;
            }
            m92738e.m92768B(true, true, i11, i12);
            m92738e.f88838J = false;
            EditText searchField = m92738e.getSearchField();
            this.f77226h1 = searchField;
            if (searchField != null) {
                if (this.f77242x1) {
                    searchField.setHintTextColor(AbstractC1388a.m6961c(searchField.getContext(), AbstractC16801x.cMtxt2));
                    EditText editText = this.f77226h1;
                    editText.setTextColor(AbstractC1388a.m6961c(editText.getContext(), AbstractC16801x.cMtxt1));
                } else {
                    searchField.setHintTextColor(AbstractC1388a.m6961c(searchField.getContext(), AbstractC16801x.white_70));
                    EditText editText2 = this.f77226h1;
                    editText2.setTextColor(AbstractC1388a.m6961c(editText2.getContext(), AbstractC16801x.white));
                }
                this.f77226h1.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f77229k1;
                if (i13 == 1) {
                    this.f77226h1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_contact));
                } else if (i13 == 2) {
                    this.f77226h1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_group));
                } else if (i13 == 3) {
                    this.f77226h1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_oa));
                } else if (i13 == 4) {
                    this.f77226h1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_message));
                } else {
                    this.f77226h1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
                }
                this.f77226h1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ve0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchResultDetail.this.m83861ZM(view);
                    }
                });
                if (!TextUtils.isEmpty(this.f77226h1.getText())) {
                    this.f88760a0.m92723u(this.f77226h1.getText().toString());
                } else {
                    this.f88760a0.m92723u(this.f77228j1);
                }
                m92738e.m92767A(this.f77244z1);
                if (this.f77226h1.getParent() != null) {
                    ((View) this.f77226h1.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                }
            }
            m83902iN(0);
            View clearButton = m92738e.getClearButton();
            this.f77227i1 = clearButton;
            if (clearButton != null) {
                if (TextUtils.isEmpty(this.f77226h1.getText())) {
                    this.f77227i1.setVisibility(8);
                } else {
                    this.f77227i1.setVisibility(0);
                }
            }
            if (this.f77238t1) {
                this.f77226h1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.we0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchResultDetail.this.m83862aN();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* renamed from: FM */
    public ArrayList m83891FM(String str) {
        long j11;
        String str2;
        Object obj;
        Exception exc;
        Throwable th2;
        StringBuilder sb2;
        ?? r32;
        boolean m118841o;
        String str3;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j12;
        Iterator it;
        String[] strArr;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z11;
        boolean z12;
        String str4;
        boolean z13;
        Object obj3 = "Time to filter: ";
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        try {
            m118841o = AbstractC23148n.m118841o();
        } catch (Exception e11) {
            j11 = currentTimeMillis;
            str2 = "Time to filter: ";
            obj = arrayList7;
            exc = e11;
        } catch (Throwable th3) {
            th = th3;
            j11 = currentTimeMillis;
            str2 = "Time to filter: ";
            th2 = th;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(System.currentTimeMillis() - j11);
            throw th2;
        }
        if (this.f77221c1 != null) {
            try {
            } catch (Exception e12) {
                e = e12;
                str3 = "Time to filter: ";
                j11 = currentTimeMillis;
                obj2 = arrayList7;
            } catch (Throwable th4) {
                th = th4;
                str3 = "Time to filter: ";
                j11 = currentTimeMillis;
            }
            if (!TextUtils.isEmpty(str)) {
                String m120002o = AbstractC23262x6.m120002o(str);
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList8 = new ArrayList();
                if (!this.f77241w1.containsKey(m120002o)) {
                    try {
                        try {
                            Iterator it2 = AbstractC23304d.f113429r.entrySet().iterator();
                            String[] m119967B = AbstractC23262x6.m119967B(m120002o);
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                String[] m119970E = AbstractC23262x6.m119970E((String) entry.getKey());
                                ArrayList arrayList9 = (ArrayList) entry.getValue();
                                float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                                if (m120001n > 0.0f) {
                                    it = it2;
                                    strArr = m119967B;
                                    int i11 = 0;
                                    while (i11 < arrayList9.size()) {
                                        C32093r8 c32093r8 = new C32093r8();
                                        arrayList = arrayList7;
                                        try {
                                            c32093r8.f147887d = ((C32093r8) arrayList9.get(i11)).f147887d;
                                            c32093r8.f147884a = ((C32093r8) arrayList9.get(i11)).f147884a;
                                            c32093r8.f147886c = ((C32093r8) arrayList9.get(i11)).f147886c;
                                            c32093r8.f147890g = m120001n;
                                            j11 = currentTimeMillis;
                                            try {
                                                c32093r8.f147885b = ((C32093r8) arrayList9.get(i11)).f147885b;
                                                c32093r8.f147893j = ((C32093r8) arrayList9.get(i11)).f147893j;
                                                arrayList8.add(c32093r8);
                                                i11++;
                                                arrayList7 = arrayList;
                                                currentTimeMillis = j11;
                                            } catch (Exception e13) {
                                                e = e13;
                                                exc = e;
                                                str2 = "Time to filter: ";
                                                obj = arrayList;
                                                try {
                                                    exc.printStackTrace();
                                                    sb2 = new StringBuilder();
                                                    r32 = obj;
                                                    sb2.append(str2);
                                                    sb2.append(System.currentTimeMillis() - j11);
                                                    return r32;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th2 = th;
                                                    StringBuilder sb32 = new StringBuilder();
                                                    sb32.append(str2);
                                                    sb32.append(System.currentTimeMillis() - j11);
                                                    throw th2;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th2 = th;
                                                str2 = "Time to filter: ";
                                                StringBuilder sb322 = new StringBuilder();
                                                sb322.append(str2);
                                                sb322.append(System.currentTimeMillis() - j11);
                                                throw th2;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            j11 = currentTimeMillis;
                                        }
                                    }
                                    j12 = currentTimeMillis;
                                    arrayList4 = arrayList7;
                                    this.f77241w1.put(m120002o, arrayList8);
                                } else {
                                    j12 = currentTimeMillis;
                                    it = it2;
                                    strArr = m119967B;
                                    arrayList4 = arrayList7;
                                }
                                it2 = it;
                                m119967B = strArr;
                                arrayList7 = arrayList4;
                                currentTimeMillis = j12;
                            }
                            j11 = currentTimeMillis;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList8;
                        } catch (Exception e15) {
                            e = e15;
                            j11 = currentTimeMillis;
                            arrayList = arrayList7;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j11 = currentTimeMillis;
                    }
                } else {
                    j11 = currentTimeMillis;
                    arrayList2 = arrayList7;
                    try {
                        arrayList3 = (ArrayList) this.f77241w1.get(m120002o);
                    } catch (Exception e16) {
                        e = e16;
                        str3 = "Time to filter: ";
                        obj2 = arrayList2;
                        exc = e;
                        str2 = str3;
                        obj = obj2;
                        exc.printStackTrace();
                        sb2 = new StringBuilder();
                        r32 = obj;
                        sb2.append(str2);
                        sb2.append(System.currentTimeMillis() - j11);
                        return r32;
                    } catch (Throwable th8) {
                        th = th8;
                        str3 = "Time to filter: ";
                        th2 = th;
                        str2 = str3;
                        StringBuilder sb3222 = new StringBuilder();
                        sb3222.append(str2);
                        sb3222.append(System.currentTimeMillis() - j11);
                        throw th2;
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("TimeCheckTopHit: ");
                sb4.append(System.currentTimeMillis() - currentTimeMillis2);
                int i12 = this.f77229k1;
                try {
                    if (i12 != 1) {
                        str3 = "Time to filter: ";
                        ArrayList arrayList10 = arrayList6;
                        arrayList5 = arrayList2;
                        try {
                            try {
                                if (i12 == 2) {
                                    ArrayList arrayList11 = new ArrayList();
                                    C18635e m98553p = C18644n.m98531l().m98553p();
                                    if (AbstractC23309i.m122127lb() == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    Map map = C19669z.f97573U;
                                    AbstractC23262x6.m119980O(m120002o, m98553p, arrayList11, z13, true, map, arrayList3, m118841o, false, null);
                                    AbstractC23262x6.m119982Q(m120002o, arrayList10, false, true, map, arrayList3, null);
                                    AbstractC23262x6.m119983R(arrayList10, arrayList11, false, true, map, arrayList3, null);
                                    int i13 = 0;
                                    while (i13 < arrayList10.size()) {
                                        ArrayList arrayList12 = arrayList10;
                                        this.f77231m1.put(((ContactProfile) arrayList12.get(i13)).f42434r, ((ContactProfile) arrayList12.get(i13)).f42434r);
                                        i13++;
                                        arrayList10 = arrayList12;
                                    }
                                    Iterator it3 = arrayList10.iterator();
                                    while (it3.hasNext()) {
                                        arrayList5.add(new C32020m7((ContactProfile) it3.next()));
                                    }
                                } else if (i12 == 3) {
                                    Map map2 = this.f77231m1;
                                    if (map2 != null) {
                                        map2.clear();
                                    }
                                    Map map3 = this.f77232n1;
                                    if (map3 != null) {
                                        map3.clear();
                                    }
                                    String[] m119967B2 = AbstractC23262x6.m119967B(m120002o);
                                    ArrayList arrayList13 = new ArrayList();
                                    ArrayList arrayList14 = new ArrayList(C21927m.m114302u().m114357s());
                                    Collections.sort(arrayList14, new Comparator() { // from class: com.zing.zalo.ui.zviews.te0
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj4, Object obj5) {
                                            int m83848MM;
                                            m83848MM = SearchResultDetail.m83848MM((ContactProfile) obj4, (ContactProfile) obj5);
                                            return m83848MM;
                                        }
                                    });
                                    AbstractC23262x6.m119980O(m120002o, arrayList14, arrayList13, false, true, C19669z.f97573U, arrayList3, m118841o, false, null);
                                    int size = arrayList13.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        try {
                                            ContactProfile contactProfile = (ContactProfile) arrayList13.get(i14);
                                            if (!AbstractC25495a.m132086k(contactProfile.f42434r)) {
                                                contactProfile.f42352K0 = C21927m.m114302u().m114357s().m153138j(contactProfile.f42434r).f42447v0;
                                                contactProfile.f42436r1 = AbstractC23217t2.m119654f(contactProfile.f42436r1.toString(), new ArrayList(Arrays.asList(m119967B2)));
                                                arrayList10.add(contactProfile);
                                            }
                                        } catch (Exception e17) {
                                            e17.printStackTrace();
                                        }
                                    }
                                    for (int i15 = 0; i15 < arrayList10.size(); i15++) {
                                        this.f77231m1.put(((ContactProfile) arrayList10.get(i15)).f42434r, ((ContactProfile) arrayList10.get(i15)).f42434r);
                                    }
                                    Iterator it4 = arrayList10.iterator();
                                    while (it4.hasNext()) {
                                        arrayList5.add(new C32020m7((ContactProfile) it4.next()));
                                    }
                                } else if (i12 == 4) {
                                    AbstractC23309i.m122127lb();
                                    HashMap hashMap = new HashMap();
                                    C1483e m119969D = AbstractC23262x6.m119969D(m120002o);
                                    C7961f m42643z = C7961f.m42643z();
                                    Object obj4 = m119969D.f6374a;
                                    if (obj4 != null) {
                                        str4 = (String) obj4;
                                    } else {
                                        str4 = "";
                                    }
                                    List m42651S = m42643z.m42651S(str4);
                                    if (m42651S != null && !m42651S.isEmpty()) {
                                        for (ContactProfile contactProfile2 : C19669z.m103146Y().m103199P()) {
                                            if (contactProfile2.f42375S == 1) {
                                                String str5 = contactProfile2.f42434r;
                                                hashMap.put(str5, str5);
                                            }
                                        }
                                    }
                                    for (int i16 = 0; i16 < m42651S.size(); i16++) {
                                        C3555w c3555w = (C3555w) m42651S.get(i16);
                                        if (c3555w != null && !TextUtils.isEmpty(c3555w.m18062d())) {
                                            if (AbstractC25495a.m132079d(c3555w.m18062d())) {
                                                C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132088m(c3555w.m18062d()));
                                                if (m4472f != null && !TextUtils.isEmpty(m4472f.m153781r())) {
                                                    if (!C21927m.m114302u().m114345m("group_" + m4472f.m153781r())) {
                                                        ContactProfile contactProfile3 = new ContactProfile("group_" + m4472f.m153781r());
                                                        contactProfile3.f42437s = m4472f.m153793y();
                                                        contactProfile3.f42446v = m4472f.m153756e();
                                                        contactProfile3.f42436r1.append((CharSequence) AbstractC23217t2.m119652d(c3555w.m18060b(), (ArrayList) m119969D.f6375b, AbstractC23210s6.f112469a));
                                                        arrayList10.add(contactProfile3);
                                                    }
                                                }
                                            } else {
                                                ContactProfile m141809c = C28203u6.f131407a.m141809c(c3555w.m18062d());
                                                if (m141809c != null && !TextUtils.isEmpty(m141809c.f42434r) && !C21927m.m114302u().m114345m(m141809c.f42434r)) {
                                                    ContactProfile contactProfile4 = new ContactProfile(m141809c);
                                                    contactProfile4.f42436r1.append((CharSequence) AbstractC23217t2.m119652d(c3555w.m18060b(), (ArrayList) m119969D.f6375b, AbstractC23210s6.f112469a));
                                                    arrayList10.add(contactProfile4);
                                                }
                                            }
                                        }
                                    }
                                    Iterator it5 = arrayList10.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(new C32020m7((ContactProfile) it5.next()));
                                    }
                                }
                            } catch (Exception e18) {
                                e = e18;
                                obj2 = arrayList5;
                                exc = e;
                                str2 = str3;
                                obj = obj2;
                                exc.printStackTrace();
                                sb2 = new StringBuilder();
                                r32 = obj;
                                sb2.append(str2);
                                sb2.append(System.currentTimeMillis() - j11);
                                return r32;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            th2 = th;
                            str2 = str3;
                            StringBuilder sb32222 = new StringBuilder();
                            sb32222.append(str2);
                            sb32222.append(System.currentTimeMillis() - j11);
                            throw th2;
                        }
                    } else {
                        try {
                            ArrayList arrayList15 = new ArrayList();
                            List m103199P = C19669z.m103146Y().m103199P();
                            Map map4 = C19669z.f97573U;
                            str3 = "Time to filter: ";
                            arrayList5 = arrayList2;
                            AbstractC23262x6.m119984S(m120002o, m103199P, arrayList6, map4, arrayList3, new HashMap(), 0, null, false);
                            C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                            if (AbstractC23309i.m122127lb() == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            AbstractC23262x6.m119980O(m120002o, mo98465a, arrayList6, z11, true, map4, arrayList3, m118841o, false, null);
                            if (AbstractC23309i.m122127lb() == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            AbstractC23262x6.m119980O(m120002o, arrayList15, arrayList6, z12, true, map4, arrayList3, m118841o, false, null);
                            HashMap hashMap2 = new HashMap();
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                String str6 = ((ContactProfile) it6.next()).f42434r;
                                hashMap2.put(str6, str6);
                            }
                            ArrayList arrayList16 = AbstractC23304d.f113437t;
                            if (arrayList16 != null && !arrayList16.isEmpty()) {
                                AbstractC23262x6.m119980O(m120002o, AbstractC23304d.f113437t, arrayList6, false, false, C19669z.f97573U, arrayList3, m118841o, true, null);
                            }
                            Iterator it7 = arrayList6.iterator();
                            while (it7.hasNext()) {
                                ContactProfile contactProfile5 = (ContactProfile) it7.next();
                                if (hashMap2.containsKey(contactProfile5.f42434r)) {
                                    arrayList5.add(new C32020m7(contactProfile5));
                                } else {
                                    C32020m7 c32020m7 = new C32020m7(13);
                                    c32020m7.f147411b = contactProfile5;
                                    arrayList5.add(c32020m7);
                                }
                            }
                        } catch (Exception e19) {
                            e = e19;
                            str3 = "Time to filter: ";
                            obj3 = arrayList2;
                            obj2 = obj3;
                            exc = e;
                            str2 = str3;
                            obj = obj2;
                            exc.printStackTrace();
                            sb2 = new StringBuilder();
                            r32 = obj;
                            sb2.append(str2);
                            sb2.append(System.currentTimeMillis() - j11);
                            return r32;
                        } catch (Throwable th10) {
                            th = th10;
                            str3 = "Time to filter: ";
                            th2 = th;
                            str2 = str3;
                            StringBuilder sb322222 = new StringBuilder();
                            sb322222.append(str2);
                            sb322222.append(System.currentTimeMillis() - j11);
                            throw th2;
                        }
                    }
                    sb2 = new StringBuilder();
                    str2 = str3;
                    r32 = arrayList5;
                } catch (Exception e21) {
                    e = e21;
                } catch (Throwable th11) {
                    th = th11;
                }
                sb2.append(str2);
                sb2.append(System.currentTimeMillis() - j11);
                return r32;
            }
        }
        str3 = "Time to filter: ";
        j11 = currentTimeMillis;
        arrayList5 = arrayList7;
        sb2 = new StringBuilder();
        str2 = str3;
        r32 = arrayList5;
        sb2.append(str2);
        sb2.append(System.currentTimeMillis() - j11);
        return r32;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_result_detail_view, viewGroup, false);
        this.f77233o1 = inflate;
        try {
            m83897LM(inflate);
            this.f77233o1.setOnClickListener(AbstractC23136l9.f112240a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f77233o1;
    }

    /* renamed from: GM */
    void m83892GM(ContactProfile contactProfile) {
        TrackingSource trackingSource;
        try {
            if (this.f77194F1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14980a(contactProfile));
            this.f77194F1 = true;
            int parseInt = Integer.parseInt(contactProfile.f42434r);
            if (this.f77238t1) {
                trackingSource = new TrackingSource(281);
            } else if (this.f77239u1) {
                trackingSource = new TrackingSource(285);
            } else {
                trackingSource = new TrackingSource(274);
            }
            int i11 = contactProfile.f42350J1;
            if (i11 != -1) {
                trackingSource.m40677a("campaignId", Integer.valueOf(i11));
                trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
                trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
            }
            c0766k.mo1578Y4(parseInt, trackingSource);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HM */
    void m83893HM() {
        if (this.f77199K1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14985f());
        this.f77199K1 = true;
        c0766k.mo1785y8();
    }

    /* renamed from: IM */
    public void m83894IM(ContactProfile contactProfile, String str, boolean z11) {
        try {
            if (this.f77200L1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f77200L1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14986g(str, contactProfile));
            this.f77203O1 = contactProfile;
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77200L1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: JM */
    void m83895JM(int i11) {
        C32020m7 c32020m7;
        ContactProfile contactProfile;
        String str;
        TrackingSource trackingSource;
        try {
            EditText editText = this.f77226h1;
            if (editText != null) {
                editText.clearFocus();
                AbstractC2379w.m12430d(this.f77226h1);
            }
            C7207s6 c7207s6 = this.f77221c1;
            if (c7207s6 != null && i11 >= 0 && i11 < c7207s6.mo10003k()) {
                c32020m7 = this.f77221c1.m36660P(i11);
            } else {
                c32020m7 = null;
            }
            if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                ContactProfile contactProfile2 = c32020m7.f147411b;
                if (contactProfile2.f42434r.equals("-11")) {
                    ActionBar actionBar = this.f88760a0;
                    if (actionBar != null) {
                        this.f77189A1 = false;
                        actionBar.m92723u(contactProfile2.f42437s);
                        return;
                    }
                    return;
                }
                if (!contactProfile2.f42434r.startsWith("-")) {
                    String m40383Q = contactProfile2.m40383Q(true, false);
                    String str2 = contactProfile2.f42434r;
                    EditText editText2 = this.f77226h1;
                    if (editText2 != null) {
                        str = editText2.getText().toString().trim();
                    } else {
                        str = "";
                    }
                    C0824j.m2153b(new C14996q(str2, str, m40383Q, contactProfile2));
                    int i12 = this.f77229k1;
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            AbstractC23647d.m123906p("3000151");
                            AbstractC23647d.m123893c();
                            if (this.f77239u1) {
                                EditText editText3 = this.f77226h1;
                                if (editText3 != null && !TextUtils.isEmpty(editText3.getText().toString().trim())) {
                                    AbstractC23647d.m123897g("5801103");
                                } else {
                                    AbstractC23647d.m123897g("5801106");
                                }
                            }
                            m83875oN(c32020m7, i11);
                            if (C21927m.m114302u().m114357s().m153137g(contactProfile2.f42434r)) {
                                Intent intent = new Intent();
                                Bundle m140776b = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                                intent.putExtras(m140776b);
                                m83898eN(m140776b);
                                return;
                            }
                            try {
                                if (this.f77238t1) {
                                    trackingSource = new TrackingSource(281);
                                } else if (this.f77239u1) {
                                    trackingSource = new TrackingSource(285);
                                } else {
                                    trackingSource = new TrackingSource(274);
                                }
                                trackingSource.m40677a("sourceView", 11);
                                int i13 = contactProfile2.f42350J1;
                                int i14 = -1;
                                if (i13 != -1) {
                                    trackingSource.m40677a("campaignId", Integer.valueOf(i13));
                                    trackingSource.m40677a("srcId", Integer.valueOf(contactProfile2.f42376S0));
                                    trackingSource.m40677a("tracking_src", contactProfile2.f42422m0);
                                }
                                C21927m.m114302u().m114330e0(contactProfile2.f42434r, trackingSource);
                                C32002l4 m154264g = C32002l4.m154264g(25);
                                if (this.f77229k1 != 3) {
                                    i14 = 33554432;
                                }
                                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile2.f42434r, m154264g).m135761t(true).m135738E(i14).m135743b(), 0, 1));
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        if (i12 == 4) {
                            if (contactProfile2.m40374K0()) {
                                String m132088m = AbstractC25495a.m132088m(contactProfile2.mo2478b());
                                C31973j5 m4472f = C0943w.m4462l().m4472f(m132088m);
                                if (m4472f != null) {
                                    contactProfile2.f42428p = 1;
                                    contactProfile2.f42437s = m4472f.m153793y();
                                    contactProfile2.f42446v = m4472f.m153756e();
                                    Bundle m140776b2 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                                    EditText editText4 = this.f77226h1;
                                    if (editText4 != null) {
                                        m140776b2.putString("search_message", editText4.getText().toString());
                                    }
                                    m140776b2.putString("groupId", m4472f.m153781r());
                                    m140776b2.putString("groupName", m4472f.m153793y());
                                    m83898eN(m140776b2);
                                    return;
                                }
                                contactProfile2.f42428p = 1;
                                Bundle m140776b3 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                                EditText editText5 = this.f77226h1;
                                if (editText5 != null) {
                                    m140776b3.putString("search_message", editText5.getText().toString());
                                }
                                m140776b3.putString("groupId", m132088m);
                                m140776b3.putString("groupName", contactProfile2.f42437s);
                                m83898eN(m140776b3);
                                return;
                            }
                            Bundle m140776b4 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                            EditText editText6 = this.f77226h1;
                            if (editText6 != null) {
                                m140776b4.putString("search_message", editText6.getText().toString());
                            }
                            m83898eN(m140776b4);
                            return;
                        }
                        return;
                    }
                    AbstractC23647d.m123906p("3000141");
                    AbstractC23647d.m123893c();
                    if (contactProfile2.m40374K0()) {
                        String m132088m2 = AbstractC25495a.m132088m(contactProfile2.mo2478b());
                        C31973j5 m4472f2 = C0943w.m4462l().m4472f(m132088m2);
                        if (m4472f2 != null) {
                            contactProfile2.f42428p = 1;
                            contactProfile2.f42437s = m4472f2.m153793y();
                            contactProfile2.f42446v = m4472f2.m153756e();
                            Bundle m140776b5 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                            m140776b5.putString("groupId", m4472f2.m153781r());
                            m140776b5.putString("groupName", m4472f2.m153793y());
                            m83898eN(m140776b5);
                            return;
                        }
                        contactProfile2.f42428p = 1;
                        Bundle m140776b6 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                        m140776b6.putString("groupId", m132088m2);
                        m140776b6.putString("groupName", contactProfile2.f42437s);
                        m83898eN(m140776b6);
                        return;
                    }
                    Intent intent2 = new Intent();
                    Bundle m140776b7 = new C27870vb(contactProfile2.mo2478b()).m140780g(contactProfile2).m140776b();
                    intent2.putExtras(m140776b7);
                    m83898eN(m140776b7);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: Jo */
    public void mo36676Jo(String str) {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                this.f77189A1 = true;
                actionBar.m92723u(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C15001v c15001v = this.f77236r1;
        if (c15001v != null) {
            c15001v.m2431f(true);
        }
        C0855y0 c0855y0 = this.f77209R1;
        if (c0855y0 != null) {
            c0855y0.m2383a();
        }
    }

    /* renamed from: KM */
    public boolean m83896KM(int i11) {
        ContactProfile contactProfile;
        C32020m7 c32020m7 = null;
        try {
            this.f77240v1 = null;
            C7207s6 c7207s6 = this.f77221c1;
            if (c7207s6 != null && i11 >= 0 && i11 < c7207s6.mo10003k()) {
                c32020m7 = this.f77221c1.m36660P(i11);
            }
            if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                ContactProfile contactProfile2 = c32020m7.f147411b;
                this.f77240v1 = contactProfile2;
                if (contactProfile2.f42434r.startsWith("-")) {
                    return false;
                }
                int i12 = this.f77229k1;
                if (i12 == 3) {
                    AbstractC23647d.m123906p("3000128");
                    AbstractC23647d.m123893c();
                    if (C21927m.m114302u().m114318P(this.f77240v1.f42434r)) {
                        this.f72421L0.showDialog(3);
                        AbstractC23647d.m123906p("30001282");
                        AbstractC23647d.m123893c();
                    } else {
                        this.f72421L0.showDialog(11);
                        AbstractC23647d.m123906p("30001281");
                        AbstractC23647d.m123893c();
                    }
                } else if (i12 == 1) {
                    AbstractC23647d.m123906p("3000127");
                    AbstractC23647d.m123893c();
                    if (this.f77240v1.m40374K0()) {
                        this.f72421L0.showDialog(2);
                    } else if (AbstractC21935u.m114558y(this.f77240v1.f42434r) || AbstractC21935u.m114552s(false, this.f77240v1.f42434r)) {
                        this.f72421L0.showDialog(1);
                    }
                } else if (i12 == 4) {
                    if (this.f77240v1.m40374K0()) {
                        this.f72421L0.showDialog(2);
                    } else if ((this.f77240v1.m40387S0() || AbstractC21935u.m114518H(this.f77240v1.mo2478b()) || this.f77240v1.f42348J != null) && !AbstractC25495a.m132086k(this.f77240v1.mo2478b())) {
                        if (C21927m.m114302u().m114318P(this.f77240v1.f42434r)) {
                            this.f72421L0.showDialog(3);
                        } else {
                            this.f72421L0.showDialog(11);
                        }
                    } else if (AbstractC21935u.m114558y(this.f77240v1.f42434r) || AbstractC21935u.m114552s(false, this.f77240v1.f42434r)) {
                        this.f72421L0.showDialog(1);
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: LM */
    void m83897LM(View view) {
        boolean z11;
        this.f77223e1 = new C23528a(this.f72421L0.m92648SI());
        this.f77212T0 = (RecyclerView) view.findViewById(AbstractC6918a0.lv_search);
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f77214V0 = multiStateView;
        multiStateView.setEnableBtnEmpty(false);
        this.f77214V0.setEnableLoadingText(false);
        this.f77213U0 = new LinearLayoutManager(this.f72421L0.m92648SI());
        C7207s6 c7207s6 = new C7207s6(this);
        this.f77221c1 = c7207s6;
        if (TextUtils.isEmpty(this.f77228j1) && (this.f77238t1 || this.f77229k1 == 3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        c7207s6.f39503H = z11;
        this.f77212T0.setLayoutManager(this.f77213U0);
        this.f77212T0.setAdapter(this.f77221c1);
        m83905lN(true);
        if (this.f77229k1 == 3) {
            C15001v c15001v = new C15001v();
            this.f77236r1 = c15001v;
            c15001v.m2434i(AbstractC0837p0.m2225f(), new Void[0]);
        }
        C31784b.m152808a(this.f77212T0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.le0
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view2) {
                SearchResultDetail.this.m83849NM(recyclerView, i11, view2);
            }
        });
        C31784b.m152808a(this.f77212T0).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.ue0
            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view2) {
                boolean m83850OM;
                m83850OM = SearchResultDetail.this.m83850OM(recyclerView, i11, view2);
                return m83850OM;
            }
        });
        this.f77212T0.m9826E(new C14991l());
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            this.f72421L0.finish();
        }
        this.f77813M0 = false;
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: PE */
    public void mo36677PE() {
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: Pl */
    public void mo36678Pl(C32020m7 c32020m7, int i11, View view) {
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
        if (this.f72421L0.m92650VI() == null) {
            super.mo62806Ps();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                EditText editText = this.f77226h1;
                if (editText != null) {
                    AbstractC2379w.m12430d(editText);
                }
                int i12 = this.f77229k1;
                if (i12 == 3) {
                    AbstractC23647d.m123906p("3000153");
                    AbstractC23647d.m123893c();
                } else if (i12 == 1) {
                    AbstractC23647d.m123906p("3000143");
                    AbstractC23647d.m123893c();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (this.f77242x1) {
                    AbstractC23136l9.m118690Z0(actionBar);
                } else {
                    AbstractC23136l9.m118688Y0(actionBar);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        if (this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().m92656bJ() != null) {
            return this.f72421L0.m92650VI().m92656bJ();
        }
        return super.mo62809Tf();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f77234p1;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f77234p1.dismiss();
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f77235q1;
        if (keyEventCallbackC17462c2 != null && keyEventCallbackC17462c2.m92868m()) {
            this.f77235q1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            try {
                if (AbstractC23304d.f113437t == null) {
                    C31849b1.m153097n().m153111m(new C14990k());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: eN */
    void m83898eN(Bundle bundle) {
        AbstractC23059e9.m118318G(3);
        if (this.f77229k1 != 3) {
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        }
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().mo35573l4(ChatView.class, bundle, 1, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0011, B:12:0x0018, B:13:0x0025, B:15:0x002a, B:17:0x002e, B:19:0x00bb, B:21:0x00c0, B:23:0x0121, B:41:0x00c6, B:43:0x00ca, B:45:0x00d0, B:47:0x00fb, B:48:0x0034, B:49:0x003f, B:51:0x0045, B:53:0x0053, B:54:0x005a, B:56:0x0060, B:57:0x0066, B:59:0x006e, B:61:0x0074, B:63:0x0084, B:65:0x008d, B:68:0x0090, B:71:0x0099, B:73:0x009f, B:75:0x00af, B:77:0x00b8, B:80:0x001e), top: B:6:0x000d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045 A[Catch: all -> 0x001b, LOOP:0: B:49:0x003f->B:51:0x0045, LOOP_END, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0011, B:12:0x0018, B:13:0x0025, B:15:0x002a, B:17:0x002e, B:19:0x00bb, B:21:0x00c0, B:23:0x0121, B:41:0x00c6, B:43:0x00ca, B:45:0x00d0, B:47:0x00fb, B:48:0x0034, B:49:0x003f, B:51:0x0045, B:53:0x0053, B:54:0x005a, B:56:0x0060, B:57:0x0066, B:59:0x006e, B:61:0x0074, B:63:0x0084, B:65:0x008d, B:68:0x0090, B:71:0x0099, B:73:0x009f, B:75:0x00af, B:77:0x00b8, B:80:0x001e), top: B:6:0x000d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0060 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0011, B:12:0x0018, B:13:0x0025, B:15:0x002a, B:17:0x002e, B:19:0x00bb, B:21:0x00c0, B:23:0x0121, B:41:0x00c6, B:43:0x00ca, B:45:0x00d0, B:47:0x00fb, B:48:0x0034, B:49:0x003f, B:51:0x0045, B:53:0x0053, B:54:0x005a, B:56:0x0060, B:57:0x0066, B:59:0x006e, B:61:0x0074, B:63:0x0084, B:65:0x008d, B:68:0x0090, B:71:0x0099, B:73:0x009f, B:75:0x00af, B:77:0x00b8, B:80:0x001e), top: B:6:0x000d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009f A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0011, B:12:0x0018, B:13:0x0025, B:15:0x002a, B:17:0x002e, B:19:0x00bb, B:21:0x00c0, B:23:0x0121, B:41:0x00c6, B:43:0x00ca, B:45:0x00d0, B:47:0x00fb, B:48:0x0034, B:49:0x003f, B:51:0x0045, B:53:0x0053, B:54:0x005a, B:56:0x0060, B:57:0x0066, B:59:0x006e, B:61:0x0074, B:63:0x0084, B:65:0x008d, B:68:0x0090, B:71:0x0099, B:73:0x009f, B:75:0x00af, B:77:0x00b8, B:80:0x001e), top: B:6:0x000d, outer: #2 }] */
    /* renamed from: fN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m83899fN() {
        ArrayList arrayList;
        Iterator it;
        int i11;
        ArrayList arrayList2;
        boolean z11;
        ArrayList arrayList3;
        try {
            if (this.f77221c1 != null) {
                ArrayList arrayList4 = new ArrayList();
                synchronized (this.f77211S1) {
                    try {
                        ArrayList arrayList5 = this.f77222d1;
                        if (arrayList5 != null && arrayList5.size() != 0) {
                            arrayList = this.f77222d1;
                            if (this.f77229k1 != 3 || (arrayList3 = this.f77222d1) == null || arrayList3.size() == 0) {
                                HashMap hashMap = new HashMap();
                                it = this.f77211S1.iterator();
                                while (it.hasNext()) {
                                    hashMap.put(((ContactProfile) it.next()).f42434r, Boolean.TRUE);
                                }
                                i11 = 0;
                                for (ContactProfile contactProfile : this.f77211S1) {
                                    while (arrayList4.size() < contactProfile.f42353K1 && i11 < arrayList.size()) {
                                        if (!hashMap.containsKey(((C32020m7) arrayList.get(i11)).f147411b.f42434r)) {
                                            arrayList4.add((C32020m7) arrayList.get(i11));
                                        }
                                        i11++;
                                    }
                                    arrayList4.add(new C32020m7(contactProfile));
                                }
                                while (i11 < arrayList.size()) {
                                    if (!hashMap.containsKey(((C32020m7) arrayList.get(i11)).f147411b.f42434r)) {
                                        arrayList4.add((C32020m7) arrayList.get(i11));
                                    }
                                    i11++;
                                }
                            }
                            arrayList2 = this.f77222d1;
                            z11 = true;
                            if ((arrayList2 != null || arrayList2.size() == 0) && this.f77229k1 == 3 && arrayList4.size() > 0) {
                                ContactProfile contactProfile2 = new ContactProfile("-22");
                                contactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.label_section_suggest_oa);
                                arrayList4.add(0, new C32020m7(contactProfile2));
                                if (!TextUtils.isEmpty(this.f77226h1.getText().toString().trim())) {
                                    ContactProfile contactProfile3 = new ContactProfile("-23");
                                    contactProfile3.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult);
                                    arrayList4.add(0, new C32020m7(contactProfile3));
                                    arrayList4.add(1, new C32020m7(new ContactProfile("-7")));
                                }
                            }
                        }
                        arrayList = new ArrayList(this.f77216X0);
                        if (this.f77229k1 != 3) {
                        }
                        HashMap hashMap2 = new HashMap();
                        it = this.f77211S1.iterator();
                        while (it.hasNext()) {
                        }
                        i11 = 0;
                        while (r6.hasNext()) {
                        }
                        while (i11 < arrayList.size()) {
                        }
                        arrayList2 = this.f77222d1;
                        z11 = true;
                        if (arrayList2 != null) {
                        }
                        ContactProfile contactProfile22 = new ContactProfile("-22");
                        contactProfile22.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.label_section_suggest_oa);
                        arrayList4.add(0, new C32020m7(contactProfile22));
                        if (!TextUtils.isEmpty(this.f77226h1.getText().toString().trim())) {
                        }
                    } finally {
                    }
                }
                C7207s6 c7207s6 = this.f77221c1;
                if (!TextUtils.isEmpty(this.f77226h1.getText().toString().trim()) || (!this.f77238t1 && this.f77229k1 != 3)) {
                    z11 = false;
                }
                c7207s6.f39503H = z11;
                this.f77221c1.m36665W(arrayList4);
                try {
                    LinearLayoutManager linearLayoutManager = this.f77213U0;
                    if (linearLayoutManager != null) {
                        m83889DM(arrayList4, linearLayoutManager.m9740Y1(), this.f77213U0.m9745c2());
                    }
                } catch (Exception unused) {
                }
                this.f77221c1.m10008p();
            }
            m83905lN(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gN */
    void m83900gN(String str) {
        if (this.f77192D1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14999t(str));
        this.f77192D1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1563W5(arrayList);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f77188T1;
    }

    /* renamed from: hN */
    void m83901hN(ContactProfile contactProfile, boolean z11) {
        if (this.f77196H1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14982c(contactProfile, z11));
        this.f77196H1 = true;
        c0766k.mo1791z6(contactProfile.f42434r, 28);
    }

    /* renamed from: iN */
    void m83902iN(int i11) {
        String str;
        try {
            EditText editText = this.f77226h1;
            if (editText == null || this.f77230l1.equals(editText.getText().toString().trim())) {
                return;
            }
            if (TextUtils.isEmpty(this.f77230l1) && !TextUtils.isEmpty(this.f77226h1.getText().toString().trim())) {
                int i12 = this.f77229k1;
                if (i12 == 1) {
                    AbstractC23647d.m123906p("3000140");
                    AbstractC23647d.m123893c();
                } else if (i12 == 3) {
                    AbstractC23647d.m123906p("3000150");
                    AbstractC23647d.m123893c();
                }
            }
            this.f77230l1 = this.f77226h1.getText().toString().trim();
            C15003x c15003x = this.f77237s1;
            if (c15003x != null) {
                c15003x.m2431f(true);
            }
            C15003x c15003x2 = new C15003x();
            this.f77237s1 = c15003x2;
            C2797c c2797c = this.f77243y1;
            String[] strArr = new String[3];
            strArr[0] = this.f77230l1;
            strArr[1] = String.valueOf(i11);
            if (this.f77189A1) {
                str = "1";
            } else {
                str = "2";
            }
            strArr[2] = str;
            c15003x2.m2433h(c2797c, strArr);
            this.f77189A1 = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jN */
    void m83903jN(String str, byte b11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14997r(str));
        c0766k.mo1560Va(str, AbstractC23006a0.m117905e(), b11, this.f77204P0, 50);
    }

    /* renamed from: kN */
    public void m83904kN(ContactProfile contactProfile) {
        String str = contactProfile.f42434r;
        if (this.f77205P1) {
            return;
        }
        this.f77205P1 = true;
        this.f77207Q1.mo1704o8(new C14988i(str, contactProfile));
        this.f77203O1 = contactProfile;
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 11);
        this.f77207Q1.mo1620d7(contactProfile.f42434r, "", contactProfile.f42373R0, trackingSource.m40682o());
    }

    /* renamed from: lN */
    void m83905lN(boolean z11) {
        if (z11) {
            this.f77212T0.setVisibility(8);
            this.f77214V0.setVisibility(0);
            this.f77214V0.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        C7207s6 c7207s6 = this.f77221c1;
        if (c7207s6 != null && c7207s6.mo10003k() > 0) {
            this.f77212T0.setVisibility(0);
            this.f77214V0.setVisibility(8);
            return;
        }
        this.f77212T0.setVisibility(8);
        this.f77214V0.setVisibility(0);
        this.f77214V0.setState(MultiStateView.EnumC15914e.EMPTY);
        EditText editText = this.f77226h1;
        if (editText != null && !TextUtils.isEmpty(editText.getText().toString())) {
            this.f77214V0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult));
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_input_keyword_search_contact);
        int i11 = this.f77229k1;
        if (i11 == 2) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_input_keyword_search_group);
        } else if (i11 == 3) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_input_keyword_search_oa);
        } else if (i11 == 4) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_input_keyword_search_message);
        }
        this.f77214V0.setEmptyViewString(m118743r0);
    }

    /* renamed from: mN */
    void m83906mN(final String str) {
        try {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_askleave_chatactivity);
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43155d(true);
            aVar.m43171t(AbstractC8020f0.str_titleDlg2);
            aVar.m43162k(m118743r0);
            aVar.m43169r(AbstractC8020f0.str_yes, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.se0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    SearchResultDetail.this.m83863bN(str, interfaceC17463d, i11);
                }
            });
            aVar.m43164m(AbstractC8020f0.str_no, new InterfaceC17463d.b());
            C8009j m43152a = aVar.m43152a();
            this.f77234p1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nN */
    void m83907nN(final ContactProfile contactProfile) {
        try {
            final String str = contactProfile.f42434r;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc);
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(7);
            aVar.m43155d(true);
            aVar.m43171t(AbstractC8020f0.str_title_popup_unfollow_oa);
            aVar.m43173v(2);
            aVar.m43162k(m118743r0);
            aVar.m43169r(AbstractC8020f0.str_button_yes_unfollow, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.re0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    SearchResultDetail.this.m83864cN(contactProfile, str, interfaceC17463d, i11);
                }
            });
            aVar.m43164m(AbstractC8020f0.str_button_no_unfollow, new InterfaceC17463d.b());
            C8009j m43152a = aVar.m43152a();
            this.f77235q1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 10099 && i12 == -1 && intent != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString("result.accept_friend_uid", "");
            if (!TextUtils.isEmpty(string)) {
                AbstractC21935u.m114533W(string, 3, "");
                this.f77219a1 = string;
                m83910rN();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            int i12 = this.f77229k1;
            if (i12 == 3) {
                AbstractC23647d.m123906p("3000153");
                AbstractC23647d.m123893c();
            } else if (i12 == 1) {
                AbstractC23647d.m123906p("3000143");
                AbstractC23647d.m123893c();
            }
            this.f72421L0.finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        EditText editText = this.f77226h1;
        if (editText != null) {
            editText.requestFocus();
        }
        C7207s6 c7207s6 = this.f77221c1;
        if (c7207s6 != null && c7207s6.mo10003k() > 0) {
            this.f77221c1.m10008p();
        }
    }

    /* renamed from: pN */
    void m83908pN(ContactProfile contactProfile) {
        if (this.f77195G1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14981b(contactProfile));
        this.f77195G1 = true;
        c0766k.mo1448Ha(contactProfile.f42434r, 15);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        return this.f77233o1;
    }

    /* renamed from: qN */
    void m83909qN(int i11, TrackingSource trackingSource) {
        try {
            if (this.f77193E1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15000u(i11));
            this.f77193E1 = true;
            if (trackingSource == null) {
                trackingSource = new TrackingSource(-1);
            }
            c0766k.mo1766w6(i11, trackingSource);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7207s6.d
    /* renamed from: qk */
    public boolean mo36679qk(C32020m7 c32020m7, int i11, boolean z11) {
        return false;
    }

    /* renamed from: rN */
    void m83910rN() {
        m83911sN(true);
    }

    /* renamed from: sN */
    void m83911sN(final boolean z11) {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qe0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchResultDetail.this.m83865dN(z11);
                }
            });
        }
    }

    /* renamed from: tN */
    public void m83912tN(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14989j());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1041));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uN */
    public void m83913uN(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
            trackingSource.m40677a("sourceView", 11);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            if (C26446c.m136326b().m136329d()) {
                Bundle bundle = new Bundle();
                bundle.putString("data", contactProfile.m40373K());
                bundle.putString("message", contactProfile.m40378N());
                this.f72421L0.m92662fJ().m93066i2(AcceptFriendView.class, bundle, 10099, 1, true);
            } else {
                m83914zM(contactProfile, false);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: zM */
    public void m83914zM(ContactProfile contactProfile, boolean z11) {
        if (this.f77201M1) {
            return;
        }
        String str = contactProfile.f42434r;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f77201M1 = true;
        this.f77202N1.mo1704o8(new C14987h(str, contactProfile));
        this.f77202N1.mo1497O3(str);
    }
}
