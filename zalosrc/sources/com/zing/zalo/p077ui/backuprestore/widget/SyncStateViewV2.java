package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import c50.C3295f;
import c50.C3297h;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncStateViewV2;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class SyncStateViewV2 extends RelativeLayout {

    /* renamed from: A */
    private final InterfaceC24854k f56150A;

    /* renamed from: B */
    private InterfaceC11150a f56151B;

    /* renamed from: p */
    private AppCompatImageView f56152p;

    /* renamed from: q */
    private TextSwitcher f56153q;

    /* renamed from: r */
    private ProgressBar f56154r;

    /* renamed from: s */
    private AppCompatImageView f56155s;

    /* renamed from: t */
    private TextView f56156t;

    /* renamed from: u */
    private int f56157u;

    /* renamed from: v */
    private int f56158v;

    /* renamed from: w */
    private CharSequence f56159w;

    /* renamed from: x */
    private int f56160x;

    /* renamed from: y */
    private final InterfaceC24854k f56161y;

    /* renamed from: z */
    private final InterfaceC24854k f56162z;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncStateViewV2$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11150a {
        /* renamed from: a */
        void mo58411a(SyncStateViewV2 syncStateViewV2, int i11);

        /* renamed from: u */
        void mo58413u();
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncStateViewV2$b */
    /* loaded from: classes5.dex */
    public static final class C11151b extends ClickableSpan {
        C11151b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setColor(C23212s8.m119607o(SyncStateViewV2.this.getContext(), AbstractC16781w.AppPrimaryColor));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f56159w = "";
        m129210a = AbstractC24856m.m129210a(new C11157f(this));
        this.f56161y = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11156e(this));
        this.f56162z = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C11158g.f56178q);
        this.f56150A = m129210a3;
        m58437l(context);
    }

    /* renamed from: e */
    private final void m58434e() {
        int textColor1;
        int i11 = this.f56157u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    textColor1 = getTextColor1();
                } else {
                    textColor1 = getNotificationColor1();
                }
            } else {
                textColor1 = getTextColorSuccess();
            }
        } else {
            textColor1 = getTextColor1();
        }
        setColorMsgSpanned(textColor1);
    }

    private final int getNotificationColor1() {
        return ((Number) this.f56162z.getValue()).intValue();
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final int getTextColor1() {
        return ((Number) this.f56161y.getValue()).intValue();
    }

    private final int getTextColorSuccess() {
        return ((Number) this.f56150A.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m58435h(SyncStateViewV2 syncStateViewV2, int i11, View view) {
        AbstractC19074t.m100208f(syncStateViewV2, "this$0");
        InterfaceC11150a interfaceC11150a = syncStateViewV2.f56151B;
        if (interfaceC11150a != null) {
            interfaceC11150a.mo58411a(syncStateViewV2, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m58436i(SyncStateViewV2 syncStateViewV2, int i11, View view) {
        AbstractC19074t.m100208f(syncStateViewV2, "this$0");
        InterfaceC11150a interfaceC11150a = syncStateViewV2.f56151B;
        if (interfaceC11150a != null) {
            interfaceC11150a.mo58411a(syncStateViewV2, i11);
        }
    }

    /* renamed from: l */
    private final void m58437l(final Context context) {
        View.inflate(context, AbstractC7409c0.sync_state_view_v2, this);
        View findViewById = findViewById(AbstractC6918a0.icon_state);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f56152p = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.progress_state);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f56154r = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.msg_state);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        TextSwitcher textSwitcher = (TextSwitcher) findViewById3;
        this.f56153q = textSwitcher;
        AppCompatImageView appCompatImageView = null;
        if (textSwitcher == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher = null;
        }
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: d50.q
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View m58438m;
                m58438m = SyncStateViewV2.m58438m(context);
                return m58438m;
            }
        });
        Animation loadAnimation = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_in_short);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_out_short);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        View findViewById4 = findViewById(AbstractC6918a0.icon_close);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById4;
        this.f56155s = appCompatImageView2;
        if (appCompatImageView2 == null) {
            AbstractC19074t.m100223u("iconClose");
        } else {
            appCompatImageView = appCompatImageView2;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: d50.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncStateViewV2.m58439n(SyncStateViewV2.this, view);
            }
        });
        View findViewById5 = findViewById(AbstractC6918a0.btn_retry);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f56156t = (TextView) findViewById5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final View m58438m(Context context) {
        AbstractC19074t.m100208f(context, "$context");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setGravity(51);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        robotoTextView.setTextSize(0, AbstractC23222t7.f112582r);
        return robotoTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m58439n(SyncStateViewV2 syncStateViewV2, View view) {
        AbstractC19074t.m100208f(syncStateViewV2, "this$0");
        InterfaceC11150a interfaceC11150a = syncStateViewV2.f56151B;
        if (interfaceC11150a != null) {
            interfaceC11150a.mo58413u();
        }
    }

    private final void setColorMsgSpanned(int i11) {
        if (this.f56160x == i11) {
            return;
        }
        this.f56160x = i11;
        TextSwitcher textSwitcher = this.f56153q;
        RobotoTextView robotoTextView = null;
        if (textSwitcher == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher = null;
        }
        View currentView = textSwitcher.getCurrentView();
        if (currentView instanceof RobotoTextView) {
            robotoTextView = (RobotoTextView) currentView;
        }
        if (robotoTextView != null) {
            robotoTextView.setTextColor(this.f56160x);
        }
    }

    private final void setMsgSpanned(CharSequence charSequence) {
        if (AbstractC19074t.m100204b(this.f56159w, charSequence)) {
            return;
        }
        this.f56159w = charSequence;
        TextSwitcher textSwitcher = this.f56153q;
        if (textSwitcher == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher = null;
        }
        textSwitcher.setCurrentText(this.f56159w);
    }

    private final void setResIdIconState(int i11) {
        if (this.f56158v == i11) {
            return;
        }
        this.f56158v = i11;
        AppCompatImageView appCompatImageView = this.f56152p;
        if (appCompatImageView == null) {
            AbstractC19074t.m100223u("iconState");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(this.f56158v);
    }

    /* renamed from: f */
    public final void m58440f() {
        int i11;
        AppCompatImageView appCompatImageView = null;
        if (this.f56157u == 0) {
            AppCompatImageView appCompatImageView2 = this.f56152p;
            if (appCompatImageView2 == null) {
                AbstractC19074t.m100223u("iconState");
            } else {
                appCompatImageView = appCompatImageView2;
            }
            appCompatImageView.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView3 = this.f56152p;
            if (appCompatImageView3 == null) {
                AbstractC19074t.m100223u("iconState");
            } else {
                appCompatImageView = appCompatImageView3;
            }
            appCompatImageView.setVisibility(0);
        }
        int i12 = this.f56157u;
        if (i12 != 1) {
            if (i12 != 2) {
                i11 = AbstractC16803z.bg_reddot_progressing;
            } else {
                i11 = AbstractC16803z.ic_24_danger;
            }
        } else {
            i11 = AbstractC16803z.ic_24_success;
        }
        setResIdIconState(i11);
    }

    /* renamed from: g */
    public final void m58441g(C3295f c3295f) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(c3295f, "syncTextSpanInfo");
        if (c3295f.m16723e().length() == 0) {
            return;
        }
        m58434e();
        View view = null;
        if (c3295f.m16723e().length() != 0 && c3295f.m16722d() >= 0 && c3295f.m16720b() <= c3295f.m16723e().length()) {
            final int m16719a = c3295f.m16719a();
            if (c3295f.m16720b() < c3295f.m16723e().length()) {
                SpannableString spannableString = new SpannableString(c3295f.m16723e());
                spannableString.setSpan(new C11151b(), c3295f.m16722d(), c3295f.m16720b(), 33);
                setMsgSpanned(spannableString);
                TextSwitcher textSwitcher = this.f56153q;
                if (textSwitcher == null) {
                    AbstractC19074t.m100223u("txtSwitcherMsg");
                    textSwitcher = null;
                }
                View currentView = textSwitcher.getCurrentView();
                if (currentView instanceof RobotoTextView) {
                    view = (RobotoTextView) currentView;
                }
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: d50.o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SyncStateViewV2.m58435h(SyncStateViewV2.this, m16719a, view2);
                        }
                    });
                    return;
                }
                return;
            }
            setMsgSpanned(c3295f.m16723e().subSequence(0, c3295f.m16722d() - 1));
            TextView textView = this.f56156t;
            if (textView == null) {
                AbstractC19074t.m100223u("btnRetry");
                textView = null;
            }
            textView.setText(c3295f.m16723e().subSequence(c3295f.m16722d(), c3295f.m16720b()));
            TextView textView2 = this.f56156t;
            if (textView2 == null) {
                AbstractC19074t.m100223u("btnRetry");
                textView2 = null;
            }
            textView2.setVisibility(0);
            View view2 = this.f56156t;
            if (view2 == null) {
                AbstractC19074t.m100223u("btnRetry");
            } else {
                view = view2;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: d50.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SyncStateViewV2.m58436i(SyncStateViewV2.this, m16719a, view3);
                }
            });
            return;
        }
        setMsgSpanned(c3295f.m16723e());
        TextView textView3 = this.f56156t;
        if (textView3 == null) {
            AbstractC19074t.m100223u("btnRetry");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextSwitcher textSwitcher2 = this.f56153q;
        if (textSwitcher2 == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher2 = null;
        }
        View currentView2 = textSwitcher2.getCurrentView();
        if (currentView2 instanceof RobotoTextView) {
            robotoTextView = (RobotoTextView) currentView2;
        } else {
            robotoTextView = null;
        }
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(null);
        }
    }

    public final InterfaceC11150a getEventListener() {
        return this.f56151B;
    }

    public final int getState() {
        return this.f56157u;
    }

    /* renamed from: j */
    public final void m58442j(boolean z11, int i11) {
        ProgressBar progressBar = this.f56154r;
        ProgressBar progressBar2 = null;
        if (progressBar == null) {
            AbstractC19074t.m100223u("progressBarView");
            progressBar = null;
        }
        progressBar.setIndeterminate(z11);
        if (z11) {
            C3297h c3297h = C3297h.f14104a;
            ProgressBar progressBar3 = this.f56154r;
            if (progressBar3 == null) {
                AbstractC19074t.m100223u("progressBarView");
                progressBar3 = null;
            }
            c3297h.m16745m(progressBar3, 0);
        } else if (i11 >= 0) {
            C3297h c3297h2 = C3297h.f14104a;
            ProgressBar progressBar4 = this.f56154r;
            if (progressBar4 == null) {
                AbstractC19074t.m100223u("progressBarView");
                progressBar4 = null;
            }
            c3297h2.m16745m(progressBar4, i11);
        }
        ProgressBar progressBar5 = this.f56154r;
        if (progressBar5 == null) {
            AbstractC19074t.m100223u("progressBarView");
        } else {
            progressBar2 = progressBar5;
        }
        progressBar2.setVisibility(0);
    }

    /* renamed from: k */
    public final void m58443k() {
        ProgressBar progressBar = this.f56154r;
        if (progressBar == null) {
            AbstractC19074t.m100223u("progressBarView");
            progressBar = null;
        }
        progressBar.setVisibility(8);
    }

    /* renamed from: p */
    public final void m58444p(boolean z11) {
        int i11;
        AppCompatImageView appCompatImageView = this.f56155s;
        if (appCompatImageView == null) {
            AbstractC19074t.m100223u("iconClose");
            appCompatImageView = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView.setVisibility(i11);
    }

    public final void setEventListener(InterfaceC11150a interfaceC11150a) {
        this.f56151B = interfaceC11150a;
    }

    public final void setState(int i11) {
        this.f56157u = i11;
    }
}
