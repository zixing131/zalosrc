package com.zing.zalo.p077ui.picker.location;

import ac.InterfaceC0733x;
import am.C0943w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.location.AbstractC8971q;
import com.zing.zalo.location.C8956b;
import com.zing.zalo.location.C8957c;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.C8984c;
import com.zing.zalo.location.widget.LiveLocationBar;
import com.zing.zalo.location.widget.LiveLocationMapView;
import com.zing.zalo.location.widget.ZaloMapView;
import com.zing.zalo.p077ui.picker.location.LiveLocationDetailsView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloView;
import com.zing.zalo.p077ui.zviews.InviteToShareLiveLocationView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17996r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.C23046d7;
import mm0.AbstractC23350e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C31973j5;
import vg.C28157p5;
import zc0.C31784b;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes6.dex */
public class LiveLocationDetailsView extends MapZaloView implements ZaloView.InterfaceC17417b, C23744a.c, C8967m.f, InterfaceC0733x {

    /* renamed from: f1 */
    static final int f66383f1 = AbstractC23136l9.m118742r(62.0f);

    /* renamed from: g1 */
    static final int f66384g1 = AbstractC23136l9.m118742r(32.0f);

    /* renamed from: h1 */
    static final int f66385h1 = (int) ((AbstractC23136l9.m118713h0() * 2.0f) / 3.0f);

    /* renamed from: R0 */
    LiveLocationMapView f66386R0;

    /* renamed from: S0 */
    DetailsView f66387S0;

    /* renamed from: T0 */
    String f66388T0;

    /* renamed from: U0 */
    long f66389U0;

    /* renamed from: V0 */
    long f66390V0;

    /* renamed from: Y0 */
    MessageId f66393Y0;

    /* renamed from: Z0 */
    C17945a0 f66394Z0;

    /* renamed from: W0 */
    int f66391W0 = 0;

    /* renamed from: X0 */
    ActionLogChatLocation.FooterLogData f66392X0 = null;

    /* renamed from: a1 */
    Handler f66395a1 = new Handler(Looper.getMainLooper());

    /* renamed from: b1 */
    List f66396b1 = new ArrayList();

    /* renamed from: c1 */
    Map f66397c1 = new HashMap();

    /* renamed from: d1 */
    boolean f66398d1 = true;

    /* renamed from: e1 */
    boolean f66399e1 = true;

    /* loaded from: classes6.dex */
    public static class DetailsView extends BottomSheetZaloView implements Handler.Callback, InterfaceC17463d.d, View.OnClickListener {

        /* renamed from: P0 */
        View f66400P0;

        /* renamed from: Q0 */
        RecyclerView f66401Q0;

        /* renamed from: R0 */
        C8984c f66402R0;

        /* renamed from: S0 */
        RobotoTextView f66403S0;

        /* renamed from: T0 */
        LiveLocationBar f66404T0;

        /* renamed from: U0 */
        RobotoTextView f66405U0;

        /* renamed from: V0 */
        LiveLocationMapView f66406V0;

        /* renamed from: X0 */
        MultiStateView f66408X0;

        /* renamed from: Y0 */
        LiveLocationDetailsView f66409Y0;

        /* renamed from: Z0 */
        String f66410Z0;

        /* renamed from: W0 */
        ZaloWebView f66407W0 = null;

        /* renamed from: a1 */
        int f66411a1 = 0;

        /* renamed from: b1 */
        ActionLogChatLocation.FooterLogData f66412b1 = null;

        /* renamed from: c1 */
        Handler f66413c1 = new Handler(Looper.getMainLooper(), this);

        /* renamed from: com.zing.zalo.ui.picker.location.LiveLocationDetailsView$DetailsView$a */
        /* loaded from: classes6.dex */
        class C12769a implements LiveLocationBar.InterfaceC8979b {
            C12769a() {
            }

            @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
            /* renamed from: a */
            public void mo48007a() {
            }

            @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
            /* renamed from: b */
            public void mo48008b() {
                C8967m.m47867E().m47942v(DetailsView.this.f66410Z0);
            }

            @Override // com.zing.zalo.location.widget.LiveLocationBar.InterfaceC8979b
            /* renamed from: c */
            public void mo48009c() {
                DetailsView.this.m71948BM();
            }
        }

        /* renamed from: rM */
        public /* synthetic */ void m71942rM(int i11, C8969o c8969o) {
            this.f66401Q0.m9837K1(i11);
            this.f66402R0.m48076Z(c8969o.f47980a);
        }

