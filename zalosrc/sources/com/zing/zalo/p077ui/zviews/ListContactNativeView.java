package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0852x;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7072g3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C7998b;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.RobotoTextViewStateAware;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import ls.C22643c;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.AbstractC23262x6;
import me0.C23046d7;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18631a;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21913a0;
import p304ks.C21916c;
import p304ks.C21917c0;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p716zh.C31874cb;
import p716zh.C31901e8;
import p716zh.C31934gb;
import p716zh.C32002l4;
import r30.AbstractC25636f;
import r30.C25641k;
import r30.C25642l;
import rw.C25982c;
import rw.C25983d;
import rw.C25984e;
import rw.C25985f;
import v50.C27870vb;
import vg.C28203u6;
import y60.C30802d;
import zc0.C31784b;

/* loaded from: classes.dex */
public class ListContactNativeView extends SlidableZaloView implements C7072g3.a, InterfaceC17463d.d, C31784b.d, View.OnClickListener, C31784b.e, C7998b.a, InterfaceC0733x, C23744a.c {

    /* renamed from: j2 */
    private static ListContactNativeView f74579j2;

    /* renamed from: k2 */
    static long f74580k2;

    /* renamed from: A1 */
    ContactProfile f74581A1;

    /* renamed from: B1 */
    C25982c f74582B1;

    /* renamed from: D1 */
    C8009j f74584D1;

    /* renamed from: E1 */
    ContactProfile f74585E1;

    /* renamed from: F1 */
    RobotoTextViewStateAware f74586F1;

    /* renamed from: G1 */
    RobotoTextView f74587G1;

    /* renamed from: H1 */
    View f74588H1;

    /* renamed from: I1 */
    RobotoTextViewStateAware f74589I1;

    /* renamed from: J1 */
    RobotoTextView f74590J1;

    /* renamed from: K1 */
    View f74591K1;

    /* renamed from: L1 */
    View f74592L1;

    /* renamed from: M1 */
    View f74593M1;

    /* renamed from: N1 */
    RobotoTextView f74594N1;

    /* renamed from: O1 */
    View f74595O1;

    /* renamed from: P0 */
    RecyclerView f74596P0;

    /* renamed from: P1 */
    View f74597P1;

    /* renamed from: Q0 */
    C7072g3 f74598Q0;

    /* renamed from: Q1 */
    C30802d f74599Q1;

    /* renamed from: R0 */
    LinearLayoutManager f74600R0;

    /* renamed from: S0 */
    MultiStateView f74602S0;

    /* renamed from: T0 */
    RobotoTextView f74604T0;

    /* renamed from: U0 */
    View f74606U0;

    /* renamed from: U1 */
    ActionBarMenuItem f74607U1;

    /* renamed from: V0 */
    RobotoEditText f74608V0;

    /* renamed from: W0 */
    ImageView f74610W0;

    /* renamed from: X0 */
    View f74612X0;

    /* renamed from: Y0 */
    View f74614Y0;

    /* renamed from: Z0 */
    View f74616Z0;

    /* renamed from: a1 */
    View f74618a1;

    /* renamed from: b1 */
    RobotoTextView f74620b1;

    /* renamed from: c1 */
    View f74622c1;

    /* renamed from: d1 */
    View f74624d1;

    /* renamed from: e1 */
    View f74626e1;

    /* renamed from: f1 */
    View f74628f1;

    /* renamed from: i1 */
    ContactProfile f74634i1;

    /* renamed from: i2 */
    C0855y0 f74635i2;

    /* renamed from: o1 */
    String f74641o1;

    /* renamed from: v1 */
    List f74648v1;

    /* renamed from: w1 */
    List f74649w1;

    /* renamed from: z1 */
    ContactProfile f74652z1;

    /* renamed from: g1 */
    boolean f74630g1 = false;

    /* renamed from: h1 */
    String f74632h1 = "";

    /* renamed from: j1 */
    boolean f74636j1 = false;

    /* renamed from: k1 */
    boolean f74637k1 = false;

    /* renamed from: l1 */
    boolean f74638l1 = false;

    /* renamed from: m1 */
    boolean f74639m1 = false;

    /* renamed from: n1 */
    boolean f74640n1 = false;

    /* renamed from: p1 */
    int f74642p1 = 0;

    /* renamed from: q1 */
    int f74643q1 = 0;

    /* renamed from: r1 */
    boolean f74644r1 = false;

    /* renamed from: s1 */
    Handler f74645s1 = new Handler();

    /* renamed from: t1 */
    InterfaceC0765j f74646t1 = new C0766k();

    /* renamed from: u1 */
    Map f74647u1 = new HashMap();

    /* renamed from: x1 */
    int f74650x1 = 0;

    /* renamed from: y1 */
    int f74651y1 = 0;

    /* renamed from: C1 */
    boolean f74583C1 = true;

    /* renamed from: R1 */
    int f74601R1 = 0;

    /* renamed from: S1 */
    boolean f74603S1 = false;

    /* renamed from: T1 */
    private C16972e0 f74605T1 = null;

    /* renamed from: V1 */
    boolean f74609V1 = false;

    /* renamed from: W1 */
    InterfaceC0765j f74611W1 = new C0766k();

    /* renamed from: X1 */
    InterfaceC20094a f74613X1 = new C14511h();

    /* renamed from: Y1 */
    ArrayList f74615Y1 = new ArrayList();

    /* renamed from: Z1 */
    boolean f74617Z1 = false;

    /* renamed from: a2 */
    boolean f74619a2 = false;

    /* renamed from: b2 */
    boolean f74621b2 = false;

    /* renamed from: c2 */
    boolean f74623c2 = false;

    /* renamed from: d2 */
    boolean f74625d2 = false;

    /* renamed from: e2 */
    int f74627e2 = 0;

    /* renamed from: f2 */
    InterfaceC20094a f74629f2 = new C14505b();

    /* renamed from: g2 */
    boolean f74631g2 = false;

    /* renamed from: h2 */
    int f74633h2 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$a */
    /* loaded from: classes6.dex */
    public class C14504a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f74653a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f74654b;

        /* renamed from: c */
        final /* synthetic */ boolean f74655c;

        /* renamed from: d */
        final /* synthetic */ boolean f74656d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$a$a */
        /* loaded from: classes6.dex */
        public class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f74658a;

