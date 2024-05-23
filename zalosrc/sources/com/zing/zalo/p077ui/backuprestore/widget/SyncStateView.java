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
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import c50.C3295f;
import c50.C3297h;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncStateView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class SyncStateView extends RelativeLayout {

    /* renamed from: A */
    private final InterfaceC24854k f56134A;

    /* renamed from: B */
    private final InterfaceC24854k f56135B;

    /* renamed from: C */
    private boolean f56136C;

    /* renamed from: D */
    private InterfaceC11148a f56137D;

    /* renamed from: p */
    private AppCompatImageView f56138p;

    /* renamed from: q */
    private TextSwitcher f56139q;

    /* renamed from: r */
    private ProgressBar f56140r;

    /* renamed from: s */
    private AppCompatImageView f56141s;

    /* renamed from: t */
    private TextView f56142t;

    /* renamed from: u */
    private TextView f56143u;

    /* renamed from: v */
    private int f56144v;

    /* renamed from: w */
    private int f56145w;

    /* renamed from: x */
    private CharSequence f56146x;

    /* renamed from: y */
    private int f56147y;

    /* renamed from: z */
    private final InterfaceC24854k f56148z;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncStateView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11148a {
        /* renamed from: a */
        void mo58405a(SyncStateView syncStateView, int i11);

        /* renamed from: u */
        void mo58407u();
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncStateView$b */
    /* loaded from: classes5.dex */
    public static final class C11149b extends ClickableSpan {
        C11149b() {
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
                textPaint.setColor(C23212s8.m119607o(SyncStateView.this.getContext(), AbstractC16781w.AppPrimaryColor));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f56146x = "";
        m129210a = AbstractC24856m.m129210a(new C11154c(this));
        this.f56148z = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11153b(this));
        this.f56134A = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C11155d.f56175q);
        this.f56135B = m129210a3;
        this.f56136C = true;
        m58422l(context);
    }

    /* renamed from: e */
    private final void m58419e() {
        int textColor1;
        int i11 = this.f56144v;
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
        return ((Number) this.f56134A.getValue()).intValue();
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final int getTextColor1() {
        return ((Number) this.f56148z.getValue()).intValue();
    }

    private final int getTextColorSuccess() {
        return ((Number) this.f56135B.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m58420h(SyncStateView syncStateView, int i11, View view) {
        AbstractC19074t.m100208f(syncStateView, "this$0");
        InterfaceC11148a interfaceC11148a = syncStateView.f56137D;
        if (interfaceC11148a != null) {
            interfaceC11148a.mo58405a(syncStateView, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m58421i(SyncStateView syncStateView, int i11, View view) {
        AbstractC19074t.m100208f(syncStateView, "this$0");
        InterfaceC11148a interfaceC11148a = syncStateView.f56137D;
        if (interfaceC11148a != null) {
            interfaceC11148a.mo58405a(syncStateView, i11);
        }
    }

    /* renamed from: l */
    private final void m58422l(final Context context) {
        View.inflate(context, AbstractC7409c0.sync_state_view, this);
        View findViewById = findViewById(AbstractC6918a0.icon_state);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f56138p = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.progress_state);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f56140r = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.msg_state);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        TextSwitcher textSwitcher = (TextSwitcher) findViewById3;
        this.f56139q = textSwitcher;
        AppCompatImageView appCompatImageView = null;
        if (textSwitcher == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher = null;
        }
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: d50.m
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View m58423m;
                m58423m = SyncStateView.m58423m(context);
                return m58423m;
            }
        });
        Animation loadAnimation = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_in_short);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_out_short);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        View findViewById4 = findViewById(AbstractC6918a0.icon_close);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById4;
        this.f56141s = appCompatImageView2;
        if (appCompatImageView2 == null) {
            AbstractC19074t.m100223u("iconClose");
            appCompatImageView2 = null;
        }
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: d50.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncStateView.m58424n(SyncStateView.this, view);
            }
        });
        AppCompatImageView appCompatImageView3 = this.f56141s;
        if (appCompatImageView3 == null) {
            AbstractC19074t.m100223u("iconClose");
            appCompatImageView3 = null;
        }
        AppCompatImageView appCompatImageView4 = this.f56141s;
        if (appCompatImageView4 == null) {
            AbstractC19074t.m100223u("iconClose");
        } else {
            appCompatImageView = appCompatImageView4;
        }
        Context context2 = appCompatImageView.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        appCompatImageView3.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_01));
        View findViewById5 = findViewById(AbstractC6918a0.btn_retry);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f56142t = (TextView) findViewById5;
        View findViewById6 = findViewById(AbstractC6918a0.tv_processing_percent);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f56143u = (TextView) findViewById6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final View m58423m(Context context) {
        AbstractC19074t.m100208f(context, "$context");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setGravity(51);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        robotoTextView.setTextSize(0, AbstractC23222t7.f112582r);
        return robotoTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m58424n(SyncStateView syncStateView, View view) {
        AbstractC19074t.m100208f(syncStateView, "this$0");
        InterfaceC11148a interfaceC11148a = syncStateView.f56137D;
        if (interfaceC11148a != null) {
            interfaceC11148a.mo58407u();
        }
    }

    private final void setColorMsgSpanned(int i11) {
        if (this.f56147y == i11) {
            return;
        }
        this.f56147y = i11;
        TextSwitcher textSwitcher = this.f56139q;
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
            robotoTextView.setTextColor(this.f56147y);
        }
    }

    private final void setMsgSpanned(CharSequence charSequence) {
        if (AbstractC19074t.m100204b(this.f56146x, charSequence)) {
            return;
        }
        this.f56146x = charSequence;
        TextSwitcher textSwitcher = this.f56139q;
        if (textSwitcher == null) {
            AbstractC19074t.m100223u("txtSwitcherMsg");
            textSwitcher = null;
        }
        textSwitcher.setCurrentText(this.f56146x);
    }

    private final void setResIdIconState(int i11) {
        if (this.f56145w == i11) {
            return;
        }
        this.f56145w = i11;
        AppCompatImageView appCompatImageView = null;
        if (this.f56144v == 2) {
            AppCompatImageView appCompatImageView2 = this.f56138p;
            if (appCompatImageView2 == null) {
                AbstractC19074t.m100223u("iconState");
            } else {
                appCompatImageView = appCompatImageView2;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, this.f56145w, AbstractC2807a.support_error));
            return;
        }
        AppCompatImageView appCompatImageView3 = this.f56138p;
        if (appCompatImageView3 == null) {
            AbstractC19074t.m100223u("iconState");
        } else {
            appCompatImageView = appCompatImageView3;
        }
        appCompatImageView.setImageResource(this.f56145w);
    }

    /* renamed from: f */
    public final void m58425f() {
        int i11;
        AppCompatImageView appCompatImageView = null;
        if (this.f56144v == 0) {
            AppCompatImageView appCompatImageView2 = this.f56138p;
            if (appCompatImageView2 == null) {
                AbstractC19074t.m100223u("iconState");
            } else {
                appCompatImageView = appCompatImageView2;
            }
            appCompatImageView.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView3 = this.f56138p;
            if (appCompatImageView3 == null) {
                AbstractC19074t.m100223u("iconState");
            } else {
                appCompatImageView = appCompatImageView3;
            }
            appCompatImageView.setVisibility(0);
        }
        int i12 = this.f56144v;
        if (i12 != 1) {
            if (i12 != 2) {
                i11 = AbstractC16803z.bg_reddot_progressing;
            } else {
                i11 = AbstractC2810d.zds_ic_warning_solid_16;
            }
        } else {
            i11 = AbstractC16803z.ic_24_success;
        }
        setResIdIconState(i11);
    }

    /* renamed from: g */
    public final void m58426g(C3295f c3295f) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(c3295f, "syncTextSpanInfo");
        if (c3295f.m16723e().length() == 0) {
            return;
        }
        m58419e();
        View view = null;
        if (this.f56136C) {
            if (this.f56144v == 0) {
                TextView textView = this.f56143u;
                if (textView == null) {
                    AbstractC19074t.m100223u("tvProcessingPercent");
                    textView = null;
                }
                textView.setVisibility(0);
                TextView textView2 = this.f56143u;
                if (textView2 == null) {
                    AbstractC19074t.m100223u("tvProcessingPercent");
                    textView2 = null;
                }
                textView2.setText(c3295f.m16721c() + "%");
            } else {
                TextView textView3 = this.f56143u;
                if (textView3 == null) {
                    AbstractC19074t.m100223u("tvProcessingPercent");
                    textView3 = null;
                }
                textView3.setVisibility(8);
            }
        }
        if (c3295f.m16723e().length() != 0 && c3295f.m16722d() >= 0 && c3295f.m16720b() <= c3295f.m16723e().length()) {
            final int m16719a = c3295f.m16719a();
            if (c3295f.m16720b() < c3295f.m16723e().length()) {
                SpannableString spannableString = new SpannableString(c3295f.m16723e());
                spannableString.setSpan(new C11149b(), c3295f.m16722d(), c3295f.m16720b(), 33);
                setMsgSpanned(spannableString);
                TextSwitcher textSwitcher = this.f56139q;
                if (textSwitcher == null) {
                    AbstractC19074t.m100223u("txtSwitcherMsg");
                    textSwitcher = null;
                }
                View currentView = textSwitcher.getCurrentView();
                if (currentView instanceof RobotoTextView) {
                    view = (RobotoTextView) currentView;
                }
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: d50.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SyncStateView.m58420h(SyncStateView.this, m16719a, view2);
                        }
                    });
                    return;
                }
                return;
            }
            setMsgSpanned(c3295f.m16723e().subSequence(0, c3295f.m16722d() - 1));
            TextView textView4 = this.f56142t;
            if (textView4 == null) {
                AbstractC19074t.m100223u("btnRetry");
                textView4 = null;
            }
            textView4.setVisibility(0);
            View view2 = this.f56142t;
            if (view2 == null) {
                AbstractC19074t.m100223u("btnRetry");
            } else {
                view = view2;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: d50.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SyncStateView.m58421i(SyncStateView.this, m16719a, view3);
                }
            });
            return;
        }
        setMsgSpanned(c3295f.m16723e());
        TextView textView5 = this.f56142t;
        if (textView5 == null) {
            AbstractC19074t.m100223u("btnRetry");
            textView5 = null;
        }
        textView5.setVisibility(8);
        TextSwitcher textSwitcher2 = this.f56139q;
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

    public final InterfaceC11148a getEventListener() {
        return this.f56137D;
    }

    public final int getState() {
        return this.f56144v;
    }

    /* renamed from: j */
    public final void m58427j(boolean z11, int i11) {
        ProgressBar progressBar = this.f56140r;
        ProgressBar progressBar2 = null;
        if (progressBar == null) {
            AbstractC19074t.m100223u("progressBarView");
            progressBar = null;
        }
        progressBar.setIndeterminate(z11);
        if (z11) {
            C3297h c3297h = C3297h.f14104a;
            ProgressBar progressBar3 = this.f56140r;
            if (progressBar3 == null) {
                AbstractC19074t.m100223u("progressBarView");
                progressBar3 = null;
            }
            c3297h.m16745m(progressBar3, 0);
        } else if (i11 >= 0) {
            C3297h c3297h2 = C3297h.f14104a;
            ProgressBar progressBar4 = this.f56140r;
            if (progressBar4 == null) {
                AbstractC19074t.m100223u("progressBarView");
                progressBar4 = null;
            }
            c3297h2.m16745m(progressBar4, i11);
        }
        ProgressBar progressBar5 = this.f56140r;
        if (progressBar5 == null) {
            AbstractC19074t.m100223u("progressBarView");
        } else {
            progressBar2 = progressBar5;
        }
        progressBar2.setVisibility(0);
    }

    /* renamed from: k */
    public final void m58428k() {
        ProgressBar progressBar = this.f56140r;
        if (progressBar == null) {
            AbstractC19074t.m100223u("progressBarView");
            progressBar = null;
        }
        progressBar.setVisibility(8);
    }

    /* renamed from: p */
    public final void m58429p(boolean z11) {
        int i11;
        AppCompatImageView appCompatImageView = this.f56141s;
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

    public final void setEventListener(InterfaceC11148a interfaceC11148a) {
        this.f56137D = interfaceC11148a;
    }

    public final void setIsShowProgressingPercentView(boolean z11) {
        this.f56136C = z11;
    }

    public final void setState(int i11) {
        this.f56144v = i11;
    }
}
