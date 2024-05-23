package com.zing.zalo.p077ui.picker.location;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.location.widget.ZaloMapView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import p170fv.C19151e;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public abstract class MapZaloView extends BaseZaloView {

    /* renamed from: M0 */
    protected ZaloMapView f66488M0;

    /* renamed from: N0 */
    protected ZaloWebView f66489N0;

    /* renamed from: O0 */
    private boolean f66490O0;

    /* renamed from: P0 */
    private boolean f66491P0;

    /* renamed from: Q0 */
    protected SensitiveData f66492Q0;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m30661j();
            this.f66488M0.mo48018N();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m48048L();
            this.f66488M0.m30663l();
        }
        this.f66491P0 = false;
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", this.f66492Q0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m30665n();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m30666p();
        }
        super.mo37712VJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            if (AbstractC8955a.m47863a()) {
                ZaloMapView zaloMapView = this.f66488M0;
                if (zaloMapView != null && zaloMapView.getParent() == null) {
                    mo71930eM(this.f66488M0);
                    return;
                }
                return;
            }
            if (this.f66489N0 == null) {
                mo71932hM();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Object parcelable;
        super.mo37125ZJ(view, bundle);
        if (bundle != null && bundle.containsKey("EXTRA_SENSITIVE_DATA")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("EXTRA_SENSITIVE_DATA", SensitiveData.class);
                this.f66492Q0 = (SensitiveData) parcelable;
            } else {
                this.f66492Q0 = (SensitiveData) bundle.getParcelable("EXTRA_SENSITIVE_DATA");
            }
        }
        if (AbstractC8955a.m47863a()) {
            if (this.f66488M0 == null) {
                m72060iM(getContext());
            }
            ZaloMapView zaloMapView = this.f66488M0;
            if (zaloMapView != null && zaloMapView.getParent() == null) {
                mo71930eM(this.f66488M0);
                return;
            }
            return;
        }
        if (this.f66489N0 == null) {
            mo71932hM();
        }
    }

    /* renamed from: dM */
    public View m72058dM(FrameLayout frameLayout) {
        if (frameLayout == null) {
            return null;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(AbstractC16803z.icn_livelocation_curentlocation);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        layoutParams.topMargin = AbstractC23136l9.m118742r(10.0f);
        layoutParams.rightMargin = AbstractC23136l9.m118742r(2.0f);
        layoutParams.gravity = 53;
        frameLayout.addView(imageView, layoutParams);
        return imageView;
    }

    /* renamed from: eM */
    abstract void mo71930eM(ZaloMapView zaloMapView);

    /* renamed from: fM */
    public void m72059fM() {
        if (AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112034k) == 0) {
            if (AbstractC8955a.m47863a()) {
                ZaloMapView zaloMapView = this.f66488M0;
                if (zaloMapView != null) {
                    zaloMapView.m48058w();
                    this.f66488M0.mo48014A(true, true);
                    return;
                }
                return;
            }
            if (this.f66489N0 == null) {
                mo71932hM();
            }
        }
    }

    /* renamed from: gM */
    abstract ZaloMapView mo71931gM(Context context);

    /* renamed from: hM */
    abstract void mo71932hM();

    /* renamed from: iM */
    public void m72060iM(Context context) {
        if (!AbstractC23309i.m121516V2()) {
            this.f66488M0 = null;
            return;
        }
        if (!AbstractC8955a.m47863a()) {
            this.f66488M0 = null;
            return;
        }
        if (context != null) {
            this.f66488M0 = mo71931gM(context);
        }
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView == null) {
            return;
        }
        try {
            zaloMapView.m30660i(null);
            ZaloMapView zaloMapView2 = this.f66488M0;
            zaloMapView2.m30659h(zaloMapView2);
            this.f66490O0 = true;
            if (this.f66491P0) {
                this.f66488M0.m30664m();
                this.f66488M0.m48047K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    public void m72061jM(SensitiveData sensitiveData) {
        this.f66492Q0 = sensitiveData;
    }

    /* renamed from: kM */
    public void m72062kM(int i11, double d11, double d12) {
        String str = "https://maps.google.com/";
        if (d11 != -1.0d && d12 != -1.0d) {
            str = "https://maps.google.com/maps?z=16&q=" + Uri.encode("@" + d11 + "," + d12) + "&t=m";
        }
        ZaloWebView zaloWebView = new ZaloWebView();
        this.f66489N0 = zaloWebView;
        zaloWebView.m86747WN(new C19151e());
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", str);
        bundle.putBoolean("EXTRA_AUTO_PERMISSION", true);
        m92649TI().mo93055b2(i11, this.f66489N0, bundle, 0, "", 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m30662k();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ZaloMapView zaloMapView = this.f66488M0;
        if (zaloMapView != null && this.f66490O0) {
            zaloMapView.m30664m();
            this.f66488M0.m48047K();
        }
        this.f66491P0 = true;
    }
}
