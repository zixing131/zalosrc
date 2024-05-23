package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1563j0;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalPreStateLayout;
import com.zing.zalo.p077ui.widget.AbstractC13642h0;
import com.zing.zalo.p077ui.widget.C13818y1;
import com.zing.zalo.p077ui.widget.C13822z1;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import ea0.C18316b;
import ea0.C18325e;
import ea0.InterfaceC18319c;
import ed0.AbstractC18391a;
import en0.InterfaceC18505l;
import fb0.C18865a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.AbstractRunnableC19355q1;
import ga0.C19327h0;
import gg0.AbstractC19444a;
import ha0.C19955h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l00.AbstractC21994b;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import on0.AbstractC24342w;
import p227i3.C20215s;
import p542ub.InterfaceC27218a;
import p578vk.AbstractC28275a;
import p612wk.AbstractC29076h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import uk.C27285a;
import uk.C27286b;

/* loaded from: classes6.dex */
public final class QuickAccessContactPickerView extends SlidableZaloView implements InterfaceC18319c, KeyboardFrameLayout.InterfaceC13508a {
    public static final C14831a Companion = new C14831a(null);

    /* renamed from: P0 */
    private final C27286b f76563P0;

    /* renamed from: Q0 */
    private AbstractRunnableC19355q1 f76564Q0;

    /* renamed from: R0 */
    private SearchGlobalPreStateLayout f76565R0;

    /* renamed from: S0 */
    private SearchGlobalPreStateLayout f76566S0;

    /* renamed from: T0 */
    private MultiStateView f76567T0;

    /* renamed from: U0 */
    private EditText f76568U0;

    /* renamed from: V0 */
    private View f76569V0;

    /* renamed from: W0 */
    private KeyboardFrameLayout f76570W0;

    /* renamed from: X0 */
    private RobotoTextView f76571X0;

    /* renamed from: Y0 */
    private RobotoTextView f76572Y0;

    /* renamed from: Z0 */
    private ValueAnimator f76573Z0;

    /* renamed from: a1 */
    private LinearLayout f76574a1;

    /* renamed from: b1 */
    private LinearLayout f76575b1;

    /* renamed from: c1 */
    private ValueAnimator f76576c1;

    /* renamed from: d1 */
    private ValueAnimator f76577d1;

    /* renamed from: e1 */
    private ViewTreeObserver.OnGlobalLayoutListener f76578e1;

    /* renamed from: f1 */
    private boolean f76579f1;

    /* renamed from: g1 */
    private boolean f76580g1;

    /* renamed from: h1 */
    private int f76581h1;

    /* renamed from: i1 */
    private final C1914g f76582i1;

    /* renamed from: j1 */
    private final C1914g f76583j1;

