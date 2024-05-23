package com.zing.zalo.zinstant.component.p081ui.scrollview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.utils.C17202n;
import com.zing.zalo.zinstant.view.InterfaceC17225b;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantRootLayout;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import nk0.AbstractC23838k1;
import nk0.C23855s0;
import nk0.C23857t0;
import ok0.InterfaceC24284a;
import ok0.InterfaceC24289f;
import qk0.InterfaceC25307c;
import uk0.InterfaceC27292f;
import wj0.AbstractC29060a;
import wj0.InterfaceC29061b;

/* loaded from: classes7.dex */
public class ZinstantScrollViewImpl extends ZinstantScrollViewBase implements InterfaceC29061b, InterfaceC17126d {

    /* renamed from: c0 */
    private ZOMContainer f87567c0;

    /* renamed from: d0 */
    private InterfaceC27292f f87568d0;

    /* renamed from: e0 */
    private InterfaceC24289f f87569e0;

    /* renamed from: f0 */
    private InterfaceC24284a f87570f0;

    /* renamed from: g0 */
    private InterfaceC17139d f87571g0;

    /* renamed from: h0 */
    private C23855s0 f87572h0;

    /* renamed from: i0 */
    private boolean f87573i0;

    /* renamed from: j0 */
    private float f87574j0;

    /* renamed from: k0 */
    private float f87575k0;

    /* renamed from: l0 */
    private boolean f87576l0;

    /* renamed from: m0 */
    private boolean f87577m0;

    /* renamed from: n0 */
    private C23857t0 f87578n0;

