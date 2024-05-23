package com.zing.zalo.location.widget;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.AbstractC1401h;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23170p;
import org.json.JSONException;
import org.json.JSONObject;
import p123e6.AbstractC18252b;
import p123e6.C18253c;
import p123e6.C18261k;
import p123e6.InterfaceC18255e;
import p181g6.AbstractC19237c;
import p181g6.C19238d;
import p348mi.AbstractC23309i;

/* loaded from: classes4.dex */
public class ZaloMapView extends MapView implements InterfaceC18255e, C18253c.g, C18253c.e, C18253c.d, C18253c.c, C18253c.h, C18253c.b, Handler.Callback {

    /* renamed from: V */
    protected static String f48053V = "MY_LOCATION_MARKER_TAG";

    /* renamed from: W */
    protected static String f48054W = "PRESET_LOCATION_MARKER_TAG";

    /* renamed from: A */
    boolean f48055A;

    /* renamed from: B */
    protected boolean f48056B;

    /* renamed from: C */
    protected MarkerOptions f48057C;

    /* renamed from: D */
    protected C19238d f48058D;

    /* renamed from: E */
    protected boolean f48059E;

    /* renamed from: F */
    protected LatLng f48060F;

    /* renamed from: G */
    protected MarkerOptions f48061G;

    /* renamed from: H */
    protected C19238d f48062H;

    /* renamed from: I */
    protected boolean f48063I;

    /* renamed from: J */
    protected boolean f48064J;

    /* renamed from: K */
    protected int f48065K;

    /* renamed from: L */
    protected boolean f48066L;

    /* renamed from: M */
    protected boolean f48067M;

    /* renamed from: N */
    protected Handler f48068N;

    /* renamed from: O */
    protected C19238d f48069O;

    /* renamed from: P */
    protected C19238d f48070P;

    /* renamed from: Q */
    protected C19238d f48071Q;

    /* renamed from: R */
    private SensitiveData f48072R;

    /* renamed from: S */
    boolean f48073S;

    /* renamed from: T */
    int[] f48074T;

    /* renamed from: U */
    InterfaceC8981a f48075U;

    /* renamed from: q */
    protected C18253c f48076q;

    /* renamed from: r */
    protected Location f48077r;

    /* renamed from: s */
    protected Path f48078s;

    /* renamed from: t */
    protected float[] f48079t;

    /* renamed from: u */
    protected Drawable f48080u;

    /* renamed from: v */
    boolean f48081v;

    /* renamed from: w */
    protected View f48082w;

    /* renamed from: x */
    protected float f48083x;

    /* renamed from: y */
    protected boolean f48084y;

    /* renamed from: z */
    boolean f48085z;