    /* renamed from: k1 */
    private final C14838h f76584k1;

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C14831a {
        private C14831a() {
        }

        public /* synthetic */ C14831a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$b */
    /* loaded from: classes6.dex */
    public static final class C14832b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ AbstractC28275a.d f76585q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14832b(AbstractC28275a.d dVar) {
            super(1);
            this.f76585q = dVar;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(AbstractC28275a.d dVar) {
            AbstractC19074t.m100208f(dVar, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(dVar.m142475c().mo2478b(), this.f76585q.m142475c().mo2478b()));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$c */
    /* loaded from: classes6.dex */
    public static final class C14833c implements Animator.AnimatorListener {
        public C14833c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            LinearLayout linearLayout = QuickAccessContactPickerView.this.f76575b1;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            linearLayout.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$d */
    /* loaded from: classes6.dex */
    public static final class C14834d implements Animator.AnimatorListener {
        public C14834d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            LinearLayout linearLayout = QuickAccessContactPickerView.this.f76575b1;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            linearLayout.setTranslationY(0.0f);
            LinearLayout linearLayout3 = QuickAccessContactPickerView.this.f76575b1;
            if (linearLayout3 == null) {
                AbstractC19074t.m100223u("footerLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$e */
    /* loaded from: classes6.dex */
    public static final class C14835e implements Animator.AnimatorListener {
        public C14835e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            LinearLayout linearLayout = QuickAccessContactPickerView.this.f76575b1;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            LinearLayout linearLayout3 = QuickAccessContactPickerView.this.f76575b1;
            if (linearLayout3 == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout3 = null;
            }
            linearLayout.setTranslationY(linearLayout3.getHeight());
            LinearLayout linearLayout4 = QuickAccessContactPickerView.this.f76575b1;
            if (linearLayout4 == null) {
                AbstractC19074t.m100223u("footerLayout");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout2.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$f */
    /* loaded from: classes6.dex */
    public static final class C14836f extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ int f76590q;

        C14836f(int i11) {
            this.f76590q = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            try {
                LinearLayout linearLayout = QuickAccessContactPickerView.this.f76574a1;
                LinearLayout linearLayout2 = null;
                if (linearLayout == null) {
                    AbstractC19074t.m100223u("mainLayout");
                    linearLayout = null;
                }
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = this.f76590q;
                LinearLayout linearLayout3 = QuickAccessContactPickerView.this.f76574a1;
                if (linearLayout3 == null) {
                    AbstractC19074t.m100223u("mainLayout");
                } else {
                    linearLayout2 = linearLayout3;
                }
                linearLayout2.setLayoutParams(layoutParams2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$g */
    /* loaded from: classes6.dex */
    public static final class RunnableC14837g implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f76591p;

        /* renamed from: q */
        final /* synthetic */ QuickAccessContactPickerView f76592q;

        public RunnableC14837g(View view, QuickAccessContactPickerView quickAccessContactPickerView) {
            this.f76591p = view;
            this.f76592q = quickAccessContactPickerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            QuickAccessContactPickerView.m83186OM(this.f76592q, 0, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickAccessContactPickerView$h */
    /* loaded from: classes6.dex */
    public static final class C14838h extends AbstractC18391a {
        C14838h() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
            QuickAccessContactPickerView.this.m83182GM();
        }
    }

    public QuickAccessContactPickerView() {
        super(AbstractC7409c0.quick_access_contact_picker_view);
        this.f76563P0 = new C27286b();
        this.f76582i1 = new C1914g();
        this.f76583j1 = new C1914g();
        this.f76584k1 = new C14838h();
    }

    /* renamed from: AM */
    static /* synthetic */ void m83178AM(QuickAccessContactPickerView quickAccessContactPickerView, float f11, int i11, float f12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f12 = -1.0f;
        }
        quickAccessContactPickerView.m83213zM(f11, i11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m83179BM(int i11, QuickAccessContactPickerView quickAccessContactPickerView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue() * i11;
            LinearLayout linearLayout = quickAccessContactPickerView.f76575b1;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            linearLayout.setTranslationY(floatValue);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m83180DM(QuickAccessContactPickerView quickAccessContactPickerView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        LinearLayout linearLayout = quickAccessContactPickerView.f76575b1;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = null;
        if (linearLayout == null) {
            AbstractC19074t.m100223u("footerLayout");
            linearLayout = null;
        }
        int height = linearLayout.getHeight() + AbstractC23222t7.f112586t;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = quickAccessContactPickerView.f76565R0;
        if (searchGlobalPreStateLayout2 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout2 = null;
        }
        if (searchGlobalPreStateLayout2.getRecyclerView().getPaddingBottom() >= height) {
            SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = quickAccessContactPickerView.f76565R0;
            if (searchGlobalPreStateLayout3 == null) {
                AbstractC19074t.m100223u("listLayout");
                searchGlobalPreStateLayout3 = null;
            }
            if (searchGlobalPreStateLayout3.getRecyclerView().getPaddingBottom() <= AbstractC23222t7.f112586t + height) {
                return;
            }
        }
        MultiStateView multiStateView = quickAccessContactPickerView.f76567T0;
        if (multiStateView == null) {
            AbstractC19074t.m100223u("multiStateView");
            multiStateView = null;
        }
        multiStateView.setPadding(multiStateView.getPaddingLeft(), multiStateView.getPaddingTop(), multiStateView.getPaddingRight(), height);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout4 = quickAccessContactPickerView.f76565R0;
        if (searchGlobalPreStateLayout4 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout4 = null;
        }
        AbstractC21994b m76247a = AbstractC13642h0.m76247a(searchGlobalPreStateLayout4.getRecyclerView());
        if (m76247a != null) {
            m76247a.m114859H(0.0f, height);
        }
        SearchGlobalPreStateLayout searchGlobalPreStateLayout5 = quickAccessContactPickerView.f76565R0;
        if (searchGlobalPreStateLayout5 == null) {
            AbstractC19074t.m100223u("listLayout");
        } else {
            searchGlobalPreStateLayout = searchGlobalPreStateLayout5;
        }
        RecyclerView recyclerView = searchGlobalPreStateLayout.getRecyclerView();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m83181EM(QuickAccessContactPickerView quickAccessContactPickerView, View view) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        quickAccessContactPickerView.m83209vM();
        quickAccessContactPickerView.m83183HM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final void m83182GM() {
        CharSequence m127168X0;
        EditText editText = this.f76568U0;
        if (editText == null) {
            AbstractC19074t.m100223u("searchEditText");
            editText = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(editText.getText().toString());
        String obj = m127168X0.toString();
        AbstractRunnableC19355q1 abstractRunnableC19355q1 = this.f76564Q0;
        if (abstractRunnableC19355q1 != null) {
            abstractRunnableC19355q1.m101436c();
        }
        C19327h0 c19327h0 = new C19327h0(this, obj, null, 4, null);
        this.f76564Q0 = c19327h0;
        c19327h0.m101442j();
    }

    /* renamed from: HM */
    private final void m83183HM() {
        try {
            if (this.f76579f1) {
                return;
            }
            this.f76579f1 = true;
            this.f76580g1 = true;
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.f76563P0.m139687e().iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC28275a.d) it.next()).m142475c().mo2478b());
            }
            Intent intent = new Intent();
            intent.putStringArrayListExtra("extra_selected_profiles", arrayList);
            mo50035CK(-1, intent);
            finish();
        } catch (Exception unused) {
            if (!mo60294yp()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
            this.f76579f1 = false;
        }
    }

    /* renamed from: IM */
    private final void m83184IM() {
        try {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.y80
                @Override // java.lang.Runnable
                public final void run() {
                    QuickAccessContactPickerView.m83185JM(QuickAccessContactPickerView.this);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m83185JM(QuickAccessContactPickerView quickAccessContactPickerView) {
        LinearLayoutManager linearLayoutManager;
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = quickAccessContactPickerView.f76566S0;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = null;
        if (searchGlobalPreStateLayout == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout = null;
        }
        if (searchGlobalPreStateLayout.getAdapter().mo10003k() > 0 && quickAccessContactPickerView.m92674mJ() && !quickAccessContactPickerView.m92681pJ()) {
            SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = quickAccessContactPickerView.f76566S0;
            if (searchGlobalPreStateLayout3 == null) {
                AbstractC19074t.m100223u("bubbleListLayout");
                searchGlobalPreStateLayout3 = null;
            }
            RecyclerView.AbstractC1888o layoutManager = searchGlobalPreStateLayout3.getRecyclerView().getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                SearchGlobalPreStateLayout searchGlobalPreStateLayout4 = quickAccessContactPickerView.f76566S0;
                if (searchGlobalPreStateLayout4 == null) {
                    AbstractC19074t.m100223u("bubbleListLayout");
                } else {
                    searchGlobalPreStateLayout2 = searchGlobalPreStateLayout4;
                }
                linearLayoutManager.m9721B2(searchGlobalPreStateLayout2.getAdapter().mo10003k() - 1, 0);
            }
        }
    }

    /* renamed from: OM */
    public static /* synthetic */ void m83186OM(QuickAccessContactPickerView quickAccessContactPickerView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            if (!quickAccessContactPickerView.f76563P0.m139689g() && quickAccessContactPickerView.f76563P0.m139687e().isEmpty()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
        }
        quickAccessContactPickerView.m83219NM(i11);
    }

    /* renamed from: PM */
    private final void m83187PM(int i11) {
        RobotoTextView robotoTextView = this.f76572Y0;
        if (robotoTextView != null) {
            int i12 = 0;
            if (i11 == 0 && robotoTextView.getVisibility() != 8) {
                robotoTextView.setVisibility(8);
            } else if (i11 != 0 && robotoTextView.getVisibility() != 0) {
                robotoTextView.setText(i11);
                robotoTextView.setVisibility(0);
            }
            if (i11 != 0) {
                if (Build.VERSION.SDK_INT >= 30) {
                    i12 = 17;
                }
                robotoTextView.performHapticFeedback(i12);
            }
        }
    }

    /* renamed from: QM */
    static /* synthetic */ void m83188QM(QuickAccessContactPickerView quickAccessContactPickerView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        quickAccessContactPickerView.m83187PM(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:            if (r0.mo10003k() == 0) goto L13;     */
    /* renamed from: RM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m83189RM(List list) {
        C1914g c1914g;
        int i11 = 0;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = null;
        boolean z11 = true;
        if (list.size() == 1) {
            SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = this.f76566S0;
            if (searchGlobalPreStateLayout2 == null) {
                AbstractC19074t.m100223u("bubbleListLayout");
                searchGlobalPreStateLayout2 = null;
            }
            RecyclerView.AbstractC1880g adapter = searchGlobalPreStateLayout2.getRecyclerView().getAdapter();
            if (adapter != null) {
            }
        }
        z11 = false;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = this.f76566S0;
        if (searchGlobalPreStateLayout3 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout3 = null;
        }
        if (list.isEmpty()) {
            i11 = 8;
        }
        searchGlobalPreStateLayout3.setVisibility(i11);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout4 = this.f76566S0;
        if (searchGlobalPreStateLayout4 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout4 = null;
        }
        RecyclerView recyclerView = searchGlobalPreStateLayout4.getRecyclerView();
        if (z11) {
            c1914g = null;
        } else {
            c1914g = this.f76583j1;
        }
        recyclerView.setItemAnimator(c1914g);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout5 = this.f76566S0;
        if (searchGlobalPreStateLayout5 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
        } else {
            searchGlobalPreStateLayout = searchGlobalPreStateLayout5;
        }
        searchGlobalPreStateLayout.m73394c(list);
    }

    /* renamed from: SM */
    private final void m83190SM(List list, boolean z11) {
        C1914g c1914g;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f76565R0;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = null;
        if (searchGlobalPreStateLayout == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout = null;
        }
        RecyclerView recyclerView = searchGlobalPreStateLayout.getRecyclerView();
        if (z11) {
            c1914g = this.f76582i1;
        } else {
            c1914g = null;
        }
        recyclerView.setItemAnimator(c1914g);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = this.f76565R0;
        if (searchGlobalPreStateLayout3 == null) {
            AbstractC19074t.m100223u("listLayout");
        } else {
            searchGlobalPreStateLayout2 = searchGlobalPreStateLayout3;
        }
        searchGlobalPreStateLayout2.m73394c(list);
        if (!z11) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.x80
                @Override // java.lang.Runnable
                public final void run() {
                    QuickAccessContactPickerView.m83191TM(QuickAccessContactPickerView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m83191TM(QuickAccessContactPickerView quickAccessContactPickerView) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        if (quickAccessContactPickerView.m92674mJ() && !quickAccessContactPickerView.m92681pJ()) {
            SearchGlobalPreStateLayout searchGlobalPreStateLayout = quickAccessContactPickerView.f76565R0;
            LinearLayoutManager linearLayoutManager = null;
            if (searchGlobalPreStateLayout == null) {
                AbstractC19074t.m100223u("listLayout");
                searchGlobalPreStateLayout = null;
            }
            RecyclerView.AbstractC1888o layoutManager = searchGlobalPreStateLayout.getRecyclerView().getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.m9721B2(0, 0);
            }
        }
    }

    /* renamed from: UM */
    private final void m83192UM() {
        try {
            if (this.f76578e1 != null) {
                LinearLayout linearLayout = this.f76575b1;
                if (linearLayout == null) {
                    AbstractC19074t.m100223u("footerLayout");
                    linearLayout = null;
                }
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f76578e1);
                this.f76578e1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    private final void m83193VM() {
        RobotoTextView robotoTextView = this.f76571X0;
        if (robotoTextView != null) {
            robotoTextView.setText(this.f76563P0.m139687e().size() + "/" + this.f76563P0.m139685c());
        }
    }

    /* renamed from: rM */
    private final void m83205rM(C27286b c27286b, AbstractC28275a.d dVar) {
        int i11;
        List m131185M0;
        List m131185M02;
        AbstractC28275a.d dVar2 = null;
        AbstractC28275a.d dVar3 = null;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = null;
        int i12 = 0;
        if (c27286b.m139688f().contains(dVar.m142475c().mo2478b())) {
            dVar.m142480h(false);
            c27286b.m139688f().remove(dVar.m142475c().mo2478b());
            AbstractC25378x.m131542D(c27286b.m139687e(), new C14832b(dVar));
            m83186OM(this, 0, 1, null);
            m83193VM();
            RobotoTextView robotoTextView = this.f76571X0;
            if (robotoTextView != null) {
                robotoTextView.setFontStyle(5);
            }
            SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = this.f76565R0;
            if (searchGlobalPreStateLayout2 == null) {
                AbstractC19074t.m100223u("listLayout");
                searchGlobalPreStateLayout2 = null;
            }
            C18325e adapter = searchGlobalPreStateLayout2.getAdapter();
            List m10632L = adapter.m10632L();
            AbstractC19074t.m100207e(m10632L, "getCurrentList(...)");
            Iterator it = m10632L.iterator();
            int i13 = 0;
            while (true) {
                if (it.hasNext()) {
                    AbstractC28275a abstractC28275a = (AbstractC28275a) it.next();
                    if ((abstractC28275a instanceof AbstractC28275a.d) && AbstractC19074t.m100204b(((AbstractC28275a.d) abstractC28275a).m142475c().mo2478b(), dVar.m142475c().mo2478b())) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (i13 != -1) {
                Object obj = adapter.m10632L().get(i13);
                if (obj instanceof AbstractC28275a.d) {
                    dVar3 = (AbstractC28275a.d) obj;
                }
                if (dVar3 != null) {
                    dVar3.m142480h(false);
                }
                adapter.m10010r(i13, "OnSelectStateChanged");
            }
            m131185M02 = AbstractC25332a0.m131185M0(c27286b.m139687e());
            m83189RM(m131185M02);
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.t80
                @Override // java.lang.Runnable
                public final void run() {
                    QuickAccessContactPickerView.m83206sM(QuickAccessContactPickerView.this);
                }
            }, 120L);
            return;
        }
        if (c27286b.m139687e().size() >= c27286b.m139685c()) {
            SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = this.f76565R0;
            if (searchGlobalPreStateLayout3 == null) {
                AbstractC19074t.m100223u("listLayout");
            } else {
                searchGlobalPreStateLayout = searchGlobalPreStateLayout3;
            }
            C18325e adapter2 = searchGlobalPreStateLayout.getAdapter();
            List m10632L2 = adapter2.m10632L();
            AbstractC19074t.m100207e(m10632L2, "getCurrentList(...)");
            Iterator it2 = m10632L2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AbstractC28275a abstractC28275a2 = (AbstractC28275a) it2.next();
                    if ((abstractC28275a2 instanceof AbstractC28275a.d) && AbstractC19074t.m100204b(((AbstractC28275a.d) abstractC28275a2).m142475c().mo2478b(), dVar.m142475c().mo2478b())) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1) {
                adapter2.m10010r(i12, "OnSelectStateChanged");
            }
            m83193VM();
            RobotoTextView robotoTextView2 = this.f76571X0;
            if (robotoTextView2 != null) {
                robotoTextView2.setFontStyle(7);
            }
            m83187PM(AbstractC8020f0.str_search_global_pre_state_quick_access_reach_limit);
            return;
        }
        dVar.m142480h(true);
        c27286b.m139687e().add(new AbstractC28275a.d(dVar.m142475c(), dVar.m142476d(), dVar.m142474b(), AbstractC28275a.j.a.f131918a, dVar.m142477e(), dVar.m142479g(), null, 64, null));
        Set m139688f = c27286b.m139688f();
        String mo2478b = dVar.m142475c().mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        m139688f.add(mo2478b);
        m83186OM(this, 0, 1, null);
        m83193VM();
        RobotoTextView robotoTextView3 = this.f76571X0;
        if (robotoTextView3 != null) {
            robotoTextView3.setFontStyle(5);
        }
        m83188QM(this, 0, 1, null);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout4 = this.f76565R0;
        if (searchGlobalPreStateLayout4 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout4 = null;
        }
        C18325e adapter3 = searchGlobalPreStateLayout4.getAdapter();
        List m10632L3 = adapter3.m10632L();
        AbstractC19074t.m100207e(m10632L3, "getCurrentList(...)");
        Iterator it3 = m10632L3.iterator();
        while (true) {
            if (it3.hasNext()) {
                AbstractC28275a abstractC28275a3 = (AbstractC28275a) it3.next();
                if ((abstractC28275a3 instanceof AbstractC28275a.d) && AbstractC19074t.m100204b(((AbstractC28275a.d) abstractC28275a3).m142475c().mo2478b(), dVar.m142475c().mo2478b())) {
                    i11 = -1;
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                i12 = -1;
                break;
            }
        }
        if (i12 != i11) {
            Object obj2 = adapter3.m10632L().get(i12);
            if (obj2 instanceof AbstractC28275a.d) {
                dVar2 = (AbstractC28275a.d) obj2;
            }
            if (dVar2 != null) {
                dVar2.m142480h(true);
            }
            adapter3.m10010r(i12, "OnSelectStateChanged");
        }
        m131185M0 = AbstractC25332a0.m131185M0(c27286b.m139687e());
        m83189RM(m131185M0);
        m83184IM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m83206sM(QuickAccessContactPickerView quickAccessContactPickerView) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        if (!quickAccessContactPickerView.mo60294yp()) {
            m83188QM(quickAccessContactPickerView, 0, 1, null);
        }
    }

    /* renamed from: tM */
    private final void m83207tM(boolean z11) {
        EditText editText = this.f76568U0;
        if (editText == null) {
            AbstractC19074t.m100223u("searchEditText");
            editText = null;
        }
        if (z11) {
            editText.clearFocus();
        }
        AbstractC2379w.m12430d(editText);
    }

    /* renamed from: uM */
    static /* synthetic */ void m83208uM(QuickAccessContactPickerView quickAccessContactPickerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        quickAccessContactPickerView.m83207tM(z11);
    }

    /* renamed from: vM */
    private final void m83209vM() {
        m83208uM(this, false, 1, null);
    }

    /* renamed from: wM */
    private final void m83210wM() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(325L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.z80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuickAccessContactPickerView.m83212yM(QuickAccessContactPickerView.this, valueAnimator);
            }
        });
        AbstractC19074t.m100205c(ofFloat);
        ofFloat.addListener(new C14835e());
        AbstractC19074t.m100207e(ofFloat, "also(...)");
        this.f76576c1 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(325L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.a90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuickAccessContactPickerView.m83211xM(QuickAccessContactPickerView.this, valueAnimator);
            }
        });
        AbstractC19074t.m100205c(ofFloat2);
        ofFloat2.addListener(new C14834d());
        ofFloat2.addListener(new C14833c());
        AbstractC19074t.m100207e(ofFloat2, "also(...)");
        this.f76577d1 = ofFloat2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m83211xM(QuickAccessContactPickerView quickAccessContactPickerView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = quickAccessContactPickerView.f76575b1;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            LinearLayout linearLayout3 = quickAccessContactPickerView.f76575b1;
            if (linearLayout3 == null) {
                AbstractC19074t.m100223u("footerLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout.setTranslationY(floatValue * linearLayout2.getHeight());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m83212yM(QuickAccessContactPickerView quickAccessContactPickerView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(quickAccessContactPickerView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = quickAccessContactPickerView.f76575b1;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("footerLayout");
                linearLayout = null;
            }
            LinearLayout linearLayout3 = quickAccessContactPickerView.f76575b1;
            if (linearLayout3 == null) {
                AbstractC19074t.m100223u("footerLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout.setTranslationY(floatValue * linearLayout2.getHeight());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    private final void m83213zM(float f11, final int i11, float f12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        this.f76573Z0 = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator = this.f76573Z0;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.u80
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    QuickAccessContactPickerView.m83179BM(i11, this, valueAnimator2);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.f76573Z0;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C14836f(i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:33:0x0005, B:7:0x0020, B:8:0x0032, B:10:0x003b, B:13:0x0047, B:15:0x0050, B:17:0x0058, B:18:0x005d, B:20:0x0066, B:21:0x006c, B:3:0x0010, B:5:0x0016), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:33:0x0005, B:7:0x0020, B:8:0x0032, B:10:0x003b, B:13:0x0047, B:15:0x0050, B:17:0x0058, B:18:0x005d, B:20:0x0066, B:21:0x006c, B:3:0x0010, B:5:0x0016), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:33:0x0005, B:7:0x0020, B:8:0x0032, B:10:0x003b, B:13:0x0047, B:15:0x0050, B:17:0x0058, B:18:0x005d, B:20:0x0066, B:21:0x006c, B:3:0x0010, B:5:0x0016), top: B:32:0x0005 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37111CJ(Bundle bundle) {
        ArrayList<String> stringArrayList;
        Bundle m92642L3;
        int i11;
        Bundle m92642L32;
        Bundle m92642L33;
        String string;
        super.mo37111CJ(bundle);
        if (bundle != null) {
            try {
                stringArrayList = bundle.getStringArrayList("listSelect");
                if (stringArrayList == null) {
                }
                if (stringArrayList != null) {
                    this.f76563P0.m139684b().clear();
                    this.f76563P0.m139684b().addAll(stringArrayList);
                }
                C27286b c27286b = this.f76563P0;
                m92642L3 = m92642L3();
                int i12 = 6;
                if (m92642L3 == null) {
                    i11 = m92642L3.getInt("extra_max_pick_count", 6);
                } else {
                    i11 = 6;
                }
                if (i11 < 0) {
                    i12 = i11;
                }
                c27286b.m139696n(i12);
                m92642L32 = m92642L3();
                if (m92642L32 != null && (string = m92642L32.getString("STR_SOURCE_START_VIEW")) != null) {
                    this.f76563P0.m139699q(string);
                }
                C27286b c27286b2 = this.f76563P0;
                m92642L33 = m92642L3();
                boolean z11 = false;
                if (m92642L33 != null) {
                    z11 = m92642L33.getBoolean("EXTRA_ALLOW_SUBMIT_EMPTY", false);
                }
                c27286b2.m139694l(z11);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null) {
            stringArrayList = m92642L34.getStringArrayList("EXTRA_PRESELECT_UID_LIST");
        } else {
            stringArrayList = null;
        }
        if (stringArrayList != null) {
        }
        C27286b c27286b3 = this.f76563P0;
        m92642L3 = m92642L3();
        int i122 = 6;
        if (m92642L3 == null) {
        }
        if (i11 < 0) {
        }
        c27286b3.m139696n(i122);
        m92642L32 = m92642L3();
        if (m92642L32 != null) {
            this.f76563P0.m139699q(string);
        }
        C27286b c27286b22 = this.f76563P0;
        m92642L33 = m92642L3();
        boolean z112 = false;
        if (m92642L33 != null) {
        }
        c27286b22.m139694l(z112);
    }

    /* renamed from: CM */
    public final void m83214CM(View view) {
        AbstractC19074t.m100208f(view, "view");
        View findViewById = view.findViewById(AbstractC6918a0.listLayout);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f76565R0 = (SearchGlobalPreStateLayout) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.bubbleListLayout);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f76566S0 = (SearchGlobalPreStateLayout) findViewById2;
        View findViewById3 = view.findViewById(AbstractC6918a0.main_layout);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f76574a1 = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(AbstractC6918a0.footer_layout);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f76575b1 = (LinearLayout) findViewById4;
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_layout);
        this.f76570W0 = keyboardFrameLayout;
        if (keyboardFrameLayout != null) {
            keyboardFrameLayout.setOnKeyboardListener(this);
        }
        View findViewById5 = view.findViewById(AbstractC6918a0.search_input_text);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        EditText editText = (EditText) findViewById5;
        this.f76568U0 = editText;
        LinearLayout linearLayout = null;
        if (editText == null) {
            AbstractC19074t.m100223u("searchEditText");
            editText = null;
        }
        editText.addTextChangedListener(this.f76584k1);
        View findViewById6 = view.findViewById(AbstractC6918a0.multi_state);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f76567T0 = (MultiStateView) findViewById6;
        this.f76571X0 = (RobotoTextView) view.findViewById(AbstractC6918a0.selectCountTextView);
        this.f76572Y0 = (RobotoTextView) view.findViewById(AbstractC6918a0.toastTextView);
        View findViewById7 = view.findViewById(AbstractC6918a0.btn_done_add_item);
        AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
        this.f76569V0 = findViewById7;
        SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f76565R0;
        if (searchGlobalPreStateLayout == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout = null;
        }
        searchGlobalPreStateLayout.setActionResponder(this);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout2 = this.f76565R0;
        if (searchGlobalPreStateLayout2 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout2 = null;
        }
        searchGlobalPreStateLayout2.getRecyclerView().setClipToPadding(false);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout3 = this.f76565R0;
        if (searchGlobalPreStateLayout3 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout3 = null;
        }
        RecyclerView recyclerView = searchGlobalPreStateLayout3.getRecyclerView();
        SearchGlobalPreStateLayout searchGlobalPreStateLayout4 = this.f76565R0;
        if (searchGlobalPreStateLayout4 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout4 = null;
        }
        Context context = searchGlobalPreStateLayout4.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC13642h0.m76248b(recyclerView, new C13818y1(context, null, null, null, null, 0, 0, 0, 254, null));
        SearchGlobalPreStateLayout searchGlobalPreStateLayout5 = this.f76565R0;
        if (searchGlobalPreStateLayout5 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout5 = null;
        }
        searchGlobalPreStateLayout5.getRecyclerView().setHasFixedSize(true);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout6 = this.f76565R0;
        if (searchGlobalPreStateLayout6 == null) {
            AbstractC19074t.m100223u("listLayout");
            searchGlobalPreStateLayout6 = null;
        }
        searchGlobalPreStateLayout6.getRecyclerView().setItemAnimator(null);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout7 = this.f76566S0;
        if (searchGlobalPreStateLayout7 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout7 = null;
        }
        searchGlobalPreStateLayout7.setActionResponder(this);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout8 = this.f76566S0;
        if (searchGlobalPreStateLayout8 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout8 = null;
        }
        searchGlobalPreStateLayout8.getRecyclerView().setHasFixedSize(false);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout9 = this.f76566S0;
        if (searchGlobalPreStateLayout9 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout9 = null;
        }
        searchGlobalPreStateLayout9.getRecyclerView().setClipToPadding(false);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout10 = this.f76566S0;
        if (searchGlobalPreStateLayout10 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout10 = null;
        }
        searchGlobalPreStateLayout10.getRecyclerView().setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
        SearchGlobalPreStateLayout searchGlobalPreStateLayout11 = this.f76566S0;
        if (searchGlobalPreStateLayout11 == null) {
            AbstractC19074t.m100223u("bubbleListLayout");
            searchGlobalPreStateLayout11 = null;
        }
        searchGlobalPreStateLayout11.getRecyclerView().setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        LinearLayout linearLayout2 = this.f76575b1;
        if (linearLayout2 == null) {
            AbstractC19074t.m100223u("footerLayout");
            linearLayout2 = null;
        }
        linearLayout2.setOutlineProvider(new C13822z1(AbstractC23136l9.m118742r(16.0f), 1.0f, 1.0f, AbstractC23136l9.m118742r(4.0f) * (-1)));
        LinearLayout linearLayout3 = this.f76575b1;
        if (linearLayout3 == null) {
            AbstractC19074t.m100223u("footerLayout");
            linearLayout3 = null;
        }
        linearLayout3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.v80
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                QuickAccessContactPickerView.m83180DM(QuickAccessContactPickerView.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        View view2 = this.f76569V0;
        if (view2 == null) {
            AbstractC19074t.m100223u("doneButton");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.w80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                QuickAccessContactPickerView.m83181EM(QuickAccessContactPickerView.this, view3);
            }
        });
        MultiStateView multiStateView = this.f76567T0;
        if (multiStateView == null) {
            AbstractC19074t.m100223u("multiStateView");
            multiStateView = null;
        }
        multiStateView.setEnableLoadingText(true);
        m83218MM(AbstractC8020f0.empty_list);
        m83217LM(AbstractC8020f0.loading);
        m83210wM();
        m83219NM(8);
        m83216KM(true);
        LinearLayout linearLayout4 = this.f76575b1;
        if (linearLayout4 == null) {
            AbstractC19074t.m100223u("footerLayout");
            linearLayout4 = null;
        }
        AbstractC19074t.m100207e(ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(linearLayout4, new RunnableC14837g(linearLayout4, this)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        if (C18865a.f94189a.m98891c(this.f76570W0)) {
            KeyboardFrameLayout keyboardFrameLayout2 = this.f76570W0;
            if (keyboardFrameLayout2 != null) {
                LinearLayout linearLayout5 = this.f76575b1;
                if (linearLayout5 == null) {
                    AbstractC19074t.m100223u("footerLayout");
                } else {
                    linearLayout = linearLayout5;
                }
                keyboardFrameLayout2.setTopViewGroup(linearLayout);
                return;
            }
            return;
        }
        View findViewById8 = view.findViewById(AbstractC6918a0.main_container);
        KeyboardFrameLayout keyboardFrameLayout3 = this.f76570W0;
        if (keyboardFrameLayout3 != null) {
            keyboardFrameLayout3.setTopViewGroup(findViewById8);
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: FM, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        boolean z11 = false;
        switch (m97246b.hashCode()) {
            case -2063018791:
                if (!m97246b.equals("Search.HideIme")) {
                    return null;
                }
                m83208uM(this, false, 1, null);
                return null;
            case -1905588127:
                if (!m97246b.equals("Search.PreState.ClickItem")) {
                    return null;
                }
                if (c18316b.m97245a() instanceof AbstractC28275a.d) {
                    m83205rM(this.f76563P0, (AbstractC28275a.d) c18316b.m97245a());
                    return null;
                }
                if (!(c18316b.m97245a() instanceof AbstractC28275a.o)) {
                    return null;
                }
                Map m139693k = this.f76563P0.m139693k();
                AbstractC29076h m142499a = ((AbstractC28275a.o) c18316b.m97245a()).m142499a();
                Boolean bool = (Boolean) this.f76563P0.m139693k().get(((AbstractC28275a.o) c18316b.m97245a()).m142499a());
                if (bool != null) {
                    z11 = bool.booleanValue();
                }
                m139693k.put(m142499a, Boolean.valueOf(!z11));
                m83182GM();
                return null;
            case -1095971772:
                if (!m97246b.equals("Search.HideImeClearFocus") || !(c18316b.m97245a() instanceof Integer)) {
                    return null;
                }
                Object m97245a = c18316b.m97245a();
                SearchGlobalPreStateLayout searchGlobalPreStateLayout = this.f76565R0;
                if (searchGlobalPreStateLayout == null) {
                    AbstractC19074t.m100223u("listLayout");
                    searchGlobalPreStateLayout = null;
                }
                if (!AbstractC19074t.m100204b(m97245a, Integer.valueOf(searchGlobalPreStateLayout.getId()))) {
                    return null;
                }
                m83208uM(this, false, 1, null);
                return null;
            case -223529488:
                if (!m97246b.equals("Search.PreState.SubmitList") || !(c18316b.m97245a() instanceof C27285a)) {
                    return null;
                }
                if (((C27285a) c18316b.m97245a()).m139682c()) {
                    m83186OM(this, 0, 1, null);
                    m83193VM();
                    m83189RM(((C27285a) c18316b.m97245a()).m142508a());
                    return null;
                }
                m83216KM(false);
                m83190SM(((C27285a) c18316b.m97245a()).m142508a(), ((C27285a) c18316b.m97245a()).m139681b());
                return null;
            case -20103104:
                m97246b.equals("Search.PreState.IsEditorState");
                return null;
            case 1163658355:
                if (!m97246b.equals("Search.GetPickerState")) {
                    return null;
                }
                return new C18316b(c18316b.m97246b(), this.f76563P0, null, null, 12, null);
            default:
                return null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        String str;
        super.mo39024IJ();
        C19955h c19955h = C19955h.f98250a;
        C27286b c27286b = this.f76563P0;
        if (this.f76580g1) {
            str = "2";
        } else {
            str = "1";
        }
        c19955h.m103733y(null, c27286b, "2", str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m83192UM();
        super.mo37484JJ();
    }

    /* renamed from: KM */
    public final void m83216KM(boolean z11) {
        MultiStateView multiStateView = null;
        if (z11) {
            MultiStateView multiStateView2 = this.f76567T0;
            if (multiStateView2 == null) {
                AbstractC19074t.m100223u("multiStateView");
                multiStateView2 = null;
            }
            multiStateView2.setVisibility(0);
            MultiStateView multiStateView3 = this.f76567T0;
            if (multiStateView3 == null) {
                AbstractC19074t.m100223u("multiStateView");
            } else {
                multiStateView = multiStateView3;
            }
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        if (!this.f76563P0.m139683a().isEmpty()) {
            MultiStateView multiStateView4 = this.f76567T0;
            if (multiStateView4 == null) {
                AbstractC19074t.m100223u("multiStateView");
            } else {
                multiStateView = multiStateView4;
            }
            multiStateView.setVisibility(8);
            return;
        }
        MultiStateView multiStateView5 = this.f76567T0;
        if (multiStateView5 == null) {
            AbstractC19074t.m100223u("multiStateView");
            multiStateView5 = null;
        }
        multiStateView5.setVisibility(0);
        MultiStateView multiStateView6 = this.f76567T0;
        if (multiStateView6 == null) {
            AbstractC19074t.m100223u("multiStateView");
        } else {
            multiStateView = multiStateView6;
        }
        multiStateView.setState(MultiStateView.EnumC15914e.EMPTY);
    }

    /* renamed from: LM */
    public final void m83217LM(int i11) {
        MultiStateView multiStateView = this.f76567T0;
        if (multiStateView == null) {
            AbstractC19074t.m100223u("multiStateView");
            multiStateView = null;
        }
        multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
    }

    /* renamed from: MM */
    public final void m83218MM(int i11) {
        MultiStateView multiStateView = this.f76567T0;
        if (multiStateView == null) {
            AbstractC19074t.m100223u("multiStateView");
            multiStateView = null;
        }
        multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
    }

    /* renamed from: NM */
    public final void m83219NM(int i11) {
        try {
            this.f76581h1 = 0;
            ValueAnimator valueAnimator = null;
            if (i11 == 0) {
                LinearLayout linearLayout = this.f76575b1;
                if (linearLayout == null) {
                    AbstractC19074t.m100223u("footerLayout");
                    linearLayout = null;
                }
                this.f76581h1 = linearLayout.getHeight();
                ValueAnimator valueAnimator2 = this.f76577d1;
                if (valueAnimator2 == null) {
                    AbstractC19074t.m100223u("animRunOut");
                    valueAnimator2 = null;
                }
                if (valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f76577d1;
                    if (valueAnimator3 == null) {
                        AbstractC19074t.m100223u("animRunOut");
                        valueAnimator3 = null;
                    }
                    valueAnimator3.cancel();
                }
                LinearLayout linearLayout2 = this.f76575b1;
                if (linearLayout2 == null) {
                    AbstractC19074t.m100223u("footerLayout");
                    linearLayout2 = null;
                }
                int visibility = linearLayout2.getVisibility();
                ValueAnimator valueAnimator4 = this.f76576c1;
                if (valueAnimator4 == null) {
                    AbstractC19074t.m100223u("animRunIn");
                    valueAnimator4 = null;
                }
                if (!valueAnimator4.isRunning() && visibility != 0) {
                    ValueAnimator valueAnimator5 = this.f76576c1;
                    if (valueAnimator5 == null) {
                        AbstractC19074t.m100223u("animRunIn");
                    } else {
                        valueAnimator = valueAnimator5;
                    }
                    valueAnimator.start();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator6 = this.f76576c1;
            if (valueAnimator6 == null) {
                AbstractC19074t.m100223u("animRunIn");
                valueAnimator6 = null;
            }
            if (valueAnimator6.isRunning()) {
                ValueAnimator valueAnimator7 = this.f76576c1;
                if (valueAnimator7 == null) {
                    AbstractC19074t.m100223u("animRunIn");
                    valueAnimator7 = null;
                }
                valueAnimator7.cancel();
            }
            ValueAnimator valueAnimator8 = this.f76577d1;
            if (valueAnimator8 == null) {
                AbstractC19074t.m100223u("animRunOut");
                valueAnimator8 = null;
            }
            if (!valueAnimator8.isRunning()) {
                LinearLayout linearLayout3 = this.f76575b1;
                if (linearLayout3 == null) {
                    AbstractC19074t.m100223u("footerLayout");
                    linearLayout3 = null;
                }
                if (linearLayout3.getVisibility() == 0) {
                    ValueAnimator valueAnimator9 = this.f76577d1;
                    if (valueAnimator9 == null) {
                        AbstractC19074t.m100223u("animRunOut");
                    } else {
                        valueAnimator = valueAnimator9;
                    }
                    valueAnimator.start();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                m83209vM();
                finish();
                return true;
            } catch (Exception unused) {
                return super.mo37491QJ(i11);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.f76563P0.m139687e().iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC28275a.d) it.next()).m142475c().mo2478b());
            }
            bundle.putStringArrayList("listSelect", arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m92637BK(true);
        m83214CM(view);
        m83182GM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickAccessContactPickerView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && m92676n2.mo35576n3()) {
            ValueAnimator valueAnimator = this.f76573Z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            LinearLayout linearLayout = this.f76574a1;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainLayout");
                linearLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            LinearLayout linearLayout3 = this.f76574a1;
            if (linearLayout3 == null) {
                AbstractC19074t.m100223u("mainLayout");
                linearLayout3 = null;
            }
            linearLayout3.setLayoutParams(layoutParams2);
            LinearLayout linearLayout4 = this.f76575b1;
            if (linearLayout4 == null) {
                AbstractC19074t.m100223u("footerLayout");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout2.setTranslationY(0.0f);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && m92676n2.mo35576n3()) {
                LinearLayout linearLayout = this.f76575b1;
                if (linearLayout == null) {
                    AbstractC19074t.m100223u("footerLayout");
                    linearLayout = null;
                }
                float translationY = linearLayout.getTranslationY() / i11;
                ValueAnimator valueAnimator = this.f76573Z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimator.setFloatValues(translationY, -1.0f);
                } else {
                    m83178AM(this, translationY, i11, 0.0f, 4, null);
                }
                ValueAnimator valueAnimator2 = this.f76573Z0;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
