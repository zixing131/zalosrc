package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3014o;
import bo.C3020p0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8395t6;
import com.zing.zalo.feed.uicontrols.FeedZinstantBanner;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import gg0.AbstractC19444a;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import is.AbstractC20826v0;
import lk0.InterfaceC22508f;
import nj0.AbstractC23803b;
import org.json.JSONObject;
import pj0.InterfaceC24775a;

/* loaded from: classes4.dex */
public class FeedZinstantBanner extends RelativeLayout implements InterfaceC8395t6 {

    /* renamed from: A */
    C17170o f47354A;

    /* renamed from: B */
    InterfaceC24775a f47355B;

    /* renamed from: C */
    InterfaceC2259a f47356C;

    /* renamed from: p */
    String f47357p;

    /* renamed from: q */
    TrackingSource f47358q;

    /* renamed from: r */
    C3020p0 f47359r;

    /* renamed from: s */
    ZaloZinstantLayout f47360s;

    /* renamed from: t */
    InterfaceC20578a0 f47361t;

    /* renamed from: u */
    InterfaceC22508f f47362u;

    /* renamed from: v */
    AbstractC23803b f47363v;

    /* renamed from: w */
    boolean f47364w;

    /* renamed from: x */
    int f47365x;

    /* renamed from: y */
    final int f47366y;

