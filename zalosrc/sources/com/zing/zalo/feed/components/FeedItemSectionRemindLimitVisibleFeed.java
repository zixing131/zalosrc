package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import bo.C3006m1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10880s;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public final class FeedItemSectionRemindLimitVisibleFeed extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    private final C22126c0 f44633f0;

    /* renamed from: g0 */
    private FeedBaseAdapter.InterfaceC8048y f44634g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemSectionRemindLimitVisibleFeed(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f44633f0 = new C22126c0(getContext());
    }

    /* renamed from: m0 */
    private final void m44003m0() {
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor));
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C8373r3 c8373r3 = new C8373r3(context);
        c8373r3.m89106L().m89028L(-1, -2);
        mo69681L(c8373r3);
        C16719g m44856p1 = c8373r3.m44856p1();
        C22126c0 c22126c0 = this.f44633f0;
        c22126c0.m111982x1(true);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor2));
        c22126c0.m89106L().m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile) + AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile)).m89070w(m44856p1);
        this.f44633f0.m111955C1(C10880s.m56519f());
        mo69681L(this.f44633f0);
    }

    /* renamed from: n0 */
    private final void m44004n0(C3006m1 c3006m1, InterfaceC10867f interfaceC10867f) {
        Spanned fromHtml;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("<a href=\"zm://LimitFeedVisibleRemindSection/\">%s</a>", Arrays.copyOf(new Object[]{c3006m1.m14411b()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        String str = c3006m1.m14412c() + " " + format;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 63);
        } else {
            fromHtml = Html.fromHtml(str);
        }
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        AbstractC19074t.m100205c(spans);
        for (Object obj : spans) {
            int spanStart = fromHtml.getSpanStart(obj);
            int spanEnd = fromHtml.getSpanEnd(obj);
            int spanFlags = fromHtml.getSpanFlags(obj);
            if (obj instanceof URLSpan) {
                C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                c10866e.m56369M(interfaceC10867f);
                spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
            }
        }
        this.f44633f0.m111959G1(spannableString);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    public final FeedBaseAdapter.InterfaceC8048y getFeedProfileCallback() {
        return this.f44634g0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        super.mo43705j0(context, i11);
        this.f44322M = i11;
        m44003m0();
    }

    /* renamed from: o0 */
    public final void m44005o0(C3006m1 c3006m1, InterfaceC10867f interfaceC10867f) {
        AbstractC19074t.m100208f(c3006m1, "limitFeedVisibleData");
        AbstractC19074t.m100208f(interfaceC10867f, "callbackSpanListener");
        this.f44633f0.m111959G1(c3006m1.m14412c());
        m44004n0(c3006m1, interfaceC10867f);
    }

    public final void setFeedProfileCallback(FeedBaseAdapter.InterfaceC8048y interfaceC8048y) {
        this.f44634g0 = interfaceC8048y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemSectionRemindLimitVisibleFeed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f44633f0 = new C22126c0(getContext());
    }
}
