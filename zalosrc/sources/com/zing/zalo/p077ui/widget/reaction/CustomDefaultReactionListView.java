package com.zing.zalo.p077ui.widget.reaction;

import ac.C0697c0;
import ac.C0732w;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7252w7;
import com.zing.zalo.adapters.ViewOnKeyListenerC7058f0;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.widget.reaction.CustomDefaultReactionListView;
import com.zing.zalo.p077ui.widget.recyclerview.SlidingTabRecyclerView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.SearchField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lb0.C22423y;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p227i3.C20218v;
import p363nh.C23744a;
import p392oh.C24265l;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29831h3;
import p649xl.C29884k2;
import p649xl.C29920m2;
import ph.C24753f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public final class CustomDefaultReactionListView extends BaseZaloView {
    public static final C13730a Companion = new C13730a(null);

    /* renamed from: N0 */
    public C29920m2 f71042N0;

    /* renamed from: O0 */
    public C29884k2 f71043O0;

    /* renamed from: P0 */
    public C29831h3 f71044P0;

    /* renamed from: Q0 */
    private int f71045Q0;

    /* renamed from: R0 */
    private int f71046R0;

    /* renamed from: T0 */
    private boolean f71048T0;

    /* renamed from: U0 */
    private boolean f71049U0;

    /* renamed from: b1 */
    private final InterfaceC24854k f71056b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f71057c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f71058d1;

    /* renamed from: M0 */
    private final ArrayList f71041M0 = new ArrayList();

    /* renamed from: S0 */
    private int f71047S0 = 1;

    /* renamed from: V0 */
    private int f71050V0 = C24265l.Companion.m126709b().m126696l();

    /* renamed from: W0 */
    private final ArrayList f71051W0 = new ArrayList();

    /* renamed from: X0 */
    private final ArrayList f71052X0 = new ArrayList();

    /* renamed from: Y0 */
    private final ArrayList f71053Y0 = new ArrayList();

    /* renamed from: Z0 */
    private String f71054Z0 = "";

    /* renamed from: a1 */
    private final TextWatcher f71055a1 = new C13741l();

    /* loaded from: classes6.dex */
    public static final class EditDefaultReactionAdapter extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private final Context f71059r;

        /* renamed from: s */
        private final ArrayList f71060s;

        /* renamed from: t */
        private int f71061t;

        /* renamed from: u */
        private InterfaceC13728a f71062u;

        /* renamed from: v */
        private Animation f71063v;

        /* renamed from: w */
        private int f71064w;

        @SuppressLint({"ViewConstructor"})
        /* loaded from: classes6.dex */
        public static final class EmojiViewHolder extends LinearLayout {

            /* renamed from: p */
            private final RobotoTextView f71065p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmojiViewHolder(Context context, int i11, int i12) {
                super(context);
                AbstractC19074t.m100208f(context, "context");
                RobotoTextView robotoTextView = new RobotoTextView(context);
                robotoTextView.mo75850g(true);
                robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                robotoTextView.setTextSize(0, AbstractC23136l9.m118748t(context, 30.0f));
                robotoTextView.setGravity(17);
                robotoTextView.setIncludeFontPadding(false);
                robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
                this.f71065p = robotoTextView;
                setLayoutParams(new LinearLayout.LayoutParams(i11, i12));
                setOrientation(0);
                setGravity(17);
                addView(robotoTextView);
            }

            public final RobotoTextView getEmojiView() {
                return this.f71065p;
            }
        }

        /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$EditDefaultReactionAdapter$a */
        /* loaded from: classes6.dex */
        public interface InterfaceC13728a {
            /* renamed from: n */
            void mo76779n(int i11);
        }

        /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$EditDefaultReactionAdapter$b */
        /* loaded from: classes6.dex */
        public static final class C13729b extends RecyclerView.AbstractC1876c0 {

            /* renamed from: I */
            private EmojiViewHolder f71066I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13729b(EmojiViewHolder emojiViewHolder) {
                super(emojiViewHolder);
                AbstractC19074t.m100208f(emojiViewHolder, "view");
                this.f71066I = emojiViewHolder;
            }
        }

        public EditDefaultReactionAdapter(Context context, InterfaceC13728a interfaceC13728a) {
            AbstractC19074t.m100208f(context, "context");
            this.f71059r = context;
            this.f71060s = new ArrayList();
            this.f71062u = interfaceC13728a;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, AbstractC10919t.custom_reaction_anim);
            AbstractC19074t.m100207e(loadAnimation, "loadAnimation(...)");
            this.f71063v = loadAnimation;
        }

        /* renamed from: O */
        public static final void m76774O(EditDefaultReactionAdapter editDefaultReactionAdapter, int i11, View view) {
            AbstractC19074t.m100208f(editDefaultReactionAdapter, "this$0");
            editDefaultReactionAdapter.f71061t = i11;
            AbstractC19444a.m101697e(new Runnable() { // from class: lb0.t
                public /* synthetic */ RunnableC22418t() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomDefaultReactionListView.EditDefaultReactionAdapter.m76775P(CustomDefaultReactionListView.EditDefaultReactionAdapter.this);
                }
            });
            InterfaceC13728a interfaceC13728a = editDefaultReactionAdapter.f71062u;
            if (interfaceC13728a != null) {
                interfaceC13728a.mo76779n(i11);
            }
        }

        /* renamed from: P */
        public static final void m76775P(EditDefaultReactionAdapter editDefaultReactionAdapter) {
            AbstractC19074t.m100208f(editDefaultReactionAdapter, "this$0");
            editDefaultReactionAdapter.m10008p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N */
        public void mo9990A(C13729b c13729b, int i11) {
            EmojiViewHolder emojiViewHolder;
            float f11;
            AbstractC19074t.m100208f(c13729b, "holder");
            String m128596i = ((C24753f) this.f71060s.get(i11)).m128596i();
            View view = c13729b.f7784p;
            if (view instanceof EmojiViewHolder) {
                emojiViewHolder = (EmojiViewHolder) view;
            } else {
                emojiViewHolder = null;
            }
            if (emojiViewHolder != null) {
                RobotoTextView emojiView = emojiViewHolder.getEmojiView();
                emojiView.setText(C28652r.m143349v().m143358I(m128596i, AbstractC23136l9.m118748t(this.f71059r, 32.0f)));
                if (this.f71061t == i11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                emojiView.setAlpha(f11);
                emojiView.setOnClickListener(new View.OnClickListener() { // from class: lb0.s

                    /* renamed from: q */
                    public final /* synthetic */ int f109713q;

                    public /* synthetic */ ViewOnClickListenerC22417s(int i112) {
                        r2 = i112;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CustomDefaultReactionListView.EditDefaultReactionAdapter.m76774O(CustomDefaultReactionListView.EditDefaultReactionAdapter.this, r2, view2);
                    }
                });
                if (this.f71061t == i112) {
                    emojiViewHolder.startAnimation(this.f71063v);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: Q */
        public C13729b mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            return new C13729b(new EmojiViewHolder(this.f71059r, this.f71064w, -2));
        }

        /* renamed from: R */
        public final void m76778R(List list) {
            AbstractC19074t.m100208f(list, "data");
            ArrayList arrayList = this.f71060s;
            arrayList.clear();
            arrayList.addAll(list);
            this.f71064w = (AbstractC23136l9.m118722k0() - (AbstractC23222t7.f112566j * 2)) / this.f71060s.size();
            m10008p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f71060s.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$a */
    /* loaded from: classes6.dex */
    public static final class C13730a {
        private C13730a() {
        }

        public /* synthetic */ C13730a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$b */
    /* loaded from: classes6.dex */
    static final class C13731b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13731b f71067q = new C13731b();

        C13731b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7252w7 mo12V4() {
            return new C7252w7(null);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$c */
    /* loaded from: classes6.dex */
    public static final class C13732c implements KeyboardFrameLayout.InterfaceC13508a {
        C13732c() {
        }

        /* renamed from: c */
        public static final void m76783c(CustomDefaultReactionListView customDefaultReactionListView) {
            boolean z11;
            AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
            if (C24265l.Companion.m126709b().m126697m().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            customDefaultReactionListView.m76743nN(!z11);
        }

        /* renamed from: d */
        public static final void m76784d(CustomDefaultReactionListView customDefaultReactionListView) {
            AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
            customDefaultReactionListView.m76743nN(false);
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            AbstractC19444a.m101697e(new Runnable() { // from class: lb0.v
                public /* synthetic */ RunnableC22420v() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomDefaultReactionListView.C13732c.m76783c(CustomDefaultReactionListView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            AbstractC19444a.m101697e(new Runnable() { // from class: lb0.u
                public /* synthetic */ RunnableC22419u() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomDefaultReactionListView.C13732c.m76784d(CustomDefaultReactionListView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$d */
    /* loaded from: classes6.dex */
    public static final class C13733d implements EditDefaultReactionAdapter.InterfaceC13728a {
        C13733d() {
        }

        @Override // com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView.EditDefaultReactionAdapter.InterfaceC13728a
        /* renamed from: n */
        public void mo76779n(int i11) {
            CustomDefaultReactionListView.this.f71046R0 = i11;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$e */
    /* loaded from: classes6.dex */
    public static final class C13734e extends RecyclerView.AbstractC1887n {
        C13734e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.top = AbstractC23222t7.f112528I;
            rect.bottom = AbstractC23222t7.f112514B;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$f */
    /* loaded from: classes6.dex */
    public static final class C13735f extends AbstractC31727b {
        C13735f() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emo");
            if (CustomDefaultReactionListView.this.f71046R0 >= 0 && CustomDefaultReactionListView.this.f71046R0 < CustomDefaultReactionListView.this.f71041M0.size()) {
                Object obj = CustomDefaultReactionListView.this.f71041M0.get(CustomDefaultReactionListView.this.f71046R0);
                CustomDefaultReactionListView customDefaultReactionListView = CustomDefaultReactionListView.this;
                C24753f c24753f = (C24753f) obj;
                int i13 = customDefaultReactionListView.f71046R0;
                int i14 = 0;
                C24753f m128615b = C24753f.Companion.m128615b(0, str);
                for (Object obj2 : customDefaultReactionListView.f71041M0) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    if (AbstractC19074t.m100204b(((C24753f) obj2).m128595h(), m128615b.m128595h())) {
                        i13 = i14;
                    }
                    i14 = i15;
                }
                customDefaultReactionListView.f71041M0.set(i13, c24753f);
                customDefaultReactionListView.f71041M0.set(customDefaultReactionListView.f71046R0, m128615b);
                customDefaultReactionListView.m76730eN();
                customDefaultReactionListView.m76705C();
                CustomDefaultReactionListView.this.m76764RM().f138641q.setEnabled(!CustomDefaultReactionListView.this.m76720UM());
            }
            C24265l.b bVar = C24265l.Companion;
            if (bVar.m126709b().m126697m().length() > 0) {
                CustomDefaultReactionListView customDefaultReactionListView2 = CustomDefaultReactionListView.this;
                ArrayList arrayList = customDefaultReactionListView2.f71053Y0;
                String lowerCase = bVar.m126709b().m126697m().toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                customDefaultReactionListView2.m76709FM(arrayList, lowerCase);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: j */
        public void mo76785j() {
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$g */
    /* loaded from: classes6.dex */
    public static final class C13736g implements C7252w7.c {
        C13736g() {
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
            CustomDefaultReactionListView.this.m76753sN(i11);
            CustomDefaultReactionListView.this.m76736hN(CustomDefaultReactionListView.this.m76714KM(i11));
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$h */
    /* loaded from: classes6.dex */
    public static final class C13737h implements AbsListView.OnScrollListener {
        C13737h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            boolean z11;
            if (CustomDefaultReactionListView.this.f72421L0.m92674mJ() && CustomDefaultReactionListView.this.f72421L0.m92672lJ()) {
                C24265l.b bVar = C24265l.Companion;
                if (bVar.m126709b().m126697m().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!CustomDefaultReactionListView.this.m76765VM()) {
                    if (CustomDefaultReactionListView.this.m76766WM()) {
                        CustomDefaultReactionListView.this.m76705C();
                    }
                    if (!z11) {
                        int m126695k = bVar.m126709b().m126695k(i11, i12 + i11);
                        CustomDefaultReactionListView customDefaultReactionListView = CustomDefaultReactionListView.this;
                        int m76713JM = customDefaultReactionListView.m76713JM(m126695k);
                        if (m76713JM != customDefaultReactionListView.m76761LM()) {
                            customDefaultReactionListView.m76753sN(m76713JM);
                        }
                    }
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (CustomDefaultReactionListView.this.f72421L0.m92674mJ() && CustomDefaultReactionListView.this.f72421L0.m92672lJ()) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        CustomDefaultReactionListView.this.m76770lN(true);
                    }
                } else {
                    CustomDefaultReactionListView.this.m76769kN(false);
                    CustomDefaultReactionListView.this.m76770lN(false);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$i */
    /* loaded from: classes6.dex */
    public static final class C13738i extends ZdsActionBar.AbstractC16987c {
        C13738i() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            if (CustomDefaultReactionListView.this.m76718SM()) {
                CustomDefaultReactionListView.this.m76745oN();
            } else {
                CustomDefaultReactionListView.this.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$j */
    /* loaded from: classes6.dex */
    static final class C13739j extends AbstractC19075u implements InterfaceC18494a {
        C13739j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final NoPredictiveItemAnimLinearLayoutMngr mo12V4() {
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(CustomDefaultReactionListView.this.getContext());
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
            return noPredictiveItemAnimLinearLayoutMngr;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$k */
    /* loaded from: classes6.dex */
    static final class C13740k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13740k f71075q = new C13740k();

        C13740k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AccelerateDecelerateInterpolator mo12V4() {
            return new AccelerateDecelerateInterpolator();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.CustomDefaultReactionListView$l */
    /* loaded from: classes6.dex */
    public static final class C13741l implements TextWatcher {
        C13741l() {
        }

        /* renamed from: b */
        public static final void m76789b(ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0, CustomDefaultReactionListView customDefaultReactionListView) {
            boolean z11;
            AbstractC19074t.m100208f(viewOnKeyListenerC7058f0, "$it");
            AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
            viewOnKeyListenerC7058f0.notifyDataSetChanged();
            if (C24265l.Companion.m126709b().m126697m().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            customDefaultReactionListView.m76743nN(!z11);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0;
            ListAdapter adapter = CustomDefaultReactionListView.this.m76762MM().f138451u.getAdapter();
            if (adapter instanceof ViewOnKeyListenerC7058f0) {
                viewOnKeyListenerC7058f0 = (ViewOnKeyListenerC7058f0) adapter;
            } else {
                viewOnKeyListenerC7058f0 = null;
            }
            if (viewOnKeyListenerC7058f0 != null) {
                AbstractC19444a.m101697e(new Runnable() { // from class: lb0.w

                    /* renamed from: q */
                    public final /* synthetic */ CustomDefaultReactionListView f109718q;

                    public /* synthetic */ RunnableC22421w(CustomDefaultReactionListView customDefaultReactionListView) {
                        r2 = customDefaultReactionListView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomDefaultReactionListView.C13741l.m76789b(ViewOnKeyListenerC7058f0.this, r2);
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
            ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0;
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
                C29884k2 m76762MM = CustomDefaultReactionListView.this.m76762MM();
                m76762MM.f138451u.setVisibility(0);
                m76762MM.f138451u.bringToFront();
                m76762MM.f138450t.setVisibility(8);
                ListAdapter adapter = m76762MM.f138451u.getAdapter();
                if (adapter instanceof ViewOnKeyListenerC7058f0) {
                    viewOnKeyListenerC7058f0 = (ViewOnKeyListenerC7058f0) adapter;
                } else {
                    viewOnKeyListenerC7058f0 = null;
                }
                if (viewOnKeyListenerC7058f0 != null) {
                    viewOnKeyListenerC7058f0.m36057u();
                }
                m76762MM.f138451u.smoothScrollToPositionFromTop(0, 0);
                if (z11) {
                    CustomDefaultReactionListView customDefaultReactionListView = CustomDefaultReactionListView.this;
                    ArrayList arrayList = customDefaultReactionListView.f71051W0;
                    String lowerCase = bVar.m126709b().m126697m().toLowerCase(Locale.ROOT);
                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                    customDefaultReactionListView.m76709FM(arrayList, lowerCase);
                    return;
                }
                return;
            }
            C29884k2 m76762MM2 = CustomDefaultReactionListView.this.m76762MM();
            m76762MM2.f138451u.setVisibility(8);
            MultiStateView multiStateView = m76762MM2.f138450t;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.EMPTY);
            multiStateView.f81188D.setVisibility(0);
            multiStateView.bringToFront();
            CustomDefaultReactionListView customDefaultReactionListView2 = CustomDefaultReactionListView.this;
            ArrayList arrayList2 = customDefaultReactionListView2.f71052X0;
            String lowerCase2 = bVar.m126709b().m126697m().toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
            customDefaultReactionListView2.m76709FM(arrayList2, lowerCase2);
        }
    }

    public CustomDefaultReactionListView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C13740k.f71075q);
        this.f71056b1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13739j());
        this.f71057c1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C13731b.f71067q);
        this.f71058d1 = m129210a3;
    }

    /* renamed from: C */
    public final void m76705C() {
        AbstractC2379w.m12430d(m76762MM().f138449s.getEditText());
    }

    /* renamed from: FM */
    public final void m76709FM(ArrayList arrayList, String str) {
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

    /* renamed from: GM */
    private final boolean m76710GM() {
        if ((!this.f71051W0.isEmpty()) || (!this.f71052X0.isEmpty()) || (!this.f71053Y0.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: HM */
    private final void m76711HM(int i11) {
        m76763OM().f137962q.post(new Runnable() { // from class: lb0.p

            /* renamed from: q */
            public final /* synthetic */ int f109710q;

            public /* synthetic */ RunnableC22414p(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CustomDefaultReactionListView.m76712IM(CustomDefaultReactionListView.this, r2);
            }
        });
    }

    /* renamed from: IM */
    public static final void m76712IM(CustomDefaultReactionListView customDefaultReactionListView, int i11) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        if (customDefaultReactionListView.mo60294yp()) {
            return;
        }
        customDefaultReactionListView.m76732fN(i11);
    }

    /* renamed from: JM */
    public final int m76713JM(int i11) {
        boolean m126679A = C24265l.Companion.m126709b().m126679A();
        if (i11 != -2) {
            if (i11 == -1) {
                return m126679A ? 1 : 0;
            }
            return (m126679A ? 1 : 0) + i11 + 1;
        }
        return 0;
    }

    /* renamed from: KM */
    public final int m76714KM(int i11) {
        int i12 = !C24265l.Companion.m126709b().m126679A() ? 1 : 0;
        if (i11 <= 0) {
            return i12 - 2;
        }
        if (i11 == 1) {
            return i12 - 1;
        }
        if (i11 >= m76715NM().mo10003k()) {
            i11 = m76715NM().mo10003k();
        }
        return i12 + (i11 - 2);
    }

    /* renamed from: NM */
    private final C7252w7 m76715NM() {
        return (C7252w7) this.f71058d1.getValue();
    }

    /* renamed from: PM */
    private final LinearLayoutManager m76716PM() {
        return (LinearLayoutManager) this.f71057c1.getValue();
    }

    /* renamed from: QM */
    private final TimeInterpolator m76717QM() {
        return (TimeInterpolator) this.f71056b1.getValue();
    }

    /* renamed from: SM */
    public final boolean m76718SM() {
        Iterator it = C24265l.Companion.m126709b().m126698n().iterator();
        String str = "";
        String str2 = "";
        while (it.hasNext()) {
            str2 = ((Object) str2) + ((C24753f) it.next()).m128595h() + " ";
        }
        Iterator it2 = this.f71041M0.iterator();
        while (it2.hasNext()) {
            str = ((Object) str) + ((C24753f) it2.next()).m128595h() + " ";
        }
        return !AbstractC19074t.m100204b(str2, str);
    }

    /* renamed from: TM */
    private final boolean m76719TM() {
        if (C24265l.Companion.m126709b().m126699o().m128546d() && C28652r.m143349v().m143359L()) {
            return true;
        }
        return false;
    }

    /* renamed from: UM */
    public final boolean m76720UM() {
        Iterator it = C24265l.Companion.m126709b().m126704w().iterator();
        String str = "";
        String str2 = "";
        while (it.hasNext()) {
            str2 = ((Object) str2) + ((C24753f) it.next()).m128595h() + " ";
        }
        Iterator it2 = this.f71041M0.iterator();
        while (it2.hasNext()) {
            str = ((Object) str) + ((C24753f) it2.next()).m128595h() + " ";
        }
        return AbstractC19074t.m100204b(str2, str);
    }

    /* renamed from: XM */
    public static final void m76721XM(C7252w7 c7252w7) {
        AbstractC19074t.m100208f(c7252w7, "$this_apply");
        c7252w7.m10008p();
    }

    /* renamed from: YM */
    public static final void m76722YM(CustomDefaultReactionListView customDefaultReactionListView, View view) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        customDefaultReactionListView.m76705C();
    }

    /* renamed from: ZM */
    public static final void m76723ZM(CustomDefaultReactionListView customDefaultReactionListView, C29920m2 c29920m2, View view) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        AbstractC19074t.m100208f(c29920m2, "$this_apply");
        ArrayList arrayList = customDefaultReactionListView.f71041M0;
        arrayList.clear();
        arrayList.addAll(C24265l.Companion.m126709b().m126704w());
        customDefaultReactionListView.m76730eN();
        c29920m2.f138641q.setEnabled(!customDefaultReactionListView.m76720UM());
    }

    /* renamed from: aN */
    public static final boolean m76724aN(CustomDefaultReactionListView customDefaultReactionListView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        if (i11 == 3) {
            customDefaultReactionListView.m76705C();
            return true;
        }
        return true;
    }

    /* renamed from: bN */
    public static final void m76725bN(View view) {
        if (!view.isFocusableInTouchMode()) {
            view.setFocusableInTouchMode(true);
        }
        view.requestFocus();
        AbstractC2379w.m12434h(view);
    }

    /* renamed from: cN */
    public static final void m76726cN(CustomDefaultReactionListView customDefaultReactionListView, Button button, View view) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        AbstractC19074t.m100208f(button, "$this_apply");
        button.setTrackingExtraData(C22423y.m115855h(customDefaultReactionListView.f71041M0));
        C24265l.b bVar = C24265l.Companion;
        bVar.m126709b().m126689P(customDefaultReactionListView.f71041M0);
        bVar.m126709b().m126690R(customDefaultReactionListView.f71050V0);
        customDefaultReactionListView.finish();
        customDefaultReactionListView.mo78955kl(new Runnable() { // from class: lb0.o
            @Override // java.lang.Runnable
            public final void run() {
                CustomDefaultReactionListView.m76728dN();
            }
        }, 0L);
    }

    /* renamed from: dN */
    public static final void m76728dN() {
        C23744a.Companion.m124119a().m124116d(76, new Object[0]);
    }

    /* renamed from: eN */
    public final void m76730eN() {
        EditDefaultReactionAdapter editDefaultReactionAdapter;
        RecyclerView.AbstractC1880g adapter = m76764RM().f138643s.getAdapter();
        if (adapter instanceof EditDefaultReactionAdapter) {
            editDefaultReactionAdapter = (EditDefaultReactionAdapter) adapter;
        } else {
            editDefaultReactionAdapter = null;
        }
        if (editDefaultReactionAdapter != null) {
            editDefaultReactionAdapter.m76778R(this.f71041M0);
        }
        m76764RM().f138643s.m9853S0();
    }

    /* renamed from: fN */
    private final void m76732fN(int i11) {
        SlidingTabRecyclerView slidingTabRecyclerView = m76763OM().f137962q;
        slidingTabRecyclerView.m9866X1();
        AbstractC19074t.m100205c(slidingTabRecyclerView);
        if (!m76751rN(slidingTabRecyclerView, m76716PM(), i11)) {
            slidingTabRecyclerView.m9837K1(i11);
            slidingTabRecyclerView.post(new Runnable() { // from class: lb0.i

                /* renamed from: q */
                public final /* synthetic */ SlidingTabRecyclerView f109701q;

                /* renamed from: r */
                public final /* synthetic */ int f109702r;

                public /* synthetic */ RunnableC22407i(SlidingTabRecyclerView slidingTabRecyclerView2, int i112) {
                    r2 = slidingTabRecyclerView2;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomDefaultReactionListView.m76734gN(CustomDefaultReactionListView.this, r2, r3);
                }
            });
        }
    }

    /* renamed from: gN */
    public static final void m76734gN(CustomDefaultReactionListView customDefaultReactionListView, SlidingTabRecyclerView slidingTabRecyclerView, int i11) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        AbstractC19074t.m100208f(slidingTabRecyclerView, "$this_with");
        if (customDefaultReactionListView.mo60294yp()) {
            return;
        }
        customDefaultReactionListView.m76751rN(slidingTabRecyclerView, customDefaultReactionListView.m76716PM(), i11);
    }

    /* renamed from: hN */
    public final void m76736hN(int i11) {
        this.f71048T0 = true;
        int m126702t = C24265l.Companion.m126709b().m126702t(i11);
        if (m126702t >= 0) {
            m76762MM().f138451u.smoothScrollToPositionFromTop(m126702t, 0, 300);
        }
    }

    /* renamed from: nN */
    public final void m76743nN(boolean z11) {
        if (z11) {
            m76763OM().f137962q.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m76763OM().f137962q, (Property<SlidingTabRecyclerView, Float>) View.TRANSLATION_Y, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(m76717QM());
            ofFloat.start();
            return;
        }
        m76763OM().f137962q.setTranslationY(StickerPanelView.Companion.m72711a());
        m76763OM().f137962q.setVisibility(8);
    }

    /* renamed from: oN */
    public final void m76745oN() {
        try {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_dialog_confirm_exit_custom_reaction);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m90932i.m90949z(m118743r0).m90942s(AbstractC8020f0.str_button_exit, new InterfaceC17463d.d() { // from class: lb0.q
                public /* synthetic */ C22415q() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    CustomDefaultReactionListView.m76747pN(CustomDefaultReactionListView.this, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_button_stay, new InterfaceC17463d.d() { // from class: lb0.r
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    CustomDefaultReactionListView.m76749qN(interfaceC17463d, i11);
                }
            }).m90927d().mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pN */
    public static final void m76747pN(CustomDefaultReactionListView customDefaultReactionListView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(customDefaultReactionListView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        customDefaultReactionListView.finish();
    }

    /* renamed from: qN */
    public static final void m76749qN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: rN */
    private final boolean m76751rN(SlidingTabRecyclerView slidingTabRecyclerView, LinearLayoutManager linearLayoutManager, int i11) {
        View mo9732P;
        if (slidingTabRecyclerView.getWidth() <= 0 || (mo9732P = linearLayoutManager.mo9732P(i11)) == null) {
            return false;
        }
        slidingTabRecyclerView.m9845O1(mo9732P.getLeft() - ((slidingTabRecyclerView.getWidth() - mo9732P.getWidth()) / 2), 0);
        return true;
    }

    /* renamed from: sN */
    public final void m76753sN(int i11) {
        if (m76763OM().f137962q.getAdapter() != null) {
            this.f71045Q0 = i11;
            m76763OM().f137962q.m76911d2(i11);
            m76711HM(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f71054Z0 = string;
        }
        if (bundle != null) {
            this.f71050V0 = bundle.getInt("BACKUP_CURRENT_MODE", 0);
        }
        ArrayList arrayList = this.f71041M0;
        arrayList.clear();
        arrayList.addAll(C24265l.Companion.m126709b().m126698n());
        C0697c0.Companion.m1052f(this, "src", this.f71054Z0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C24265l.b bVar = C24265l.Companion;
        bVar.m126709b().m126690R(2);
        bVar.m126709b().m126691S("");
        C29920m2 m148230c = C29920m2.m148230c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148230c, "inflate(...)");
        m76771mN(m148230c);
        C29831h3 m148021a = C29831h3.m148021a(m76764RM().f138644t.f137962q);
        AbstractC19074t.m100207e(m148021a, "bind(...)");
        m76768jN(m148021a);
        C29884k2 m148149a = C29884k2.m148149a(m76764RM().f138646v.f138447q);
        AbstractC19074t.m100207e(m148149a, "bind(...)");
        m76767iN(m148149a);
        C29920m2 m76764RM = m76764RM();
        KeyboardFrameLayout keyboardFrameLayout = m76764RM.f138645u;
        keyboardFrameLayout.setTopViewGroup(m76764RM.f138642r);
        keyboardFrameLayout.setOnKeyboardListener(new C13732c());
        m76764RM.f138642r.setOnClickListener(new View.OnClickListener() { // from class: lb0.h
            public /* synthetic */ ViewOnClickListenerC22406h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomDefaultReactionListView.m76722YM(CustomDefaultReactionListView.this, view);
            }
        });
        m76764RM.f138641q.setEnabled(!m76720UM());
        m76764RM.f138641q.setIdTracking("reaction_reset_fav");
        m76764RM.f138641q.setOnClickListener(new View.OnClickListener() { // from class: lb0.j

            /* renamed from: q */
            public final /* synthetic */ C29920m2 f109704q;

            public /* synthetic */ ViewOnClickListenerC22408j(C29920m2 m76764RM2) {
                r2 = m76764RM2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomDefaultReactionListView.m76723ZM(CustomDefaultReactionListView.this, r2, view);
            }
        });
        Context context = getContext();
        if (context != null) {
            m76764RM2.f138643s.setLayoutManager(new LinearLayoutManager(context, 0, false));
            RecyclerView recyclerView = m76764RM2.f138643s;
            AbstractC19074t.m100205c(context);
            recyclerView.setAdapter(new EditDefaultReactionAdapter(context, new C13733d()));
            m76764RM2.f138643s.m9816A(new C13734e());
        }
        C29884k2 m76762MM = m76762MM();
        LinearLayout linearLayout = m76762MM.f138447q;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), AbstractC23222t7.f112586t, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        SearchField searchField = m76762MM.f138449s;
        searchField.setMaxLength(30);
        searchField.getEditText().setFocusableInTouchMode(false);
        searchField.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lb0.k
            public /* synthetic */ C22409k() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m76724aN;
                m76724aN = CustomDefaultReactionListView.m76724aN(CustomDefaultReactionListView.this, textView, i11, keyEvent);
                return m76724aN;
            }
        });
        searchField.getEditText().setOnClickListener(new View.OnClickListener() { // from class: lb0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomDefaultReactionListView.m76725bN(view);
            }
        });
        searchField.getEditText().setImeOptions(3);
        searchField.getEditText().setMaxLines(1);
        searchField.getEditText().addTextChangedListener(this.f71055a1);
        ViewOnKeyListenerC7058f0.b bVar2 = new ViewOnKeyListenerC7058f0.b();
        bVar2.f38572a = 32;
        ListView listView = m76762MM.f138451u;
        ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0 = new ViewOnKeyListenerC7058f0(m92689tK(), true, -3, 6, bVar2);
        viewOnKeyListenerC7058f0.m36060x(new C13735f());
        listView.setAdapter((ListAdapter) viewOnKeyListenerC7058f0);
        if (m76719TM()) {
            SlidingTabRecyclerView slidingTabRecyclerView = m76763OM().f137962q;
            slidingTabRecyclerView.setLayoutManager(m76716PM());
            slidingTabRecyclerView.setOverScrollMode(2);
            C7252w7 m76715NM = m76715NM();
            m76715NM.m36985e0(new C13736g());
            slidingTabRecyclerView.setAdapter(m76715NM);
            slidingTabRecyclerView.setVisibility(0);
            m76762MM.f138451u.setOnScrollListener(new C13737h());
        } else {
            m76763OM().f137962q.setVisibility(8);
        }
        m76762MM.f138450t.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_empty_state_search_emoji_reaction));
        KeyboardFrameLayout root = m76764RM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        if (m76710GM()) {
            C0732w.Companion.m1189a().m1187q("reaction_search", "custom_favorite_reaction", null, C22423y.f109724a.m115858f(this.f71051W0, this.f71052X0, this.f71053Y0));
        }
        super.mo40200KJ();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(this.f71047S0);
        }
    }

    /* renamed from: LM */
    public final int m76761LM() {
        return this.f71045Q0;
    }

    /* renamed from: MM */
    public final C29884k2 m76762MM() {
        C29884k2 c29884k2 = this.f71043O0;
        if (c29884k2 != null) {
            return c29884k2;
        }
        AbstractC19074t.m100223u("expandReactionPickerViewBinding");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C13738i());
            m87077NK.setTrailingType(ZdsActionBar.EnumC16990f.CUSTOM.m91019c());
            Context context = m87077NK.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Button button = new Button(context);
            button.setIdTracking("reaction_save_fav");
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_save_custom_list_default_reaction));
            button.m90539c(AbstractC2814h.ButtonMedium_Tertiary);
            button.setOnClickListener(new View.OnClickListener() { // from class: lb0.m

                /* renamed from: q */
                public final /* synthetic */ Button f109707q;

                public /* synthetic */ ViewOnClickListenerC22411m(Button button2) {
                    r2 = button2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomDefaultReactionListView.m76726cN(CustomDefaultReactionListView.this, r2, view);
                }
            });
            m87077NK.setCustomTrailingItem(button2);
        }
    }

    /* renamed from: OM */
    public final C29831h3 m76763OM() {
        C29831h3 c29831h3 = this.f71044P0;
        if (c29831h3 != null) {
            return c29831h3;
        }
        AbstractC19074t.m100223u("indicatorViewBinding");
        return null;
    }

    /* renamed from: RM */
    public final C29920m2 m76764RM() {
        C29920m2 c29920m2 = this.f71042N0;
        if (c29920m2 != null) {
            return c29920m2;
        }
        AbstractC19074t.m100223u("viewBinding");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putInt("BACKUP_CURRENT_MODE", this.f71050V0);
    }

    /* renamed from: VM */
    public final boolean m76765VM() {
        return this.f71048T0;
    }

    /* renamed from: WM */
    public final boolean m76766WM() {
        return this.f71049U0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        WindowManager.LayoutParams attributes;
        super.mo37122XJ(z11, z12);
        if (z11 && m92672lJ() && m92674mJ()) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                Window window = m92676n2.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    this.f71047S0 = attributes.softInputMode;
                }
                m92676n2.mo35554O(32);
                return;
            }
            return;
        }
        if (!z11) {
            m76705C();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m76730eN();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CustomReactionScreen";
    }

    /* renamed from: iN */
    public final void m76767iN(C29884k2 c29884k2) {
        AbstractC19074t.m100208f(c29884k2, "<set-?>");
        this.f71043O0 = c29884k2;
    }

    /* renamed from: jN */
    public final void m76768jN(C29831h3 c29831h3) {
        AbstractC19074t.m100208f(c29831h3, "<set-?>");
        this.f71044P0 = c29831h3;
    }

    /* renamed from: kN */
    public final void m76769kN(boolean z11) {
        this.f71048T0 = z11;
    }

    /* renamed from: lN */
    public final void m76770lN(boolean z11) {
        this.f71049U0 = z11;
    }

    /* renamed from: mN */
    public final void m76771mN(C29920m2 c29920m2) {
        AbstractC19074t.m100208f(c29920m2, "<set-?>");
        this.f71042N0 = c29920m2;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C24265l.Companion.m126709b().m126690R(2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C7252w7 m76715NM = m76715NM();
        m76715NM.m36984d0(C24265l.Companion.m126709b().m126703u(true));
        m76715NM.m36986f0(this.f71045Q0);
        mo70710wy(new Runnable() { // from class: lb0.n
            public /* synthetic */ RunnableC22412n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CustomDefaultReactionListView.m76721XM(C7252w7.this);
            }
        });
    }
}
