package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import i40.InterfaceC20278h;
import i60.C20338d;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import p241ij.C20568e;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p716zh.C31883d5;

/* loaded from: classes6.dex */
public class GifViewerZView extends BaseZaloView implements View.OnTouchListener, C23744a.c, InterfaceC0733x {

    /* renamed from: M0 */
    InterfaceC20278h f73524M0;

    /* renamed from: N0 */
    C31883d5 f73525N0;

    /* renamed from: O0 */
    String f73526O0;

    /* renamed from: P0 */
    View f73527P0;

    /* renamed from: Q0 */
    private ZSimpleGIFView f73528Q0;

    /* renamed from: R0 */
    View f73529R0;

    /* renamed from: T0 */
    boolean f73531T0;

    /* renamed from: U0 */
    float f73532U0;

    /* renamed from: V0 */
    float f73533V0;

    /* renamed from: W0 */
    float f73534W0;

    /* renamed from: X0 */
    int f73535X0;

    /* renamed from: Y0 */
    VelocityTracker f73536Y0;

    /* renamed from: a1 */
    MessageId f73538a1;

    /* renamed from: S0 */
    int f73530S0 = 3;

    /* renamed from: Z0 */
    boolean f73537Z0 = true;

    /* renamed from: b1 */
    protected Handler f73539b1 = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GifViewerZView$a */
    /* loaded from: classes6.dex */
    public class C14302a extends ZSimpleGIFView.AbstractC16553e {
        C14302a() {
        }

