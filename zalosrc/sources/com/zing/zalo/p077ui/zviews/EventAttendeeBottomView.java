package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7179q0;
import com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalocore.CoreUtility;
import ge.C19417i;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p716zh.C31973j5;
import p716zh.C32076q5;
import sa0.C26203c;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* loaded from: classes6.dex */
public class EventAttendeeBottomView extends BottomPickerView {

    /* renamed from: o1 */
    public static final String f73215o1 = "EventAttendeeBottomView";

    /* renamed from: V0 */
    String f73217V0;

    /* renamed from: W0 */
    String f73218W0;

    /* renamed from: X0 */
    String f73219X0;

    /* renamed from: Y0 */
    C31973j5 f73220Y0;

    /* renamed from: Z0 */
    String f73221Z0;

    /* renamed from: a1 */
    ArrayList f73222a1;

    /* renamed from: b1 */
    HashSet f73223b1;

    /* renamed from: c1 */
    View f73224c1;

    /* renamed from: d1 */
    MultiStateView f73225d1;

    /* renamed from: e1 */
    ViewPager f73226e1;

    /* renamed from: f1 */
    View f73227f1;

    /* renamed from: g1 */
    public RobotoTextView f73228g1;

    /* renamed from: j1 */
    EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b f73231j1;

    /* renamed from: k1 */
    public C13306b f73232k1;

    /* renamed from: U0 */
    Handler f73216U0 = new Handler(Looper.getMainLooper());

    /* renamed from: h1 */
    int f73229h1 = 0;

    /* renamed from: i1 */
    boolean f73230i1 = false;

    /* renamed from: l1 */
    C13306b.c f73233l1 = new C14248a();

    /* renamed from: m1 */
    boolean f73234m1 = false;

