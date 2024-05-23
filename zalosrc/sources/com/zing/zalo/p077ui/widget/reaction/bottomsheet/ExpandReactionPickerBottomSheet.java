package com.zing.zalo.p077ui.widget.reaction.bottomsheet;

import ac.C0732w;
import am.AbstractC0924m0;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7252w7;
import com.zing.zalo.adapters.ViewOnKeyListenerC7058f0;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.widget.reaction.CustomDefaultReactionListView;
import com.zing.zalo.p077ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet;
import com.zing.zalo.p077ui.widget.recyclerview.SlidingTabRecyclerView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.SearchField;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import di0.EnumC17943b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import lb0.C22423y;
import mb0.C22980j;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p227i3.C20218v;
import p363nh.C23744a;
import p392oh.C24265l;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29831h3;
import p649xl.C29884k2;
import p649xl.C30008r0;
import ph.C24753f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public final class ExpandReactionPickerBottomSheet extends BottomSheet implements C23744a.c {

    /* renamed from: b1 */
    private C17945a0 f71204b1;

    /* renamed from: c1 */
    private int f71205c1;

    /* renamed from: e1 */
    public C30008r0 f71207e1;

    /* renamed from: f1 */
    public C29884k2 f71208f1;

    /* renamed from: g1 */
    public C29831h3 f71209g1;

    /* renamed from: h1 */
    private int f71210h1;

    /* renamed from: j1 */
    private boolean f71212j1;

    /* renamed from: k1 */
    private boolean f71213k1;

    /* renamed from: p1 */
    private final InterfaceC24854k f71218p1;

    /* renamed from: q1 */
    private final InterfaceC24854k f71219q1;

    /* renamed from: r1 */
    private final InterfaceC24854k f71220r1;

    /* renamed from: s1 */
    private final InterfaceC24854k f71221s1;

    /* renamed from: d1 */
    private String f71206d1 = "";

    /* renamed from: i1 */
    private int f71211i1 = 1;

    /* renamed from: l1 */
    private final ArrayList f71214l1 = new ArrayList();

    /* renamed from: m1 */
    private final ArrayList f71215m1 = new ArrayList();

    /* renamed from: n1 */
    private final ArrayList f71216n1 = new ArrayList();

    /* renamed from: o1 */
    private final TextWatcher f71217o1 = new C13761i();

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$a */
    /* loaded from: classes6.dex */
    static final class C13753a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13753a f71222q = new C13753a();

        C13753a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7252w7 mo12V4() {
            return new C7252w7(null);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$b */
    /* loaded from: classes6.dex */
    static final class C13754b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13754b f71223q = new C13754b();

        C13754b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout.LayoutParams mo12V4() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, BottomSheetExpandReactionPickerView.Companion.m76835b());
            layoutParams.gravity = 80;
            return layoutParams;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$c */
    /* loaded from: classes6.dex */
    public static final class C13755c implements KeyboardFrameLayout.InterfaceC13508a {
        C13755c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m76902c(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet) {
            boolean z11;
            AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
            expandReactionPickerBottomSheet.m76843JM(BottomSheetExpandReactionPickerView.Companion.m76835b());
            if (C24265l.Companion.m126709b().m126697m().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            expandReactionPickerBottomSheet.m76849OM(!z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m76903d(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, int i11) {
            AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
            expandReactionPickerBottomSheet.m76843JM(i11);
            expandReactionPickerBottomSheet.m76849OM(false);
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            final ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: mb0.h
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandReactionPickerBottomSheet.C13755c.m76902c(ExpandReactionPickerBottomSheet.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(final int i11) {
            final ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: mb0.g
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandReactionPickerBottomSheet.C13755c.m76903d(ExpandReactionPickerBottomSheet.this, i11);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$d */
    /* loaded from: classes6.dex */
    public static final class C13756d extends AbstractC31727b {
        C13756d() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emo");
            if (C23055e5.m118272g(true)) {
                C17945a0 m76890jM = ExpandReactionPickerBottomSheet.this.m76890jM();
                if (m76890jM != null) {
                    ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
                    C24265l.b bVar = C24265l.Companion;
                    C24753f m126705x = bVar.m126709b().m126705x(str);
                    boolean m100204b = true ^ AbstractC19074t.m100204b(expandReactionPickerBottomSheet.m76893mM(), "total_reaction_viewfull");
                    AbstractC19646n0.m102956a2(m76890jM, m126705x, 9, m100204b);
                    if (bVar.m126709b().m126697m().length() > 0) {
                        C0732w.Companion.m1189a().m1187q("reaction_send", "more_reaction_sheet_search", null, C22423y.m115852c(m126705x.m128595h(), m76890jM, m100204b));
                    } else {
                        C0732w.Companion.m1189a().m1187q("reaction_send", "more_reaction_sheet", null, C22423y.m115852c(m126705x.m128595h(), m76890jM, m100204b));
                    }
                }
                ExpandReactionPickerBottomSheet.this.m76837C();
                C24265l.b bVar2 = C24265l.Companion;
                if (bVar2.m126709b().m126697m().length() > 0) {
                    ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet2 = ExpandReactionPickerBottomSheet.this;
                    ArrayList arrayList = expandReactionPickerBottomSheet2.f71216n1;
                    String lowerCase = bVar2.m126709b().m126697m().toLowerCase(Locale.ROOT);
                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                    expandReactionPickerBottomSheet2.m76864bM(arrayList, lowerCase);
                }
            }
            ZaloView m92650VI = ExpandReactionPickerBottomSheet.this.f88762c0.m92650VI();
            if (m92650VI != null) {
                m92650VI.finish();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: j */
        public void mo76785j() {
            C17487o0 m92662fJ;
            ExpandReactionPickerBottomSheet.this.m76837C();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_SOURCE_START_VIEW", ExpandReactionPickerBottomSheet.this.m76893mM());
            ZaloView m92650VI = ExpandReactionPickerBottomSheet.this.m92650VI();
            if (m92650VI != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
                m92662fJ.mo89694j2(CustomDefaultReactionListView.class, bundle, 0, "CustomDefaultReactionListView", 2, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$e */
    /* loaded from: classes6.dex */
    public static final class C13757e implements C7252w7.c {
        C13757e() {
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: a */
        public void mo36987a() {
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: b */
        public void mo36988b(View view, int i11) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: c */
        public void mo36989c() {
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: d */
        public void mo36990d(StickerIndicatorView stickerIndicatorView, int i11) {
            AbstractC19074t.m100208f(stickerIndicatorView, "view");
        }

        @Override // com.zing.zalo.adapters.C7252w7.c
        /* renamed from: e */
        public void mo36991e(View view, int i11) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            ExpandReactionPickerBottomSheet.this.m76853QM(i11);
            ExpandReactionPickerBottomSheet.this.m76840EM(ExpandReactionPickerBottomSheet.this.m76870hM(i11));
            ExpandReactionPickerBottomSheet.this.m76871iM();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$f */
    /* loaded from: classes6.dex */
    public static final class C13758f implements AbsListView.OnScrollListener {
        C13758f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            boolean z11;
            if (ExpandReactionPickerBottomSheet.this.f88762c0.m92674mJ() && ExpandReactionPickerBottomSheet.this.f88762c0.m92672lJ()) {
                C24265l.b bVar = C24265l.Companion;
                if (bVar.m126709b().m126697m().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!ExpandReactionPickerBottomSheet.this.m76896uM()) {
                    if (ExpandReactionPickerBottomSheet.this.m76897vM()) {
                        ExpandReactionPickerBottomSheet.this.m76837C();
                    }
                    if (!z11) {
                        int m126695k = bVar.m126709b().m126695k(i11, i12 + i11);
                        ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
                        int m76869gM = expandReactionPickerBottomSheet.m76869gM(m126695k);
                        if (m76869gM != expandReactionPickerBottomSheet.m76892lM()) {
                            expandReactionPickerBottomSheet.m76853QM(m76869gM);
                        }
                    }
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (ExpandReactionPickerBottomSheet.this.f88762c0.m92674mJ() && ExpandReactionPickerBottomSheet.this.f88762c0.m92672lJ()) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ExpandReactionPickerBottomSheet.this.m76888MM(true);
                    }
                } else {
                    ExpandReactionPickerBottomSheet.this.m76887LM(false);
                    ExpandReactionPickerBottomSheet.this.m76888MM(false);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$g */
    /* loaded from: classes6.dex */
    static final class C13759g extends AbstractC19075u implements InterfaceC18494a {
        C13759g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NoPredictiveItemAnimLinearLayoutMngr mo12V4() {
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(ExpandReactionPickerBottomSheet.this.getContext());
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
            return noPredictiveItemAnimLinearLayoutMngr;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$h */
    /* loaded from: classes6.dex */
    static final class C13760h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13760h f71229q = new C13760h();

        C13760h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccelerateDecelerateInterpolator mo12V4() {
            return new AccelerateDecelerateInterpolator();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.ExpandReactionPickerBottomSheet$i */
    /* loaded from: classes6.dex */
    public static final class C13761i implements TextWatcher {
        C13761i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m76907b(ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0, ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet) {
            boolean z11;
            AbstractC19074t.m100208f(viewOnKeyListenerC7058f0, "$it");
            AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
            viewOnKeyListenerC7058f0.notifyDataSetChanged();
            if (C24265l.Companion.m126709b().m126697m().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            expandReactionPickerBottomSheet.m76849OM(!z11);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            final ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0;
            ListAdapter adapter = ExpandReactionPickerBottomSheet.this.m76891kM().f138451u.getAdapter();
            if (adapter instanceof ViewOnKeyListenerC7058f0) {
                viewOnKeyListenerC7058f0 = (ViewOnKeyListenerC7058f0) adapter;
            } else {
                viewOnKeyListenerC7058f0 = null;
            }
            if (viewOnKeyListenerC7058f0 != null) {
                final ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
                AbstractC19444a.m101697e(new Runnable() { // from class: mb0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExpandReactionPickerBottomSheet.C13761i.m76907b(ViewOnKeyListenerC7058f0.this, expandReactionPickerBottomSheet);
                    }
                });
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String str;
            boolean z11;
            C24265l.b bVar = C24265l.Companion;
            C24265l m126709b = bVar.m126709b();
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            m126709b.m126691S(str);
            if (bVar.m126709b().m126697m().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z11 && bVar.m126709b().m126694h() > 0) || !z11) {
                C29884k2 m76891kM = ExpandReactionPickerBottomSheet.this.m76891kM();
                ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = ExpandReactionPickerBottomSheet.this;
                m76891kM.f138451u.setVisibility(0);
                m76891kM.f138451u.bringToFront();
                m76891kM.f138450t.setVisibility(8);
                expandReactionPickerBottomSheet.m76880zM();
                m76891kM.f138451u.smoothScrollToPositionFromTop(0, 0);
                if (z11) {
                    ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet2 = ExpandReactionPickerBottomSheet.this;
                    ArrayList arrayList = expandReactionPickerBottomSheet2.f71214l1;
                    String lowerCase = bVar.m126709b().m126697m().toLowerCase(Locale.ROOT);
                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                    expandReactionPickerBottomSheet2.m76864bM(arrayList, lowerCase);
                    return;
                }
                return;
            }
            C29884k2 m76891kM2 = ExpandReactionPickerBottomSheet.this.m76891kM();
            m76891kM2.f138451u.setVisibility(8);
            MultiStateView multiStateView = m76891kM2.f138450t;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.EMPTY);
            multiStateView.f81188D.setVisibility(0);
            multiStateView.bringToFront();
            ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet3 = ExpandReactionPickerBottomSheet.this;
            ArrayList arrayList2 = expandReactionPickerBottomSheet3.f71215m1;
            String lowerCase2 = bVar.m126709b().m126697m().toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
            expandReactionPickerBottomSheet3.m76864bM(arrayList2, lowerCase2);
        }
    }

    public ExpandReactionPickerBottomSheet() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(C13754b.f71223q);
        this.f71218p1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C13760h.f71229q);
        this.f71219q1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13759g());
        this.f71220r1 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C13753a.f71222q);
        this.f71221s1 = m129210a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m76836BM(C7252w7 c7252w7) {
        AbstractC19074t.m100208f(c7252w7, "$this_apply");
        c7252w7.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m76837C() {
        AbstractC2379w.m12430d(m76891kM().f138449s.getEditText());
    }

    /* renamed from: CM */
    private final void m76838CM(final int i11) {
        final SlidingTabRecyclerView slidingTabRecyclerView = m76894oM().f137962q;
        slidingTabRecyclerView.m9866X1();
        AbstractC19074t.m100205c(slidingTabRecyclerView);
        if (!m76851PM(slidingTabRecyclerView, m76874qM(), i11)) {
            slidingTabRecyclerView.m9837K1(i11);
            slidingTabRecyclerView.post(new Runnable() { // from class: mb0.f
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandReactionPickerBottomSheet.m76839DM(ExpandReactionPickerBottomSheet.this, slidingTabRecyclerView, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m76839DM(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, SlidingTabRecyclerView slidingTabRecyclerView, int i11) {
        AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
        AbstractC19074t.m100208f(slidingTabRecyclerView, "$this_with");
        if (expandReactionPickerBottomSheet.mo60294yp()) {
            return;
        }
        expandReactionPickerBottomSheet.m76851PM(slidingTabRecyclerView, expandReactionPickerBottomSheet.m76874qM(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m76840EM(int i11) {
        this.f71212j1 = true;
        int m126702t = C24265l.Companion.m126709b().m126702t(i11);
        if (m126702t >= 0) {
            m76891kM().f138451u.smoothScrollToPositionFromTop(m126702t, 0, 300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m76843JM(int i11) {
        ListView listView = m76891kM().f138451u;
        listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m76849OM(boolean z11) {
        if (!m76876tM()) {
            return;
        }
        if (z11) {
            m76894oM().f137962q.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m76894oM().f137962q, (Property<SlidingTabRecyclerView, Float>) View.TRANSLATION_Y, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(m76875rM());
            ofFloat.start();
            return;
        }
        m76894oM().f137962q.setTranslationY(StickerPanelView.Companion.m72711a());
        m76894oM().f137962q.setVisibility(8);
    }

    /* renamed from: PM */
    private final boolean m76851PM(SlidingTabRecyclerView slidingTabRecyclerView, LinearLayoutManager linearLayoutManager, int i11) {
        View mo9732P;
        if (slidingTabRecyclerView.getWidth() <= 0 || (mo9732P = linearLayoutManager.mo9732P(i11)) == null) {
            return false;
        }
        slidingTabRecyclerView.m9845O1(mo9732P.getLeft() - ((slidingTabRecyclerView.getWidth() - mo9732P.getWidth()) / 2), 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public final void m76853QM(int i11) {
        if (m76894oM().f137962q.getAdapter() != null) {
            this.f71210h1 = i11;
            m76894oM().f137962q.m76911d2(i11);
            m76866dM(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public final void m76864bM(ArrayList arrayList, String str) {
        boolean m127120J;
        boolean m127120J2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            if (str2.length() < str.length()) {
                m127120J2 = AbstractC24341v.m127120J(str, str2, false, 2, null);
                if (!m127120J2) {
                }
            }
            arrayList2.add(obj);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m127120J = AbstractC24341v.m127120J((String) it.next(), str, false, 2, null);
                if (m127120J) {
                    return;
                }
            }
        }
        arrayList.add(str);
    }

    /* renamed from: cM */
    private final boolean m76865cM() {
        if ((!this.f71214l1.isEmpty()) || (!this.f71215m1.isEmpty()) || (!this.f71216n1.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: dM */
    private final void m76866dM(final int i11) {
        m76894oM().f137962q.post(new Runnable() { // from class: mb0.e
            @Override // java.lang.Runnable
            public final void run() {
                ExpandReactionPickerBottomSheet.m76867eM(ExpandReactionPickerBottomSheet.this, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public static final void m76867eM(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, int i11) {
        AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
        if (expandReactionPickerBottomSheet.mo60294yp()) {
            return;
        }
        expandReactionPickerBottomSheet.m76838CM(i11);
    }

    /* renamed from: fM */
    private final void m76868fM() {
        View view;
        ZaloView m92650VI = this.f88762c0.m92650VI();
        ViewGroup viewGroup = null;
        if (m92650VI != null) {
            view = m92650VI.m92656bJ();
        } else {
            view = null;
        }
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        }
        if (viewGroup != null) {
            new C22980j(viewGroup).m117728f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final int m76869gM(int i11) {
        boolean m126679A = C24265l.Companion.m126709b().m126679A();
        if (i11 != -2) {
            if (i11 == -1) {
                return m126679A ? 1 : 0;
            }
            return (m126679A ? 1 : 0) + i11 + 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final int m76870hM(int i11) {
        int i12 = !C24265l.Companion.m126709b().m126679A() ? 1 : 0;
        if (i11 <= 0) {
            return i12 - 2;
        }
        if (i11 == 1) {
            return i12 - 1;
        }
        if (i11 >= m76872nM().mo10003k()) {
            i11 = m76872nM().mo10003k();
        }
        return i12 + (i11 - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final void m76871iM() {
        EnumC17943b m90513cL = m90513cL();
        EnumC17943b enumC17943b = EnumC17943b.EXPAND;
        if (m90513cL != enumC17943b) {
            m90510YK(enumC17943b);
        }
    }

    /* renamed from: nM */
    private final C7252w7 m76872nM() {
        return (C7252w7) this.f71221s1.getValue();
    }

    /* renamed from: pM */
    private final FrameLayout.LayoutParams m76873pM() {
        return (FrameLayout.LayoutParams) this.f71218p1.getValue();
    }

    /* renamed from: qM */
    private final LinearLayoutManager m76874qM() {
        return (LinearLayoutManager) this.f71220r1.getValue();
    }

    /* renamed from: rM */
    private final TimeInterpolator m76875rM() {
        return (TimeInterpolator) this.f71219q1.getValue();
    }

    /* renamed from: tM */
    private final boolean m76876tM() {
        if (C24265l.Companion.m126709b().m126699o().m128546d() && C28652r.m143349v().m143359L()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final boolean m76877wM(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
        if (i11 == 3) {
            expandReactionPickerBottomSheet.m76837C();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m76878xM(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, View view) {
        AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
        if (!view.isFocusableInTouchMode()) {
            view.setFocusableInTouchMode(true);
        }
        view.requestFocus();
        expandReactionPickerBottomSheet.m76871iM();
        AbstractC2379w.m12434h(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m76879yM(ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet, View view) {
        AbstractC19074t.m100208f(expandReactionPickerBottomSheet, "this$0");
        expandReactionPickerBottomSheet.m76837C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public final void m76880zM() {
        ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0;
        ListAdapter adapter = m76891kM().f138451u.getAdapter();
        if (adapter instanceof ViewOnKeyListenerC7058f0) {
            viewOnKeyListenerC7058f0 = (ViewOnKeyListenerC7058f0) adapter;
        } else {
            viewOnKeyListenerC7058f0 = null;
        }
        if (viewOnKeyListenerC7058f0 != null) {
            viewOnKeyListenerC7058f0.m36057u();
            viewOnKeyListenerC7058f0.notifyDataSetChanged();
        }
    }

    /* renamed from: AM */
    public final void m76881AM() {
        final C7252w7 m76872nM = m76872nM();
        m76872nM.m36986f0(this.f71210h1);
        m76872nM.m36984d0(C24265l.Companion.m126709b().m126703u(true));
        mo70710wy(new Runnable() { // from class: mb0.a
            @Override // java.lang.Runnable
            public final void run() {
                ExpandReactionPickerBottomSheet.m76836BM(C7252w7.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C24265l.Companion.m126709b().m126684G();
        C23744a.Companion.m124119a().m124115b(this, 76);
    }

    /* renamed from: FM */
    public final void m76882FM(C17945a0 c17945a0) {
        this.f71204b1 = c17945a0;
    }

    /* renamed from: GM */
    public final void m76883GM(C29884k2 c29884k2) {
        AbstractC19074t.m100208f(c29884k2, "<set-?>");
        this.f71208f1 = c29884k2;
    }

    /* renamed from: HM */
    public final void m76884HM(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f71206d1 = str;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C23744a.Companion.m124119a().m124117e(this, 76);
    }

    /* renamed from: IM */
    public final void m76885IM(C29831h3 c29831h3) {
        AbstractC19074t.m100208f(c29831h3, "<set-?>");
        this.f71209g1 = c29831h3;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        if (m76865cM()) {
            C0732w.Companion.m1189a().m1187q("reaction_search", "more_reaction_sheet", null, C22423y.f109724a.m115858f(this.f71214l1, this.f71215m1, this.f71216n1));
        }
        super.mo40200KJ();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(this.f71211i1);
        }
    }

    /* renamed from: KM */
    public final void m76886KM(int i11) {
        this.f71205c1 = i11;
    }

    /* renamed from: LM */
    public final void m76887LM(boolean z11) {
        this.f71212j1 = z11;
    }

    /* renamed from: MM */
    public final void m76888MM(boolean z11) {
        this.f71213k1 = z11;
    }

    /* renamed from: NM */
    public final void m76889NM(C30008r0 c30008r0) {
        AbstractC19074t.m100208f(c30008r0, "<set-?>");
        this.f71207e1 = c30008r0;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        if (m90520jL()) {
            return m76891kM().f138448r;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        WindowManager.LayoutParams attributes;
        super.mo37122XJ(z11, z12);
        if (z11 && m92672lJ() && m92674mJ()) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                Window window = m92676n2.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    this.f71211i1 = attributes.softInputMode;
                }
                m92676n2.mo35554O(32);
                return;
            }
            return;
        }
        if (!z11) {
            m76837C();
        }
    }

    /* renamed from: jM */
    public final C17945a0 m76890jM() {
        return this.f71204b1;
    }

    /* renamed from: kM */
    public final C29884k2 m76891kM() {
        C29884k2 c29884k2 = this.f71208f1;
        if (c29884k2 != null) {
            return c29884k2;
        }
        AbstractC19074t.m100223u("contentViewBinding");
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        setIdTracking("bottom_sheet_expand_reaction_picker");
        setTrackingExtraData(C22423y.f109724a.m115859g(this.f71206d1));
        C24265l.b bVar = C24265l.Companion;
        bVar.m126709b().m126690R(1);
        bVar.m126709b().m126691S("");
        C29831h3 m148022c = C29831h3.m148022c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148022c, "inflate(...)");
        m76885IM(m148022c);
        C30008r0 m148424c = C30008r0.m148424c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148424c, "inflate(...)");
        m76889NM(m148424c);
        C29884k2 m148149a = C29884k2.m148149a(m76895sM().f139168r.f138447q);
        AbstractC19074t.m100207e(m148149a, "bind(...)");
        m76883GM(m148149a);
        KeyboardFrameLayout keyboardFrameLayout = m76895sM().f139169s;
        keyboardFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: mb0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandReactionPickerBottomSheet.m76879yM(ExpandReactionPickerBottomSheet.this, view);
            }
        });
        keyboardFrameLayout.setTopViewGroup(m76895sM().f139167q);
        keyboardFrameLayout.setOnKeyboardListener(new C13755c());
        C29884k2 m76891kM = m76891kM();
        SearchField searchField = m76891kM.f138449s;
        searchField.setMaxLength(30);
        searchField.getEditText().setFocusableInTouchMode(false);
        searchField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mb0.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m76877wM;
                m76877wM = ExpandReactionPickerBottomSheet.m76877wM(ExpandReactionPickerBottomSheet.this, textView, i11, keyEvent);
                return m76877wM;
            }
        });
        searchField.getEditText().setOnClickListener(new View.OnClickListener() { // from class: mb0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandReactionPickerBottomSheet.m76878xM(ExpandReactionPickerBottomSheet.this, view);
            }
        });
        searchField.getEditText().setImeOptions(3);
        searchField.getEditText().setMaxLines(1);
        searchField.getEditText().addTextChangedListener(this.f71217o1);
        ViewOnKeyListenerC7058f0.b bVar2 = new ViewOnKeyListenerC7058f0.b();
        bVar2.f38572a = 32;
        ListView listView = m76891kM.f138451u;
        ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0 = new ViewOnKeyListenerC7058f0(m92689tK(), true, -3, 6, bVar2);
        viewOnKeyListenerC7058f0.m36060x(new C13756d());
        listView.setAdapter((ListAdapter) viewOnKeyListenerC7058f0);
        if (m76876tM()) {
            SlidingTabRecyclerView slidingTabRecyclerView = m76894oM().f137962q;
            slidingTabRecyclerView.setLayoutManager(m76874qM());
            slidingTabRecyclerView.setOverScrollMode(2);
            C7252w7 m76872nM = m76872nM();
            m76872nM.m36985e0(new C13757e());
            slidingTabRecyclerView.setAdapter(m76872nM);
            slidingTabRecyclerView.setVisibility(0);
            m76891kM.f138451u.setOnScrollListener(new C13758f());
        } else {
            m76894oM().f137962q.setVisibility(8);
        }
        m76891kM.f138450t.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_empty_state_search_emoji_reaction));
        m76891kM.f138451u.setNestedScrollingEnabled(true);
        m76891kM.f138451u.setClipToPadding(false);
        m76843JM(BottomSheetExpandReactionPickerView.Companion.m76835b());
        m90533zL(EnumC17017m.DETENTS);
        m90524sL(0.65f);
        if (m76876tM()) {
            SlidingTabRecyclerView slidingTabRecyclerView2 = m76894oM().f137962q;
            AbstractC19074t.m100207e(slidingTabRecyclerView2, "listIndicator");
            m90526uL(slidingTabRecyclerView2, m76873pM());
        }
        m90522qL(true);
    }

    /* renamed from: lM */
    public final int m76892lM() {
        return this.f71210h1;
    }

    /* renamed from: mM */
    public final String m76893mM() {
        return this.f71206d1;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: nL */
    public void mo66255nL() {
        super.mo66255nL();
        if (AbstractC0924m0.m4136qa()) {
            m76868fM();
        }
    }

    /* renamed from: oM */
    public final C29831h3 m76894oM() {
        C29831h3 c29831h3 = this.f71209g1;
        if (c29831h3 != null) {
            return c29831h3;
        }
        AbstractC19074t.m100223u("indicatorViewBinding");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C24265l.b bVar = C24265l.Companion;
        if (bVar.m126709b().m126696l() != 1) {
            bVar.m126709b().m126690R(1);
            bVar.m126709b().m126691S("");
        }
    }

    /* renamed from: sM */
    public final C30008r0 m76895sM() {
        C30008r0 c30008r0 = this.f71207e1;
        if (c30008r0 != null) {
            return c30008r0;
        }
        AbstractC19074t.m100223u("viewBinding");
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: st */
    public void mo66256st(float f11) {
        super.mo66256st(f11);
        if (m90513cL() != EnumC17943b.EXPAND) {
            m76837C();
        }
    }

    /* renamed from: uM */
    public final boolean m76896uM() {
        return this.f71212j1;
    }

    /* renamed from: vM */
    public final boolean m76897vM() {
        return this.f71213k1;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 76) {
            try {
                C24265l.b bVar = C24265l.Companion;
                bVar.m126709b().m126691S("");
                bVar.m126709b().m126692T();
                m76881AM();
                m76880zM();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m76881AM();
    }
}
