package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C2279a;
import au.AbstractC2364o0;
import bn.C2856b1;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.adapters.C7232u9;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.birthdayhub.view.BirthdayHubView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.mini_user_detail.MiniUserDetailView;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.custom.AbstractC11855f;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractAnimationAnimationListenerC20277g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23202r9;
import me0.AbstractC23244v8;
import me0.AbstractC23268y2;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18631a;
import p142ey.C18644n;
import p172fy.C19171b;
import p173fz.C19172a;
import p207he.C20024r;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21932r;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p422pd.C24726a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p574vd.C27970a;
import p716zh.C31874cb;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.InterfaceC32149v8;
import r30.AbstractC25636f;
import sd.C26231b;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.AbstractC28218w3;
import vg.C28203u6;
import w60.C28786i;
import w60.C28789l;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ZaloListView extends BaseZaloView implements InterfaceC32149v8, View.OnClickListener, View.OnTouchListener, InterfaceC17463d.d, C31784b.d, C31784b.e, C7232u9.c, C23744a.c, C28789l.a {

    /* renamed from: n2 */
    public static final String f79554n2 = "ZaloListView";

    /* renamed from: o2 */
    private static int f79555o2 = -1;

    /* renamed from: p2 */
    private static int f79556p2 = -1;

    /* renamed from: C1 */
    FrameLayout f79559C1;

    /* renamed from: D1 */
    RecyclingImageView f79560D1;

    /* renamed from: E1 */
    RobotoTextView f79561E1;

    /* renamed from: I1 */
    C7192r2 f79565I1;

    /* renamed from: J1 */
    View f79566J1;

    /* renamed from: K1 */
    View f79567K1;

    /* renamed from: L1 */
    View f79568L1;

    /* renamed from: M0 */
    TextView f79569M0;

    /* renamed from: M1 */
    View f79570M1;

    /* renamed from: N0 */
    View f79571N0;

    /* renamed from: O0 */
    TextView f79573O0;

    /* renamed from: P0 */
    View f79575P0;

    /* renamed from: Q0 */
    ViewStub f79577Q0;

    /* renamed from: R0 */
    View f79579R0;

    /* renamed from: R1 */
    private List f79580R1;

    /* renamed from: S0 */
    TextView f79581S0;

    /* renamed from: T0 */
    GroupAvatarView f79583T0;

    /* renamed from: U0 */
    TextView f79585U0;

    /* renamed from: V0 */
    ViewTreeObserver.OnGlobalLayoutListener f79587V0;

    /* renamed from: W0 */
    View f79589W0;

    /* renamed from: Z0 */
    TextView f79595Z0;

    /* renamed from: a1 */
    ProgressBar f79597a1;

    /* renamed from: b1 */
    RecyclerView f79599b1;

    /* renamed from: c1 */
    C7232u9 f79601c1;

    /* renamed from: d1 */
    AbstractC11855f f79603d1;

    /* renamed from: e1 */
    LinearLayoutManager f79605e1;

    /* renamed from: f1 */
    ContactProfile f79607f1;

    /* renamed from: g1 */
    ContactProfile f79609g1;

    /* renamed from: h1 */
    int f79611h1;

    /* renamed from: h2 */
    CheckBox f79612h2;

    /* renamed from: k1 */
    C23528a f79617k1;

    /* renamed from: q1 */
    View f79626q1;

    /* renamed from: r1 */
    View f79627r1;

    /* renamed from: s1 */
    LinearLayout f79628s1;

    /* renamed from: t1 */
    RecyclingImageView f79629t1;

    /* renamed from: u1 */
    AvatarImageView f79630u1;

    /* renamed from: v1 */
    RecyclingImageView f79631v1;

    /* renamed from: w1 */
    TextView f79632w1;

    /* renamed from: x1 */
    TextView f79633x1;

    /* renamed from: y1 */
    TextView f79634y1;

    /* renamed from: z1 */
    RobotoTextView f79635z1;

    /* renamed from: X0 */
    int f79591X0 = 0;

    /* renamed from: Y0 */
    volatile boolean f79593Y0 = false;

    /* renamed from: i1 */
    int f79613i1 = 0;

    /* renamed from: j1 */
    Handler f79615j1 = new Handler();

    /* renamed from: l1 */
    boolean f79619l1 = false;

    /* renamed from: m1 */
    float f79621m1 = 0.0f;

    /* renamed from: n1 */
    float f79623n1 = 0.0f;

    /* renamed from: o1 */
    boolean f79624o1 = false;

    /* renamed from: p1 */
    boolean f79625p1 = false;

    /* renamed from: A1 */
    boolean f79557A1 = false;

    /* renamed from: B1 */
    boolean f79558B1 = false;

    /* renamed from: F1 */
    CountDownTimer f79562F1 = null;

    /* renamed from: G1 */
    boolean f79563G1 = true;

    /* renamed from: H1 */
    int f79564H1 = 0;

    /* renamed from: N1 */
    private C27970a f79572N1 = null;

    /* renamed from: O1 */
    C28789l f79574O1 = null;

    /* renamed from: P1 */
    C28786i f79576P1 = null;

    /* renamed from: Q1 */
    private final C0855y0 f79578Q1 = new C0855y0();

    /* renamed from: S1 */
    private final Rect f79582S1 = new Rect();

    /* renamed from: T1 */
    private final String f79584T1 = "61";

    /* renamed from: U1 */
    private final String f79586U1 = "62";

    /* renamed from: V1 */
    boolean f79588V1 = false;

    /* renamed from: W1 */
    boolean f79590W1 = false;

    /* renamed from: X1 */
    Runnable f79592X1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.r51
        public /* synthetic */ r51() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZaloListView.this.m86995pN();
        }
    };

    /* renamed from: Y1 */
    int f79594Y1 = 0;

    /* renamed from: Z1 */
    AbstractAnimationAnimationListenerC20277g f79596Z1 = new C15400r();

    /* renamed from: a2 */
    boolean f79598a2 = false;

    /* renamed from: b2 */
    boolean f79600b2 = false;

    /* renamed from: c2 */
    boolean f79602c2 = false;

    /* renamed from: d2 */
    boolean f79604d2 = false;

    /* renamed from: e2 */
    boolean f79606e2 = false;

    /* renamed from: f2 */
    private int f79608f2 = 0;

    /* renamed from: g2 */
    C2856b1 f79610g2 = null;

    /* renamed from: i2 */
    ContactProfile f79614i2 = null;

    /* renamed from: j2 */
    boolean f79616j2 = false;

    /* renamed from: k2 */
    boolean f79618k2 = false;

    /* renamed from: l2 */
    ArrayList f79620l2 = new ArrayList();

    /* renamed from: m2 */
    boolean f79622m2 = false;

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$a */
    /* loaded from: classes6.dex */
    public class C15383a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f79636a;

        C15383a(ContactProfile contactProfile) {
            this.f79636a = contactProfile;
        }

        /* renamed from: e */
        public /* synthetic */ void m87050e() {
            try {
                if (ZaloListView.this.f79619l1 && !ZaloListView.m86977gN()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                }
                C19669z.m103146Y().m103198O0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m87051f() {
            C2856b1 c2856b1 = ZaloListView.this.f79610g2;
            if (c2856b1 != null && c2856b1.m92868m()) {
                ZaloListView.this.f79610g2.m13770M(true);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.m89259g(c20096c.m104491c());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            ZaloListView.this.f72421L0.mo78960q3();
            ZaloListView.this.f79598a2 = false;
            if (ZaloListView.m86977gN()) {
                ZaloListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w61
                    public /* synthetic */ w61() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloListView.C15383a.this.m87051f();
                    }
                });
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
                            C21927m.m114302u().m114336h0();
                            ZaloListView zaloListView = ZaloListView.this;
                            zaloListView.f79598a2 = false;
                            zaloListView.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f79636a;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    Handler handler = ZaloListView.this.f79615j1;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v61
                            public /* synthetic */ v61() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.C15383a.this.m87050e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C21927m.m114302u().m114336h0();
                ZaloListView zaloListView2 = ZaloListView.this;
                zaloListView2.f79598a2 = false;
                zaloListView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                C21927m.m114302u().m114336h0();
                ZaloListView zaloListView3 = ZaloListView.this;
                zaloListView3.f79598a2 = false;
                zaloListView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$b */
    /* loaded from: classes6.dex */
    public class C15384b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f79638a;

        /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$b$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f79640a;

            a(ContactProfile contactProfile) {
                this.f79640a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f79640a, true);
                C7960e.m41971c6().m42234Pb(C15384b.this.f79638a.f42434r);
            }
        }

        C15384b(ContactProfile contactProfile) {
            this.f79638a = contactProfile;
        }

        /* renamed from: e */
        public /* synthetic */ void m87054e() {
            try {
                if (ZaloListView.this.f79619l1 && !ZaloListView.m86977gN()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                }
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m87055f() {
            C2856b1 c2856b1 = ZaloListView.this.f79610g2;
            if (c2856b1 != null && c2856b1.m92868m()) {
                ZaloListView.this.f79610g2.m13770M(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            ZaloListView zaloListView;
            y61 y61Var;
            try {
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                        i11 = -1000;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        ZaloListView zaloListView2 = ZaloListView.this;
                        zaloListView2.f79600b2 = false;
                        zaloListView2.f72421L0.mo78960q3();
                        if (ZaloListView.m86977gN()) {
                            zaloListView = ZaloListView.this;
                            y61Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.y61
                                public /* synthetic */ y61() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloListView.C15384b.this.m87055f();
                                }
                            };
                        } else {
                            return;
                        }
                    }
                }
                ToastUtils.m89259g(i11);
                ZaloListView zaloListView3 = ZaloListView.this;
                zaloListView3.f79600b2 = false;
                zaloListView3.f72421L0.mo78960q3();
                if (ZaloListView.m86977gN()) {
                    zaloListView = ZaloListView.this;
                    y61Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.y61
                        public /* synthetic */ y61() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15384b.this.m87055f();
                        }
                    };
                    zaloListView.mo70710wy(y61Var);
                }
            } catch (Throwable th2) {
                ZaloListView zaloListView4 = ZaloListView.this;
                zaloListView4.f79600b2 = false;
                zaloListView4.f72421L0.mo78960q3();
                if (ZaloListView.m86977gN()) {
                    ZaloListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.y61
                        public /* synthetic */ y61() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15384b.this.m87055f();
                        }
                    });
                }
                throw th2;
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
                            C18644n.m98524E();
                            ZaloListView.this.f72421L0.mo78960q3();
                            ZaloListView.this.f79600b2 = false;
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f79638a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f79638a.f42434r);
                    if (m98552o == null) {
                        m98552o = C28203u6.f131407a.m141809c(this.f79638a.f42434r);
                    }
                    if (m98552o == null) {
                        m98552o = this.f79638a;
                    }
                    m98552o.f42403c1 = false;
                    C28203u6.f131407a.m141824w(m98552o);
                    C21927m.m114302u().m114350o0(this.f79638a.f42434r);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f79638a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f79638a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o));
                    Handler handler = ZaloListView.this.f79615j1;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.x61
                            public /* synthetic */ x61() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.C15384b.this.m87054e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C18644n.m98524E();
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79600b2 = false;
            } catch (Throwable th2) {
                C18644n.m98524E();
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79600b2 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$c */
    /* loaded from: classes6.dex */
    public class C15385c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f79642a;

        /* renamed from: b */
        final /* synthetic */ boolean f79643b;

        C15385c(ContactProfile contactProfile, boolean z11) {
            this.f79642a = contactProfile;
            this.f79643b = z11;
        }

        /* renamed from: d */
        public /* synthetic */ void m87057d() {
            try {
                AbstractC23088h5.m118426g();
                if (ZaloListView.this.f79619l1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
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
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79602c2 = false;
                zaloListView.f72421L0.mo78960q3();
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
                            ContactProfile contactProfile = this.f79642a;
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && (AbstractC25495a.m132086k(this.f79642a.f42434r) || this.f79642a.m40372J0())) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_error_cannot_delete_this_contact));
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            C19669z.f97569Q.set(false);
                            C18644n.m98524E();
                            ZaloListView.this.f72421L0.mo78960q3();
                            ZaloListView.this.f79602c2 = false;
                            return;
                        }
                    }
                    C7960e.m41971c6().m42136Gd(this.f79642a.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    c28203u6.m141827z(this.f79642a.f42434r, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f79642a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f79642a.f42434r);
                    C18644n.m98531l().m98540I(this.f79642a.f42434r);
                    c28203u6.m141804B(this.f79642a.f42434r, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f79642a.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f79642a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f79642a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f79642a.f42434r) && AbstractC21935u.m114515E(this.f79642a.f42434r) && AbstractC23306f.m120562A().m2529X(this.f79642a.f42434r)) {
                        C7959d.m41638d1().m41774b3(this.f79642a.f42434r, 2);
                    }
                    Map map = AbstractC23304d.f113421p;
                    synchronized (map) {
                        try {
                            if (map.containsKey(this.f79642a.f42434r)) {
                                C7960e.m41971c6().m42376e4(this.f79642a.f42434r);
                            }
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f79642a.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f79642a.f42434r);
                    C21927m.m114302u().m114352p0(this.f79642a.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f79642a.f42434r);
                    AbstractC0852x.m2332I(this.f79642a.f42434r);
                    if (this.f79643b) {
                        AbstractC0852x.m2355l(ZaloListView.this.f72421L0.getContext(), this.f79642a.f42455y, new SensitiveData("phonebook_delete_in_phonebook_tab", "phonebook_delete"));
                    }
                    Handler handler = ZaloListView.this.f79615j1;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.z61
                            public /* synthetic */ z61() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.C15385c.this.m87057d();
                            }
                        });
                    }
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f79642a.f42434r);
                    C21932r.f107858a.m114403j(ZaloListView.this);
                } catch (Exception e11) {
                    String str = ZaloListView.f79554n2;
                    e11.toString();
                }
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79602c2 = false;
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79602c2 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$d */
    /* loaded from: classes6.dex */
    public class C15386d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79645a;

        /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42415hc(C15386d.this.f79645a);
            }
        }

        C15386d(String str) {
            this.f79645a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m87059d() {
            C2856b1 c2856b1 = ZaloListView.this.f79610g2;
            if (c2856b1 != null && c2856b1.m92868m()) {
                ZaloListView.this.f79610g2.m13771N(true);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ZaloListView zaloListView;
            a71 a71Var;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    ZaloListView zaloListView2 = ZaloListView.this;
                    zaloListView2.f79604d2 = false;
                    zaloListView2.f72421L0.mo78960q3();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ZaloListView zaloListView3 = ZaloListView.this;
                    zaloListView3.f79604d2 = false;
                    zaloListView3.f72421L0.mo78960q3();
                    if (ZaloListView.m86977gN()) {
                        zaloListView = ZaloListView.this;
                        a71Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.a71
                            public /* synthetic */ a71() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.C15386d.this.m87059d();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (ZaloListView.m86977gN()) {
                    zaloListView = ZaloListView.this;
                    a71Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.a71
                        public /* synthetic */ a71() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15386d.this.m87059d();
                        }
                    };
                    zaloListView.mo70710wy(a71Var);
                }
            } catch (Throwable th2) {
                ZaloListView zaloListView4 = ZaloListView.this;
                zaloListView4.f79604d2 = false;
                zaloListView4.f72421L0.mo78960q3();
                if (ZaloListView.m86977gN()) {
                    ZaloListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.a71
                        public /* synthetic */ a71() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15386d.this.m87059d();
                        }
                    });
                }
                throw th2;
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
                            e11.printStackTrace();
                        }
                        boolean z11 = true;
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (Integer.parseInt(this.f79645a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            C21927m.m114302u().m114340j0(this.f79645a);
                            AbstractC21935u.m114526P(this.f79645a);
                            C21927m.m114302u().m114336h0();
                            C0824j.m2153b(new a());
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79604d2 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$e */
    /* loaded from: classes6.dex */
    public class C15387e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79648a;

        /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$e$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(C15387e.this.f79648a);
            }
        }

        C15387e(String str) {
            this.f79648a = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m87062e() {
            C2856b1 c2856b1 = ZaloListView.this.f79610g2;
            if (c2856b1 != null && c2856b1.m92868m()) {
                ZaloListView.this.f79610g2.m13771N(false);
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m87063f() {
            C2856b1 c2856b1 = ZaloListView.this.f79610g2;
            if (c2856b1 != null && c2856b1.m92868m()) {
                ZaloListView.this.f79610g2.m13771N(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ZaloListView zaloListView;
            b71 b71Var;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    ZaloListView.this.f72421L0.mo78960q3();
                    ZaloListView.this.f79606e2 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ZaloListView.this.f72421L0.mo78960q3();
                    ZaloListView.this.f79606e2 = false;
                    if (ZaloListView.m86977gN()) {
                        zaloListView = ZaloListView.this;
                        b71Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.b71
                            public /* synthetic */ b71() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.C15387e.this.m87063f();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (ZaloListView.m86977gN()) {
                    zaloListView = ZaloListView.this;
                    b71Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.b71
                        public /* synthetic */ b71() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15387e.this.m87063f();
                        }
                    };
                    zaloListView.mo70710wy(b71Var);
                }
            } catch (Throwable th2) {
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79606e2 = false;
                if (ZaloListView.m86977gN()) {
                    ZaloListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.b71
                        public /* synthetic */ b71() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.C15387e.this.m87063f();
                        }
                    });
                }
                throw th2;
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
                            if (Integer.parseInt(this.f79648a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            if (!C21927m.m114302u().m114351p().contains(this.f79648a)) {
                                C21927m.m114302u().m114351p().add(this.f79648a);
                                AbstractC21935u.m114527Q(this.f79648a);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a());
                            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f79648a);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, this.f79648a, m98552o.f42437s);
                                String format = String.format(ZaloListView.this.f72421L0.m92651WI().getString(AbstractC8020f0.str_msg_info_add_favorite_friend), m114539f, m114539f);
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(this.f79648a, format);
                                }
                            }
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cant_add_favorite_friend));
                            if (ZaloListView.m86977gN()) {
                                ZaloListView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.c71
                                    public /* synthetic */ c71() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ZaloListView.C15387e.this.m87062e();
                                    }
                                });
                            }
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                C18644n.m98524E();
                ZaloListView.this.f72421L0.mo78960q3();
                ZaloListView.this.f79606e2 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$f */
    /* loaded from: classes6.dex */
    class C15388f implements AbstractC22055v0.g {
        C15388f() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            ZaloListView.this.m87040ZN();
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (ZaloListView.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$g */
    /* loaded from: classes6.dex */
    public class C15389g extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f79652p;

        C15389g(boolean z11) {
            this.f79652p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ZaloListView.this.f79616j2 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ZaloListView zaloListView = ZaloListView.this;
            zaloListView.f79616j2 = false;
            if (!this.f79652p) {
                zaloListView.f79559C1.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ZaloListView zaloListView = ZaloListView.this;
            zaloListView.f79616j2 = true;
            if (this.f79652p) {
                zaloListView.f79559C1.setVisibility(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$h */
    /* loaded from: classes6.dex */
    public class C15390h implements InterfaceC20094a {
        C15390h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ZaloListView zaloListView = ZaloListView.this;
            zaloListView.f79618k2 = false;
            zaloListView.f72421L0.mo78960q3();
            if (c20096c.m104491c() == 515) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    AbstractC23148n.m118848v(27, 1);
                    C21927m.m114302u().m114336h0();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79618k2 = false;
                zaloListView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$i */
    /* loaded from: classes6.dex */
    public class C15391i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Map f79655a;

        /* renamed from: b */
        final /* synthetic */ boolean f79656b;

        C15391i(Map map, boolean z11) {
            this.f79655a = map;
            this.f79656b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(ZaloListView.f79554n2, e11.toString());
                }
            } finally {
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79622m2 = false;
                zaloListView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C21933s.m114404I().m114459c0(ZaloListView.this.f79620l2);
                    AbstractC23074g2.m118376b(1, ZaloListView.this.f79620l2, "", 4);
                    AbstractC23063f2.m118362n(ZaloListView.this.f79620l2);
                    Iterator it = new ArrayList(this.f79655a.values()).iterator();
                    while (it.hasNext()) {
                        AbstractC25636f.m132473c((C31874cb) it.next());
                    }
                    if (this.f79656b) {
                        ZaloListView.this.f79592X1.run();
                    } else {
                        ZaloListView.this.m87025MN();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(ZaloListView.f79554n2, e11.toString());
                }
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79622m2 = false;
                zaloListView.f72421L0.mo78960q3();
                ZaloListView.this.m87045dO();
            } catch (Throwable th2) {
                ZaloListView zaloListView2 = ZaloListView.this;
                zaloListView2.f79622m2 = false;
                zaloListView2.f72421L0.mo78960q3();
                ZaloListView.this.m87045dO();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$j */
    /* loaded from: classes6.dex */
    public class C15392j implements C28786i.a {
        C15392j() {
        }

        /* renamed from: i */
        public /* synthetic */ Void m87065i(C31874cb c31874cb) {
            C21933s.m114404I().m114454a(ZaloListView.this.f79609g1.f42434r);
            AbstractC25636f.m132473c(c31874cb);
            ZaloListView.this.m87025MN();
            return null;
        }

        @Override // w60.C28786i.a
        /* renamed from: a */
        public void mo87066a(C31874cb c31874cb, boolean z11, boolean z12) {
            ZaloListView.this.f79609g1 = c31874cb.m153177a();
            ZaloListView.this.m87038YM("3000", false);
        }

        @Override // w60.C28786i.a
        /* renamed from: b */
        public void mo87067b(C31874cb c31874cb, boolean z11, boolean z12) {
            ZaloListView.this.m86961TN(c31874cb, 2, z11, z12);
            C0708i c0708i = new C0708i();
            c0708i.m1075f("friend_request_source", String.valueOf(c31874cb.f146389e));
            C0732w.Companion.m1189a().m1187q("new_friend_request_avatar", "", c0708i, null);
            AbstractC23059e9.m118317F(c31874cb.f146385a);
            C21933s.m114404I().m114417F0(c31874cb.f146385a);
            MiniProfileView.m81811kM();
            ZaloListView zaloListView = ZaloListView.this;
            zaloListView.f79588V1 = true;
            AbstractC23074g2.m118379e(c31874cb, zaloListView.m92676n2().mo35579p(), 0, 0, 1, 8);
        }

        @Override // w60.C28786i.a
        /* renamed from: c */
        public void mo87068c() {
            C21933s.m114404I().m114477l0();
            AbstractC25636f.m132477g();
            AbstractC25636f.m132475e();
            ZaloListView.this.m87045dO();
            if (ZaloListView.this.m87036WM() != null) {
                MainTabView.m67645lM().m67678NN();
            }
            C0732w.Companion.m1189a().m1187q("contacts_hide_new_friend_request", "", null, null);
        }

        @Override // w60.C28786i.a
        /* renamed from: d */
        public void mo87069d(C31874cb c31874cb, boolean z11, boolean z12) {
            ZaloListView.this.m86961TN(c31874cb, 3, z11, z12);
            C0708i c0708i = new C0708i();
            c0708i.m1075f("friend_request_source", String.valueOf(c31874cb.f146389e));
            C0732w.Companion.m1189a().m1187q("new_friend_request_accept_button", "", c0708i, null);
            ZaloListView.this.f79609g1 = c31874cb.m153177a();
            TrackingSource trackingSource = new TrackingSource(c31874cb.f146389e);
            trackingSource.m40677a("sourceView", 35);
            C21927m.m114302u().m114328d0(c31874cb.f146385a, trackingSource);
            C26365a m135743b = new C26365a.b(ZaloListView.this.f79609g1.f42434r, C32002l4.m154264g(9)).m135739F("3904").m135743b();
            ZaloListView zaloListView = ZaloListView.this;
            AbstractC21935u.m114522L(zaloListView.f79609g1, 0, m135743b, zaloListView.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.u61

                /* renamed from: b */
                public final /* synthetic */ C31874cb f82273b;

                public /* synthetic */ u61(C31874cb c31874cb2) {
                    r2 = c31874cb2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m87065i;
                    m87065i = ZaloListView.C15392j.this.m87065i(r2);
                    return m87065i;
                }
            });
        }

        @Override // w60.C28786i.a
        /* renamed from: e */
        public void mo87070e(C31874cb c31874cb, boolean z11, boolean z12) {
            ZaloListView.this.m86961TN(c31874cb, 2, z11, z12);
            C0708i c0708i = new C0708i();
            c0708i.m1075f("friend_request_source", String.valueOf(c31874cb.f146389e));
            C0732w.Companion.m1189a().m1187q("new_friend_request_avatar", "", c0708i, null);
            ZaloListView.this.f79609g1 = c31874cb.m153177a();
            AbstractC23059e9.m118317F(c31874cb.f146385a);
            C21933s.m114404I().m114417F0(c31874cb.f146385a);
            ZaloListView.this.m87046eO();
        }

        @Override // w60.C28786i.a
        /* renamed from: f */
        public void mo87071f() {
            String str;
            C17487o0 c17487o0;
            ZaloListView.this.f79588V1 = true;
            if (AbstractC25636f.m132481k() > 0) {
                str = "3101";
            } else {
                str = "3100";
            }
            AbstractC23647d.m123898h(str, "");
            C21933s.m114404I().m114477l0();
            AbstractC25636f.m132477g();
            ZaloListView zaloListView = ZaloListView.this;
            zaloListView.f72827B0.postDelayed(zaloListView.f79592X1, 50L);
            if (ZaloListView.this.f72421L0.m92676n2() != null) {
                c17487o0 = ZaloListView.this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_OPEN_FROM_TAB_CONTACT", true);
                c17487o0.m93069k2(RequestFriendView.class, bundle, 0, true);
            }
            C0815e1.m2075D().m2095O(String.valueOf(1), "40", String.valueOf(AbstractC25636f.m132481k()), "");
        }

        @Override // w60.C28786i.a
        /* renamed from: g */
        public void mo87072g(C31874cb c31874cb, boolean z11, boolean z12) {
            ZaloListView.this.m86961TN(c31874cb, 4, z11, z12);
            C0708i c0708i = new C0708i();
            c0708i.m1075f("friend_request_source", String.valueOf(c31874cb.f146389e));
            C0732w.Companion.m1189a().m1187q("new_friend_request_decline_button", "", c0708i, null);
            ZaloListView.this.m87034TM(c31874cb, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$k */
    /* loaded from: classes6.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC15393k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC15393k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                ZaloListView.this.f79559C1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79564H1 = zaloListView.f79559C1.getMeasuredHeight();
                int i11 = AbstractC23304d.f113407l1;
                int i12 = ZaloListView.this.f79564H1;
                if (i11 != i12 && i12 > 0) {
                    AbstractC23304d.f113407l1 = i12;
                    AbstractC23309i.m121531Vh(i12);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$l */
    /* loaded from: classes6.dex */
    public class C15394l extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$l$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f79661a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f79662b;

            /* renamed from: c */
            final /* synthetic */ int f79663c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f79661a = nVar;
                this.f79662b = c31980jc;
                this.f79663c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                C7232u9 c7232u9;
                try {
                    if (ZaloListView.this.f72421L0.m92672lJ()) {
                        AbstractC22055v0.n nVar = this.f79661a;
                        if (nVar != null) {
                            nVar.mo17230p(this.f79662b, ZaloListView.this.f79617k1);
                        }
                        if (C22013a0.m114928g() && C22013a0.m114924c().m114932h(3) && (c7232u9 = ZaloListView.this.f79601c1) != null) {
                            c7232u9.m10008p();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (ZaloListView.this.f72421L0.m92672lJ() && ZaloListView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (ZaloListView.this.f72421L0.m92672lJ() && ZaloListView.this.f72421L0.m92687sJ() && hVar != null && bundle != null) {
                    if (this.f79661a == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                    bundle.putInt("srcType", this.f79663c);
                    AbstractC22055v0.m115127Q(hVar, this.f79661a, ZaloListView.this.f72421L0.m92676n2(), bundle, 0);
                }
            }
        }

        C15394l() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(nVar, c31980jc, i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$m */
    /* loaded from: classes6.dex */
    class C15395m extends AbstractC11855f {
        C15395m(RecyclerView recyclerView, C7232u9 c7232u9, View view, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
            super(recyclerView, c7232u9, view, stateListDrawable, drawable, stateListDrawable2, drawable2);
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11855f
        /* renamed from: e0 */
        protected void mo65883e0() {
            ZaloListView.this.m87028OM();
            C0815e1.m2075D().m2095O("1", "47", "", "");
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11855f
        /* renamed from: f0 */
        protected void mo65884f0() {
            ZaloListView.this.m87044dN();
            ZaloListView.this.m87040ZN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$n */
    /* loaded from: classes6.dex */
    class C15396n extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        boolean f79666a = true;

        C15396n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            CountDownTimer countDownTimer;
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    ZaloListView.this.f79601c1.m36925d0(false);
                    ZaloListView.this.f79601c1.m10008p();
                    ZaloListView.this.m87028OM();
                    ZaloListView.this.m87044dN();
                    this.f79666a = true;
                    return;
                }
                ZaloListView.this.f79601c1.m36925d0(true);
                ZaloListView zaloListView = ZaloListView.this;
                if (zaloListView.f79563G1 && (countDownTimer = zaloListView.f79562F1) != null) {
                    countDownTimer.cancel();
                }
                if (this.f79666a) {
                    this.f79666a = false;
                    C0815e1.m2075D().m2095O("1", "48", "", "");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            ZaloListView.this.m87028OM();
            ZaloListView.this.m86955LM(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$o */
    /* loaded from: classes6.dex */
    public class C15397o extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean[] f79668a;

        /* renamed from: b */
        final /* synthetic */ boolean f79669b;

        C15397o(boolean[] zArr, boolean z11) {
            this.f79668a = zArr;
            this.f79669b = z11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ZaloListView.this.m86962UM(this.f79668a, this.f79669b);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$p */
    /* loaded from: classes6.dex */
    public class CountDownTimerC15398p extends CountDownTimer {
        CountDownTimerC15398p(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (ZaloListView.this.f79559C1.getVisibility() == 8) {
                ZaloListView.this.m87024LN(true);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$q */
    /* loaded from: classes6.dex */
    public class C15399q implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f79672a;

        C15399q(int i11) {
            this.f79672a = i11;
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
                    AbstractC2364o0.m12369l(ZaloListView.this.f72421L0.m92676n2(), ZaloListView.this.f79601c1);
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(ZaloListView.f79554n2, e11.toString());
                }
            } finally {
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79590W1 = z11;
                zaloListView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    AbstractC23309i.m121287Ow(this.f79672a);
                    C21927m.m114302u().m114336h0();
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(ZaloListView.f79554n2, e11.toString());
                }
            } finally {
                ZaloListView zaloListView = ZaloListView.this;
                zaloListView.f79590W1 = false;
                zaloListView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ZaloListView$r */
    /* loaded from: classes6.dex */
    public class C15400r extends AbstractAnimationAnimationListenerC20277g {
        C15400r() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            try {
                C7192r2 c7192r2 = ZaloListView.this.f79565I1;
                if (c7192r2 != null) {
                    c7192r2.f39416c = AbstractC23136l9.m118742r(44.0f);
                }
                ZaloListView.this.f79599b1.m9853S0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: AN */
    public /* synthetic */ void m86941AN() {
        try {
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.d61

                /* renamed from: q */
                public final /* synthetic */ List f80117q;

                public /* synthetic */ d61(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloListView.this.m87015zN(r2);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: BN */
    public /* synthetic */ void m86943BN(boolean z11) {
        if (z11) {
            C28786i c28786i = this.f79576P1;
            if (c28786i != null) {
                c28786i.m144015u(true);
            }
            TextView textView = this.f79573O0;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f79569M0;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        C28786i c28786i2 = this.f79576P1;
        if (c28786i2 != null) {
            c28786i2.m144015u(false);
        }
        TextView textView3 = this.f79573O0;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f79569M0;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    /* renamed from: CN */
    public /* synthetic */ void m86945CN() {
        C7232u9 c7232u9 = this.f79601c1;
        if (c7232u9 != null) {
            c7232u9.m10008p();
        }
    }

    /* renamed from: DN */
    public /* synthetic */ void m86947DN(List list) {
        C27970a c27970a = this.f79572N1;
        if (c27970a != null) {
            c27970a.m140968e(list);
        }
    }

    /* renamed from: EN */
    public /* synthetic */ void m86949EN() {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.l61

                /* renamed from: q */
                public final /* synthetic */ List f80984q;

                public /* synthetic */ l61(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloListView.this.m86947DN(r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: FN */
    public /* synthetic */ void m86951FN(List list, List list2) {
        this.f79576P1.m144010A();
        this.f79574O1.m144035o(list);
        this.f79576P1.m144020z(list2);
        m86957PM();
        m86955LM(true);
    }

    /* renamed from: GN */
    private void m86953GN() {
        try {
            if (AbstractC23309i.m122053jd() == 0) {
                return;
            }
            AbstractC23647d.m123897g(String.format("5801170%02d", Integer.valueOf((int) Math.ceil(Math.abs(System.currentTimeMillis() - r0) / 8.64E7d))));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    public void m86955LM(boolean z11) {
        boolean z12;
        boolean z13;
        View view;
        C28789l c28789l;
        C28786i c28786i;
        try {
            int m9740Y1 = this.f79605e1.m9740Y1();
            if (this.f79580R1 == null) {
                ArrayList arrayList = new ArrayList(2);
                this.f79580R1 = arrayList;
                arrayList.add("61");
                this.f79580R1.add("62");
            }
            if (m9740Y1 >= this.f79601c1.m36916T()) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean[] zArr = new boolean[2];
            boolean z14 = true;
            for (int i11 = 0; i11 < 2; i11++) {
                String str = (String) this.f79580R1.get(i11);
                if (!z12) {
                    if (str.equals("61") && (c28786i = this.f79576P1) != null) {
                        view = c28786i.m144012j();
                    } else if (str.equals("62") && (c28789l = this.f79574O1) != null) {
                        view = c28789l.m144027e();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        z14 = !m86960RM(view);
                    }
                }
                if (!z12 && !z14) {
                    z13 = false;
                    zArr[i11] = z13;
                }
                z13 = true;
                zArr[i11] = z13;
            }
            C0809c1.m2050b(new C15397o(zArr, z11));
        } catch (Exception unused) {
        }
    }

    /* renamed from: MM */
    private void m86956MM() {
        boolean z11;
        try {
            if (C24726a.f118764a.m128459a()) {
                m86969bN();
                z11 = true;
            } else {
                z11 = false;
            }
            C27970a c27970a = this.f79572N1;
            if (c27970a != null) {
                c27970a.m140967d(z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f79554n2, e11);
        }
    }

    /* renamed from: PM */
    private void m86957PM() {
        this.f79567K1.setVisibility(8);
        if (m86975fN() && AbstractC23309i.m121853e3() == 1 && !AbstractC0924m0.m3596Y8()) {
            if (this.f79594Y1 == 0 || !AbstractC0924m0.m3046F9()) {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) != 0 || !AbstractC23057e7.m118297d()) {
                    this.f79567K1.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: QM */
    public void m86958QM() {
        boolean z11;
        if (AbstractC0924m0.m4106pa() && C24726a.f118764a.m128461c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C27970a c27970a = this.f79572N1;
        if (c27970a != null) {
            c27970a.m140969f(z11);
        }
    }

    /* renamed from: QN */
    public static void m86959QN() {
        f79555o2 = -1;
        f79556p2 = -1;
    }

    /* renamed from: RM */
    private boolean m86960RM(View view) {
        if (!view.getGlobalVisibleRect(this.f79582S1)) {
            return false;
        }
        Rect rect = this.f79582S1;
        if (rect.bottom - rect.top <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: TN */
    public void m86961TN(C31874cb c31874cb, int i11, boolean z11, boolean z12) {
        String str;
        if (c31874cb != null) {
            try {
                if (!TextUtils.isEmpty(c31874cb.f146385a)) {
                    long j11 = c31874cb.f146398n;
                    if (j11 < 100000000000L) {
                        c31874cb.f146398n = j11 * 1000;
                    }
                    long j12 = 0;
                    if (c31874cb.f146398n > 0) {
                        j12 = (System.currentTimeMillis() - c31874cb.f146398n) / 1000;
                    }
                    C0815e1 m2075D = C0815e1.m2075D();
                    String[] strArr = new String[4];
                    strArr[0] = c31874cb.f146385a;
                    String str2 = "1";
                    if (!z11) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strArr[1] = str;
                    strArr[2] = String.valueOf(j12);
                    if (!z12) {
                        str2 = "0";
                    }
                    strArr[3] = str2;
                    m2075D.m2099U(3, i11, 39, strArr);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0103 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:3:0x0001, B:7:0x0009, B:10:0x000e, B:12:0x001f, B:14:0x002b, B:16:0x0033, B:18:0x010f, B:20:0x0037, B:22:0x003f, B:24:0x0054, B:26:0x005c, B:29:0x0060, B:31:0x0067, B:33:0x0071, B:35:0x0077, B:39:0x007f, B:41:0x0085, B:43:0x008f, B:44:0x0091, B:48:0x0097, B:50:0x00a3, B:52:0x00a9, B:54:0x00b1, B:56:0x00bf, B:58:0x00fb, B:60:0x0103, B:63:0x00d2, B:67:0x00f0, B:68:0x0044, B:70:0x004c, B:74:0x0115), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[SYNTHETIC] */
    /* renamed from: UM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m86962UM(boolean[] zArr, boolean z11) {
        int i11;
        C23669z c23669z;
        try {
            if (AbstractC23309i.m120962G3(3) != 1 || this.f79580R1 == null) {
                return;
            }
            HashMap m2385c = this.f79578Q1.m2385c();
            int size = this.f79580R1.size();
            boolean z12 = false;
            for (int i12 = 0; i12 < size; i12++) {
                String str = (String) this.f79580R1.get(i12);
                if (zArr[i12]) {
                    C23669z c23669z2 = (C23669z) m2385c.get(str);
                    if (c23669z2 != null) {
                        c23669z2.f114660g = false;
                    }
                } else {
                    if (str.equals("61")) {
                        i11 = AbstractC25636f.m132481k();
                    } else if (str.equals("62")) {
                        i11 = AbstractC25636f.m132483m();
                    } else {
                        i11 = 0;
                    }
                    if (i11 <= 0) {
                        C23669z c23669z3 = (C23669z) m2385c.get(str);
                        if (c23669z3 != null) {
                            c23669z3.f114660g = false;
                        }
                    } else if (m2385c.containsKey(str)) {
                        C23669z c23669z4 = (C23669z) m2385c.get(str);
                        if (c23669z4 instanceof C23651h) {
                            C23651h c23651h = (C23651h) c23669z4;
                            if (c23651h.f114659f != null && c23651h.m123964l()) {
                                String valueOf = String.valueOf(i11);
                                if (z11 && !c23651h.f114659f[2].equals(valueOf)) {
                                    c23651h.f114660g = false;
                                }
                                if (!c23651h.f114660g) {
                                    c23651h.f114660g = true;
                                    if (c23651h.f114659f[2].equals(valueOf)) {
                                        String str2 = c23651h.f114659f[0];
                                        if (str2 == null || str2.isEmpty()) {
                                            str2 = "1";
                                        }
                                        c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str2) + 1);
                                    } else {
                                        c23651h.f114656c = System.currentTimeMillis();
                                        c23651h.f114659f[0] = String.valueOf(1);
                                        c23651h.f114659f[2] = valueOf;
                                    }
                                }
                            }
                        }
                        c23669z = (C23669z) m2385c.get(str);
                        if (c23669z == null) {
                            C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z);
                            z12 = true;
                        }
                    } else {
                        C23651h m123961i = C23651h.m123961i(24, String.valueOf(1), str, String.valueOf(i11), "");
                        if (m123961i != null) {
                            m123961i.f114654a = 3;
                            m123961i.f114655b = 1;
                            m123961i.f114657d = 24;
                            m123961i.f114660g = true;
                            m2385c.put(str, m123961i);
                            c23669z = (C23669z) m2385c.get(str);
                            if (c23669z == null) {
                            }
                        }
                    }
                }
            }
            if (z12) {
                this.f79578Q1.m2386d(m2385c);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: UN */
    private void m86963UN(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    C0815e1.m2075D().m2099U(3, 2, 24, contactProfile.f42434r);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: VM */
    private void m86964VM() {
        AbstractC23057e7.m118305l(true);
        m87024LN(false);
        this.f79563G1 = false;
        AbstractC23309i.m121771bx(false);
        this.f79567K1.setVisibility(8);
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_auto_submit_phonebook_popup_success));
    }

    /* renamed from: XM */
    private static String m86965XM(boolean z11, boolean z12, boolean z13) {
        return z11 ? "1" : z12 ? "2" : z13 ? "3" : "4";
    }

    /* renamed from: XN */
    private void m86966XN() {
        try {
            TextView textView = this.f79585U0;
            if (textView != null && this.f79587V0 != null) {
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f79587V0);
                this.f79587V0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YN */
    public void m86967YN() {
        C7232u9 c7232u9 = this.f79601c1;
        if (c7232u9 != null) {
            c7232u9.m10008p();
        }
    }

    /* renamed from: aO */
    public void m86968aO() {
        if (!C24726a.f118764a.m128460b()) {
            C27970a c27970a = this.f79572N1;
            if (c27970a != null) {
                c27970a.m140968e(null);
                return;
            }
            return;
        }
        if (!C21927m.m114302u().m114315M() || !C18644n.m98531l().m98551n().get()) {
            return;
        }
        AbstractC17930e.m94544c().mo94529c("THROTTLE_LAST_UPDATE_PROMOTE_BIRTHDAY_FRIEND", new Runnable() { // from class: com.zing.zalo.ui.zviews.j61
            public /* synthetic */ j61() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloListView.this.m86949EN();
            }
        }, 150L);
    }

    /* renamed from: bN */
    private void m86969bN() {
        if (this.f79572N1 == null) {
            ViewGroup viewGroup = (ViewGroup) this.f79626q1.findViewById(AbstractC6918a0.birthday_hub_friend_row);
            C27970a c27970a = new C27970a(viewGroup, this.f79617k1);
            this.f79572N1 = c27970a;
            c27970a.m140968e(null);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.b61
                public /* synthetic */ b61() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZaloListView.this.m86983jN(view);
                }
            });
        }
    }

    /* renamed from: cN */
    private void m86970cN() {
        ViewStub viewStub = this.f79577Q0;
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.f79579R0 = inflate;
            this.f79577Q0 = null;
            this.f79581S0 = (TextView) inflate.findViewById(AbstractC6918a0.tv_suggest_delete_friend);
            this.f79583T0 = (GroupAvatarView) this.f79579R0.findViewById(AbstractC6918a0.img_avatar_delete_friend);
            this.f79585U0 = (TextView) this.f79579R0.findViewById(AbstractC6918a0.tv_num_delete_friend);
            this.f79589W0 = this.f79579R0.findViewById(AbstractC6918a0.shadow_delete_friend);
            ViewTreeObserver viewTreeObserver = this.f79585U0.getViewTreeObserver();
            e61 e61Var = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.e61
                public /* synthetic */ e61() {
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ZaloListView.this.m86985kN();
                }
            };
            this.f79587V0 = e61Var;
            viewTreeObserver.addOnGlobalLayoutListener(e61Var);
            this.f79579R0.findViewById(AbstractC6918a0.btn_ignore_delete_friend).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.f61
                public /* synthetic */ f61() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZaloListView.this.m86987lN(view);
                }
            });
            this.f79579R0.findViewById(AbstractC6918a0.btn_view_detail_delete_friend).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.g61
                public /* synthetic */ g61() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZaloListView.this.m86989mN(view);
                }
            });
            this.f79579R0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.h61
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC23647d.m123897g("5801151");
                }
            });
        }
    }

    /* renamed from: eN */
    private boolean m86973eN() {
        View view = this.f79579R0;
        if (view != null && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: fN */
    public static boolean m86975fN() {
        if (f79556p2 == -1) {
            f79556p2 = AbstractC0924m0.m3133I9() ? 1 : 0;
        }
        if (f79556p2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: gN */
    public static boolean m86977gN() {
        if (f79555o2 == -1) {
            f79555o2 = AbstractC0924m0.m3423S9() ? 1 : 0;
        }
        if (f79555o2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: hN */
    public /* synthetic */ void m86979hN() {
        RecyclerView recyclerView = this.f79599b1;
        if (recyclerView != null) {
            recyclerView.m9837K1(0);
        }
    }

    /* renamed from: iN */
    public /* synthetic */ void m86981iN() {
        try {
            m87045dO();
            if (m87036WM() != null) {
                MainTabView.m67645lM().m67678NN();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: jN */
    public /* synthetic */ void m86983jN(View view) {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            new Bundle().putInt("extra_key_source", 1);
            c17487o0.m93069k2(BirthdayHubView.class, null, 1, true);
            C0815e1.m2075D().m2095O(String.valueOf(1), "49", "", "");
        }
        C27970a c27970a = this.f79572N1;
        boolean z11 = false;
        if (c27970a != null) {
            c27970a.m140969f(false);
            z11 = this.f79572N1.m140966b();
        }
        C26231b.m134863b(z11);
    }

    /* renamed from: kN */
    public /* synthetic */ void m86985kN() {
        try {
            TextView textView = this.f79585U0;
            if (textView != null && textView.getHeight() > 0) {
                m86966XN();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f79585U0.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, -(this.f79585U0.getHeight() / 2), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f79585U0.setLayoutParams(marginLayoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lN */
    public /* synthetic */ void m86987lN(View view) {
        if (this.f79593Y0) {
            return;
        }
        this.f79593Y0 = true;
        View view2 = this.f79579R0;
        if (view2 != null) {
            view2.setVisibility(8);
            m87031RN(this.f79591X0);
        }
        AbstractC23309i.m122361rl(false);
        AbstractC0852x.m2331H();
        AbstractC23647d.m123897g("5801153");
    }

    /* renamed from: mN */
    public /* synthetic */ void m86989mN(View view) {
        if (this.f79593Y0) {
            return;
        }
        this.f79593Y0 = true;
        AbstractC23309i.m122361rl(false);
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().mo35573l4(DeletePhoneBookView.class, null, 1, true);
        }
        AbstractC23647d.m123897g("5801152");
        m86953GN();
    }

    /* renamed from: oN */
    public /* synthetic */ void m86993oN() {
        try {
            if (this.f79557A1 && this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pN */
    public /* synthetic */ void m86995pN() {
        AbstractC25636f.m132475e();
        m87045dO();
    }

    /* renamed from: qN */
    public /* synthetic */ boolean m86997qN() {
        AbstractC11855f abstractC11855f = this.f79603d1;
        if (abstractC11855f != null && abstractC11855f.m114868x()) {
            return true;
        }
        return false;
    }

    /* renamed from: rN */
    public /* synthetic */ void m86999rN() {
        m87028OM();
        m87044dN();
    }

    /* renamed from: sN */
    public /* synthetic */ void m87001sN(boolean z11, boolean z12, KeyEventCallbackC17462c keyEventCallbackC17462c, int i11, boolean z13) {
        if (i11 == AbstractC6918a0.llProfile) {
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.dismiss();
            }
            this.f79609g1 = this.f79607f1;
            m87046eO();
            AbstractC23647d.m123897g("3250");
            AbstractC23647d.m123897g("5901193");
            C0815e1 m2075D = C0815e1.m2075D();
            String valueOf = String.valueOf(1);
            ContactProfile contactProfile = this.f79609g1;
            m2075D.m2095O(valueOf, "17", contactProfile.f42434r, m86965XM(z11, z12, contactProfile.f42430p1));
            return;
        }
        if (i11 == AbstractC6918a0.llChangeAlias) {
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.dismiss();
            }
            this.f79609g1 = this.f79607f1;
            m87022KM();
            AbstractC23647d.m123897g("5901196");
            return;
        }
        if (i11 == AbstractC6918a0.llAddFavorite) {
            if (z13) {
                AbstractC23647d.m123898h("3240", "");
                if (C21927m.m114302u().m114351p() != null && !C21927m.m114302u().m114351p().contains(this.f79607f1.f42434r)) {
                    if (C21927m.m114302u().m114351p().size() < AbstractC23309i.m121115K8()) {
                        m87020JM(this.f79607f1.f42434r);
                    } else {
                        C2856b1 c2856b1 = this.f79610g2;
                        if (c2856b1 != null && c2856b1.m92868m()) {
                            this.f79610g2.m13771N(false);
                        }
                        ToastUtils.showMess(String.format(m92652XI(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(AbstractC23309i.m121115K8())));
                    }
                }
                C0815e1 m2075D2 = C0815e1.m2075D();
                String valueOf2 = String.valueOf(1);
                ContactProfile contactProfile2 = this.f79607f1;
                m2075D2.m2095O(valueOf2, "18", contactProfile2.f42434r, m86965XM(z11, z12, contactProfile2.f42430p1));
                return;
            }
            AbstractC23647d.m123898h("3260", "");
            if (C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(this.f79607f1.f42434r)) {
                m87029ON(this.f79607f1.f42434r);
            }
            C0815e1 m2075D3 = C0815e1.m2075D();
            String valueOf3 = String.valueOf(1);
            ContactProfile contactProfile3 = this.f79607f1;
            m2075D3.m2095O(valueOf3, "19", contactProfile3.f42434r, m86965XM(z11, z12, contactProfile3.f42430p1));
            return;
        }
        if (i11 == AbstractC6918a0.llBlockMsg) {
            if (z13) {
                AbstractC23647d.m123897g("3220");
                m87018IM(this.f79607f1, 3);
                C0815e1 m2075D4 = C0815e1.m2075D();
                String valueOf4 = String.valueOf(1);
                ContactProfile contactProfile4 = this.f79607f1;
                m2075D4.m2095O(valueOf4, "16", contactProfile4.f42434r, m86965XM(z11, z12, contactProfile4.f42430p1));
                return;
            }
            m87037WN(this.f79607f1, 3);
            C0815e1 m2075D5 = C0815e1.m2075D();
            String valueOf5 = String.valueOf(1);
            ContactProfile contactProfile5 = this.f79607f1;
            m2075D5.m2095O(valueOf5, "20", contactProfile5.f42434r, m86965XM(z11, z12, contactProfile5.f42430p1));
            return;
        }
        if (i11 == AbstractC6918a0.llDelete) {
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.dismiss();
            }
            AbstractC23647d.m123898h("3230", "");
            this.f72421L0.showDialog(7);
            AbstractC23647d.m123897g("300018100");
            C0815e1 m2075D6 = C0815e1.m2075D();
            String valueOf6 = String.valueOf(1);
            ContactProfile contactProfile6 = this.f79607f1;
            m2075D6.m2095O(valueOf6, "14", contactProfile6.f42434r, m86965XM(z11, z12, contactProfile6.f42430p1));
        }
    }

    /* renamed from: tN */
    public /* synthetic */ void m87003tN(SimpleAdapter simpleAdapter, boolean z11, boolean z12, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.ignore_zalouser) {
            AbstractC23647d.m123907q("3220", "");
            this.f72421L0.showDialog(5);
            AbstractC23647d.m123893c();
            C0815e1 m2075D = C0815e1.m2075D();
            String valueOf = String.valueOf(1);
            ContactProfile contactProfile = this.f79607f1;
            m2075D.m2095O(valueOf, "16", contactProfile.f42434r, m86965XM(z11, z12, contactProfile.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_unblockuser) {
            this.f72421L0.showDialog(15);
            C0815e1 m2075D2 = C0815e1.m2075D();
            String valueOf2 = String.valueOf(1);
            ContactProfile contactProfile2 = this.f79607f1;
            m2075D2.m2095O(valueOf2, "20", contactProfile2.f42434r, m86965XM(z11, z12, contactProfile2.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.delete_zalouser) {
            AbstractC23647d.m123907q("3230", "");
            this.f72421L0.showDialog(7);
            AbstractC23647d.m123893c();
            AbstractC23647d.m123906p("300018100");
            AbstractC23647d.m123893c();
            C0815e1 m2075D3 = C0815e1.m2075D();
            String valueOf3 = String.valueOf(1);
            ContactProfile contactProfile3 = this.f79607f1;
            m2075D3.m2095O(valueOf3, "14", contactProfile3.f42434r, m86965XM(z11, z12, contactProfile3.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.addfavorite_zalouser) {
            AbstractC23647d.m123907q("3240", "");
            if (C21927m.m114302u().m114351p() != null && !C21927m.m114302u().m114351p().contains(this.f79607f1.f42434r)) {
                if (C21927m.m114302u().m114351p().size() < AbstractC23309i.m121115K8()) {
                    m87020JM(this.f79607f1.f42434r);
                } else {
                    ToastUtils.showMess(String.format(m92652XI(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(AbstractC23309i.m121115K8())));
                }
            }
            AbstractC23647d.m123893c();
            C0815e1 m2075D4 = C0815e1.m2075D();
            String valueOf4 = String.valueOf(1);
            ContactProfile contactProfile4 = this.f79607f1;
            m2075D4.m2095O(valueOf4, "18", contactProfile4.f42434r, m86965XM(z11, z12, contactProfile4.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.cm_removefavorite_zalouser) {
            AbstractC23647d.m123907q("3260", "");
            if (C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(this.f79607f1.f42434r)) {
                m87029ON(this.f79607f1.f42434r);
            }
            AbstractC23647d.m123893c();
            C0815e1 m2075D5 = C0815e1.m2075D();
            String valueOf5 = String.valueOf(1);
            ContactProfile contactProfile5 = this.f79607f1;
            m2075D5.m2095O(valueOf5, "19", contactProfile5.f42434r, m86965XM(z11, z12, contactProfile5.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.view_detail_zalouser) {
            AbstractC23647d.m123907q("3250", "");
            this.f79609g1 = this.f79607f1;
            m87046eO();
            AbstractC23647d.m123893c();
            AbstractC23647d.m123897g("5901193");
            C0815e1 m2075D6 = C0815e1.m2075D();
            String valueOf6 = String.valueOf(1);
            ContactProfile contactProfile6 = this.f79609g1;
            m2075D6.m2095O(valueOf6, "17", contactProfile6.f42434r, m86965XM(z11, z12, contactProfile6.f42430p1));
            return;
        }
        if (intValue == AbstractC8020f0.str_change_alias_name_title) {
            this.f79609g1 = this.f79607f1;
            m87022KM();
            AbstractC23647d.m123897g("5901196");
        }
    }

    /* renamed from: uN */
    public /* synthetic */ void m87005uN(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f79612h2 != null) {
            AbstractC23647d.m123906p("300018202");
            AbstractC23647d.m123893c();
        } else {
            AbstractC23647d.m123906p("300018204");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: vN */
    public /* synthetic */ void m87007vN(InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ContactProfile contactProfile = this.f79607f1;
        CheckBox checkBox = this.f79612h2;
        if (checkBox != null && checkBox.isChecked()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m87030PN(contactProfile, z11);
        CheckBox checkBox2 = this.f79612h2;
        if (checkBox2 != null) {
            if (checkBox2.isChecked()) {
                AbstractC23647d.m123906p("300018201");
                AbstractC23647d.m123893c();
                return;
            } else {
                AbstractC23647d.m123906p("300018200");
                AbstractC23647d.m123893c();
                return;
            }
        }
        AbstractC23647d.m123906p("300018203");
        AbstractC23647d.m123893c();
    }

    /* renamed from: wN */
    public /* synthetic */ void m87009wN(View view) {
        CheckBox checkBox = this.f79612h2;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* renamed from: xN */
    public /* synthetic */ void m87011xN(InterfaceC17463d interfaceC17463d) {
        C7232u9 c7232u9 = this.f79601c1;
        if (c7232u9 != null) {
            c7232u9.m10008p();
        }
    }

    /* renamed from: yN */
    public /* synthetic */ void m87013yN(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.str_change_alias_name_title) {
            this.f79609g1 = this.f79607f1;
            m87022KM();
        }
    }

    /* renamed from: zN */
    public /* synthetic */ void m87015zN(List list) {
        int length;
        int length2;
        int length3;
        try {
            int size = list.size();
            if (size > 0 && list.get(0) != null) {
                this.f79579R0.setVisibility(0);
                m87031RN(-this.f79589W0.getLayoutParams().height);
                ContactProfile contactProfile = (ContactProfile) list.get(0);
                AbstractC23268y2.m120027a(this.f79583T0, contactProfile, false);
                String m142177a = AbstractC28218w3.m142177a(contactProfile);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String m119733C = AbstractC23244v8.m119733C(m142177a);
                if (size > 1) {
                    int i11 = size - 1;
                    spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118746s0(AbstractC8020f0.str_suggest_delete_friend_multi_first, m119733C, Integer.valueOf(i11)));
                    length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " ");
                    length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_delete_friend_multi_second));
                    length3 = spannableStringBuilder.length();
                    this.f79585U0.setVisibility(0);
                    this.f79585U0.setText("+" + i11);
                } else {
                    spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118746s0(AbstractC8020f0.str_suggest_delete_friend_single_first, m119733C));
                    length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " ");
                    length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_delete_friend_single_second));
                    length3 = spannableStringBuilder.length();
                    this.f79585U0.setVisibility(4);
                }
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f79581S0.getContext(), AbstractC21196a.TextColor1)), 0, length, 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f79581S0.getContext(), AbstractC21196a.TextColor2)), length2, length3, 33);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f79581S0.setText(spannableStringBuilder);
                this.f79563G1 = false;
                FrameLayout frameLayout = this.f79559C1;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    return;
                }
                return;
            }
            this.f79579R0.setVisibility(8);
            m87031RN(this.f79591X0);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.m61.<init>(com.zing.zalo.ui.zviews.ZaloListView, boolean, boolean):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public com.zing.zalo.zview.dialog.KeyEventCallbackC17462c mo39014DJ(int r14) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.ZaloListView.mo39014DJ(int):com.zing.zalo.zview.dialog.c");
    }

    @Override // com.zing.zalo.adapters.C7232u9.c
    /* renamed from: F7 */
    public void mo36932F7(String str) {
        C17487o0 c17487o0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("-3")) {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(PhoneBookView.class, null, 1, true);
            }
            AbstractC23647d.m123897g("5901195");
            C0815e1.m2075D().m2095O(String.valueOf(1), "46", "", "");
            return;
        }
        if (str.equals("-2")) {
            AbstractC23309i.m121917fs(AbstractC23309i.m120929F7() + 10);
            C21927m.m114302u().m114336h0();
            AbstractC23647d.m123897g("5801101");
        } else if (str.equals("-1")) {
            AbstractC23309i.m121917fs(3);
            C21927m.m114302u().m114336h0();
            AbstractC23647d.m123897g("5801102");
        } else if (str.equals("-4")) {
            m87043cO();
        } else if (str.equals("-5")) {
            AbstractC23647d.m123897g("3241");
            m87023KN();
            C0815e1.m2075D().m2095O(String.valueOf(1), "45", "", "");
            C0732w.Companion.m1189a().m1187q("contacts_close_friend_add_more_button", "", null, null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zing_list, viewGroup, false);
        this.f79617k1 = new C23528a(this.f72421L0.m92648SI());
        this.f79599b1 = (RecyclerView) inflate.findViewById(AbstractC6918a0.phoneList);
        this.f79566J1 = inflate.findViewById(AbstractC6918a0.llBubbleScroll);
        this.f79558B1 = true;
        this.f79626q1 = layoutInflater.inflate(AbstractC7409c0.header_view_contacts_tab, (ViewGroup) null, false);
        this.f79627r1 = layoutInflater.inflate(AbstractC7409c0.header_view_fake_subtab, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) this.f79626q1.findViewById(AbstractC6918a0.layout_find_more_friends);
        this.f79628s1 = linearLayout;
        this.f79629t1 = (RecyclingImageView) linearLayout.findViewById(AbstractC6918a0.buddy_dp);
        this.f79631v1 = (RecyclingImageView) this.f79628s1.findViewById(AbstractC6918a0.ic_close_view);
        this.f79632w1 = (TextView) this.f79628s1.findViewById(AbstractC6918a0.title_find_more);
        this.f79633x1 = (TextView) this.f79628s1.findViewById(AbstractC6918a0.desc_find_more);
        this.f79634y1 = (TextView) this.f79628s1.findViewById(AbstractC6918a0.action_find_more);
        this.f79630u1 = (AvatarImageView) this.f79628s1.findViewById(AbstractC6918a0.image_profile);
        View inflate2 = layoutInflater.inflate(AbstractC7409c0.find_more_row, (ViewGroup) null, false);
        this.f79571N0 = inflate2;
        this.f79573O0 = (TextView) inflate2.findViewById(AbstractC6918a0.num_friend);
        this.f79569M0 = (TextView) this.f79571N0.findViewById(AbstractC6918a0.tv_update_phonebook);
        this.f79575P0 = inflate.findViewById(AbstractC6918a0.empty_view);
        this.f79567K1 = this.f79626q1.findViewById(AbstractC6918a0.layout_permission_contact);
        this.f79568L1 = this.f79626q1.findViewById(AbstractC6918a0.btn_cancel_permission_contact);
        this.f79570M1 = this.f79626q1.findViewById(AbstractC6918a0.btn_accept_permission_contact);
        this.f79568L1.setOnClickListener(this);
        this.f79570M1.setOnClickListener(this);
        C28789l c28789l = new C28789l((FrameLayout) this.f79626q1.findViewById(AbstractC6918a0.suggest_phonebook_row), this.f79617k1);
        this.f79574O1 = c28789l;
        c28789l.m144035o(null);
        C28786i c28786i = new C28786i((FrameLayout) this.f79626q1.findViewById(AbstractC6918a0.suggest_friend_request), this.f79617k1);
        this.f79576P1 = c28786i;
        c28786i.m144020z(null);
        this.f79576P1.m144014t(new C15392j());
        if (AbstractC23309i.m122157m4()) {
            this.f79574O1.m144030j(true);
            this.f79574O1.m144029i(this);
            this.f79635z1 = this.f79574O1.m144026d();
        } else {
            this.f79574O1.m144030j(false);
        }
        this.f79559C1 = (FrameLayout) inflate.findViewById(AbstractC6918a0.bottom_banner);
        this.f79560D1 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.btn_close_banner);
        this.f79561E1 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_link_now);
        if (AbstractC23304d.f113407l1 == 0) {
            AbstractC23304d.f113407l1 = AbstractC23309i.m121254O();
        }
        ViewTreeObserver viewTreeObserver = this.f79559C1.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15393k());
        }
        this.f79560D1.setOnClickListener(this);
        this.f79561E1.setOnClickListener(this);
        this.f79559C1.setOnClickListener(this);
        this.f79595Z0 = (TextView) this.f79575P0.findViewById(AbstractC6918a0.list_empty_text);
        this.f79597a1 = (ProgressBar) this.f79575P0.findViewById(AbstractC6918a0.pb_loading);
        this.f79576P1.m144016v(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f79599b1.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f79591X0 = marginLayoutParams.bottomMargin;
        }
        this.f79577Q0 = (ViewStub) inflate.findViewById(AbstractC6918a0.viewstub_suggest_delete_friend);
        this.f79579R0 = null;
        this.f79572N1 = null;
        m86956MM();
        return inflate;
    }

    @Override // com.zing.zalo.adapters.C7232u9.c
    /* renamed from: Gd */
    public void mo36933Gd(int i11) {
        m87041aN(i11);
    }

    @Override // w60.C28789l.a
    /* renamed from: Gw */
    public void mo87016Gw(int i11) {
        String str;
        C17487o0 c17487o0;
        C17487o0 mo35579p;
        String str2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    AbstractC25636f.m132477g();
                    C21927m.m114302u().m114325a0();
                    return;
                }
                return;
            }
            try {
                if (this.f72421L0.m92676n2() != null && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
                    mo35579p.m93069k2(ListContactNativeView.class, null, 0, true);
                    if (AbstractC25636f.m132483m() > 0) {
                        str2 = "3000220";
                    } else {
                        str2 = "3000200";
                    }
                    AbstractC23647d.m123897g(str2);
                    C0815e1.m2075D().m2095O(String.valueOf(1), "41", String.valueOf(AbstractC25636f.m132483m()), "");
                    MainTabView m67645lM = MainTabView.m67645lM();
                    if (m67645lM != null) {
                        m67645lM.m67668CN(C24099q0.m125958k().m125972p());
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (AbstractC25636f.m132481k() > 0) {
            str = "3101";
        } else {
            str = "3100";
        }
        AbstractC23647d.m123898h(str, "");
        C21933s.m114404I().m114477l0();
        AbstractC25636f.m132477g();
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            c17487o0.m93069k2(SuggestFriendView.class, null, 1, true);
        }
        C0815e1.m2075D().m2095O(String.valueOf(1), "40", String.valueOf(AbstractC25636f.m132481k()), "");
    }

    /* renamed from: HN */
    void m87017HN() {
        try {
            if (!AbstractC23057e7.m118300g(this.f72421L0.m92648SI())) {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f79614i2.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                        AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 117);
                    } else {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f79614i2;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f79614i2.f42446v, false, 15));
                    }
                }
            } else {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            if (this.f79599b1 != null) {
                this.f79599b1 = null;
            }
            C7232u9 c7232u9 = this.f79601c1;
            if (c7232u9 != null) {
                c7232u9.m36912P();
                this.f79601c1 = null;
            }
            this.f79578Q1.m2383a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    /* renamed from: IM */
    void m87018IM(ContactProfile contactProfile, int i11) {
        if (this.f79600b2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15384b(contactProfile));
        this.f79600b2 = true;
        c0766k.mo1479L9(contactProfile.f42434r, i11);
    }

    /* renamed from: IN */
    void m87019IN() {
        try {
            if (AbstractC23057e7.m118300g(this.f72421L0.m92648SI())) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
                return;
            }
            if (C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f79614i2.f42434r)) {
                        C20024r.m103949w();
                        return;
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return;
                    }
                }
                Context m92648SI = this.f72421L0.m92648SI();
                String[] strArr = AbstractC23034c6.f112033j;
                if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                    AbstractC23034c6.m118184v0(this, strArr, 113);
                    return;
                }
                C2279a m120722w0 = AbstractC23306f.m120722w0();
                ContactProfile contactProfile = this.f79614i2;
                m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f79614i2.f42446v, true, 16));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m86966XN();
        super.mo37484JJ();
    }

    /* renamed from: JM */
    void m87020JM(String str) {
        int i11;
        if (this.f79606e2) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15387e(str));
        try {
            i11 = Integer.parseInt(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = -1;
        }
        if (i11 > -1) {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            ArrayList arrayList = new ArrayList();
            this.f79606e2 = true;
            arrayList.add(Integer.valueOf(i11));
            c0766k.mo1653h8(arrayList);
        }
    }

    /* renamed from: JN */
    public void m87021JN() {
        int i11;
        try {
            List m114355r = C21927m.m114302u().m114355r();
            if (m114355r.isEmpty() && AbstractC21935u.m114512B()) {
                m87047pv(true, -1);
            } else {
                TextView textView = this.f79569M0;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                int i12 = C21927m.m114302u().f107790J;
                TextView textView2 = this.f79573O0;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i12);
                if (i12 > 1) {
                    i11 = AbstractC8020f0.str_more_s;
                } else {
                    i11 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = AbstractC23136l9.m118743r0(i11);
                textView2.setText(String.format(m118743r0, objArr));
                m87045dO();
                this.f79601c1.m36924c0(m114355r);
                this.f79599b1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.t61
                    public /* synthetic */ t61() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloListView.this.m86999rN();
                    }
                }, 5L);
                m87026NM(i12, 0);
                m86968aO();
                m87047pv(false, AbstractC8020f0.invitetalk01);
            }
            if (m87036WM() != null) {
                MainTabView.m67645lM().m67678NN();
                if (MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125972p() && MainTabView.m67645lM().m67706rM()) {
                    MainTabView.m67645lM().m67716wN(false);
                    MainTabView.m67645lM().m67675LN();
                }
            }
            m87027NN();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f79554n2, e11);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        C7232u9 c7232u9;
        int mo92862f = interfaceC17463d.mo92862f();
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            if (mo92862f != 5) {
                if (mo92862f != 17) {
                    if (mo92862f != 20) {
                        if (mo92862f != 14) {
                            if (mo92862f == 15) {
                                m87037WN(this.f79607f1, 3);
                                return;
                            }
                            return;
                        }
                        m87038YM("", false);
                        return;
                    }
                    m86964VM();
                    return;
                }
                AbstractC23309i.m121917fs(3);
                m87042bO(15, 0);
                AbstractC23647d.m123897g("5801097");
                return;
            }
            m87018IM(this.f79607f1, 3);
            return;
        }
        if (i11 == -2) {
            interfaceC17463d.dismiss();
            if (mo92862f == 17 && (c7232u9 = this.f79601c1) != null) {
                c7232u9.m10008p();
            }
        }
    }

    /* renamed from: KM */
    void m87022KM() {
        try {
            ContactProfile contactProfile = this.f79609g1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                SensitiveData sensitiveData = new SensitiveData("phonebook_update_alias_in_phonebook_tab", "phonebook_update");
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                ContactProfile contactProfile2 = this.f79609g1;
                m92676n2.mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(contactProfile2.f42434r, contactProfile2.f42437s, 692, sensitiveData), 1, true);
                boolean m114317O = C21927m.m114302u().m114317O(this.f79613i1);
                boolean m114316N = C21927m.m114302u().m114316N(this.f79613i1);
                C0815e1 m2075D = C0815e1.m2075D();
                String valueOf = String.valueOf(1);
                ContactProfile contactProfile3 = this.f79609g1;
                m2075D.m2095O(valueOf, "15", contactProfile3.f42434r, m86965XM(m114317O, m114316N, contactProfile3.f42430p1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KN */
    public void m87023KN() {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bAddFavoriteGrid", true);
                BroadcastMsgToFriendsView broadcastMsgToFriendsView = new BroadcastMsgToFriendsView();
                broadcastMsgToFriendsView.mo60305zK(bundle);
                broadcastMsgToFriendsView.m78578QM(this);
                c17487o0.mo89693h2(broadcastMsgToFriendsView, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LN */
    void m87024LN(boolean z11) {
        int i11;
        FrameLayout frameLayout = this.f79559C1;
        if (frameLayout != null && this.f79563G1 && !this.f79616j2) {
            if (this.f79564H1 == 0) {
                this.f79564H1 = AbstractC23304d.f113407l1;
            }
            if (this.f79564H1 == 0) {
                this.f79564H1 = frameLayout.getHeight();
            }
            if (z11) {
                i11 = 0;
            } else {
                i11 = this.f79564H1;
            }
            AbstractC23202r9.m119547o(this.f79559C1, i11, new C15389g(z11));
        }
    }

    /* renamed from: MN */
    void m87025MN() {
        this.f72827B0.removeCallbacks(this.f79592X1);
        this.f72827B0.postDelayed(this.f79592X1, 6000L);
    }

    /* renamed from: NM */
    void m87026NM(int i11, int i12) {
        C7232u9 c7232u9;
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e11) {
            LinearLayout linearLayout = this.f79628s1;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            AbstractC23350e.m122774d(f79554n2, e11.toString());
        }
        if (AbstractC23309i.m120740A3() == 0 && (c7232u9 = this.f79601c1) != null && !c7232u9.m36918W()) {
            if (i11 > 0 && i11 < 10) {
                if (i12 == 0) {
                    AbstractC23309i.m121950gn(1);
                    LinearLayout linearLayout2 = this.f79628s1;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                }
                if (i12 != 0) {
                    RecyclingImageView recyclingImageView = this.f79629t1;
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.icn_contact_connect));
                    if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42446v)) {
                        ((C23528a) this.f79617k1.m123612r(this.f79630u1)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
                    } else {
                        ((C23528a) this.f79617k1.m123612r(this.f79630u1)).m123615u(AbstractC23136l9.m118665N(this.f79630u1.getContext(), AbstractC16803z.default_avatar2));
                    }
                    this.f79630u1.setVisibility(0);
                    this.f79631v1.setTag(2);
                    this.f79608f2 = i11;
                    this.f79631v1.setOnClickListener(this);
                }
            } else {
                AbstractC23309i.m121950gn(1);
                LinearLayout linearLayout3 = this.f79628s1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkShowHideFindMoreFriendLayout: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        if (AbstractC23309i.m120970Gb() == 1) {
            AbstractC23309i.m121324Pw(0);
            if (AbstractC23309i.m121118Kb() == 1 && AbstractC23309i.m120970Gb() == 1) {
                this.f79632w1.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.contact_hint_title_recent_update_list));
                this.f79633x1.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.contact_hint_des_recent_update_list));
                this.f79634y1.setText(this.f72421L0.m92651WI().getString(AbstractC8020f0.str_cap_move_to_recent_update_list));
                RecyclingImageView recyclingImageView2 = this.f79629t1;
                recyclingImageView2.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView2.getContext(), AbstractC16803z.icn_contact_friendstatus));
                this.f79631v1.setTag(1);
                this.f79631v1.setOnClickListener(this);
                LinearLayout linearLayout4 = this.f79628s1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                    this.f79630u1.setVisibility(8);
                    this.f79628s1.setTag(1);
                    this.f79628s1.setOnClickListener(this);
                    return;
                }
                return;
            }
            LinearLayout linearLayout5 = this.f79628s1;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout6 = this.f79628s1;
        if (linearLayout6 != null) {
            linearLayout6.setVisibility(8);
        }
    }

    /* renamed from: NN */
    public void m87027NN() {
        try {
            if (AbstractC23309i.m121418Sf() && AbstractC23309i.m121828df() && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                m86970cN();
                this.f79593Y0 = false;
                if (this.f79579R0 != null) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.t51
                        public /* synthetic */ t51() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.this.m86941AN();
                        }
                    });
                }
            } else {
                View view = this.f79579R0;
                if (view != null) {
                    view.setVisibility(8);
                    m87031RN(this.f79591X0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    void m87028OM() {
        boolean z11;
        try {
            if (((LinearLayoutManager) this.f79599b1.getLayoutManager()).m9737T1() <= 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f79557A1 = z11;
            if (z11) {
                if (this.f79558B1) {
                    this.f79558B1 = false;
                    AbstractC11855f abstractC11855f = this.f79603d1;
                    if (abstractC11855f != null) {
                        abstractC11855f.mo65930u();
                    }
                }
            } else if (!this.f79558B1) {
                this.f79558B1 = true;
                AbstractC11855f abstractC11855f2 = this.f79603d1;
                if (abstractC11855f2 != null) {
                    abstractC11855f2.m114861K();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ON */
    void m87029ON(String str) {
        int i11;
        if (this.f79604d2) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15386d(str));
        try {
            i11 = Integer.parseInt(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = -1;
        }
        if (i11 > -1) {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            ArrayList arrayList = new ArrayList();
            this.f79604d2 = true;
            arrayList.add(Integer.valueOf(i11));
            c0766k.mo1563W5(arrayList);
        }
    }

    /* renamed from: PN */
    void m87030PN(ContactProfile contactProfile, boolean z11) {
        if (this.f79602c2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15385c(contactProfile, z11));
        this.f79602c2 = true;
        c0766k.mo1791z6(contactProfile.f42434r, 30);
    }

    @Override // com.zing.zalo.adapters.C7232u9.c
    /* renamed from: Pm */
    public void mo36934Pm(String str) {
        C31980jc m115161u;
        try {
            if (AbstractC22055v0.m115114D(str, false) && (m115161u = AbstractC22055v0.m115161u(str)) != null) {
                m115161u.m153811A(true);
                AbstractC22055v0.m115123M(m115161u, this, 0, 345, null, new C15388f());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f79619l1 = false;
    }

    /* renamed from: RN */
    void m87031RN(int i11) {
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f79599b1.getLayoutParams();
            if (marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i11);
                this.f79599b1.setLayoutParams(marginLayoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    void m87032SM(Map map, boolean z11) {
        if (this.f79622m2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        try {
            ArrayList arrayList = new ArrayList();
            this.f79620l2.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C31874cb c31874cb = (C31874cb) entry.getValue();
                if (!C21933s.m114404I().m114484p0(str)) {
                    arrayList.add(c31874cb);
                }
                this.f79620l2.add(str);
            }
            if (!arrayList.isEmpty()) {
                this.f79622m2 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15391i(map, z11));
                c0766k.mo1453I7(arrayList, TrackingSource.m40665d(35));
                return;
            }
            C21933s.m114404I().m114459c0(this.f79620l2);
            AbstractC23074g2.m118376b(1, this.f79620l2, "", 4);
            this.f79622m2 = false;
            this.f72421L0.mo78960q3();
            m87045dO();
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f79554n2, e11.toString());
            this.f79622m2 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: SN */
    void m87033SN(boolean z11) {
        Handler handler = this.f79615j1;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i61

                /* renamed from: q */
                public final /* synthetic */ boolean f80658q;

                public /* synthetic */ i61(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloListView.this.m86943BN(r2);
                }
            });
        }
    }

    @Override // zc0.C31784b.e
    /* renamed from: T3 */
    public boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
        int i12;
        AbstractC23647d.m123906p("3200");
        AbstractC23647d.m123893c();
        this.f79613i1 = -1;
        this.f79613i1 = i11 - this.f79601c1.m36916T();
        if (!m86977gN()) {
            if (this.f79613i1 >= C21927m.m114302u().f107786F && this.f79613i1 <= C21927m.m114302u().f107787G && C21927m.m114302u().f107786F >= 0 && C21927m.m114302u().f107787G >= 0) {
                if (!C18631a.m98446i().f93749a) {
                    return false;
                }
            } else if (this.f79613i1 >= C21927m.m114302u().f107783C && this.f79613i1 < C21927m.m114302u().f107782B) {
                return false;
            }
        }
        C17487o0 c17487o0 = null;
        this.f79607f1 = null;
        C7232u9 c7232u9 = this.f79601c1;
        if (c7232u9 != null && (i12 = this.f79613i1) >= 0 && i12 < c7232u9.m36914R()) {
            this.f79607f1 = this.f79601c1.m36917U(this.f79613i1);
        }
        ContactProfile contactProfile = this.f79607f1;
        if (contactProfile == null || TextUtils.isEmpty(contactProfile.f42434r) || this.f79607f1.m40374K0() || this.f79607f1.m40384Q0() || this.f79607f1.f42434r.startsWith("-")) {
            return false;
        }
        C0732w.Companion.m1189a().m1187q("contacts_close_friend_long_press", "", null, null);
        if (this.f79607f1.f42434r.equals(CoreUtility.f89233i)) {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            }
            if (c17487o0 != null) {
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, C32002l4.m154264g(9)).m135743b(), 0, 1));
            }
            return true;
        }
        ContactProfile m36917U = this.f79601c1.m36917U(this.f79613i1);
        if (!AbstractC25495a.m132086k(m36917U.f42434r)) {
            Bundle bundle = new Bundle();
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            }
            if (c17487o0 != null) {
                bundle.putString("profile_uid", m36917U.f42434r);
                bundle.putInt("type_list", C21927m.m114302u().f107791K);
                m86963UN(this.f79609g1);
                c17487o0.m93069k2(MiniUserDetailView.class, bundle, 1, true);
            }
        }
        return true;
    }

    /* renamed from: TM */
    void m87034TM(C31874cb c31874cb, boolean z11) {
        try {
            HashMap hashMap = new HashMap();
            if (c31874cb != null) {
                hashMap.put(c31874cb.f146385a, c31874cb);
                m87032SM(hashMap, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7232u9.c
    /* renamed from: U7 */
    public void mo36935U7(String str, int i11, boolean z11, boolean z12, boolean z13) {
        m87039ZM(str, i11, z11, z12, z13);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 3002);
        C23744a.m124114c().m124115b(this, 6075);
        C23744a.m124114c().m124115b(this, 6073);
        C23744a.m124114c().m124115b(this, 6084);
        C23744a.m124114c().m124115b(this, 6085);
        C23744a.m124114c().m124115b(this, 6087);
        C23744a.m124114c().m124115b(this, 6098);
        C23744a.m124114c().m124115b(this, 6100);
        if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
            ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67740qM(this.f79596Z1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f79619l1 = false;
        C23744a.m124114c().m124117e(this, 3002);
        C23744a.m124114c().m124117e(this, 6075);
        C23744a.m124114c().m124117e(this, 6073);
        C23744a.m124114c().m124117e(this, 6084);
        C23744a.m124114c().m124117e(this, 6085);
        C23744a.m124114c().m124117e(this, 6087);
        C23744a.m124114c().m124117e(this, 6098);
        C23744a.m124114c().m124117e(this, 6100);
        if (this.f79588V1) {
            this.f79588V1 = false;
        } else {
            AbstractC25636f.m132474d();
        }
    }

    /* renamed from: VN */
    public int m87035VN(View view) {
        Integer num = 0;
        try {
            Object tag = view.getTag();
            if (tag != null && (tag instanceof Integer)) {
                num = Integer.valueOf(((Integer) tag).intValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return num.intValue();
    }

    /* renamed from: WM */
    public MainTabView m87036WM() {
        MainTabView mainTabView;
        Exception e11;
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM == null) {
            try {
                if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof MainTabView)) {
                    mainTabView = (MainTabView) this.f72421L0.m92650VI();
                    try {
                        MainTabView.m67662xN(mainTabView);
                        m67645lM = mainTabView;
                    } catch (Exception e12) {
                        e11 = e12;
                        AbstractC20110a.m104539h(e11);
                        return mainTabView;
                    }
                }
            } catch (Exception e13) {
                mainTabView = m67645lM;
                e11 = e13;
            }
        }
        return m67645lM;
    }

    /* renamed from: WN */
    void m87037WN(ContactProfile contactProfile, int i11) {
        if (this.f79598a2) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15383a(contactProfile));
        this.f79598a2 = true;
        c0766k.mo1448Ha(contactProfile.f42434r, i11);
    }

    /* renamed from: YM */
    void m87038YM(String str, boolean z11) {
        try {
            ContactProfile contactProfile = this.f79609g1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                AbstractC23059e9.m118318G(3);
                if (this.f79609g1.f42430p1) {
                    AbstractC23647d.m123906p("30101");
                    AbstractC23647d.m123893c();
                }
                boolean m114321S = C21927m.m114302u().m114321S(this.f79609g1.f42434r);
                Bundle m140776b = new C27870vb(this.f79609g1.mo2478b()).m140780g(this.f79609g1).m140776b();
                Intent intent = new Intent();
                intent.putExtras(m140776b);
                intent.putExtra("SOURCE_ACTION", str);
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, intent.getExtras(), 1, true);
                }
                if (m114321S) {
                    AbstractC23647d.m123897g("5801092");
                }
                if (z11) {
                    AbstractC23647d.m123897g("5801117");
                }
                if (!this.f79609g1.f42430p1 && !m114321S && !z11) {
                    AbstractC23647d.m123897g("5801119");
                }
                C0815e1.m2075D().m2095O(String.valueOf(1), "11", this.f79609g1.f42434r, m86965XM(C21927m.m114302u().m114317O(this.f79611h1), z11, this.f79609g1.f42430p1));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67669FN(C24099q0.m125958k().m125972p());
            MainTabView.m67645lM().m67668CN(C24099q0.m125958k().m125972p());
        }
    }

    /* renamed from: ZM */
    void m87039ZM(String str, int i11, boolean z11, boolean z12, boolean z13) {
        try {
            if (TextUtils.isEmpty(str)) {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                return;
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            this.f79614i2 = m141809c;
            if (m141809c == null) {
                this.f79614i2 = new ContactProfile(str);
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    if (C21927m.m114302u().m114321S(str)) {
                        AbstractC23647d.m123897g("5801094");
                    }
                    if (z11) {
                        AbstractC23647d.m123897g("5801100");
                    }
                    if (z12) {
                        AbstractC23647d.m123897g("5801120");
                    }
                    if (!z11 && !z12) {
                        AbstractC23647d.m123897g("5801111");
                    }
                    m87019IN();
                    AbstractC23647d.m123897g("400306");
                    C0815e1.m2075D().m2095O(String.valueOf(1), "13", str, m86965XM(z13, z12, z11));
                    C0732w.Companion.m1189a().m1187q("contacts_close_friend_video_call_icon", "", null, null);
                    return;
                }
                return;
            }
            if (C21927m.m114302u().m114321S(str)) {
                AbstractC23647d.m123897g("5801093");
            }
            if (z11) {
                AbstractC23647d.m123897g("5801099");
            }
            if (z12) {
                AbstractC23647d.m123897g("5801118");
            }
            if (!z11 && !z12) {
                AbstractC23647d.m123897g("5801110");
            }
            m87017HN();
            AbstractC23647d.m123897g("400305");
            C0815e1.m2075D().m2095O(String.valueOf(1), "12", str, m86965XM(z13, z12, z11));
            C0732w.Companion.m1189a().m1187q("contacts_close_friend_call_icon", "", null, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZN */
    public void m87040ZN() {
        RecyclerView recyclerView = this.f79599b1;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.s51
                public /* synthetic */ s51() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloListView.this.m86945CN();
                }
            });
        }
    }

    /* renamed from: aN */
    void m87041aN(int i11) {
        int i12;
        try {
            if (m87036WM() != null) {
                AbstractC23647d.m123907q("3400", "");
                AbstractC23647d.m123893c();
            }
            this.f79611h1 = i11;
            new ContactProfile();
            C7232u9 c7232u9 = this.f79601c1;
            if (c7232u9 != null && (i12 = this.f79611h1) >= 0 && i12 < c7232u9.m36914R()) {
                ContactProfile m36917U = this.f79601c1.m36917U(this.f79611h1);
                ContactProfile contactProfile = new ContactProfile(m36917U);
                this.f79609g1 = contactProfile;
                contactProfile.f42430p1 = m36917U.f42430p1;
                C17487o0 c17487o0 = null;
                C0732w.Companion.m1189a().m1187q("contacts_close_friend_friend_name", "", null, null);
                boolean z11 = false;
                if (!this.f79609g1.f42434r.equals(CoreUtility.f89233i)) {
                    if (this.f79609g1.f42434r.equals("-1")) {
                        AbstractC23647d.m123906p("3241");
                        m87023KN();
                        AbstractC23647d.m123893c();
                        C0815e1.m2075D().m2095O(String.valueOf(1), "45", "", "");
                        return;
                    }
                    if (this.f79609g1.f42434r.equals("-3")) {
                        AbstractC23647d.m123897g("30105");
                        AbstractC28207v1.m141994i3("action.open.editbio", 4, this.f72421L0.m92676n2(), this.f72421L0, "{\n    \"requestFromContactTab\":true\n}", null);
                        return;
                    }
                    if (!this.f79609g1.f42434r.startsWith("-")) {
                        if (C19172a.m100600k("friend_profile@enable", 0) == 1) {
                            if (AbstractC25495a.m132086k(this.f79609g1.f42434r)) {
                                if (this.f79611h1 >= C21927m.m114302u().f107788H && this.f79611h1 <= C21927m.m114302u().f107789I) {
                                    z11 = true;
                                }
                                m87038YM("3400", z11);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (this.f72421L0.m92676n2() != null) {
                                c17487o0 = this.f72421L0.m92676n2().mo35579p();
                            }
                            if (c17487o0 != null) {
                                bundle.putString("profile_uid", this.f79609g1.f42434r);
                                bundle.putInt("type_list", C21927m.m114302u().f107791K);
                                m86963UN(this.f79609g1);
                                c17487o0.m93069k2(MiniUserDetailView.class, bundle, 1, true);
                                return;
                            }
                            return;
                        }
                        if (this.f79611h1 >= C21927m.m114302u().f107788H && this.f79611h1 <= C21927m.m114302u().f107789I) {
                            z11 = true;
                        }
                        m87038YM("3400", z11);
                        return;
                    }
                    return;
                }
                if (this.f72421L0.m92650VI() != null) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, C32002l4.m154264g(9)).m135743b(), 0, 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bO */
    void m87042bO(int i11, int i12) {
        try {
            if (this.f79590W1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f79590W1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15399q(i12));
            c0766k.mo1545U3(i11, i12, "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cO */
    void m87043cO() {
        try {
            if (this.f79618k2) {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                return;
            }
            if (C23055e5.m118272g(true)) {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f79618k2 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15390h());
                c0766k.mo1545U3(27, 1, "");
                return;
            }
            this.f79618k2 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dN */
    void m87044dN() {
        try {
            if (this.f79557A1 && this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(true);
            }
            Handler handler = this.f79615j1;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.c61
                    public /* synthetic */ c61() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloListView.this.m86993oN();
                    }
                }, 500L);
            }
            if (this.f79563G1) {
                if (this.f79562F1 == null) {
                    this.f79562F1 = new CountDownTimerC15398p(500L, 200L);
                }
                this.f79562F1.start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.k61.<init>(com.zing.zalo.ui.zviews.ZaloListView, java.util.List, java.util.List):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: dO */
    void m87045dO() {
        /*
            r3 = this;
            java.util.List r0 = r30.AbstractC25636f.m132482l()     // Catch: java.lang.Exception -> L1f
            r1 = 0
            java.util.List r1 = r30.AbstractC25636f.m132479i(r1)     // Catch: java.lang.Exception -> L1f
            ks.s r2 = p304ks.C21933s.m114404I()     // Catch: java.lang.Exception -> L1f
            r2.m114411C0()     // Catch: java.lang.Exception -> L1f
            int r2 = r1.size()     // Catch: java.lang.Exception -> L1f
            r3.f79594Y1 = r2     // Catch: java.lang.Exception -> L1f
            com.zing.zalo.ui.zviews.k61 r2 = new com.zing.zalo.ui.zviews.k61     // Catch: java.lang.Exception -> L1f
            r2.<init>()     // Catch: java.lang.Exception -> L1f
            r3.mo70710wy(r2)     // Catch: java.lang.Exception -> L1f
            goto L23
        L1f:
            r0 = move-exception
            r0.printStackTrace()
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.ZaloListView.m87045dO():void");
    }

    /* renamed from: eO */
    void m87046eO() {
        C17487o0 c17487o0;
        try {
            ContactProfile contactProfile = this.f79609g1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                C21927m.m114302u().m114330e0(this.f79609g1.f42434r, new TrackingSource(49));
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                C26365a m135743b = new C26365a.b(this.f79609g1.f42434r, C32002l4.m154264g(9)).m135739F("3250").m135743b();
                if (c17487o0 != null) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), m135743b, 0, 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f79554n2;
    }

    @Override // zc0.C31784b.d
    /* renamed from: i0 */
    public void mo17458i0(RecyclerView recyclerView, int i11, View view) {
        try {
            m87041aN(i11 - this.f79601c1.m36916T());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10010) {
            if (i12 == -1) {
                C21927m.m114302u().m114336h0();
                return;
            }
            return;
        }
        if (i11 == 12000) {
            if (i12 == -1) {
                if (AbstractC23309i.m120933Fb() == 0) {
                    m87042bO(15, 1);
                }
                C21927m.m114302u().m114336h0();
                return;
            }
            return;
        }
        if (i11 == 4323) {
            if (i12 == -1 || intent != null) {
                boolean m114317O = C21927m.m114302u().m114317O(this.f79613i1);
                boolean m114316N = C21927m.m114302u().m114316N(this.f79613i1);
                int intExtra = intent.getIntExtra("PARAM_ITEM_CLICK", 0);
                if (intExtra != 1) {
                    if (intExtra != 2) {
                        if (intExtra != 3) {
                            if (intExtra == 4) {
                                showDialog(7);
                                AbstractC23647d.m123898h("3230", "");
                                AbstractC23647d.m123897g("300018100");
                                C0815e1 m2075D = C0815e1.m2075D();
                                String valueOf = String.valueOf(1);
                                ContactProfile contactProfile = this.f79607f1;
                                m2075D.m2095O(valueOf, "14", contactProfile.f42434r, m86965XM(m114317O, m114316N, contactProfile.f42430p1));
                                return;
                            }
                            return;
                        }
                        this.f79609g1 = this.f79607f1;
                        Bundle bundle = new Bundle();
                        bundle.putString("EXTRA_CONTACT_PROFILE", this.f79607f1.m40373K());
                        bundle.putInt("EXTRA_ENTRY_SCREEN", BottomSheetBlockView.EnumC11169b.f56203r.m58496c());
                        m92676n2().mo35573l4(BottomSheetBlockView.class, bundle, 1, true);
                        AbstractC23647d.m123897g("3220");
                        C0815e1 m2075D2 = C0815e1.m2075D();
                        String valueOf2 = String.valueOf(1);
                        ContactProfile contactProfile2 = this.f79607f1;
                        m2075D2.m2095O(valueOf2, "20", contactProfile2.f42434r, m86965XM(m114317O, m114316N, contactProfile2.f42430p1));
                        return;
                    }
                    this.f79609g1 = this.f79607f1;
                    m87022KM();
                    AbstractC23647d.m123897g("5901196");
                    return;
                }
                this.f79609g1 = this.f79607f1;
                m87046eO();
                AbstractC23647d.m123897g("3250");
                AbstractC23647d.m123897g("5901193");
                C0815e1 m2075D3 = C0815e1.m2075D();
                String valueOf3 = String.valueOf(1);
                ContactProfile contactProfile3 = this.f79609g1;
                m2075D3.m2095O(valueOf3, "17", contactProfile3.f42434r, m86965XM(m114317O, m114316N, contactProfile3.f42430p1));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C17487o0 c17487o0;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_update_phonebook) {
            AbstractC23647d.m123897g("5801112");
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(PhoneBookView.class, null, 1, true);
            }
            C0815e1.m2075D().m2095O(String.valueOf(1), "44", "", "");
            return;
        }
        int i11 = 0;
        if (id2 == AbstractC6918a0.ic_close_view) {
            int m87035VN = m87035VN(view);
            if (m87035VN == 1) {
                LinearLayout linearLayout = this.f79628s1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                AbstractC23309i.m121324Pw(0);
                return;
            }
            if (m87035VN == 2) {
                LinearLayout linearLayout2 = this.f79628s1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                AbstractC23309i.m121950gn(1);
                m87026NM(this.f79608f2, 0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layout_find_more_friends) {
            if (m87035VN(view) == 1 && this.f72421L0.m92648SI() != null) {
                LinearLayout linearLayout3 = this.f79628s1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                AbstractC23309i.m121324Pw(0);
                if (this.f79599b1 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.f79601c1.m36914R()) {
                            break;
                        }
                        if (this.f79601c1.m36917U(i12).f42434r.equals("-2")) {
                            i11 = i12;
                            break;
                        }
                        i12++;
                    }
                    if (i11 > 0 && i11 < this.f79601c1.m36914R()) {
                        this.f79599b1.m9837K1(i11 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_close_banner) {
            m87024LN(false);
            this.f79563G1 = false;
            AbstractC23309i.m121771bx(false);
            AbstractC23647d.m123906p("38302");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.btn_link_now) {
            Context m92648SI = this.f72421L0.m92648SI();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                AbstractC23034c6.m118184v0(this, strArr, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            } else if (!AbstractC23057e7.m118297d()) {
                showDialog(20);
            }
            AbstractC23647d.m123906p("38301");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.bottom_banner) {
            Context m92648SI2 = this.f72421L0.m92648SI();
            String[] strArr2 = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI2, strArr2) != 0) {
                AbstractC23034c6.m118184v0(this, strArr2, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            } else if (!AbstractC23057e7.m118297d()) {
                showDialog(20);
            }
            AbstractC23647d.m123906p("38300");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.btn_cancel_permission_contact) {
            AbstractC0924m0.m3991lf(true);
            this.f79567K1.setVisibility(8);
        } else if (id2 == AbstractC6918a0.btn_accept_permission_contact) {
            Context m92648SI3 = this.f72421L0.m92648SI();
            String[] strArr3 = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI3, strArr3) != 0) {
                AbstractC23034c6.m118184v0(this, strArr3, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
            } else if (!AbstractC23057e7.m118297d()) {
                showDialog(20);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 == 117) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118165m(this.f72421L0.m92648SI(), "android.permission.RECORD_AUDIO") == 0) {
                if (this.f79614i2 != null) {
                    C2279a m120722w0 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile = this.f79614i2;
                    m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f79614i2.f42446v, false, 15));
                }
            } else {
                AbstractC23034c6.m118162k0(this, 117);
            }
        } else if (i11 == 113) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112033j) == 0) {
                if (this.f79614i2 != null) {
                    C2279a m120722w02 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile2 = this.f79614i2;
                    m120722w02.m101508a(new C2279a.a(contactProfile2.f42434r, contactProfile2.m40383Q(true, false), this.f79614i2.f42446v, true, 16));
                }
            } else {
                AbstractC23034c6.m118166m0(this, 113);
            }
        } else {
            if (i11 == 122) {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                    m86964VM();
                }
            }
            super.onRequestPermissionsResult(i11, strArr, iArr);
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:            if (r1 != false) goto L67;     */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        boolean z11;
        super.onResume();
        this.f79619l1 = true;
        try {
            if (C21927m.m114302u().m114315M()) {
                m87021JN();
            } else {
                m87027NN();
            }
            m86956MM();
            if (m86975fN()) {
                m86957PM();
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (AbstractC23309i.m121853e3() == 1) {
                    if (m86973eN()) {
                        boolean m121340Qb = AbstractC23309i.m121340Qb();
                        if (m121340Qb && (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) != 0 || !AbstractC23057e7.m118297d())) {
                            this.f79563G1 = true;
                            FrameLayout frameLayout = this.f79559C1;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                                this.f79559C1.setTranslationY(0.0f);
                            }
                        } else {
                            this.f79563G1 = false;
                            FrameLayout frameLayout2 = this.f79559C1;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                            }
                            if (m121340Qb) {
                                AbstractC23309i.m121771bx(false);
                            }
                        }
                    }
                }
                this.f79563G1 = false;
                FrameLayout frameLayout3 = this.f79559C1;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(8);
                }
            }
            if (m87036WM() != null) {
                MainTabView.m67645lM().m67678NN();
            }
            m86958QM();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f79554n2, e11);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action;
        try {
            action = motionEvent.getAction();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (action != 0 && action != 1) {
            if (action != 2) {
                if (action != 3) {
                }
            } else {
                C7232u9 c7232u9 = this.f79601c1;
                if (c7232u9 != null && !c7232u9.m36918W()) {
                    float y11 = motionEvent.getY();
                    if (this.f79623n1 == 0.0f) {
                        this.f79623n1 = y11;
                    }
                    if (this.f79621m1 == 0.0f) {
                        this.f79621m1 = y11;
                    }
                    if (!this.f79624o1 && !this.f79625p1) {
                        float f11 = this.f79623n1;
                        if (y11 > f11) {
                            this.f79625p1 = false;
                            this.f79624o1 = true;
                        } else if (y11 < f11) {
                            this.f79625p1 = true;
                            this.f79624o1 = false;
                        }
                    }
                    float f12 = this.f79623n1;
                    if (y11 > f12) {
                        if (this.f79625p1 && !this.f79624o1) {
                            this.f79621m1 = y11;
                            this.f79625p1 = false;
                            this.f79624o1 = true;
                        }
                    } else if (y11 < f12 && this.f79624o1 && !this.f79625p1) {
                        this.f79621m1 = y11;
                        this.f79625p1 = true;
                        this.f79624o1 = false;
                    }
                    double d11 = y11 - this.f79621m1;
                    if (d11 > 3.0d) {
                        if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                            ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(true);
                        }
                        if (this.f79563G1) {
                            m87024LN(true);
                        }
                        this.f79621m1 = y11;
                        this.f79625p1 = false;
                        this.f79624o1 = false;
                    } else if (d11 < -3.0d) {
                        if (!this.f79557A1 && this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView) && ((ContactGroupMyPagesView) this.f72421L0.m92650VI()).m67741rM(false)) {
                            C7192r2 c7192r2 = this.f79565I1;
                            if (c7192r2 != null) {
                                c7192r2.f39416c = 0;
                            }
                            this.f79599b1.m9853S0();
                        }
                        if (this.f79563G1) {
                            m87024LN(false);
                        }
                        this.f79621m1 = y11;
                        this.f79625p1 = false;
                        this.f79624o1 = false;
                    }
                    this.f79623n1 = y11;
                }
            }
            return false;
        }
        this.f79621m1 = 0.0f;
        this.f79623n1 = 0.0f;
        this.f79624o1 = false;
        this.f79625p1 = false;
        return false;
    }

    /* renamed from: pv */
    void m87047pv(boolean z11, int i11) {
        TextView textView = this.f79595Z0;
        if (textView != null && i11 != -1) {
            textView.setText(i11);
        }
        if (z11) {
            this.f79599b1.setVisibility(8);
            TextView textView2 = this.f79595Z0;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f79575P0.setVisibility(0);
            this.f79597a1.setVisibility(0);
            return;
        }
        C7232u9 c7232u9 = this.f79601c1;
        if (c7232u9 != null && c7232u9.m36914R() > 0) {
            this.f79575P0.setVisibility(8);
            m87033SN(true);
            this.f79599b1.setVisibility(0);
        } else {
            this.f79597a1.setVisibility(8);
            TextView textView3 = this.f79595Z0;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            this.f79599b1.setVisibility(0);
            this.f79575P0.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 3002) {
                if (i11 != 6073) {
                    if (i11 != 6075) {
                        if (i11 != 6087) {
                            if (i11 != 6098) {
                                if (i11 != 6100) {
                                    if (i11 != 6084) {
                                        if (i11 == 6085) {
                                            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x51
                                                public /* synthetic */ x51() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ZaloListView.this.m86979hN();
                                                }
                                            });
                                        }
                                    } else {
                                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w51
                                            public /* synthetic */ w51() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ZaloListView.this.m87027NN();
                                            }
                                        });
                                    }
                                } else {
                                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.a61
                                        public /* synthetic */ a61() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ZaloListView.this.m86958QM();
                                        }
                                    });
                                }
                            } else {
                                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.z51
                                    public /* synthetic */ z51() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ZaloListView.this.m86968aO();
                                    }
                                });
                            }
                        } else {
                            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.y51
                                public /* synthetic */ y51() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloListView.this.m86981iN();
                                }
                            });
                        }
                    } else {
                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.u51
                            public /* synthetic */ u51() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloListView.this.m86967YN();
                            }
                        });
                    }
                } else {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v51
                        public /* synthetic */ v51() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloListView.this.m87021JN();
                        }
                    });
                }
            } else {
                m87040ZN();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        int i12;
        super.mo37135xJ(bundle);
        AbstractC25636f.f122589d = true;
        this.f79569M0.setOnClickListener(this);
        this.f79569M0.setVisibility(0);
        C7232u9 c7232u9 = new C7232u9(this.f72421L0, this.f79617k1);
        this.f79601c1 = c7232u9;
        c7232u9.m36911O(this.f79627r1);
        this.f79601c1.m36911O(this.f79626q1);
        if (!m86977gN()) {
            this.f79601c1.m36910N(this.f79571N0);
        }
        this.f79601c1.m36922a0(this);
        this.f79601c1.m36923b0(new C7232u9.a() { // from class: com.zing.zalo.ui.zviews.q51
            public /* synthetic */ q51() {
            }

            @Override // com.zing.zalo.adapters.C7232u9.a
            /* renamed from: a */
            public final boolean mo36928a() {
                boolean m86997qN;
                m86997qN = ZaloListView.this.m86997qN();
                return m86997qN;
            }
        });
        this.f79601c1.m36926e0(new C15394l());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.getContext());
        this.f79605e1 = linearLayoutManager;
        this.f79599b1.setLayoutManager(linearLayoutManager);
        this.f79599b1.setItemAnimator(null);
        this.f79599b1.setAdapter(this.f79601c1);
        if (m86977gN()) {
            C7192r2 c7192r2 = new C7192r2(this.f79599b1, this.f79601c1);
            this.f79565I1 = c7192r2;
            c7192r2.f39416c = AbstractC23136l9.m118742r(44.0f);
            this.f79565I1.f39417d = AbstractC23136l9.m118742r(4.0f);
            this.f79599b1.m9816A(this.f79565I1);
        }
        Context context = getContext();
        if (m86977gN()) {
            i11 = AbstractC16803z.scroll_bar_tab_contact;
        } else {
            i11 = AbstractC16803z.thumb_drawable;
        }
        StateListDrawable stateListDrawable = (StateListDrawable) AbstractC23136l9.m118665N(context, i11);
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        Context context2 = getContext();
        if (m86977gN()) {
            i12 = AbstractC16803z.scroll_bar_tab_contact;
        } else {
            i12 = AbstractC16803z.thumb_drawable;
        }
        this.f79603d1 = new C15395m(this.f79599b1, this.f79601c1, this.f79566J1, stateListDrawable, m118665N, (StateListDrawable) AbstractC23136l9.m118665N(context2, i12), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent));
        if (m86977gN()) {
            this.f79603d1.m114859H(AbstractC23136l9.m118742r(52.0f), AbstractC23136l9.m118742r(8.0f));
        }
        C31784b.m152808a(this.f79599b1).m152809b(this);
        C31784b.m152808a(this.f79599b1).m152810c(this);
        this.f79599b1.m9826E(new C15396n());
        this.f79599b1.setOnTouchListener(this);
        m87047pv(true, AbstractC8020f0.empty_list);
        C21927m.m114302u().m114336h0();
    }

    @Override // com.zing.zalo.adapters.C7232u9.c
    /* renamed from: y8 */
    public void mo36936y8() {
        if (AbstractC23309i.m120933Fb() == 1) {
            this.f72421L0.showDialog(17);
        } else {
            m87042bO(15, 1);
        }
    }
}
