package com.zing.zalo.location.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.zing.zalo.location.C8957c;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.C8988g;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mm0.AbstractC23350e;
import p123e6.C18253c;
import p181g6.AbstractC19237c;
import p181g6.C19238d;

/* loaded from: classes4.dex */
public class LiveLocationMapView extends ZaloMapView {

    /* renamed from: a0 */
    C8957c f48046a0;

    /* renamed from: b0 */
    Map f48047b0;

    /* renamed from: c0 */
    Set f48048c0;

    /* renamed from: d0 */
    Map f48049d0;

    /* renamed from: e0 */
    C8988g f48050e0;

    /* renamed from: f0 */
    long f48051f0;

    /* renamed from: g0 */
    InterfaceC8980a f48052g0;

    /* renamed from: com.zing.zalo.location.widget.LiveLocationMapView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8980a {
        /* renamed from: a */
        void mo48033a(C8969o c8969o);
    }

    public LiveLocationMapView(Context context) {
        super(context);
        this.f48046a0 = new C8957c();
        this.f48047b0 = new HashMap();
        this.f48048c0 = new HashSet();
        this.f48049d0 = new HashMap();
        this.f48051f0 = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m48012c0(Bitmap bitmap, String str, C8969o c8969o) {
        try {
            try {
                if (this.f48067M && bitmap != null && !bitmap.isRecycled()) {
                    this.f48047b0.put(str, new MarkerOptions().mo30679F0(AbstractC19237c.m100919a(bitmap)));
                    Handler handler = this.f48068N;
                    handler.sendMessage(handler.obtainMessage(100, Long.valueOf(c8969o.f47980a)));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            this.f48048c0.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m48013d0(final String str, final C8969o c8969o, String str2, final Bitmap bitmap) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.location.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                LiveLocationMapView.this.m48012c0(bitmap, str, c8969o);
            }
        });
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: A */
    public void mo48014A(boolean z11, boolean z12) {
        m48022Z(z12, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: D */
    public void mo48015D() {
        super.mo48015D();
        setTrackMyLocation(true);
        setUseCustomMyLocationMarker(true);
        this.f48050e0 = new C8988g();
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: E */
    protected void mo48016E() {
        m48030h0(false, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: M */
    public void mo48017M(View view) {
        C8969o c8969o;
        C8957c c8957c = this.f48046a0;
        if (c8957c != null) {
            c8969o = c8957c.m47866b(CoreUtility.f89233i);
        } else {
            c8969o = null;
        }
        if (c8969o != null && !C8967m.m47872U(c8969o)) {
            m48023a0(c8969o, true, true);
            return;
        }
        long j11 = this.f48051f0;
        this.f48051f0 = 0L;
        if (j11 > 0) {
            m48029g0(j11);
        }
        super.m48060z(true, true);
        C19238d c19238d = this.f48058D;
        if (c19238d != null) {
            m48021Y(c19238d);
        }
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: N */
    public void mo48018N() {
        super.mo48018N();
        this.f48050e0.m48087c();
    }

    /* renamed from: W */
    void m48019W() {
        C8957c c8957c = this.f48046a0;
        if (c8957c != null) {
            Iterator it = c8957c.f47905b.iterator();
            while (it.hasNext()) {
                m48020X((C8969o) it.next());
            }
        }
    }

    /* renamed from: X */
    void m48020X(C8969o c8969o) {
        if (c8969o == null) {
            return;
        }
        Handler handler = this.f48068N;
        handler.sendMessage(handler.obtainMessage(100, Long.valueOf(c8969o.f47980a)));
    }

    /* renamed from: Y */
    void m48021Y(C19238d c19238d) {
        if (c19238d != null) {
            c19238d.m100931i(1.0f);
        }
        for (C19238d c19238d2 : this.f48049d0.values()) {
            if (c19238d2 != null && c19238d2 != c19238d) {
                c19238d2.m100931i(0.0f);
            }
        }
        C19238d c19238d3 = this.f48058D;
        if (c19238d3 != null && c19238d3 != c19238d) {
            c19238d3.m100931i(0.0f);
        }
    }

    /* renamed from: Z */
    public void m48022Z(boolean z11, boolean z12) {
        LatLng latLng;
        C8957c c8957c = this.f48046a0;
        if (c8957c != null) {
            latLng = m48024b0((C8969o) c8957c.f47906c.get(Long.valueOf(this.f48051f0)));
        } else {
            latLng = null;
        }
        if (latLng == null) {
            latLng = this.f48060F;
        }
        if (latLng == null && this.f48077r != null) {
            latLng = new LatLng(this.f48077r.getLatitude(), this.f48077r.getLongitude());
        }
        if (latLng != null) {
            if (z12) {
                m48045B(latLng.f33638p, latLng.f33639q, true, z11);
                return;
            }
            if (this.f48085z && !this.f48064J) {
                if (this.f48055A) {
                    m48045B(latLng.f33638p, latLng.f33639q, false, true);
                    return;
                }
                LatLngBounds latLngBounds = this.f48076q.m97026f().m97046a().f33739t;
                if (latLngBounds != null && !latLngBounds.m30713t(latLng)) {
                    m48045B(latLng.f33638p, latLng.f33639q, false, true);
                    this.f48055A = true;
                }
            }
        }
    }

    /* renamed from: a0 */
    public void m48023a0(C8969o c8969o, boolean z11, boolean z12) {
        LatLng latLng;
        if (c8969o != null) {
            try {
                setFocusedLiveLocationId(c8969o.f47980a);
                this.f48085z = true;
                this.f48055A = true;
                if (TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i) && !C8967m.m47872U(c8969o) && this.f48076q.m97025e() != null && this.f48076q.m97028h()) {
                    setMyLocation(this.f48076q.m97025e());
                    latLng = new LatLng(this.f48077r.getLatitude(), this.f48077r.getLongitude());
                } else {
                    latLng = new LatLng(c8969o.f47984e, c8969o.f47985f);
                }
                m48046C(latLng, z11, z12);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView, p123e6.InterfaceC18255e
    /* renamed from: b */
    public void mo47979b(C18253c c18253c) {
        super.mo47979b(c18253c);
        m48028f0();
    }

    /* renamed from: b0 */
    LatLng m48024b0(C8969o c8969o) {
        if (c8969o != null) {
            if (TextUtils.equals(CoreUtility.f89233i, c8969o.f47982c)) {
                if (this.f48077r != null) {
                    if (C8967m.m47872U(c8969o)) {
                        return new LatLng(c8969o.f47984e, c8969o.f47985f);
                    }
                    return new LatLng(this.f48077r.getLatitude(), this.f48077r.getLongitude());
                }
                return new LatLng(c8969o.f47984e, c8969o.f47985f);
            }
            return new LatLng(c8969o.f47984e, c8969o.f47985f);
        }
        return null;
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView, p123e6.C18253c.h
    /* renamed from: d */
    public void mo48025d(Location location) {
        setMyLocation(location);
        m48053T();
        if (this.f48051f0 == 0 && this.f48084y && this.f48085z) {
            m48060z(false, true);
        }
        C8967m.m47867E().m47949y0(location);
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView, p123e6.C18253c.g
    /* renamed from: e */
    public boolean mo48026e(C19238d c19238d) {
        C8969o c8969o;
        Object m100924b = c19238d.m100924b();
        if (m100924b != null && (m100924b instanceof Long)) {
            long longValue = ((Long) m100924b).longValue();
            C8957c c8957c = this.f48046a0;
            if (c8957c != null && (c8969o = (C8969o) c8957c.f47906c.get(Long.valueOf(longValue))) != null) {
                m48023a0(c8969o, true, true);
                InterfaceC8980a interfaceC8980a = this.f48052g0;
                if (interfaceC8980a != null) {
                    interfaceC8980a.mo48033a(c8969o);
                }
                return true;
            }
        }
        m48021Y(c19238d);
        return super.mo48026e(c19238d);
    }

    /* renamed from: e0 */
    void m48027e0(final C8969o c8969o, boolean z11) {
        boolean m47872U = C8967m.m47872U(c8969o);
        final String m48084h = C8988g.m48084h(c8969o.m47966b(), z11, m47872U);
        if (this.f48048c0.contains(m48084h)) {
            return;
        }
        this.f48048c0.add(m48084h);
        this.f48050e0.m48086b(c8969o.f47982c, c8969o.f47992m, c8969o.f47991l, z11, m47872U, new C8988g.c() { // from class: com.zing.zalo.location.widget.d
            @Override // com.zing.zalo.location.widget.C8988g.c
            /* renamed from: a */
            public final void mo48079a(String str, Bitmap bitmap) {
                LiveLocationMapView.this.m48013d0(m48084h, c8969o, str, bitmap);
            }
        }, getContext());
    }

    /* renamed from: f0 */
    void m48028f0() {
        if (this.f48046a0 != null && this.f48076q != null) {
            m48059y();
            this.f48076q.m97023c();
            m48051R(true);
            Iterator it = this.f48046a0.f47905b.iterator();
            while (it.hasNext()) {
                m48029g0(((C8969o) it.next()).f47980a);
            }
        }
    }

    /* renamed from: g0 */
    void m48029g0(long j11) {
        C8969o c8969o;
        LatLng m48024b0;
        boolean z11;
        C19238d c19238d;
        C8957c c8957c = this.f48046a0;
        if (c8957c != null) {
            c8969o = (C8969o) c8957c.f47906c.get(Long.valueOf(j11));
        } else {
            c8969o = null;
        }
        if (c8969o == null || (m48024b0 = m48024b0(c8969o)) == null) {
            return;
        }
        boolean m47872U = C8967m.m47872U(c8969o);
        if (c8969o.f47980a == this.f48051f0) {
            z11 = true;
        } else {
            z11 = false;
        }
        MarkerOptions markerOptions = (MarkerOptions) this.f48047b0.get(C8988g.m48084h(c8969o.m47966b(), z11, m47872U));
        if (markerOptions != null) {
            markerOptions.mo30680J0(m48024b0);
        } else {
            markerOptions = new MarkerOptions().mo30679F0(AbstractC19237c.m100919a(this.f48050e0.m48088f(getContext(), z11, m47872U)));
            markerOptions.mo30680J0(m48024b0);
            m48027e0(c8969o, z11);
        }
        C19238d c19238d2 = (C19238d) this.f48049d0.get(Long.valueOf(j11));
        if (c19238d2 == null) {
            c19238d2 = this.f48076q.m97021a(markerOptions);
            c19238d2.m100929g(Long.valueOf(c8969o.f47980a));
            this.f48049d0.put(Long.valueOf(j11), c19238d2);
        } else {
            c19238d2.m100928f(m48024b0);
            c19238d2.m100927e(markerOptions.m30722K());
        }
        if (z11) {
            m48021Y(c19238d2);
        }
        if (TextUtils.equals(CoreUtility.f89233i, c8969o.f47982c) && !m47872U && (c19238d = this.f48058D) != null) {
            c19238d.m100926d();
            this.f48058D = null;
        }
    }

    public long getFocusedLiveLocationId() {
        return this.f48051f0;
    }

    /* renamed from: h0 */
    void m48030h0(boolean z11, boolean z12) {
        this.f48068N.removeMessages(101);
        Handler handler = this.f48068N;
        handler.sendMessage(handler.obtainMessage(101, z11 ? 1 : 0, z12 ? 1 : 0));
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i11;
        C8969o c8969o;
        boolean z11;
        try {
            i11 = message.what;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 != 1) {
            boolean z12 = false;
            if (i11 != 2) {
                if (i11 != 100) {
                    if (i11 == 101) {
                        if (message.arg1 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (message.arg2 == 1) {
                            z12 = true;
                        }
                        m48022Z(z11, z12);
                        return true;
                    }
                    return super.handleMessage(message);
                }
                m48029g0(((Long) message.obj).longValue());
                return true;
            }
            if (!this.f48066L) {
                return true;
            }
            C8957c c8957c = this.f48046a0;
            if (c8957c != null) {
                c8969o = c8957c.m47866b(CoreUtility.f89233i);
            } else {
                c8969o = null;
            }
            if (c8969o != null && !C8967m.m47872U(c8969o)) {
                C18253c c18253c = this.f48076q;
                if (c18253c != null && c18253c.m97028h()) {
                    setMyLocation(this.f48076q.m97025e());
                    Location location = this.f48077r;
                    if (location != null) {
                        c8969o.f47984e = location.getLatitude();
                        c8969o.f47985f = this.f48077r.getLongitude();
                    }
                }
                m48029g0(c8969o.f47980a);
                if (this.f48051f0 == c8969o.f47980a) {
                    m48022Z(true, false);
                }
            } else if (this.f48056B) {
                m48050Q();
            }
        }
        return true;
    }

    /* renamed from: i0 */
    public void m48031i0(C8957c c8957c, boolean z11) {
        this.f48046a0 = c8957c;
        if (c8957c != null) {
            ArrayList arrayList = new ArrayList();
            for (Long l11 : this.f48049d0.keySet()) {
                if (!this.f48046a0.f47906c.containsKey(l11)) {
                    arrayList.add(l11);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C19238d c19238d = (C19238d) this.f48049d0.remove((Long) it.next());
                if (c19238d != null) {
                    c19238d.m100926d();
                }
            }
            m48019W();
            m48030h0(false, z11);
        } else {
            for (C19238d c19238d2 : this.f48049d0.values()) {
                if (c19238d2 != null) {
                    c19238d2.m100926d();
                }
            }
            this.f48049d0.clear();
        }
        m48053T();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48068N.removeCallbacksAndMessages(null);
    }

    public void setFocusedLiveLocationId(long j11) {
        C8957c c8957c;
        long j12 = this.f48051f0;
        this.f48051f0 = j11;
        if (this.f48076q != null && (c8957c = this.f48046a0) != null) {
            C8969o c8969o = (C8969o) c8957c.f47906c.get(Long.valueOf(j12));
            if (c8969o != null) {
                m48020X(c8969o);
            }
            C8969o c8969o2 = (C8969o) this.f48046a0.f47906c.get(Long.valueOf(this.f48051f0));
            if (c8969o2 != null) {
                m48020X(c8969o2);
            }
        }
    }

    public void setListener(InterfaceC8980a interfaceC8980a) {
        this.f48052g0 = interfaceC8980a;
    }

    @Override // com.zing.zalo.location.widget.ZaloMapView
    /* renamed from: x */
    protected void mo48032x() {
        LatLng latLng;
        LatLngBounds latLngBounds;
        try {
            if (this.f48065K == 1) {
                long j11 = this.f48051f0;
                if (j11 > 0) {
                    latLng = m48024b0((C8969o) this.f48046a0.f47906c.get(Long.valueOf(j11)));
                } else if (this.f48084y && this.f48077r != null) {
                    latLng = new LatLng(this.f48077r.getLatitude(), this.f48077r.getLongitude());
                } else {
                    latLng = null;
                }
                if (latLng == null || (latLngBounds = this.f48076q.m97026f().m97046a().f33739t) == null) {
                    return;
                }
                if (latLngBounds.m30713t(latLng)) {
                    this.f48085z = true;
                    this.f48055A = false;
                } else {
                    this.f48085z = false;
                    this.f48055A = false;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public LiveLocationMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48046a0 = new C8957c();
        this.f48047b0 = new HashMap();
        this.f48048c0 = new HashSet();
        this.f48049d0 = new HashMap();
        this.f48051f0 = 0L;
    }

    public LiveLocationMapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f48046a0 = new C8957c();
        this.f48047b0 = new HashMap();
        this.f48048c0 = new HashSet();
        this.f48049d0 = new HashMap();
        this.f48051f0 = 0L;
    }

    public LiveLocationMapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.f48046a0 = new C8957c();
        this.f48047b0 = new HashMap();
        this.f48048c0 = new HashSet();
        this.f48049d0 = new HashMap();
        this.f48051f0 = 0L;
    }
}
