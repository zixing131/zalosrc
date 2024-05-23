package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0804b;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7028c4;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetDeleteStrangerMessage;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.StrangerMessagesView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23088h5;
import me0.AbstractC23116k0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p131ei.C18434b;
import p132ej.C18440b;
import p132ej.C18451m;
import p142ey.C18644n;
import p161fg.C18922m;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p716zh.C31862c;
import p716zh.C32044o1;
import u00.C26939u;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.C28203u6;
import wd0.C28923c;
import wd0.C28928h;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class StrangerMessagesView extends SlidableZaloView implements InterfaceC17463d.d, InterfaceC0733x, C23744a.c {

    /* renamed from: Q0 */
    View f78031Q0;

    /* renamed from: R0 */
    RecyclerView f78032R0;

    /* renamed from: S0 */
    C7028c4 f78033S0;

    /* renamed from: T0 */
    ArrayList f78034T0;

    /* renamed from: U0 */
    MultiStateView f78035U0;

    /* renamed from: V0 */
    RobotoTextView f78036V0;

    /* renamed from: X0 */
    ContactProfile f78038X0;

    /* renamed from: a1 */
    C8009j f78041a1;

    /* renamed from: b1 */
    HandlerThread f78042b1;

    /* renamed from: c1 */
    Handler f78043c1;

    /* renamed from: d1 */
    private FrameLayout f78044d1;

    /* renamed from: e1 */
    private C28923c f78045e1;

    /* renamed from: f1 */
    Snackbar f78046f1;

    /* renamed from: P0 */
    final String f78030P0 = StrangerMessagesView.class.getSimpleName();

    /* renamed from: W0 */
    int f78037W0 = -1;

    /* renamed from: Y0 */
    boolean f78039Y0 = false;

    /* renamed from: Z0 */
    String f78040Z0 = "";

    /* renamed from: g1 */
    boolean f78047g1 = false;

    /* renamed from: h1 */
    Boolean f78048h1 = Boolean.FALSE;

    /* renamed from: i1 */
    boolean f78049i1 = false;

    /* renamed from: j1 */
    boolean f78050j1 = false;

    /* renamed from: k1 */
    boolean f78051k1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$a */
    /* loaded from: classes6.dex */
    public class C15126a implements InterfaceC13567b1.a {
        C15126a() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            StrangerMessagesView.this.m84808SM(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$b */
    /* loaded from: classes6.dex */
    public class C15127b extends AbstractC0939u {
        C15127b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84846d(ArrayList arrayList) {
            try {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.f78034T0 = arrayList;
                strangerMessagesView.f78033S0.m35934T(arrayList);
                StrangerMessagesView.this.m84839YM(false);
                StrangerMessagesView.this.f72421L0.invalidateOptionsMenu();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            boolean z11;
            boolean z12;
            try {
                if (StrangerMessagesView.this.f78033S0 != null) {
                    ArrayList arrayList = new ArrayList();
                    List m41747S0 = C7959d.m41638d1().m41747S0(2);
                    boolean z13 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                    int size = m41747S0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Conversation conversation = (Conversation) m41747S0.get(i11);
                        if (conversation != null) {
                            String str = conversation.f42893q;
                            if ((!z13 || !C21927m.m114302u().m114345m(str)) && C32044o1.m154612r().m154637z(str) == null) {
                                if (C23302b.f113247a.m120523d(conversation.f42895s)) {
                                    conversation.m40998a().f42427o1 = AbstractC23028c0.m118087g(conversation.m40999b(true, false));
                                }
                                if (AbstractC21935u.m114518H(str) && !AbstractC25495a.m132086k(str)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!conversation.m41013q() && !z11) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!conversation.f42893q.startsWith("-") && (conversation.m41009m() == 35 || (z12 && !C18644n.m98531l().m98558u(conversation.f42893q)))) {
                                    try {
                                        if (TextUtils.isEmpty(conversation.m40998a().f42455y)) {
                                            ContactProfile m141816n = C28203u6.f131407a.m141816n(conversation.f42893q, new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.cp0
                                                public /* synthetic */ cp0() {
                                                }

                                                @Override // en0.InterfaceC18494a
                                                /* renamed from: V4 */
                                                public final Object mo12V4() {
                                                    return Conversation.this.m40996I();
                                                }
                                            });
                                            if (!TextUtils.isEmpty(m141816n.f42455y)) {
                                                conversation.m40998a().f42455y = m141816n.f42455y;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                arrayList.add(new C18440b(conversation));
                            }
                        }
                    }
                    StrangerMessagesView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dp0

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f80162q;

                        public /* synthetic */ dp0(ArrayList arrayList2) {
                            r2 = arrayList2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StrangerMessagesView.C15127b.this.m84846d(r2);
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // am.AbstractC0939u
        /* renamed from: b */
        public boolean mo4459b() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$c */
    /* loaded from: classes6.dex */
    class C15128c extends AbstractC23116k0.a {
        C15128c() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            StrangerMessagesView.this.m84840ZM(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$d */
    /* loaded from: classes6.dex */
    public class C15129d implements InterfaceC20094a {
        C15129d() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84848d() {
            try {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.m84812aN(strangerMessagesView.f78037W0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 515 && StrangerMessagesView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                AbstractC23148n.m118844r(jSONObject2);
                if (!jSONObject2.isNull("privacy")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("privacy");
                    if (!jSONObject3.isNull("receive_message")) {
                        AbstractC23148n.m118845s(jSONObject3.getJSONObject("receive_message"));
                        int m96085d = AbstractC18069a.m96085d(jSONObject, "id");
                        int m96085d2 = AbstractC18069a.m96085d(jSONObject, "value");
                        if (m96085d == 1) {
                            StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                            strangerMessagesView.f78037W0 = m96085d2;
                            if (strangerMessagesView.f72421L0.m92676n2() != null) {
                                StrangerMessagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ep0
                                    public /* synthetic */ ep0() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StrangerMessagesView.C15129d.this.m84848d();
                                    }
                                });
                            }
                        }
                    }
                }
                if (!jSONObject2.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$e */
    /* loaded from: classes6.dex */
    public class C15130e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f78056a;

        /* renamed from: b */
        final /* synthetic */ int f78057b;

        C15130e(int i11, int i12) {
            this.f78056a = i11;
            this.f78057b = i12;
        }

        /* renamed from: e */
        public /* synthetic */ void m84851e() {
            try {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.m84812aN(strangerMessagesView.f78037W0);
            } catch (Exception e11) {
                AbstractC23350e.m122774d(StrangerMessagesView.this.f78030P0, e11.toString());
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m84852f() {
            try {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.m84812aN(strangerMessagesView.f78037W0);
            } catch (Exception e11) {
                AbstractC23350e.m122774d(StrangerMessagesView.this.f78030P0, e11.toString());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StrangerMessagesView.this.f72421L0.mo78960q3();
            if (StrangerMessagesView.this.f72421L0.m92672lJ()) {
                if (c20096c.m104491c() == 515) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            }
            if (StrangerMessagesView.this.f72421L0.m92676n2() != null) {
                StrangerMessagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.gp0
                    public /* synthetic */ gp0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StrangerMessagesView.C15130e.this.m84852f();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            StrangerMessagesView.this.f72421L0.mo78960q3();
            if (StrangerMessagesView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_updatePrivateSettingSuccess));
            }
            AbstractC23148n.m118848v(this.f78056a, this.f78057b);
            StrangerMessagesView.this.f78037W0 = AbstractC23309i.m122609ya();
            if (StrangerMessagesView.this.f72421L0.m92676n2() != null) {
                StrangerMessagesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fp0
                    public /* synthetic */ fp0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StrangerMessagesView.C15130e.this.m84851e();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$f */
    /* loaded from: classes6.dex */
    public class C15131f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f78059a;

        /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$f$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78061a;

            a(ContactProfile contactProfile) {
                this.f78061a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f78061a, true);
                C7960e.m41971c6().m42234Pb(C15131f.this.f78059a.f42434r);
            }
        }

        C15131f(ContactProfile contactProfile) {
            this.f78059a = contactProfile;
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
                StrangerMessagesView.this.f72421L0.mo78960q3();
                StrangerMessagesView.this.f78049i1 = false;
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
                            StrangerMessagesView.this.f72421L0.mo78960q3();
                            StrangerMessagesView.this.f78049i1 = false;
                            return;
                        }
                    }
                    AbstractC21935u.m114558y(this.f78059a.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f78059a.f42434r);
                    if (m98552o == null) {
                        m98552o = C28203u6.f131407a.m141809c(this.f78059a.f42434r);
                    }
                    if (m98552o == null) {
                        m98552o = this.f78059a;
                    }
                    m98552o.f42403c1 = false;
                    C28203u6.f131407a.m141824w(m98552o);
                    C21927m.m114302u().m114350o0(this.f78059a.f42434r);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f78059a.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(Integer.parseInt(this.f78059a.f42434r)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o));
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                StrangerMessagesView.this.f72421L0.mo78960q3();
                StrangerMessagesView.this.f78049i1 = false;
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
                C19669z.m103146Y().m103198O0();
                AbstractC23088h5.m118426g();
                C18644n.m98524E();
                StrangerMessagesView.this.f72421L0.mo78960q3();
                StrangerMessagesView.this.f78049i1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$g */
    /* loaded from: classes6.dex */
    public class C15132g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f78063a;

        C15132g(ContactProfile contactProfile) {
            this.f78063a = contactProfile;
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
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.f78050j1 = false;
                strangerMessagesView.f72421L0.mo78960q3();
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
                            StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                            strangerMessagesView.f78050j1 = false;
                            strangerMessagesView.f72421L0.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f78063a;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                StrangerMessagesView strangerMessagesView2 = StrangerMessagesView.this;
                strangerMessagesView2.f78050j1 = false;
                strangerMessagesView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                StrangerMessagesView strangerMessagesView3 = StrangerMessagesView.this;
                strangerMessagesView3.f78050j1 = false;
                strangerMessagesView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$h */
    /* loaded from: classes6.dex */
    public class C15133h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f78065a;

        C15133h(C24275a c24275a) {
            this.f78065a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.f78051k1 = false;
                strangerMessagesView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f78065a);
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                StrangerMessagesView strangerMessagesView = StrangerMessagesView.this;
                strangerMessagesView.f78051k1 = false;
                strangerMessagesView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$i */
    /* loaded from: classes6.dex */
    public class C15134i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78067a;

        C15134i(String str) {
            this.f78067a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                StrangerMessagesView.this.f72421L0.mo78960q3();
                StrangerMessagesView.this.f78051k1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C0804b.m2025g().m2035l(this.f78067a, true);
                    AbstractC2364o0.m12369l(StrangerMessagesView.this.f72421L0.m92676n2(), StrangerMessagesView.this.f78033S0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                StrangerMessagesView.this.f72421L0.mo78960q3();
                StrangerMessagesView.this.f78051k1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StrangerMessagesView$j */
    /* loaded from: classes6.dex */
    public class C15135j extends ClickableSpan {
        C15135j() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", 1);
            StrangerMessagesView.this.f72421L0.m92676n2().mo35573l4(BottomSheetSettingView.class, bundle, 1, true);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: AM */
    private void m84795AM(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m84831zM(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    private C28923c m84796CM() {
        if (this.f78045e1 == null) {
            this.f78045e1 = AbstractC23306f.m120601N();
        }
        return this.f78045e1;
    }

    /* renamed from: FM */
    private void m84797FM(boolean z11) {
        int i11;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && m87077NK.getTrailingButton() != null) {
            Button trailingButton = m87077NK.getTrailingButton();
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            trailingButton.setVisibility(i11);
        }
    }

    /* renamed from: HM */
    public /* synthetic */ void m84798HM(C31862c c31862c) {
        ViewStub viewStub;
        if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a() && (viewStub = (ViewStub) this.f78031Q0.findViewById(AbstractC6918a0.vs_quick_action_view)) != null) {
            FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
            this.f78044d1 = frameLayout;
            if (frameLayout != null) {
                QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(m92689tK(), c31862c.f146309b);
                quickActionViewLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.f78044d1.addView(quickActionViewLayout);
                quickActionViewLayout.m75818b(c31862c, new C15126a());
            }
        }
    }

    /* renamed from: IM */
    public /* synthetic */ void m84799IM(int i11, C31862c c31862c) {
        if (c31862c != null) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.so0

                /* renamed from: q */
                public final /* synthetic */ C31862c f82117q;

                public /* synthetic */ so0(C31862c c31862c2) {
                    r2 = c31862c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StrangerMessagesView.this.m84798HM(r2);
                }
            });
        }
    }

    /* renamed from: JM */
    public /* synthetic */ void m84800JM(String str) {
        try {
            m84796CM().m101508a(new C28923c.b(str, this.f78030P0));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public /* synthetic */ boolean m84801KM(Message message) {
        if (message.what == 1) {
            try {
                Handler handler = this.f78043c1;
                if (handler != null) {
                    handler.removeMessages(1);
                }
                m84837UM();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: LM */
    public /* synthetic */ void m84802LM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_delete_conversation) {
            this.f72421L0.removeDialog(8);
            this.f72421L0.showDialog(8);
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_receiveNotification) {
            m84810VM(this.f78038X0.f42434r);
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_muteConversation) {
            this.f72421L0.removeDialog(9);
            this.f72421L0.showDialog(9);
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_unblockuser) {
            this.f72421L0.removeDialog(7);
            this.f72421L0.showDialog(7);
        } else if (intValue == AbstractC8020f0.ignore_zalouser) {
            this.f72421L0.removeDialog(6);
            this.f72421L0.showDialog(6);
        } else if (intValue == AbstractC8020f0.str_hide_message) {
            m84838XM(this.f78038X0.f42434r);
        }
    }

    /* renamed from: MM */
    public /* synthetic */ void m84803MM(RecyclerView recyclerView, int i11, View view) {
        try {
            ContactProfile m35928N = this.f78033S0.m35928N(i11);
            if (m35928N != null) {
                String mo2478b = m35928N.mo2478b();
                if (C19636i1.m102737w().m102761R(mo2478b)) {
                    AbstractC23647d.m123897g("26010");
                } else {
                    AbstractC23647d.m123897g("26011");
                }
                C28203u6 c28203u6 = C28203u6.f131407a;
                if (c28203u6.m141809c(mo2478b) != null) {
                    m35928N.f42458z = c28203u6.m141809c(mo2478b).f42458z;
                }
                this.f72421L0.m92676n2().mo35573l4(ChatView.class, new C27870vb(m35928N.mo2478b()).m140780g(m35928N).m140776b(), 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NM */
    public /* synthetic */ boolean m84804NM(RecyclerView recyclerView, int i11, View view) {
        m84834EM(i11);
        return true;
    }

    /* renamed from: OM */
    public static /* synthetic */ void m84805OM(InterfaceC17463d interfaceC17463d) {
        try {
            AbstractC23647d.m123906p("22001303");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public /* synthetic */ void m84806PM(View view) {
        this.f72421L0.m92676n2().mo35581q(BottomSheetDeleteStrangerMessage.class, new Bundle(), 2, 1, true);
    }

    /* renamed from: QM */
    public /* synthetic */ void m84807QM(View view) {
        this.f78046f1.m90655n();
        m84809TM();
    }

    /* renamed from: SM */
    public void m84808SM(C31862c c31862c, String str, String str2) {
        boolean z11;
        if (c31862c != null && c31862c.m153153e()) {
            m84811WM(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("action.window.close")) {
                if (!z11) {
                    m84811WM(c31862c);
                    return;
                }
                return;
            }
            AbstractC28207v1.m141994i3(str, 4, m92676n2(), this, str2, null);
        }
    }

    /* renamed from: TM */
    private void m84809TM() {
        C32044o1.m154612r().m154626j();
        C32044o1.m154612r().m154617L("stranger_box", false);
    }

    /* renamed from: VM */
    private void m84810VM(String str) {
        if (this.f78051k1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15134i(str));
        this.f78051k1 = true;
        c0766k.mo1413D8(1, str, new MuteTrackingSource(1));
    }

    /* renamed from: WM */
    private void m84811WM(C31862c c31862c) {
        FrameLayout frameLayout = this.f78044d1;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C18434b.m97679l().m97691w(c31862c);
    }

    /* renamed from: aN */
    public void m84812aN(int i11) {
        SpannableString spannableString;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_stranger_change_privacy_setting);
        if (i11 == 1) {
            spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_strangers_can_message_you, m118743r0));
        } else {
            spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_strangers_can_not_message_you, m118743r0));
        }
        spannableString.setSpan(new C15135j(), spannableString.length() - m118743r0.length(), spannableString.length(), 33);
        this.f78036V0.setText(spannableString);
        this.f78036V0.setHighlightColor(0);
        this.f78036V0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: bN */
    private void m84813bN(boolean z11, int i11) {
        String m118743r0;
        if (z11) {
            View m92691vK = m92691vK();
            if (i11 > 1) {
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_deleting_multi_conversations, Integer.valueOf(i11));
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleting_single_conversation);
            }
            Snackbar m90634w = Snackbar.m90634w(m92691vK, m118743r0, (int) AbstractC0924m0.m3653a7());
            this.f78046f1 = m90634w;
            m90634w.m90664z(AbstractC8020f0.str_undo, new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.yo0
                public /* synthetic */ yo0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StrangerMessagesView.this.m84807QM(view);
                }
            });
            this.f78046f1.m90641G(true);
            this.f78046f1.m90648N();
            C32044o1.m154612r().m154618M("stranger_box", false);
            return;
        }
        Snackbar snackbar = this.f78046f1;
        if (snackbar != null) {
            snackbar.m90655n();
        }
    }

    /* renamed from: uM */
    private void m84827uM(C24275a c24275a) {
        if (c24275a == null || this.f78051k1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15133h(c24275a));
        this.f78051k1 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(1));
    }

    /* renamed from: vM */
    private void m84828vM() {
        C18434b.m97679l().m97686o(33, null, new C18434b.e() { // from class: com.zing.zalo.ui.zviews.ap0
            public /* synthetic */ ap0() {
            }

            @Override // p131ei.C18434b.e
            /* renamed from: a */
            public final void mo64321a(int i11, C31862c c31862c) {
                StrangerMessagesView.this.m84799IM(i11, c31862c);
            }
        });
    }

    /* renamed from: wM */
    private KeyEventCallbackC17462c m84829wM(ContactProfile contactProfile) {
        String m118746s0;
        int i11;
        int size = this.f78033S0.m35929O().size();
        if (size == 0 && contactProfile == null) {
            return null;
        }
        if (contactProfile != null) {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_title_delete_conversation, contactProfile.m40383Q(true, false));
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_title_delete_list_conversations, Integer.valueOf(size));
        }
        if (contactProfile != null) {
            i11 = AbstractC8020f0.str_confirm_delete_this_conversation_desc_2;
        } else {
            i11 = AbstractC8020f0.str_confirm_delete_multi_conversation_msg_2;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        C16972e0.a aVar = new C16972e0.a(m92689tK());
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(m118746s0).m90949z(m118743r0).m90921E(true).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), this).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this);
        return aVar.m90927d();
    }

    /* renamed from: xM */
    public void m84830xM() {
        try {
            Handler handler = this.f78043c1;
            if (handler != null && !handler.hasMessages(1)) {
                this.f78043c1.sendEmptyMessageDelayed(1, 70L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.ro0.<init>(com.zing.zalo.ui.zviews.StrangerMessagesView, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: zM */
    private void m84831zM(java.util.List r9) {
        /*
            r8 = this;
            boolean r0 = am.AbstractC0924m0.m3194Kc()
            if (r0 == 0) goto L49
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2a
            r0.<init>()     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L2a
        Lf:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Exception -> L2a
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L2a
            ij.c r1 = new ij.c     // Catch: java.lang.Exception -> L2a
            r4 = 0
            r5 = 0
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Exception -> L2a
            r0.add(r1)     // Catch: java.lang.Exception -> L2a
            goto Lf
        L2a:
            r9 = move-exception
            goto L43
        L2c:
            zh.o1 r9 = p716zh.C32044o1.m154612r()     // Catch: java.lang.Exception -> L2a
            r9.m154622Q(r0)     // Catch: java.lang.Exception -> L2a
            int r9 = r0.size()     // Catch: java.lang.Exception -> L2a
            r0 = 1
            r8.m84813bN(r0, r9)     // Catch: java.lang.Exception -> L2a
            gw.z r9 = gw.C19669z.m103146Y()     // Catch: java.lang.Exception -> L2a
            r9.m103198O0()     // Catch: java.lang.Exception -> L2a
            goto L69
        L43:
            java.lang.String r0 = r8.f78030P0
            mm0.AbstractC23350e.m122776f(r0, r9)
            goto L69
        L49:
            java.util.Iterator r9 = r9.iterator()
        L4d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            mg.a r1 = mg.C23288a.f113033a
            eg0.b r2 = new eg0.b
            com.zing.zalo.ui.zviews.ro0 r3 = new com.zing.zalo.ui.zviews.ro0
            r3.<init>()
            r2.<init>(r0, r3)
            r1.mo13474a(r2)
            goto L4d
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.StrangerMessagesView.m84831zM(java.util.List):void");
    }

    /* renamed from: BM */
    public boolean m84832BM() {
        if (this.f88760a0.getActionMode() == null || !this.f88760a0.m92718m()) {
            return false;
        }
        this.f88760a0.m92716k();
        this.f78047g1 = false;
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        switch (i11) {
            case 2:
                if (this.f78033S0.m35929O().size() == 1 && this.f78033S0.m35929O().get(0) != null) {
                    return m84829wM(((C18451m) this.f78033S0.m35929O().get(0)).f92992c);
                }
                return m84829wM(null);
            case 3:
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(5).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_confirm_receive)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                return aVar.m43152a();
            case 4:
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dlg_confirm_not_receive)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_confirm_not_receive)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
                return aVar2.m43152a();
            case 5:
            default:
                return null;
            case 6:
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                aVar3.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_ignore_zalo_user)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_popup), this);
                return aVar3.m43152a();
            case 7:
                C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                aVar4.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unlock_friend)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                return aVar4.m43152a();
            case 8:
                return m84829wM(this.f78038X0);
            case 9:
                return AbstractC23116k0.m118580h(this.f72421L0.m92648SI(), false, new C15128c());
            case 10:
                C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                aVar5.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_new_hidden_chat)).m43173v(2).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_hint_hidden_chat)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_setpin), this);
                return aVar5.m43152a();
            case 11:
                C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                ImageView imageView = new ImageView(this.f72421L0.m92648SI());
                imageView.setImageDrawable(C23212s8.m119609q(this.f72421L0.m92648SI(), AbstractC16781w.banner_hiddenchat_lock));
                imageView.setPadding(0, AbstractC23136l9.m118742r(16.0f), 0, 0);
                aVar6.m43177z(imageView);
                aVar6.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_setup_hiddenchat_success)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_setup_hiddenchat_success)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.close), this);
                C8009j m43152a = aVar6.m43152a();
                m43152a.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.vo0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        StrangerMessagesView.m84805OM(interfaceC17463d);
                    }
                });
                return m43152a;
        }
    }

    /* renamed from: DM */
    void m84833DM() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15129d());
        if (C23055e5.m118272g(true)) {
            c0766k.mo1589Z7("");
        }
    }

    /* renamed from: EM */
    public boolean m84834EM(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            ContactProfile m35928N = this.f78033S0.m35928N(i11);
            this.f78038X0 = m35928N;
            if (m35928N != null && !TextUtils.isEmpty(m35928N.f42434r)) {
                ArrayList arrayList = new ArrayList();
                boolean m2033i = C0804b.m2025g().m2033i(this.f78038X0.f42434r);
                HashMap hashMap = new HashMap();
                if (m2033i) {
                    i12 = AbstractC8020f0.str_optionM_receiveNotification;
                } else {
                    i12 = AbstractC8020f0.str_optionM_muteConversation;
                }
                hashMap.put("name", AbstractC23136l9.m118743r0(i12));
                if (m2033i) {
                    i13 = AbstractC8020f0.str_optionM_receiveNotification;
                } else {
                    i13 = AbstractC8020f0.str_optionM_muteConversation;
                }
                hashMap.put("id", Integer.valueOf(i13));
                arrayList.add(hashMap);
                if (!this.f72421L0.m92676n2().mo35576n3()) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_message));
                    hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_hide_message));
                    arrayList.add(hashMap2);
                }
                boolean m153137g = C21927m.m114302u().m114312J().m153137g(this.f78038X0.f42434r);
                HashMap hashMap3 = new HashMap();
                if (m153137g) {
                    i14 = AbstractC8020f0.str_optionM_unblockuser;
                } else {
                    i14 = AbstractC8020f0.ignore_zalouser;
                }
                hashMap3.put("name", AbstractC23136l9.m118743r0(i14));
                if (m153137g) {
                    i15 = AbstractC8020f0.str_optionM_unblockuser;
                } else {
                    i15 = AbstractC8020f0.ignore_zalouser;
                }
                hashMap3.put("id", Integer.valueOf(i15));
                arrayList.add(hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_conversation));
                hashMap4.put("id", Integer.valueOf(AbstractC8020f0.str_delete_conversation));
                arrayList.add(hashMap4);
                SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                ContactProfile contactProfile = this.f78038X0;
                if (contactProfile != null) {
                    aVar.m43172u(contactProfile.m40383Q(true, false));
                }
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bp0

                    /* renamed from: q */
                    public final /* synthetic */ SimpleAdapter f79948q;

                    public /* synthetic */ bp0(SimpleAdapter simpleAdapter2) {
                        r2 = simpleAdapter2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                        StrangerMessagesView.this.m84802LM(r2, interfaceC17463d, i16);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f78041a1 = m43152a;
                if (m43152a != null && !m43152a.m92868m()) {
                    this.f78041a1.mo13822K();
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.vip_messages_view, viewGroup, false);
        this.f78031Q0 = inflate;
        m84835GM(inflate);
        return this.f78031Q0;
    }

    /* renamed from: GM */
    void m84835GM(View view) {
        this.f78034T0 = new ArrayList();
        this.f78036V0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvSuggestPrivacySetting);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.contactlist);
        this.f78032R0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
        C7028c4 c7028c4 = new C7028c4();
        this.f78033S0 = c7028c4;
        this.f78032R0.setAdapter(c7028c4);
        C31784b.m152808a(this.f78032R0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.wo0
            public /* synthetic */ wo0() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view2) {
                StrangerMessagesView.this.m84803MM(recyclerView2, i11, view2);
            }
        });
        C31784b.m152808a(this.f78032R0).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.xo0
            public /* synthetic */ xo0() {
            }

            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView2, int i11, View view2) {
                boolean m84804NM;
                m84804NM = StrangerMessagesView.this.m84804NM(recyclerView2, i11, view2);
                return m84804NM;
            }
        });
        String m120895Ea = AbstractC23309i.m120895Ea();
        if (!TextUtils.isEmpty(m120895Ea) && m120895Ea.equals("GET_SUCCESSFUL")) {
            int m122609ya = AbstractC23309i.m122609ya();
            this.f78037W0 = m122609ya;
            m84812aN(m122609ya);
        } else {
            m84833DM();
        }
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f78035U0 = multiStateView;
        multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_msglist));
        this.f78035U0.setEnableLoadingText(true);
        m84839YM(true);
        this.f78039Y0 = true;
        m84837UM();
        AbstractC23126l.m118627a(this.f78030P0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        try {
            Handler handler = this.f78043c1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f78043c1 = null;
            }
            HandlerThread handlerThread = this.f78042b1;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (interfaceC17463d != null) {
            i12 = interfaceC17463d.mo92862f();
            interfaceC17463d.dismiss();
        } else {
            i12 = 0;
        }
        if (i11 == -1) {
            switch (i12) {
                case 2:
                    C7028c4 c7028c4 = this.f78033S0;
                    c7028c4.f38421r = true;
                    m84844yM(c7028c4.m35930P());
                    this.f78048h1 = Boolean.FALSE;
                    this.f78033S0.m35927M();
                    return;
                case 3:
                    m84842dN(1, 1);
                    return;
                case 4:
                    m84842dN(1, 2);
                    return;
                case 5:
                case 9:
                default:
                    return;
                case 6:
                    m84843tM(this.f78038X0);
                    return;
                case 7:
                    m84841cN(this.f78038X0);
                    return;
                case 8:
                    try {
                        this.f78033S0.f38421r = true;
                        m84795AM(this.f78038X0.f42434r);
                        C32044o1.m154612r().m154624S("stranger_box", Collections.singletonList(this.f78038X0.f42434r));
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                case 10:
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("case_passcode_process", 0);
                        bundle.putString("uid_set_hidden_chat", this.f78038X0.f42434r);
                        this.f72421L0.m92676n2().mo35579p().m93066i2(CodeLockMessageView.class, bundle, 8655, 1, true);
                        this.f72421L0.removeDialog(10);
                        AbstractC23647d.m123906p("22001301");
                        AbstractC23647d.m123893c();
                        return;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return;
                    }
                case 11:
                    try {
                        if (!TextUtils.isEmpty(this.f78040Z0)) {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done), this.f78040Z0));
                        }
                        if (Build.VERSION.SDK_INT >= 25) {
                            C26939u.m138770q().m138779h(this.f78038X0.f42434r);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        return;
                    }
            }
        }
        if (i11 == -2) {
            if (i12 != 2) {
                if (i12 == 8) {
                    C32044o1.m154612r().m154616K("stranger_box", Collections.singletonList(this.f78038X0.f42434r), false);
                    return;
                }
                return;
            }
            C32044o1.m154612r().m154616K("stranger_box", this.f78033S0.m35930P(), false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        super.mo59740N7(z11);
        if (!z11) {
            try {
                m84836RM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.zo0
                public /* synthetic */ zo0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StrangerMessagesView.this.m84806PM(view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 != 1) {
                if (i11 != 4) {
                    if (i11 == 16908332) {
                        m84836RM();
                        this.f72421L0.finish();
                        return true;
                    }
                } else {
                    this.f72421L0.removeDialog(5);
                    this.f72421L0.showDialog(5);
                }
            } else {
                m84832BM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (C32044o1.m154612r().m154614G()) {
            C32044o1.m154612r().m154628n();
        }
        m84813bN(false, 0);
        C23744a.m124114c().m124117e(this, 6064);
    }

    /* renamed from: RM */
    public void m84836RM() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f78034T0.size(); i11++) {
            if (this.f78034T0.get(i11) instanceof C18440b) {
                arrayList.add(((C18440b) this.f78034T0.get(i11)).m97729o().f42893q);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC23306f.m120728y0().m101508a(new C28928h.b(arrayList));
        }
    }

    /* renamed from: UM */
    public void m84837UM() {
        C0824j.m2153b(new C15127b());
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C8009j c8009j = this.f78041a1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f78041a1.dismiss();
        }
        super.mo37712VJ();
    }

    /* renamed from: XM */
    void m84838XM(String str) {
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                this.f72421L0.showDialog(10);
                AbstractC23647d.m123906p("22001300");
                AbstractC23647d.m123893c();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("uid_set_hidden_chat", this.f78038X0.f42434r);
                bundle.putInt("case_passcode_process", 2);
                this.f72421L0.m92676n2().mo35579p().m93066i2(CodeLockMessageView.class, bundle, 8655, 1, true);
                AbstractC23647d.m123906p("22001304");
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YM */
    void m84839YM(boolean z11) {
        if (z11) {
            this.f78035U0.setVisibility(0);
            this.f78035U0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f78032R0.setVisibility(8);
            return;
        }
        C7028c4 c7028c4 = this.f78033S0;
        if (c7028c4 != null && c7028c4.mo10003k() > 0) {
            this.f78035U0.setVisibility(8);
            this.f78032R0.setVisibility(0);
            m84797FM(false);
        } else {
            this.f78035U0.setVisibility(0);
            this.f78032R0.setVisibility(0);
            this.f78035U0.setState(MultiStateView.EnumC15914e.EMPTY);
            m84797FM(true);
        }
    }

    /* renamed from: ZM */
    public void m84840ZM(int i11) {
        try {
            m84827uM(AbstractC19646n0.m103040w0(i11, this.f78038X0.f42434r, false, 3));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cN */
    void m84841cN(ContactProfile contactProfile) {
        if (this.f78050j1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15132g(contactProfile));
        this.f78050j1 = true;
        c0766k.mo1448Ha(contactProfile.f42434r, 13);
    }

    /* renamed from: dN */
    void m84842dN(int i11, int i12) {
        try {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15130e(i11, i12));
            c0766k.mo1545U3(i11, i12, "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StrangerMessagesView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        int i13 = -1;
        if (i12 == -1) {
            boolean z11 = false;
            if (i11 != 2) {
                if (i11 == 8655 && intent != null) {
                    if (intent.hasExtra("uid_set_hidden_chat")) {
                        str = intent.getStringExtra("uid_set_hidden_chat");
                    } else {
                        str = "";
                    }
                    if (intent.hasExtra("case_passcode_process")) {
                        i13 = intent.getIntExtra("case_passcode_process", -1);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ContactProfile contactProfile = new ContactProfile(str);
                        C18922m.m99141t().m99145O(str);
                        C21927m.m114302u().m114331f(str, contactProfile, true);
                        C19669z.m103146Y().m103198O0();
                        if (i13 == 0) {
                            ContactProfile contactProfile2 = this.f78038X0;
                            if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r) && str.equals(this.f78038X0.f42434r)) {
                                this.f78040Z0 = this.f78038X0.m40383Q(true, false);
                            }
                            this.f72421L0.showDialog(11);
                            AbstractC23647d.m123906p("22001302");
                            AbstractC23647d.m123893c();
                            return;
                        }
                        AbstractC23647d.m123906p("22001305");
                        AbstractC23647d.m123893c();
                        ContactProfile contactProfile3 = this.f78038X0;
                        if (contactProfile3 != null && !TextUtils.isEmpty(contactProfile3.f42434r) && str.equals(this.f78038X0.f42434r)) {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done), this.f78038X0.m40383Q(true, false)));
                        }
                        if (this.f78038X0 != null && Build.VERSION.SDK_INT >= 25) {
                            C26939u.m138770q().m138779h(this.f78038X0.f42434r);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (intent != null) {
                if (intent.hasExtra("EXTRA_PARAM_IS_DELETE_ALL") && intent.getBooleanExtra("EXTRA_PARAM_IS_DELETE_ALL", false)) {
                    z11 = true;
                }
                Boolean valueOf = Boolean.valueOf(z11);
                this.f78048h1 = valueOf;
                if (valueOf.booleanValue()) {
                    this.f78033S0.m35926L();
                    showDialog(2);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            try {
                if (m84832BM()) {
                    return true;
                }
                m84836RM();
                this.f72421L0.finish();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        int m122609ya = AbstractC23309i.m122609ya();
        this.f78037W0 = m122609ya;
        m84812aN(m122609ya);
        if (!this.f78039Y0) {
            m84837UM();
        }
        this.f78039Y0 = false;
        C23744a.m124114c().m124115b(this, 6064);
    }

    /* renamed from: tM */
    void m84843tM(ContactProfile contactProfile) {
        if (this.f78049i1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15131f(contactProfile));
        this.f78049i1 = true;
        c0766k.mo1479L9(contactProfile.f42434r, 13);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6064) {
            if (this.f78042b1 == null) {
                HandlerThread handlerThread = new HandlerThread("Z:StrangerMessages");
                this.f78042b1 = handlerThread;
                handlerThread.start();
                this.f78043c1 = new Handler(this.f78042b1.getLooper(), new Handler.Callback() { // from class: com.zing.zalo.ui.zviews.to0
                    public /* synthetic */ to0() {
                    }

                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        boolean m84801KM;
                        m84801KM = StrangerMessagesView.this.m84801KM(message);
                        return m84801KM;
                    }
                });
            }
            Handler handler = this.f78043c1;
            if (handler != null) {
                try {
                    if (handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.uo0
                        public /* synthetic */ uo0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StrangerMessagesView.this.m84830xM();
                        }
                    })) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            m84837UM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m84828vM();
    }

    /* renamed from: yM */
    public void m84844yM(List list) {
        if (!list.isEmpty()) {
            try {
                m84831zM(list);
                C32044o1.m154612r().m154624S("stranger_box", list);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
