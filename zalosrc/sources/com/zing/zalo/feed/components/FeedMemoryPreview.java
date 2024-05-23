package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.FeedMemoryPreview;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import nj0.AbstractC23803b;
import ok0.InterfaceC24284a;
import pj0.InterfaceC24775a;
import tn.C26755j0;

/* loaded from: classes4.dex */
public class FeedMemoryPreview extends FrameLayout implements InterfaceC8403u6 {

    /* renamed from: A */
    C17170o f45003A;

    /* renamed from: p */
    ZaloZinstantLayout f45004p;

    /* renamed from: q */
    View f45005q;

    /* renamed from: r */
    View f45006r;

    /* renamed from: s */
    InterfaceC22508f f45007s;

    /* renamed from: t */
    InterfaceC24775a f45008t;

    /* renamed from: u */
    InterfaceC24284a f45009u;

    /* renamed from: v */
    InterfaceC8207e f45010v;

    /* renamed from: w */
    String f45011w;

    /* renamed from: x */
    double f45012x;

    /* renamed from: y */
    Handler f45013y;

    /* renamed from: z */
    boolean f45014z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedMemoryPreview$a */
    /* loaded from: classes4.dex */
    public class C8203a implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f45015a;

        C8203a(InterfaceC22508f interfaceC22508f) {
            this.f45015a = interfaceC22508f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m44406d() {
            try {
                FeedMemoryPreview.this.m44393l();
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedMemoryPreview.this.m44400v(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            try {
                FeedMemoryPreview.this.m44398s(this.f45015a.getZinstantDataId(), interfaceC20578a0);
                FeedMemoryPreview.this.f45004p.m91447b1(this.f45015a, interfaceC20578a0);
                FeedMemoryPreview.this.post(new Runnable() { // from class: com.zing.zalo.feed.components.f6
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedMemoryPreview.C8203a.this.m44406d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
                FeedMemoryPreview.this.m44400v(false);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            FeedMemoryPreview.this.m44400v(false);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedMemoryPreview$b */
    /* loaded from: classes4.dex */
    class C8204b extends C17170o {
        C8204b() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return FeedMemoryPreview.this.getTargetWidth();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedMemoryPreview$c */
    /* loaded from: classes4.dex */
    public class C8205c implements InterfaceC24775a {
        C8205c() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            FeedMemoryPreview feedMemoryPreview = FeedMemoryPreview.this;
            feedMemoryPreview.f45014z = true;
            feedMemoryPreview.m44400v(true);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            FeedMemoryPreview feedMemoryPreview = FeedMemoryPreview.this;
            InterfaceC22508f interfaceC22508f = feedMemoryPreview.f45007s;
            if (interfaceC22508f != null) {
                feedMemoryPreview.m44397r(interfaceC22508f.getZinstantDataId());
            }
            FeedMemoryPreview.this.m44400v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedMemoryPreview$d */
    /* loaded from: classes4.dex */
    public class C8206d extends AbstractC23803b {
        C8206d() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: b */
        public void mo44408b() {
            super.mo44408b();
            InterfaceC8207e interfaceC8207e = FeedMemoryPreview.this.f45010v;
            if (interfaceC8207e != null) {
                interfaceC8207e.mo44409a();
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            InterfaceC8207e interfaceC8207e = FeedMemoryPreview.this.f45010v;
            if (interfaceC8207e != null) {
                interfaceC8207e.mo44409a();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedMemoryPreview$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC8207e {
        /* renamed from: a */
        void mo44409a();
    }

    public FeedMemoryPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45011w = "";
        this.f45012x = (AbstractC23136l9.m118722k0() * 1.0d) / AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);
        this.f45013y = new Handler(Looper.getMainLooper());
        this.f45003A = new C8204b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTargetWidth() {
        return AbstractC23136l9.m118722k0();
    }

    /* renamed from: i */
    private InterfaceC20578a0 m44392i(String str) {
        if (TextUtils.isEmpty(this.f45011w) || TextUtils.isEmpty(str)) {
            return null;
        }
        String m137715c = C26755j0.m137715c(this.f45011w, str, getTargetWidth());
        if (TextUtils.isEmpty(m137715c)) {
            return null;
        }
        return C26755j0.m137716d().m137721e(m137715c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m44393l() {
        if (this.f45004p == null) {
            return;
        }
        m44403k();
        m44404m();
        this.f45004p.setOnZinstantClickListener(this.f45009u);
        this.f45004p.m91445Y0(this.f45003A, this.f45008t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m44394n(View view) {
        m44401h(this.f45007s);
    }

    /* renamed from: q */
    private void m44396q(InterfaceC22508f interfaceC22508f) {
        AbstractC17148f0.m91694m(interfaceC22508f, getTargetWidth(), new C8203a(interfaceC22508f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m44397r(String str) {
        if (!TextUtils.isEmpty(this.f45011w) && !TextUtils.isEmpty(str)) {
            C26755j0.m137716d().m137724l(C26755j0.m137715c(this.f45011w, str, getTargetWidth()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m44398s(String str, InterfaceC20578a0 interfaceC20578a0) {
        if (!TextUtils.isEmpty(this.f45011w) && !TextUtils.isEmpty(str) && interfaceC20578a0 != null) {
            C26755j0.m137716d().m137726n(C26755j0.m137715c(this.f45011w, str, getTargetWidth()), interfaceC20578a0);
        }
    }

    private void setUpHeight(double d11) {
        boolean z11;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);
        int targetWidth = getTargetWidth();
        if (d11 > 0.0d) {
            m118655I = (int) (targetWidth / d11);
        }
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getHeight() != m118655I) {
            this.f45004p.getLayoutParams().height = m118655I;
            z11 = true;
        } else {
            z11 = false;
        }
        View view = this.f45005q;
        if (view != null && view.getHeight() != m118655I) {
            this.f45005q.getLayoutParams().height = m118655I;
        } else if (!z11) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m44395p(boolean z11) {
        int i11;
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        int i12 = 8;
        if (zaloZinstantLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            zaloZinstantLayout.setVisibility(i11);
        }
        View view = this.f45005q;
        if (view != null) {
            if (!z11) {
                i12 = 0;
            }
            view.setVisibility(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m44400v(final boolean z11) {
        Handler handler = this.f45013y;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.feed.components.e6
                @Override // java.lang.Runnable
                public final void run() {
                    FeedMemoryPreview.this.m44395p(z11);
                }
            });
        }
    }

    public double getPreviewViewRatio() {
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getVisibility() == 0 && this.f45014z) {
            int width = this.f45004p.getWidth();
            int height = this.f45004p.getHeight();
            if (width > 0 && height > 0) {
                return (width * 1.0d) / height;
            }
        }
        return (AbstractC23136l9.m118722k0() * 1.0d) / AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);
    }

    /* renamed from: h */
    public void m44401h(InterfaceC22508f interfaceC22508f) {
        try {
            if (!this.f45004p.m91989T()) {
                this.f45004p.onStart();
            }
            this.f45004p.m91993g0();
            setUpHeight(this.f45012x);
            if (interfaceC22508f != null) {
                this.f45007s = interfaceC22508f;
                m44395p(true);
                InterfaceC20578a0 m44392i = m44392i(interfaceC22508f.getZinstantDataId());
                if (m44392i != null) {
                    this.f45004p.m91447b1(this.f45007s, m44392i);
                    m44393l();
                    return;
                } else {
                    this.f45004p.setUseProgressLoading(true);
                    m44396q(this.f45007s);
                    return;
                }
            }
            m44395p(false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m44395p(false);
        }
    }

    /* renamed from: j */
    public void m44402j(Context context) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_memory_content_timeline, this);
            this.f45004p = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
            this.f45005q = findViewById(AbstractC6918a0.layout_feed_memory_error);
            View findViewById = findViewById(AbstractC6918a0.layout_retry);
            this.f45006r = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.d6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedMemoryPreview.this.m44394n(view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    void m44403k() {
        if (this.f45009u == null) {
            this.f45009u = new C8206d();
        }
    }

    /* renamed from: m */
    void m44404m() {
        if (this.f45008t == null) {
            this.f45008t = new C8205c();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onPause() {
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onPause();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onResume();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStart();
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        ZaloZinstantLayout zaloZinstantLayout = this.f45004p;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStop();
        }
    }

    public void setFeedMemoryId(String str) {
        this.f45011w = str;
    }

    public void setFeedMemoryPreviewClickListener(InterfaceC8207e interfaceC8207e) {
        this.f45010v = interfaceC8207e;
    }

    public void setLayoutRatio(double d11) {
        this.f45012x = d11;
    }
}
