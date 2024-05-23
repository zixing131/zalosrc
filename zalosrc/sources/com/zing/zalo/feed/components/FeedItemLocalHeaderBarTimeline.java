package com.zing.zalo.feed.components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p363nh.C23744a;
import th.AbstractC26683d;
import tn.C26761p;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemLocalHeaderBarTimeline extends RelativeLayout implements C23744a.c, View.OnClickListener {

    /* renamed from: A */
    private final View.OnLayoutChangeListener f44487A;

    /* renamed from: p */
    private GroupAvatarView f44488p;

    /* renamed from: q */
    private RobotoTextView f44489q;

    /* renamed from: r */
    private FeedBackgroundView f44490r;

    /* renamed from: s */
    private ProgressBar f44491s;

    /* renamed from: t */
    private ViewGroup f44492t;

    /* renamed from: u */
    private final int f44493u;

    /* renamed from: v */
    private final int f44494v;

    /* renamed from: w */
    private Drawable f44495w;

    /* renamed from: x */
    private C3000l0 f44496x;

    /* renamed from: y */
    private InterfaceC8427w6 f44497y;

    /* renamed from: z */
    Handler f44498z;

    /* renamed from: com.zing.zalo.feed.components.FeedItemLocalHeaderBarTimeline$a */
    /* loaded from: classes4.dex */
    class HandlerC8091a extends Handler {
        HandlerC8091a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                int i11 = message.arg1;
                if (FeedItemLocalHeaderBarTimeline.this.f44496x != null) {
                    int m14339j0 = FeedItemLocalHeaderBarTimeline.this.f44496x.m14339j0();
                    if (m14339j0 != 1) {
                        if (m14339j0 != 2) {
                            if (m14339j0 == 3) {
                                FeedItemLocalHeaderBarTimeline.this.setSmoothProgress(100);
                                return;
                            } else if (m14339j0 != 4) {
                                if (m14339j0 != 5) {
                                    return;
                                }
                            }
                        }
                        FeedItemLocalHeaderBarTimeline.this.setProgress(0);
                        return;
                    }
                    FeedItemLocalHeaderBarTimeline.this.setSmoothProgress(i11);
                }
            }
        }
    }

    public FeedItemLocalHeaderBarTimeline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44493u = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
        this.f44494v = Color.parseColor("#f26363");
        this.f44498z = new HandlerC8091a(Looper.getMainLooper());
        this.f44487A = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.feed.components.j2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FeedItemLocalHeaderBarTimeline.this.m43814e(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f44495w = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m43814e(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Drawable drawable;
        try {
            ViewOverlay overlay = view.getOverlay();
            if (overlay != null && (drawable = this.f44495w) != null) {
                drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
                overlay.add(this.f44495w);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    private void m43815f(int i11) {
        if (this.f44498z != null) {
            Message message = new Message();
            message.what = 1;
            message.arg1 = i11;
            this.f44498z.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i11) {
        ProgressBar progressBar = this.f44491s;
        if (progressBar != null) {
            progressBar.setProgress(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmoothProgress(int i11) {
        ProgressBar progressBar = this.f44491s;
        if (progressBar != null) {
            ObjectAnimator.ofInt(progressBar, "progress", i11).setDuration(100L).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23744a.m124114c().m124115b(this, 5050);
        ViewGroup viewGroup = this.f44492t;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this.f44487A);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C3000l0 c3000l0;
        InterfaceC8427w6 interfaceC8427w6;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.imvRemove) {
            C3000l0 c3000l02 = this.f44496x;
            if (c3000l02 != null && c3000l02.m14285C0() && (interfaceC8427w6 = this.f44497y) != null) {
                interfaceC8427w6.mo43803X(this.f44496x);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btnRetry && (c3000l0 = this.f44496x) != null && c3000l0.m14285C0()) {
            C26761p.m137741q().m137757K(this.f44496x.f11895q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C23744a.m124114c().m124117e(this, 5050);
        ViewGroup viewGroup = this.f44492t;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.f44487A);
        }
        if (AbstractC26683d.f126393l && this.f44490r.getViewRender() != null) {
            AbstractC28245z3.m142218a(this.f44490r.getViewRender().getText(), this.f44490r.getViewRender());
        }
        super.onDetachedFromWindow();
    }

    public void setData(C3000l0 c3000l0) {
        this.f44496x = c3000l0;
    }

    public void setListener(InterfaceC8427w6 interfaceC8427w6) {
        this.f44497y = interfaceC8427w6;
    }

    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        GroupAvatarView groupAvatarView = this.f44488p;
        if (groupAvatarView != null) {
            groupAvatarView.setOnClickListener(onClickListener);
        }
    }

    public void setOnBgFeedClickListener(View.OnClickListener onClickListener) {
        FeedBackgroundView feedBackgroundView = this.f44490r;
        if (feedBackgroundView != null) {
            feedBackgroundView.setOnClickListener(onClickListener);
        }
    }

    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        RobotoTextView robotoTextView = this.f44489q;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C3020p0 m14322a0;
        if (i11 == 5050) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                C3000l0 c3000l0 = this.f44496x;
                if (c3000l0 != null && c3000l0.m14285C0() && (m14322a0 = this.f44496x.m14322a0()) != null && TextUtils.equals(m14322a0.f12057p, str)) {
                    m43815f(intValue);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
