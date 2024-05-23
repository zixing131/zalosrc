package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0852x;
import ag0.C0809c1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.AbstractC2364o0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.AbstractC7174p6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.SearchDiscoverView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p594w1.C28685a;
import p716zh.C31874cb;
import p716zh.C31901e8;
import p716zh.C31965ic;
import p716zh.C31973j5;
import p716zh.C32002l4;
import p716zh.C32020m7;
import p716zh.C32072q1;
import t00.C26446c;
import v50.C27870vb;
import vg.C28203u6;
import wd0.C28927g;

/* loaded from: classes6.dex */
public class SearchDiscoverView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M1 */
    public static final String f77090M1 = "SearchDiscoverView";

    /* renamed from: N1 */
    public static long f77091N1;

    /* renamed from: O1 */
    public static List f77092O1 = new ArrayList();

    /* renamed from: P1 */
    public static boolean f77093P1 = false;

    /* renamed from: L1 */
    C0855y0 f77105L1;

    /* renamed from: a1 */
    AbstractC7174p6 f77120a1;

    /* renamed from: b1 */
    public int f77121b1;

    /* renamed from: d1 */
    List f77123d1;

    /* renamed from: m1 */
    C31874cb f77132m1;

    /* renamed from: n1 */
    KeyEventCallbackC17462c f77133n1;

    /* renamed from: t1 */
    LinearLayoutManager f77139t1;

    /* renamed from: v1 */
    CheckBox f77141v1;

    /* renamed from: M0 */
    private final int f77106M0 = 2;

    /* renamed from: N0 */
    private final int f77107N0 = 3;

    /* renamed from: O0 */
    private final int f77108O0 = 4;

    /* renamed from: P0 */
    private final int f77109P0 = 5;

    /* renamed from: Q0 */
    private final int f77110Q0 = 6;

    /* renamed from: R0 */
    private final int f77111R0 = 7;

    /* renamed from: S0 */
    private final int f77112S0 = 18;

    /* renamed from: T0 */
    private final int f77113T0 = 19;

    /* renamed from: U0 */
    private final int f77114U0 = 20;

    /* renamed from: V0 */
    private final int f77115V0 = 21;

    /* renamed from: W0 */
    private final int f77116W0 = 22;

    /* renamed from: X0 */
    private final int f77117X0 = 23;

    /* renamed from: Y0 */
    private final int f77118Y0 = 1;

    /* renamed from: Z0 */
    private final int f77119Z0 = 1;

    /* renamed from: c1 */
    boolean f77122c1 = false;

    /* renamed from: e1 */
    boolean f77124e1 = true;

    /* renamed from: f1 */
    int f77125f1 = -1;

    /* renamed from: g1 */
    int f77126g1 = -1;

    /* renamed from: h1 */
    boolean f77127h1 = false;

    /* renamed from: i1 */
    boolean f77128i1 = false;

    /* renamed from: j1 */
    boolean f77129j1 = true;

    /* renamed from: k1 */
    int f77130k1 = 0;

    /* renamed from: l1 */
    String f77131l1 = "";

    /* renamed from: o1 */
    String f77134o1 = "";

    /* renamed from: p1 */
    List f77135p1 = new ArrayList();

    /* renamed from: q1 */
    List f77136q1 = new ArrayList();

    /* renamed from: r1 */
    List f77137r1 = new ArrayList();

    /* renamed from: s1 */
    Map f77138s1 = new HashMap();

    /* renamed from: u1 */
    BroadcastReceiver f77140u1 = new C14973g();

    /* renamed from: w1 */
    boolean f77142w1 = false;

    /* renamed from: x1 */
    boolean f77143x1 = false;

    /* renamed from: y1 */
    boolean f77144y1 = false;

    /* renamed from: z1 */
    boolean f77145z1 = false;

    /* renamed from: A1 */
    boolean f77094A1 = false;

    /* renamed from: B1 */
    boolean f77095B1 = false;

    /* renamed from: C1 */
    boolean f77096C1 = false;

    /* renamed from: D1 */
    boolean f77097D1 = false;

    /* renamed from: E1 */
    boolean f77098E1 = false;

    /* renamed from: F1 */
    boolean f77099F1 = false;

    /* renamed from: G1 */
    InterfaceC0765j f77100G1 = new C0766k();

    /* renamed from: H1 */
    boolean f77101H1 = false;

    /* renamed from: I1 */
    InterfaceC0765j f77102I1 = new C0766k();

    /* renamed from: J1 */
    boolean f77103J1 = false;

    /* renamed from: K1 */
    private final Object f77104K1 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$a */
    /* loaded from: classes6.dex */
    public class C14967a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77146a;

        /* renamed from: b */
        final /* synthetic */ C31874cb f77147b;

        C14967a(String str, C31874cb c31874cb) {
            this.f77146a = str;
            this.f77147b = c31874cb;
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
                SearchDiscoverView.this.f72421L0.mo78960q3();
                SearchDiscoverView.this.f77094A1 = false;
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
                            C19669z.m103146Y().m103198O0();
                            C18644n.m98524E();
                            SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                            searchDiscoverView.f77094A1 = false;
                            searchDiscoverView.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    AbstractC21935u.m114532V(false, this.f77146a, this.f77147b.m153177a());
                    AbstractC2364o0.m12369l(SearchDiscoverView.this.f72421L0.m92676n2(), SearchDiscoverView.this.f77120a1);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                C19669z.m103146Y().m103198O0();
                C18644n.m98524E();
                SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
                searchDiscoverView2.f77094A1 = false;
                searchDiscoverView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                C19669z.m103146Y().m103198O0();
                C18644n.m98524E();
                SearchDiscoverView searchDiscoverView3 = SearchDiscoverView.this;
                searchDiscoverView3.f77094A1 = false;
                searchDiscoverView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$b */
    /* loaded from: classes6.dex */
    public class C14968b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f77149a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$b$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f77151a;

            a(String str) {
                this.f77151a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42343ac(this.f77151a);
                C7960e.m41971c6().m42376e4(this.f77151a);
            }
        }

        C14968b(int i11) {
            this.f77149a = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83835d() {
            SearchDiscoverView.this.f72421L0.mo49315c4();
            AbstractC7174p6 abstractC7174p6 = SearchDiscoverView.this.f77120a1;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SearchDiscoverView searchDiscoverView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    searchDiscoverView = SearchDiscoverView.this;
                    searchDiscoverView.f77095B1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SearchDiscoverView.this.f77095B1 = false;
                    searchDiscoverView = SearchDiscoverView.this;
                }
                searchDiscoverView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
                searchDiscoverView2.f77095B1 = false;
                searchDiscoverView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            try {
                try {
                    String valueOf = String.valueOf(this.f77149a);
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
                            AbstractC23074g2.m118375a(2, valueOf, String.valueOf(SearchDiscoverView.this.f77125f1), 0);
                        } else {
                            ToastUtils.m89264l(new C20096c(parseInt, AbstractC23161o1.m119318c(parseInt, "")));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                        m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.de0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchDiscoverView.C14968b.this.m83835d();
                            }
                        };
                    }
                }
                if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                    m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.de0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14968b.this.m83835d();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
                SearchDiscoverView.this.f77095B1 = false;
            } catch (Throwable th2) {
                if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                    SearchDiscoverView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.de0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14968b.this.m83835d();
                        }
                    });
                }
                SearchDiscoverView.this.f77095B1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$c */
    /* loaded from: classes6.dex */
    public class C14969c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77153a;

        /* renamed from: b */
        final /* synthetic */ C31874cb f77154b;

        /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$c$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77156a;

            a(ContactProfile contactProfile) {
                this.f77156a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f77156a);
            }
        }

        C14969c(String str, C31874cb c31874cb) {
            this.f77153a = str;
            this.f77154b = c31874cb;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (SearchDiscoverView.this.f72421L0.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77096C1 = false;
                searchDiscoverView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            C31874cb c31874cb;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f77153a);
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        if (m141809c == null && (c31874cb = this.f77154b) != null) {
                            m141809c = c31874cb.m153177a();
                            int i12 = this.f77154b.f146390f;
                            m141809c.f42447v0 = i12;
                            m141809c.f42352K0 = i12;
                        } else if (m141809c != null) {
                            m141809c.f42447v0 = m141809c.f42352K0;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f77153a)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f77153a)).m153681a();
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
                            if (!C21927m.m114302u().m114357s().m153137g(this.f77153a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f77153a) != null) {
                                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(this.f77153a);
                                m153138j.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m153138j.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m153138j.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f77153a, false);
                        AbstractC23074g2.m118375a(0, this.f77153a, String.valueOf(SearchDiscoverView.this.f77125f1), 0);
                        if (!TextUtils.isEmpty(this.f77153a)) {
                            AbstractC23181q.m119431d(this.f77153a, true);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77096C1 = false;
                searchDiscoverView.m83826SM(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$d */
    /* loaded from: classes6.dex */
    public class C14970d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77158a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77159b;

        C14970d(String str, ContactProfile contactProfile) {
            this.f77158a = str;
            this.f77159b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83837d(ContactProfile contactProfile) {
            AbstractC21935u.m114523M(SearchDiscoverView.this.f72421L0.m92662fJ(), contactProfile);
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
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77101H1 = z11;
                searchDiscoverView.f72421L0.mo78960q3();
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
                            AbstractC23074g2.m118375a(0, this.f77158a, String.valueOf(SearchDiscoverView.this.f77125f1), 0);
                            if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                                InterfaceC27218a m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                                final ContactProfile contactProfile = this.f77159b;
                                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ee0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SearchDiscoverView.C14970d.this.m83837d(contactProfile);
                                    }
                                });
                            }
                        } else if (!AbstractC23216t1.m119641f(SearchDiscoverView.this.f72421L0, i11, true)) {
                            ToastUtils.m89259g(i11);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77101H1 = false;
                searchDiscoverView.m83826SM(true);
            } catch (Throwable th2) {
                SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
                searchDiscoverView2.f77101H1 = false;
                searchDiscoverView2.m83826SM(true);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$e */
    /* loaded from: classes6.dex */
    public class C14971e implements InterfaceC20094a {
        C14971e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m83841f() {
            try {
                SearchDiscoverView.this.f77128i1 = true;
                new AsyncTaskC14979m().execute(String.valueOf(SearchDiscoverView.this.f77121b1));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ void m83842g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m83843h() {
            AbstractC7174p6 abstractC7174p6 = SearchDiscoverView.this.f77120a1;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            SearchDiscoverView searchDiscoverView;
            try {
                try {
                    SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
                    searchDiscoverView2.f77127h1 = true;
                    searchDiscoverView2.f77128i1 = true;
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                        SearchDiscoverView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ge0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchDiscoverView.C14971e.m83842g();
                            }
                        });
                    }
                    searchDiscoverView = SearchDiscoverView.this;
                    searchDiscoverView.f77103J1 = false;
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SearchDiscoverView.f77090M1, e11.toString());
                    SearchDiscoverView searchDiscoverView3 = SearchDiscoverView.this;
                    searchDiscoverView3.f77103J1 = false;
                    if (searchDiscoverView3.f72421L0.m92676n2() != null) {
                        m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.he0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchDiscoverView.C14971e.this.m83843h();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (searchDiscoverView.f72421L0.m92676n2() != null) {
                    m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.he0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14971e.this.m83843h();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                SearchDiscoverView searchDiscoverView4 = SearchDiscoverView.this;
                searchDiscoverView4.f77103J1 = false;
                if (searchDiscoverView4.f72421L0.m92676n2() != null) {
                    SearchDiscoverView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.he0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14971e.this.m83843h();
                        }
                    });
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            SearchDiscoverView searchDiscoverView;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            boolean z11;
            JSONObject jSONObject;
            int optInt;
            SearchDiscoverView searchDiscoverView2;
            C31874cb m114300c0;
            try {
                try {
                    String str = SearchDiscoverView.f77090M1;
                    obj.toString();
                    SearchDiscoverView searchDiscoverView3 = SearchDiscoverView.this;
                    searchDiscoverView3.f77130k1 = 0;
                    List list = searchDiscoverView3.f77136q1;
                    if (list != null && list.isEmpty()) {
                        Map map = SearchDiscoverView.this.f77138s1;
                        if (map != null) {
                            map.clear();
                        }
                        ArrayList arrayList = new ArrayList(((C32072q1) C21927m.f107775T.get(String.valueOf(SearchDiscoverView.this.f77125f1))).f147678j);
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((C32020m7) arrayList.get(i11)).f147412c != null && !SearchDiscoverView.this.f77138s1.containsKey(((C32020m7) arrayList.get(i11)).f147412c.f146385a)) {
                                SearchDiscoverView.this.f77138s1.put(((C32020m7) arrayList.get(i11)).f147412c.f146385a, Boolean.TRUE);
                            } else if (((C32020m7) arrayList.get(i11)).f147413d != null && !SearchDiscoverView.this.f77138s1.containsKey(((C32020m7) arrayList.get(i11)).f147413d.m153781r())) {
                                SearchDiscoverView.this.f77138s1.put(((C32020m7) arrayList.get(i11)).f147413d.m153781r(), Boolean.TRUE);
                            }
                        }
                    }
                    try {
                        new ArrayList();
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2.optInt("error_code", -999) == 0 && (optJSONObject = jSONObject2.optJSONObject("data")) != null && (optJSONObject2 = optJSONObject.optJSONObject("discoverList")) != null) {
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("discoverItems");
                            int optInt2 = optJSONObject2.optInt("loadMore");
                            SearchDiscoverView.this.f77127h1 = false;
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                    try {
                                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i12);
                                        if (jSONObject3 != null) {
                                            int optInt3 = jSONObject3.optInt("discoverItemType");
                                            if (optInt3 == 1) {
                                                String optString = jSONObject3.optString("uid");
                                                if (!TextUtils.isEmpty(optString) && (m114300c0 = C21927m.m114300c0(jSONObject3, -1)) != null && !SearchDiscoverView.this.f77138s1.containsKey(optString)) {
                                                    SearchDiscoverView.this.f77138s1.put(optString, Boolean.TRUE);
                                                    C32020m7 c32020m7 = new C32020m7(0);
                                                    c32020m7.f147412c = m114300c0;
                                                    SearchDiscoverView.this.f77136q1.add(c32020m7);
                                                    C7960e.m41971c6().m42444k8(jSONObject3.toString(), String.valueOf(SearchDiscoverView.this.f77125f1), optString, -1);
                                                    SearchDiscoverView.this.f77130k1++;
                                                }
                                            } else if (optInt3 == 2) {
                                                String optString2 = jSONObject3.optString("groupId");
                                                if (!TextUtils.isEmpty(optString2) && !SearchDiscoverView.this.f77138s1.containsKey(optString2)) {
                                                    SearchDiscoverView.this.f77138s1.put(optString2, Boolean.TRUE);
                                                    C32020m7 c32020m72 = new C32020m7(3);
                                                    c32020m72.f147413d = new C31973j5(jSONObject3);
                                                    SearchDiscoverView.this.f77136q1.add(c32020m72);
                                                    C7960e.m41971c6().m42444k8(jSONObject3.toString(), String.valueOf(SearchDiscoverView.this.f77125f1), "group_" + optString2, -1);
                                                    SearchDiscoverView.this.f77130k1++;
                                                }
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                SearchDiscoverView searchDiscoverView4 = SearchDiscoverView.this;
                                if (optInt2 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                searchDiscoverView4.f77127h1 = z11;
                                if (z11) {
                                    searchDiscoverView4.f77126g1++;
                                }
                                String m122233o4 = AbstractC23309i.m122233o4();
                                if (!TextUtils.isEmpty(m122233o4)) {
                                    try {
                                        JSONObject jSONObject4 = new JSONObject(m122233o4);
                                        JSONArray optJSONArray2 = jSONObject4.optJSONArray("discover");
                                        if (optJSONArray2 != null) {
                                            for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                                                try {
                                                    jSONObject = optJSONArray2.getJSONObject(i13);
                                                    optInt = jSONObject.optInt("discoverId", -1);
                                                    searchDiscoverView2 = SearchDiscoverView.this;
                                                } catch (Exception e12) {
                                                    e12.printStackTrace();
                                                }
                                                if (optInt == searchDiscoverView2.f77125f1) {
                                                    jSONObject.put("currentPage", searchDiscoverView2.f77126g1);
                                                    AbstractC23309i.m120761Ao(jSONObject4.toString());
                                                    break;
                                                }
                                                continue;
                                            }
                                        }
                                    } catch (JSONException e13) {
                                        e13.printStackTrace();
                                    }
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                    searchDiscoverView = SearchDiscoverView.this;
                    searchDiscoverView.f77103J1 = false;
                    AbstractC7174p6 abstractC7174p6 = searchDiscoverView.f77120a1;
                } catch (Exception e15) {
                    AbstractC23350e.m122774d(SearchDiscoverView.f77090M1, e15.toString());
                    SearchDiscoverView searchDiscoverView5 = SearchDiscoverView.this;
                    searchDiscoverView5.f77103J1 = false;
                    AbstractC7174p6 abstractC7174p62 = searchDiscoverView5.f77120a1;
                    if (searchDiscoverView5.f72421L0.m92676n2() != null) {
                        m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.fe0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchDiscoverView.C14971e.this.m83841f();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (searchDiscoverView.f72421L0.m92676n2() != null) {
                    m92676n2 = SearchDiscoverView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.fe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14971e.this.m83841f();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                SearchDiscoverView searchDiscoverView6 = SearchDiscoverView.this;
                searchDiscoverView6.f77103J1 = false;
                AbstractC7174p6 abstractC7174p63 = searchDiscoverView6.f77120a1;
                if (searchDiscoverView6.f72421L0.m92676n2() != null) {
                    SearchDiscoverView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fe0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDiscoverView.C14971e.this.m83841f();
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$f */
    /* loaded from: classes6.dex */
    class C14972f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f77162a;

        /* renamed from: b */
        final /* synthetic */ int f77163b;

        /* renamed from: c */
        final /* synthetic */ int f77164c;

        C14972f(List list, int i11, int i12) {
            this.f77162a = list;
            this.f77163b = i11;
            this.f77164c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            String str;
            C23651h c23651h;
            String[] strArr;
            C31874cb c31874cb;
            C31973j5 c31973j5;
            SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
            if (searchDiscoverView.f77105L1 == null) {
                searchDiscoverView.f77105L1 = new C0855y0();
            }
            HashMap m2385c = SearchDiscoverView.this.f77105L1.m2385c();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f77162a.size();
            for (int i12 = 0; i12 < size; i12++) {
                C32020m7 c32020m7 = (C32020m7) this.f77162a.get(i12);
                if (c32020m7 != null && (i11 = c32020m7.f147410a) != 1 && i11 != 2) {
                    if (i11 == 3 && (c31973j5 = c32020m7.f147413d) != null) {
                        str = c31973j5.m153781r();
                    } else {
                        str = null;
                    }
                    if (i11 == 0 && (c31874cb = c32020m7.f147412c) != null) {
                        str = c31874cb.f146385a;
                    }
                    if (!TextUtils.isEmpty(str) && m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (c23651h = (C23651h) c23669z) != null && (strArr = c23651h.f114659f) != null) {
                            if (!strArr[2].equals(String.valueOf(i12))) {
                                c23651h.f114659f[2] = String.valueOf(i12);
                            }
                            if (i12 < this.f77163b || i12 > this.f77164c) {
                                c23669z.f114660g = false;
                            }
                            hashMap.put(str, (C23669z) m2385c.get(str));
                        }
                    }
                }
            }
            SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
            if (searchDiscoverView2.f77105L1 == null) {
                searchDiscoverView2.f77105L1 = new C0855y0();
            }
            SearchDiscoverView.this.f77105L1.m2386d(hashMap);
            SearchDiscoverView.this.f77105L1.m2387e(hashMap2);
            SearchDiscoverView.this.m83831vM(this.f77163b, this.f77164c, this.f77162a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$g */
    /* loaded from: classes6.dex */
    class C14973g extends BroadcastReceiver {
        C14973g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (SearchDiscoverView.this.f72421L0.m92674mJ() && !SearchDiscoverView.this.f72421L0.m92677nJ() && "com.zing.zalo.ACTION_REFRESH_GROUP_LIST".equals(intent.getAction())) {
                    new AsyncTaskC14979m().execute(String.valueOf(SearchDiscoverView.this.f77121b1));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(SearchDiscoverView.f77090M1, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$h */
    /* loaded from: classes6.dex */
    public class C14974h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77167a;

        C14974h(ContactProfile contactProfile) {
            this.f77167a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42230P7(this.f77167a.f42434r, System.currentTimeMillis());
            if (C28203u6.f131407a.m141809c(this.f77167a.f42434r) == null) {
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile = this.f77167a;
                m41971c6.m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
            }
            SearchDiscoverView.this.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$i */
    /* loaded from: classes6.dex */
    public class C14975i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77169a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$i$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(C14975i.this.f77169a);
            }
        }

        C14975i(String str) {
            this.f77169a = str;
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
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77142w1 = z11;
                searchDiscoverView.f72421L0.mo78960q3();
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
                            AbstractC20110a.m104539h(e11);
                        }
                        boolean z12 = true;
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (Integer.parseInt(this.f77169a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            if (!C21927m.m114302u().m114351p().contains(this.f77169a)) {
                                C21927m.m114302u().m114351p().add(this.f77169a);
                                AbstractC21935u.m114527Q(this.f77169a);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a());
                            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77169a);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, this.f77169a, m98552o.f42437s);
                                String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_add_favorite_friend), m114539f, m114539f);
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(this.f77169a, format);
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
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77142w1 = false;
                searchDiscoverView.f72421L0.mo78960q3();
                C18644n.m98524E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$j */
    /* loaded from: classes6.dex */
    public class C14976j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77172a;

        /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$j$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42415hc(C14976j.this.f77172a);
            }
        }

        C14976j(String str) {
            this.f77172a = str;
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
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77143x1 = z11;
                searchDiscoverView.f72421L0.mo78960q3();
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
                            if (Integer.parseInt(this.f77172a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            C21927m.m114302u().m114340j0(this.f77172a);
                            AbstractC21935u.m114526P(this.f77172a);
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
                SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
                searchDiscoverView.f77143x1 = false;
                searchDiscoverView.m83826SM(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$k */
    /* loaded from: classes6.dex */
    public class C14977k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77175a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77176b;

        /* renamed from: c */
        final /* synthetic */ boolean f77177c;

        C14977k(String str, ContactProfile contactProfile, boolean z11) {
            this.f77175a = str;
            this.f77176b = contactProfile;
            this.f77177c = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m83845d(boolean z11) {
            try {
                new AsyncTaskC14979m().execute(String.valueOf(SearchDiscoverView.this.f77121b1));
                if (z11) {
                    SearchDiscoverView.this.getClass();
                }
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
                SearchDiscoverView.this.f72421L0.mo78960q3();
                SearchDiscoverView.this.f77144y1 = false;
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
                            if (!AbstractC25495a.m132086k(this.f77175a) && !AbstractC25495a.m132078c(this.f77175a)) {
                                ToastUtils.m89259g(i11);
                                SearchDiscoverView.this.f77144y1 = false;
                                AbstractC23088h5.m118426g();
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                                C18644n.m98524E();
                                SearchDiscoverView.this.f72421L0.mo78960q3();
                                return;
                            }
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_error_cannot_delete_this_contact));
                            SearchDiscoverView.this.f77144y1 = false;
                            AbstractC23088h5.m118426g();
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                            C18644n.m98524E();
                            SearchDiscoverView.this.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    C7960e.m41971c6().m42136Gd(this.f77176b.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    c28203u6.m141827z(this.f77176b.f42434r, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f77176b.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77176b.f42434r);
                    C18644n.m98531l().m98540I(this.f77176b.f42434r);
                    c28203u6.m141804B(this.f77176b.f42434r, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f77176b.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f77176b.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f77176b.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f77176b.f42434r) && AbstractC21935u.m114515E(this.f77176b.f42434r) && AbstractC23306f.m120562A().m2529X(this.f77176b.f42434r)) {
                        C7959d.m41638d1().m41774b3(this.f77176b.f42434r, 2);
                    }
                    Map map = AbstractC23304d.f113421p;
                    final boolean containsKey = map.containsKey(this.f77175a);
                    synchronized (map) {
                        try {
                            if (map.containsKey(this.f77176b.f42434r)) {
                                C7960e.m41971c6().m42376e4(this.f77176b.f42434r);
                            }
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f77176b.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f77176b.f42434r);
                    C21927m.m114302u().m114352p0(this.f77176b.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f77176b.f42434r);
                    AbstractC0852x.m2332I(this.f77175a);
                    if (this.f77177c) {
                        AbstractC0852x.m2355l(SearchDiscoverView.this.f72421L0.getContext(), this.f77176b.f42455y, new SensitiveData("phonebook_delete_in_phonebook_tab", "phonebook_delete"));
                    }
                    if (SearchDiscoverView.this.f72421L0.m92676n2() != null) {
                        SearchDiscoverView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ie0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchDiscoverView.C14977k.this.m83845d(containsKey);
                            }
                        });
                    }
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f77176b.f42434r);
                } catch (Exception e11) {
                    String str = SearchDiscoverView.f77090M1;
                    e11.toString();
                }
                SearchDiscoverView.this.f77144y1 = false;
                AbstractC23088h5.m118426g();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                C18644n.m98524E();
                SearchDiscoverView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SearchDiscoverView.this.f77144y1 = false;
                AbstractC23088h5.m118426g();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                C18644n.m98524E();
                SearchDiscoverView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$l */
    /* loaded from: classes6.dex */
    public class C14978l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77179a;

        /* renamed from: b */
        final /* synthetic */ C31874cb f77180b;

        /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$l$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77182a;

            a(ContactProfile contactProfile) {
                this.f77182a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                if (this.f77182a != null) {
                    C7960e.m41971c6().m42131G7(this.f77182a, true);
                }
                C7960e.m41971c6().m42234Pb(C14978l.this.f77179a);
            }
        }

        C14978l(String str, C31874cb c31874cb) {
            this.f77179a = str;
            this.f77180b = c31874cb;
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
                SearchDiscoverView.this.f72421L0.mo78960q3();
                SearchDiscoverView.this.f77145z1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C31874cb c31874cb;
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
                            SearchDiscoverView.this.f72421L0.mo78960q3();
                            SearchDiscoverView.this.f77145z1 = false;
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f77179a);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77179a);
                    if (m98552o == null) {
                        m98552o = C28203u6.f131407a.m141809c(this.f77179a);
                    }
                    if (m98552o == null && (c31874cb = this.f77180b) != null) {
                        m98552o = c31874cb.m153177a();
                    }
                    if (m98552o != null) {
                        m98552o.f42403c1 = false;
                        C28203u6.f131407a.m141824w(m98552o);
                    }
                    C21927m.m114302u().m114350o0(this.f77179a);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f77179a)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f77179a)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o));
                    SearchDiscoverView.this.m83826SM(false);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                SearchDiscoverView.this.f72421L0.mo78960q3();
                SearchDiscoverView.this.f77145z1 = false;
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                SearchDiscoverView.this.f72421L0.mo78960q3();
                SearchDiscoverView.this.f77145z1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchDiscoverView$m */
    /* loaded from: classes6.dex */
    public class AsyncTaskC14979m extends AsyncTask {

        /* renamed from: a */
        String f77184a;

        /* renamed from: b */
        long f77185b;

        /* renamed from: c */
        boolean f77186c;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            try {
                this.f77185b = System.currentTimeMillis();
                if (strArr.length > 0) {
                    this.f77184a = strArr[0];
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (TextUtils.isEmpty(this.f77184a.trim())) {
                return Boolean.FALSE;
            }
            SearchDiscoverView searchDiscoverView = SearchDiscoverView.this;
            List list = searchDiscoverView.f77123d1;
            if (list != null && (i11 = searchDiscoverView.f77121b1) >= 0 && i11 < list.size()) {
                SearchDiscoverView searchDiscoverView2 = SearchDiscoverView.this;
                String str = (String) searchDiscoverView2.f77123d1.get(searchDiscoverView2.f77121b1);
                try {
                    SearchDiscoverView.this.f77125f1 = Integer.parseInt(str);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                if (!TextUtils.isEmpty(str)) {
                    SearchDiscoverView searchDiscoverView3 = SearchDiscoverView.this;
                    if (searchDiscoverView3.f77125f1 != -1) {
                        if (!searchDiscoverView3.f77128i1) {
                            if (C21927m.f107775T.containsKey(str) && C21927m.f107775T.get(str) != null) {
                                List list2 = SearchDiscoverView.this.f77135p1;
                                if (list2 != null) {
                                    list2.clear();
                                }
                                if (((C32072q1) C21927m.f107775T.get(str)).f147678j == null || ((C32072q1) C21927m.f107775T.get(str)).f147678j.isEmpty()) {
                                    ((C32072q1) C21927m.f107775T.get(str)).f147678j = C7960e.m41971c6().m42327Z4(str);
                                }
                                ArrayList arrayList = new ArrayList(((C32072q1) C21927m.f107775T.get(str)).f147678j);
                                int size = arrayList.size();
                                if (((C32072q1) C21927m.f107775T.get(str)).f147673e == 1) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (!arrayList.isEmpty()) {
                                    if (SearchDiscoverView.this.f77129j1 && ((C32072q1) C21927m.f107775T.get(str)).f147674f > 0 && size > ((C32072q1) C21927m.f107775T.get(str)).f147674f) {
                                        size = ((C32072q1) C21927m.f107775T.get(str)).f147674f;
                                    }
                                    if (str.equals("3")) {
                                        synchronized (SearchDiscoverView.this.f77104K1) {
                                            try {
                                                HashMap hashMap = new HashMap();
                                                Iterator it = SearchDiscoverView.f77092O1.iterator();
                                                while (it.hasNext()) {
                                                    hashMap.put(((C31874cb) it.next()).f146385a, Boolean.TRUE);
                                                }
                                                i14 = 0;
                                                for (C31874cb c31874cb : SearchDiscoverView.f77092O1) {
                                                    while (SearchDiscoverView.this.f77135p1.size() < c31874cb.f146409y && SearchDiscoverView.this.f77135p1.size() < size && i14 < arrayList.size()) {
                                                        if (!hashMap.containsKey(((C32020m7) arrayList.get(i14)).f147412c.f146385a)) {
                                                            SearchDiscoverView.this.f77135p1.add((C32020m7) arrayList.get(i14));
                                                        }
                                                        i14++;
                                                    }
                                                    C32020m7 c32020m7 = new C32020m7(0);
                                                    c32020m7.f147412c = c31874cb;
                                                    SearchDiscoverView.this.f77135p1.add(c32020m7);
                                                }
                                                while (SearchDiscoverView.this.f77135p1.size() < size && i14 < arrayList.size()) {
                                                    if (!hashMap.containsKey(((C32020m7) arrayList.get(i14)).f147412c.f146385a)) {
                                                        SearchDiscoverView.this.f77135p1.add((C32020m7) arrayList.get(i14));
                                                    }
                                                    i14++;
                                                }
                                            } finally {
                                            }
                                        }
                                    } else {
                                        i14 = 0;
                                        for (int i16 = 0; i16 < size; i16++) {
                                            SearchDiscoverView.this.f77135p1.add((C32020m7) arrayList.get(i16));
                                            i14++;
                                        }
                                    }
                                    for (int i17 = 0; i17 < SearchDiscoverView.this.f77135p1.size(); i17++) {
                                        C32020m7 c32020m72 = (C32020m7) SearchDiscoverView.this.f77135p1.get(i17);
                                        if (SearchDiscoverView.this.f77135p1.size() == 1) {
                                            c32020m72.f147420k = i13;
                                        } else if (i17 == 0) {
                                            c32020m72.f147420k = 1;
                                        } else if (i17 == SearchDiscoverView.this.f77135p1.size() - 1 && i14 == arrayList.size()) {
                                            if (i13 != 0) {
                                                i15 = 2;
                                            } else {
                                                i15 = 3;
                                            }
                                            c32020m72.f147420k = i15;
                                        } else {
                                            c32020m72.f147420k = 2;
                                        }
                                    }
                                    if (i14 == arrayList.size()) {
                                        SearchDiscoverView.this.f77129j1 = false;
                                    }
                                    SearchDiscoverView.this.f77135p1.add(0, new C32020m7(1));
                                    if (i13 != 0 || i14 < ((C32072q1) C21927m.f107775T.get(str)).f147678j.size()) {
                                        C32020m7 c32020m73 = new C32020m7(2);
                                        c32020m73.f147420k = 3;
                                        SearchDiscoverView.this.f77135p1.add(c32020m73);
                                        if (arrayList.size() < ((C32072q1) C21927m.f107775T.get(str)).f147674f) {
                                            this.f77186c = true;
                                        }
                                    }
                                } else if (i13 != 0) {
                                    this.f77186c = true;
                                }
                            }
                        } else {
                            searchDiscoverView3.f77129j1 = false;
                            if (((C32072q1) C21927m.f107775T.get(str)).f147678j == null || ((C32072q1) C21927m.f107775T.get(str)).f147678j.isEmpty()) {
                                ((C32072q1) C21927m.f107775T.get(str)).f147678j = C7960e.m41971c6().m42327Z4(str);
                            }
                            ArrayList<C32020m7> arrayList2 = new ArrayList(((C32072q1) C21927m.f107775T.get(str)).f147678j);
                            ArrayList arrayList3 = new ArrayList(SearchDiscoverView.this.f77136q1);
                            HashMap hashMap2 = new HashMap();
                            for (C32020m7 c32020m74 : arrayList2) {
                                C31874cb c31874cb2 = c32020m74.f147412c;
                                if (c31874cb2 != null) {
                                    hashMap2.put(c31874cb2.f146385a, Boolean.TRUE);
                                } else {
                                    C31973j5 c31973j5 = c32020m74.f147413d;
                                    if (c31973j5 != null) {
                                        hashMap2.put(c31973j5.m153781r(), Boolean.TRUE);
                                    }
                                }
                            }
                            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                C32020m7 c32020m75 = (C32020m7) arrayList3.get(i18);
                                C31874cb c31874cb3 = c32020m75.f147412c;
                                if (c31874cb3 != null && !hashMap2.containsKey(c31874cb3.f146385a)) {
                                    hashMap2.put(c32020m75.f147412c.f146385a, Boolean.TRUE);
                                    arrayList2.add(c32020m75);
                                } else {
                                    C31973j5 c31973j52 = c32020m75.f147413d;
                                    if (c31973j52 != null && !hashMap2.containsKey(c31973j52.m153781r())) {
                                        hashMap2.put(c32020m75.f147413d.m153781r(), Boolean.TRUE);
                                        arrayList2.add(c32020m75);
                                    }
                                }
                            }
                            List list3 = SearchDiscoverView.this.f77137r1;
                            if (list3 != null) {
                                list3.clear();
                            }
                            if (!arrayList2.isEmpty()) {
                                if (str.equals("3")) {
                                    synchronized (SearchDiscoverView.this.f77104K1) {
                                        try {
                                            HashMap hashMap3 = new HashMap();
                                            Iterator it2 = SearchDiscoverView.f77092O1.iterator();
                                            while (it2.hasNext()) {
                                                hashMap3.put(((C31874cb) it2.next()).f146385a, Boolean.TRUE);
                                            }
                                            int i19 = 0;
                                            for (C31874cb c31874cb4 : SearchDiscoverView.f77092O1) {
                                                while (SearchDiscoverView.this.f77137r1.size() < c31874cb4.f146409y && i19 < arrayList2.size()) {
                                                    if (!hashMap3.containsKey(((C32020m7) arrayList2.get(i19)).f147412c.f146385a)) {
                                                        hashMap3.put(((C32020m7) arrayList2.get(i19)).f147412c.f146385a, Boolean.TRUE);
                                                        SearchDiscoverView.this.f77137r1.add((C32020m7) arrayList2.get(i19));
                                                    }
                                                    i19++;
                                                }
                                                C32020m7 c32020m76 = new C32020m7(0);
                                                c32020m76.f147412c = c31874cb4;
                                                SearchDiscoverView.this.f77137r1.add(c32020m76);
                                            }
                                            while (i19 < arrayList2.size()) {
                                                if (!hashMap3.containsKey(((C32020m7) arrayList2.get(i19)).f147412c.f146385a)) {
                                                    hashMap3.put(((C32020m7) arrayList2.get(i19)).f147412c.f146385a, Boolean.TRUE);
                                                    SearchDiscoverView.this.f77137r1.add((C32020m7) arrayList2.get(i19));
                                                }
                                                i19++;
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                                        SearchDiscoverView.this.f77137r1.add((C32020m7) arrayList2.get(i21));
                                    }
                                }
                                for (int i22 = 0; i22 < SearchDiscoverView.this.f77137r1.size(); i22++) {
                                    C32020m7 c32020m77 = (C32020m7) SearchDiscoverView.this.f77137r1.get(i22);
                                    if (SearchDiscoverView.this.f77137r1.size() == 1) {
                                        c32020m77.f147420k = SearchDiscoverView.this.f77127h1 ? 1 : 0;
                                    } else if (i22 == 0) {
                                        c32020m77.f147420k = 1;
                                    } else if (i22 == SearchDiscoverView.this.f77137r1.size() - 1) {
                                        if (SearchDiscoverView.this.f77127h1) {
                                            i12 = 2;
                                        } else {
                                            i12 = 3;
                                        }
                                        c32020m77.f147420k = i12;
                                    } else {
                                        c32020m77.f147420k = 2;
                                    }
                                }
                                SearchDiscoverView.this.f77137r1.add(0, new C32020m7(1));
                                if (SearchDiscoverView.this.f77127h1) {
                                    C32020m7 c32020m78 = new C32020m7(2);
                                    c32020m78.f147420k = 3;
                                    SearchDiscoverView.this.f77137r1.add(c32020m78);
                                }
                            }
                        }
                        e11.printStackTrace();
                    }
                }
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            StringBuilder sb2;
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                    String str = SearchDiscoverView.f77090M1;
                    sb2 = new StringBuilder();
                }
                if (!SearchDiscoverView.this.f72421L0.m92677nJ() && !SearchDiscoverView.this.f72421L0.m92681pJ()) {
                    AbstractC7174p6 abstractC7174p6 = SearchDiscoverView.this.f77120a1;
                    if (this.f77186c) {
                        this.f77186c = false;
                        SearchDiscoverView.this.m83833xM();
                    } else {
                        SearchDiscoverView.this.getClass();
                    }
                    String str2 = SearchDiscoverView.f77090M1;
                    sb2 = new StringBuilder();
                    sb2.append("loadTime: ");
                    sb2.append(System.currentTimeMillis() - this.f77185b);
                }
            } finally {
                String str3 = SearchDiscoverView.f77090M1;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("loadTime: ");
                sb3.append(System.currentTimeMillis() - this.f77185b);
            }
        }

        private AsyncTaskC14979m() {
            this.f77185b = 0L;
            this.f77186c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m83791AM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83827TM(this.f77132m1.m153177a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m83792BM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        C31874cb c31874cb = this.f77132m1;
        if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
            ContactProfile contactProfile = new ContactProfile(this.f77132m1.f146385a);
            C31874cb c31874cb2 = this.f77132m1;
            contactProfile.f42446v = c31874cb2.f146393i;
            contactProfile.f42455y = c31874cb2.f146394j;
            contactProfile.f42437s = c31874cb2.f146387c;
            contactProfile.f42437s = contactProfile.m40383Q(true, false);
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m83793CM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.ignore_zalouser) {
            this.f72421L0.showDialog(6);
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_unblockuser) {
            this.f72421L0.showDialog(4);
            return;
        }
        if (intValue == AbstractC8020f0.delete_zalouser) {
            this.f72421L0.showDialog(5);
            return;
        }
        if (intValue == AbstractC8020f0.addfavorite_zalouser) {
            if (C21927m.m114302u().m114351p() != null && !C21927m.m114302u().m114351p().contains(this.f77132m1.f146385a)) {
                if (C21927m.m114302u().m114351p().size() < AbstractC23309i.m121115K8()) {
                    m83830uM(this.f77132m1.f146385a);
                    return;
                } else {
                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(AbstractC23309i.m121115K8())));
                    return;
                }
            }
            return;
        }
        if (intValue == AbstractC8020f0.cm_removefavorite_zalouser) {
            if (C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(this.f77132m1.f146385a)) {
                m83820MM(this.f77132m1.f146385a);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.view_detail_zalouser) {
            try {
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                AbstractC23074g2.m118382h(this.f77132m1, c17487o0, 0, C32002l4.m154264g(0));
                if (!C21927m.m114302u().m114345m(this.f77132m1.f146385a)) {
                    C0824j.m2153b(new C14974h(this.f77132m1.m153177a()));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m83794DM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C31874cb c31874cb;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.btn_vip_unfollow && (c31874cb = this.f77132m1) != null) {
            m83822OM(c31874cb.f146385a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m83795EM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C31874cb c31874cb;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.btn_vip_follow && (c31874cb = this.f77132m1) != null) {
            m83832wM(c31874cb.f146385a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m83796FM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C31874cb c31874cb;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.str_remove_uid_hide_message && (c31874cb = this.f77132m1) != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
            this.f72421L0.showDialog(21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m83797GM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m83798HM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.menu_func_delete_recent_item && this.f77132m1 != null) {
            C7960e.m41971c6().m42376e4(this.f77132m1.f146385a);
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.td0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchDiscoverView.this.m83797GM();
                    }
                });
            }
            AbstractC23647d.m123906p("30001171");
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m83799IM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83824QM(this.f77132m1.f146385a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m83800JM(ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        CheckBox checkBox = this.f77141v1;
        if (checkBox != null && checkBox.isChecked()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m83821NM(contactProfile, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m83801KM(String str, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m83825RM(Integer.parseInt(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m83802LM(boolean z11) {
        if (z11) {
            try {
                this.f72421L0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        new AsyncTaskC14979m().execute(String.valueOf(this.f77121b1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m83818yM(View view) {
        CheckBox checkBox = this.f77141v1;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m83819zM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83829tM(this.f77132m1.f146385a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        final ContactProfile m98552o;
        if (i11 != 18) {
            if (i11 != 20) {
                if (i11 != 22) {
                    if (i11 != 23) {
                        switch (i11) {
                            case 1:
                                if (this.f77132m1 == null) {
                                    return null;
                                }
                                ArrayList arrayList = new ArrayList();
                                HashMap hashMap = new HashMap();
                                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.view_detail_zalouser));
                                hashMap.put("id", Integer.valueOf(AbstractC8020f0.view_detail_zalouser));
                                arrayList.add(hashMap);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.addfavorite_zalouser));
                                hashMap2.put("id", Integer.valueOf(AbstractC8020f0.addfavorite_zalouser));
                                arrayList.add(hashMap2);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.cm_removefavorite_zalouser));
                                hashMap3.put("id", Integer.valueOf(AbstractC8020f0.cm_removefavorite_zalouser));
                                arrayList.add(hashMap3);
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.ignore_zalouser));
                                hashMap4.put("id", Integer.valueOf(AbstractC8020f0.ignore_zalouser));
                                arrayList.add(hashMap4);
                                HashMap hashMap5 = new HashMap();
                                hashMap5.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_unblockuser));
                                hashMap5.put("id", Integer.valueOf(AbstractC8020f0.str_optionM_unblockuser));
                                arrayList.add(hashMap5);
                                HashMap hashMap6 = new HashMap();
                                hashMap6.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete_zalouser));
                                hashMap6.put("id", Integer.valueOf(AbstractC8020f0.delete_zalouser));
                                arrayList.add(hashMap6);
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    HashMap hashMap7 = (HashMap) arrayList.get(size);
                                    if (C21927m.m114302u().m114351p() != null) {
                                        if (!C21927m.m114302u().m114351p().contains(this.f77132m1.f146385a)) {
                                            if (((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.cm_removefavorite_zalouser) {
                                                arrayList.remove(size);
                                            }
                                        } else if (((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.addfavorite_zalouser) {
                                            arrayList.remove(size);
                                        }
                                    }
                                    if (C21927m.m114302u().m114312J() != null) {
                                        if (C21927m.m114302u().m114312J().m153137g(this.f77132m1.f146385a)) {
                                            if (((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.ignore_zalouser || ((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.addfavorite_zalouser || ((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.cm_removefavorite_zalouser) {
                                                arrayList.remove(size);
                                            }
                                        } else if (((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.str_optionM_unblockuser) {
                                            arrayList.remove(size);
                                        }
                                    }
                                    if ((AbstractC25495a.m132086k(this.f77132m1.f146385a) || AbstractC25495a.m132078c(this.f77132m1.f146385a)) && (((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.ignore_zalouser || ((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.str_optionM_unblockuser || ((Integer) hashMap7.get("id")).intValue() == AbstractC8020f0.delete_zalouser)) {
                                        arrayList.remove(size);
                                    }
                                }
                                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                                C31874cb c31874cb = this.f77132m1;
                                if (c31874cb != null) {
                                    aVar.m43172u(c31874cb.m153180d(true, false));
                                }
                                aVar.m43173v(100);
                                aVar.m43155d(true);
                                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ud0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83793CM(simpleAdapter, interfaceC17463d, i12);
                                    }
                                });
                                return aVar.m43152a();
                            case 2:
                                if (this.f77132m1 == null) {
                                    return null;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                HashMap hashMap8 = new HashMap();
                                hashMap8.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_unfollow));
                                hashMap8.put("id", Integer.valueOf(AbstractC8020f0.btn_vip_unfollow));
                                arrayList2.add(hashMap8);
                                final SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                                C31874cb c31874cb2 = this.f77132m1;
                                if (c31874cb2 != null) {
                                    aVar2.m43172u(c31874cb2.m153180d(true, false));
                                }
                                aVar2.m43173v(100);
                                aVar2.m43155d(true);
                                aVar2.m43153b(simpleAdapter2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.wd0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83794DM(simpleAdapter2, interfaceC17463d, i12);
                                    }
                                });
                                return aVar2.m43152a();
                            case 3:
                                if (this.f77132m1 == null) {
                                    return null;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                HashMap hashMap9 = new HashMap();
                                hashMap9.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.menu_func_delete_recent_item));
                                hashMap9.put("id", Integer.valueOf(AbstractC8020f0.menu_func_delete_recent_item));
                                arrayList3.add(hashMap9);
                                final SimpleAdapter simpleAdapter3 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList3, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                                C31874cb c31874cb3 = this.f77132m1;
                                if (c31874cb3 != null) {
                                    aVar3.m43172u(c31874cb3.m153180d(true, false));
                                }
                                aVar3.m43173v(100);
                                aVar3.m43155d(true);
                                aVar3.m43153b(simpleAdapter3, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zd0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83798HM(simpleAdapter3, interfaceC17463d, i12);
                                    }
                                });
                                return aVar3.m43152a();
                            case 4:
                                if (this.f77132m1 == null) {
                                    return null;
                                }
                                C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                                aVar4.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unlock_friend)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ae0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83799IM(interfaceC17463d, i12);
                                    }
                                });
                                return aVar4.m43152a();
                            case 5:
                                if (this.f77132m1 == null || (m98552o = C18644n.m98531l().m98552o(this.f77132m1.f146385a)) == null) {
                                    return null;
                                }
                                C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                                aVar5.m43159h(7).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), m98552o.m40420o0())).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.be0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83800JM(m98552o, interfaceC17463d, i12);
                                    }
                                });
                                this.f77141v1 = null;
                                if (AbstractC23309i.m121566Wf()) {
                                    try {
                                        if (!TextUtils.isEmpty(m98552o.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                                            View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
                                            this.f77141v1 = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
                                            C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.getContext(), m98552o.f42455y);
                                            if (m2800f != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                                                String format = String.format("%s (%s)", m2800f.m153299q(), m2800f.m153297j());
                                                String format2 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phone_number_in_contact), format);
                                                int indexOf = format2.indexOf(format);
                                                SpannableString spannableString = new SpannableString(format2);
                                                spannableString.setSpan(new StyleSpan(1), indexOf, format.length() + indexOf, 33);
                                                ((TextView) inflate.findViewById(AbstractC6918a0.tvRemoveContact)).setText(spannableString);
                                                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ce0
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        SearchDiscoverView.this.m83818yM(view);
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
                            case 6:
                                if (this.f77132m1 == null) {
                                    return null;
                                }
                                C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                                aVar6.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_ignore_zalo_user)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_popup), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.qd0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        SearchDiscoverView.this.m83819zM(interfaceC17463d, i12);
                                    }
                                });
                                return aVar6.m43152a();
                            default:
                                return null;
                        }
                    }
                    C8009j.a aVar7 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar7.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f77131l1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.vd0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            SearchDiscoverView.this.m83792BM(interfaceC17463d, i12);
                        }
                    }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
                    return aVar7.m43152a();
                }
                if (this.f77132m1 == null) {
                    return null;
                }
                C8009j.a aVar8 = new C8009j.a(this.f72421L0.m92648SI());
                aVar8.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.rd0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SearchDiscoverView.this.m83791AM(interfaceC17463d, i12);
                    }
                });
                return aVar8.m43152a();
            }
            if (this.f77132m1 == null) {
                return null;
            }
            ArrayList arrayList4 = new ArrayList();
            HashMap hashMap10 = new HashMap();
            hashMap10.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_uid_hide_message));
            hashMap10.put("id", Integer.valueOf(AbstractC8020f0.str_remove_uid_hide_message));
            arrayList4.add(hashMap10);
            final SimpleAdapter simpleAdapter4 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList4, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar9 = new C8009j.a(this.f72421L0.m92648SI());
            C31874cb c31874cb4 = this.f77132m1;
            if (c31874cb4 != null) {
                aVar9.m43172u(c31874cb4.m153180d(true, false));
            }
            aVar9.m43173v(100);
            aVar9.m43155d(true);
            aVar9.m43153b(simpleAdapter4, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yd0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SearchDiscoverView.this.m83796FM(simpleAdapter4, interfaceC17463d, i12);
                }
            });
            return aVar9.m43152a();
        }
        if (this.f77132m1 == null) {
            return null;
        }
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap11 = new HashMap();
        hashMap11.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_follow));
        hashMap11.put("id", Integer.valueOf(AbstractC8020f0.btn_vip_follow));
        arrayList5.add(hashMap11);
        final SimpleAdapter simpleAdapter5 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList5, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar10 = new C8009j.a(this.f72421L0.m92648SI());
        C31874cb c31874cb5 = this.f77132m1;
        if (c31874cb5 != null) {
            aVar10.m43172u(c31874cb5.m153180d(true, false));
        }
        aVar10.m43173v(100);
        aVar10.m43155d(true);
        aVar10.m43153b(simpleAdapter5, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.xd0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SearchDiscoverView.this.m83795EM(simpleAdapter5, interfaceC17463d, i12);
            }
        });
        return aVar10.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_item_pager, viewGroup, false);
        new Handler().postDelayed(this.f88750Q, 1000L);
        return inflate;
    }

    /* renamed from: MM */
    void m83820MM(String str) {
        if (this.f77143x1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14976j(str));
        this.f77143x1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1563W5(arrayList);
    }

    /* renamed from: NM */
    void m83821NM(ContactProfile contactProfile, boolean z11) {
        if (this.f77144y1) {
            return;
        }
        String str = contactProfile.f42434r;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14977k(str, contactProfile, z11));
        this.f77144y1 = true;
        c0766k.mo1791z6(str, 27);
    }

    /* renamed from: OM */
    void m83822OM(final String str) {
        try {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc);
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(7);
            aVar.m43155d(true);
            aVar.m43171t(AbstractC8020f0.str_title_popup_unfollow_oa);
            aVar.m43173v(2);
            aVar.m43162k(m118743r0);
            aVar.m43169r(AbstractC8020f0.str_button_yes_unfollow, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sd0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    SearchDiscoverView.this.m83801KM(str, interfaceC17463d, i11);
                }
            });
            aVar.m43164m(AbstractC8020f0.str_button_no_unfollow, new InterfaceC17463d.b());
            C8009j m43152a = aVar.m43152a();
            this.f77133n1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    void m83823PM(List list, int i11, int i12) {
        if (AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C14972f(new ArrayList(list), i11, i12));
    }

    /* renamed from: QM */
    void m83824QM(String str) {
        if (this.f77094A1) {
            return;
        }
        C31874cb c31874cb = this.f77132m1;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14967a(str, c31874cb));
        this.f77094A1 = true;
        c0766k.mo1448Ha(str, 14);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            if (this.f77140u1 != null) {
                C28685a.m143693b(this.f72421L0.m92648SI()).m143697e(this.f77140u1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    void m83825RM(int i11) {
        try {
            if (this.f77095B1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14968b(i11));
            this.f77095B1 = true;
            c0766k.mo1766w6(i11, new TrackingSource(-1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    void m83826SM(final boolean z11) {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pd0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDiscoverView.this.m83802LM(z11);
                }
            });
        }
    }

    /* renamed from: TM */
    public void m83827TM(ContactProfile contactProfile) {
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
                m83828sM(contactProfile);
            }
        } catch (Exception unused) {
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f77090M1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 10099 && i12 == -1 && intent != null && intent.getExtras() != null) {
            AbstractC23074g2.m118375a(0, intent.getExtras().getString("result.accept_friend_uid", ""), String.valueOf(this.f77125f1), 0);
            m83826SM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        new Handler().post(this.f88750Q);
    }

    /* renamed from: sM */
    public void m83828sM(ContactProfile contactProfile) {
        if (this.f77101H1) {
            return;
        }
        String str = contactProfile.f42434r;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f77101H1 = true;
        this.f77102I1.mo1704o8(new C14970d(str, contactProfile));
        this.f77102I1.mo1497O3(str);
    }

    /* renamed from: tM */
    void m83829tM(String str) {
        if (this.f77145z1) {
            return;
        }
        C31874cb c31874cb = this.f77132m1;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14978l(str, c31874cb));
        this.f77145z1 = true;
        c0766k.mo1479L9(str, 14);
    }

    /* renamed from: uM */
    void m83830uM(String str) {
        if (this.f77142w1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14975i(str));
        this.f77142w1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1653h8(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x012d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0005, B:12:0x0019, B:14:0x001d, B:17:0x002d, B:19:0x0033, B:21:0x0043, B:28:0x004e, B:30:0x0052, B:32:0x005a, B:34:0x005e, B:35:0x0060, B:41:0x0072, B:43:0x007c, B:45:0x0086, B:50:0x0149, B:51:0x008b, B:53:0x008f, B:55:0x0095, B:58:0x009a, B:60:0x00a6, B:62:0x00ac, B:64:0x00b4, B:66:0x00c2, B:68:0x0125, B:70:0x012d, B:71:0x00d7, B:73:0x00f9, B:74:0x00fd, B:76:0x0106, B:77:0x010a, B:80:0x0119, B:84:0x013a, B:86:0x0140, B:91:0x014f, B:93:0x0153, B:94:0x015a, B:97:0x0026, B:98:0x0012), top: B:2:0x0005 }] */
    /* renamed from: vM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83831vM(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        C32020m7 c32020m7;
        int i13;
        String str;
        int i14;
        int i15;
        C23669z c23669z;
        C31973j5 c31973j5;
        int i16 = 3;
        try {
            if (AbstractC23309i.m120962G3(3) != 1) {
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
            C0855y0 c0855y0 = this.f77105L1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            int i17 = 0;
            while (i17 < size) {
                if (list.get(i17) != null && (c32020m7 = (C32020m7) list.get(i17)) != null && (i13 = c32020m7.f147410a) != 1 && i13 != 2) {
                    C31874cb c31874cb = null;
                    if (i13 == i16 && (c31973j5 = c32020m7.f147413d) != null) {
                        str = c31973j5.m153781r();
                    } else {
                        str = null;
                    }
                    if (i13 == 0 && (c31874cb = c32020m7.f147412c) != null) {
                        str = c31874cb.f146385a;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (i17 >= i11 && i17 <= i12) {
                            String valueOf = String.valueOf(i17);
                            if (m2385c.containsKey(str)) {
                                C23669z c23669z2 = (C23669z) m2385c.get(str);
                                if (c23669z2 instanceof C23651h) {
                                    C23651h c23651h = (C23651h) c23669z2;
                                    if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l() && !c23669z2.f114660g) {
                                        c23669z2.f114660g = true;
                                        if (c23651h.f114659f[2].equals(valueOf)) {
                                            String str2 = c23651h.f114659f[c11];
                                            if (str2 == null || str2.isEmpty()) {
                                                str2 = "1";
                                            }
                                            c23651h.f114659f[c11] = String.valueOf(Integer.parseInt(str2) + 1);
                                        } else {
                                            c23669z2.f114656c = System.currentTimeMillis();
                                            c23651h.f114659f[0] = String.valueOf(1);
                                            c23651h.f114659f[2] = valueOf;
                                        }
                                    }
                                }
                                c23669z = (C23669z) m2385c.get(str);
                                if (c23669z != null) {
                                    C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z);
                                }
                            } else {
                                String[] strArr = new String[7];
                                strArr[0] = String.valueOf(1);
                                strArr[1] = str;
                                strArr[2] = valueOf;
                                strArr[3] = String.valueOf(this.f77121b1);
                                strArr[4] = String.valueOf(this.f77125f1);
                                if (c31874cb != null) {
                                    i14 = c31874cb.f146399o;
                                } else {
                                    i14 = 0;
                                }
                                strArr[5] = String.valueOf(i14);
                                if (c31874cb != null) {
                                    i15 = c31874cb.f146389e;
                                } else {
                                    i15 = 0;
                                }
                                strArr[6] = String.valueOf(i15);
                                C23651h m123961i = C23651h.m123961i(2, strArr);
                                if (m123961i != null) {
                                    m123961i.f114654a = 3;
                                    m123961i.f114655b = 1;
                                    m123961i.f114657d = 2;
                                    m123961i.f114660g = true;
                                    m2385c.put(str, m123961i);
                                    c23669z = (C23669z) m2385c.get(str);
                                    if (c23669z != null) {
                                    }
                                }
                            }
                        } else if (m2385c.containsKey(str)) {
                            ((C23669z) m2385c.get(str)).f114660g = false;
                            i17++;
                            i16 = 3;
                            c11 = 0;
                        }
                        i17++;
                        i16 = 3;
                        c11 = 0;
                    }
                }
                i17++;
                i16 = 3;
                c11 = 0;
            }
            if (this.f77105L1 == null) {
                this.f77105L1 = new C0855y0();
            }
            this.f77105L1.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    void m83832wM(String str) {
        try {
            if (this.f77096C1) {
                return;
            }
            C31874cb c31874cb = this.f77132m1;
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14969c(str, c31874cb));
            this.f77096C1 = true;
            c0766k.mo1578Y4(Integer.parseInt(str), new TrackingSource(273));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
    }

    /* renamed from: xM */
    void m83833xM() {
        JSONObject jSONObject;
        if (this.f77129j1) {
            this.f77129j1 = false;
            new AsyncTaskC14979m().execute(String.valueOf(this.f77121b1));
            return;
        }
        if (this.f77103J1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14971e());
        this.f77103J1 = true;
        if (this.f77126g1 < 1) {
            String m122233o4 = AbstractC23309i.m122233o4();
            if (!TextUtils.isEmpty(m122233o4)) {
                try {
                    JSONArray optJSONArray = new JSONObject(m122233o4).optJSONArray("discover");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            try {
                                jSONObject = optJSONArray.getJSONObject(i11);
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            if (jSONObject.optInt("discoverId", -1) == this.f77125f1) {
                                this.f77126g1 = jSONObject.optInt("currentPage", 1);
                                break;
                            }
                            continue;
                        }
                    }
                } catch (JSONException e12) {
                    e12.printStackTrace();
                }
            }
        }
        int i12 = this.f77126g1;
        if (i12 <= 0) {
            i12 = 1;
        }
        this.f77126g1 = i12;
        String str = "0";
        try {
            List list = this.f77136q1;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f77136q1);
                int size = arrayList.size();
                if (size > 0) {
                    int i13 = size - 1;
                    if (arrayList.get(i13) != null && ((C32020m7) arrayList.get(i13)).f147412c != null && !TextUtils.isEmpty(((C32020m7) arrayList.get(i13)).f147412c.f146385a)) {
                        str = ((C32020m7) arrayList.get(i13)).f147412c.f146385a;
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList(((C32072q1) C21927m.f107775T.get(String.valueOf(this.f77125f1))).f147678j);
                int size2 = arrayList2.size();
                if (size2 > 0) {
                    int i14 = size2 - 1;
                    if (arrayList2.get(i14) != null && ((C32020m7) arrayList2.get(i14)).f147412c != null && !TextUtils.isEmpty(((C32020m7) arrayList2.get(i14)).f147412c.f146385a)) {
                        str = ((C32020m7) arrayList2.get(i14)).f147412c.f146385a;
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        c0766k.mo1710p6(this.f77125f1, this.f77126g1, AbstractC23006a0.m117905e(), str);
    }
}
