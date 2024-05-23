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
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;
import p363nh.C23744a;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemLocalHeaderBarProfile extends RelativeLayout implements C23744a.c, View.OnClickListener {

    /* renamed from: A */
    private int f44469A;

    /* renamed from: B */
    private Drawable f44470B;

    /* renamed from: C */
    C3000l0 f44471C;

    /* renamed from: D */
    InterfaceC8427w6 f44472D;

    /* renamed from: E */
    Handler f44473E;

    /* renamed from: F */
    private final View.OnLayoutChangeListener f44474F;

    /* renamed from: p */
    private RobotoTextView f44475p;

    /* renamed from: q */
    private RobotoTextView f44476q;

    /* renamed from: r */
    private ProgressBar f44477r;

    /* renamed from: s */
    private ViewGroup f44478s;

    /* renamed from: t */
    private int f44479t;

    /* renamed from: u */
    private int f44480u;

    /* renamed from: v */
    private int f44481v;

    /* renamed from: w */
    private int f44482w;

    /* renamed from: x */
    private int f44483x;

    /* renamed from: y */
    private int f44484y;

    /* renamed from: z */
    private int f44485z;

    /* renamed from: com.zing.zalo.feed.components.FeedItemLocalHeaderBarProfile$a */
    /* loaded from: classes4.dex */
    class HandlerC8090a extends Handler {
        HandlerC8090a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                int i11 = message.arg1;
                C3000l0 c3000l0 = FeedItemLocalHeaderBarProfile.this.f44471C;
                if (c3000l0 != null) {
                    int m14339j0 = c3000l0.m14339j0();
                    if (m14339j0 != 1) {
                        if (m14339j0 != 2) {
                            if (m14339j0 == 3) {
                                FeedItemLocalHeaderBarProfile.this.setSmoothProgress(100);
                                return;
                            } else if (m14339j0 != 4) {
                                if (m14339j0 != 5) {
                                    return;
                                }
                            }
                        }
                        FeedItemLocalHeaderBarProfile.this.setProgress(0);
                        return;
                    }
                    FeedItemLocalHeaderBarProfile.this.setSmoothProgress(i11);
                }
            }
        }
    }

    public FeedItemLocalHeaderBarProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44473E = new HandlerC8090a(Looper.getMainLooper());
        this.f44474F = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.feed.components.e2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FeedItemLocalHeaderBarProfile.this.m43808e(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f44470B = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
        m43807d();
    }

    /* renamed from: d */
    private void m43807d() {
        this.f44481v = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
        this.f44479t = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cProfileDot);
        this.f44480u = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cProfileDotStroke);
        this.f44482w = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size);
        this.f44483x = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size_big);
        this.f44484y = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_marginleft);
        this.f44485z = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_marginleft_big);
        this.f44469A = Color.parseColor("#f26363");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m43808e(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Drawable drawable;
        try {
            ViewOverlay overlay = view.getOverlay();
            if (overlay != null && (drawable = this.f44470B) != null) {
                drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
                overlay.add(this.f44470B);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m43809f(int i11) {
        if (this.f44473E != null) {
            Message message = new Message();
            message.what = 1;
            message.arg1 = i11;
            this.f44473E.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i11) {
        ProgressBar progressBar = this.f44477r;
        if (progressBar != null) {
            progressBar.setProgress(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmoothProgress(int i11) {
        ProgressBar progressBar = this.f44477r;
        if (progressBar != null) {
            ObjectAnimator.ofInt(progressBar, "progress", i11).setDuration(100L).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23744a.m124114c().m124115b(this, 5050);
        ViewGroup viewGroup = this.f44478s;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this.f44474F);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z11;
        InterfaceC8427w6 interfaceC8427w6;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tvViewErrorDetails) {
            InterfaceC8427w6 interfaceC8427w62 = this.f44472D;
            if (interfaceC8427w62 != null) {
                interfaceC8427w62.mo43802M2(this.f44471C);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.viewStatusPost || id2 == AbstractC6918a0.viewFakeBottomTouch) {
            C3000l0 c3000l0 = this.f44471C;
            boolean z12 = false;
            if (c3000l0 != null && c3000l0.m14285C0() && this.f44471C.m14377z0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            RobotoTextView robotoTextView = this.f44476q;
            if (robotoTextView != null && robotoTextView.getVisibility() == 0) {
                z12 = true;
            }
            if (z11 && z12 && (interfaceC8427w6 = this.f44472D) != null) {
                interfaceC8427w6.mo43802M2(this.f44471C);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RobotoTextView robotoTextView;
        C23744a.m124114c().m124117e(this, 5050);
        ViewGroup viewGroup = this.f44478s;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.f44474F);
        }
        if (AbstractC26683d.f126393l && (robotoTextView = this.f44475p) != null) {
            AbstractC28245z3.m142218a(robotoTextView.getText(), this.f44475p);
        }
        super.onDetachedFromWindow();
    }

    public void setData(C3000l0 c3000l0) {
        this.f44471C = c3000l0;
    }

    public void setListener(InterfaceC8427w6 interfaceC8427w6) {
        this.f44472D = interfaceC8427w6;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C3020p0 m14322a0;
        if (i11 == 5050) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                C3000l0 c3000l0 = this.f44471C;
                if (c3000l0 != null && c3000l0.m14285C0() && (m14322a0 = this.f44471C.m14322a0()) != null && TextUtils.equals(m14322a0.f12057p, str)) {
                    m43809f(intValue);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
