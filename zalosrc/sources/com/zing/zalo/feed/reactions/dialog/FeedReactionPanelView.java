package com.zing.zalo.feed.reactions.dialog;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import as.InterfaceC2332g;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.reactions.dialog.FeedReactionContentView;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;

/* loaded from: classes4.dex */
public final class FeedReactionPanelView extends RelativeLayout {

    /* renamed from: p */
    private final FeedReactionContentView f47266p;

    /* renamed from: q */
    private final View f47267q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedReactionPanelView(Context context, C8848a.c cVar) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cVar, "reactionPanelUIComponent");
        View view = new View(context);
        this.f47267q = view;
        FeedReactionContentView feedReactionContentView = new FeedReactionContentView(context, cVar.m47275a(), null, 0, 12, null);
        feedReactionContentView.setId(View.generateViewId());
        FeedReactionContentView.C8842a c8842a = FeedReactionContentView.Companion;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c8842a.m47256b(), c8842a.m47255a());
        layoutParams.addRule(14);
        feedReactionContentView.setLayoutParams(layoutParams);
        this.f47266p = feedReactionContentView;
        view.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, AbstractC23222t7.f112562h);
        layoutParams2.addRule(3, feedReactionContentView.getId());
        view.setLayoutParams(layoutParams2);
        addView(feedReactionContentView);
        addView(view);
    }

    /* renamed from: a */
    public final void m47258a() {
        this.f47266p.m47254y();
    }

    /* renamed from: b */
    public final void m47259b(MotionEvent motionEvent) {
        this.f47266p.m47253D(motionEvent);
    }

    public final void setFeedReactionPanelListener(InterfaceC2332g interfaceC2332g) {
        this.f47266p.setOnFeedReactionSelectedListener(interfaceC2332g);
    }
}
