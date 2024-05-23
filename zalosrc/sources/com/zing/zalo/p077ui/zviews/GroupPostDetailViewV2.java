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
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker;
import com.zing.zalo.p077ui.zviews.GroupPostDetailViewV2;
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
import ge.C19409a;
import ge.C19417i;
import ge.C19425q;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
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
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p495rx.C25994h;
import p495rx.C26000n;
import p588vw.C28652r;
import p716zh.C31862c;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C32002l4;
import vg.AbstractC28207v1;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class GroupPostDetailViewV2 extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {

    /* renamed from: c2 */
    static int f74089c2 = AbstractC23136l9.m118742r(37.0f);

    /* renamed from: A1 */
    private FrameLayout f74090A1;

    /* renamed from: B1 */
    View f74091B1;

    /* renamed from: C1 */
    C23528a f74092C1;

    /* renamed from: D1 */
    String f74093D1;

    /* renamed from: E1 */
    String f74094E1;

    /* renamed from: F1 */
    C7904b f74095F1;

    /* renamed from: I1 */
    boolean f74098I1;

    /* renamed from: P0 */
    Context f74105P0;

    /* renamed from: Q0 */
    View f74107Q0;

    /* renamed from: R0 */
    View f74109R0;

    /* renamed from: R1 */
    long f74110R1;

    /* renamed from: S0 */
    MultiStateView f74111S0;

    /* renamed from: T0 */
    View f74113T0;

    /* renamed from: U0 */
    View f74115U0;

    /* renamed from: V0 */
    View f74117V0;

    /* renamed from: V1 */
    String f74118V1;

    /* renamed from: W0 */
    RecyclingImageView f74119W0;

    /* renamed from: X0 */
    TextView f74121X0;

    /* renamed from: Y0 */
    TextView f74123Y0;

    /* renamed from: Z0 */
    TextView f74125Z0;

    /* renamed from: Z1 */
    EventAttendeeBottomView f74126Z1;

    /* renamed from: a1 */
    TextView f74127a1;

    /* renamed from: b1 */
    TextView f74129b1;

    /* renamed from: b2 */
    AttendConfirmBottomPicker f74130b2;

    /* renamed from: c1 */
    TextView f74131c1;

    /* renamed from: d1 */
    View f74132d1;

    /* renamed from: e1 */
    RobotoTextView f74133e1;

    /* renamed from: f1 */
    RobotoTextView f74134f1;

    /* renamed from: g1 */
    View f74135g1;

    /* renamed from: h1 */
    RobotoTextView f74136h1;

    /* renamed from: i1 */
    View f74137i1;

    /* renamed from: j1 */
    RobotoTextView f74138j1;

    /* renamed from: k1 */
    View f74139k1;

    /* renamed from: l1 */
    RobotoTextView f74140l1;

    /* renamed from: m1 */
    TouchInterceptionFrameLayout f74141m1;

    /* renamed from: n1 */
    View f74142n1;

    /* renamed from: o1 */
    RobotoTextView f74143o1;

    /* renamed from: p1 */
    RobotoTextView f74144p1;

    /* renamed from: q1 */
    View f74145q1;

    /* renamed from: r1 */
    RobotoTextView f74146r1;

    /* renamed from: s1 */
    RobotoTextView f74147s1;

    /* renamed from: t1 */
    View f74148t1;

    /* renamed from: u1 */
    TextView f74149u1;

    /* renamed from: v1 */
    TextView f74150v1;

    /* renamed from: w1 */
    RecyclingImageView f74151w1;

    /* renamed from: x1 */
    ImageView f74152x1;

    /* renamed from: y1 */
    View f74153y1;

    /* renamed from: z1 */
    RobotoTextView f74154z1;

    /* renamed from: G1 */
    boolean f74096G1 = false;

    /* renamed from: H1 */
    boolean f74097H1 = false;

    /* renamed from: J1 */
    boolean f74099J1 = false;

    /* renamed from: K1 */
    int f74100K1 = 0;

    /* renamed from: L1 */
    String f74101L1 = "";

    /* renamed from: M1 */
    String f74102M1 = "";

    /* renamed from: N1 */
    Calendar f74103N1 = Calendar.getInstance();

    /* renamed from: O1 */
    final List f74104O1 = new ArrayList();

    /* renamed from: P1 */
    C20500d f74106P1 = new C20500d(true);

    /* renamed from: Q1 */
    long f74108Q1 = -1;

    /* renamed from: S1 */
    int f74112S1 = 0;

    /* renamed from: T1 */
    boolean f74114T1 = false;

    /* renamed from: U1 */
    boolean f74116U1 = false;

    /* renamed from: W1 */
    boolean f74120W1 = false;

    /* renamed from: X1 */
    boolean f74122X1 = false;

    /* renamed from: Y1 */
    boolean f74124Y1 = false;

    /* renamed from: a2 */
    boolean f74128a2 = false;

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$a */
    /* loaded from: classes6.dex */
    public class C14424a implements EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b {
        C14424a() {
        }

        /* renamed from: f */
        public /* synthetic */ void m80572f(Bundle bundle, JSONObject jSONObject) {
            if (!GroupPostDetailViewV2.this.f74128a2) {
                return;
            }
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 11);
            bundle.putString("extra_preload_data", jSONObject.toString());
            bundle.putString("extra_group_id", GroupPostDetailViewV2.this.f74093D1);
            GroupPostDetailViewV2.this.f72421L0.m92676n2().mo35579p().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
            GroupPostDetailViewV2.this.f72421L0.mo49315c4();
        }

        /* renamed from: g */
        public /* synthetic */ void m80573g(ArrayList arrayList, ArrayList arrayList2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c((String) it.next());
                if (m141809c != null && !m141809c.f42434r.equals(CoreUtility.f89233i)) {
                    arrayList2.add(m141809c);
                }
            }
            AbstractC23184q2.m119449g(1, GroupPostDetailViewV2.this.f74093D1, 0, arrayList2);
            GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
            AbstractC23211s7.m119575h(groupPostDetailViewV2.f74093D1, groupPostDetailViewV2.f72421L0.m92676n2(), true);
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: a */
        public void mo35592a(ContactProfile contactProfile) {
            try {
                AbstractC23211s7.m119562B(contactProfile.f42434r, GroupPostDetailViewV2.this.f72421L0.m92662fJ(), GroupPostDetailViewV2.this.f74093D1, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: b */
        public void mo35593b() {
            GroupPostDetailViewV2.this.f72421L0.mo46829Y();
            GroupPostDetailViewV2.this.f74128a2 = true;
            Bundle bundle = new Bundle();
            GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
            ArrayList arrayList = groupPostDetailViewV2.f74126Z1.f73222a1;
            JSONObject m80555IM = groupPostDetailViewV2.m80555IM();
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
                AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.eo

                    /* renamed from: q */
                    public final /* synthetic */ Bundle f80261q;

                    /* renamed from: r */
                    public final /* synthetic */ JSONObject f80262r;

                    public /* synthetic */ RunnableC15595eo(Bundle bundle2, JSONObject m80555IM2) {
                        r2 = bundle2;
                        r3 = m80555IM2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupPostDetailViewV2.C14424a.this.m80572f(r2, r3);
                    }
                });
                return;
            }
            if (!GroupPostDetailViewV2.this.f74128a2) {
                return;
            }
            bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 11);
            bundle2.putString("extra_preload_data", m80555IM2.toString());
            bundle2.putString("extra_group_id", GroupPostDetailViewV2.this.f74093D1);
            GroupPostDetailViewV2.this.f72421L0.m92676n2().mo35579p().m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
            GroupPostDetailViewV2.this.f72421L0.mo49315c4();
        }

        @Override // com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b
        /* renamed from: c */
        public void mo35594c(ArrayList arrayList) {
            if (arrayList != null && arrayList.size() <= 5) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c != null) {
                        if (!m141809c.f42434r.equals(CoreUtility.f89233i)) {
                            arrayList2.add(m141809c);
                        }
                    } else {
                        arrayList3.add(str);
                    }
                }
                if (arrayList3.size() > 0) {
                    AbstractC23184q2.m119463u(arrayList3, new Runnable() { // from class: com.zing.zalo.ui.zviews.fo

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f80380q;

                        /* renamed from: r */
                        public final /* synthetic */ ArrayList f80381r;

                        public /* synthetic */ RunnableC15632fo(ArrayList arrayList32, ArrayList arrayList22) {
                            r2 = arrayList32;
                            r3 = arrayList22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupPostDetailViewV2.C14424a.this.m80573g(r2, r3);
                        }
                    });
                    return;
                }
                AbstractC23184q2.m119449g(1, GroupPostDetailViewV2.this.f74093D1, 0, arrayList22);
                GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
                AbstractC23211s7.m119575h(groupPostDetailViewV2.f74093D1, groupPostDetailViewV2.f72421L0.m92676n2(), true);
                return;
            }
            AbstractC23184q2.m119449g(1, GroupPostDetailViewV2.this.f74093D1, 1, null);
            GroupPostDetailViewV2 groupPostDetailViewV22 = GroupPostDetailViewV2.this;
            AbstractC23211s7.m119575h(groupPostDetailViewV22.f74093D1, groupPostDetailViewV22.f72421L0.m92676n2(), true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$b */
    /* loaded from: classes6.dex */
    public class C14425b extends AnimatorListenerAdapter {
        C14425b() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$c */
    /* loaded from: classes6.dex */
    class C14426c extends C20500d.a {
        C14426c() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: a */
        public void mo80103a(String str) {
            AbstractC23211s7.m119561A(str, C32002l4.m154264g(38), GroupPostDetailViewV2.this.m92662fJ());
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            AbstractC23184q2.m119465w(str, GroupPostDetailViewV2.this.f72421L0.getContext(), GroupPostDetailViewV2.this.f72421L0.m92676n2());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$d */
    /* loaded from: classes6.dex */
    public class C14427d implements InterfaceC13567b1.a {
        C14427d() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            GroupPostDetailViewV2.this.m80524kN(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$e */
    /* loaded from: classes6.dex */
    public class C14428e implements InterfaceC20094a {
        C14428e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m80575d() {
            GroupPostDetailViewV2.this.m80550DN();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
            groupPostDetailViewV2.f74122X1 = false;
            groupPostDetailViewV2.m80568yN(false, c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            C31988k5 m132058d;
            String str;
            C7904b.a aVar;
            C19409a c19409a;
            GroupPostDetailViewV2.this.f74122X1 = false;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    GroupPostDetailViewV2.this.f74095F1 = new C7904b(optJSONObject, "group_" + GroupPostDetailViewV2.this.f74093D1);
                    GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
                    if (groupPostDetailViewV2.f74095F1.f42732d > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    groupPostDetailViewV2.f74098I1 = z11;
                    if (z11) {
                        m132058d = C25490c.m132054j().m132057c(GroupPostDetailViewV2.this.f74095F1);
                        GroupPostDetailViewV2.this.m80496EM();
                    } else {
                        m132058d = C25490c.m132054j().m132058d(GroupPostDetailViewV2.this.f74095F1);
                    }
                    GroupPostDetailViewV2.this.f74094E1 = m132058d.m154218b();
                    GroupPostDetailViewV2.this.m80557LM();
                    GroupPostDetailViewV2.this.m80568yN(false, 0);
                    GroupPostDetailViewV2.this.m80548CM();
                    GroupPostDetailViewV2 groupPostDetailViewV22 = GroupPostDetailViewV2.this;
                    C7904b c7904b = groupPostDetailViewV22.f74095F1;
                    if (c7904b != null && (aVar = c7904b.f42724L) != null && (c19409a = aVar.f42755a) != null && c19409a.f96251c != null && c19409a.f96249a) {
                        groupPostDetailViewV22.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.go
                            public /* synthetic */ RunnableC15669go() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupPostDetailViewV2.C14428e.this.m80575d();
                            }
                        }, 300L);
                    }
                    if (!GroupPostDetailViewV2.this.f74116U1) {
                        GroupPostDetailViewV2 groupPostDetailViewV23 = GroupPostDetailViewV2.this;
                        String str2 = groupPostDetailViewV23.f74118V1;
                        if (groupPostDetailViewV23.f74098I1) {
                            str = "calendar_reminder_detail";
                        } else {
                            str = "gr_note_detail";
                        }
                        C0815e1.m2075D().m2100V(new C23648e(3, str2, 1, str, "2"), false);
                        GroupPostDetailViewV2.this.f74116U1 = true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                GroupPostDetailViewV2.this.m80568yN(false, -1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$f */
    /* loaded from: classes6.dex */
    public class C14429f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C26000n f74160a;

        C14429f(C26000n c26000n) {
            this.f74160a = c26000n;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                this.f74160a.m133960l();
                ToastUtils.showMess(c20096c.m104492d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19646n0.m103000l2();
                GroupPostDetailViewV2.this.m80551EN();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$g */
    /* loaded from: classes6.dex */
    public class C14430g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31988k5 f74162a;

        C14430g(C31988k5 c31988k5) {
            this.f74162a = c31988k5;
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
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C23744a.m124114c().m124116d(67, this.f74162a.m154218b());
                C25490c.m132054j().m132063k(GroupPostDetailViewV2.this.f74093D1, this.f74162a.m154218b());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$h */
    /* loaded from: classes6.dex */
    public class C14431h implements InterfaceC20094a {
        C14431h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 17064) {
                        C25994h.f124017a.m133919h("group_" + GroupPostDetailViewV2.this.f74093D1).m133960l();
                    }
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    GroupPostDetailViewV2.this.f74095F1 = new C7904b(optJSONObject, "group_" + GroupPostDetailViewV2.this.f74093D1);
                    C0943w.m4462l().m4472f(GroupPostDetailViewV2.this.f74093D1);
                    AbstractC23184q2.m119438C(GroupPostDetailViewV2.this.f74093D1);
                    GroupPostDetailViewV2.this.m80551EN();
                    AbstractC19646n0.m102996k2();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$i */
    /* loaded from: classes6.dex */
    public class C14432i extends ClickableSpan {
        C14432i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            GroupPostDetailViewV2 groupPostDetailViewV2 = GroupPostDetailViewV2.this;
            groupPostDetailViewV2.f74099J1 = true;
            groupPostDetailViewV2.m80567tN(true);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupPostDetailViewV2.this.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$j */
    /* loaded from: classes6.dex */
    public class C14433j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C7904b f74166a;

        C14433j(C7904b c7904b) {
            this.f74166a = c7904b;
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
            GroupPostDetailViewV2.this.f72421L0.mo49315c4();
            GroupPostDetailViewV2.this.f74124Y1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                new JSONObject().put("topicId", this.f74166a.f42715C);
                if (this.f74166a.f42732d > 0) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_send_time_reminder_to_group_chat));
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_send_notice_to_group_chat));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupPostDetailViewV2.this.f72421L0.mo49315c4();
            GroupPostDetailViewV2.this.f74124Y1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostDetailViewV2$k */
    /* loaded from: classes6.dex */
    public class C14434k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f74168a;

        /* renamed from: b */
        final /* synthetic */ String f74169b;

        C14434k(int i11, String str) {
            this.f74168a = i11;
            this.f74169b = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m80578e() {
            GroupPostDetailViewV2.this.m80547BN();
            GroupPostDetailViewV2.this.m80552FM();
        }

        /* renamed from: f */
        public /* synthetic */ void m80579f() {
            GroupPostDetailViewV2.this.m80547BN();
            GroupPostDetailViewV2.this.m80552FM();
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
            C18408p.m97474Q().f92822a.remove(this.f74169b);
            GroupPostDetailViewV2.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.io
                public /* synthetic */ RunnableC15743io() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostDetailViewV2.C14434k.this.m80579f();
                }
            });
            GroupPostDetailViewV2.this.f74124Y1 = false;
            C23744a.m124114c().m124116d(66, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C7904b c7904b;
            C7904b.a aVar;
            C19409a c19409a;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (c7904b = GroupPostDetailViewV2.this.f74095F1) != null && (aVar = c7904b.f42724L) != null && (c19409a = aVar.f42755a) != null) {
                    c19409a.f96250b = this.f74168a;
                    JSONArray optJSONArray = optJSONObject.optJSONArray("responseInfo");
                    if (optJSONArray != null) {
                        GroupPostDetailViewV2.this.f74095F1.f42724L.f42755a.f96251c = new ArrayList();
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                GroupPostDetailViewV2.this.f74095F1.f42724L.f42755a.f96251c.add(new C19417i(optJSONObject2));
                            }
                        }
                        C25490c.m132054j().m132057c(GroupPostDetailViewV2.this.f74095F1);
                        GroupPostDetailViewV2.this.m80548CM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C18408p.m97474Q().f92822a.remove(this.f74169b);
            GroupPostDetailViewV2.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ho
                public /* synthetic */ RunnableC15706ho() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostDetailViewV2.C14434k.this.m80578e();
                }
            });
            GroupPostDetailViewV2.this.f74124Y1 = false;
            C23744a.m124114c().m124116d(66, new Object[0]);
        }
    }

    /* renamed from: DM */
    private boolean m80495DM(C7904b c7904b) {
        if (C25994h.f124017a.m133919h("group_" + this.f74093D1).m133973z()) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.rn

                /* renamed from: q */
                public final /* synthetic */ C7904b f81833q;

                public /* synthetic */ RunnableC16099rn(C7904b c7904b2) {
                    r2 = c7904b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostDetailViewV2.this.m80500RM(r2);
                }
            });
            return false;
        }
        return true;
    }

    /* renamed from: EM */
    public void m80496EM() {
        C18434b.m97679l().m97685n(22, this.f74093D1, null, new C18434b.e() { // from class: com.zing.zalo.ui.zviews.yn
            public /* synthetic */ C16382yn() {
            }

            @Override // p131ei.C18434b.e
            /* renamed from: a */
            public final void mo64321a(int i11, C31862c c31862c) {
                GroupPostDetailViewV2.this.m80502TM(i11, c31862c);
            }
        });
    }

    /* renamed from: KM */
    private void m80497KM() {
        String str = "group_" + this.f74093D1;
        C26000n m133919h = C25994h.f124017a.m133919h(str);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14429f(m133919h));
        if (AbstractC25495a.m132079d(str)) {
            String str2 = this.f74093D1;
            C7904b c7904b = this.f74095F1;
            c0766k.mo1551U9(str2, c7904b.f42715C, c7904b.f42729a);
        } else {
            long m133961m = m133919h.m133961m();
            C7904b c7904b2 = this.f74095F1;
            c0766k.mo1694n6(str, m133961m, c7904b2.f42715C, c7904b2.f42729a);
        }
    }

    /* renamed from: PM */
    private boolean m80498PM(C7904b c7904b) {
        return C25994h.f124017a.m133919h("group_" + this.f74093D1).m133971x(c7904b);
    }

    /* renamed from: QM */
    public /* synthetic */ void m80499QM() {
        C7904b c7904b;
        C19409a c19409a;
        String format;
        String str;
        String m119191F;
        try {
            if (this.f74095F1 == null) {
                return;
            }
            m80551EN();
            int i11 = 8;
            if (this.f74095F1.f42719G != null) {
                this.f74117V0.setVisibility(0);
                this.f74121X0.setText(this.f74095F1.f42719G.m40485u1());
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f74095F1.f42719G.f42434r);
                if (m141809c != null && !TextUtils.isEmpty(m141809c.f42446v)) {
                    AbstractC23268y2.m120028b(this.f74092C1, this.f74119W0, m141809c, C23278z2.m120143n(), false);
                } else {
                    AbstractC23268y2.m120031e(this.f74092C1, this.f74119W0, this.f74095F1.f42719G.f42446v, C23278z2.m120143n());
                }
                this.f74123Y0.setText(AbstractC23160o0.m119181A(this.f74095F1.f42717E));
            } else {
                this.f74117V0.setVisibility(8);
            }
            if (this.f74098I1) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74093D1);
                if ((m4472f != null && m4472f.m153742T()) || ((c7904b = this.f74095F1) != null && c7904b.m40777o())) {
                    m80537uN(true);
                } else {
                    m80537uN(false);
                }
                if (!TextUtils.isEmpty(this.f74095F1.m40770h())) {
                    m80567tN(this.f74099J1);
                } else {
                    this.f74129b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder));
                }
                this.f74127a1.setText(this.f74095F1.f42731c);
                m80564pN();
                this.f74132d1.setVisibility(0);
                long j11 = this.f74108Q1;
                if (j11 <= 0) {
                    j11 = this.f74095F1.f42732d;
                }
                C7904b c7904b2 = this.f74095F1;
                if (c7904b2.f42735g == 1) {
                    this.f74103N1.setTimeInMillis(j11);
                    this.f74100K1 = 1;
                    RobotoTextView robotoTextView = this.f74133e1;
                    if (this.f74095F1.f42725M == 0) {
                        m119191F = AbstractC23160o0.m119213Q(j11, true);
                    } else {
                        m119191F = AbstractC23160o0.m119191F(this.f74103N1, true, true);
                    }
                    robotoTextView.setText(m119191F);
                    this.f74134f1.setVisibility(0);
                    this.f74134f1.setText("(" + AbstractC23160o0.m119199J(this.f74103N1, true, false, false) + ")");
                } else {
                    this.f74100K1 = 0;
                    if (c7904b2.f42725M == 0) {
                        this.f74133e1.setText(AbstractC23160o0.m119213Q(j11, true));
                    } else {
                        this.f74103N1.setTimeInMillis(j11);
                        this.f74133e1.setText(AbstractC23160o0.m119191F(this.f74103N1, true, true));
                    }
                    this.f74134f1.setVisibility(8);
                }
                if (!TextUtils.isEmpty(this.f74095F1.f42734f)) {
                    C7904b c7904b3 = this.f74095F1;
                    C19425q c19425q = new C19425q(c7904b3.f42734f, c7904b3.f42735g);
                    if (c19425q.f96376a != null) {
                        this.f74135g1.setVisibility(0);
                        this.f74136h1.setText(c19425q.f96376a.m101571c());
                    } else {
                        this.f74135g1.setVisibility(8);
                    }
                } else {
                    this.f74135g1.setVisibility(8);
                }
                String str2 = "";
                if (this.f74095F1.f42747s != null) {
                    this.f74114T1 = true;
                    this.f74137i1.setVisibility(0);
                    if (m4472f == null) {
                        str = "";
                    } else {
                        str = m4472f.m153793y();
                    }
                    if (!TextUtils.isEmpty(this.f74095F1.f42750v)) {
                        this.f74138j1.setVisibility(0);
                        if (CoreUtility.f89233i.equals(this.f74095F1.f42750v)) {
                            this.f74138j1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_you_to_group, str));
                        } else {
                            C7904b c7904b4 = this.f74095F1;
                            this.f74138j1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_message_from_sb_to_group, AbstractC21935u.m114542i(c7904b4.f42750v, c7904b4.f42751w), str));
                        }
                    } else {
                        this.f74138j1.setVisibility(8);
                    }
                } else {
                    this.f74137i1.setVisibility(8);
                }
                C7904b.a aVar = this.f74095F1.f42724L;
                if (aVar != null && (c19409a = aVar.f42755a) != null && c19409a.f96251c != null && c19409a.f96249a) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < this.f74095F1.f42724L.f42755a.f96251c.size(); i14++) {
                        C19417i c19417i = (C19417i) this.f74095F1.f42724L.f42755a.f96251c.get(i14);
                        int i15 = c19417i.f96338a;
                        if (i15 != 1) {
                            if (i15 == 2) {
                                i13 = c19417i.f96339b;
                            }
                        } else {
                            i12 = c19417i.f96339b;
                        }
                    }
                    this.f74139k1.setVisibility(0);
                    if (i12 == 0 && i13 == 0) {
                        format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_blank_no_response_text);
                    } else if (i12 == 0) {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_decline_text), Integer.valueOf(i13));
                    } else if (i13 == 0) {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_going_text), Integer.valueOf(i12));
                    } else {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_list_text), Integer.valueOf(i12), Integer.valueOf(i13));
                    }
                    this.f74140l1.setText(format);
                    m80547BN();
                } else {
                    this.f74139k1.setVisibility(8);
                    m80559NM();
                }
                View view = this.f74153y1;
                if (this.f74097H1 && !this.f74114T1) {
                    i11 = 0;
                }
                view.setVisibility(i11);
                if (m87077NK() != null) {
                    str2 = m87077NK().getMiddleSubtitle();
                }
                this.f74154z1.setText(str2);
                return;
            }
            m80537uN(false);
            if (!TextUtils.isEmpty(this.f74095F1.m40770h())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(this.f74095F1.m40770h()));
                if (C31944h6.m153544j(spannableStringBuilder)) {
                    try {
                        C31944h6.m153538d(spannableStringBuilder, 7, C31884d6.m153209a());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                this.f74131c1.setText(spannableStringBuilder);
                this.f74131c1.setMovementMethod(this.f74106P1);
            } else {
                this.f74131c1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_post));
            }
            m80564pN();
            this.f74152x1.setVisibility(4);
            if (this.f74095F1.f42729a == 1) {
                this.f74148t1.setVisibility(0);
                AbstractC23268y2.m120031e(this.f74092C1, this.f74151w1, this.f74095F1.m40766d(), C23278z2.m120083M0());
                this.f74149u1.setText(this.f74095F1.m40768f());
                this.f74150v1.setText(this.f74095F1.f42739k);
                C7904b c7904b5 = this.f74095F1;
                this.f74102M1 = c7904b5.f42738j;
                if (c7904b5.f42742n != 0) {
                    this.f74152x1.setVisibility(0);
                    return;
                }
                return;
            }
            this.f74148t1.setVisibility(8);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: SM */
    public /* synthetic */ void m80501SM(C31862c c31862c) {
        ViewStub viewStub;
        if (c31862c != null) {
            try {
                if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a()) {
                    if (this.f74090A1 == null && (viewStub = (ViewStub) this.f74107Q0.findViewById(AbstractC6918a0.vs_quick_action_view)) != null) {
                        this.f74090A1 = (FrameLayout) viewStub.inflate();
                    }
                    FrameLayout frameLayout = this.f74090A1;
                    if (frameLayout != null) {
                        if (frameLayout.getVisibility() == 0 && this.f74090A1.getChildCount() > 0 && (this.f74090A1.getChildAt(0) instanceof QuickActionViewLayout)) {
                            QuickActionViewLayout quickActionViewLayout = (QuickActionViewLayout) this.f74090A1.getChildAt(0);
                            if (quickActionViewLayout.getActionItemInfo() != null && quickActionViewLayout.getActionItemInfo().m153159l(c31862c)) {
                                return;
                            }
                        }
                        this.f74090A1.removeAllViews();
                        this.f74090A1.setVisibility(0);
                        QuickActionViewLayout quickActionViewLayout2 = new QuickActionViewLayout(this.f74090A1.getContext(), c31862c.f146309b);
                        quickActionViewLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        quickActionViewLayout2.setId(AbstractC6918a0.view_quick_action_top);
                        this.f74090A1.addView(quickActionViewLayout2);
                        quickActionViewLayout2.m75818b(c31862c, new C14427d());
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        FrameLayout frameLayout2 = this.f74090A1;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            this.f74090A1.setVisibility(8);
        }
    }

    /* renamed from: TM */
    public /* synthetic */ void m80502TM(int i11, C31862c c31862c) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tn

            /* renamed from: q */
            public final /* synthetic */ C31862c f82219q;

            public /* synthetic */ RunnableC16197tn(C31862c c31862c2) {
                r2 = c31862c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80501SM(r2);
            }
        });
    }

    /* renamed from: UM */
    public /* synthetic */ void m80503UM(String str, InterfaceC0765j interfaceC0765j, int i11) {
        C18408p.m97474Q().f92823b.add(str);
        interfaceC0765j.mo1512Pa(Long.parseLong(str), i11, this.f74093D1);
    }

    /* renamed from: VM */
    public /* synthetic */ void m80504VM(View view) {
        m80546AN();
    }

    /* renamed from: WM */
    public /* synthetic */ void m80505WM(View view) {
        AbstractC23184q2.m119465w(this.f74102M1, this.f72421L0.getContext(), this.f72421L0.m92676n2());
    }

    /* renamed from: XM */
    public /* synthetic */ void m80506XM() {
        View view;
        View view2;
        try {
            if (this.f74098I1) {
                if (this.f74113T0 == null && (view2 = this.f74107Q0) != null) {
                    this.f74113T0 = view2.findViewById(AbstractC6918a0.reminder_layout);
                    this.f74127a1 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.icon_topic);
                    this.f74129b1 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.tv_group_topic);
                    this.f74132d1 = this.f74107Q0.findViewById(AbstractC6918a0.reminder_time_wrapper);
                    this.f74133e1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.reminder_time_text);
                    this.f74134f1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.reminder_lunar_time_text);
                    this.f74135g1 = this.f74107Q0.findViewById(AbstractC6918a0.reminder_repeat_wrapper);
                    this.f74136h1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.reminder_repeat_text);
                    View findViewById = this.f74107Q0.findViewById(AbstractC6918a0.reminder_jump_msg_wrapper);
                    this.f74137i1 = findViewById;
                    findViewById.setOnClickListener(this);
                    this.f74138j1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.reminder_jump_msg_subtitle);
                    View findViewById2 = this.f74107Q0.findViewById(AbstractC6918a0.attendee_wrapper);
                    this.f74139k1 = findViewById2;
                    findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.pn
                        public /* synthetic */ ViewOnClickListenerC16025pn() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            GroupPostDetailViewV2.this.m80504VM(view3);
                        }
                    });
                    this.f74140l1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.attendee_text);
                    this.f74141m1 = (TouchInterceptionFrameLayout) this.f74107Q0.findViewById(AbstractC6918a0.attend_content);
                    this.f74142n1 = this.f74107Q0.findViewById(AbstractC6918a0.layout_attend_confirm);
                    RobotoTextView robotoTextView = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.attend_going_text);
                    this.f74143o1 = robotoTextView;
                    robotoTextView.setOnClickListener(this);
                    RobotoTextView robotoTextView2 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.attend_decline_text);
                    this.f74144p1 = robotoTextView2;
                    robotoTextView2.setOnClickListener(this);
                    this.f74091B1 = this.f74107Q0.findViewById(AbstractC6918a0.layout_attend_confirm_loading);
                    this.f74145q1 = this.f74107Q0.findViewById(AbstractC6918a0.layout_attend_confirm_text);
                    this.f74146r1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.attend_confirm_status_tv);
                    RobotoTextView robotoTextView3 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.change_attend_tv);
                    this.f74147s1 = robotoTextView3;
                    robotoTextView3.setOnClickListener(this);
                    View findViewById3 = this.f74107Q0.findViewById(AbstractC6918a0.goto_group_wrapper);
                    this.f74153y1 = findViewById3;
                    findViewById3.setOnClickListener(this);
                    this.f74154z1 = (RobotoTextView) this.f74107Q0.findViewById(AbstractC6918a0.group_name_text_in_open_csc);
                }
                this.f74113T0.setVisibility(0);
                View view3 = this.f74115U0;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                m80543xN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder_detail_title));
                if (this.f74096G1) {
                    this.f74125Z0.setVisibility(0);
                    this.f74125Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_group_calendar));
                    return;
                } else {
                    this.f74125Z0.setVisibility(8);
                    return;
                }
            }
            if (this.f74115U0 == null && (view = this.f74107Q0) != null) {
                this.f74115U0 = view.findViewById(AbstractC6918a0.old_post_layout);
                this.f74131c1 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.old_tv_group_topic);
                View findViewById4 = this.f74107Q0.findViewById(AbstractC6918a0.old_layoutLinkTab);
                this.f74148t1 = findViewById4;
                findViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qn
                    public /* synthetic */ ViewOnClickListenerC16062qn() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        GroupPostDetailViewV2.this.m80505WM(view4);
                    }
                });
                this.f74149u1 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.tvLinkTitle);
                this.f74150v1 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.tvLinkDescription);
                this.f74151w1 = (RecyclingImageView) this.f74107Q0.findViewById(AbstractC6918a0.imvLinkHeader);
                ImageView imageView = (ImageView) this.f74107Q0.findViewById(AbstractC6918a0.link_play_btn);
                this.f74152x1 = imageView;
                imageView.setVisibility(4);
            }
            this.f74115U0.setVisibility(0);
            View view4 = this.f74113T0;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = this.f74142n1;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            m80543xN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_note_detail_title));
            if (this.f74096G1) {
                this.f74125Z0.setVisibility(0);
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74093D1);
                if (m4472f != null && m4472f.m153747Y()) {
                    this.f74125Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_board));
                    return;
                } else {
                    this.f74125Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_board));
                    return;
                }
            }
            this.f74125Z0.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: YM */
    public /* synthetic */ void m80507YM() {
        this.f72421L0.finish();
        AbstractC23211s7.m119579l(this.f74093D1, this.f72421L0.m92676n2(), true, this.f74095F1.f42747s);
    }

    /* renamed from: ZM */
    public /* synthetic */ void m80508ZM() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_not_found));
        this.f74120W1 = false;
    }

    /* renamed from: aN */
    public /* synthetic */ void m80509aN(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
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
            AbstractC23647d.m123897g("1001666");
            m80562mN();
            return;
        }
        if (intValue == AbstractC8020f0.str_pin_to_top_group_chat_v2) {
            AbstractC23647d.m123897g("1001664");
            if (m80498PM(this.f74095F1) || m80495DM(this.f74095F1)) {
                m80563oN();
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_unpin_from_top_of_group_chat_v2) {
            showDialog(4);
            return;
        }
        if (intValue == AbstractC8020f0.str_poll_send_to_group_v2) {
            m80561lN(this.f74095F1);
        } else if (intValue == AbstractC8020f0.str_delete) {
            AbstractC23647d.m123897g("1001615");
            showDialog(3);
        }
    }

    /* renamed from: bN */
    public /* synthetic */ void m80510bN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        if (m80498PM(this.f74095F1) || m80495DM(this.f74095F1)) {
            m80563oN();
        }
    }

    /* renamed from: cN */
    public /* synthetic */ void m80511cN(InterfaceC17463d interfaceC17463d, int i11) {
        m80497KM();
    }

    /* renamed from: dN */
    public /* synthetic */ void m80512dN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m80565qN(C25490c.m132054j().m132062h(this.f74094E1));
        finish();
    }

    /* renamed from: eN */
    public /* synthetic */ void m80513eN() {
        m80566sN(this.f74101L1);
    }

    /* renamed from: fN */
    public /* synthetic */ void m80514fN(View view) {
        m80562mN();
    }

    /* renamed from: gN */
    public /* synthetic */ void m80516gN(View view) {
        AbstractC23647d.m123897g("1001663");
        showDialog(1);
    }

    /* renamed from: hN */
    public /* synthetic */ void m80518hN(boolean z11, int i11) {
        try {
            if (z11) {
                MultiStateView multiStateView = this.f74111S0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f74111S0.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f74109R0.setVisibility(8);
                return;
            }
            if (i11 == 0) {
                this.f74111S0.setVisibility(8);
                this.f74109R0.setVisibility(0);
                return;
            }
            if (i11 != 17034) {
                if (i11 != 50001) {
                    this.f74111S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_topic_error_loading_topic_info));
                    this.f74111S0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                } else {
                    this.f74111S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                    this.f74111S0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                }
            } else {
                this.f74111S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_topic_is_deleted));
                this.f74111S0.setErrorType(MultiStateView.EnumC15915f.DELETED_ERROR);
                this.f74111S0.setErrorImageResource(AbstractC16803z.empty_delete);
                m80539vN(false);
            }
            this.f74111S0.setState(MultiStateView.EnumC15914e.ERROR);
            this.f74111S0.setVisibility(0);
            this.f74109R0.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iN */
    public /* synthetic */ void m80520iN(int i11) {
        this.f74112S1 = i11;
        m80549CN(i11, true);
        m80554HM(this.f74095F1.f42715C, this.f74112S1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0018, B:13:0x0031, B:15:0x0044, B:17:0x004a, B:19:0x0050, B:21:0x0058, B:22:0x006a, B:24:0x007d, B:25:0x008e, B:27:0x0096, B:29:0x009a, B:31:0x0022, B:33:0x0026), top: B:1:0x0000 }] */
    /* renamed from: jN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m80522jN() {
        boolean z11;
        try {
            if (this.f74095F1 == null) {
                return;
            }
            this.f74104O1.clear();
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74093D1);
            if (m4472f != null) {
                if (!m4472f.m153742T()) {
                }
                z11 = true;
                if (z11) {
                    this.f74104O1.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit), AbstractC8020f0.str_edit));
                }
                if (m4472f != null && (!m4472f.m153763h0() || m4472f.m153742T())) {
                    if (!m80498PM(this.f74095F1)) {
                        this.f74104O1.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unpin_from_top_of_group_chat_v2), AbstractC8020f0.str_unpin_from_top_of_group_chat_v2));
                    } else {
                        this.f74104O1.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_to_top_group_chat_v2), AbstractC8020f0.str_pin_to_top_group_chat_v2));
                    }
                }
                if (z11) {
                    this.f74104O1.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), AbstractC8020f0.str_delete));
                }
                if (this.f74104O1.isEmpty()) {
                    m80539vN(false);
                    return;
                } else {
                    m80539vN(true);
                    return;
                }
            }
            C7904b c7904b = this.f74095F1;
            if (c7904b == null || !c7904b.m40777o()) {
                z11 = false;
                if (z11) {
                }
                if (m4472f != null) {
                    if (!m80498PM(this.f74095F1)) {
                    }
                }
                if (z11) {
                }
                if (this.f74104O1.isEmpty()) {
                }
            }
            z11 = true;
            if (z11) {
            }
            if (m4472f != null) {
            }
            if (z11) {
            }
            if (this.f74104O1.isEmpty()) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: kN */
    public void m80524kN(C31862c c31862c, String str, String str2) {
        boolean z11;
        if (c31862c != null && c31862c.m153153e()) {
            m80533rN(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("action.window.close")) {
                if (!z11) {
                    m80533rN(c31862c);
                    return;
                }
                return;
            }
            AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
        }
    }

    /* renamed from: nN */
    public void m80500RM(C7904b c7904b) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", "group_" + this.f74093D1);
        bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
        m92662fJ().m93069k2(UnpinTopicPinBoardView.class, bundle, 2, true);
    }

    /* renamed from: rN */
    private void m80533rN(C31862c c31862c) {
        FrameLayout frameLayout = this.f74090A1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f74090A1.setVisibility(8);
        }
        C18434b.m97679l().m97691w(c31862c);
    }

    /* renamed from: uN */
    private void m80537uN(boolean z11) {
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

    /* renamed from: vN */
    private void m80539vN(boolean z11) {
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

    /* renamed from: wN */
    private void m80541wN(String str) {
        if (m87077NK() != null) {
            m87077NK().setMiddleSubtitle(str);
        }
    }

    /* renamed from: xN */
    private void m80543xN(String str) {
        if (m87077NK() != null) {
            m87077NK().setMiddleTitle(str);
        }
    }

    /* renamed from: AN */
    void m80546AN() {
        C7904b.a aVar;
        String str;
        m80553GM();
        AbstractC2379w.m12430d(this.f74107Q0);
        if (this.f74126Z1 == null) {
            C7904b c7904b = this.f74095F1;
            if (c7904b != null && (aVar = c7904b.f42724L) != null && aVar.f42755a != null) {
                String str2 = c7904b.f42715C;
                String str3 = this.f74093D1;
                InviteContactProfile inviteContactProfile = c7904b.f42719G;
                if (inviteContactProfile != null) {
                    str = inviteContactProfile.f42434r;
                } else {
                    str = "";
                }
                this.f74126Z1 = EventAttendeeBottomView.m79476BL(str2, str3, str, new C14424a());
            } else {
                return;
            }
        }
        this.f72421L0.m92649TI().m93060e2(0, this.f74126Z1, EventAttendeeBottomView.f73215o1, 0, false);
    }

    /* renamed from: BN */
    void m80547BN() {
        C7904b.a aVar;
        C19409a c19409a;
        try {
            m80560OM();
            C7904b c7904b = this.f74095F1;
            if (c7904b != null && (aVar = c7904b.f42724L) != null && (c19409a = aVar.f42755a) != null && c19409a.f96251c != null && c19409a.f96249a) {
                int i11 = c19409a.f96250b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            this.f74142n1.setVisibility(8);
                            this.f74145q1.setVisibility(0);
                            this.f74146r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_decline_new));
                        }
                    } else {
                        this.f74142n1.setVisibility(8);
                        this.f74145q1.setVisibility(0);
                        this.f74146r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_attend_accept_new));
                    }
                } else {
                    this.f74142n1.setVisibility(0);
                    this.f74145q1.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CM */
    void m80548CM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wn
            public /* synthetic */ RunnableC16308wn() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80499QM();
            }
        });
    }

    /* renamed from: CN */
    void m80549CN(int i11, boolean z11) {
        if (z11) {
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f74130b2;
            if (attendConfirmBottomPicker != null) {
                attendConfirmBottomPicker.m78110vL(i11, false);
                this.f74130b2.m78105EG(true, true);
                return;
            }
            return;
        }
        m80559NM();
        this.f74091B1.setVisibility(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return AbstractC23089h6.m118433a(this.f74095F1, "group_" + this.f74093D1, this.f72421L0.getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bo
                            public /* synthetic */ C15481bo() {
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                GroupPostDetailViewV2.this.m80511cN(interfaceC17463d, i12);
                            }
                        });
                    }
                } else {
                    C8009j.a aVar = new C8009j.a(this.f72421L0.getContext());
                    aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_delete_this_item)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.co
                        public /* synthetic */ C15517co() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            GroupPostDetailViewV2.this.m80512dN(interfaceC17463d, i12);
                        }
                    });
                    return aVar.m43152a();
                }
            } else {
                int i12 = AbstractC8020f0.str_dialog_msg_replace_pin_new_group_post;
                int i13 = AbstractC8020f0.str_pin_this_post;
                if (this.f74095F1.f42732d > 0) {
                    i12 = AbstractC8020f0.str_dialog_msg_replace_pin_new_time_reminder;
                    i13 = AbstractC8020f0.str_pin_this_time_reminder;
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
                aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(i12)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(i13), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ao
                    public /* synthetic */ C15444ao() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                        GroupPostDetailViewV2.this.m80510bN(interfaceC17463d, i14);
                    }
                });
                return aVar2.m43152a();
            }
        } else if (!this.f74104O1.isEmpty()) {
            SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.getContext(), this.f74104O1, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.getContext());
            aVar3.m43155d(true);
            aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zn

                /* renamed from: q */
                public final /* synthetic */ SimpleAdapter f82862q;

                public /* synthetic */ C16419zn(SimpleAdapter simpleAdapter2) {
                    r2 = simpleAdapter2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                    GroupPostDetailViewV2.this.m80509aN(r2, interfaceC17463d, i14);
                }
            });
            return aVar3.m43152a();
        }
        return null;
    }

    /* renamed from: DN */
    void m80550DN() {
        int i11;
        try {
            if (this.f74141m1.getHeight() > 0) {
                i11 = this.f74141m1.getHeight();
            } else {
                i11 = f74089c2;
            }
            int i12 = i11;
            this.f74141m1.setPosition(i12);
            this.f74141m1.setVisibility(0);
            AbstractC23202r9.m119537e(this.f74141m1, null, 300L, null, 0.0f, i12, null, 0.0f, new C14425b());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: EN */
    void m80551EN() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sn
            public /* synthetic */ RunnableC16160sn() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80522jN();
            }
        });
    }

    /* renamed from: FM */
    void m80552FM() {
        try {
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f74130b2;
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
        this.f74105P0 = getContext();
        this.f74107Q0 = layoutInflater.inflate(AbstractC7409c0.group_post_detail_view_v2, viewGroup, false);
        this.f74092C1 = new C23528a(this.f72421L0.getContext());
        this.f74109R0 = this.f74107Q0.findViewById(AbstractC6918a0.content_container);
        MultiStateView multiStateView = (MultiStateView) this.f74107Q0.findViewById(AbstractC6918a0.multi_state);
        this.f74111S0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.do
            public /* synthetic */ C15558do() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupPostDetailViewV2.this.m80513eN();
            }
        });
        this.f74117V0 = this.f74107Q0.findViewById(AbstractC6918a0.post_header);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f74107Q0.findViewById(AbstractC6918a0.iv_creator_avt);
        this.f74119W0 = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        TextView textView = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.tv_creator_name);
        this.f74121X0 = textView;
        textView.setOnClickListener(this);
        this.f74123Y0 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.tv_timeline);
        TextView textView2 = (TextView) this.f74107Q0.findViewById(AbstractC6918a0.group_board);
        this.f74125Z0 = textView2;
        textView2.setOnClickListener(this);
        this.f74106P1.m106538e(new C14426c());
        return this.f74107Q0;
    }

    /* renamed from: GM */
    void m80553GM() {
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
    void m80554HM(String str, int i11) {
        if (TextUtils.isEmpty(str) || this.f74124Y1) {
            return;
        }
        this.f74124Y1 = true;
        C18408p.m97474Q().f92822a.put(str, Integer.valueOf(i11));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14434k(i11, str));
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.on

            /* renamed from: q */
            public final /* synthetic */ String f81489q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC0765j f81490r;

            /* renamed from: s */
            public final /* synthetic */ int f81491s;

            public /* synthetic */ RunnableC15988on(String str2, InterfaceC0765j c0766k2, int i112) {
                r2 = str2;
                r3 = c0766k2;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80503UM(r2, r3, r4);
            }
        }, 300L);
    }

    /* renamed from: IM */
    JSONObject m80555IM() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int currentItem = this.f74126Z1.f73226e1.getCurrentItem();
            ArrayList arrayList = this.f74126Z1.f73222a1;
            jSONArray.put(m80556JM(((C19417i) arrayList.get(currentItem)).f96340c, m80558MM((C19417i) arrayList.get(currentItem)), true));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 != currentItem && ((C19417i) arrayList.get(i11)).f96338a != 0) {
                    jSONArray.put(m80556JM(((C19417i) arrayList.get(i11)).f96340c, m80558MM((C19417i) arrayList.get(i11)), false));
                }
            }
            jSONObject.put("listSectionSuggest", jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scrollTop", 1);
            jSONObject2.put("selectTabType", 0);
            jSONObject2.put("actionTitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member));
            jSONObject.put("initConfig", jSONObject2);
            jSONObject.put("reminderTitle", this.f74095F1.f42736h);
            jSONObject.put("groupId", this.f74093D1);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: JM */
    JSONObject m80556JM(ArrayList arrayList, String str, boolean z11) {
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

    /* renamed from: LM */
    void m80557LM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xn
            public /* synthetic */ RunnableC16345xn() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80506XM();
            }
        });
    }

    /* renamed from: MM */
    String m80558MM(C19417i c19417i) {
        int i11 = c19417i.f96338a;
        if (i11 != 1) {
            if (i11 != 2) {
                return "";
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_decline);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_accept);
    }

    /* renamed from: NM */
    void m80559NM() {
        this.f74142n1.setVisibility(8);
        this.f74145q1.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ln
                public /* synthetic */ ViewOnClickListenerC15858ln() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPostDetailViewV2.this.m80514fN(view);
                }
            });
            m87077NK.setOnClickListenerTrailingButton2(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mn
                public /* synthetic */ ViewOnClickListenerC15900mn() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPostDetailViewV2.this.m80516gN(view);
                }
            });
        }
        m80537uN(false);
        m80539vN(false);
    }

    /* renamed from: OM */
    void m80560OM() {
        this.f74091B1.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        this.f74128a2 = false;
        super.mo68807SL();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupPostDetailViewV2";
    }

    /* renamed from: lN */
    void m80561lN(C7904b c7904b) {
        if (c7904b == null || TextUtils.isEmpty(c7904b.f42715C) || this.f74124Y1) {
            return;
        }
        this.f74124Y1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14433j(c7904b));
        c0766k.mo1461J7(c7904b.f42715C, this.f74093D1);
    }

    /* renamed from: mN */
    void m80562mN() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", this.f74093D1);
        bundle.putString("extra_group_board_gen_id", this.f74094E1);
        if (this.f74095F1.f42732d > 0) {
            bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 0);
            this.f72421L0.m92662fJ().m93066i2(GroupReminderComposeView.class, bundle, 2, 1, true);
        } else {
            this.f72421L0.m92662fJ().m93066i2(GroupPostComposeViewV2.class, bundle, 1, 1, true);
        }
    }

    /* renamed from: oN */
    void m80563oN() {
        C31988k5 m132062h;
        if (this.f74094E1 == null || (m132062h = C25490c.m132054j().m132062h(this.f74094E1)) == null) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14431h());
        c0766k.mo1476L6(this.f74093D1, m132062h.f147200a, m132062h.m154217a());
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        boolean z11 = true;
        if ((i11 == 1 || i11 == 2) && i12 == -1 && intent != null && intent.hasExtra("extra_group_board_gen_id")) {
            C7904b c7904b = C25490c.m132054j().m132062h(intent.getStringExtra("extra_group_board_gen_id")).f147201b;
            this.f74095F1 = c7904b;
            if (c7904b.f42732d <= 0) {
                z11 = false;
            }
            this.f74098I1 = z11;
            this.f74108Q1 = -1L;
            this.f74110R1 = -1L;
            m80557LM();
            m80548CM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InviteContactProfile inviteContactProfile;
        C7904b c7904b;
        C7904b.a aVar;
        C19409a c19409a;
        C7904b.a aVar2;
        C19409a c19409a2;
        C7904b.a aVar3;
        C19409a c19409a3;
        int id2 = view.getId();
        if (id2 != AbstractC6918a0.iv_creator_avt && id2 != AbstractC6918a0.tv_creator_name) {
            if (id2 == AbstractC6918a0.group_board) {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                bundle.putString("extra_group_id", this.f74093D1);
                if (this.f74098I1) {
                    this.f72421L0.m92662fJ().m93069k2(GroupCalendarView.class, bundle, 1, true);
                    return;
                } else {
                    this.f72421L0.m92662fJ().m93069k2(GroupBoardView.class, bundle, 1, true);
                    return;
                }
            }
            if (id2 == AbstractC6918a0.reminder_jump_msg_wrapper) {
                try {
                    if (this.f74120W1) {
                        return;
                    }
                    this.f74120W1 = true;
                    AbstractC19646n0.m103042x(new Runnable() { // from class: com.zing.zalo.ui.zviews.kn
                        public /* synthetic */ RunnableC15821kn() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupPostDetailViewV2.this.m80507YM();
                        }
                    }, new Runnable() { // from class: com.zing.zalo.ui.zviews.vn
                        public /* synthetic */ RunnableC16271vn() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupPostDetailViewV2.this.m80508ZM();
                        }
                    }, this.f74095F1.f42747s, "group_" + this.f74093D1);
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    this.f74120W1 = false;
                    return;
                }
            }
            if (id2 == AbstractC6918a0.goto_group_wrapper) {
                AbstractC23647d.m123897g("77700023");
                AbstractC23211s7.m119575h(this.f74093D1, this.f72421L0.m92676n2(), true);
                return;
            }
            if (id2 == AbstractC6918a0.attend_going_text) {
                C7904b c7904b2 = this.f74095F1;
                if (c7904b2 != null && (aVar3 = c7904b2.f42724L) != null && (c19409a3 = aVar3.f42755a) != null && c19409a3.f96250b != 1) {
                    m80549CN(1, false);
                    m80554HM(this.f74095F1.f42715C, 1);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.attend_decline_text) {
                C7904b c7904b3 = this.f74095F1;
                if (c7904b3 != null && (aVar2 = c7904b3.f42724L) != null && (c19409a2 = aVar2.f42755a) != null && c19409a2.f96250b != 2) {
                    m80549CN(2, false);
                    m80554HM(this.f74095F1.f42715C, 2);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.change_attend_tv && (c7904b = this.f74095F1) != null && (aVar = c7904b.f42724L) != null && (c19409a = aVar.f42755a) != null) {
                m80569zN(c19409a.f96250b);
                return;
            }
            return;
        }
        C7904b c7904b4 = this.f74095F1;
        if (c7904b4 != null && (inviteContactProfile = c7904b4.f42719G) != null) {
            AbstractC23211s7.m119562B(inviteContactProfile.f42434r, this.f72421L0.m92662fJ(), this.f74093D1, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
        }
    }

    /* renamed from: pN */
    void m80564pN() {
        CharSequence text;
        try {
            if (this.f74098I1) {
                text = this.f74129b1.getText();
            } else {
                text = this.f74131c1.getText();
            }
            String charSequence = text.toString();
            int m119758v = AbstractC23244v8.m119758v(charSequence, System.getProperty("line.separator"));
            if (charSequence.length() <= 70 && m119758v <= 2) {
                if (this.f74098I1) {
                    this.f74129b1.setTextSize(1, 22.0f);
                    return;
                } else {
                    this.f74131c1.setTextSize(1, 22.0f);
                    return;
                }
            }
            if (this.f74098I1) {
                this.f74129b1.setTextSize(1, 16.0f);
            } else {
                this.f74131c1.setTextSize(1, 16.0f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: qN */
    void m80565qN(C31988k5 c31988k5) {
        if (c31988k5 == null) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14430g(c31988k5));
        c0766k.mo1602b5(this.f74093D1, c31988k5.f147200a, c31988k5.m154217a());
    }

    /* renamed from: sN */
    void m80566sN(String str) {
        if (this.f74122X1) {
            return;
        }
        m80568yN(true, 0);
        this.f74122X1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14428e());
        c0766k.mo1599aa(str);
    }

    /* renamed from: tN */
    void m80567tN(boolean z11) {
        String substring;
        try {
            C7904b c7904b = this.f74095F1;
            if (c7904b != null && this.f74129b1 != null) {
                this.f74099J1 = z11;
                String str = c7904b.f42754z;
                String m119760x = AbstractC23244v8.m119760x(str);
                if (!z11 && !TextUtils.isEmpty(m119760x)) {
                    str = m119760x;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(str));
                if (C31944h6.m153544j(spannableStringBuilder)) {
                    try {
                        C31944h6.m153538d(spannableStringBuilder, 7, C31884d6.m153209a());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                List<C7907e.a> list = this.f74095F1.f42713A;
                if (list != null) {
                    C31884d6 m153209a = C31884d6.m153209a();
                    for (C7907e.a aVar : list) {
                        if (TextUtils.isEmpty(aVar.f42796f)) {
                            substring = "";
                        } else {
                            substring = aVar.f42796f.substring(1);
                        }
                        String str2 = substring;
                        String valueOf = String.valueOf(aVar.m40866d());
                        int i11 = aVar.f42795e;
                        C31944h6.m153541g(5, valueOf, i11, i11 + aVar.f42794d, spannableStringBuilder, str2, m153209a.f146459e);
                    }
                }
                if (!z11 && !TextUtils.isEmpty(m119760x)) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) m118743r0);
                    spannableStringBuilder.setSpan(new C14432i(), length, spannableStringBuilder.length(), 33);
                }
                this.f74129b1.setText(spannableStringBuilder);
                this.f74129b1.setMovementMethod(this.f74106P1);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 27) {
                if (i11 == 6020) {
                    if (this.f74095F1 != null && this.f74098I1 && objArr != null && objArr.length >= 1 && ((Integer) objArr[0]).intValue() == 22) {
                        m80496EM();
                    }
                }
            } else if (objArr != null) {
                if (objArr.length >= 3) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                    boolean contains = arrayList.contains(CoreUtility.f89233i);
                    if (this.f74093D1.equals(str) && !arrayList.isEmpty() && intValue == 4 && contains) {
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
        C31973j5 m4472f;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("extra_group_id");
            this.f74093D1 = string;
            if (!TextUtils.isEmpty(string) && (m4472f = C0943w.m4462l().m4472f(this.f74093D1)) != null) {
                m80541wN(m4472f.m153793y());
            }
            this.f74108Q1 = m92642L3.getLong("LONG_EXTRA_EVENT_START_TIME", -1L);
            this.f74110R1 = m92642L3.getLong("LONG_EXTRA_EVENT_END_TIME", -1L);
            this.f74118V1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            String string2 = m92642L3.getString("extra_topic_id");
            this.f74101L1 = string2;
            m80566sN(string2);
            this.f74096G1 = m92642L3.getBoolean("extra_shortcut_groupboard", false);
            this.f74097H1 = m92642L3.getBoolean("extra_shortcut_csc", false);
        }
    }

    /* renamed from: yN */
    void m80568yN(boolean z11, int i11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nn

            /* renamed from: q */
            public final /* synthetic */ boolean f81372q;

            /* renamed from: r */
            public final /* synthetic */ int f81373r;

            public /* synthetic */ RunnableC15950nn(boolean z112, int i112) {
                r2 = z112;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostDetailViewV2.this.m80518hN(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 6020);
    }

    /* renamed from: zN */
    void m80569zN(int i11) {
        try {
            m80552FM();
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f74130b2;
            if (attendConfirmBottomPicker == null) {
                this.f74130b2 = AttendConfirmBottomPicker.m78104tL(i11, new AttendConfirmBottomPicker.InterfaceC14036a() { // from class: com.zing.zalo.ui.zviews.un
                    public /* synthetic */ C16234un() {
                    }

                    @Override // com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker.InterfaceC14036a
                    /* renamed from: g */
                    public final void mo78111g(int i12) {
                        GroupPostDetailViewV2.this.m80520iN(i12);
                    }
                });
            } else {
                attendConfirmBottomPicker.m78105EG(false, false);
                this.f74130b2.m78110vL(i11, false);
            }
            this.f72421L0.m92649TI().m93060e2(0, this.f74130b2, "ListViewBottomPicker", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
