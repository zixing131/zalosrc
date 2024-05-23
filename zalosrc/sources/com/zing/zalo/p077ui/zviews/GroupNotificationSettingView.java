package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0804b;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.ManageGroupAdapter;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23116k0;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23201r8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.C21912a;
import p354n3.C23528a;
import p363nh.C23744a;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class GroupNotificationSettingView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    View f73913P0;

    /* renamed from: Q0 */
    RecyclerView f73914Q0;

    /* renamed from: R0 */
    ManageGroupAdapter f73915R0;

    /* renamed from: S0 */
    String f73916S0;

    /* renamed from: X0 */
    C23528a f73921X0;

    /* renamed from: Y0 */
    C31973j5 f73922Y0;

    /* renamed from: Z0 */
    MuteTrackingSource f73923Z0;

    /* renamed from: a1 */
    boolean f73924a1;

    /* renamed from: T0 */
    String f73917T0 = "";

    /* renamed from: U0 */
    Conversation f73918U0 = null;

    /* renamed from: V0 */
    ArrayList f73919V0 = new ArrayList();

    /* renamed from: W0 */
    Map f73920W0 = new HashMap();

    /* renamed from: b1 */
    int f73925b1 = -1;

    /* renamed from: c1 */
    boolean f73926c1 = false;

    /* renamed from: d1 */
    InterfaceC0765j f73927d1 = new C0766k();

    /* renamed from: e1 */
    InterfaceC20094a f73928e1 = new C14383c();

    /* renamed from: f1 */
    boolean f73929f1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$a */
    /* loaded from: classes6.dex */
    class C14381a extends RecyclerView.AbstractC1892s {
        C14381a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    ManageGroupAdapter manageGroupAdapter = GroupNotificationSettingView.this.f73915R0;
                    manageGroupAdapter.f38153u = false;
                    manageGroupAdapter.m10008p();
                } else {
                    GroupNotificationSettingView.this.f73915R0.f38153u = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$b */
    /* loaded from: classes6.dex */
    class C14382b implements ManageGroupAdapter.InterfaceC6975b {
        C14382b() {
        }

        @Override // com.zing.zalo.adapters.ManageGroupAdapter.InterfaceC6975b
        /* renamed from: a */
        public void mo35744a(int i11, boolean z11, ManageGroupAdapter.C6979f c6979f) {
            if (c6979f.m35758k()) {
                if (i11 == 21) {
                    GroupNotificationSettingView.this.m80300pM();
                } else if (i11 == 23) {
                    if (C0804b.m2025g().m2032f(GroupNotificationSettingView.this.f73917T0) != null) {
                        GroupNotificationSettingView.this.showDialog(8);
                    } else {
                        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_notify_mention_setting));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$c */
    /* loaded from: classes6.dex */
    public class C14383c implements InterfaceC20094a {
        C14383c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupNotificationSettingView groupNotificationSettingView = GroupNotificationSettingView.this;
            groupNotificationSettingView.f73926c1 = false;
            groupNotificationSettingView.m80303qM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (jSONObject.has("req_info")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("req_info");
                        if (jSONObject2 != null) {
                            GroupNotificationSettingView.this.f73925b1 = jSONObject2.optInt("isBlockTimeLine", 0);
                        }
                        if (GroupNotificationSettingView.this.f73925b1 == 1) {
                            C21912a.m114159g().m114162b(GroupNotificationSettingView.this.f73918U0.m40998a());
                        } else {
                            C21912a.m114159g().m114172n(GroupNotificationSettingView.this.f73918U0.m40998a());
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                GroupNotificationSettingView.this.m80303qM();
                GroupNotificationSettingView.this.f73926c1 = false;
            } catch (Throwable th2) {
                GroupNotificationSettingView.this.m80303qM();
                GroupNotificationSettingView.this.f73926c1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$d */
    /* loaded from: classes6.dex */
    class C14384d extends AbstractC23116k0.a {
        C14384d() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            GroupNotificationSettingView.this.m80302oM(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$e */
    /* loaded from: classes6.dex */
    public class C14385e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f73934a;

        C14385e(C24275a c24275a) {
            this.f73934a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupNotificationSettingView groupNotificationSettingView = GroupNotificationSettingView.this;
                groupNotificationSettingView.f73929f1 = false;
                groupNotificationSettingView.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f73934a);
                    C23744a.m124114c().m124116d(119, new Object[0]);
                    if (GroupNotificationSettingView.this.mo45894h0()) {
                        ToastUtils.m89268p(AbstractC19620d0.m102701u(this.f73934a.m126766c()));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupNotificationSettingView groupNotificationSettingView = GroupNotificationSettingView.this;
                groupNotificationSettingView.f73929f1 = false;
                groupNotificationSettingView.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$f */
    /* loaded from: classes6.dex */
    public class C14386f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73936a;

        C14386f(String str) {
            this.f73936a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupNotificationSettingView.this.mo49315c4();
                GroupNotificationSettingView.this.f73929f1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C0804b.m2025g().m2035l(this.f73936a, true);
                    C23744a.m124114c().m124116d(119, new Object[0]);
                    if (GroupNotificationSettingView.this.mo45894h0()) {
                        ToastUtils.m89268p(GroupNotificationSettingView.this.m92652XI(AbstractC8020f0.str_toast_msg_turn_on_notif));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupNotificationSettingView.this.mo49315c4();
                GroupNotificationSettingView.this.f73929f1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupNotificationSettingView$g */
    /* loaded from: classes6.dex */
    public class C14387g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f73938a;

        C14387g(C24275a c24275a) {
            this.f73938a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupNotificationSettingView.this.mo49315c4();
            GroupNotificationSettingView.this.f73929f1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C0804b.m2025g().m2029b(this.f73938a);
            C23744a.m124114c().m124116d(119, new Object[0]);
            GroupNotificationSettingView.this.mo49315c4();
            GroupNotificationSettingView.this.f73929f1 = false;
        }
    }

    /* renamed from: jM */
    private void m80295jM(C24275a c24275a) {
        if (c24275a == null || this.f73929f1) {
            return;
        }
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14385e(c24275a));
        this.f73929f1 = true;
        c0766k.mo1652h7(c24275a, this.f73923Z0);
    }

    /* renamed from: kM */
    public /* synthetic */ void m80296kM(SimpleAdapter simpleAdapter, int i11, C24275a c24275a, InterfaceC17463d interfaceC17463d, int i12) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i12)).get("id")).intValue();
        if (i11 != intValue) {
            C24275a clone = c24275a.clone();
            clone.m126777n(intValue);
            m80301rM(clone);
        }
    }

    /* renamed from: lM */
    public /* synthetic */ void m80297lM() {
        boolean z11;
        this.f73919V0.clear();
        this.f73920W0.clear();
        C24275a m2032f = C0804b.m2025g().m2032f(this.f73917T0);
        if (m2032f != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(21, AbstractC8020f0.str_notify_new_msg_text_v2, !z11);
        c6979f.f38166h = true;
        if (z11 && !m2032f.m126772i()) {
            c6979f.f38163e = AbstractC19620d0.m102702v(m2032f, false);
        } else {
            c6979f.f38163e = "";
        }
        this.f73919V0.add(c6979f);
        if (this.f73922Y0 != null) {
            ManageGroupAdapter.C6979f c6979f2 = new ManageGroupAdapter.C6979f(23, AbstractC8020f0.str_notify_mention_v2, false);
            if (z11) {
                int m126770g = m2032f.m126770g();
                if (m126770g != 1) {
                    if (m126770g != 2) {
                        if (m126770g != 3) {
                            c6979f2.f38163e = "";
                        } else {
                            c6979f2.f38163e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_and_everyone_v2);
                        }
                    } else {
                        c6979f2.f38163e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_v2);
                    }
                } else {
                    c6979f2.f38163e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_off_v2);
                }
                c6979f2.m35760m(true);
            } else {
                c6979f2.f38163e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_notify_mention);
            }
            this.f73919V0.add(c6979f2);
        }
        this.f73915R0.m35740P(this.f73919V0);
    }

    /* renamed from: mM */
    public static GroupNotificationSettingView m80298mM(String str, Conversation conversation, int i11) {
        GroupNotificationSettingView groupNotificationSettingView = new GroupNotificationSettingView();
        Bundle bundle = new Bundle();
        bundle.putString("extra_chat_id", str);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putParcelable("state_chat_contact", conversation);
        groupNotificationSettingView.mo60305zK(bundle);
        groupNotificationSettingView.f73918U0 = conversation;
        return groupNotificationSettingView;
    }

    /* renamed from: nM */
    private void m80299nM(Conversation conversation) {
        int i11;
        if (this.f73929f1) {
            return;
        }
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        if (conversation.m41013q()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        String str = conversation.f42893q;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14386f(str));
        this.f73929f1 = true;
        c0766k.mo1413D8(i11, str, this.f73923Z0);
    }

    /* renamed from: pM */
    public void m80300pM() {
        try {
            if (this.f73918U0 != null) {
                if (C0804b.m2025g().m2033i(this.f73918U0.f42893q)) {
                    m80299nM(this.f73918U0);
                } else {
                    showDialog(7);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    private void m80301rM(C24275a c24275a) {
        if (this.f73929f1) {
            return;
        }
        this.f73929f1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14387g(c24275a));
        c0766k.mo1527R9(c24275a);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f73921X0 = new C23528a(this.f72421L0.m92648SI());
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (this.f73918U0 == null) {
                this.f73918U0 = (Conversation) m92642L3.getParcelable("state_chat_contact");
            }
            this.f73917T0 = m92642L3.getString("extra_chat_id", "");
        }
        if (AbstractC25495a.m132079d(this.f73917T0)) {
            this.f73916S0 = AbstractC25495a.m132088m(this.f73917T0);
        }
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73916S0);
        if (m4472f != null) {
            this.f73924a1 = m4472f.m153747Y();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        int i14;
        if (i11 != 7) {
            if (i11 == 8) {
                C24275a m2032f = C0804b.m2025g().m2032f(this.f73917T0);
                if (m2032f == null) {
                    return null;
                }
                int m126770g = m2032f.m126770g();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_off_v2));
                hashMap.put("id", 1);
                if (m126770g == 1) {
                    i12 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i12 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap.put("icon", Integer.valueOf(i12));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_v2));
                hashMap2.put("id", 2);
                if (m126770g == 2) {
                    i13 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i13 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap2.put("icon", Integer.valueOf(i13));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_and_everyone_v2));
                hashMap3.put("id", 3);
                if (m126770g == 3) {
                    i14 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i14 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap3.put("icon", Integer.valueOf(i14));
                arrayList.add(hashMap);
                arrayList.add(hashMap2);
                arrayList.add(hashMap3);
                if (!arrayList.isEmpty()) {
                    SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.setting_notification_mention_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_setting_item, AbstractC6918a0.ic_choose_or_not});
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.custom_title_sub_title_dialog, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvTitle);
                    TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tvSubtitle);
                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_v2));
                    textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_subtitle_notify_mention_dialog));
                    aVar.m43158g(inflate);
                    aVar.m43155d(true);
                    aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tl

                        /* renamed from: q */
                        public final /* synthetic */ SimpleAdapter f82212q;

                        /* renamed from: r */
                        public final /* synthetic */ int f82213r;

                        /* renamed from: s */
                        public final /* synthetic */ C24275a f82214s;

                        public /* synthetic */ C16195tl(SimpleAdapter simpleAdapter2, int m126770g2, C24275a m2032f2) {
                            r2 = simpleAdapter2;
                            r3 = m126770g2;
                            r4 = m2032f2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                            GroupNotificationSettingView.this.m80296kM(r2, r3, r4, interfaceC17463d, i15);
                        }
                    });
                    return aVar.m43152a();
                }
            }
            return super.mo39014DJ(i11);
        }
        return AbstractC23116k0.m118580h(this.f72421L0.m92648SI(), false, new C14384d());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_notification_setting_view, viewGroup, false);
        this.f73913P0 = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(AbstractC6918a0.content_recycle_view);
        this.f73914Q0 = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.f73914Q0.m9826E(new C14381a());
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f73913P0.getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f73915R0 = new ManageGroupAdapter(new C14382b(), this.f73924a1);
        this.f73914Q0.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        this.f73914Q0.setAdapter(this.f73915R0);
        return this.f73913P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 27);
        C23744a.m124114c().m124117e(this, 52);
        C23744a.m124114c().m124117e(this, 119);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null && m87077NK().getLeadingButton() != null) {
            if (this.f73924a1) {
                m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_notification_settings));
            }
            AbstractC23201r8.m119531a(m87077NK().getLeadingButton(), AbstractC8020f0.tb_btn_home);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        Conversation conversation = this.f73918U0;
        if (conversation != null) {
            bundle.putParcelable("state_chat_contact", conversation);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupNotificationSettingView";
    }

    /* renamed from: oM */
    public void m80302oM(int i11) {
        try {
            m80295jM(AbstractC19646n0.m103040w0(i11, this.f73917T0, !TextUtils.isEmpty(this.f73916S0), 3));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: qM */
    void m80303qM() {
        this.f73922Y0 = C0943w.m4462l().m4472f(this.f73916S0);
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.sl
            public /* synthetic */ RunnableC16158sl() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupNotificationSettingView.this.m80297lM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 27) {
                if (i11 != 52) {
                    if (i11 == 119) {
                        m80303qM();
                    }
                } else if (AbstractC23184q2.m119459q(this.f73916S0, i11, objArr)) {
                    finish();
                }
            } else if (objArr != null) {
                if (objArr.length >= 3) {
                    String str = (String) objArr[0];
                    if (((Integer) objArr[1]).intValue() != 0 && str.equals(this.f73916S0)) {
                        m80303qM();
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
        Conversation conversation;
        super.mo37135xJ(bundle);
        this.f73925b1 = -1;
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f73917T0 = m92642L3.getString("extra_chat_id", "");
            this.f73923Z0 = new MuteTrackingSource(m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 5));
            if (AbstractC25495a.m132079d(this.f73917T0)) {
                this.f73916S0 = AbstractC25495a.m132088m(this.f73917T0);
                if (this.f73918U0 == null) {
                    this.f73918U0 = new Conversation("group_" + this.f73916S0);
                }
            }
            m80303qM();
            if (!this.f73926c1 && TextUtils.isEmpty(this.f73916S0) && (conversation = this.f73918U0) != null && !TextUtils.isEmpty(conversation.f42893q) && !C21912a.m114159g().m114170k(this.f73918U0.f42893q) && C23055e5.m118271f()) {
                this.f73926c1 = true;
                TrackingSource trackingSource = new TrackingSource(-1);
                this.f73927d1.mo1704o8(this.f73928e1);
                this.f73927d1.mo1427F6(this.f73918U0.f42893q, trackingSource);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 52);
        C23744a.m124114c().m124115b(this, 119);
    }
}