        @Override // com.zing.zalo.uicontrol.ZSimpleGIFView.AbstractC16553e
        /* renamed from: a */
        public void mo79869a(C3979l c3979l) {
            GifViewerZView gifViewerZView = GifViewerZView.this;
            InterfaceC20278h interfaceC20278h = gifViewerZView.f73524M0;
            if (interfaceC20278h != null) {
                interfaceC20278h.mo56690i1(gifViewerZView, c3979l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GifViewerZView$b */
    /* loaded from: classes6.dex */
    public class C14303b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ float f73541p;

        C14303b(float f11) {
            this.f73541p = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f73541p != 0.0f) {
                GifViewerZView gifViewerZView = GifViewerZView.this;
                gifViewerZView.f73537Z0 = false;
                gifViewerZView.finish();
            }
            if (this.f73541p == 0.0f) {
                GifViewerZView.this.f73529R0.setAlpha(1.0f);
                GifViewerZView.this.m92662fJ().m93094z(false);
                ActionBar actionBar = GifViewerZView.this.f88760a0;
                if (actionBar != null) {
                    actionBar.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public /* synthetic */ void m79865gM() {
        ToastUtils.m89266n(AbstractC8020f0.str_gif_deleted, new Object[0]);
        this.f73537Z0 = false;
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            this.f73525N0 = (C31883d5) m92642L3().getSerializable("extra_content");
            this.f73526O0 = m92642L3().getString("extra_title");
            this.f73538a1 = (MessageId) m92642L3().getParcelable("extra_cli_id");
            if (this.f73525N0 == null) {
                finish();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73527P0 = layoutInflater.inflate(AbstractC7409c0.gif_viewer_layout, viewGroup, false);
        m92637BK(true);
        m79868hM();
        return this.f73527P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        try {
            InterfaceC20278h interfaceC20278h = this.f73524M0;
            if (interfaceC20278h != null) {
                interfaceC20278h.mo56687X0(this.f73537Z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 9);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        try {
            super.mo37493TJ();
            if (m92676n2() != null && this.f72421L0.m92674mJ() && (actionBar = this.f88760a0) != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                if (m92676n2().mo35576n3()) {
                    this.f88760a0.setOccupyStatusBar(true);
                }
                if (!TextUtils.isEmpty(this.f73526O0)) {
                    this.f88760a0.setTitle(this.f73526O0);
                }
                if (m92676n2().mo35576n3()) {
                    this.f88760a0.setOccupyStatusBar(true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eM */
    void m79866eM() {
        try {
            ArrayList arrayList = AbstractC23304d.f113413n;
            if (arrayList != null && arrayList.size() > 0) {
                for (C20568e c20568e : new ArrayList(arrayList)) {
                    if (c20568e != null && c20568e.m107018b().equals(this.f73538a1)) {
                        ToastUtils.m89266n(AbstractC8020f0.str_gif_deleted, new Object[0]);
                        this.f73537Z0 = false;
                        finish();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fM */
    void m79867fM(float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f73528Q0, "translationY", this.f73534W0, f11);
        ofFloat.addListener(new C14303b(f11));
        ofFloat.setDuration(200L).start();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GifViewerZView";
    }

    /* renamed from: hM */
    void m79868hM() {
        String str;
        try {
            this.f73529R0 = this.f73527P0.findViewById(AbstractC6918a0.background_view);
            ZSimpleGIFView zSimpleGIFView = (ZSimpleGIFView) this.f73527P0.findViewById(AbstractC6918a0.zvideo_gif_view);
            this.f73528Q0 = zSimpleGIFView;
            if (TextUtils.isEmpty(this.f73525N0.f146449q)) {
                str = this.f73525N0.f146448p;
            } else {
                str = this.f73525N0.f146449q;
            }
            String str2 = str;
            C31883d5 c31883d5 = this.f73525N0;
            zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str2, c31883d5.f146450r, c31883d5.f146452t, c31883d5.f146451s, "GifViewerZView"), 0, new C14302a());
            this.f73528Q0.m88224g(100L);
            this.f73527P0.setOnTouchListener(this);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m79866eM();
        C23744a.m124114c().m124115b(this, 9);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int action = motionEvent.getAction();
        if (action != 0) {
            int i11 = 8;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return view.onTouchEvent(motionEvent);
                    }
                } else {
                    float rawY = motionEvent.getRawY() - this.f73532U0;
                    if (Math.abs(rawY) > this.f73530S0 || this.f73531T0) {
                        if (!this.f73531T0) {
                            m92662fJ().m93094z(true);
                            ActionBar actionBar = this.f88760a0;
                            if (actionBar != null) {
                                actionBar.setVisibility(8);
                            }
                        }
                        this.f73531T0 = true;
                        VelocityTracker velocityTracker = this.f73536Y0;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        this.f73534W0 = rawY;
                        this.f73528Q0.setTranslationY(rawY);
                        float f17 = this.f73534W0;
                        if (f17 > 0.0f) {
                            float f18 = m92651WI().getDisplayMetrics().heightPixels - this.f73533V0;
                            f16 = ((f18 - this.f73534W0) / f18) * 1.0f;
                        } else if (f17 < 0.0f) {
                            float f19 = this.f73533V0 + this.f73535X0;
                            f16 = ((f19 - Math.abs(f17)) / f19) * 1.0f;
                        } else {
                            f16 = 1.0f;
                        }
                        this.f73529R0.setAlpha(Math.min(1.0f, Math.max(0.0f, f16)));
                    }
                    return true;
                }
            }
            if (this.f73531T0) {
                VelocityTracker velocityTracker2 = this.f73536Y0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    this.f73536Y0.computeCurrentVelocity(1000);
                    if (Math.abs(this.f73536Y0.getYVelocity()) >= 1000.0f) {
                        if (this.f73534W0 > 0.0f) {
                            f14 = m92651WI().getDisplayMetrics().heightPixels;
                            f15 = this.f73533V0;
                        } else {
                            f14 = -this.f73533V0;
                            f15 = this.f73535X0;
                        }
                        f11 = f14 - f15;
                    } else {
                        f11 = 0.0f;
                    }
                    this.f73536Y0.recycle();
                    this.f73536Y0 = null;
                } else {
                    f11 = 0.0f;
                }
                if (f11 == 0.0f && Math.abs(this.f73534W0) > 100.0f) {
                    if (this.f73534W0 > 0.0f) {
                        f12 = m92651WI().getDisplayMetrics().heightPixels;
                        f13 = this.f73533V0;
                    } else {
                        f12 = -this.f73533V0;
                        f13 = this.f73535X0;
                    }
                    f11 = f12 - f13;
                }
                m79867fM(f11);
                this.f73531T0 = false;
            } else {
                ActionBar actionBar2 = this.f88760a0;
                if (actionBar2 != null) {
                    int visibility = actionBar2.getVisibility();
                    ActionBar actionBar3 = this.f88760a0;
                    if (visibility != 0) {
                        i11 = 0;
                    }
                    actionBar3.setVisibility(i11);
                }
            }
            return true;
        }
        this.f73533V0 = this.f73528Q0.getTop();
        this.f73535X0 = this.f73528Q0.getHeight();
        this.f73532U0 = motionEvent.getRawY();
        VelocityTracker obtain = VelocityTracker.obtain();
        this.f73536Y0 = obtain;
        if (obtain != null) {
            obtain.addMovement(motionEvent);
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        MessageId m106047e;
        if (i11 == 9 && objArr != null) {
            try {
                if (objArr.length > 0 && (m106047e = ((C20338d) objArr[0]).m106047e()) != null && m106047e.equals(this.f73538a1)) {
                    this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ug
                        @Override // java.lang.Runnable
                        public final void run() {
                            GifViewerZView.this.m79865gM();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        if (zaloActivity instanceof InterfaceC20278h) {
            this.f73524M0 = (InterfaceC20278h) zaloActivity;
        }
    }
}
