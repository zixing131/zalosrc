package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0939u;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import ck.C3565f;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.ViewOnClickListenerC7161o4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.UserOANearbyZView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23181q;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3544l;
import p111du.AbstractC18069a;
import p172fy.C19171b;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23669z;
import p510sq.C26365a;
import p604wb.C28905e;
import p716zh.C31965ic;
import p716zh.C32002l4;
import vg.AbstractC28248z6;
import vg.C28139n5;
import vg.C28203u6;
import vg.C28239y6;

/* loaded from: classes6.dex */
public class UserOANearbyZView extends BaseZaloView implements View.OnClickListener, ViewOnClickListenerC7161o4.b, InterfaceC17463d.d, ViewOnClickListenerC7161o4.f, InterfaceC0733x {

    /* renamed from: M0 */
    View f79230M0;

    /* renamed from: N0 */
    SwipeRefreshListView f79231N0;

    /* renamed from: O0 */
    ListView f79232O0;

    /* renamed from: P0 */
    View f79233P0;

    /* renamed from: Q0 */
    TextView f79234Q0;

    /* renamed from: R0 */
    MultiStateView f79235R0;

    /* renamed from: S0 */
    View f79236S0;

    /* renamed from: T0 */
    TextView f79237T0;

    /* renamed from: U0 */
    View f79238U0;

    /* renamed from: V0 */
    LinearLayout f79239V0;

    /* renamed from: W0 */
    LinearLayout f79240W0;

    /* renamed from: X0 */
    FrameLayout f79241X0;

    /* renamed from: Z0 */
    boolean f79243Z0;

    /* renamed from: a1 */
    boolean f79244a1;

    /* renamed from: b1 */
    boolean f79245b1;

    /* renamed from: e1 */
    int f79248e1;

    /* renamed from: f1 */
    int f79249f1;

    /* renamed from: g1 */
    boolean f79250g1;

    /* renamed from: h1 */
    boolean f79251h1;

    /* renamed from: i1 */
    boolean f79252i1;

    /* renamed from: o1 */
    InterfaceC0765j f79258o1;

    /* renamed from: p1 */
    ViewOnClickListenerC7161o4 f79259p1;

    /* renamed from: q1 */
    C23528a f79260q1;

    /* renamed from: t1 */
    double f79263t1;

    /* renamed from: u1 */
    double f79264u1;

    /* renamed from: Y0 */
    boolean f79242Y0 = false;

    /* renamed from: c1 */
    boolean f79246c1 = true;

    /* renamed from: d1 */
    int f79247d1 = -1;

    /* renamed from: j1 */
    WeakHashMap f79253j1 = new WeakHashMap();

    /* renamed from: k1 */
    List f79254k1 = new ArrayList();

    /* renamed from: l1 */
    List f79255l1 = new ArrayList();

    /* renamed from: m1 */
    List f79256m1 = new ArrayList();

    /* renamed from: n1 */
    Handler f79257n1 = new Handler();

    /* renamed from: r1 */
    int f79261r1 = 1;

    /* renamed from: s1 */
    boolean f79262s1 = true;

    /* renamed from: v1 */
    boolean f79265v1 = false;

