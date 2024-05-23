package com.zing.zalo.shortvideo.p072ui.view;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.AbstractC1415b;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingOptionLayout;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10057e;
import com.zing.zalo.shortvideo.p072ui.view.OnboardingPageView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m20.InterfaceC22810w0;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25014h2;
import q10.C25021j1;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class OnboardingPageView extends AbstractC10623a implements InterfaceC22810w0 {

    /* renamed from: B0 */
    private final InterfaceC10057e f53072B0;

    /* renamed from: C0 */
    private ViewTreeObserver.OnScrollChangedListener f53073C0;

    /* renamed from: D0 */
    private String f53074D0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10338a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10338a f53075y = new C10338a();

        C10338a() {
            super(3, C25014h2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageOnboardingBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54653h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25014h2 m54653h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25014h2.m129839c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$b */
    /* loaded from: classes5.dex */
    static final class C10339b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ C25014h2 f53077r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10339b(C25014h2 c25014h2) {
            super(0);
            this.f53077r = c25014h2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54654a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54654a() {
            OnboardingPageView.this.f53072B0.mo53360Y8();
            this.f53077r.f119946t.m55786j();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$c */
    /* loaded from: classes5.dex */
    static final class C10340c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ C25014h2 f53079r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10340c(C25014h2 c25014h2) {
            super(0);
            this.f53079r = c25014h2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54655a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54655a() {
            OnboardingPageView.this.f53072B0.mo53360Y8();
            this.f53079r.f119946t.m55786j();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$d */
    /* loaded from: classes5.dex */
    static final class C10341d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10341d f53080q = new C10341d();

        C10341d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(BreakSlot.Option option) {
            AbstractC19074t.m100208f(option, "it");
            return option.m50700a();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$e */
    /* loaded from: classes5.dex */
    static final class C10342e extends AbstractC19075u implements InterfaceC18505l {
        C10342e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54657a(View view) {
            AbstractC19074t.m100208f(view, "it");
            OnboardingPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54657a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$f */
    /* loaded from: classes5.dex */
    static final class C10343f extends AbstractC19075u implements InterfaceC18505l {
        C10343f() {
            super(1);
        }

        /* renamed from: a */
        public final void m54658a(View view) {
            int i11;
            Map m131401f;
            ArrayList m50685f;
            AbstractC19074t.m100208f(view, "it");
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = OnboardingPageView.this.m92652XI(AbstractC27413h.zch_action_key_onboarding_change);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            BreakSlot mo53361r1 = OnboardingPageView.this.f53072B0.mo53361r1();
            if (mo53361r1 != null && (m50685f = mo53361r1.m50685f()) != null && !m50685f.isEmpty()) {
                Iterator it = m50685f.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((BreakSlot.Option) it.next()).m50702c() && (i11 = i11 + 1) < 0) {
                        AbstractC25368s.m131508p();
                    }
                }
            } else {
                i11 = 0;
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("topic_num", Integer.valueOf(i11)));
            c19205a.m100713L(m92652XI, m131401f);
            InterfaceC10057e.a.m53675a(OnboardingPageView.this.f53072B0, false, 1, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54658a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$g */
    /* loaded from: classes5.dex */
    public static final class C10344g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10344g f53083q = new C10344g();

        C10344g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(BreakSlot.Option option) {
            AbstractC19074t.m100208f(option, "it");
            return option.m50700a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.OnboardingPageView$h */
    /* loaded from: classes5.dex */
    public static final class C10345h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ BreakSlot f53085r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10345h(BreakSlot breakSlot) {
            super(0);
            this.f53085r = breakSlot;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54660a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54660a() {
            OnboardingPageView.this.m54647ZK(this.f53085r);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = OnboardingPageView.this.m92652XI(AbstractC27413h.zch_action_key_onboarding_topic_select);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }
    }

    public OnboardingPageView() {
        super(C10338a.f53075y);
        this.f53072B0 = AbstractC28684a.Companion.m143665B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XK */
    public static final void m54645XK(C25014h2 c25014h2, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(c25014h2, "$this_run");
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        SimpleShadowTextView simpleShadowTextView = c25014h2.f119951y;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtHeader");
        ViewGroup.LayoutParams layoutParams = simpleShadowTextView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = (c25014h2.f119947u.getWidth() * 3) / 4;
            simpleShadowTextView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YK */
    public static final void m54646YK(C25014h2 c25014h2) {
        AbstractC19074t.m100208f(c25014h2, "$this_run");
        if (c25014h2.f119950x.getScrollY() > c25014h2.f119951y.getBottom()) {
            EllipsizedTextView ellipsizedTextView = c25014h2.f119945s.f119995w;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtTitle");
            AbstractC26112n.m134431w0(ellipsizedTextView);
        } else {
            EllipsizedTextView ellipsizedTextView2 = c25014h2.f119945s.f119995w;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtTitle");
            AbstractC26112n.m134367H(ellipsizedTextView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public final void m54647ZK(BreakSlot breakSlot) {
        String str;
        C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            ArrayList m50685f = breakSlot.m50685f();
            if (m50685f != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m50685f) {
                    if (((BreakSlot.Option) obj).m50702c()) {
                        arrayList.add(obj);
                    }
                }
                str = AbstractC25332a0.m131214n0(arrayList, null, null, null, 0, null, C10344g.f53083q, 31, null);
            } else {
                str = null;
            }
            if (!AbstractC19074t.m100204b(str, this.f53074D0) && !AbstractC19074t.m100204b(str, "")) {
                SimpleShadowTextView simpleShadowTextView = c25014h2.f119943q;
                AbstractC19074t.m100207e(simpleShadowTextView, "btnSave");
                AbstractC26112n.m134396f(simpleShadowTextView);
                SimpleShadowTextView simpleShadowTextView2 = c25014h2.f119943q;
                AbstractC19074t.m100207e(simpleShadowTextView2, "btnSave");
                AbstractC26112n.m134416p(simpleShadowTextView2);
                SimpleShadowTextView simpleShadowTextView3 = c25014h2.f119943q;
                AbstractC19074t.m100207e(simpleShadowTextView3, "btnSave");
                AbstractC26112n.m134431w0(simpleShadowTextView3);
                return;
            }
            SimpleShadowTextView simpleShadowTextView4 = c25014h2.f119943q;
            AbstractC19074t.m100207e(simpleShadowTextView4, "btnSave");
            AbstractC26112n.m134368I(simpleShadowTextView4);
            SimpleShadowTextView simpleShadowTextView5 = c25014h2.f119943q;
            AbstractC19074t.m100207e(simpleShadowTextView5, "btnSave");
            AbstractC26112n.m134398g(simpleShadowTextView5);
            SimpleShadowTextView simpleShadowTextView6 = c25014h2.f119943q;
            AbstractC19074t.m100207e(simpleShadowTextView6, "btnSave");
            AbstractC26112n.m134431w0(simpleShadowTextView6);
        }
    }

    /* renamed from: aL */
    private final void m54648aL(BreakSlot breakSlot) {
        C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            c25014h2.f119945s.f119995w.setText(breakSlot.m50689j());
            c25014h2.f119951y.setText(breakSlot.m50689j());
            OnboardingOptionLayout onboardingOptionLayout = c25014h2.f119947u;
            List m50685f = breakSlot.m50685f();
            if (m50685f == null) {
                m50685f = AbstractC25368s.m131502j();
            }
            onboardingOptionLayout.m52330b(m50685f, new C10345h(breakSlot));
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f53072B0);
        this.f53072B0.mo52965Lb(this);
        this.f53072B0.mo52970uo(m92642L3());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            ViewTreeObserver viewTreeObserver = c25014h2.f119950x.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onScrollChangedListener = this.f53073C0) != null) {
                viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            }
        }
        super.mo37484JJ();
    }

    @Override // m20.InterfaceC22810w0
    /* renamed from: To */
    public void mo54649To(Throwable th2) {
        if (th2 == null) {
            C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_item_video_survey_confirm);
            finish();
        } else {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        LoadingLayout loadingLayout;
        super.mo37584UJ();
        if (this.f53072B0.mo53361r1() == null) {
            this.f53072B0.mo53360Y8();
            C25014h2 c25014h2 = (C25014h2) m55556SK();
            if (c25014h2 != null && (loadingLayout = c25014h2.f119946t) != null) {
                loadingLayout.m55786j();
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C25014h2 c25014h2;
        LoadingLayout loadingLayout;
        super.mo37712VJ();
        if (this.f53072B0.mo53361r1() == null && (c25014h2 = (C25014h2) m55556SK()) != null && (loadingLayout = c25014h2.f119946t) != null) {
            loadingLayout.m55781c();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        final C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            FrameLayout frameLayout = c25014h2.f119948v;
            Resources m92651WI = m92651WI();
            FrameLayout frameLayout2 = c25014h2.f119948v;
            AbstractC19074t.m100207e(frameLayout2, "lytPageOnboarding");
            frameLayout.setBackground(new BitmapDrawable(m92651WI, AbstractC1415b.m7218b(AbstractC26112n.m134434z(frameLayout2, AbstractC27408c.zch_layer_radial_blue), 0, 0, null, 7, null)));
            LinearLayout linearLayout = c25014h2.f119949w;
            AbstractC19074t.m100207e(linearLayout, "lytViewOnboarding");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout root = c25014h2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                linearLayout.setLayoutParams(layoutParams2);
                c25014h2.f119949w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: m20.x0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        OnboardingPageView.m54645XK(C25014h2.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                });
                ViewTreeObserver viewTreeObserver = c25014h2.f119950x.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: m20.y0
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            OnboardingPageView.m54646YK(C25014h2.this);
                        }
                    };
                    this.f53073C0 = onScrollChangedListener;
                    viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                }
                ImageView imageView = c25014h2.f119945s.f119989q;
                AbstractC19074t.m100207e(imageView, "btnBack");
                AbstractC26112n.m134407k0(imageView, new C10342e());
                SimpleShadowTextView simpleShadowTextView = c25014h2.f119943q;
                AbstractC19074t.m100207e(simpleShadowTextView, "btnSave");
                AbstractC26112n.m134407k0(simpleShadowTextView, new C10343f());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // m20.InterfaceC22810w0
    /* renamed from: b */
    public void mo54650b(boolean z11) {
        LoadingLayout loadingLayout;
        if (z11 && this.f53072B0.mo53361r1() == null) {
            this.f53072B0.mo53360Y8();
            C25014h2 c25014h2 = (C25014h2) m55556SK();
            if (c25014h2 != null && (loadingLayout = c25014h2.f119946t) != null) {
                loadingLayout.m55786j();
            }
        }
    }

    @Override // m20.InterfaceC22810w0
    /* renamed from: d */
    public void mo54651d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            if (th2 instanceof NetworkException) {
                c25014h2.f119946t.m55784g(new C10339b(c25014h2));
            } else {
                c25014h2.f119946t.m55783f(new C10340c(c25014h2));
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        C25021j1 c25021j1;
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C25014h2 c25014h2 = (C25014h2) m55556SK();
            if (c25014h2 != null && (c25021j1 = c25014h2.f119945s) != null && (imageView = c25021j1.f119989q) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }

    @Override // m20.InterfaceC22810w0
    /* renamed from: rd */
    public void mo54652rd(BreakSlot breakSlot) {
        String str;
        AbstractC19074t.m100208f(breakSlot, "onboarding");
        C25014h2 c25014h2 = (C25014h2) m55556SK();
        if (c25014h2 != null) {
            ArrayList m50685f = breakSlot.m50685f();
            if (m50685f != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m50685f) {
                    if (((BreakSlot.Option) obj).m50702c()) {
                        arrayList.add(obj);
                    }
                }
                str = AbstractC25332a0.m131214n0(arrayList, null, null, null, 0, null, C10341d.f53080q, 31, null);
            } else {
                str = null;
            }
            this.f53074D0 = str;
            m54648aL(breakSlot);
            m54647ZK(breakSlot);
            c25014h2.f119946t.m55781c();
        }
    }
}