    /* renamed from: z */
    InterfaceC8343n5 f47367z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.FeedZinstantBanner$a */
    /* loaded from: classes4.dex */
    public class C8864a extends AbstractC23803b {
        C8864a() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            if (str3.equals("action.window.close")) {
                AbstractC20826v0.m108806e0(FeedZinstantBanner.this.f47359r.f12057p);
                InterfaceC2259a interfaceC2259a = FeedZinstantBanner.this.f47356C;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11927O();
                }
                ZaloZinstantLayout zaloZinstantLayout = FeedZinstantBanner.this.f47360s;
                if (zaloZinstantLayout != null) {
                    zaloZinstantLayout.onStop();
                    return;
                }
                return;
            }
            FeedZinstantBanner feedZinstantBanner = FeedZinstantBanner.this;
            InterfaceC2259a interfaceC2259a2 = feedZinstantBanner.f47356C;
            if (interfaceC2259a2 != null) {
                interfaceC2259a2.mo11975xt(str3, str4, feedZinstantBanner.f47358q);
            }
            C3020p0 c3020p0 = FeedZinstantBanner.this.f47359r;
            C3014o c3014o = c3020p0.f12023C.f12135z.f12168s;
            if (c3014o != null && c3014o.f11995a) {
                AbstractC20826v0.m108806e0(c3020p0.f12057p);
                InterfaceC2259a interfaceC2259a3 = FeedZinstantBanner.this.f47356C;
                if (interfaceC2259a3 != null) {
                    interfaceC2259a3.mo11927O();
                }
                ZaloZinstantLayout zaloZinstantLayout2 = FeedZinstantBanner.this.f47360s;
                if (zaloZinstantLayout2 != null) {
                    zaloZinstantLayout2.onStop();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedZinstantBanner$b */
    /* loaded from: classes4.dex */
    class C8865b extends C17170o {
        C8865b() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return FeedZinstantBanner.this.f47365x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.FeedZinstantBanner$c */
    /* loaded from: classes4.dex */
    public class C8866c implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f47370a;

        C8866c(InterfaceC24775a interfaceC24775a) {
            this.f47370a = interfaceC24775a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m47318b(InterfaceC24775a interfaceC24775a) {
            FeedZinstantBanner feedZinstantBanner = FeedZinstantBanner.this;
            feedZinstantBanner.f47364w = false;
            ZaloZinstantLayout zaloZinstantLayout = feedZinstantBanner.f47360s;
            if (zaloZinstantLayout != null) {
                zaloZinstantLayout.onStart();
            }
            interfaceC24775a.onSuccess(FeedZinstantBanner.this);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            FeedZinstantBanner.this.f47364w = false;
            this.f47370a.mo15338c(exc);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            FeedZinstantBanner feedZinstantBanner = FeedZinstantBanner.this;
            C3020p0 c3020p0 = feedZinstantBanner.f47359r;
            if (c3020p0 != null) {
                feedZinstantBanner.f47357p = c3020p0.f12057p;
            }
            final InterfaceC24775a interfaceC24775a = this.f47370a;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.uicontrols.x
                @Override // java.lang.Runnable
                public final void run() {
                    FeedZinstantBanner.C8866c.this.m47318b(interfaceC24775a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.FeedZinstantBanner$d */
    /* loaded from: classes4.dex */
    public class C8867d implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f47372a;

        C8867d(InterfaceC24775a interfaceC24775a) {
            this.f47372a = interfaceC24775a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m47321d(InterfaceC20578a0 interfaceC20578a0, InterfaceC24775a interfaceC24775a) {
            FeedZinstantBanner feedZinstantBanner = FeedZinstantBanner.this;
            feedZinstantBanner.f47361t = interfaceC20578a0;
            feedZinstantBanner.m47312b();
            FeedZinstantBanner.this.m47313c(interfaceC24775a);
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(final InterfaceC20578a0 interfaceC20578a0) {
            final InterfaceC24775a interfaceC24775a = this.f47372a;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.uicontrols.y
                @Override // java.lang.Runnable
                public final void run() {
                    FeedZinstantBanner.C8867d.this.m47321d(interfaceC20578a0, interfaceC24775a);
                }
            });
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            FeedZinstantBanner.this.f47364w = false;
            this.f47372a.mo15338c(exc);
        }
    }

    public FeedZinstantBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47357p = "";
        this.f47364w = false;
        this.f47366y = 8;
        this.f47367z = null;
        this.f47354A = new C8865b();
        this.f47356C = null;
    }

    /* renamed from: d */
    private boolean m47310d() {
        InterfaceC8343n5 interfaceC8343n5;
        if (isAttachedToWindow() && (interfaceC8343n5 = this.f47367z) != null && interfaceC8343n5.mo44786a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m47311a(String str, String str2, int i11) {
        InterfaceC20578a0 interfaceC20578a0;
        InterfaceC17139d interfaceC17139d;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C17244x0 c17244x0 = new C17244x0(8, new JSONObject(str));
            if (this.f47357p.equals(str2) && this.f47362u != null && c17244x0.m92064b() != null && c17244x0.m92064b().getZinstantDataId().equals(this.f47362u.getZinstantDataId()) && (interfaceC20578a0 = this.f47361t) != null) {
                ZaloZinstantLayout zaloZinstantLayout = this.f47360s;
                if (zaloZinstantLayout != null) {
                    interfaceC17139d = zaloZinstantLayout.f87804S;
                } else {
                    interfaceC17139d = null;
                }
                if (interfaceC20578a0.checkIntegrity(i11, -1, AbstractC17158i1.f87698h, AbstractC17158i1.m91746e(), interfaceC17139d, this.f47362u.mo116353c())) {
                    return true;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return false;
    }

    /* renamed from: b */
    void m47312b() {
        if (this.f47363v == null) {
            this.f47363v = new C8864a();
        }
    }

    /* renamed from: c */
    void m47313c(InterfaceC24775a interfaceC24775a) {
        if (this.f47360s == null) {
            this.f47364w = false;
            return;
        }
        if (this.f47355B == null) {
            this.f47355B = new C8866c(interfaceC24775a);
        }
        InterfaceC22508f interfaceC22508f = this.f47362u;
        if (interfaceC22508f == null) {
            this.f47364w = false;
            interfaceC24775a.mo15338c(new Exception("ZinstantAPIInfo is invalid"));
        } else {
            this.f47360s.m91447b1(interfaceC22508f, this.f47361t);
            this.f47360s.setOnZinstantClickListener(this.f47363v);
            this.f47360s.m91445Y0(this.f47354A, this.f47355B);
        }
    }

    /* renamed from: e */
    public void m47314e() {
        ZaloZinstantLayout zaloZinstantLayout = this.f47360s;
        if (zaloZinstantLayout != null) {
            if (!zaloZinstantLayout.m91989T()) {
                this.f47360s.onStart();
            }
            this.f47360s.m91993g0();
        }
    }

    /* renamed from: f */
    public void m47315f(String str, int i11, InterfaceC24775a interfaceC24775a) {
        if (i11 <= 0) {
            interfaceC24775a.mo15338c(new Exception("TargetWidth is invalid"));
            return;
        }
        if (this.f47364w) {
            return;
        }
        this.f47364w = true;
        this.f47365x = i11;
        try {
            InterfaceC22508f m92064b = new C17244x0(8, new JSONObject(str)).m92064b();
            this.f47362u = m92064b;
            if (m92064b == null) {
                interfaceC24775a.mo15338c(new Exception("ZinstantAPIInfo is invalid"));
            } else {
                AbstractC17148f0.m91694m(m92064b, i11, new C8867d(interfaceC24775a));
            }
        } catch (Exception e11) {
            this.f47364w = false;
            e11.printStackTrace();
            interfaceC24775a.mo15338c(e11);
        }
    }

    /* renamed from: g */
    public void m47316g(C3020p0 c3020p0, TrackingSource trackingSource) {
        this.f47359r = c3020p0;
        this.f47358q = trackingSource;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onPause();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f47360s = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onPause() {
        if (this.f47360s != null && isAttachedToWindow()) {
            this.f47360s.onPause();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        if (this.f47360s != null && m47310d()) {
            this.f47360s.onResume();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        if (this.f47360s != null && m47310d()) {
            this.f47360s.onStart();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        if (this.f47360s != null && isAttachedToWindow()) {
            this.f47360s.onStop();
        }
    }

    public void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f47356C = interfaceC2259a;
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8395t6
    public void setParentStateInfoProvider(InterfaceC8343n5 interfaceC8343n5) {
        this.f47367z = interfaceC8343n5;
    }

    public FeedZinstantBanner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f47357p = "";
        this.f47364w = false;
        this.f47366y = 8;
        this.f47367z = null;
        this.f47354A = new C8865b();
        this.f47356C = null;
    }
}
