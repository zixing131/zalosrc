package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.rounedlayout.LinearRoundedLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class MiniAppZinstantErrorView extends LinearLayout implements View.OnClickListener {

    /* renamed from: p */
    private InterfaceC15921mv f75148p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantErrorView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        setOrientation(1);
        setGravity(1);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(308.0f)));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context2);
        robotoTextView.setTextSize(1, 13.0f);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_02));
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_permission_dialog_error_msg));
        robotoTextView.setTextAlignment(4);
        linearLayout.addView(robotoTextView);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        LinearRoundedLayout linearRoundedLayout = new LinearRoundedLayout(context3);
        linearRoundedLayout.setGravity(17);
        linearRoundedLayout.m72881d(C23212s8.m119606n(AbstractC2807a.ui_background_pressed), C23212s8.m119606n(AbstractC2807a.ui_background_selected));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        layoutParams.setMargins(0, AbstractC23136l9.m118742r(24.0f), 0, 0);
        linearRoundedLayout.setLayoutParams(layoutParams);
        linearRoundedLayout.setCornerRadius(AbstractC23136l9.m118742r(24.0f));
        linearRoundedLayout.setClickable(true);
        linearRoundedLayout.setOnClickListener(this);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context4 = getContext();
        AbstractC19074t.m100205c(context4);
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context4, AbstractC23322a.zds_ic_retry_solid_24, AbstractC2807a.icon_01));
        linearRoundedLayout.addView(zAppCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        linearRoundedLayout.setId(AbstractC6918a0.ma_zinstant_retry);
        linearRoundedLayout.setOnClickListener(this);
        linearLayout.addView(linearRoundedLayout);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context5);
        robotoTextView2.setTextSize(1, 14.0f);
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.text_01));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, AbstractC23136l9.m118742r(8.0f), 0, 0);
        robotoTextView2.setLayoutParams(layoutParams2);
        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
        linearLayout.addView(robotoTextView2);
        addView(linearLayout);
    }

    public final InterfaceC15921mv getMaZinstantErrorListener() {
        return this.f75148p;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC15921mv interfaceC15921mv;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ma_zinstant_retry;
        if (num != null && num.intValue() == i11 && (interfaceC15921mv = this.f75148p) != null) {
            interfaceC15921mv.mo87355a();
        }
    }

    public final void setMaZinstantErrorListener(InterfaceC15921mv interfaceC15921mv) {
        this.f75148p = interfaceC15921mv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        setOrientation(1);
        setGravity(1);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(308.0f)));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context2);
        robotoTextView.setTextSize(1, 13.0f);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_02));
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_permission_dialog_error_msg));
        robotoTextView.setTextAlignment(4);
        linearLayout.addView(robotoTextView);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        LinearRoundedLayout linearRoundedLayout = new LinearRoundedLayout(context3);
        linearRoundedLayout.setGravity(17);
        linearRoundedLayout.m72881d(C23212s8.m119606n(AbstractC2807a.ui_background_pressed), C23212s8.m119606n(AbstractC2807a.ui_background_selected));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        layoutParams.setMargins(0, AbstractC23136l9.m118742r(24.0f), 0, 0);
        linearRoundedLayout.setLayoutParams(layoutParams);
        linearRoundedLayout.setCornerRadius(AbstractC23136l9.m118742r(24.0f));
        linearRoundedLayout.setClickable(true);
        linearRoundedLayout.setOnClickListener(this);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context4 = getContext();
        AbstractC19074t.m100205c(context4);
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context4, AbstractC23322a.zds_ic_retry_solid_24, AbstractC2807a.icon_01));
        linearRoundedLayout.addView(zAppCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        linearRoundedLayout.setId(AbstractC6918a0.ma_zinstant_retry);
        linearRoundedLayout.setOnClickListener(this);
        linearLayout.addView(linearRoundedLayout);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context5);
        robotoTextView2.setTextSize(1, 14.0f);
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.text_01));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, AbstractC23136l9.m118742r(8.0f), 0, 0);
        robotoTextView2.setLayoutParams(layoutParams2);
        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
        linearLayout.addView(robotoTextView2);
        addView(linearLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantErrorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setOrientation(1);
        setGravity(1);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(308.0f)));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context2);
        robotoTextView.setTextSize(1, 13.0f);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_02));
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_permission_dialog_error_msg));
        robotoTextView.setTextAlignment(4);
        linearLayout.addView(robotoTextView);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        LinearRoundedLayout linearRoundedLayout = new LinearRoundedLayout(context3);
        linearRoundedLayout.setGravity(17);
        linearRoundedLayout.m72881d(C23212s8.m119606n(AbstractC2807a.ui_background_pressed), C23212s8.m119606n(AbstractC2807a.ui_background_selected));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        layoutParams.setMargins(0, AbstractC23136l9.m118742r(24.0f), 0, 0);
        linearRoundedLayout.setLayoutParams(layoutParams);
        linearRoundedLayout.setCornerRadius(AbstractC23136l9.m118742r(24.0f));
        linearRoundedLayout.setClickable(true);
        linearRoundedLayout.setOnClickListener(this);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context4 = getContext();
        AbstractC19074t.m100205c(context4);
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context4, AbstractC23322a.zds_ic_retry_solid_24, AbstractC2807a.icon_01));
        linearRoundedLayout.addView(zAppCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        linearRoundedLayout.setId(AbstractC6918a0.ma_zinstant_retry);
        linearRoundedLayout.setOnClickListener(this);
        linearLayout.addView(linearRoundedLayout);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context5);
        robotoTextView2.setTextSize(1, 14.0f);
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.text_01));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, AbstractC23136l9.m118742r(8.0f), 0, 0);
        robotoTextView2.setLayoutParams(layoutParams2);
        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
        linearLayout.addView(robotoTextView2);
        addView(linearLayout);
    }
}
