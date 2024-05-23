package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import bo.C3008m3;
import com.zing.zalo.AbstractC16803z;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p649xl.C29802fa;

/* loaded from: classes4.dex */
public final class FeedItemTitleDivider extends RelativeLayout {

    /* renamed from: p */
    public C29802fa f44826p;

    /* renamed from: q */
    private InterfaceC8146a f44827q;

    /* renamed from: com.zing.zalo.feed.components.FeedItemTitleDivider$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8146a {
        /* renamed from: a */
        void mo44157a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemTitleDivider(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m44156d(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m44154c(FeedItemTitleDivider feedItemTitleDivider, View view) {
        AbstractC19074t.m100208f(feedItemTitleDivider, "this$0");
        InterfaceC8146a interfaceC8146a = feedItemTitleDivider.f44827q;
        if (interfaceC8146a != null) {
            interfaceC8146a.mo44157a();
        }
    }

    /* renamed from: b */
    public final void m44155b(C3008m3 c3008m3) {
        if (c3008m3 == null) {
            return;
        }
        getBinding().f137759s.setText(c3008m3.m14421c());
        getBinding().f137758r.setText(c3008m3.m14419a());
        getBinding().f137757q.setText(c3008m3.m14422d());
        if (c3008m3.m14420b() != 0) {
            getBinding().f137757q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_chevron_right_line_24_blue), (Drawable) null);
            getBinding().f137757q.setCompoundDrawablePadding(AbstractC23136l9.m118742r(4.0f));
        } else {
            getBinding().f137757q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            getBinding().f137757q.setCompoundDrawablePadding(0);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemTitleDivider.m44154c(FeedItemTitleDivider.this, view);
            }
        });
    }

    /* renamed from: d */
    public final void m44156d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            C29802fa m147949c = C29802fa.m147949c(LayoutInflater.from(context), this, true);
            AbstractC19074t.m100207e(m147949c, "inflate(...)");
            setBinding(m147949c);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final C29802fa getBinding() {
        C29802fa c29802fa = this.f44826p;
        if (c29802fa != null) {
            return c29802fa;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final InterfaceC8146a getFeedItemTitleDividerListener() {
        return this.f44827q;
    }

    public final void setBinding(C29802fa c29802fa) {
        AbstractC19074t.m100208f(c29802fa, "<set-?>");
        this.f44826p = c29802fa;
    }

    public final void setFeedItemTitleDividerListener(InterfaceC8146a interfaceC8146a) {
        this.f44827q = interfaceC8146a;
    }
}
