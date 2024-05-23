package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import ao.InterfaceC2259a;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import hk0.InterfaceC20083a;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nj0.AbstractC23803b;
import ok0.InterfaceC24284a;
import p348mi.AbstractC23304d;
import p615wn.C29106b;
import p716zh.C31877d;
import pj0.InterfaceC24775a;
import tn.C26755j0;

/* loaded from: classes4.dex */
public class FeedItemMemory extends FeedItemBase implements InterfaceC8395t6 {

    /* renamed from: A0 */
    View.OnLayoutChangeListener f44500A0;

    /* renamed from: B0 */
    C17244x0 f44501B0;

    /* renamed from: C0 */
    C3020p0 f44502C0;

    /* renamed from: D0 */
    double f44503D0;

    /* renamed from: E0 */
    int f44504E0;

    /* renamed from: F0 */
    Handler f44505F0;

    /* renamed from: G0 */
    InterfaceC8343n5 f44506G0;

    /* renamed from: H0 */
    C17170o f44507H0;

    /* renamed from: r0 */
    ZaloZinstantLayout f44508r0;

    /* renamed from: s0 */
    View f44509s0;

    /* renamed from: t0 */
    View f44510t0;

    /* renamed from: u0 */
    InterfaceC22508f f44511u0;

    /* renamed from: v0 */
    volatile boolean f44512v0;

    /* renamed from: w0 */
    volatile boolean f44513w0;

    /* renamed from: x0 */
    InterfaceC24284a f44514x0;

    /* renamed from: y0 */
    InterfaceC24775a f44515y0;

    /* renamed from: z0 */
    InterfaceC2259a f44516z0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemMemory$a */
    /* loaded from: classes4.dex */
    public class C8092a implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f44517a;

        C8092a(InterfaceC22508f interfaceC22508f) {
            this.f44517a = interfaceC22508f;
        }

