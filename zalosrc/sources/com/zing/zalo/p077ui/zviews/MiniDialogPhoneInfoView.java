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
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public final class MiniDialogPhoneInfoView extends RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogPhoneInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setPadding(0, AbstractC23136l9.m118742r(15.0f), 0, 0);
        String str = AbstractC23304d.f113368c0.f42455y;
        str = TextUtils.isEmpty(str) ? str : AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        textView.setPadding(0, AbstractC23136l9.m118742r(15.0f), 0, AbstractC23136l9.m118742r(15.0f));
        textView.setId(AbstractC6918a0.mp_dialog_zalo_phone);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        addView(textView, layoutParams);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView.setImageResource(AbstractC16803z.icn_mp_line_check);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        addView(zAppCompatImageView, layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniDialogPhoneInfoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setPadding(0, AbstractC23136l9.m118742r(15.0f), 0, 0);
        String str = AbstractC23304d.f113368c0.f42455y;
        str = TextUtils.isEmpty(str) ? str : AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        textView.setPadding(0, AbstractC23136l9.m118742r(15.0f), 0, AbstractC23136l9.m118742r(15.0f));
        textView.setId(AbstractC6918a0.mp_dialog_zalo_phone);
        textView.setText(str);
        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.N200));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        addView(textView, layoutParams);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(14.0f));
        zAppCompatImageView.setImageResource(AbstractC16803z.icn_mp_line_check);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        addView(zAppCompatImageView, layoutParams2);
    }
}
