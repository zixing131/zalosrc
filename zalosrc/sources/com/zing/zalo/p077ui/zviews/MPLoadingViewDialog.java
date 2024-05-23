package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p189gv.C19609h;
import p354n3.C23528a;
import p500s1.C26087b;
import p649xl.C29926m8;

/* loaded from: classes6.dex */
public final class MPLoadingViewDialog extends MPLoadingView {

    /* renamed from: s */
    private C29926m8 f74818s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewDialog(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view_dialog, this);
        C29926m8 m148245a = C29926m8.m148245a(this);
        AbstractC19074t.m100207e(m148245a, "bind(...)");
        this.f74818s = m148245a;
        m148245a.f138667q.setClipToOutline(true);
        post(new Runnable() { // from class: com.zing.zalo.ui.zviews.nv
            @Override // java.lang.Runnable
            public final void run() {
                MPLoadingViewDialog.m81278e(MPLoadingViewDialog.this);
            }
        });
        m81280h();
        this.f74818s.f138668r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewDialog.m81279f(MPLoadingViewDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m81278e(MPLoadingViewDialog mPLoadingViewDialog) {
        AbstractC19074t.m100208f(mPLoadingViewDialog, "this$0");
        mPLoadingViewDialog.f74818s.f138667q.setPivotY(r0.getMeasuredHeight());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(mPLoadingViewDialog.f74818s.f138667q, PropertyValuesHolder.ofFloat("scaleX", 1.3f), PropertyValuesHolder.ofFloat("scaleY", 1.3f));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setInterpolator(new C26087b());
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
        mPLoadingViewDialog.setAnimBrandAvatar(ofPropertyValuesHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m81279f(MPLoadingViewDialog mPLoadingViewDialog, View view) {
        AbstractC19074t.m100208f(mPLoadingViewDialog, "this$0");
        View.OnClickListener onBtnExitClickListener = mPLoadingViewDialog.getOnBtnExitClickListener();
        if (onBtnExitClickListener != null) {
            onBtnExitClickListener.onClick(view);
        }
        ObjectAnimator animBrandAvatar = mPLoadingViewDialog.getAnimBrandAvatar();
        if (animBrandAvatar != null) {
            animBrandAvatar.cancel();
        }
    }

    /* renamed from: h */
    private final void m81280h() {
        this.f74818s.f138669s.setIdTracking("ma_popup_loading");
        this.f74818s.f138668r.setIdTracking("ma_popup_loading_close");
    }

    /* renamed from: g */
    public final void m81281g() {
        getRootView().findViewById(AbstractC6918a0.container).setBackgroundColor(AbstractC23136l9.m118639A(AbstractC16801x.black_70));
    }

    public final C29926m8 getVb() {
        return this.f74818s;
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
        this.f74818s.f138671u.setText(c19609h.m102619m());
        ((C23528a) new C23528a(getContext()).m123612r(this.f74818s.f138667q)).m123619y(c19609h.m102612f(), C23278z2.f112845a.m120171i1(), 10);
        C0708i c0708i = new C0708i();
        c0708i.m1075f("ma_id", c19609h.m102616j());
        this.f74818s.f138669s.setTrackingExtraData(c0708i);
        this.f74818s.f138668r.setTrackingExtraData(c0708i);
    }

    public final void setVb(C29926m8 c29926m8) {
        AbstractC19074t.m100208f(c29926m8, "<set-?>");
        this.f74818s = c29926m8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view_dialog, this);
        C29926m8 m148245a = C29926m8.m148245a(this);
        AbstractC19074t.m100207e(m148245a, "bind(...)");
        this.f74818s = m148245a;
        m148245a.f138667q.setClipToOutline(true);
        post(new Runnable() { // from class: com.zing.zalo.ui.zviews.nv
            @Override // java.lang.Runnable
            public final void run() {
                MPLoadingViewDialog.m81278e(MPLoadingViewDialog.this);
            }
        });
        m81280h();
        this.f74818s.f138668r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewDialog.m81279f(MPLoadingViewDialog.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingViewDialog(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.mp_loading_view_dialog, this);
        C29926m8 m148245a = C29926m8.m148245a(this);
        AbstractC19074t.m100207e(m148245a, "bind(...)");
        this.f74818s = m148245a;
        m148245a.f138667q.setClipToOutline(true);
        post(new Runnable() { // from class: com.zing.zalo.ui.zviews.nv
            @Override // java.lang.Runnable
            public final void run() {
                MPLoadingViewDialog.m81278e(MPLoadingViewDialog.this);
            }
        });
        m81280h();
        this.f74818s.f138668r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MPLoadingViewDialog.m81279f(MPLoadingViewDialog.this, view);
            }
        });
    }
}
