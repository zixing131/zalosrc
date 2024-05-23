package zm.voip.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import bp0.AbstractC3104p;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import je.C21228a;
import me0.C23278z2;
import p193h0.AbstractC19694b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.C24848g0;
import ti0.C26705d;
import ti0.C26708g;
import zm.voip.widgets.RingBackTonePreviewView;

/* loaded from: classes7.dex */
public final class RingBackTonePreviewView extends RelativeLayout {

    /* renamed from: p */
    private final RecyclingImageView f150082p;

    /* renamed from: q */
    private final RobotoTextView f150083q;

    /* renamed from: r */
    private final RobotoTextView f150084r;

    /* renamed from: s */
    private final ButtonWithProgress f150085s;

    /* renamed from: t */
    private final C23528a f150086t;

    /* renamed from: u */
    private boolean f150087u;

    /* renamed from: v */
    private boolean f150088v;

    /* renamed from: w */
    private InterfaceC18494a f150089w;

    /* renamed from: zm.voip.widgets.RingBackTonePreviewView$a */
    /* loaded from: classes7.dex */
    public static final class C32499a extends C23999j {
        C32499a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            RingBackTonePreviewView.this.m157385c();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RingBackTonePreviewView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m157385c() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(3500L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        this.f150082p.startAnimation(rotateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m157386e(RingBackTonePreviewView ringBackTonePreviewView, View view) {
        AbstractC19074t.m100208f(ringBackTonePreviewView, "this$0");
        InterfaceC18494a interfaceC18494a = ringBackTonePreviewView.f150089w;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: d */
    public final void m157387d(C21228a c21228a) {
        AbstractC19074t.m100208f(c21228a, "rbt");
        try {
            if (this.f150088v) {
                return;
            }
            this.f150088v = true;
            this.f150084r.setText(c21228a.m110004d() + " - " + c21228a.m110001a());
            C23528a c23528a = (C23528a) this.f150086t.m123612r(this.f150082p);
            String m110006f = c21228a.m110006f();
            C24003n m120081L0 = C23278z2.m120081L0();
            m120081L0.f116261b = AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_call_rbt);
            C24848g0 c24848g0 = C24848g0.f119245a;
            c23528a.m123579C(m110006f, m120081L0, new C32499a());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m157388f() {
        this.f150085s.m90547h(false);
    }

    /* renamed from: g */
    public final void m157389g() {
        this.f150085s.m90547h(false);
        this.f150085s.setEnabled(false);
        this.f150085s.getButton().setEnabled(false);
        this.f150085s.getButton().setText(getContext().getString(AbstractC8020f0.str_call_rbt_handshake_info_button_success));
    }

    public final InterfaceC18494a getOnBtnClick() {
        return this.f150089w;
    }

    /* renamed from: h */
    public final void m157390h() {
        this.f150085s.m90547h(true);
    }

    /* renamed from: i */
    public final void m157391i() {
        this.f150085s.m90547h(false);
        this.f150082p.clearAnimation();
        this.f150084r.setSelected(false);
        this.f150088v = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m157391i();
        super.onDetachedFromWindow();
    }

    public final void setOnBtnClick(InterfaceC18494a interfaceC18494a) {
        this.f150089w = interfaceC18494a;
    }

    public final void setVideoCall(boolean z11) {
        this.f150087u = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RingBackTonePreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ RingBackTonePreviewView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingBackTonePreviewView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        RecyclingImageView recyclingImageView = new RecyclingImageView(context);
        this.f150082p = recyclingImageView;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f150083q = robotoTextView;
        RobotoTextView robotoTextView2 = new RobotoTextView(context);
        this.f150084r = robotoTextView2;
        ButtonWithProgress buttonWithProgress = new ButtonWithProgress(context);
        this.f150085s = buttonWithProgress;
        this.f150086t = new C23528a(context);
        setBackgroundResource(AbstractC16803z.bg_rbt_in_call_quick_set);
        setPadding(AbstractC3104p.m15650a(12.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(12.0f), AbstractC3104p.m15650a(8.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3104p.m15650a(32.0f), AbstractC3104p.m15650a(32.0f));
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        recyclingImageView.setId(AbstractC6918a0.call_rbt_quick_setting_thumb);
        recyclingImageView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(1, AbstractC6918a0.call_rbt_quick_setting_thumb);
        layoutParams2.setMargins(AbstractC3104p.m15650a(12.0f), 0, 0, 0);
        robotoTextView.setId(AbstractC6918a0.call_rbt_quick_setting_intro);
        robotoTextView.setLayoutParams(layoutParams2);
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_xsmall));
        robotoTextView.setTextColor(AbstractC1388a.m6961c(context, AbstractC2808b.wht_a70));
        robotoTextView.setText(context.getString(AbstractC8020f0.str_call_rbt_handshake_info_title));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, AbstractC6918a0.call_rbt_quick_setting_intro);
        layoutParams3.addRule(1, AbstractC6918a0.call_rbt_quick_setting_thumb);
        layoutParams3.addRule(0, AbstractC6918a0.call_rbt_quick_setting_cta);
        layoutParams3.setMargins(AbstractC3104p.m15650a(12.0f), 0, AbstractC3104p.m15650a(10.0f), 0);
        robotoTextView2.setId(AbstractC6918a0.call_rbt_quick_setting_info);
        robotoTextView2.setLayoutParams(layoutParams3);
        new C26708g(robotoTextView2).m137319a(C26705d.m137293a(context, AbstractC2814h.t_normal));
        robotoTextView2.setTextColor(AbstractC1388a.m6961c(context, AbstractC2808b.wht_a100));
        robotoTextView2.setMaxWidth(AbstractC3104p.m15650a(180.0f));
        robotoTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        robotoTextView2.setMarqueeRepeatLimit(-1);
        robotoTextView2.setSingleLine();
        robotoTextView2.setFocusable(true);
        robotoTextView2.setSelected(true);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(11);
        buttonWithProgress.setId(AbstractC6918a0.call_rbt_quick_setting_cta);
        buttonWithProgress.setLayoutParams(layoutParams4);
        buttonWithProgress.getButton().setMinimumWidth(AbstractC3104p.m15650a(100.0f));
        buttonWithProgress.getButton().m90539c(AbstractC2814h.ButtonSmall_Primary);
        buttonWithProgress.getButton().setBackground(AbstractC1388a.m6964f(context, this.f150087u ? AbstractC16803z.call_bg_video_rbt_quick_set_button : AbstractC16803z.call_audio_bg_rbt_quick_set_button));
        buttonWithProgress.getButton().setTextColor(AbstractC19694b.m103335c(context, AbstractC16801x.call_rbt_quick_set_btn_text_color));
        buttonWithProgress.getButton().setText(context.getString(AbstractC8020f0.str_call_rbt_handshake_info_button));
        buttonWithProgress.setIdTracking("CALL_HANDSHAKE_QUICK_SET_RBT");
        buttonWithProgress.setOnClickListener(new View.OnClickListener() { // from class: ep0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingBackTonePreviewView.m157386e(RingBackTonePreviewView.this, view);
            }
        });
        addView(recyclingImageView);
        addView(buttonWithProgress);
        addView(robotoTextView);
        addView(robotoTextView2);
    }
}
