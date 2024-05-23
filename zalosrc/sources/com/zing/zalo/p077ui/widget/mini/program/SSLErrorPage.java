package com.zing.zalo.p077ui.widget.mini.program;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class SSLErrorPage extends LinearLayout {

    /* renamed from: p */
    private RobotoTextView f70730p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSLErrorPage(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.container));
        setGravity(17);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
        setOrientation(1);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2807a.support_error));
        int m118742r = AbstractC23136l9.m118742r(48.0f);
        addView(zAppCompatImageView, new LinearLayout.LayoutParams(m118742r, m118742r));
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context3);
        robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        robotoTextView.setTextSize(1, 18.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AbstractC23136l9.m118742r(20.0f);
        robotoTextView.setTextStyleBold(true);
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_warnings_header));
        robotoTextView.setTextAlignment(4);
        addView(robotoTextView, layoutParams);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context4);
        this.f70730p = robotoTextView2;
        robotoTextView2.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        this.f70730p.setTextSize(1, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC23136l9.m118742r(15.0f);
        this.f70730p.setTextAlignment(4);
        addView(this.f70730p, layoutParams2);
    }

    @SuppressLint({"SetTextI18n"})
    public final void setData(String str) {
        AbstractC19074t.m100208f(str, "msg");
        this.f70730p.setText(str + "\nNET::ERR_CERT_INVALID");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSLErrorPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.container));
        setGravity(17);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
        setOrientation(1);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2807a.support_error));
        int m118742r = AbstractC23136l9.m118742r(48.0f);
        addView(zAppCompatImageView, new LinearLayout.LayoutParams(m118742r, m118742r));
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context3);
        robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        robotoTextView.setTextSize(1, 18.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AbstractC23136l9.m118742r(20.0f);
        robotoTextView.setTextStyleBold(true);
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_warnings_header));
        robotoTextView.setTextAlignment(4);
        addView(robotoTextView, layoutParams);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context4);
        this.f70730p = robotoTextView2;
        robotoTextView2.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        this.f70730p.setTextSize(1, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC23136l9.m118742r(15.0f);
        this.f70730p.setTextAlignment(4);
        addView(this.f70730p, layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSLErrorPage(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.container));
        setGravity(17);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
        setOrientation(1);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2807a.support_error));
        int m118742r = AbstractC23136l9.m118742r(48.0f);
        addView(zAppCompatImageView, new LinearLayout.LayoutParams(m118742r, m118742r));
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context3);
        robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        robotoTextView.setTextSize(1, 18.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AbstractC23136l9.m118742r(20.0f);
        robotoTextView.setTextStyleBold(true);
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_warnings_header));
        robotoTextView.setTextAlignment(4);
        addView(robotoTextView, layoutParams);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context4);
        this.f70730p = robotoTextView2;
        robotoTextView2.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        this.f70730p.setTextSize(1, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC23136l9.m118742r(15.0f);
        this.f70730p.setTextAlignment(4);
        addView(this.f70730p, layoutParams2);
    }
}
