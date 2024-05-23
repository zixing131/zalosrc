package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.C0943w;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker;
import com.zing.zalo.p077ui.zviews.GroupEventDetailView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ee.C18408p;
import ee.C18415w;
import ge.C19409a;
import ge.C19410b;
import ge.C19411c;
import ge.C19417i;
import ge.C19418j;
import ge.C19422n;
import ge.C19425q;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23202r9;
import me0.AbstractC23211s7;
import me0.AbstractC23244v8;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p131ei.C18434b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p588vw.C28652r;
import p716zh.C31862c;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C32002l4;
import sa0.C26203c;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28203u6;
import vg.C28212v6;

/* loaded from: classes6.dex */
public class GroupEventDetailView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {

    /* renamed from: v2 */
    static int f73632v2 = AbstractC23136l9.m118742r(37.0f);

    /* renamed from: A1 */
    RobotoTextView f73633A1;

    /* renamed from: B1 */
    RobotoTextView f73634B1;

    /* renamed from: C1 */
    RobotoTextView f73635C1;

    /* renamed from: D1 */
    View f73636D1;

    /* renamed from: E1 */
    ImageView f73637E1;

    /* renamed from: F1 */
    RobotoTextView f73638F1;

    /* renamed from: G1 */
    View f73639G1;

    /* renamed from: H1 */
    RobotoTextView f73640H1;

    /* renamed from: I1 */
    View f73641I1;

    /* renamed from: J1 */
    RobotoTextView f73642J1;

    /* renamed from: K1 */
    ImageView f73643K1;

    /* renamed from: L1 */
    View f73644L1;

    /* renamed from: M1 */
    RobotoTextView f73645M1;

    /* renamed from: N1 */
    TouchInterceptionFrameLayout f73646N1;

    /* renamed from: O1 */
    View f73647O1;

    /* renamed from: P0 */
    C23528a f73648P0;

    /* renamed from: P1 */
    RobotoTextView f73649P1;

    /* renamed from: Q0 */
    View f73650Q0;

    /* renamed from: Q1 */
    RobotoTextView f73651Q1;

    /* renamed from: R0 */
    View f73652R0;

    /* renamed from: R1 */
    View f73653R1;

    /* renamed from: S0 */
    ViewStub f73654S0;

    /* renamed from: S1 */
    RobotoTextView f73655S1;

    /* renamed from: T0 */
    View f73656T0;

    /* renamed from: T1 */
    RobotoTextView f73657T1;

    /* renamed from: U0 */
    AvatarImageView f73658U0;

    /* renamed from: U1 */
    RobotoTextView f73659U1;

    /* renamed from: V0 */
    RobotoTextView f73660V0;

    /* renamed from: V1 */
    MultiStateView f73661V1;

    /* renamed from: W0 */
    TextView f73662W0;

    /* renamed from: W1 */
    private FrameLayout f73663W1;

    /* renamed from: X0 */
    TextView f73664X0;

    /* renamed from: X1 */
    View f73665X1;

    /* renamed from: Y0 */
    LinearLayout f73666Y0;

    /* renamed from: Y1 */
    String f73667Y1;

    /* renamed from: Z0 */
    View f73668Z0;

    /* renamed from: Z1 */
    C31973j5 f73669Z1;

    /* renamed from: a1 */
    TextView f73670a1;

    /* renamed from: a2 */
    String f73671a2;

    /* renamed from: b1 */
    TextView f73672b1;

    /* renamed from: c1 */
    TextView f73674c1;

    /* renamed from: c2 */
    C19411c f73675c2;

    /* renamed from: d1 */
    TextView f73676d1;

    /* renamed from: e1 */
    View f73678e1;

    /* renamed from: f1 */
    RobotoTextView f73680f1;

    /* renamed from: g1 */
    View f73682g1;

    /* renamed from: h1 */
    TextView f73684h1;

    /* renamed from: i1 */
    TextView f73686i1;

    /* renamed from: i2 */
    String f73687i2;

    /* renamed from: j1 */
    View f73688j1;

    /* renamed from: j2 */
    LayoutInflater f73689j2;

    /* renamed from: k1 */
    TextView f73690k1;

    /* renamed from: l1 */
    View f73692l1;

    /* renamed from: m1 */
    RobotoTextView f73694m1;

    /* renamed from: n1 */
    ViewStub f73696n1;

    /* renamed from: o1 */
    View f73698o1;

    /* renamed from: p1 */
    View f73700p1;

    /* renamed from: p2 */
    EventAttendeeBottomView f73701p2;

    /* renamed from: q1 */
    View f73702q1;

    /* renamed from: r1 */
    RecyclingImageView f73704r1;

    /* renamed from: s1 */
    TextView f73706s1;

    /* renamed from: s2 */
    C13306b f73707s2;

    /* renamed from: t1 */
    TextView f73708t1;

    /* renamed from: u1 */
    View f73710u1;

    /* renamed from: u2 */
    AttendConfirmBottomPicker f73711u2;

    /* renamed from: v1 */
    RobotoTextView f73712v1;

    /* renamed from: w1 */
    RobotoTextView f73713w1;

    /* renamed from: x1 */
    View f73714x1;

    /* renamed from: y1 */
    ImageView f73715y1;

    /* renamed from: z1 */
    RobotoTextView f73716z1;

    /* renamed from: b2 */
    long f73673b2 = Long.MIN_VALUE;

    /* renamed from: d2 */
    C20500d f73677d2 = new C20500d(true);

    /* renamed from: e2 */
    boolean f73679e2 = false;

    /* renamed from: f2 */
    boolean f73681f2 = false;

    /* renamed from: g2 */
    int f73683g2 = 0;

    /* renamed from: h2 */
    boolean f73685h2 = false;

    /* renamed from: k2 */
    boolean f73691k2 = false;

    /* renamed from: l2 */
    boolean f73693l2 = false;

    /* renamed from: m2 */
    boolean f73695m2 = true;

    /* renamed from: n2 */
    boolean f73697n2 = false;

    /* renamed from: o2 */
    final List f73699o2 = new ArrayList();

    /* renamed from: q2 */
    boolean f73703q2 = false;

    /* renamed from: r2 */
    boolean f73705r2 = false;

    /* renamed from: t2 */
    C13306b.c f73709t2 = new C14333c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$a */
    /* loaded from: classes6.dex */
    public class C14331a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f73717a;

        /* renamed from: b */
        final /* synthetic */ String f73718b;

