package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p189gv.C19609h;
import p354n3.C23528a;
import p494rv.C25979a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class MiniAppQRView extends TrackingRelativeLayout implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: q */
    private InterfaceC14608a f75129q;

    /* renamed from: r */
    private RoundedImageView f75130r;

    /* renamed from: s */
    private RobotoTextView f75131s;

    /* renamed from: t */
    private RelativeLayout f75132t;

    /* renamed from: u */
    private RobotoTextView f75133u;

    /* renamed from: v */
    private LinearLayout f75134v;

    /* renamed from: w */
    private String f75135w;

    /* renamed from: x */
    private String f75136x;

    /* renamed from: y */
    private C16281vx f75137y;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppQRView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14608a {
        /* renamed from: g0 */
        void mo81683g0(String str);

        /* renamed from: r3 */
        void mo81684r3(String str);

        /* renamed from: zC */
        void mo81685zC();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppQRView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f75137y = new C16281vx(this);
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.mini_app_qr_view, this);
        View findViewById = findViewById(AbstractC6918a0.ma_qr_view_close);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        TrackingImageView trackingImageView = (TrackingImageView) findViewById;
        trackingImageView.setIdTracking("ma_qr_code_close");
        trackingImageView.setOnClickListener(this);
        View findViewById2 = findViewById(AbstractC6918a0.ma_qr_view_logo);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f75130r = (RoundedImageView) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.ma_qr_view_ma_name);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f75131s = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC6918a0.ma_qr_view_qr_image);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f75132t = (RelativeLayout) findViewById4;
        View findViewById5 = findViewById(AbstractC6918a0.buttonActionView);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f75134v = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(AbstractC6918a0.textDescription);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f75133u = (RobotoTextView) findViewById6;
        this.f75134v.setVisibility(4);
        m81748e();
        setIdTracking("ma_qr_code_view");
    }

    /* renamed from: d */
    private final void m81747d() {
        this.f75132t.removeAllViews();
        this.f75134v.removeAllViews();
        LinearLayout linearLayout = this.f75134v;
        int i11 = AbstractC6918a0.retry_view;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_try_again_button);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        linearLayout.addView(m81749g(i11, "ma_qr_code_retry", m118743r0, C27280g.m139660c(context, AbstractC23322a.zds_ic_retry_line_24, AbstractC2807a.icon_01)));
        this.f75132t.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.ui_background_pressed));
        this.f75133u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_qr_not_exist));
        this.f75134v.setVisibility(0);
    }

    /* renamed from: e */
    private final void m81748e() {
        this.f75134v.removeAllViews();
        LinearLayout linearLayout = this.f75134v;
        int i11 = AbstractC6918a0.ma_qr_view_share;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.share);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        linearLayout.addView(m81749g(i11, "ma_qr_code_share", m118743r0, C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_01)));
        LinearLayout linearLayout2 = this.f75134v;
        int i12 = AbstractC6918a0.ma_qr_view_download;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_my_qr_download);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        linearLayout2.addView(m81749g(i12, "ma_qr_code_download", m118743r02, C27280g.m139660c(context2, AbstractC23322a.zds_ic_download_line_24, AbstractC2807a.icon_01)));
    }

    /* renamed from: g */
    private final View m81749g(int i11, String str, String str2, Drawable drawable) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        int m118742r = AbstractC23136l9.m118742r(20.0f);
        linearLayout.setPadding(m118742r, 0, m118742r, 0);
        int m118742r2 = AbstractC23136l9.m118742r(48.0f);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        TrackingImageView trackingImageView = new TrackingImageView(context);
        trackingImageView.setId(i11);
        trackingImageView.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.mini_app_button_qr_view_bg));
        trackingImageView.setImageDrawable(drawable);
        trackingImageView.setLayoutParams(new ViewGroup.LayoutParams(m118742r2, m118742r2));
        trackingImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        trackingImageView.setIdTracking(str);
        trackingImageView.setOnClickListener(this);
        linearLayout.addView(trackingImageView);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context2);
        robotoTextView.setText(str2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setTextSize(1, 14.0f);
        robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        linearLayout.addView(robotoTextView);
        return linearLayout;
    }

    /* renamed from: h */
    private final void m81750h() {
        String str = this.f75136x;
        if (str != null && !AbstractC19074t.m100204b(str, "")) {
            m81751i();
            ((C23528a) new C23528a(getContext()).m123612r(new RoundedImageView(getContext()))).m123579C(this.f75136x, C23278z2.f112845a.m120170h1(), this.f75137y);
        } else {
            m81747d();
        }
    }

    /* renamed from: i */
    private final void m81751i() {
        String str;
        this.f75132t.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
        LottieImageView lottieImageView = new LottieImageView(getContext());
        this.f75132t.removeAllViews();
        int m118742r = AbstractC23136l9.m118742r(64.0f);
        try {
            if (C23212s8.m119602i()) {
                str = "lottiefiles/loading-qrcode-darkmode.json";
            } else {
                str = "lottiefiles/loading-qrcode.json";
            }
            lottieImageView.m92157y(str, true);
            C25979a.m133810a(lottieImageView, new LottieConfig.C8999a().m48112f("fixed_screen").m48107a());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        this.f75132t.addView(lottieImageView, new ViewGroup.LayoutParams(m118742r, m118742r));
        lottieImageView.m92155v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m81752j(C3979l c3979l) {
        if (c3979l != null) {
            this.f75132t.removeAllViews();
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            recyclingImageView.setImageBitmap(c3979l.m18839c());
            this.f75132t.addView(recyclingImageView, new ViewGroup.LayoutParams(-1, -1));
            this.f75133u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_qr_description));
            this.f75132t.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
            m81748e();
        } else {
            this.f75132t.removeAllViews();
            this.f75134v.removeAllViews();
            LinearLayout linearLayout = this.f75134v;
            int i11 = AbstractC6918a0.retry_view;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_try_again_button);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            linearLayout.addView(m81749g(i11, "ma_qr_code_retry", m118743r0, C27280g.m139660c(context, AbstractC23322a.zds_ic_retry_line_24, AbstractC2807a.icon_01)));
            this.f75132t.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.ui_background_pressed));
            this.f75133u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more_username_network_error));
        }
        this.f75134v.setVisibility(0);
    }

    /* renamed from: f */
    public final void m81753f(C19609h c19609h) {
        String m102618l;
        AbstractC19074t.m100208f(c19609h, "maInfo");
        ((C23528a) new C23528a(getContext()).m123612r(this.f75130r)).m123618x(c19609h.m102612f(), C23278z2.f112845a.m120171i1());
        if (c19609h.m102614h().has("appQRUrlForShare")) {
            m102618l = c19609h.m102614h().getString("appQRUrlForShare");
        } else {
            m102618l = c19609h.m102618l();
        }
        this.f75135w = m102618l;
        this.f75136x = c19609h.m102618l();
        this.f75131s.setText(c19609h.m102619m());
        m81750h();
    }

    public final InterfaceC14608a getMiniAppQRListener() {
        return this.f75129q;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MAQRCodeView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC14608a interfaceC14608a;
        InterfaceC14608a interfaceC14608a2;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ma_qr_view_share;
        if (num != null && num.intValue() == i11) {
            String str = this.f75135w;
            if (str != null && (interfaceC14608a2 = this.f75129q) != null) {
                interfaceC14608a2.mo81683g0(str);
                return;
            }
            return;
        }
        int i12 = AbstractC6918a0.ma_qr_view_download;
        if (num != null && num.intValue() == i12) {
            String str2 = this.f75135w;
            if (str2 != null && (interfaceC14608a = this.f75129q) != null) {
                interfaceC14608a.mo81684r3(str2);
                return;
            }
            return;
        }
        int i13 = AbstractC6918a0.ma_qr_view_close;
        if (num != null && num.intValue() == i13) {
            InterfaceC14608a interfaceC14608a3 = this.f75129q;
            if (interfaceC14608a3 != null) {
                interfaceC14608a3.mo81685zC();
                return;
            }
            return;
        }
        int i14 = AbstractC6918a0.retry_view;
        if (num != null && num.intValue() == i14 && this.f75136x != null) {
            m81750h();
        }
    }

    public final void setMiniAppQRListener(InterfaceC14608a interfaceC14608a) {
        this.f75129q = interfaceC14608a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppQRView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f75137y = new C16281vx(this);
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.mini_app_qr_view, this);
        View findViewById = findViewById(AbstractC6918a0.ma_qr_view_close);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        TrackingImageView trackingImageView = (TrackingImageView) findViewById;
        trackingImageView.setIdTracking("ma_qr_code_close");
        trackingImageView.setOnClickListener(this);
        View findViewById2 = findViewById(AbstractC6918a0.ma_qr_view_logo);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f75130r = (RoundedImageView) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.ma_qr_view_ma_name);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f75131s = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC6918a0.ma_qr_view_qr_image);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f75132t = (RelativeLayout) findViewById4;
        View findViewById5 = findViewById(AbstractC6918a0.buttonActionView);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f75134v = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(AbstractC6918a0.textDescription);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f75133u = (RobotoTextView) findViewById6;
        this.f75134v.setVisibility(4);
        m81748e();
        setIdTracking("ma_qr_code_view");
    }
}