            a(ContactProfile contactProfile) {
                this.f74658a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f74658a.f42434r);
            }
        }

        C14504a(String str, ContactProfile contactProfile, boolean z11, boolean z12) {
            this.f74653a = str;
            this.f74654b = contactProfile;
            this.f74655c = z11;
            this.f74656d = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m81133g(Bundle bundle) {
            if (ListContactNativeView.this.m92662fJ() != null) {
                ListContactNativeView.this.m92662fJ().m93066i2(WriteInvitationView.class, bundle, 100, 1, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m81134h(String str) {
            try {
                if (ListContactNativeView.this.m92672lJ()) {
                    ToastUtils.showMess(ListContactNativeView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                }
                AbstractC23074g2.m118375a(0, str, "", 6);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m81135i(ContactProfile contactProfile, String str) {
            try {
                if (ListContactNativeView.this.m92672lJ()) {
                    ToastUtils.showMess(ListContactNativeView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                }
                if (!AbstractC21935u.m114558y(contactProfile.f42434r)) {
                    contactProfile.m40423p1(true);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                }
                AbstractC23074g2.m118375a(0, str, "", 6);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m81136j() {
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            listContactNativeView.m81081gN(listContactNativeView.f74634i1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ListContactNativeView listContactNativeView = ListContactNativeView.this;
                listContactNativeView.f74636j1 = false;
                listContactNativeView.f72421L0.mo49315c4();
                if (ListContactNativeView.this.m92672lJ()) {
                    ToastUtils.showMess(ListContactNativeView.this.m92652XI(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ListContactNativeView listContactNativeView;
            int i11;
            int i12;
            int i13;
            int i14;
            ListContactNativeView.this.f74636j1 = false;
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
                                    if (!C18644n.m98531l().m98558u(this.f74653a)) {
                                        TrackingSource trackingSource = new TrackingSource(this.f74654b.f42373R0);
                                        if (!AbstractC23057e7.m118297d()) {
                                            i14 = 13;
                                        } else {
                                            i14 = 8;
                                        }
                                        if (!AbstractC23309i.m120901Eg() && AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112032i)) {
                                            i14 = 14;
                                        }
                                        trackingSource.m40677a("sourceView", Integer.valueOf(i14));
                                        C21927m.m114302u().m114330e0(this.f74654b.f42434r, trackingSource);
                                        if (this.f74655c) {
                                            ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
                                            ContactProfile contactProfile = this.f74654b;
                                            listContactNativeView2.m81120mN(contactProfile.f42434r, contactProfile.f42373R0);
                                            z11 = false;
                                        } else {
                                            final Bundle bundle = new Bundle();
                                            bundle.putString("uid", this.f74654b.f42434r);
                                            bundle.putString("dpn", this.f74654b.f42437s);
                                            bundle.putString("phone", this.f74654b.f42455y);
                                            bundle.putString("avatar", this.f74654b.f42446v);
                                            if (!TextUtils.isEmpty(this.f74654b.f42455y)) {
                                                bundle.putString("phone", this.f74654b.f42455y);
                                            }
                                            ListContactNativeView.this.f74645s1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ot
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ListContactNativeView.C14504a.this.m81133g(bundle);
                                                }
                                            });
                                        }
                                    } else {
                                        Handler handler = ListContactNativeView.this.f74645s1;
                                        final String str = this.f74653a;
                                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.pt
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ListContactNativeView.C14504a.this.m81134h(str);
                                            }
                                        });
                                    }
                                } else if (i12 == 1) {
                                    Handler handler2 = ListContactNativeView.this.f74645s1;
                                    final ContactProfile contactProfile2 = this.f74654b;
                                    final String str2 = this.f74653a;
                                    handler2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.qt
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ListContactNativeView.C14504a.this.m81135i(contactProfile2, str2);
                                        }
                                    });
                                }
                            } else if (i13 != 0) {
                                if (this.f74656d) {
                                    ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f74654b.f42434r);
                                    if (mo98491j != null) {
                                        mo98491j.f42369Q = optInt2;
                                    }
                                    C7960e.m41971c6().m42566vd(this.f74654b.f42434r, optInt2);
                                    ListContactNativeView.this.f74645s1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.rt
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ListContactNativeView.C14504a.this.m81136j();
                                        }
                                    });
                                } else {
                                    AbstractC2364o0.m12373p(ListContactNativeView.this, 2);
                                }
                            } else {
                                AbstractC23063f2.m118349a(this.f74654b);
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23074g2.m118375a(0, this.f74653a, "", 6);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(ListContactNativeView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            ListContactNativeView.this.f74632h1 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(ListContactNativeView.this, 1);
                        }
                    }
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74636j1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74636j1 = false;
                }
                listContactNativeView.mo78960q3();
            } catch (Throwable th2) {
                ListContactNativeView listContactNativeView3 = ListContactNativeView.this;
                listContactNativeView3.f74636j1 = false;
                listContactNativeView3.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$b */
    /* loaded from: classes6.dex */
    class C14505b implements InterfaceC20094a {
        C14505b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(ListContactNativeView.this.m92652XI(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                ListContactNativeView listContactNativeView = ListContactNativeView.this;
                listContactNativeView.f74637k1 = false;
                listContactNativeView.mo78960q3();
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
                            ListContactNativeView listContactNativeView = ListContactNativeView.this;
                            C21933s.f107870s0 = listContactNativeView.f74634i1.f42434r;
                            ToastUtils.showMess(listContactNativeView.m92652XI(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(ListContactNativeView.this.f74634i1.f42434r);
                            C21933s.m114404I().m114421H0(ListContactNativeView.this.f74634i1.f42434r);
                            AbstractC23074g2.m118375a(0, ListContactNativeView.this.f74634i1.f42434r, "", 7);
                            AbstractC23063f2.m118349a(ListContactNativeView.this.f74634i1);
                        } else {
                            AbstractC23063f2.m118357i(i11, ListContactNativeView.this.f74634i1.f42434r);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(ListContactNativeView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            ListContactNativeView.this.f74632h1 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(ListContactNativeView.this, 1);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
                listContactNativeView2.f74637k1 = false;
                listContactNativeView2.mo78960q3();
            } catch (Throwable th2) {
                ListContactNativeView listContactNativeView3 = ListContactNativeView.this;
                listContactNativeView3.f74637k1 = false;
                listContactNativeView3.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$c */
    /* loaded from: classes6.dex */
    public class C14506c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74661a;

        C14506c(ContactProfile contactProfile) {
            this.f74661a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81138d() {
            C7072g3 c7072g3 = ListContactNativeView.this.f74598Q0;
            if (c7072g3 != null) {
                c7072g3.m10008p();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            listContactNativeView.f74631g2 = false;
            listContactNativeView.mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_message_with_code, Integer.valueOf(c20096c.m104491c())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int optInt = optJSONArray.optJSONObject(0).optInt("errorCode");
                    if (optInt == 0) {
                        AbstractC23063f2.m118363o(this.f74661a.f42434r);
                        C21920f.m114270a().m114273d(this.f74661a.f42434r);
                    } else if (optInt == -47) {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_undo_friend_request, Integer.valueOf(optInt)));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_message_with_code, Integer.valueOf(optInt)));
                    }
                }
                ListContactNativeView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.st
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListContactNativeView.C14506c.this.m81138d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            listContactNativeView.f74631g2 = false;
            listContactNativeView.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$d */
    /* loaded from: classes6.dex */
    public class C14507d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74663a;

        /* renamed from: b */
        final /* synthetic */ int f74664b;

        C14507d(ContactProfile contactProfile, int i11) {
            this.f74663a = contactProfile;
            this.f74664b = i11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            if (listContactNativeView.f74635i2 == null) {
                listContactNativeView.f74635i2 = new C0855y0();
            }
            HashMap m2384b = ListContactNativeView.this.f74635i2.m2384b();
            if (m2384b.containsKey(this.f74663a.f42434r)) {
                C23669z c23669z = (C23669z) m2384b.get(this.f74663a.f42434r);
                if (c23669z instanceof C23651h) {
                    C23651h c23651h = (C23651h) c23669z;
                    if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l()) {
                        String valueOf = String.valueOf(this.f74664b);
                        if (c23651h.f114659f[2].equals(valueOf)) {
                            String str = c23651h.f114659f[0];
                            if (str == null || str.isEmpty()) {
                                str = "1";
                            }
                            c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                        } else {
                            c23669z.f114656c = System.currentTimeMillis();
                            c23651h.f114659f[0] = String.valueOf(1);
                            String[] strArr = c23651h.f114659f;
                            strArr[2] = valueOf;
                            strArr[3] = ListContactNativeView.this.m81112MM(this.f74663a, this.f74664b);
                        }
                    } else {
                        return;
                    }
                }
            } else {
                C23651h m123961i = C23651h.m123961i(27, String.valueOf(1), this.f74663a.f42434r, String.valueOf(this.f74664b), ListContactNativeView.this.m81112MM(this.f74663a, this.f74664b));
                if (m123961i == null) {
                    return;
                }
                m123961i.f114654a = 3;
                m123961i.f114655b = 2;
                m123961i.f114657d = 27;
                m2384b.put(this.f74663a.f42434r, m123961i);
            }
            C23669z c23669z2 = (C23669z) m2384b.get(this.f74663a.f42434r);
            if (c23669z2 != null) {
                C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
            }
            ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
            if (listContactNativeView2.f74635i2 == null) {
                listContactNativeView2.f74635i2 = new C0855y0();
            }
            ListContactNativeView.this.f74635i2.m2387e(m2384b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$e */
    /* loaded from: classes6.dex */
    public class C14508e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f74666a;

        /* renamed from: b */
        final /* synthetic */ int f74667b;

        /* renamed from: c */
        final /* synthetic */ int f74668c;

        C14508e(List list, int i11, int i12) {
            this.f74666a = list;
            this.f74667b = i11;
            this.f74668c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            if (listContactNativeView.f74635i2 == null) {
                listContactNativeView.f74635i2 = new C0855y0();
            }
            HashMap m2385c = ListContactNativeView.this.f74635i2.m2385c();
            HashMap m2384b = ListContactNativeView.this.f74635i2.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f74666a.size();
            for (int i11 = 0; i11 < size; i11++) {
                ContactProfile contactProfile = (ContactProfile) this.f74666a.get(i11);
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                    String str = contactProfile.f42434r;
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
            ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
            if (listContactNativeView2.f74635i2 == null) {
                listContactNativeView2.f74635i2 = new C0855y0();
            }
            ListContactNativeView.this.f74635i2.m2386d(hashMap);
            ListContactNativeView.this.f74635i2.m2387e(hashMap2);
            ListContactNativeView.this.m81128zM(this.f74667b, this.f74668c, this.f74666a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$f */
    /* loaded from: classes6.dex */
    class C14509f extends C25982c {
        C14509f(C25984e c25984e) {
            super(c25984e);
        }

        @Override // rw.C25982c
        /* renamed from: g */
        public void mo81139g(C25985f c25985f) {
            if (c25985f.f123961a == 0) {
                ListContactNativeView.this.m81115hN(c25985f.f123964d);
            }
            super.mo81139g(c25985f);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$g */
    /* loaded from: classes6.dex */
    class C14510g extends ZdsActionBar.AbstractC16987c {
        C14510g() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            ListContactNativeView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$h */
    /* loaded from: classes6.dex */
    public class C14511h implements InterfaceC20094a {
        C14511h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81141d() {
            try {
                ListContactNativeView listContactNativeView = ListContactNativeView.this;
                listContactNativeView.m81116iN(listContactNativeView.f74630g1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ListContactNativeView listContactNativeView;
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74609V1 = false;
                    if (!listContactNativeView.f74617Z1) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("ListContactNativeView", e11.toString());
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74609V1 = false;
                    if (!listContactNativeView.f74617Z1) {
                        return;
                    }
                }
                listContactNativeView.mo78960q3();
            } catch (Throwable th2) {
                ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
                listContactNativeView2.f74609V1 = false;
                if (listContactNativeView2.f74617Z1) {
                    listContactNativeView2.mo78960q3();
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ListContactNativeView listContactNativeView;
            try {
                try {
                    C21933s.m114404I().m114459c0(ListContactNativeView.this.f74615Y1);
                    AbstractC23074g2.m118376b(1, ListContactNativeView.this.f74615Y1, "", 4);
                    AbstractC23063f2.m118362n(ListContactNativeView.this.f74615Y1);
                    Iterator it = ListContactNativeView.this.f74615Y1.iterator();
                    while (it.hasNext()) {
                        C25641k.m132506o().m132511C((String) it.next());
                    }
                    if (ListContactNativeView.this.f72421L0.m92676n2() != null) {
                        ListContactNativeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.tt
                            @Override // java.lang.Runnable
                            public final void run() {
                                ListContactNativeView.C14511h.this.m81141d();
                            }
                        });
                    }
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74609V1 = false;
                    if (!listContactNativeView.f74617Z1) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("ListContactNativeView", e11.toString());
                    listContactNativeView = ListContactNativeView.this;
                    listContactNativeView.f74609V1 = false;
                    if (!listContactNativeView.f74617Z1) {
                        return;
                    }
                }
                listContactNativeView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
                listContactNativeView2.f74609V1 = false;
                if (listContactNativeView2.f74617Z1) {
                    listContactNativeView2.f72421L0.mo78960q3();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$i */
    /* loaded from: classes6.dex */
    public class C14512i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74673a;

        /* renamed from: b */
        final /* synthetic */ String f74674b;

        C14512i(ContactProfile contactProfile, String str) {
            this.f74673a = contactProfile;
            this.f74674b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                ListContactNativeView.this.m81106DM(this.f74673a, -100);
            } else {
                ListContactNativeView.this.m81106DM(this.f74673a, -1);
            }
            ListContactNativeView.this.f74619a2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C22643c m117217a = C22643c.m117217a((JSONObject) obj);
                    if (m117217a != null) {
                        if (m117217a.f111048d == 1) {
                            if (m117217a.f111045a == 0 && m117217a.f111047c == 0) {
                                int i11 = m117217a.f111046b;
                                if (i11 == 0) {
                                    if (AbstractC21935u.m114554u(this.f74674b)) {
                                        ListContactNativeView.this.m81118kN(this.f74673a);
                                    } else {
                                        ListContactNativeView.this.m81107EM(this.f74673a, 1);
                                    }
                                } else if (i11 == 1) {
                                    ListContactNativeView.this.m81118kN(this.f74673a);
                                } else {
                                    ListContactNativeView.this.m81107EM(this.f74673a, 1);
                                }
                            } else if (m117217a.f111047c != 0) {
                                ListContactNativeView.this.m81117jN(this.f74673a);
                            } else {
                                ListContactNativeView.this.m81127yM(this.f74673a);
                            }
                        } else {
                            ListContactNativeView.this.m81107EM(this.f74673a, 1);
                        }
                    } else {
                        ListContactNativeView.this.m81106DM(this.f74673a, -1);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ListContactNativeView.this.m81106DM(this.f74673a, -1);
                }
                ListContactNativeView.this.f74619a2 = false;
            } catch (Throwable th2) {
                ListContactNativeView.this.f74619a2 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$j */
    /* loaded from: classes6.dex */
    public class C14513j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74676a;

        C14513j(ContactProfile contactProfile) {
            this.f74676a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                ListContactNativeView.this.m81106DM(this.f74676a, -100);
            } else {
                ListContactNativeView.this.m81106DM(this.f74676a, -2);
            }
            ListContactNativeView.this.f74621b2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            if (jSONObject2.getInt("code") != 0) {
                            }
                        }
                        ListContactNativeView.this.m81106DM(this.f74676a, -2);
                        C19669z.f97569Q.set(false);
                        C18644n.m98524E();
                        ListContactNativeView.this.f74621b2 = false;
                        return;
                    }
                    C7960e.m41971c6().m42136Gd(this.f74676a.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    c28203u6.m141827z(this.f74676a.f42434r, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f74676a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f74676a.f42434r);
                    C18644n.m98531l().m98540I(this.f74676a.f42434r);
                    c28203u6.m141804B(this.f74676a.f42434r, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f74676a.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f74676a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f74676a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f74676a.f42434r) && AbstractC21935u.m114515E(this.f74676a.f42434r) && AbstractC23306f.m120562A().m2529X(this.f74676a.f42434r)) {
                        C7959d.m41638d1().m41774b3(this.f74676a.f42434r, 2);
                    }
                    Map map = AbstractC23304d.f113421p;
                    synchronized (map) {
                        try {
                            if (map.containsKey(this.f74676a.f42434r)) {
                                C7960e.m41971c6().m42376e4(this.f74676a.f42434r);
                            }
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f74676a.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f74676a.f42434r);
                    C21927m.m114302u().m114352p0(this.f74676a.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f74676a.f42434r);
                    Handler handler = ListContactNativeView.this.f72827B0;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ut
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC23088h5.m118426g();
                            }
                        });
                    }
                    ListContactNativeView.this.m81107EM(this.f74676a, 2);
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f74676a.f42434r);
                } catch (Exception e11) {
                    e11.toString();
                    ListContactNativeView.this.m81106DM(this.f74676a, -2);
                }
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                ListContactNativeView.this.f74621b2 = false;
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                ListContactNativeView.this.f74621b2 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$k */
    /* loaded from: classes6.dex */
    public class C14514k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74678a;

        /* renamed from: b */
        final /* synthetic */ String f74679b;

        C14514k(ContactProfile contactProfile, String str) {
            this.f74678a = contactProfile;
            this.f74679b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                ListContactNativeView.this.m81106DM(this.f74678a, -100);
            } else {
                ListContactNativeView.this.m81106DM(this.f74678a, -3);
            }
            ListContactNativeView.this.f74623c2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2 != null && !jSONObject2.isNull("code")) {
                            if (jSONObject2.getInt("code") == 0) {
                                AbstractC23059e9.m118317F(this.f74679b);
                                AbstractC23063f2.m118364p(this.f74679b);
                                AbstractC23074g2.m118375a(1, this.f74679b, "", 5);
                                ListContactNativeView.this.m81107EM(this.f74678a, 3);
                            } else {
                                ListContactNativeView.this.m81106DM(this.f74678a, -3);
                            }
                        } else {
                            ListContactNativeView.this.m81106DM(this.f74678a, -3);
                        }
                    } else {
                        ListContactNativeView.this.m81106DM(this.f74678a, -3);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ListContactNativeView.this.m81106DM(this.f74678a, -3);
                }
                ListContactNativeView.this.f74623c2 = false;
            } catch (Throwable th2) {
                ListContactNativeView.this.f74623c2 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$l */
    /* loaded from: classes6.dex */
    public class C14515l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f74681a;

        C14515l(ContactProfile contactProfile) {
            this.f74681a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                ListContactNativeView.this.m81106DM(this.f74681a, -100);
            } else {
                ListContactNativeView.this.m81106DM(this.f74681a, -4);
            }
            ListContactNativeView.this.f74625d2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int optInt = optJSONArray.optJSONObject(0).optInt("errorCode");
                        if (optInt == 0) {
                            AbstractC23063f2.m118363o(this.f74681a.f42434r);
                            C21920f.m114270a().m114273d(this.f74681a.f42434r);
                            ListContactNativeView.this.m81107EM(this.f74681a, 4);
                        } else if (optInt == -47) {
                            ListContactNativeView.this.m81106DM(this.f74681a, -5);
                        } else {
                            ListContactNativeView.this.m81106DM(this.f74681a, -4);
                        }
                    } else {
                        ListContactNativeView.this.m81106DM(this.f74681a, -4);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ListContactNativeView.this.m81106DM(this.f74681a, -4);
                }
                ListContactNativeView.this.f74625d2 = false;
            } catch (Throwable th2) {
                ListContactNativeView.this.f74625d2 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$m */
    /* loaded from: classes6.dex */
    public class C14516m extends AbstractC18391a {
        C14516m() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            super.afterTextChanged(editable);
            try {
                RobotoEditText robotoEditText = ListContactNativeView.this.f74608V0;
                if (robotoEditText != null && robotoEditText.getText() != null) {
                    String trim = ListContactNativeView.this.f74608V0.getText().toString().trim();
                    ListContactNativeView.this.m81109IM(trim);
                    ImageView imageView = ListContactNativeView.this.f74610W0;
                    if (TextUtils.isEmpty(trim)) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    imageView.setVisibility(i11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$n */
    /* loaded from: classes6.dex */
    public class C14517n extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.zviews.ListContactNativeView$n$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f74685a;

            /* renamed from: b */
            final /* synthetic */ int f74686b;

            /* renamed from: c */
            final /* synthetic */ List f74687c;

            a(int i11, int i12, List list) {
                this.f74685a = i11;
                this.f74686b = i12;
                this.f74687c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                ListContactNativeView.this.m81128zM(this.f74685a, this.f74686b, this.f74687c);
            }
        }

        C14517n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            ListContactNativeView listContactNativeView = ListContactNativeView.this;
            RobotoEditText robotoEditText = listContactNativeView.f74608V0;
            if (robotoEditText != null && listContactNativeView.f74583C1) {
                AbstractC2379w.m12430d(robotoEditText);
            }
            if (i11 == 0) {
                ListContactNativeView listContactNativeView2 = ListContactNativeView.this;
                listContactNativeView2.f74583C1 = true;
                listContactNativeView2.f74598Q0.m36103R(false);
                ListContactNativeView.this.f74598Q0.m10008p();
                return;
            }
            ListContactNativeView.this.f74598Q0.m36103R(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                ListContactNativeView listContactNativeView = ListContactNativeView.this;
                LinearLayoutManager linearLayoutManager = listContactNativeView.f74600R0;
                if (linearLayoutManager != null && listContactNativeView.f74598Q0 != null) {
                    int m9740Y1 = linearLayoutManager.m9740Y1();
                    int m9745c2 = ListContactNativeView.this.f74600R0.m9745c2();
                    List m36098M = ListContactNativeView.this.f74598Q0.m36098M();
                    if (m36098M != null) {
                        C0809c1.m2050b(new a(m9740Y1, m9745c2, m36098M));
                    }
                }
                if (ZaloListView.m86975fN()) {
                    int height = ListContactNativeView.this.f74595O1.getHeight() - ListContactNativeView.this.f74606U0.getHeight();
                    float translationY = ListContactNativeView.this.f74595O1.getTranslationY() - i12;
                    float f11 = -height;
                    if (translationY < f11) {
                        translationY = f11;
                    }
                    if (translationY > 0.0f) {
                        translationY = 0.0f;
                    }
                    ListContactNativeView.this.f74595O1.setTranslationY(translationY);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: FM */
    private ContactProfile m81059FM(ContactProfile contactProfile) {
        ContactProfile m40356w = ContactProfile.m40356w(contactProfile);
        m40356w.f42440t = contactProfile.f42440t;
        m40356w.f42380T1 = true;
        return m40356w;
    }

    /* renamed from: GM */
    private void m81060GM() {
        SensitiveData sensitiveData = new SensitiveData("phonebook_sync_scan_in_phonebook_tab", "phonebook_sync");
        if (!C8937j0.m47663l(sensitiveData.m35528c())) {
            m81090oN();
            return;
        }
        C21916c.m114210e().f107749f.set(true);
        AbstractC23309i.m122626yr(0L);
        AbstractC0852x.m2338O(sensitiveData);
    }

    /* renamed from: KM */
    public static ListContactNativeView m81061KM() {
        return f74579j2;
    }

    /* renamed from: NM */
    private void m81062NM(View view) {
        this.f74596P0 = (RecyclerView) view.findViewById(AbstractC6918a0.recycle_view);
        this.f74602S0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f74608V0 = (RobotoEditText) view.findViewById(AbstractC6918a0.edit_search);
        this.f74610W0 = (ImageView) view.findViewById(AbstractC6918a0.clear);
        this.f74606U0 = view.findViewById(AbstractC6918a0.layout_search);
        this.f74612X0 = view.findViewById(AbstractC6918a0.layout_privacy_error);
        this.f74614Y0 = view.findViewById(AbstractC6918a0.layout_auto_submit_error);
        if (ZaloListView.m86975fN()) {
            this.f74588H1 = view.findViewById(AbstractC6918a0.header_page_all);
            this.f74586F1 = (RobotoTextViewStateAware) view.findViewById(AbstractC6918a0.title_all_contact);
            this.f74587G1 = (RobotoTextView) view.findViewById(AbstractC6918a0.title_count_contact);
            this.f74591K1 = view.findViewById(AbstractC6918a0.header_page_none_friend);
            this.f74589I1 = (RobotoTextViewStateAware) view.findViewById(AbstractC6918a0.title_none_friend);
            this.f74590J1 = (RobotoTextView) view.findViewById(AbstractC6918a0.title_count_none_friend);
            this.f74594N1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_last_update);
            this.f74592L1 = view.findViewById(AbstractC6918a0.img_update_phone_book);
            this.f74593M1 = view.findViewById(AbstractC6918a0.progress_update_phone_book);
            this.f74595O1 = view.findViewById(AbstractC6918a0.layout_header);
            this.f74616Z0 = view.findViewById(AbstractC6918a0.layout_sync_contact_success);
            this.f74618a1 = view.findViewById(AbstractC6918a0.layout_sync_contact_error);
            this.f74620b1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_sync_contact_error);
            this.f74624d1 = view.findViewById(AbstractC6918a0.layout_detail_info_contact);
            this.f74626e1 = view.findViewById(AbstractC6918a0.tv_detail_info_contact);
            this.f74628f1 = view.findViewById(AbstractC6918a0.img_info_contact);
            this.f74622c1 = view.findViewById(AbstractC6918a0.layout_empty_contact);
            this.f74624d1.setOnClickListener(this);
            this.f74628f1.setOnClickListener(this);
            this.f74588H1.setOnClickListener(this);
            this.f74591K1.setOnClickListener(this);
            this.f74592L1.setOnClickListener(this);
        }
        View view2 = new View(view.getContext());
        this.f74597P1 = view2;
        view2.setLayoutParams(new RecyclerView.LayoutParams(-1, 0));
        C7072g3 c7072g3 = new C7072g3(this.f74597P1);
        this.f74598Q0 = c7072g3;
        c7072g3.m36102Q(this.f74643q1);
        this.f74598Q0.m36101P(this);
        this.f74610W0.setOnClickListener(this);
        this.f74608V0.addTextChangedListener(new C14516m());
        this.f74608V0.setOnClickListener(this);
        View emptyView = this.f74602S0.getEmptyView();
        if (emptyView != null) {
            RobotoTextView robotoTextView = (RobotoTextView) emptyView.findViewById(AbstractC6918a0.btn_sync_phonebook);
            this.f74604T0 = robotoTextView;
            if (robotoTextView != null) {
                robotoTextView.setOnClickListener(this);
            }
            emptyView.setVisibility(8);
        }
        View errorView = this.f74602S0.getErrorView();
        if (errorView != null) {
            errorView.findViewById(AbstractC6918a0.btn_refresh).setOnClickListener(this);
            errorView.setVisibility(8);
        }
        View findViewById = this.f74612X0.findViewById(AbstractC6918a0.btn_sync_phonebook_error);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = this.f74614Y0.findViewById(AbstractC6918a0.btn_auto_sync_contact);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        AbstractC23309i.m121655Yu(AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112032i));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.getContext());
        this.f74600R0 = linearLayoutManager;
        this.f74596P0.setLayoutManager(linearLayoutManager);
        this.f74596P0.setAdapter(this.f74598Q0);
        this.f74596P0.m9826E(new C14517n());
        C31784b.m152808a(this.f74596P0).m152809b(this);
        C31784b.m152808a(this.f74596P0).m152810c(this);
        if (ZaloListView.m86975fN()) {
            m81092pN(this.f74643q1);
            m81098tN();
            this.f74595O1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.kt
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ListContactNativeView.this.m81068TM();
                }
            });
            this.f74597P1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.lt
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ListContactNativeView.this.m81069UM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m81063OM() {
        try {
            m81116iN(this.f74630g1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m81064PM(ContactProfile contactProfile, boolean z11) {
        C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), contactProfile.f42434r);
        if (m2801g != null) {
            AbstractC0852x.m2346c(m2801g);
            m2801g.m153291A(0L);
        }
        if (AbstractC0852x.m2355l(getContext(), contactProfile.f42455y, new SensitiveData("phonebook_delete_in_device_phonebook", "phonebook_delete"))) {
            this.f74644r1 = true;
            C21916c.m114210e().f107749f.set(false);
            C21917c0.m114228c().m114229a(contactProfile.f42455y);
            if (z11) {
                m81103AM(contactProfile);
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonebook_friends_delete_success));
                m81108HM(contactProfile);
                return;
            }
        }
        mo49315c4();
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonebook_friends_delete_fail));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m81065QM() {
        m81116iN(this.f74630g1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public /* synthetic */ void m81066RM() {
        m81116iN(this.f74630g1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public /* synthetic */ void m81067SM(int i11, String str) {
        try {
            m81098tN();
            if (this.f74603S1) {
                this.f74603S1 = false;
                this.f74592L1.setVisibility(0);
                this.f74593M1.setVisibility(8);
                if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
                    if (i11 == 0) {
                        if (TextUtils.isEmpty(str)) {
                            this.f74616Z0.setVisibility(0);
                            this.f74618a1.setVisibility(8);
                        } else {
                            JSONObject jSONObject = new JSONObject(str);
                            this.f74616Z0.setVisibility(8);
                            this.f74618a1.setVisibility(0);
                            this.f74620b1.setText(AbstractC23059e9.m118338q(jSONObject));
                        }
                    } else if (i11 == 50001) {
                        this.f74616Z0.setVisibility(8);
                        this.f74618a1.setVisibility(0);
                        this.f74620b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_contact_error_network));
                    } else {
                        this.f74616Z0.setVisibility(8);
                        this.f74618a1.setVisibility(0);
                        this.f74620b1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_submit_contact_success_msg, Integer.valueOf(i11)));
                    }
                }
                m81116iN(this.f74630g1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public /* synthetic */ void m81068TM() {
        try {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f74597P1.getLayoutParams();
            if (this.f74595O1.getHeight() != ((ViewGroup.MarginLayoutParams) layoutParams).height) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.f74595O1.getHeight();
                this.f74597P1.setLayoutParams(layoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public /* synthetic */ void m81069UM() {
        if (this.f74627e2 == 0) {
            int[] iArr = new int[2];
            this.f74597P1.getLocationOnScreen(iArr);
            this.f74627e2 = iArr[1];
        } else if (this.f74600R0.m9740Y1() == 0) {
            int[] iArr2 = new int[2];
            this.f74597P1.getLocationOnScreen(iArr2);
            int i11 = iArr2[1] - this.f74627e2;
            if (i11 > this.f74595O1.getTranslationY()) {
                if (i11 > 0) {
                    i11 = 0;
                }
                this.f74595O1.setTranslationY(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public /* synthetic */ void m81070VM() {
        mo49315c4();
        m81125vN(false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public /* synthetic */ void m81071WM() {
        try {
            this.f72421L0.invalidateOptionsMenu();
            m81116iN(this.f74630g1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ Void m81072XM() {
        this.f74645s1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.mt
            @Override // java.lang.Runnable
            public final void run() {
                ListContactNativeView.this.m81071WM();
            }
        }, 500L);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static /* synthetic */ void m81073YM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m81074ZM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_phonebook_friends_delete_action) {
            showDialog(3);
            AbstractC23647d.m123897g("3000217");
        } else if (intValue == AbstractC8020f0.str_delete_suggestion_menu_action_title && this.f74585E1 != null) {
            HashMap hashMap = new HashMap();
            ContactProfile contactProfile = this.f74585E1;
            hashMap.put(contactProfile.f42434r, new C31874cb(contactProfile));
            m81104BM(hashMap, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m81075aN(Object obj, int i11, int i12, List list) {
        try {
            RobotoEditText robotoEditText = this.f74608V0;
            if (robotoEditText != null && obj.equals(robotoEditText.getText().toString().trim())) {
                if (ZaloListView.m86975fN()) {
                    this.f74587G1.setText(String.valueOf(i11));
                    this.f74590J1.setText(String.valueOf(i12));
                }
                if (list.isEmpty()) {
                    list.add(new ContactProfile("-3"));
                }
                this.f74642p1 = 1;
                this.f74598Q0.m36104S(list);
                C21933s.m114404I().m114434O0(list);
                this.f74598Q0.m10008p();
                m81122rN(list, this.f74600R0.m9740Y1(), this.f74600R0.m9745c2());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m81076bN() {
        RobotoEditText robotoEditText;
        try {
            try {
                if (this.f74642p1 == 1 && (robotoEditText = this.f74608V0) != null && !TextUtils.isEmpty(robotoEditText.getText())) {
                    m81126wN(this.f74608V0.getText().toString().trim());
                } else {
                    m81125vN(true, this.f74649w1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f74640n1 = false;
        } catch (Throwable th2) {
            this.f74640n1 = false;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022e A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ff A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x035f A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039b A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ac A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d9 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042a A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0446 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0462 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x048b A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04c9 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0572 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0766 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0770 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x077d A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x079a A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103 A[Catch: Exception -> 0x0042, TryCatch #7 {Exception -> 0x0042, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x0024, B:9:0x002c, B:11:0x003e, B:13:0x0045, B:17:0x0048, B:19:0x005e, B:21:0x0064, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x0089, B:33:0x008d, B:35:0x009d, B:39:0x00a5, B:40:0x00aa, B:42:0x00b0, B:44:0x00b8, B:46:0x00c0, B:49:0x00cc, B:51:0x00d4, B:56:0x00dc, B:58:0x00e7, B:63:0x00f3, B:70:0x00fc, B:72:0x0103, B:73:0x0115, B:75:0x011b, B:78:0x0129, B:81:0x0131, B:85:0x0140, B:88:0x0149, B:91:0x0152, B:94:0x015a, B:97:0x0169, B:100:0x0173, B:119:0x0180, B:120:0x018c, B:122:0x0192, B:124:0x01a0, B:126:0x01a8, B:128:0x01b0, B:130:0x01b8, B:133:0x01c8, B:138:0x01d1, B:142:0x01da, B:144:0x01e7, B:146:0x01f7, B:147:0x01fd, B:149:0x0207, B:151:0x0211, B:161:0x021e, B:162:0x0228, B:164:0x022e, B:167:0x023d, B:170:0x024d, B:172:0x0255, B:175:0x025e, B:181:0x0271, B:184:0x027a, B:187:0x0283, B:189:0x028d, B:191:0x029a, B:192:0x02a2, B:194:0x02bc, B:196:0x02c6, B:197:0x0294, B:203:0x024b, B:208:0x02d6, B:210:0x02e7, B:212:0x02ed, B:214:0x02ff, B:218:0x0356, B:219:0x030a, B:223:0x0317, B:228:0x0322, B:231:0x032a, B:233:0x0338, B:234:0x0340, B:237:0x0359, B:239:0x035f, B:241:0x036d, B:243:0x0375, B:246:0x0379, B:247:0x037b, B:249:0x039b, B:250:0x03a3, B:252:0x03ac, B:254:0x03b4, B:256:0x03c0, B:258:0x03ce, B:259:0x03c4, B:261:0x03cc, B:265:0x03d1, B:267:0x03d9, B:269:0x03e1, B:271:0x03ec, B:273:0x03f6, B:275:0x03fb, B:277:0x0407, B:279:0x040a, B:282:0x03e9, B:284:0x040d, B:286:0x041e, B:288:0x0423, B:290:0x042a, B:292:0x0438, B:294:0x043b, B:297:0x043e, B:299:0x0446, B:301:0x0454, B:303:0x0457, B:306:0x045a, B:308:0x0462, B:310:0x0470, B:312:0x0473, B:315:0x0476, B:317:0x048b, B:319:0x0498, B:320:0x049d, B:321:0x049b, B:322:0x04a9, B:324:0x04af, B:326:0x04b5, B:327:0x04bf, B:329:0x04c9, B:331:0x04ef, B:333:0x04f7, B:338:0x0500, B:343:0x050d, B:347:0x051a, B:349:0x0532, B:350:0x0548, B:337:0x054e, B:359:0x0561, B:404:0x0758, B:408:0x0755, B:471:0x0760, B:473:0x0766, B:475:0x076c, B:477:0x0770, B:478:0x0779, B:480:0x077d, B:481:0x0786, B:482:0x0790, B:484:0x079a, B:486:0x079f, B:487:0x07ab, B:489:0x0556), top: B:2:0x0002 }] */
    /* renamed from: cN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m81077cN() {
        HashSet hashSet;
        boolean z11;
        ArrayList arrayList;
        int size;
        int size2;
        ArrayList arrayList2;
        boolean z12;
        boolean z13;
        int size3;
        int i11;
        ArrayList arrayList3;
        int i12;
        char charAt;
        String str;
        boolean z14;
        boolean z15;
        boolean z16;
        String str2;
        int i13;
        int i14;
        int size4;
        int size5;
        int size6;
        int size7;
        int i15;
        C18635e c18635e;
        C31901e8 m2800f;
        C31901e8 m2800f2;
        try {
            List<C31934gb> m114184g = C21913a0.m114177i().m114184g();
            C25642l m132522r = C25641k.m132506o().m132522r();
            List m2327D = AbstractC0852x.m2327D(MainApplication.getAppContext());
            if (m132522r != null) {
                for (int size8 = m132522r.size() - 1; size8 >= 0; size8--) {
                    C31874cb c31874cb = (C31874cb) m132522r.get(size8);
                    if (c31874cb != null && !AbstractC0906d0.m2796b(this.f72421L0.m92648SI().getApplicationContext(), c31874cb.f146394j)) {
                        m132522r.remove(size8);
                    }
                }
            }
            Context appContext = MainApplication.getAppContext();
            ArrayList arrayList4 = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList5 = new ArrayList();
            if (m2327D != null && m2327D.size() > 0) {
                hashSet = new HashSet();
                int size9 = m2327D.size();
                for (int i16 = 0; i16 < size9; i16++) {
                    C31901e8 c31901e8 = (C31901e8) m2327D.get(i16);
                    if (c31901e8 != null && !TextUtils.isEmpty(c31901e8.m153298m())) {
                        hashSet.add(c31901e8.m153298m());
                    }
                }
            } else {
                hashSet = null;
            }
            ArrayList arrayList6 = new ArrayList();
            ArrayList<C31934gb> arrayList7 = new ArrayList();
            if (!ZaloListView.m86975fN() && this.f74643q1 != 0) {
                z11 = false;
                int i17 = 0;
                for (C31934gb c31934gb : m114184g) {
                    if (c31934gb != null && !TextUtils.isEmpty(c31934gb.f146729a) && !TextUtils.equals(CoreUtility.f89233i, c31934gb.f146729a) && (z11 || (!AbstractC21935u.m114558y(c31934gb.f146729a) && !AbstractC21935u.m114536c(c31934gb.f146729a)))) {
                        arrayList7.add(c31934gb);
                        if ((TextUtils.isEmpty(c31934gb.f146732d) || TextUtils.isEmpty(c31934gb.f146733e)) && i17 < 5000) {
                            arrayList6.add(c31934gb.f146729a);
                            i17++;
                        }
                    }
                }
                HashSet hashSet2 = new HashSet();
                if (z11) {
                    Iterator it = new ArrayList(C18644n.m98531l().mo98465a(null, false)).iterator();
                    while (it.hasNext()) {
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        if (!hashSet2.contains(contactProfile.f42434r) && !TextUtils.isEmpty(contactProfile.f42455y) && !C21917c0.m114228c().m114231d(contactProfile.f42455y) && (m132522r == null || !m132522r.m132531g(contactProfile.f42434r))) {
                            if (!AbstractC25495a.m132078c(contactProfile.f42434r) && (m2800f2 = AbstractC0906d0.m2800f(appContext, contactProfile.f42455y)) != null) {
                                jSONArray.put(contactProfile.f42434r);
                                arrayList4.add(contactProfile);
                                hashSet2.add(contactProfile.f42434r);
                                if (hashSet != null && hashSet.contains(m2800f2.m153298m())) {
                                    arrayList5.add(m81059FM(contactProfile));
                                    jSONArray.put(contactProfile.f42434r);
                                }
                            }
                        }
                    }
                    Iterator<E> it2 = C21927m.m114302u().m114312J().iterator();
                    while (it2.hasNext()) {
                        ContactProfile contactProfile2 = (ContactProfile) it2.next();
                        if (!hashSet2.contains(contactProfile2.f42434r) && !TextUtils.isEmpty(contactProfile2.f42455y) && (m2800f = AbstractC0906d0.m2800f(appContext, contactProfile2.f42455y)) != null && AbstractC21935u.m114536c(contactProfile2.f42434r) && !C21917c0.m114228c().m114231d(contactProfile2.f42455y) && ((m132522r == null || !m132522r.m132531g(contactProfile2.f42434r)) && !AbstractC25495a.m132078c(contactProfile2.f42434r))) {
                            jSONArray.put(contactProfile2.f42434r);
                            if (TextUtils.isEmpty(contactProfile2.f42440t)) {
                                String m120002o = AbstractC23262x6.m120002o(contactProfile2.m40383Q(true, false));
                                if (!TextUtils.isEmpty(m120002o)) {
                                    contactProfile2.f42440t = m120002o.trim();
                                }
                            }
                            arrayList4.add(contactProfile2);
                            hashSet2.add(contactProfile2.f42434r);
                            if (hashSet != null && hashSet.contains(m2800f.m153298m())) {
                                arrayList5.add(m81059FM(contactProfile2));
                                jSONArray.put(contactProfile2.f42434r);
                            }
                        }
                    }
                }
                C18635e m141813j = C28203u6.f131407a.m141813j(arrayList6);
                for (C31934gb c31934gb2 : arrayList7) {
                    if (!hashSet2.contains(c31934gb2.f146729a)) {
                        ContactProfile m153478a = c31934gb2.m153478a();
                        ContactProfile mo98491j = m141813j.mo98491j(c31934gb2.f146729a);
                        if (mo98491j == null) {
                            i15 = 0;
                        } else {
                            i15 = mo98491j.f42394Y0;
                        }
                        m153478a.f42394Y0 = i15;
                        m153478a.f42373R0 = 41;
                        if (i15 == 0) {
                            C31901e8 m2800f3 = AbstractC0906d0.m2800f(appContext, c31934gb2.f146730b);
                            if (m2800f3 != null) {
                                c18635e = m141813j;
                                if (!C21917c0.m114228c().m114231d(m153478a.f42455y) && ((m132522r == null || !m132522r.m132531g(m153478a.f42434r)) && !AbstractC25495a.m132078c(m153478a.f42434r))) {
                                    if (!TextUtils.isEmpty(m2800f3.m153297j())) {
                                        m153478a.f42360N = m2800f3.m153297j();
                                    } else {
                                        m153478a.f42360N = m153478a.f42455y;
                                    }
                                    if (mo98491j != null) {
                                        m153478a.f42446v = mo98491j.f42446v;
                                        m153478a.f42437s = mo98491j.f42437s;
                                    }
                                    m153478a.f42440t = AbstractC23262x6.m120002o(m153478a.m40383Q(true, false)).trim();
                                    arrayList4.add(m153478a);
                                    jSONArray.put(c31934gb2.f146729a);
                                    if (hashSet != null && hashSet.contains(m2800f3.m153298m())) {
                                        arrayList5.add(m81059FM(m153478a));
                                        jSONArray.put(c31934gb2.f146729a);
                                    }
                                }
                            }
                        } else {
                            c18635e = m141813j;
                        }
                        m141813j = c18635e;
                    }
                }
                boolean z17 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                arrayList = new ArrayList();
                if (m132522r != null && !m132522r.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList(m132522r);
                    Collections.sort(arrayList8, AbstractC25636f.f122586a);
                    for (size7 = arrayList8.size() - 1; size7 >= 0; size7--) {
                        C31874cb c31874cb2 = (C31874cb) arrayList8.get(size7);
                        if (c31874cb2.f146390f <= 0 && !C21917c0.m114228c().m114231d(c31874cb2.f146385a) && !hashSet2.contains(c31874cb2.f146385a) && (z11 || !AbstractC21935u.m114554u(c31874cb2.f146385a))) {
                            ContactProfile m153177a = c31874cb2.m153177a();
                            ContactProfile m141811g = C28203u6.f131407a.m141811g(c31874cb2.f146385a);
                            if (m141811g != null) {
                                m153177a.f42437s = m141811g.f42437s;
                                m153177a.f42446v = m141811g.f42446v;
                            }
                            m153177a.f42393Y = true;
                            m153177a.f42403c1 = ZaloListView.m86975fN();
                            arrayList.add(m153177a);
                            jSONArray.put(c31874cb2.f146385a);
                            hashSet2.add(c31874cb2.f146385a);
                        }
                    }
                }
                if (!ZaloListView.m86975fN()) {
                    String m122788d = AbstractC23352g.m122788d(jSONArray.toString());
                    if (!TextUtils.isEmpty(m122788d) && m122788d.equals(this.f74641o1)) {
                        m81114fN();
                        return;
                    }
                    this.f74641o1 = m122788d;
                }
                Collections.sort(arrayList4, new Comparator() { // from class: com.zing.zalo.ui.zviews.xs
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m81078dN;
                        m81078dN = ListContactNativeView.m81078dN((ContactProfile) obj, (ContactProfile) obj2);
                        return m81078dN;
                    }
                });
                MiniProfileView.m81811kM();
                ArrayList arrayList9 = new ArrayList(arrayList);
                this.f74648v1 = arrayList9;
                arrayList9.addAll(arrayList4);
                C21933s.m114404I().m114432N0(this.f74648v1);
                if (z11) {
                    this.f74601R1 = this.f74648v1.size();
                }
                int i18 = 0;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    ContactProfile contactProfile3 = (ContactProfile) arrayList.get(size);
                    if (z17 && C21927m.m114302u().m114345m(contactProfile3.f42434r)) {
                        arrayList.remove(size);
                    } else if (!AbstractC21935u.m114554u(contactProfile3.f42434r)) {
                        i18++;
                    }
                }
                for (size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
                    ContactProfile contactProfile4 = (ContactProfile) arrayList4.get(size2);
                    if (contactProfile4 == null || TextUtils.isEmpty(contactProfile4.f42434r)) {
                        arrayList4.remove(size2);
                    }
                    if (contactProfile4.f42434r.equals(CoreUtility.f89233i)) {
                        arrayList4.remove(size2);
                    }
                    if (z17 && C21927m.m114302u().m114345m(contactProfile4.f42434r)) {
                        arrayList4.remove(size2);
                    }
                }
                this.f74650x1 = arrayList.size() + arrayList4.size();
                if (ZaloListView.m86975fN() && this.f74643q1 == 1) {
                    for (size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                        if (AbstractC21935u.m114554u(((ContactProfile) arrayList.get(size4)).f42434r)) {
                            arrayList.remove(size4);
                        }
                    }
                    for (size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                        if (AbstractC21935u.m114554u(((ContactProfile) arrayList5.get(size5)).f42434r)) {
                            arrayList5.remove(size5);
                        }
                    }
                    for (size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                        if (AbstractC21935u.m114554u(((ContactProfile) arrayList4.get(size6)).f42434r)) {
                            arrayList4.remove(size6);
                        }
                    }
                }
                String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);
                arrayList2 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    ContactProfile contactProfile5 = new ContactProfile("-5");
                    if (ZaloListView.m86975fN()) {
                        i14 = AbstractC8020f0.str_contact_native_new;
                    } else {
                        i14 = AbstractC8020f0.str_phonefriends_recentupdate_section;
                    }
                    contactProfile5.f42437s = AbstractC23136l9.m118743r0(i14);
                    arrayList2.add(contactProfile5);
                    arrayList2.addAll(arrayList);
                }
                if (!ZaloListView.m86975fN() && arrayList2.size() > 0) {
                    arrayList2.add(new ContactProfile("-6"));
                }
                int size10 = arrayList2.size();
                if (!arrayList5.isEmpty()) {
                    Collections.sort(arrayList5, new Comparator() { // from class: com.zing.zalo.ui.zviews.ys
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m81079eN;
                            m81079eN = ListContactNativeView.m81079eN((ContactProfile) obj, (ContactProfile) obj2);
                            return m81079eN;
                        }
                    });
                    ContactProfile contactProfile6 = new ContactProfile("-7");
                    contactProfile6.f42437s = "(*)";
                    contactProfile6.f42335E1 = 1;
                    contactProfile6.f42407e1 = true;
                    contactProfile6.f42403c1 = false;
                    arrayList2.add(contactProfile6);
                    int size11 = arrayList5.size();
                    boolean z18 = false;
                    for (int i19 = 0; i19 < size11; i19++) {
                        ContactProfile contactProfile7 = (ContactProfile) arrayList5.get(i19);
                        if (contactProfile7 != null && !TextUtils.isEmpty(contactProfile7.f42434r) && !contactProfile7.f42434r.equals(CoreUtility.f89233i) && (!z17 || !C21927m.m114302u().m114345m(contactProfile7.f42434r))) {
                            contactProfile7.m40403e1(true);
                            contactProfile7.f42403c1 = false;
                            contactProfile7.f42405d1 = false;
                            contactProfile7.f42399a1.clear();
                            if (C23302b.f113247a.m120523d(contactProfile7.f42446v)) {
                                contactProfile7.f42427o1 = AbstractC23028c0.m118087g(contactProfile7.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                            }
                            arrayList2.add(contactProfile7);
                            if (!z18) {
                                z18 = true;
                            }
                        }
                    }
                    if (z18) {
                        z12 = false;
                        z13 = true;
                        this.f74633h2 = arrayList2.size();
                        char c11 = '#';
                        boolean z19 = z12;
                        int i21 = -1;
                        i11 = 0;
                        for (size3 = arrayList4.size(); i11 < size3; size3 = i12) {
                            try {
                                ContactProfile contactProfile8 = (ContactProfile) arrayList4.get(i11);
                                if (TextUtils.isEmpty(contactProfile8.f42440t)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("");
                                    arrayList3 = arrayList4;
                                    i12 = size3;
                                    try {
                                        sb2.append(contactProfile8.m40385R(true, false, C18631a.m98446i().f93755g.get()).trim().charAt(0));
                                        charAt = AbstractC23262x6.m120002o(sb2.toString()).trim().toUpperCase(Locale.ENGLISH).charAt(0);
                                    } catch (Exception e11) {
                                        e = e11;
                                        e.printStackTrace();
                                        i11++;
                                        arrayList4 = arrayList3;
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    i12 = size3;
                                    charAt = ("" + contactProfile8.f42440t.trim().charAt(0)).toUpperCase(Locale.ENGLISH).charAt(0);
                                }
                                i21++;
                                if (i21 != 0) {
                                    if (string.indexOf(c11) != -1) {
                                        if (charAt > c11) {
                                            if (string.indexOf(charAt) != -1) {
                                                ContactProfile contactProfile9 = new ContactProfile("-2");
                                                contactProfile9.f42437s = "" + charAt;
                                                contactProfile9.f42407e1 = z19;
                                                if (!z13) {
                                                    i13 = 1;
                                                    try {
                                                        contactProfile9.f42407e1 = true;
                                                        z13 = true;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        z19 = false;
                                                        e.printStackTrace();
                                                        i11++;
                                                        arrayList4 = arrayList3;
                                                    }
                                                } else {
                                                    i13 = 1;
                                                }
                                                contactProfile9.f42403c1 = false;
                                                contactProfile9.f42335E1 = i13;
                                                int size12 = arrayList2.size();
                                                if (size12 > 0) {
                                                    int i22 = size12 - 1;
                                                    if (((ContactProfile) arrayList2.get(i22)).m40366G0()) {
                                                        ((ContactProfile) arrayList2.get(i22)).f42405d1 = true;
                                                    }
                                                }
                                                arrayList2.add(contactProfile9);
                                                z14 = true;
                                                z16 = false;
                                            } else {
                                                ContactProfile contactProfile10 = new ContactProfile("-2");
                                                if (string.indexOf(charAt) == -1) {
                                                    str2 = "##";
                                                } else {
                                                    str2 = "" + charAt;
                                                }
                                                contactProfile10.f42437s = str2;
                                                contactProfile10.f42335E1 = 1;
                                                if (!z13) {
                                                    contactProfile10.f42407e1 = true;
                                                    z13 = true;
                                                }
                                                contactProfile10.f42403c1 = false;
                                                arrayList2.add(contactProfile10);
                                            }
                                        }
                                        z16 = z19;
                                        z14 = true;
                                    } else {
                                        if (string.indexOf(charAt) != -1) {
                                            ContactProfile contactProfile11 = new ContactProfile("-2");
                                            contactProfile11.f42437s = "" + charAt;
                                            contactProfile11.f42335E1 = 1;
                                            contactProfile11.f42407e1 = z19;
                                            if (!z13) {
                                                contactProfile11.f42407e1 = true;
                                                z13 = true;
                                            }
                                            contactProfile11.f42403c1 = false;
                                            int size13 = arrayList2.size();
                                            if (size13 > 0) {
                                                int i23 = size13 - 1;
                                                if (((ContactProfile) arrayList2.get(i23)).m40366G0()) {
                                                    ((ContactProfile) arrayList2.get(i23)).f42405d1 = true;
                                                }
                                            }
                                            arrayList2.add(contactProfile11);
                                            z14 = true;
                                            z16 = false;
                                        }
                                        z16 = z19;
                                        z14 = true;
                                    }
                                    z15 = false;
                                } else {
                                    ContactProfile contactProfile12 = new ContactProfile("-2");
                                    if (string.indexOf(charAt) == -1) {
                                        str = "#";
                                    } else {
                                        try {
                                            str = "" + charAt;
                                        } catch (Exception e13) {
                                            e = e13;
                                            e.printStackTrace();
                                            i11++;
                                            arrayList4 = arrayList3;
                                        }
                                    }
                                    contactProfile12.f42437s = str;
                                    z14 = true;
                                    contactProfile12.f42335E1 = 1;
                                    contactProfile12.f42407e1 = z19;
                                    if (!z13) {
                                        try {
                                            contactProfile12.f42407e1 = true;
                                            z13 = true;
                                        } catch (Exception e14) {
                                            e = e14;
                                            z19 = false;
                                            e.printStackTrace();
                                            i11++;
                                            arrayList4 = arrayList3;
                                        }
                                    }
                                    z15 = false;
                                    try {
                                        contactProfile12.f42403c1 = false;
                                        arrayList2.add(contactProfile12);
                                        z16 = false;
                                    } catch (Exception e15) {
                                        e = e15;
                                        z19 = false;
                                        e.printStackTrace();
                                        i11++;
                                        arrayList4 = arrayList3;
                                    }
                                }
                                try {
                                    contactProfile8.m40403e1(z14);
                                    contactProfile8.f42403c1 = z15;
                                    contactProfile8.f42405d1 = z15;
                                    contactProfile8.f42399a1.clear();
                                    if (C23302b.f113247a.m120523d(contactProfile8.f42446v)) {
                                        try {
                                            contactProfile8.f42427o1 = AbstractC23028c0.m118087g(contactProfile8.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                                        } catch (Exception e16) {
                                            e = e16;
                                            z19 = z16;
                                            e.printStackTrace();
                                            i11++;
                                            arrayList4 = arrayList3;
                                        }
                                    }
                                    if (!AbstractC21935u.m114554u(contactProfile8.f42434r)) {
                                        i18++;
                                    }
                                    arrayList2.add(contactProfile8);
                                    c11 = charAt;
                                    z19 = z16;
                                } catch (Exception e17) {
                                    e = e17;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                arrayList3 = arrayList4;
                                i12 = size3;
                            }
                            i11++;
                            arrayList4 = arrayList3;
                        }
                        if (!ZaloListView.m86975fN() && arrayList2.size() > size10) {
                            if (this.f74652z1 == null) {
                                this.f74652z1 = new ContactProfile("-4");
                            }
                            if (this.f74581A1 == null) {
                                this.f74581A1 = new ContactProfile("-1");
                            }
                            arrayList2.add(size10, this.f74652z1);
                            arrayList2.add(this.f74581A1);
                        }
                        this.f74649w1 = arrayList2;
                        this.f74651y1 = i18;
                        if (arrayList2.isEmpty() && this.f74643q1 == 1) {
                            this.f74649w1.add(new ContactProfile("-9"));
                        }
                        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.zs
                            @Override // java.lang.Runnable
                            public final void run() {
                                ListContactNativeView.this.m81076bN();
                            }
                        });
                    }
                    arrayList2.remove(arrayList2.size() - 1);
                }
                z12 = true;
                z13 = false;
                this.f74633h2 = arrayList2.size();
                char c112 = '#';
                boolean z192 = z12;
                int i212 = -1;
                i11 = 0;
                while (i11 < size3) {
                }
                if (!ZaloListView.m86975fN()) {
                    if (this.f74652z1 == null) {
                    }
                    if (this.f74581A1 == null) {
                    }
                    arrayList2.add(size10, this.f74652z1);
                    arrayList2.add(this.f74581A1);
                }
                this.f74649w1 = arrayList2;
                this.f74651y1 = i18;
                if (arrayList2.isEmpty()) {
                    this.f74649w1.add(new ContactProfile("-9"));
                }
                this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.zs
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListContactNativeView.this.m81076bN();
                    }
                });
            }
            z11 = true;
            int i172 = 0;
            while (r0.hasNext()) {
            }
            HashSet hashSet22 = new HashSet();
            if (z11) {
            }
            C18635e m141813j2 = C28203u6.f131407a.m141813j(arrayList6);
            while (r4.hasNext()) {
            }
            boolean z172 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
            arrayList = new ArrayList();
            if (m132522r != null) {
                ArrayList arrayList82 = new ArrayList(m132522r);
                Collections.sort(arrayList82, AbstractC25636f.f122586a);
                while (size7 >= 0) {
                }
            }
            if (!ZaloListView.m86975fN()) {
            }
            Collections.sort(arrayList4, new Comparator() { // from class: com.zing.zalo.ui.zviews.xs
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m81078dN;
                    m81078dN = ListContactNativeView.m81078dN((ContactProfile) obj, (ContactProfile) obj2);
                    return m81078dN;
                }
            });
            MiniProfileView.m81811kM();
            ArrayList arrayList92 = new ArrayList(arrayList);
            this.f74648v1 = arrayList92;
            arrayList92.addAll(arrayList4);
            C21933s.m114404I().m114432N0(this.f74648v1);
            if (z11) {
            }
            int i182 = 0;
            while (size >= 0) {
            }
            while (size2 >= 0) {
            }
            this.f74650x1 = arrayList.size() + arrayList4.size();
            if (ZaloListView.m86975fN()) {
                while (size4 >= 0) {
                }
                while (size5 >= 0) {
                }
                while (size6 >= 0) {
                }
            }
            String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);
            arrayList2 = new ArrayList();
            if (!arrayList.isEmpty()) {
            }
            if (!ZaloListView.m86975fN()) {
                arrayList2.add(new ContactProfile("-6"));
            }
            int size102 = arrayList2.size();
            if (!arrayList5.isEmpty()) {
            }
            z12 = true;
            z13 = false;
            this.f74633h2 = arrayList2.size();
            char c1122 = '#';
            boolean z1922 = z12;
            int i2122 = -1;
            i11 = 0;
            while (i11 < size3) {
            }
            if (!ZaloListView.m86975fN()) {
            }
            this.f74649w1 = arrayList2;
            this.f74651y1 = i182;
            if (arrayList2.isEmpty()) {
            }
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.zs
                @Override // java.lang.Runnable
                public final void run() {
                    ListContactNativeView.this.m81076bN();
                }
            });
        } catch (Exception e19) {
            e19.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public static /* synthetic */ int m81078dN(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public static /* synthetic */ int m81079eN(ContactProfile contactProfile, ContactProfile contactProfile2) {
        if (contactProfile != null && contactProfile2 != null) {
            if (TextUtils.isEmpty(contactProfile.f42440t)) {
                return -1;
            }
            if (TextUtils.isEmpty(contactProfile2.f42440t)) {
                return 1;
            }
            return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public void m81081gN(ContactProfile contactProfile) {
        TrackingSource trackingSource = new TrackingSource(41);
        trackingSource.m40677a("sourceView", 8);
        C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
        AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(47)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.ft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m81072XM;
                m81072XM = ListContactNativeView.this.m81072XM();
                return m81072XM;
            }
        });
    }

    /* renamed from: oN */
    private void m81090oN() {
        if (this.f74605T1 == null) {
            this.f74605T1 = C23046d7.m118242e(getContext());
        }
        if (!this.f74605T1.m92868m()) {
            this.f74605T1.mo13822K();
        }
    }

    /* renamed from: pN */
    private void m81092pN(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f74643q1 = i11;
        this.f74598Q0.m36102Q(i11);
        m81116iN(this.f74630g1);
        RobotoTextViewStateAware robotoTextViewStateAware = this.f74586F1;
        boolean z16 = false;
        if (this.f74643q1 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextViewStateAware.setSelected(z11);
        RobotoTextView robotoTextView = this.f74587G1;
        if (this.f74643q1 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        robotoTextView.setSelected(z12);
        View view = this.f74588H1;
        if (this.f74643q1 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        view.setSelected(z13);
        RobotoTextViewStateAware robotoTextViewStateAware2 = this.f74589I1;
        if (this.f74643q1 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        robotoTextViewStateAware2.setSelected(z14);
        RobotoTextView robotoTextView2 = this.f74590J1;
        if (this.f74643q1 == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        robotoTextView2.setSelected(z15);
        View view2 = this.f74591K1;
        if (this.f74643q1 == 1) {
            z16 = true;
        }
        view2.setSelected(z16);
    }

    /* renamed from: qN */
    private void m81094qN(int i11, ContactProfile contactProfile) {
        C0809c1.m2050b(new C14507d(contactProfile, i11));
    }

    /* renamed from: tN */
    private void m81098tN() {
        String m119185C;
        if (AbstractC23309i.m122353rd() == 0) {
            if (!AbstractC0852x.m2365v() && !AbstractC0852x.m2364u()) {
                if (AbstractC23309i.m121261O6() == 0) {
                    m119185C = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdatePhoneBookStateNone);
                } else {
                    m119185C = AbstractC23160o0.m119185C(AbstractC23309i.m121261O6());
                }
            } else {
                m119185C = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            }
        } else {
            m119185C = AbstractC23160o0.m119185C(AbstractC23309i.m122353rd());
        }
        if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
            this.f74594N1.setText(m119185C);
        } else {
            this.f74594N1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_book_status_unknown_exception));
        }
    }

    /* renamed from: AM */
    public void m81103AM(ContactProfile contactProfile) {
        try {
            String str = contactProfile.f42434r;
            if (this.f74619a2) {
                return;
            }
            this.f74619a2 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14512i(contactProfile, str));
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            m81106DM(contactProfile, -1);
            this.f74619a2 = false;
        }
    }

    /* renamed from: BM */
    void m81104BM(Map map, boolean z11) {
        if (this.f74609V1) {
            return;
        }
        this.f74617Z1 = z11;
        if (z11) {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        }
        try {
            ArrayList arrayList = new ArrayList();
            this.f74615Y1.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add((C31874cb) entry.getValue());
                this.f74615Y1.add(str);
            }
            if (!arrayList.isEmpty()) {
                this.f74609V1 = true;
                this.f74611W1.mo1704o8(this.f74613X1);
                this.f74611W1.mo1453I7(arrayList, TrackingSource.m40665d(8));
                return;
            }
            C21933s.m114404I().m114459c0(this.f74615Y1);
            Iterator it = this.f74615Y1.iterator();
            while (it.hasNext()) {
                C25641k.m132506o().m132511C((String) it.next());
            }
            AbstractC23074g2.m118376b(1, this.f74615Y1, "", 4);
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ct
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListContactNativeView.this.m81063OM();
                    }
                });
            }
            this.f74609V1 = false;
            if (z11) {
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("ListContactNativeView", e11.toString());
            this.f74609V1 = false;
            if (z11) {
                this.f72421L0.mo78960q3();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        this.f72421L0.m92637BK(true);
        super.mo37111CJ(bundle);
        f74579j2 = this;
        if (bundle != null) {
            this.f74642p1 = bundle.getInt("state.search_mode", 0);
            this.f74643q1 = bundle.getInt("state.filter_mode", 0);
            this.f74630g1 = bundle.getBoolean("state.ignore_auto_sync", false);
            this.f74601R1 = bundle.getInt("state.full_list_size", 0);
        }
        C25983d c25983d = new C25983d("lnt-sch");
        c25983d.start();
        this.f74582B1 = new C14509f(c25983d.m133836a());
    }

    /* renamed from: CM */
    void m81105CM(final ContactProfile contactProfile, final boolean z11) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C21913a0.m114177i().m114185h().execute(new Runnable() { // from class: com.zing.zalo.ui.zviews.nt
                @Override // java.lang.Runnable
                public final void run() {
                    ListContactNativeView.this.m81064PM(contactProfile, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return super.mo39014DJ(i11);
                }
                return new C7998b(this.f72421L0.m92648SI(), this.f74585E1, this).m43063d();
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(m92652XI(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.btn_accept_Invitation), this);
            C8009j m43152a = aVar.m43152a();
            m43152a.mo13822K();
            return m43152a;
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43159h(5).m43172u(m92652XI(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f74632h1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
        C8009j m43152a2 = aVar2.m43152a();
        m43152a2.mo13822K();
        return m43152a2;
    }

    /* renamed from: DM */
    public void m81106DM(ContactProfile contactProfile, int i11) {
        if (i11 != -100) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonefriend_delete_connect_fail_common));
        } else {
            ToastUtils.m89262j();
        }
        m81108HM(contactProfile);
    }

    @Override // com.zing.zalo.adapters.C7072g3.a
    /* renamed from: E8 */
    public void mo36105E8() {
        C17487o0 c17487o0;
        try {
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(PhoneBookView.class, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    public void m81107EM(ContactProfile contactProfile, int i11) {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonebook_friends_delete_success));
        m81108HM(contactProfile);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        int i12;
        try {
            super.mo37482FJ(actionBarMenu);
            actionBarMenu.m92750r();
            if (!ZaloListView.m86975fN() && this.f74601R1 > 0) {
                ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_settings);
                this.f74607U1 = m92738e;
                Context context = getContext();
                int i13 = AbstractC8020f0.str_contact_native_filter_all;
                if (this.f74643q1 == 0) {
                    i11 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i11 = AbstractC16803z.btn_radio_off_holo_light;
                }
                m92738e.m92774j(AbstractC23136l9.m118727m(context, 0, i13, i11));
                ActionBarMenuItem actionBarMenuItem = this.f74607U1;
                Context context2 = getContext();
                int i14 = AbstractC8020f0.str_contact_native_filter_none_friend;
                if (this.f74643q1 == 1) {
                    i12 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i12 = AbstractC16803z.btn_radio_off_holo_light;
                }
                actionBarMenuItem.m92774j(AbstractC23136l9.m118727m(context2, 1, i14, i12));
                this.f74607U1.setMenuItemListener(new ActionBarMenuItem.InterfaceC17434c() { // from class: com.zing.zalo.ui.zviews.et
                    @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.InterfaceC17434c
                    /* renamed from: a */
                    public final void mo87298a() {
                        ListContactNativeView.m81073YM();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        if (ZaloListView.m86975fN()) {
            i11 = AbstractC7409c0.list_contact_native_new;
        } else {
            i11 = AbstractC7409c0.list_contact_native_view;
        }
        View inflate = layoutInflater.inflate(i11, viewGroup, false);
        m81062NM(inflate);
        return inflate;
    }

    /* renamed from: HM */
    public void m81108HM(ContactProfile contactProfile) {
        if (contactProfile != null && contactProfile.f42393Y) {
            HashMap hashMap = new HashMap();
            hashMap.put(contactProfile.f42434r, new C31874cb(contactProfile));
            m81104BM(hashMap, false);
        }
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.dt
            @Override // java.lang.Runnable
            public final void run() {
                ListContactNativeView.this.m81066RM();
            }
        }, 300L);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        f74579j2 = null;
        super.mo39024IJ();
    }

    /* renamed from: IM */
    public void m81109IM(String str) {
        try {
            if (this.f74598Q0 != null) {
                if (TextUtils.isEmpty(str)) {
                    this.f74582B1.removeMessages(0);
                    this.f74642p1 = 0;
                    if (ZaloListView.m86975fN()) {
                        this.f74587G1.setText(String.valueOf(this.f74650x1));
                        this.f74590J1.setText(String.valueOf(this.f74651y1));
                    }
                    this.f74598Q0.m36104S(this.f74649w1);
                    this.f74598Q0.m10008p();
                    m81122rN(this.f74649w1, this.f74600R0.m9740Y1(), this.f74600R0.m9745c2());
                    return;
                }
                this.f74582B1.removeMessages(0);
                this.f74582B1.m133832p(this.f74582B1.m133825i(0, str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JM */
    public void m81110JM(final int i11, final String str) {
        if (ZaloListView.m86975fN() && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jt
                @Override // java.lang.Runnable
                public final void run() {
                    ListContactNativeView.this.m81067SM(i11, str);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (i11 == -1) {
                if (interfaceC17463d.mo92862f() == 2) {
                    interfaceC17463d.dismiss();
                    ContactProfile contactProfile = this.f74634i1;
                    if (contactProfile != null) {
                        m81081gN(contactProfile);
                    }
                }
            } else if (i11 == -2) {
                if (interfaceC17463d.mo92862f() == 1) {
                    interfaceC17463d.dismiss();
                    ContactProfile contactProfile2 = this.f74634i1;
                    if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r)) {
                        ContactProfile contactProfile3 = new ContactProfile(this.f74634i1.f42434r);
                        ContactProfile contactProfile4 = this.f74634i1;
                        contactProfile3.f42446v = contactProfile4.f42446v;
                        contactProfile3.f42455y = contactProfile4.f42455y;
                        contactProfile3.f42437s = contactProfile4.f42437s;
                        contactProfile3.f42437s = contactProfile3.m40383Q(true, false);
                        Bundle m140776b = new C27870vb(contactProfile3.mo2478b()).m140780g(contactProfile3).m140776b();
                        if (m92676n2() != null) {
                            m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    public void m81111LM(ContactProfile contactProfile, boolean z11, boolean z12) {
        try {
            String str = contactProfile.f42434r;
            this.f74634i1 = contactProfile;
            if (this.f74636j1) {
                return;
            }
            this.f72421L0.mo46829Y();
            this.f74636j1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14504a(str, contactProfile, z11, z12));
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f74636j1 = false;
        }
    }

    /* renamed from: MM */
    String m81112MM(ContactProfile contactProfile, int i11) {
        if (this.f74642p1 != 0) {
            return "3";
        }
        if (contactProfile.f42380T1) {
            return "2";
        }
        if (i11 >= this.f74633h2) {
            return "3";
        }
        return "1";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_view_title));
                m87077NK.setLeadingFunctionCallback(new C14510g());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 0 || i11 == 1) {
            try {
                this.f74643q1 = i11;
                this.f74598Q0.m36102Q(i11);
                m81116iN(this.f74630g1);
                this.f72421L0.invalidateOptionsMenu();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (this.f74644r1) {
            this.f74644r1 = false;
            m81060GM();
        } else {
            C21916c.m114210e().f107749f.set(true);
        }
        RobotoEditText robotoEditText = this.f74608V0;
        if (robotoEditText != null) {
            AbstractC2379w.m12430d(robotoEditText);
        }
        C23744a.m124114c().m124117e(this, 6088);
        C23744a.m124114c().m124117e(this, 6089);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            bundle.putInt("state.search_mode", this.f74642p1);
            bundle.putInt("state.filter_mode", this.f74643q1);
            bundle.putBoolean("state.ignore_auto_sync", this.f74630g1);
            bundle.putInt("state.full_list_size", this.f74601R1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // zc0.C31784b.e
    /* renamed from: T3 */
    public boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
        ContactProfile m36097L;
        String str;
        try {
            C7072g3 c7072g3 = this.f74598Q0;
            if (c7072g3 != null && (m36097L = c7072g3.m36097L(i11)) != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(m36097L.f42455y) && AbstractC0906d0.m2800f(MainApplication.getAppContext(), m36097L.f42455y) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonebook_friends_delete_action));
                    hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_phonebook_friends_delete_action));
                    arrayList.add(hashMap);
                } else {
                    if (!m36097L.f42393Y) {
                        return false;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_phonebook_friends_delete_action));
                    hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_delete_suggestion_menu_action_title));
                    arrayList.add(hashMap2);
                }
                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43172u(m36097L.m40383Q(true, false));
                aVar.m43173v(3);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bt
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ListContactNativeView.this.m81074ZM(simpleAdapter, interfaceC17463d, i12);
                    }
                });
                C8009j c8009j = this.f74584D1;
                if (c8009j == null || !c8009j.m92868m()) {
                    if (!m36097L.f42380T1) {
                        if (m36097L.f42393Y) {
                            str = "3000223";
                        } else {
                            str = "3000216";
                        }
                        AbstractC23647d.m123897g(str);
                    } else {
                        AbstractC23647d.m123897g("3000226");
                    }
                    this.f74585E1 = m36097L;
                    C8009j m43152a = aVar.m43152a();
                    this.f74584D1 = m43152a;
                    m43152a.mo13822K();
                }
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
    }

    @Override // com.zing.zalo.adapters.C7072g3.a
    /* renamed from: Yd */
    public void mo36106Yd(ContactProfile contactProfile, int i11, boolean z11) {
        try {
            this.f74634i1 = contactProfile;
            m81111LM(contactProfile, false, z11);
            if (!z11) {
                if (this.f74642p1 == 0) {
                    if (!contactProfile.f42380T1) {
                        AbstractC23647d.m123897g("3000205");
                    } else {
                        AbstractC23647d.m123897g("5801142");
                    }
                } else {
                    AbstractC23647d.m123897g("30002042");
                }
            } else if (this.f74642p1 == 0) {
                AbstractC23647d.m123897g("3000211");
            } else {
                AbstractC23647d.m123897g("30002044");
            }
            C0815e1.m2075D().m2099U(3, 3, 27, String.valueOf(1), contactProfile.f42434r, String.valueOf(i11), m81112MM(contactProfile, i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    void m81114fN() {
        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.at
            @Override // java.lang.Runnable
            public final void run() {
                ListContactNativeView.this.m81070VM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        AbstractC25636f.m132478h();
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ListContactNativeView";
    }

    /* renamed from: hN */
    public void m81115hN(final Object obj) {
        List list;
        final int i11;
        try {
            if ((obj instanceof String) && (list = this.f74648v1) != null && list.size() > 0) {
                int i12 = 0;
                final List m120007t = AbstractC23262x6.m120007t((String) obj, this.f74648v1, this.f74647u1, true, false);
                final int size = m120007t.size();
                if (ZaloListView.m86975fN()) {
                    for (int i13 = size - 1; i13 >= 0; i13--) {
                        if (!AbstractC21935u.m114554u(((ContactProfile) m120007t.get(i13)).f42434r)) {
                            i12++;
                        } else if (this.f74643q1 == 1) {
                            m120007t.remove(i13);
                        }
                    }
                    i11 = i12;
                } else {
                    i11 = 0;
                }
                Handler handler = this.f74645s1;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ws
                        @Override // java.lang.Runnable
                        public final void run() {
                            ListContactNativeView.this.m81075aN(obj, size, i11, m120007t);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // zc0.C31784b.d
    /* renamed from: i0 */
    public void mo17458i0(RecyclerView recyclerView, int i11, View view) {
        ContactProfile m36097L;
        C17487o0 c17487o0;
        String str;
        String str2;
        try {
            C7072g3 c7072g3 = this.f74598Q0;
            if (c7072g3 != null && (m36097L = c7072g3.m36097L(i11)) != null) {
                TrackingSource trackingSource = new TrackingSource(41);
                trackingSource.m40677a("sourceView", 8);
                C21927m.m114302u().m114330e0(m36097L.f42434r, trackingSource);
                if (this.f72421L0.m92676n2() != null) {
                    c17487o0 = this.f72421L0.m92676n2().mo35579p();
                } else {
                    c17487o0 = null;
                }
                C17487o0 c17487o02 = c17487o0;
                if (c17487o02 != null) {
                    AbstractC23059e9.m118317F(m36097L.f42434r);
                    C31874cb c31874cb = new C31874cb(m36097L);
                    c31874cb.f146381C = true;
                    if (this.f74642p1 == 0) {
                        AbstractC23074g2.m118380f(c31874cb, c17487o02, 0, 2, 0, 6, 41);
                        if (!m36097L.f42380T1) {
                            if (m36097L.f42393Y) {
                                str2 = "3000221";
                            } else {
                                str2 = "3000203";
                            }
                            AbstractC23647d.m123897g(str2);
                        } else {
                            AbstractC23647d.m123897g("3000225");
                        }
                    } else {
                        AbstractC23074g2.m118380f(c31874cb, c17487o02, 0, 2, 0, 7, 41);
                        if (m36097L.f42393Y) {
                            str = "3000222";
                        } else {
                            str = "30002041";
                        }
                        AbstractC23647d.m123905o(str);
                    }
                }
                m81094qN(i11, m36097L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iN */
    void m81116iN(boolean z11) {
        if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) != 0) {
            m81119lN();
            m81125vN(true, null);
            return;
        }
        if (!C8937j0.m47663l("phonebook_sync_scan_in_phonebook_tab")) {
            m81090oN();
            return;
        }
        this.f74630g1 = z11;
        if (!z11 && !AbstractC23057e7.m118297d()) {
            m81119lN();
            m81125vN(true, null);
            return;
        }
        if (AbstractC23309i.m121259O4() != 1) {
            if (C23055e5.m118271f()) {
                m81121nN(true);
                if (!C21916c.m114210e().m114218i()) {
                    m81060GM();
                }
            } else {
                m81125vN(true, null);
            }
            m81119lN();
            return;
        }
        if (this.f74640n1) {
            return;
        }
        this.f74640n1 = true;
        C7072g3 c7072g3 = this.f74598Q0;
        if (c7072g3 != null && c7072g3.mo10003k() == 0) {
            m81121nN(true);
        }
        C21913a0.m114177i().m114185h().execute(new Runnable() { // from class: com.zing.zalo.ui.zviews.ht
            @Override // java.lang.Runnable
            public final void run() {
                ListContactNativeView.this.m81077cN();
            }
        });
    }

    /* renamed from: jN */
    public void m81117jN(ContactProfile contactProfile) {
        if (!this.f74623c2) {
            this.f74623c2 = true;
            String str = contactProfile.f42434r;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14514k(contactProfile, str));
            c0766k.mo1751u7(contactProfile.f42434r, TrackingSource.m40665d(8));
            return;
        }
        m81106DM(contactProfile, -3);
    }

    /* renamed from: kN */
    void m81118kN(ContactProfile contactProfile) {
        if (!this.f74621b2) {
            this.f74621b2 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14513j(contactProfile));
            c0766k.mo1791z6(contactProfile.f42434r, 8);
            return;
        }
        m81106DM(contactProfile, -2);
    }

    @Override // com.zing.zalo.dialog.C7998b.a
    /* renamed from: ky */
    public void mo43064ky(ContactProfile contactProfile, boolean z11) {
        if (contactProfile != null) {
            this.f74585E1 = contactProfile;
            m81105CM(contactProfile, z11);
        }
    }

    /* renamed from: lN */
    void m81119lN() {
        this.f74642p1 = 0;
        RobotoEditText robotoEditText = this.f74608V0;
        if (robotoEditText != null && !TextUtils.isEmpty(robotoEditText.getText())) {
            this.f74608V0.setText("");
        }
    }

    /* renamed from: mN */
    public void m81120mN(String str, int i11) {
        String str2;
        if (this.f74637k1) {
            return;
        }
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        if (m114310H == null) {
            str2 = "";
        } else {
            str2 = m114310H.m40682o();
        }
        this.f74637k1 = true;
        this.f74646t1.mo1704o8(this.f74629f2);
        this.f74646t1.mo1620d7(str, "", i11, str2);
    }

    /* renamed from: nN */
    void m81121nN(boolean z11) {
        try {
            View view = this.f74622c1;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.f74642p1 == 0) {
                if (z11) {
                    this.f74602S0.setVisibility(0);
                    this.f74602S0.setState(MultiStateView.EnumC15914e.LOADING);
                    if (ZaloListView.m86975fN()) {
                        this.f74595O1.setVisibility(8);
                    } else {
                        this.f74606U0.setVisibility(8);
                    }
                    this.f74612X0.setVisibility(8);
                    this.f74614Y0.setVisibility(8);
                    return;
                }
                if (!AbstractC23034c6.m118116D(this.f72421L0.getContext(), AbstractC23034c6.f112032i)) {
                    this.f74602S0.setVisibility(8);
                    this.f74602S0.setState(MultiStateView.EnumC15914e.EMPTY);
                    if (ZaloListView.m86975fN()) {
                        this.f74595O1.setVisibility(8);
                    } else {
                        this.f74606U0.setVisibility(8);
                    }
                    this.f74612X0.setVisibility(0);
                    this.f74614Y0.setVisibility(8);
                    AbstractC23647d.m123897g("3000208");
                    return;
                }
                if (!this.f74630g1 && !AbstractC23057e7.m118297d()) {
                    this.f74602S0.setVisibility(8);
                    this.f74602S0.setState(MultiStateView.EnumC15914e.EMPTY);
                    if (ZaloListView.m86975fN()) {
                        this.f74595O1.setVisibility(8);
                    } else {
                        this.f74606U0.setVisibility(8);
                    }
                    this.f74612X0.setVisibility(8);
                    this.f74614Y0.setVisibility(0);
                    AbstractC23647d.m123897g("3000214");
                    return;
                }
                C7072g3 c7072g3 = this.f74598Q0;
                if (c7072g3 != null && c7072g3.mo10003k() > 0) {
                    this.f74598Q0.m10008p();
                    this.f74602S0.setVisibility(8);
                    this.f74612X0.setVisibility(8);
                    if (ZaloListView.m86975fN()) {
                        this.f74595O1.setVisibility(0);
                    }
                    this.f74606U0.setVisibility(0);
                    this.f74614Y0.setVisibility(8);
                    return;
                }
                if (AbstractC23309i.m121259O4() != 1) {
                    this.f74602S0.setVisibility(0);
                    this.f74602S0.setState(MultiStateView.EnumC15914e.ERROR);
                    if (ZaloListView.m86975fN()) {
                        this.f74595O1.setVisibility(8);
                    } else {
                        this.f74606U0.setVisibility(8);
                    }
                    this.f74612X0.setVisibility(8);
                    this.f74614Y0.setVisibility(8);
                    return;
                }
                this.f74602S0.setVisibility(8);
                this.f74602S0.setState(MultiStateView.EnumC15914e.EMPTY);
                if (ZaloListView.m86975fN()) {
                    this.f74595O1.setVisibility(0);
                    this.f74606U0.setVisibility(8);
                    View view2 = this.f74622c1;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                } else {
                    this.f74606U0.setVisibility(8);
                }
                this.f74612X0.setVisibility(8);
                this.f74614Y0.setVisibility(8);
                AbstractC23647d.m123897g("3000209");
                return;
            }
            if (z11) {
                this.f74602S0.setVisibility(0);
                this.f74612X0.setVisibility(8);
                this.f74602S0.setState(MultiStateView.EnumC15914e.LOADING);
                if (ZaloListView.m86975fN()) {
                    this.f74595O1.setVisibility(8);
                } else {
                    this.f74606U0.setVisibility(8);
                }
                this.f74614Y0.setVisibility(8);
                return;
            }
            C7072g3 c7072g32 = this.f74598Q0;
            if (c7072g32 != null) {
                c7072g32.m10008p();
            }
            this.f74602S0.setVisibility(8);
            this.f74612X0.setVisibility(8);
            if (ZaloListView.m86975fN()) {
                this.f74595O1.setVisibility(0);
            }
            this.f74606U0.setVisibility(0);
            this.f74614Y0.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C7072g3 c7072g3;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 100 && i12 == -1 && (c7072g3 = this.f74598Q0) != null) {
            c7072g3.m10008p();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_sync_phonebook) {
            mo36105E8();
            AbstractC23647d.m123897g("3000207");
            return;
        }
        if (id2 == AbstractC6918a0.btn_sync_phonebook_error) {
            Context context = this.f72421L0.getContext();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118116D(context, strArr)) {
                m81116iN(this.f74630g1);
            } else {
                AbstractC23034c6.m118184v0(this.f72421L0, strArr, 108);
            }
            AbstractC23647d.m123897g("3000210");
            return;
        }
        if (id2 == AbstractC6918a0.btn_auto_sync_contact) {
            if (C23055e5.m118272g(true)) {
                m81116iN(true);
            }
            AbstractC23647d.m123897g("3000213");
            return;
        }
        if (id2 == AbstractC6918a0.clear) {
            RobotoEditText robotoEditText = this.f74608V0;
            if (robotoEditText != null) {
                robotoEditText.setText("");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.edit_search) {
            AbstractC23647d.m123897g("3000204");
            return;
        }
        if (id2 == AbstractC6918a0.btn_refresh) {
            if (C23055e5.m118272g(true)) {
                m81060GM();
                m81116iN(this.f74630g1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.header_page_all) {
            m81092pN(0);
            return;
        }
        if (id2 == AbstractC6918a0.header_page_none_friend) {
            m81092pN(1);
            return;
        }
        if (id2 == AbstractC6918a0.img_update_phone_book) {
            if (!AbstractC0852x.m2364u() && !AbstractC0852x.m2365v()) {
                Context m92648SI = this.f72421L0.m92648SI();
                String[] strArr2 = AbstractC23034c6.f112032i;
                if (AbstractC23034c6.m118167n(m92648SI, strArr2) != 0) {
                    AbstractC23034c6.m118186w0((BaseZaloActivity) this.f72421L0.m92648SI(), strArr2, 101);
                    return;
                } else if (C8937j0.m47663l("phonebook_sync_scan_in_phonebook_tab")) {
                    this.f74603S1 = true;
                    m81124uN();
                    return;
                } else {
                    m81090oN();
                    return;
                }
            }
            return;
        }
        if (id2 == AbstractC6918a0.layout_detail_info_contact) {
            this.f74624d1.setVisibility(8);
            return;
        }
        if (id2 == AbstractC6918a0.img_info_contact) {
            this.f74624d1.setVisibility(0);
            int[] iArr = new int[2];
            this.f74628f1.getLocationOnScreen(iArr);
            this.f74626e1.setTranslationY(((iArr[1] + AbstractC23136l9.m118742r(22.0f)) - AbstractC23136l9.m118737p0()) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height));
            if (this.f74599Q1 == null) {
                C30802d c30802d = new C30802d(iArr[0] - AbstractC23136l9.m118742r(63.0f), AbstractC23136l9.m118742r(12.0f), 0, 0);
                this.f74599Q1 = c30802d;
                c30802d.m149869b(C23212s8.m119607o(this.f74626e1.getContext(), AbstractC16781w.AppPrimaryColor));
                this.f74599Q1.m149868a(true);
                AbstractC23136l9.m118696b1(this.f74626e1, this.f74599Q1);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC25636f.m132478h();
            f74579j2 = null;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) == 0 && i11 == 108) {
            m81060GM();
            m81116iN(this.f74630g1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        f74579j2 = this;
        C21916c.m114210e().f107749f.set(false);
        m81116iN(this.f74630g1);
        C23744a.m124114c().m124115b(this, 6088);
        C23744a.m124114c().m124115b(this, 6089);
    }

    /* renamed from: rN */
    void m81122rN(List list, int i11, int i12) {
        if (AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C14508e(new ArrayList(list), i11, i12));
    }

    /* renamed from: sN */
    void m81123sN(ContactProfile contactProfile) {
        if (this.f74631g2) {
            return;
        }
        this.f74631g2 = true;
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14506c(contactProfile));
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 7);
        if (C21927m.m114302u().m114307E(contactProfile.f42434r) == -1) {
            C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
        }
        c0766k.mo1534S8(contactProfile.f42434r, trackingSource.m40682o());
    }

    /* renamed from: uN */
    void m81124uN() {
        RobotoTextView robotoTextView = this.f74594N1;
        if (robotoTextView != null) {
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating));
        }
        this.f74593M1.setVisibility(0);
        this.f74592L1.setVisibility(8);
        this.f74616Z0.setVisibility(8);
        this.f74618a1.setVisibility(8);
        if (System.currentTimeMillis() - f74580k2 > 3600000) {
            AbstractC23309i.m122105kr(0L);
            f74580k2 = System.currentTimeMillis();
        }
        C21916c.m114210e().f107749f.set(true);
        AbstractC0852x.m2340Q(new SensitiveData("phonebook_sync_scan_in_phonebook_tab", "phonebook_sync"));
        AbstractC23309i.m121139Kw(8);
        AbstractC23057e7.m118305l(true);
    }

    /* renamed from: vN */
    void m81125vN(boolean z11, List list) {
        if (z11) {
            this.f74642p1 = 0;
            C7072g3 c7072g3 = this.f74598Q0;
            if (c7072g3 != null) {
                c7072g3.m36104S(list);
                if (ZaloListView.m86975fN()) {
                    this.f74587G1.setText(String.valueOf(this.f74650x1));
                    this.f74590J1.setText(String.valueOf(this.f74651y1));
                }
                LinearLayoutManager linearLayoutManager = this.f74600R0;
                if (linearLayoutManager != null) {
                    m81122rN(list, linearLayoutManager.m9740Y1(), this.f74600R0.m9745c2());
                }
            }
        }
        m81121nN(false);
        mo49315c4();
        this.f72421L0.invalidateOptionsMenu();
        this.f74640n1 = false;
    }

    /* renamed from: wN */
    void m81126wN(String str) {
        int i11;
        m81109IM(str);
        ImageView imageView = this.f74610W0;
        if (TextUtils.isEmpty(str)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        m81121nN(false);
        mo49315c4();
        this.f74640n1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6088) {
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gt
                @Override // java.lang.Runnable
                public final void run() {
                    ListContactNativeView.this.m81065QM();
                }
            });
        } else if (i11 == 6089) {
            m81114fN();
        }
    }

    /* renamed from: yM */
    public void m81127yM(ContactProfile contactProfile) {
        if (!this.f74625d2) {
            this.f74625d2 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14515l(contactProfile));
            TrackingSource trackingSource = new TrackingSource(41);
            trackingSource.m40677a("sourceView", 8);
            c0766k.mo1534S8(contactProfile.f42434r, trackingSource.m40682o());
            return;
        }
        m81106DM(contactProfile, -4);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0112 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0007, B:12:0x001b, B:14:0x001f, B:17:0x002f, B:19:0x0035, B:21:0x003d, B:23:0x0045, B:35:0x005c, B:37:0x0062, B:39:0x006a, B:44:0x0074, B:46:0x0081, B:48:0x008f, B:50:0x0096, B:52:0x009c, B:56:0x00a2, B:58:0x00ae, B:60:0x00b4, B:62:0x00bc, B:64:0x00ca, B:67:0x0108, B:69:0x0112, B:72:0x00dd, B:76:0x00fb, B:43:0x011d, B:84:0x0124, B:86:0x012a, B:88:0x0132, B:94:0x015b, B:95:0x0143, B:97:0x014d, B:99:0x0151, B:106:0x015e, B:108:0x0162, B:109:0x0169, B:112:0x0028, B:113:0x0014), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d A[SYNTHETIC] */
    /* renamed from: zM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m81128zM(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        ContactProfile contactProfile;
        C23669z c23669z;
        ContactProfile contactProfile2;
        C23669z c23669z2;
        ContactProfile contactProfile3;
        try {
            if (AbstractC23309i.m120962G3(3) != 1) {
                return;
            }
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size == 0) {
                return;
            }
            C0855y0 c0855y0 = this.f74635i2;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            for (int i13 = 0; i13 < size; i13++) {
                if (list.get(i13) != null && (contactProfile3 = (ContactProfile) list.get(i13)) != null && m2385c.containsKey(contactProfile3.f42434r)) {
                    ((C23669z) m2385c.get(contactProfile3.f42434r)).f114661h = false;
                }
            }
            for (int i14 = i11; i14 <= i12; i14++) {
                if (i14 >= 0 && i14 < size && list.get(i14) != null && (contactProfile2 = (ContactProfile) list.get(i14)) != null && !contactProfile2.f42434r.startsWith("-")) {
                    String valueOf = String.valueOf(i14);
                    if (m2385c.containsKey(contactProfile2.f42434r)) {
                        C23669z c23669z3 = (C23669z) m2385c.get(contactProfile2.f42434r);
                        c23669z3.f114661h = true;
                        if (c23669z3 instanceof C23651h) {
                            C23651h c23651h = (C23651h) c23669z3;
                            if (c23651h.f114659f != null && c23651h.m123964l() && !c23669z3.f114660g) {
                                c23669z3.f114660g = true;
                                if (c23651h.f114659f[2].equals(valueOf)) {
                                    String str = c23651h.f114659f[0];
                                    if (str == null || str.isEmpty()) {
                                        str = "1";
                                    }
                                    c23651h.f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                                } else {
                                    c23669z3.f114656c = System.currentTimeMillis();
                                    c23651h.f114659f[0] = String.valueOf(1);
                                    c23651h.f114659f[2] = valueOf;
                                }
                            }
                        }
                        c23669z2 = (C23669z) m2385c.get(contactProfile2.f42434r);
                        if (c23669z2 == null) {
                            C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
                        }
                    } else {
                        C23651h m123961i = C23651h.m123961i(27, String.valueOf(1), contactProfile2.f42434r, valueOf, m81112MM(contactProfile2, i14));
                        if (m123961i != null) {
                            m123961i.f114654a = 3;
                            m123961i.f114655b = 1;
                            m123961i.f114657d = 27;
                            m123961i.f114660g = true;
                            m2385c.put(contactProfile2.f42434r, m123961i);
                            c23669z2 = (C23669z) m2385c.get(contactProfile2.f42434r);
                            if (c23669z2 == null) {
                            }
                        }
                    }
                }
            }
            for (int i15 = 0; i15 < size; i15++) {
                if (list.get(i15) != null && (contactProfile = (ContactProfile) list.get(i15)) != null && !contactProfile.f42434r.startsWith("-")) {
                    if ((i15 < i11 || i15 > i12) && (c23669z = (C23669z) m2385c.get(contactProfile.f42434r)) != null && !c23669z.f114661h) {
                        ((C23669z) m2385c.get(contactProfile.f42434r)).f114660g = false;
                    }
                }
            }
            if (this.f74635i2 == null) {
                this.f74635i2 = new C0855y0();
            }
            this.f74635i2.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7072g3.a
    /* renamed from: zc */
    public void mo36107zc(ContactProfile contactProfile, int i11) {
        m81123sN(contactProfile);
    }
}
