package com.zing.zalo.feed.mvp.visibletimelimit;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.LoadingTextView;
import com.zing.zalo.feed.mvp.visibletimelimit.C8827a;
import com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ge.C19415g;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import me0.AbstractC23136l9;
import p492rr.C25960c;
import p492rr.C25968k;
import p492rr.C25970m;
import p492rr.C25971n;
import p492rr.C25972o;
import p492rr.C25973p;
import p492rr.C25975r;
import p492rr.EnumC25958a;
import p492rr.EnumC25969l;
import p492rr.EnumC25974q;
import p500s1.C26087b;
import p649xl.AbstractC30096w3;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class FeedVisibleTimeLimitOptionsBottomSheetView extends BottomSheetZaloViewWithAnim implements InterfaceC17463d.d, InterfaceC0733x {
    public static final C8822a Companion = new C8822a(null);

    /* renamed from: W0 */
    private AbstractC30096w3 f47177W0;

    /* renamed from: X0 */
    private C25970m f47178X0;

    /* renamed from: Y0 */
    private C8827a f47179Y0;

    /* renamed from: Z0 */
    private final InterfaceC18494a f47180Z0 = new C8826e();

    /* renamed from: a1 */
    private boolean f47181a1;

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView$a */
    /* loaded from: classes4.dex */
    public static final class C8822a {
        private C8822a() {
        }

        public /* synthetic */ C8822a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8823b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47182a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f47183b;

        static {
            int[] iArr = new int[EnumC25958a.values().length];
            try {
                iArr[EnumC25958a.f123879p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25958a.f123881r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25958a.f123880q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47182a = iArr;
            int[] iArr2 = new int[EnumC25974q.values().length];
            try {
                iArr2[EnumC25974q.f123929q.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC25974q.f123930r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC25974q.f123928p.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f47183b = iArr2;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView$c */
    /* loaded from: classes4.dex */
    public static final class C8824c extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ View f47185q;

        /* renamed from: r */
        final /* synthetic */ View f47186r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18494a f47187s;

        C8824c(View view, View view2, InterfaceC18494a interfaceC18494a) {
            this.f47185q = view;
            this.f47186r = view2;
            this.f47187s = interfaceC18494a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            FeedVisibleTimeLimitOptionsBottomSheetView.this.f47181a1 = false;
            this.f47185q.setVisibility(4);
            this.f47185q.setTranslationX(0.0f);
            this.f47186r.setTranslationX(0.0f);
            this.f47187s.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView$d */
    /* loaded from: classes4.dex */
    public static final class C8825d implements C8827a.a {
        C8825d() {
        }

        @Override // com.zing.zalo.feed.mvp.visibletimelimit.C8827a.a
        /* renamed from: a */
        public void mo47141a(C25968k c25968k) {
            AbstractC19074t.m100208f(c25968k, "feedVisibleTimeLimitOptionsData");
            C25970m c25970m = FeedVisibleTimeLimitOptionsBottomSheetView.this.f47178X0;
            if (c25970m == null) {
                AbstractC19074t.m100223u("viewModel");
                c25970m = null;
            }
            c25970m.m133772i0(c25968k);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.FeedVisibleTimeLimitOptionsBottomSheetView$e */
    /* loaded from: classes4.dex */
    static final class C8826e extends AbstractC19075u implements InterfaceC18494a {
        C8826e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m47142a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m47142a() {
            AbstractC30096w3 abstractC30096w3 = FeedVisibleTimeLimitOptionsBottomSheetView.this.f47177W0;
            if (abstractC30096w3 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC30096w3 = null;
            }
            abstractC30096w3.f139767R.setClickable(true);
        }
    }

    /* renamed from: AM */
    private final void m47107AM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.f
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47108BM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (EnumC25958a) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133764U().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m47108BM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, EnumC25958a enumC25958a) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(enumC25958a, "activeState");
        int i11 = C8823b.f47182a[enumC25958a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ZaloView m92650VI = feedVisibleTimeLimitOptionsBottomSheetView.m92650VI();
                    if (m92650VI != null) {
                        Intent intent = new Intent();
                        intent.putExtra("is_update_limit_feed_success", false);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        m92650VI.mo50035CK(-1, intent);
                    }
                    feedVisibleTimeLimitOptionsBottomSheetView.close();
                    return;
                }
                return;
            }
            ZaloView m92650VI2 = feedVisibleTimeLimitOptionsBottomSheetView.m92650VI();
            if (m92650VI2 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("is_update_limit_feed_success", true);
                C24848g0 c24848g02 = C24848g0.f119245a;
                m92650VI2.mo50035CK(-1, intent2);
            }
            feedVisibleTimeLimitOptionsBottomSheetView.close();
            return;
        }
        feedVisibleTimeLimitOptionsBottomSheetView.close();
    }

    /* renamed from: CM */
    private final void m47109CM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.d
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47110DM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (C25968k) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133765V().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m47110DM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, C25968k c25968k) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(c25968k, "currentOption");
        C8827a c8827a = feedVisibleTimeLimitOptionsBottomSheetView.f47179Y0;
        if (c8827a == null) {
            AbstractC19074t.m100223u("adapter");
            c8827a = null;
        }
        c8827a.m47146O(c25968k);
    }

    /* renamed from: EM */
    private final void m47111EM() {
        m47112FM();
        m47107AM();
        m47109CM();
        m47114HM();
        m47118LM();
        m47116JM();
    }

    /* renamed from: FM */
    private final void m47112FM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.i
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47113GM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (List) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133767X().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m47113GM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, List list) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(list, "listOptions");
        C8827a c8827a = feedVisibleTimeLimitOptionsBottomSheetView.f47179Y0;
        C8827a c8827a2 = null;
        if (c8827a == null) {
            AbstractC19074t.m100223u("adapter");
            c8827a = null;
        }
        c8827a.m47145N(list);
        C8827a c8827a3 = feedVisibleTimeLimitOptionsBottomSheetView.f47179Y0;
        if (c8827a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8827a2 = c8827a3;
        }
        c8827a2.m10008p();
    }

    /* renamed from: HM */
    private final void m47114HM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.g
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47115IM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (C19415g) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133768Y().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m47115IM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, C19415g c19415g) {
        Spanned fromHtml;
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(c19415g, "dateInfo");
        String format = new SimpleDateFormat("dd/MM/yyyy").format(C25973p.f123927a.m133789a(c19415g).getTime());
        AbstractC30096w3 abstractC30096w3 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        RobotoTextView robotoTextView = abstractC30096w3.f139773X;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_custom_pick_day_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format2 = String.format(m118743r0, Arrays.copyOf(new Object[]{format}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(format2, 63);
        } else {
            fromHtml = Html.fromHtml(format2);
        }
        robotoTextView.setText(fromHtml);
    }

    /* renamed from: JM */
    private final void m47116JM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.h
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47117KM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (EnumC25974q) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133769Z().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m47117KM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, EnumC25974q enumC25974q) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(enumC25974q, "state");
        int i11 = C8823b.f47183b[enumC25974q.ordinal()];
        AbstractC30096w3 abstractC30096w3 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    AbstractC30096w3 abstractC30096w32 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
                    if (abstractC30096w32 == null) {
                        AbstractC19074t.m100223u("binding");
                        abstractC30096w32 = null;
                    }
                    abstractC30096w32.f139776a0.setEnabled(true);
                    AbstractC30096w3 abstractC30096w33 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
                    if (abstractC30096w33 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        abstractC30096w3 = abstractC30096w33;
                    }
                    LoadingTextView loadingTextView = abstractC30096w3.f139776a0;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    loadingTextView.m44440a(m118743r0);
                    return;
                }
                return;
            }
            AbstractC30096w3 abstractC30096w34 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
            if (abstractC30096w34 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC30096w34 = null;
            }
            LoadingTextView loadingTextView2 = abstractC30096w34.f139776a0;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_saving);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            loadingTextView2.m44442h(m118743r02);
            AbstractC30096w3 abstractC30096w35 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
            if (abstractC30096w35 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC30096w3 = abstractC30096w35;
            }
            abstractC30096w3.f139776a0.setEnabled(false);
            return;
        }
        AbstractC30096w3 abstractC30096w36 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
        if (abstractC30096w36 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC30096w3 = abstractC30096w36;
        }
        abstractC30096w3.f139776a0.setEnabled(false);
    }

    /* renamed from: LM */
    private final void m47118LM() {
        InterfaceC1764d0 interfaceC1764d0 = new InterfaceC1764d0() { // from class: rr.e
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47119MM(FeedVisibleTimeLimitOptionsBottomSheetView.this, (EnumC25969l) obj);
            }
        };
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133770b0().m9219j(this, interfaceC1764d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m47119MM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, EnumC25969l enumC25969l) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        AbstractC19074t.m100208f(enumC25969l, "viewMode");
        AbstractC30096w3 abstractC30096w3 = null;
        if (enumC25969l == EnumC25969l.f123901q) {
            AbstractC30096w3 abstractC30096w32 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
            if (abstractC30096w32 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC30096w3 = abstractC30096w32;
            }
            if (abstractC30096w3.f139772W.getVisibility() == 4) {
                feedVisibleTimeLimitOptionsBottomSheetView.m47125SM();
                return;
            }
            return;
        }
        if (enumC25969l == EnumC25969l.f123900p) {
            AbstractC30096w3 abstractC30096w33 = feedVisibleTimeLimitOptionsBottomSheetView.f47177W0;
            if (abstractC30096w33 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC30096w3 = abstractC30096w33;
            }
            if (abstractC30096w3.f139769T.getVisibility() == 4) {
                feedVisibleTimeLimitOptionsBottomSheetView.m47126TM();
            }
        }
    }

    /* renamed from: NM */
    private final void m47120NM() {
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        AbstractC30096w3 abstractC30096w32 = null;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        C25970m c25970m = this.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        abstractC30096w3.mo148642Q(c25970m);
        AbstractC30096w3 abstractC30096w33 = this.f47177W0;
        if (abstractC30096w33 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC30096w32 = abstractC30096w33;
        }
        abstractC30096w32.m8503J(this);
    }

    /* renamed from: OM */
    private final void m47121OM(Calendar calendar) {
        DatePicker.OnDateChangedListener onDateChangedListener = new DatePicker.OnDateChangedListener() { // from class: rr.j
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i11, int i12, int i13) {
                FeedVisibleTimeLimitOptionsBottomSheetView.m47122PM(FeedVisibleTimeLimitOptionsBottomSheetView.this, datePicker, i11, i12, i13);
            }
        };
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        AbstractC30096w3 abstractC30096w32 = null;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        abstractC30096w3.f139765P.init(calendar.get(1), calendar.get(2), calendar.get(5), onDateChangedListener);
        AbstractC30096w3 abstractC30096w33 = this.f47177W0;
        if (abstractC30096w33 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC30096w32 = abstractC30096w33;
        }
        abstractC30096w32.f139765P.setMaxDate(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m47122PM(FeedVisibleTimeLimitOptionsBottomSheetView feedVisibleTimeLimitOptionsBottomSheetView, DatePicker datePicker, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(feedVisibleTimeLimitOptionsBottomSheetView, "this$0");
        C25970m c25970m = feedVisibleTimeLimitOptionsBottomSheetView.f47178X0;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133773j0(i11, i12, i13);
    }

    /* renamed from: QM */
    private final void m47123QM() {
        Calendar calendar;
        C25970m c25970m = this.f47178X0;
        C25970m c25970m2 = null;
        if (c25970m == null) {
            AbstractC19074t.m100223u("viewModel");
            c25970m = null;
        }
        c25970m.m133774l0();
        C25970m c25970m3 = this.f47178X0;
        if (c25970m3 == null) {
            AbstractC19074t.m100223u("viewModel");
        } else {
            c25970m2 = c25970m3;
        }
        long m133766W = c25970m2.m133766W();
        if (m133766W != 0) {
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m133766W);
            AbstractC19074t.m100205c(calendar);
        } else {
            calendar = Calendar.getInstance();
            AbstractC19074t.m100205c(calendar);
        }
        m47121OM(calendar);
    }

    /* renamed from: RM */
    private final void m47124RM() {
        this.f47179Y0 = new C8827a(new C8825d());
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        C8827a c8827a = null;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        abstractC30096w3.f139771V.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC30096w3 abstractC30096w32 = this.f47177W0;
        if (abstractC30096w32 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w32 = null;
        }
        RecyclerView recyclerView = abstractC30096w32.f139771V;
        C8827a c8827a2 = this.f47179Y0;
        if (c8827a2 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8827a = c8827a2;
        }
        recyclerView.setAdapter(c8827a);
    }

    /* renamed from: SM */
    private final void m47125SM() {
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        AbstractC30096w3 abstractC30096w32 = null;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        abstractC30096w3.f139767R.setClickable(false);
        AbstractC30096w3 abstractC30096w33 = this.f47177W0;
        if (abstractC30096w33 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w33 = null;
        }
        RelativeLayout relativeLayout = abstractC30096w33.f139769T;
        AbstractC19074t.m100207e(relativeLayout, "limitOptionsContainer");
        AbstractC30096w3 abstractC30096w34 = this.f47177W0;
        if (abstractC30096w34 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC30096w32 = abstractC30096w34;
        }
        RelativeLayout relativeLayout2 = abstractC30096w32.f139772W;
        AbstractC19074t.m100207e(relativeLayout2, "selectDayContainer");
        m47137wM(relativeLayout, relativeLayout2, 0, this.f47180Z0);
    }

    /* renamed from: TM */
    private final void m47126TM() {
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        AbstractC30096w3 abstractC30096w32 = null;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        abstractC30096w3.f139767R.setClickable(false);
        AbstractC30096w3 abstractC30096w33 = this.f47177W0;
        if (abstractC30096w33 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w33 = null;
        }
        RelativeLayout relativeLayout = abstractC30096w33.f139772W;
        AbstractC19074t.m100207e(relativeLayout, "selectDayContainer");
        AbstractC30096w3 abstractC30096w34 = this.f47177W0;
        if (abstractC30096w34 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC30096w32 = abstractC30096w34;
        }
        RelativeLayout relativeLayout2 = abstractC30096w32.f139769T;
        AbstractC19074t.m100207e(relativeLayout2, "limitOptionsContainer");
        m47137wM(relativeLayout, relativeLayout2, 1, this.f47180Z0);
    }

    /* renamed from: wM */
    private final void m47137wM(View view, View view2, int i11, InterfaceC18494a interfaceC18494a) {
        float f11;
        float width;
        if (this.f47181a1) {
            return;
        }
        this.f47181a1 = true;
        view.setVisibility(0);
        view2.setVisibility(0);
        float width2 = view.getWidth();
        if (i11 == 0) {
            f11 = width2 * (-1.0f);
        } else {
            f11 = width2 * 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f11);
        if (i11 == 0) {
            width = view2.getWidth() * 1.0f;
        } else {
            width = view2.getWidth() * (-1.0f);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationX", width, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new C26087b());
        animatorSet.setDuration(400L);
        animatorSet.addListener(new C8824c(view, view2, interfaceC18494a));
        animatorSet.start();
    }

    /* renamed from: xM */
    private final void m47138xM() {
        m47139yM();
        m47120NM();
        m47111EM();
        m47123QM();
    }

    /* renamed from: yM */
    private final void m47139yM() {
        C25970m c25970m = null;
        C25970m c25970m2 = (C25970m) new C1802w0(this, new C25971n(new C25972o(null, 1, null), new C25960c())).m9378a(C25970m.class);
        this.f47178X0 = c25970m2;
        if (c25970m2 == null) {
            AbstractC19074t.m100223u("viewModel");
        } else {
            c25970m = c25970m2;
        }
        c25970m.m133763Q(new C25975r(m92642L3()));
    }

    /* renamed from: zM */
    private final void m47140zM() {
        m47124RM();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        RelativeLayout relativeLayout = abstractC30096w3.f139770U;
        AbstractC19074t.m100207e(relativeLayout, "mainView");
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        AbstractC30096w3 abstractC30096w3 = this.f47177W0;
        if (abstractC30096w3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC30096w3 = null;
        }
        return measuredHeight - abstractC30096w3.f139770U.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        ViewDataBinding m8554e = AbstractC1673g.m8554e(LayoutInflater.from(getContext()), AbstractC7409c0.feed_visible_time_limit_options_bottom_sheet, this.f72454M0, true);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        this.f47177W0 = (AbstractC30096w3) m8554e;
        m47140zM();
        m47138xM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FeedVisibleTimeLimitOptionsBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        if (this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            C25970m c25970m = this.f47178X0;
            C25970m c25970m2 = null;
            if (c25970m == null) {
                AbstractC19074t.m100223u("viewModel");
                c25970m = null;
            }
            if (c25970m.m133770b0().mo9215f() == EnumC25969l.f123901q && !this.f47181a1) {
                C25970m c25970m3 = this.f47178X0;
                if (c25970m3 == null) {
                    AbstractC19074t.m100223u("viewModel");
                } else {
                    c25970m2 = c25970m3;
                }
                c25970m2.m133775n0(EnumC25969l.f123900p);
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
