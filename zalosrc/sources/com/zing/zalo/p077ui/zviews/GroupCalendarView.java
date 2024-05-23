package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.C0943w;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.calendar.adapters.GroupCalendarAdapter;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalocore.CoreUtility;
import ee.C18408p;
import ee.C18415w;
import ee.C18418z;
import ge.C19411c;
import ge.C19414f;
import ge.C19419k;
import ge.C19420l;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p716zh.C31973j5;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class GroupCalendarView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    View f73610P0;

    /* renamed from: Q0 */
    RecyclerView f73611Q0;

    /* renamed from: R0 */
    GroupCalendarAdapter f73612R0;

    /* renamed from: S0 */
    HandlerThread f73613S0;

    /* renamed from: T0 */
    Handler f73614T0;

    /* renamed from: V0 */
    C19420l f73616V0;

    /* renamed from: Y0 */
    String f73619Y0;

    /* renamed from: Z0 */
    C31973j5 f73620Z0;

    /* renamed from: U0 */
    ArrayList f73615U0 = new ArrayList();

    /* renamed from: W0 */
    ArrayList f73617W0 = new ArrayList();

    /* renamed from: X0 */
    ArrayList f73618X0 = new ArrayList();

    /* renamed from: a1 */
    boolean f73621a1 = false;

    /* renamed from: b1 */
    int[] f73622b1 = {4};

    /* renamed from: c1 */
    final Runnable f73623c1 = new RunnableC14329a();

    /* renamed from: d1 */
    int f73624d1 = 0;

    /* renamed from: e1 */
    boolean f73625e1 = false;

    /* renamed from: f1 */
    int f73626f1 = 0;

    /* renamed from: com.zing.zalo.ui.zviews.GroupCalendarView$a */
    /* loaded from: classes6.dex */
    class RunnableC14329a implements Runnable {
        RunnableC14329a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GroupCalendarView groupCalendarView = GroupCalendarView.this;
            C18408p m97476S = C18408p.m97476S();
            GroupCalendarView groupCalendarView2 = GroupCalendarView.this;
            groupCalendarView.f73615U0 = m97476S.m97518W(groupCalendarView2.f73619Y0, 2, groupCalendarView2.f73622b1);
            GroupCalendarView groupCalendarView3 = GroupCalendarView.this;
            C19420l c19420l = groupCalendarView3.f73616V0;
            if (c19420l != null) {
                groupCalendarView3.f73617W0 = c19420l.m101560d(C18408p.m97470J());
            }
            GroupCalendarView.this.f73618X0 = C18418z.m97607b().m97609c(GroupCalendarView.this.f73619Y0, false);
            GroupCalendarView.this.m80005uM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupCalendarView$b */
    /* loaded from: classes6.dex */
    public class C14330b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f73628a;

        /* renamed from: b */
        final /* synthetic */ C19414f f73629b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC0765j f73630c;

        C14330b(ArrayList arrayList, C19414f c19414f, InterfaceC0765j interfaceC0765j) {
            this.f73628a = arrayList;
            this.f73629b = c19414f;
            this.f73630c = interfaceC0765j;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupCalendarView groupCalendarView = GroupCalendarView.this;
            groupCalendarView.f73625e1 = false;
            groupCalendarView.f73624d1 = 2;
            groupCalendarView.f73614T0.removeCallbacks(groupCalendarView.f73623c1);
            GroupCalendarView groupCalendarView2 = GroupCalendarView.this;
            groupCalendarView2.f73614T0.post(groupCalendarView2.f73623c1);
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
            boolean z11;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    GroupCalendarView groupCalendarView = GroupCalendarView.this;
                    if (groupCalendarView.f73626f1 == 0) {
                        groupCalendarView.f73616V0.m101557a();
                    }
                    JSONArray jSONArray = optJSONObject.getJSONArray("events");
                    if (jSONArray != null) {
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C19411c c19411c = new C19411c((JSONObject) jSONArray.get(i11));
                            StringBuilder sb2 = new StringBuilder(c19411c.f96261a);
                            Iterator it = this.f73628a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (sb2.toString().equals(new StringBuilder(((C19411c) it.next()).f96261a).toString())) {
                                        break;
                                    }
                                } else {
                                    this.f73628a.add(c19411c);
                                    break;
                                }
                            }
                        }
                    }
                    if (optJSONObject.optInt("isLoadMore", 0) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long optLong = optJSONObject.optLong("lastTimestamp", 0L);
                    String optString = optJSONObject.optString("lastEventId", "");
                    if (z11) {
                        GroupCalendarView groupCalendarView2 = GroupCalendarView.this;
                        groupCalendarView2.f73626f1++;
                        C19414f c19414f = this.f73629b;
                        c19414f.f96325d = optString;
                        c19414f.f96326e = optLong;
                        this.f73630c.mo1709p5(groupCalendarView2.f73619Y0, c19414f, "");
                        return;
                    }
                    GroupCalendarView groupCalendarView3 = GroupCalendarView.this;
                    groupCalendarView3.f73625e1 = false;
                    groupCalendarView3.f73624d1 = 0;
                    groupCalendarView3.f73616V0.m101566j(this.f73628a, 0);
                    GroupCalendarView groupCalendarView4 = GroupCalendarView.this;
                    groupCalendarView4.f73614T0.removeCallbacks(groupCalendarView4.f73623c1);
                    GroupCalendarView groupCalendarView5 = GroupCalendarView.this;
                    groupCalendarView5.f73614T0.post(groupCalendarView5.f73623c1);
                    return;
                }
                GroupCalendarView groupCalendarView6 = GroupCalendarView.this;
                groupCalendarView6.f73625e1 = false;
                groupCalendarView6.f73624d1 = 0;
                groupCalendarView6.f73614T0.removeCallbacks(groupCalendarView6.f73623c1);
                GroupCalendarView groupCalendarView7 = GroupCalendarView.this;
                groupCalendarView7.f73614T0.post(groupCalendarView7.f73623c1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                GroupCalendarView groupCalendarView8 = GroupCalendarView.this;
                groupCalendarView8.f73625e1 = false;
                groupCalendarView8.f73624d1 = 2;
                groupCalendarView8.f73614T0.removeCallbacks(groupCalendarView8.f73623c1);
                GroupCalendarView groupCalendarView9 = GroupCalendarView.this;
                groupCalendarView9.f73614T0.post(groupCalendarView9.f73623c1);
            }
        }
    }

    /* renamed from: jM */
    private void m79994jM() {
        Button trailingButton;
        C31973j5 c31973j5;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && (trailingButton = m87077NK.getTrailingButton()) != null) {
            if (AbstractC23309i.m121442T2() && (c31973j5 = this.f73620Z0) != null && c31973j5.m153778p0()) {
                trailingButton.setVisibility(0);
            } else {
                trailingButton.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m79995oM(RecyclerView recyclerView, int i11, View view) {
        try {
            GroupCalendarAdapter.AbstractC7424e m37664L = this.f73612R0.m37664L(i11);
            int m37671b = m37664L.m37671b();
            if (m37671b != 1) {
                if (m37671b != 2) {
                    if (m37671b != 4) {
                        if (m37671b != 6) {
                            if (m37671b == 9 && ((GroupCalendarAdapter.C7427h) m37664L).f40372b == 2) {
                                m79998kM();
                                return;
                            }
                            return;
                        }
                        if (((GroupCalendarAdapter.C7428i) m37664L).f40373b == 1) {
                            AbstractC23647d.m123897g("777050013");
                            m80003sM();
                            return;
                        }
                        return;
                    }
                    C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73619Y0);
                    if (m4472f != null && (!m4472f.m153759f0() || m4472f.m153742T())) {
                        int i12 = ((GroupCalendarAdapter.C7420a) m37664L).f40365b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                AbstractC23647d.m123897g("77705008");
                                m80002rM(null, 8);
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("77705009");
                        m80004tM();
                        return;
                    }
                    ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_no_right_create_time_reminder));
                    return;
                }
                C19419k c19419k = ((GroupCalendarAdapter.C7431l) m37664L).f40374b;
                if (c19419k != null) {
                    m80002rM(c19419k.m101556a(), 10);
                    return;
                }
                return;
            }
            C18415w.m97598k(m92676n2(), ((GroupCalendarAdapter.C7423d) m37664L).f40368b, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m79996pM(View view) {
        C31973j5 m4472f;
        if (m92676n2() != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.f73619Y0) && (m4472f = C0943w.m4462l().m4472f(this.f73619Y0)) != null && m4472f.m153778p0()) {
                bundle.putString("extra_group_id", this.f73619Y0);
            }
            bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 2);
            m92676n2().mo35573l4(ManageCalendarCateEventView.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m79997qM(ArrayList arrayList) {
        this.f73612R0.m37667O(arrayList);
        this.f73612R0.m10008p();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_IS_COMMUNITY")) {
            this.f73621a1 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73610P0 = layoutInflater.inflate(AbstractC7409c0.group_calendar_overview_layout, viewGroup, false);
        m80001nM();
        return this.f73610P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        HandlerThread handlerThread = this.f73613S0;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 3050);
        C23744a.m124114c().m124117e(this, 3051);
        C23744a.m124114c().m124117e(this, 3052);
        C23744a.m124114c().m124117e(this, 27);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (this.f73621a1) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_title_community_calendar));
            }
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.di
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCalendarView.this.m79996pM(view);
                }
            });
        }
        m79994jM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupCalendarView";
    }

    /* renamed from: kM */
    void m79998kM() {
        if (this.f73625e1) {
            return;
        }
        this.f73625e1 = true;
        this.f73624d1 = 1;
        this.f73614T0.removeCallbacks(this.f73623c1);
        this.f73614T0.post(this.f73623c1);
        C19420l c19420l = this.f73616V0;
        C19414f c19414f = new C19414f(0, c19420l.f96350a, c19420l.f96351b, "", 0L, "");
        ArrayList arrayList = new ArrayList();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14330b(arrayList, c19414f, c0766k));
        this.f73626f1 = 0;
        c0766k.mo1709p5(this.f73619Y0, c19414f, "");
    }

    /* renamed from: lM */
    void m79999lM() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(14, AbstractC23160o0.m119255h0(C18408p.m97471K(), calendar.getTimeZone(), calendar.getTimeInMillis()));
        calendar.setTimeZone(C18408p.m97471K());
        AbstractC23160o0.m119301w1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, 400);
        this.f73616V0 = new C19420l(timeInMillis, calendar.getTimeInMillis() - 1);
        m79998kM();
    }

    /* renamed from: mM */
    void m80000mM() {
        m79999lM();
        if (C18418z.m97607b().m97609c(this.f73619Y0, false) == null) {
            C18418z.m97607b().m97608a(this.f73619Y0);
        }
    }

    /* renamed from: nM */
    void m80001nM() {
        this.f73611Q0 = (RecyclerView) this.f73610P0.findViewById(AbstractC6918a0.listView);
        this.f73611Q0.setLayoutManager(new LinearLayoutManager(getContext()));
        GroupCalendarAdapter groupCalendarAdapter = new GroupCalendarAdapter(getContext(), new ArrayList(), this.f73621a1);
        this.f73612R0 = groupCalendarAdapter;
        this.f73611Q0.setAdapter(groupCalendarAdapter);
        C31784b.m152808a(this.f73611Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.ci
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                GroupCalendarView.this.m79995oM(recyclerView, i11, view);
            }
        });
    }

    /* renamed from: rM */
    void m80002rM(Bundle bundle, int i11) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("extra_group_id", this.f73619Y0);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putString("STR_EXTRA_REPEAT_RULE", "[\"RRULE:FREQ=YEARLY\"]");
        if (!bundle.containsKey("EXTRA_EMOJI")) {
            bundle.putString("EXTRA_EMOJI", "🌟");
        }
        bundle.putInt("INT_EXTRA_ALLDAY", 1);
        m92662fJ().m93069k2(QuickCreateReminderView.class, bundle, 2, true);
    }

    /* renamed from: sM */
    void m80003sM() {
        Bundle bundle = new Bundle();
        bundle.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 5);
        bundle.putString("extra_group_id", this.f73619Y0);
        m92662fJ().m93069k2(MyCalendarView.class, bundle, 1, true);
    }

    /* renamed from: tM */
    void m80004tM() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", this.f73619Y0);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 8);
        bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
        m92662fJ().m93069k2(GroupReminderComposeView.class, bundle, 1, true);
    }

    /* renamed from: uM */
    void m80005uM() {
        try {
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new GroupCalendarAdapter.C7425f());
            arrayList.add(new GroupCalendarAdapter.C7429j());
            arrayList.add(new GroupCalendarAdapter.C7426g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_upcoming_reminder)));
            arrayList.add(new GroupCalendarAdapter.C7420a(1));
            Iterator it = this.f73615U0.iterator();
            while (it.hasNext()) {
                arrayList.add(new GroupCalendarAdapter.C7423d((C19411c) it.next(), 0));
            }
            arrayList.add(new GroupCalendarAdapter.C7428i(1));
            arrayList.add(new GroupCalendarAdapter.C7429j());
            arrayList.add(new GroupCalendarAdapter.C7426g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_anniversary)));
            arrayList.add(new GroupCalendarAdapter.C7420a(2));
            int i11 = this.f73624d1;
            if (i11 == 0) {
                Iterator it2 = this.f73617W0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new GroupCalendarAdapter.C7423d((C19411c) it2.next(), 1));
                }
                ArrayList arrayList2 = this.f73618X0;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    arrayList.add(new GroupCalendarAdapter.C7430k());
                    Iterator it3 = this.f73618X0.iterator();
                    GroupCalendarAdapter.C7431l c7431l = null;
                    while (it3.hasNext()) {
                        GroupCalendarAdapter.C7431l c7431l2 = new GroupCalendarAdapter.C7431l((C19419k) it3.next());
                        arrayList.add(c7431l2);
                        c7431l = c7431l2;
                    }
                    if (c7431l != null) {
                        c7431l.f40375c = true;
                    }
                }
            } else {
                arrayList.add(new GroupCalendarAdapter.C7427h(i11));
            }
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ei
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCalendarView.this.m79997qM(arrayList);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0005. Please report as an issue. */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 27) {
                switch (i11) {
                    case 3050:
                    case 3051:
                        m79999lM();
                        break;
                    case 3052:
                        if (this.f73619Y0.equals((String) objArr[0])) {
                            this.f73614T0.removeCallbacks(this.f73623c1);
                            this.f73614T0.post(this.f73623c1);
                            break;
                        }
                        break;
                    default:
                        return;
                }
            } else if (objArr != null) {
                if (objArr.length >= 3) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                    boolean contains = arrayList.contains(CoreUtility.f89233i);
                    if (this.f73619Y0.equals(str) && !arrayList.isEmpty() && intValue == 4 && contains) {
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
            if (m92642L3.containsKey("extra_group_id")) {
                this.f73619Y0 = m92642L3.getString("extra_group_id");
                this.f73620Z0 = C0943w.m4462l().m4472f(this.f73619Y0);
            }
            C0815e1.m2075D().m2100V(new C23648e(3, m92642L3.getString("STR_SOURCE_START_VIEW", ""), 1, "gr_calendar_list", m92642L3.getString("STR_LOG_CHAT_TYPE", "0")), false);
        }
        HandlerThread handlerThread = new HandlerThread("Z:GroupCalendar", 1);
        this.f73613S0 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f73613S0.getLooper());
        this.f73614T0 = handler;
        handler.removeCallbacks(this.f73623c1);
        this.f73614T0.post(this.f73623c1);
        m80000mM();
        m79994jM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 3050);
        C23744a.m124114c().m124115b(this, 3051);
        C23744a.m124114c().m124115b(this, 3052);
        C23744a.m124114c().m124115b(this, 27);
    }
}
