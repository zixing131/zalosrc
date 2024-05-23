package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p189gv.C19609h;
import p354n3.C23528a;
import p500s1.C26087b;
import p649xl.C29908l8;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class MPLoadingViewFull extends MPLoadingView {

    /* renamed from: s */
    private int f74819s;

    /* renamed from: t */
    private int f74820t;

    /* renamed from: u */
    private C29908l8 f74821u;

    /* renamed from: v */
    private View f74822v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewFull(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view, this);
        C29908l8 m148203a = C29908l8.m148203a(this);
        AbstractC19074t.m100207e(m148203a, "bind(...)");
        this.f74821u = m148203a;
        m148203a.f138581q.setClipToOutline(true);
        m81290m();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.pv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m81285f;
                m81285f = MPLoadingViewFull.m81285f(MPLoadingViewFull.this, view, windowInsets);
                return m81285f;
            }
        });
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        m81288k();
        this.f74821u.f138582r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewFull.m81286g(MPLoadingViewFull.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final WindowInsets m81285f(MPLoadingViewFull mPLoadingViewFull, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(mPLoadingViewFull, "this$0");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        mPLoadingViewFull.m81290m();
        mPLoadingViewFull.m81289l();
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m81286g(MPLoadingViewFull mPLoadingViewFull, View view) {
        AbstractC19074t.m100208f(mPLoadingViewFull, "this$0");
        View.OnClickListener onBtnExitClickListener = mPLoadingViewFull.getOnBtnExitClickListener();
        if (onBtnExitClickListener != null) {
            onBtnExitClickListener.onClick(view);
        }
        ObjectAnimator animBrandAvatar = mPLoadingViewFull.getAnimBrandAvatar();
        if (animBrandAvatar != null) {
            animBrandAvatar.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m81287j(MPLoadingViewFull mPLoadingViewFull) {
        AbstractC19074t.m100208f(mPLoadingViewFull, "this$0");
        mPLoadingViewFull.f74821u.f138581q.setPivotY(r0.getMeasuredHeight());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(mPLoadingViewFull.f74821u.f138581q, PropertyValuesHolder.ofFloat("scaleX", 1.2f), PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setInterpolator(new C26087b());
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
        mPLoadingViewFull.setAnimBrandAvatar(ofPropertyValuesHolder);
    }

    /* renamed from: k */
    private final void m81288k() {
        this.f74821u.f138586v.setIdTracking("ma_popup_loading");
        this.f74821u.f138582r.setIdTracking("ma_popup_loading_close");
    }

    /* renamed from: l */
    private final void m81289l() {
        int i11 = this.f74820t;
        int m155408g = AbstractC32226c.m155408g(getRootView());
        this.f74820t = m155408g;
        if (m155408g == i11) {
            return;
        }
        TrackingRelativeLayout root = this.f74821u.getRoot();
        AbstractC19074t.m100205c(root);
        root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), root.getPaddingBottom() + this.f74820t);
    }

    /* renamed from: m */
    private final void m81290m() {
        int i11 = this.f74819s;
        View view = this.f74822v;
        if (view == null) {
            view = getRootView();
        }
        int m155409h = AbstractC32226c.m155409h(view);
        this.f74819s = m155409h;
        if (m155409h != i11) {
            int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.mp_action_bar_padding);
            ViewGroup.LayoutParams layoutParams = this.f74821u.f138584t.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = this.f74819s + m118736p;
            this.f74821u.f138584t.setLayoutParams(layoutParams2);
        }
    }

    public final C29908l8 getVb() {
        return this.f74821u;
    }

    /* renamed from: h */
    public final void m81291h() {
        TrackingImageView trackingImageView = this.f74821u.f138582r;
        trackingImageView.setBackground(C23212s8.m119609q(trackingImageView.getContext(), AbstractC16781w.BackgroundButtonMPRightCurve));
        trackingImageView.setImageDrawable(C23212s8.m119609q(trackingImageView.getContext(), AbstractC16781w.IconMPExit));
    }

    /* renamed from: i */
    public final void m81292i() {
        post(new Runnable() { // from class: com.zing.zalo.ui.zviews.rv
            @Override // java.lang.Runnable
            public final void run() {
                MPLoadingViewFull.m81287j(MPLoadingViewFull.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.MPLoadingView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator animBrandAvatar = getAnimBrandAvatar();
        if (animBrandAvatar != null) {
            animBrandAvatar.removeAllListeners();
        }
        ObjectAnimator animBrandAvatar2 = getAnimBrandAvatar();
        if (animBrandAvatar2 != null) {
            animBrandAvatar2.cancel();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MPLoadingView
    public void setMPInfo(C19609h c19609h) {
        AbstractC19074t.m100208f(c19609h, "info");
        ((C23528a) new C23528a(getContext()).m123612r(this.f74821u.f138581q)).m123619y(c19609h.m102612f(), C23278z2.f112845a.m120171i1(), 10);
        this.f74821u.f138588x.setText(c19609h.m102619m());
        C0708i c0708i = new C0708i();
        c0708i.m1075f("ma_id", c19609h.m102616j());
        this.f74821u.f138586v.setTrackingExtraData(c0708i);
        this.f74821u.f138582r.setTrackingExtraData(c0708i);
    }

    public final void setVb(C29908l8 c29908l8) {
        AbstractC19074t.m100208f(c29908l8, "<set-?>");
        this.f74821u = c29908l8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewFull(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view, this);
        C29908l8 m148203a = C29908l8.m148203a(this);
        AbstractC19074t.m100207e(m148203a, "bind(...)");
        this.f74821u = m148203a;
        m148203a.f138581q.setClipToOutline(true);
        m81290m();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.pv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m81285f;
                m81285f = MPLoadingViewFull.m81285f(MPLoadingViewFull.this, view, windowInsets);
                return m81285f;
            }
        });
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        m81288k();
        this.f74821u.f138582r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewFull.m81286g(MPLoadingViewFull.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewFull(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view, this);
        C29908l8 m148203a = C29908l8.m148203a(this);
        AbstractC19074t.m100207e(m148203a, "bind(...)");
        this.f74821u = m148203a;
        m148203a.f138581q.setClipToOutline(true);
        m81290m();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.pv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m81285f;
                m81285f = MPLoadingViewFull.m81285f(MPLoadingViewFull.this, view, windowInsets);
                return m81285f;
            }
        });
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        m81288k();
        this.f74821u.f138582r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewFull.m81286g(MPLoadingViewFull.this, view);
            }
        });
    }
}
