package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0824j;
import ag0.C0855y0;
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
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import com.zing.p058v4.widget.SwipeRefreshLayout;
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
import com.zing.zalo.p077ui.zviews.PeopleYouMayKnowView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
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
import p361nb.C23651h;
import p361nb.C23669z;
import p420pb.C24709a;
import p510sq.C26365a;
import p716zh.C31859bb;
import p716zh.C31874cb;
import p716zh.C31965ic;
import p716zh.C32002l4;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class PeopleYouMayKnowView extends SlidableZaloView implements C7045d9.c, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: z1 */
    public static final String f75847z1 = "PeopleYouMayKnowView";

    /* renamed from: P0 */
    View f75848P0;

    /* renamed from: Q0 */
    RecyclerView f75849Q0;

    /* renamed from: R0 */
    C7045d9 f75850R0;

    /* renamed from: S0 */
    MultiStateView f75851S0;

    /* renamed from: T0 */
    LinearLayoutManager f75852T0;

    /* renamed from: U0 */
    C23528a f75853U0;

    /* renamed from: W0 */
    C31874cb f75855W0;

    /* renamed from: X0 */
    Handler f75856X0;

    /* renamed from: Y0 */
    SwipeRefreshListView f75857Y0;

    /* renamed from: b1 */
    ActionBarMenuItem f75860b1;

    /* renamed from: c1 */
    View f75861c1;

    /* renamed from: e1 */
    String f75863e1;

    /* renamed from: f1 */
    C31874cb f75864f1;

    /* renamed from: o1 */
    TextView f75873o1;

    /* renamed from: y1 */
    C0855y0 f75883y1;

    /* renamed from: V0 */
    ArrayList f75854V0 = new ArrayList();

    /* renamed from: Z0 */
    int f75858Z0 = 0;

    /* renamed from: a1 */
    String f75859a1 = "";

    /* renamed from: d1 */
    boolean f75862d1 = false;

    /* renamed from: g1 */
    boolean f75865g1 = false;

    /* renamed from: h1 */
    InterfaceC20094a f75866h1 = new C14725f();

    /* renamed from: i1 */
    boolean f75867i1 = false;

    /* renamed from: j1 */
    InterfaceC0765j f75868j1 = new C0766k();

    /* renamed from: k1 */
    InterfaceC20094a f75869k1 = new C14726g();

    /* renamed from: l1 */
    boolean f75870l1 = false;

    /* renamed from: m1 */
    InterfaceC20094a f75871m1 = new C14727h();

    /* renamed from: n1 */
    ImageView f75872n1 = null;

    /* renamed from: p1 */
    boolean f75874p1 = false;

    /* renamed from: q1 */
    InterfaceC0765j f75875q1 = new C0766k();

    /* renamed from: r1 */
    InterfaceC20094a f75876r1 = new C14729j();

    /* renamed from: s1 */
    ArrayList f75877s1 = new ArrayList();

    /* renamed from: t1 */
    int f75878t1 = -1;

    /* renamed from: u1 */
    int f75879u1 = -1;

    /* renamed from: v1 */
    boolean f75880v1 = false;

    /* renamed from: w1 */
    private final InterfaceC0765j f75881w1 = new C0766k();

    /* renamed from: x1 */
    private final InterfaceC20094a f75882x1 = new C14730k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$a */
    /* loaded from: classes6.dex */
    public class C14720a extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$a$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f75885a;

            /* renamed from: b */
            final /* synthetic */ int f75886b;

            /* renamed from: c */
            final /* synthetic */ List f75887c;

            a(int i11, int i12, List list) {
                this.f75885a = i11;
                this.f75886b = i12;
                this.f75887c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                PeopleYouMayKnowView.this.m82554lM(this.f75885a, this.f75886b, this.f75887c);
            }
        }

        C14720a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    PeopleYouMayKnowView.this.f75850R0.m35984b0(false);
                    PeopleYouMayKnowView.this.f75850R0.m10008p();
                    LinearLayoutManager linearLayoutManager = PeopleYouMayKnowView.this.f75852T0;
                    if (linearLayoutManager != null && linearLayoutManager.m9745c2() >= PeopleYouMayKnowView.this.f75850R0.mo10003k() - 1) {
                        PeopleYouMayKnowView.this.m82561qM();
                    }
                } else {
                    PeopleYouMayKnowView.this.f75850R0.m35984b0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                LinearLayoutManager linearLayoutManager = peopleYouMayKnowView.f75852T0;
                if (linearLayoutManager != null && peopleYouMayKnowView.f75850R0 != null) {
                    C0809c1.m2050b(new a(linearLayoutManager.m9740Y1(), PeopleYouMayKnowView.this.f75852T0.m9745c2(), PeopleYouMayKnowView.this.f75850R0.m35969M()));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$b */
    /* loaded from: classes6.dex */
    public class C14721b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31874cb f75889a;

        /* renamed from: b */
        final /* synthetic */ int f75890b;

        C14721b(C31874cb c31874cb, int i11) {
            this.f75889a = c31874cb;
            this.f75890b = i11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
            if (peopleYouMayKnowView.f75883y1 == null) {
                peopleYouMayKnowView.f75883y1 = new C0855y0();
            }
            HashMap m2384b = PeopleYouMayKnowView.this.f75883y1.m2384b();
            if (m2384b.containsKey(this.f75889a.f146385a)) {
                C23669z c23669z = (C23669z) m2384b.get(this.f75889a.f146385a);
                if (c23669z instanceof C23651h) {
                    C23651h c23651h = (C23651h) c23669z;
                    if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l()) {
                        String valueOf = String.valueOf(this.f75890b);
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
                            strArr[3] = String.valueOf(this.f75889a.f146399o);
                        }
                    } else {
                        return;
                    }
                }
            } else {
                C23651h m123961i = C23651h.m123961i(25, String.valueOf(1), this.f75889a.f146385a, String.valueOf(this.f75890b), String.valueOf(this.f75889a.f146399o), String.valueOf(this.f75889a.f146389e));
                if (m123961i == null) {
                    return;
                }
                m123961i.f114654a = 3;
                m123961i.f114655b = 2;
                m123961i.f114657d = 25;
                m2384b.put(this.f75889a.f146385a, m123961i);
            }
            C23669z c23669z2 = (C23669z) m2384b.get(this.f75889a.f146385a);
            if (c23669z2 != null) {
                C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23669z2);
            }
            PeopleYouMayKnowView.this.f75883y1.m2387e(m2384b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$c */
    /* loaded from: classes6.dex */
    public class C14722c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f75892a;

        /* renamed from: b */
        final /* synthetic */ int f75893b;

        /* renamed from: c */
        final /* synthetic */ int f75894c;

        C14722c(List list, int i11, int i12) {
            this.f75892a = list;
            this.f75893b = i11;
            this.f75894c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
            if (peopleYouMayKnowView.f75883y1 == null) {
                peopleYouMayKnowView.f75883y1 = new C0855y0();
            }
            HashMap m2385c = PeopleYouMayKnowView.this.f75883y1.m2385c();
            HashMap m2384b = PeopleYouMayKnowView.this.f75883y1.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f75892a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C31859bb c31859bb = (C31859bb) this.f75892a.get(i11);
                if (c31859bb != null && c31859bb.m153145a() != null && !TextUtils.isEmpty(c31859bb.m153145a().f146385a)) {
                    String str = c31859bb.m153145a().f146385a;
                    if (m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (c23651h2 = (C23651h) c23669z) != null && (strArr2 = c23651h2.f114659f) != null) {
                            if (!strArr2[2].equals(String.valueOf(i11))) {
                                c23651h2.f114659f[2] = String.valueOf(i11);
                            }
                            if (i11 < this.f75893b || i11 > this.f75894c) {
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
            PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
            if (peopleYouMayKnowView2.f75883y1 == null) {
                peopleYouMayKnowView2.f75883y1 = new C0855y0();
            }
            PeopleYouMayKnowView.this.f75883y1.m2386d(hashMap);
            PeopleYouMayKnowView.this.f75883y1.m2387e(hashMap2);
            PeopleYouMayKnowView.this.m82554lM(this.f75893b, this.f75894c, this.f75892a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$d */
    /* loaded from: classes6.dex */
    public class C14723d implements C21933s.x {
        C14723d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82568e(C20096c c20096c) {
            try {
                PeopleYouMayKnowView.this.m82560pv(false, c20096c.m104491c());
                SwipeRefreshListView swipeRefreshListView = PeopleYouMayKnowView.this.f75857Y0;
                if (swipeRefreshListView != null) {
                    swipeRefreshListView.setRefreshing(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82569f() {
            PeopleYouMayKnowView.this.m82543BM();
            SwipeRefreshListView swipeRefreshListView = PeopleYouMayKnowView.this.f75857Y0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
            peopleYouMayKnowView.f75862d1 = false;
            peopleYouMayKnowView.f75856X0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.h40
                @Override // java.lang.Runnable
                public final void run() {
                    PeopleYouMayKnowView.C14723d.this.m82569f();
                }
            });
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(final C20096c c20096c) {
            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
            peopleYouMayKnowView.f75862d1 = false;
            peopleYouMayKnowView.f75856X0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g40
                @Override // java.lang.Runnable
                public final void run() {
                    PeopleYouMayKnowView.C14723d.this.m82568e(c20096c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$e */
    /* loaded from: classes6.dex */
    public class C14724e implements C21933s.x {
        C14724e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82573d() {
            PeopleYouMayKnowView.this.m82543BM();
        }

        @Override // p304ks.C21933s.x
        /* renamed from: a */
        public void mo82570a(boolean z11, int i11) {
            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
            peopleYouMayKnowView.f75862d1 = false;
            peopleYouMayKnowView.f75856X0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i40
                @Override // java.lang.Runnable
                public final void run() {
                    PeopleYouMayKnowView.C14724e.this.m82573d();
                }
            });
        }

        @Override // p304ks.C21933s.x
        /* renamed from: b */
        public void mo82571b(C20096c c20096c) {
            PeopleYouMayKnowView.this.f75862d1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$f */
    /* loaded from: classes6.dex */
    public class C14725f implements InterfaceC20094a {
        C14725f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82577f() {
            Bundle bundle = new Bundle();
            bundle.putString("uid", PeopleYouMayKnowView.this.f75864f1.f146385a);
            bundle.putString("dpn", PeopleYouMayKnowView.this.f75864f1.f146387c);
            bundle.putString("phone", PeopleYouMayKnowView.this.f75864f1.f146394j);
            bundle.putString("avatar", PeopleYouMayKnowView.this.f75864f1.f146393i);
            if (PeopleYouMayKnowView.this.m92676n2() != null) {
                PeopleYouMayKnowView.this.m92676n2().mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m82578g() {
            try {
                PeopleYouMayKnowView.this.f72421L0.showDialog(3);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m82579h() {
            PeopleYouMayKnowView.this.f72421L0.showDialog(100);
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
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                peopleYouMayKnowView.f75865g1 = z11;
                peopleYouMayKnowView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            PeopleYouMayKnowView peopleYouMayKnowView;
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
                                    if (!C18644n.m98531l().m98558u(PeopleYouMayKnowView.this.f75863e1)) {
                                        TrackingSource trackingSource = new TrackingSource(PeopleYouMayKnowView.this.f75864f1.f146389e);
                                        trackingSource.m40677a("sourceView", 6);
                                        C21927m.m114302u().m114330e0(PeopleYouMayKnowView.this.f75864f1.f146385a, trackingSource);
                                        if (AbstractC21935u.m114553t(4)) {
                                            PeopleYouMayKnowView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.j40
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    PeopleYouMayKnowView.C14725f.this.m82577f();
                                                }
                                            });
                                        } else {
                                            PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                                            peopleYouMayKnowView2.m82544CM(peopleYouMayKnowView2.f75864f1);
                                            z11 = false;
                                        }
                                    } else {
                                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(PeopleYouMayKnowView.this.f75863e1);
                                        C21933s.m114404I().m114421H0(PeopleYouMayKnowView.this.f75863e1);
                                        AbstractC23074g2.m118375a(0, PeopleYouMayKnowView.this.f75863e1, "", 4);
                                        PeopleYouMayKnowView peopleYouMayKnowView3 = PeopleYouMayKnowView.this;
                                        peopleYouMayKnowView3.m82553kM(peopleYouMayKnowView3.f75863e1);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(PeopleYouMayKnowView.this.f75863e1);
                                    C21933s.m114404I().m114421H0(PeopleYouMayKnowView.this.f75863e1);
                                    AbstractC23074g2.m118375a(0, PeopleYouMayKnowView.this.f75863e1, "", 4);
                                    PeopleYouMayKnowView peopleYouMayKnowView4 = PeopleYouMayKnowView.this;
                                    peopleYouMayKnowView4.m82553kM(peopleYouMayKnowView4.f75863e1);
                                    if (!AbstractC21935u.m114558y(PeopleYouMayKnowView.this.f75863e1)) {
                                        PeopleYouMayKnowView peopleYouMayKnowView5 = PeopleYouMayKnowView.this;
                                        peopleYouMayKnowView5.m82551KM(peopleYouMayKnowView5.f75863e1);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(PeopleYouMayKnowView.this.f75863e1);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(PeopleYouMayKnowView.this.f75863e1, optInt2);
                                if (PeopleYouMayKnowView.this.f72421L0.m92676n2() != null) {
                                    PeopleYouMayKnowView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.k40
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            PeopleYouMayKnowView.C14725f.this.m82578g();
                                        }
                                    });
                                }
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(PeopleYouMayKnowView.this.f75863e1));
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(PeopleYouMayKnowView.this.f75863e1);
                                C21933s.m114404I().m114421H0(PeopleYouMayKnowView.this.f75863e1);
                                AbstractC23074g2.m118375a(0, PeopleYouMayKnowView.this.f75863e1, "", 4);
                                PeopleYouMayKnowView peopleYouMayKnowView6 = PeopleYouMayKnowView.this;
                                peopleYouMayKnowView6.m82553kM(peopleYouMayKnowView6.f75863e1);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(PeopleYouMayKnowView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            PeopleYouMayKnowView.this.f75859a1 = AbstractC23161o1.m119317b(optInt);
                            if (PeopleYouMayKnowView.this.f72421L0.m92676n2() != null) {
                                PeopleYouMayKnowView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l40
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PeopleYouMayKnowView.C14725f.this.m82579h();
                                    }
                                });
                            }
                        }
                    }
                    peopleYouMayKnowView = PeopleYouMayKnowView.this;
                    peopleYouMayKnowView.f75865g1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    peopleYouMayKnowView = PeopleYouMayKnowView.this;
                    peopleYouMayKnowView.f75865g1 = false;
                }
                peopleYouMayKnowView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView7 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView7.f75865g1 = false;
                peopleYouMayKnowView7.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$g */
    /* loaded from: classes6.dex */
    public class C14726g implements InterfaceC20094a {
        C14726g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82581d() {
            PeopleYouMayKnowView.this.f72421L0.showDialog(100);
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
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                peopleYouMayKnowView.f75867i1 = false;
                peopleYouMayKnowView.f72421L0.mo78960q3();
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
                            AbstractC23059e9.m118317F(PeopleYouMayKnowView.this.f75863e1);
                            C21933s.m114404I().m114421H0(PeopleYouMayKnowView.this.f75863e1);
                            AbstractC23074g2.m118375a(0, PeopleYouMayKnowView.this.f75863e1, "", 4);
                            PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                            peopleYouMayKnowView.m82553kM(peopleYouMayKnowView.f75863e1);
                            AbstractC23063f2.m118349a(PeopleYouMayKnowView.this.f75864f1.m153177a());
                        } else {
                            AbstractC23063f2.m118357i(i11, PeopleYouMayKnowView.this.f75863e1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(PeopleYouMayKnowView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            PeopleYouMayKnowView.this.f75859a1 = AbstractC23161o1.m119317b(i11);
                            if (PeopleYouMayKnowView.this.f72421L0.m92676n2() != null) {
                                PeopleYouMayKnowView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.m40
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PeopleYouMayKnowView.C14726g.this.m82581d();
                                    }
                                });
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75867i1 = false;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView3 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView3.f75867i1 = false;
                peopleYouMayKnowView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$h */
    /* loaded from: classes6.dex */
    class C14727h implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$h$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75901a;

            a(ContactProfile contactProfile) {
                this.f75901a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f75901a);
            }
        }

        C14727h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            PeopleYouMayKnowView peopleYouMayKnowView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    peopleYouMayKnowView = PeopleYouMayKnowView.this;
                    peopleYouMayKnowView.f75870l1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    PeopleYouMayKnowView.this.f75870l1 = false;
                    peopleYouMayKnowView = PeopleYouMayKnowView.this;
                }
                peopleYouMayKnowView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75870l1 = false;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
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
                        AbstractC23059e9.m118317F(PeopleYouMayKnowView.this.f75863e1);
                        C21927m.m114302u().m114337i(PeopleYouMayKnowView.this.f75863e1);
                        AbstractC23063f2.m118365q(PeopleYouMayKnowView.this.f75863e1);
                        C21933s.m114404I().m114421H0(PeopleYouMayKnowView.this.f75863e1);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                        PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                        peopleYouMayKnowView.m82553kM(peopleYouMayKnowView.f75863e1);
                        if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            str = "";
                            str2 = str;
                            i11 = 0;
                        } else {
                            i11 = optJSONObject.optInt("action", 0);
                            str2 = optJSONObject.optString("alias");
                            str = optJSONObject.optString("desc");
                        }
                        if (!PeopleYouMayKnowView.this.f75854V0.isEmpty()) {
                            for (int i12 = 0; i12 < PeopleYouMayKnowView.this.f75854V0.size(); i12++) {
                                if (((C31859bb) PeopleYouMayKnowView.this.f75854V0.get(i12)).m153145a() == null) {
                                    str3 = "";
                                } else {
                                    str3 = ((C31859bb) PeopleYouMayKnowView.this.f75854V0.get(i12)).m153145a().f146385a;
                                }
                                if (!TextUtils.isEmpty(PeopleYouMayKnowView.this.f75863e1) && PeopleYouMayKnowView.this.f75863e1.equals(str3) && (m153177a = ((C31859bb) PeopleYouMayKnowView.this.f75854V0.get(i12)).m153145a().m153177a()) != null) {
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
                                    if (map.containsKey(PeopleYouMayKnowView.this.f75863e1) && map.get(PeopleYouMayKnowView.this.f75863e1) != null) {
                                        m153177a.f42438s0 = ((C31965ic) map.get(PeopleYouMayKnowView.this.f75863e1)).m153681a();
                                    }
                                    if (C21927m.m114302u().m114357s() != null) {
                                        if (!C21927m.m114302u().m114357s().m153137g(PeopleYouMayKnowView.this.f75863e1)) {
                                            C21927m.m114302u().m114357s().add(m153177a);
                                            C0824j.m2153b(new a(m153177a));
                                        } else if (C21927m.m114302u().m114357s().m153138j(PeopleYouMayKnowView.this.f75863e1) != null) {
                                            ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(PeopleYouMayKnowView.this.f75863e1);
                                            m153138j.f42456y0 = i11;
                                            if (!TextUtils.isEmpty(str2)) {
                                                m153138j.f42442t1 = str2;
                                            }
                                            if (!TextUtils.isEmpty(str)) {
                                                m153138j.f42436r1 = new SpannableStringBuilder(str);
                                            }
                                        }
                                    }
                                    AbstractC23074g2.m118375a(0, PeopleYouMayKnowView.this.f75863e1, "", 4);
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
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75870l1 = false;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView3 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView3.f75870l1 = false;
                peopleYouMayKnowView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$i */
    /* loaded from: classes6.dex */
    public class C14728i implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$i$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75904a;

            a(ContactProfile contactProfile) {
                this.f75904a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f75904a.f42434r);
            }
        }

        C14728i() {
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
                    AbstractC23350e.m122776f(PeopleYouMayKnowView.f75847z1, e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$j */
    /* loaded from: classes6.dex */
    public class C14729j implements InterfaceC20094a {
        C14729j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82584e() {
            try {
                C7045d9 c7045d9 = PeopleYouMayKnowView.this.f75850R0;
                if (c7045d9 != null) {
                    c7045d9.m35972P().clear();
                }
                PeopleYouMayKnowView.this.m82543BM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82585f() {
            C7045d9 c7045d9 = PeopleYouMayKnowView.this.f75850R0;
            if (c7045d9 != null) {
                c7045d9.m35980X();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (PeopleYouMayKnowView.this.f72421L0.m92676n2() != null) {
                        PeopleYouMayKnowView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.o40
                            @Override // java.lang.Runnable
                            public final void run() {
                                PeopleYouMayKnowView.C14729j.this.m82585f();
                            }
                        });
                    }
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(PeopleYouMayKnowView.f75847z1, e11.toString());
                }
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                peopleYouMayKnowView.f75874p1 = false;
                peopleYouMayKnowView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75874p1 = false;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C21933s.m114404I().m114463e0(PeopleYouMayKnowView.this.f75877s1);
                    AbstractC23063f2.m118362n(PeopleYouMayKnowView.this.f75877s1);
                    if (PeopleYouMayKnowView.this.f72421L0.m92676n2() != null) {
                        PeopleYouMayKnowView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n40
                            @Override // java.lang.Runnable
                            public final void run() {
                                PeopleYouMayKnowView.C14729j.this.m82584e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(PeopleYouMayKnowView.f75847z1, e11.toString());
                }
            } finally {
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                peopleYouMayKnowView.f75874p1 = false;
                peopleYouMayKnowView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PeopleYouMayKnowView$k */
    /* loaded from: classes6.dex */
    public class C14730k implements InterfaceC20094a {
        C14730k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82587d() {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            PeopleYouMayKnowView.this.f72421L0.m92662fJ().m93069k2(IntroPeopleYouMayKnowView.class, bundle, 1, true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                peopleYouMayKnowView.f75880v1 = false;
                peopleYouMayKnowView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75880v1 = false;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    PeopleYouMayKnowView peopleYouMayKnowView = PeopleYouMayKnowView.this;
                    int i11 = peopleYouMayKnowView.f75878t1;
                    AbstractC23148n.m118851y(i11, peopleYouMayKnowView.f75879u1, i11);
                    AbstractC23309i.m121134Kr(0L);
                    PeopleYouMayKnowView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.p40
                        @Override // java.lang.Runnable
                        public final void run() {
                            PeopleYouMayKnowView.C14730k.this.m82587d();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                PeopleYouMayKnowView peopleYouMayKnowView2 = PeopleYouMayKnowView.this;
                peopleYouMayKnowView2.f75880v1 = z11;
                peopleYouMayKnowView2.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: GM */
    private void m82532GM(int i11, C31874cb c31874cb) {
        C0809c1.m2050b(new C14721b(c31874cb, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m82537vM() {
        try {
            if (C23055e5.m118271f()) {
                m82560pv(true, 0);
                m82563sM();
            } else {
                this.f75851S0.setVisibility(0);
                this.f75851S0.setState(MultiStateView.EnumC15914e.ERROR);
                this.f75851S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                this.f75851S0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m82538wM() {
        if (!C23055e5.m118271f()) {
            this.f75857Y0.setRefreshing(false);
            this.f75857Y0.m88209V();
        } else {
            this.f75857Y0.m88202K();
            m82563sM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ Void m82539xM(ContactProfile contactProfile) {
        C21933s.m114404I().m114421H0(contactProfile.f42434r);
        m82553kM(contactProfile.f42434r);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m82540yM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i11 == 0) {
            m82552Kv(this.f75855W0.m153177a());
        } else if (i11 == 1) {
            this.f75864f1 = this.f75855W0;
            m82556nM(false);
        }
    }

    /* renamed from: zM */
    private void m82541zM(final ContactProfile contactProfile) {
        new TrackingSource(contactProfile.f42373R0).m40677a("sourceView", 6);
        AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(45)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.f40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m82539xM;
                m82539xM = PeopleYouMayKnowView.this.m82539xM(contactProfile);
                return m82539xM;
            }
        });
    }

    /* renamed from: AM */
    boolean m82542AM(int i11) {
        try {
            C7045d9 c7045d9 = this.f75850R0;
            if (c7045d9 == null || c7045d9.mo10003k() <= 0) {
                return false;
            }
            C31874cb m153145a = this.f75850R0.m35968L(i11).m153145a();
            this.f75850R0.m35989g0(m153145a.f146385a, m153145a);
            this.f75850R0.m35971O();
            m82547FM();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: B1 */
    public void mo36004B1() {
        this.f72421L0.m92676n2().mo35573l4(SuggestFriendView.class, null, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: BM */
    public void m82543BM() {
        try {
            this.f75854V0.clear();
            this.f75854V0.addAll(C21933s.m114404I().m114429M());
            this.f75850R0.m35982Z(this.f75854V0);
            this.f75850R0.m10008p();
            m82560pv(false, 0);
            m82548HM(this.f75854V0, this.f75852T0.m9740Y1(), this.f75852T0.m9745c2());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72421L0.m92637BK(true);
        this.f75856X0 = new Handler(Looper.getMainLooper());
    }

    /* renamed from: CM */
    public void m82544CM(C31874cb c31874cb) {
        String str;
        if (c31874cb != null && !this.f75867i1) {
            TrackingSource m114310H = C21927m.m114302u().m114310H(c31874cb.f146385a);
            if (m114310H == null) {
                str = "";
            } else {
                str = m114310H.m40682o();
            }
            this.f75867i1 = true;
            this.f75868j1.mo1704o8(this.f75869k1);
            this.f75868j1.mo1620d7(c31874cb.f146385a, "", c31874cb.f146389e, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 100) {
                                return null;
                            }
                            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                            aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f75859a1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), this);
                            return aVar.m43152a();
                        }
                        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_hide_suggest)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_dialog_hide_suggest)).m43159h(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_hide_dialog_hide_suggest), this);
                        return aVar2.m43152a();
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes));
                    arrayList.add(hashMap);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_suggest_friend));
                    arrayList.add(hashMap2);
                    SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                    C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar3.m43172u(this.f75855W0.m153180d(true, false));
                    aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.b40
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            PeopleYouMayKnowView.this.m82540yM(interfaceC17463d, i12);
                        }
                    });
                    return aVar3.m43152a();
                }
                C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), this);
                return aVar4.m43152a();
            }
            C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
            aVar5.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
            return aVar5.m43152a();
        }
        C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
        aVar6.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_ask_to_delete_selected)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar6.m43152a();
    }

    /* renamed from: DM */
    void m82545DM(int i11) {
        MultiStateView multiStateView = this.f75851S0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: EM */
    public void m82546EM(int i11) {
        MultiStateView multiStateView = this.f75851S0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            this.f75860b1 = m92738e;
            Context context = getContext();
            int i11 = AbstractC8020f0.menu_delete_item_suggest_friend;
            this.f75861c1 = m92738e.m92774j(AbstractC23136l9.m118724l(context, i11, i11));
            ActionBarMenuItem actionBarMenuItem = this.f75860b1;
            Context context2 = getContext();
            int i12 = AbstractC8020f0.str_hide_suggest_people_you_may_know;
            actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(context2, i12, i12));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    void m82547FM() {
        try {
            if (this.f88760a0.getActionMode() == null) {
                ActionBarMenu m92709d = this.f88760a0.m92709d();
                m92709d.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                m92709d.m92744k(1, AbstractC7409c0.action_mode_back);
                this.f75873o1 = (TextView) m92709d.m92745l(2, AbstractC7409c0.action_mode_title, 1);
                m92709d.m92744k(3, AbstractC7409c0.contextual_action_bar_menu_selectall);
                this.f75872n1 = (ImageView) m92709d.m92744k(4, AbstractC7409c0.contextual_action_bar_menu_delete);
            }
            this.f88760a0.m92725w();
            m82549IM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Fx */
    public void mo36005Fx(int i11, int i12) {
        try {
            AbstractC23647d.m123907q("3120", "");
            if (i11 >= 0 && i11 < this.f75850R0.mo10003k()) {
                C31874cb m153145a = this.f75850R0.m35968L(i11).m153145a();
                this.f75864f1 = m153145a;
                if (m153145a != null) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    m82552Kv(m153145a.m153177a());
                                }
                            } else {
                                AbstractC23647d.m123897g("4801124");
                                m82556nM(false);
                            }
                        } else if (m153145a.f146399o == 2) {
                            this.f75863e1 = m153145a.f146385a;
                            m82541zM(m153145a.m153177a());
                        }
                    } else {
                        AbstractC23647d.m123897g("4801123");
                        C31874cb c31874cb = this.f75864f1;
                        if (c31874cb.f146390f > 0) {
                            String str = c31874cb.f146385a;
                            this.f75863e1 = str;
                            m82559pM(Integer.parseInt(str));
                        } else {
                            String str2 = c31874cb.f146385a;
                            this.f75863e1 = str2;
                            m82562rM(str2);
                        }
                        C0815e1.m2075D().m2099U(3, 3, 25, String.valueOf(1), this.f75863e1, String.valueOf(i11), String.valueOf(this.f75864f1.f146399o), String.valueOf(this.f75864f1.f146389e));
                    }
                }
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75848P0 = layoutInflater.inflate(AbstractC7409c0.people_you_may_know_view, viewGroup, false);
        m82565uM();
        return this.f75848P0;
    }

    /* renamed from: HM */
    void m82548HM(List list, int i11, int i12) {
        if (AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C14722c(new ArrayList(list), i11, i12));
    }

    /* renamed from: IM */
    void m82549IM() {
        int i11;
        try {
            int m35971O = this.f75850R0.m35971O();
            TextView textView = this.f75873o1;
            boolean z11 = false;
            if (textView != null) {
                if (m35971O > 1) {
                    i11 = AbstractC8020f0.action_mode_delete_suggest_title_s;
                } else {
                    i11 = AbstractC8020f0.action_mode_delete_suggest_title;
                }
                textView.setText(String.format(AbstractC23136l9.m118743r0(i11), Integer.valueOf(m35971O)));
            }
            ImageView imageView = this.f75872n1;
            if (imageView != null) {
                if (m35971O > 0) {
                    z11 = true;
                }
                imageView.setEnabled(z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JM */
    void m82550JM(boolean z11) {
        int i11;
        View view = this.f75861c1;
        if (view != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f != 2) {
                    if (mo92862f != 3) {
                        if (mo92862f != 5) {
                            if (mo92862f == 100) {
                                if (i11 == -1) {
                                    interfaceC17463d.dismiss();
                                } else if (i11 == -2) {
                                    interfaceC17463d.dismiss();
                                    C31874cb c31874cb = this.f75864f1;
                                    if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
                                        ContactProfile contactProfile = new ContactProfile(this.f75864f1.f146385a);
                                        C31874cb c31874cb2 = this.f75864f1;
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
                            }
                        } else if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            m82557o3(20, 0);
                        }
                    } else if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        C31874cb c31874cb3 = this.f75864f1;
                        if (c31874cb3 != null) {
                            m82541zM(c31874cb3.m153177a());
                        }
                    }
                } else if (i11 == -1) {
                    AbstractC23647d.m123907q("5320", "");
                    interfaceC17463d.dismiss();
                    AbstractC23309i.m121177Lx(true);
                    this.f72421L0.m92662fJ().m93069k2(NearbyZView.class, null, 1, true);
                    AbstractC23647d.m123893c();
                } else if (i11 == -2) {
                    AbstractC23647d.m123907q("5310", "");
                    interfaceC17463d.dismiss();
                    AbstractC23647d.m123893c();
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                this.f88760a0.m92716k();
                m82556nM(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public void m82551KM(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14728i());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1038));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Kv */
    void m82552Kv(ContactProfile contactProfile) {
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
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 != AbstractC6918a0.menu_next && i11 != AbstractC8020f0.menu_delete_item_suggest_friend) {
            if (i11 == 1) {
                this.f88760a0.m92716k();
                this.f75850R0.m35980X();
            } else if (i11 == 3) {
                this.f75850R0.m35981Y();
                m82549IM();
            } else if (i11 == 4) {
                this.f72421L0.showDialog(1);
            } else if (i11 == AbstractC8020f0.str_hide_suggest_people_you_may_know) {
                this.f72421L0.showDialog(5);
            }
            return super.mo37491QJ(i11);
        }
        m82547FM();
        this.f75850R0.m10008p();
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: R3 */
    public boolean mo36007R3(String str) {
        return C21933s.m114404I().m114486q0(str);
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: Rn */
    public void mo36008Rn(String str, String str2) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_data_mining));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
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
        return f75847z1;
    }

    /* renamed from: kM */
    void m82553kM(String str) {
        C21933s.m114404I().m114454a(str);
        C21933s.m114404I().f107931t = true;
        if (this.f72421L0.m92676n2() != null) {
            AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f75850R0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0114 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0005, B:12:0x0019, B:14:0x001d, B:17:0x002d, B:19:0x0033, B:21:0x003b, B:23:0x0041, B:25:0x0056, B:28:0x0065, B:30:0x0072, B:32:0x007e, B:36:0x0134, B:37:0x0083, B:39:0x0087, B:41:0x008d, B:44:0x0092, B:46:0x009e, B:48:0x00a4, B:50:0x00ac, B:52:0x00ba, B:54:0x010a, B:56:0x0114, B:59:0x00cf, B:62:0x00fc, B:64:0x0121, B:66:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x0144, B:76:0x0026, B:77:0x0012), top: B:2:0x0005 }] */
    /* renamed from: lM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m82554lM(int i11, int i12, List list) {
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
            C0855y0 c0855y0 = this.f75883y1;
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
                            C23651h m123961i = C23651h.m123961i(25, String.valueOf(1), m153145a.f146385a, valueOf, String.valueOf(m153145a.f146399o), String.valueOf(m153145a.f146389e));
                            if (m123961i == null) {
                                c11 = 0;
                            } else {
                                m123961i.f114654a = 3;
                                m123961i.f114655b = 1;
                                m123961i.f114657d = 25;
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
            if (this.f75883y1 == null) {
                this.f75883y1 = new C0855y0();
            }
            this.f75883y1.m2386d(m2385c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m82555mM(Map map) {
        if (this.f75874p1) {
            return;
        }
        this.f75874p1 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        try {
            ArrayList arrayList = new ArrayList();
            this.f75877s1.clear();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C31874cb c31874cb = (C31874cb) entry.getValue();
                if (!C21933s.m114404I().m114484p0(str)) {
                    arrayList.add(c31874cb);
                }
                this.f75877s1.add(str);
            }
            this.f75875q1.mo1704o8(this.f75876r1);
            this.f75875q1.mo1453I7(arrayList, TrackingSource.m40665d(6));
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f75847z1, e11.toString());
            this.f75874p1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: n */
    public void mo36011n(int i11) {
        try {
            C7045d9 c7045d9 = this.f75850R0;
            if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
                C31874cb m153145a = this.f75850R0.m35968L(i11).m153145a();
                this.f75855W0 = m153145a;
                if (m153145a != null) {
                    if (!this.f88760a0.m92720p()) {
                        AbstractC23074g2.m118379e(this.f75855W0, this.f72421L0.m92662fJ(), ZAbstractBase.ZVU_BLEND_GEN_THUMB, 0, 0, 4);
                        m82532GM(i11, this.f75855W0);
                    } else {
                        m82542AM(i11);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m82556nM(boolean z11) {
        if (z11) {
            m82555mM(this.f75850R0.m35972P());
            return;
        }
        HashMap hashMap = new HashMap();
        C31874cb c31874cb = this.f75864f1;
        if (c31874cb != null) {
            hashMap.put(c31874cb.f146385a, c31874cb);
            m82555mM(hashMap);
        }
    }

    /* renamed from: o3 */
    void m82557o3(int i11, int i12) {
        try {
            if (this.f75880v1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f75878t1 = i11;
                this.f75879u1 = i12;
                this.f75880v1 = true;
                this.f75881w1.mo1704o8(this.f75882x1);
                this.f75881w1.mo1699o3(i11, i12);
            } else {
                this.f75880v1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m82558oM() {
        m82543BM();
        if (C21933s.m114404I().m114429M().isEmpty()) {
            m82560pv(true, 0);
        }
        m82563sM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        C17487o0 c17487o0;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1003) {
            if (C21933s.m114404I().m114418G().isEmpty()) {
                C21933s.m114404I().m114436P0();
                m82558oM();
                return;
            } else {
                C21933s.m114404I().m114436P0();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.c40
                        @Override // java.lang.Runnable
                        public final void run() {
                            PeopleYouMayKnowView.this.m82543BM();
                        }
                    });
                    return;
                }
                return;
            }
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
        if (i11 == 1085 && i12 == -1) {
            m82553kM(this.f75863e1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                if (!this.f77813M0) {
                    if (this.f88760a0.m92720p()) {
                        try {
                            this.f88760a0.m92716k();
                            this.f75850R0.m35980X();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        return true;
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

    /* renamed from: pM */
    void m82559pM(int i11) {
        try {
            if (this.f75870l1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f75871m1);
            this.f75870l1 = true;
            c0766k.mo1578Y4(i11, new TrackingSource(290));
        } catch (Exception e11) {
            this.f75870l1 = false;
            this.f72421L0.mo78960q3();
            e11.printStackTrace();
        }
    }

    /* renamed from: pv */
    public void m82560pv(boolean z11, int i11) {
        MultiStateView.EnumC15915f enumC15915f;
        int i12;
        try {
            if (z11) {
                this.f75857Y0.setVisibility(8);
                this.f75851S0.setVisibility(0);
                this.f75851S0.setState(MultiStateView.EnumC15914e.LOADING);
                m82550JM(true);
                return;
            }
            C7045d9 c7045d9 = this.f75850R0;
            if (c7045d9 != null && c7045d9.mo10003k() != 0) {
                this.f75857Y0.setVisibility(0);
                this.f75849Q0.setVisibility(0);
                this.f75851S0.setVisibility(8);
                m82550JM(false);
                return;
            }
            this.f75857Y0.setVisibility(8);
            if (i11 == 0) {
                this.f75851S0.setVisibility(0);
                this.f75851S0.setState(MultiStateView.EnumC15914e.EMPTY);
            } else {
                MultiStateView multiStateView = this.f75851S0;
                if (i11 == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                this.f75851S0.setVisibility(0);
                this.f75851S0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView2 = this.f75851S0;
                if (i11 == 50001) {
                    i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i12 = AbstractC8020f0.str_error_loadingList;
                }
                multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
            }
            m82550JM(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m82561qM() {
        if (this.f75862d1) {
            return;
        }
        this.f75862d1 = true;
        if (C21933s.m114404I().f107924m) {
            C21933s.m114404I().m114460d(new C14724e());
        } else {
            this.f75862d1 = false;
        }
    }

    /* renamed from: rM */
    public void m82562rM(String str) {
        try {
            if (this.f75865g1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f75865g1 = true;
            this.f75863e1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f75866h1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f75865g1 = false;
            this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: sM */
    void m82563sM() {
        if (this.f75862d1) {
            return;
        }
        this.f75862d1 = true;
        C21933s.m114404I().m114445U(new C14723d());
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: t3 */
    public void mo36012t3() {
        if (C23055e5.m118272g(true)) {
            m82563sM();
        }
    }

    /* renamed from: tM */
    void m82564tM() {
        try {
            this.f75853U0 = new C23528a(this.f72421L0.m92648SI());
            C7045d9 c7045d9 = new C7045d9(this.f72421L0.m92648SI(), this.f75853U0);
            this.f75850R0 = c7045d9;
            c7045d9.m35983a0(this);
            this.f75849Q0.setAdapter(this.f75850R0);
            m82546EM(AbstractC8020f0.empty_list);
            m82545DM(AbstractC8020f0.loading);
            m82558oM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u1 */
    public void mo36013u1() {
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: u4 */
    public void mo36014u4() {
    }

    /* renamed from: uM */
    void m82565uM() {
        MultiStateView multiStateView = (MultiStateView) this.f75848P0.findViewById(AbstractC6918a0.multi_state);
        this.f75851S0 = multiStateView;
        multiStateView.setEnableLoadingText(false);
        this.f75851S0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.d40
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                PeopleYouMayKnowView.this.m82537vM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f75848P0.findViewById(AbstractC6918a0.swipe_refresh_view);
        this.f75857Y0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.e40
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                PeopleYouMayKnowView.this.m82538wM();
            }
        });
        this.f75849Q0 = this.f75857Y0.f83582p0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
        this.f75852T0 = linearLayoutManager;
        linearLayoutManager.m9723C2(1);
        this.f75849Q0.setLayoutManager(this.f75852T0);
        this.f75849Q0.setOverScrollMode(2);
        this.f75849Q0.m9826E(new C14720a());
    }

    @Override // com.zing.zalo.adapters.C7045d9.c
    /* renamed from: wb */
    public boolean mo36015wb(int i11) {
        try {
            C7045d9 c7045d9 = this.f75850R0;
            if (c7045d9 != null && i11 >= 0 && i11 < c7045d9.mo10003k()) {
                if (this.f88760a0.m92720p()) {
                    return m82542AM(i11);
                }
                this.f75855W0 = this.f75850R0.m35968L(i11).m153145a();
                this.f72421L0.showDialog(4);
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m82564tM();
    }
}
