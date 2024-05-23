package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.ViewOnClickListenerC7161o4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.UserNearbyListView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import db0.AbstractC17865a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractAnimationAnimationListenerC20277g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
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
import p510sq.C26365a;
import p716zh.C31965ic;
import p716zh.C32002l4;
import vg.C28139n5;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class UserNearbyListView extends SlidableZaloView implements ViewOnClickListenerC7161o4.b, View.OnClickListener, InterfaceC17463d.d, ViewOnClickListenerC7161o4.f, InterfaceC0733x {

    /* renamed from: P0 */
    SwipeRefreshListView f79155P0;

    /* renamed from: Q0 */
    ListView f79156Q0;

    /* renamed from: R0 */
    View f79157R0;

    /* renamed from: S0 */
    ViewOnClickListenerC7161o4 f79158S0;

    /* renamed from: T0 */
    TextView f79159T0;

    /* renamed from: U0 */
    InterfaceC0765j f79160U0;

    /* renamed from: W0 */
    int f79162W0;

    /* renamed from: Z0 */
    View f79165Z0;

    /* renamed from: b1 */
    LinearLayout f79167b1;

    /* renamed from: c1 */
    LinearLayout f79168c1;

    /* renamed from: d1 */
    FrameLayout f79169d1;

    /* renamed from: j1 */
    C23528a f79175j1;

    /* renamed from: k1 */
    View f79176k1;

    /* renamed from: l1 */
    MultiStateView f79177l1;

    /* renamed from: m1 */
    boolean f79178m1;

    /* renamed from: n1 */
    Animation f79179n1;

    /* renamed from: o1 */
    Animation f79180o1;

    /* renamed from: p1 */
    Animation f79181p1;

    /* renamed from: r1 */
    C15323f f79183r1;

    /* renamed from: u1 */
    View f79186u1;

    /* renamed from: V0 */
    int f79161V0 = -1;

    /* renamed from: X0 */
    int f79163X0 = -1;

    /* renamed from: Y0 */
    int f79164Y0 = 1;

    /* renamed from: a1 */
    boolean f79166a1 = false;

    /* renamed from: e1 */
    List f79170e1 = new ArrayList();

    /* renamed from: f1 */
    List f79171f1 = new ArrayList();

    /* renamed from: g1 */
    WeakHashMap f79172g1 = new WeakHashMap();

    /* renamed from: h1 */
    boolean f79173h1 = true;

    /* renamed from: i1 */
    boolean f79174i1 = true;

    /* renamed from: q1 */
    boolean f79182q1 = false;

    /* renamed from: s1 */
    double f79184s1 = -1.0d;

    /* renamed from: t1 */
    double f79185t1 = -1.0d;

    /* renamed from: v1 */
    boolean f79187v1 = false;

    /* renamed from: w1 */
    final Animation.AnimationListener f79188w1 = new C15320c();

    /* renamed from: x1 */
    final Animation.AnimationListener f79189x1 = new C15321d();

    /* renamed from: y1 */
    boolean f79190y1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$a */
    /* loaded from: classes6.dex */
    public class C15318a implements AbsListView.OnScrollListener {
        C15318a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            boolean z11;
            LinearLayout linearLayout;
            List list;
            try {
                UserNearbyListView userNearbyListView = UserNearbyListView.this;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                userNearbyListView.f79182q1 = z11;
                if (i11 + i12 >= i13 - 1 && userNearbyListView.f79166a1 && !userNearbyListView.f79187v1 && (linearLayout = userNearbyListView.f79167b1) != null && linearLayout.getVisibility() != 0 && (list = UserNearbyListView.this.f79171f1) != null && list.size() > 0 && UserNearbyListView.this.f79171f1.size() < 500) {
                    UserNearbyListView.this.f79169d1.setVisibility(0);
                    UserNearbyListView userNearbyListView2 = UserNearbyListView.this;
                    int i14 = userNearbyListView2.f79164Y0 + 1;
                    userNearbyListView2.f79164Y0 = i14;
                    if (i14 < 5) {
                        AbstractC23647d.m123907q("5350", "");
                        UserNearbyListView userNearbyListView3 = UserNearbyListView.this;
                        userNearbyListView3.f79166a1 = true;
                        userNearbyListView3.m86392mM();
                        AbstractC23647d.m123893c();
                    } else if (i14 == 5) {
                        userNearbyListView2.f79166a1 = false;
                        userNearbyListView2.m86392mM();
                    }
                }
                UserNearbyListView userNearbyListView4 = UserNearbyListView.this;
                if (!userNearbyListView4.f79166a1) {
                    userNearbyListView4.f79169d1.setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    UserNearbyListView.this.f79158S0.m36434d(false);
                    UserNearbyListView.this.f79158S0.notifyDataSetChanged();
                } else {
                    UserNearbyListView.this.f79158S0.m36434d(true);
                    UserNearbyListView.this.f79158S0.notifyDataSetChanged();
                    UserNearbyListView.this.f79155P0.m88202K();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$b */
    /* loaded from: classes6.dex */
    public class C15319b implements InterfaceC20094a {
        C15319b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86403e(int i11) {
            UserNearbyListView.this.m86399yM(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86404f() {
            UserNearbyListView.this.f79155P0.setRefreshing(false);
            UserNearbyListView.this.f79155P0.setVisibility(8);
            UserNearbyListView.this.f79157R0.setVisibility(8);
            UserNearbyListView.this.f79167b1.setVisibility(0);
            UserNearbyListView.this.f79168c1.setVisibility(8);
            UserNearbyListView.this.m86389AM(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (UserNearbyListView.this.m92674mJ()) {
                UserNearbyListView.this.m86393nM(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            UserNearbyListView userNearbyListView = UserNearbyListView.this;
            boolean z11 = false;
            userNearbyListView.f79187v1 = false;
            if (userNearbyListView.m92674mJ()) {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    final int i11 = jSONObject.getInt("error_code");
                    if (i11 == 0) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("filter_cond");
                        if (jSONObject3 != null) {
                            UserNearbyListView.this.f79161V0 = AbstractC18069a.m96085d(jSONObject3, "findGender");
                            UserNearbyListView.this.f79162W0 = AbstractC18069a.m96085d(jSONObject3, "ageFrom");
                            UserNearbyListView.this.f79163X0 = AbstractC18069a.m96085d(jSONObject3, "ageTo");
                            if (jSONObject3.has("advanced_setting")) {
                                UserNearbyListView userNearbyListView2 = UserNearbyListView.this;
                                if (jSONObject3.getInt("advanced_setting") == 1) {
                                    z11 = true;
                                }
                                userNearbyListView2.f79174i1 = z11;
                            }
                        }
                        UserNearbyListView.this.m86396vM(jSONObject2);
                        return;
                    }
                    UserNearbyListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.z11
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserNearbyListView.C15319b.this.m86403e(i11);
                        }
                    });
                } catch (Exception unused) {
                    UserNearbyListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.a21
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserNearbyListView.C15319b.this.m86404f();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$c */
    /* loaded from: classes6.dex */
    class C15320c extends AbstractAnimationAnimationListenerC20277g {
        C15320c() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            UserNearbyListView.this.f79181p1 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$d */
    /* loaded from: classes6.dex */
    class C15321d extends AbstractAnimationAnimationListenerC20277g {
        C15321d() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            UserNearbyListView.this.f79157R0.setVisibility(8);
            UserNearbyListView.this.f79181p1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$e */
    /* loaded from: classes6.dex */
    public class C15322e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79195a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f79196b;

        /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$e$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f79198a;

            a(ContactProfile contactProfile) {
                this.f79198a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f79198a);
            }
        }

        C15322e(String str, ContactProfile contactProfile) {
            this.f79195a = str;
            this.f79196b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m86406d() {
            try {
                UserNearbyListView.this.f79158S0.notifyDataSetChanged();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (UserNearbyListView.this.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                UserNearbyListView userNearbyListView = UserNearbyListView.this;
                userNearbyListView.f79190y1 = false;
                userNearbyListView.mo78960q3();
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
                        ContactProfile m141809c = c28203u6.m141809c(this.f79195a);
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        if (m141809c == null && (contactProfile = this.f79196b) != null) {
                            contactProfile.f42447v0 = contactProfile.f42352K0;
                            m141809c = contactProfile;
                        } else if (m141809c != null) {
                            m141809c.f42447v0 = m141809c.f42352K0;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f79195a)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f79195a)).m153681a();
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
                            if (!C21927m.m114302u().m114357s().m153137g(this.f79195a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f79195a) != null) {
                                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(this.f79195a);
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
                        c28203u6.m141806D(this.f79195a, false);
                        if (!TextUtils.isEmpty(this.f79195a)) {
                            AbstractC23181q.m119431d(this.f79195a, true);
                        }
                        UserNearbyListView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.b21
                            @Override // java.lang.Runnable
                            public final void run() {
                                UserNearbyListView.C15322e.this.m86406d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                UserNearbyListView.this.mo78960q3();
                UserNearbyListView.this.f79190y1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbyListView$f */
    /* loaded from: classes6.dex */
    public class C15323f extends AbstractC17865a {
        @Override // db0.AbstractC17865a
        /* renamed from: d */
        protected void mo80863d(int i11, float f11) {
            try {
                UserNearbyListView userNearbyListView = UserNearbyListView.this;
                if (userNearbyListView.f79174i1) {
                    if (i11 == 2) {
                        if (!userNearbyListView.f79182q1) {
                            userNearbyListView.m86400zM(false);
                        }
                    } else if (i11 == 1) {
                        userNearbyListView.m86400zM(true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C15323f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m86384oM(int i11) {
        String m118743r0;
        boolean z11;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            this.f79155P0.setRefreshing(false);
            this.f79177l1.setVisibility(8);
            this.f79167b1.setVisibility(0);
            this.f79168c1.setVisibility(8);
            if (i11 == 50001) {
                ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79158S0;
                if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() > 0) {
                    this.f79155P0.m88209V();
                }
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                z11 = true;
            } else {
                if (i11 == 402) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby);
                    removeDialog(4);
                    showDialog(4);
                } else if (i11 == 21000) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.warning_mock_location_detected);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby);
                }
                z11 = false;
            }
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o42 = this.f79158S0;
            if (viewOnClickListenerC7161o42 != null && viewOnClickListenerC7161o42.getCount() == 0) {
                if (z11) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                m86389AM(m118743r0, enumC15915f);
                this.f79155P0.setVisibility(8);
                this.f79157R0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f79187v1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m86385pM() {
        AbstractC23647d.m123907q("5370", "");
        m86390BM();
        this.f79164Y0 = 1;
        this.f79166a1 = true;
        this.f79171f1.clear();
        this.f79172g1.clear();
        m86392mM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m86386qM() {
        if (!C23055e5.m118271f()) {
            this.f79155P0.setRefreshing(false);
            this.f79155P0.m88209V();
            return;
        }
        this.f79155P0.m88202K();
        AbstractC23647d.m123907q("5330", "");
        this.f79164Y0 = 1;
        this.f79166a1 = true;
        this.f79173h1 = false;
        this.f79171f1.clear();
        this.f79172g1.clear();
        m86392mM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ boolean m86387rM(View view, MotionEvent motionEvent) {
        try {
            return this.f79183r1.m94388b(this.f79156Q0, motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m86388sM(int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            this.f79155P0.setRefreshing(false);
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.empty_nearby;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i12);
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.NEARBY_ERROR;
            }
            m86389AM(m118743r0, enumC15915f);
            this.f79167b1.setVisibility(0);
            this.f79168c1.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: AM */
    void m86389AM(String str, MultiStateView.EnumC15915f enumC15915f) {
        MultiStateView multiStateView = this.f79177l1;
        if (multiStateView != null) {
            boolean z11 = false;
            multiStateView.setVisibility(0);
            this.f79177l1.setErrorTitleString(str);
            MultiStateView multiStateView2 = this.f79177l1;
            if (enumC15915f == MultiStateView.EnumC15915f.NETWORK_ERROR) {
                z11 = true;
            }
            multiStateView2.setEnableImageErrorView(z11);
            this.f79177l1.setState(MultiStateView.EnumC15914e.ERROR);
            this.f79177l1.setErrorType(enumC15915f);
        }
    }

    /* renamed from: BM */
    void m86390BM() {
        MultiStateView multiStateView = this.f79177l1;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            this.f79177l1.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        double d11;
        super.mo37111CJ(bundle);
        this.f79179n1 = AnimationUtils.loadAnimation(m92648SI(), AbstractC10919t.slide_in_subtab_from_top);
        this.f79180o1 = AnimationUtils.loadAnimation(m92648SI(), AbstractC10919t.slide_out_subtab_to_top);
        AbstractC23059e9.m118318G(80);
        this.f79175j1 = new C23528a(m92648SI());
        this.f79164Y0 = 1;
        this.f79166a1 = true;
        this.f79161V0 = 0;
        if (m92642L3() != null) {
            double d12 = -1.0d;
            if (m92642L3().containsKey("extra_longtitude")) {
                d11 = m92642L3().getDouble("extra_longtitude");
            } else {
                d11 = -1.0d;
            }
            this.f79184s1 = d11;
            if (m92642L3().containsKey("extra_latitude")) {
                d12 = m92642L3().getDouble("extra_latitude");
            }
            this.f79185t1 = d12;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 4) {
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9));
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.warning_location_invalid_dob));
                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
                aVar.m43169r(AbstractC8020f0.update, this);
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f79176k1 = layoutInflater.inflate(AbstractC7409c0.user_oa_view, viewGroup, false);
        m86398xM();
        return this.f79176k1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        if (this.f79187v1) {
            AbstractC23647d.m123907q("5380", "");
            AbstractC23647d.m123893c();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 4) {
                if (i11 == -1) {
                    m86394tM();
                    interfaceC17463d.dismiss();
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    if (m92650VI() != null) {
                        m92650VI().finish();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserNearbyListView";
    }

    /* renamed from: lM */
    void m86391lM(ContactProfile contactProfile) {
        try {
            if (this.f79190y1) {
                return;
            }
            String str = contactProfile.f42434r;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15322e(str, contactProfile));
            this.f79190y1 = true;
            c0766k.mo1578Y4(Integer.parseInt(str), new TrackingSource(273));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m86392mM() {
        int i11;
        try {
            if (this.f79187v1) {
                return;
            }
            if (!C23055e5.m118271f()) {
                m86389AM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), MultiStateView.EnumC15915f.NETWORK_ERROR);
                this.f79157R0.setVisibility(8);
                return;
            }
            this.f79177l1.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_location));
            this.f79177l1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby));
            if (this.f79164Y0 == 1 && this.f79173h1) {
                m86390BM();
                this.f79157R0.setVisibility(8);
            }
            this.f79173h1 = true;
            this.f79167b1.setVisibility(8);
            this.f79168c1.setVisibility(0);
            if (this.f79160U0 == null) {
                this.f79160U0 = new C0766k();
            }
            this.f79160U0.mo1704o8(new C15319b());
            this.f79187v1 = true;
            this.f79161V0 = AbstractC23309i.m122081k4();
            SensitiveData sensitiveData = new SensitiveData("wifi_get_connection_info_on_search_nearby", "search_nearby");
            InterfaceC0765j interfaceC0765j = this.f79160U0;
            double d11 = this.f79184s1;
            if (d11 == -1.0d) {
                d11 = C28139n5.m141620j().m141645r();
            }
            double d12 = this.f79185t1;
            if (d12 == -1.0d) {
                d12 = C28139n5.m141620j().m141640m();
            }
            String valueOf = String.valueOf(C28139n5.m141620j().m141637i());
            String str = "" + C28139n5.m141620j().m141646s();
            String str2 = "" + C28139n5.m141620j().m141647t();
            String str3 = "" + C28139n5.m141620j().m141639l();
            String m141648u = C28139n5.m141620j().m141648u(sensitiveData);
            int i12 = this.f79164Y0;
            int i13 = this.f79161V0;
            if (i13 == 1) {
                i11 = 1;
            } else if (i13 == 0) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            interfaceC0765j.mo1393B4(d11, d12, valueOf, str, str2, str3, m141648u, 0, i12, 100, i11, C28139n5.m141620j().m141643p());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.b
    /* renamed from: n */
    public void mo36435n(int i11) {
        try {
            AbstractC23647d.m123907q("5360", "");
            C3544l c3544l = (C3544l) this.f79158S0.getItem(i11);
            if (c3544l.m18014d() == 0) {
                ContactProfile m18011a = c3544l.m18011a();
                TrackingSource trackingSource = new TrackingSource(80);
                trackingSource.m40677a("idx", Integer.valueOf(i11));
                trackingSource.m40677a("sourceView", 17);
                C21927m.m114302u().m114330e0(m18011a.f42434r, trackingSource);
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(m18011a.f42434r, C32002l4.m154264g(29)).m135739F("5360").m135744c(m18011a).m135743b(), 0, 1));
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m86393nM(C20096c c20096c) {
        final int m104491c;
        if (c20096c == null) {
            m104491c = -1;
        } else {
            try {
                m104491c = c20096c.m104491c();
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f79187v1 = false;
                return;
            }
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w11
            @Override // java.lang.Runnable
            public final void run() {
                UserNearbyListView.this.m86384oM(m104491c);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10 && i12 == -1) {
            m86397wM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_advanced_settings) {
            if (!this.f79178m1) {
                this.f79178m1 = true;
                m92650VI().m92662fJ().m93066i2(UserNearbySettingsView.class, null, 10, 1, true);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layoutFeedFooterError) {
            m86392mM();
        } else if (id2 == AbstractC6918a0.user_settings_layout && !this.f79178m1) {
            this.f79178m1 = true;
            m92650VI().m92662fJ().m93066i2(UserNearbySettingsView.class, null, 10, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f79178m1 = false;
        ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79158S0;
        if (viewOnClickListenerC7161o4 != null) {
            viewOnClickListenerC7161o4.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.f
    /* renamed from: pr */
    public void mo36436pr(ContactProfile contactProfile, int i11) {
        try {
            if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f79158S0;
                if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() > 0) {
                    TrackingSource trackingSource = new TrackingSource(80);
                    trackingSource.m40677a("idx", Integer.valueOf(i11));
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(29)).m135739F("5360").m135744c(contactProfile).m135743b(), 0, 1));
                }
                AbstractC23647d.m123893c();
                return;
            }
            m86391lM(contactProfile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m86394tM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("update", true);
        m92662fJ().m93069k2(UpdateUserInfoZView.class, bundle, 1, true);
    }

    /* renamed from: uM */
    public void m86395uM() {
        StringBuilder sb2;
        try {
            int i11 = this.f79161V0;
            if (i11 == 2) {
                i11 = -1;
            }
            AbstractC23309i.m122253oo(i11);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_label_onlym);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_label_onlyf);
            int i12 = this.f79161V0;
            if (i12 == 1) {
                m118743r0 = m118743r02;
            } else if (i12 != 0) {
                m118743r0 = m118743r0 + " - " + m118743r02;
            }
            if (this.f79162W0 == this.f79163X0) {
                sb2 = new StringBuilder();
                sb2.append(this.f79162W0);
                sb2.append("");
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.f79162W0);
                sb2.append(" - ");
                sb2.append(this.f79163X0);
            }
            String sb3 = sb2.toString();
            this.f79159T0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_filter_by_string), m118743r0 + ", " + sb3));
            this.f79167b1.setVisibility(8);
            this.f79168c1.setVisibility(8);
            this.f79155P0.setRefreshing(false);
            if (this.f79158S0 != null) {
                if (this.f79164Y0 == 1) {
                    this.f79172g1.clear();
                    this.f79171f1.clear();
                }
                for (int i13 = 0; i13 < this.f79170e1.size(); i13++) {
                    ContactProfile contactProfile = (ContactProfile) this.f79170e1.get(i13);
                    this.f79171f1.add(new C3544l(0, contactProfile));
                    WeakHashMap weakHashMap = this.f79172g1;
                    String str = contactProfile.f42434r;
                    weakHashMap.put(str, str);
                }
                if (this.f79171f1.size() > 0) {
                    this.f79158S0.m36431a(this.f79171f1);
                    this.f79158S0.notifyDataSetChanged();
                    this.f79177l1.setVisibility(8);
                    this.f79155P0.setVisibility(0);
                    if (this.f79174i1) {
                        this.f79157R0.setVisibility(0);
                    } else if (this.f79156Q0.getHeaderViewsCount() > 0) {
                        this.f79156Q0.removeHeaderView(this.f79186u1);
                    }
                    if (this.f79164Y0 == 1) {
                        this.f79156Q0.setSelection(0);
                        return;
                    }
                    return;
                }
                this.f79155P0.setVisibility(8);
                if (this.f79174i1) {
                    this.f79157R0.setVisibility(0);
                }
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby);
                int i14 = this.f79161V0;
                if (i14 == 1) {
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_female_nearby);
                } else if (i14 == 0) {
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_male_nearby);
                }
                m86389AM(m118743r03, MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:18|(1:20)(1:99)|21|22|(1:24)(1:98)|25|(1:27)(1:97)|28|(1:30)(1:96)|31|(1:33)(1:95)|34|(1:36)(1:94)|37|(1:39)(1:93)|40|(1:42)(1:92)|43|(1:45)(1:91)|46|(2:48|(10:50|51|(1:88)(2:55|56)|57|58|59|(1:84)(4:63|64|65|(1:67))|68|69|(2:77|78)))(1:90)|89|51|(1:53)|88|57|58|59|(1:61)|84|68|69|(1:80)(4:71|75|77|78)) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:            r24 = r36;        r4 = r17;     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:3:0x001c, B:5:0x002b, B:7:0x0046, B:10:0x0051, B:11:0x0054, B:13:0x005a, B:18:0x0070, B:21:0x0081, B:25:0x0092, B:28:0x00a1, B:31:0x00b0, B:34:0x00bf, B:37:0x00ce, B:40:0x00dd, B:43:0x00ec, B:46:0x00fb, B:48:0x0101, B:51:0x010e, B:53:0x0114, B:55:0x011a, B:69:0x015a, B:71:0x01a0, B:75:0x01a9, B:77:0x01b3, B:83:0x0156, B:91:0x00f5, B:92:0x00e4, B:93:0x00d7, B:94:0x00c8, B:95:0x00b9, B:96:0x00aa, B:97:0x009b, B:98:0x008c, B:99:0x007b), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: vM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m86396vM(JSONObject jSONObject) {
        boolean z11;
        long j11;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i11;
        String string6;
        String str;
        boolean z12;
        int i12;
        String str2;
        String str3;
        String str4;
        String str5;
        ContactProfile contactProfile;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject2;
        String str11 = "showButton";
        String str12 = "tag";
        String str13 = "dob";
        String str14 = "gender";
        String str15 = "status";
        String str16 = "avatar";
        try {
            this.f79170e1.clear();
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                int parseInt = Integer.parseInt(AbstractC23160o0.m119280p1(System.currentTimeMillis()));
                int length = optJSONArray.length();
                String str17 = "address";
                String str18 = ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION;
                int i13 = 1;
                if (length >= 100 && this.f79164Y0 < 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f79166a1 = z11;
                int i14 = 0;
                while (i14 < optJSONArray.length()) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i14);
                    if (jSONObject3 == null) {
                        str = str12;
                        str6 = str13;
                        str7 = str14;
                        str9 = str15;
                        str10 = str16;
                        str4 = str18;
                        str3 = str11;
                    } else {
                        long j12 = 0;
                        if (jSONObject3.isNull("lastSeen")) {
                            j11 = 0;
                        } else {
                            j11 = jSONObject3.getLong("lastSeen");
                        }
                        String str19 = "";
                        if (jSONObject3.isNull("userId")) {
                            string = "";
                        } else {
                            string = jSONObject3.getString("userId");
                        }
                        if (jSONObject3.isNull("displayName")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject3.getString("displayName");
                        }
                        if (jSONObject3.isNull("username")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject3.getString("username");
                        }
                        if (jSONObject3.isNull(str16)) {
                            string4 = "";
                        } else {
                            string4 = jSONObject3.getString(str16);
                        }
                        if (jSONObject3.isNull(str15)) {
                            string5 = "";
                        } else {
                            string5 = jSONObject3.getString(str15);
                        }
                        if (jSONObject3.isNull(str14)) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject3.getInt(str14);
                        }
                        if (!jSONObject3.isNull(str13)) {
                            j12 = jSONObject3.getLong(str13) * 1000;
                        }
                        if (jSONObject3.isNull(str12)) {
                            string6 = "";
                        } else {
                            string6 = jSONObject3.getString(str12);
                        }
                        if (!jSONObject3.isNull(str11)) {
                            str = str12;
                            if (jSONObject3.getInt(str11) == i13) {
                                z12 = true;
                                if (jSONObject3.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) && jSONObject3.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                                    i12 = jSONObject3.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                } else {
                                    i12 = 0;
                                }
                                str2 = str18;
                                str3 = str11;
                                if (!jSONObject3.has(str2) && (jSONObject2 = jSONObject3.getJSONObject(str2)) != null) {
                                    str4 = str2;
                                    str5 = str17;
                                    try {
                                        if (jSONObject2.has(str5)) {
                                            str19 = jSONObject2.getString(str5);
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        e.printStackTrace();
                                        str17 = str5;
                                        String str20 = str19;
                                        str6 = str13;
                                        String str21 = string;
                                        contactProfile = new ContactProfile(str21);
                                        str7 = str14;
                                        contactProfile.f42446v = string4;
                                        str8 = string2;
                                        contactProfile.f42437s = str8;
                                        str9 = str15;
                                        contactProfile.f42443u = string3;
                                        str10 = str16;
                                        contactProfile.f42336F = j11;
                                        contactProfile.f42449w = i11;
                                        contactProfile.m40397a1(str20);
                                        contactProfile.f42398a0 = parseInt - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                                        contactProfile.f42458z = string5;
                                        contactProfile.f42346I0 = string6;
                                        contactProfile.f42349J0 = z12;
                                        contactProfile.f42352K0 = i12;
                                        if (str8.equals("Last First")) {
                                        }
                                        i14++;
                                        str11 = str3;
                                        str12 = str;
                                        str13 = str6;
                                        str18 = str4;
                                        str14 = str7;
                                        str15 = str9;
                                        str16 = str10;
                                        i13 = 1;
                                    }
                                } else {
                                    str4 = str2;
                                    str5 = str17;
                                }
                                str17 = str5;
                                String str202 = str19;
                                str6 = str13;
                                String str212 = string;
                                contactProfile = new ContactProfile(str212);
                                str7 = str14;
                                contactProfile.f42446v = string4;
                                str8 = string2;
                                contactProfile.f42437s = str8;
                                str9 = str15;
                                contactProfile.f42443u = string3;
                                str10 = str16;
                                contactProfile.f42336F = j11;
                                contactProfile.f42449w = i11;
                                contactProfile.m40397a1(str202);
                                contactProfile.f42398a0 = parseInt - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                                contactProfile.f42458z = string5;
                                contactProfile.f42346I0 = string6;
                                contactProfile.f42349J0 = z12;
                                contactProfile.f42352K0 = i12;
                                if (str8.equals("Last First") && !str212.equals(CoreUtility.f89233i) && !this.f79172g1.containsKey(contactProfile.f42434r)) {
                                    this.f79170e1.add(contactProfile);
                                }
                            }
                        } else {
                            str = str12;
                        }
                        z12 = false;
                        if (jSONObject3.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                        }
                        i12 = 0;
                        str2 = str18;
                        str3 = str11;
                        if (!jSONObject3.has(str2)) {
                        }
                        str4 = str2;
                        str5 = str17;
                        str17 = str5;
                        String str2022 = str19;
                        str6 = str13;
                        String str2122 = string;
                        contactProfile = new ContactProfile(str2122);
                        str7 = str14;
                        contactProfile.f42446v = string4;
                        str8 = string2;
                        contactProfile.f42437s = str8;
                        str9 = str15;
                        contactProfile.f42443u = string3;
                        str10 = str16;
                        contactProfile.f42336F = j11;
                        contactProfile.f42449w = i11;
                        contactProfile.m40397a1(str2022);
                        contactProfile.f42398a0 = parseInt - Integer.parseInt(AbstractC23160o0.m119280p1(j12));
                        contactProfile.f42458z = string5;
                        contactProfile.f42346I0 = string6;
                        contactProfile.f42349J0 = z12;
                        contactProfile.f42352K0 = i12;
                        if (str8.equals("Last First")) {
                            this.f79170e1.add(contactProfile);
                        }
                    }
                    i14++;
                    str11 = str3;
                    str12 = str;
                    str13 = str6;
                    str18 = str4;
                    str14 = str7;
                    str15 = str9;
                    str16 = str10;
                    i13 = 1;
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x11
            @Override // java.lang.Runnable
            public final void run() {
                UserNearbyListView.this.m86395uM();
            }
        });
    }

    /* renamed from: wM */
    public void m86397wM() {
        try {
            this.f79164Y0 = 1;
            this.f79166a1 = true;
            List list = this.f79171f1;
            if (list != null) {
                list.clear();
                this.f79172g1.clear();
            }
            m86392mM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m86392mM();
    }

    /* renamed from: xM */
    void m86398xM() {
        MultiStateView multiStateView = (MultiStateView) this.f79176k1.findViewById(AbstractC6918a0.multi_state);
        this.f79177l1 = multiStateView;
        multiStateView.setEnableLoadingText(true);
        this.f79177l1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.t11
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                UserNearbyListView.this.m86385pM();
            }
        });
        this.f79159T0 = (TextView) this.f79176k1.findViewById(AbstractC6918a0.txt_filter_by);
        ImageButton imageButton = (ImageButton) this.f79176k1.findViewById(AbstractC6918a0.btn_advanced_settings);
        imageButton.setImageDrawable(AbstractC23136l9.m118665N(imageButton.getContext(), AbstractC16803z.icn_voicetranscript_setting));
        imageButton.setOnClickListener(this);
        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.footer_loading, (ViewGroup) null, false);
        this.f79165Z0 = inflate;
        this.f79169d1 = (FrameLayout) inflate.findViewById(AbstractC6918a0.layoutFeedFooter);
        this.f79167b1 = (LinearLayout) this.f79165Z0.findViewById(AbstractC6918a0.layoutFeedFooterError);
        this.f79168c1 = (LinearLayout) this.f79165Z0.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
        this.f79169d1.setVisibility(8);
        this.f79167b1.setVisibility(8);
        this.f79168c1.setVisibility(8);
        this.f79167b1.setOnClickListener(this);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f79176k1.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f79155P0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.u11
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                UserNearbyListView.this.m86386qM();
            }
        });
        this.f79155P0.m35371s(false, 0, AbstractC23136l9.m118655I(AbstractC16802y.func_bar_general_h) + AbstractC23136l9.m118742r(10.0f));
        if (this.f79156Q0 == null) {
            this.f79156Q0 = this.f79155P0.f83579m0;
        }
        this.f79156Q0.addFooterView(this.f79165Z0);
        this.f79186u1 = new View(m92648SI());
        this.f79186u1.setLayoutParams(new AbsListView.LayoutParams(-1, AbstractC23136l9.m118742r(38.0f)));
        this.f79156Q0.addHeaderView(this.f79186u1);
        View findViewById = this.f79176k1.findViewById(AbstractC6918a0.user_settings_layout);
        this.f79157R0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f79156Q0.setOnScrollListener(new C15318a());
        this.f79183r1 = new C15323f();
        this.f79156Q0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.v11
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m86387rM;
                m86387rM = UserNearbyListView.this.m86387rM(view, motionEvent);
                return m86387rM;
            }
        });
        if (this.f79158S0 == null) {
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = new ViewOnClickListenerC7161o4(m92648SI(), this.f79175j1, this.f79171f1);
            this.f79158S0 = viewOnClickListenerC7161o4;
            viewOnClickListenerC7161o4.m36432b(this);
            this.f79158S0.m36433c(this);
            this.f79156Q0.setAdapter((ListAdapter) this.f79158S0);
            this.f79156Q0.setSelection(0);
            if (this.f79158S0.getCount() > 0) {
                this.f79177l1.setVisibility(8);
                this.f79155P0.setVisibility(0);
                if (this.f79174i1) {
                    this.f79157R0.setVisibility(0);
                    return;
                }
                return;
            }
            this.f79157R0.setVisibility(8);
            this.f79155P0.setVisibility(8);
            m86390BM();
        }
    }

    /* renamed from: yM */
    void m86399yM(final int i11) {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.y11
                @Override // java.lang.Runnable
                public final void run() {
                    UserNearbyListView.this.m86388sM(i11);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: zM */
    void m86400zM(boolean z11) {
        try {
            if (z11) {
                if (this.f79157R0.getVisibility() == 0) {
                    return;
                }
                Animation animation = this.f79181p1;
                if (animation != null) {
                    animation.cancel();
                }
                this.f79157R0.setVisibility(0);
                this.f79179n1.setAnimationListener(this.f79188w1);
                Animation animation2 = this.f79179n1;
                this.f79181p1 = animation2;
                this.f79157R0.startAnimation(animation2);
                return;
            }
            if (this.f79157R0.getVisibility() == 8) {
                return;
            }
            Animation animation3 = this.f79181p1;
            if (animation3 != null) {
                animation3.cancel();
            }
            this.f79180o1.setAnimationListener(this.f79189x1);
            Animation animation4 = this.f79180o1;
            this.f79181p1 = animation4;
            this.f79157R0.startAnimation(animation4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
