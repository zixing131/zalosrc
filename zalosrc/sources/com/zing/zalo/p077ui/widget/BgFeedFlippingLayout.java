package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.BgFeedFlippingLayout;
import com.zing.zalo.uicontrol.SlideshowLayout;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31890dc;

/* loaded from: classes6.dex */
public class BgFeedFlippingLayout extends FrameLayout {

    /* renamed from: y */
    public static boolean f68950y;

    /* renamed from: p */
    SlideshowLayout f68951p;

    /* renamed from: q */
    RecyclingImageView f68952q;

    /* renamed from: r */
    RecyclingImageView f68953r;

    /* renamed from: s */
    List f68954s;

    /* renamed from: t */
    C23528a f68955t;

    /* renamed from: u */
    int f68956u;

    /* renamed from: v */
    boolean f68957v;

    /* renamed from: w */
    boolean f68958w;

    /* renamed from: x */
    Handler f68959x;

    /* renamed from: com.zing.zalo.ui.widget.BgFeedFlippingLayout$a */
    /* loaded from: classes6.dex */
    class HandlerC13467a extends Handler {
        HandlerC13467a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                BgFeedFlippingLayout bgFeedFlippingLayout = BgFeedFlippingLayout.this;
                SlideshowLayout slideshowLayout = bgFeedFlippingLayout.f68951p;
                if (slideshowLayout != null && !bgFeedFlippingLayout.f68957v && !slideshowLayout.m88000b()) {
                    BgFeedFlippingLayout.this.m75542c();
                }
                BgFeedFlippingLayout bgFeedFlippingLayout2 = BgFeedFlippingLayout.this;
                if (bgFeedFlippingLayout2.f68958w && BgFeedFlippingLayout.f68950y) {
                    bgFeedFlippingLayout2.f68959x.sendEmptyMessageDelayed(0, 1000L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.BgFeedFlippingLayout$b */
    /* loaded from: classes6.dex */
    public class C13468b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ int f68961l1;

        C13468b(int i11) {
            this.f68961l1 = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public /* synthetic */ void m75545H3(int i11) {
            BgFeedFlippingLayout.this.f68956u = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                BgFeedFlippingLayout bgFeedFlippingLayout = BgFeedFlippingLayout.this;
                bgFeedFlippingLayout.f68957v = false;
                bgFeedFlippingLayout.f68951p.m88003e(null, c3979l);
                SlideshowLayout slideshowLayout = BgFeedFlippingLayout.this.f68951p;
                final int i11 = this.f68961l1;
                slideshowLayout.m88001c(i11, true, new SlideshowLayout.InterfaceC16505c() { // from class: com.zing.zalo.ui.widget.b
                    @Override // com.zing.zalo.uicontrol.SlideshowLayout.InterfaceC16505c
                    /* renamed from: a */
                    public final void mo76018a() {
                        BgFeedFlippingLayout.C13468b.this.m75545H3(i11);
                    }
                });
                BgFeedFlippingLayout.this.f68952q.setImageInfo(c3979l, true);
            } catch (Exception e11) {
                BgFeedFlippingLayout.this.f68957v = false;
                e11.printStackTrace();
            }
        }
    }

    public BgFeedFlippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68956u = -1;
        this.f68959x = new HandlerC13467a(Looper.getMainLooper());
        m75541b(context, attributeSet);
    }

    /* renamed from: a */
    public void m75540a() {
        this.f68959x.removeMessages(0);
        SlideshowLayout slideshowLayout = this.f68951p;
        if (slideshowLayout != null) {
            slideshowLayout.m88002d();
        }
        this.f68958w = false;
    }

    /* renamed from: b */
    void m75541b(Context context, AttributeSet attributeSet) {
        this.f68955t = new C23528a(context);
        this.f68957v = false;
        this.f68952q = new RecyclingImageView(context, attributeSet);
        this.f68953r = new RecyclingImageView(context, attributeSet);
        SlideshowLayout slideshowLayout = new SlideshowLayout(context, attributeSet);
        this.f68951p = slideshowLayout;
        addView(slideshowLayout);
    }

    /* renamed from: c */
    void m75542c() {
        try {
            List list = this.f68954s;
            if (list != null && !list.isEmpty()) {
                int size = (this.f68956u + 1) % this.f68954s.size();
                C31890dc c31890dc = (C31890dc) this.f68954s.get(size);
                if (c31890dc != null) {
                    try {
                        if (!TextUtils.isEmpty(c31890dc.f146496b)) {
                            this.f68957v = true;
                            ((C23528a) this.f68955t.m123612r(this.f68952q)).m123579C(c31890dc.f146496b, C23278z2.m120165z(), new C13468b(size));
                            C31890dc c31890dc2 = (C31890dc) this.f68954s.get((size + 1) % this.f68954s.size());
                            if (!TextUtils.isEmpty(c31890dc2.f146496b) && !C23999j.m125696L2(c31890dc2.f146496b, C23278z2.m120165z())) {
                                ((C23528a) this.f68955t.m123612r(this.f68953r)).m123618x(c31890dc2.f146496b, C23278z2.m120165z());
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.f68957v = false;
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m75543d() {
        if (!f68950y) {
            return;
        }
        List list = this.f68954s;
        if (list != null && !list.isEmpty()) {
            if (this.f68959x.hasMessages(0)) {
                return;
            }
            this.f68959x.sendEmptyMessage(0);
            this.f68958w = true;
            return;
        }
        this.f68959x.removeMessages(0);
    }

    public int getCurrentBgId() {
        try {
            List list = this.f68954s;
            if (list == null || list.isEmpty()) {
                return -100;
            }
            return ((C31890dc) this.f68954s.get(this.f68956u)).f146495a;
        } catch (Exception unused) {
            return -100;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        if (this.f68958w && f68950y) {
            m75543d();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m75540a();
        super.onDetachedFromWindow();
    }

    public void setData(List<C31890dc> list) {
        C31890dc c31890dc;
        if (list == null) {
            return;
        }
        try {
            int i11 = 0;
            if (!list.isEmpty() && (c31890dc = list.get(0)) != null && c31890dc.f146495a == -1) {
                list.remove(0);
            }
            if (list.isEmpty() || !AbstractC23034c6.m118127M()) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(this, i11);
            this.f68954s = list;
            SlideshowLayout slideshowLayout = this.f68951p;
            if (slideshowLayout != null) {
                slideshowLayout.m87999a(list.size(), SlideshowLayout.EnumC16506d.FLIP);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
