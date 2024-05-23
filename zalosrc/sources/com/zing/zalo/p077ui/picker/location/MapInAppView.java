package com.zing.zalo.p077ui.picker.location;

import ac.InterfaceC0733x;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.location.widget.ZaloMapView;
import com.zing.zalo.p077ui.picker.location.MapInAppView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p348mi.AbstractC23309i;
import vg.C28157p5;

/* loaded from: classes6.dex */
public class MapInAppView extends MapZaloView implements InterfaceC0733x {

    /* renamed from: R0 */
    RobotoTextView f66485R0;

    /* renamed from: S0 */
    LatLng f66486S0;

    /* renamed from: T0 */
    boolean f66487T0 = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m72057mM(View view) {
        try {
            if (this.f66486S0 != null) {
                Context m92648SI = this.f72421L0.m92648SI();
                LatLng latLng = this.f66486S0;
                AbstractC23152n3.m119042f0(m92648SI, "", latLng.f33639q, latLng.f33638p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = 0;
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_map_inap_view, viewGroup, false);
        this.f66487T0 = AbstractC23309i.m121516V2();
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_get_direction);
        this.f66485R0 = robotoTextView;
        if (!this.f66487T0 || !AbstractC8955a.m47863a()) {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        this.f66485R0.setOnClickListener(new View.OnClickListener() { // from class: k90.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapInAppView.this.m72057mM(view);
            }
        });
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        RobotoTextView robotoTextView;
        super.mo37125ZJ(view, bundle);
        if (this.f66488M0 != null && (robotoTextView = this.f66485R0) != null && this.f66487T0) {
            this.f66488M0.m48049P(0, 0, 0, robotoTextView.getMeasuredHeight() + AbstractC23136l9.m118742r(2.0f), false);
        }
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: eM */
    void mo71930eM(ZaloMapView zaloMapView) {
        try {
            if (m92656bJ() != null && zaloMapView != null) {
                FrameLayout frameLayout = (FrameLayout) m92656bJ().findViewById(AbstractC6918a0.fl_map_container);
                RobotoTextView robotoTextView = (RobotoTextView) m92656bJ().findViewById(AbstractC6918a0.tv_map_invalid);
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(8);
                }
                frameLayout.addView(zaloMapView, 0, new FrameLayout.LayoutParams(-1, -1));
                zaloMapView.setMyLocationButton(m72058dM(frameLayout));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: gM */
    ZaloMapView mo71931gM(Context context) {
        LatLng latLng;
        Location location;
        Bundle m92642L3 = m92642L3();
        GoogleMapOptions googleMapOptions = null;
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_INIT_LONGTITUDE") && m92642L3.containsKey("EXTRA_INIT_LATITUDE")) {
            latLng = new LatLng(m92642L3.getDouble("EXTRA_INIT_LATITUDE"), m92642L3.getDouble("EXTRA_INIT_LONGTITUDE"));
        } else {
            latLng = null;
        }
        if (latLng == null) {
            try {
                if (AbstractC23034c6.m118167n(context, AbstractC23034c6.f112034k) == 0) {
                    LocationManager locationManager = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                    location = locationManager.getLastKnownLocation("gps");
                    if (location == null) {
                        location = locationManager.getLastKnownLocation("network");
                    }
                    if (location == null) {
                        location = C28157p5.m141667d().m141673c();
                    }
                } else {
                    location = null;
                }
                if (location != null) {
                    latLng = new LatLng(location.getLatitude(), location.getLongitude());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.f66486S0 = latLng;
        if (latLng != null) {
            googleMapOptions = new GoogleMapOptions();
            googleMapOptions.m30640J(CameraPosition.m30684t().m30689e(15.0f).m30687c(latLng).m30686b());
        }
        if (googleMapOptions != null) {
            this.f66488M0 = new ZaloMapView(context, googleMapOptions);
        } else {
            this.f66488M0 = new ZaloMapView(context);
        }
        if (latLng != null) {
            this.f66488M0.setPresetLatLng(latLng);
            this.f66488M0.setShowPresetLocationMarker(true);
        }
        this.f66488M0.setDefaultZoomLevel(15.0f);
        this.f66488M0.setTrackMyLocation(false);
        this.f66488M0.setShowMyLocationMarker(false);
        this.f66488M0.setUseCustomMyLocationMarker(true);
        return this.f66488M0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MapInAppView";
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: hM */
    void mo71932hM() {
        double d11;
        boolean z11;
        double d12;
        if (m92656bJ() == null) {
            return;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_INIT_LONGTITUDE") && m92642L3.containsKey("EXTRA_INIT_LATITUDE")) {
            d11 = m92642L3.getDouble("EXTRA_INIT_LONGTITUDE");
            d12 = m92642L3.getDouble("EXTRA_INIT_LATITUDE");
            z11 = true;
        } else {
            d11 = -1.0d;
            z11 = false;
            d12 = -1.0d;
        }
        if (!z11) {
            Context m92689tK = m92689tK();
            String[] strArr = AbstractC23034c6.f112034k;
            if (AbstractC23034c6.m118167n(m92689tK, strArr) == 0) {
                LocationManager locationManager = (LocationManager) m92689tK().getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                if (lastKnownLocation == null) {
                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                }
                if (lastKnownLocation == null) {
                    lastKnownLocation = C28157p5.m141667d().m141673c();
                }
                if (lastKnownLocation != null) {
                    d12 = lastKnownLocation.getLatitude();
                    d11 = lastKnownLocation.getLongitude();
                }
            } else {
                AbstractC23034c6.m118186w0(this.f72421L0.m92676n2(), strArr, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
                return;
            }
        }
        double d13 = d12;
        double d14 = d11;
        if (((FrameLayout) m92656bJ().findViewById(AbstractC6918a0.google_map_in_app_webview_container)) != null) {
            RobotoTextView robotoTextView = (RobotoTextView) m92656bJ().findViewById(AbstractC6918a0.tv_map_invalid);
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
            m72062kM(AbstractC6918a0.google_map_in_app_webview_container, d13, d14);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 120 || i11 == 110) {
            m72059fM();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }
}
