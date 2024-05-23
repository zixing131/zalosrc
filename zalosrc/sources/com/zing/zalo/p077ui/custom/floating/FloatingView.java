package com.zing.zalo.p077ui.custom.floating;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.zing.zalo.p077ui.custom.floating.FloatingController;
import com.zing.zalo.uidrawing.ModulesView;

/* loaded from: classes5.dex */
public abstract class FloatingView extends ModulesView implements FloatingController.InterfaceC11856a {

    /* renamed from: U */
    static float f61787U = 1000.0f;

    /* renamed from: K */
    int f61788K;

    /* renamed from: L */
    int f61789L;

    /* renamed from: M */
    int f61790M;

    /* renamed from: N */
    int f61791N;

    /* renamed from: O */
    int f61792O;

    /* renamed from: P */
    int f61793P;

    /* renamed from: Q */
    int f61794Q;

    /* renamed from: R */
    int f61795R;

    /* renamed from: S */
    float f61796S;

    /* renamed from: T */
    public FloatingController f61797T;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.floating.FloatingView$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC11857a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC11857a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FloatingView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            FloatingView.this.m65917Y();
        }
    }

    public FloatingView(Context context) {
        super(context);
        this.f61797T = new FloatingController(getContext(), this, 1000);
        m65916W();
        this.f61796S = getAlpha();
    }

    /* renamed from: W */
    private void m65916W() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11857a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m65917Y() {
        this.f61788K = getWidth();
        this.f61789L = getHeight();
        View view = (View) getParent();
        this.f61790M = view.getWidth();
        int height = view.getHeight();
        this.f61791N = height;
        this.f61792O = 0;
        int i11 = this.f61790M - this.f61788K;
        this.f61793P = i11;
        this.f61794Q = 0;
        int i12 = height - this.f61789L;
        this.f61795R = i12;
        this.f61797T.m65900t(0, 0, i11, i12);
        mo65918X();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void mo65918X() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public void m65919a0(float f11, float f12) {
        animate().x(f11).y(f12).setDuration(0L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61797T.m65895m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61797T.m65894l();
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: x */
    public PointF mo65913x(float f11, float f12, MotionEvent motionEvent) {
        return null;
    }
}