    /* renamed from: com.zing.zalo.zinstant.component.ui.scrollview.ZinstantScrollViewImpl$a */
    /* loaded from: classes7.dex */
    public class ViewOnAttachStateChangeListenerC17122a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC17122a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ZinstantScrollViewImpl.this.f87576l0 = true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ZinstantScrollViewImpl.this.f87576l0 = true;
        }
    }

    public ZinstantScrollViewImpl(Context context) {
        super(context);
        this.f87573i0 = false;
        this.f87575k0 = 0.0f;
        this.f87576l0 = true;
        this.f87577m0 = false;
        this.f87578n0 = null;
    }

    /* renamed from: A0 */
    public /* synthetic */ void m91551A0(boolean z11) {
        this.f87567c0.onScrollStateChanged(z11 ? 1 : 0);
    }

    /* renamed from: C0 */
    private void m91552C0() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (getZINSNode() != null && (layoutParams2 = getLayoutParams()) != null) {
            layoutParams2.width = getZINSNode().mWidth;
            layoutParams2.height = getZINSNode().mHeight;
        }
        ZinstantLayout zinstantLayout = this.f87565b0;
        C23855s0 c23855s0 = this.f87572h0;
        if (zinstantLayout != null && c23855s0 != null && (layoutParams = zinstantLayout.getLayoutParams()) != null) {
            layoutParams.width = c23855s0.m124651z();
            layoutParams.height = c23855s0.getHeight();
        }
    }

    /* renamed from: u0 */
    private void m91556u0() {
        C23857t0 c23857t0 = this.f87578n0;
        if (c23857t0 != null && c23857t0.m131026t().getTransformDrawing() != null) {
            ZOMMatrix2D transformMatrix = this.f87578n0.m131026t().getTransformDrawing().getTransformMatrix();
            setTranslationX(transformMatrix.matrix[4]);
            setTranslationY(transformMatrix.matrix[5]);
            setScaleX(transformMatrix.matrix[0]);
            setScaleY(transformMatrix.matrix[3]);
        }
    }

    /* renamed from: x0 */
    private boolean m91557x0() {
        if (this.f87576l0) {
            this.f87576l0 = false;
            for (ViewParent parent = getParent(); parent instanceof InterfaceC29061b; parent = parent.getParent()) {
                if (parent instanceof InterfaceC17123a) {
                    this.f87577m0 = false;
                    return false;
                }
            }
            this.f87577m0 = true;
            return true;
        }
        return this.f87577m0;
    }

    /* renamed from: y0 */
    private boolean m91558y0(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        float rawY = this.f87575k0 - motionEvent.getRawY();
        if (Math.abs(motionEvent.getRawX() - this.f87574j0) / 3.0f > Math.abs(motionEvent.getRawY() - this.f87575k0)) {
            return false;
        }
        return canScrollVertically((int) rawY);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m91559z0(ZinstantLayout zinstantLayout, InterfaceC17123a interfaceC17123a, boolean z11) {
        if (z11) {
            zinstantLayout.m91993g0();
        }
    }

    /* renamed from: B0 */
    public void m91560B0() {
        ZOMBackground zOMBackground;
        float f11;
        ZOM zINSNode = getZINSNode();
        if (zINSNode != null && (zOMBackground = zINSNode.mBackground) != null && zOMBackground.mColor != 0) {
            C23857t0 c23857t0 = this.f87578n0;
            if (c23857t0 != null) {
                f11 = c23857t0.m130996B();
            } else {
                f11 = 1.0f;
            }
            setBackgroundColor(C17189a.f87752a.m91796b(f11, zOMBackground.mColor));
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: c */
    public void mo91542c(InterfaceC25307c.a aVar) {
        ZOMRect zOMRect;
        if (getZINSNode() != null) {
            zOMRect = getZINSNode().mBound;
        } else {
            zOMRect = null;
        }
        if (zOMRect == null) {
            aVar.mo92118a(new ZOMRect());
            return;
        }
        C17202n.m91830a(this, new Rect(0, 0, getZINSNode().mBound.getWidth(), getZINSNode().mBound.getHeight()), new Rect());
        aVar.mo92118a(new ZOMRect(r0.left, r0.top, r0.right, r0.bottom));
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: d */
    public void mo91543d() {
        m91556u0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:            if (r1 != 3) goto L60;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(null);
        }
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f87573i0 && m91558y0(motionEvent) && m91557x0() && parent != null) {
                        this.f87573i0 = true;
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            if (m91557x0() && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            stopNestedScroll();
        } else {
            this.f87573i0 = false;
            this.f87574j0 = motionEvent.getRawX();
            this.f87575k0 = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: f */
    public boolean mo91512f(String str, String str2, int i11) {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            return zinstantLayout.mo91512f(str, str2, i11);
        }
        return false;
    }

    @Override // wj0.InterfaceC29061b
    public ZOMRect getGlobalZOMRect() {
        if (getZINSNode() != null) {
            return getZINSNode().mBound;
        }
        return null;
    }

    @Override // wj0.InterfaceC29061b
    public View getView() {
        return this;
    }

    @Override // wj0.InterfaceC29061b
    public ZOM getZINSNode() {
        return this.f87567c0;
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: l */
    public void mo91544l(int i11) {
        if ((i11 & 32) != 0) {
            setVisibility(getZINSNode().mRelativeVisibility);
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: m */
    public void mo91545m() {
        m91560B0();
        invalidate();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: n */
    public void mo91515n() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.m92000s();
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onPause() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.onPause();
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onResume() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.onResume();
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onStart() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.onStart();
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onStop() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.onStop();
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: p */
    public void mo91546p() {
        if (getZINSNode() != null) {
            setVisibility(getZINSNode().mRelativeVisibility);
        }
        m91552C0();
        requestLayout();
        m91562w0();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: q */
    public /* synthetic */ void mo91517q(AbstractC23838k1 abstractC23838k1) {
        AbstractC29060a.m145137b(this, abstractC23838k1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    /* renamed from: q0 */
    public void mo91550q0(View view, boolean z11) {
        C23855s0 c23855s0;
        super.mo91550q0(view, z11);
        if (this.f87567c0 != null && (c23855s0 = this.f87572h0) != null) {
            c23855s0.m124639c0(new Runnable() { // from class: com.zing.zalo.zinstant.component.ui.scrollview.b

                /* renamed from: q */
                public final /* synthetic */ boolean f87581q;

                public /* synthetic */ RunnableC17124b(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantScrollViewImpl.this.m91551A0(r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    public void setImageLoader(InterfaceC24289f interfaceC24289f) {
        this.f87569e0 = interfaceC24289f;
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    public void setInteractionTracker(InterfaceC27292f interfaceC27292f) {
        this.f87568d0 = interfaceC27292f;
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    public void setLayoutGateway(InterfaceC17139d interfaceC17139d) {
        this.f87571g0 = interfaceC17139d;
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    public void setOnClickListener(InterfaceC24284a interfaceC24284a) {
        this.f87570f0 = interfaceC24284a;
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewBase
    public void setZINSNode(ZOMContainer zOMContainer) {
        this.f87567c0 = zOMContainer;
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: u */
    public boolean mo91519u(String str) {
        ZOM zINSNode = getZINSNode();
        if (zINSNode != null && TextUtils.equals(zINSNode.mID, str)) {
            ZinstantLayout.m91934E0(this, getTop());
            return true;
        }
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            return zinstantLayout.mo91519u(str);
        }
        return false;
    }

    /* renamed from: v0 */
    public void m91561v0(InterfaceC17225b interfaceC17225b, C23857t0 c23857t0) {
        setZINSNode((ZOMContainer) c23857t0.m131007J());
        this.f87578n0 = c23857t0;
        c23857t0.m124656g1(this);
        this.f87572h0 = c23857t0.m124654e1();
        ZinstantRootLayout zinstantRootLayout = new ZinstantRootLayout(getContext());
        zinstantRootLayout.setLayoutParams(new FrameLayout.LayoutParams(this.f87572h0.m124651z(), this.f87572h0.getHeight()));
        zinstantRootLayout.setExternal(interfaceC17225b);
        zinstantRootLayout.setImageLoader(this.f87569e0);
        zinstantRootLayout.setOnClickListener(this.f87570f0);
        zinstantRootLayout.setLayoutGateway(this.f87571g0);
        zinstantRootLayout.setInteractionTracker(this.f87568d0);
        zinstantRootLayout.setZinstantRootView(this.f87572h0);
        setOnIdleListener(new InterfaceC17123a.a() { // from class: com.zing.zalo.zinstant.component.ui.scrollview.c
            public /* synthetic */ C17125c() {
            }

            @Override // com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17123a.a
            /* renamed from: a */
            public final void mo68087a(InterfaceC17123a interfaceC17123a, boolean z11) {
                ZinstantScrollViewImpl.m91559z0(ZinstantLayout.this, interfaceC17123a, z11);
            }
        });
        mo91545m();
        mo91546p();
        removeAllViews();
        addView(zinstantRootLayout, 0);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC17122a());
        m91556u0();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: w */
    public /* synthetic */ void mo91520w(C23855s0 c23855s0, AbstractC23838k1 abstractC23838k1) {
        AbstractC29060a.m145136a(this, c23855s0, abstractC23838k1);
    }

    /* renamed from: w0 */
    public void m91562w0() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.m91974K();
        }
        invalidate();
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: x */
    public void mo91548x() {
        m91560B0();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: y */
    public void mo91521y() {
        ZinstantLayout zinstantLayout = this.f87565b0;
        if (zinstantLayout != null) {
            zinstantLayout.mo91521y();
        }
    }

    public ZinstantScrollViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87573i0 = false;
        this.f87575k0 = 0.0f;
        this.f87576l0 = true;
        this.f87577m0 = false;
        this.f87578n0 = null;
    }
}