    /* renamed from: w1 */
    C0855y0 f79266w1 = new C0855y0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$a */
    /* loaded from: classes6.dex */
    public class C15327a implements AbsListView.OnScrollListener {
        C15327a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            LinearLayout linearLayout;
            List list;
            try {
                try {
                    UserOANearbyZView userOANearbyZView = UserOANearbyZView.this;
                    if (!userOANearbyZView.f79243Z0) {
                        userOANearbyZView.m86461kM(i11, i12 + i11);
                        return;
                    }
                    int i14 = i11 + i12;
                    if (i14 >= i13 - 1 && userOANearbyZView.f79242Y0 && !userOANearbyZView.f79252i1 && (linearLayout = userOANearbyZView.f79240W0) != null && linearLayout.getVisibility() != 0 && (list = UserOANearbyZView.this.f79256m1) != null && list.size() > 0 && UserOANearbyZView.this.f79256m1.size() < 500) {
                        UserOANearbyZView.this.f79241X0.setVisibility(0);
                        UserOANearbyZView userOANearbyZView2 = UserOANearbyZView.this;
                        int i15 = userOANearbyZView2.f79261r1 + 1;
                        userOANearbyZView2.f79261r1 = i15;
                        if (i15 < 5) {
                            AbstractC23647d.m123907q("5350", "");
                            UserOANearbyZView userOANearbyZView3 = UserOANearbyZView.this;
                            userOANearbyZView3.f79242Y0 = true;
                            userOANearbyZView3.m86466wM();
                            AbstractC23647d.m123893c();
                        } else if (i15 == 5) {
                            userOANearbyZView2.f79242Y0 = false;
                            userOANearbyZView2.m86466wM();
                        }
                    }
                    UserOANearbyZView userOANearbyZView4 = UserOANearbyZView.this;
                    if (!userOANearbyZView4.f79242Y0) {
                        userOANearbyZView4.f79241X0.setVisibility(8);
                    }
                    UserOANearbyZView.this.m86461kM(i11, i14);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    UserOANearbyZView.this.m86461kM(i11, i12 + i11);
                }
            } catch (Throwable th2) {
                UserOANearbyZView.this.m86461kM(i11, i12 + i11);
                throw th2;
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    UserOANearbyZView.this.f79259p1.m36434d(false);
                    UserOANearbyZView.this.f79259p1.notifyDataSetChanged();
                } else {
                    UserOANearbyZView.this.f79259p1.m36434d(true);
                    UserOANearbyZView.this.f79259p1.notifyDataSetChanged();
                    UserOANearbyZView.this.f79231N0.m88202K();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$b */
    /* loaded from: classes6.dex */
    public class C15328b extends AbstractC28248z6.f {
        C15328b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m86472d() {
            UserOANearbyZView.this.m86463mM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86473e() {
            if (new C28239y6().m142223b(UserOANearbyZView.this.f72421L0.m92648SI()) == 1 && UserOANearbyZView.this.f72421L0.m92672lJ() && !UserOANearbyZView.this.f72421L0.m92679oJ()) {
                UserOANearbyZView.this.m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_cannot_get_location), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                UserOANearbyZView.this.f72421L0.removeDialog(5);
                UserOANearbyZView.this.f72421L0.showDialog(5);
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            try {
                if (location != null) {
                    C28139n5.m141620j().m141636h();
                    UserOANearbyZView.this.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.t21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserOANearbyZView.C15328b.this.m86472d();
                        }
                    }, 100L);
                } else {
                    UserOANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.u21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserOANearbyZView.C15328b.this.m86473e();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            UserOANearbyZView.this.f79251h1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$c */
    /* loaded from: classes6.dex */
    public class C15329c implements InterfaceC20094a {
        C15329c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86476e(int i11) {
            UserOANearbyZView.this.m86455DM(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86477f() {
            UserOANearbyZView.this.f79231N0.setRefreshing(false);
            UserOANearbyZView.this.f79231N0.setVisibility(8);
            UserOANearbyZView.this.m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_user_oa), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (UserOANearbyZView.this.m92674mJ()) {
                UserOANearbyZView.this.m86465oM(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            UserOANearbyZView userOANearbyZView = UserOANearbyZView.this;
            boolean z12 = false;
            userOANearbyZView.f79252i1 = false;
            if (userOANearbyZView.m92674mJ()) {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    final int i11 = jSONObject.getInt("error_code");
                    if (i11 == 0) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("filter_cond");
                        if (jSONObject3 != null) {
                            UserOANearbyZView.this.f79247d1 = AbstractC18069a.m96085d(jSONObject3, "findGender");
                            UserOANearbyZView.this.f79248e1 = AbstractC18069a.m96085d(jSONObject3, "ageFrom");
                            UserOANearbyZView.this.f79249f1 = AbstractC18069a.m96085d(jSONObject3, "ageTo");
                            int i12 = UserOANearbyZView.this.f79247d1;
                            if (i12 == 2) {
                                i12 = -1;
                            }
                            AbstractC23309i.m122253oo(i12);
                            if (jSONObject3.has("advanced_setting")) {
                                UserOANearbyZView userOANearbyZView2 = UserOANearbyZView.this;
                                if (jSONObject3.getInt("advanced_setting") == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                userOANearbyZView2.f79246c1 = z11;
                            }
                        }
                        if (jSONObject2.has("oa_empty")) {
                            UserOANearbyZView userOANearbyZView3 = UserOANearbyZView.this;
                            if (jSONObject2.getInt("oa_empty") != 0) {
                                z12 = true;
                            }
                            userOANearbyZView3.f79243Z0 = z12;
                        }
                        if (jSONObject2.has("oa_lmore")) {
                            UserOANearbyZView.this.f79245b1 = jSONObject2.getBoolean("oa_lmore");
                        }
                        if (jSONObject2.has("user_lmore")) {
                            UserOANearbyZView.this.f79244a1 = jSONObject2.getBoolean("user_lmore");
                        }
                        UserOANearbyZView.this.m86468yM(jSONObject2);
                        UserOANearbyZView.this.m86469zM(jSONObject2);
                        UserOANearbyZView.this.m86459HM();
                        return;
                    }
                    UserOANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserOANearbyZView.C15329c.this.m86476e(i11);
                        }
                    });
                } catch (Exception unused) {
                    UserOANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserOANearbyZView.C15329c.this.m86477f();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$d */
    /* loaded from: classes6.dex */
    public class C15330d implements InterfaceC20094a {
        C15330d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86480e(int i11) {
            UserOANearbyZView.this.m86455DM(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86481f() {
            UserOANearbyZView.this.f79231N0.setRefreshing(false);
            UserOANearbyZView.this.f79231N0.setVisibility(8);
            UserOANearbyZView.this.f79239V0.setVisibility(0);
            UserOANearbyZView.this.f79240W0.setVisibility(8);
            UserOANearbyZView.this.m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (UserOANearbyZView.this.m92674mJ()) {
                UserOANearbyZView.this.m86465oM(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            UserOANearbyZView userOANearbyZView = UserOANearbyZView.this;
            userOANearbyZView.f79252i1 = false;
            if (userOANearbyZView.m92674mJ()) {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    final int i11 = jSONObject.getInt("error_code");
                    if (i11 == 0) {
                        UserOANearbyZView.this.m86469zM(jSONObject2);
                        UserOANearbyZView.this.m86459HM();
                    } else {
                        UserOANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x21
                            @Override // java.lang.Runnable
                            public final void run() {
                                UserOANearbyZView.C15330d.this.m86480e(i11);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    UserOANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.y21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserOANearbyZView.C15330d.this.m86481f();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$e */
    /* loaded from: classes6.dex */
    public class C15331e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79271a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f79272b;

        /* renamed from: com.zing.zalo.ui.zviews.UserOANearbyZView$e$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f79274a;

            a(ContactProfile contactProfile) {
                this.f79274a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f79274a);
            }
        }

        C15331e(String str, ContactProfile contactProfile) {
            this.f79271a = str;
            this.f79272b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m86483d() {
            UserOANearbyZView.this.f79259p1.notifyDataSetChanged();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (UserOANearbyZView.this.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                UserOANearbyZView userOANearbyZView = UserOANearbyZView.this;
                userOANearbyZView.f79265v1 = false;
                userOANearbyZView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            ContactProfile contactProfile;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f79271a);
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        if (m141809c == null && (contactProfile = this.f79272b) != null) {
                            contactProfile.f42447v0 = contactProfile.f42352K0;
                            m141809c = contactProfile;
                        } else if (m141809c != null) {
                            m141809c.f42447v0 = m141809c.f42352K0;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f79271a)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f79271a)).m153681a();
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
                            if (!C21927m.m114302u().m114357s().m153137g(this.f79271a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f79271a) != null) {
                                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(this.f79271a);
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
                        c28203u6.m141806D(this.f79271a, false);
                        if (!TextUtils.isEmpty(this.f79271a)) {
                            AbstractC23181q.m119431d(this.f79271a, true);
                        }
                        UserOANearbyZView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.z21
                            @Override // java.lang.Runnable
                            public final void run() {
                                UserOANearbyZView.C15331e.this.m86483d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                UserOANearbyZView.this.mo78960q3();
                UserOANearbyZView.this.f79265v1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m86445pM(int i11) {
        String m118743r0;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            boolean z11 = false;
            this.f79231N0.setRefreshing(false);
            this.f79235R0.setVisibility(8);
            this.f79239V0.setVisibility(0);
            this.f79240W0.setVisibility(8);
            if (i11 == 50001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                z11 = true;
            } else if (i11 == 402) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby);
                removeDialog(4);
                showDialog(4);
            } else if (i11 == 21000) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.warning_mock_location_detected);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_user_oa);
            }
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
            if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() == 0) {
                if (z11) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                m86456EM(m118743r0, enumC15915f);
                this.f79231N0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m86446qM() {
        AbstractC23034c6.m118184v0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m86447rM() {
        AbstractC23647d.m123907q("5370", "");
        this.f79242Y0 = true;
        this.f79261r1 = 1;
        this.f79262s1 = true;
        this.f79236S0.setVisibility(8);
        m86453BM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m86448sM() {
        if (!C23055e5.m118271f()) {
            this.f79231N0.setRefreshing(false);
            this.f79231N0.m88209V();
            return;
        }
        AbstractC23647d.m123907q("5330", "");
        this.f79231N0.m88202K();
        this.f79261r1 = 1;
        this.f79242Y0 = true;
        m86463mM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m86449tM(View view) {
        m86466wM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m86450uM(int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            this.f79231N0.setRefreshing(false);
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_error_user_oa;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i12);
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.NEARBY_ERROR;
            }
            m86456EM(m118743r0, enumC15915f);
            this.f79239V0.setVisibility(0);
            this.f79240W0.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m86451vM() {
        if (this.f79246c1) {
            m86460IM();
        } else if (this.f79232O0.getHeaderViewsCount() > 0) {
            this.f79232O0.removeHeaderView(this.f79233P0);
        }
        this.f79231N0.setRefreshing(false);
        this.f79239V0.setVisibility(8);
        this.f79240W0.setVisibility(8);
        if (this.f79253j1.size() > 0) {
            this.f79231N0.setVisibility(0);
            for (int i11 = 0; i11 < this.f79254k1.size(); i11++) {
                this.f79256m1.add(new C3544l(0, (ContactProfile) this.f79254k1.get(i11)));
            }
            if (!this.f79243Z0) {
                if (this.f79244a1) {
                    this.f79256m1.add(new C3544l(1));
                }
                if (this.f79255l1.size() > 0) {
                    this.f79256m1.add(new C3544l(3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_place)));
                    for (int i12 = 0; i12 < this.f79255l1.size(); i12++) {
                        this.f79256m1.add(new C3544l(2, (C3565f) this.f79255l1.get(i12)));
                    }
                    if (this.f79245b1) {
                        this.f79256m1.add(new C3544l(4));
                    }
                }
                this.f79232O0.removeFooterView(this.f79238U0);
            }
            this.f79235R0.setVisibility(8);
            this.f79231N0.setVisibility(0);
            this.f79259p1.m36431a(this.f79256m1);
            this.f79259p1.notifyDataSetChanged();
            return;
        }
        if (this.f79246c1) {
            this.f79236S0.setVisibility(0);
        }
        this.f79231N0.setVisibility(8);
        m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_result_user_oa), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
    }

    /* renamed from: AM */
    public void m86452AM() {
        try {
            this.f79242Y0 = true;
            C28239y6 c28239y6 = new C28239y6();
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
            if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() == 0 && !c28239y6.m142222a(m92648SI())) {
                removeDialog(3);
                showDialog(3);
            } else {
                m86463mM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BM */
    void m86453BM() {
        if (m92648SI() != null && AbstractC23034c6.m118165m(m92648SI(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            this.f79257n1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.m21
                @Override // java.lang.Runnable
                public final void run() {
                    UserOANearbyZView.this.m86446qM();
                }
            }, 500L);
            m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.no_permission_general), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        } else {
            m86464nM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f79260q1 = new C23528a(m92648SI());
        this.f79242Y0 = true;
    }

    /* renamed from: CM */
    void m86454CM() {
        MultiStateView multiStateView = (MultiStateView) this.f79230M0.findViewById(AbstractC6918a0.multi_state);
        this.f79235R0 = multiStateView;
        multiStateView.setEnableLoadingText(true);
        this.f79235R0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.o21
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                UserOANearbyZView.this.m86447rM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f79230M0.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f79231N0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.p21
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                UserOANearbyZView.this.m86448sM();
            }
        });
        this.f79231N0.m35371s(false, 0, AbstractC23136l9.m118655I(AbstractC16802y.func_bar_general_h) + AbstractC23136l9.m118742r(10.0f));
        if (this.f79232O0 == null) {
            this.f79232O0 = this.f79231N0.f83579m0;
        }
        this.f79232O0.setOnScrollListener(new C15327a());
        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.footer_loading, (ViewGroup) null, false);
        this.f79238U0 = inflate;
        this.f79241X0 = (FrameLayout) inflate.findViewById(AbstractC6918a0.layoutFeedFooter);
        this.f79239V0 = (LinearLayout) this.f79238U0.findViewById(AbstractC6918a0.layoutFeedFooterError);
        this.f79240W0 = (LinearLayout) this.f79238U0.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
        this.f79241X0.setVisibility(8);
        this.f79239V0.setVisibility(8);
        this.f79240W0.setVisibility(8);
        this.f79239V0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.q21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserOANearbyZView.this.m86449tM(view);
            }
        });
        this.f79232O0.addFooterView(this.f79238U0);
        View findViewById = this.f79230M0.findViewById(AbstractC6918a0.user_settings_layout);
        this.f79236S0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f79236S0.findViewById(AbstractC6918a0.btn_advanced_settings).setOnClickListener(this);
        this.f79236S0.setVisibility(8);
        this.f79237T0 = (TextView) this.f79236S0.findViewById(AbstractC6918a0.txt_filter_by);
        View inflate2 = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.header_nearby_settings_layout, (ViewGroup) this.f79232O0, false);
        this.f79233P0 = inflate2;
        this.f79234Q0 = (TextView) inflate2.findViewById(AbstractC6918a0.txt_filter_by);
        this.f79233P0.findViewById(AbstractC6918a0.btn_advanced_settings).setOnClickListener(this);
        this.f79233P0.setOnClickListener(this);
        this.f79232O0.addHeaderView(this.f79233P0);
        if (this.f79259p1 == null) {
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = new ViewOnClickListenerC7161o4(m92648SI(), this.f79260q1, this.f79256m1);
            this.f79259p1 = viewOnClickListenerC7161o4;
            viewOnClickListenerC7161o4.m36432b(this);
            this.f79259p1.m36433c(this);
            this.f79232O0.setAdapter((ListAdapter) this.f79259p1);
            this.f79232O0.setSelection(0);
            if (this.f79259p1.getCount() > 0) {
                this.f79235R0.setVisibility(8);
                this.f79231N0.setVisibility(0);
            } else {
                this.f79231N0.setVisibility(8);
                m86457FM();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j c8009j = null;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return null;
                }
                try {
                    if (!AbstractC23309i.m121488Ub()) {
                        return null;
                    }
                    return AbstractC23093i.m118457j(m92648SI(), this);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9));
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.warning_location_invalid_dob));
                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
                aVar.m43169r(AbstractC8020f0.update, this);
                return aVar.m43152a();
            } catch (Exception e12) {
                e12.printStackTrace();
                return null;
            }
        }
        try {
            C8009j.a aVar2 = new C8009j.a(m92648SI());
            aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.ask_to_enable_gps)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title), this);
            c8009j = aVar2.m43152a();
            c8009j.m92874z(false);
            return c8009j;
        } catch (Exception e13) {
            e13.printStackTrace();
            return c8009j;
        }
    }

    /* renamed from: DM */
    void m86455DM(final int i11) {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.r21
                @Override // java.lang.Runnable
                public final void run() {
                    UserOANearbyZView.this.m86450uM(i11);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: EM */
    void m86456EM(String str, MultiStateView.EnumC15915f enumC15915f) {
        MultiStateView multiStateView = this.f79235R0;
        if (multiStateView != null) {
            boolean z11 = false;
            multiStateView.setVisibility(0);
            this.f79235R0.setErrorTitleString(str);
            MultiStateView multiStateView2 = this.f79235R0;
            if (enumC15915f == MultiStateView.EnumC15915f.NETWORK_ERROR) {
                z11 = true;
            }
            multiStateView2.setEnableImageErrorView(z11);
            this.f79235R0.setState(MultiStateView.EnumC15914e.ERROR);
            this.f79235R0.setErrorType(enumC15915f);
        }
    }

    /* renamed from: FM */
    void m86457FM() {
        MultiStateView multiStateView = this.f79235R0;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            this.f79235R0.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f79230M0 = layoutInflater.inflate(AbstractC7409c0.user_oa_view, viewGroup, false);
        m86454CM();
        return this.f79230M0;
    }

    /* renamed from: GM */
    public void m86458GM() {
        if (!this.f79250g1) {
            this.f79250g1 = true;
            m92650VI().m92662fJ().m93066i2(UserNearbySettingsView.class, null, 10, 1, true);
        }
    }

    /* renamed from: HM */
    void m86459HM() {
        this.f79257n1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.s21
            @Override // java.lang.Runnable
            public final void run() {
                UserOANearbyZView.this.m86451vM();
            }
        });
    }

    /* renamed from: IM */
    public void m86460IM() {
        StringBuilder sb2;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_label_onlym);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_label_onlyf);
        int i11 = this.f79247d1;
        if (i11 == 1) {
            m118743r0 = m118743r02;
        } else if (i11 != 0) {
            m118743r0 = m118743r0 + " - " + m118743r02;
        }
        if (this.f79248e1 == this.f79249f1) {
            sb2 = new StringBuilder();
            sb2.append(this.f79248e1);
            sb2.append("");
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f79248e1);
            sb2.append(" - ");
            sb2.append(this.f79249f1);
        }
        String sb3 = sb2.toString();
        String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_filter_by_string), m118743r0 + ", " + sb3);
        this.f79234Q0.setText(format);
        this.f79234Q0.setVisibility(0);
        this.f79237T0.setText(format);
        this.f79233P0.setVisibility(0);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 3) {
                if (mo92862f != 4) {
                    if (mo92862f == 5) {
                        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        interfaceC17463d.dismiss();
                    }
                } else if (i11 == -1) {
                    m86467xM();
                    interfaceC17463d.dismiss();
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    if (m92650VI() != null) {
                        m92650VI().finish();
                    }
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserOANearbyZView";
    }

    /* renamed from: kM */
    public void m86461kM(int i11, int i12) {
        HashMap m2385c;
        int i13;
        ContactProfile m18011a;
        View childAt;
        try {
            C0855y0 c0855y0 = this.f79266w1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            HashMap hashMap = m2385c;
            int height = this.f79232O0.getHeight();
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
            if (viewOnClickListenerC7161o4 != null) {
                i13 = viewOnClickListenerC7161o4.getCount();
            } else {
                i13 = 0;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                try {
                    C3544l c3544l = (C3544l) this.f79259p1.getItem(i15);
                    if (c3544l != null && c3544l.m18014d() == 0 && (m18011a = c3544l.m18011a()) != null && m18011a.f42350J1 != -1 && !TextUtils.isEmpty(m18011a.f42434r)) {
                        if (i15 >= i11 && i15 <= i12) {
                            try {
                                if ((!hashMap.containsKey(m18011a.f42434r) || !((C23669z) hashMap.get(m18011a.f42434r)).f114660g) && (childAt = this.f79232O0.getChildAt(i15)) != null) {
                                    if (i14 <= 0) {
                                        i14 = (int) (childAt.getHeight() * 0.8f);
                                    }
                                    if (childAt.getTop() + childAt.getBottom() > i14 && height - childAt.getTop() > i14 && m18011a.f42350J1 != -1) {
                                        C28905e.m144373n().m144399u(String.valueOf(m18011a.f42350J1), 10, 96, m18011a.f42376S0, System.currentTimeMillis(), m18011a.f42422m0);
                                        if (hashMap.containsKey(m18011a.f42434r) && !((C23669z) hashMap.get(m18011a.f42434r)).f114660g) {
                                            ((C23669z) hashMap.get(m18011a.f42434r)).f114660g = true;
                                        } else {
                                            C23669z c23669z = new C23669z();
                                            c23669z.f114660g = true;
                                            hashMap.put(m18011a.f42434r, c23669z);
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        } else if (hashMap.containsKey(m18011a.f42434r)) {
                            ((C23669z) hashMap.get(m18011a.f42434r)).f114660g = false;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (this.f79266w1 == null) {
                this.f79266w1 = new C0855y0();
            }
            this.f79266w1.m2386d(hashMap);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m86462lM(ContactProfile contactProfile) {
        try {
            if (this.f79265v1) {
                return;
            }
            String str = contactProfile.f42434r;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15331e(str, contactProfile));
            this.f79265v1 = true;
            c0766k.mo1578Y4(Integer.parseInt(str), new TrackingSource(273));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m86463mM() {
        int i11;
        try {
            if (this.f79252i1) {
                return;
            }
            this.f79253j1.clear();
            this.f79256m1.clear();
            this.f79254k1.clear();
            this.f79255l1.clear();
            this.f79236S0.setVisibility(8);
            this.f79235R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby));
            this.f79235R0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_location));
            if (this.f79262s1) {
                m86457FM();
            }
            this.f79262s1 = false;
            if (this.f79258o1 == null) {
                this.f79258o1 = new C0766k();
            }
            this.f79258o1.mo1704o8(new C15329c());
            this.f79252i1 = true;
            this.f79247d1 = AbstractC23309i.m122081k4();
            this.f79263t1 = C28139n5.m141620j().m141645r();
            this.f79264u1 = C28139n5.m141620j().m141640m();
            SensitiveData sensitiveData = new SensitiveData("wifi_get_connection_info_on_search_nearby", "search_nearby");
            InterfaceC0765j interfaceC0765j = this.f79258o1;
            double d11 = this.f79263t1;
            double d12 = this.f79264u1;
            String valueOf = String.valueOf(C28139n5.m141620j().m141637i());
            String str = "" + C28139n5.m141620j().m141646s();
            String str2 = "" + C28139n5.m141620j().m141647t();
            String str3 = "" + C28139n5.m141620j().m141639l();
            String m141648u = C28139n5.m141620j().m141648u(sensitiveData);
            int i12 = this.f79247d1;
            if (i12 == 1) {
                i11 = 1;
            } else if (i12 == 0) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            interfaceC0765j.mo1447H9(d11, d12, valueOf, str, str2, str3, m141648u, 0, i11, C28139n5.m141620j().m141643p());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.b
    /* renamed from: n */
    public void mo36435n(int i11) {
        try {
            C3544l c3544l = (C3544l) this.f79259p1.getItem(i11);
            if (c3544l.m18014d() == 0) {
                ContactProfile m18011a = c3544l.m18011a();
                AbstractC23647d.m123907q("5360", "");
                ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
                if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() > 0) {
                    TrackingSource trackingSource = new TrackingSource(80);
                    trackingSource.m40677a("idx", Integer.valueOf(i11));
                    C21927m.m114302u().m114330e0(m18011a.f42434r, trackingSource);
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(m18011a.f42434r, C32002l4.m154264g(30)).m135739F("5360").m135744c(m18011a).m135743b(), 0, 1));
                }
                AbstractC23647d.m123893c();
                if (m18011a != null && m18011a.f42350J1 != -1) {
                    C28905e.m144373n().m144399u(String.valueOf(m18011a.f42350J1), 20, 96, m18011a.f42376S0, System.currentTimeMillis(), m18011a.f42422m0);
                    return;
                }
                return;
            }
            if (c3544l.m18014d() == 1) {
                if (m92650VI() != null) {
                    if (m92650VI() instanceof NearbyZView) {
                        ((NearbyZView) m92650VI()).m82308hM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_user));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putDouble("extra_longtitude", this.f79263t1);
                    bundle.putDouble("extra_latitude", this.f79264u1);
                    m92650VI().m92649TI().m93062f2(AbstractC6918a0.content_container, UserNearbyListView.class, bundle, 1, true);
                    return;
                }
                return;
            }
            if (c3544l.m18014d() == 2) {
                C3565f m18012b = c3544l.m18012b();
                if (m18012b.m18121j()) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(String.valueOf(m18012b.m18119h()), C32002l4.m154264g(30)).m135743b(), 0, 1));
                    return;
                } else {
                    AbstractC23152n3.m119042f0(m92648SI(), m18012b.m18112a(), m18012b.m18118g(), m18012b.m18117f());
                    return;
                }
            }
            if (c3544l.m18014d() == 4 && m92650VI() != null) {
                if (m92650VI() instanceof NearbyZView) {
                    ((NearbyZView) m92650VI()).m82308hM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_place));
                }
                m92650VI().m92649TI().m93062f2(AbstractC6918a0.content_container, OANearbyZView.class, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    public void m86464nM() {
        try {
            if (this.f79251h1) {
                return;
            }
            if (!C23055e5.m118271f()) {
                m86456EM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), MultiStateView.EnumC15915f.NETWORK_ERROR);
                return;
            }
            m86457FM();
            this.f79231N0.setVisibility(8);
            this.f79235R0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_location));
            this.f79235R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby));
            C15328b c15328b = new C15328b();
            C28239y6 c28239y6 = new C28239y6();
            this.f79251h1 = true;
            if (!c28239y6.m142225f(m92648SI(), c15328b, new SensitiveData("lbs_view", "lbs_view"))) {
                this.f79251h1 = false;
                m86465oM(new C20096c(-1, ""));
                removeDialog(3);
                showDialog(3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f79251h1 = false;
        }
    }

    /* renamed from: oM */
    void m86465oM(C20096c c20096c) {
        final int m104491c;
        if (c20096c == null) {
            m104491c = -1;
        } else {
            try {
                m104491c = c20096c.m104491c();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f79252i1 = false;
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n21
            @Override // java.lang.Runnable
            public final void run() {
                UserOANearbyZView.this.m86445pM(m104491c);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i12 == -1 && i11 == 10) {
            AbstractC23304d.f113440t2 = false;
            m86452AM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.nearby_header_bar || id2 == AbstractC6918a0.btn_advanced_settings || id2 == AbstractC6918a0.user_settings_layout) {
            m86458GM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f79250g1 = false;
        if (AbstractC23304d.f113440t2) {
            AbstractC23304d.f113440t2 = false;
            m86452AM();
        } else {
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
            if (viewOnClickListenerC7161o4 != null) {
                viewOnClickListenerC7161o4.notifyDataSetChanged();
            }
        }
        if (m92650VI() != null && (m92650VI() instanceof NearbyZView)) {
            ((NearbyZView) m92650VI()).m82308hM(AbstractC23136l9.m118743r0(AbstractC8020f0.usernearby_title));
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.f
    /* renamed from: pr */
    public void mo36436pr(ContactProfile contactProfile, int i11) {
        try {
            if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79259p1;
                if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() > 0) {
                    TrackingSource trackingSource = new TrackingSource(80);
                    trackingSource.m40677a("idx", Integer.valueOf(i11));
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(30)).m135739F("5360").m135744c(contactProfile).m135743b(), 0, 1));
                }
                AbstractC23647d.m123893c();
                return;
            }
            m86462lM(contactProfile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    void m86466wM() {
        if (this.f79252i1) {
            return;
        }
        this.f79239V0.setVisibility(8);
        int i11 = 0;
        this.f79240W0.setVisibility(0);
        this.f79252i1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15330d());
        SensitiveData sensitiveData = new SensitiveData("wifi_get_connection_info_on_search_nearby", "search_nearby");
        double d11 = this.f79263t1;
        double d12 = this.f79264u1;
        String valueOf = String.valueOf(C28139n5.m141620j().m141637i());
        String str = "" + C28139n5.m141620j().m141646s();
        String str2 = "" + C28139n5.m141620j().m141647t();
        String str3 = "" + C28139n5.m141620j().m141639l();
        String m141648u = C28139n5.m141620j().m141648u(sensitiveData);
        int i12 = this.f79261r1;
        int i13 = this.f79247d1;
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 != 0) {
            i11 = 2;
        }
        c0766k.mo1393B4(d11, d12, valueOf, str, str2, str3, m141648u, 0, i12, 100, i11, C28139n5.m141620j().m141643p());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m86453BM();
    }

    /* renamed from: xM */
    void m86467xM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("update", true);
        m92650VI().m92662fJ().m93069k2(UpdateUserInfoZView.class, bundle, 1, true);
    }

    /* renamed from: yM */
    void m86468yM(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("place_data");
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2 != null) {
                        this.f79255l1.add(new C3565f(jSONObject2));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:22|(1:24)(1:118)|25|26|(1:28)(1:117)|29|(1:31)(1:116)|32|(1:34)(1:115)|35|(1:37)(1:114)|38|(1:40)(1:113)|41|(1:43)(1:112)|44|(1:46)(1:111)|47|(1:49)(1:110)|50|(2:52|(14:54|55|(1:107)(2:59|60)|61|62|(1:103)(4:66|67|68|(1:70))|71|72|73|(1:79)|80|(1:86)|87|(2:98|99)(3:91|92|(2:94|95)(1:96))))(1:109)|108|55|(1:57)|107|61|62|(1:64)|103|71|72|73|(3:75|77|79)|80|(3:82|84|86)|87|(1:89)|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0171, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0172, code lost:            r34 = r3;        r3 = r17;     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6 A[Catch: Exception -> 0x012f, TRY_ENTER, TryCatch #0 {Exception -> 0x012f, blocks: (B:15:0x0059, B:17:0x005f, B:22:0x0080, B:25:0x0091, B:29:0x00a5, B:32:0x00b7, B:35:0x00c9, B:38:0x00db, B:41:0x00ed, B:44:0x00fe, B:47:0x010d, B:50:0x011f, B:52:0x0125, B:55:0x0138, B:57:0x013e, B:59:0x0144, B:72:0x0180, B:75:0x01b6, B:77:0x01bc, B:79:0x01c2, B:80:0x01d4, B:82:0x01da, B:84:0x01e0, B:86:0x01e6, B:87:0x01f8, B:89:0x0200, B:102:0x017c, B:110:0x0118, B:111:0x0105, B:112:0x00f7, B:113:0x00e6, B:114:0x00d4, B:115:0x00c2, B:116:0x00b0, B:117:0x009e, B:118:0x008b), top: B:14:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:15:0x0059, B:17:0x005f, B:22:0x0080, B:25:0x0091, B:29:0x00a5, B:32:0x00b7, B:35:0x00c9, B:38:0x00db, B:41:0x00ed, B:44:0x00fe, B:47:0x010d, B:50:0x011f, B:52:0x0125, B:55:0x0138, B:57:0x013e, B:59:0x0144, B:72:0x0180, B:75:0x01b6, B:77:0x01bc, B:79:0x01c2, B:80:0x01d4, B:82:0x01da, B:84:0x01e0, B:86:0x01e6, B:87:0x01f8, B:89:0x0200, B:102:0x017c, B:110:0x0118, B:111:0x0105, B:112:0x00f7, B:113:0x00e6, B:114:0x00d4, B:115:0x00c2, B:116:0x00b0, B:117:0x009e, B:118:0x008b), top: B:14:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:15:0x0059, B:17:0x005f, B:22:0x0080, B:25:0x0091, B:29:0x00a5, B:32:0x00b7, B:35:0x00c9, B:38:0x00db, B:41:0x00ed, B:44:0x00fe, B:47:0x010d, B:50:0x011f, B:52:0x0125, B:55:0x0138, B:57:0x013e, B:59:0x0144, B:72:0x0180, B:75:0x01b6, B:77:0x01bc, B:79:0x01c2, B:80:0x01d4, B:82:0x01da, B:84:0x01e0, B:86:0x01e6, B:87:0x01f8, B:89:0x0200, B:102:0x017c, B:110:0x0118, B:111:0x0105, B:112:0x00f7, B:113:0x00e6, B:114:0x00d4, B:115:0x00c2, B:116:0x00b0, B:117:0x009e, B:118:0x008b), top: B:14:0x0059 }] */
    /* renamed from: zM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m86469zM(JSONObject jSONObject) {
        boolean z11;
        long j11;
        int i11;
        String string;
        String str;
        String string2;
        String str2;
        String string3;
        String str3;
        String string4;
        String str4;
        String string5;
        String str5;
        int i12;
        String str6;
        String string6;
        String str7;
        boolean z12;
        String str8;
        int i13;
        String str9;
        String str10;
        ContactProfile contactProfile;
        String str11;
        int i14;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject2;
        String str12 = ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION;
        String str13 = "showButton";
        String str14 = "tag";
        String str15 = "dob";
        String str16 = "gender";
        String str17 = "status";
        String str18 = "avatar";
        String str19 = "username";
        String str20 = "displayName";
        try {
            String str21 = "track_ads";
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray != null) {
                this.f79254k1.clear();
                String str22 = "address";
                if (this.f79243Z0 && jSONArray.length() >= 100 && this.f79261r1 < 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f79242Y0 = z11;
                int parseInt = Integer.parseInt(AbstractC23160o0.m119280p1(System.currentTimeMillis()));
                int i15 = 0;
                while (i15 < jSONArray.length()) {
                    try {
                        int i16 = parseInt;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i15);
                        if (jSONObject3 == null) {
                            i14 = i15;
                            str9 = str12;
                            str7 = str13;
                            str6 = str14;
                            str8 = str15;
                            str5 = str16;
                            str4 = str17;
                            str3 = str18;
                            str2 = str19;
                            str = str20;
                            str11 = str21;
                        } else {
                            long j12 = 0;
                            if (jSONObject3.isNull("lastSeen")) {
                                j11 = 0;
                            } else {
                                j11 = jSONObject3.getLong("lastSeen");
                            }
                            String str23 = "";
                            if (jSONObject3.isNull("userId")) {
                                i11 = i15;
                                string = "";
                            } else {
                                i11 = i15;
                                string = jSONObject3.getString("userId");
                            }
                            if (jSONObject3.isNull(str20)) {
                                str = str20;
                                string2 = "";
                            } else {
                                str = str20;
                                string2 = jSONObject3.getString(str20);
                            }
                            if (jSONObject3.isNull(str19)) {
                                str2 = str19;
                                string3 = "";
                            } else {
                                str2 = str19;
                                string3 = jSONObject3.getString(str19);
                            }
                            if (jSONObject3.isNull(str18)) {
                                str3 = str18;
                                string4 = "";
                            } else {
                                str3 = str18;
                                string4 = jSONObject3.getString(str18);
                            }
                            if (jSONObject3.isNull(str17)) {
                                str4 = str17;
                                string5 = "";
                            } else {
                                str4 = str17;
                                string5 = jSONObject3.getString(str17);
                            }
                            if (jSONObject3.isNull(str16)) {
                                str5 = str16;
                                i12 = 0;
                            } else {
                                str5 = str16;
                                i12 = jSONObject3.getInt(str16);
                            }
                            if (!jSONObject3.isNull(str15)) {
                                j12 = jSONObject3.getLong(str15) * 1000;
                            }
                            if (jSONObject3.isNull(str14)) {
                                str6 = str14;
                                string6 = "";
                            } else {
                                str6 = str14;
                                string6 = jSONObject3.getString(str14);
                            }
                            if (!jSONObject3.isNull(str13)) {
                                int i17 = jSONObject3.getInt(str13);
                                str7 = str13;
                                z12 = true;
                                if (i17 == 1) {
                                    if (jSONObject3.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) && jSONObject3.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                                        str8 = str15;
                                        i13 = jSONObject3.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                    } else {
                                        str8 = str15;
                                        i13 = 0;
                                    }
                                    if (!jSONObject3.has(str12) && (jSONObject2 = jSONObject3.getJSONObject(str12)) != null) {
                                        str9 = str12;
                                        str10 = str22;
                                        try {
                                            if (jSONObject2.has(str10)) {
                                                str23 = jSONObject2.getString(str10);
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            e.printStackTrace();
                                            str22 = str10;
                                            String str24 = str23;
                                            contactProfile = new ContactProfile(string);
                                            contactProfile.f42446v = string4;
                                            contactProfile.f42437s = string2;
                                            contactProfile.f42443u = string3;
                                            contactProfile.f42336F = j11;
                                            contactProfile.f42449w = i12;
                                            contactProfile.m40397a1(str24);
                                            contactProfile.f42398a0 = i16 - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                                            contactProfile.f42458z = string5;
                                            contactProfile.f42346I0 = string6;
                                            contactProfile.f42349J0 = z12;
                                            contactProfile.f42352K0 = i13;
                                            str11 = str21;
                                            if (jSONObject3.has(str11)) {
                                            }
                                            if (jSONObject3.has(str11)) {
                                            }
                                            if (!string2.equals("Last First")) {
                                            }
                                            i14 = i11;
                                            i15 = i14 + 1;
                                            str21 = str11;
                                            parseInt = i16;
                                            str20 = str;
                                            str19 = str2;
                                            str18 = str3;
                                            str17 = str4;
                                            str16 = str5;
                                            str14 = str6;
                                            str13 = str7;
                                            str15 = str8;
                                            str12 = str9;
                                        }
                                    } else {
                                        str9 = str12;
                                        str10 = str22;
                                    }
                                    str22 = str10;
                                    String str242 = str23;
                                    contactProfile = new ContactProfile(string);
                                    contactProfile.f42446v = string4;
                                    contactProfile.f42437s = string2;
                                    contactProfile.f42443u = string3;
                                    contactProfile.f42336F = j11;
                                    contactProfile.f42449w = i12;
                                    contactProfile.m40397a1(str242);
                                    contactProfile.f42398a0 = i16 - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                                    contactProfile.f42458z = string5;
                                    contactProfile.f42346I0 = string6;
                                    contactProfile.f42349J0 = z12;
                                    contactProfile.f42352K0 = i13;
                                    str11 = str21;
                                    if (jSONObject3.has(str11) && !jSONObject3.isNull(str11) && (optJSONObject2 = jSONObject3.optJSONObject(str11)) != null) {
                                        int i18 = optJSONObject2.getInt("campid");
                                        int i19 = optJSONObject2.getInt("srcidx");
                                        String string7 = optJSONObject2.getString("distribute_id");
                                        contactProfile.f42350J1 = i18;
                                        contactProfile.f42376S0 = i19;
                                        contactProfile.f42422m0 = string7;
                                    }
                                    if (jSONObject3.has(str11) && !jSONObject3.isNull(str11) && (optJSONObject = jSONObject3.optJSONObject(str11)) != null) {
                                        int i21 = optJSONObject.getInt("campid");
                                        int i22 = optJSONObject.getInt("srcidx");
                                        String string8 = optJSONObject.getString("distribute_id");
                                        contactProfile.f42350J1 = i21;
                                        contactProfile.f42376S0 = i22;
                                        contactProfile.f42422m0 = string8;
                                    }
                                    if (!string2.equals("Last First") || string.equals(CoreUtility.f89233i)) {
                                        i14 = i11;
                                    } else {
                                        i14 = i11;
                                        if (!this.f79253j1.containsKey(contactProfile.f42434r)) {
                                            this.f79254k1.add(contactProfile);
                                            WeakHashMap weakHashMap = this.f79253j1;
                                            String str25 = contactProfile.f42434r;
                                            weakHashMap.put(str25, str25);
                                        }
                                    }
                                }
                            } else {
                                str7 = str13;
                            }
                            z12 = false;
                            if (jSONObject3.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                            }
                            str8 = str15;
                            i13 = 0;
                            if (!jSONObject3.has(str12)) {
                            }
                            str9 = str12;
                            str10 = str22;
                            str22 = str10;
                            String str2422 = str23;
                            contactProfile = new ContactProfile(string);
                            contactProfile.f42446v = string4;
                            contactProfile.f42437s = string2;
                            contactProfile.f42443u = string3;
                            contactProfile.f42336F = j11;
                            contactProfile.f42449w = i12;
                            contactProfile.m40397a1(str2422);
                            contactProfile.f42398a0 = i16 - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                            contactProfile.f42458z = string5;
                            contactProfile.f42346I0 = string6;
                            contactProfile.f42349J0 = z12;
                            contactProfile.f42352K0 = i13;
                            str11 = str21;
                            if (jSONObject3.has(str11)) {
                                int i182 = optJSONObject2.getInt("campid");
                                int i192 = optJSONObject2.getInt("srcidx");
                                String string72 = optJSONObject2.getString("distribute_id");
                                contactProfile.f42350J1 = i182;
                                contactProfile.f42376S0 = i192;
                                contactProfile.f42422m0 = string72;
                            }
                            if (jSONObject3.has(str11)) {
                                int i212 = optJSONObject.getInt("campid");
                                int i222 = optJSONObject.getInt("srcidx");
                                String string82 = optJSONObject.getString("distribute_id");
                                contactProfile.f42350J1 = i212;
                                contactProfile.f42376S0 = i222;
                                contactProfile.f42422m0 = string82;
                            }
                            if (!string2.equals("Last First")) {
                            }
                            i14 = i11;
                        }
                        i15 = i14 + 1;
                        str21 = str11;
                        parseInt = i16;
                        str20 = str;
                        str19 = str2;
                        str18 = str3;
                        str17 = str4;
                        str16 = str5;
                        str14 = str6;
                        str13 = str7;
                        str15 = str8;
                        str12 = str9;
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        return;
                    }
                }
            }
        } catch (Exception e13) {
            e = e13;
        }
    }
}