        /* renamed from: d */
        public /* synthetic */ void m43841d() {
            try {
                FeedItemMemory.this.m43825Z();
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedItemMemory.this.m43836l0(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            try {
                FeedItemMemory.this.m43833i0(this.f44517a.getZinstantDataId(), interfaceC20578a0);
                FeedItemMemory.this.f44508r0.m91447b1(this.f44517a, interfaceC20578a0);
                FeedItemMemory.this.post(new Runnable() { // from class: com.zing.zalo.feed.components.u2
                    public /* synthetic */ RunnableC8399u2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemMemory.C8092a.this.m43841d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedItemMemory.this.m43836l0(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            FeedItemMemory.this.m43836l0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMemory$b */
    /* loaded from: classes4.dex */
    public class C8093b extends C17170o {
        C8093b() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return FeedItemMemory.this.getTargetWidth();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemMemory$c */
    /* loaded from: classes4.dex */
    public class C8094c extends AbstractC23803b {
        C8094c() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            C3020p0 c3020p0;
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            FeedItemMemory feedItemMemory = FeedItemMemory.this;
            if (feedItemMemory.f44516z0 != null && (c3020p0 = feedItemMemory.f44502C0) != null && !c3020p0.m14493X() && !TextUtils.isEmpty(str3)) {
                if (str3.equals("action.open.memorydetails")) {
                    FeedItemMemory feedItemMemory2 = FeedItemMemory.this;
                    feedItemMemory2.f44516z0.mo11931R5(feedItemMemory2.f44502C0);
                } else {
                    FeedItemMemory.this.f44516z0.mo11938V2(str3, str4, new C31877d());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemMemory$d */
    /* loaded from: classes4.dex */
    public class C8095d implements InterfaceC24775a {
        C8095d() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(Void r22) {
            FeedItemMemory.this.f44513w0 = true;
            FeedItemMemory.this.m43836l0(true);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            FeedItemMemory feedItemMemory = FeedItemMemory.this;
            InterfaceC22508f interfaceC22508f = feedItemMemory.f44511u0;
            if (interfaceC22508f != null) {
                feedItemMemory.m43832h0(interfaceC22508f.getZinstantDataId());
            }
            FeedItemMemory.this.m43836l0(false);
        }
    }

    public FeedItemMemory(Context context) {
        super(context);
        this.f44512v0 = false;
        this.f44513w0 = false;
        this.f44503D0 = -1.0d;
        this.f44504E0 = 0;
        this.f44505F0 = new Handler(Looper.getMainLooper());
        this.f44506G0 = null;
        this.f44507H0 = new C8093b();
    }

    /* renamed from: X */
    private InterfaceC20578a0 m43824X(String str) {
        String feedMemoryId = getFeedMemoryId();
        if (TextUtils.isEmpty(feedMemoryId) || TextUtils.isEmpty(str)) {
            return null;
        }
        String m137715c = C26755j0.m137715c(feedMemoryId, str, getTargetWidth());
        if (TextUtils.isEmpty(m137715c)) {
            return null;
        }
        return C26755j0.m137716d().m137721e(m137715c);
    }

    /* renamed from: Z */
    public void m43825Z() {
        if (this.f44508r0 == null) {
            return;
        }
        m43838Y();
        m43839a0();
        this.f44508r0.setOnZinstantClickListener(this.f44514x0);
        this.f44508r0.m91445Y0(this.f44507H0, this.f44515y0);
    }

    /* renamed from: b0 */
    private boolean m43826b0(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        C3020p0 c3020p02 = this.f44502C0;
        if (c3020p0 == c3020p02) {
            return false;
        }
        C3025q0 c3025q02 = null;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3020p02 != null) {
            c3025q02 = c3020p02.f12023C;
        }
        if (c3025q0 != null && c3025q02 != null) {
            return !c3025q0.m14570g(c3025q02);
        }
        if (c3025q0 == null && c3025q02 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private boolean m43827c0() {
        InterfaceC8343n5 interfaceC8343n5;
        if (isAttachedToWindow() && (interfaceC8343n5 = this.f44506G0) != null && interfaceC8343n5.mo44786a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public /* synthetic */ void m43828d0(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        View.OnLayoutChangeListener onLayoutChangeListener = this.f44500A0;
        if (onLayoutChangeListener != null) {
            onLayoutChangeListener.onLayoutChange(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ void m43829e0(View view) {
        this.f44512v0 = false;
        m43837W(this.f44502C0, false);
    }

    /* renamed from: g0 */
    private void m43831g0(InterfaceC22508f interfaceC22508f) {
        AbstractC17148f0.m91694m(interfaceC22508f, getTargetWidth(), new C8092a(interfaceC22508f));
    }

    private String getFeedMemoryId() {
        C3025q0 c3025q0;
        C3020p0 c3020p0 = this.f44502C0;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null) {
            return c3025q0.f12101J;
        }
        return "";
    }

    public int getTargetWidth() {
        int i11 = this.f44296f0;
        if (i11 != 2 && i11 != 3) {
            if (i11 == 6) {
                int m118681V = AbstractC23136l9.m118681V() - (AbstractC23136l9.m118742r(40.0f) * 2);
                int i12 = this.f44504E0;
                if (i12 > 0) {
                    m118681V = i12;
                }
                return m118681V - (AbstractC23136l9.m118742r(10.0f) * 2);
            }
            return AbstractC23136l9.m118722k0();
        }
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile);
        return ((AbstractC23136l9.m118722k0() - m118655I) - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile)) - (AbstractC23136l9.m118742r(12.0f) * 2);
    }

    /* renamed from: h0 */
    public void m43832h0(String str) {
        String feedMemoryId = getFeedMemoryId();
        if (!TextUtils.isEmpty(feedMemoryId) && !TextUtils.isEmpty(str)) {
            C26755j0.m137716d().m137724l(C26755j0.m137715c(feedMemoryId, str, getTargetWidth()));
        }
    }

    /* renamed from: i0 */
    public void m43833i0(String str, InterfaceC20578a0 interfaceC20578a0) {
        String feedMemoryId = getFeedMemoryId();
        if (!TextUtils.isEmpty(feedMemoryId) && !TextUtils.isEmpty(str) && interfaceC20578a0 != null) {
            C26755j0.m137716d().m137726n(C26755j0.m137715c(feedMemoryId, str, getTargetWidth()), interfaceC20578a0);
        }
    }

    /* renamed from: j0 */
    private void m43834j0() {
        C3020p0 c3020p0;
        try {
            if (this.f44508r0 != null && this.f44513w0 && (c3020p0 = this.f44502C0) != null && !c3020p0.f12023C.f12105N) {
                int width = this.f44508r0.getWidth();
                int height = this.f44508r0.getHeight();
                if (width > 0 && height > 0) {
                    AbstractC23304d.m120555z((width * 1.0f) / height);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k0 */
    public void m43830f0(boolean z11) {
        int i11;
        ZaloZinstantLayout zaloZinstantLayout = this.f44508r0;
        int i12 = 8;
        if (zaloZinstantLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            zaloZinstantLayout.setVisibility(i11);
        }
        View view = this.f44509s0;
        if (view != null) {
            if (!z11) {
                i12 = 0;
            }
            view.setVisibility(i12);
        }
        this.f44512v0 = !z11;
    }

    /* renamed from: l0 */
    public void m43836l0(boolean z11) {
        Handler handler = this.f44505F0;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.t2

                /* renamed from: q */
                public final /* synthetic */ boolean f45716q;

                public /* synthetic */ RunnableC8391t2(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemMemory.this.m43830f0(r2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:            if (r4.f44509s0.getVisibility() != 0) goto L54;     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setUpHeight(double d11) {
        boolean z11;
        View view;
        if (d11 > 0.0d && d11 != this.f44503D0) {
            this.f44503D0 = d11;
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);
            int targetWidth = getTargetWidth();
            if (d11 > 0.0d) {
                m118655I = (int) ((targetWidth * 1.0d) / d11);
            }
            ZaloZinstantLayout zaloZinstantLayout = this.f44508r0;
            if (zaloZinstantLayout != null && zaloZinstantLayout.getHeight() != m118655I) {
                this.f44508r0.getLayoutParams().height = m118655I;
                if (this.f44508r0.getVisibility() == 0) {
                    z11 = true;
                    view = this.f44509s0;
                    if (view != null && view.getHeight() != m118655I) {
                        this.f44509s0.getLayoutParams().height = m118655I;
                    }
                    if (!z11) {
                        return;
                    }
                    requestLayout();
                }
            }
            z11 = false;
            view = this.f44509s0;
            if (view != null) {
                this.f44509s0.getLayoutParams().height = m118655I;
            }
            if (!z11) {
            }
            requestLayout();
        }
    }

    /* renamed from: W */
    public void m43837W(C3020p0 c3020p0, boolean z11) {
        C3025q0 c3025q0;
        double d11;
        C17244x0 c17244x0;
        try {
            this.f44513w0 = false;
            if (m43826b0(c3020p0)) {
                this.f44508r0.m91973J0();
                this.f44512v0 = false;
            }
            if (!this.f44508r0.m91989T()) {
                this.f44508r0.onStart();
            }
            this.f44508r0.m91993g0();
            this.f44502C0 = c3020p0;
            InterfaceC22508f interfaceC22508f = null;
            if (c3020p0 != null) {
                c3025q0 = c3020p0.f12023C;
            } else {
                c3025q0 = null;
            }
            if (c3025q0 != null) {
                if (c3025q0.f12105N) {
                    d11 = c3025q0.f12103L;
                } else {
                    d11 = AbstractC23304d.f113376d3;
                }
            } else {
                d11 = -1.0d;
            }
            setUpHeight(d11);
            if (c3025q0 != null) {
                c17244x0 = c3025q0.f12104M;
            } else {
                c17244x0 = null;
            }
            this.f44501B0 = c17244x0;
            if (c17244x0 != null) {
                interfaceC22508f = c17244x0.m92064b();
            }
            if (interfaceC22508f != null && !this.f44512v0) {
                m43830f0(true);
                InterfaceC20578a0 m43824X = m43824X(interfaceC22508f.getZinstantDataId());
                this.f44511u0 = interfaceC22508f;
                if (m43824X != null) {
                    this.f44508r0.m91447b1(interfaceC22508f, m43824X);
                    m43825Z();
                    return;
                } else {
                    this.f44508r0.setUseProgressLoading(true);
                    m43831g0(this.f44511u0);
                    return;
                }
            }
            m43830f0(false);
        } catch (Exception e11) {
            e11.printStackTrace();
            m43830f0(false);
        }
    }

    /* renamed from: Y */
    void m43838Y() {
        if (this.f44514x0 == null) {
            this.f44514x0 = new C8094c();
        }
    }

    /* renamed from: a0 */
    void m43839a0() {
        if (this.f44515y0 == null) {
            this.f44515y0 = new C8095d();
        }
    }

    public int getZinstantLayoutHeight() {
        ZaloZinstantLayout zaloZinstantLayout = this.f44508r0;
        if (zaloZinstantLayout != null) {
            return zaloZinstantLayout.getMeasuredHeight();
        }
        return 0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        setFeedContent(c29106b.f134937a);
        mo43681A(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134942f);
        m43682E(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g);
        setFeedCallback(c29106b.f134941e);
        m43837W(c29106b.f134938b, c29106b.f134940d);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onResume();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44513w0 = false;
        onPause();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        m43834j0();
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onPause() {
        if (this.f44508r0 != null && isAttachedToWindow()) {
            this.f44508r0.onPause();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        if (this.f44508r0 != null && m43827c0()) {
            this.f44508r0.onResume();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        if (this.f44508r0 != null && m43827c0()) {
            this.f44508r0.onStart();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        if (this.f44508r0 != null && isAttachedToWindow()) {
            this.f44508r0.onStop();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        this.f44296f0 = i11;
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            if (i11 == 0) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_memory_content_timeline, this);
            } else if (i11 == 4) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_memory_content_details, this);
            } else {
                if (i11 != 2 && this.f44296f0 != 3) {
                    if (i11 == 6) {
                        layoutInflater.inflate(AbstractC7409c0.feed_item_memory_content_chat, this);
                    }
                }
                layoutInflater.inflate(AbstractC7409c0.feed_item_memory_content_profile, this);
                setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
            }
            ZaloZinstantLayout zaloZinstantLayout = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
            this.f44508r0 = zaloZinstantLayout;
            zaloZinstantLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.feed.components.r2
                public /* synthetic */ ViewOnLayoutChangeListenerC8372r2() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    FeedItemMemory.this.m43828d0(view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
            this.f44509s0 = findViewById(AbstractC6918a0.layout_feed_memory_error);
            View findViewById = findViewById(AbstractC6918a0.layout_retry);
            this.f44510t0 = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.s2
                public /* synthetic */ ViewOnClickListenerC8380s2() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemMemory.this.m43829e0(view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    public void setChatRowMsgFeedWidth(int i11) {
        this.f44504E0 = i11;
    }

    public void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f44516z0 = interfaceC2259a;
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8395t6
    public void setParentStateInfoProvider(InterfaceC8343n5 interfaceC8343n5) {
        this.f44506G0 = interfaceC8343n5;
    }

    public void setZinstantLayoutChangedListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f44500A0 = onLayoutChangeListener;
    }

    public FeedItemMemory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44512v0 = false;
        this.f44513w0 = false;
        this.f44503D0 = -1.0d;
        this.f44504E0 = 0;
        this.f44505F0 = new Handler(Looper.getMainLooper());
        this.f44506G0 = null;
        this.f44507H0 = new C8093b();
    }
}
