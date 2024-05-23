package com.zing.zalo.p077ui.moduleview.csc;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class FloatingPromoteTrendingStickerModulesView extends ModulesView {

    /* renamed from: K */
    C22126c0 f64703K;

    public FloatingPromoteTrendingStickerModulesView(Context context) {
        this(context, null);
    }

    /* renamed from: V */
    private void m69741V() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        marginLayoutParams.rightMargin = m118742r;
        marginLayoutParams.leftMargin = m118742r;
        setLayoutParams(marginLayoutParams);
        Context context = getContext();
        C16716d c16716d = new C16716d(context);
        c16716d.m89085A0(C23212s8.m119609q(context, AbstractC16781w.bg_tip_trending_sticker));
        c16716d.m89106L().m89042Z(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f)).m89029M(15);
        mo69681L(c16716d);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64703K = c22126c0;
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f64703K.m111962J1(AbstractC11531v0.m62153I3());
        this.f64703K.m111953A1(1);
        this.f64703K.m111980v1(TextUtils.TruncateAt.END);
        c16716d.m89001g1(this.f64703K);
    }

    /* renamed from: W */
    public void m69742W(String str, View.OnClickListener onClickListener) {
        this.f64703K.m111959G1(str);
        setOnClickListener(onClickListener);
    }

    public FloatingPromoteTrendingStickerModulesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingPromoteTrendingStickerModulesView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m69741V();
    }
}
