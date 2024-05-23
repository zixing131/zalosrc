package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bo.C3060y1;
import bo.InterfaceC2947a2;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.components.FeedItemMemoryEntry;
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
import nj0.AbstractC23803b;
import ok0.InterfaceC24284a;
import p716zh.C31877d;
import pj0.InterfaceC24775a;

/* loaded from: classes4.dex */
public class FeedItemMemoryEntry extends FrameLayout implements InterfaceC8395t6 {

    /* renamed from: p */
    ZaloZinstantLayout f44522p;

    /* renamed from: q */
    View f44523q;

    /* renamed from: r */
    View f44524r;

    /* renamed from: s */
    InterfaceC2947a2 f44525s;

    /* renamed from: t */
    volatile boolean f44526t;

    /* renamed from: u */
    Handler f44527u;

    /* renamed from: v */
    InterfaceC24284a f44528v;

    /* renamed from: w */
    InterfaceC24775a f44529w;

    /* renamed from: x */
    InterfaceC8100e f44530x;

    /* renamed from: y */
    InterfaceC8343n5 f44531y;

    /* renamed from: z */
    C17170o f44532z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMemoryEntry$a */
    /* loaded from: classes4.dex */
    public class C8096a implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f44533a;

        C8096a(InterfaceC22508f interfaceC22508f) {
            this.f44533a = interfaceC22508f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m43862d() {
            try {
                FeedItemMemoryEntry.this.m43848g();
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedItemMemoryEntry.this.f44526t = true;
                FeedItemMemoryEntry.this.m43856r(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            try {
                FeedItemMemoryEntry.this.f44522p.m91447b1(this.f44533a, interfaceC20578a0);
                FeedItemMemoryEntry.this.post(new Runnable() { // from class: com.zing.zalo.feed.components.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemMemoryEntry.C8096a.this.m43862d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedItemMemoryEntry.this.f44526t = true;
                FeedItemMemoryEntry.this.m43856r(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            FeedItemMemoryEntry.this.f44526t = true;
            FeedItemMemoryEntry.this.m43856r(false);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemMemoryEntry$b */
    /* loaded from: classes4.dex */
    class C8097b extends C17170o {
        C8097b() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return AbstractC23136l9.m118722k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMemoryEntry$c */
    /* loaded from: classes4.dex */
    public class C8098c extends AbstractC23803b {
        C8098c() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            String str6;
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            if (FeedItemMemoryEntry.this.f44530x == null) {
                return;
            }
            String str7 = "";
            if (!TextUtils.isEmpty(str3)) {
                if (str3.equals("action.open.memoryentry.popupmenu")) {
                    FeedItemMemoryEntry feedItemMemoryEntry = FeedItemMemoryEntry.this;
                    InterfaceC8100e interfaceC8100e = feedItemMemoryEntry.f44530x;
                    InterfaceC2947a2 interfaceC2947a2 = feedItemMemoryEntry.f44525s;
                    if (interfaceC2947a2 == null) {
                        str6 = "";
                    } else {
                        str6 = interfaceC2947a2.mo13953e();
                    }
                    interfaceC8100e.mo43866b(str6);
                } else {
                    C3060y1 c3060y1 = null;
                    if (str3.equals("action.open.sharefeedmemory")) {
                        InterfaceC2947a2 interfaceC2947a22 = FeedItemMemoryEntry.this.f44525s;
                        if (interfaceC2947a22 != null) {
                            c3060y1 = interfaceC2947a22.mo13954f();
                        }
                        if (c3060y1 != null) {
                            FeedItemMemoryEntry.this.f44530x.mo43868d(str3, c3060y1.m14711c().toString());
                        }
                    } else if (str3.equals("action.open.memorydetails")) {
                        InterfaceC2947a2 interfaceC2947a23 = FeedItemMemoryEntry.this.f44525s;
                        if (interfaceC2947a23 != null) {
                            c3060y1 = interfaceC2947a23.mo13954f();
                        }
                        if (c3060y1 != null) {
                            FeedItemMemoryEntry.this.f44530x.mo43865a(str3, c3060y1.m14711c().toString());
                        }
                    } else {
                        FeedItemMemoryEntry.this.f44530x.mo43864V2(str3, str4, new C31877d());
                    }
                }
            }
            FeedItemMemoryEntry feedItemMemoryEntry2 = FeedItemMemoryEntry.this;
            InterfaceC8100e interfaceC8100e2 = feedItemMemoryEntry2.f44530x;
            InterfaceC2947a2 interfaceC2947a24 = feedItemMemoryEntry2.f44525s;
            if (interfaceC2947a24 != null) {
                str7 = interfaceC2947a24.mo13953e();
            }
            interfaceC8100e2.mo43867c(str7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMemoryEntry$d */
    /* loaded from: classes4.dex */
    public class C8099d implements InterfaceC24775a {
        C8099d() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            FeedItemMemoryEntry.this.m43856r(true);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            FeedItemMemoryEntry.this.f44526t = true;
            FeedItemMemoryEntry.this.m43856r(false);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemMemoryEntry$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC8100e {
        /* renamed from: V2 */
        void mo43864V2(String str, String str2, C31877d c31877d);

        /* renamed from: a */
        void mo43865a(String str, String str2);

        /* renamed from: b */
        void mo43866b(String str);

        /* renamed from: c */
        void mo43867c(String str);

        /* renamed from: d */
        void mo43868d(String str, String str2);
    }

    public FeedItemMemoryEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44526t = false;
        this.f44527u = new Handler(Looper.getMainLooper());
        this.f44531y = null;
        this.f44532z = new C8097b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m43848g() {
        if (this.f44522p == null) {
            return;
        }
        m43858f();
        m43859h();
        this.f44522p.setOnZinstantClickListener(this.f44528v);
        this.f44522p.m91445Y0(this.f44532z, this.f44529w);
    }

    /* renamed from: i */
    private void m43849i(InterfaceC22508f interfaceC22508f, InterfaceC20578a0 interfaceC20578a0) {
        try {
            this.f44526t = false;
            this.f44522p.m91447b1(interfaceC22508f, interfaceC20578a0);
            m43848g();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f44526t = true;
        }
    }

    /* renamed from: j */
    private boolean m43850j(InterfaceC2947a2 interfaceC2947a2, InterfaceC2947a2 interfaceC2947a22) {
        if (interfaceC2947a2 != null && interfaceC2947a22 != null) {
            return !interfaceC2947a2.mo13952d(interfaceC2947a22);
        }
        if (interfaceC2947a2 != null || interfaceC2947a22 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m43851k() {
        InterfaceC8343n5 interfaceC8343n5;
        if (isAttachedToWindow() && (interfaceC8343n5 = this.f44531y) != null && interfaceC8343n5.mo44786a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m43852l(View view) {
        m43857e(this.f44525s);
    }

    /* renamed from: p */
    private void m43854p(InterfaceC22508f interfaceC22508f, int i11) {
        if (interfaceC22508f == null) {
            return;
        }
        this.f44526t = false;
        AbstractC17148f0.m91694m(interfaceC22508f, i11, new C8096a(interfaceC22508f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m43853m(boolean z11) {
        int i11;
        ZaloZinstantLayout zaloZinstantLayout = this.f44522p;
        int i12 = 8;
        if (zaloZinstantLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            zaloZinstantLayout.setVisibility(i11);
        }
        View view = this.f44523q;
        if (view != null) {
            if (!z11) {
                i12 = 0;
            }
            view.setVisibility(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m43856r(final boolean z11) {
        Handler handler = this.f44527u;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.w2
                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemMemoryEntry.this.m43853m(z11);
                }
            });
        }
    }

    /* renamed from: e */
    public void m43857e(InterfaceC2947a2 interfaceC2947a2) {
        C17244x0 mo13950b;
        InterfaceC20578a0 interfaceC20578a0 = null;
        if (interfaceC2947a2 != null) {
            try {
                mo13950b = interfaceC2947a2.mo13950b();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo13950b = null;
        }
        if (interfaceC2947a2 != null) {
            interfaceC20578a0 = interfaceC2947a2.mo13951c();
        }
        if (mo13950b != null && this.f44522p != null) {
            if (m43850j(interfaceC2947a2, this.f44525s)) {
                this.f44522p.m91973J0();
            }
            if (!this.f44522p.m91989T()) {
                this.f44522p.onStart();
            }
            this.f44522p.m91993g0();
            this.f44525s = interfaceC2947a2;
            if (mo13950b.m92064b() != null) {
                m43853m(true);
                if (interfaceC20578a0 != null) {
                    m43849i(mo13950b.m92064b(), interfaceC20578a0);
                    return;
                } else {
                    m43854p(mo13950b.m92064b(), interfaceC2947a2.mo13949a());
                    return;
                }
            }
            m43853m(false);
        }
    }

    /* renamed from: f */
    void m43858f() {
        if (this.f44528v == null) {
            this.f44528v = new C8098c();
        }
    }

    /* renamed from: h */
    void m43859h() {
        if (this.f44529w == null) {
            this.f44529w = new C8099d();
        }
    }

    /* renamed from: n */
    public boolean m43860n(InterfaceC2947a2 interfaceC2947a2) {
        return this.f44526t || this.f44525s != interfaceC2947a2;
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
        this.f44522p = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
        this.f44523q = findViewById(AbstractC6918a0.layout_feed_memory_error);
        View findViewById = findViewById(AbstractC6918a0.layout_retry);
        this.f44524r = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemMemoryEntry.this.m43852l(view);
            }
        });
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onPause() {
        if (this.f44522p != null && isAttachedToWindow()) {
            this.f44522p.onPause();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        if (this.f44522p != null && m43851k()) {
            this.f44522p.onResume();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        if (this.f44522p != null && m43851k()) {
            this.f44522p.onStart();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        if (this.f44522p != null && isAttachedToWindow()) {
            this.f44522p.onStop();
        }
    }

    public void setFeedItemMemoryEntryListener(InterfaceC8100e interfaceC8100e) {
        this.f44530x = interfaceC8100e;
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8395t6
    public void setParentStateInfoProvider(InterfaceC8343n5 interfaceC8343n5) {
        this.f44531y = interfaceC8343n5;
    }

    public FeedItemMemoryEntry(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44526t = false;
        this.f44527u = new Handler(Looper.getMainLooper());
        this.f44531y = null;
        this.f44532z = new C8097b();
    }
}
