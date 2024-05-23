package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import bn.C2913t1;
import bn.ViewOnClickListenerC2907r1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7045d9;
import com.zing.zalo.adapters.C7184q5;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.adapters.C7282z4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.RequestFriendView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p172fy.C19171b;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21913a0;
import p304ks.C21915b0;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21929o;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p716zh.C31853b5;
import p716zh.C31859bb;
import p716zh.C31874cb;
import p716zh.C31934gb;
import p716zh.C31965ic;
import p716zh.C32002l4;
import qm0.AbstractC25332a0;
import r30.AbstractC25636f;
import v50.C27870vb;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes6.dex */
public final class RequestFriendView extends BaseZaloView implements C7184q5.e, View.OnClickListener, InterfaceC17463d.d, C23744a.c, C7282z4.c, InterfaceC0733x {
    public static final C14941a Companion = new C14941a(null);

    /* renamed from: M1 */
    private static final String f76972M1;

    /* renamed from: N1 */
    private static final int f76973N1;

    /* renamed from: O1 */
    private static final int f76974O1;

    /* renamed from: P1 */
    private static final int f76975P1;

    /* renamed from: Q1 */
    private static final int f76976Q1;

    /* renamed from: R1 */
    private static final int f76977R1;

    /* renamed from: S1 */
    private static final int f76978S1;

    /* renamed from: T1 */
    private static final int f76979T1;

    /* renamed from: U1 */
    private static final int f76980U1;

    /* renamed from: V1 */
    private static final int f76981V1;

    /* renamed from: B1 */
    private boolean f76983B1;

    /* renamed from: F1 */
    private C0855y0 f76987F1;

    /* renamed from: G1 */
    private ContactProfile f76988G1;

    /* renamed from: H1 */
    private boolean f76989H1;

    /* renamed from: I1 */
    private boolean f76990I1;

    /* renamed from: J1 */
    private boolean f76991J1;

    /* renamed from: K1 */
    private boolean f76992K1;

    /* renamed from: L1 */
    private boolean f76993L1;

    /* renamed from: M0 */
    private RecyclerView f76994M0;

    /* renamed from: N0 */
    private RecyclerView f76995N0;

    /* renamed from: O0 */
    private LinearLayoutManager f76996O0;

    /* renamed from: P0 */
    private C7184q5 f76997P0;

    /* renamed from: Q0 */
    private MultiStateView f76998Q0;

    /* renamed from: R0 */
    private MultiStateView f76999R0;

    /* renamed from: T0 */
    private ViewOnClickListenerC2907r1 f77001T0;

    /* renamed from: U0 */
    private C31874cb f77002U0;

    /* renamed from: V0 */
    private C7192r2 f77003V0;

    /* renamed from: W0 */
    private FrameLayout f77004W0;

    /* renamed from: X0 */
    private FrameLayout f77005X0;

    /* renamed from: Y0 */
    private LinearLayout f77006Y0;

    /* renamed from: Z0 */
    private LinearLayout f77007Z0;

    /* renamed from: a1 */
    private LinearLayout f77008a1;

    /* renamed from: b1 */
    private LinearLayout f77009b1;

    /* renamed from: c1 */
    private RobotoTextView f77010c1;

    /* renamed from: d1 */
    private RobotoTextView f77011d1;

    /* renamed from: e1 */
    private C23528a f77012e1;

    /* renamed from: g1 */
    private Handler f77014g1;

    /* renamed from: h1 */
    private boolean f77015h1;

    /* renamed from: i1 */
    private boolean f77016i1;

    /* renamed from: j1 */
    private int f77017j1;

    /* renamed from: k1 */
    private boolean f77018k1;

    /* renamed from: m1 */
    private C7282z4 f77020m1;

    /* renamed from: n1 */
    private Set f77021n1;

    /* renamed from: o1 */
    private String f77022o1;

    /* renamed from: p1 */
    private C31874cb f77023p1;

    /* renamed from: q1 */
    private long f77024q1;

    /* renamed from: r1 */
    private boolean f77025r1;

    /* renamed from: t1 */
    private boolean f77027t1;

    /* renamed from: w1 */
    private boolean f77030w1;

    /* renamed from: y1 */
    private boolean f77032y1;

    /* renamed from: z1 */
    private int f77033z1;

    /* renamed from: S0 */
    private ArrayList f77000S0 = new ArrayList();

    /* renamed from: f1 */
    private String f77013f1 = "";

    /* renamed from: l1 */
    private boolean f77019l1 = true;

    /* renamed from: s1 */
    private InterfaceC20094a f77026s1 = new C14947g();

    /* renamed from: u1 */
    private InterfaceC0765j f77028u1 = new C0766k();

    /* renamed from: v1 */
    private InterfaceC20094a f77029v1 = new C14952l();

    /* renamed from: x1 */
    private InterfaceC20094a f77031x1 = new C14951k();

