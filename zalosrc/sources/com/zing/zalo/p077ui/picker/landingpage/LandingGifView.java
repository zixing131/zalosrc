package com.zing.zalo.p077ui.picker.landingpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import me0.ViewOnTouchListenerC23157n8;

/* loaded from: classes6.dex */
public class LandingGifView extends FrameLayout {

    /* renamed from: p */
    private ZSimpleGIFView f66106p;

    /* renamed from: q */
    private ViewOnTouchListenerC23157n8 f66107q;

    /* renamed from: r */
    private ViewOnTouchListenerC9043a.i f66108r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingGifView$a */
    /* loaded from: classes6.dex */
    public class C12701a extends ViewOnTouchListenerC23157n8.c {
        C12701a() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: a */
        public void mo65452a() {
            if (LandingGifView.this.f66108r != null) {
                LandingGifView.this.f66108r.mo48414e();
            }
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            if (LandingGifView.this.f66108r != null) {
                LandingGifView.this.f66108r.mo48413d();
            }
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: c */
        public void mo71518c() {
            if (LandingGifView.this.f66108r != null) {
                LandingGifView.this.f66108r.mo48411b();
            }
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: d */
        public void mo65454d(float f11, boolean z11) {
            if (LandingGifView.this.f66108r != null) {
                LandingGifView.this.f66108r.mo48410a(f11);
            }
        }
    }

    public LandingGifView(Context context) {
        super(context);
        m71517b();
    }

    /* renamed from: b */
    private void m71517b() {
        ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(getContext());
        this.f66106p = zSimpleGIFView;
        zSimpleGIFView.setClickable(false);
        addView(this.f66106p);
        ViewOnTouchListenerC23157n8 viewOnTouchListenerC23157n8 = new ViewOnTouchListenerC23157n8(new C12701a(), 2);
        this.f66107q = viewOnTouchListenerC23157n8;
        viewOnTouchListenerC23157n8.m119175g(0.25f);
        this.f66107q.m119174f(false);
    }

    public ZSimpleGIFView getSimpleGIFView() {
        return this.f66106p;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC23157n8 viewOnTouchListenerC23157n8 = this.f66107q;
        if (viewOnTouchListenerC23157n8 != null) {
            viewOnTouchListenerC23157n8.onTouch(this, motionEvent);
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setScrollingAwayListener(ViewOnTouchListenerC9043a.i iVar) {
        this.f66108r = iVar;
    }

    public LandingGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m71517b();
    }
}
