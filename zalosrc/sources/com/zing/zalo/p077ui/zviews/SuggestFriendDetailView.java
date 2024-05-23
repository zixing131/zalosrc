package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7045d9;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SuggestFriendDetailView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p604wb.C28905e;
import p716zh.C31859bb;
import p716zh.C31874cb;
import p716zh.C31965ic;
import p716zh.C32002l4;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class SuggestFriendDetailView extends SlidableZaloView implements C7045d9.c, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x, C23744a.c {

    /* renamed from: R1 */
    public static final String f78087R1 = "SuggestFriendDetailView";

    /* renamed from: A1 */
    boolean f78088A1;

    /* renamed from: B1 */
    String f78089B1;

    /* renamed from: C1 */
    C31874cb f78090C1;

    /* renamed from: D1 */
    boolean f78091D1;

    /* renamed from: E1 */
    InterfaceC20094a f78092E1;

    /* renamed from: F1 */
    boolean f78093F1;

    /* renamed from: G1 */
    InterfaceC0765j f78094G1;

    /* renamed from: H1 */
    InterfaceC20094a f78095H1;

    /* renamed from: I1 */
    boolean f78096I1;

    /* renamed from: J1 */
    InterfaceC20094a f78097J1;

    /* renamed from: K1 */
    ImageView f78098K1;

    /* renamed from: L1 */
    TextView f78099L1;

    /* renamed from: M1 */
    boolean f78100M1;

    /* renamed from: N1 */
    InterfaceC0765j f78101N1;

    /* renamed from: O1 */
    InterfaceC20094a f78102O1;

    /* renamed from: P0 */
    View f78103P0;

    /* renamed from: P1 */
    ArrayList f78104P1;

    /* renamed from: Q0 */
    LinearLayout f78105Q0;

    /* renamed from: Q1 */
    boolean f78106Q1;

    /* renamed from: R0 */
    CircleImage f78107R0;

    /* renamed from: S0 */
    CircleImage f78108S0;

    /* renamed from: T0 */
    TextView f78109T0;

    /* renamed from: U0 */
    TextView f78110U0;

    /* renamed from: V0 */
    View f78111V0;

    /* renamed from: W0 */
    Button f78112W0;

    /* renamed from: X0 */
    ContactProfile f78113X0;

    /* renamed from: Y0 */
    RecyclerView f78114Y0;

    /* renamed from: Z0 */
    C7045d9 f78115Z0;

    /* renamed from: a1 */
    MultiStateView f78116a1;

    /* renamed from: b1 */
    LinearLayoutManager f78117b1;

    /* renamed from: c1 */
    C23528a f78118c1;

    /* renamed from: e1 */
    C31874cb f78120e1;

    /* renamed from: f1 */
    Handler f78121f1;

    /* renamed from: g1 */
    LinearLayout f78122g1;

    /* renamed from: h1 */
    LinearLayout f78123h1;

    /* renamed from: i1 */
    LinearLayout f78124i1;

    /* renamed from: j1 */
    LinearLayout f78125j1;

    /* renamed from: k1 */
    View f78126k1;

    /* renamed from: l1 */
    LinearLayout f78127l1;

    /* renamed from: m1 */
    RobotoTextView f78128m1;

    /* renamed from: n1 */
    CheckBox f78129n1;

    /* renamed from: t1 */
    final String f78135t1;

    /* renamed from: u1 */
    String f78136u1;

    /* renamed from: v1 */
    boolean f78137v1;

    /* renamed from: w1 */
    Button f78138w1;

    /* renamed from: x1 */
    ActionBarMenuItem f78139x1;

    /* renamed from: y1 */
    View f78140y1;

    /* renamed from: z1 */
    boolean f78141z1;

    /* renamed from: d1 */
    ArrayList f78119d1 = new ArrayList();

    /* renamed from: o1 */
    int f78130o1 = 2;

    /* renamed from: p1 */
    int f78131p1 = 0;

    /* renamed from: q1 */
    int f78132q1 = 0;

    /* renamed from: r1 */
    String f78133r1 = "";

    /* renamed from: s1 */
    int f78134s1 = 0;

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$a */
    /* loaded from: classes6.dex */
    public class C15140a extends RecyclerView.AbstractC1892s {
        C15140a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    SuggestFriendDetailView.this.f78115Z0.m35984b0(false);
                    SuggestFriendDetailView.this.f78115Z0.m10008p();
                } else {
                    SuggestFriendDetailView.this.f78115Z0.m35984b0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C7045d9 c7045d9;
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (SuggestFriendDetailView.this.f78117b1.m9740Y1() + SuggestFriendDetailView.this.f78117b1.m10110a() >= SuggestFriendDetailView.this.f78117b1.m10127i() - 1) {
                    SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                    if (suggestFriendDetailView.f78088A1 && !suggestFriendDetailView.f78141z1 && (c7045d9 = suggestFriendDetailView.f78115Z0) != null && !c7045d9.f38494B) {
                        suggestFriendDetailView.m84911yM(true);
                    }
                }
                SuggestFriendDetailView.this.m84904rM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$b */
    /* loaded from: classes6.dex */
    public class C15141b implements C21933s.x {
        C15141b() {
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            SuggestFriendDetailView.this.m84908vM();
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            SuggestFriendDetailView.this.m84908vM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$c */
    /* loaded from: classes6.dex */
    public class C15142c implements C21933s.x {
        C15142c() {
        }

        /* renamed from: e */
        public /* synthetic */ void m84915e(C20096c c20096c) {
            try {
                SuggestFriendDetailView.this.m84902pv(false, c20096c.m104491c());
                SuggestFriendDetailView.this.m84897XM(false, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m84916f() {
            try {
                SuggestFriendDetailView.this.m84897XM(false, false);
                SuggestFriendDetailView.this.m84892SM();
                SuggestFriendDetailView.this.m84902pv(false, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
            suggestFriendDetailView.f78141z1 = false;
            suggestFriendDetailView.f78088A1 = z11;
            suggestFriendDetailView.f78132q1 = i11;
            suggestFriendDetailView.f78121f1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.sp0
                public /* synthetic */ sp0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SuggestFriendDetailView.C15142c.this.m84916f();
                }
            });
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
            suggestFriendDetailView.f78141z1 = false;
            suggestFriendDetailView.f78121f1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.rp0

                /* renamed from: q */
                public final /* synthetic */ C20096c f81840q;

                public /* synthetic */ rp0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SuggestFriendDetailView.C15142c.this.m84915e(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$d */
    /* loaded from: classes6.dex */
    public class C15143d implements InterfaceC20094a {
        C15143d() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84918d() {
            Bundle bundle = new Bundle();
            bundle.putString("uid", SuggestFriendDetailView.this.f78090C1.f146385a);
            bundle.putString("dpn", SuggestFriendDetailView.this.f78090C1.f146387c);
            bundle.putString("phone", SuggestFriendDetailView.this.f78090C1.f146394j);
            bundle.putString("avatar", SuggestFriendDetailView.this.f78090C1.f146393i);
            if (SuggestFriendDetailView.this.m92676n2() != null) {
                SuggestFriendDetailView.this.m92676n2().mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
            }
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
                SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                suggestFriendDetailView.f78091D1 = z11;
                suggestFriendDetailView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SuggestFriendDetailView suggestFriendDetailView;
            int i11;
            int i12;
            int i13;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    boolean z11 = true;
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
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(SuggestFriendDetailView.this.f78089B1)) {
                                        if (SuggestFriendDetailView.this.m84864HM()) {
                                            SuggestFriendDetailView suggestFriendDetailView2 = SuggestFriendDetailView.this;
                                            C21927m.m114302u().m114330e0(SuggestFriendDetailView.this.f78090C1.f146385a, suggestFriendDetailView2.m84886DM(suggestFriendDetailView2.f78090C1.f146389e));
                                            SuggestFriendDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tp0
                                                public /* synthetic */ tp0() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    SuggestFriendDetailView.C15143d.this.m84918d();
                                                }
                                            });
                                        } else {
                                            SuggestFriendDetailView suggestFriendDetailView3 = SuggestFriendDetailView.this;
                                            suggestFriendDetailView3.m84893TM(suggestFriendDetailView3.f78090C1);
                                            z11 = false;
                                        }
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(SuggestFriendDetailView.this.f78089B1);
                                        C21933s.m114404I().m114421H0(SuggestFriendDetailView.this.f78089B1);
                                        AbstractC23074g2.m118375a(0, SuggestFriendDetailView.this.f78089B1, "", 4);
                                        SuggestFriendDetailView suggestFriendDetailView4 = SuggestFriendDetailView.this;
                                        suggestFriendDetailView4.m84903qM(suggestFriendDetailView4.f78089B1);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(SuggestFriendDetailView.this.f78089B1);
                                    C21933s.m114404I().m114421H0(SuggestFriendDetailView.this.f78089B1);
                                    AbstractC23074g2.m118375a(0, SuggestFriendDetailView.this.f78089B1, "", 4);
                                    SuggestFriendDetailView suggestFriendDetailView5 = SuggestFriendDetailView.this;
                                    suggestFriendDetailView5.m84903qM(suggestFriendDetailView5.f78089B1);
                                    if (!AbstractC21935u.m114558y(SuggestFriendDetailView.this.f78089B1)) {
                                        SuggestFriendDetailView suggestFriendDetailView6 = SuggestFriendDetailView.this;
                                        suggestFriendDetailView6.m84901bN(suggestFriendDetailView6.f78089B1);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(SuggestFriendDetailView.this.f78089B1);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(SuggestFriendDetailView.this.f78089B1, optInt2);
                                AbstractC2364o0.m12373p(SuggestFriendDetailView.this, 3);
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(SuggestFriendDetailView.this.f78089B1));
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(SuggestFriendDetailView.this.f78089B1);
                                C21933s.m114404I().m114421H0(SuggestFriendDetailView.this.f78089B1);
                                AbstractC23074g2.m118375a(0, SuggestFriendDetailView.this.f78089B1, "", 4);
                                SuggestFriendDetailView suggestFriendDetailView7 = SuggestFriendDetailView.this;
                                suggestFriendDetailView7.m84903qM(suggestFriendDetailView7.f78089B1);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(SuggestFriendDetailView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            SuggestFriendDetailView.this.f78133r1 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(SuggestFriendDetailView.this, 100);
                        }
                    }
                    suggestFriendDetailView = SuggestFriendDetailView.this;
                    suggestFriendDetailView.f78091D1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    suggestFriendDetailView = SuggestFriendDetailView.this;
                    suggestFriendDetailView.f78091D1 = false;
                }
                suggestFriendDetailView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendDetailView suggestFriendDetailView8 = SuggestFriendDetailView.this;
                suggestFriendDetailView8.f78091D1 = false;
                suggestFriendDetailView8.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$e */
    /* loaded from: classes6.dex */
    class C15144e implements InterfaceC20094a {
        C15144e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                suggestFriendDetailView.f78093F1 = false;
                suggestFriendDetailView.f72421L0.mo78960q3();
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
                            AbstractC23059e9.m118317F(SuggestFriendDetailView.this.f78089B1);
                            C21933s.m114404I().m114421H0(SuggestFriendDetailView.this.f78089B1);
                            AbstractC23074g2.m118375a(0, SuggestFriendDetailView.this.f78089B1, "", 4);
                            SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                            suggestFriendDetailView.m84903qM(suggestFriendDetailView.f78089B1);
                            AbstractC23063f2.m118349a(SuggestFriendDetailView.this.f78090C1.m153177a());
                        } else {
                            AbstractC23063f2.m118357i(i11, SuggestFriendDetailView.this.f78089B1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(SuggestFriendDetailView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            SuggestFriendDetailView.this.f78133r1 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(SuggestFriendDetailView.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SuggestFriendDetailView suggestFriendDetailView2 = SuggestFriendDetailView.this;
                suggestFriendDetailView2.f78093F1 = false;
                suggestFriendDetailView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendDetailView suggestFriendDetailView3 = SuggestFriendDetailView.this;
                suggestFriendDetailView3.f78093F1 = false;
                suggestFriendDetailView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$f */
    /* loaded from: classes6.dex */
    public class C15145f implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$f$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78148a;

            a(ContactProfile contactProfile) {
                this.f78148a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f78148a);
            }
        }

        C15145f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SuggestFriendDetailView suggestFriendDetailView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    suggestFriendDetailView = SuggestFriendDetailView.this;
                    suggestFriendDetailView.f78096I1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SuggestFriendDetailView.this.f78096I1 = false;
                    suggestFriendDetailView = SuggestFriendDetailView.this;
                }
                suggestFriendDetailView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendDetailView suggestFriendDetailView2 = SuggestFriendDetailView.this;
                suggestFriendDetailView2.f78096I1 = false;
                suggestFriendDetailView2.f72421L0.mo78960q3();
                throw th2;
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
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && Integer.parseInt(jSONObject.getString("error_code")) == 0) {
                        AbstractC23059e9.m118317F(SuggestFriendDetailView.this.f78089B1);
                        C21927m.m114302u().m114337i(SuggestFriendDetailView.this.f78089B1);
                        AbstractC23063f2.m118365q(SuggestFriendDetailView.this.f78089B1);
                        C21933s.m114404I().m114421H0(SuggestFriendDetailView.this.f78089B1);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                        SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                        suggestFriendDetailView.m84903qM(suggestFriendDetailView.f78089B1);
                        if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            str = "";
                            str2 = str;
                            i11 = 0;
                        } else {
                            i11 = optJSONObject.optInt("action", 0);
                            str2 = optJSONObject.optString("alias");
                            str = optJSONObject.optString("desc");
                        }
                        if (!SuggestFriendDetailView.this.f78119d1.isEmpty()) {
                            for (int i12 = 0; i12 < SuggestFriendDetailView.this.f78119d1.size(); i12++) {
                                if (((C31859bb) SuggestFriendDetailView.this.f78119d1.get(i12)).m153145a() == null) {
                                    str3 = "";
                                } else {
                                    str3 = ((C31859bb) SuggestFriendDetailView.this.f78119d1.get(i12)).m153145a().f146385a;
                                }
                                if (!TextUtils.isEmpty(SuggestFriendDetailView.this.f78089B1) && SuggestFriendDetailView.this.f78089B1.equals(str3) && (m153177a = ((C31859bb) SuggestFriendDetailView.this.f78119d1.get(i12)).m153145a().m153177a()) != null) {
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
                                    if (map.containsKey(SuggestFriendDetailView.this.f78089B1) && map.get(SuggestFriendDetailView.this.f78089B1) != null) {
                                        m153177a.f42438s0 = ((C31965ic) map.get(SuggestFriendDetailView.this.f78089B1)).m153681a();
                                    }
                                    if (C21927m.m114302u().m114357s() != null) {
                                        if (!C21927m.m114302u().m114357s().m153137g(SuggestFriendDetailView.this.f78089B1)) {
                                            C21927m.m114302u().m114357s().add(m153177a);
                                            C0824j.m2153b(new a(m153177a));
                                        } else if (C21927m.m114302u().m114357s().m153138j(SuggestFriendDetailView.this.f78089B1) != null) {
                                            ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(SuggestFriendDetailView.this.f78089B1);
                                            m153138j.f42456y0 = i11;
                                            if (!TextUtils.isEmpty(str2)) {
                                                m153138j.f42442t1 = str2;
                                            }
                                            if (!TextUtils.isEmpty(str)) {
                                                m153138j.f42436r1 = new SpannableStringBuilder(str);
                                            }
                                        }
                                    }
                                    AbstractC23074g2.m118375a(0, SuggestFriendDetailView.this.f78089B1, "", 4);
                                    if (!TextUtils.isEmpty(m153177a.f42434r)) {
                                        AbstractC23181q.m119431d(m153177a.f42434r, true);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SuggestFriendDetailView suggestFriendDetailView2 = SuggestFriendDetailView.this;
                suggestFriendDetailView2.f78096I1 = false;
                suggestFriendDetailView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendDetailView suggestFriendDetailView3 = SuggestFriendDetailView.this;
                suggestFriendDetailView3.f78096I1 = false;
                suggestFriendDetailView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$g */
    /* loaded from: classes6.dex */
    public class C15146g implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$g$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78151a;

            a(ContactProfile contactProfile) {
                this.f78151a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f78151a.f42434r);
            }
        }

        C15146g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(SuggestFriendDetailView.f78087R1, e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendDetailView$h */
    /* loaded from: classes6.dex */
    public class C15147h implements InterfaceC20094a {
        C15147h() {
        }

        /* renamed from: e */
        public /* synthetic */ void m84921e() {
            try {
                SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                C7045d9 c7045d9 = suggestFriendDetailView.f78115Z0;
                if (c7045d9 != null && !suggestFriendDetailView.f78106Q1) {
                    c7045d9.m35972P().clear();
                }
                C21933s.m114404I().m114415E0();
                SuggestFriendDetailView.this.m84892SM();
                SuggestFriendDetailView.this.m84902pv(false, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m84922f() {
            SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
            C7045d9 c7045d9 = suggestFriendDetailView.f78115Z0;
            if (c7045d9 != null && !suggestFriendDetailView.f78106Q1) {
                c7045d9.m35980X();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (SuggestFriendDetailView.this.f72421L0.m92676n2() != null) {
                        SuggestFriendDetailView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.up0
                            public /* synthetic */ up0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SuggestFriendDetailView.C15147h.this.m84922f();
                            }
                        });
                    }
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SuggestFriendDetailView.f78087R1, e11.toString());
                }
                SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                suggestFriendDetailView.f78100M1 = false;
                suggestFriendDetailView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendDetailView suggestFriendDetailView2 = SuggestFriendDetailView.this;
                suggestFriendDetailView2.f78100M1 = false;
                suggestFriendDetailView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C21933s.m114404I().m114459c0(SuggestFriendDetailView.this.f78104P1);
                    AbstractC23063f2.m118362n(SuggestFriendDetailView.this.f78104P1);
                    AbstractC23074g2.m118376b(1, SuggestFriendDetailView.this.f78104P1, "", 4);
                    if (SuggestFriendDetailView.this.f72421L0.m92676n2() != null) {
                        SuggestFriendDetailView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.vp0
                            public /* synthetic */ vp0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SuggestFriendDetailView.C15147h.this.m84921e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SuggestFriendDetailView.f78087R1, e11.toString());
                }
            } finally {
                SuggestFriendDetailView suggestFriendDetailView = SuggestFriendDetailView.this;
                suggestFriendDetailView.f78100M1 = false;
                suggestFriendDetailView.f72421L0.mo78960q3();
            }
        }
    }

    public SuggestFriendDetailView() {
        String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_writeInvitation);
        this.f78135t1 = string;
        this.f78136u1 = string;
        this.f78137v1 = false;
        this.f78141z1 = false;
        this.f78088A1 = false;
        this.f78091D1 = false;
        this.f78092E1 = new C15143d();
        this.f78093F1 = false;
        this.f78094G1 = new C0766k();
        this.f78095H1 = new C15144e();
        this.f78096I1 = false;
        this.f78097J1 = new C15145f();
        this.f78098K1 = null;
        this.f78100M1 = false;
        this.f78101N1 = new C0766k();
        this.f78102O1 = new C15147h();
        this.f78104P1 = new ArrayList();
        this.f78106Q1 = false;
    }

    /* renamed from: BM */
    private int m84863BM() {
        C31874cb m153145a;
        try {
            ArrayList arrayList = this.f78119d1;
            if (arrayList != null && !arrayList.isEmpty() && (m153145a = ((C31859bb) this.f78119d1.get(0)).m153145a()) != null) {
                if (m153145a.f146399o == 2) {
                    return 34;
                }
                return 1;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 1;
        }
    }

    /* renamed from: HM */
    public boolean m84864HM() {
        int i11 = this.f78134s1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return AbstractC21935u.m114553t(0);
                    }
                    return AbstractC21935u.m114553t(6);
                }
                return AbstractC21935u.m114553t(2);
            }
            return AbstractC21935u.m114553t(1);
        }
        return AbstractC21935u.m114553t(5);
    }

    /* renamed from: IM */
    public /* synthetic */ void m84865IM() {
        try {
            C7045d9 c7045d9 = this.f78115Z0;
            if (c7045d9 != null && c7045d9.m35972P() != null && !this.f78106Q1) {
                this.f78115Z0.m35972P().clear();
            }
            m84892SM();
            m84902pv(false, 0);
            C21933s.m114404I().m114415E0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JM */
    public /* synthetic */ void m84866JM() {
        m84911yM(false);
    }

    /* renamed from: KM */
    public static /* synthetic */ void m84867KM(String str) {
        C21933s.m114404I().m114457b0(str, true);
    }

    /* renamed from: LM */
    public /* synthetic */ void m84868LM() {
        int i11;
        try {
            if (this.f78132q1 == 0 && ((i11 = this.f78134s1) == 2 || i11 == 1)) {
                m84902pv(true, 0);
                m84911yM(true);
            } else {
                C21933s.m114404I().m114497w(this.f78134s1, this.f78131p1);
                m84892SM();
                m84902pv(false, 0);
                this.f78088A1 = C21933s.m114404I().m114465f0(this.f78134s1, this.f78131p1);
                this.f78132q1 = C21933s.m114404I().m114437Q(this.f78134s1, this.f78131p1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    public /* synthetic */ void m84869MM() {
        try {
            if (C23055e5.m118271f()) {
                m84902pv(true, 0);
                m84911yM(false);
            } else {
                this.f78116a1.setVisibility(0);
                this.f78116a1.setState(MultiStateView.EnumC15914e.ERROR);
                this.f78116a1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                this.f78116a1.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NM */
    public /* synthetic */ void m84870NM() {
        m84892SM();
        m84902pv(false, 0);
    }

    /* renamed from: OM */
    public /* synthetic */ Void m84871OM() {
        C21933s.m114404I().m114421H0(this.f78089B1);
        m84903qM(this.f78089B1);
        return null;
    }

    /* renamed from: PM */
    public /* synthetic */ void m84872PM() {
        m84911yM(false);
    }

    /* renamed from: QM */
    public /* synthetic */ Void m84873QM() {
        C21933s.m114404I().m114421H0(this.f78089B1);
        m84903qM(this.f78089B1);
        return null;
    }

    /* renamed from: AM */
    public int m84884AM() {
        int i11 = this.f78134s1;
        if (i11 == 0) {
            return 2;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 3;
            if (i11 != 2) {
                if (i11 != 3) {
                    return -1;
                }
                return this.f78137v1 ? 15 : 12;
            }
        }
        return i12;
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: B1 */
    public void mo36004B1() {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f78130o1 = m92642L3.getInt("extra_id_type");
            this.f78131p1 = m92642L3.getInt("extra_type");
            this.f78134s1 = m92642L3.getInt("extra_mode", 0);
            this.f78132q1 = m92642L3.getInt("extra_init_page", 0);
            this.f78136u1 = m92642L3.getString("extra_title_action_bar", this.f78135t1);
            String string = m92642L3.getString("extra_user_id", "");
            if (!TextUtils.isEmpty(string)) {
                this.f78113X0 = C28203u6.f131407a.m141809c(string);
            }
        }
        this.f78121f1 = new Handler(Looper.getMainLooper());
    }

    /* renamed from: CM */
    int m84885CM() {
        int i11 = this.f78134s1;
        if (i11 == 0) {
            return 93;
        }
        if (i11 != 1) {
            return i11 != 3 ? 94 : 95;
        }
        return 91;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 100) {
                        return null;
                    }
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f78133r1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
                    return aVar.m43152a();
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), this);
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar3.m43152a();
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        C8009j.a m43159h = aVar4.m43159h(1);
        if (this.f78131p1 == 1) {
            i12 = AbstractC8020f0.suggestfriend_ask_to_delete_selected_friendrequest;
        } else {
            i12 = AbstractC8020f0.suggestfriend_ask_to_delete_selected;
        }
        m43159h.m43162k(AbstractC23136l9.m118743r0(i12)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar4.m43152a();
    }

    /* renamed from: DM */
    public TrackingSource m84886DM(int i11) {
        TrackingSource trackingSource = new TrackingSource(i11);
        int i12 = this.f78134s1;
        if (i12 == 1) {
            trackingSource.m40677a("sourceView", 1);
        } else if (i12 == 0) {
            trackingSource.m40677a("sourceView", 2);
        } else if (i12 == 2) {
            trackingSource.m40677a("sourceView", 3);
        } else if (i12 == 3) {
            if (this.f78137v1) {
                trackingSource.m40677a("sourceView", 15);
            } else {
                trackingSource.m40677a("sourceView", 12);
            }
        }
        return trackingSource;
    }

    /* renamed from: EM */
    void m84887EM() {
        LinearLayout linearLayout = this.f78127l1;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view = this.f78126k1;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f88760a0.m92716k();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            actionBarMenu.m92750r();
            if (this.f78134s1 != 3) {
                ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
                this.f78139x1 = m92738e;
                Context context = getContext();
                int i11 = AbstractC8020f0.menu_delete_item_suggest_friend;
                this.f78140y1 = m92738e.m92774j(AbstractC23136l9.m118724l(context, i11, i11));
                ActionBarMenuItem actionBarMenuItem = this.f78139x1;
                Context context2 = getContext();
                int i12 = AbstractC8020f0.menu_setting_suggest_friend_new;
                actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(context2, i12, i12));
            } else {
                int i13 = AbstractC16803z.icon_header_settings;
                actionBarMenu.m92738e(i13, i13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    void m84888FM() {
        try {
            m84898YM();
            this.f78118c1 = new C23528a(this.f72421L0.m92648SI());
            C7045d9 c7045d9 = new C7045d9(this.f72421L0.m92648SI(), this.f78118c1);
            this.f78115Z0 = c7045d9;
            c7045d9.m35983a0(this);
            this.f78114Y0.setAdapter(this.f78115Z0);
            m84895VM(AbstractC8020f0.empty_list);
            m84894UM(AbstractC8020f0.loading);
            m84907uM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Fx */
    public void mo36005Fx(int i11, int i12) {
        int i13;
        int i14;
        try {
            if (this.f78131p1 == 1) {
                AbstractC23647d.m123897g("5901178");
            } else {
                AbstractC23647d.m123897g("3120");
            }
            if (i11 >= 0 && i11 < this.f78115Z0.mo10003k()) {
                C31874cb m153145a = this.f78115Z0.m35968L(i11).m153145a();
                this.f78090C1 = m153145a;
                if (m153145a != null) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    m84890Kv(m153145a.m153177a());
                                }
                            } else {
                                m84906tM(false);
                                if (this.f78131p1 == 1) {
                                    AbstractC23647d.m123897g("5901180");
                                }
                            }
                        } else if (m153145a.f146399o == 2) {
                            ContactProfile m153177a = m153145a.m153177a();
                            new TrackingSource(m153177a.f42373R0).m40677a("sourceView", 12);
                            AbstractC21935u.m114522L(m153177a, 0, new C26365a.b(m153177a.f42434r, C32002l4.m154264g(44)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.qp0
                                public /* synthetic */ qp0() {
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Void m84873QM;
                                    m84873QM = SuggestFriendDetailView.this.m84873QM();
                                    return m84873QM;
                                }
                            });
                            if (this.f78131p1 == 1) {
                                AbstractC23647d.m123897g("5901179");
                            }
                        }
                    } else if (m153145a.f146390f > 0) {
                        String str = m153145a.f146385a;
                        this.f78089B1 = str;
                        m84909wM(Integer.parseInt(str));
                    } else {
                        String str2 = m153145a.f146385a;
                        this.f78089B1 = str2;
                        m84912zM(str2);
                    }
                    C28905e m144373n = C28905e.m144373n();
                    String str3 = this.f78090C1.f146385a;
                    if (i12 == 2) {
                        i13 = 22;
                    } else {
                        i13 = 21;
                    }
                    m144373n.m144400v(str3, i13, m84885CM(), i11, "");
                    if (i12 == 2) {
                        i14 = 4;
                    } else {
                        i14 = 3;
                    }
                    C0815e1.m2075D().m2099U(3, i14, 3, String.valueOf(1), this.f78090C1.f146385a, String.valueOf(i11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f78103P0 = layoutInflater.inflate(AbstractC7409c0.suggest_request_detail_view, viewGroup, false);
        m84889GM();
        return this.f78103P0;
    }

    /* renamed from: GM */
    void m84889GM() {
        int i11;
        this.f78105Q0 = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.layout_accept_friend_success);
        this.f78107R0 = (CircleImage) this.f78103P0.findViewById(AbstractC6918a0.imv_avatar);
        this.f78108S0 = (CircleImage) this.f78103P0.findViewById(AbstractC6918a0.imv_my_avatar);
        this.f78109T0 = (TextView) this.f78103P0.findViewById(AbstractC6918a0.tv_accept_desc);
        this.f78110U0 = (TextView) this.f78103P0.findViewById(AbstractC6918a0.tv_section_suggest_friend);
        this.f78111V0 = this.f78103P0.findViewById(AbstractC6918a0.separate_line);
        this.f78112W0 = (Button) this.f78103P0.findViewById(AbstractC6918a0.btn_function);
        LinearLayout linearLayout = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.ll_suggest_friends);
        this.f78122g1 = linearLayout;
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.ll_find_friend_via_location);
        this.f78124i1 = linearLayout2;
        linearLayout2.setOnClickListener(this);
        boolean m121849e = AbstractC23309i.m121849e();
        LinearLayout linearLayout3 = this.f78124i1;
        if (m121849e) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout3.setVisibility(i11);
        LinearLayout linearLayout4 = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.ll_suggest_find_friend);
        this.f78123h1 = linearLayout4;
        linearLayout4.setOnClickListener(this);
        this.f78114Y0 = (RecyclerView) this.f78103P0.findViewById(AbstractC6918a0.lv_friend_request);
        MultiStateView multiStateView = (MultiStateView) this.f78103P0.findViewById(AbstractC6918a0.multi_state);
        this.f78116a1 = multiStateView;
        multiStateView.setEnableLoadingText(false);
        this.f78116a1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.jp0
            public /* synthetic */ jp0() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                SuggestFriendDetailView.this.m84869MM();
            }
        });
        this.f78126k1 = this.f78103P0.findViewById(AbstractC6918a0.separateLineSelect);
        this.f78127l1 = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.layout_select_all);
        this.f78128m1 = (RobotoTextView) this.f78103P0.findViewById(AbstractC6918a0.btnRemoveSelection);
        this.f78129n1 = (CheckBox) this.f78103P0.findViewById(AbstractC6918a0.checkboxAll);
        this.f78128m1.setOnClickListener(this);
        this.f78129n1.setOnClickListener(this);
        this.f78103P0.findViewById(AbstractC6918a0.tv_select_all).setOnClickListener(this);
        this.f78125j1 = (LinearLayout) this.f78103P0.findViewById(AbstractC6918a0.ll_phonebook_suggestion);
        if (!AbstractC23309i.m122119l4() && !AbstractC23309i.m122157m4()) {
            this.f78125j1.setVisibility(8);
        } else {
            this.f78125j1.setVisibility(0);
            this.f78125j1.setOnClickListener(this);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
        this.f78117b1 = linearLayoutManager;
        linearLayoutManager.m9723C2(1);
        this.f78114Y0.setLayoutManager(this.f78117b1);
        this.f78114Y0.setOverScrollMode(2);
        this.f78114Y0.m9826E(new C15140a());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C21933s.m114404I().m114426K0(this.f78134s1);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 == -1) {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f != 2) {
                    if (mo92862f == 3) {
                        interfaceC17463d.dismiss();
                        ContactProfile m153177a = this.f78090C1.m153177a();
                        new TrackingSource(m153177a.f42373R0).m40677a("sourceView", 12);
                        AbstractC21935u.m114522L(m153177a, 0, new C26365a.b(m153177a.f42434r, C32002l4.m154264g(44)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.ip0
                            public /* synthetic */ ip0() {
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Void m84871OM;
                                m84871OM = SuggestFriendDetailView.this.m84871OM();
                                return m84871OM;
                            }
                        });
                        return;
                    }
                    return;
                }
                AbstractC23647d.m123907q("5320", "");
                interfaceC17463d.dismiss();
                AbstractC23309i.m121177Lx(true);
                this.f72421L0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                AbstractC23647d.m123893c();
                return;
            }
            interfaceC17463d.dismiss();
            m84887EM();
            m84906tM(true);
            return;
        }
        if (i11 == -2) {
            int mo92862f2 = interfaceC17463d.mo92862f();
            if (mo92862f2 != 2) {
                if (mo92862f2 == 100) {
                    interfaceC17463d.dismiss();
                    C31874cb c31874cb = this.f78090C1;
                    if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
                        ContactProfile contactProfile = new ContactProfile(this.f78090C1.f146385a);
                        C31874cb c31874cb2 = this.f78090C1;
                        contactProfile.f42446v = c31874cb2.f146393i;
                        contactProfile.f42455y = c31874cb2.f146394j;
                        contactProfile.f42437s = c31874cb2.f146387c;
                        contactProfile.f42437s = contactProfile.m40383Q(true, false);
                        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                        if (this.f72421L0.m92676n2() != null) {
                            this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC23647d.m123907q("5310", "");
            interfaceC17463d.dismiss();
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: Kv */
    void m84890Kv(ContactProfile contactProfile) {
        Intent intent = new Intent();
        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
        intent.putExtras(m140776b);
        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
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

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Pj */
    public void mo36006Pj() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        int m84863BM;
        if (i11 == 16908332) {
            try {
                if (this.f78131p1 == 1) {
                    AbstractC23647d.m123897g("5901187");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 != AbstractC6918a0.menu_next && i11 != AbstractC8020f0.menu_delete_item_suggest_friend) {
            if (i11 == 1) {
                m84887EM();
                C7045d9 c7045d9 = this.f78115Z0;
                if (c7045d9 != null) {
                    c7045d9.m35980X();
                }
            } else {
                if (i11 != AbstractC16803z.icon_header_settings && i11 != AbstractC8020f0.menu_setting_suggest_friend_new) {
                    if (i11 == AbstractC6918a0.action_bar_menu_more && this.f78131p1 == 1) {
                        AbstractC23647d.m123897g("5901184");
                    }
                }
                if (this.f78131p1 == 1) {
                    AbstractC23647d.m123897g("5901186");
                    m84863BM = 33;
                } else {
                    m84863BM = m84863BM();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_INT_SOURCE_VIEW", m84863BM);
                this.f72421L0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
                return true;
            }
            return super.mo37491QJ(i11);
        }
        m84896WM();
        this.f78115Z0.m10008p();
        if (this.f78131p1 == 1) {
            AbstractC23647d.m123897g("5901185");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: R3 */
    public boolean mo36007R3(String str) {
        return C21933s.m114404I().m114486q0(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            C23744a.m124114c().m124117e(this, 6096);
            C23744a.m124114c().m124117e(this, 6091);
            C23744a.m124114c().m124117e(this, 6094);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    boolean m84891RM(int i11) {
        try {
            C7045d9 c7045d9 = this.f78115Z0;
            if (c7045d9 == null || c7045d9.mo10003k() <= 0) {
                return false;
            }
            C31874cb m153145a = this.f78115Z0.m35968L(i11).m153145a();
            this.f78115Z0.m35989g0(m153145a.f146385a, m153145a);
            m84896WM();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Rn */
    public void mo36008Rn(String str, String str2) {
    }

    /* renamed from: SM */
    void m84892SM() {
        C31874cb c31874cb;
        try {
            this.f78119d1.clear();
            this.f78119d1.addAll(C21933s.m114404I().m114418G());
            if (!this.f78119d1.isEmpty() && this.f78113X0 != null && this.f78134s1 == 3) {
                try {
                    Iterator it = this.f78119d1.iterator();
                    while (it.hasNext()) {
                        C31859bb c31859bb = (C31859bb) it.next();
                        if (c31859bb != null && (c31874cb = c31859bb.f146291b) != null && c31874cb.f146385a.equals(this.f78113X0.f42434r)) {
                            it.remove();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            this.f78115Z0.m35982Z(this.f78119d1);
            this.f78115Z0.m10008p();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        m84898YM();
    }

    /* renamed from: TM */
    public void m84893TM(C31874cb c31874cb) {
        if (c31874cb != null && !this.f78093F1) {
            TrackingSource m84886DM = m84886DM(c31874cb.f146389e);
            C21927m.m114302u().m114330e0(c31874cb.f146385a, m84886DM);
            this.f78093F1 = true;
            this.f78094G1.mo1704o8(this.f78095H1);
            this.f78094G1.mo1620d7(c31874cb.f146385a, "", c31874cb.f146389e, m84886DM.m40682o());
        }
    }

    /* renamed from: UM */
    void m84894UM(int i11) {
        MultiStateView multiStateView = this.f78116a1;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: VM */
    public void m84895VM(int i11) {
        MultiStateView multiStateView = this.f78116a1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: WM */
    void m84896WM() {
        try {
            LinearLayout linearLayout = this.f78127l1;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view = this.f78126k1;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f88760a0.getActionMode() == null) {
                ActionBarMenu m92709d = this.f88760a0.m92709d();
                m92709d.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                m92709d.m92744k(1, AbstractC7409c0.action_mode_back_fixed);
                TextView textView = (TextView) m92709d.m92745l(2, AbstractC7409c0.action_mode_title_fixed, 1);
                this.f78099L1 = textView;
                textView.setText(this.f78136u1);
            }
            this.f88760a0.m92725w();
            m84899ZM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XM */
    public void m84897XM(boolean z11, boolean z12) {
        try {
            C7045d9 c7045d9 = this.f78115Z0;
            if (c7045d9 != null) {
                c7045d9.m35988f0(z11);
                this.f78115Z0.m35987e0(z12);
                this.f78115Z0.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YM */
    void m84898YM() {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(this.f78136u1);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZM */
    void m84899ZM() {
        boolean z11;
        try {
            int m35971O = this.f78115Z0.m35971O();
            boolean z12 = false;
            if (m35971O > 0) {
                this.f78128m1.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_option_remove_count), Integer.valueOf(m35971O)));
                this.f78128m1.setEnabled(true);
            } else {
                this.f78128m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_option_remove));
                this.f78128m1.setEnabled(false);
            }
            ImageView imageView = this.f78098K1;
            if (imageView != null) {
                if (m35971O > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                imageView.setEnabled(z11);
            }
            CheckBox checkBox = this.f78129n1;
            if (m35971O == this.f78115Z0.m35970N()) {
                z12 = true;
            }
            checkBox.setChecked(z12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aN */
    void m84900aN(boolean z11) {
        int i11;
        Button button = this.f78138w1;
        int i12 = 0;
        if (button != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            button.setVisibility(i11);
        }
        View view = this.f78140y1;
        if (view != null) {
            if (z11) {
                i12 = 8;
            }
            view.setVisibility(i12);
        }
    }

    /* renamed from: bN */
    public void m84901bN(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15146g());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1042));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: c7 */
    public boolean mo36009c7() {
        return this.f88760a0.m92720p();
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: g2 */
    public boolean mo36010g2(String str) {
        return C21933s.m114404I().m114484p0(str);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78087R1;
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: n */
    public void mo36011n(int i11) {
        try {
            AbstractC23647d.m123907q("3110", "");
            C7045d9 c7045d9 = this.f78115Z0;
            if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
                C31874cb m153145a = this.f78115Z0.m35968L(i11).m153145a();
                this.f78120e1 = m153145a;
                if (m153145a != null) {
                    if (this.f78131p1 == 1) {
                        AbstractC23647d.m123897g("5901181");
                    }
                    if (!this.f88760a0.m92720p()) {
                        AbstractC23059e9.m118317F(this.f78120e1.f146385a);
                        if (C21933s.m114404I().m114486q0(this.f78120e1.f146385a)) {
                            C21933s.m114404I().m114421H0(this.f78120e1.f146385a);
                            C7045d9 c7045d92 = this.f78115Z0;
                            if (c7045d92 != null) {
                                c7045d92.m10008p();
                            }
                        }
                        C31874cb c31874cb = this.f78120e1;
                        if (c31874cb.f146390f > 0) {
                            if (C21927m.m114302u().m114357s().m153137g(this.f78120e1.f146385a)) {
                                m84890Kv(this.f78120e1.m153177a());
                            } else {
                                AbstractC23074g2.m118379e(this.f78120e1, this.f72421L0.m92662fJ(), ZAbstractBase.ZVU_BLEND_GEN_THUMB, this.f78134s1, this.f78131p1, 3);
                            }
                        } else {
                            AbstractC23074g2.m118379e(c31874cb, this.f72421L0.m92662fJ(), ZAbstractBase.ZVU_BLEND_GEN_THUMB, this.f78134s1, this.f78131p1, 3);
                            if (this.f78131p1 == 1) {
                                AbstractC23647d.m123897g("5901182");
                            }
                        }
                    } else {
                        m84891RM(i11);
                    }
                    C28905e.m144373n().m144400v(this.f78120e1.f146385a, 20, m84885CM(), i11, "");
                    C0815e1.m2075D().m2099U(3, 2, 3, String.valueOf(1), this.f78120e1.f146385a, String.valueOf(i11));
                }
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C7045d9 c7045d9;
        C7045d9 c7045d92;
        C17487o0 c17487o0;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1003) {
            if (!this.f78141z1) {
                if (C21933s.m114404I().m114418G().isEmpty()) {
                    C21933s.m114404I().m114436P0();
                    m84907uM();
                    return;
                } else {
                    C21933s.m114404I().m114436P0();
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kp0
                            public /* synthetic */ kp0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SuggestFriendDetailView.this.m84870NM();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i11 == 1004) {
            if (!AbstractC23059e9.m118316E()) {
                if (AbstractC23309i.m122500vc()) {
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    if (c17487o0 != null) {
                        c17487o0.m93069k2(NearbyZView.class, null, 1, true);
                        return;
                    }
                    return;
                }
                this.f72421L0.showDialog(2);
                return;
            }
            return;
        }
        if (i11 == 10099) {
            if (i12 == -1 && (c7045d92 = this.f78115Z0) != null) {
                c7045d92.m10008p();
                return;
            }
            return;
        }
        if (i11 == 1085 && i12 == -1 && (c7045d9 = this.f78115Z0) != null) {
            c7045d9.m10008p();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.ll_find_friend_via_location) {
            if (AbstractC23059e9.m118316E()) {
                m84910xM();
                return;
            } else if (AbstractC23309i.m122500vc()) {
                this.f72421L0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                return;
            } else {
                this.f72421L0.showDialog(2);
                return;
            }
        }
        if (id2 == AbstractC6918a0.ll_suggest_find_friend) {
            try {
                this.f72421L0.m92662fJ().m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122774d(f78087R1, e11.toString());
                return;
            }
        }
        if (id2 == AbstractC6918a0.ll_phonebook_suggestion) {
            C17487o0 mo35579p = this.f72421L0.m92676n2().mo35579p();
            if (mo35579p != null) {
                mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_function) {
            try {
                this.f72421L0.finish();
                m84890Kv(this.f78113X0);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.btnRemoveSelection) {
            showDialog(1);
            return;
        }
        if (id2 == AbstractC6918a0.tv_select_all) {
            this.f78129n1.setChecked(!r4.isChecked());
            if (!this.f78129n1.isChecked()) {
                this.f78115Z0.m35980X();
            } else {
                this.f78115Z0.m35981Y();
            }
            m84899ZM();
            return;
        }
        if (id2 == AbstractC6918a0.checkboxAll) {
            if (!this.f78129n1.isChecked()) {
                this.f78115Z0.m35980X();
            } else {
                this.f78115Z0.m35981Y();
            }
            m84899ZM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                if (!this.f77813M0) {
                    if (this.f88760a0.m92720p()) {
                        try {
                            m84887EM();
                            C7045d9 c7045d9 = this.f78115Z0;
                            if (c7045d9 != null) {
                                c7045d9.m35980X();
                            }
                            AbstractC23647d.m123907q("31332", "");
                            AbstractC23647d.m123893c();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        return true;
                    }
                    if (this.f78131p1 == 1) {
                        AbstractC23647d.m123897g("5901187");
                    }
                    this.f72421L0.finish();
                    return true;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        Handler handler;
        super.onResume();
        try {
            C23744a.m124114c().m124115b(this, 6096);
            C23744a.m124114c().m124115b(this, 6091);
            C23744a.m124114c().m124115b(this, 6094);
            if (C21933s.m114404I().f107932u) {
                C21933s.m114404I().f107932u = false;
                m84892SM();
            }
            if (C21933s.m114404I().m114498w0() && (handler = this.f78121f1) != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.op0
                    public /* synthetic */ op0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SuggestFriendDetailView.this.m84872PM();
                    }
                }, 200L);
            }
            if (C21933s.m114404I().f107937z) {
                C21933s.m114404I().f107937z = false;
                AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f78115Z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pv */
    public void m84902pv(boolean z11, int i11) {
        MultiStateView.EnumC15915f enumC15915f;
        int i12;
        try {
            if (z11) {
                this.f78122g1.setVisibility(8);
                this.f78114Y0.setVisibility(8);
                this.f78116a1.setVisibility(0);
                this.f78116a1.setState(MultiStateView.EnumC15914e.LOADING);
                m84900aN(true);
                return;
            }
            C7045d9 c7045d9 = this.f78115Z0;
            if (c7045d9 != null && c7045d9.mo10003k() != 0) {
                this.f78114Y0.setVisibility(0);
                this.f78116a1.setVisibility(8);
                this.f78122g1.setVisibility(8);
                if (this.f78134s1 == 3 && this.f78113X0 != null) {
                    TextView textView = this.f78110U0;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    View view = this.f78111V0;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                m84900aN(false);
                return;
            }
            this.f78114Y0.setVisibility(8);
            if (this.f78134s1 == 3 && this.f78113X0 != null) {
                TextView textView2 = this.f78110U0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                View view2 = this.f78111V0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else if (i11 == 0) {
                this.f78122g1.setVisibility(0);
                this.f78116a1.setVisibility(8);
                this.f78116a1.setState(MultiStateView.EnumC15914e.EMPTY);
            } else {
                this.f78122g1.setVisibility(8);
                MultiStateView multiStateView = this.f78116a1;
                if (i11 == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                this.f78116a1.setVisibility(0);
                this.f78116a1.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView2 = this.f78116a1;
                if (i11 == 50001) {
                    i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i12 = AbstractC8020f0.str_error_loadingList;
                }
                multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
            }
            m84900aN(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m84903qM(String str) {
        C21933s.m114404I().m114454a(str);
        C21933s.m114404I().f107931t = true;
        AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f78115Z0);
    }

    /* renamed from: rM */
    void m84904rM() {
        C31874cb c31874cb;
        int height;
        try {
            int m9745c2 = this.f78117b1.m9745c2();
            for (int m9740Y1 = this.f78117b1.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                if (this.f78115Z0.m35968L(m9740Y1) != null && (c31874cb = this.f78115Z0.m35968L(m9740Y1).f146291b) != null) {
                    View mo9732P = this.f78117b1.mo9732P(m9740Y1);
                    if ((this.f78114Y0.m9823C0(mo9732P) instanceof C7045d9.a) && mo9732P.getTop() + mo9732P.getBottom() > (height = (int) (mo9732P.getHeight() * 0.8f)) && this.f78114Y0.getHeight() - mo9732P.getTop() > height) {
                        C28905e.m144373n().m144400v(c31874cb.f146385a, 10, m84885CM(), m9740Y1, "");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m84905sM(Map map) {
        if (this.f78100M1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        try {
            ArrayList arrayList = new ArrayList();
            this.f78104P1.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C31874cb c31874cb = (C31874cb) entry.getValue();
                if (!C21933s.m114404I().m114484p0(str)) {
                    arrayList.add(c31874cb);
                }
                this.f78104P1.add(str);
            }
            if (!arrayList.isEmpty()) {
                this.f78100M1 = true;
                this.f78101N1.mo1704o8(this.f78102O1);
                this.f78101N1.mo1453I7(arrayList, TrackingSource.m40665d(m84884AM()));
            } else {
                C21933s.m114404I().m114459c0(this.f78104P1);
                AbstractC23074g2.m118376b(1, this.f78104P1, "", 4);
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pp0
                        public /* synthetic */ pp0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestFriendDetailView.this.m84865IM();
                        }
                    });
                }
                this.f78100M1 = false;
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f78087R1, e11.toString());
            this.f78100M1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: t3 */
    public void mo36012t3() {
        if (C23055e5.m118272g(true)) {
            m84911yM(true);
        }
    }

    /* renamed from: tM */
    void m84906tM(boolean z11) {
        this.f78106Q1 = !z11;
        if (z11) {
            m84905sM(this.f78115Z0.m35972P());
            return;
        }
        HashMap hashMap = new HashMap();
        C31874cb c31874cb = this.f78090C1;
        if (c31874cb != null) {
            hashMap.put(c31874cb.f146385a, c31874cb);
            m84905sM(hashMap);
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u1 */
    public void mo36013u1() {
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u4 */
    public void mo36014u4() {
        if (this.f78131p1 == 1) {
            AbstractC23647d.m123897g("5901183");
        }
    }

    /* renamed from: uM */
    public void m84907uM() {
        int i11;
        int i12;
        try {
            LinearLayout linearLayout = this.f78105Q0;
            if (this.f78134s1 == 3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
            if (this.f78134s1 == 3 && this.f78113X0 != null) {
                this.f78137v1 = true;
                this.f78105Q0.setVisibility(0);
                ((C23528a) this.f78118c1.m123612r(this.f78108S0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
                if (this.f78113X0 != null) {
                    ((C23528a) this.f78118c1.m123612r(this.f78107R0)).m123618x(this.f78113X0.f42446v, C23278z2.m120143n());
                    this.f78112W0.setOnClickListener(this);
                }
                this.f78109T0.setText(AbstractC8020f0.str_hint_alreadyFriend);
            } else {
                this.f78137v1 = false;
                this.f78105Q0.setVisibility(8);
            }
            if (C21933s.m114404I().m114488r0(this.f78134s1, this.f78131p1)) {
                m84902pv(true, 0);
                C21933s.m114404I().m114446U0(this.f78134s1, this.f78131p1, new C15141b());
                return;
            }
            if (this.f78132q1 == 0 && ((i12 = this.f78134s1) == 2 || i12 == 1)) {
                m84902pv(true, 0);
                m84911yM(true);
                return;
            }
            C21933s.m114404I().m114497w(this.f78134s1, this.f78131p1);
            m84892SM();
            m84902pv(false, 0);
            if (C21933s.m114404I().m114465f0(this.f78134s1, this.f78131p1)) {
                m84911yM(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    void m84908vM() {
        this.f78121f1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hp0
            public /* synthetic */ hp0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SuggestFriendDetailView.this.m84868LM();
            }
        });
    }

    /* renamed from: wM */
    void m84909wM(int i11) {
        try {
            if (this.f78096I1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f78097J1);
            this.f78096I1 = true;
            c0766k.mo1578Y4(i11, new TrackingSource(290));
        } catch (Exception e11) {
            this.f78096I1 = false;
            this.f72421L0.mo78960q3();
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: wb */
    public boolean mo36015wb(int i11) {
        C7045d9 c7045d9 = this.f78115Z0;
        if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
            try {
                AbstractC23647d.m123907q("3133", "");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return m84891RM(i11);
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6096) {
            Handler handler = this.f78121f1;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.lp0
                    public /* synthetic */ lp0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SuggestFriendDetailView.this.m84866JM();
                    }
                }, 200L);
                return;
            }
            return;
        }
        if (i11 == 6091) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof String) {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.mp0

                        /* renamed from: p */
                        public final /* synthetic */ String f81171p;

                        public /* synthetic */ mp0(String str) {
                            r1 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestFriendDetailView.m84867KM(r1);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 6094) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.np0
                public /* synthetic */ np0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SuggestFriendDetailView.this.m84907uM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m84888FM();
    }

    /* renamed from: xM */
    public void m84910xM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showUpdateProfileHint", true);
        bundle.putBoolean("update", true);
        this.f72421L0.m92662fJ().m93066i2(UpdateUserInfoZView.class, bundle, 1004, 1, true);
    }

    /* renamed from: yM */
    void m84911yM(boolean z11) {
        if (this.f78141z1) {
            return;
        }
        this.f78141z1 = true;
        C21933s.m114404I().m114479n();
        if (z11) {
            m84897XM(true, false);
        }
        C15142c c15142c = new C15142c();
        int i11 = this.f78134s1;
        if (i11 == 0) {
            C21933s.m114404I().m114483p(this.f78130o1, this.f78132q1, this.f78131p1, c15142c);
            return;
        }
        if (i11 == 1) {
            if (this.f78132q1 == 0) {
                C21933s.m114404I().m114410C(this.f78132q1, c15142c);
                return;
            } else {
                C21933s.m114404I().m114485q(this.f78130o1, this.f78132q1, c15142c);
                return;
            }
        }
        if (i11 == 2 || i11 == 3) {
            if (this.f78132q1 == 0 && i11 == 2) {
                C21933s.m114404I().m114412D(this.f78132q1, c15142c);
            } else {
                C21933s.m114404I().m114487r(this.f78132q1, c15142c);
            }
        }
    }

    /* renamed from: zM */
    public void m84912zM(String str) {
        try {
            if (this.f78091D1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f78091D1 = true;
            this.f78089B1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f78092E1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f78091D1 = false;
            this.f72421L0.mo78960q3();
        }
    }
}