    /* renamed from: A1 */
    private Runnable f76982A1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.ic0
        @Override // java.lang.Runnable
        public final void run() {
            RequestFriendView.m83648kN(RequestFriendView.this);
        }
    };

    /* renamed from: C1 */
    private InterfaceC0765j f76984C1 = new C0766k();

    /* renamed from: D1 */
    private InterfaceC20094a f76985D1 = new C14950j();

    /* renamed from: E1 */
    private ArrayList f76986E1 = new ArrayList();

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$a */
    /* loaded from: classes6.dex */
    public static final class C14941a {
        private C14941a() {
        }

        public /* synthetic */ C14941a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m83727a() {
            return RequestFriendView.f76972M1;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$b */
    /* loaded from: classes6.dex */
    public static final class C14942b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f77035b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f77036c;

        /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77037a;

            /* renamed from: b */
            final /* synthetic */ String f77038b;

            a(ContactProfile contactProfile, String str) {
                this.f77037a = contactProfile;
                this.f77038b = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f77037a, true);
                C7960e.m41971c6().m42234Pb(this.f77038b);
            }
        }

        C14942b(String str, ContactProfile contactProfile) {
            this.f77035b = str;
            this.f77036c = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m83730e() {
            try {
                C19669z.Companion.m103232a().m103198O0();
                AbstractC23088h5.m118426g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m83731f(RequestFriendView requestFriendView) {
            StencilSwitch stencilSwitch;
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            ViewOnClickListenerC2907r1 m83712bN = requestFriendView.m83712bN();
            if (m83712bN != null) {
                stencilSwitch = m83712bN.m13855M();
            } else {
                stencilSwitch = null;
            }
            if (stencilSwitch != null) {
                stencilSwitch.setChecked(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(c20096c, "error_message");
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
                final RequestFriendView requestFriendView = RequestFriendView.this;
                requestFriendView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.C14942b.m83731f(RequestFriendView.this);
                    }
                });
            } finally {
                RequestFriendView.this.m83685HN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
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
                            C18644n.m98524E();
                            RequestFriendView.this.f72421L0.mo78960q3();
                            RequestFriendView.this.m83685HN(false);
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f77035b);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f77035b);
                    if (m98552o == null) {
                        m98552o = C28203u6.m141798e(C28203u6.f131407a, this.f77035b, null, 2, null);
                    }
                    if (m98552o == null) {
                        m98552o = this.f77036c;
                    }
                    m98552o.f42403c1 = false;
                    C28203u6.f131407a.m141824w(m98552o);
                    C21927m.m114302u().m114350o0(this.f77035b);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f77035b)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f77035b)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o, this.f77035b));
                    RequestFriendView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.vc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RequestFriendView.C14942b.m83730e();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C18644n.m98524E();
                RequestFriendView.this.f72421L0.mo78960q3();
                RequestFriendView.this.m83685HN(false);
            } catch (Throwable th2) {
                C18644n.m98524E();
                RequestFriendView.this.f72421L0.mo78960q3();
                RequestFriendView.this.m83685HN(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$c */
    /* loaded from: classes6.dex */
    public static final class C14943c implements Comparator {
        C14943c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100205c(contactProfile);
            long j11 = contactProfile.f42330D;
            AbstractC19074t.m100205c(contactProfile2);
            long j12 = contactProfile2.f42330D;
            if (j11 > j12) {
                return -1;
            }
            if (contactProfile.f42330D < j12) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$d */
    /* loaded from: classes6.dex */
    public static final class C14944d implements C21933s.x {
        C14944d() {
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            Handler m83707WM = RequestFriendView.this.m83707WM();
            AbstractC19074t.m100205c(m83707WM);
            m83707WM.post(RequestFriendView.this.m83709YM());
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$e */
    /* loaded from: classes6.dex */
    public static final class C14945e implements C21933s.x {
        C14945e() {
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            Handler m83707WM = RequestFriendView.this.m83707WM();
            AbstractC19074t.m100205c(m83707WM);
            m83707WM.post(RequestFriendView.this.m83709YM());
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$f */
    /* loaded from: classes6.dex */
    public static final class C14946f implements C21933s.x {
        C14946f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m83734d(RequestFriendView requestFriendView) {
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            requestFriendView.m83720rN();
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            RequestFriendView.this.m83726zN(false);
            RequestFriendView.this.m83679DN(z11);
            RequestFriendView.this.m83681FN(i11);
            Handler m83707WM = RequestFriendView.this.m83707WM();
            if (m83707WM != null) {
                final RequestFriendView requestFriendView = RequestFriendView.this;
                m83707WM.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.C14946f.m83734d(RequestFriendView.this);
                    }
                });
            }
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            RequestFriendView.this.m83726zN(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$g */
    /* loaded from: classes6.dex */
    public static final class C14947g implements InterfaceC20094a {
        C14947g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                RequestFriendView.this.m83725yN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            int i14;
            TrackingSource trackingSource;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    boolean z11 = true;
                    if (!jSONObject.isNull("data")) {
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
                        if (jSONObject2.isNull("ranking")) {
                            i14 = 0;
                        } else {
                            i14 = jSONObject2.getInt("ranking");
                        }
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 != 0) {
                                    if (i12 == 1) {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(RequestFriendView.this.m83710ZM());
                                        C21933s.m114404I().m114421H0(RequestFriendView.this.m83710ZM());
                                        RequestFriendView requestFriendView = RequestFriendView.this;
                                        requestFriendView.m83674BM(requestFriendView.m83710ZM());
                                        AbstractC23074g2.m118375a(0, RequestFriendView.this.m83710ZM(), "", 4);
                                        if (!AbstractC21935u.m114558y(RequestFriendView.this.m83710ZM())) {
                                            RequestFriendView requestFriendView2 = RequestFriendView.this;
                                            requestFriendView2.m83702RN(requestFriendView2.m83710ZM());
                                        }
                                    }
                                } else if (!C18644n.m98531l().m98558u(RequestFriendView.this.m83710ZM())) {
                                    if (RequestFriendView.this.f77019l1) {
                                        ContactProfile m83705UM = RequestFriendView.this.m83705UM();
                                        AbstractC19074t.m100205c(m83705UM);
                                        trackingSource = new TrackingSource(m83705UM.f42373R0);
                                        trackingSource.m40677a("sourceView", 2);
                                        C21927m m114302u = C21927m.m114302u();
                                        ContactProfile m83705UM2 = RequestFriendView.this.m83705UM();
                                        AbstractC19074t.m100205c(m83705UM2);
                                        m114302u.m114330e0(m83705UM2.f42434r, trackingSource);
                                    } else {
                                        C21927m m114302u2 = C21927m.m114302u();
                                        ContactProfile m83705UM3 = RequestFriendView.this.m83705UM();
                                        AbstractC19074t.m100205c(m83705UM3);
                                        int m114307E = m114302u2.m114307E(m83705UM3.f42434r);
                                        if (m114307E == -1) {
                                            trackingSource = new TrackingSource(343);
                                        } else {
                                            trackingSource = new TrackingSource(m114307E);
                                        }
                                        trackingSource.m40677a("sourceView", 7);
                                    }
                                    RequestFriendView requestFriendView3 = RequestFriendView.this;
                                    ContactProfile m83705UM4 = requestFriendView3.m83705UM();
                                    AbstractC19074t.m100205c(m83705UM4);
                                    requestFriendView3.m83722vN(m83705UM4, trackingSource);
                                    z11 = false;
                                } else {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(RequestFriendView.this.m83710ZM());
                                    C21933s.m114404I().m114421H0(RequestFriendView.this.m83710ZM());
                                    RequestFriendView requestFriendView4 = RequestFriendView.this;
                                    requestFriendView4.m83674BM(requestFriendView4.m83710ZM());
                                    AbstractC23074g2.m118375a(0, RequestFriendView.this.m83710ZM(), "", 4);
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(RequestFriendView.this.m83710ZM());
                                AbstractC19074t.m100207e(mo98491j, "get(...)");
                                mo98491j.f42369Q = i14;
                                C7960e.m41971c6().m42566vd(RequestFriendView.this.m83710ZM(), i14);
                                AbstractC2364o0.m12373p(RequestFriendView.this, RequestFriendView.f76978S1);
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.m141798e(C28203u6.f131407a, RequestFriendView.this.m83710ZM(), null, 2, null));
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(RequestFriendView.this.m83710ZM());
                                C21933s.m114404I().m114421H0(RequestFriendView.this.m83710ZM());
                                RequestFriendView requestFriendView5 = RequestFriendView.this;
                                requestFriendView5.m83674BM(requestFriendView5.m83710ZM());
                                AbstractC23074g2.m118375a(0, RequestFriendView.this.m83710ZM(), "", 4);
                            }
                        } else if (optInt < 0) {
                            switch (optInt) {
                                case -44:
                                case -43:
                                case -42:
                                case -41:
                                case -40:
                                    RequestFriendView requestFriendView6 = RequestFriendView.this;
                                    String m119317b = AbstractC23161o1.m119317b(optInt);
                                    AbstractC19074t.m100207e(m119317b, "getErrorDialogFriendRequest(...)");
                                    requestFriendView6.m83680EN(m119317b);
                                    AbstractC2364o0.m12373p(RequestFriendView.this, RequestFriendView.f76975P1);
                                    break;
                                default:
                                    if (!AbstractC23216t1.m119641f(RequestFriendView.this, optInt, false)) {
                                        ToastUtils.m89259g(optInt);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    RequestFriendView.this.m83725yN(false);
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    RequestFriendView.this.m83725yN(false);
                }
                RequestFriendView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                RequestFriendView.this.m83725yN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$h */
    /* loaded from: classes6.dex */
    public static final class C14948h implements C21933s.x {
        C14948h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m83737e(RequestFriendView requestFriendView, C20096c c20096c) {
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            try {
                requestFriendView.m83719pv(false, c20096c.m104491c());
                AbstractC23088h5.m118431l();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m83738f(RequestFriendView requestFriendView) {
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            requestFriendView.m83720rN();
            requestFriendView.m83719pv(false, 0);
            if (requestFriendView.m83711aN()) {
                requestFriendView.m83683GN(false);
                C23744a.Companion.m124119a().m124116d(6094, new Object[0]);
            }
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            RequestFriendView.this.m83673AN(false);
            Handler m83707WM = RequestFriendView.this.m83707WM();
            AbstractC19074t.m100205c(m83707WM);
            final RequestFriendView requestFriendView = RequestFriendView.this;
            m83707WM.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.yc0
                @Override // java.lang.Runnable
                public final void run() {
                    RequestFriendView.C14948h.m83738f(RequestFriendView.this);
                }
            });
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            RequestFriendView.this.m83673AN(false);
            Handler m83707WM = RequestFriendView.this.m83707WM();
            AbstractC19074t.m100205c(m83707WM);
            final RequestFriendView requestFriendView = RequestFriendView.this;
            m83707WM.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.zc0
                @Override // java.lang.Runnable
                public final void run() {
                    RequestFriendView.C14948h.m83737e(RequestFriendView.this, c20096c);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$i */
    /* loaded from: classes6.dex */
    public static final class C14949i extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ RequestFriendView f77045a;

            /* renamed from: b */
            final /* synthetic */ int f77046b;

            /* renamed from: c */
            final /* synthetic */ int f77047c;

            /* renamed from: d */
            final /* synthetic */ List f77048d;

            a(RequestFriendView requestFriendView, int i11, int i12, List list) {
                this.f77045a = requestFriendView;
                this.f77046b = i11;
                this.f77047c = i12;
                this.f77048d = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                this.f77045a.m83682GM(this.f77046b, this.f77047c, this.f77048d);
            }
        }

        C14949i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    C7184q5 m83703SM = RequestFriendView.this.m83703SM();
                    if (m83703SM != null) {
                        m83703SM.m36541i0(false);
                    }
                    C7184q5 m83703SM2 = RequestFriendView.this.m83703SM();
                    if (m83703SM2 != null) {
                        m83703SM2.m10008p();
                        return;
                    }
                    return;
                }
                C7184q5 m83703SM3 = RequestFriendView.this.m83703SM();
                if (m83703SM3 != null) {
                    m83703SM3.m36541i0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            try {
                RequestFriendView.this.m83684HM();
                if (RequestFriendView.this.m83708XM() != null && RequestFriendView.this.m83703SM() != null) {
                    LinearLayoutManager m83708XM = RequestFriendView.this.m83708XM();
                    AbstractC19074t.m100205c(m83708XM);
                    int m9740Y1 = m83708XM.m9740Y1();
                    LinearLayoutManager m83708XM2 = RequestFriendView.this.m83708XM();
                    AbstractC19074t.m100205c(m83708XM2);
                    int m9745c2 = m83708XM2.m9745c2();
                    C7184q5 m83703SM = RequestFriendView.this.m83703SM();
                    AbstractC19074t.m100205c(m83703SM);
                    List m36524W = m83703SM.m36524W();
                    if (m36524W != null) {
                        C0809c1.m2050b(new a(RequestFriendView.this, m9740Y1, m9745c2, m36524W));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$j */
    /* loaded from: classes6.dex */
    public static final class C14950j implements InterfaceC20094a {
        C14950j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m83740d(RequestFriendView requestFriendView) {
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            try {
                requestFriendView.m83720rN();
                requestFriendView.m83719pv(false, 0);
                requestFriendView.m83678DM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(RequestFriendView.Companion.m83727a(), e11.toString());
                }
            } finally {
                RequestFriendView.this.m83723wN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = "";
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    C21933s.m114404I().m114461d0(RequestFriendView.this.m83704TM(), true);
                    AbstractC23074g2.m118377c(1, RequestFriendView.this.m83704TM(), "", true);
                    AbstractC23063f2.m118362n(RequestFriendView.this.m83704TM());
                    InterfaceC27218a m92676n2 = RequestFriendView.this.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        final RequestFriendView requestFriendView = RequestFriendView.this;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ad0
                            @Override // java.lang.Runnable
                            public final void run() {
                                RequestFriendView.C14950j.m83740d(RequestFriendView.this);
                            }
                        });
                    }
                    String optString = ((JSONObject) obj).optString("message", "");
                    if (!TextUtils.isEmpty(optString)) {
                        str = optString;
                    }
                    AbstractC0924m0.m4212sq(str);
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(RequestFriendView.Companion.m83727a(), e11.toString());
                }
                RequestFriendView.this.m83723wN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                RequestFriendView.this.m83723wN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$k */
    /* loaded from: classes6.dex */
    public static final class C14951k implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$k$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77051a;

            a(ContactProfile contactProfile) {
                this.f77051a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f77051a);
            }
        }

        C14951k() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                RequestFriendView.this.m83724xN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            String str3;
            ContactProfile m153177a;
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        String string = jSONObject.getString("error_code");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        if (Integer.parseInt(string) == 0) {
                            AbstractC23059e9.m118317F(RequestFriendView.this.m83710ZM());
                            C21927m.m114302u().m114337i(RequestFriendView.this.m83710ZM());
                            AbstractC23063f2.m118365q(RequestFriendView.this.m83710ZM());
                            C21933s.m114404I().m114421H0(RequestFriendView.this.m83710ZM());
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                            RequestFriendView requestFriendView = RequestFriendView.this;
                            requestFriendView.m83674BM(requestFriendView.m83710ZM());
                            if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                                str = "";
                                str2 = str;
                                i11 = 0;
                            } else {
                                i11 = optJSONObject.optInt("action", 0);
                                str2 = optJSONObject.optString("alias");
                                AbstractC19074t.m100207e(str2, "optString(...)");
                                str = optJSONObject.optString("desc");
                                AbstractC19074t.m100207e(str, "optString(...)");
                            }
                            if (!RequestFriendView.this.m83701RM().isEmpty()) {
                                int size = RequestFriendView.this.m83701RM().size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    if (((C31859bb) RequestFriendView.this.m83701RM().get(i12)).m153145a() == null) {
                                        str3 = "";
                                    } else {
                                        str3 = ((C31859bb) RequestFriendView.this.m83701RM().get(i12)).m153145a().f146385a;
                                    }
                                    if (!TextUtils.isEmpty(RequestFriendView.this.m83710ZM()) && AbstractC19074t.m100204b(RequestFriendView.this.m83710ZM(), str3) && (m153177a = ((C31859bb) RequestFriendView.this.m83701RM().get(i12)).m153145a().m153177a()) != null) {
                                        m153177a.f42441t0 = true;
                                        m153177a.f42447v0 = m153177a.f42352K0;
                                        m153177a.f42456y0 = i11;
                                        if (!TextUtils.isEmpty(str2)) {
                                            m153177a.f42442t1 = str2;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            m153177a.f42436r1 = new SpannableStringBuilder(str);
                                        }
                                        Map map = AbstractC23304d.f113405l;
                                        if (map.containsKey(RequestFriendView.this.m83710ZM()) && map.get(RequestFriendView.this.m83710ZM()) != null) {
                                            Object obj2 = map.get(RequestFriendView.this.m83710ZM());
                                            AbstractC19074t.m100205c(obj2);
                                            m153177a.f42438s0 = ((C31965ic) obj2).m153681a();
                                        }
                                        if (C21927m.m114302u().m114357s() != null) {
                                            if (!C21927m.m114302u().m114357s().m153137g(RequestFriendView.this.m83710ZM())) {
                                                C21927m.m114302u().m114357s().add(m153177a);
                                                C0824j.m2153b(new a(m153177a));
                                            } else if (C21927m.m114302u().m114357s().m153138j(RequestFriendView.this.m83710ZM()) != null) {
                                                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(RequestFriendView.this.m83710ZM());
                                                m153138j.f42456y0 = i11;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    m153138j.f42442t1 = str2;
                                                }
                                                if (!TextUtils.isEmpty(str)) {
                                                    m153138j.f42436r1 = new SpannableStringBuilder(str);
                                                }
                                            }
                                        }
                                        AbstractC23074g2.m118375a(0, RequestFriendView.this.m83710ZM(), "", 4);
                                        if (!TextUtils.isEmpty(m153177a.f42434r)) {
                                            AbstractC23181q.m119431d(m153177a.f42434r, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                RequestFriendView.this.m83724xN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                RequestFriendView.this.m83724xN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$l */
    /* loaded from: classes6.dex */
    public static final class C14952l implements InterfaceC20094a {
        C14952l() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                RequestFriendView.this.m83687IN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(RequestFriendView.this.m83710ZM());
                            if (RequestFriendView.this.f77019l1) {
                                C21933s.m114404I().m114421H0(RequestFriendView.this.m83710ZM());
                                RequestFriendView requestFriendView = RequestFriendView.this;
                                requestFriendView.m83674BM(requestFriendView.m83710ZM());
                                AbstractC23074g2.m118375a(0, RequestFriendView.this.m83710ZM(), "", 4);
                            } else {
                                AbstractC21935u.m114533W(RequestFriendView.this.m83710ZM(), 3, "");
                            }
                            AbstractC23063f2.m118349a(RequestFriendView.this.m83705UM());
                        } else {
                            AbstractC23063f2.m118357i(i11, RequestFriendView.this.m83710ZM());
                            switch (i11) {
                                case -44:
                                case -43:
                                case -42:
                                case -41:
                                case -40:
                                    RequestFriendView requestFriendView2 = RequestFriendView.this;
                                    String m119317b = AbstractC23161o1.m119317b(i11);
                                    AbstractC19074t.m100207e(m119317b, "getErrorDialogFriendRequest(...)");
                                    requestFriendView2.m83680EN(m119317b);
                                    AbstractC2364o0.m12373p(RequestFriendView.this, RequestFriendView.f76975P1);
                                    break;
                                default:
                                    if (!AbstractC23216t1.m119641f(RequestFriendView.this, i11, false)) {
                                        ToastUtils.m89259g(i11);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                RequestFriendView.this.m83687IN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                RequestFriendView.this.m83721sN();
            } catch (Throwable th2) {
                RequestFriendView.this.m83687IN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                RequestFriendView.this.m83721sN();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$m */
    /* loaded from: classes6.dex */
    public static final class C14953m implements ViewOnClickListenerC2907r1.a {
        C14953m() {
        }

        @Override // bn.ViewOnClickListenerC2907r1.a
        /* renamed from: a */
        public void mo13859a() {
            RequestFriendView.this.showDialog(RequestFriendView.f76981V1);
        }

        @Override // bn.ViewOnClickListenerC2907r1.a
        /* renamed from: b */
        public void mo13860b(boolean z11) {
            if (z11) {
                RequestFriendView requestFriendView = RequestFriendView.this;
                C31874cb m83706VM = requestFriendView.m83706VM();
                AbstractC19074t.m100205c(m83706VM);
                ContactProfile m153177a = m83706VM.m153177a();
                AbstractC19074t.m100207e(m153177a, "genContactProfile(...)");
                requestFriendView.m83672AM(m153177a);
                return;
            }
            RequestFriendView requestFriendView2 = RequestFriendView.this;
            C31874cb m83706VM2 = requestFriendView2.m83706VM();
            AbstractC19074t.m100205c(m83706VM2);
            ContactProfile m153177a2 = m83706VM2.m153177a();
            AbstractC19074t.m100207e(m153177a2, "genContactProfile(...)");
            requestFriendView2.m83698PN(m153177a2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$n */
    /* loaded from: classes6.dex */
    public static final class C14954n implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f77055b;

        /* renamed from: c */
        final /* synthetic */ String f77056c;

        C14954n(boolean z11, String str) {
            this.f77055b = z11;
            this.f77056c = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            RequestFriendView.this.mo49315c4();
            if (RequestFriendView.this.mo78963ru()) {
                ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            RequestFriendView.this.mo49315c4();
            if (RequestFriendView.this.mo78963ru()) {
                ToastUtils.m89266n(AbstractC8020f0.str_reportspam_done, new Object[0]);
            }
            if (this.f77055b) {
                AbstractC21935u.m114535b(this.f77056c);
                AbstractC23088h5.m118426g();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$o */
    /* loaded from: classes6.dex */
    public static final class C14955o extends ZdsActionBar.AbstractC16987c {
        C14955o() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC23647d.m123897g("5901176");
            RequestFriendView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$p */
    /* loaded from: classes6.dex */
    public static final class C14956p extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ List f77059b;

        /* renamed from: c */
        final /* synthetic */ int f77060c;

        /* renamed from: d */
        final /* synthetic */ int f77061d;

        C14956p(List list, int i11, int i12) {
            this.f77059b = list;
            this.f77060c = i11;
            this.f77061d = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            if (RequestFriendView.this.m83715eN() == null) {
                RequestFriendView.this.m83688JN(new C0855y0());
            }
            C0855y0 m83715eN = RequestFriendView.this.m83715eN();
            AbstractC19074t.m100205c(m83715eN);
            HashMap m2385c = m83715eN.m2385c();
            C0855y0 m83715eN2 = RequestFriendView.this.m83715eN();
            AbstractC19074t.m100205c(m83715eN2);
            HashMap m2384b = m83715eN2.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f77059b.size();
            for (int i11 = 0; i11 < size; i11++) {
                C31859bb c31859bb = (C31859bb) this.f77059b.get(i11);
                if (c31859bb != null && c31859bb.m153145a() != null && !TextUtils.isEmpty(c31859bb.m153145a().f146385a)) {
                    String str = c31859bb.m153145a().f146385a;
                    if (m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (strArr2 = (c23651h2 = (C23651h) c23669z).f114659f) != null) {
                            if (!AbstractC19074t.m100204b(strArr2[2], String.valueOf(i11))) {
                                c23651h2.f114659f[2] = String.valueOf(i11);
                            }
                            if (i11 < this.f77060c || i11 > this.f77061d) {
                                c23651h2.f114660g = false;
                            }
                            AbstractC19074t.m100205c(str);
                            hashMap.put(str, m2385c.get(str));
                        }
                    }
                    if (m2384b.containsKey(str)) {
                        C23669z c23669z2 = (C23669z) m2384b.get(str);
                        if ((c23669z2 instanceof C23651h) && (strArr = (c23651h = (C23651h) c23669z2).f114659f) != null) {
                            if (!AbstractC19074t.m100204b(strArr[2], String.valueOf(i11))) {
                                c23651h.f114659f[2] = String.valueOf(i11);
                            }
                            AbstractC19074t.m100205c(str);
                            hashMap2.put(str, m2384b.get(str));
                        }
                    }
                }
            }
            if (RequestFriendView.this.m83715eN() == null) {
                RequestFriendView.this.m83688JN(new C0855y0());
            }
            C0855y0 m83715eN3 = RequestFriendView.this.m83715eN();
            AbstractC19074t.m100205c(m83715eN3);
            m83715eN3.m2386d(hashMap);
            C0855y0 m83715eN4 = RequestFriendView.this.m83715eN();
            AbstractC19074t.m100205c(m83715eN4);
            m83715eN4.m2387e(hashMap2);
            RequestFriendView.this.m83682GM(this.f77060c, this.f77061d, this.f77059b);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$q */
    /* loaded from: classes6.dex */
    public static final class C14957q implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f77063b;

        C14957q(ContactProfile contactProfile) {
            this.f77063b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m83743e() {
            try {
                C19669z.Companion.m103232a().m103198O0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m83744f(RequestFriendView requestFriendView) {
            StencilSwitch stencilSwitch;
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            ViewOnClickListenerC2907r1 m83712bN = requestFriendView.m83712bN();
            if (m83712bN != null) {
                stencilSwitch = m83712bN.m13855M();
            } else {
                stencilSwitch = null;
            }
            if (stencilSwitch != null) {
                stencilSwitch.setChecked(true);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                ToastUtils.m89259g(c20096c.m104491c());
                final RequestFriendView requestFriendView = RequestFriendView.this;
                requestFriendView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.C14957q.m83744f(RequestFriendView.this);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            RequestFriendView.this.f72421L0.mo78960q3();
            RequestFriendView.this.m83690KN(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
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
                            C21927m.m114302u().m114336h0();
                            RequestFriendView.this.m83690KN(false);
                            RequestFriendView.this.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f77063b;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    RequestFriendView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.cd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RequestFriendView.C14957q.m83743e();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C21927m.m114302u().m114336h0();
                RequestFriendView.this.m83690KN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                C21927m.m114302u().m114336h0();
                RequestFriendView.this.m83690KN(false);
                RequestFriendView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$r */
    /* loaded from: classes6.dex */
    public static final class C14958r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f77064a;

        /* renamed from: b */
        final /* synthetic */ RequestFriendView f77065b;

        C14958r(ContactProfile contactProfile, RequestFriendView requestFriendView) {
            this.f77064a = contactProfile;
            this.f77065b = requestFriendView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m83746d(RequestFriendView requestFriendView) {
            AbstractC19074t.m100208f(requestFriendView, "this$0");
            C7282z4 c7282z4 = requestFriendView.f77020m1;
            if (c7282z4 != null) {
                c7282z4.m10008p();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f77065b.m83692LN(false);
            this.f77065b.mo78960q3();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = this.f77065b.m92652XI(AbstractC8020f0.error_message_with_code);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(c20096c.m104491c())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int optInt = optJSONArray.optJSONObject(0).optInt("errorCode");
                    if (optInt != -47) {
                        if (optInt != 0) {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String m92652XI = this.f77065b.m92652XI(AbstractC8020f0.error_message_with_code);
                            AbstractC19074t.m100207e(m92652XI, "getString(...)");
                            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(optInt)}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                            ToastUtils.showMess(format);
                        } else {
                            AbstractC23063f2.m118363o(this.f77064a.f42434r);
                            C21920f.m114270a().m114273d(this.f77064a.f42434r);
                            if (this.f77065b.f77021n1 == null) {
                                this.f77065b.f77021n1 = new HashSet();
                            }
                            Set set = this.f77065b.f77021n1;
                            if (set != null) {
                                String str = this.f77064a.f42434r;
                                AbstractC19074t.m100207e(str, "uid");
                                set.add(str);
                            }
                        }
                    } else {
                        C19067n0 c19067n02 = C19067n0.f94947a;
                        String m92652XI2 = this.f77065b.m92652XI(AbstractC8020f0.error_undo_friend_request);
                        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                        String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{Integer.valueOf(optInt)}, 1));
                        AbstractC19074t.m100207e(format2, "format(...)");
                        ToastUtils.showMess(format2);
                    }
                }
                final RequestFriendView requestFriendView = this.f77065b;
                requestFriendView.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.dd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.C14958r.m83746d(RequestFriendView.this);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f77065b.m83692LN(false);
            this.f77065b.mo78960q3();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$s */
    /* loaded from: classes6.dex */
    public static final class C14959s implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.RequestFriendView$s$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77066a;

            a(ContactProfile contactProfile) {
                this.f77066a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f77066a.f42434r);
            }
        }

        C14959s() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                C18644n.m98531l().m98543e(contactProfile);
                C0824j.m2153b(new a(contactProfile));
                C18644n.m98524E();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(RequestFriendView.Companion.m83727a(), e11);
            }
        }
    }

    static {
        String simpleName = SuggestFriendView.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f76972M1 = simpleName;
        f76973N1 = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
        f76974O1 = 1000;
        f76975P1 = 100;
        f76976Q1 = 1;
        f76977R1 = 2;
        f76978S1 = 3;
        f76979T1 = 4;
        f76980U1 = 5;
        f76981V1 = 6;
    }

    /* renamed from: EM */
    private final void m83632EM() {
        final Set m131188P0;
        Set set = this.f77021n1;
        if (set != null) {
            AbstractC19074t.m100205c(set);
            if (!set.isEmpty()) {
                try {
                    Set set2 = this.f77021n1;
                    AbstractC19074t.m100205c(set2);
                    m131188P0 = AbstractC25332a0.m131188P0(set2);
                    AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.tc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RequestFriendView.m83633FM(m131188P0);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m83633FM(Set set) {
        AbstractC19074t.m100208f(set, "$setClearSourceFriend");
        try {
            ArrayList m118352d = AbstractC23063f2.m118352d(false);
            AbstractC19074t.m100207e(m118352d, "getDataFriendRequestedShallowClone(...)");
            if (!m118352d.isEmpty()) {
                int size = m118352d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ContactProfile contactProfile = (ContactProfile) m118352d.get(i11);
                    if (contactProfile != null && set.contains(contactProfile.f42434r)) {
                        set.remove(contactProfile.f42434r);
                    }
                }
            }
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        C21927m.m114302u().m114352p0(str);
                        C7960e.m41971c6().m42099Dc(str);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m83634JM(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        try {
            requestFriendView.m83720rN();
            requestFriendView.m83719pv(false, 0);
            requestFriendView.m83678DM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m83635LM(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        requestFriendView.m83721sN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m83636MM(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        requestFriendView.m83714dN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m83637NM(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "$args");
        C21933s.m114404I().m114457b0((String) objArr[0], false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public static final void m83642gN(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        if (C23055e5.m118273h(false, 1, null)) {
            requestFriendView.m83719pv(true, 0);
            requestFriendView.m83714dN();
            return;
        }
        MultiStateView multiStateView = requestFriendView.f76998Q0;
        AbstractC19074t.m100205c(multiStateView);
        multiStateView.setVisibility(0);
        MultiStateView multiStateView2 = requestFriendView.f76998Q0;
        AbstractC19074t.m100205c(multiStateView2);
        multiStateView2.setState(MultiStateView.EnumC15914e.ERROR);
        MultiStateView multiStateView3 = requestFriendView.f76998Q0;
        AbstractC19074t.m100205c(multiStateView3);
        multiStateView3.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        MultiStateView multiStateView4 = requestFriendView.f76998Q0;
        AbstractC19074t.m100205c(multiStateView4);
        multiStateView4.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public static final void m83645iN(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        requestFriendView.m83721sN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public static final void m83648kN(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        requestFriendView.m83720rN();
    }

    /* renamed from: lN */
    private final void m83650lN(final ContactProfile contactProfile) {
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 2);
        C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
        AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(10)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.sc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m83652mN;
                m83652mN = RequestFriendView.m83652mN(ContactProfile.this, this);
                return m83652mN;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public static final Void m83652mN(ContactProfile contactProfile, RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(contactProfile, "$profile");
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        C21933s.m114404I().m114421H0(contactProfile.f42434r);
        requestFriendView.m83674BM(contactProfile.f42434r);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m83654nN(RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        requestFriendView.m83720rN();
        requestFriendView.m83719pv(false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m83656oN(RequestFriendView requestFriendView, SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (requestFriendView.f77002U0 != null) {
            Object item = simpleAdapter.getItem(i11);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
            Object obj = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue == AbstractC8020f0.view_detail_zalouser) {
                C21927m m114302u = C21927m.m114302u();
                C31874cb c31874cb = requestFriendView.f77002U0;
                AbstractC19074t.m100205c(c31874cb);
                String str = c31874cb.f146385a;
                C31874cb c31874cb2 = requestFriendView.f77002U0;
                AbstractC19074t.m100205c(c31874cb2);
                m114302u.m114330e0(str, new TrackingSource(c31874cb2.f146389e));
                C32002l4 m154287a = C32002l4.Companion.m154287a(10);
                C31874cb c31874cb3 = requestFriendView.f77002U0;
                AbstractC19074t.m100205c(c31874cb3);
                C26365a m135743b = new C26365a.b(c31874cb3.f146385a, m154287a).m135739F("3133").m135743b();
                InterfaceC27218a m92676n2 = requestFriendView.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    c17487o0 = m92676n2.mo35579p();
                } else {
                    c17487o0 = null;
                }
                if (c17487o0 != null) {
                    new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), m135743b, 0, 1));
                    return;
                }
                return;
            }
            if (intValue == AbstractC8020f0.btn_reject_Invitation) {
                requestFriendView.f77023p1 = requestFriendView.f77002U0;
                requestFriendView.m83689KM();
            } else if (intValue == AbstractC8020f0.str_menu_item_delete_suggest) {
                requestFriendView.f77023p1 = requestFriendView.f77002U0;
                requestFriendView.m83689KM();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m83658pN(RequestFriendView requestFriendView, String str, int i11, String str2, boolean z11) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        try {
            requestFriendView.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14954n(z11, str));
            c0766k.mo1457J3(str, "3", "", "", i11, str2, z11, false, "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m83660qN(RequestFriendView requestFriendView, View view) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        AbstractC23647d.m123897g("5901177");
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_INT_SOURCE_VIEW", 2);
        C17487o0 m92662fJ = requestFriendView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public static final void m83664tN(final RequestFriendView requestFriendView) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        final ArrayList m83676CM = requestFriendView.m83676CM();
        requestFriendView.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.jc0
            @Override // java.lang.Runnable
            public final void run() {
                RequestFriendView.m83666uN(RequestFriendView.this, m83676CM);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static final void m83666uN(RequestFriendView requestFriendView, ArrayList arrayList) {
        AbstractC19074t.m100208f(requestFriendView, "this$0");
        AbstractC19074t.m100208f(arrayList, "$displayList");
        try {
            C7282z4 c7282z4 = requestFriendView.f77020m1;
            if (c7282z4 != null) {
                c7282z4.m37051P(arrayList);
            }
            C7282z4 c7282z42 = requestFriendView.f77020m1;
            if (c7282z42 != null) {
                c7282z42.m10008p();
            }
            RobotoTextView robotoTextView = requestFriendView.f77011d1;
            if (robotoTextView != null) {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_request_from_me) + "  " + arrayList.size());
            }
            requestFriendView.m83675BN(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AM */
    public final void m83672AM(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        if (this.f76990I1) {
            return;
        }
        this.f72421L0.mo46829Y();
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14942b(str, contactProfile));
        this.f76990I1 = true;
        c0766k.mo1479L9(str, 4);
    }

    /* renamed from: AN */
    public final void m83673AN(boolean z11) {
        this.f77032y1 = z11;
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: B1 */
    public void mo36557B1() {
    }

    /* renamed from: BM */
    public final void m83674BM(String str) {
        try {
            C21933s.m114404I().m114454a(str);
            AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f76997P0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BN */
    public final void m83675BN(boolean z11) {
        try {
            if (z11) {
                RecyclerView recyclerView = this.f76994M0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                MultiStateView multiStateView = this.f76999R0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                }
                MultiStateView multiStateView2 = this.f76999R0;
                if (multiStateView2 != null) {
                    multiStateView2.setState(MultiStateView.EnumC15914e.LOADING);
                    return;
                }
                return;
            }
            C7282z4 c7282z4 = this.f77020m1;
            if (c7282z4 != null) {
                AbstractC19074t.m100205c(c7282z4);
                if (c7282z4.mo10003k() > 0) {
                    RecyclerView recyclerView2 = this.f76994M0;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    MultiStateView multiStateView3 = this.f76999R0;
                    if (multiStateView3 != null) {
                        multiStateView3.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            RecyclerView recyclerView3 = this.f76994M0;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            MultiStateView multiStateView4 = this.f76999R0;
            if (multiStateView4 != null) {
                multiStateView4.setVisibility(0);
            }
            MultiStateView multiStateView5 = this.f76999R0;
            if (multiStateView5 != null) {
                multiStateView5.setState(MultiStateView.EnumC15914e.EMPTY);
            }
            MultiStateView multiStateView6 = this.f76999R0;
            if (multiStateView6 != null) {
                multiStateView6.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_from_me_empty));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f77014g1 = new Handler(Looper.getMainLooper());
        m92637BK(true);
        if (m92642L3() != null) {
            Bundle m92642L3 = m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            this.f77018k1 = m92642L3.getBoolean("EXTRA_OPEN_FROM_TAB_CONTACT", false);
        }
    }

    /* renamed from: CM */
    public final ArrayList m83676CM() {
        String str;
        C31934gb m114207j;
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList m118352d = AbstractC23063f2.m118352d(false);
            AbstractC19074t.m100207e(m118352d, "getDataFriendRequestedShallowClone(...)");
            if (!m118352d.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(m118352d.size());
                Iterator it = m118352d.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile != null) {
                        contactProfile.m40400c1(false);
                        arrayList2.add(contactProfile.f42434r);
                        arrayList.add(contactProfile);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C18635e m141813j = C28203u6.f131407a.m141813j(arrayList2);
                    Iterator it2 = arrayList.iterator();
                    C21915b0 c21915b0 = null;
                    while (it2.hasNext()) {
                        ContactProfile contactProfile2 = (ContactProfile) it2.next();
                        ContactProfile mo98491j = m141813j.mo98491j(contactProfile2.f42434r);
                        if (mo98491j != null) {
                            str = mo98491j.f42455y;
                        } else {
                            str = contactProfile2.f42455y;
                        }
                        contactProfile2.f42455y = str;
                        if (TextUtils.isEmpty(str)) {
                            if (c21915b0 == null) {
                                c21915b0 = C21913a0.m114177i().m114182e();
                            }
                            if (c21915b0 != null && c21915b0.m114206g(contactProfile2.f42434r) && (m114207j = c21915b0.m114207j(contactProfile2.f42434r)) != null) {
                                contactProfile2.f42455y = m114207j.f146730b;
                            }
                        }
                        if (C23302b.f113247a.m120523d(contactProfile2.f42446v)) {
                            contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.m40383Q(true, false));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new C14943c());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: CN */
    public final void m83677CN(int i11) {
        MultiStateView multiStateView = this.f76998Q0;
        if (multiStateView != null) {
            AbstractC19074t.m100205c(multiStateView);
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        boolean z11 = false;
        if (i11 == f76979T1) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.view_detail_zalouser));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.view_detail_zalouser));
            arrayList.add(hashMap);
            C31874cb c31874cb = this.f77002U0;
            if (c31874cb != null) {
                AbstractC19074t.m100205c(c31874cb);
                if (c31874cb.f146399o == 1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_delete_suggest));
                    hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_menu_item_delete_suggest));
                    arrayList.add(hashMap2);
                } else {
                    C31874cb c31874cb2 = this.f77002U0;
                    if (c31874cb2 != null && c31874cb2.f146399o == 2 && ((c31874cb2 == null || c31874cb2.f146400p != 3) && (c31874cb2 == null || c31874cb2.f146400p != 5))) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.btn_reject_Invitation));
                        hashMap3.put("id", Integer.valueOf(AbstractC8020f0.btn_reject_Invitation));
                        arrayList.add(hashMap3);
                    }
                }
            }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            C31874cb c31874cb3 = this.f77002U0;
            if (c31874cb3 != null) {
                AbstractC19074t.m100205c(c31874cb3);
                aVar.m43172u(c31874cb3.m153180d(true, false));
            }
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.uc0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    RequestFriendView.m83656oN(RequestFriendView.this, simpleAdapter, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        if (i11 == f76976Q1) {
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_ask_to_delete_selected)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar2.m43152a();
        }
        if (i11 == f76977R1) {
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar3.m43152a();
        }
        if (i11 == f76978S1) {
            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
            aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), this);
            return aVar4.m43152a();
        }
        if (i11 == f76975P1) {
            C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
            aVar5.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f77013f1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
            return aVar5.m43152a();
        }
        String str = null;
        if (i11 == f76980U1) {
            ViewOnClickListenerC2907r1 viewOnClickListenerC2907r1 = new ViewOnClickListenerC2907r1(this.f72421L0.m92648SI());
            this.f77001T0 = viewOnClickListenerC2907r1;
            C31874cb c31874cb4 = this.f77023p1;
            if (c31874cb4 != null) {
                str = c31874cb4.f146385a;
            }
            viewOnClickListenerC2907r1.m13858Q(str);
            ViewOnClickListenerC2907r1 viewOnClickListenerC2907r12 = this.f77001T0;
            if (viewOnClickListenerC2907r12 != null) {
                viewOnClickListenerC2907r12.m13857P(AbstractC0924m0.m4252u7());
            }
            ViewOnClickListenerC2907r1 viewOnClickListenerC2907r13 = this.f77001T0;
            if (viewOnClickListenerC2907r13 != null) {
                viewOnClickListenerC2907r13.m13856O(new C14953m());
            }
            return this.f77001T0;
        }
        if (i11 != f76981V1) {
            return null;
        }
        C31874cb c31874cb5 = this.f77023p1;
        AbstractC19074t.m100205c(c31874cb5);
        final String str2 = c31874cb5.f146385a;
        if (!TextUtils.isEmpty(str2) && !C21927m.m114302u().m114312J().m153137g(str2)) {
            z11 = true;
        }
        return new C2913t1(m92648SI()).m13864d(z11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_check_block_user)).m13865e(new C2913t1.c() { // from class: com.zing.zalo.ui.zviews.hc0
            @Override // bn.C2913t1.c
            /* renamed from: b */
            public final void mo13055b(int i12, String str3, boolean z12) {
                RequestFriendView.m83658pN(RequestFriendView.this, str2, i12, str3, z12);
            }
        }).m13862b(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportspam_confirm), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
    }

    /* renamed from: DM */
    public final void m83678DM() {
        try {
            boolean m114494u0 = C21933s.m114404I().m114494u0();
            boolean m114496v0 = C21933s.m114404I().m114496v0();
            if (m114494u0) {
                C21933s.m114404I().m114462e(1, new C14944d());
            }
            if (m114496v0) {
                C21933s.m114404I().m114462e(0, new C14945e());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DN */
    public final void m83679DN(boolean z11) {
        this.f76993L1 = z11;
    }

    /* renamed from: EN */
    public final void m83680EN(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f77013f1 = str;
    }

    /* renamed from: FN */
    public final void m83681FN(int i11) {
        this.f77033z1 = i11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.request_friend_view, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        m83718jN(inflate);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: GM */
    public final void m83682GM(int i11, int i12, List list) {
        int i13;
        HashMap m2385c;
        int i14;
        C31859bb c31859bb;
        boolean m127120J;
        try {
            ?? r42 = 1;
            if (AbstractC23309i.m120962G3(3) != 1) {
                return;
            }
            if (list != null) {
                i13 = list.size();
            } else {
                i13 = 0;
            }
            if (i13 == 0) {
                return;
            }
            C0855y0 c0855y0 = this.f76987F1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                AbstractC19074t.m100205c(c0855y0);
                m2385c = c0855y0.m2385c();
            }
            int i15 = 0;
            while (i15 < i13) {
                AbstractC19074t.m100205c(list);
                if (list.get(i15) != null && (c31859bb = (C31859bb) list.get(i15)) != null && c31859bb.m153145a() != null) {
                    String str = c31859bb.m153145a().f146385a;
                    AbstractC19074t.m100207e(str, "uid");
                    m127120J = AbstractC24341v.m127120J(str, "-", false, 2, null);
                    if (!m127120J) {
                        C31874cb m153145a = c31859bb.m153145a();
                        if (i15 < i11 || i15 > i12) {
                            i14 = i13;
                            if (m2385c.containsKey(m153145a.f146385a)) {
                                Object obj = m2385c.get(m153145a.f146385a);
                                AbstractC19074t.m100205c(obj);
                                ((C23669z) obj).f114660g = false;
                            }
                        } else {
                            String valueOf = String.valueOf(i15);
                            String str2 = "1";
                            if (m2385c.containsKey(m153145a.f146385a)) {
                                C23669z c23669z = (C23669z) m2385c.get(m153145a.f146385a);
                                if (c23669z instanceof C23651h) {
                                    C23651h c23651h = (C23651h) c23669z;
                                    if (c23651h.f114659f != null && c23651h.m123964l() && !((C23651h) c23669z).f114660g) {
                                        ((C23651h) c23669z).f114660g = r42;
                                        if (AbstractC19074t.m100204b(c23651h.f114659f[2], valueOf)) {
                                            String str3 = c23651h.f114659f[0];
                                            if (str3 != null && str3.length() != 0) {
                                                str2 = str3;
                                            }
                                            c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str2) + r42);
                                        } else {
                                            i14 = i13;
                                            ((C23651h) c23669z).f114656c = System.currentTimeMillis();
                                            String[] strArr = c23651h.f114659f;
                                            strArr[0] = "1";
                                            strArr[2] = valueOf;
                                        }
                                    }
                                    i14 = i13;
                                }
                                i14 = i13;
                            } else {
                                i14 = i13;
                                C23651h m123961i = C23651h.m123961i(26, "1", m153145a.f146385a, valueOf, String.valueOf(m153145a.f146399o), String.valueOf(m153145a.f146389e));
                                if (m123961i != null) {
                                    m123961i.f114656c = System.currentTimeMillis();
                                    m123961i.f114654a = 3;
                                    m123961i.f114655b = 1;
                                    m123961i.f114657d = 26;
                                    m123961i.f114660g = true;
                                    AbstractC19074t.m100205c(m2385c);
                                    m2385c.put(m153145a.f146385a, m123961i);
                                }
                            }
                            C23669z c23669z2 = (C23669z) m2385c.get(m153145a.f146385a);
                            if (c23669z2 != null) {
                                C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(c23669z2);
                            }
                        }
                        i15++;
                        i13 = i14;
                        r42 = 1;
                    }
                }
                i14 = i13;
                i15++;
                i13 = i14;
                r42 = 1;
            }
            if (this.f76987F1 == null) {
                this.f76987F1 = new C0855y0();
            }
            C0855y0 c0855y02 = this.f76987F1;
            AbstractC19074t.m100205c(c0855y02);
            c0855y02.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: GN */
    public final void m83683GN(boolean z11) {
        this.f77015h1 = z11;
    }

    /* renamed from: HM */
    public final void m83684HM() {
        int height;
        try {
            LinearLayoutManager linearLayoutManager = this.f76996O0;
            AbstractC19074t.m100205c(linearLayoutManager);
            int m9740Y1 = linearLayoutManager.m9740Y1();
            LinearLayoutManager linearLayoutManager2 = this.f76996O0;
            AbstractC19074t.m100205c(linearLayoutManager2);
            int m9745c2 = linearLayoutManager2.m9745c2();
            if (m9740Y1 > m9745c2) {
                return;
            }
            while (true) {
                C7184q5 c7184q5 = this.f76997P0;
                AbstractC19074t.m100205c(c7184q5);
                if (c7184q5.m36523V(m9740Y1) != null) {
                    C7184q5 c7184q52 = this.f76997P0;
                    AbstractC19074t.m100205c(c7184q52);
                    C31859bb m36523V = c7184q52.m36523V(m9740Y1);
                    AbstractC19074t.m100205c(m36523V);
                    C31874cb c31874cb = m36523V.f146291b;
                    if (c31874cb != null) {
                        LinearLayoutManager linearLayoutManager3 = this.f76996O0;
                        AbstractC19074t.m100205c(linearLayoutManager3);
                        View mo9732P = linearLayoutManager3.mo9732P(m9740Y1);
                        RecyclerView recyclerView = this.f76995N0;
                        AbstractC19074t.m100205c(recyclerView);
                        AbstractC19074t.m100205c(mo9732P);
                        if ((recyclerView.m9823C0(mo9732P) instanceof C7045d9.a) && mo9732P.getTop() + mo9732P.getBottom() > (height = (int) (mo9732P.getHeight() * 0.8f))) {
                            RecyclerView recyclerView2 = this.f76995N0;
                            AbstractC19074t.m100205c(recyclerView2);
                            if (recyclerView2.getHeight() - mo9732P.getTop() > height) {
                                C28905e.m144373n().m144400v(c31874cb.f146385a, 10, 93, m9740Y1, "");
                            }
                        }
                    }
                }
                if (m9740Y1 != m9745c2) {
                    m9740Y1++;
                } else {
                    return;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HN */
    public final void m83685HN(boolean z11) {
        this.f76990I1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            if (C21929o.m114391a().m114392b() != null) {
                C21929o.m114391a().m114392b().clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    /* renamed from: IM */
    public final void m83686IM(Map map) {
        AbstractC19074t.m100208f(map, "map");
        if (this.f76983B1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        try {
            ArrayList arrayList = new ArrayList();
            this.f76986E1.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C31874cb c31874cb = (C31874cb) entry.getValue();
                if (!C21933s.m114404I().m114484p0(str)) {
                    arrayList.add(c31874cb);
                }
                this.f76986E1.add(str);
            }
            if (!arrayList.isEmpty()) {
                this.f76983B1 = true;
                this.f76984C1.mo1704o8(this.f76985D1);
                this.f76984C1.mo1453I7(arrayList, TrackingSource.m40665d(2));
                return;
            }
            C21933s.m114404I().m114461d0(this.f76986E1, true);
            AbstractC23074g2.m118377c(1, this.f76986E1, "", true);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.m83634JM(RequestFriendView.this);
                    }
                });
            }
            this.f76983B1 = false;
            this.f72421L0.mo78960q3();
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f76972M1, e11.toString());
            this.f76983B1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: IN */
    public final void m83687IN(boolean z11) {
        this.f77027t1 = z11;
    }

    @Override // com.zing.zalo.adapters.C7282z4.c
    /* renamed from: Il */
    public void mo37053Il(ContactProfile contactProfile) {
        InterfaceC27218a interfaceC27218a;
        AbstractC23647d.m123897g("4801126");
        if (contactProfile != null) {
            C26365a m135743b = new C26365a.b(contactProfile.f42434r, C32002l4.Companion.m154287a(10)).m135743b();
            C19171b c19171b = new C19171b();
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                interfaceC27218a = m92662fJ.m93021N0();
            } else {
                interfaceC27218a = null;
            }
            c19171b.m101508a(new C19171b.a(interfaceC27218a, m135743b, 0, 1));
        }
    }

    /* renamed from: JN */
    public final void m83688JN(C0855y0 c0855y0) {
        this.f76987F1 = c0855y0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (i11 != -2) {
                if (i11 == -1) {
                    AbstractC19074t.m100205c(interfaceC17463d);
                    int mo92862f = interfaceC17463d.mo92862f();
                    if (mo92862f == f76976Q1) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    if (mo92862f == f76977R1) {
                        AbstractC23647d.m123907q("5320", "");
                        interfaceC17463d.dismiss();
                        AbstractC23309i.m121177Lx(true);
                        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
                        if (m92662fJ != null) {
                            m92662fJ.m93069k2(NearbyZView.class, null, 1, true);
                        }
                        AbstractC23647d.m123893c();
                        return;
                    }
                    if (mo92862f == f76978S1) {
                        interfaceC17463d.dismiss();
                        ContactProfile contactProfile = this.f76988G1;
                        AbstractC19074t.m100205c(contactProfile);
                        m83650lN(contactProfile);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC19074t.m100205c(interfaceC17463d);
            int mo92862f2 = interfaceC17463d.mo92862f();
            if (mo92862f2 == f76977R1) {
                AbstractC23647d.m123907q("5310", "");
                interfaceC17463d.dismiss();
                AbstractC23647d.m123893c();
                return;
            }
            if (mo92862f2 == f76975P1) {
                interfaceC17463d.dismiss();
                C31874cb c31874cb = this.f77023p1;
                if (c31874cb != null) {
                    AbstractC19074t.m100205c(c31874cb);
                    if (!TextUtils.isEmpty(c31874cb.f146385a)) {
                        C31874cb c31874cb2 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb2);
                        ContactProfile contactProfile2 = new ContactProfile(c31874cb2.f146385a);
                        C31874cb c31874cb3 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb3);
                        contactProfile2.f42446v = c31874cb3.f146393i;
                        C31874cb c31874cb4 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb4);
                        contactProfile2.f42455y = c31874cb4.f146394j;
                        C31874cb c31874cb5 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb5);
                        contactProfile2.f42437s = c31874cb5.f146387c;
                        contactProfile2.f42437s = contactProfile2.m40383Q(true, false);
                        String mo2478b = contactProfile2.mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile2).m140776b();
                        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                        if (m92676n2 != null) {
                            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public final void m83689KM() {
        try {
            HashMap hashMap = new HashMap();
            C31874cb c31874cb = this.f77023p1;
            if (c31874cb != null) {
                AbstractC19074t.m100205c(c31874cb);
                String str = c31874cb.f146385a;
                AbstractC19074t.m100207e(str, "uid");
                C31874cb c31874cb2 = this.f77023p1;
                AbstractC19074t.m100205c(c31874cb2);
                hashMap.put(str, c31874cb2);
                m83686IM(hashMap);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KN */
    public final void m83690KN(boolean z11) {
        this.f76991J1 = z11;
    }

    /* renamed from: Kv */
    public final void m83691Kv(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        Intent intent = new Intent();
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
        intent.putExtras(m140776b);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
        }
    }

    /* renamed from: LN */
    public final void m83692LN(boolean z11) {
        this.f76989H1 = z11;
    }

    /* renamed from: MN */
    public final void m83693MN(int i11) {
        MultiStateView multiStateView = this.f76998Q0;
        if (multiStateView != null) {
            AbstractC19074t.m100205c(multiStateView);
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: NN */
    public final void m83694NN(boolean z11) {
        if (z11 == this.f77019l1) {
            return;
        }
        this.f77019l1 = z11;
        if (z11) {
            FrameLayout frameLayout = this.f77004W0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.f77005X0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            RobotoTextView robotoTextView = this.f77010c1;
            if (robotoTextView != null) {
                robotoTextView.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_tab_selected));
            }
            RobotoTextView robotoTextView2 = this.f77011d1;
            if (robotoTextView2 != null) {
                robotoTextView2.setBackground(null);
            }
            RobotoTextView robotoTextView3 = this.f77010c1;
            if (robotoTextView3 != null) {
                robotoTextView3.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            }
            RobotoTextView robotoTextView4 = this.f77011d1;
            if (robotoTextView4 != null) {
                robotoTextView4.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.TabUnSelectedColor));
            }
            RobotoTextView robotoTextView5 = this.f77010c1;
            if (robotoTextView5 != null) {
                robotoTextView5.setTextStyleBold(true);
            }
            RobotoTextView robotoTextView6 = this.f77011d1;
            if (robotoTextView6 != null) {
                robotoTextView6.setTextStyleBold(false);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.f77004W0;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(8);
        }
        FrameLayout frameLayout4 = this.f77005X0;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(0);
        }
        RobotoTextView robotoTextView7 = this.f77010c1;
        if (robotoTextView7 != null) {
            robotoTextView7.setBackground(null);
        }
        RobotoTextView robotoTextView8 = this.f77011d1;
        if (robotoTextView8 != null) {
            robotoTextView8.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_tab_selected));
        }
        RobotoTextView robotoTextView9 = this.f77010c1;
        if (robotoTextView9 != null) {
            robotoTextView9.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.TabUnSelectedColor));
        }
        RobotoTextView robotoTextView10 = this.f77011d1;
        if (robotoTextView10 != null) {
            robotoTextView10.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        }
        RobotoTextView robotoTextView11 = this.f77010c1;
        if (robotoTextView11 != null) {
            robotoTextView11.setTextStyleBold(false);
        }
        RobotoTextView robotoTextView12 = this.f77011d1;
        if (robotoTextView12 != null) {
            robotoTextView12.setTextStyleBold(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
                m87077NK.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
                m87077NK.setLeadingFunctionCallback(new C14955o());
                m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.oc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RequestFriendView.m83660qN(RequestFriendView.this, view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    public final void m83695OM(int i11) {
        try {
            if (this.f77030w1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f77031x1);
            this.f77030w1 = true;
            c0766k.mo1578Y4(i11, new TrackingSource(290));
        } catch (Exception e11) {
            this.f77030w1 = false;
            this.f72421L0.mo78960q3();
            e11.printStackTrace();
        }
    }

    /* renamed from: ON */
    public final void m83696ON(List list, int i11, int i12) {
        if (AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C14956p(new ArrayList(list), i11, i12));
    }

    /* renamed from: PM */
    public final void m83697PM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showUpdateProfileHint", true);
        bundle.putBoolean("update", true);
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(UpdateUserInfoZView.class, bundle, f76973N1, 1, true);
        }
    }

    /* renamed from: PN */
    public final void m83698PN(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        if (this.f76991J1) {
            return;
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14957q(contactProfile));
        this.f76991J1 = true;
        c0766k.mo1448Ha(contactProfile.f42434r, 4);
    }

    /* renamed from: QM */
    public final void m83699QM() {
        if (this.f76992K1) {
            return;
        }
        this.f76992K1 = true;
        C21933s.m114404I().m114483p(C21933s.m114404I().m114420H(0), this.f77033z1, 0, new C14946f());
    }

    /* renamed from: QN */
    public final void m83700QN(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "cp");
        if (this.f76989H1) {
            return;
        }
        this.f76989H1 = true;
        mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14958r(contactProfile, this));
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 7);
        if (C21927m.m114302u().m114307E(contactProfile.f42434r) == -1) {
            C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
        }
        c0766k.mo1534S8(contactProfile.f42434r, trackingSource.m40682o());
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: R3 */
    public boolean mo36558R3(String str) {
        return C21933s.m114404I().m114486q0(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            this.f77017j1 = C21927m.m114302u().m114353q().size();
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124117e(this, 6096);
            bVar.m124119a().m124117e(this, 6091);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    public final ArrayList m83701RM() {
        return this.f77000S0;
    }

    /* renamed from: RN */
    public final void m83702RN(String str) {
        int i11;
        try {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                i11 = m141798e.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14959s());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1043));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            bundle.putInt("lastNumberNew", this.f77017j1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f76972M1, e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: SM */
    public final C7184q5 m83703SM() {
        return this.f76997P0;
    }

    /* renamed from: TM */
    public final ArrayList m83704TM() {
        return this.f76986E1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.Companion.m124119a().m124115b(this, 6001);
    }

    /* renamed from: UM */
    public final ContactProfile m83705UM() {
        return this.f76988G1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (this.f77018k1) {
            C21933s.m114404I().m114477l0();
            AbstractC25636f.m132477g();
        }
        C23744a.Companion.m124119a().m124117e(this, 6001);
    }

    /* renamed from: VM */
    public final C31874cb m83706VM() {
        return this.f77023p1;
    }

    /* renamed from: WM */
    public final Handler m83707WM() {
        return this.f77014g1;
    }

    /* renamed from: XM */
    public final LinearLayoutManager m83708XM() {
        return this.f76996O0;
    }

    /* renamed from: YM */
    public final Runnable m83709YM() {
        return this.f76982A1;
    }

    /* renamed from: ZM */
    public final String m83710ZM() {
        return this.f77022o1;
    }

    /* renamed from: aN */
    public final boolean m83711aN() {
        return this.f77015h1;
    }

    @Override // com.zing.zalo.adapters.C7282z4.c
    /* renamed from: bA */
    public void mo37054bA(ContactProfile contactProfile, int i11) {
        if (contactProfile != null) {
            try {
                this.f76988G1 = contactProfile;
                if (i11 == 2) {
                    String mo2478b = contactProfile.mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
                    C17487o0 m92662fJ = this.f72421L0.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93069k2(ChatView.class, m140776b, 1, true);
                    }
                } else {
                    if (i11 != 1 && AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                        AbstractC23647d.m123897g("4801125");
                        m83700QN(contactProfile);
                    }
                    m83713cN(contactProfile.f42434r);
                    AbstractC23647d.m123897g("5901191");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: bN */
    public final ViewOnClickListenerC2907r1 m83712bN() {
        return this.f77001T0;
    }

    /* renamed from: cN */
    public final void m83713cN(String str) {
        try {
            if (this.f77025r1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f77025r1 = true;
            this.f77022o1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f77026s1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77025r1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: dN */
    public final void m83714dN() {
        if (this.f77032y1) {
            return;
        }
        this.f77032y1 = true;
        C21933s.m114404I().m114481o();
        C21933s.m114404I().m114449W(new C14948h());
    }

    /* renamed from: eN */
    public final C0855y0 m83715eN() {
        return this.f76987F1;
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: ew */
    public void mo36559ew(C31874cb c31874cb, int i11) {
        int i12;
        AbstractC19074t.m100208f(c31874cb, "item");
        try {
            AbstractC23647d.m123897g("3110");
            this.f77002U0 = c31874cb;
            if (c31874cb != null) {
                AbstractC19074t.m100205c(c31874cb);
                AbstractC23059e9.m118317F(c31874cb.f146385a);
                C21933s m114404I = C21933s.m114404I();
                C31874cb c31874cb2 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb2);
                if (m114404I.m114486q0(c31874cb2.f146385a)) {
                    C21933s m114404I2 = C21933s.m114404I();
                    C31874cb c31874cb3 = this.f77002U0;
                    AbstractC19074t.m100205c(c31874cb3);
                    m114404I2.m114421H0(c31874cb3.f146385a);
                    C7184q5 c7184q5 = this.f76997P0;
                    if (c7184q5 != null) {
                        c7184q5.m10008p();
                    }
                }
                C31874cb c31874cb4 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb4);
                if (c31874cb4.f146399o == 1) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                C31874cb c31874cb5 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb5);
                if (c31874cb5.f146390f > 0) {
                    C31853b5 m114357s = C21927m.m114302u().m114357s();
                    C31874cb c31874cb6 = this.f77002U0;
                    AbstractC19074t.m100205c(c31874cb6);
                    if (m114357s.m153137g(c31874cb6.f146385a)) {
                        C31874cb c31874cb7 = this.f77002U0;
                        AbstractC19074t.m100205c(c31874cb7);
                        ContactProfile m153177a = c31874cb7.m153177a();
                        AbstractC19074t.m100207e(m153177a, "genContactProfile(...)");
                        m83691Kv(m153177a);
                    } else {
                        C31874cb c31874cb8 = this.f77002U0;
                        AbstractC19074t.m100205c(c31874cb8);
                        if (!TextUtils.isEmpty(c31874cb8.f146385a)) {
                            C21927m m114302u = C21927m.m114302u();
                            C31874cb c31874cb9 = this.f77002U0;
                            AbstractC19074t.m100205c(c31874cb9);
                            m114302u.m114330e0(c31874cb9.f146385a, new TrackingSource(290));
                        }
                        AbstractC23074g2.m118380f(this.f77002U0, this.f72421L0.m92662fJ(), f76974O1, 0, i12, 2, 290);
                    }
                } else {
                    AbstractC23647d.m123897g("5801185");
                    AbstractC23074g2.m118379e(this.f77002U0, this.f72421L0.m92662fJ(), f76974O1, 0, i12, 2);
                }
                C28905e m144373n = C28905e.m144373n();
                C31874cb c31874cb10 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb10);
                m144373n.m144400v(c31874cb10.f146385a, 20, 93, i11, "");
                C0815e1 m2075D = C0815e1.m2075D();
                C31874cb c31874cb11 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb11);
                C31874cb c31874cb12 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb12);
                C31874cb c31874cb13 = this.f77002U0;
                AbstractC19074t.m100205c(c31874cb13);
                m2075D.m2099U(3, 2, 26, "1", c31874cb11.f146385a.toString(), String.valueOf(i11), String.valueOf(c31874cb12.f146399o), String.valueOf(c31874cb13.f146389e));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    public final void m83716fN(Bundle bundle) {
        boolean z11;
        int i11;
        int size;
        if (bundle != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            this.f77015h1 = z11;
            this.f77012e1 = new C23528a(this.f72421L0.m92648SI());
            MultiStateView multiStateView = this.f76999R0;
            if (multiStateView != null) {
                multiStateView.setEnableLoadingText(false);
            }
            MultiStateView multiStateView2 = this.f76998Q0;
            if (multiStateView2 != null) {
                multiStateView2.setEnableLoadingText(false);
            }
            MultiStateView multiStateView3 = this.f76998Q0;
            if (multiStateView3 != null) {
                multiStateView3.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.qc0
                    @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                    /* renamed from: a */
                    public final void mo12138a() {
                        RequestFriendView.m83642gN(RequestFriendView.this);
                    }
                });
            }
            LinearLayout linearLayout = this.f77007Z0;
            AbstractC19074t.m100205c(linearLayout);
            linearLayout.setOnClickListener(this);
            boolean m121849e = AbstractC23309i.m121849e();
            LinearLayout linearLayout2 = this.f77007Z0;
            AbstractC19074t.m100205c(linearLayout2);
            if (m121849e) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            LinearLayout linearLayout3 = this.f77008a1;
            AbstractC19074t.m100205c(linearLayout3);
            linearLayout3.setOnClickListener(this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            this.f76996O0 = linearLayoutManager;
            RecyclerView recyclerView = this.f76995N0;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView2 = this.f76995N0;
            if (recyclerView2 != null) {
                recyclerView2.m9826E(new C14949i());
            }
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            C7184q5 c7184q5 = new C7184q5(m92686rK);
            this.f76997P0 = c7184q5;
            c7184q5.m36540h0(this);
            RecyclerView recyclerView3 = this.f76995N0;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.f76997P0);
            }
            if (ZaloListView.m86975fN()) {
                RecyclerView recyclerView4 = this.f76995N0;
                C7184q5 c7184q52 = this.f76997P0;
                AbstractC19074t.m100205c(c7184q52);
                C7192r2 c7192r2 = new C7192r2(recyclerView4, c7184q52);
                this.f77003V0 = c7192r2;
                RecyclerView recyclerView5 = this.f76995N0;
                if (recyclerView5 != null) {
                    AbstractC19074t.m100205c(c7192r2);
                    recyclerView5.m9816A(c7192r2);
                }
            }
            m83693MN(AbstractC8020f0.empty_list);
            m83677CN(AbstractC8020f0.loading);
            m83719pv(true, 0);
            m83714dN();
            C28023b6.m141222A();
            if (bundle != null && bundle.containsKey("lastNumberNew")) {
                size = bundle.getInt("lastNumberNew");
            } else {
                size = C21927m.m114302u().m114353q().size();
            }
            this.f77017j1 = size;
            m83717hN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C21933s.m114404I().m114428L0();
        m83632EM();
        super.finish();
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: g2 */
    public boolean mo36560g2(String str) {
        return C21933s.m114404I().m114484p0(str);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RequestFriendView";
    }

    /* renamed from: hN */
    public final void m83717hN() {
        RecyclerView recyclerView = this.f76994M0;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C7282z4 c7282z4 = new C7282z4(true, this);
        this.f77020m1 = c7282z4;
        RecyclerView recyclerView2 = this.f76994M0;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c7282z4);
        }
        m83675BN(true);
        AbstractC23063f2.m118355g(1, true, new Runnable() { // from class: com.zing.zalo.ui.zviews.lc0
            @Override // java.lang.Runnable
            public final void run() {
                RequestFriendView.m83645iN(RequestFriendView.this);
            }
        });
    }

    /* renamed from: jN */
    public final void m83718jN(View view) {
        AbstractC19074t.m100208f(view, "mRootView");
        this.f77004W0 = (FrameLayout) view.findViewById(AbstractC6918a0.flRequestFromFriend);
        this.f77005X0 = (FrameLayout) view.findViewById(AbstractC6918a0.flRequestFromMe);
        this.f76994M0 = (RecyclerView) view.findViewById(AbstractC6918a0.lv_request_from_me);
        this.f76999R0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state_request_from_me);
        this.f76995N0 = (RecyclerView) view.findViewById(AbstractC6918a0.lv_friend_request);
        View findViewById = view.findViewById(AbstractC6918a0.multi_state);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.multistate.MultiStateView");
        this.f76998Q0 = (MultiStateView) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.ll_suggest_friends);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        this.f77006Y0 = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View findViewById3 = view.findViewById(AbstractC6918a0.ll_find_friend_via_location);
        AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f77007Z0 = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(AbstractC6918a0.ll_suggest_find_friend);
        AbstractC19074t.m100206d(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f77008a1 = (LinearLayout) findViewById4;
        this.f77009b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_phonebook_suggestion);
        if (!AbstractC23309i.m122119l4() && !AbstractC23309i.m122157m4()) {
            LinearLayout linearLayout2 = this.f77009b1;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            LinearLayout linearLayout3 = this.f77009b1;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            LinearLayout linearLayout4 = this.f77009b1;
            if (linearLayout4 != null) {
                linearLayout4.setOnClickListener(this);
            }
        }
        this.f77010c1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvTabRequesFromFriend);
        this.f77011d1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvTabRequesFromMe);
        RobotoTextView robotoTextView = this.f77010c1;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(this);
        }
        RobotoTextView robotoTextView2 = this.f77011d1;
        if (robotoTextView2 != null) {
            robotoTextView2.setOnClickListener(this);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle extras;
        C17487o0 mo35579p;
        super.onActivityResult(i11, i12, intent);
        if (i11 == f76974O1) {
            if (!this.f77032y1) {
                C21933s.m114404I().m114436P0();
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RequestFriendView.m83654nN(RequestFriendView.this);
                        }
                    });
                }
            }
        } else if (i11 == f76973N1) {
            if (!AbstractC23059e9.m118316E()) {
                if (AbstractC23309i.m122500vc()) {
                    InterfaceC27218a m92676n22 = this.f72421L0.m92676n2();
                    if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                        mo35579p.m93069k2(NearbyZView.class, null, 1, true);
                    }
                } else {
                    this.f72421L0.showDialog(f76977R1);
                }
            }
        } else if (i11 == 10099 && intent != null && (extras = intent.getExtras()) != null && extras.containsKey("result.accept_friend_uid")) {
            String string = extras.getString("result.accept_friend_uid");
            if (!TextUtils.isEmpty(string)) {
                C21933s.m114404I().m114453Z(string);
                m83674BM(string);
            }
        }
        this.f72421L0.m92643OI(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_find_friend_via_location) {
                if (AbstractC23059e9.m118316E()) {
                    m83697PM();
                } else if (AbstractC23309i.m122500vc()) {
                    C17487o0 m92662fJ = this.f72421L0.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93069k2(NearbyZView.class, null, 1, true);
                    }
                } else {
                    this.f72421L0.showDialog(f76977R1);
                }
            } else if (id2 == AbstractC6918a0.ll_suggest_find_friend) {
                C17487o0 m92662fJ2 = this.f72421L0.m92662fJ();
                if (m92662fJ2 != null) {
                    m92662fJ2.m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                }
            } else if (id2 == AbstractC6918a0.ll_phonebook_suggestion) {
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
                }
            } else if (id2 == AbstractC6918a0.tvTabRequesFromFriend) {
                m83694NN(true);
            } else if (id2 == AbstractC6918a0.tvTabRequesFromMe) {
                m83694NN(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return false;
        }
        try {
            AbstractC23647d.m123897g("5901176");
            C21933s.m114404I().m114428L0();
            m83632EM();
            return super.onKeyUp(i11, keyEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124115b(this, 6096);
            bVar.m124119a().m124115b(this, 6091);
            if (C21933s.m114404I().f107931t) {
                C21933s.m114404I().f107931t = false;
                m83720rN();
            }
            if (C21933s.m114404I().m114500x0() || (C21927m.m114302u().m114353q() != null && this.f77017j1 != C21927m.m114302u().m114353q().size())) {
                if (this.f77000S0.isEmpty()) {
                    m83719pv(true, 0);
                }
                m83714dN();
            }
            if (C21933s.m114404I().f107874A) {
                C21933s.m114404I().f107874A = false;
                AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f76997P0);
            }
            m83721sN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pv */
    public final void m83719pv(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                LinearLayout linearLayout = this.f77006Y0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                RecyclerView recyclerView = this.f76995N0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                MultiStateView multiStateView = this.f76998Q0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                }
                MultiStateView multiStateView2 = this.f76998Q0;
                if (multiStateView2 != null) {
                    multiStateView2.setState(MultiStateView.EnumC15914e.LOADING);
                    return;
                }
                return;
            }
            C7184q5 c7184q5 = this.f76997P0;
            if (c7184q5 != null) {
                AbstractC19074t.m100205c(c7184q5);
                if (c7184q5.mo10003k() != 0) {
                    RecyclerView recyclerView2 = this.f76995N0;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.f77006Y0;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    MultiStateView multiStateView3 = this.f76998Q0;
                    if (multiStateView3 != null) {
                        multiStateView3.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            RecyclerView recyclerView3 = this.f76995N0;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            if (i11 == 0) {
                LinearLayout linearLayout3 = this.f77006Y0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                MultiStateView multiStateView4 = this.f76998Q0;
                if (multiStateView4 != null) {
                    multiStateView4.setVisibility(8);
                }
                MultiStateView multiStateView5 = this.f76998Q0;
                if (multiStateView5 != null) {
                    multiStateView5.setState(MultiStateView.EnumC15914e.EMPTY);
                    return;
                }
                return;
            }
            LinearLayout linearLayout4 = this.f77006Y0;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            MultiStateView multiStateView6 = this.f76998Q0;
            if (multiStateView6 != null) {
                if (i11 == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView6.setErrorType(enumC15915f);
            }
            MultiStateView multiStateView7 = this.f76998Q0;
            if (multiStateView7 != null) {
                multiStateView7.setVisibility(0);
            }
            MultiStateView multiStateView8 = this.f76998Q0;
            if (multiStateView8 != null) {
                multiStateView8.setState(MultiStateView.EnumC15914e.ERROR);
            }
            MultiStateView multiStateView9 = this.f76998Q0;
            if (multiStateView9 != null) {
                if (i11 == 50001) {
                    i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i12 = AbstractC8020f0.str_error_loadingList;
                }
                multiStateView9.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: r6 */
    public void mo36561r6(C31874cb c31874cb, int i11, int i12) {
        int i13;
        AbstractC19074t.m100208f(c31874cb, "item");
        if (System.currentTimeMillis() > this.f77024q1) {
            this.f77024q1 = System.currentTimeMillis() + 400;
            AbstractC23647d.m123897g("3120");
            this.f77023p1 = c31874cb;
            int i14 = 4;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                showDialog(f76980U1);
                            }
                        } else {
                            AbstractC19074t.m100205c(c31874cb);
                            ContactProfile m153177a = c31874cb.m153177a();
                            AbstractC19074t.m100207e(m153177a, "genContactProfile(...)");
                            m83691Kv(m153177a);
                        }
                    } else {
                        m83689KM();
                    }
                } else {
                    AbstractC19074t.m100205c(c31874cb);
                    if (c31874cb.f146399o == 2) {
                        C31874cb c31874cb2 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb2);
                        this.f77022o1 = c31874cb2.f146385a;
                        C31874cb c31874cb3 = this.f77023p1;
                        AbstractC19074t.m100205c(c31874cb3);
                        ContactProfile m153177a2 = c31874cb3.m153177a();
                        AbstractC19074t.m100205c(m153177a2);
                        m83650lN(m153177a2);
                    }
                }
            } else {
                AbstractC19074t.m100205c(c31874cb);
                if (c31874cb.f146390f > 0) {
                    C31874cb c31874cb4 = this.f77023p1;
                    AbstractC19074t.m100205c(c31874cb4);
                    String str = c31874cb4.f146385a;
                    this.f77022o1 = str;
                    AbstractC19074t.m100205c(str);
                    m83695OM(Integer.parseInt(str));
                } else {
                    C31874cb c31874cb5 = this.f77023p1;
                    AbstractC19074t.m100205c(c31874cb5);
                    ContactProfile m153177a3 = c31874cb5.m153177a();
                    this.f76988G1 = m153177a3;
                    AbstractC19074t.m100205c(m153177a3);
                    m83713cN(m153177a3.f42434r);
                }
            }
            C28905e m144373n = C28905e.m144373n();
            C31874cb c31874cb6 = this.f77023p1;
            AbstractC19074t.m100205c(c31874cb6);
            String str2 = c31874cb6.f146385a;
            if (i12 == 2) {
                i13 = 22;
            } else {
                i13 = 21;
            }
            m144373n.m144400v(str2, i13, 93, i11, "");
            if (i12 == 2) {
                AbstractC23647d.m123897g("5801184");
            } else {
                i14 = 3;
            }
            C0815e1 m2075D = C0815e1.m2075D();
            C31874cb c31874cb7 = this.f77023p1;
            AbstractC19074t.m100205c(c31874cb7);
            String str3 = c31874cb7.f146385a.toString();
            String valueOf = String.valueOf(i11);
            C31874cb c31874cb8 = this.f77023p1;
            AbstractC19074t.m100205c(c31874cb8);
            String valueOf2 = String.valueOf(c31874cb8.f146399o);
            C31874cb c31874cb9 = this.f77023p1;
            AbstractC19074t.m100205c(c31874cb9);
            m2075D.m2099U(3, i14, 26, "1", str3, valueOf, valueOf2, String.valueOf(c31874cb9.f146389e));
        }
    }

    /* renamed from: rN */
    public final void m83720rN() {
        try {
            this.f77000S0.clear();
            MiniProfileView.m81811kM();
            this.f77000S0.addAll(C21933s.m114404I().m114452Y(this.f77016i1));
            if (this.f77033z1 == 0) {
                C21933s.m114404I().m114497w(0, 0);
                if (C21933s.m114404I().m114465f0(0, 0)) {
                    m83699QM();
                }
            }
            C7184q5 c7184q5 = this.f76997P0;
            if (c7184q5 != null) {
                c7184q5.m36539g0(this.f77000S0);
            }
            C7184q5 c7184q52 = this.f76997P0;
            if (c7184q52 != null) {
                c7184q52.m10008p();
            }
            RobotoTextView robotoTextView = this.f77010c1;
            if (robotoTextView != null) {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_request_from_friend) + "  " + C21933s.m114404I().m114441S());
            }
            if (this.f76995N0 != null) {
                ArrayList arrayList = this.f77000S0;
                LinearLayoutManager linearLayoutManager = this.f76996O0;
                AbstractC19074t.m100205c(linearLayoutManager);
                int m9740Y1 = linearLayoutManager.m9740Y1();
                LinearLayoutManager linearLayoutManager2 = this.f76996O0;
                AbstractC19074t.m100205c(linearLayoutManager2);
                m83696ON(arrayList, m9740Y1, linearLayoutManager2.m9745c2());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sN */
    public final void m83721sN() {
        try {
            Runnable runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.rc0
                @Override // java.lang.Runnable
                public final void run() {
                    RequestFriendView.m83664tN(RequestFriendView.this);
                }
            };
            if (AbstractC19444a.m101693a()) {
                AbstractC0837p0.Companion.m2239h().mo2040a(runnable);
            } else {
                runnable.run();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: sd */
    public void mo36562sd() {
        if (this.f76993L1 && !this.f76992K1) {
            m83699QM();
        }
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: t3 */
    public void mo36563t3() {
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: u1 */
    public void mo36564u1() {
        this.f77016i1 = true;
        m83720rN();
    }

    @Override // com.zing.zalo.adapters.C7184q5.e
    /* renamed from: u4 */
    public void mo36565u4() {
        AbstractC23647d.m123897g("5901175");
    }

    /* renamed from: vN */
    public final void m83722vN(ContactProfile contactProfile, TrackingSource trackingSource) {
        String m40378N;
        AbstractC19074t.m100208f(contactProfile, "cp");
        AbstractC19074t.m100208f(trackingSource, "ts");
        if (this.f77027t1) {
            return;
        }
        if (this.f77019l1) {
            m40378N = "";
        } else {
            m40378N = contactProfile.m40378N();
            AbstractC19074t.m100207e(m40378N, "<get-customMessage>(...)");
        }
        this.f77027t1 = true;
        this.f77028u1.mo1704o8(this.f77029v1);
        this.f77028u1.mo1620d7(contactProfile.f42434r, m40378N, contactProfile.f42373R0, trackingSource.m40682o());
    }

    /* renamed from: wN */
    public final void m83723wN(boolean z11) {
        this.f76983B1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        boolean z11;
        Handler handler;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 6001) {
            if (i11 != 6091) {
                if (i11 == 6096 && (handler = this.f77014g1) != null) {
                    handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.mc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RequestFriendView.m83636MM(RequestFriendView.this);
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((!z11) && (objArr[0] instanceof String)) {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestFriendView.m83637NM(objArr);
                    }
                });
                return;
            }
            return;
        }
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gc0
            @Override // java.lang.Runnable
            public final void run() {
                RequestFriendView.m83635LM(RequestFriendView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m83716fN(bundle);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("STR_EXTRA_NOTI_TYPE");
                int i11 = m92642L3.getInt("INT_EXTRA_NOTI_ACTION_TYPE", 0);
                if (!TextUtils.isEmpty(string)) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    AbstractC19074t.m100205c(string);
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    AbstractC23647d.m123906p(format);
                    AbstractC23647d.m123893c();
                }
            }
            m83694NN(this.f77018k1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xN */
    public final void m83724xN(boolean z11) {
        this.f77030w1 = z11;
    }

    /* renamed from: yN */
    public final void m83725yN(boolean z11) {
        this.f77025r1 = z11;
    }

    /* renamed from: zN */
    public final void m83726zN(boolean z11) {
        this.f76992K1 = z11;
    }
}
