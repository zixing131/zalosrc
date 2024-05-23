package com.zing.zalo.location;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.res.AbstractC1401h;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23170p;
import org.json.JSONException;
import org.json.JSONObject;
import p123e6.AbstractC18252b;
import p123e6.C18253c;
import p123e6.InterfaceC18255e;
import p181g6.C19238d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p681yh.EnumC30982b;

/* renamed from: com.zing.zalo.location.v */
/* loaded from: classes4.dex */
public class C8976v implements C23744a.c {

    /* renamed from: x */
    private static C8976v f48007x;

    /* renamed from: p */
    private MapView f48008p = null;

    /* renamed from: q */
    private C18253c f48009q = null;

    /* renamed from: r */
    private C19238d f48010r = null;

    /* renamed from: s */
    private boolean f48011s = false;

    /* renamed from: t */
    private boolean f48012t = false;

    /* renamed from: u */
    private final List f48013u = new ArrayList();

    /* renamed from: v */
    private C8977w f48014v = null;

    /* renamed from: w */
    private final C18253c.f f48015w = new C18253c.f() { // from class: com.zing.zalo.location.r
        @Override // p123e6.C18253c.f
        /* renamed from: a */
        public final void mo47978a() {
            C8976v.this.m47992m();
        }
    };

    /* renamed from: com.zing.zalo.location.v$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo48001a(Bitmap bitmap);
    }

    private C8976v() {
        C23744a.m124114c().m124115b(this, 73);
    }

    /* renamed from: e */
    private void m47985e(C8977w c8977w) {
        if (c8977w == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f48013u.size()) {
                break;
            }
            if (((C8977w) this.f48013u.get(i11)).f48016a == c8977w.f48016a) {
                this.f48013u.remove(i11);
                break;
            }
            i11++;
        }
        this.f48013u.add(0, c8977w);
    }

    /* renamed from: f */
    private void m47986f(C8977w c8977w, Bitmap bitmap) {
        a aVar;
        if (c8977w != null && (aVar = c8977w.f48024i) != null) {
            aVar.mo48001a(bitmap);
        }
        m47994o();
    }

    /* renamed from: h */
    public static C8976v m47987h() {
        if (f48007x == null) {
            f48007x = new C8976v();
        }
        return f48007x;
    }

    /* renamed from: i */
    private void m47988i() {
        try {
            this.f48008p.findViewWithTag("GoogleWatermark").setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m47989j(EnumC30982b enumC30982b) {
        C8977w c8977w;
        if (enumC30982b == EnumC30982b.CONNECTED && (c8977w = this.f48014v) != null && !this.f48012t) {
            this.f48013u.add(0, c8977w);
            m47994o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m47990k(C18253c c18253c) {
        try {
            this.f48009q = c18253c;
            m47998s();
            m47999t();
            this.f48009q.m97037q(this.f48015w);
            if (AbstractC23309i.m121479U2() && !TextUtils.isEmpty(AbstractC23309i.m122274p8())) {
                try {
                    JSONObject jSONObject = new JSONObject(AbstractC23309i.m122274p8());
                    if (jSONObject.has("paracel_island_location")) {
                        String optString = jSONObject.optString("paracel_island_location", "");
                        if (!TextUtils.isEmpty(optString)) {
                            if (optString.split(",").length == 2) {
                                try {
                                    this.f48009q.m97021a(new MarkerOptions().mo30680J0(new LatLng(Float.parseFloat(r2[0]), Float.parseFloat(r2[1]))).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_img_hoangsa, null))));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                    }
                    if (jSONObject.has("spratly_island_location")) {
                        String optString2 = jSONObject.optString("spratly_island_location", "");
                        if (!TextUtils.isEmpty(optString2)) {
                            if (optString2.split(",").length == 2) {
                                try {
                                    this.f48009q.m97021a(new MarkerOptions().mo30680J0(new LatLng(Float.parseFloat(r1[0]), Float.parseFloat(r1[1]))).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_img_truongsa, null))));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            }
                        }
                    }
                    if (jSONObject.has("east_sea_location")) {
                        String optString3 = jSONObject.optString("east_sea_location");
                        if (!TextUtils.isEmpty(optString3)) {
                            if (optString3.split(",").length == 2) {
                                try {
                                    this.f48009q.m97021a(new MarkerOptions().mo30680J0(new LatLng(Float.parseFloat(r15[0]), Float.parseFloat(r15[1]))).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_img_biendong, null))));
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (JSONException e14) {
                    e14.printStackTrace();
                }
            }
        } catch (Exception e15) {
            e15.printStackTrace();
            m47986f(this.f48014v, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m47991l(Bitmap bitmap) {
        m47986f(this.f48014v, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m47992m() {
        this.f48012t = true;
        m47993n();
    }

    /* renamed from: n */
    private void m47993n() {
        this.f48009q.m97041u(new C18253c.i() { // from class: com.zing.zalo.location.u
            @Override // p123e6.C18253c.i
            /* renamed from: a */
            public final void mo47980a(Bitmap bitmap) {
                C8976v.this.m47991l(bitmap);
            }
        });
    }

    /* renamed from: o */
    private synchronized void m47994o() {
        this.f48014v = null;
        if (!this.f48013u.isEmpty()) {
            m48000g((C8977w) this.f48013u.remove(0));
        }
    }

    /* renamed from: p */
    private void m47995p() {
        C18253c c18253c = this.f48009q;
        if (c18253c != null) {
            c18253c.m97037q(null);
            this.f48009q.m97029i(AbstractC18252b.m97017c(new LatLng(0.0d, 0.0d), 0.0f));
        }
    }

    /* renamed from: q */
    private void m47996q() {
        this.f48009q.m97037q(this.f48015w);
        this.f48012t = false;
        C18253c c18253c = this.f48009q;
        C8977w c8977w = this.f48014v;
        c18253c.m97029i(AbstractC18252b.m97017c(new LatLng(c8977w.f48019d, c8977w.f48020e), this.f48014v.f48021f));
    }

    /* renamed from: r */
    private void m47997r() {
        if (this.f48008p.getWidth() == 0 || this.f48008p.getHeight() == 0 || this.f48008p.getWidth() != this.f48014v.f48017b || this.f48008p.getHeight() != this.f48014v.f48018c) {
            this.f48008p.measure(View.MeasureSpec.makeMeasureSpec(this.f48014v.f48017b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f48014v.f48018c, 1073741824));
            MapView mapView = this.f48008p;
            C8977w c8977w = this.f48014v;
            mapView.layout(0, 0, c8977w.f48017b, c8977w.f48018c);
        }
    }

    /* renamed from: s */
    private void m47998s() {
        MapStyleOptions mapStyleOptions;
        boolean z11 = this.f48014v.f48023h;
        this.f48011s = z11;
        C18253c c18253c = this.f48009q;
        if (z11) {
            mapStyleOptions = AbstractC8955a.f47897a;
        } else {
            mapStyleOptions = null;
        }
        c18253c.m97030j(mapStyleOptions);
    }

    /* renamed from: t */
    private void m47999t() {
        boolean z11 = this.f48014v.f48022g;
        if (!z11 && this.f48010r == null) {
            return;
        }
        C19238d c19238d = this.f48010r;
        if (c19238d == null) {
            MarkerOptions markerOptions = new MarkerOptions();
            C8977w c8977w = this.f48014v;
            markerOptions.mo30680J0(new LatLng(c8977w.f48019d, c8977w.f48020e));
            this.f48010r = this.f48009q.m97021a(markerOptions);
            return;
        }
        if (z11) {
            C8977w c8977w2 = this.f48014v;
            c19238d.m100928f(new LatLng(c8977w2.f48019d, c8977w2.f48020e));
        }
        this.f48010r.m100930h(this.f48014v.f48022g);
    }

    /* renamed from: g */
    public synchronized void m48000g(C8977w c8977w) {
        boolean z11;
        CameraPosition cameraPosition;
        LatLng latLng;
        AbstractC4205o.m19717f("generate() must be called on the main thread");
        if (c8977w != null && c8977w.f48024i != null && c8977w.f48017b > 0 && c8977w.f48018c > 0) {
            double d11 = c8977w.f48019d;
            if (d11 >= -90.0d && d11 <= 90.0d) {
                double d12 = c8977w.f48020e;
                if (d12 >= -180.0d && d12 <= 180.0d) {
                    if (!AbstractC8955a.m47863a()) {
                        m47986f(c8977w, null);
                        return;
                    }
                    if (this.f48014v != null) {
                        m47985e(c8977w);
                        return;
                    }
                    this.f48014v = c8977w;
                    try {
                        z11 = true;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        m47986f(this.f48014v, null);
                    }
                    if (this.f48008p == null) {
                        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                        googleMapOptions.m30641J0(false);
                        googleMapOptions.m30653T0(false);
                        googleMapOptions.m30658t(false);
                        googleMapOptions.m30654U0(false);
                        googleMapOptions.m30647O0(false);
                        googleMapOptions.m30646N0(false);
                        googleMapOptions.m30650Q0(false);
                        googleMapOptions.m30642K(false);
                        googleMapOptions.m30638H0(true);
                        C8977w c8977w2 = this.f48014v;
                        googleMapOptions.m30640J(CameraPosition.m30683F(new LatLng(c8977w2.f48019d, c8977w2.f48020e), this.f48014v.f48021f));
                        MapView mapView = new MapView(MainApplication.getAppContext(), googleMapOptions);
                        this.f48008p = mapView;
                        mapView.m30660i(null);
                        m47988i();
                        m47997r();
                        this.f48008p.m30659h(new InterfaceC18255e() { // from class: com.zing.zalo.location.s
                            @Override // p123e6.InterfaceC18255e
                            /* renamed from: b */
                            public final void mo47979b(C18253c c18253c) {
                                C8976v.this.m47990k(c18253c);
                            }
                        });
                        return;
                    }
                    m47997r();
                    if (this.f48009q == null || this.f48011s == this.f48014v.f48023h) {
                        z11 = false;
                    }
                    if (z11) {
                        m47998s();
                    }
                    if (z11 || !this.f48012t) {
                        m47995p();
                    }
                    m47999t();
                    C18253c c18253c = this.f48009q;
                    if (c18253c != null) {
                        cameraPosition = c18253c.m97024d();
                    } else {
                        cameraPosition = null;
                    }
                    if (cameraPosition != null && (latLng = cameraPosition.f33602p) != null) {
                        double d13 = latLng.f33638p;
                        C8977w c8977w3 = this.f48014v;
                        if (d13 == c8977w3.f48019d && latLng.f33639q == c8977w3.f48020e && cameraPosition.f33603q == c8977w3.f48021f) {
                            m47993n();
                        }
                    }
                    m47996q();
                }
            }
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 73) {
            try {
                final EnumC30982b enumC30982b = (EnumC30982b) objArr[0];
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.location.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8976v.this.m47989j(enumC30982b);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