        C14331a(int i11, String str) {
            this.f73717a = i11;
            this.f73718b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80085e() {
            GroupEventDetailView.this.m80082zN();
            GroupEventDetailView.this.m80062FM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80086f() {
            GroupEventDetailView.this.m80082zN();
            GroupEventDetailView.this.m80062FM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            C18408p.m97474Q().f92822a.remove(this.f73718b);
            GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.zi
                @Override // java.lang.Runnable
                public final void run() {
                    GroupEventDetailView.C14331a.this.m80086f();
                }
            });
            GroupEventDetailView.this.f73705r2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C19411c c19411c;
            C19409a c19409a;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (c19411c = GroupEventDetailView.this.f73675c2) != null && (c19409a = c19411c.f96285y) != null) {
                    c19409a.f96250b = this.f73717a;
                    JSONArray optJSONArray = optJSONObject.optJSONArray("responseInfo");
                    if (optJSONArray != null) {
                        GroupEventDetailView.this.f73675c2.f96285y.f96251c = new ArrayList();
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                GroupEventDetailView.this.f73675c2.f96285y.f96251c.add(new C19417i(optJSONObject2));
                            }
                        }
                        GroupEventDetailView.this.m80059CM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C18408p.m97474Q().f92822a.remove(this.f73718b);
            GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.aj
                @Override // java.lang.Runnable
                public final void run() {
                    GroupEventDetailView.C14331a.this.m80085e();
                }
            });
            GroupEventDetailView.this.f73705r2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$b */
    /* loaded from: classes6.dex */
    public class C14332b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f73720a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f73721b;

        C14332b(int i11, ArrayList arrayList) {
            this.f73720a = i11;
            this.f73721b = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m80095k() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_unfollow_group_cate_by_group_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static /* synthetic */ void m80096l(C19411c.a.C32826a.C32827a c32827a) {
            int i11;
            if (c32827a.f96296b) {
                i11 = AbstractC8020f0.str_toast_msg_follow_group_cate_by_personal_success;
            } else {
                i11 = AbstractC8020f0.str_toast_msg_unfollow_group_cate_by_personal_success;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static /* synthetic */ void m80097m(C19411c.a.C32826a.C32827a c32827a) {
            int i11;
            if (c32827a.f96296b) {
                i11 = AbstractC8020f0.str_toast_msg_follow_personal_cate_success;
            } else {
                i11 = AbstractC8020f0.str_toast_msg_unfollow_personal_cate_success;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m80098n() {
            GroupEventDetailView.this.m80059CM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static /* synthetic */ void m80099o(C19411c.a.C32826a.C32827a c32827a) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_toast_cate_not_exist, c32827a.f96297c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static /* synthetic */ void m80100p(C19411c.a.C32826a.C32827a c32827a) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_toast_cate_not_exist, c32827a.f96297c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m80101q() {
            GroupEventDetailView.this.m80059CM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m80102r(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            GroupEventDetailView.this.m80059CM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (c20096c.m104491c() == -20023) {
                int i11 = 0;
                while (i11 < GroupEventDetailView.this.f73675c2.f96281u.f96290d.f96294a.size()) {
                    final C19411c.a.C32826a.C32827a c32827a = (C19411c.a.C32826a.C32827a) GroupEventDetailView.this.f73675c2.f96281u.f96290d.f96294a.get(i11);
                    if (c32827a.f96295a == this.f73720a) {
                        Iterator it = this.f73721b.iterator();
                        while (it.hasNext()) {
                            C19422n c19422n = (C19422n) it.next();
                            byte b11 = c19422n.f96360a;
                            if (b11 == 2) {
                                if (c19422n.f96361b == Integer.parseInt(GroupEventDetailView.this.f73667Y1)) {
                                    GroupEventDetailView.this.f73675c2.m101532g(this.f73720a);
                                    i11--;
                                    GroupEventDetailView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fj
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            GroupEventDetailView.C14332b.m80099o(C19411c.a.C32826a.C32827a.this);
                                        }
                                    });
                                }
                            } else if (b11 == 1 && c19422n.f96361b == Integer.parseInt(CoreUtility.f89233i)) {
                                GroupEventDetailView.this.f73675c2.m101532g(this.f73720a);
                                i11--;
                                GroupEventDetailView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GroupEventDetailView.C14332b.m80100p(C19411c.a.C32826a.C32827a.this);
                                    }
                                });
                            }
                        }
                    }
                    i11++;
                }
                GroupEventDetailView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hj
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupEventDetailView.C14332b.this.m80101q();
                    }
                });
                return;
            }
            GroupEventDetailView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ij
                @Override // java.lang.Runnable
                public final void run() {
                    GroupEventDetailView.C14332b.this.m80102r(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            boolean z12;
            int i11 = 0;
            while (i11 < GroupEventDetailView.this.f73675c2.f96281u.f96290d.f96294a.size()) {
                try {
                    final C19411c.a.C32826a.C32827a c32827a = (C19411c.a.C32826a.C32827a) GroupEventDetailView.this.f73675c2.f96281u.f96290d.f96294a.get(i11);
                    if (c32827a.f96295a == this.f73720a) {
                        Iterator it = this.f73721b.iterator();
                        while (it.hasNext()) {
                            C19422n c19422n = (C19422n) it.next();
                            byte b11 = c19422n.f96360a;
                            if (b11 == 2) {
                                if (c19422n.f96361b == Integer.parseInt(GroupEventDetailView.this.f73667Y1)) {
                                    if (c19422n.f96362c == 2) {
                                        if (c19422n.f96363d == 0) {
                                            GroupEventDetailView.this.f73675c2.m101532g(this.f73720a);
                                            i11--;
                                            GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bj
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    GroupEventDetailView.C14332b.m80095k();
                                                }
                                            });
                                        } else {
                                            c32827a.f96296b = true;
                                        }
                                    } else {
                                        if (c19422n.f96363d != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        c32827a.f96296b = z11;
                                        GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
                                        if (groupEventDetailView.f73675c2.f96277q == 2 && !TextUtils.isEmpty(groupEventDetailView.f73667Y1) && GroupEventDetailView.this.f73675c2.f96279s == 2) {
                                            C18408p.m97476S().m97531n0(2, GroupEventDetailView.this.f73667Y1, 2, this.f73720a, c32827a.f96296b);
                                        }
                                        GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.cj
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupEventDetailView.C14332b.m80096l(C19411c.a.C32826a.C32827a.this);
                                            }
                                        });
                                    }
                                }
                            } else if (b11 == 1 && c19422n.f96361b == Integer.parseInt(CoreUtility.f89233i)) {
                                if (c19422n.f96363d != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                c32827a.f96296b = z12;
                                GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.dj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GroupEventDetailView.C14332b.m80097m(C19411c.a.C32826a.C32827a.this);
                                    }
                                });
                            }
                        }
                    }
                    i11++;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            GroupEventDetailView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ej
                @Override // java.lang.Runnable
                public final void run() {
                    GroupEventDetailView.C14332b.this.m80098n();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$c */
    /* loaded from: classes6.dex */
    class C14333c extends C13306b.c {
        C14333c() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            if (!str.equals("tip.event.detail.oa")) {
                if (!str.equals("tip.event.detail.oa.in.group")) {
                    return super.mo66900a(c28212v6);
                }
                C19411c c19411c = GroupEventDetailView.this.f73675c2;
                if (c19411c == null || c19411c.f96277q != 2 || c19411c.f96279s != 2) {
                    return false;
                }
                return true;
            }
            C19411c c19411c2 = GroupEventDetailView.this.f73675c2;
            if (c19411c2 == null || c19411c2.f96277q != 1 || c19411c2.f96279s != 2) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            str.hashCode();
            if (str.equals("tip.event.detail.oa") || str.equals("tip.event.detail.oa.in.group")) {
                c26203c.f124525p = -AbstractC23136l9.m118742r(6.0f);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130868y;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if ((str.equals("tip.event.detail.oa") || str.equals("tip.event.detail.oa.in.group")) && GroupEventDetailView.this.m80012MM() != null) {
                return new C26209i(GroupEventDetailView.this.m80012MM());
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (GroupEventDetailView.this.f72421L0.m92672lJ() && GroupEventDetailView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$d */
    /* loaded from: classes6.dex */
    class C14334d extends C20500d.a {
        C14334d() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: a */
        public void mo80103a(String str) {
            AbstractC23211s7.m119561A(str, C32002l4.m154264g(36), GroupEventDetailView.this.m92662fJ());
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            AbstractC23184q2.m119465w(str, GroupEventDetailView.this.f72421L0.getContext(), GroupEventDetailView.this.f72421L0.m92676n2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$e */
    /* loaded from: classes6.dex */
    public class C14335e implements InterfaceC13567b1.a {
        C14335e() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            GroupEventDetailView.this.m80042oN(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$f */
    /* loaded from: classes6.dex */
    public class C14336f implements InterfaceC20094a {
        C14336f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m80105d() {
            GroupEventDetailView.this.m80060CN();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupEventDetailView.this.m80079wN(false, c20096c.m104491c());
            GroupEventDetailView.this.f73691k2 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C19411c c19411c;
            String str;
            String str2;
            C19409a c19409a;
            try {
                GroupEventDetailView.this.f73675c2 = new C19411c(((JSONObject) obj).getJSONObject("data"));
                GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
                C19411c c19411c2 = groupEventDetailView.f73675c2;
                if (c19411c2.f96277q == 2) {
                    groupEventDetailView.f73667Y1 = c19411c2.f96278r;
                    groupEventDetailView.f73669Z1 = C0943w.m4462l().m4472f(GroupEventDetailView.this.f73667Y1);
                }
                GroupEventDetailView.this.m80079wN(false, 0);
                GroupEventDetailView.this.m80059CM();
                GroupEventDetailView.this.m80011EM();
                GroupEventDetailView groupEventDetailView2 = GroupEventDetailView.this;
                C19411c c19411c3 = groupEventDetailView2.f73675c2;
                if (c19411c3 != null && c19411c3.f96279s != 2 && (c19409a = c19411c3.f96285y) != null && c19409a.f96251c != null && c19409a.f96249a) {
                    groupEventDetailView2.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.jj
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupEventDetailView.C14336f.this.m80105d();
                        }
                    }, 300L);
                }
                GroupEventDetailView groupEventDetailView3 = GroupEventDetailView.this;
                if (!groupEventDetailView3.f73685h2 && (c19411c = groupEventDetailView3.f73675c2) != null) {
                    int i11 = c19411c.f96279s;
                    if (i11 != 2) {
                        if (i11 != 4) {
                            str = "calendar_reminder_detail";
                        } else {
                            str = "calendar_anniversary_detail";
                        }
                    } else {
                        str = "calendar_event_detail";
                    }
                    String str3 = str;
                    GroupEventDetailView groupEventDetailView4 = GroupEventDetailView.this;
                    String str4 = groupEventDetailView4.f73687i2;
                    String[] strArr = new String[1];
                    if (groupEventDetailView4.f73675c2.f96277q == 2) {
                        str2 = "2";
                    } else {
                        str2 = "0";
                    }
                    strArr[0] = str2;
                    C0815e1.m2075D().m2100V(new C23648e(3, str4, 1, str3, strArr), false);
                    GroupEventDetailView.this.f73685h2 = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupEventDetailView.this.f73691k2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$g */
    /* loaded from: classes6.dex */
    public class C14337g extends ClickableSpan {
        C14337g() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
            groupEventDetailView.f73693l2 = true;
            groupEventDetailView.m80078sN(true);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupEventDetailView.this.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$h */
    /* loaded from: classes6.dex */
    public class C14338h extends ClickableSpan {
        C14338h() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC23647d.m123897g("77707001");
            GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
            groupEventDetailView.f73695m2 = false;
            groupEventDetailView.m80068LM();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(AbstractC23136l9.m118641B(GroupEventDetailView.this.f72421L0.getContext(), AbstractC16801x.btn_primary_color));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$i */
    /* loaded from: classes6.dex */
    class C14339i extends AbstractC28207v1.g0 {
        C14339i() {
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: h */
        public void mo40743h() {
            GroupEventDetailView.this.m78964sL();
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: j */
        public void mo40745j(String str) {
            GroupEventDetailView.this.m78968wL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: m */
        public void mo40748m(String str) {
            GroupEventDetailView.this.m78962rL(str, false);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: q */
        public void mo40752q(String str) {
            GroupEventDetailView.this.m78961qL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: r */
        public void mo40753r(String str, String str2, String str3) {
            GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
            C19411c.a.b bVar = groupEventDetailView.f73675c2.f96281u.f96291e;
            groupEventDetailView.m78965tL(str2, str, 4, bVar.f96298a, bVar.f96299b, str3);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: s */
        public void mo40754s(String str) {
            GroupEventDetailView.this.m78962rL(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$j */
    /* loaded from: classes6.dex */
    public class C14340j implements InterfaceC20094a {
        C14340j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$k */
    /* loaded from: classes6.dex */
    public class C14341k extends AnimatorListenerAdapter {
        C14341k() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupEventDetailView$l */
    /* loaded from: classes6.dex */
    public class C14342l implements EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b {
        C14342l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80108f(Bundle bundle, JSONObject jSONObject) {
            if (!GroupEventDetailView.this.f73703q2) {
                return;
            }
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 11);
            bundle.putString("extra_preload_data", jSONObject.toString());
            bundle.putString("extra_group_id", GroupEventDetailView.this.f73667Y1);
            GroupEventDetailView.this.f72421L0.m92676n2().mo35579p().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
            GroupEventDetailView.this.f72421L0.mo49315c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m80109g(ArrayList arrayList, ArrayList arrayList2) {
            String str;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c((String) it.next());
                if (m141809c != null && !m141809c.f42434r.equals(CoreUtility.f89233i)) {
                    arrayList2.add(m141809c);
                }
            }
            if (TextUtils.isEmpty(GroupEventDetailView.this.f73667Y1)) {
                C19411c.a.e eVar = GroupEventDetailView.this.f73675c2.f96281u.f96289c;
                if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                    str = eVar.f96310e;
                } else {
                    str = eVar.f96308c;
                }
                AbstractC23184q2.m119449g(0, str, 0, arrayList2);
            } else {
                AbstractC23184q2.m119449g(1, GroupEventDetailView.this.f73667Y1, 0, arrayList2);
            }
            GroupEventDetailView.this.m80071QM();
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: a */
        public void mo35592a(ContactProfile contactProfile) {
            try {
                AbstractC23211s7.m119562B(contactProfile.f42434r, GroupEventDetailView.this.f72421L0.m92662fJ(), GroupEventDetailView.this.f73667Y1, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: b */
        public void mo35593b() {
            GroupEventDetailView.this.f72421L0.mo46829Y();
            GroupEventDetailView.this.f73703q2 = true;
            final Bundle bundle = new Bundle();
            GroupEventDetailView groupEventDetailView = GroupEventDetailView.this;
            ArrayList arrayList = groupEventDetailView.f73701p2.f73222a1;
            final JSONObject m80065IM = groupEventDetailView.m80065IM();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((C19417i) arrayList.get(i11)).f96338a != 0) {
                    for (int i12 = 0; i12 < ((C19417i) arrayList.get(i11)).f96340c.size(); i12++) {
                        String str = (String) ((C19417i) arrayList.get(i11)).f96340c.get(i12);
                        if (C28203u6.f131407a.m141809c(str) == null) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            if (arrayList2.size() > 0) {
                AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.lj
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupEventDetailView.C14342l.this.m80108f(bundle, m80065IM);
                    }
                });
                return;
            }
            if (!GroupEventDetailView.this.f73703q2) {
                return;
            }
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 11);
            bundle.putString("extra_preload_data", m80065IM.toString());
            bundle.putString("extra_group_id", GroupEventDetailView.this.f73667Y1);
            GroupEventDetailView.this.f72421L0.m92676n2().mo35579p().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
            GroupEventDetailView.this.f72421L0.mo49315c4();
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: c */
        public void mo35594c(ArrayList arrayList) {
            String str;
            String str2;
            if (arrayList != null && arrayList.size() <= 5) {
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str3);
                    if (m141809c != null) {
                        if (!m141809c.f42434r.equals(CoreUtility.f89233i)) {
                            arrayList2.add(m141809c);
                        }
                    } else {
                        arrayList3.add(str3);
                    }
                }
                if (arrayList3.size() > 0) {
                    AbstractC23184q2.m119463u(arrayList3, new Runnable() { // from class: com.zing.zalo.ui.zviews.kj
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupEventDetailView.C14342l.this.m80109g(arrayList3, arrayList2);
                        }
                    });
                    return;
                }
                if (TextUtils.isEmpty(GroupEventDetailView.this.f73667Y1)) {
                    C19411c.a.e eVar = GroupEventDetailView.this.f73675c2.f96281u.f96289c;
                    if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                        str2 = eVar.f96310e;
                    } else {
                        str2 = eVar.f96308c;
                    }
                    AbstractC23184q2.m119449g(0, str2, 0, arrayList2);
                } else {
                    AbstractC23184q2.m119449g(1, GroupEventDetailView.this.f73667Y1, 0, arrayList2);
                }
                GroupEventDetailView.this.m80071QM();
                return;
            }
            if (TextUtils.isEmpty(GroupEventDetailView.this.f73667Y1)) {
                C19411c.a.e eVar2 = GroupEventDetailView.this.f73675c2.f96281u.f96289c;
                if (CoreUtility.f89233i.equals(eVar2.f96308c)) {
                    str = eVar2.f96310e;
                } else {
                    str = eVar2.f96308c;
                }
                AbstractC23184q2.m119449g(0, str, 1, null);
            } else {
                AbstractC23184q2.m119449g(1, GroupEventDetailView.this.f73667Y1, 1, null);
            }
            GroupEventDetailView.this.m80071QM();
        }
    }

    /* renamed from: AN */
    private void m80007AN(final C19410b c19410b) {
        int i11;
        int i12;
        try {
            C8009j.a aVar = new C8009j.a(getContext());
            if (this.f73675c2.f96277q == 2) {
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_group_event_title));
            } else {
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_event_title));
            }
            aVar.m43173v(3);
            if (this.f73675c2.f96277q == 2) {
                C31973j5 c31973j5 = this.f73669Z1;
                if (c31973j5 != null) {
                    if (c31973j5.m153778p0()) {
                        String[] strArr = new String[3];
                        if (c19410b.f96255d) {
                            i12 = AbstractC8020f0.str_unfollow_group_OA_personal_text;
                        } else {
                            i12 = AbstractC8020f0.str_follow_group_OA_personal_text;
                        }
                        strArr[0] = AbstractC23136l9.m118743r0(i12);
                        strArr[1] = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_group_OA_for_group_text);
                        strArr[2] = AbstractC23136l9.m118743r0(AbstractC8020f0.close);
                        aVar.m43160i(strArr, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ni
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                GroupEventDetailView.this.m80034kN(c19410b, interfaceC17463d, i13);
                            }
                        });
                    } else {
                        String[] strArr2 = new String[2];
                        if (c19410b.f96255d) {
                            i11 = AbstractC8020f0.str_unfollow_group_OA_personal_text;
                        } else {
                            i11 = AbstractC8020f0.str_follow_group_OA_personal_text;
                        }
                        strArr2[0] = AbstractC23136l9.m118743r0(i11);
                        strArr2[1] = AbstractC23136l9.m118743r0(AbstractC8020f0.close);
                        aVar.m43160i(strArr2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.oi
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                                GroupEventDetailView.this.m80036lN(c19410b, interfaceC17463d, i13);
                            }
                        });
                    }
                } else {
                    return;
                }
            } else {
                aVar.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_OA_personal_text), AbstractC23136l9.m118743r0(AbstractC8020f0.close)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pi
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        GroupEventDetailView.this.m80038mN(c19410b, interfaceC17463d, i13);
                    }
                });
            }
            aVar.m43152a().mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: DM */
    private void m80009DM(View view, final C19410b c19410b) {
        if (c19410b == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_name_cate);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.tv_source_follow);
        textView.setText(c19410b.f96253b);
        if (!TextUtils.isEmpty(c19410b.f96258g)) {
            textView2.setVisibility(0);
            textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_groupName) + ": " + c19410b.f96258g);
        } else {
            textView2.setVisibility(0);
            textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_src_event_personal_calendar));
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.hi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupEventDetailView.this.m80015WM(c19410b, view2);
            }
        });
    }

    /* renamed from: DN */
    private void m80010DN(int i11, ArrayList arrayList) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14332b(i11, arrayList));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcType", 5);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        c0766k.mo1740t4(i11, arrayList, jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public void m80011EM() {
        C18434b.m97679l().m97685n(m80013OM(), this.f73667Y1, null, new C18434b.e() { // from class: com.zing.zalo.ui.zviews.ri
            @Override // p131ei.C18434b.e
            /* renamed from: a */
            public final void mo64321a(int i11, C31862c c31862c) {
                GroupEventDetailView.this.m80017YM(i11, c31862c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public Button m80012MM() {
        if (m87077NK() != null) {
            return m87077NK().getTrailingButton3();
        }
        return null;
    }

    /* renamed from: OM */
    private int m80013OM() {
        C19411c c19411c = this.f73675c2;
        if (c19411c != null && c19411c.f96279s == 2) {
            return 23;
        }
        return 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public /* synthetic */ void m80014VM() {
        String str;
        int i11;
        C19411c.a.b bVar;
        C19411c.a.C32826a c32826a;
        C19411c.a aVar;
        C19411c.a.c cVar;
        C31973j5 c31973j5;
        int i12;
        int i13;
        int i14;
        String format;
        MessageId messageId;
        if (this.f73675c2 == null) {
            return;
        }
        m80061EN();
        str = "";
        if (this.f73675c2.f96279s != 2) {
            C31973j5 c31973j52 = this.f73669Z1;
            String m153793y = c31973j52 != null ? c31973j52.m153793y() : "";
            if (m87077NK() != null) {
                if (this.f73675c2.f96279s == 4) {
                    m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_anniversary_detail_title));
                } else {
                    m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder_detail_title));
                }
                if (!TextUtils.isEmpty(m153793y)) {
                    m87077NK().setMiddleSubtitle(m153793y);
                }
            }
            int i15 = this.f73675c2.f96279s;
            if (i15 != 3 && i15 != 4 && i15 != 5) {
                m80049tN(false);
            } else if (i15 == 3 || (((c31973j5 = this.f73669Z1) != null && c31973j5.m153742T()) || C18415w.m97595h(this.f73675c2))) {
                m80049tN(true);
            }
            if (this.f73698o1 == null) {
                m80075UM();
            }
            View view = this.f73656T0;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f73698o1.setVisibility(0);
            C19411c.a aVar2 = this.f73675c2.f96281u;
            if (aVar2 != null && aVar2.f96293g) {
                this.f73700p1.setVisibility(0);
                this.f73659U1.setVisibility(8);
            } else {
                this.f73700p1.setVisibility(8);
            }
            if (this.f73675c2.f96275o != null) {
                this.f73702q1.setVisibility(0);
                this.f73706s1.setText(this.f73675c2.f96275o.m40485u1());
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f73675c2.f96275o.f42434r);
                if (m141809c != null && !TextUtils.isEmpty(m141809c.f42446v)) {
                    AbstractC23268y2.m120028b(this.f73648P0, this.f73704r1, m141809c, C23278z2.m120143n(), false);
                } else {
                    AbstractC23268y2.m120031e(this.f73648P0, this.f73704r1, this.f73675c2.f96275o.f42446v, C23278z2.m120143n());
                }
                this.f73708t1.setText(AbstractC23160o0.m119181A(this.f73675c2.f96267g));
            } else {
                this.f73702q1.setVisibility(8);
            }
            if (this.f73675c2.f96279s == 3) {
                this.f73659U1.setVisibility(8);
            }
            m80078sN(this.f73693l2);
            m80077qN();
            this.f73712v1.setText(!TextUtils.isEmpty(this.f73675c2.f96282v.f96314a) ? this.f73675c2.f96282v.f96314a : "⏰");
            this.f73714x1.setVisibility(0);
            this.f73715y1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_groupboard_reminder_decor_time_n));
            if (this.f73673b2 <= Long.MIN_VALUE) {
                this.f73673b2 = this.f73675c2.f96262b;
            }
            int m101530e = this.f73675c2.m101530e();
            long currentTimeMillis = System.currentTimeMillis();
            if (m101530e != 1) {
                if (m101530e == 2) {
                    i12 = m101530e;
                    C19411c c19411c = this.f73675c2;
                    long j11 = c19411c.f96264d;
                    if (currentTimeMillis >= j11 && currentTimeMillis <= c19411c.f96265e) {
                        this.f73716z1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                    } else if (currentTimeMillis < j11) {
                        this.f73716z1.setText(AbstractC23160o0.m119245e(j11));
                    } else {
                        this.f73716z1.setText(AbstractC23160o0.m119245e(c19411c.f96265e));
                    }
                    this.f73633A1.setText(AbstractC23160o0.m119215R(this.f73675c2.f96264d, true, false));
                    this.f73634B1.setVisibility(0);
                    this.f73634B1.setText(AbstractC23160o0.m119215R(this.f73675c2.f96265e, true, false));
                } else if (m101530e == 3) {
                    i12 = m101530e;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(this.f73673b2);
                    if (AbstractC23160o0.m119247e1(this.f73673b2)) {
                        this.f73716z1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                    } else {
                        long j12 = this.f73673b2;
                        if (currentTimeMillis < j12) {
                            this.f73716z1.setText(AbstractC23160o0.m119245e(j12));
                        } else {
                            this.f73716z1.setText(AbstractC23160o0.m119245e(j12 + 86399999));
                        }
                    }
                    this.f73633A1.setText(AbstractC23160o0.m119191F(calendar, true, false));
                    this.f73634B1.setVisibility(8);
                } else if (m101530e != 4) {
                    this.f73716z1.setText(AbstractC23160o0.m119245e(this.f73673b2));
                    this.f73633A1.setText(AbstractC23160o0.m119215R(this.f73673b2, true, false));
                    this.f73634B1.setVisibility(8);
                    i12 = m101530e;
                } else {
                    int m119255h0 = AbstractC23160o0.m119255h0(C18408p.m97471K(), TimeZone.getDefault(), this.f73675c2.f96264d);
                    C19411c c19411c2 = this.f73675c2;
                    long j13 = c19411c2.f96264d;
                    long j14 = m119255h0;
                    i12 = m101530e;
                    if (currentTimeMillis >= j13 + j14 && currentTimeMillis <= c19411c2.f96265e + j14) {
                        this.f73716z1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                    } else if (currentTimeMillis < j13 + j14) {
                        this.f73716z1.setText(AbstractC23160o0.m119245e(j13 + j14));
                    } else {
                        this.f73716z1.setText(AbstractC23160o0.m119245e(c19411c2.f96265e + j14));
                    }
                    Calendar calendar2 = Calendar.getInstance(C18408p.m97471K());
                    calendar2.setTimeInMillis(this.f73675c2.f96264d);
                    this.f73633A1.setText(AbstractC23160o0.m119191F(calendar2, true, false));
                    this.f73634B1.setVisibility(0);
                    calendar2.setTimeInMillis(this.f73675c2.f96265e);
                    this.f73634B1.setText(AbstractC23160o0.m119191F(calendar2, true, false));
                }
                i13 = 1;
            } else {
                i12 = m101530e;
                long j15 = this.f73673b2;
                if (currentTimeMillis >= j15) {
                    C19411c c19411c3 = this.f73675c2;
                    if (currentTimeMillis <= (c19411c3.f96265e + j15) - c19411c3.f96264d) {
                        this.f73716z1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                        StringBuilder sb2 = new StringBuilder();
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTimeInMillis(this.f73675c2.f96264d);
                        sb2.append(AbstractC23160o0.m119191F(calendar3, true, false));
                        sb2.append(", ");
                        sb2.append(AbstractC23160o0.m119202K0(this.f73673b2, true));
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
                        sb2.append(" ");
                        long j16 = this.f73673b2;
                        C19411c c19411c4 = this.f73675c2;
                        long j17 = (j16 + c19411c4.f96265e) - c19411c4.f96264d;
                        i13 = 1;
                        sb2.append(AbstractC23160o0.m119202K0(j17, true));
                        this.f73633A1.setText(sb2.toString());
                        this.f73634B1.setVisibility(8);
                    }
                }
                if (currentTimeMillis < j15) {
                    this.f73716z1.setText(AbstractC23160o0.m119245e(j15));
                } else {
                    RobotoTextView robotoTextView = this.f73716z1;
                    C19411c c19411c5 = this.f73675c2;
                    robotoTextView.setText(AbstractC23160o0.m119245e((j15 + c19411c5.f96265e) - c19411c5.f96264d));
                }
                StringBuilder sb22 = new StringBuilder();
                Calendar calendar32 = Calendar.getInstance();
                calendar32.setTimeInMillis(this.f73675c2.f96264d);
                sb22.append(AbstractC23160o0.m119191F(calendar32, true, false));
                sb22.append(", ");
                sb22.append(AbstractC23160o0.m119202K0(this.f73673b2, true));
                sb22.append(" ");
                sb22.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
                sb22.append(" ");
                long j162 = this.f73673b2;
                C19411c c19411c42 = this.f73675c2;
                long j172 = (j162 + c19411c42.f96265e) - c19411c42.f96264d;
                i13 = 1;
                sb22.append(AbstractC23160o0.m119202K0(j172, true));
                this.f73633A1.setText(sb22.toString());
                this.f73634B1.setVisibility(8);
            }
            if (this.f73675c2.f96272l == i13) {
                this.f73635C1.setVisibility(0);
                Calendar calendar4 = Calendar.getInstance();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(");
                int i16 = i12;
                if (i16 != 4 && i16 != 2) {
                    calendar4.setTimeInMillis(this.f73673b2);
                    sb3.append(AbstractC23160o0.m119199J(calendar4, true, false, false));
                } else {
                    if (i16 == 4) {
                        calendar4.setTimeZone(C18408p.m97471K());
                    }
                    calendar4.setTimeInMillis(this.f73675c2.f96264d);
                    sb3.append(AbstractC23160o0.m119199J(calendar4, true, false, false));
                    sb3.append(" ");
                    sb3.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
                    sb3.append(" ");
                    calendar4.setTimeInMillis(this.f73675c2.f96265e);
                    sb3.append(AbstractC23160o0.m119199J(calendar4, true, false, false));
                }
                sb3.append(")");
                this.f73635C1.setText(sb3.toString());
            } else {
                this.f73635C1.setVisibility(8);
            }
            JSONArray jSONArray = this.f73675c2.f96270j;
            if (jSONArray != null && jSONArray.length() > 0) {
                C19411c c19411c6 = this.f73675c2;
                C19425q c19425q = new C19425q(c19411c6.f96270j, c19411c6.f96272l);
                if (c19425q.f96376a != null) {
                    this.f73636D1.setVisibility(0);
                    this.f73637E1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_groupboard_reminder_decor_repeat));
                    this.f73638F1.setText(c19425q.f96376a.m101571c());
                    i14 = 8;
                } else {
                    i14 = 8;
                    this.f73636D1.setVisibility(8);
                }
            } else {
                i14 = 8;
                this.f73636D1.setVisibility(8);
            }
            this.f73639G1.setVisibility(i14);
            this.f73641I1.setVisibility(i14);
            C19411c c19411c7 = this.f73675c2;
            C19411c.a.e eVar = c19411c7.f96281u.f96289c;
            if (eVar != null && (messageId = eVar.f96306a) != null) {
                int i17 = eVar.f96311f;
                if (i17 != 1) {
                    if (i17 == 2) {
                        if (messageId.m41059z()) {
                            this.f73639G1.setVisibility(0);
                            if (!TextUtils.isEmpty(this.f73675c2.f96281u.f96289c.f96308c)) {
                                this.f73640H1.setVisibility(0);
                                if (CoreUtility.f89233i.equals(this.f73675c2.f96281u.f96289c.f96308c)) {
                                    this.f73640H1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_you_to_group, m153793y));
                                } else {
                                    C19411c.a.e eVar2 = this.f73675c2.f96281u.f96289c;
                                    this.f73640H1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_sb_to_group, AbstractC21935u.m114542i(eVar2.f96308c, eVar2.f96307b), m153793y));
                                }
                            } else {
                                this.f73640H1.setVisibility(8);
                            }
                        } else if (this.f73681f2) {
                            this.f73641I1.setVisibility(0);
                            this.f73643K1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_groupboard_reminder_decor_group));
                            this.f73642J1.setText(m153793y);
                        }
                    }
                } else if (messageId.m41059z()) {
                    this.f73639G1.setVisibility(0);
                    if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                        this.f73640H1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_you_to_sb, AbstractC21935u.m114542i(eVar.f96310e, eVar.f96309d)));
                    } else if (CoreUtility.f89233i.equals(eVar.f96310e)) {
                        this.f73640H1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_sb_to_you, AbstractC21935u.m114542i(eVar.f96308c, eVar.f96307b)));
                    }
                } else if (this.f73681f2) {
                    this.f73641I1.setVisibility(0);
                    if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                        str = AbstractC21935u.m114542i(eVar.f96310e, eVar.f96309d);
                    } else if (CoreUtility.f89233i.equals(eVar.f96310e)) {
                        str = AbstractC21935u.m114542i(eVar.f96308c, eVar.f96307b);
                    }
                    this.f73643K1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_groupboard_reminder_decor_accepted));
                    this.f73642J1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_goto_chat_csc_msg, str));
                }
            } else if (this.f73681f2) {
                int i18 = c19411c7.f96277q;
                if (i18 == 1) {
                    this.f73641I1.setVisibility(0);
                    if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                        str = AbstractC21935u.m114542i(eVar.f96310e, eVar.f96309d);
                    } else if (CoreUtility.f89233i.equals(eVar.f96310e)) {
                        str = AbstractC21935u.m114542i(eVar.f96308c, eVar.f96307b);
                    }
                    this.f73643K1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_groupboard_reminder_decor_accepted));
                    this.f73642J1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_goto_chat_csc_msg, str));
                } else if (i18 == 2) {
                    this.f73641I1.setVisibility(0);
                    this.f73643K1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_groupboard_reminder_decor_group));
                    this.f73642J1.setText(m153793y);
                }
            }
            C19409a c19409a = this.f73675c2.f96285y;
            if (c19409a != null && c19409a.f96249a && c19409a.f96251c != null) {
                int i19 = 0;
                int i21 = 0;
                for (int i22 = 0; i22 < this.f73675c2.f96285y.f96251c.size(); i22++) {
                    C19417i c19417i = (C19417i) this.f73675c2.f96285y.f96251c.get(i22);
                    int i23 = c19417i.f96338a;
                    if (i23 == 1) {
                        i19 = c19417i.f96339b;
                    } else if (i23 == 2) {
                        i21 = c19417i.f96339b;
                    }
                }
                this.f73644L1.setVisibility(0);
                if (i19 == 0 && i21 == 0) {
                    format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_blank_no_response_text);
                } else if (i19 == 0) {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_decline_text), Integer.valueOf(i21));
                } else if (i21 == 0) {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_going_text), Integer.valueOf(i19));
                } else {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_text), Integer.valueOf(i19), Integer.valueOf(i21));
                }
                this.f73645M1.setText(format);
                m80082zN();
                return;
            }
            this.f73644L1.setVisibility(8);
            m80072RM();
            return;
        }
        m80049tN(false);
        if (this.f73656T0 == null) {
            m80074TM();
        }
        this.f73656T0.setVisibility(0);
        View view2 = this.f73698o1;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        C19411c.b bVar2 = this.f73675c2.f96282v;
        if (bVar2 != null) {
            AbstractC23268y2.m120031e(this.f73648P0, this.f73658U0, bVar2.f96317d, C23278z2.m120144n0());
            this.f73660V0.setText(this.f73675c2.f96282v.f96314a);
        }
        this.f73662W0.setText(this.f73675c2.f96286z);
        if (this.f73675c2.f96275o != null) {
            this.f73664X0.setVisibility(0);
            String m118085e = AbstractC23028c0.m118085e(this.f73675c2.f96275o, true, AbstractC8020f0.str_me);
            String format2 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_created_by), m118085e);
            SpannableString spannableString = new SpannableString(format2);
            spannableString.setSpan(new StyleSpan(1), format2.length() - m118085e.length(), spannableString.length(), 0);
            this.f73664X0.setText(spannableString);
        } else {
            this.f73664X0.setVisibility(8);
        }
        if (this.f73673b2 <= Long.MIN_VALUE) {
            this.f73673b2 = this.f73675c2.f96262b;
        }
        if (this.f73675c2.f96277q == 2) {
            C31973j5 c31973j53 = this.f73669Z1;
            str = c31973j53 != null ? c31973j53.m153793y() : "";
            if (TextUtils.isEmpty(str) && (aVar = this.f73675c2.f96281u) != null && (cVar = aVar.f96288b) != null) {
                str = cVar.f96302b;
            }
        }
        C19411c.a aVar3 = this.f73675c2.f96281u;
        if (aVar3 != null && (c32826a = aVar3.f96290d) != null && c32826a.f96294a.size() > 0) {
            this.f73666Y0.setVisibility(0);
            this.f73666Y0.removeAllViews();
            for (int i24 = 0; i24 < this.f73675c2.f96281u.f96290d.f96294a.size(); i24++) {
                C19411c.a.C32826a.C32827a c32827a = (C19411c.a.C32826a.C32827a) this.f73675c2.f96281u.f96290d.f96294a.get(i24);
                C19411c c19411c8 = this.f73675c2;
                if (c19411c8.f96277q == 2 || c32827a.f96296b) {
                    C19410b c19410b = new C19410b(c32827a.f96295a, c32827a.f96297c, "", "", c32827a.f96296b, Integer.parseInt(c19411c8.f96278r), str);
                    View inflate = this.f73689j2.inflate(AbstractC7409c0.cate_event_follow_layout, (ViewGroup) null);
                    this.f73666Y0.addView(inflate);
                    m80009DM(inflate, c19410b);
                }
            }
        } else {
            this.f73666Y0.setVisibility(8);
            this.f73666Y0.removeAllViews();
        }
        int m101530e2 = this.f73675c2.m101530e();
        long currentTimeMillis2 = System.currentTimeMillis();
        if (m101530e2 != 1) {
            if (m101530e2 == 2) {
                C19411c c19411c9 = this.f73675c2;
                long j18 = c19411c9.f96264d;
                if (currentTimeMillis2 >= j18 && currentTimeMillis2 <= c19411c9.f96265e) {
                    this.f73670a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                } else if (currentTimeMillis2 < j18) {
                    this.f73670a1.setText(AbstractC23160o0.m119245e(j18));
                } else {
                    this.f73670a1.setText(AbstractC23160o0.m119245e(c19411c9.f96265e));
                }
                this.f73672b1.setText(AbstractC23160o0.m119215R(this.f73675c2.f96264d, true, false));
                this.f73674c1.setVisibility(0);
                this.f73674c1.setText(AbstractC23160o0.m119215R(this.f73675c2.f96265e, true, false));
            } else if (m101530e2 == 3) {
                Calendar calendar5 = Calendar.getInstance();
                calendar5.setTimeInMillis(this.f73673b2);
                if (AbstractC23160o0.m119247e1(this.f73673b2)) {
                    this.f73670a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                } else {
                    long j19 = this.f73673b2;
                    if (currentTimeMillis2 < j19) {
                        this.f73670a1.setText(AbstractC23160o0.m119245e(j19));
                    } else {
                        this.f73670a1.setText(AbstractC23160o0.m119245e(j19 + 86399999));
                    }
                }
                this.f73672b1.setText(AbstractC23160o0.m119191F(calendar5, true, false));
                this.f73674c1.setVisibility(8);
            } else if (m101530e2 != 4) {
                this.f73670a1.setText(AbstractC23160o0.m119245e(this.f73673b2));
                this.f73672b1.setText(AbstractC23160o0.m119215R(this.f73673b2, true, false));
                this.f73674c1.setVisibility(8);
            } else {
                int m119255h02 = AbstractC23160o0.m119255h0(C18408p.m97471K(), TimeZone.getDefault(), this.f73675c2.f96264d);
                C19411c c19411c10 = this.f73675c2;
                long j21 = c19411c10.f96264d;
                long j22 = m119255h02;
                if (currentTimeMillis2 >= j21 + j22 && currentTimeMillis2 <= c19411c10.f96265e + j22) {
                    this.f73670a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                } else if (currentTimeMillis2 < j21 + j22) {
                    this.f73670a1.setText(AbstractC23160o0.m119245e(j21 + j22));
                } else {
                    this.f73670a1.setText(AbstractC23160o0.m119245e(c19411c10.f96265e + j22));
                }
                Calendar calendar6 = Calendar.getInstance(C18408p.m97471K());
                calendar6.setTimeInMillis(this.f73675c2.f96264d);
                this.f73672b1.setText(AbstractC23160o0.m119191F(calendar6, true, false));
                this.f73674c1.setVisibility(0);
                calendar6.setTimeInMillis(this.f73675c2.f96265e);
                this.f73674c1.setText(AbstractC23160o0.m119191F(calendar6, true, false));
            }
            i11 = 1;
        } else {
            long j23 = this.f73673b2;
            if (currentTimeMillis2 >= j23) {
                C19411c c19411c11 = this.f73675c2;
                if (currentTimeMillis2 <= (c19411c11.f96265e + j23) - c19411c11.f96264d) {
                    this.f73670a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_happening));
                    StringBuilder sb4 = new StringBuilder();
                    Calendar calendar7 = Calendar.getInstance();
                    calendar7.setTimeInMillis(this.f73675c2.f96264d);
                    sb4.append(AbstractC23160o0.m119191F(calendar7, true, false));
                    sb4.append(", ");
                    sb4.append(AbstractC23160o0.m119202K0(this.f73673b2, true));
                    sb4.append(" ");
                    sb4.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
                    sb4.append(" ");
                    long j24 = this.f73673b2;
                    C19411c c19411c12 = this.f73675c2;
                    long j25 = (j24 + c19411c12.f96265e) - c19411c12.f96264d;
                    i11 = 1;
                    sb4.append(AbstractC23160o0.m119202K0(j25, true));
                    this.f73672b1.setText(sb4.toString());
                    this.f73674c1.setVisibility(8);
                }
            }
            if (currentTimeMillis2 < j23) {
                this.f73670a1.setText(AbstractC23160o0.m119245e(j23));
            } else {
                TextView textView = this.f73670a1;
                C19411c c19411c13 = this.f73675c2;
                textView.setText(AbstractC23160o0.m119245e((j23 + c19411c13.f96265e) - c19411c13.f96264d));
            }
            StringBuilder sb42 = new StringBuilder();
            Calendar calendar72 = Calendar.getInstance();
            calendar72.setTimeInMillis(this.f73675c2.f96264d);
            sb42.append(AbstractC23160o0.m119191F(calendar72, true, false));
            sb42.append(", ");
            sb42.append(AbstractC23160o0.m119202K0(this.f73673b2, true));
            sb42.append(" ");
            sb42.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
            sb42.append(" ");
            long j242 = this.f73673b2;
            C19411c c19411c122 = this.f73675c2;
            long j252 = (j242 + c19411c122.f96265e) - c19411c122.f96264d;
            i11 = 1;
            sb42.append(AbstractC23160o0.m119202K0(j252, true));
            this.f73672b1.setText(sb42.toString());
            this.f73674c1.setVisibility(8);
        }
        if (this.f73675c2.f96272l == i11) {
            this.f73676d1.setVisibility(0);
            Calendar calendar8 = Calendar.getInstance();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("(");
            if (m101530e2 != 4 && m101530e2 != 2) {
                calendar8.setTimeInMillis(this.f73673b2);
                sb5.append(AbstractC23160o0.m119199J(calendar8, true, false, false));
            } else {
                if (m101530e2 == 4) {
                    calendar8.setTimeZone(C18408p.m97471K());
                }
                calendar8.setTimeInMillis(this.f73675c2.f96264d);
                sb5.append(AbstractC23160o0.m119199J(calendar8, true, false, false));
                sb5.append(" ");
                sb5.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_to));
                sb5.append(" ");
                calendar8.setTimeInMillis(this.f73675c2.f96265e);
                sb5.append(AbstractC23160o0.m119199J(calendar8, true, false, false));
            }
            sb5.append(")");
            this.f73676d1.setText(sb5.toString());
        } else {
            this.f73676d1.setVisibility(8);
        }
        try {
            JSONArray jSONArray2 = this.f73675c2.f96270j;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                C19411c c19411c14 = this.f73675c2;
                C19425q c19425q2 = new C19425q(c19411c14.f96270j, c19411c14.f96272l);
                if (c19425q2.f96376a != null) {
                    this.f73678e1.setVisibility(0);
                    this.f73680f1.setText(c19425q2.f96376a.m101571c());
                } else {
                    this.f73678e1.setVisibility(8);
                }
            } else {
                this.f73678e1.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (this.f73675c2.f96284x != null) {
            this.f73682g1.setVisibility(0);
            this.f73682g1.setClickable((this.f73675c2.f96284x.m153169a() == 0.0d || this.f73675c2.f96284x.m153170b() == 0.0d) ? false : true);
            if (!TextUtils.isEmpty(this.f73675c2.f96284x.f96341c)) {
                this.f73684h1.setVisibility(0);
                this.f73684h1.setText(this.f73675c2.f96284x.f96341c);
            } else {
                this.f73684h1.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f73675c2.f96284x.f96342d)) {
                this.f73686i1.setVisibility(0);
                this.f73686i1.setText(this.f73675c2.f96284x.f96342d);
            } else {
                this.f73686i1.setVisibility(8);
            }
        } else {
            this.f73682g1.setVisibility(8);
        }
        m80068LM();
        C19411c.a aVar4 = this.f73675c2.f96281u;
        if (aVar4 != null && (bVar = aVar4.f96291e) != null && AbstractC28207v1.m141992i1(bVar.f96298a)) {
            this.f73692l1.setVisibility(0);
            this.f73694m1.setText(this.f73675c2.f96281u.f96291e.f96300c);
        } else {
            this.f73692l1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public /* synthetic */ void m80015WM(C19410b c19410b, View view) {
        m80007AN(c19410b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ void m80016XM(C31862c c31862c) {
        ViewStub viewStub;
        if (c31862c != null) {
            try {
                if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a()) {
                    if (this.f73663W1 == null && (viewStub = (ViewStub) this.f73650Q0.findViewById(AbstractC6918a0.vs_quick_action_view)) != null) {
                        this.f73663W1 = (FrameLayout) viewStub.inflate();
                    }
                    FrameLayout frameLayout = this.f73663W1;
                    if (frameLayout != null) {
                        if (frameLayout.getVisibility() == 0 && this.f73663W1.getChildCount() > 0 && (this.f73663W1.getChildAt(0) instanceof QuickActionViewLayout)) {
                            QuickActionViewLayout quickActionViewLayout = (QuickActionViewLayout) this.f73663W1.getChildAt(0);
                            if (quickActionViewLayout.getActionItemInfo() != null && quickActionViewLayout.getActionItemInfo().m153159l(c31862c)) {
                                return;
                            }
                        }
                        this.f73663W1.removeAllViews();
                        this.f73663W1.setVisibility(0);
                        QuickActionViewLayout quickActionViewLayout2 = new QuickActionViewLayout(this.f73663W1.getContext(), c31862c.f146309b);
                        quickActionViewLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        quickActionViewLayout2.setId(AbstractC6918a0.view_quick_action_top);
                        this.f73663W1.addView(quickActionViewLayout2);
                        quickActionViewLayout2.m75818b(c31862c, new C14335e());
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        FrameLayout frameLayout2 = this.f73663W1;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            this.f73663W1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public /* synthetic */ void m80017YM(int i11, final C31862c c31862c) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.li
            @Override // java.lang.Runnable
            public final void run() {
                GroupEventDetailView.this.m80016XM(c31862c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m80018ZM(String str, InterfaceC0765j interfaceC0765j, int i11) {
        C18408p.m97474Q().f92823b.add(str);
        interfaceC0765j.mo1512Pa(Long.parseLong(str), i11, this.f73667Y1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m80019aN(View view) {
        m80081yN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m80020bN(C19411c.a.e eVar) {
        String str;
        this.f72421L0.finish();
        if (TextUtils.isEmpty(this.f73667Y1)) {
            if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                str = eVar.f96310e;
            } else {
                str = eVar.f96308c;
            }
            AbstractC23211s7.m119573f(str, this.f72421L0.m92676n2(), eVar.f96306a);
            return;
        }
        AbstractC23211s7.m119579l(this.f73667Y1, this.f72421L0.m92676n2(), true, eVar.f96306a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public /* synthetic */ void m80021cN() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_not_found));
        this.f73697n2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m80022dN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m80067KM(this.f73671a2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public /* synthetic */ void m80023eN(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_edit) {
            m80076pN();
        } else if (intValue == AbstractC8020f0.str_delete) {
            showDialog(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public /* synthetic */ void m80024fN(View view) {
        m80076pN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public /* synthetic */ void m80026gN(View view) {
        AbstractC23647d.m123897g("1001663");
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public /* synthetic */ void m80028hN(View view) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f73667Y1)) {
            bundle.putString("extra_group_id", this.f73667Y1);
        }
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 3);
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().mo35581q(ManageCalendarCateEventView.class, bundle, 3, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public /* synthetic */ void m80030iN(boolean z11, int i11) {
        try {
            if (z11) {
                MultiStateView multiStateView = this.f73661V1;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f73661V1.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f73652R0.setVisibility(8);
                return;
            }
            if (i11 == 0) {
                this.f73661V1.setVisibility(8);
                this.f73652R0.setVisibility(0);
                return;
            }
            if (i11 != 17034) {
                if (i11 != 50001) {
                    this.f73661V1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_topic_error_loading_topic_info));
                    this.f73661V1.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                } else {
                    this.f73661V1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                    this.f73661V1.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                }
            } else {
                this.f73661V1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_reminder_is_deleted));
                this.f73661V1.setErrorType(MultiStateView.EnumC15915f.DELETED_ERROR);
                this.f73661V1.setErrorImageResource(AbstractC16803z.empty_delete);
                m80053vN(false);
            }
            this.f73661V1.setState(MultiStateView.EnumC15914e.ERROR);
            this.f73661V1.setVisibility(0);
            this.f73652R0.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public /* synthetic */ void m80032jN(int i11) {
        this.f73683g2 = i11;
        m80058BN(i11, true);
        m80064HM(this.f73675c2.f96261a, this.f73683g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public /* synthetic */ void m80034kN(C19410b c19410b, InterfaceC17463d interfaceC17463d, int i11) {
        ArrayList arrayList = new ArrayList();
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    interfaceC17463d.dismiss();
                    return;
                }
            } else {
                arrayList.add(new C19422n((byte) 2, Integer.parseInt(this.f73667Y1), (byte) 2, (byte) 0));
            }
        } else {
            arrayList.add(new C19422n((byte) 2, Integer.parseInt(this.f73667Y1), (byte) 1, !c19410b.f96255d ? (byte) 1 : (byte) 0));
        }
        m80010DN(c19410b.f96252a, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public /* synthetic */ void m80036lN(C19410b c19410b, InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C19422n((byte) 2, Integer.parseInt(this.f73667Y1), (byte) 1, !c19410b.f96255d ? (byte) 1 : (byte) 0));
            m80010DN(c19410b.f96252a, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public /* synthetic */ void m80038mN(C19410b c19410b, InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
            }
        } else {
            int parseInt = Integer.parseInt(CoreUtility.f89233i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C19422n((byte) 1, parseInt, (byte) 1, (byte) 0));
            m80010DN(c19410b.f96252a, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:10:0x0012, B:13:0x001d, B:16:0x0027, B:18:0x002b, B:20:0x002f, B:22:0x0035, B:27:0x0043, B:29:0x0056, B:30:0x0067, B:32:0x006f, B:33:0x0076, B:35:0x0073, B:37:0x007a, B:39:0x0086, B:41:0x008c, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:52:0x00a0), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:10:0x0012, B:13:0x001d, B:16:0x0027, B:18:0x002b, B:20:0x002f, B:22:0x0035, B:27:0x0043, B:29:0x0056, B:30:0x0067, B:32:0x006f, B:33:0x0076, B:35:0x0073, B:37:0x007a, B:39:0x0086, B:41:0x008c, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:52:0x00a0), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:10:0x0012, B:13:0x001d, B:16:0x0027, B:18:0x002b, B:20:0x002f, B:22:0x0035, B:27:0x0043, B:29:0x0056, B:30:0x0067, B:32:0x006f, B:33:0x0076, B:35:0x0073, B:37:0x007a, B:39:0x0086, B:41:0x008c, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:52:0x00a0), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:10:0x0012, B:13:0x001d, B:16:0x0027, B:18:0x002b, B:20:0x002f, B:22:0x0035, B:27:0x0043, B:29:0x0056, B:30:0x0067, B:32:0x006f, B:33:0x0076, B:35:0x0073, B:37:0x007a, B:39:0x0086, B:41:0x008c, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:52:0x00a0), top: B:1:0x0000 }] */
    /* renamed from: nN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m80040nN() {
        boolean z11;
        C31973j5 c31973j5;
        try {
            int i11 = this.f73675c2.f96279s;
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4 && i11 != 5) {
                    m80053vN(false);
                    m80051uN(false);
                    return;
                }
                this.f73699o2.clear();
                C19411c c19411c = this.f73675c2;
                if (c19411c == null) {
                    return;
                }
                if (c19411c.f96279s != 3 && (((c31973j5 = this.f73669Z1) == null || !c31973j5.m153742T()) && !C18415w.m97595h(this.f73675c2))) {
                    z11 = false;
                    if (z11) {
                        this.f73699o2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit), AbstractC8020f0.str_edit));
                    }
                    if (z11) {
                        this.f73699o2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), AbstractC8020f0.str_delete));
                    }
                    if (!this.f73699o2.isEmpty()) {
                        m80053vN(false);
                    } else {
                        m80053vN(true);
                    }
                    m80051uN(false);
                    return;
                }
                z11 = true;
                if (z11) {
                }
                if (z11) {
                }
                if (!this.f73699o2.isEmpty()) {
                }
                m80051uN(false);
                return;
            }
            m80053vN(false);
            m80051uN(false);
            if (AbstractC23309i.m121442T2()) {
                int i12 = this.f73675c2.f96277q;
                if (i12 == 1) {
                    m80051uN(true);
                    return;
                }
                if (i12 == 2) {
                    C31973j5 c31973j52 = this.f73669Z1;
                    if (c31973j52 != null && c31973j52.m153778p0()) {
                        m80051uN(true);
                        return;
                    }
                    return;
                }
                m80051uN(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public void m80042oN(C31862c c31862c, String str, String str2) {
        boolean z11;
        if (c31862c != null && c31862c.m153153e()) {
            m80046rN(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("action.window.close")) {
                if (!z11) {
                    m80046rN(c31862c);
                    return;
                }
                return;
            }
            AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
        }
    }

    /* renamed from: rN */
    private void m80046rN(C31862c c31862c) {
        FrameLayout frameLayout = this.f73663W1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f73663W1.setVisibility(8);
        }
        C18434b.m97679l().m97691w(c31862c);
    }

    /* renamed from: tN */
    private void m80049tN(boolean z11) {
        int i11;
        if (m87077NK() != null && m87077NK().getTrailingButton() != null) {
            Button trailingButton = m87077NK().getTrailingButton();
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trailingButton.setVisibility(i11);
        }
    }

    /* renamed from: uN */
    private void m80051uN(boolean z11) {
        int i11;
        if (m87077NK() != null && m87077NK().getTrailingButton3() != null) {
            Button trailingButton3 = m87077NK().getTrailingButton3();
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trailingButton3.setVisibility(i11);
        }
    }

    /* renamed from: vN */
    private void m80053vN(boolean z11) {
        int i11;
        if (m87077NK() != null && m87077NK().getTrailingButton2() != null) {
            Button trailingButton2 = m87077NK().getTrailingButton2();
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trailingButton2.setVisibility(i11);
        }
    }

    /* renamed from: BN */
    void m80058BN(int i11, boolean z11) {
        if (z11) {
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f73711u2;
            if (attendConfirmBottomPicker != null) {
                attendConfirmBottomPicker.m78110vL(i11, false);
                this.f73711u2.m78105EG(true, true);
                return;
            }
            return;
        }
        this.f73665X1.setVisibility(0);
        this.f73647O1.setVisibility(4);
    }

    /* renamed from: CM */
    public void m80059CM() {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gi
                @Override // java.lang.Runnable
                public final void run() {
                    GroupEventDetailView.this.m80014VM();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CN */
    void m80060CN() {
        int i11;
        try {
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f73646N1;
            if (touchInterceptionFrameLayout != null) {
                if (touchInterceptionFrameLayout.getHeight() > 0) {
                    i11 = this.f73646N1.getHeight();
                } else {
                    i11 = f73632v2;
                }
                int i12 = i11;
                this.f73646N1.setPosition(i12);
                this.f73646N1.setVisibility(0);
                AbstractC23202r9.m119537e(this.f73646N1, null, 300L, null, 0.0f, i12, null, 0.0f, new C14341k());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        if (i11 != 1) {
            if (i11 == 3) {
                C8009j.a aVar = new C8009j.a(this.f72421L0.getContext());
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_delete_this_item);
                int i14 = this.f73675c2.f96279s;
                if (i14 == 4) {
                    C31973j5 c31973j5 = this.f73669Z1;
                    if (c31973j5 != null && c31973j5.m153747Y()) {
                        i13 = AbstractC8020f0.str_ask_delete_this_community_memory;
                    } else {
                        i13 = AbstractC8020f0.str_ask_delete_this_group_memory;
                    }
                    m118743r0 = AbstractC23136l9.m118743r0(i13);
                } else if (i14 == 5 || i14 == 3) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_delete_this_reminder);
                }
                int i15 = this.f73675c2.f96279s;
                if (i15 != 3 && i15 != 5 && i15 != 4) {
                    i12 = AbstractC8020f0.str_no;
                } else {
                    i12 = AbstractC8020f0.str_cancel;
                }
                aVar.m43159h(1).m43162k(m118743r0).m43165n(AbstractC23136l9.m118743r0(i12), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.qi
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                        GroupEventDetailView.this.m80022dN(interfaceC17463d, i16);
                    }
                });
                return aVar.m43152a();
            }
        } else if (!this.f73699o2.isEmpty()) {
            final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.getContext(), this.f73699o2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
            aVar2.m43155d(true);
            aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.fi
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                    GroupEventDetailView.this.m80023eN(simpleAdapter, interfaceC17463d, i16);
                }
            });
            return aVar2.m43152a();
        }
        return null;
    }

    /* renamed from: EN */
    void m80061EN() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ji
            @Override // java.lang.Runnable
            public final void run() {
                GroupEventDetailView.this.m80040nN();
            }
        });
    }

    /* renamed from: FM */
    void m80062FM() {
        try {
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f73711u2;
            if (attendConfirmBottomPicker != null) {
                attendConfirmBottomPicker.dismiss();
            } else {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("RepeatTypeBottomPicker");
                if (m92996E0 != null) {
                    this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73648P0 = new C23528a(this.f72421L0.getContext());
        this.f73689j2 = layoutInflater;
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_event_detail_layout, viewGroup, false);
        this.f73650Q0 = inflate;
        this.f73652R0 = inflate.findViewById(AbstractC6918a0.main_scroll_view);
        this.f73654S0 = (ViewStub) this.f73650Q0.findViewById(AbstractC6918a0.oa_event_stub);
        this.f73696n1 = (ViewStub) this.f73650Q0.findViewById(AbstractC6918a0.personal_event_stub);
        MultiStateView multiStateView = (MultiStateView) this.f73650Q0.findViewById(AbstractC6918a0.multi_state);
        this.f73661V1 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.wi
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupEventDetailView.this.m80069NM();
            }
        });
        this.f73677d2.m106538e(new C14334d());
        return this.f73650Q0;
    }

    /* renamed from: GM */
    void m80063GM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0(EventAttendeeBottomView.f73215o1);
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: HM */
    void m80064HM(final String str, final int i11) {
        if (TextUtils.isEmpty(str) || this.f73705r2) {
            return;
        }
        this.f73705r2 = true;
        C18408p.m97474Q().f92822a.put(str, Integer.valueOf(i11));
        final C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14331a(i11, str));
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.mi
            @Override // java.lang.Runnable
            public final void run() {
                GroupEventDetailView.this.m80018ZM(str, c0766k, i11);
            }
        }, 300L);
    }

    /* renamed from: IM */
    JSONObject m80065IM() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int currentItem = this.f73701p2.f73226e1.getCurrentItem();
            ArrayList arrayList = this.f73701p2.f73222a1;
            jSONArray.put(m80066JM(((C19417i) arrayList.get(currentItem)).f96340c, m80070PM((C19417i) arrayList.get(currentItem)), true));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 != currentItem && ((C19417i) arrayList.get(i11)).f96338a != 0) {
                    jSONArray.put(m80066JM(((C19417i) arrayList.get(i11)).f96340c, m80070PM((C19417i) arrayList.get(i11)), false));
                }
            }
            jSONObject.put("listSectionSuggest", jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scrollTop", 1);
            jSONObject2.put("selectTabType", 0);
            jSONObject2.put("actionTitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member));
            jSONObject.put("initConfig", jSONObject2);
            jSONObject.put("reminderTitle", this.f73675c2.f96273m);
            jSONObject.put("groupId", this.f73667Y1);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: JM */
    JSONObject m80066JM(ArrayList arrayList, String str, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", arrayList.get(i11));
                jSONObject2.put("dName", "");
                jSONObject2.put("avatar", "");
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("listMember", jSONArray);
            jSONObject.put("autoSelect", z11);
            jSONObject.put("sectionTitle", str);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 27);
        C23744a.m124114c().m124117e(this, 6020);
    }

    /* renamed from: KM */
    void m80067KM(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14340j());
        c0766k.mo1737s9(Long.parseLong(str));
    }

    /* renamed from: LM */
    void m80068LM() {
        String str = this.f73675c2.f96274n;
        if (!TextUtils.isEmpty(str)) {
            String m119760x = AbstractC23244v8.m119760x(str);
            if (this.f73695m2 && !TextUtils.isEmpty(m119760x)) {
                str = m119760x;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(str));
            try {
                C31944h6.m153538d(spannableStringBuilder, 15, C31884d6.m153209a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f73695m2 && !TextUtils.isEmpty(m119760x)) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) m118743r0);
                spannableStringBuilder.setSpan(new C14338h(), length, spannableStringBuilder.length(), 33);
            }
            this.f73688j1.setVisibility(0);
            this.f73690k1.setText(spannableStringBuilder);
            this.f73690k1.setMovementMethod(this.f73677d2);
            return;
        }
        this.f73688j1.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: NM */
    public void m80069NM() {
        if (this.f73691k2) {
            return;
        }
        this.f73691k2 = true;
        m80079wN(true, 0);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14336f());
        c0766k.mo1646g9(this.f73671a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ti
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupEventDetailView.this.m80024fN(view);
                }
            });
            m87077NK.setOnClickListenerTrailingButton2(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ui
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupEventDetailView.this.m80026gN(view);
                }
            });
            m87077NK.setOnClickListenerTrailingButton3(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.vi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupEventDetailView.this.m80028hN(view);
                }
            });
        }
        m80049tN(false);
        m80053vN(false);
        m80051uN(false);
    }

    /* renamed from: PM */
    String m80070PM(C19417i c19417i) {
        int i11 = c19417i.f96338a;
        if (i11 != 1) {
            if (i11 != 2) {
                return "";
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_decline);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_accept);
    }

    /* renamed from: QM */
    void m80071QM() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f73667Y1)) {
                C19411c.a.e eVar = this.f73675c2.f96281u.f96289c;
                if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                    str = eVar.f96310e;
                } else {
                    str = eVar.f96308c;
                }
                AbstractC23211s7.m119572e(str, this.f72421L0.m92676n2(), "");
                return;
            }
            AbstractC23211s7.m119575h(this.f73667Y1, this.f72421L0.m92676n2(), true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f73707s2;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    /* renamed from: RM */
    void m80072RM() {
        this.f73647O1.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        this.f73703q2 = false;
        super.mo68807SL();
    }

    /* renamed from: SM */
    void m80073SM() {
        this.f73665X1.setVisibility(8);
    }

    /* renamed from: TM */
    void m80074TM() {
        View inflate = this.f73654S0.inflate();
        this.f73656T0 = inflate;
        this.f73658U0 = (AvatarImageView) inflate.findViewById(AbstractC6918a0.iv_avatar);
        this.f73660V0 = (RobotoTextView) this.f73656T0.findViewById(AbstractC6918a0.tv_emoji);
        this.f73662W0 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_title);
        TextView textView = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_creator);
        this.f73664X0 = textView;
        textView.setOnClickListener(this);
        this.f73666Y0 = (LinearLayout) this.f73656T0.findViewById(AbstractC6918a0.list_cate_info);
        this.f73668Z0 = this.f73656T0.findViewById(AbstractC6918a0.time_container);
        this.f73670a1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_remain_days);
        this.f73672b1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_time_1);
        this.f73674c1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_time_2);
        this.f73676d1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_time_3);
        this.f73678e1 = this.f73656T0.findViewById(AbstractC6918a0.repeat_container);
        this.f73680f1 = (RobotoTextView) this.f73656T0.findViewById(AbstractC6918a0.tv_repeat);
        View findViewById = this.f73656T0.findViewById(AbstractC6918a0.location_container);
        this.f73682g1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f73684h1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_location_title);
        this.f73686i1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.tv_location_address);
        this.f73688j1 = this.f73656T0.findViewById(AbstractC6918a0.event_detail_container);
        this.f73690k1 = (TextView) this.f73656T0.findViewById(AbstractC6918a0.event_detail);
        this.f73692l1 = this.f73656T0.findViewById(AbstractC6918a0.footer_action_container);
        RobotoTextView robotoTextView = (RobotoTextView) this.f73656T0.findViewById(AbstractC6918a0.footer_action_btn);
        this.f73694m1 = robotoTextView;
        robotoTextView.setOnClickListener(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f73707s2;
        if (c13306b != null) {
            c13306b.m74697c(this.f73709t2);
        }
    }

    /* renamed from: UM */
    void m80075UM() {
        int i11;
        View inflate = this.f73696n1.inflate();
        this.f73698o1 = inflate;
        this.f73700p1 = inflate.findViewById(AbstractC6918a0.notify_hint_container);
        this.f73702q1 = this.f73698o1.findViewById(AbstractC6918a0.post_header);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f73698o1.findViewById(AbstractC6918a0.iv_creator_avt);
        this.f73704r1 = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        TextView textView = (TextView) this.f73698o1.findViewById(AbstractC6918a0.tv_creator_name);
        this.f73706s1 = textView;
        textView.setOnClickListener(this);
        this.f73708t1 = (TextView) this.f73698o1.findViewById(AbstractC6918a0.tv_timeline);
        RobotoTextView robotoTextView = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.shortcut_calendar);
        this.f73659U1 = robotoTextView;
        if (this.f73679e2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        this.f73659U1.setOnClickListener(this);
        C31973j5 c31973j5 = this.f73669Z1;
        if (c31973j5 != null && c31973j5.m153747Y()) {
            this.f73659U1.setText(AbstractC8020f0.str_community_calendar);
        }
        this.f73710u1 = this.f73698o1.findViewById(AbstractC6918a0.reminder_content);
        this.f73712v1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_emoji);
        this.f73713w1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_title);
        this.f73714x1 = this.f73698o1.findViewById(AbstractC6918a0.reminder_time_wrapper);
        this.f73715y1 = (ImageView) this.f73698o1.findViewById(AbstractC6918a0.reminder_time_icon);
        this.f73716z1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_countdown_text);
        this.f73633A1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_time_text);
        this.f73634B1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_time_text2);
        this.f73635C1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_lunar_time_text);
        this.f73636D1 = this.f73698o1.findViewById(AbstractC6918a0.reminder_repeat_wrapper);
        this.f73637E1 = (ImageView) this.f73698o1.findViewById(AbstractC6918a0.reminder_repeat_icon);
        this.f73638F1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_repeat_text);
        View findViewById = this.f73698o1.findViewById(AbstractC6918a0.reminder_jump_msg_wrapper);
        this.f73639G1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f73640H1 = (RobotoTextView) this.f73698o1.findViewById(AbstractC6918a0.reminder_jump_msg_subtitle);
        View findViewById2 = this.f73650Q0.findViewById(AbstractC6918a0.attendee_wrapper);
        this.f73644L1 = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupEventDetailView.this.m80019aN(view);
            }
        });
        this.f73645M1 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.attendee_text);
        this.f73646N1 = (TouchInterceptionFrameLayout) this.f73650Q0.findViewById(AbstractC6918a0.attend_content);
        this.f73647O1 = this.f73650Q0.findViewById(AbstractC6918a0.layout_attend_confirm);
        RobotoTextView robotoTextView2 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.attend_going_text);
        this.f73649P1 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        RobotoTextView robotoTextView3 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.attend_decline_text);
        this.f73651Q1 = robotoTextView3;
        robotoTextView3.setOnClickListener(this);
        this.f73665X1 = this.f73650Q0.findViewById(AbstractC6918a0.layout_attend_confirm_loading);
        this.f73653R1 = this.f73650Q0.findViewById(AbstractC6918a0.layout_attend_confirm_text);
        this.f73655S1 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.attend_confirm_status_tv);
        RobotoTextView robotoTextView4 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.change_attend_tv);
        this.f73657T1 = robotoTextView4;
        robotoTextView4.setOnClickListener(this);
        View findViewById3 = this.f73650Q0.findViewById(AbstractC6918a0.goto_chat_csc_wrapper);
        this.f73641I1 = findViewById3;
        findViewById3.setOnClickListener(this);
        this.f73643K1 = (ImageView) this.f73650Q0.findViewById(AbstractC6918a0.goto_chat_csc_icon);
        this.f73642J1 = (RobotoTextView) this.f73650Q0.findViewById(AbstractC6918a0.name_text_in_open_csc);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f73707s2;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupEventDetailView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 2) {
            if (i11 == 3 && intent != null && intent.hasExtra("isRefreshView") && intent.getBooleanExtra("isRefreshView", false)) {
                m80069NM();
                return;
            }
            return;
        }
        if (i12 == -1 && intent != null && intent.hasExtra("STR_EXTRA_JSON_EVENT_DETAIL")) {
            try {
                C19411c c19411c = new C19411c(new JSONObject(intent.getStringExtra("STR_EXTRA_JSON_EVENT_DETAIL")));
                this.f73675c2 = c19411c;
                this.f73673b2 = c19411c.f96262b;
                m80079wN(false, 0);
                m80059CM();
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InviteContactProfile inviteContactProfile;
        String str;
        C19411c c19411c;
        C19411c.a aVar;
        C19411c.a.b bVar;
        C19409a c19409a;
        C19409a c19409a2;
        C19409a c19409a3;
        int id2 = view.getId();
        if (id2 != AbstractC6918a0.iv_creator_avt && id2 != AbstractC6918a0.tv_creator_name) {
            if (id2 == AbstractC6918a0.tv_creator) {
                C19411c c19411c2 = this.f73675c2;
                if (c19411c2 != null && c19411c2.f96275o != null) {
                    AbstractC23647d.m123897g("77707002");
                    AbstractC23211s7.m119561A(this.f73675c2.f96275o.f42434r, C32002l4.m154264g(36), this.f72421L0.m92662fJ());
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.location_container) {
                C19411c c19411c3 = this.f73675c2;
                if (c19411c3 != null && c19411c3.f96284x != null) {
                    AbstractC23647d.m123897g("77707000");
                    Context context = this.f72421L0.getContext();
                    C19418j c19418j = this.f73675c2.f96284x;
                    AbstractC23152n3.m119042f0(context, c19418j.f96342d, c19418j.m153170b(), this.f73675c2.f96284x.m153169a());
                    return;
                }
                return;
            }
            boolean z11 = false;
            if (id2 == AbstractC6918a0.reminder_jump_msg_wrapper) {
                try {
                    if (this.f73697n2) {
                        return;
                    }
                    this.f73697n2 = true;
                    final C19411c.a.e eVar = this.f73675c2.f96281u.f96289c;
                    if (TextUtils.isEmpty(this.f73667Y1)) {
                        if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                            str = eVar.f96310e;
                        } else {
                            str = eVar.f96308c;
                        }
                    } else if (this.f73667Y1.startsWith("group_")) {
                        str = this.f73667Y1;
                    } else {
                        str = "group_" + this.f73667Y1;
                    }
                    AbstractC19646n0.m103042x(new Runnable() { // from class: com.zing.zalo.ui.zviews.xi
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupEventDetailView.this.m80020bN(eVar);
                        }
                    }, new Runnable() { // from class: com.zing.zalo.ui.zviews.yi
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupEventDetailView.this.m80021cN();
                        }
                    }, eVar.f96306a, str);
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    this.f73697n2 = false;
                    return;
                }
            }
            if (id2 == AbstractC6918a0.goto_chat_csc_wrapper) {
                m80071QM();
                return;
            }
            if (id2 == AbstractC6918a0.shortcut_calendar) {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 50331648);
                bundle.putString("extra_group_id", this.f73667Y1);
                C31973j5 c31973j5 = this.f73669Z1;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    z11 = true;
                }
                bundle.putBoolean("EXTRA_IS_COMMUNITY", z11);
                m92662fJ().m93069k2(GroupCalendarView.class, bundle, 1, true);
                return;
            }
            if (id2 == AbstractC6918a0.attend_going_text) {
                C19411c c19411c4 = this.f73675c2;
                if (c19411c4 != null && (c19409a3 = c19411c4.f96285y) != null && c19409a3.f96250b != 1) {
                    m80058BN(1, false);
                    m80064HM(this.f73675c2.f96261a, 1);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.attend_decline_text) {
                C19411c c19411c5 = this.f73675c2;
                if (c19411c5 != null && (c19409a2 = c19411c5.f96285y) != null && c19409a2.f96250b != 2) {
                    m80058BN(2, false);
                    m80064HM(this.f73675c2.f96261a, 2);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.change_attend_tv) {
                C19411c c19411c6 = this.f73675c2;
                if (c19411c6 != null && (c19409a = c19411c6.f96285y) != null) {
                    m80080xN(c19409a.f96250b);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.footer_action_btn && (c19411c = this.f73675c2) != null && (aVar = c19411c.f96281u) != null && (bVar = aVar.f96291e) != null) {
                AbstractC28207v1.m141989h3(bVar.f96298a, 4, m92676n2(), this, this.f73675c2.f96281u.f96291e.f96299b, null, "", new C14339i(), null);
                return;
            }
            return;
        }
        C19411c c19411c7 = this.f73675c2;
        if (c19411c7 != null && (inviteContactProfile = c19411c7.f96275o) != null) {
            AbstractC23211s7.m119562B(inviteContactProfile.f42434r, this.f72421L0.m92662fJ(), this.f73667Y1, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f73707s2;
        if (c13306b != null) {
            c13306b.m74710v();
            this.f73707s2.m74699e("tip.event.detail.oa");
            this.f73707s2.m74699e("tip.event.detail.oa.in.group");
        }
    }

    /* renamed from: pN */
    void m80076pN() {
        int i11;
        Bundle bundle = new Bundle();
        if (this.f73675c2.f96279s == 3) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", i11);
        bundle.putString("STR_EXTRA_JSON_EVENT_DETAIL", this.f73675c2.mo101533h().toString());
        this.f72421L0.m92662fJ().m93066i2(GroupReminderComposeView.class, bundle, 2, 1, true);
    }

    /* renamed from: qN */
    void m80077qN() {
        try {
            RobotoTextView robotoTextView = this.f73713w1;
            if (robotoTextView == null) {
                return;
            }
            String charSequence = robotoTextView.getText().toString();
            int m119758v = AbstractC23244v8.m119758v(charSequence, System.getProperty("line.separator"));
            if (charSequence.length() <= 70 && m119758v <= 2) {
                robotoTextView.setTextSize(1, 22.0f);
            }
            robotoTextView.setTextSize(1, 16.0f);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: sN */
    void m80078sN(boolean z11) {
        C19411c.a aVar;
        C19411c.a.e eVar;
        List<C7907e.a> list;
        String substring;
        try {
            String str = this.f73675c2.f96286z;
            if (str != null && this.f73713w1 != null) {
                this.f73693l2 = z11;
                String m119760x = AbstractC23244v8.m119760x(str);
                if (!z11 && !TextUtils.isEmpty(m119760x)) {
                    str = m119760x;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(str));
                try {
                    C31944h6.m153538d(spannableStringBuilder, 15, C31884d6.m153209a());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C19411c c19411c = this.f73675c2;
                if (c19411c != null && (aVar = c19411c.f96281u) != null && (eVar = aVar.f96289c) != null && (list = eVar.f96313h) != null) {
                    C31884d6 m153209a = C31884d6.m153209a();
                    for (C7907e.a aVar2 : list) {
                        if (TextUtils.isEmpty(aVar2.f42796f)) {
                            substring = "";
                        } else {
                            substring = aVar2.f42796f.substring(1);
                        }
                        String str2 = substring;
                        String valueOf = String.valueOf(aVar2.m40866d());
                        int i11 = aVar2.f42795e;
                        C31944h6.m153541g(5, valueOf, i11, i11 + aVar2.f42794d, spannableStringBuilder, str2, m153209a.f146459e);
                    }
                }
                if (!z11 && !TextUtils.isEmpty(m119760x)) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) m118743r0);
                    spannableStringBuilder.setSpan(new C14337g(), length, spannableStringBuilder.length(), 33);
                }
                this.f73713w1.setText(spannableStringBuilder);
                this.f73713w1.setMovementMethod(this.f73677d2);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: wN */
    void m80079wN(final boolean z11, final int i11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.si
            @Override // java.lang.Runnable
            public final void run() {
                GroupEventDetailView.this.m80030iN(z11, i11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 27) {
                if (i11 == 6020) {
                    if (this.f73675c2 != null && objArr != null && objArr.length >= 1 && ((Integer) objArr[0]).intValue() == m80013OM()) {
                        m80011EM();
                    }
                }
            } else if (objArr != null) {
                if (objArr.length >= 3) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                    boolean contains = arrayList.contains(CoreUtility.f89233i);
                    if (this.f73667Y1.equals(str) && !arrayList.isEmpty() && intValue == 4 && contains) {
                        finish();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f73667Y1 = m92642L3.getString("extra_group_id");
            this.f73669Z1 = C0943w.m4462l().m4472f(this.f73667Y1);
            this.f73671a2 = m92642L3.getString("extra_event_id");
            this.f73673b2 = m92642L3.getLong("LONG_EXTRA_EVENT_START_TIME", Long.MIN_VALUE);
            this.f73681f2 = m92642L3.getBoolean("extra_shortcut_csc", false);
            this.f73679e2 = m92642L3.getBoolean("extra_shortcut_calendar", false);
            this.f73687i2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            m80069NM();
        }
        C13306b c13306b = new C13306b(this.f72421L0.m92648SI());
        this.f73707s2 = c13306b;
        c13306b.m74687C((ViewGroup) this.f72421L0.m92656bJ());
    }

    /* renamed from: xN */
    void m80080xN(int i11) {
        try {
            m80062FM();
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f73711u2;
            if (attendConfirmBottomPicker == null) {
                this.f73711u2 = AttendConfirmBottomPicker.m78104tL(i11, new AttendConfirmBottomPicker.InterfaceC14036a() { // from class: com.zing.zalo.ui.zviews.ii
                    @Override // com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker.InterfaceC14036a
                    /* renamed from: g */
                    public final void mo78111g(int i12) {
                        GroupEventDetailView.this.m80032jN(i12);
                    }
                });
            } else {
                attendConfirmBottomPicker.m78105EG(false, false);
                this.f73711u2.m78110vL(i11, false);
            }
            this.f72421L0.m92649TI().m93060e2(0, this.f73711u2, "ListViewBottomPicker", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yN */
    void m80081yN() {
        String str;
        m80063GM();
        AbstractC2379w.m12430d(this.f73650Q0);
        if (this.f73701p2 == null) {
            C19411c c19411c = this.f73675c2;
            if (c19411c != null && c19411c.f96285y != null && !TextUtils.isEmpty(this.f73667Y1)) {
                C19411c c19411c2 = this.f73675c2;
                String str2 = c19411c2.f96261a;
                String str3 = this.f73667Y1;
                InviteContactProfile inviteContactProfile = c19411c2.f96275o;
                if (inviteContactProfile != null) {
                    str = inviteContactProfile.f42434r;
                } else {
                    str = "";
                }
                this.f73701p2 = EventAttendeeBottomView.m79476BL(str2, str3, str, new C14342l());
            } else {
                return;
            }
        }
        this.f72421L0.m92649TI().m93060e2(0, this.f73701p2, EventAttendeeBottomView.f73215o1, 0, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 6020);
    }

    /* renamed from: zN */
    void m80082zN() {
        C19409a c19409a;
        try {
            m80073SM();
            C19411c c19411c = this.f73675c2;
            if (c19411c != null && (c19409a = c19411c.f96285y) != null && c19409a.f96251c != null && c19409a.f96249a) {
                int i11 = c19409a.f96250b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            this.f73647O1.setVisibility(8);
                            this.f73653R1.setVisibility(0);
                            this.f73655S1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_decline_new));
                        }
                    } else {
                        this.f73647O1.setVisibility(8);
                        this.f73653R1.setVisibility(0);
                        this.f73655S1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_accept_new));
                    }
                } else {
                    this.f73647O1.setVisibility(0);
                    this.f73653R1.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
