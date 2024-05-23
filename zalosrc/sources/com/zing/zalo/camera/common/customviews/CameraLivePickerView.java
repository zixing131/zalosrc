package com.zing.zalo.camera.common.customviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.customviews.CameraLivePickerView;
import com.zing.zalo.cameradecor.view.CameraPreviewGLView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import ho0.AbstractC20110a;
import p207he.C20024r;
import p295kb.C21643a;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p646xi.C29669a;
import xh0.C29667y;
import xh0.InterfaceC29634a;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;

/* loaded from: classes3.dex */
public class CameraLivePickerView extends ZaloView implements InterfaceC29636b, C23744a.c, InterfaceC0733x {

    /* renamed from: A0 */
    private C29669a f41059A0;

    /* renamed from: D0 */
    private SensitiveData f41062D0;

    /* renamed from: w0 */
    private RelativeLayout f41065w0;

    /* renamed from: x0 */
    private CameraPreviewGLView f41066x0;

    /* renamed from: y0 */
    private InterfaceC29634a f41067y0;

    /* renamed from: z0 */
    private FrameLayout.LayoutParams f41068z0;

    /* renamed from: B0 */
    private boolean f41060B0 = true;

    /* renamed from: C0 */
    private boolean f41061C0 = false;

    /* renamed from: E0 */
    private final Handler f41063E0 = new Handler(Looper.getMainLooper());

    /* renamed from: F0 */
    private InterfaceC29653k.a f41064F0 = new C7580a();

    /* renamed from: com.zing.zalo.camera.common.customviews.CameraLivePickerView$a */
    /* loaded from: classes3.dex */
    class C7580a implements InterfaceC29653k.a {
        C7580a() {
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: a */
        public void mo38606a(boolean z11) {
            C21643a mo147378i;
            if (!z11 || CameraLivePickerView.this.f41067y0 == null || (mo147378i = CameraLivePickerView.this.f41067y0.mo147378i()) == null) {
                return;
            }
            if (mo147378i.m111567c(6)) {
                CameraLivePickerView.this.f41067y0.mo147383n(6);
            } else if (mo147378i.m111567c(5)) {
                CameraLivePickerView.this.f41067y0.mo147383n(5);
            } else if (mo147378i.m111567c(0)) {
                CameraLivePickerView.this.f41067y0.mo147383n(0);
            }
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: b */
        public void mo38607b(boolean z11, Exception exc) {
            if (!z11) {
                ToastUtils.showMess(CameraLivePickerView.this.getContext().getString(AbstractC8020f0.qrcode_msg_camera_framework_bug));
            }
            if (exc != null) {
                AbstractC20110a.m104539h(exc);
            }
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: c */
        public void mo38608c(byte[] bArr, boolean z11) {
        }

        @Override // xh0.InterfaceC29653k.a
        /* renamed from: d */
        public void mo38609d(boolean z11, Exception exc) {
        }

        @Override // xh0.InterfaceC29653k.a
        public void onError(int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LK */
    public /* synthetic */ void m39186LK() {
        ZaloView zaloView;
        if (m92676n2() != null && m92676n2().mo35579p() != null) {
            zaloView = m92676n2().mo35579p().m93012K0();
        } else {
            zaloView = null;
        }
        if (!(zaloView instanceof GroupLiveStreamView) && !(zaloView instanceof GroupLiveStreamPlaybackView)) {
            m39189OK();
        }
    }

    /* renamed from: MK */
    private void m39187MK() {
        CameraPreviewGLView cameraPreviewGLView = this.f41066x0;
        if (cameraPreviewGLView != null) {
            cameraPreviewGLView.m39677p();
            this.f41065w0.removeView(this.f41066x0);
            this.f41061C0 = true;
        }
    }

    /* renamed from: NK */
    private void m39188NK() {
        long j11;
        if (this.f41061C0) {
            if (this.f41066x0.getParent() == null) {
                this.f41065w0.addView(this.f41066x0, this.f41068z0);
            }
            this.f41061C0 = false;
        }
        CameraPreviewGLView cameraPreviewGLView = this.f41066x0;
        if (cameraPreviewGLView != null) {
            cameraPreviewGLView.mo39678q();
        }
        if (!C20024r.m103945n()) {
            Handler handler = this.f41063E0;
            Runnable runnable = new Runnable() { // from class: te.a
                @Override // java.lang.Runnable
                public final void run() {
                    CameraLivePickerView.this.m39186LK();
                }
            };
            if (this.f41060B0) {
                j11 = 0;
            } else {
                j11 = 500;
            }
            handler.postDelayed(runnable, j11);
            if (this.f41060B0) {
                this.f41060B0 = false;
            }
        }
    }

    /* renamed from: OK */
    private void m39189OK() {
        try {
            if (this.f41066x0 != null) {
                int m147499l = this.f41059A0.m147499l();
                if (m147499l != -1) {
                    if (m147499l >= C29667y.m147458p().m147480q()) {
                    }
                    AbstractC22470k.m116160l();
                    this.f41066x0.m39727F(m147499l, this, this.f41064F0, this.f41062D0);
                }
                this.f41059A0.m147508v(0);
                m147499l = 0;
                AbstractC22470k.m116160l();
                this.f41066x0.m39727F(m147499l, this, this.f41064F0, this.f41062D0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f41065w0 = new RelativeLayout(m92648SI());
        this.f41066x0 = new CameraPreviewGLView(m92648SI(), false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f41068z0 = layoutParams;
        this.f41065w0.setLayoutParams(layoutParams);
        this.f41065w0.setBackgroundColor(m92651WI().getColor(AbstractC16801x.black));
        this.f41065w0.addView(this.f41066x0, this.f41068z0);
        if (bundle != null) {
            this.f41061C0 = bundle.getBoolean("isPreviewRemoved", false);
        }
        this.f41059A0 = AbstractC23306f.m120715u();
        return this.f41065w0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        CameraPreviewGLView cameraPreviewGLView = this.f41066x0;
        if (cameraPreviewGLView != null && cameraPreviewGLView.getHolder() != null && this.f41066x0.getHolder().getSurface() != null) {
            this.f41066x0.getHolder().getSurface().release();
        }
        Handler handler = this.f41063E0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f41064F0 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m39187MK();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("isPreviewRemoved", this.f41061C0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            C23744a.m124114c().m124115b(this, 96);
            C23744a.m124114c().m124115b(this, 97);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            C23744a.m124114c().m124117e(this, 96);
            C23744a.m124114c().m124117e(this, 97);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CameraLivePickerView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        boolean z11;
        super.onResume();
        if (m92662fJ().m93012K0().m92650VI() instanceof ChatView) {
            ChatView chatView = (ChatView) m92662fJ().m93012K0().m92650VI();
            if (chatView != null && chatView.mo60273x4()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (chatView != null && chatView.f56846e3 == 6 && !z11) {
                m39188NK();
            }
        }
    }

    @Override // xh0.InterfaceC29636b
    /* renamed from: qC */
    public void mo38592qC(InterfaceC29634a interfaceC29634a) {
        synchronized (this) {
            this.f41067y0 = interfaceC29634a;
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 96) {
                if (i11 == 97) {
                    if (!this.f41061C0) {
                        m39187MK();
                    }
                }
            } else if (this.f41061C0) {
                m39188NK();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
