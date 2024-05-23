package com.zing.zalo.birthdayhub.view;

import ac.C0732w;
import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.InterfaceC1614w0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7209s8;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.birthdayhub.view.BirthdayHubView;
import com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.SettingManageBirthday;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p227i3.C20218v;
import p363nh.C23744a;
import p480rd.AbstractC25732c;
import p500s1.C26087b;
import p542ub.InterfaceC27218a;
import p544ud.C27236a;
import p544ud.C27237b;
import p606wd.C28918e;
import p649xl.C29737c;
import p649xl.C29792f0;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import v50.C27870vb;

/* loaded from: classes3.dex */
public final class BirthdayHubView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {
    public static final C7367a Companion = new C7367a(null);

    /* renamed from: k1 */
    private static final Interpolator f40123k1 = new C26087b();

    /* renamed from: P0 */
    private C29792f0 f40124P0;

    /* renamed from: Q0 */
    private C29737c f40125Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f40126R0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C28918e.class), new C7384r(new C7383q(this)), C7385s.f40172q);

    /* renamed from: S0 */
    private LinearLayoutManager f40127S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f40128T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f40129U0;

    /* renamed from: V0 */
    private volatile boolean f40130V0;

    /* renamed from: W0 */
    private float f40131W0;

    /* renamed from: X0 */
    private int f40132X0;

    /* renamed from: Y0 */
    private boolean f40133Y0;

    /* renamed from: Z0 */
    private int f40134Z0;

    /* renamed from: a1 */
    private int f40135a1;

    /* renamed from: b1 */
    private Calendar f40136b1;

    /* renamed from: c1 */
    private Calendar f40137c1;

    /* renamed from: d1 */
    private boolean f40138d1;

    /* renamed from: e1 */
    private View f40139e1;

    /* renamed from: f1 */
    private boolean f40140f1;

    /* renamed from: g1 */
    private boolean f40141g1;

    /* renamed from: h1 */
    private final ViewTreeObserverOnGlobalLayoutListenerC7370d f40142h1;

    /* renamed from: i1 */
    private boolean f40143i1;

    /* renamed from: j1 */
    private long f40144j1;

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$a */
    /* loaded from: classes3.dex */
    public static final class C7367a {
        private C7367a() {
        }

        public /* synthetic */ C7367a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$b */
    /* loaded from: classes3.dex */
    public static final class C7368b implements InterfaceC1614w0 {
        C7368b() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
            AbstractC19074t.m100208f(view, "view");
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            AbstractC19074t.m100208f(view, "view");
            view.setVisibility(8);
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$c */
    /* loaded from: classes3.dex */
    static final class C7369c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$c$a */
        /* loaded from: classes3.dex */
        public static final class a implements C27236a.a {

            /* renamed from: a */
            final /* synthetic */ BirthdayHubView f40146a;

            a(BirthdayHubView birthdayHubView) {
                this.f40146a = birthdayHubView;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public static final void m37499c(BirthdayHubView birthdayHubView) {
                AbstractC19074t.m100208f(birthdayHubView, "this$0");
                birthdayHubView.m37489ON();
            }

            @Override // p544ud.C27236a.a
            /* renamed from: a */
            public void mo37500a() {
                final BirthdayHubView birthdayHubView = this.f40146a;
                birthdayHubView.mo70710wy(new Runnable() { // from class: td.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        BirthdayHubView.C7369c.a.m37499c(BirthdayHubView.this);
                    }
                });
            }
        }

        C7369c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27236a mo12V4() {
            Context m92689tK = BirthdayHubView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            return new C27236a(m92689tK, new a(BirthdayHubView.this));
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$d */
    /* loaded from: classes3.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC7370d implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC7370d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view;
            try {
                C29792f0 c29792f0 = BirthdayHubView.this.f40124P0;
                C29792f0 c29792f02 = null;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                if (c29792f0.f137723s.getCurrentItem() >= 0) {
                    HashMap m139355y = BirthdayHubView.this.m37436ZM().m139355y();
                    C29792f0 c29792f03 = BirthdayHubView.this.f40124P0;
                    if (c29792f03 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29792f03 = null;
                    }
                    view = (View) m139355y.get(Integer.valueOf(c29792f03.f137723s.getCurrentItem()));
                } else {
                    view = null;
                }
                if (view == null) {
                    C29792f0 c29792f04 = BirthdayHubView.this.f40124P0;
                    if (c29792f04 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29792f04 = null;
                    }
                    if (c29792f04.f137723s.getChildCount() > 0) {
                        C29792f0 c29792f05 = BirthdayHubView.this.f40124P0;
                        if (c29792f05 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29792f05 = null;
                        }
                        view = c29792f05.f137723s.getChildAt(0);
                    } else {
                        view = null;
                    }
                }
                if (view != null && view.getHeight() > 0) {
                    C29792f0 c29792f06 = BirthdayHubView.this.f40124P0;
                    if (c29792f06 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29792f02 = c29792f06;
                    }
                    ViewTreeObserver viewTreeObserver = c29792f02.f137723s.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                    BirthdayHubView.this.m37486KN(true, 0L, "global-layout");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$e */
    /* loaded from: classes3.dex */
    public static final class C7371e implements C27237b.c {
        C7371e() {
        }

        @Override // p544ud.C27237b.c
        /* renamed from: a */
        public void mo37501a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            BirthdayHubView.this.m37487Kv(contactProfile);
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$f */
    /* loaded from: classes3.dex */
    public static final class C7372f extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private int f40149a = -1;

        /* renamed from: b */
        private int f40150b = -1;

        C7372f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                BirthdayHubView birthdayHubView = BirthdayHubView.this;
                birthdayHubView.m37414IN(birthdayHubView.f40136b1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            int i13;
            int i14;
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (BirthdayHubView.this.f40127S0 != null) {
                    LinearLayoutManager linearLayoutManager = BirthdayHubView.this.f40127S0;
                    if (linearLayoutManager != null) {
                        i13 = linearLayoutManager.m9740Y1();
                    } else {
                        i13 = -1;
                    }
                    LinearLayoutManager linearLayoutManager2 = BirthdayHubView.this.f40127S0;
                    if (linearLayoutManager2 != null) {
                        i14 = linearLayoutManager2.m9745c2();
                    } else {
                        i14 = -1;
                    }
                    BirthdayHubView.this.f40132X0 = i13;
                    BirthdayHubView.this.m37405DN(i13, i14, recyclerView);
                    BirthdayHubView.this.m37467tN(i13, i14);
                    int i15 = this.f40149a;
                    if (i13 != i15) {
                        if (i13 < i15) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f40149a = i13;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.setTimeInMillis(BirthdayHubView.this.m37440eN().m139363Q(i13).m132831b());
                        if (BirthdayHubView.this.f40136b1 != null && AbstractC23160o0.m119238b1(BirthdayHubView.this.f40136b1, gregorianCalendar)) {
                            if (BirthdayHubView.this.m37440eN().mo10005m(i13) != 1 && BirthdayHubView.this.m37440eN().mo10005m(i13) != 5) {
                                BirthdayHubView.this.f40136b1 = gregorianCalendar;
                            }
                        }
                        BirthdayHubView birthdayHubView = BirthdayHubView.this;
                        Object clone = gregorianCalendar.clone();
                        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
                        birthdayHubView.f40136b1 = (Calendar) clone;
                        if (z11) {
                            Object clone2 = gregorianCalendar.clone();
                            AbstractC19074t.m100206d(clone2, "null cannot be cast to non-null type java.util.Calendar");
                            Calendar calendar = (Calendar) clone2;
                            calendar.add(2, -1);
                            BirthdayHubView.this.m37441fN().m144467h0(calendar, 1);
                        }
                    }
                    int i16 = this.f40150b;
                    if (i14 != i16) {
                        if (i16 != -1 && i14 > i16) {
                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                            gregorianCalendar2.setTimeInMillis(BirthdayHubView.this.m37440eN().m139363Q(i14).m132831b());
                            GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                            gregorianCalendar3.setTimeInMillis(BirthdayHubView.this.m37440eN().m139363Q(this.f40150b).m132831b());
                            if (!AbstractC23160o0.m119238b1(gregorianCalendar3, gregorianCalendar2)) {
                                Object clone3 = gregorianCalendar2.clone();
                                AbstractC19074t.m100206d(clone3, "null cannot be cast to non-null type java.util.Calendar");
                                Calendar calendar2 = (Calendar) clone3;
                                calendar2.add(2, 1);
                                BirthdayHubView.this.m37441fN().m144467h0(calendar2, 1);
                            }
                        }
                        this.f40150b = i14;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$g */
    /* loaded from: classes3.dex */
    public static final class C7373g implements RecyclerView.InterfaceC1889p {
        C7373g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: b */
        public void mo10173b(View view) {
            AbstractC19074t.m100208f(view, "view");
            C29792f0 c29792f0 = BirthdayHubView.this.f40124P0;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            int m9817A0 = c29792f0.f137726v.m9817A0(view);
            if (m9817A0 >= 0) {
                AbstractC25732c m139363Q = BirthdayHubView.this.m37440eN().m139363Q(m9817A0);
                if ((m139363Q instanceof AbstractC25732c.b) && ((AbstractC25732c.b) m139363Q).m132832c()) {
                    BirthdayHubView.this.m37495gN();
                }
                if (AbstractC23160o0.m119247e1(BirthdayHubView.this.m37440eN().m139363Q(m9817A0).m132831b())) {
                    BirthdayHubView.this.m37433WM(m9817A0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: d */
        public void mo10174d(View view) {
            AbstractC19074t.m100208f(view, "view");
            C29792f0 c29792f0 = BirthdayHubView.this.f40124P0;
            C29792f0 c29792f02 = null;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            int m9817A0 = c29792f0.f137726v.m9817A0(view);
            if (m9817A0 >= 0 && AbstractC23160o0.m119247e1(BirthdayHubView.this.m37440eN().m139363Q(m9817A0).m132831b())) {
                BirthdayHubView birthdayHubView = BirthdayHubView.this;
                C29792f0 c29792f03 = birthdayHubView.f40124P0;
                if (c29792f03 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29792f02 = c29792f03;
                }
                Button button = c29792f02.f137721q;
                AbstractC19074t.m100207e(button, "btnJumpToday");
                birthdayHubView.m37492SM(button);
            }
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$h */
    /* loaded from: classes3.dex */
    public static final class C7374h implements CalendarMonthModuleView.InterfaceC7388b {

        /* renamed from: a */
        private final Calendar f40153a = new GregorianCalendar();

        C7374h() {
        }

        @Override // com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView.InterfaceC7388b
        /* renamed from: a */
        public void mo37502a(long j11) {
            this.f40153a.setTimeInMillis(j11);
            BirthdayHubView.this.f40136b1 = this.f40153a;
            BirthdayHubView.m37461qN(BirthdayHubView.this, this.f40153a, 0, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$i */
    /* loaded from: classes3.dex */
    public static final class C7375i implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        private float f40155p;

        /* renamed from: q */
        private float f40156q;

        /* renamed from: r */
        private float f40157r;

        /* renamed from: s */
        private float f40158s;

        /* renamed from: t */
        private boolean f40159t;

        /* renamed from: u */
        private int f40160u = -2;

        C7375i() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            boolean z11;
            if (i11 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f40159t = z11;
            BirthdayHubView birthdayHubView = BirthdayHubView.this;
            C29792f0 c29792f0 = birthdayHubView.f40124P0;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            birthdayHubView.m37428RN(c29792f0.f137724t.getTranslationY(), true);
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            float f12 = i11 + f11;
            try {
                if (this.f40159t) {
                    this.f40156q = BirthdayHubView.this.m37438cN();
                    float m37494bN = BirthdayHubView.this.m37494bN();
                    this.f40155p = (BirthdayHubView.this.f40135a1 + m37494bN) - this.f40156q;
                    C29792f0 c29792f0 = BirthdayHubView.this.f40124P0;
                    C29792f0 c29792f02 = null;
                    if (c29792f0 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29792f0 = null;
                    }
                    this.f40157r = c29792f0.f137723s.getCurrentItem() - this.f40158s;
                    if (this.f40155p != 0.0f) {
                        C29792f0 c29792f03 = BirthdayHubView.this.f40124P0;
                        if (c29792f03 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29792f02 = c29792f03;
                        }
                        if (f12 == c29792f02.f137723s.getCurrentItem()) {
                            BirthdayHubView.this.m37485JN(this.f40156q + this.f40155p, "onPageScrolled1");
                            BirthdayHubView.this.f40131W0 = m37494bN;
                        } else {
                            BirthdayHubView.this.m37485JN(this.f40156q + ((this.f40155p * (f12 - this.f40158s)) / this.f40157r), "onPageScrolled2");
                        }
                    }
                }
                this.f40158s = f12;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            Calendar m132822a = BirthdayHubView.this.m37436ZM().m139354x(i11).m132822a();
            if (!BirthdayHubView.this.f40140f1) {
                Calendar calendar = Calendar.getInstance();
                CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) BirthdayHubView.this.m37436ZM().m139355y().get(Integer.valueOf(i11));
                if (AbstractC23160o0.m119238b1(m132822a, calendar)) {
                    BirthdayHubView birthdayHubView = BirthdayHubView.this;
                    AbstractC19074t.m100205c(calendar);
                    BirthdayHubView.m37461qN(birthdayHubView, calendar, 0, 2, null);
                    if (calendarMonthModuleView != null) {
                        calendarMonthModuleView.m37521e0(calendar.getTimeInMillis());
                    }
                } else {
                    BirthdayHubView.m37461qN(BirthdayHubView.this, m132822a, 0, 2, null);
                    if (calendarMonthModuleView != null) {
                        calendarMonthModuleView.m37521e0(m132822a.getTimeInMillis());
                    }
                }
                if (!this.f40159t) {
                    BirthdayHubView birthdayHubView2 = BirthdayHubView.this;
                    birthdayHubView2.m37485JN(birthdayHubView2.m37494bN() + BirthdayHubView.this.f40135a1, "onPageSelected");
                }
                if (Math.abs(i11 - this.f40160u) == 1 && !BirthdayHubView.this.f40141g1) {
                    BirthdayHubView.this.m37422NN();
                }
            }
            BirthdayHubView.this.f40140f1 = false;
            BirthdayHubView.this.f40141g1 = false;
            BirthdayHubView.this.m37481EN(m132822a);
            BirthdayHubView.this.m37490PN();
            BirthdayHubView.this.f40138d1 = true;
            BirthdayHubView.this.m37426QN(i11);
            this.f40160u = i11;
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$j */
    /* loaded from: classes3.dex */
    static final class C7376j extends AbstractC19075u implements InterfaceC18494a {
        C7376j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27237b mo12V4() {
            Context m92689tK = BirthdayHubView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            return new C27237b(m92689tK);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$k */
    /* loaded from: classes3.dex */
    public static final class C7377k extends AbstractC19075u implements InterfaceC18505l {
        C7377k() {
            super(1);
        }

        /* renamed from: a */
        public final void m37504a(C24860q c24860q) {
            BirthdayHubView.this.m37430TM((List) c24860q.m129215c(), (List) c24860q.m129216d());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37504a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$l */
    /* loaded from: classes3.dex */
    public static final class C7378l extends AbstractC19075u implements InterfaceC18505l {
        C7378l() {
            super(1);
        }

        /* renamed from: a */
        public final void m37505a(List list) {
            BirthdayHubView birthdayHubView = BirthdayHubView.this;
            AbstractC19074t.m100205c(list);
            birthdayHubView.m37432VM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37505a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$m */
    /* loaded from: classes3.dex */
    public static final class C7379m extends AbstractC19075u implements InterfaceC18505l {
        C7379m() {
            super(1);
        }

        /* renamed from: a */
        public final void m37506a(Boolean bool) {
            if (!bool.booleanValue()) {
                BirthdayHubView.this.m37434XM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37506a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$n */
    /* loaded from: classes3.dex */
    public static final class C7380n extends AbstractC19075u implements InterfaceC18505l {
        C7380n() {
            super(1);
        }

        /* renamed from: a */
        public final void m37507a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                BirthdayHubView.this.m37410GN();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37507a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$o */
    /* loaded from: classes3.dex */
    public static final class C7381o implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f40167p;

        C7381o(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f40167p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f40167p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f40167p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$p */
    /* loaded from: classes3.dex */
    public static final class C7382p extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ boolean f40169q;

        C7382p(boolean z11) {
            this.f40169q = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            BirthdayHubView.this.f40133Y0 = false;
            if (this.f40169q) {
                BirthdayHubView birthdayHubView = BirthdayHubView.this;
                birthdayHubView.f40131W0 = birthdayHubView.m37494bN();
            }
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$q */
    /* loaded from: classes3.dex */
    public static final class C7383q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f40170q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7383q(ZaloView zaloView) {
            super(0);
            this.f40170q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f40170q;
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$r */
    /* loaded from: classes3.dex */
    public static final class C7384r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f40171q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7384r(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f40171q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f40171q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.birthdayhub.view.BirthdayHubView$s */
    /* loaded from: classes3.dex */
    static final class C7385s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7385s f40172q = new C7385s();

        C7385s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C28918e.c();
        }
    }

    public BirthdayHubView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C7369c());
        this.f40128T0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C7376j());
        this.f40129U0 = m129210a2;
        this.f40132X0 = -1;
        this.f40134Z0 = -1;
        this.f40142h1 = new ViewTreeObserverOnGlobalLayoutListenerC7370d();
        this.f40143i1 = true;
        this.f40144j1 = 200L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m37400AN(BirthdayHubView birthdayHubView, View view) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        C29792f0 c29792f0 = birthdayHubView.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        ViewPager viewPager = c29792f0.f137723s;
        C29792f0 c29792f03 = birthdayHubView.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29792f02 = c29792f03;
        }
        viewPager.setCurrentItem(c29792f02.f137723s.getCurrentItem() + 1, true);
    }

    /* renamed from: CN */
    private final void m37403CN() {
        try {
            if (!this.f40130V0) {
                return;
            }
            m37441fN().m144463D0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public final void m37405DN(int i11, int i12, RecyclerView recyclerView) {
        if (i11 > i12) {
            return;
        }
        while (true) {
            try {
                C29792f0 c29792f0 = this.f40124P0;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                RecyclerView.AbstractC1876c0 m9900t0 = c29792f0.f137726v.m9900t0(i11);
                if (m9900t0 instanceof C27237b.i) {
                    ((C27237b.i) m9900t0).m139372k0(recyclerView.getHeight());
                }
                if (i11 != i12) {
                    i11++;
                } else {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
                return;
            }
        }
    }

    /* renamed from: FN */
    public static /* synthetic */ void m37408FN(BirthdayHubView birthdayHubView, Calendar calendar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            calendar = null;
        }
        birthdayHubView.m37481EN(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public final void m37410GN() {
        int i11;
        try {
            LinearLayoutManager linearLayoutManager = this.f40127S0;
            int i12 = -1;
            if (linearLayoutManager != null) {
                i11 = linearLayoutManager.m9740Y1();
            } else {
                i11 = -1;
            }
            LinearLayoutManager linearLayoutManager2 = this.f40127S0;
            if (linearLayoutManager2 != null) {
                i12 = linearLayoutManager2.m9745c2();
            }
            if (i11 >= 0 && i12 < m37440eN().mo10003k()) {
                this.f40138d1 = true;
                m37467tN(i11, i12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: HN */
    private final void m37412HN() {
        C23744a.Companion.m124119a().m124117e(this, 65);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public final void m37414IN(Calendar calendar) {
        if (calendar != null) {
            int m139356z = m37436ZM().m139356z(calendar);
            C29792f0 c29792f0 = this.f40124P0;
            C29792f0 c29792f02 = null;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            if (c29792f0.f137723s.getCurrentItem() != m139356z) {
                this.f40140f1 = true;
                C29792f0 c29792f03 = this.f40124P0;
                if (c29792f03 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29792f02 = c29792f03;
                }
                c29792f02.f137723s.setCurrentItem(m139356z, true);
            }
            CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m37436ZM().m139355y().get(Integer.valueOf(m139356z));
            if (calendarMonthModuleView != null) {
                calendarMonthModuleView.m37521e0(calendar.getTimeInMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public static final void m37418LN(BirthdayHubView birthdayHubView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        birthdayHubView.m37485JN(((Float) animatedValue).floatValue(), "openCalendarViewWithAnim_Yes");
    }

    /* renamed from: MN */
    private final void m37420MN(boolean z11) {
        LinearLayout linearLayout;
        int i11;
        C29737c c29737c = this.f40125Q0;
        if (c29737c != null && (linearLayout = c29737c.f137372t) != null) {
            if (!z11) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public final void m37422NN() {
        C0732w.Companion.m1189a().m1187q("birthday_hub_swipe_calendar", "", null, null);
    }

    /* renamed from: QM */
    private final void m37425QM(View view) {
        AbstractC1579n0.m7864e(view).m8216c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public final void m37426QN(int i11) {
        boolean z11;
        AppCompatImageView appCompatImageView;
        boolean z12 = false;
        if (i11 != 0 && !m37456nN()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C29737c c29737c = this.f40125Q0;
        AppCompatImageView appCompatImageView2 = null;
        if (c29737c != null) {
            appCompatImageView = c29737c.f137374v;
        } else {
            appCompatImageView = null;
        }
        m37435YM(appCompatImageView, z11);
        if (i11 != m37436ZM().mo35335g() - 1 && !m37456nN()) {
            z12 = true;
        }
        C29737c c29737c2 = this.f40125Q0;
        if (c29737c2 != null) {
            appCompatImageView2 = c29737c2.f137373u;
        }
        m37435YM(appCompatImageView2, z12);
    }

    /* renamed from: RM */
    private final void m37427RM(View view) {
        if (this.f40143i1) {
            this.f40143i1 = false;
            m37425QM(view);
            view.setVisibility(0);
            AbstractC1579n0.m7864e(view).m8227p(0.0f).m8220h(this.f40144j1).m8215b(1.0f).m8221i(f40123k1).m8228q().m8222j(null).m8225n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public final void m37428RN(float f11, boolean z11) {
        int i11;
        C29792f0 c29792f0 = this.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29792f0.f137726v.getLayoutParams();
        if (layoutParams != null) {
            C29792f0 c29792f03 = this.f40124P0;
            if (c29792f03 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f03 = null;
            }
            int height = (int) (c29792f03.f137724t.getHeight() - f11);
            if (height > 0 && (i11 = layoutParams.height) != height) {
                if (z11 || height > i11) {
                    layoutParams.height = height;
                    C29792f0 c29792f04 = this.f40124P0;
                    if (c29792f04 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29792f02 = c29792f04;
                    }
                    c29792f02.f137726v.requestLayout();
                }
            }
        }
    }

    /* renamed from: SN */
    static /* synthetic */ void m37429SN(BirthdayHubView birthdayHubView, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        birthdayHubView.m37428RN(f11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public final void m37430TM(List list, List list2) {
        LinearLayout linearLayout;
        try {
            m37440eN().m139364S(list2);
            m37440eN().m10008p();
            m37436ZM().m139350A(list);
            m37436ZM().mo35341m();
            m37436ZM().m139352C(true);
            this.f40138d1 = true;
            Calendar calendar = Calendar.getInstance();
            m37471vN();
            int m139356z = m37436ZM().m139356z(calendar);
            if (m139356z >= 0) {
                C29792f0 c29792f0 = this.f40124P0;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                c29792f0.f137723s.setCurrentItem(m139356z, false);
                CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m37436ZM().m139355y().get(Integer.valueOf(m139356z));
                if (calendarMonthModuleView != null) {
                    calendarMonthModuleView.m37521e0(calendar.getTimeInMillis());
                }
                AbstractC19074t.m100205c(calendar);
                m37461qN(this, calendar, 0, 2, null);
                mo78955kl(new Runnable() { // from class: td.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BirthdayHubView.m37431UM(BirthdayHubView.this);
                    }
                }, 100L);
            }
            this.f40130V0 = true;
            C29737c c29737c = this.f40125Q0;
            if (c29737c != null && (linearLayout = c29737c.f137369q) != null) {
                linearLayout.setVisibility(0);
            }
            m37420MN(true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
            this.f72421L0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m37431UM(BirthdayHubView birthdayHubView) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        birthdayHubView.m37433WM(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public final void m37432VM(List list) {
        View view;
        int i11;
        try {
            int m37439dN = m37439dN();
            if (m37439dN >= 0 && m37439dN < m37440eN().mo10003k()) {
                LinearLayoutManager linearLayoutManager = this.f40127S0;
                if (linearLayoutManager != null) {
                    view = linearLayoutManager.mo9732P(m37439dN);
                } else {
                    view = null;
                }
                if (view != null) {
                    i11 = view.getTop();
                } else {
                    i11 = 0;
                }
                int mo10005m = m37440eN().mo10005m(m37439dN);
                if (mo10005m == 3 || mo10005m == 4 || mo10005m == 8) {
                    mo10005m = 2;
                }
                long m132831b = m37440eN().m139363Q(m37439dN).m132831b();
                String mo132830a = m37440eN().m139363Q(m37439dN).mo132830a();
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(m132831b);
                m37440eN().m139364S(list);
                m37440eN().m10008p();
                m37465sN(gregorianCalendar, mo132830a, new int[]{mo10005m, 3}, i11);
            } else {
                m37440eN().m139364S(list);
                m37440eN().m10008p();
            }
            m37490PN();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public final void m37433WM(int i11) {
        LinearLayoutManager linearLayoutManager;
        int i12;
        try {
            if (!this.f40130V0 || (linearLayoutManager = this.f40127S0) == null) {
                return;
            }
            int i13 = -1;
            if (linearLayoutManager != null) {
                i12 = linearLayoutManager.m9740Y1();
            } else {
                i12 = -1;
            }
            LinearLayoutManager linearLayoutManager2 = this.f40127S0;
            if (linearLayoutManager2 != null) {
                i13 = linearLayoutManager2.m9745c2();
            }
            if (i12 >= 0 && i13 >= 0) {
                if (i12 <= i13) {
                    while (true) {
                        if (i12 == i11 || !AbstractC23160o0.m119247e1(m37440eN().m139363Q(i12).m132831b())) {
                            if (i12 == i13) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            return;
                        }
                    }
                }
                C29792f0 c29792f0 = this.f40124P0;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                Button button = c29792f0.f137721q;
                AbstractC19074t.m100207e(button, "btnJumpToday");
                m37427RM(button);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public final void m37434XM() {
        if (m37456nN()) {
            m37444hN();
        }
    }

    /* renamed from: YM */
    private final void m37435YM(View view, boolean z11) {
        float f11;
        if (view != null) {
            view.setEnabled(z11);
        }
        if (view != null) {
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            view.setAlpha(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public final C27236a m37436ZM() {
        return (C27236a) this.f40128T0.getValue();
    }

    /* renamed from: aN */
    private final Calendar m37437aN() {
        C29792f0 c29792f0 = this.f40124P0;
        Integer num = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        Integer valueOf = Integer.valueOf(c29792f0.f137723s.getCurrentItem());
        int intValue = valueOf.intValue();
        if (intValue >= 0 && intValue < m37436ZM().mo35335g()) {
            num = valueOf;
        }
        if (num != null) {
            Calendar m132822a = m37436ZM().m139354x(num.intValue()).m132822a();
            if (m132822a != null) {
                return m132822a;
            }
        }
        Calendar calendar = Calendar.getInstance();
        AbstractC19074t.m100207e(calendar, "getInstance(...)");
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final float m37438cN() {
        int i11 = this.f40135a1;
        C29792f0 c29792f0 = this.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        float bottom = i11 + c29792f0.f137722r.getBottom();
        C29792f0 c29792f03 = this.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29792f02 = c29792f03;
        }
        return bottom + c29792f02.f137722r.getTranslationY();
    }

    /* renamed from: dN */
    private final int m37439dN() {
        LinearLayoutManager linearLayoutManager = this.f40127S0;
        if (linearLayoutManager != null) {
            Integer valueOf = Integer.valueOf(linearLayoutManager.m9740Y1());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return this.f40132X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final C27237b m37440eN() {
        return (C27237b) this.f40129U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public final C28918e m37441fN() {
        return (C28918e) this.f40126R0.getValue();
    }

    /* renamed from: hN */
    private final void m37444hN() {
        AppCompatImageView appCompatImageView;
        C29792f0 c29792f0 = this.f40124P0;
        AppCompatImageView appCompatImageView2 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137725u.getRoot().setVisibility(8);
        C29737c c29737c = this.f40125Q0;
        if (c29737c != null) {
            appCompatImageView = c29737c.f137374v;
        } else {
            appCompatImageView = null;
        }
        m37435YM(appCompatImageView, true);
        C29737c c29737c2 = this.f40125Q0;
        if (c29737c2 != null) {
            appCompatImageView2 = c29737c2.f137373u;
        }
        m37435YM(appCompatImageView2, true);
        m37435YM(this.f40139e1, true);
    }

    /* renamed from: iN */
    private final void m37446iN() {
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137724t.post(new Runnable() { // from class: td.g
            @Override // java.lang.Runnable
            public final void run() {
                BirthdayHubView.m37448jN(BirthdayHubView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public static final void m37448jN(BirthdayHubView birthdayHubView) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        try {
            if (!birthdayHubView.f72421L0.m92681pJ() && !birthdayHubView.f72421L0.m92677nJ()) {
                birthdayHubView.m37489ON();
                C29792f0 c29792f0 = birthdayHubView.f40124P0;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                c29792f0.f137724t.setTranslationY(birthdayHubView.f40131W0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: kN */
    private final void m37450kN() {
        this.f40137c1 = Calendar.getInstance();
        this.f40135a1 = this.f72421L0.m92651WI().getDimensionPixelSize(AbstractC16802y.func_bar_general_h);
        m37454mN();
        m37452lN();
        m37446iN();
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137721q.setOnClickListener(this);
        m92637BK(true);
        C29792f0 c29792f02 = this.f40124P0;
        if (c29792f02 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f02 = null;
        }
        c29792f02.f137725u.getRoot().setOnClickListener(null);
    }

    /* renamed from: lN */
    private final void m37452lN() {
        m37440eN().m139366U(new C7371e());
        C29792f0 c29792f0 = this.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137726v.setAdapter(m37440eN());
        C29792f0 c29792f03 = this.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f03 = null;
        }
        c29792f03.f137726v.setHasFixedSize(true);
        this.f40127S0 = new LinearLayoutManager(this.f72421L0.m92648SI());
        C29792f0 c29792f04 = this.f40124P0;
        if (c29792f04 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f04 = null;
        }
        c29792f04.f137726v.setLayoutManager(this.f40127S0);
        C29792f0 c29792f05 = this.f40124P0;
        if (c29792f05 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f05 = null;
        }
        c29792f05.f137726v.m9826E(new C7372f());
        C29792f0 c29792f06 = this.f40124P0;
        if (c29792f06 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f06 = null;
        }
        c29792f06.f137726v.m9822C(new C7373g());
        C29792f0 c29792f07 = this.f40124P0;
        if (c29792f07 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29792f02 = c29792f07;
        }
        c29792f02.f137726v.m9816A(new C7209s8(m37440eN()));
    }

    /* renamed from: mN */
    private final void m37454mN() {
        m37436ZM().m139351B(new C7374h());
        C29792f0 c29792f0 = this.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137723s.setAdapter(m37436ZM());
        C29792f0 c29792f03 = this.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f03 = null;
        }
        c29792f03.f137723s.setOffscreenPageLimit(1);
        C29792f0 c29792f04 = this.f40124P0;
        if (c29792f04 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29792f02 = c29792f04;
        }
        c29792f02.f137723s.addOnPageChangeListener(new C7375i());
    }

    /* renamed from: nN */
    private final boolean m37456nN() {
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        if (c29792f0.f137725u.getRoot().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: oN */
    private final void m37458oN() {
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.f137726v.m9866X1();
        Calendar calendar = Calendar.getInstance();
        int m139356z = m37436ZM().m139356z(calendar);
        if (m139356z >= 0) {
            this.f40141g1 = true;
            C29792f0 c29792f02 = this.f40124P0;
            if (c29792f02 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f02 = null;
            }
            c29792f02.f137723s.setCurrentItem(m139356z, true);
            CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m37436ZM().m139355y().get(Integer.valueOf(m139356z));
            if (calendarMonthModuleView != null) {
                calendarMonthModuleView.m37521e0(calendar.getTimeInMillis());
            }
            AbstractC19074t.m100205c(calendar);
            m37461qN(this, calendar, 0, 2, null);
        }
    }

    /* renamed from: qN */
    public static /* synthetic */ void m37461qN(BirthdayHubView birthdayHubView, Calendar calendar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        birthdayHubView.m37496pN(calendar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m37463rN(BirthdayHubView birthdayHubView) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        birthdayHubView.m37433WM(-1);
    }

    /* renamed from: sN */
    private final void m37465sN(Calendar calendar, String str, int[] iArr, int i11) {
        try {
            int m139361N = m37440eN().m139361N(calendar.getTimeInMillis(), str, iArr);
            if (m139361N < 0) {
                m37496pN(calendar, i11);
                return;
            }
            LinearLayoutManager linearLayoutManager = this.f40127S0;
            if (linearLayoutManager != null) {
                linearLayoutManager.m9721B2(m139361N, i11);
            }
            this.f40132X0 = m139361N;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m37467tN(int i11, int i12) {
        if (this.f40138d1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(m37440eN().m139363Q(i11).m132831b());
            gregorianCalendar.add(2, -1);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTimeInMillis(m37440eN().m139363Q(i12).m132831b());
            gregorianCalendar2.add(2, 1);
            m37441fN().m144467h0(gregorianCalendar, (((gregorianCalendar2.get(1) - gregorianCalendar.get(1)) * 12) + gregorianCalendar2.get(2)) - gregorianCalendar.get(2));
            this.f40138d1 = false;
        }
    }

    /* renamed from: uN */
    private final void m37469uN() {
        C23744a.Companion.m124119a().m124115b(this, 65);
    }

    /* renamed from: vN */
    private final void m37471vN() {
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        ViewTreeObserver viewTreeObserver = c29792f0.f137723s.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f40142h1);
            viewTreeObserver.addOnGlobalLayoutListener(this.f40142h1);
        }
    }

    /* renamed from: wN */
    private final void m37473wN() {
        m37441fN().m144465e0().m9219j(this, new C7381o(new C7377k()));
        m37441fN().m144466g0().m9219j(this, new C7381o(new C7378l()));
        m37441fN().m144470v0().m9219j(this, new C7381o(new C7379m()));
        m37441fN().m144469u0().m9219j(this, new C7381o(new C7380n()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public static final WindowInsets m37475xN(final BirthdayHubView birthdayHubView, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        AbstractC19074t.m100208f(windowInsets, "insets");
        C29792f0 c29792f0 = birthdayHubView.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        c29792f0.getRoot().post(new Runnable() { // from class: td.h
            @Override // java.lang.Runnable
            public final void run() {
                BirthdayHubView.m37477yN(BirthdayHubView.this);
            }
        });
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m37477yN(BirthdayHubView birthdayHubView) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        birthdayHubView.m37486KN(true, 0L, "window-insets");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static final void m37479zN(BirthdayHubView birthdayHubView, View view) {
        AbstractC19074t.m100208f(birthdayHubView, "this$0");
        C29792f0 c29792f0 = birthdayHubView.f40124P0;
        C29792f0 c29792f02 = null;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        ViewPager viewPager = c29792f0.f137723s;
        C29792f0 c29792f03 = birthdayHubView.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29792f02 = c29792f03;
        }
        viewPager.setCurrentItem(c29792f02.f137723s.getCurrentItem() - 1, true);
    }

    /* renamed from: BN */
    public final void m37480BN() {
        m37403CN();
        for (Integer num : m37436ZM().m139355y().keySet()) {
            CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m37436ZM().m139355y().get(num);
            if (calendarMonthModuleView != null) {
                C27236a m37436ZM = m37436ZM();
                AbstractC19074t.m100205c(num);
                calendarMonthModuleView.m37519W(m37436ZM.m139354x(num.intValue()));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m37441fN().m144472z0(C7386a.Companion.m37511a(m92642L3()));
    }

    /* renamed from: EN */
    public final void m37481EN(Calendar calendar) {
        C29737c c29737c = this.f40125Q0;
        if (c29737c != null) {
            if (calendar == null) {
                calendar = m37437aN();
            }
            String m119738b = AbstractC23244v8.m119738b(AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full)[calendar.get(2)]);
            c29737c.f137371s.setText(m119738b + " ");
            int i11 = calendar.get(1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            c29737c.f137370r.setText(sb2.toString());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        Context context = getContext();
        if (context != null) {
            ActionBarMenuItem m92742i = actionBarMenu.m92742i(1, C27280g.m139659b(context, AbstractC23322a.zds_ic_setting_line_24, AbstractC16801x.white));
            this.f40139e1 = m92742i;
            m37435YM(m92742i, !m37456nN());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C29792f0 m147923c = C29792f0.m147923c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147923c, "inflate(...)");
        this.f40124P0 = m147923c;
        m37450kN();
        m37473wN();
        m37469uN();
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        return c29792f0.getRoot();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        ViewTreeObserver viewTreeObserver = c29792f0.f137723s.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f40142h1);
        }
        m37412HN();
    }

    /* renamed from: JN */
    public final void m37485JN(float f11, String str) {
        AbstractC19074t.m100208f(str, "source");
        float min = Math.min(Math.max(f11 - this.f40135a1, 0.0f), Math.max(m37438cN() - this.f40135a1, m37494bN()));
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        float height = min - c29792f0.f137722r.getHeight();
        C29792f0 c29792f02 = this.f40124P0;
        if (c29792f02 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f02 = null;
        }
        c29792f02.f137723s.setTranslationY(-height);
        C29792f0 c29792f03 = this.f40124P0;
        if (c29792f03 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f03 = null;
        }
        c29792f03.f137722r.setTranslationY(height);
        C29792f0 c29792f04 = this.f40124P0;
        if (c29792f04 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f04 = null;
        }
        c29792f04.f137724t.setTranslationY(min);
        m37429SN(this, min, false, 2, null);
    }

    /* renamed from: KN */
    public final void m37486KN(boolean z11, long j11, String str) {
        float f11;
        AbstractC19074t.m100208f(str, "source");
        if (z11) {
            f11 = m37494bN();
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 + this.f40135a1;
        if (j11 == 0) {
            m37485JN(f12, "openCalendarViewWithAnim_No");
        } else if (!this.f40133Y0) {
            ValueAnimator duration = ValueAnimator.ofFloat(m37438cN(), m37494bN()).setDuration(j11);
            AbstractC19074t.m100207e(duration, "setDuration(...)");
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: td.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BirthdayHubView.m37418LN(BirthdayHubView.this, valueAnimator);
                }
            });
            this.f40133Y0 = true;
            duration.setInterpolator(new DecelerateInterpolator());
            duration.addListener(new C7382p(z11));
            duration.start();
        }
        if (z11) {
            HashMap m139355y = m37436ZM().m139355y();
            C29792f0 c29792f0 = this.f40124P0;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m139355y.get(Integer.valueOf(c29792f0.f137723s.getCurrentItem()));
            if (calendarMonthModuleView != null) {
                Calendar calendar = this.f40136b1;
                if (calendar != null) {
                    calendarMonthModuleView.m37521e0(calendar.getTimeInMillis());
                }
                m37490PN();
            }
        }
    }

    /* renamed from: Kv */
    public final void m37487Kv(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profile");
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
        Intent intent = new Intent();
        intent.putExtras(m140776b);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* renamed from: ON */
    public final void m37489ON() {
        this.f40131W0 = m37494bN();
    }

    /* renamed from: PN */
    public final void m37490PN() {
        try {
            C29792f0 c29792f0 = this.f40124P0;
            if (c29792f0 == null) {
                AbstractC19074t.m100223u("binding");
                c29792f0 = null;
            }
            int currentItem = c29792f0.f137723s.getCurrentItem();
            CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m37436ZM().m139355y().get(Integer.valueOf(currentItem));
            if (currentItem >= 0 && calendarMonthModuleView != null) {
                calendarMonthModuleView.setAllDotVisible(4);
                Object clone = m37436ZM().m139354x(currentItem).m132822a().clone();
                AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
                HashMap hashMap = (HashMap) m37441fN().m144468r0().get(Long.valueOf(((Calendar) clone).getTimeInMillis()));
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        calendarMonthModuleView.m37522f0(((Number) entry.getKey()).longValue(), ((Number) entry.getValue()).intValue(), 0);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1) {
            try {
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(SettingManageBirthday.class, null, 1, true);
                }
                C0732w.Companion.m1189a().m1187q("birthday_hub_open_setting", "", null, null);
            } catch (Exception unused) {
                return false;
            }
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: SM */
    public final void m37492SM(View view) {
        AbstractC19074t.m100208f(view, "button");
        if (!this.f40143i1) {
            m37425QM(view);
            this.f40143i1 = true;
            AbstractC1579n0.m7864e(view).m8227p(AbstractC23136l9.m118742r(14.0f) + view.getHeight()).m8215b(0.0f).m8220h(this.f40144j1).m8221i(f40123k1).m8228q().m8222j(new C7368b()).m8225n();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                C29737c m147789c = C29737c.m147789c(LayoutInflater.from(this.f72421L0.getContext()), null, false);
                AbstractC19074t.m100207e(m147789c, "inflate(...)");
                this.f40125Q0 = m147789c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                layoutParams.leftMargin = AbstractC23222t7.f112539R;
                this.f88760a0.m92707b(m147789c.getRoot(), layoutParams);
                m147789c.f137374v.setOnClickListener(new View.OnClickListener() { // from class: td.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BirthdayHubView.m37479zN(BirthdayHubView.this, view);
                    }
                });
                m147789c.f137373u.setOnClickListener(new View.OnClickListener() { // from class: td.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BirthdayHubView.m37400AN(BirthdayHubView.this, view);
                    }
                });
                m37408FN(this, null, 1, null);
                m37435YM(m147789c.f137374v, !m37456nN());
                m37435YM(m147789c.f137373u, true ^ m37456nN());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m37441fN().m144471w0();
    }

    /* renamed from: bN */
    public final float m37494bN() {
        int i11;
        float f11 = this.f40131W0;
        HashMap m139355y = m37436ZM().m139355y();
        C29792f0 c29792f0 = this.f40124P0;
        if (c29792f0 == null) {
            AbstractC19074t.m100223u("binding");
            c29792f0 = null;
        }
        CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) m139355y.get(Integer.valueOf(c29792f0.f137723s.getCurrentItem()));
        if (calendarMonthModuleView != null && (i11 = calendarMonthModuleView.f84679t) > 0) {
            return i11;
        }
        return f11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        m37441fN().m144464Z();
        super.finish();
    }

    /* renamed from: gN */
    public final void m37495gN() {
        try {
            int i11 = this.f40134Z0;
            if (i11 >= 0 && i11 < m37440eN().mo10003k()) {
                AbstractC25732c m139363Q = m37440eN().m139363Q(this.f40134Z0);
                if ((m139363Q instanceof AbstractC25732c.b) && ((AbstractC25732c.b) m139363Q).m132832c()) {
                    m37440eN().m139365T(this.f40134Z0, new AbstractC25732c.f(m139363Q.m132831b()));
                }
                this.f40134Z0 = -1;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BirthdayHubView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view.getId() == AbstractC6918a0.btn_jump_today) {
            m37458oN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        try {
            Collection values = m37436ZM().m139355y().values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ((CalendarMonthModuleView) it.next()).m37520b0();
            }
            Iterator it2 = m37436ZM().m139353w().iterator();
            while (it2.hasNext()) {
                ((CalendarMonthModuleView) it2.next()).m37520b0();
            }
            m37471vN();
            if (Build.VERSION.SDK_INT >= 30) {
                C29792f0 c29792f0 = this.f40124P0;
                if (c29792f0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29792f0 = null;
                }
                c29792f0.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: td.f
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets m37475xN;
                        m37475xN = BirthdayHubView.m37475xN(BirthdayHubView.this, view, windowInsets);
                        return m37475xN;
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122772b("[BirthdayHub]", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        Calendar calendar = Calendar.getInstance();
        if (AbstractC23160o0.m119233a(this.f40137c1, calendar) != 0) {
            m37480BN();
            this.f40137c1 = calendar;
        }
        Calendar calendar2 = this.f40137c1;
        if (calendar2 != null && !AbstractC23160o0.m119241c1(calendar2, calendar)) {
            finish();
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(BirthdayHubView.class, null, 1, true);
            }
        }
    }

    /* renamed from: pN */
    public final void m37496pN(Calendar calendar, int i11) {
        AbstractC19074t.m100208f(calendar, "jumpTime");
        try {
            AbstractC23160o0.m119301w1(calendar);
            int m139362P = m37440eN().m139362P(calendar.getTimeInMillis(), new int[]{2, 3});
            if (m139362P >= 0) {
                LinearLayoutManager linearLayoutManager = this.f40127S0;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m9721B2(m139362P, i11);
                }
            } else {
                m37495gN();
                m139362P = m37440eN().m139360M(calendar.getTimeInMillis());
                if (m139362P < 0) {
                    return;
                }
                m37440eN().m139359L(m139362P, new AbstractC25732c.b(calendar.getTimeInMillis(), true));
                m37440eN().m10008p();
                LinearLayoutManager linearLayoutManager2 = this.f40127S0;
                if (linearLayoutManager2 != null) {
                    linearLayoutManager2.m9721B2(m139362P, i11);
                }
                this.f40134Z0 = m139362P;
                mo78955kl(new Runnable() { // from class: td.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BirthdayHubView.m37463rN(BirthdayHubView.this);
                    }
                }, 100L);
            }
            this.f40132X0 = m139362P;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        Integer num;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 65) {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 1) {
                    m37441fN().m144462C0();
                }
            }
        }
    }
}
