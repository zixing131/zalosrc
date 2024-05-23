package ac;

import ac.C0697c0;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.ZaloTrackingActivity;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;

/* renamed from: ac.n */
/* loaded from: classes3.dex */
public final class C0718n implements ViewPager.InterfaceC6875j {

    /* renamed from: p */
    private final ViewPager f2377p;

    /* renamed from: q */
    private int f2378q;

    /* renamed from: r */
    private ViewPager.InterfaceC6875j f2379r;

    /* renamed from: s */
    private boolean f2380s;

    public C0718n(ViewPager viewPager) {
        AbstractC19074t.m100208f(viewPager, "viewPager");
        this.f2377p = viewPager;
    }

    /* renamed from: a */
    public final boolean m1127a(String str) {
        AbstractC19074t.m100208f(str, "screenName");
        if (this.f2380s && (this.f2377p.getAdapter() instanceof AbstractC17505t0)) {
            AbstractC6881a adapter = this.f2377p.getAdapter();
            AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloViewPagerAdapter");
            AbstractC17505t0 abstractC17505t0 = (AbstractC17505t0) adapter;
            int mo35335g = abstractC17505t0.mo35335g();
            for (int i11 = 0; i11 < mo35335g; i11++) {
                InterfaceC1801w m93128x = abstractC17505t0.m93128x(i11);
                if (m93128x != null && (m93128x instanceof InterfaceC0733x) && str.equals(((InterfaceC0733x) m93128x).getTrackingKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m1128b() {
        this.f2380s = false;
        ZaloAnalytics.Companion.m37219b().m37212q0(this);
        this.f2377p.removeOnPageChangeListener(this);
    }

    /* renamed from: c */
    public final void m1129c() {
        this.f2380s = true;
        ZaloAnalytics.Companion.m37219b().m37208h0(this);
        this.f2377p.addOnPageChangeListener(this);
    }

    /* renamed from: d */
    public final boolean m1130d(String str) {
        AbstractC19074t.m100208f(str, "screenName");
        if (this.f2380s && (this.f2377p.getAdapter() instanceof AbstractC17505t0)) {
            AbstractC6881a adapter = this.f2377p.getAdapter();
            AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloViewPagerAdapter");
            InterfaceC1801w m93128x = ((AbstractC17505t0) adapter).m93128x(this.f2378q);
            if (m93128x != null && (m93128x instanceof InterfaceC0733x) && str.equals(((InterfaceC0733x) m93128x).getTrackingKey())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m1131e(Object obj) {
        if (obj instanceof ViewPager.InterfaceC6875j) {
            this.f2379r = (ViewPager.InterfaceC6875j) obj;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        ViewPager.InterfaceC6875j interfaceC6875j = this.f2379r;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageScrollStateChanged(i11);
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
        ViewPager.InterfaceC6875j interfaceC6875j = this.f2379r;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageScrolled(i11, f11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        Bundle bundle;
        ViewPager.InterfaceC6875j interfaceC6875j = this.f2379r;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageSelected(i11);
        }
        if (this.f2380s && (this.f2377p.getAdapter() instanceof AbstractC17505t0)) {
            AbstractC6881a adapter = this.f2377p.getAdapter();
            AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloViewPagerAdapter");
            ZaloView m93128x = ((AbstractC17505t0) adapter).m93128x(i11);
            if (m93128x != 0 && (m93128x instanceof InterfaceC0733x)) {
                InterfaceC0733x interfaceC0733x = (InterfaceC0733x) m93128x;
                C0697c0.m1031x(C0697c0.Companion.m1048b(), interfaceC0733x.getTrackingKey(), false, 2, null);
                Context m92648SI = m93128x.m92648SI();
                if (m92648SI != null && (m92648SI instanceof ZaloTrackingActivity)) {
                    ((ZaloTrackingActivity) m92648SI).m37238G2(interfaceC0733x);
                }
                Bundle m92642L3 = m93128x.m92642L3();
                if (m92642L3 != null && m92642L3.containsKey("EXTRA_DATA_TRACKING") && (bundle = m92642L3.getBundle("EXTRA_DATA_TRACKING")) != null) {
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null) {
                            C0697c0.b bVar = C0697c0.Companion;
                            String trackingKey = interfaceC0733x.getTrackingKey();
                            AbstractC19074t.m100207e(obj, "it1");
                            bVar.m1054h(trackingKey, str, obj);
                        }
                    }
                }
            }
            this.f2378q = i11;
        }
    }
}
