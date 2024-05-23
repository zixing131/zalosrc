package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import com.zing.zalo.feed.components.FeedItemZaloVideoView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19074t;
import hf0.C20040b;
import hf0.C20047i;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public final class FeedItemZaloVideoContainerView extends RelativeLayout implements C20047i.a, C20040b.c {

    /* renamed from: p */
    private FeedItemLinkModulesView f44944p;

    /* renamed from: q */
    private FeedItemZaloVideoView f44945q;

    /* renamed from: r */
    private boolean f44946r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZaloVideoContainerView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f44946r = true;
    }

    /* renamed from: a */
    public final void m44300a(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        setLayoutParams(layoutParams);
        if (this.f44946r) {
            FeedItemZaloVideoView feedItemZaloVideoView = new FeedItemZaloVideoView(context);
            this.f44945q = feedItemZaloVideoView;
            feedItemZaloVideoView.mo43688p(context, i11);
            FeedItemZaloVideoView feedItemZaloVideoView2 = this.f44945q;
            if (feedItemZaloVideoView2 != null) {
                feedItemZaloVideoView2.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
            }
            addView(this.f44945q, -1, -2);
            return;
        }
        FeedItemLinkModulesView feedItemLinkModulesView = new FeedItemLinkModulesView(context);
        this.f44944p = feedItemLinkModulesView;
        addView(feedItemLinkModulesView, -1, -2);
        FeedItemLinkModulesView feedItemLinkModulesView2 = this.f44944p;
        if (feedItemLinkModulesView2 != null) {
            feedItemLinkModulesView2.mo43705j0(context, i11);
        }
    }

    /* renamed from: b */
    public final Boolean m44301b() {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            return Boolean.valueOf(feedItemZaloVideoView.m44356C0());
        }
        return null;
    }

    /* renamed from: c */
    public final void m44302c(int i11, int i12) {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            feedItemZaloVideoView.m44358K0(i11, i12);
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            feedItemZaloVideoView.m44363t0();
        }
    }

    /* renamed from: e */
    public final void m44303e(C3000l0 c3000l0, int i11, boolean z11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a) {
        AbstractC19074t.m100208f(context, "context");
        if (this.f44946r) {
            FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
            if (feedItemZaloVideoView != null) {
                feedItemZaloVideoView.m44360O0(c3000l0, i11, z11, context, interfaceC10867f, interfaceC2259a);
                return;
            }
            return;
        }
        FeedItemLinkModulesView feedItemLinkModulesView = this.f44944p;
        if (feedItemLinkModulesView != null) {
            feedItemLinkModulesView.m43800B0(c3000l0, i11, context, z11, interfaceC2259a, interfaceC10867f);
        }
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            return feedItemZaloVideoView.m44361f();
        }
        return false;
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            return feedItemZaloVideoView.getDataPosition();
        }
        return 0;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            return feedItemZaloVideoView.getNewVideoView();
        }
        return null;
    }

    public C17391z getVideo() {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            return feedItemZaloVideoView.getVideo();
        }
        return null;
    }

    public final FeedItemZaloVideoView getVideoView() {
        if (this.f44946r) {
            return this.f44945q;
        }
        return null;
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            feedItemZaloVideoView.m44359L0();
        }
    }

    public final void setOpenZShortVideoListener(FeedItemZaloVideoView.InterfaceC8181b interfaceC8181b) {
        AbstractC19074t.m100208f(interfaceC8181b, "listener");
        FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
        if (feedItemZaloVideoView != null) {
            feedItemZaloVideoView.setOpenZShortVideoListener(interfaceC8181b);
        }
    }

    public final void setVideoFeedContent(C3000l0 c3000l0) {
        if (this.f44946r) {
            FeedItemZaloVideoView feedItemZaloVideoView = this.f44945q;
            if (feedItemZaloVideoView != null) {
                FeedItemBase.m43679x(feedItemZaloVideoView, c3000l0);
                return;
            }
            return;
        }
        FeedItemLinkModulesView feedItemLinkModulesView = this.f44944p;
        if (feedItemLinkModulesView != null) {
            FeedItemBaseModuleView.m43693l0(feedItemLinkModulesView, c3000l0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZaloVideoContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f44946r = true;
    }
}
