package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
import am.AbstractC0939u;
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
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
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
import com.zing.zalo.p077ui.zviews.SuggestFriendView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21929o;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p510sq.C26365a;
import p604wb.C28905e;
import p716zh.C31859bb;
import p716zh.C31874cb;
import p716zh.C31965ic;
import p716zh.C32002l4;
import r30.AbstractC25636f;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class SuggestFriendView extends SlidableZaloView implements C7045d9.c, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x, C23744a.c {

    /* renamed from: A1 */
    public static final String f78154A1 = "SuggestFriendView";

    /* renamed from: P0 */
    private View f78155P0;

    /* renamed from: Q0 */
    RecyclerView f78156Q0;

    /* renamed from: R0 */
    LinearLayoutManager f78157R0;

    /* renamed from: S0 */
    C7045d9 f78158S0;

    /* renamed from: T0 */
    MultiStateView f78159T0;

    /* renamed from: V0 */
    C31874cb f78161V0;

    /* renamed from: W0 */
    LinearLayout f78162W0;

    /* renamed from: X0 */
    LinearLayout f78163X0;

    /* renamed from: Y0 */
    LinearLayout f78164Y0;

    /* renamed from: Z0 */
    LinearLayout f78165Z0;

    /* renamed from: a1 */
    C23528a f78166a1;

    /* renamed from: c1 */
    Handler f78168c1;

    /* renamed from: g1 */
    String f78172g1;

    /* renamed from: h1 */
    C31874cb f78173h1;

    /* renamed from: z1 */
    C0855y0 f78191z1;

    /* renamed from: U0 */
    ArrayList f78160U0 = new ArrayList();

    /* renamed from: b1 */
    String f78167b1 = "";

    /* renamed from: d1 */
    boolean f78169d1 = false;

    /* renamed from: e1 */
    private int f78170e1 = 0;

    /* renamed from: f1 */
    private boolean f78171f1 = false;

    /* renamed from: i1 */
    boolean f78174i1 = false;

    /* renamed from: j1 */
    InterfaceC20094a f78175j1 = new C15151d();

    /* renamed from: k1 */
    boolean f78176k1 = false;

    /* renamed from: l1 */
    InterfaceC0765j f78177l1 = new C0766k();

    /* renamed from: m1 */
    InterfaceC20094a f78178m1 = new C15152e();

    /* renamed from: n1 */
    boolean f78179n1 = false;

    /* renamed from: o1 */
    InterfaceC0765j f78180o1 = new C0766k();

    /* renamed from: p1 */
    InterfaceC20094a f78181p1 = new C15153f();

    /* renamed from: q1 */
    ContactProfile f78182q1 = null;

    /* renamed from: r1 */
    boolean f78183r1 = false;

    /* renamed from: s1 */
    InterfaceC20094a f78184s1 = new C15154g();

    /* renamed from: t1 */
    boolean f78185t1 = false;

    /* renamed from: u1 */
    Runnable f78186u1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.xp0
        public /* synthetic */ xp0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SuggestFriendView.this.m84938HM();
        }
    };

    /* renamed from: v1 */
    boolean f78187v1 = false;

    /* renamed from: w1 */
    InterfaceC0765j f78188w1 = new C0766k();

    /* renamed from: x1 */
    InterfaceC20094a f78189x1 = new C15149b();

    /* renamed from: y1 */
    ArrayList f78190y1 = new ArrayList();

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$a */
    /* loaded from: classes6.dex */
    public class C15148a extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$a$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f78193a;

            /* renamed from: b */
            final /* synthetic */ int f78194b;

            /* renamed from: c */
            final /* synthetic */ List f78195c;

            a(int i11, int i12, List list) {
                this.f78193a = i11;
                this.f78194b = i12;
                this.f78195c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                SuggestFriendView.this.m84947pM(this.f78193a, this.f78194b, this.f78195c);
            }
        }

        C15148a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                SuggestFriendView.this.f78158S0.m35984b0(false);
                SuggestFriendView.this.f78158S0.m10008p();
            } else {
                SuggestFriendView.this.f78158S0.m35984b0(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            SuggestFriendView.this.m84949qM();
            try {
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                LinearLayoutManager linearLayoutManager = suggestFriendView.f78157R0;
                if (linearLayoutManager != null && suggestFriendView.f78158S0 != null) {
                    int m9740Y1 = linearLayoutManager.m9740Y1();
                    int m9745c2 = SuggestFriendView.this.f78157R0.m9745c2();
                    List m35969M = SuggestFriendView.this.f78158S0.m35969M();
                    if (m35969M != null) {
                        C0809c1.m2050b(new a(m9740Y1, m9745c2, m35969M));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$b */
    /* loaded from: classes6.dex */
    public class C15149b implements InterfaceC20094a {
        C15149b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84959d() {
            try {
                SuggestFriendView.this.m84938HM();
                SuggestFriendView.this.m84948pv(false, 0);
                SuggestFriendView.this.m84946oM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SuggestFriendView.f78154A1, e11.toString());
                }
            } finally {
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                suggestFriendView.f78187v1 = false;
                suggestFriendView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C21933s.m114404I().m114459c0(SuggestFriendView.this.f78190y1);
                    AbstractC23074g2.m118376b(1, SuggestFriendView.this.f78190y1, "", 4);
                    AbstractC23063f2.m118362n(SuggestFriendView.this.f78190y1);
                    if (SuggestFriendView.this.f72421L0.m92676n2() != null) {
                        SuggestFriendView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fq0
                            public /* synthetic */ fq0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SuggestFriendView.C15149b.this.m84959d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(SuggestFriendView.f78154A1, e11.toString());
                }
            } finally {
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                suggestFriendView.f78187v1 = false;
                suggestFriendView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$c */
    /* loaded from: classes6.dex */
    public class C15150c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f78198a;

        /* renamed from: b */
        final /* synthetic */ int f78199b;

        /* renamed from: c */
        final /* synthetic */ int f78200c;

        C15150c(List list, int i11, int i12) {
            this.f78198a = list;
            this.f78199b = i11;
            this.f78200c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            if (suggestFriendView.f78191z1 == null) {
                suggestFriendView.f78191z1 = new C0855y0();
            }
            HashMap m2385c = SuggestFriendView.this.f78191z1.m2385c();
            HashMap m2384b = SuggestFriendView.this.f78191z1.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f78198a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C31859bb c31859bb = (C31859bb) this.f78198a.get(i11);
                if (c31859bb != null && c31859bb.m153145a() != null && !TextUtils.isEmpty(c31859bb.m153145a().f146385a)) {
                    String str = c31859bb.m153145a().f146385a;
                    if (m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (c23651h2 = (C23651h) c23669z) != null && (strArr2 = c23651h2.f114659f) != null) {
                            if (!strArr2[2].equals(String.valueOf(i11))) {
                                c23651h2.f114659f[2] = String.valueOf(i11);
                            }
                            if (i11 < this.f78199b || i11 > this.f78200c) {
                                c23669z.f114660g = false;
                            }
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
            SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
            if (suggestFriendView2.f78191z1 == null) {
                suggestFriendView2.f78191z1 = new C0855y0();
            }
            SuggestFriendView.this.f78191z1.m2386d(hashMap);
            SuggestFriendView.this.f78191z1.m2387e(hashMap2);
            SuggestFriendView.this.m84947pM(this.f78199b, this.f78200c, this.f78198a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$d */
    /* loaded from: classes6.dex */
    public class C15151d implements InterfaceC20094a {
        C15151d() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84961d() {
            Bundle bundle = new Bundle();
            bundle.putString("uid", SuggestFriendView.this.f78173h1.f146385a);
            bundle.putString("dpn", SuggestFriendView.this.f78173h1.f146387c);
            bundle.putString("phone", SuggestFriendView.this.f78173h1.f146394j);
            bundle.putString("avatar", SuggestFriendView.this.f78173h1.f146393i);
            if (SuggestFriendView.this.m92676n2() != null) {
                SuggestFriendView.this.m92676n2().mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
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
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                suggestFriendView.f78174i1 = z11;
                suggestFriendView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SuggestFriendView suggestFriendView;
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
                                    if (!C18644n.m98531l().m98558u(SuggestFriendView.this.f78172g1)) {
                                        TrackingSource trackingSource = new TrackingSource(SuggestFriendView.this.f78173h1.f146389e);
                                        trackingSource.m40677a("sourceView", 2);
                                        C21927m.m114302u().m114330e0(SuggestFriendView.this.f78173h1.f146385a, trackingSource);
                                        if (AbstractC21935u.m114553t(5)) {
                                            SuggestFriendView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gq0
                                                public /* synthetic */ gq0() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    SuggestFriendView.C15151d.this.m84961d();
                                                }
                                            });
                                        } else {
                                            SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
                                            C31874cb c31874cb = suggestFriendView2.f78173h1;
                                            suggestFriendView2.m84939IM(c31874cb.f146385a, c31874cb.f146389e);
                                            z11 = false;
                                        }
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                                        C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                                        SuggestFriendView suggestFriendView3 = SuggestFriendView.this;
                                        suggestFriendView3.m84945nM(suggestFriendView3.f78172g1);
                                        AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                                    C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                                    SuggestFriendView suggestFriendView4 = SuggestFriendView.this;
                                    suggestFriendView4.m84945nM(suggestFriendView4.f78172g1);
                                    AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
                                    if (!AbstractC21935u.m114558y(SuggestFriendView.this.f78172g1)) {
                                        SuggestFriendView suggestFriendView5 = SuggestFriendView.this;
                                        suggestFriendView5.m84944MM(suggestFriendView5.f78172g1);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(SuggestFriendView.this.f78172g1);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(SuggestFriendView.this.f78172g1, optInt2);
                                AbstractC2364o0.m12373p(SuggestFriendView.this, 3);
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(SuggestFriendView.this.f78172g1));
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                                C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                                SuggestFriendView suggestFriendView6 = SuggestFriendView.this;
                                suggestFriendView6.m84945nM(suggestFriendView6.f78172g1);
                                AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(SuggestFriendView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            SuggestFriendView.this.f78167b1 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(SuggestFriendView.this, 100);
                        }
                    }
                    suggestFriendView = SuggestFriendView.this;
                    suggestFriendView.f78174i1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    suggestFriendView = SuggestFriendView.this;
                    suggestFriendView.f78174i1 = false;
                }
                suggestFriendView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendView suggestFriendView7 = SuggestFriendView.this;
                suggestFriendView7.f78174i1 = false;
                suggestFriendView7.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$e */
    /* loaded from: classes6.dex */
    class C15152e implements InterfaceC20094a {
        C15152e() {
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
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                suggestFriendView.f78176k1 = false;
                suggestFriendView.f72421L0.mo78960q3();
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
                            AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                            C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                            SuggestFriendView suggestFriendView = SuggestFriendView.this;
                            suggestFriendView.m84945nM(suggestFriendView.f78172g1);
                            AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
                            AbstractC23063f2.m118349a(SuggestFriendView.this.f78173h1.m153177a());
                        } else {
                            AbstractC23063f2.m118357i(i11, SuggestFriendView.this.f78172g1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(SuggestFriendView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            SuggestFriendView.this.f78167b1 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(SuggestFriendView.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
                suggestFriendView2.f78176k1 = false;
                suggestFriendView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendView suggestFriendView3 = SuggestFriendView.this;
                suggestFriendView3.f78176k1 = false;
                suggestFriendView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$f */
    /* loaded from: classes6.dex */
    public class C15153f implements InterfaceC20094a {
        C15153f() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84963d() {
            AbstractC21935u.m114523M(SuggestFriendView.this.f72421L0.m92662fJ(), SuggestFriendView.this.f78182q1);
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
                SuggestFriendView suggestFriendView = SuggestFriendView.this;
                suggestFriendView.f78179n1 = z11;
                suggestFriendView.f72421L0.mo78960q3();
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
                            AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                            C21927m.m114302u().m114337i(SuggestFriendView.this.f78172g1);
                            AbstractC23063f2.m118365q(SuggestFriendView.this.f78172g1);
                            C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestSuccess));
                            SuggestFriendView suggestFriendView = SuggestFriendView.this;
                            suggestFriendView.m84945nM(suggestFriendView.f78172g1);
                            AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
                            if (SuggestFriendView.this.f72421L0.m92676n2() != null) {
                                SuggestFriendView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.hq0
                                    public /* synthetic */ hq0() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SuggestFriendView.C15153f.this.m84963d();
                                    }
                                });
                            }
                        } else if (!AbstractC23216t1.m119641f(SuggestFriendView.this.f72421L0, i11, true)) {
                            ToastUtils.m89259g(i11);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
                suggestFriendView2.f78179n1 = false;
                suggestFriendView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendView suggestFriendView3 = SuggestFriendView.this;
                suggestFriendView3.f78179n1 = false;
                suggestFriendView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$g */
    /* loaded from: classes6.dex */
    public class C15154g implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$g$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78206a;

            a(ContactProfile contactProfile) {
                this.f78206a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f78206a);
            }
        }

        C15154g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SuggestFriendView suggestFriendView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    suggestFriendView = SuggestFriendView.this;
                    suggestFriendView.f78183r1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SuggestFriendView.this.f78183r1 = false;
                    suggestFriendView = SuggestFriendView.this;
                }
                suggestFriendView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
                suggestFriendView2.f78183r1 = false;
                suggestFriendView2.f72421L0.mo78960q3();
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
                        AbstractC23059e9.m118317F(SuggestFriendView.this.f78172g1);
                        C21927m.m114302u().m114337i(SuggestFriendView.this.f78172g1);
                        AbstractC23063f2.m118365q(SuggestFriendView.this.f78172g1);
                        C21933s.m114404I().m114421H0(SuggestFriendView.this.f78172g1);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                        SuggestFriendView suggestFriendView = SuggestFriendView.this;
                        suggestFriendView.m84945nM(suggestFriendView.f78172g1);
                        if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            str = "";
                            str2 = str;
                            i11 = 0;
                        } else {
                            i11 = optJSONObject.optInt("action", 0);
                            str2 = optJSONObject.optString("alias");
                            str = optJSONObject.optString("desc");
                        }
                        if (!SuggestFriendView.this.f78160U0.isEmpty()) {
                            for (int i12 = 0; i12 < SuggestFriendView.this.f78160U0.size(); i12++) {
                                if (((C31859bb) SuggestFriendView.this.f78160U0.get(i12)).m153145a() == null) {
                                    str3 = "";
                                } else {
                                    str3 = ((C31859bb) SuggestFriendView.this.f78160U0.get(i12)).m153145a().f146385a;
                                }
                                if (!TextUtils.isEmpty(SuggestFriendView.this.f78172g1) && SuggestFriendView.this.f78172g1.equals(str3) && (m153177a = ((C31859bb) SuggestFriendView.this.f78160U0.get(i12)).m153145a().m153177a()) != null) {
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
                                    if (map.containsKey(SuggestFriendView.this.f78172g1) && map.get(SuggestFriendView.this.f78172g1) != null) {
                                        m153177a.f42438s0 = ((C31965ic) map.get(SuggestFriendView.this.f78172g1)).m153681a();
                                    }
                                    if (C21927m.m114302u().m114357s() != null) {
                                        if (!C21927m.m114302u().m114357s().m153137g(SuggestFriendView.this.f78172g1)) {
                                            C21927m.m114302u().m114357s().add(m153177a);
                                            C0824j.m2153b(new a(m153177a));
                                        } else if (C21927m.m114302u().m114357s().m153138j(SuggestFriendView.this.f78172g1) != null) {
                                            ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(SuggestFriendView.this.f78172g1);
                                            m153138j.f42456y0 = i11;
                                            if (!TextUtils.isEmpty(str2)) {
                                                m153138j.f42442t1 = str2;
                                            }
                                            if (!TextUtils.isEmpty(str)) {
                                                m153138j.f42436r1 = new SpannableStringBuilder(str);
                                            }
                                        }
                                    }
                                    AbstractC23074g2.m118375a(0, SuggestFriendView.this.f78172g1, "", 4);
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
                SuggestFriendView suggestFriendView2 = SuggestFriendView.this;
                suggestFriendView2.f78183r1 = false;
                suggestFriendView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SuggestFriendView suggestFriendView3 = SuggestFriendView.this;
                suggestFriendView3.f78183r1 = false;
                suggestFriendView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$h */
    /* loaded from: classes6.dex */
    public class C15155h implements C21933s.x {
        C15155h() {
        }

        /* renamed from: e */
        public /* synthetic */ void m84966e(C20096c c20096c) {
            try {
                SuggestFriendView.this.m84948pv(false, c20096c.m104491c());
                AbstractC23088h5.m118431l();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m84967f() {
            SuggestFriendView.this.m84938HM();
            SuggestFriendView.this.m84948pv(false, 0);
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            if (suggestFriendView.f78169d1) {
                suggestFriendView.f78169d1 = false;
                C23744a.m124114c().m124116d(6094, new Object[0]);
            }
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            suggestFriendView.f78185t1 = false;
            suggestFriendView.f78168c1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jq0
                public /* synthetic */ jq0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SuggestFriendView.C15155h.this.m84967f();
                }
            });
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            suggestFriendView.f78185t1 = false;
            suggestFriendView.f78168c1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.iq0

                /* renamed from: q */
                public final /* synthetic */ C20096c f80710q;

                public /* synthetic */ iq0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SuggestFriendView.C15155h.this.m84966e(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$i */
    /* loaded from: classes6.dex */
    public class C15156i implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$i$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f78210a;

            a(ContactProfile contactProfile) {
                this.f78210a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f78210a.f42434r);
            }
        }

        C15156i() {
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
                    AbstractC23350e.m122776f(SuggestFriendView.f78154A1, e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$j */
    /* loaded from: classes6.dex */
    public class C15157j implements C21933s.x {
        C15157j() {
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            suggestFriendView.f78168c1.post(suggestFriendView.f78186u1);
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestFriendView$k */
    /* loaded from: classes6.dex */
    public class C15158k implements C21933s.x {
        C15158k() {
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            SuggestFriendView suggestFriendView = SuggestFriendView.this;
            suggestFriendView.f78168c1.post(suggestFriendView.f78186u1);
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
        }
    }

    /* renamed from: AM */
    public static /* synthetic */ void m84923AM(String str) {
        C21933s.m114404I().m114457b0(str, false);
    }

    /* renamed from: BM */
    public /* synthetic */ void m84924BM() {
        if (C23055e5.m118271f()) {
            m84948pv(true, 0);
            m84955wM();
        } else {
            this.f78159T0.setVisibility(0);
            this.f78159T0.setState(MultiStateView.EnumC15914e.ERROR);
            this.f78159T0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
            this.f78159T0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m84925CM() {
        m84938HM();
        m84948pv(false, 0);
    }

    /* renamed from: DM */
    public /* synthetic */ Void m84926DM() {
        C21933s.m114404I().m114421H0(this.f78172g1);
        m84945nM(this.f78172g1);
        return null;
    }

    /* renamed from: EM */
    public /* synthetic */ void m84927EM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f78161V0 != null) {
            int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
            if (intValue == AbstractC8020f0.view_detail_zalouser) {
                C21927m.m114302u().m114330e0(this.f78161V0.f146385a, new TrackingSource(this.f78161V0.f146389e));
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(this.f78161V0.f146385a, C32002l4.m154264g(27)).m135739F("3133").m135743b(), 0, 1));
                return;
            }
            if (intValue == AbstractC8020f0.str_menu_item_delete_request) {
                this.f78173h1 = this.f78161V0;
                m84951sM();
            } else if (intValue == AbstractC8020f0.str_menu_item_delete_suggest) {
                this.f78173h1 = this.f78161V0;
                m84951sM();
            }
        }
    }

    /* renamed from: FM */
    public /* synthetic */ Void m84928FM() {
        C21933s.m114404I().m114421H0(this.f78172g1);
        m84945nM(this.f78172g1);
        AbstractC23647d.m123897g("5801089");
        return null;
    }

    /* renamed from: zM */
    public /* synthetic */ void m84936zM() {
        try {
            m84938HM();
            m84948pv(false, 0);
            m84946oM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: B1 */
    public void mo36004B1() {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f78168c1 = new Handler(Looper.getMainLooper());
        m92637BK(true);
        if (m92642L3() != null) {
            this.f78171f1 = m92642L3().getBoolean("EXTRA_OPEN_FROM_TAB_CONTACT", false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 100) {
                            return null;
                        }
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f78167b1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
                        return aVar.m43152a();
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.view_detail_zalouser));
                    hashMap.put("id", Integer.valueOf(AbstractC8020f0.view_detail_zalouser));
                    arrayList.add(hashMap);
                    C31874cb c31874cb = this.f78161V0;
                    if (c31874cb != null) {
                        int i12 = c31874cb.f146399o;
                        if (i12 == 1) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_delete_suggest));
                            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_menu_item_delete_suggest));
                            arrayList.add(hashMap2);
                        } else if (i12 == 2) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_delete_request));
                            hashMap3.put("id", Integer.valueOf(AbstractC8020f0.str_menu_item_delete_request));
                            arrayList.add(hashMap3);
                        }
                    }
                    SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                    C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                    C31874cb c31874cb2 = this.f78161V0;
                    if (c31874cb2 != null) {
                        aVar2.m43172u(c31874cb2.m153180d(true, false));
                    }
                    aVar2.m43173v(100);
                    aVar2.m43155d(true);
                    aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cq0

                        /* renamed from: q */
                        public final /* synthetic */ SimpleAdapter f80047q;

                        public /* synthetic */ cq0(SimpleAdapter simpleAdapter2) {
                            r2 = simpleAdapter2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                            SuggestFriendView.this.m84927EM(r2, interfaceC17463d, i13);
                        }
                    });
                    return aVar2.m43152a();
                }
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), this);
                return aVar3.m43152a();
            }
            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
            aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar4.m43152a();
        }
        C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
        aVar5.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_ask_to_delete_selected)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar5.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        int i11 = AbstractC16803z.icon_header_settings;
        actionBarMenu.m92738e(i11, i11);
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Fx */
    public void mo36005Fx(int i11, int i12) {
        int i13;
        int i14;
        AbstractC23647d.m123897g("3120");
        if (i11 >= 0 && i11 < this.f78158S0.mo10003k()) {
            C31874cb m153145a = this.f78158S0.m35968L(i11).m153145a();
            this.f78173h1 = m153145a;
            if (m153145a != null) {
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                m84942Kv(m153145a.m153177a());
                            }
                        } else {
                            m84951sM();
                        }
                    } else if (m153145a.f146399o == 2) {
                        this.f78172g1 = m153145a.f146385a;
                        ContactProfile m153177a = m153145a.m153177a();
                        TrackingSource trackingSource = new TrackingSource(m153177a.f42373R0);
                        trackingSource.m40677a("sourceView", 2);
                        C21927m.m114302u().m114328d0(this.f78172g1, trackingSource);
                        AbstractC21935u.m114522L(m153177a, 0, new C26365a.b(m153177a.f42434r, C32002l4.m154264g(27)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.eq0
                            public /* synthetic */ eq0() {
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Void m84928FM;
                                m84928FM = SuggestFriendView.this.m84928FM();
                                return m84928FM;
                            }
                        });
                    }
                } else if (m153145a.f146390f > 0) {
                    String str = m153145a.f146385a;
                    this.f78172g1 = str;
                    m84952tM(Integer.parseInt(str));
                } else {
                    String str2 = m153145a.f146385a;
                    this.f78172g1 = str2;
                    m84954vM(str2);
                }
                C28905e m144373n = C28905e.m144373n();
                String str3 = this.f78173h1.f146385a;
                if (i12 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                m144373n.m144400v(str3, i13, 93, i11, "");
                if (i12 == 2) {
                    AbstractC23647d.m123897g("5801184");
                    i14 = 4;
                } else {
                    i14 = 3;
                }
                C0815e1.m2075D().m2099U(3, i14, 26, String.valueOf(1), String.valueOf(this.f78173h1.f146385a), String.valueOf(i11), String.valueOf(this.f78173h1.f146399o), String.valueOf(this.f78173h1.f146389e));
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f78155P0 = layoutInflater.inflate(AbstractC7409c0.suggest_request_view, viewGroup, false);
        m84957yM();
        return this.f78155P0;
    }

    /* renamed from: GM */
    void m84937GM(int i11) {
        String m118743r0;
        C17487o0 c17487o0;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_id_type", C21933s.m114404I().m114420H(i11));
            bundle.putInt("extra_type", i11);
            bundle.putInt("extra_mode", 0);
            if (i11 == 0) {
                m118743r0 = C21933s.m114404I().f107933v;
                if (TextUtils.isEmpty(m118743r0)) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_title);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_friend);
            }
            bundle.putString("extra_title_action_bar", m118743r0);
            bundle.putInt("extra_init_page", C21933s.m114404I().m114439R(i11));
            if (this.f72421L0.m92676n2() != null) {
                c17487o0 = this.f72421L0.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            if (c17487o0 != null) {
                c17487o0.m93069k2(SuggestFriendDetailView.class, bundle, 1, true);
            }
            AbstractC23647d.m123897g("5801188");
            C0815e1.m2075D().m2099U(3, 2, 26, String.valueOf(1), "0", "0", String.valueOf(i11), "0");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HM */
    public void m84938HM() {
        try {
            this.f78160U0.clear();
            MiniProfileView.m81811kM();
            this.f78160U0.addAll(C21933s.m114404I().m114452Y(false));
            this.f78158S0.m35982Z(this.f78160U0);
            this.f78158S0.m35986d0(C21933s.m114404I().f107877D);
            this.f78158S0.m35985c0(C21933s.m114404I().f107878E);
            this.f78158S0.m10008p();
            LinearLayoutManager linearLayoutManager = this.f78157R0;
            if (linearLayoutManager != null) {
                m84943LM(this.f78160U0, linearLayoutManager.m9740Y1(), this.f78157R0.m9745c2());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
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
    public void m84939IM(String str, int i11) {
        String str2;
        if (this.f78176k1) {
            return;
        }
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        if (m114310H == null) {
            str2 = "";
        } else {
            str2 = m114310H.m40682o();
        }
        this.f78176k1 = true;
        this.f78177l1.mo1704o8(this.f78178m1);
        this.f78177l1.mo1620d7(str, "", i11, str2);
    }

    /* renamed from: JM */
    void m84940JM(int i11) {
        MultiStateView multiStateView = this.f78159T0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (i11 == -1) {
                int mo92862f = interfaceC17463d.mo92862f();
                if (mo92862f != 1) {
                    if (mo92862f != 2) {
                        if (mo92862f == 3) {
                            interfaceC17463d.dismiss();
                            ContactProfile m153177a = this.f78173h1.m153177a();
                            TrackingSource trackingSource = new TrackingSource(m153177a.f42373R0);
                            trackingSource.m40677a("sourceView", 2);
                            C21927m.m114302u().m114328d0(this.f78172g1, trackingSource);
                            AbstractC21935u.m114522L(m153177a, 0, new C26365a.b(m153177a.f42434r, C32002l4.m154264g(27)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.yp0
                                public /* synthetic */ yp0() {
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Void m84926DM;
                                    m84926DM = SuggestFriendView.this.m84926DM();
                                    return m84926DM;
                                }
                            });
                        }
                    } else {
                        AbstractC23647d.m123907q("5320", "");
                        interfaceC17463d.dismiss();
                        AbstractC23309i.m121177Lx(true);
                        this.f72421L0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                        AbstractC23647d.m123893c();
                    }
                } else {
                    interfaceC17463d.dismiss();
                    this.f88760a0.m92716k();
                }
            } else if (i11 == -2) {
                int mo92862f2 = interfaceC17463d.mo92862f();
                if (mo92862f2 != 2) {
                    if (mo92862f2 == 100) {
                        interfaceC17463d.dismiss();
                        C31874cb c31874cb = this.f78173h1;
                        if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
                            ContactProfile contactProfile = new ContactProfile(this.f78173h1.f146385a);
                            C31874cb c31874cb2 = this.f78173h1;
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
                } else {
                    AbstractC23647d.m123907q("5310", "");
                    interfaceC17463d.dismiss();
                    AbstractC23647d.m123893c();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public void m84941KM(int i11) {
        MultiStateView multiStateView = this.f78159T0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: Kv */
    void m84942Kv(ContactProfile contactProfile) {
        Intent intent = new Intent();
        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
        intent.putExtras(m140776b);
        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
    }

    /* renamed from: LM */
    void m84943LM(List list, int i11, int i12) {
        if (AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C15150c(new ArrayList(list), i11, i12));
    }

    /* renamed from: MM */
    public void m84944MM(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15156i());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1043));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Pj */
    public void mo36006Pj() {
        m84937GM(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC16803z.icon_header_settings) {
            AbstractC23647d.m123897g("5901177");
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_INT_SOURCE_VIEW", 2);
            this.f72421L0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
            return true;
        }
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("5901176");
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
            this.f78170e1 = C21927m.m114302u().m114353q().size();
            C23744a.m124114c().m124117e(this, 6096);
            C23744a.m124114c().m124117e(this, 6091);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Rn */
    public void mo36008Rn(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            bundle.putInt("lastNumberNew", this.f78170e1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f78154A1, e11);
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (this.f78171f1) {
            C21933s.m114404I().m114477l0();
            AbstractC25636f.m132477g();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: c7 */
    public boolean mo36009c7() {
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C21933s.m114404I().m114428L0();
        super.finish();
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: g2 */
    public boolean mo36010g2(String str) {
        return C21933s.m114404I().m114484p0(str);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78154A1;
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: n */
    public void mo36011n(int i11) {
        int i12;
        try {
            AbstractC23647d.m123897g("3110");
            C7045d9 c7045d9 = this.f78158S0;
            if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
                C31874cb m153145a = this.f78158S0.m35968L(i11).m153145a();
                this.f78161V0 = m153145a;
                if (m153145a != null) {
                    AbstractC23059e9.m118317F(m153145a.f146385a);
                    if (C21933s.m114404I().m114486q0(this.f78161V0.f146385a)) {
                        C21933s.m114404I().m114421H0(this.f78161V0.f146385a);
                        C7045d9 c7045d92 = this.f78158S0;
                        if (c7045d92 != null) {
                            c7045d92.m10008p();
                        }
                    }
                    C31874cb c31874cb = this.f78161V0;
                    if (c31874cb.f146399o == 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    if (c31874cb.f146390f > 0) {
                        if (C21927m.m114302u().m114357s().m153137g(this.f78161V0.f146385a)) {
                            m84942Kv(this.f78161V0.m153177a());
                        } else {
                            if (!TextUtils.isEmpty(this.f78161V0.f146385a)) {
                                C21927m.m114302u().m114330e0(this.f78161V0.f146385a, new TrackingSource(290));
                            }
                            AbstractC23074g2.m118380f(this.f78161V0, this.f72421L0.m92662fJ(), 1000, 0, i12, 2, 290);
                        }
                    } else {
                        AbstractC23647d.m123897g("5801185");
                        AbstractC23074g2.m118379e(this.f78161V0, this.f72421L0.m92662fJ(), 1000, 0, i12, 2);
                    }
                    C28905e.m144373n().m144400v(this.f78161V0.f146385a, 20, 93, i11, "");
                    C0815e1.m2075D().m2099U(3, 2, 26, String.valueOf(1), String.valueOf(this.f78161V0.f146385a), String.valueOf(i11), String.valueOf(this.f78161V0.f146399o), String.valueOf(this.f78161V0.f146389e));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m84945nM(String str) {
        try {
            C21933s.m114404I().m114454a(str);
            AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f78158S0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m84946oM() {
        try {
            boolean m114494u0 = C21933s.m114404I().m114494u0();
            boolean m114496v0 = C21933s.m114404I().m114496v0();
            if (m114494u0) {
                C21933s.m114404I().m114462e(1, new C15157j());
            }
            if (m114496v0) {
                C21933s.m114404I().m114462e(0, new C15158k());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle extras;
        C17487o0 c17487o0;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000) {
            if (!this.f78185t1) {
                C21933s.m114404I().m114436P0();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.zp0
                        public /* synthetic */ zp0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestFriendView.this.m84925CM();
                        }
                    });
                }
            }
        } else if (i11 == 1002) {
            if (!AbstractC23059e9.m118316E()) {
                if (AbstractC23309i.m122500vc()) {
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    if (c17487o0 != null) {
                        c17487o0.m93069k2(NearbyZView.class, null, 1, true);
                    }
                } else {
                    this.f72421L0.showDialog(2);
                }
            }
        } else if (i11 == 10099) {
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("result.accept_friend_uid")) {
                String string = extras.getString("result.accept_friend_uid");
                if (!TextUtils.isEmpty(string)) {
                    C21933s.m114404I().m114453Z(string);
                    m84945nM(string);
                }
            }
        } else if (i11 == 1085 && i12 == -1) {
            m84945nM(this.f78172g1);
        }
        this.f72421L0.m92643OI(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C17487o0 mo35579p;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_find_friend_via_location) {
                if (AbstractC23059e9.m118316E()) {
                    m84953uM();
                } else if (AbstractC23309i.m122500vc()) {
                    this.f72421L0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                } else {
                    this.f72421L0.showDialog(2);
                }
            } else if (id2 == AbstractC6918a0.ll_suggest_find_friend) {
                this.f72421L0.m92662fJ().m93069k2(FindFriendByPhoneNumberView.class, null, 1, true);
            } else if (id2 == AbstractC6918a0.ll_phonebook_suggestion && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
                mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                AbstractC23647d.m123897g("5901176");
                C21933s.m114404I().m114428L0();
                return super.onKeyUp(i11, keyEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C23744a.m124114c().m124115b(this, 6096);
            C23744a.m124114c().m124115b(this, 6091);
            if (C21933s.m114404I().f107931t) {
                C21933s.m114404I().f107931t = false;
                m84938HM();
            }
            if (C21933s.m114404I().m114500x0() || (C21927m.m114302u().m114353q() != null && this.f78170e1 != C21927m.m114302u().m114353q().size())) {
                ArrayList arrayList = this.f78160U0;
                if (arrayList != null && arrayList.isEmpty()) {
                    m84948pv(true, 0);
                }
                m84955wM();
            }
            if (C21933s.m114404I().f107874A) {
                C21933s.m114404I().f107874A = false;
                AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f78158S0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0114 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0005, B:12:0x0019, B:14:0x001d, B:17:0x002d, B:19:0x0033, B:21:0x003b, B:23:0x0041, B:25:0x0056, B:28:0x0065, B:30:0x0072, B:32:0x007e, B:36:0x0134, B:37:0x0083, B:39:0x0087, B:41:0x008d, B:44:0x0092, B:46:0x009e, B:48:0x00a4, B:50:0x00ac, B:52:0x00ba, B:54:0x010a, B:56:0x0114, B:59:0x00cf, B:62:0x00fc, B:64:0x0121, B:66:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x0144, B:76:0x0026, B:77:0x0012), top: B:2:0x0005 }] */
    /* renamed from: pM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m84947pM(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        C31859bb c31859bb;
        C23669z c23669z;
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
            C0855y0 c0855y0 = this.f78191z1;
            if (c0855y0 == null) {
                m2385c = new HashMap();
            } else {
                m2385c = c0855y0.m2385c();
            }
            for (int i13 = 0; i13 < size; i13++) {
                if (list.get(i13) != null && (c31859bb = (C31859bb) list.get(i13)) != null && c31859bb.m153145a() != null && !c31859bb.m153145a().f146385a.startsWith("-")) {
                    C31874cb m153145a = c31859bb.m153145a();
                    if (i13 >= i11 && i13 <= i12) {
                        String valueOf = String.valueOf(i13);
                        if (m2385c.containsKey(m153145a.f146385a)) {
                            C23669z c23669z2 = (C23669z) m2385c.get(m153145a.f146385a);
                            if (c23669z2 instanceof C23651h) {
                                C23651h c23651h = (C23651h) c23669z2;
                                if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l() && !c23669z2.f114660g) {
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
                            c23669z = (C23669z) m2385c.get(m153145a.f146385a);
                            if (c23669z != null) {
                                C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z);
                            }
                        } else {
                            C23651h m123961i = C23651h.m123961i(26, String.valueOf(1), m153145a.f146385a, valueOf, String.valueOf(m153145a.f146399o), String.valueOf(m153145a.f146389e));
                            if (m123961i == null) {
                                c11 = 0;
                            } else {
                                m123961i.f114654a = 3;
                                m123961i.f114655b = 1;
                                m123961i.f114657d = 26;
                                m123961i.f114660g = true;
                                m2385c.put(m153145a.f146385a, m123961i);
                                c23669z = (C23669z) m2385c.get(m153145a.f146385a);
                                if (c23669z != null) {
                                }
                            }
                        }
                    } else if (m2385c.containsKey(m153145a.f146385a)) {
                        c11 = 0;
                        ((C23669z) m2385c.get(m153145a.f146385a)).f114660g = false;
                    }
                    c11 = 0;
                }
            }
            if (this.f78191z1 == null) {
                this.f78191z1 = new C0855y0();
            }
            this.f78191z1.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pv */
    public void m84948pv(boolean z11, int i11) {
        MultiStateView.EnumC15915f enumC15915f;
        int i12;
        try {
            if (z11) {
                this.f78162W0.setVisibility(8);
                this.f78156Q0.setVisibility(8);
                this.f78159T0.setVisibility(0);
                this.f78159T0.setState(MultiStateView.EnumC15914e.LOADING);
                return;
            }
            C7045d9 c7045d9 = this.f78158S0;
            if (c7045d9 != null && c7045d9.mo10003k() != 0) {
                this.f78156Q0.setVisibility(0);
                this.f78162W0.setVisibility(8);
                this.f78159T0.setVisibility(8);
                return;
            }
            this.f78156Q0.setVisibility(8);
            if (i11 == 0) {
                this.f78162W0.setVisibility(0);
                this.f78159T0.setVisibility(8);
                this.f78159T0.setState(MultiStateView.EnumC15914e.EMPTY);
                return;
            }
            this.f78162W0.setVisibility(8);
            MultiStateView multiStateView = this.f78159T0;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView.setErrorType(enumC15915f);
            this.f78159T0.setVisibility(0);
            this.f78159T0.setState(MultiStateView.EnumC15914e.ERROR);
            MultiStateView multiStateView2 = this.f78159T0;
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_error_loadingList;
            }
            multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m84949qM() {
        C31874cb c31874cb;
        int height;
        try {
            int m9745c2 = this.f78157R0.m9745c2();
            for (int m9740Y1 = this.f78157R0.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                if (this.f78158S0.m35968L(m9740Y1) != null && (c31874cb = this.f78158S0.m35968L(m9740Y1).f146291b) != null) {
                    View mo9732P = this.f78157R0.mo9732P(m9740Y1);
                    if ((this.f78156Q0.m9823C0(mo9732P) instanceof C7045d9.a) && mo9732P.getTop() + mo9732P.getBottom() > (height = (int) (mo9732P.getHeight() * 0.8f)) && this.f78156Q0.getHeight() - mo9732P.getTop() > height) {
                        C28905e.m144373n().m144400v(c31874cb.f146385a, 10, 93, m9740Y1, "");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m84950rM(Map map) {
        if (this.f78187v1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        try {
            ArrayList arrayList = new ArrayList();
            this.f78190y1.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C31874cb c31874cb = (C31874cb) entry.getValue();
                if (!C21933s.m114404I().m114484p0(str)) {
                    arrayList.add(c31874cb);
                }
                this.f78190y1.add(str);
            }
            if (!arrayList.isEmpty()) {
                this.f78187v1 = true;
                this.f78188w1.mo1704o8(this.f78189x1);
                this.f78188w1.mo1453I7(arrayList, TrackingSource.m40665d(2));
            } else {
                C21933s.m114404I().m114459c0(this.f78190y1);
                AbstractC23074g2.m118376b(1, this.f78190y1, "", 4);
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.dq0
                        public /* synthetic */ dq0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestFriendView.this.m84936zM();
                        }
                    });
                }
                this.f78187v1 = false;
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f78154A1, e11.toString());
            this.f78187v1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: sM */
    void m84951sM() {
        try {
            HashMap hashMap = new HashMap();
            C31874cb c31874cb = this.f78173h1;
            if (c31874cb != null) {
                hashMap.put(c31874cb.f146385a, c31874cb);
                m84950rM(hashMap);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: t3 */
    public void mo36012t3() {
    }

    /* renamed from: tM */
    void m84952tM(int i11) {
        try {
            if (this.f78183r1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f78184s1);
            this.f78183r1 = true;
            c0766k.mo1578Y4(i11, new TrackingSource(290));
        } catch (Exception e11) {
            this.f78183r1 = false;
            this.f72421L0.mo78960q3();
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u1 */
    public void mo36013u1() {
        m84937GM(1);
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u4 */
    public void mo36014u4() {
        AbstractC23647d.m123897g("5901175");
    }

    /* renamed from: uM */
    public void m84953uM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showUpdateProfileHint", true);
        bundle.putBoolean("update", true);
        this.f72421L0.m92662fJ().m93066i2(UpdateUserInfoZView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
    }

    /* renamed from: vM */
    public void m84954vM(String str) {
        try {
            if (this.f78174i1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f78174i1 = true;
            this.f78172g1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f78175j1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f78174i1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: wM */
    public void m84955wM() {
        if (this.f78185t1) {
            return;
        }
        this.f78185t1 = true;
        C21933s.m114404I().m114481o();
        C21933s.m114404I().m114449W(new C15155h());
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: wb */
    public boolean mo36015wb(int i11) {
        try {
            C7045d9 c7045d9 = this.f78158S0;
            if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
                C31874cb m153145a = this.f78158S0.m35968L(i11).m153145a();
                this.f78161V0 = m153145a;
                if (m153145a != null) {
                    this.f72421L0.showDialog(4);
                    return true;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6096) {
            Handler handler = this.f78168c1;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.aq0
                    public /* synthetic */ aq0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SuggestFriendView.this.m84955wM();
                    }
                }, 200L);
                return;
            }
            return;
        }
        if (i11 == 6091 && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bq0

                    /* renamed from: p */
                    public final /* synthetic */ String f79950p;

                    public /* synthetic */ bq0(String str) {
                        r1 = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SuggestFriendView.m84923AM(r1);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m84956xM(bundle);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("STR_EXTRA_NOTI_TYPE");
                int i11 = m92642L3.getInt("INT_EXTRA_NOTI_ACTION_TYPE", 0);
                if (!TextUtils.isEmpty(string)) {
                    AbstractC23647d.m123906p(String.format(string, Integer.valueOf(i11)));
                    AbstractC23647d.m123893c();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m84956xM(Bundle bundle) {
        boolean z11;
        int i11;
        if (bundle != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            this.f78169d1 = z11;
            this.f78166a1 = new C23528a(this.f72421L0.m92648SI());
            this.f78159T0.setEnableLoadingText(false);
            this.f78159T0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.wp0
                public /* synthetic */ wp0() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    SuggestFriendView.this.m84924BM();
                }
            });
            this.f78163X0.setOnClickListener(this);
            boolean m121849e = AbstractC23309i.m121849e();
            LinearLayout linearLayout = this.f78163X0;
            if (m121849e) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
            this.f78164Y0.setOnClickListener(this);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
            this.f78157R0 = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            this.f78156Q0.setLayoutManager(this.f78157R0);
            this.f78156Q0.setOverScrollMode(2);
            this.f78156Q0.m9826E(new C15148a());
            C7045d9 c7045d9 = new C7045d9(this.f72421L0.m92648SI(), this.f78166a1);
            this.f78158S0 = c7045d9;
            c7045d9.m35983a0(this);
            this.f78156Q0.setAdapter(this.f78158S0);
            m84941KM(AbstractC8020f0.empty_list);
            m84940JM(AbstractC8020f0.loading);
            m84948pv(true, 0);
            m84955wM();
            C28023b6.m141222A();
            if (bundle != null && bundle.containsKey("lastNumberNew")) {
                this.f78170e1 = bundle.getInt("lastNumberNew");
            } else {
                this.f78170e1 = C21927m.m114302u().m114353q().size();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yM */
    void m84957yM() {
        this.f78156Q0 = (RecyclerView) this.f78155P0.findViewById(AbstractC6918a0.lv_friend_request);
        this.f78159T0 = (MultiStateView) this.f78155P0.findViewById(AbstractC6918a0.multi_state);
        LinearLayout linearLayout = (LinearLayout) this.f78155P0.findViewById(AbstractC6918a0.ll_suggest_friends);
        this.f78162W0 = linearLayout;
        linearLayout.setVisibility(8);
        this.f78163X0 = (LinearLayout) this.f78155P0.findViewById(AbstractC6918a0.ll_find_friend_via_location);
        this.f78164Y0 = (LinearLayout) this.f78155P0.findViewById(AbstractC6918a0.ll_suggest_find_friend);
        this.f78165Z0 = (LinearLayout) this.f78155P0.findViewById(AbstractC6918a0.ll_phonebook_suggestion);
        if (!AbstractC23309i.m122119l4() && !AbstractC23309i.m122157m4()) {
            this.f78165Z0.setVisibility(8);
        } else {
            this.f78165Z0.setVisibility(0);
            this.f78165Z0.setOnClickListener(this);
        }
    }
}
