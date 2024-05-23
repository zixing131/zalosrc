package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class FeedItemLocalHeaderBar extends RelativeLayout implements InterfaceC8427w6 {

    /* renamed from: p */
    private FeedItemLocalHeaderBarTimeline f44464p;

    /* renamed from: q */
    private FeedItemLocalHeaderBarProfile f44465q;

    /* renamed from: r */
    private int f44466r;

    /* renamed from: s */
    private C23528a f44467s;

    /* renamed from: t */
    private InterfaceC2259a f44468t;

    public FeedItemLocalHeaderBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44467s = new C23528a(context);
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8427w6
    /* renamed from: M2 */
    public void mo43802M2(C3000l0 c3000l0) {
        InterfaceC2259a interfaceC2259a;
        if (c3000l0 != null && (interfaceC2259a = this.f44468t) != null) {
            interfaceC2259a.mo11925M2(c3000l0);
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8427w6
    /* renamed from: X */
    public void mo43803X(C3000l0 c3000l0) {
        InterfaceC2259a interfaceC2259a;
        if (c3000l0 != null && (interfaceC2259a = this.f44468t) != null) {
            interfaceC2259a.mo11940X(c3000l0);
        }
    }

    public void setData(C3000l0 c3000l0) {
        FeedItemLocalHeaderBarTimeline feedItemLocalHeaderBarTimeline = this.f44464p;
        if (feedItemLocalHeaderBarTimeline != null) {
            feedItemLocalHeaderBarTimeline.setData(c3000l0);
        }
        FeedItemLocalHeaderBarProfile feedItemLocalHeaderBarProfile = this.f44465q;
        if (feedItemLocalHeaderBarProfile != null) {
            feedItemLocalHeaderBarProfile.setData(c3000l0);
        }
    }

    public void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f44468t = interfaceC2259a;
    }

    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        FeedItemLocalHeaderBarTimeline feedItemLocalHeaderBarTimeline;
        if (this.f44466r == 0 && (feedItemLocalHeaderBarTimeline = this.f44464p) != null) {
            feedItemLocalHeaderBarTimeline.setOnAvatarClickListener(onClickListener);
        }
    }

    public void setOnBgFeedClickListener(View.OnClickListener onClickListener) {
        FeedItemLocalHeaderBarTimeline feedItemLocalHeaderBarTimeline;
        if (this.f44466r == 0 && (feedItemLocalHeaderBarTimeline = this.f44464p) != null) {
            feedItemLocalHeaderBarTimeline.setOnBgFeedClickListener(onClickListener);
        }
    }

    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        FeedItemLocalHeaderBarTimeline feedItemLocalHeaderBarTimeline;
        if (this.f44466r == 0 && (feedItemLocalHeaderBarTimeline = this.f44464p) != null) {
            feedItemLocalHeaderBarTimeline.setOnProfileClickListener(onClickListener);
        }
    }
}