    /* renamed from: n1 */
    boolean f73235n1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.EventAttendeeBottomView$a */
    /* loaded from: classes6.dex */
    class C14248a extends C13306b.c {
        C14248a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            if (!str.equals("tip.entry.point.new.group.from.reminder")) {
                return super.mo66900a(c28212v6);
            }
            if (EventAttendeeBottomView.this.f73227f1.getVisibility() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            str.hashCode();
            if (str.equals("tip.entry.point.new.group.from.reminder")) {
                c26203c.f124513d = AbstractC23136l9.m118742r(2.0f);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130824A;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (str.equals("tip.entry.point.new.group.from.reminder") && EventAttendeeBottomView.this.f73227f1.getVisibility() == 0) {
                return new C26209i(EventAttendeeBottomView.this.f73228g1);
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (EventAttendeeBottomView.this.f88762c0.m92672lJ() && EventAttendeeBottomView.this.f88762c0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.EventAttendeeBottomView$b */
    /* loaded from: classes6.dex */
    public class C14249b implements InterfaceC20094a {
        C14249b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            EventAttendeeBottomView eventAttendeeBottomView = EventAttendeeBottomView.this;
            eventAttendeeBottomView.f73234m1 = false;
            eventAttendeeBottomView.m79487DL(false, c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            EventAttendeeBottomView.this.f73234m1 = false;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("responseInfo")) != null) {
                    EventAttendeeBottomView.this.f73222a1 = new ArrayList();
                    EventAttendeeBottomView.this.f73223b1 = new HashSet();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        C19417i c19417i = new C19417i((JSONObject) optJSONArray.get(i11));
                        EventAttendeeBottomView.this.f73222a1.add(c19417i);
                        EventAttendeeBottomView.this.f73223b1.addAll(c19417i.f96340c);
                    }
                    C19417i m79482vL = EventAttendeeBottomView.this.m79482vL();
                    if (m79482vL != null) {
                        EventAttendeeBottomView.this.f73222a1.add(m79482vL);
                    }
                    EventAttendeeBottomView.this.m79490uL();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                EventAttendeeBottomView.this.m79487DL(false, -1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.EventAttendeeBottomView$c */
    /* loaded from: classes6.dex */
    public class C14250c implements ViewPager.InterfaceC6875j {
        C14250c() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            EventAttendeeBottomView.this.m79488sL(i11);
        }
    }

    /* renamed from: BL */
    public static EventAttendeeBottomView m79476BL(String str, String str2, String str3, EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b interfaceC6924b) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        EventAttendeeBottomView eventAttendeeBottomView = new EventAttendeeBottomView();
        m78535kL.putString("extra_topic_id", str);
        m78535kL.putString("extra_group_id", str2);
        m78535kL.putString("creatorId", str3);
        eventAttendeeBottomView.f73231j1 = interfaceC6924b;
        eventAttendeeBottomView.mo60305zK(m78535kL);
        return eventAttendeeBottomView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vL */
    public C19417i m79482vL() {
        C32076q5 c32076q5;
        try {
            if (this.f73220Y0 != null) {
                c32076q5 = C0943w.m4462l().m4476k(this.f73220Y0.m153781r());
            } else {
                c32076q5 = null;
            }
            if (this.f73222a1 == null || c32076q5 == null) {
                return null;
            }
            List m154718g = c32076q5.m154718g();
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < m154718g.size(); i11++) {
                String str = (String) m154718g.get(i11);
                if (!this.f73223b1.contains(str)) {
                    arrayList.add(str);
                }
            }
            return new C19417i(0, arrayList.size(), arrayList);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xL */
    public /* synthetic */ void m79483xL() {
        m79475AL(false, 0);
        this.f73230i1 = m79489tL();
        this.f73226e1 = (ViewPager) this.f83659I0.findViewById(AbstractC6918a0.pager);
        this.f73226e1.setAdapter(new C7179q0(getContext(), this.f73222a1, this.f73231j1));
        this.f73226e1.addOnPageChangeListener(new C14250c());
        m79488sL(this.f73226e1.getCurrentItem());
        ((PagerSlidingTabStrip) this.f83659I0.findViewById(AbstractC6918a0.tabs)).setViewPager(this.f73226e1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yL */
    public /* synthetic */ void m79484yL(View view) {
        EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b interfaceC6924b;
        int i11 = this.f73229h1;
        if (i11 == 0) {
            AbstractC23647d.m123897g("300803");
            EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b interfaceC6924b2 = this.f73231j1;
            if (interfaceC6924b2 != null) {
                interfaceC6924b2.mo35593b();
                return;
            }
            return;
        }
        if (i11 == 1) {
            C19417i c19417i = (C19417i) this.f73222a1.get(this.f73226e1.getCurrentItem());
            if (c19417i != null && (interfaceC6924b = this.f73231j1) != null) {
                interfaceC6924b.mo35594c(c19417i.f96340c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zL */
    public /* synthetic */ void m79485zL() {
        m79491wL(this.f73217V0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: CL, reason: merged with bridge method [inline-methods] */
    public void m79475AL(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                MultiStateView multiStateView = this.f73225d1;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f73225d1.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f73224c1.setVisibility(8);
                return;
            }
            if (i11 == 0) {
                this.f73225d1.setVisibility(8);
                this.f73224c1.setVisibility(0);
                return;
            }
            this.f73225d1.setState(MultiStateView.EnumC15914e.ERROR);
            MultiStateView multiStateView2 = this.f73225d1;
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_poll_error_loading_poll_info;
            }
            multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
            MultiStateView multiStateView3 = this.f73225d1;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView3.setErrorType(enumC15915f);
            this.f73225d1.setVisibleErrorImage(8);
            this.f73225d1.setVisibility(0);
            this.f73224c1.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: DL */
    void m79487DL(final boolean z11, final int i11) {
        this.f73216U0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.cd
            @Override // java.lang.Runnable
            public final void run() {
                EventAttendeeBottomView.this.m79475AL(z11, i11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        try {
            this.f73235n1 = true;
            super.mo71219Kj(view, motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        try {
            this.f73235n1 = false;
            super.mo71235TH(view, motionEvent, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f73232k1;
        if (c13306b != null) {
            c13306b.m74697c(this.f73233l1);
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f73232k1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo62728eL = super.mo62728eL(layoutInflater, viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        this.f73224c1 = mo62728eL.findViewById(AbstractC6918a0.container_content);
        this.f73227f1 = this.f83659I0.findViewById(AbstractC6918a0.layout_btn_done);
        RobotoTextView robotoTextView = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.btn_done);
        this.f73228g1 = robotoTextView;
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventAttendeeBottomView.this.m79484yL(view);
            }
        });
        MultiStateView multiStateView = (MultiStateView) this.f83659I0.findViewById(AbstractC6918a0.multi_state);
        this.f73225d1 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.bd
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                EventAttendeeBottomView.this.m79485zL();
            }
        });
        return this.f83659I0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        return this.f73226e1;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        try {
            if (!this.f72450R0 && z11 && Math.abs(f12) < this.f72448P0) {
                return false;
            }
            boolean m118664M0 = AbstractC23136l9.m118664M0(mo78264lL(), motionEvent, view);
            if (!this.f72450R0) {
                if (!this.f73235n1 && m118664M0) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.event_attendee_bottom_view_layout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f73232k1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }

    /* renamed from: sL */
    void m79488sL(int i11) {
        C19417i c19417i = (C19417i) this.f73222a1.get(i11);
        if (c19417i.f96338a == 0) {
            this.f73229h1 = 1;
            if (c19417i.f96340c.size() > 0 && ((c19417i.f96340c.size() != 1 || !((String) c19417i.f96340c.get(0)).equals(CoreUtility.f89233i)) && ((this.f73221Z0.equals(CoreUtility.f89233i) || this.f73220Y0.m153742T()) && this.f73220Y0 != null && AbstractC23309i.m121590X2() && (this.f73220Y0.m153792x() == 1 || (this.f73220Y0.m153792x() == 2 && this.f73220Y0.m153742T()))))) {
                this.f73227f1.setVisibility(0);
                this.f73228g1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remind_response_event_btn));
                return;
            } else {
                this.f73227f1.setVisibility(8);
                return;
            }
        }
        this.f73229h1 = 0;
        if (this.f73230i1) {
            this.f73227f1.setVisibility(0);
            this.f73228g1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_createGroup));
        } else {
            this.f73227f1.setVisibility(8);
        }
    }

    /* renamed from: tL */
    boolean m79489tL() {
        if (this.f73223b1 == null) {
            return false;
        }
        boolean m121891f3 = AbstractC23309i.m121891f3();
        int m122636z0 = AbstractC23309i.m122636z0();
        int size = this.f73223b1.size();
        if (this.f73223b1.contains(CoreUtility.f89233i)) {
            size--;
        }
        if (!m121891f3 || size < 2 || size > m122636z0) {
            return false;
        }
        return true;
    }

    /* renamed from: uL */
    void m79490uL() {
        this.f73216U0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dd
            @Override // java.lang.Runnable
            public final void run() {
                EventAttendeeBottomView.this.m79483xL();
            }
        });
    }

    /* renamed from: wL */
    void m79491wL(String str) {
        if (this.f73234m1) {
            return;
        }
        this.f73234m1 = true;
        m79487DL(true, 0);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14249b());
        c0766k.mo1597a8(Long.parseLong(str));
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f73217V0 = m92642L3.getString("extra_topic_id", "");
                this.f73218W0 = m92642L3.getString("extra_topic_tittle", "");
                this.f73219X0 = m92642L3.getString("extra_group_id", "");
                this.f73220Y0 = C0943w.m4462l().m4472f(this.f73219X0);
                this.f73221Z0 = m92642L3.getString("creatorId", "");
                m79491wL(this.f73217V0);
                C13306b c13306b = new C13306b(this.f88762c0.m92648SI());
                this.f73232k1 = c13306b;
                c13306b.m74687C((ViewGroup) this.f88762c0.m92656bJ());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