    /* renamed from: com.zing.zalo.location.widget.ZaloMapView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8981a {
        /* renamed from: a */
        void mo48061a(Location location);
    }

    public ZaloMapView(Context context) {
        super(context);
        this.f48077r = null;
        this.f48078s = null;
        this.f48079t = null;
        this.f48080u = null;
        this.f48081v = false;
        this.f48083x = 17.0f;
        this.f48084y = true;
        this.f48085z = true;
        this.f48055A = true;
        this.f48056B = false;
        this.f48057C = null;
        this.f48058D = null;
        this.f48059E = true;
        this.f48061G = null;
        this.f48062H = null;
        this.f48063I = false;
        this.f48064J = false;
        this.f48065K = -1;
        this.f48066L = false;
        this.f48067M = false;
        this.f48068N = new Handler(Looper.getMainLooper(), this);
        this.f48069O = null;
        this.f48070P = null;
        this.f48071Q = null;
        this.f48073S = true;
        this.f48074T = null;
        mo48015D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m48034F(LatLng latLng) {
        this.f48070P = this.f48076q.m97021a(new MarkerOptions().mo30680J0(latLng).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(getResources(), AbstractC16803z.ic_img_hoangsa, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m48035G(LatLng latLng) {
        this.f48071Q = this.f48076q.m97021a(new MarkerOptions().mo30680J0(latLng).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(getResources(), AbstractC16803z.ic_img_truongsa, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m48036H(LatLng latLng) {
        this.f48069O = this.f48076q.m97021a(new MarkerOptions().mo30680J0(latLng).mo30679F0(AbstractC23170p.m119368z(AbstractC1401h.m7082f(getResources(), AbstractC16803z.ic_img_biendong, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m48037I(boolean z11) {
        C19238d c19238d = this.f48070P;
        if (c19238d != null) {
            c19238d.m100930h(z11);
        }
        C19238d c19238d2 = this.f48071Q;
        if (c19238d2 != null) {
            c19238d2.m100930h(z11);
        }
        C19238d c19238d3 = this.f48069O;
        if (c19238d3 != null) {
            c19238d3.m100930h(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m48038J(final boolean z11) {
        if (AbstractC23309i.m121479U2() && !TextUtils.isEmpty(AbstractC23309i.m122274p8())) {
            m48039O();
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.location.widget.k
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloMapView.this.m48037I(z11);
                }
            });
        }
    }

    /* renamed from: O */
    private void m48039O() {
        try {
            if (this.f48069O != null && this.f48071Q != null && this.f48070P != null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(AbstractC23309i.m122274p8());
            if (jSONObject.has("paracel_island_location") && this.f48070P == null) {
                String optString = jSONObject.optString("paracel_island_location");
                if (!TextUtils.isEmpty(optString)) {
                    if (optString.split(",").length == 2) {
                        try {
                            final LatLng latLng = new LatLng(Float.parseFloat(r2[0]), Float.parseFloat(r2[1]));
                            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.location.widget.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloMapView.this.m48034F(latLng);
                                }
                            });
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                }
            }
            if (jSONObject.has("spratly_island_location") && this.f48071Q == null) {
                String optString2 = jSONObject.optString("spratly_island_location");
                if (!TextUtils.isEmpty(optString2)) {
                    if (optString2.split(",").length == 2) {
                        try {
                            final LatLng latLng2 = new LatLng(Float.parseFloat(r1[0]), Float.parseFloat(r1[1]));
                            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.location.widget.m
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloMapView.this.m48035G(latLng2);
                                }
                            });
                        } catch (Exception e12) {
                            AbstractC20110a.m104539h(e12);
                        }
                    }
                }
            }
            if (jSONObject.has("east_sea_location") && this.f48069O == null) {
                String optString3 = jSONObject.optString("east_sea_location");
                if (!TextUtils.isEmpty(optString3)) {
                    if (optString3.split(",").length == 2) {
                        try {
                            final LatLng latLng3 = new LatLng(Float.parseFloat(r0[0]), Float.parseFloat(r0[1]));
                            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.location.widget.n
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloMapView.this.m48036H(latLng3);
                                }
                            });
                        } catch (Exception e13) {
                            AbstractC20110a.m104539h(e13);
                        }
                    }
                }
            }
        } catch (JSONException e14) {
            AbstractC20110a.m104539h(e14);
        }
    }

    /* renamed from: A */
    public void mo48014A(boolean z11, boolean z12) {
        C18253c c18253c = this.f48076q;
        if (c18253c != null) {
            setMyLocation(c18253c.m97025e());
        }
        m48060z(z11, z12);
    }

    /* renamed from: B */
    public void m48045B(double d11, double d12, boolean z11, boolean z12) {
        m48046C(new LatLng(d11, d12), z11, z12);
    }

    /* renamed from: C */
    public void m48046C(LatLng latLng, boolean z11, boolean z12) {
        float f11;
        C18253c c18253c = this.f48076q;
        if (c18253c == null) {
            return;
        }
        if (z12) {
            CameraPosition m97024d = c18253c.m97024d();
            CameraPosition.C5901a m30684t = CameraPosition.m30684t();
            CameraPosition.C5901a m30687c = m30684t.m30687c(latLng);
            if (z11) {
                f11 = this.f48083x;
            } else {
                f11 = m97024d.f33603q;
            }
            m30687c.m30689e(f11).m30685a(m97024d.f33605s).m30688d(m97024d.f33604r);
            this.f48076q.m97022b(AbstractC18252b.m97015a(m30684t.m30686b()), ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, null);
            return;
        }
        c18253c.m97029i(AbstractC18252b.m97016b(latLng));
        if (z11) {
            this.f48076q.m97029i(AbstractC18252b.m97018d(this.f48083x));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public void mo48015D() {
        this.f48067M = AbstractC8955a.m47863a();
    }

    /* renamed from: E */
    protected void mo48016E() {
        LatLng latLng = this.f48060F;
        if (latLng != null) {
            m48046C(latLng, true, false);
            if (this.f48063I) {
                m48052S();
            }
        }
    }

    /* renamed from: K */
    public void m48047K() {
        this.f48066L = true;
    }

    /* renamed from: L */
    public void m48048L() {
        this.f48066L = false;
        this.f48068N.removeMessages(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void mo48017M(View view) {
        this.f48055A = true;
        this.f48068N.removeMessages(1);
        m48060z(true, true);
    }

    /* renamed from: N */
    public void mo48018N() {
    }

    /* renamed from: P */
    public void m48049P(int i11, int i12, int i13, int i14, boolean z11) {
        C18253c c18253c = this.f48076q;
        if (c18253c != null) {
            LatLng m30712F = c18253c.m97026f().m97046a().f33739t.m30712F();
            this.f48076q.m97040t(i11, i12, i13, i14);
            m48045B(m30712F.f33638p, m30712F.f33639q, false, z11);
        } else {
            this.f48074T = r14;
            int[] iArr = {i11, i12, i13, i14};
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public void m48050Q() {
        LatLng latLng;
        C18253c c18253c = this.f48076q;
        if (c18253c != null && c18253c.m97028h()) {
            if (this.f48076q.m97025e() != null) {
                setMyLocation(this.f48076q.m97025e());
                latLng = new LatLng(this.f48077r.getLatitude(), this.f48077r.getLongitude());
            } else {
                latLng = null;
            }
            if (latLng != null) {
                C19238d c19238d = this.f48058D;
                if (c19238d == null) {
                    MarkerOptions markerOptions = this.f48057C;
                    if (markerOptions == null) {
                        this.f48057C = new MarkerOptions().mo30679F0(AbstractC19237c.m100920b(AbstractC16803z.icn_livelocation_mark_red)).mo30680J0(latLng);
                    } else {
                        markerOptions.mo30680J0(latLng);
                    }
                    C19238d m97021a = this.f48076q.m97021a(this.f48057C);
                    this.f48058D = m97021a;
                    m97021a.m100929g(f48053V);
                    return;
                }
                if (c19238d.m100925c()) {
                    this.f48058D.m100928f(latLng);
                    return;
                }
                this.f48057C.mo30680J0(latLng);
                C19238d m97021a2 = this.f48076q.m97021a(this.f48057C);
                this.f48058D = m97021a2;
                m97021a2.m100929g(f48053V);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m48051R(final boolean z11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.location.widget.i
            @Override // java.lang.Runnable
            public final void run() {
                ZaloMapView.this.m48038J(z11);
            }
        });
    }

    /* renamed from: S */
    protected void m48052S() {
        LatLng latLng;
        if (this.f48076q != null && (latLng = this.f48060F) != null) {
            C19238d c19238d = this.f48062H;
            if (c19238d == null) {
                MarkerOptions markerOptions = this.f48061G;
                if (markerOptions == null) {
                    this.f48061G = new MarkerOptions().mo30679F0(AbstractC19237c.m100920b(AbstractC16803z.icn_livelocation_mark_red)).mo30680J0(this.f48060F);
                } else {
                    markerOptions.mo30680J0(latLng);
                }
                C19238d m97021a = this.f48076q.m97021a(this.f48061G);
                this.f48062H = m97021a;
                m97021a.m100929g(f48054W);
                return;
            }
            if (c19238d.m100925c()) {
                this.f48062H.m100928f(this.f48060F);
                return;
            }
            this.f48061G.mo30680J0(this.f48060F);
            C19238d m97021a2 = this.f48076q.m97021a(this.f48061G);
            this.f48062H = m97021a2;
            m97021a2.m100929g(f48054W);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public void m48053T() {
        this.f48068N.removeMessages(2);
        this.f48068N.sendEmptyMessage(2);
    }

    @Override // p123e6.C18253c.b
    /* renamed from: a */
    public void mo48054a(CameraPosition cameraPosition) {
        boolean z11;
        if (cameraPosition.f33603q >= 4.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        m48051R(z11);
    }

    /* renamed from: b */
    public void mo47979b(C18253c c18253c) {
        this.f48076q = c18253c;
        if (AbstractC23309i.m121479U2()) {
            this.f48076q.m97030j(AbstractC8955a.f47898b);
        }
        this.f48076q.m97036p(this);
        this.f48076q.m97035o(this);
        this.f48076q.m97034n(this);
        this.f48076q.m97039s(this);
        this.f48076q.m97033m(this);
        this.f48076q.m97038r(this);
        C18261k m97027g = this.f48076q.m97027g();
        if (this.f48082w != null) {
            m97027g.m97049c(false);
        }
        m97027g.m97047a(false);
        m97027g.m97048b(false);
        if (this.f48084y || this.f48059E) {
            m48058w();
        }
        int[] iArr = this.f48074T;
        if (iArr != null && iArr.length >= 4) {
            m48049P(iArr[0], iArr[1], iArr[2], iArr[3], false);
        }
        mo48016E();
        m48051R(true);
    }

    @Override // p123e6.C18253c.d
    /* renamed from: c */
    public void mo48055c() {
        this.f48064J = true;
    }

    /* renamed from: d */
    public void mo48025d(Location location) {
        setMyLocation(location);
        if (this.f48084y || this.f48059E) {
            m48053T();
        }
        if (this.f48084y && location != null) {
            if (this.f48073S && this.f48060F == null) {
                m48045B(location.getLatitude(), location.getLongitude(), true, false);
            } else if (this.f48055A) {
                m48045B(location.getLatitude(), location.getLongitude(), false, true);
            }
        }
        this.f48073S = false;
        C8967m.m47867E().m47949y0(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        boolean z11;
        Drawable drawable;
        Path path = this.f48078s;
        if (path != null) {
            if (path.isEmpty() && this.f48079t != null) {
                this.f48078s.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.f48079t, Path.Direction.CW);
            }
            if (!this.f48078s.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.f48078s);
                z11 = true;
                if (this.f48081v && (drawable = this.f48080u) != null) {
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    this.f48080u.draw(canvas);
                }
                super.dispatchDraw(canvas);
                if (!z11) {
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.f48081v) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.f48080u.draw(canvas);
        }
        super.dispatchDraw(canvas);
        if (!z11) {
        }
    }

    /* renamed from: e */
    public boolean mo48026e(C19238d c19238d) {
        if (c19238d != null) {
            m48045B(c19238d.m100923a().f33638p, c19238d.m100923a().f33639q, true, true);
            return true;
        }
        return false;
    }

    @Override // p123e6.C18253c.c
    /* renamed from: f */
    public void mo48056f() {
        this.f48064J = false;
        mo48032x();
    }

    @Override // p123e6.C18253c.e
    /* renamed from: g */
    public void mo48057g(int i11) {
        this.f48065K = i11;
    }

    public C18253c getGoogleMap() {
        return this.f48076q;
    }

    public Location getMyLocation() {
        return this.f48077r;
    }

    public float[] getRadii() {
        return this.f48079t;
    }

    public boolean handleMessage(Message message) {
        C18253c c18253c;
        try {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    if (!this.f48066L) {
                        return true;
                    }
                    if (this.f48056B && (c18253c = this.f48076q) != null && c18253c.m97028h()) {
                        m48050Q();
                    }
                }
            } else {
                m48060z(true, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    public void setDefaultZoomLevel(float f11) {
        this.f48083x = f11;
    }

    public void setEnableDefaultThumb(boolean z11) {
        this.f48081v = z11;
        if (z11) {
            this.f48080u = AbstractC11531v0.m62221Y1();
        }
    }

    public void setMapType(int i11) {
        C18253c c18253c = this.f48076q;
        if (c18253c != null) {
            c18253c.m97031k(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMyLocation(Location location) {
        this.f48077r = location;
        InterfaceC8981a interfaceC8981a = this.f48075U;
        if (interfaceC8981a != null) {
            interfaceC8981a.mo48061a(location);
        }
    }

    public void setMyLocationButton(View view) {
        this.f48082w = view;
        if (view != null) {
            C18253c c18253c = this.f48076q;
            if (c18253c == null || !c18253c.m97028h()) {
                this.f48082w.setVisibility(8);
            }
            C18253c c18253c2 = this.f48076q;
            if (c18253c2 != null) {
                c18253c2.m97027g().m97049c(false);
            }
            this.f48082w.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.location.widget.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ZaloMapView.this.mo48017M(view2);
                }
            });
        }
    }

    public void setMyLocationTracker(InterfaceC8981a interfaceC8981a) {
        this.f48075U = interfaceC8981a;
    }

    public void setPresetLatLng(LatLng latLng) {
        this.f48060F = latLng;
    }

    public void setRadii(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            if (this.f48078s == null) {
                this.f48078s = new Path();
            }
            this.f48078s.reset();
            this.f48079t = fArr;
            invalidate();
        }
    }

    public void setSensitiveData(SensitiveData sensitiveData) {
        this.f48072R = sensitiveData;
    }

    public void setShowMyLocationMarker(boolean z11) {
        this.f48059E = z11;
    }

    public void setShowPresetLocationMarker(boolean z11) {
        this.f48063I = z11;
    }

    public void setTrackMyLocation(boolean z11) {
        this.f48084y = z11;
    }

    public void setUseCustomMyLocationMarker(boolean z11) {
        this.f48056B = z11;
    }

    /* renamed from: w */
    public void m48058w() {
        if (this.f48076q != null && AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112034k) == 0) {
            SensitiveData sensitiveData = this.f48072R;
            if (sensitiveData != null && !C8937j0.m47663l(sensitiveData.m35528c())) {
                return;
            }
            this.f48076q.m97032l(true);
            View view = this.f48082w;
            if (view != null) {
                view.setVisibility(0);
                this.f48076q.m97027g().m97049c(false);
            }
        }
    }

    /* renamed from: x */
    protected void mo48032x() {
        try {
            if (this.f48065K == 1) {
                this.f48055A = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m48059y() {
        C19238d c19238d = this.f48070P;
        if (c19238d != null) {
            c19238d.m100926d();
        }
        C19238d c19238d2 = this.f48071Q;
        if (c19238d2 != null) {
            c19238d2.m100926d();
        }
        C19238d c19238d3 = this.f48069O;
        if (c19238d3 != null) {
            c19238d3.m100926d();
        }
        this.f48070P = null;
        this.f48071Q = null;
        this.f48069O = null;
    }

    /* renamed from: z */
    public void m48060z(boolean z11, boolean z12) {
        Location location = this.f48077r;
        if (location != null) {
            m48045B(location.getLatitude(), this.f48077r.getLongitude(), z11, z12);
        }
    }

    public ZaloMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48077r = null;
        this.f48078s = null;
        this.f48079t = null;
        this.f48080u = null;
        this.f48081v = false;
        this.f48083x = 17.0f;
        this.f48084y = true;
        this.f48085z = true;
        this.f48055A = true;
        this.f48056B = false;
        this.f48057C = null;
        this.f48058D = null;
        this.f48059E = true;
        this.f48061G = null;
        this.f48062H = null;
        this.f48063I = false;
        this.f48064J = false;
        this.f48065K = -1;
        this.f48066L = false;
        this.f48067M = false;
        this.f48068N = new Handler(Looper.getMainLooper(), this);
        this.f48069O = null;
        this.f48070P = null;
        this.f48071Q = null;
        this.f48073S = true;
        this.f48074T = null;
        mo48015D();
    }

    public ZaloMapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f48077r = null;
        this.f48078s = null;
        this.f48079t = null;
        this.f48080u = null;
        this.f48081v = false;
        this.f48083x = 17.0f;
        this.f48084y = true;
        this.f48085z = true;
        this.f48055A = true;
        this.f48056B = false;
        this.f48057C = null;
        this.f48058D = null;
        this.f48059E = true;
        this.f48061G = null;
        this.f48062H = null;
        this.f48063I = false;
        this.f48064J = false;
        this.f48065K = -1;
        this.f48066L = false;
        this.f48067M = false;
        this.f48068N = new Handler(Looper.getMainLooper(), this);
        this.f48069O = null;
        this.f48070P = null;
        this.f48071Q = null;
        this.f48073S = true;
        this.f48074T = null;
        mo48015D();
    }

    public ZaloMapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.f48077r = null;
        this.f48078s = null;
        this.f48079t = null;
        this.f48080u = null;
        this.f48081v = false;
        this.f48083x = 17.0f;
        this.f48084y = true;
        this.f48085z = true;
        this.f48055A = true;
        this.f48056B = false;
        this.f48057C = null;
        this.f48058D = null;
        this.f48059E = true;
        this.f48061G = null;
        this.f48062H = null;
        this.f48063I = false;
        this.f48064J = false;
        this.f48065K = -1;
        this.f48066L = false;
        this.f48067M = false;
        this.f48068N = new Handler(Looper.getMainLooper(), this);
        this.f48069O = null;
        this.f48070P = null;
        this.f48071Q = null;
        this.f48073S = true;
        this.f48074T = null;
        mo48015D();
    }
}
