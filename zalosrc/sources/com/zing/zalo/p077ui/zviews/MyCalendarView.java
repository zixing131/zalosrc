package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.InterfaceC1614w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.calendar.adapters.CalendarEventAdapter;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.moduleview.calendar.MonthModulesView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ee.C18408p;
import ge.C19411c;
import ge.C19412d;
import ge.C19413e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23178p7;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import p159fe.C18890b;
import p175g0.AbstractC19181d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p500s1.C26087b;
import p716zh.C31973j5;
import sa0.C26203c;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.C28212v6;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MyCalendarView extends SlidableZaloView implements TouchInterceptionFrameLayout.InterfaceC13549b, View.OnClickListener, C23744a.c, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: U1 */
    static final Interpolator f75436U1 = new C26087b();

    /* renamed from: A1 */
    View f75437A1;

    /* renamed from: B1 */
    View f75438B1;

    /* renamed from: C1 */
    View f75439C1;

    /* renamed from: D1 */
    View f75440D1;

    /* renamed from: E1 */
    RobotoTextView f75441E1;

    /* renamed from: G1 */
    View f75443G1;

    /* renamed from: H1 */
    String f75444H1;

    /* renamed from: I1 */
    C31973j5 f75445I1;

    /* renamed from: K1 */
    ActionBarMenuItem f75447K1;

    /* renamed from: Q0 */
    View f75454Q0;

    /* renamed from: Q1 */
    C13306b f75455Q1;

    /* renamed from: R0 */
    ViewPager f75456R0;

    /* renamed from: S0 */
    C18890b f75458S0;

    /* renamed from: T0 */
    RecyclerView f75460T0;

    /* renamed from: U0 */
    CalendarEventAdapter f75462U0;

    /* renamed from: V0 */
    View f75463V0;

    /* renamed from: W0 */
    View f75464W0;

    /* renamed from: Z0 */
    Handler f75467Z0;

    /* renamed from: d1 */
    boolean f75471d1;

    /* renamed from: e1 */
    int f75472e1;

    /* renamed from: f1 */
    float f75473f1;

    /* renamed from: g1 */
    float f75474g1;

    /* renamed from: i1 */
    TouchInterceptionFrameLayout f75476i1;

    /* renamed from: j1 */
    boolean f75477j1;

    /* renamed from: v1 */
    View f75489v1;

    /* renamed from: w1 */
    TextView f75490w1;

    /* renamed from: x1 */
    TextView f75491x1;

    /* renamed from: y1 */
    Calendar f75492y1;

    /* renamed from: z1 */
    Calendar f75493z1;

    /* renamed from: P0 */
    public int f75452P0 = AbstractC23309i.m121328Q();

    /* renamed from: X0 */
    boolean f75465X0 = false;

    /* renamed from: Y0 */
    Handler f75466Y0 = new Handler(Looper.getMainLooper());

    /* renamed from: a1 */
    volatile boolean f75468a1 = false;

    /* renamed from: b1 */
    volatile boolean f75469b1 = false;

    /* renamed from: c1 */
    volatile boolean f75470c1 = false;

    /* renamed from: h1 */
    boolean f75475h1 = false;

    /* renamed from: k1 */
    boolean f75478k1 = false;

    /* renamed from: l1 */
    float f75479l1 = 0.0f;

    /* renamed from: m1 */
    float f75480m1 = 0.0f;

    /* renamed from: n1 */
    int f75481n1 = 0;

    /* renamed from: o1 */
    float f75482o1 = 0.0f;

    /* renamed from: p1 */
    int f75483p1 = 0;

    /* renamed from: q1 */
    int f75484q1 = 0;

    /* renamed from: r1 */
    int f75485r1 = 1;

    /* renamed from: s1 */
    boolean f75486s1 = false;

    /* renamed from: t1 */
    boolean f75487t1 = false;

    /* renamed from: u1 */
    int f75488u1 = 0;

    /* renamed from: F1 */
    boolean f75442F1 = false;

    /* renamed from: J1 */
    int f75446J1 = 0;

    /* renamed from: L1 */
    boolean f75448L1 = true;

    /* renamed from: M1 */
    long f75449M1 = 200;

    /* renamed from: N1 */
    HashMap f75450N1 = new HashMap();

    /* renamed from: O1 */
    Rect f75451O1 = new Rect();

    /* renamed from: P1 */
    int f75453P1 = -1;

    /* renamed from: R1 */
    C13306b.c f75457R1 = new C14675k();

    /* renamed from: S1 */
    final Runnable f75459S1 = new RunnableC14665a();

    /* renamed from: T1 */
    final Runnable f75461T1 = new RunnableC14666b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$a */
    /* loaded from: classes6.dex */
    public class RunnableC14665a implements Runnable {
        RunnableC14665a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m82106b(List list) {
            int i11;
            try {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) MyCalendarView.this.f75460T0.getLayoutManager();
                int m9740Y1 = linearLayoutManager.m9740Y1();
                if (m9740Y1 >= 0) {
                    View mo9732P = linearLayoutManager.mo9732P(m9740Y1);
                    if (mo9732P != null) {
                        i11 = mo9732P.getTop();
                    } else {
                        i11 = 0;
                    }
                    int mo10005m = MyCalendarView.this.f75462U0.mo10005m(m9740Y1);
                    if (mo10005m == 6 || mo10005m == 4 || mo10005m == 5) {
                        mo10005m = 2;
                    }
                    long m101528c = MyCalendarView.this.f75462U0.m37637Q(m9740Y1).f96320b.m101528c();
                    String str = MyCalendarView.this.f75462U0.m37637Q(m9740Y1).f96320b.f96261a;
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTimeInMillis(m101528c);
                    MyCalendarView.this.f75462U0.m37641V(list);
                    MyCalendarView.this.f75462U0.m10008p();
                    MyCalendarView.this.m82086TM(gregorianCalendar, str, new int[]{mo10005m, 4}, i11);
                } else {
                    MyCalendarView.this.f75462U0.m37641V(list);
                    MyCalendarView.this.f75462U0.m10008p();
                }
                MyCalendarView.this.m82094bN();
                if (MyCalendarView.this.f75468a1) {
                    MyCalendarView.this.f75468a1 = false;
                    MyCalendarView myCalendarView = MyCalendarView.this;
                    myCalendarView.f75467Z0.removeCallbacks(myCalendarView.f75459S1);
                    MyCalendarView myCalendarView2 = MyCalendarView.this;
                    myCalendarView2.f75467Z0.post(myCalendarView2.f75459S1);
                    return;
                }
                MyCalendarView.this.f75469b1 = false;
            } catch (Exception e11) {
                if (MyCalendarView.this.f75468a1) {
                    MyCalendarView.this.f75468a1 = false;
                    MyCalendarView myCalendarView3 = MyCalendarView.this;
                    myCalendarView3.f75467Z0.removeCallbacks(myCalendarView3.f75459S1);
                    MyCalendarView myCalendarView4 = MyCalendarView.this;
                    myCalendarView4.f75467Z0.post(myCalendarView4.f75459S1);
                } else {
                    MyCalendarView.this.f75469b1 = false;
                }
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final List m82098tM;
            MyCalendarView myCalendarView = MyCalendarView.this;
            if (myCalendarView.f75446J1 == 0) {
                m82098tM = myCalendarView.m82098tM(C18408p.m97474Q().m97512M());
            } else {
                m82098tM = myCalendarView.m82098tM(C18408p.m97474Q().m97513N(MyCalendarView.this.f75444H1));
            }
            MyCalendarView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.p00
                @Override // java.lang.Runnable
                public final void run() {
                    MyCalendarView.RunnableC14665a.this.m82106b(m82098tM);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$b */
    /* loaded from: classes6.dex */
    public class RunnableC14666b implements Runnable {
        RunnableC14666b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82111e(boolean z11) {
            MyCalendarView.this.m82090XM(z11, 0L, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82112f() {
            MyCalendarView.this.m82100vM(-1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m82113g(View view) {
            String str;
            if (!MyCalendarView.this.f75470c1) {
                return;
            }
            if (MyCalendarView.this.f75465X0) {
                str = "77700008";
            } else {
                str = "77700007";
            }
            AbstractC23647d.m123897g(str);
            MyCalendarView.this.f75460T0.m9866X1();
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75456R0.setCurrentItem(myCalendarView.f75458S0.m99045x(myCalendarView.f75492y1), false);
            MyCalendarView.this.m82090XM(!r5.f75465X0, 300L, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m82114h(List list, List list2) {
            String str;
            boolean z11;
            boolean z12;
            try {
                MyCalendarView.this.f75462U0.m37641V(list);
                MyCalendarView.this.f75458S0.m99046y(list2);
                MyCalendarView.this.f75462U0.m10008p();
                MyCalendarView.this.f75458S0.mo35341m();
                MyCalendarView myCalendarView = MyCalendarView.this;
                myCalendarView.f75458S0.f94314x = true;
                myCalendarView.f75442F1 = true;
                Bundle m92642L3 = myCalendarView.f72421L0.m92642L3();
                Calendar calendar = Calendar.getInstance();
                if (m92642L3 != null) {
                    if (m92642L3.containsKey("LONG_EXTRA_DATE_TO_JUMP_CALENDAR")) {
                        calendar.setTimeInMillis(m92642L3.getLong("LONG_EXTRA_DATE_TO_JUMP_CALENDAR"));
                        AbstractC23160o0.m119301w1(calendar);
                    }
                    if (MyCalendarView.this.f75446J1 == 0 && m92642L3.containsKey("BOL_EXTRA_IS_OPEN_MONTH_VIEW_CALENDAR")) {
                        final boolean z13 = m92642L3.getBoolean("BOL_EXTRA_IS_OPEN_MONTH_VIEW_CALENDAR");
                        MyCalendarView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.r00
                            @Override // java.lang.Runnable
                            public final void run() {
                                MyCalendarView.RunnableC14666b.this.m82111e(z13);
                            }
                        });
                    }
                    if (m92642L3.containsKey("BOL_EXTRA_IS_JUMP_TO_OCCURRING_CALENDAR")) {
                        z12 = m92642L3.getBoolean("BOL_EXTRA_IS_JUMP_TO_OCCURRING_CALENDAR");
                    } else {
                        z12 = false;
                    }
                    if (m92642L3.containsKey("STR_EXTRA_EID_TO_JUMP_CALENDAR")) {
                        str = m92642L3.getString("STR_EXTRA_EID_TO_JUMP_CALENDAR");
                        z11 = true;
                    } else {
                        str = null;
                        z11 = false;
                    }
                } else {
                    str = null;
                    z11 = false;
                    z12 = false;
                }
                int m99045x = MyCalendarView.this.f75458S0.m99045x(calendar);
                if (m99045x >= 0) {
                    MyCalendarView.this.f75456R0.setCurrentItem(m99045x, false);
                    if (MyCalendarView.this.f75458S0.f94310t.get(Integer.valueOf(m99045x)) != null) {
                        ((MonthModulesView) MyCalendarView.this.f75458S0.f94310t.get(Integer.valueOf(m99045x))).m69693d0(calendar.getTimeInMillis());
                    }
                    if (C18408p.m97474Q().m97517V() != 1 && !z12) {
                        if (z11) {
                            MyCalendarView myCalendarView2 = MyCalendarView.this;
                            myCalendarView2.m82086TM(calendar, str, new int[]{0}, myCalendarView2.f75462U0.f40287u);
                        } else {
                            MyCalendarView.this.m82085SM(calendar);
                        }
                        MyCalendarView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.s00
                            @Override // java.lang.Runnable
                            public final void run() {
                                MyCalendarView.RunnableC14666b.this.m82112f();
                            }
                        });
                    }
                    MyCalendarView.this.m82087UM(calendar);
                    MyCalendarView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.s00
                        @Override // java.lang.Runnable
                        public final void run() {
                            MyCalendarView.RunnableC14666b.this.m82112f();
                        }
                    });
                }
                MyCalendarView.this.f75470c1 = true;
                MyCalendarView.this.f75437A1.setVisibility(0);
                MyCalendarView.this.f75441E1.setVisibility(8);
                MyCalendarView myCalendarView3 = MyCalendarView.this;
                if (myCalendarView3.f75446J1 == 0) {
                    myCalendarView3.f75437A1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.t00
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MyCalendarView.RunnableC14666b.this.m82113g(view);
                        }
                    });
                    MyCalendarView.this.f75489v1.setVisibility(0);
                } else {
                    myCalendarView3.f75437A1.setOnClickListener(null);
                    MyCalendarView.this.f75489v1.setVisibility(8);
                }
                MyCalendarView.this.f75464W0.setVisibility(8);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                MyCalendarView.this.f72421L0.finish();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final List m82098tM;
            MyCalendarView myCalendarView = MyCalendarView.this;
            if (myCalendarView.f75446J1 == 0) {
                m82098tM = myCalendarView.m82098tM(C18408p.m97474Q().m97512M());
            } else {
                m82098tM = myCalendarView.m82098tM(C18408p.m97474Q().m97513N(MyCalendarView.this.f75444H1));
            }
            final List m82099uM = MyCalendarView.this.m82099uM();
            MyCalendarView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.q00
                @Override // java.lang.Runnable
                public final void run() {
                    MyCalendarView.RunnableC14666b.this.m82114h(m82098tM, m82099uM);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$c */
    /* loaded from: classes6.dex */
    class C14667c implements MonthModulesView.InterfaceC12405a {

        /* renamed from: a */
        final Calendar f75496a = new GregorianCalendar();

        C14667c() {
        }

        @Override // com.zing.zalo.p077ui.moduleview.calendar.MonthModulesView.InterfaceC12405a
        /* renamed from: a */
        public void mo69695a(long j11) {
            this.f75496a.setTimeInMillis(j11);
            MyCalendarView myCalendarView = MyCalendarView.this;
            Calendar calendar = this.f75496a;
            myCalendarView.f75492y1 = calendar;
            myCalendarView.m82085SM(calendar);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$d */
    /* loaded from: classes6.dex */
    class C14668d implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        float f75498p;

        /* renamed from: q */
        float f75499q;

        /* renamed from: r */
        float f75500r;

        /* renamed from: s */
        float f75501s;

        /* renamed from: t */
        int f75502t = 0;

        /* renamed from: u */
        int f75503u = -2;

        C14668d() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            int i12;
            if (MyCalendarView.this.f75465X0 && i11 == 2) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            this.f75502t = i12;
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            float f12 = i11 + f11;
            if (this.f75502t == 1) {
                this.f75499q = MyCalendarView.this.m82078BM();
                float m82077AM = MyCalendarView.this.m82077AM();
                MyCalendarView myCalendarView = MyCalendarView.this;
                this.f75498p = (myCalendarView.f75488u1 + m82077AM) - this.f75499q;
                this.f75500r = myCalendarView.f75456R0.getCurrentItem() - this.f75501s;
                if (this.f75498p != 0.0f) {
                    if (f12 == MyCalendarView.this.f75456R0.getCurrentItem()) {
                        MyCalendarView.this.m82089WM(this.f75499q + this.f75498p, false);
                        MyCalendarView.this.f75480m1 = m82077AM;
                    } else {
                        MyCalendarView.this.m82089WM(this.f75499q + ((this.f75498p * (f12 - this.f75501s)) / this.f75500r), false);
                    }
                }
            }
            this.f75501s = f12;
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            if (MyCalendarView.this.f75465X0) {
                int i12 = this.f75503u;
                if (i11 - i12 == 1) {
                    AbstractC23647d.m123897g("77700010");
                } else if (i11 - i12 == -1) {
                    AbstractC23647d.m123897g("77700011");
                }
                MyCalendarView myCalendarView = MyCalendarView.this;
                if (myCalendarView.f75460T0 != null && myCalendarView.f75462U0 != null) {
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = MyCalendarView.this.f75458S0.m99044w(i11).f96321a;
                    MonthModulesView monthModulesView = (MonthModulesView) MyCalendarView.this.f75458S0.f94310t.get(Integer.valueOf(i11));
                    if (AbstractC23160o0.m119238b1(calendar2, calendar)) {
                        MyCalendarView.this.m82085SM(calendar);
                        if (monthModulesView != null) {
                            monthModulesView.m69693d0(calendar.getTimeInMillis());
                        }
                    } else {
                        MyCalendarView myCalendarView2 = MyCalendarView.this;
                        myCalendarView2.m82085SM(myCalendarView2.f75458S0.m99044w(i11).f96321a);
                        if (monthModulesView != null) {
                            monthModulesView.m69693d0(calendar2.getTimeInMillis());
                        }
                    }
                }
                if (this.f75502t != 1) {
                    MyCalendarView myCalendarView3 = MyCalendarView.this;
                    myCalendarView3.m82089WM(myCalendarView3.m82077AM() + MyCalendarView.this.f75488u1, false);
                }
                MyCalendarView.this.m82094bN();
                MyCalendarView myCalendarView4 = MyCalendarView.this;
                myCalendarView4.f75442F1 = true;
                myCalendarView4.m82083QM();
            }
            this.f75503u = i11;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$e */
    /* loaded from: classes6.dex */
    class C14669e extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        int f75505a = -1;

        /* renamed from: b */
        int f75506b = -1;

        C14669e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int m9740Y1 = linearLayoutManager.m9740Y1();
            int m9745c2 = linearLayoutManager.m9745c2();
            for (int i13 = m9740Y1; i13 <= m9745c2; i13++) {
                try {
                    if (MyCalendarView.this.f75462U0.mo10005m(i13) == 1) {
                        ((CalendarEventAdapter.HeaderEventView) linearLayoutManager.mo9732P(i13)).m37642V(recyclerView.getHeight());
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            boolean z11 = false;
            if (MyCalendarView.this.f75442F1) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(MyCalendarView.this.f75462U0.m37637Q(m9740Y1).f96320b.m101528c());
                gregorianCalendar.add(2, -1);
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                gregorianCalendar2.setTimeInMillis(MyCalendarView.this.f75462U0.m37637Q(m9745c2).f96320b.m101528c());
                gregorianCalendar2.add(2, 1);
                C18408p.m97474Q().m97515T(gregorianCalendar, ((((gregorianCalendar2.get(1) - gregorianCalendar.get(1)) * 12) + gregorianCalendar2.get(2)) - gregorianCalendar.get(2)) + 1);
                MyCalendarView.this.f75442F1 = false;
            }
            int i14 = this.f75505a;
            if (m9740Y1 != i14) {
                if (m9740Y1 < i14) {
                    z11 = true;
                }
                this.f75505a = m9740Y1;
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                gregorianCalendar3.setTimeInMillis(MyCalendarView.this.f75462U0.m37637Q(m9740Y1).f96320b.m101528c());
                Calendar calendar = MyCalendarView.this.f75492y1;
                if (calendar != null && AbstractC23160o0.m119238b1(calendar, gregorianCalendar3)) {
                    if (MyCalendarView.this.f75462U0.mo10005m(m9740Y1) != 1 && MyCalendarView.this.f75462U0.mo10005m(m9740Y1) != 3) {
                        MyCalendarView.this.f75492y1 = gregorianCalendar3;
                    }
                } else {
                    MyCalendarView.this.f75492y1 = (Calendar) gregorianCalendar3.clone();
                    MyCalendarView.this.m82083QM();
                    if (z11) {
                        Calendar calendar2 = (Calendar) gregorianCalendar3.clone();
                        calendar2.add(2, -1);
                        C18408p.m97474Q().m97515T(calendar2, 1);
                    }
                }
            }
            int i15 = this.f75506b;
            if (m9745c2 != i15) {
                if (i15 != -1 && m9745c2 > i15) {
                    GregorianCalendar gregorianCalendar4 = new GregorianCalendar();
                    gregorianCalendar4.setTimeInMillis(MyCalendarView.this.f75462U0.m37637Q(m9745c2).f96320b.m101528c());
                    GregorianCalendar gregorianCalendar5 = new GregorianCalendar();
                    gregorianCalendar5.setTimeInMillis(MyCalendarView.this.f75462U0.m37637Q(this.f75506b).f96320b.m101528c());
                    if (!AbstractC23160o0.m119238b1(gregorianCalendar5, gregorianCalendar4)) {
                        Calendar calendar3 = (Calendar) gregorianCalendar4.clone();
                        calendar3.add(2, 1);
                        C18408p.m97474Q().m97515T(calendar3, 1);
                    }
                }
                this.f75506b = m9745c2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$f */
    /* loaded from: classes6.dex */
    class C14670f implements RecyclerView.InterfaceC1889p {
        C14670f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: b */
        public void mo10173b(View view) {
            int m9817A0 = MyCalendarView.this.f75460T0.m9817A0(view);
            if (m9817A0 >= 0) {
                if (MyCalendarView.this.f75462U0.mo10005m(m9817A0) == 5) {
                    MyCalendarView.this.m82079CM();
                }
                if (AbstractC23160o0.m119247e1(MyCalendarView.this.f75462U0.m37637Q(m9817A0).f96320b.m101528c())) {
                    MyCalendarView.this.m82100vM(m9817A0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: d */
        public void mo10174d(View view) {
            if (AbstractC23160o0.m119247e1(MyCalendarView.this.f75462U0.m37637Q(MyCalendarView.this.f75460T0.m9817A0(view)).f96320b.m101528c())) {
                MyCalendarView myCalendarView = MyCalendarView.this;
                myCalendarView.m82097sM(myCalendarView.f75443G1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$g */
    /* loaded from: classes6.dex */
    public class C14671g implements InterfaceC1614w0 {
        C14671g() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            view.setVisibility(8);
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$h */
    /* loaded from: classes6.dex */
    public class C14672h extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f75510p;

        C14672h(boolean z11) {
            this.f75510p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75487t1 = false;
            boolean z11 = this.f75510p;
            myCalendarView.f75465X0 = z11;
            if (z11) {
                myCalendarView.f75480m1 = myCalendarView.m82077AM();
            } else {
                C13306b c13306b = myCalendarView.f75455Q1;
                if (c13306b != null) {
                    c13306b.m74699e("tip.calendar.monthcalendar");
                }
            }
            MyCalendarView.this.m82083QM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$i */
    /* loaded from: classes6.dex */
    public class C14673i extends AnimatorListenerAdapter {
        C14673i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75478k1 = false;
            myCalendarView.f75471d1 = false;
            myCalendarView.f75476i1.setScrollInterceptionListener(myCalendarView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f11;
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75478k1 = false;
            myCalendarView.f75471d1 = false;
            myCalendarView.f75486s1 = false;
            if (myCalendarView.f75465X0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            myCalendarView.m82088VM(f11);
            MyCalendarView myCalendarView2 = MyCalendarView.this;
            myCalendarView2.f75476i1.setScrollInterceptionListener(myCalendarView2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75478k1 = true;
            myCalendarView.f75476i1.setScrollInterceptionListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$j */
    /* loaded from: classes6.dex */
    public class C14674j extends AnimatorListenerAdapter {
        C14674j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75478k1 = false;
            myCalendarView.f75471d1 = false;
            myCalendarView.f75476i1.setScrollInterceptionListener(myCalendarView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                MyCalendarView myCalendarView = MyCalendarView.this;
                myCalendarView.f75478k1 = false;
                myCalendarView.f75471d1 = false;
                myCalendarView.f75486s1 = true;
                myCalendarView.m82090XM(false, 0L, true);
                MyCalendarView myCalendarView2 = MyCalendarView.this;
                myCalendarView2.f75476i1.setScrollInterceptionListener(myCalendarView2);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MyCalendarView myCalendarView = MyCalendarView.this;
            myCalendarView.f75478k1 = true;
            myCalendarView.f75476i1.setScrollInterceptionListener(null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyCalendarView$k */
    /* loaded from: classes6.dex */
    class C14675k extends C13306b.c {
        C14675k() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -2103751960:
                    if (str.equals("tip.event.detail.oa")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 393451969:
                    if (str.equals("tip.calendar.monthcalendar")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 670772412:
                    if (str.equals("tip.event.detail.oa.in.group")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    if (MyCalendarView.this.f75446J1 != 0) {
                        return false;
                    }
                    return true;
                case 1:
                    return !MyCalendarView.this.f75465X0;
                case 2:
                    if (MyCalendarView.this.f75446J1 != 1) {
                        return false;
                    }
                    return true;
                default:
                    return super.mo66900a(c28212v6);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -2103751960:
                    if (str.equals("tip.event.detail.oa")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 393451969:
                    if (str.equals("tip.calendar.monthcalendar")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 670772412:
                    if (str.equals("tip.event.detail.oa.in.group")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                case 2:
                    c26203c.f124525p = -AbstractC23136l9.m118742r(6.0f);
                    return;
                case 1:
                    c26203c.f124513d = AbstractC23136l9.m118742r(2.0f);
                    return;
                default:
                    return;
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
            char c11 = 65535;
            switch (str.hashCode()) {
                case -2103751960:
                    if (str.equals("tip.event.detail.oa")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 393451969:
                    if (str.equals("tip.calendar.monthcalendar")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 670772412:
                    if (str.equals("tip.event.detail.oa.in.group")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                case 2:
                    ActionBarMenuItem actionBarMenuItem = MyCalendarView.this.f75447K1;
                    if (actionBarMenuItem != null) {
                        return new C26209i(actionBarMenuItem);
                    }
                    break;
                case 1:
                    break;
                default:
                    return null;
            }
            C26209i c26209i = new C26209i(MyCalendarView.this.f75437A1);
            if (MyCalendarView.this.f75491x1 != null) {
                Rect rect = new Rect(0, 0, AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(16.0f));
                rect.offset(MyCalendarView.this.f75491x1.getLeft(), MyCalendarView.this.f75491x1.getTop());
                c26209i.f124547b = rect;
            }
            return c26209i;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (MyCalendarView.this.f72421L0.m92672lJ() && MyCalendarView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m82057FM() {
        try {
            if (!this.f72421L0.m92681pJ() && !this.f72421L0.m92677nJ()) {
                m82093aN();
                int i11 = (this.f75483p1 - this.f75484q1) - this.f75485r1;
                this.f75481n1 = i11;
                this.f75482o1 = i11 / 10.0f;
                this.f75479l1 = 0.0f;
                this.f75476i1.setPosition(this.f75480m1);
                m82090XM(false, 0L, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m82058GM(C18408p c18408p) {
        this.f75467Z0.post(this.f75461T1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m82059HM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n00
            @Override // java.lang.Runnable
            public final void run() {
                MyCalendarView.this.m82093aN();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m82060IM() {
        this.f72421L0.showDialog(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m82061JM(MotionEvent motionEvent) {
        if (this.f75475h1) {
            return;
        }
        this.f75471d1 = true;
        float rawY = this.f75474g1 + (motionEvent.getRawY() - this.f75473f1);
        float f11 = this.f75479l1;
        if (rawY < f11) {
            rawY = f11;
        }
        float f12 = this.f75480m1;
        if (rawY > f12) {
            rawY = f12;
        }
        this.f75476i1.setPosition(rawY);
        m82088VM(rawY / this.f75480m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m82062KM(View view) {
        AbstractC23647d.m123897g("77700017");
        ViewPager viewPager = this.f75456R0;
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m82063LM(View view) {
        AbstractC23647d.m123897g("77700016");
        ViewPager viewPager = this.f75456R0;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m82064MM() {
        m82100vM(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m82065NM() {
        m82100vM(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m82066OM(boolean z11, ValueAnimator valueAnimator) {
        m82089WM(((Float) valueAnimator.getAnimatedValue()).floatValue(), z11);
    }

    /* renamed from: AM */
    float m82077AM() {
        int i11;
        float f11 = this.f75480m1;
        MonthModulesView monthModulesView = (MonthModulesView) this.f75458S0.f94310t.get(Integer.valueOf(this.f75456R0.getCurrentItem()));
        if (monthModulesView != null && (i11 = monthModulesView.f84679t) > 0) {
            return i11;
        }
        return f11;
    }

    /* renamed from: BM */
    final float m82078BM() {
        return this.f75488u1 + this.f75463V0.getBottom() + this.f75463V0.getTranslationY();
    }

    /* renamed from: CM */
    void m82079CM() {
        try {
            int i11 = this.f75453P1;
            if (i11 >= 0) {
                if (this.f75462U0.mo10005m(i11) == 5) {
                    this.f75462U0.f40284r.set(this.f75453P1, new C19412d(6, ((C19412d) this.f75462U0.f40284r.get(this.f75453P1)).f96320b));
                }
                this.f75453P1 = -1;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_shortcut)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_msg_create_shortcut_calendar)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_skip), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_create_shortcut_now), this);
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.calendar_instruction_tip_dialog, (ViewGroup) null);
        int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 35.0f);
        aVar2.m43150A(inflate, m118712h, AbstractC23136l9.m118712h(MainApplication.getAppContext(), 16.0f), m118712h, 0);
        aVar2.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), null);
        return aVar2.m43152a();
    }

    /* renamed from: DM */
    void m82080DM() {
        this.f75476i1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.o00
            @Override // java.lang.Runnable
            public final void run() {
                MyCalendarView.this.m82057FM();
            }
        });
    }

    /* renamed from: EM */
    void m82081EM() {
        AbstractC23647d.m123897g("77700018");
        this.f75460T0.m9866X1();
        Calendar calendar = Calendar.getInstance();
        int m99045x = this.f75458S0.m99045x(calendar);
        if (m99045x >= 0) {
            this.f75456R0.setCurrentItem(m99045x, true);
            if (this.f75458S0.f94310t.get(Integer.valueOf(m99045x)) != null) {
                ((MonthModulesView) this.f75458S0.f94310t.get(Integer.valueOf(m99045x))).m69693d0(calendar.getTimeInMillis());
            }
            m82085SM(calendar);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        this.f75447K1 = actionBarMenu.m92738e(990, AbstractC16803z.icn_header_settings_black);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f75493z1 = Calendar.getInstance();
        this.f75488u1 = this.f72421L0.m92651WI().getDimensionPixelSize(AbstractC16802y.func_bar_general_h);
        View inflate = layoutInflater.inflate(AbstractC7409c0.my_calendar_view, viewGroup, false);
        this.f75454Q0 = inflate;
        this.f75456R0 = (ViewPager) inflate.findViewById(AbstractC6918a0.calendar_pager);
        this.f75460T0 = (RecyclerView) this.f75454Q0.findViewById(AbstractC6918a0.event_recycler_view);
        C18890b c18890b = new C18890b(this.f72421L0.getContext(), new ArrayList(), new C18890b.a() { // from class: com.zing.zalo.ui.zviews.l00
            @Override // p159fe.C18890b.a
            /* renamed from: a */
            public final void mo87329a() {
                MyCalendarView.this.m82059HM();
            }
        });
        this.f75458S0 = c18890b;
        c18890b.f94312v = new C14667c();
        this.f75456R0.setAdapter(this.f75458S0);
        this.f75456R0.setOffscreenPageLimit(1);
        this.f75456R0.addOnPageChangeListener(new C14668d());
        CalendarEventAdapter calendarEventAdapter = new CalendarEventAdapter(this.f72421L0.getContext(), m92676n2(), new ArrayList());
        this.f75462U0 = calendarEventAdapter;
        this.f75460T0.setAdapter(calendarEventAdapter);
        this.f75460T0.setHasFixedSize(true);
        this.f75460T0.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
        this.f75460T0.m9826E(new C14669e());
        this.f75460T0.m9822C(new C14670f());
        this.f75462U0.f40285s = new CalendarEventAdapter.InterfaceC7417h() { // from class: com.zing.zalo.ui.zviews.m00
            @Override // com.zing.zalo.calendar.adapters.CalendarEventAdapter.InterfaceC7417h
            /* renamed from: a */
            public final void mo37661a() {
                MyCalendarView.this.m82060IM();
            }
        };
        RecyclerView recyclerView = this.f75460T0;
        recyclerView.m9816A(new C7192r2(recyclerView, this.f75462U0));
        this.f75463V0 = this.f75454Q0.findViewById(AbstractC6918a0.calendar_container);
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = (TouchInterceptionFrameLayout) this.f75454Q0.findViewById(AbstractC6918a0.drag_view);
        this.f75476i1 = touchInterceptionFrameLayout;
        touchInterceptionFrameLayout.setScrollInterceptionListener(this);
        m82080DM();
        m82083QM();
        this.f75464W0 = this.f75454Q0.findViewById(AbstractC6918a0.empty_view);
        View findViewById = this.f75454Q0.findViewById(AbstractC6918a0.btn_jump_today);
        this.f75443G1 = findViewById;
        findViewById.setOnClickListener(this);
        m92637BK(true);
        return this.f75454Q0;
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Jz */
    public void mo71217Jz(View view, final MotionEvent motionEvent, float f11, float f12, boolean z11) {
        this.f75466Y0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.h00
            @Override // java.lang.Runnable
            public final void run() {
                MyCalendarView.this.m82061JM(motionEvent);
            }
        });
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 1) {
            if (i11 == -1) {
                m82104zM();
            }
            interfaceC17463d.dismiss();
            this.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 3050);
        C23744a.m124114c().m124117e(this, 3051);
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        this.f75473f1 = motionEvent.getRawY();
        this.f75474g1 = this.f75476i1.getPosition();
        this.f75475h1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && !this.f75465X0) {
            return true;
        }
        return false;
    }

    /* renamed from: PM */
    void m82082PM() {
        try {
            if (!this.f75470c1) {
                return;
            }
            if (this.f75469b1) {
                this.f75468a1 = true;
            } else {
                this.f75469b1 = true;
                this.f75467Z0.removeCallbacks(this.f75459S1);
                this.f75467Z0.post(this.f75459S1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 != 990) {
                if (i11 == 16908332 && m82103yM()) {
                    return true;
                }
            } else if (this.f72421L0.m92676n2() != null) {
                Bundle bundle = new Bundle();
                C31973j5 c31973j5 = this.f75445I1;
                if (c31973j5 != null && c31973j5.m153778p0()) {
                    bundle.putString("extra_group_id", this.f75444H1);
                }
                bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 1);
                this.f72421L0.m92676n2().mo35573l4(ManageCalendarCateEventView.class, bundle, 1, true);
            }
            return super.mo37491QJ(i11);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: QM */
    void m82083QM() {
        if (this.f75490w1 != null && this.f75491x1 != null) {
            Calendar calendar = this.f75492y1;
            if (this.f75465X0) {
                calendar = new GregorianCalendar();
                calendar.setTimeInMillis(this.f75458S0.m99044w(this.f75456R0.getCurrentItem()).f96321a.getTimeInMillis());
            }
            if (calendar != null) {
                String m119738b = AbstractC23244v8.m119738b(AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full)[calendar.get(2)]);
                this.f75490w1.setText(m119738b + " ");
                this.f75491x1.setText(calendar.get(1) + "");
                return;
            }
            this.f75490w1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_titlebar) + " ");
            this.f75491x1.setText("");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f75455Q1;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    /* renamed from: RM */
    void m82084RM() {
        m82082PM();
        for (Integer num : this.f75458S0.f94310t.keySet()) {
            ((MonthModulesView) this.f75458S0.f94310t.get(num)).m69688W(this.f75458S0.m99044w(num.intValue()));
        }
    }

    /* renamed from: SM */
    void m82085SM(Calendar calendar) {
        try {
            AbstractC23160o0.m119301w1(calendar);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f75460T0.getLayoutManager();
            int m37636P = this.f75462U0.m37636P(calendar.getTimeInMillis(), new int[]{2, 4});
            if (m37636P >= 0) {
                linearLayoutManager.m9721B2(m37636P, 0);
            } else {
                m82079CM();
                int m37634M = this.f75462U0.m37634M(calendar.getTimeInMillis());
                if (m37634M == -1) {
                    return;
                }
                C19411c c19411c = new C19411c();
                c19411c.f96262b = calendar.getTimeInMillis();
                this.f75462U0.f40284r.add(m37634M, new C19412d(5, c19411c));
                this.f75462U0.m10008p();
                linearLayoutManager.m9721B2(m37634M, 0);
                this.f75453P1 = m37634M;
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        MyCalendarView.this.m82064MM();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        TouchInterceptionFrameLayout touchInterceptionFrameLayout;
        try {
            this.f75477j1 = false;
            this.f75475h1 = true;
            this.f75473f1 = 0.0f;
            this.f75474g1 = 0.0f;
            if (this.f75478k1 || (touchInterceptionFrameLayout = this.f75476i1) == null || touchInterceptionFrameLayout.getVisibility() != 0) {
                return;
            }
            float position = this.f75476i1.getPosition();
            if (!z11) {
                if (position > this.f75480m1 - this.f75482o1) {
                    m82092ZM();
                } else if (position > this.f75479l1) {
                    AbstractC23647d.m123897g("77700009");
                    m82091YM();
                } else {
                    AbstractC23647d.m123897g("77700009");
                    this.f75471d1 = false;
                    this.f75486s1 = true;
                    m82090XM(false, 0L, true);
                }
            } else {
                float f11 = this.f75479l1;
                float f12 = this.f75482o1;
                if (position <= f11 + f12) {
                    AbstractC23647d.m123897g("77700009");
                    m82091YM();
                } else {
                    float f13 = this.f75480m1;
                    if (position < f13 || position <= f13 + f12) {
                        m82092ZM();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                this.f88760a0.setBackgroundResource(AbstractC16803z.bg_light_actionbar);
                this.f75438B1 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.actionbar_leftview_calendar_layout, (ViewGroup) null, false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                layoutParams.leftMargin = AbstractC23222t7.f112539R;
                this.f88760a0.m92707b(this.f75438B1, layoutParams);
                View findViewById = this.f75438B1.findViewById(AbstractC6918a0.right_menu_calendar);
                this.f75439C1 = findViewById;
                View findViewById2 = findViewById.findViewById(AbstractC6918a0.navigate_month_calendar);
                this.f75440D1 = findViewById2;
                findViewById2.setAlpha(0.0f);
                ImageView imageView = (ImageView) this.f75440D1.findViewById(AbstractC6918a0.navigate_previous_month);
                ImageView imageView2 = (ImageView) this.f75440D1.findViewById(AbstractC6918a0.navigate_next_month);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.e00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyCalendarView.this.m82062KM(view);
                    }
                });
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.g00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyCalendarView.this.m82063LM(view);
                    }
                });
                View findViewById3 = this.f75438B1.findViewById(AbstractC6918a0.date_picker_spinner_layout);
                this.f75437A1 = findViewById3;
                this.f75490w1 = (TextView) findViewById3.findViewById(AbstractC6918a0.date_picker_tv);
                this.f75491x1 = (TextView) this.f75437A1.findViewById(AbstractC6918a0.date_picker_sub_tv);
                this.f75489v1 = this.f75437A1.findViewById(AbstractC6918a0.date_picker_arrow);
                this.f75441E1 = (RobotoTextView) this.f75438B1.findViewById(AbstractC6918a0.calendar_title);
                m82083QM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    void m82086TM(Calendar calendar, String str, int[] iArr, int i11) {
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f75460T0.getLayoutManager();
            int m37635N = this.f75462U0.m37635N(calendar.getTimeInMillis(), str, iArr);
            if (m37635N < 0) {
                m82085SM(calendar);
            } else {
                linearLayoutManager.m9721B2(m37635N, i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f75455Q1;
        if (c13306b != null) {
            c13306b.m74697c(this.f75457R1);
        }
        C0815e1.m2075D().m2096R(9, System.currentTimeMillis());
    }

    /* renamed from: UM */
    public void m82087UM(Calendar calendar) {
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f75460T0.getLayoutManager();
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(6, 1);
            AbstractC23160o0.m119301w1(calendar2);
            long timeInMillis = calendar2.getTimeInMillis();
            AbstractC23160o0.m119301w1(calendar);
            int m37636P = this.f75462U0.m37636P(calendar.getTimeInMillis(), new int[]{2, 4});
            int i11 = 0;
            if (m37636P >= 0) {
                int i12 = m37636P;
                while (true) {
                    C19412d c19412d = (C19412d) this.f75462U0.f40284r.get(i12);
                    long m101528c = c19412d.f96320b.m101528c();
                    if (c19412d.m101544a() == 0 && c19412d.f96320b.m101529d() == 0) {
                        i11 = this.f75462U0.f40287u;
                        m37636P = i12;
                        break;
                    } else {
                        i12++;
                        if (m101528c > timeInMillis || i12 >= this.f75462U0.f40284r.size()) {
                            break;
                        }
                    }
                }
                linearLayoutManager.m9721B2(m37636P, i11);
                return;
            }
            m82079CM();
            int m37634M = this.f75462U0.m37634M(calendar.getTimeInMillis());
            if (m37634M == -1) {
                return;
            }
            C19411c c19411c = new C19411c();
            c19411c.f96262b = calendar.getTimeInMillis();
            this.f75462U0.f40284r.add(m37634M, new C19412d(5, c19411c));
            this.f75462U0.m10008p();
            linearLayoutManager.m9721B2(m37634M, 0);
            this.f75453P1 = m37634M;
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.f00
                @Override // java.lang.Runnable
                public final void run() {
                    MyCalendarView.this.m82065NM();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f75455Q1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
    }

    /* renamed from: VM */
    final void m82088VM(float f11) {
        if (this.f75489v1 != null) {
            this.f75489v1.setRotation(-(Math.min(1.0f, Math.max(0.0f, f11)) * 180.0f));
        }
        View view = this.f75440D1;
        if (view != null) {
            view.setAlpha(f11);
            if (this.f75440D1.getAlpha() == 0.0f) {
                this.f75440D1.setVisibility(4);
            } else {
                this.f75440D1.setVisibility(0);
            }
        }
    }

    /* renamed from: WM */
    final void m82089WM(float f11, boolean z11) {
        float min = Math.min(Math.max(f11 - this.f75488u1, 0.0f), Math.max(m82078BM() - this.f75488u1, m82077AM()));
        float height = min - this.f75463V0.getHeight();
        this.f75456R0.setTranslationY(-height);
        this.f75463V0.setTranslationY(height);
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f75476i1;
        if (touchInterceptionFrameLayout != null) {
            touchInterceptionFrameLayout.setPosition(min);
        }
        if (z11) {
            m82088VM(min / m82077AM());
        }
    }

    /* renamed from: XM */
    final void m82090XM(boolean z11, long j11, final boolean z12) {
        float f11;
        C13306b c13306b;
        MonthModulesView monthModulesView;
        if (z11) {
            f11 = m82077AM();
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 + this.f75488u1;
        if (j11 == 0) {
            m82089WM(f12, z12);
            this.f75465X0 = z11;
            C13306b c13306b2 = this.f75455Q1;
            if (c13306b2 != null) {
                c13306b2.m74699e("tip.calendar.monthcalendar");
            }
            m82083QM();
        } else if (!this.f75487t1) {
            ValueAnimator duration = ValueAnimator.ofFloat(m82078BM(), f12).setDuration(j11);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.j00
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MyCalendarView.this.m82066OM(z12, valueAnimator);
                }
            });
            this.f75487t1 = true;
            duration.setInterpolator(new DecelerateInterpolator());
            duration.addListener(new C14672h(z11));
            duration.start();
        }
        if (z11 && (monthModulesView = (MonthModulesView) this.f75458S0.f94310t.get(Integer.valueOf(this.f75456R0.getCurrentItem()))) != null) {
            monthModulesView.m69693d0(this.f75492y1.getTimeInMillis());
            m82094bN();
        }
        if (z12 && (c13306b = this.f75455Q1) != null && c13306b.m74706o("tip.calendar.monthcalendar")) {
            this.f75455Q1.m74689E("tip.calendar.monthcalendar");
        }
    }

    /* renamed from: YM */
    public void m82091YM() {
        m82093aN();
        AbstractC23202r9.m119537e(this.f75476i1, null, 300L, null, this.f75479l1, (this.f75483p1 - this.f75481n1) - this.f75484q1, null, 0.0f, new C14674j());
    }

    /* renamed from: ZM */
    public void m82092ZM() {
        m82093aN();
        if (Float.compare(this.f75476i1.getPosition(), this.f75480m1) == 0) {
            return;
        }
        AbstractC23202r9.m119537e(this.f75476i1, null, 300L, null, this.f75480m1, (this.f75483p1 - this.f75481n1) - this.f75484q1, null, 0.0f, new C14673i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aN */
    public void m82093aN() {
        int measuredHeight;
        int i11 = 0;
        if (!this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().getParent() != null && ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight() > 0) {
                View view = this.f75454Q0;
                if (view != null && view.getHeight() > 0) {
                    measuredHeight = this.f75454Q0.getHeight();
                } else {
                    measuredHeight = ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight();
                }
                if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                    i11 = AbstractC23136l9.m118737p0();
                }
                this.f75483p1 = measuredHeight - i11;
            } else {
                this.f75483p1 = this.f72421L0.m92651WI().getDisplayMetrics().heightPixels - AbstractC23136l9.m118737p0();
            }
        } else {
            View findViewById = this.f72421L0.m92676n2().findViewById(AbstractC6918a0.zalo_view_container);
            if (findViewById != null && findViewById.getMeasuredWidth() > 0 && findViewById.getMeasuredHeight() > 0 && (findViewById instanceof UpArrowLayout)) {
                Point pointTo = ((UpArrowLayout) findViewById).getPointTo();
                if (this.f72421L0.m92651WI().getConfiguration().orientation == 1) {
                    this.f75483p1 = findViewById.getMeasuredHeight() - pointTo.y;
                } else {
                    findViewById.getRootView().getWindowVisibleDisplayFrame(this.f75451O1);
                    int measuredHeight2 = findViewById.getMeasuredHeight();
                    if (this.f75451O1.top != 0) {
                        i11 = AbstractC17484n.Companion.m92931b();
                    }
                    this.f75483p1 = measuredHeight2 - i11;
                }
            } else if (this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().getParent() != null) {
                this.f75483p1 = ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight();
            }
        }
        this.f75484q1 = AbstractC23136l9.m118655I(AbstractC19181d.abc_action_bar_default_height_material);
        this.f75480m1 = m82077AM();
    }

    /* renamed from: bN */
    void m82094bN() {
        try {
            int currentItem = this.f75456R0.getCurrentItem();
            MonthModulesView monthModulesView = (MonthModulesView) this.f75458S0.f94310t.get(Integer.valueOf(currentItem));
            if (currentItem >= 0 && monthModulesView != null) {
                monthModulesView.setAllDotVisible(4);
                HashSet hashSet = (HashSet) this.f75450N1.get(Long.valueOf(((Calendar) this.f75458S0.m99044w(currentItem).f96321a.clone()).getTimeInMillis()));
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        monthModulesView.m69694e0(((Long) it.next()).longValue(), 0);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCalendarView";
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        if (!this.f75471d1 && z11 && Math.abs(f12) < this.f75472e1) {
            return false;
        }
        if (this.f75476i1.getPosition() <= this.f75479l1 && !this.f75471d1) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_jump_today) {
            m82081EM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                boolean z11 = this.f75465X0;
                if (z11) {
                    m82090XM(!z11, 300L, true);
                    return true;
                }
                if (m82103yM()) {
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        Calendar calendar = Calendar.getInstance();
        if (AbstractC23160o0.m119233a(this.f75493z1, calendar) != 0) {
            m82084RM();
            this.f75493z1 = calendar;
        }
        if (!AbstractC23160o0.m119241c1(this.f75493z1, calendar)) {
            finish();
            m92662fJ().m93069k2(MyCalendarView.class, null, 1, true);
        }
        C13306b c13306b = this.f75455Q1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }

    /* renamed from: qM */
    void m82095qM(View view) {
        AbstractC1579n0.m7864e(view).m8216c();
    }

    /* renamed from: rM */
    void m82096rM(View view) {
        if (this.f75448L1) {
            this.f75448L1 = false;
            m82095qM(view);
            view.setVisibility(0);
            AbstractC1579n0.m7864e(view).m8227p(0.0f).m8220h(this.f75449M1).m8215b(1.0f).m8221i(f75436U1).m8228q().m8222j(null).m8225n();
        }
    }

    /* renamed from: sM */
    void m82097sM(View view) {
        if (!this.f75448L1) {
            m82095qM(view);
            this.f75448L1 = true;
            AbstractC1579n0.m7864e(view).m8227p(AbstractC23136l9.m118742r(14.0f) + view.getHeight()).m8215b(0.0f).m8220h(this.f75449M1).m8221i(f75436U1).m8228q().m8222j(new C14671g()).m8225n();
        }
    }

    /* renamed from: tM */
    List m82098tM(List list) {
        boolean z11;
        boolean z12;
        long j11;
        GregorianCalendar gregorianCalendar;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        Calendar calendar3 = Calendar.getInstance();
        AbstractC23160o0.m119289s1(calendar2);
        calendar2.add(1, -this.f75452P0);
        AbstractC23160o0.m119298v1(calendar3);
        calendar3.add(1, this.f75452P0);
        long timeInMillis = calendar2.getTimeInMillis();
        long timeInMillis2 = calendar3.getTimeInMillis();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i11 < ((this.f75452P0 * 2) + i13) * 12; i13 = 1) {
            boolean m119238b1 = AbstractC23160o0.m119238b1(calendar2, calendar);
            C19411c c19411c = new C19411c();
            long j12 = timeInMillis;
            c19411c.f96262b = calendar2.getTimeInMillis();
            arrayList.add(new C19412d(1, c19411c));
            ArrayList arrayList2 = new ArrayList();
            int i14 = i12;
            while (true) {
                if (i12 < list.size()) {
                    z11 = m119238b1;
                    long m101528c = ((C19411c) list2.get(i12)).m101528c();
                    gregorianCalendar2.setTimeInMillis(m101528c);
                    if (m101528c >= j12 && m101528c <= timeInMillis2) {
                        if (!AbstractC23160o0.m119238b1(calendar2, gregorianCalendar2)) {
                            break;
                        }
                        arrayList2.add((C19411c) list2.get(i12));
                    } else {
                        list2.remove(i12);
                        i12--;
                        i14--;
                    }
                    i12++;
                    i14++;
                    m119238b1 = z11;
                } else {
                    z11 = m119238b1;
                    break;
                }
            }
            if (arrayList2.size() == 0) {
                arrayList.add(new C19412d(3, c19411c));
                j11 = timeInMillis2;
                z12 = z11;
            } else {
                HashSet hashSet = new HashSet();
                Calendar calendar4 = null;
                z12 = z11;
                int i15 = 0;
                while (i15 < arrayList2.size()) {
                    long j13 = timeInMillis2;
                    gregorianCalendar2.setTimeInMillis(((C19411c) arrayList2.get(i15)).m101528c());
                    if (z12 && AbstractC23160o0.m119233a(calendar, gregorianCalendar2) == -1) {
                        C19411c c19411c2 = new C19411c();
                        c19411c2.f96262b = AbstractC23160o0.m119297v0(calendar.getTimeInMillis());
                        arrayList.add(new C19412d(4, c19411c2));
                        z12 = false;
                    }
                    if (calendar4 != null && AbstractC23160o0.m119235a1(calendar4, gregorianCalendar2)) {
                        gregorianCalendar = gregorianCalendar2;
                    } else {
                        if (z12 && AbstractC23160o0.m119235a1(gregorianCalendar2, calendar)) {
                            z12 = false;
                        }
                        C19411c c19411c3 = new C19411c();
                        c19411c3.f96262b = AbstractC23160o0.m119297v0(((C19411c) arrayList2.get(i15)).m101528c());
                        arrayList.add(new C19412d(2, c19411c3));
                        gregorianCalendar = gregorianCalendar2;
                        calendar4 = (Calendar) gregorianCalendar2.clone();
                        hashSet.add(Long.valueOf(c19411c3.f96262b));
                    }
                    arrayList.add(new C19412d(0, (C19411c) arrayList2.get(i15)));
                    i15++;
                    gregorianCalendar2 = gregorianCalendar;
                    timeInMillis2 = j13;
                }
                j11 = timeInMillis2;
                this.f75450N1.put(Long.valueOf(c19411c.f96262b), hashSet);
            }
            if (z12) {
                C19411c c19411c4 = new C19411c();
                c19411c4.f96262b = AbstractC23160o0.m119297v0(calendar.getTimeInMillis());
                arrayList.add(new C19412d(4, c19411c4));
            }
            calendar2.add(2, 1);
            i11++;
            list2 = list;
            i12 = i14;
            timeInMillis = j12;
            timeInMillis2 = j11;
        }
        C19411c c19411c5 = new C19411c();
        c19411c5.f96262b = calendar2.getTimeInMillis();
        arrayList.add(new C19412d(7, c19411c5));
        return arrayList;
    }

    /* renamed from: uM */
    List m82099uM() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        AbstractC23160o0.m119289s1(calendar);
        calendar.add(1, -this.f75452P0);
        for (int i11 = 0; i11 < ((this.f75452P0 * 2) + 1) * 12; i11++) {
            arrayList.add(new C19413e((Calendar) calendar.clone()));
            calendar.add(2, 1);
        }
        return arrayList;
    }

    /* renamed from: vM */
    void m82100vM(int i11) {
        LinearLayoutManager linearLayoutManager;
        try {
            if (!this.f75470c1) {
                return;
            }
            RecyclerView recyclerView = this.f75460T0;
            if (recyclerView != null) {
                linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int m9745c2 = linearLayoutManager.m9745c2();
                for (int m9740Y1 = linearLayoutManager.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                    if (m9740Y1 != i11 && AbstractC23160o0.m119247e1(this.f75462U0.m37637Q(m9740Y1).f96320b.m101528c())) {
                        return;
                    }
                }
                m82096rM(this.f75443G1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wM */
    boolean m82101wM() {
        if (!AbstractC23309i.m122132lg()) {
            return false;
        }
        AbstractC23309i.m122513vp(false);
        this.f72421L0.showDialog(1);
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 3050) {
                if (i11 == 3051) {
                    m82102xM();
                }
            } else {
                m82082PM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        C31973j5 c31973j5;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("INT_EXTRA_SOURCE_OPEN_CALENDAR")) {
                i11 = m92642L3.getInt("INT_EXTRA_SOURCE_OPEN_CALENDAR");
            } else {
                i11 = 0;
            }
            if (m92642L3.containsKey("extra_group_id")) {
                this.f75444H1 = m92642L3.getString("extra_group_id");
                this.f75445I1 = C0943w.m4462l().m4472f(this.f75444H1);
            }
        } else {
            i11 = 0;
        }
        if (TextUtils.isEmpty(this.f75444H1)) {
            this.f75446J1 = 0;
        } else {
            this.f75446J1 = 1;
        }
        if (AbstractC23309i.m121442T2() && (this.f75446J1 == 0 || ((c31973j5 = this.f75445I1) != null && c31973j5.m153778p0()))) {
            this.f75447K1.setVisibility(0);
        } else {
            this.f75447K1.setVisibility(8);
        }
        this.f75462U0.m37640U(this.f75446J1);
        C18408p.m97474Q().m97525f0(i11);
        this.f75472e1 = ViewConfiguration.get(this.f72421L0.getContext()).getScaledTouchSlop();
        HandlerThread handlerThread = new HandlerThread("Z:MyCalendar-UpdateListEvent", 1);
        handlerThread.start();
        this.f75467Z0 = new Handler(handlerThread.getLooper());
        C18408p.m97474Q().m97523d0();
        C18408p.m97474Q().m97524e0();
        C18408p.m97475R(new C18408p.a.InterfaceC32814a() { // from class: com.zing.zalo.ui.zviews.k00
            @Override // ee.C18408p.a.InterfaceC32814a
            /* renamed from: a */
            public final void mo2271a(C18408p c18408p) {
                MyCalendarView.this.m82058GM(c18408p);
            }
        });
        C13306b c13306b = new C13306b(this.f72421L0.m92648SI());
        this.f75455Q1 = c13306b;
        c13306b.m74687C((ViewGroup) this.f72421L0.m92656bJ());
    }

    /* renamed from: xM */
    void m82102xM() {
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f75460T0.getLayoutManager();
            if (linearLayoutManager == null) {
                return;
            }
            int m9740Y1 = linearLayoutManager.m9740Y1();
            int m9745c2 = linearLayoutManager.m9745c2();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(this.f75462U0.m37637Q(m9740Y1).f96320b.m101528c());
            gregorianCalendar.add(2, -1);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTimeInMillis(this.f75462U0.m37637Q(m9745c2).f96320b.m101528c());
            gregorianCalendar2.add(2, 1);
            C18408p.m97474Q().m97515T(gregorianCalendar, ((((gregorianCalendar2.get(1) - gregorianCalendar.get(1)) * 12) + gregorianCalendar2.get(2)) - gregorianCalendar.get(2)) + 1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yM */
    boolean m82103yM() {
        if (this.f75446J1 != 0 && m82101wM()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 3050);
        C23744a.m124114c().m124115b(this, 3051);
    }

    /* renamed from: zM */
    void m82104zM() {
        AbstractC23178p7.m119403b(this.f72421L0.m92676n2());
    }
}
