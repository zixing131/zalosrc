package com.zing.zalo.p077ui.picker.location;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.ZaloMapView;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.picker.location.ShareLocationWithMapView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import np.InterfaceC23923b;
import p006a0.C0015d;
import p361nb.C23648e;
import p363nh.C23744a;
import p509sp.C26361j;
import vg.C28157p5;

/* loaded from: classes6.dex */
public class ShareLocationWithMapView extends MapZaloView implements C23744a.c, InterfaceC0733x, InterfaceC23923b {

    /* renamed from: R0 */
    ZaloMapView f66493R0;

    /* renamed from: S0 */
    BottomLocationPickerView f66494S0;

    /* renamed from: T0 */
    LocationPickerView.InterfaceC12771b f66495T0;

    /* renamed from: U0 */
    String f66496U0;

    /* renamed from: V0 */
    int f66497V0 = 1;

    /* renamed from: W0 */
    int f66498W0 = 0;

    /* renamed from: X0 */
    ActionLogChatLocation.FooterLogData f66499X0 = null;

    /* renamed from: Y0 */
    Handler f66500Y0 = new Handler(Looper.getMainLooper());

    /* renamed from: Z0 */
    String f66501Z0 = "";

    /* renamed from: a1 */
    String f66502a1 = "0";

    /* loaded from: classes6.dex */
    public static class BottomLocationPickerView extends BottomSheetZaloView {

        /* renamed from: P0 */
        View f66503P0;

        /* renamed from: Q0 */
        ZaloMapView f66504Q0;

        /* renamed from: R0 */
        ZaloWebView f66505R0;

        /* renamed from: S0 */
        LocationPickerView f66506S0;

        /* renamed from: T0 */
        LocationPickerView.InterfaceC12771b f66507T0;

        /* renamed from: U0 */
        String f66508U0;

        /* renamed from: V0 */
        int f66509V0 = 1;

        /* renamed from: W0 */
        int f66510W0 = 0;

        /* renamed from: X0 */
        ActionLogChatLocation.FooterLogData f66511X0 = null;

        /* renamed from: Y0 */
        boolean f66512Y0 = false;

        /* renamed from: Z0 */
        private SensitiveData f66513Z0 = null;

