package com.zing.zalo.p077ui.chat.widget.photosuggest;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.chat.ChatFrameLayout;
import com.zing.zalo.p077ui.chat.widget.photosuggest.C11778e;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.recyclerview.CustomRecyclerView;
import com.zing.zalo.zview.animation.AnimationTarget;
import dg0.AbstractC17927b;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import mv.C23455h;
import p361nb.AbstractC23647d;
import p716zh.C32050o7;

/* loaded from: classes5.dex */
public class NewMultiPhotoSuggestView extends RelativeLayout implements AnimationTarget {

    /* renamed from: c0 */
    public static final int f61183c0 = (((((NewMultiPhotoSuggestCollapsedView.f61123P + (NewMultiPhotoSuggestCollapsedView.f61132b0 * 2)) + NewMultiPhotoSuggestCollapsedView.f61135e0) + NewMultiPhotoSuggestCollapsedView.f61136f0) + AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_send_close_btn_height)) + NewMultiPhotoSuggestCollapsedView.f61131a0) + NewMultiPhotoSuggestCollapsedView.f61130W;

    /* renamed from: A */
    private ValueAnimator.AnimatorUpdateListener f61184A;

    /* renamed from: B */
    private Animator.AnimatorListener f61185B;

    /* renamed from: C */
    private AnimatorSet f61186C;

    /* renamed from: D */
    private ValueAnimator f61187D;

    /* renamed from: E */
    private ValueAnimator f61188E;

    /* renamed from: F */
    private ValueAnimator.AnimatorUpdateListener f61189F;

    /* renamed from: G */
    private Rect f61190G;

    /* renamed from: H */
    private View f61191H;

    /* renamed from: I */
    private View f61192I;

    /* renamed from: J */
    private float f61193J;

    /* renamed from: K */
    private float f61194K;

    /* renamed from: L */
    private float f61195L;

    /* renamed from: M */
    private ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr f61196M;

    /* renamed from: N */
    private C23455h f61197N;

    /* renamed from: O */
    private AnimatorSet f61198O;

    /* renamed from: P */
    private AnimatorSet f61199P;

    /* renamed from: Q */
    private ValueAnimator f61200Q;

    /* renamed from: R */
    private ValueAnimator f61201R;

    /* renamed from: S */
    private ChangeBounds f61202S;

    /* renamed from: T */
    private LinearLayout f61203T;

    /* renamed from: U */
    private Runnable f61204U;

    /* renamed from: V */
    public boolean f61205V;

    /* renamed from: W */
    public String f61206W;

    /* renamed from: a0 */
    private View.OnLayoutChangeListener f61207a0;

    /* renamed from: b0 */
    private int f61208b0;

    /* renamed from: p */
    private int f61209p;

    /* renamed from: q */
    private List f61210q;

    /* renamed from: r */
    private InterfaceC11770h f61211r;

    /* renamed from: s */
    private NewMultiPhotoSuggestCollapsedView.InterfaceC11762c f61212s;

    /* renamed from: t */
    private CustomRecyclerView f61213t;

    /* renamed from: u */
    private AppCompatImageView f61214u;

    /* renamed from: v */
    private RobotoTextView f61215v;

    /* renamed from: w */
    private RobotoTextView f61216w;

    /* renamed from: x */
    private NewMultiPhotoSuggestCollapsedView f61217x;

    /* renamed from: y */
    private C11778e f61218y;

    /* renamed from: z */
    private View f61219z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$a */
    /* loaded from: classes5.dex */
    public class C11763a implements NewMultiPhotoSuggestCollapsedView.InterfaceC11762c {
        C11763a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m65517i() {
            C32050o7 m154655h = C32050o7.m154655h();
            List list = NewMultiPhotoSuggestView.this.f61210q;
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = NewMultiPhotoSuggestView.this;
            m154655h.m154665o("photo_suggest_dismiss", list, newMultiPhotoSuggestView.f61205V, newMultiPhotoSuggestView.f61206W);
            NewMultiPhotoSuggestView.this.f61211r.mo64865c(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m65518j() {
            if (NewMultiPhotoSuggestView.this.f61210q.size() > 0) {
                AbstractC23647d.m123897g("122104");
                NewMultiPhotoSuggestView.this.f61211r.mo64863a(NewMultiPhotoSuggestView.this.f61210q.size() - 1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m65519k() {
            AbstractC23647d.m123897g("122105");
            NewMultiPhotoSuggestView.this.setMode(1);
            NewMultiPhotoSuggestView.this.f61211r.mo64866d();
            NewMultiPhotoSuggestView.this.m65512e0(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m65520l() {
            C32050o7 m154655h = C32050o7.m154655h();
            List list = NewMultiPhotoSuggestView.this.f61210q;
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = NewMultiPhotoSuggestView.this;
            m154655h.m154665o("photo_suggest_send", list, newMultiPhotoSuggestView.f61205V, newMultiPhotoSuggestView.f61206W);
            NewMultiPhotoSuggestView.this.f61211r.mo64867e();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView.InterfaceC11762c
        /* renamed from: a */
        public void mo65455a() {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.h
                @Override // java.lang.Runnable
                public final void run() {
                    NewMultiPhotoSuggestView.C11763a.this.m65517i();
                }
            }, 500L);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView.InterfaceC11762c
        /* renamed from: b */
        public void mo65456b() {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.i
                @Override // java.lang.Runnable
                public final void run() {
                    NewMultiPhotoSuggestView.C11763a.this.m65518j();
                }
            }, 500L);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView.InterfaceC11762c
        /* renamed from: c */
        public void mo65457c() {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.g
                @Override // java.lang.Runnable
                public final void run() {
                    NewMultiPhotoSuggestView.C11763a.this.m65520l();
                }
            }, 500L);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView.InterfaceC11762c
        /* renamed from: d */
        public void mo65458d() {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.j
                @Override // java.lang.Runnable
                public final void run() {
                    NewMultiPhotoSuggestView.C11763a.this.m65519k();
                }
            }, 500L);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView.InterfaceC11762c
        public void onDismiss() {
            AbstractC23647d.m123897g("122106");
            NewMultiPhotoSuggestView.this.f61211r.mo64865c(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$b */
    /* loaded from: classes5.dex */
    public class C11764b implements C11778e.b {
        C11764b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.C11778e.b
        /* renamed from: a */
        public void mo65521a(int i11) {
            if (NewMultiPhotoSuggestView.this.f61211r != null && i11 >= 0 && i11 < NewMultiPhotoSuggestView.this.f61210q.size()) {
                AbstractC23647d.m123897g("122113");
                NewMultiPhotoSuggestView.this.f61211r.mo64863a(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.C11778e.b
        /* renamed from: b */
        public void mo65522b(int i11) {
            if (NewMultiPhotoSuggestView.this.f61211r != null && i11 >= 0 && i11 < NewMultiPhotoSuggestView.this.f61210q.size()) {
                NewMultiPhotoSuggestView.this.m65469L();
                AbstractC23647d.m123897g("122109");
                NewMultiPhotoSuggestView.this.f61210q.remove(i11);
                NewMultiPhotoSuggestView.this.f61218y.m10017y(i11);
                if (NewMultiPhotoSuggestView.this.getVisibility() == 0) {
                    if (NewMultiPhotoSuggestView.this.f61210q.size() == 0) {
                        NewMultiPhotoSuggestView.this.f61211r.mo64865c(4);
                    } else {
                        if (NewMultiPhotoSuggestView.this.f61210q.size() == 1) {
                            NewMultiPhotoSuggestView.this.m65472O();
                        }
                        NewMultiPhotoSuggestView.this.f61211r.mo64864b(i11);
                    }
                }
                TransitionManager.beginDelayedTransition((ViewGroup) NewMultiPhotoSuggestView.this.f61213t.getParent(), NewMultiPhotoSuggestView.this.f61202S);
                AbstractC19444a.m101696d(NewMultiPhotoSuggestView.this.f61204U);
                AbstractC19444a.m101694b(NewMultiPhotoSuggestView.this.f61204U, 400L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$c */
    /* loaded from: classes5.dex */
    public class C11765c implements Transition.TransitionListener {
        C11765c() {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$d */
    /* loaded from: classes5.dex */
    public class C11766d implements Animator.AnimatorListener {
        C11766d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            NewMultiPhotoSuggestView.this.f61196M.m65528N2(true);
            NewMultiPhotoSuggestView.this.f61197N.m123154d(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NewMultiPhotoSuggestView.this.f61191H != null) {
                int m9820B0 = NewMultiPhotoSuggestView.this.f61213t.m9820B0(NewMultiPhotoSuggestView.this.f61191H);
                NewMultiPhotoSuggestView.this.f61191H.setTranslationX(0.0f);
                NewMultiPhotoSuggestView.this.f61191H.setTranslationY(0.0f);
                NewMultiPhotoSuggestView.this.f61191H.setAlpha(0.0f);
                NewMultiPhotoSuggestView.this.f61191H.setScaleX(1.0f);
                NewMultiPhotoSuggestView.this.f61191H.setScaleY(1.0f);
                NewMultiPhotoSuggestView.this.f61210q.remove(m9820B0);
                NewMultiPhotoSuggestView.this.f61218y.m10017y(m9820B0);
                if (NewMultiPhotoSuggestView.this.getVisibility() == 0) {
                    if (NewMultiPhotoSuggestView.this.f61210q.size() == 0) {
                        NewMultiPhotoSuggestView.this.f61211r.mo64865c(4);
                    } else if (NewMultiPhotoSuggestView.this.f61210q.size() == 1) {
                        NewMultiPhotoSuggestView.this.m65472O();
                    }
                }
                TransitionManager.beginDelayedTransition((ViewGroup) NewMultiPhotoSuggestView.this.f61213t.getParent(), NewMultiPhotoSuggestView.this.f61202S);
                AbstractC19444a.m101696d(NewMultiPhotoSuggestView.this.f61204U);
                AbstractC19444a.m101694b(NewMultiPhotoSuggestView.this.f61204U, 400L);
            }
            NewMultiPhotoSuggestView.this.f61191H = null;
            NewMultiPhotoSuggestView newMultiPhotoSuggestView = NewMultiPhotoSuggestView.this;
            newMultiPhotoSuggestView.f61195L = 0.0f;
            newMultiPhotoSuggestView.f61194K = 0.0f;
            newMultiPhotoSuggestView.f61193J = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            NewMultiPhotoSuggestView.this.m65469L();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$e */
    /* loaded from: classes5.dex */
    public class C11767e implements Animator.AnimatorListener {
        C11767e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            NewMultiPhotoSuggestView.this.f61203T.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61213t.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61214u.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NewMultiPhotoSuggestView.this.f61203T.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61213t.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61214u.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$f */
    /* loaded from: classes5.dex */
    public class C11768f implements Animator.AnimatorListener {
        C11768f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            NewMultiPhotoSuggestView.this.f61217x.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61218y.m10008p();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NewMultiPhotoSuggestView.this.f61217x.setVisibility(8);
            NewMultiPhotoSuggestView.this.f61218y.m10008p();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$g */
    /* loaded from: classes5.dex */
    public class C11769g extends AnimatorListenerAdapter {
        C11769g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NewMultiPhotoSuggestView.this.f61215v.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestView$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC11770h {
        /* renamed from: a */
        void mo64863a(int i11);

        /* renamed from: b */
        void mo64864b(int i11);

        /* renamed from: c */
        void mo64865c(int i11);

        /* renamed from: d */
        void mo64866d();

        /* renamed from: e */
        void mo64867e();

        /* renamed from: f */
        void mo64868f(MediaItem mediaItem);
    }

    public NewMultiPhotoSuggestView(Context context) {
        super(context);
        this.f61209p = 0;
        this.f61205V = false;
        this.f61206W = "0";
        this.f61208b0 = 0;
        m65473P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m65469L() {
        this.f61197N.m123154d(true);
        this.f61196M.m65528N2(false);
    }

    /* renamed from: M */
    private void m65470M(View view, View view2) {
        if (view2 instanceof ChatFrameLayout) {
            float width = (view2.getWidth() / 2.0f) - (view.getWidth() / 2.0f);
            view.getLocationInWindow(new int[2]);
            this.f61193J = r1[0] - width;
            this.f61194K = r1[1] - ((view2.getHeight() / 2.0f) - (view.getHeight() / 2.0f));
            this.f61195L = view.getTranslationY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m65471N() {
        this.f61196M.m65528N2(true);
        this.f61197N.m123154d(false);
        this.f61213t.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m65472O() {
        if ((this.f61214u.getVisibility() != 0 && this.f61215v.getVisibility() != 0) || this.f61200Q.isRunning()) {
            return;
        }
        this.f61215v.setVisibility(4);
        this.f61214u.setVisibility(8);
        this.f61200Q.start();
    }

    /* renamed from: P */
    private void m65473P() {
        this.f61219z = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.multi_photo_suggest_layout, (ViewGroup) this, true);
        this.f61213t = (CustomRecyclerView) findViewById(AbstractC6918a0.list_data);
        this.f61215v = (RobotoTextView) findViewById(AbstractC6918a0.close_btn_expand);
        this.f61216w = (RobotoTextView) findViewById(AbstractC6918a0.send_all_btn_expand);
        this.f61214u = (AppCompatImageView) findViewById(AbstractC6918a0.to_collapse_view);
        this.f61217x = (NewMultiPhotoSuggestCollapsedView) findViewById(AbstractC6918a0.collapse_view);
        this.f61203T = (LinearLayout) findViewById(AbstractC6918a0.btns_container);
        this.f61214u.setOnClickListener(new View.OnClickListener() { // from class: o60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewMultiPhotoSuggestView.this.m65476S(view);
            }
        });
        this.f61215v.setOnClickListener(new View.OnClickListener() { // from class: o60.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewMultiPhotoSuggestView.this.m65478U(view);
            }
        });
        this.f61216w.setOnClickListener(new View.OnClickListener() { // from class: o60.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewMultiPhotoSuggestView.this.m65480W(view);
            }
        });
        this.f61197N = new C23455h(new C23455h.a() { // from class: o60.h
            @Override // mv.C23455h.a
            /* renamed from: a */
            public final void mo123156a(View view, int i11) {
                NewMultiPhotoSuggestView.this.m65481X(view, i11);
            }
        });
        this.f61212s = new C11763a();
        this.f61213t.m9825D(this.f61197N);
        ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr scrollControllAndNoPredictiveItemAnimLinearLayoutMngr = new ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr(getContext(), 0, false);
        this.f61196M = scrollControllAndNoPredictiveItemAnimLinearLayoutMngr;
        scrollControllAndNoPredictiveItemAnimLinearLayoutMngr.m65528N2(true);
        C11778e c11778e = new C11778e(getContext());
        this.f61218y = c11778e;
        c11778e.m9999J(true);
        this.f61218y.m65534Q(new C11764b());
        this.f61213t.setLayoutManager(this.f61196M);
        this.f61213t.setAdapter(this.f61218y);
        ChangeBounds changeBounds = new ChangeBounds();
        this.f61202S = changeBounds;
        changeBounds.setDuration(300L);
        this.f61202S.addListener(new C11765c());
        this.f61202S.addTarget(this.f61213t).addTarget(this.f61214u);
        this.f61204U = new Runnable() { // from class: o60.i
            @Override // java.lang.Runnable
            public final void run() {
                NewMultiPhotoSuggestView.this.m65471N();
            }
        };
        m65474Q();
        setClipChildren(false);
    }

    /* renamed from: Q */
    private void m65474Q() {
        this.f61185B = new C11766d();
        this.f61184A = new ValueAnimator.AnimatorUpdateListener() { // from class: o60.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewMultiPhotoSuggestView.this.m65483Z(valueAnimator);
            }
        };
        this.f61189F = new ValueAnimator.AnimatorUpdateListener() { // from class: o60.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewMultiPhotoSuggestView.this.m65485a0(valueAnimator);
            }
        };
        AnimatorSet animatorSet = new AnimatorSet();
        this.f61186C = animatorSet;
        animatorSet.addListener(this.f61185B);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f61188E = ofFloat;
        ofFloat.addUpdateListener(this.f61184A);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) RelativeLayout.SCALE_X, 1.0f, 0.3f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) RelativeLayout.SCALE_Y, 1.0f, 0.3f);
        Property property = RelativeLayout.ALPHA;
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofFloat2, ofFloat3, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.5f));
        this.f61187D = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(this.f61189F);
        this.f61186C.setDuration(500L);
        this.f61186C.playTogether(this.f61188E, this.f61187D);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f61198O = animatorSet2;
        animatorSet2.addListener(new C11767e());
        this.f61198O.setDuration(300L).playTogether(ObjectAnimator.ofFloat(this.f61217x, (Property<NewMultiPhotoSuggestCollapsedView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f61203T, (Property<LinearLayout, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f61213t, (Property<CustomRecyclerView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f61214u, (Property<AppCompatImageView, Float>) property, 1.0f, 0.0f));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f61199P = animatorSet3;
        animatorSet3.addListener(new C11768f());
        this.f61199P.setDuration(300L).playTogether(ObjectAnimator.ofFloat(this.f61217x, (Property<NewMultiPhotoSuggestCollapsedView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f61203T, (Property<LinearLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f61213t, (Property<CustomRecyclerView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f61214u, (Property<AppCompatImageView, Float>) property, 0.0f, 1.0f));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f61201R = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o60.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NewMultiPhotoSuggestView.this.m65487b0(valueAnimator2);
            }
        });
        this.f61201R.setDuration(300L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f61200Q = ofFloat4;
        ofFloat4.setDuration(450L);
        this.f61200Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o60.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NewMultiPhotoSuggestView.this.m65482Y(valueAnimator2);
            }
        });
        this.f61200Q.addListener(new C11769g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m65475R() {
        AbstractC23647d.m123897g("122107");
        setMode(0);
        this.f61211r.mo64866d();
        m65512e0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m65476S(View view) {
        AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: o60.l
            @Override // java.lang.Runnable
            public final void run() {
                NewMultiPhotoSuggestView.this.m65475R();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m65477T() {
        AbstractC23647d.m123897g("122112");
        this.f61211r.mo64865c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m65478U(View view) {
        AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: o60.k
            @Override // java.lang.Runnable
            public final void run() {
                NewMultiPhotoSuggestView.this.m65477T();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m65479V() {
        if (this.f61210q.size() > 1 && this.f61210q.size() <= 5) {
            AbstractC23647d.m123897g("122110");
        } else if (this.f61210q.size() > 5) {
            AbstractC23647d.m123897g("122111");
        }
        this.f61211r.mo64867e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m65480W(View view) {
        AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: o60.j
            @Override // java.lang.Runnable
            public final void run() {
                NewMultiPhotoSuggestView.this.m65479V();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m65481X(View view, int i11) {
        if (!this.f61213t.m9859U0()) {
            m65511K(view, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m65482Y(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f61215v.getVisibility() != 8) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f61215v.getLayoutParams();
            layoutParams.weight = floatValue;
            this.f61215v.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m65483Z(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f61191H;
        if (view != null) {
            double d11 = floatValue * 3.141592653589793d;
            view.setTranslationX(((float) (this.f61193J * Math.sin(d11))) - this.f61193J);
            this.f61191H.setTranslationY(((float) (this.f61194K * Math.cos(d11))) + this.f61195L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m65485a0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue();
        float floatValue3 = ((Float) valueAnimator.getAnimatedValue("alpha")).floatValue();
        View view = this.f61191H;
        if (view != null) {
            view.setScaleX(floatValue);
            this.f61191H.setScaleY(floatValue2);
            this.f61191H.setAlpha(floatValue3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m65487b0(ValueAnimator valueAnimator) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f61203T.getLayoutParams();
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f61203T.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m65489c0(View view) {
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) view;
        int i11 = (-customRecyclerView.getLeft()) + ((RelativeLayout.LayoutParams) this.f61213t.getLayoutParams()).leftMargin;
        int i12 = -AbstractC23136l9.m118713h0();
        int right = customRecyclerView.getRight();
        int measuredHeight = customRecyclerView.getMeasuredHeight();
        Rect rect = this.f61190G;
        if (rect == null) {
            this.f61190G = new Rect(i11, i12, right, measuredHeight);
            customRecyclerView.m9837K1(this.f61218y.mo10003k() - 1);
        } else {
            rect.set(i11, i12, right, measuredHeight);
        }
        customRecyclerView.setClipBounds(this.f61190G);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f61214u.getLayoutParams();
        layoutParams.setMargins(AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_left_btn_margin), 0, 0, ((customRecyclerView.getMeasuredHeight() - NewMultiPhotoSuggestCollapsedView.f61144n0) - NewMultiPhotoSuggestCollapsedView.f61140j0) / 2);
        this.f61214u.setLayoutParams(layoutParams);
        customRecyclerView.requestLayout();
        TransitionManager.beginDelayedTransition((ViewGroup) customRecyclerView.getParent(), this.f61202S);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f61203T.getLayoutParams();
        int i13 = NewMultiPhotoSuggestCollapsedView.f61143m0;
        layoutParams2.rightMargin = i13;
        int i14 = layoutParams2.width;
        int measuredWidth = customRecyclerView.getMeasuredWidth() - i13;
        if (measuredWidth < i14) {
            if (this.f61201R.isRunning()) {
                this.f61201R.cancel();
            }
            this.f61201R.setIntValues(i14, measuredWidth);
            this.f61201R.start();
            return;
        }
        layoutParams2.width = measuredWidth;
        this.f61203T.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m65491d0(final View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
                return;
            }
            AbstractC17927b.m94533b().mo94530d("DEBOUNCE_UPDATE_SIZE_MULTI_PHOTO_BUTTONS_CONTAINER", new Runnable() { // from class: o60.e
                @Override // java.lang.Runnable
                public final void run() {
                    NewMultiPhotoSuggestView.this.m65489c0(view);
                }
            }, 100L);
        }
    }

    private Rect getViewCoords() {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        int i11 = this.f61209p;
        if (i11 != 0) {
            if (i11 == 1) {
                View view = this.f61192I;
                if (view == null) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                int i12 = iArr[0];
                rect.left = i12;
                rect.top = iArr[1];
                rect.right = i12 + this.f61192I.getWidth();
                rect.bottom = rect.top + this.f61192I.getHeight();
                this.f61192I = null;
                return rect;
            }
            return rect;
        }
        this.f61217x.getLocationInWindow(iArr);
        int i13 = iArr[0];
        rect.left = i13;
        rect.top = iArr[1];
        rect.right = i13 + this.f61217x.getViewWidth();
        rect.bottom = rect.top + this.f61217x.getViewHeight();
        return rect;
    }

    /* renamed from: K */
    public void m65511K(View view, int i11) {
        if (this.f61219z.getParent() != null && (this.f61219z.getParent() instanceof ChatFrameLayout) && this.f61191H == null) {
            AbstractC23647d.m123897g("122108");
            MediaItem mediaItem = (MediaItem) this.f61210q.get(i11);
            this.f61191H = view;
            m65470M(view, (View) this.f61219z.getParent());
            this.f61186C.start();
            this.f61211r.mo64868f(mediaItem);
        }
    }

    /* renamed from: e0 */
    public void m65512e0(boolean z11) {
        int i11;
        int i12 = this.f61209p;
        if (i12 != 0) {
            if (i12 == 1) {
                this.f61203T.setVisibility(0);
                this.f61213t.setVisibility(0);
                if (this.f61210q.size() != 1 && (i11 = this.f61208b0) != 2) {
                    if (i11 == 0) {
                        this.f61214u.setVisibility(0);
                        this.f61215v.setVisibility(0);
                    }
                } else {
                    this.f61214u.setVisibility(8);
                    this.f61215v.setVisibility(8);
                }
                this.f61218y.m65533P(this.f61210q);
                if (this.f61190G == null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: o60.d
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                            NewMultiPhotoSuggestView.this.m65491d0(view, i13, i14, i15, i16, i17, i18, i19, i21);
                        }
                    };
                    this.f61207a0 = onLayoutChangeListener;
                    this.f61213t.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                if (z11) {
                    this.f61199P.start();
                    return;
                } else {
                    this.f61217x.setVisibility(8);
                    this.f61218y.m10008p();
                    return;
                }
            }
            return;
        }
        this.f61217x.setVisibility(0);
        this.f61217x.setData(this.f61210q);
        this.f61217x.setListener(this.f61212s);
        if (z11) {
            this.f61198O.start();
            return;
        }
        this.f61203T.setVisibility(8);
        this.f61213t.setVisibility(8);
        this.f61214u.setVisibility(8);
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getViewCoords();
    }

    public List<MediaItem> getCurrentItemList() {
        return this.f61210q;
    }

    public List<MediaItem> getCurrentSelectedItemList() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f61210q.size(); i11++) {
            if (((MediaItem) this.f61210q.get(i11)).m41173u0()) {
                arrayList.add((MediaItem) this.f61210q.get(i11));
            }
        }
        return arrayList;
    }

    public int getMode() {
        return this.f61209p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f61186C.removeAllListeners();
        this.f61188E.removeAllUpdateListeners();
        this.f61187D.removeAllUpdateListeners();
        this.f61213t.removeOnLayoutChangeListener(this.f61207a0);
        super.onDetachedFromWindow();
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public void setData(List<MediaItem> list) {
        this.f61210q = list;
    }

    public void setListMediaItemHD(boolean z11) {
        List list = this.f61210q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((MediaItem) it.next()).m41116O0(z11);
            }
        }
    }

    public void setMode(int i11) {
        this.f61209p = i11;
    }

    public void setNewMultiPhotoSuggestListener(InterfaceC11770h interfaceC11770h) {
        this.f61211r = interfaceC11770h;
    }

    public void setUIOption(int i11) {
        this.f61208b0 = i11;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f61216w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send_photo));
                return;
            }
            return;
        }
        this.f61216w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send));
    }

    public NewMultiPhotoSuggestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61209p = 0;
        this.f61205V = false;
        this.f61206W = "0";
        this.f61208b0 = 0;
        m65473P();
    }

    public NewMultiPhotoSuggestView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f61209p = 0;
        this.f61205V = false;
        this.f61206W = "0";
        this.f61208b0 = 0;
        m65473P();
    }
}
