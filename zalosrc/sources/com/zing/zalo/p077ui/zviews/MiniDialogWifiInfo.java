package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import fn0.AbstractC19074t;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p140ev.C18616e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public final class MiniDialogWifiInfo extends RelativeLayout {

    /* renamed from: p */
    private C18616e f75172p;

    /* renamed from: q */
    private final TextView f75173q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogWifiInfo(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        String str = AbstractC23304d.f113368c0.f42455y;
        str = TextUtils.isEmpty(str) ? str : AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        zAppCompatImageView.setImageResource(AbstractC16803z.ic_mp_wifi_info);
        zAppCompatImageView.setId(AbstractC6918a0.mp_wifi_icon);
        addView(zAppCompatImageView, layoutParams);
        TextView textView = new TextView(getContext());
        this.f75173q = textView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(17, AbstractC6918a0.mp_wifi_icon);
        layoutParams2.addRule(16, AbstractC6918a0.mp_wifi_check_icon);
        layoutParams2.setMarginStart(AbstractC23136l9.m118742r(10.0f));
        textView.setPadding(0, AbstractC23136l9.m118742r(17.0f), 0, AbstractC23136l9.m118742r(17.0f));
        textView.setId(AbstractC6918a0.mp_wifi_name);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, layoutParams2);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView2.setImageResource(AbstractC16803z.icn_mp_line_check);
        zAppCompatImageView2.setId(AbstractC6918a0.mp_wifi_check_icon);
        layoutParams3.setMarginStart(AbstractC23136l9.m118742r(5.0f));
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        addView(zAppCompatImageView2, layoutParams3);
        C18616e c18616e = this.f75172p;
        if (c18616e != null) {
            setWifiConfig(c18616e);
        }
    }

    public final void setWifiConfig(C18616e c18616e) {
        AbstractC19074t.m100208f(c18616e, "mpWifiConfiguration");
        this.f75172p = c18616e;
        this.f75173q.setText(c18616e.m98376e());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogWifiInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        String str = AbstractC23304d.f113368c0.f42455y;
        str = TextUtils.isEmpty(str) ? str : AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        zAppCompatImageView.setImageResource(AbstractC16803z.ic_mp_wifi_info);
        zAppCompatImageView.setId(AbstractC6918a0.mp_wifi_icon);
        addView(zAppCompatImageView, layoutParams);
        TextView textView = new TextView(getContext());
        this.f75173q = textView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(17, AbstractC6918a0.mp_wifi_icon);
        layoutParams2.addRule(16, AbstractC6918a0.mp_wifi_check_icon);
        layoutParams2.setMarginStart(AbstractC23136l9.m118742r(10.0f));
        textView.setPadding(0, AbstractC23136l9.m118742r(17.0f), 0, AbstractC23136l9.m118742r(17.0f));
        textView.setId(AbstractC6918a0.mp_wifi_name);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, layoutParams2);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView2.setImageResource(AbstractC16803z.icn_mp_line_check);
        zAppCompatImageView2.setId(AbstractC6918a0.mp_wifi_check_icon);
        layoutParams3.setMarginStart(AbstractC23136l9.m118742r(5.0f));
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        addView(zAppCompatImageView2, layoutParams3);
        C18616e c18616e = this.f75172p;
        if (c18616e != null) {
            setWifiConfig(c18616e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogWifiInfo(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        String str = AbstractC23304d.f113368c0.f42455y;
        str = TextUtils.isEmpty(str) ? str : AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        zAppCompatImageView.setImageResource(AbstractC16803z.ic_mp_wifi_info);
        zAppCompatImageView.setId(AbstractC6918a0.mp_wifi_icon);
        addView(zAppCompatImageView, layoutParams);
        TextView textView = new TextView(getContext());
        this.f75173q = textView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(17, AbstractC6918a0.mp_wifi_icon);
        layoutParams2.addRule(16, AbstractC6918a0.mp_wifi_check_icon);
        layoutParams2.setMarginStart(AbstractC23136l9.m118742r(10.0f));
        textView.setPadding(0, AbstractC23136l9.m118742r(17.0f), 0, AbstractC23136l9.m118742r(17.0f));
        textView.setId(AbstractC6918a0.mp_wifi_name);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, layoutParams2);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView2.setImageResource(AbstractC16803z.icn_mp_line_check);
        zAppCompatImageView2.setId(AbstractC6918a0.mp_wifi_check_icon);
        layoutParams3.setMarginStart(AbstractC23136l9.m118742r(5.0f));
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        addView(zAppCompatImageView2, layoutParams3);
        C18616e c18616e = this.f75172p;
        if (c18616e != null) {
            setWifiConfig(c18616e);
        }
    }
}
