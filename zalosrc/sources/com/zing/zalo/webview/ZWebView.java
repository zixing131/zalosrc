package com.zing.zalo.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import fn0.AbstractC19074t;
import me0.C23212s8;
import p133ek.AbstractC18458a;

/* loaded from: classes5.dex */
public final class ZWebView extends ZaloSystemWebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZWebView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        String str = C23212s8.m119601h() == 1 ? "dark" : "light";
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " ZaloTheme/" + str + " ZaloLanguage/" + AbstractC18458a.f93019a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        String str = C23212s8.m119601h() == 1 ? "dark" : "light";
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " ZaloTheme/" + str + " ZaloLanguage/" + AbstractC18458a.f93019a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        String str = C23212s8.m119601h() == 1 ? "dark" : "light";
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " ZaloTheme/" + str + " ZaloLanguage/" + AbstractC18458a.f93019a);
    }
}