        @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
        /* renamed from: CJ */
        public void mo37111CJ(Bundle bundle) {
            super.mo37111CJ(bundle);
            Bundle m92642L3 = m92642L3();
            boolean z11 = false;
            if (m92642L3 != null) {
                this.f66508U0 = m92642L3.getString("extra_conversation_id");
                this.f66509V0 = m92642L3.getInt("EXTRA_MODE_LIVE_LOCATION", 1);
                this.f66510W0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
                this.f66511X0 = (ActionLogChatLocation.FooterLogData) m92642L3.getParcelable("EXTRA_FOOTER_LOG_DATA");
                this.f66513Z0 = (SensitiveData) m92642L3.getParcelable("EXTRA_SENSITIVE_DATA");
            }
            if (this.f66509V0 == 1 && C8967m.m47871T(this.f66508U0)) {
                z11 = true;
            }
            this.f66512Y0 = z11;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: P2 */
        public View mo37117P2() {
            return this.f66503P0;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: T2 */
        public void mo42955T2(float f11) {
            boolean z11;
            super.mo42955T2(f11);
            BottomSheetLayout bottomSheetLayout = this.f72454M0;
            if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
                z11 = true;
            } else {
                z11 = false;
            }
            bottomSheetLayout.setEnableScrollY(z11);
            LocationPickerView locationPickerView = this.f66506S0;
            if (locationPickerView != null) {
                locationPickerView.m72039MN();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
        /* renamed from: ZJ */
        public void mo37125ZJ(View view, Bundle bundle) {
            super.mo37125ZJ(view, bundle);
            m72069iM();
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: e2 */
        public void mo72068e2(boolean z11, float f11) {
            ListView listView;
            LocationPickerView locationPickerView;
            super.mo72068e2(z11, f11);
            LocationPickerView locationPickerView2 = this.f66506S0;
            if (locationPickerView2 != null) {
                listView = locationPickerView2.m72041eN();
            } else {
                listView = null;
            }
            if (listView != null && z11) {
                listView.smoothScrollBy(0, 0);
                listView.setSelection(0);
            }
            ZaloMapView zaloMapView = this.f66504Q0;
            if (zaloMapView != null) {
                zaloMapView.m48049P(0, 0, 0, mo37127dM() - ((int) f11), true);
            }
            ZaloWebView zaloWebView = this.f66505R0;
            if (zaloWebView != null && zaloWebView.m92656bJ() != null && (locationPickerView = this.f66506S0) != null && locationPickerView.m72041eN() != null) {
                this.f66505R0.m92656bJ().setPadding(0, 0, 0, ((int) this.f66506S0.m72041eN().getTranslationY()) - AbstractC23136l9.m118742r(30.0f));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: eM */
        public int mo37128eM() {
            int i11;
            int height = this.f66503P0.getHeight();
            LocationPickerView locationPickerView = this.f66506S0;
            if (locationPickerView != null) {
                i11 = locationPickerView.m72042fN();
            } else {
                i11 = 0;
            }
            return height - i11;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: fM */
        protected void mo37129fM(LinearLayout linearLayout) {
            LayoutInflater.from(getContext()).inflate(AbstractC7409c0.share_location_with_map_bottom_location_picker, (ViewGroup) linearLayout, true);
            View findViewById = linearLayout.findViewById(AbstractC6918a0.fl_location_picker_container);
            this.f66503P0 = findViewById;
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = (int) ((AbstractC23136l9.m118716i0(getContext()) * 2.0f) / 3.0f);
            this.f66503P0.setLayoutParams(layoutParams);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: gM */
        public void mo37132gM() {
            this.f72454M0.setMaxTranslationY(mo37128eM());
            this.f72454M0.setMinimized(true);
            this.f72454M0.setEnableScrollY(false);
            ZaloMapView zaloMapView = this.f66504Q0;
            if (zaloMapView != null) {
                zaloMapView.m48049P(0, 0, 0, mo37127dM() - ((int) this.f72454M0.getTranslationY()), false);
            }
            ZaloWebView zaloWebView = this.f66505R0;
            if (zaloWebView != null && zaloWebView.m92656bJ() != null && this.f66506S0.m72041eN() != null) {
                this.f66505R0.m92656bJ().setPadding(0, 0, 0, ((int) this.f66506S0.m72041eN().getTranslationY()) - AbstractC23136l9.m118742r(30.0f));
            }
            this.f72454M0.setSnapSCroll(false);
        }

        @Override // ac.InterfaceC0733x
        public String getTrackingKey() {
            return "";
        }

        /* renamed from: iM */
        void m72069iM() {
            boolean z11;
            try {
                ZaloView m92996E0 = m92649TI().m92996E0("LocationPickerView");
                if (m92996E0 instanceof LocationPickerView) {
                    this.f66506S0 = (LocationPickerView) m92996E0;
                }
                LocationPickerView locationPickerView = this.f66506S0;
                if (locationPickerView == null) {
                    this.f66506S0 = new LocationPickerView();
                    Bundle bundle = new Bundle();
                    if (this.f66509V0 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bundle.putBoolean("extra_from_update_status", z11);
                    bundle.putString("EXTRA_STR_CHAT_CONVERSATION_ID", this.f66508U0);
                    bundle.putInt("INT_EXTRA_TRACKING_SOURCE", this.f66510W0);
                    bundle.putParcelable("EXTRA_FOOTER_LOG_DATA", this.f66511X0);
                    if (this.f66512Y0) {
                        bundle.putBoolean("EXTRA_BOOL_HAS_LIVE_LOCATION_HEADER", true);
                    }
                    bundle.putBoolean("EXTRA_BOOL_HAS_NEARBY_PLACES_TITLE", true);
                    bundle.putBoolean("EXTRA_BOOL_HAS_NESTED_SCROLL_BEHAVIOR", true);
                    bundle.putBoolean("EXTRA_BOOL_CONFIG_UI_FOR_BOTTOM_SHEET_PICKER", true);
                    bundle.putParcelable("EXTRA_SENSITIVE_DATA", this.f66513Z0);
                    this.f66506S0.mo60305zK(bundle);
                    m92649TI().m93058d2(AbstractC6918a0.fl_location_picker_container, this.f66506S0, 0, "LocationPickerView", 0, false);
                    this.f66506S0.m72044zN(this.f66507T0);
                    return;
                }
                locationPickerView.m72044zN(this.f66507T0);
                this.f66506S0.m72040TM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: jM */
        public void m72070jM(LocationPickerView.InterfaceC12771b interfaceC12771b) {
            this.f66507T0 = interfaceC12771b;
            LocationPickerView locationPickerView = this.f66506S0;
            if (locationPickerView != null) {
                locationPickerView.m72044zN(interfaceC12771b);
            }
        }

        /* renamed from: kM */
        public void m72071kM(String str) {
            LocationPickerView locationPickerView = this.f66506S0;
            if (locationPickerView != null) {
                locationPickerView.m72037AN(str);
            }
        }

        /* renamed from: lM */
        public void m72072lM() {
            LocationPickerView locationPickerView = this.f66506S0;
            if (locationPickerView != null) {
                locationPickerView.m72038BN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.location.ShareLocationWithMapView$a */
    /* loaded from: classes6.dex */
    class C12778a extends ZdsActionBar.AbstractC16987c {
        C12778a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            ShareLocationWithMapView shareLocationWithMapView = ShareLocationWithMapView.this;
            shareLocationWithMapView.f88756W = 0;
            shareLocationWithMapView.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m72064mM(int i11, Object[] objArr) {
        String str;
        try {
            if (i11 != 52) {
                if (i11 == 83 && objArr != null && objArr.length >= 2) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    C8969o c8969o = (C8969o) objArr[1];
                    if (intValue == 1 && c8969o != null && TextUtils.equals(c8969o.f47981b, this.f66496U0)) {
                        m72067pM();
                        finish();
                        C8967m.m47888f0(m92676n2(), null, c8969o.f47981b, c8969o.f47980a, c8969o.f47984e, c8969o.f47985f, this.f66498W0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (objArr.length > 0) {
                str = (String) objArr[0];
            } else {
                str = "";
            }
            if (TextUtils.equals(this.f66496U0, str)) {
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f88756W = 0;
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.share_location_with_map_view, viewGroup, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 52);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setLeadingFunctionCallback(new C12778a());
        }
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 83);
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 83);
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f66496U0 = m92642L3.getString("extra_conversation_id");
            this.f66497V0 = m92642L3.getInt("EXTRA_MODE_LIVE_LOCATION", 1);
            this.f66498W0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
            this.f66499X0 = (ActionLogChatLocation.FooterLogData) m92642L3.getParcelable("EXTRA_FOOTER_LOG_DATA");
            this.f66501Z0 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            this.f66502a1 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
        }
        ZaloView m92993D0 = m92649TI().m92993D0(BottomLocationPickerView.class);
        if (m92993D0 != null) {
            m92993D0.finish();
        }
        this.f66494S0 = new BottomLocationPickerView();
        Bundle bundle2 = new Bundle();
        bundle2.putString("extra_conversation_id", this.f66496U0);
        bundle2.putInt("EXTRA_MODE_LIVE_LOCATION", this.f66497V0);
        bundle2.putInt("INT_EXTRA_TRACKING_SOURCE", this.f66498W0);
        bundle2.putParcelable("EXTRA_FOOTER_LOG_DATA", this.f66499X0);
        bundle2.putParcelable("EXTRA_SENSITIVE_DATA", this.f66492Q0);
        this.f66494S0.mo60305zK(bundle2);
        m92649TI().m93058d2(AbstractC6918a0.fl_bottom_container, this.f66494S0, 0, "BottomLocationPickerView", 0, false);
        this.f66494S0.m72070jM(this.f66495T0);
        if (this.f66494S0 != null) {
            if (AbstractC8955a.m47863a()) {
                this.f66494S0.f66504Q0 = this.f66493R0;
            } else {
                this.f66494S0.f66505R0 = this.f66489N0;
            }
        }
        C0815e1.m2075D().m2100V(new C23648e(11, this.f66501Z0, 1, "chat_send_location", this.f66502a1), false);
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this.f72421L0);
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: eM */
    void mo71930eM(ZaloMapView zaloMapView) {
        if (m92656bJ() != null && zaloMapView != null) {
            FrameLayout frameLayout = (FrameLayout) m92656bJ().findViewById(AbstractC6918a0.fl_map_container);
            RobotoTextView robotoTextView = (RobotoTextView) m92656bJ().findViewById(AbstractC6918a0.tv_map_invalid);
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
            frameLayout.addView(zaloMapView, 0, new FrameLayout.LayoutParams(-1, -1));
            zaloMapView.setMyLocationButton(m72058dM(frameLayout));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: gM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    ZaloMapView mo71931gM(Context context) {
        LatLng latLng;
        Location location;
        Bundle m92642L3 = m92642L3();
        GoogleMapOptions googleMapOptions = null;
        try {
            String[] strArr = AbstractC23034c6.f112034k;
            if (AbstractC23034c6.m118167n(context, strArr) == 0) {
                C0015d c0015d = new C0015d((LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION), this.f66492Q0);
                location = c0015d.m23b("gps");
                if (location == null) {
                    location = c0015d.m23b("network");
                }
                if (location == null) {
                    location = C28157p5.m141667d().m141673c();
                }
            } else {
                AbstractC23034c6.m118186w0(this.f72421L0.m92676n2(), strArr, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
                location = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (location != null) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            if (m92642L3 != null) {
                m92642L3.putDouble("EXTRA_PRESET_LATITUDE", latitude);
                m92642L3.putDouble("EXTRA_PRESET_LONGITUDE", longitude);
            }
            latLng = new LatLng(latitude, longitude);
            if (latLng != null) {
                googleMapOptions = new GoogleMapOptions();
                googleMapOptions.m30640J(CameraPosition.m30684t().m30689e(15.0f).m30687c(latLng).m30686b());
            }
            if (googleMapOptions == null) {
                this.f66493R0 = new ZaloMapView(context, googleMapOptions);
            } else {
                this.f66493R0 = new ZaloMapView(context);
            }
            if (latLng != null) {
                this.f66493R0.setPresetLatLng(latLng);
            }
            this.f66493R0.setDefaultZoomLevel(15.0f);
            this.f66493R0.setTrackMyLocation(true);
            this.f66493R0.setUseCustomMyLocationMarker(true);
            this.f66493R0.setSensitiveData(this.f66492Q0);
            return this.f66493R0;
        }
        latLng = null;
        if (latLng != null) {
        }
        if (googleMapOptions == null) {
        }
        if (latLng != null) {
        }
        this.f66493R0.setDefaultZoomLevel(15.0f);
        this.f66493R0.setTrackMyLocation(true);
        this.f66493R0.setUseCustomMyLocationMarker(true);
        this.f66493R0.setSensitiveData(this.f66492Q0);
        return this.f66493R0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ShareLocationWithMapView";
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: hM */
    void mo71932hM() {
        double d11;
        double d12;
        if (m92656bJ() == null) {
            return;
        }
        try {
            Context m92689tK = m92689tK();
            String[] strArr = AbstractC23034c6.f112034k;
            if (AbstractC23034c6.m118167n(m92689tK, strArr) == 0) {
                C0015d c0015d = new C0015d((LocationManager) m92689tK().getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION), this.f66492Q0);
                Location m23b = c0015d.m23b("gps");
                if (m23b == null) {
                    m23b = c0015d.m23b("network");
                }
                if (m23b == null) {
                    m23b = C28157p5.m141667d().m141673c();
                }
                if (m23b != null) {
                    d11 = m23b.getLatitude();
                    d12 = m23b.getLongitude();
                } else {
                    d11 = -1.0d;
                    d12 = -1.0d;
                }
                if (((FrameLayout) m92656bJ().findViewById(AbstractC6918a0.google_map_in_app_webview_container)) != null) {
                    RobotoTextView robotoTextView = (RobotoTextView) m92656bJ().findViewById(AbstractC6918a0.tv_map_invalid);
                    if (robotoTextView != null) {
                        robotoTextView.setVisibility(8);
                    }
                    m72062kM(AbstractC6918a0.google_map_in_app_webview_container, d11, d12);
                    return;
                }
                return;
            }
            AbstractC23034c6.m118186w0(this.f72421L0.m92676n2(), strArr, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    public void m72065nM(LocationPickerView.InterfaceC12771b interfaceC12771b) {
        this.f66495T0 = interfaceC12771b;
        BottomLocationPickerView bottomLocationPickerView = this.f66494S0;
        if (bottomLocationPickerView != null) {
            bottomLocationPickerView.m72070jM(interfaceC12771b);
        }
    }

    /* renamed from: oM */
    public void m72066oM(String str) {
        BottomLocationPickerView bottomLocationPickerView = this.f66494S0;
        if (bottomLocationPickerView != null) {
            bottomLocationPickerView.m72071kM(str);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 120 || i11 == 110) {
            m72059fM();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* renamed from: pM */
    public void m72067pM() {
        BottomLocationPickerView bottomLocationPickerView = this.f66494S0;
        if (bottomLocationPickerView != null) {
            bottomLocationPickerView.m72072lM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, final Object... objArr) {
        this.f66500Y0.post(new Runnable() { // from class: k90.x
            @Override // java.lang.Runnable
            public final void run() {
                ShareLocationWithMapView.this.m72064mM(i11, objArr);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 52);
    }
}