        /* renamed from: sM */
        public /* synthetic */ void m71943sM(RecyclerView recyclerView, int i11, View view) {
            LiveLocationDetailsView liveLocationDetailsView;
            try {
                C8984c.f m48069P = this.f66402R0.m48069P(i11);
                int i12 = m48069P.f48107a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC23647d.m123897g("917825");
                        if (((C8984c.c) m48069P).f48097c && (liveLocationDetailsView = this.f66409Y0) != null) {
                            liveLocationDetailsView.m71934uM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C8969o c8969o = ((C8984c.d) m48069P).f48098b;
                if (c8969o != null) {
                    if (AbstractC8955a.m47863a()) {
                        this.f66406V0.m48023a0(c8969o, true, true);
                        return;
                    }
                    if (this.f66409Y0 != null) {
                        if (TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i) && !C8967m.m47872U(c8969o)) {
                            if (AbstractC23034c6.m118167n(m92689tK(), AbstractC23034c6.f112034k) == 0) {
                                LocationManager locationManager = (LocationManager) m92689tK().getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                                Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                                if (lastKnownLocation == null) {
                                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                                }
                                if (lastKnownLocation == null) {
                                    lastKnownLocation = C28157p5.m141667d().m141673c();
                                }
                                if (lastKnownLocation != null) {
                                    this.f66409Y0.m72062kM(AbstractC6918a0.google_map_in_app_webview_container, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.f66409Y0.m72062kM(AbstractC6918a0.google_map_in_app_webview_container, c8969o.f47984e, c8969o.f47985f);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: tM */
        public /* synthetic */ void m71944tM() {
            try {
                LiveLocationDetailsView liveLocationDetailsView = this.f66409Y0;
                if (liveLocationDetailsView != null) {
                    liveLocationDetailsView.m71933tM(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: uM */
        public /* synthetic */ void m71945uM(int i11) {
            if (i11 == -3) {
                if (m92672lJ() && !mo60294yp()) {
                    showDialog(1);
                    return;
                }
                return;
            }
            if (i11 == -4) {
                if (m92672lJ() && !mo60294yp()) {
                    showDialog(2);
                    return;
                }
                return;
            }
            if (i11 == -7) {
                if (m92672lJ() && !mo60294yp()) {
                    showDialog(4);
                    return;
                }
                return;
            }
            if (i11 == 0) {
                ActionLogChatLocation actionLogChatLocation = ActionLogChatLocation.f55164a;
                actionLogChatLocation.m56651e(actionLogChatLocation.m56652h(this.f66410Z0), this.f66411a1, true, this.f66412b1);
            }
        }

        /* renamed from: vM */
        public /* synthetic */ void m71946vM(Location location) {
            C8984c c8984c = this.f66402R0;
            if (c8984c != null) {
                c8984c.m48077a0(location);
            }
        }

        /* renamed from: AM */
        protected void m71947AM(LiveLocationMapView liveLocationMapView) {
            this.f66406V0 = liveLocationMapView;
            if (liveLocationMapView != null) {
                liveLocationMapView.setMyLocationTracker(new ZaloMapView.InterfaceC8981a() { // from class: k90.e
                    public /* synthetic */ C21610e() {
                    }

                    @Override // com.zing.zalo.location.widget.ZaloMapView.InterfaceC8981a
                    /* renamed from: a */
                    public final void mo48061a(Location location) {
                        LiveLocationDetailsView.DetailsView.this.m71946vM(location);
                    }
                });
            }
        }

        /* renamed from: BM */
        void m71948BM() {
            showDialog(3);
        }

        @Override // com.zing.zalo.zview.ZaloView
        /* renamed from: DJ */
        public KeyEventCallbackC17462c mo39014DJ(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return C23046d7.m118240c(m92689tK());
                    }
                    return AbstractC8971q.m47970b(this, this.f66410Z0, new C8967m.h() { // from class: k90.g
                        public /* synthetic */ C21612g() {
                        }

                        @Override // com.zing.zalo.location.C8967m.h
                        /* renamed from: a */
                        public final void mo47962a(int i12) {
                            LiveLocationDetailsView.DetailsView.this.m71945uM(i12);
                        }
                    });
                }
                try {
                    if (!AbstractC23309i.m121488Ub()) {
                        return null;
                    }
                    return AbstractC23093i.m118457j(m92648SI(), this);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43171t(AbstractC8020f0.location_open_gps_dialog_title).m43159h(4);
                aVar.m43161j(AbstractC8020f0.GPS_Enable_Message);
                aVar.m43165n(m92652XI(AbstractC8020f0.str_no), this);
                aVar.m43169r(AbstractC8020f0.str_yes, this);
                return aVar.m43152a();
            } catch (Exception e12) {
                e12.printStackTrace();
                return null;
            }
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            try {
                int mo92862f = interfaceC17463d.mo92862f();
                if (mo92862f != 1) {
                    if (mo92862f != 2) {
                        if (mo92862f == 4) {
                            interfaceC17463d.dismiss();
                        }
                    } else {
                        interfaceC17463d.dismiss();
                        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    }
                } else if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    AbstractC23647d.m123906p("917801");
                    AbstractC23647d.m123893c();
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    AbstractC23647d.m123906p("917800");
                    AbstractC23647d.m123893c();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: Lh */
        public void mo46528Lh(boolean z11) {
            boolean z12;
            super.mo46528Lh(z11);
            BottomSheetLayout bottomSheetLayout = this.f72454M0;
            if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
                z12 = true;
            } else {
                z12 = false;
            }
            bottomSheetLayout.setEnableScrollY(z12);
            LiveLocationMapView liveLocationMapView = this.f66406V0;
            if (liveLocationMapView != null) {
                liveLocationMapView.m48049P(0, 0, 0, mo37127dM() - ((int) this.f72454M0.getTranslationY()), true);
            }
            ZaloWebView zaloWebView = this.f66407W0;
            if (zaloWebView != null && zaloWebView.m92656bJ() != null) {
                this.f66407W0.m92656bJ().setPadding(0, 0, 0, mo37127dM() - this.f66400P0.getHeight());
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: P2 */
        public View mo37117P2() {
            return this.f66401Q0;
        }

        @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
        /* renamed from: UJ */
        public void mo37584UJ() {
            super.mo37584UJ();
            m71950nM();
        }

        @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
        /* renamed from: VJ */
        public void mo37712VJ() {
            super.mo37712VJ();
            this.f66413c1.removeMessages(1);
        }

        /* renamed from: W2 */
        void m71949W2() {
            try {
                this.f66401Q0.setVisibility(8);
                this.f66408X0.setVisibility(0);
                this.f66408X0.setState(MultiStateView.EnumC15914e.LOADING);
                this.f66408X0.setLoadingString(m92652XI(AbstractC8020f0.str_live_location_list_loading));
                this.f66408X0.setVisibilityLoadingText(0);
                RobotoTextView robotoTextView = this.f66405U0;
                if (robotoTextView != null) {
                    robotoTextView.setText(m92652XI(AbstractC8020f0.str_live_location_list_loading));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: X0 */
        public boolean mo37120X0(float f11, boolean z11, float f12) {
            boolean z12;
            super.mo37120X0(f11, z11, f12);
            BottomSheetLayout bottomSheetLayout = this.f72454M0;
            if (f11 == bottomSheetLayout.f68983q) {
                z12 = true;
            } else {
                z12 = false;
            }
            bottomSheetLayout.setEnableScrollY(z12);
            LiveLocationMapView liveLocationMapView = this.f66406V0;
            if (liveLocationMapView != null) {
                liveLocationMapView.m48049P(0, 0, 0, mo37127dM() - ((int) f11), true);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: eM */
        public int mo37128eM() {
            return this.f66400P0.getHeight() - AbstractC23136l9.m118742r(90.0f);
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: fM */
        protected void mo37129fM(LinearLayout linearLayout) {
            int i11;
            LayoutInflater.from(getContext()).inflate(AbstractC7409c0.live_location_details_bottom_view, (ViewGroup) linearLayout, true);
            View findViewById = linearLayout.findViewById(AbstractC6918a0.fl_live_location_content);
            this.f66400P0 = findViewById;
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = -1;
            int i12 = LiveLocationDetailsView.f66385h1 - LiveLocationDetailsView.f66383f1;
            int i13 = LiveLocationDetailsView.f66384g1;
            layoutParams.height = i12 - i13;
            this.f66400P0.setLayoutParams(layoutParams);
            this.f66403S0 = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_note_people_invite_sharing);
            LiveLocationBar liveLocationBar = (LiveLocationBar) linearLayout.findViewById(AbstractC6918a0.live_location_bar);
            this.f66404T0 = liveLocationBar;
            liveLocationBar.setMode(4);
            this.f66404T0.setBackgroundResource(AbstractC16803z.rectangle_transparent);
            this.f66404T0.setListener(new C12769a());
            LiveLocationBar liveLocationBar2 = this.f66404T0;
            int i14 = 8;
            if (C8967m.f47923r) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            liveLocationBar2.setVisibility(i11);
            View findViewById2 = linearLayout.findViewById(AbstractC6918a0.id_btm_seperator_line_location_bar);
            if (C8967m.f47923r) {
                i14 = 0;
            }
            findViewById2.setVisibility(i14);
            RobotoTextView robotoTextView = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_live_location_list_status);
            this.f66405U0 = robotoTextView;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) robotoTextView.getLayoutParams();
            layoutParams2.height = i13;
            this.f66405U0.setLayoutParams(layoutParams2);
            RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(AbstractC6918a0.lv_live_location_entries);
            this.f66401Q0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            MultiStateView multiStateView = (MultiStateView) linearLayout.findViewById(AbstractC6918a0.multi_state);
            this.f66408X0 = multiStateView;
            multiStateView.setEnableLoadingText(true);
            this.f66408X0.setEnableImageErrorView(false);
            this.f66408X0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: k90.f
                public /* synthetic */ C21611f() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    LiveLocationDetailsView.DetailsView.this.m71944tM();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: gM */
        public void mo37132gM() {
            int mo37127dM;
            super.mo37132gM();
            LiveLocationMapView liveLocationMapView = this.f66406V0;
            if (liveLocationMapView != null) {
                if (this.f72454M0.m75553g()) {
                    mo37127dM = mo37127dM() - mo37128eM();
                } else {
                    mo37127dM = mo37127dM();
                }
                liveLocationMapView.m48049P(0, 0, 0, mo37127dM, false);
            }
            ZaloWebView zaloWebView = this.f66407W0;
            if (zaloWebView != null && zaloWebView.m92656bJ() != null) {
                this.f66407W0.m92656bJ().setPadding(0, 0, 0, mo37127dM() - this.f66400P0.getHeight());
            }
            this.f72454M0.setEnableScrollY(false);
            this.f72454M0.setSnapSCroll(false);
        }

        @Override // ac.InterfaceC0733x
        public String getTrackingKey() {
            return "";
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C8984c c8984c;
            if (message.what == 1 && m92672lJ() && (c8984c = this.f66402R0) != null && c8984c.mo10003k() > 0) {
                this.f66402R0.m10008p();
                this.f66413c1.sendEmptyMessageDelayed(1, 30000L);
                return false;
            }
            return false;
        }

        /* renamed from: nM */
        void m71950nM() {
            boolean z11;
            ArrayList arrayList;
            C8969o m47910L = C8967m.m47867E().m47910L(this.f66410Z0);
            if (this.f66404T0 != null) {
                if (m47910L != null) {
                    arrayList = new ArrayList();
                    arrayList.add(m47910L);
                } else {
                    arrayList = null;
                }
                this.f66404T0.m48002a(arrayList, this.f66410Z0);
            }
            if (m47910L != null && !m47910L.f47997r) {
                z11 = true;
            } else {
                z11 = false;
            }
            m71956yM(z11);
        }

        /* renamed from: oM */
        void m71951oM() {
            C8956b m47903F = C8967m.m47867E().m47903F(this.f66410Z0);
            if (m47903F != null && m47903F.f47900b > 0) {
                this.f66403S0.setVisibility(0);
                this.f66403S0.setText(m47903F.m47864a());
            } else {
                this.f66403S0.setVisibility(8);
            }
        }

        @Override // com.zing.zalo.zview.ZaloView
        public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
            if (i11 == 120 && getContext() != null && AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112034k) == 0) {
                m71948BM();
            }
            super.onRequestPermissionsResult(i11, strArr, iArr);
        }

        /* renamed from: pM */
        void m71952pM(boolean z11) {
            try {
                if (this.f66402R0.mo10003k() > 0) {
                    this.f66408X0.setVisibility(8);
                    this.f66401Q0.setVisibility(0);
                } else {
                    this.f66401Q0.setVisibility(8);
                    this.f66408X0.setVisibility(0);
                    if (z11) {
                        this.f66408X0.setState(MultiStateView.EnumC15914e.ERROR);
                        this.f66408X0.setErrorTitleString(m92652XI(AbstractC8020f0.str_live_location_list_empty));
                        this.f66408X0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                    } else {
                        this.f66408X0.setState(MultiStateView.EnumC15914e.EMPTY);
                        this.f66408X0.setEmptyViewString(m92652XI(AbstractC8020f0.str_live_location_list_empty));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: qM */
        void m71953qM(C8969o c8969o) {
            int m48070Q;
            try {
                C8984c c8984c = this.f66402R0;
                if (c8984c != null && c8969o != null && (m48070Q = c8984c.m48070Q(c8969o.f47980a)) >= 0) {
                    this.f72454M0.setMinimizedWithAnimation(false);
                    this.f66413c1.postDelayed(new Runnable() { // from class: k90.i

                        /* renamed from: q */
                        public final /* synthetic */ int f104973q;

                        /* renamed from: r */
                        public final /* synthetic */ C8969o f104974r;

                        public /* synthetic */ RunnableC21614i(int m48070Q2, C8969o c8969o2) {
                            r2 = m48070Q2;
                            r3 = c8969o2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveLocationDetailsView.DetailsView.this.m71942rM(r2, r3);
                        }
                    }, 200L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: wM */
        void m71954wM(List list, boolean z11) {
            m71957zM(list);
            m71952pM(z11);
        }

        @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
        /* renamed from: xJ */
        public void mo37135xJ(Bundle bundle) {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f66410Z0 = m92642L3.getString("extra_conversation_id");
                this.f66411a1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
                this.f66412b1 = (ActionLogChatLocation.FooterLogData) m92642L3.getParcelable("EXTRA_FOOTER_LOG_DATA");
            }
            m71955xM(this.f66410Z0);
            m71951oM();
            C8984c c8984c = new C8984c(1);
            this.f66402R0 = c8984c;
            LiveLocationMapView liveLocationMapView = this.f66406V0;
            if (liveLocationMapView != null) {
                c8984c.m48077a0(liveLocationMapView.getMyLocation());
            }
            this.f66402R0.m9999J(true);
            this.f66401Q0.setAdapter(this.f66402R0);
            C31784b.m152808a(this.f66401Q0).m152809b(new C31784b.d() { // from class: k90.h
                public /* synthetic */ C21613h() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    LiveLocationDetailsView.DetailsView.this.m71943sM(recyclerView, i11, view);
                }
            });
            m71949W2();
        }

        /* renamed from: xM */
        void m71955xM(String str) {
            this.f66410Z0 = str;
        }

        /* renamed from: yM */
        void m71956yM(boolean z11) {
            String m118743r0;
            if (z11) {
                byte m47964d = C8969o.m47964d(this.f66410Z0);
                int i11 = AbstractC8020f0.str_invite_share_live_location_button;
                Object[] objArr = new Object[1];
                if (m47964d == 0) {
                    m118743r0 = "";
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr[0] = m118743r0;
                String m92653YI = m92653YI(i11, objArr);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C8984c.c(m92653YI, true ^ C8967m.m47867E().m47914R(this.f66410Z0)));
                this.f66402R0.m48075Y(arrayList);
            } else {
                this.f66402R0.m48075Y(null);
            }
            this.f66402R0.m10008p();
        }

        /* renamed from: zM */
        void m71957zM(List list) {
            int i11;
            boolean z11;
            this.f66402R0.m48074X(list, true);
            this.f66402R0.m10008p();
            if (list != null) {
                Iterator it = list.iterator();
                i11 = 0;
                loop0: while (true) {
                    z11 = false;
                    while (it.hasNext()) {
                        C8969o c8969o = (C8969o) it.next();
                        if (!C8967m.m47872U(c8969o)) {
                            i11++;
                            if (i11 == 1) {
                                z11 = TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i);
                            }
                        }
                    }
                }
            } else {
                i11 = 0;
                z11 = false;
            }
            RobotoTextView robotoTextView = this.f66405U0;
            if (robotoTextView != null) {
                if (i11 == 0) {
                    robotoTextView.setText(m92652XI(AbstractC8020f0.str_live_location_sharing_noone));
                } else if (i11 == 1 && z11) {
                    robotoTextView.setText(m92652XI(AbstractC8020f0.str_live_location_sharing_only_you));
                } else {
                    robotoTextView.setText(m92653YI(AbstractC8020f0.str_live_location_sharing_count_multi, Integer.valueOf(i11)));
                }
            }
            this.f66413c1.removeMessages(1);
            if (m92672lJ() && list != null && list.size() > 0) {
                this.f66413c1.sendEmptyMessageDelayed(1, 30000L);
            }
        }
    }

    /* renamed from: pM */
    public /* synthetic */ void m71926pM(C8969o c8969o) {
        this.f66387S0.m71953qM(c8969o);
    }

    /* renamed from: qM */
    public /* synthetic */ void m71927qM(C8969o c8969o) {
        if (this.f66387S0 != null) {
            this.f66395a1.postDelayed(new Runnable() { // from class: k90.d

                /* renamed from: q */
                public final /* synthetic */ C8969o f104967q;

                public /* synthetic */ RunnableC21609d(C8969o c8969o2) {
                    r2 = c8969o2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LiveLocationDetailsView.this.m71926pM(r2);
                }
            }, 300L);
        }
    }

    /* renamed from: rM */
    public /* synthetic */ void m71928rM(int i11, Object[] objArr) {
        String str;
        boolean z11;
        LiveLocationMapView liveLocationMapView;
        try {
            if (i11 != 52) {
                if (i11 != 83) {
                    if (i11 == 84) {
                        int intValue = ((Integer) objArr[0]).intValue();
                        if (intValue == 4) {
                            DetailsView detailsView = this.f66387S0;
                            if (detailsView != null) {
                                detailsView.m71951oM();
                                return;
                            }
                            return;
                        }
                        C8969o c8969o = (C8969o) objArr[1];
                        if (c8969o != null) {
                            C8969o c8969o2 = (C8969o) this.f66397c1.get(Long.valueOf(c8969o.f47980a));
                            if (intValue == 1) {
                                if (TextUtils.equals(this.f66388T0, c8969o.f47981b) && c8969o.f47980a != 0) {
                                    C8969o c8969o3 = (C8969o) this.f66397c1.get(Long.valueOf(this.f66389U0));
                                    if (c8969o3 != null && TextUtils.equals(c8969o3.f47982c, c8969o.f47982c)) {
                                        this.f66389U0 = c8969o.f47980a;
                                        if (m92642L3() != null) {
                                            m92642L3().putLong("LONG_EXTRA_LIVE_LOCATION_ID", this.f66389U0);
                                            this.f66390V0 = this.f66389U0;
                                        }
                                        DetailsView detailsView2 = this.f66387S0;
                                        if (detailsView2 != null && detailsView2.m92642L3() != null) {
                                            this.f66387S0.m92642L3().putLong("LONG_EXTRA_LIVE_LOCATION_ID", this.f66389U0);
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    Iterator it = this.f66396b1.iterator();
                                    while (it.hasNext()) {
                                        C8969o c8969o4 = (C8969o) it.next();
                                        if (c8969o4 != null && TextUtils.equals(c8969o4.f47982c, c8969o.f47982c) && C8967m.m47872U(c8969o4)) {
                                            it.remove();
                                            this.f66397c1.remove(Long.valueOf(c8969o4.f47980a));
                                        }
                                    }
                                    this.f66396b1.add(0, c8969o);
                                    this.f66397c1.put(Long.valueOf(c8969o.f47980a), c8969o);
                                    this.f66387S0.m71954wM(this.f66396b1, false);
                                    m71936wM(false);
                                    if (z11 && (liveLocationMapView = this.f66386R0) != null) {
                                        liveLocationMapView.setFocusedLiveLocationId(this.f66389U0);
                                        this.f66386R0.m48023a0(c8969o, true, true);
                                    }
                                    DetailsView detailsView3 = this.f66387S0;
                                    if (detailsView3 != null) {
                                        detailsView3.m71951oM();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (intValue == 2) {
                                if (c8969o2 != null) {
                                    c8969o2.m47965a(c8969o);
                                }
                                this.f66387S0.m71957zM(this.f66396b1);
                                m71936wM(false);
                                return;
                            }
                            if (intValue == 3) {
                                this.f66387S0.m71957zM(this.f66396b1);
                                m71936wM(false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                DetailsView detailsView4 = this.f66387S0;
                if (detailsView4 != null) {
                    detailsView4.m71950nM();
                    return;
                }
                return;
            }
            if (objArr.length > 0) {
                str = (String) objArr[0];
            } else {
                str = "";
            }
            if (TextUtils.equals(this.f66388T0, str)) {
                this.f72421L0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    public /* synthetic */ void m71929sM(boolean z11, List list) {
        boolean z12 = false;
        if (!z11) {
            try {
                if (!this.f66399e1) {
                    this.f66387S0.m71952pM(false);
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        this.f66399e1 = false;
        this.f66396b1.clear();
        this.f66397c1.clear();
        if (list != null) {
            this.f66396b1.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8969o c8969o = (C8969o) it.next();
                this.f66397c1.put(Long.valueOf(c8969o.f47980a), c8969o);
            }
        }
        DetailsView detailsView = this.f66387S0;
        if (detailsView != null) {
            detailsView.m71954wM(list, !z11);
        }
        if (this.f66398d1 && !this.f66396b1.isEmpty()) {
            this.f66398d1 = false;
            z12 = true;
        }
        m71936wM(z12);
    }

    @Override // com.zing.zalo.location.C8967m.f
    /* renamed from: Fq */
    public void mo47952Fq(long j11, boolean z11, List list) {
        mo70710wy(new Runnable() { // from class: k90.b

            /* renamed from: q */
            public final /* synthetic */ boolean f104961q;

            /* renamed from: r */
            public final /* synthetic */ List f104962r;

            public /* synthetic */ RunnableC21607b(boolean z112, List list2) {
                r2 = z112;
                r3 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LiveLocationDetailsView.this.m71929sM(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.live_location_details_view, viewGroup, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 83);
        C23744a.m124114c().m124117e(this, 84);
        C23744a.m124114c().m124117e(this, 52);
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m71933tM(this.f66399e1);
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        try {
            super.mo37125ZJ(view, bundle);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f66388T0 = m92642L3.getString("extra_conversation_id");
                long j11 = m92642L3.getLong("LONG_EXTRA_LIVE_LOCATION_ID");
                this.f66390V0 = j11;
                this.f66389U0 = j11;
                MessageId messageId = (MessageId) m92642L3.getParcelable("EXTRA_MSG_ID");
                this.f66393Y0 = messageId;
                if (messageId != null) {
                    this.f66394Z0 = AbstractC23306f.m120584H0().m2636s(this.f66393Y0);
                }
                this.f66391W0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
                this.f66392X0 = (ActionLogChatLocation.FooterLogData) m92642L3.getParcelable("EXTRA_FOOTER_LOG_DATA");
            }
            LiveLocationMapView liveLocationMapView = this.f66386R0;
            if (liveLocationMapView != null) {
                liveLocationMapView.setFocusedLiveLocationId(this.f66389U0);
                m71935vM();
            }
            ZaloView m92993D0 = m92649TI().m92993D0(DetailsView.class);
            if (m92993D0 != null) {
                m92993D0.finish();
            }
            this.f66387S0 = new DetailsView();
            Bundle bundle2 = new Bundle();
            bundle2.putString("extra_conversation_id", this.f66388T0);
            bundle2.putLong("LONG_EXTRA_LIVE_LOCATION_ID", this.f66389U0);
            bundle2.putInt("INT_EXTRA_TRACKING_SOURCE", this.f66391W0);
            bundle2.putParcelable("EXTRA_FOOTER_LOG_DATA", this.f66392X0);
            this.f66387S0.mo60305zK(bundle2);
            m92649TI().m93058d2(AbstractC6918a0.fl_bottom_container, this.f66387S0, 0, "DetailsView", 0, false);
            DetailsView detailsView = this.f66387S0;
            if (detailsView != null) {
                detailsView.f66409Y0 = this;
                detailsView.m71947AM(this.f66386R0);
                if (!AbstractC8955a.m47863a() && m92676n2() != null && m92676n2().mo35576n3()) {
                    this.f66387S0.f66407W0 = this.f66489N0;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
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

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: gM */
    ZaloMapView mo71931gM(Context context) {
        LatLng latLng;
        GoogleMapOptions googleMapOptions;
        if (m92642L3() != null && m92642L3().containsKey("EXTRA_PRESET_LATITUDE") && m92642L3().containsKey("EXTRA_PRESET_LONGITUDE")) {
            latLng = new LatLng(m92642L3().getDouble("EXTRA_PRESET_LATITUDE"), m92642L3().getDouble("EXTRA_PRESET_LONGITUDE"));
            googleMapOptions = new GoogleMapOptions();
            googleMapOptions.m30640J(CameraPosition.m30684t().m30689e(17.0f).m30687c(latLng).m30686b());
        } else {
            latLng = null;
            googleMapOptions = null;
        }
        if (googleMapOptions != null) {
            this.f66386R0 = new LiveLocationMapView(context, googleMapOptions);
        } else {
            this.f66386R0 = new LiveLocationMapView(context);
        }
        this.f66386R0.setListener(new LiveLocationMapView.InterfaceC8980a() { // from class: k90.a
            public /* synthetic */ C21606a() {
            }

            @Override // com.zing.zalo.location.widget.LiveLocationMapView.InterfaceC8980a
            /* renamed from: a */
            public final void mo48033a(C8969o c8969o) {
                LiveLocationDetailsView.this.m71927qM(c8969o);
            }
        });
        if (latLng != null) {
            this.f66386R0.setPresetLatLng(latLng);
        }
        return this.f66386R0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LiveLocationDetailsView";
    }

    @Override // com.zing.zalo.p077ui.picker.location.MapZaloView
    /* renamed from: hM */
    void mo71932hM() {
        if (m92656bJ() != null && m92642L3() != null && m92642L3().containsKey("EXTRA_PRESET_LATITUDE") && m92642L3().containsKey("EXTRA_PRESET_LONGITUDE") && ((FrameLayout) m92656bJ().findViewById(AbstractC6918a0.google_map_in_app_webview_container)) != null) {
            RobotoTextView robotoTextView = (RobotoTextView) m92656bJ().findViewById(AbstractC6918a0.tv_map_invalid);
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
            m72062kM(AbstractC6918a0.google_map_in_app_webview_container, m92642L3().getDouble("EXTRA_PRESET_LATITUDE"), m92642L3().getDouble("EXTRA_PRESET_LONGITUDE"));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 120 || i11 == 110) {
            m72059fM();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* renamed from: tM */
    void m71933tM(boolean z11) {
        DetailsView detailsView;
        if (z11 && (detailsView = this.f66387S0) != null) {
            detailsView.m71949W2();
        }
        C8967m.m47867E().m47905G(this.f66390V0, this.f66388T0, this.f66393Y0, false, this);
    }

    /* renamed from: uM */
    void m71934uM() {
        if (TextUtils.isEmpty(this.f66388T0)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", this.f66388T0);
        if (C8969o.m47964d(this.f66388T0) == 1) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f66388T0);
            if (m4472f != null && this.f66396b1 != null && m4472f.m153732O() == AbstractC8971q.m47972d(this.f66396b1)) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_all_member_share_live_location_alert));
                return;
            }
        } else {
            List list = this.f66396b1;
            if (list != null && AbstractC8971q.m47972d(list) == 2) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_all_member_share_live_location_alert));
                return;
            }
        }
        bundle.putString("EXTRA_INVITATION_TEXT", AbstractC23136l9.m118743r0(AbstractC8020f0.str_invitation_share_location));
        if (m92662fJ() != null) {
            m92662fJ().m93069k2(InviteToShareLiveLocationView.class, bundle, 1, true);
        }
    }

    /* renamed from: vM */
    void m71935vM() {
        C17945a0 c17945a0;
        if (!TextUtils.isEmpty(this.f66388T0) && this.f66389U0 > 0) {
            C8969o m47907H = C8967m.m47867E().m47907H(this.f66389U0);
            if (m47907H == null && (c17945a0 = this.f66394Z0) != null && c17945a0.m94929K2() != null && (this.f66394Z0.m94929K2() instanceof C17996r0)) {
                C17996r0 c17996r0 = (C17996r0) this.f66394Z0.m94929K2();
                C8969o c8969o = new C8969o();
                c8969o.f47980a = c17996r0.f91147B;
                c8969o.f47985f = c17996r0.f91149D;
                c8969o.f47984e = c17996r0.f91150E;
                c8969o.f47989j = c17996r0.f91152G;
                c8969o.f47990k = c17996r0.f91153H;
                c8969o.f47997r = c17996r0.f91151F;
                c8969o.f47981b = this.f66388T0;
                c8969o.f47982c = this.f66394Z0.m94862C4();
                m47907H = c8969o;
            }
            if (m47907H != null) {
                this.f66396b1.add(0, m47907H);
                this.f66397c1.put(Long.valueOf(m47907H.f47980a), m47907H);
                DetailsView detailsView = this.f66387S0;
                if (detailsView != null) {
                    detailsView.m71954wM(this.f66396b1, false);
                }
                m71936wM(false);
            }
        }
    }

    /* renamed from: wM */
    void m71936wM(boolean z11) {
        C8957c c8957c = new C8957c();
        c8957c.f47904a = this.f66388T0;
        List list = this.f66396b1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c8957c.m47865a((C8969o) it.next());
            }
        }
        LiveLocationMapView liveLocationMapView = this.f66386R0;
        if (liveLocationMapView != null) {
            liveLocationMapView.m48031i0(c8957c, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        this.f66395a1.post(new Runnable() { // from class: k90.c

            /* renamed from: q */
            public final /* synthetic */ int f104964q;

            /* renamed from: r */
            public final /* synthetic */ Object[] f104965r;

            public /* synthetic */ RunnableC21608c(int i112, Object[] objArr2) {
                r2 = i112;
                r3 = objArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LiveLocationDetailsView.this.m71928rM(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 83);
        C23744a.m124114c().m124115b(this, 84);
        C23744a.m124114c().m124115b(this, 52);
    }
}
