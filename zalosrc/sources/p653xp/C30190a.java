package p653xp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.NotificationBasicInfo;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.uicontrol.Snackbar;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import is.AbstractC20833z;
import java.util.Arrays;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p458qr.C25479l;

/* renamed from: xp.a */
/* loaded from: classes4.dex */
public final class C30190a {

    /* renamed from: a */
    public static final C30190a f140233a = new C30190a();

    private C30190a() {
    }

    /* renamed from: a */
    public final C23648e m148856a(String str, String str2) {
        AbstractC19074t.m100208f(str, "actionID");
        AbstractC19074t.m100208f(str2, "entryPoint");
        return new C23648e(32, str2, 0, str, new String[0]);
    }

    /* renamed from: b */
    public final Snackbar m148857b(View view, View.OnClickListener onClickListener, C25479l c25479l) {
        boolean m127128x;
        Typeface m76694c;
        AbstractC19074t.m100208f(view, "containView");
        AbstractC19074t.m100208f(onClickListener, "callbackListener");
        AbstractC19074t.m100208f(c25479l, "snackBarData");
        try {
            Snackbar m88017q = Snackbar.m88017q(view, c25479l.m131965c(), c25479l.m131966d());
            AbstractC19074t.m100207e(m88017q, "make(...)");
            m127128x = AbstractC24341v.m127128x(c25479l.m131964b());
            if (!m127128x) {
                m88017q.m88030s(c25479l.m131964b(), onClickListener);
            }
            View m88025i = m88017q.m88025i();
            AbstractC19074t.m100207e(m88025i, "getView(...)");
            m88025i.setBackground(AbstractC23136l9.m118665N(m88025i.getContext(), AbstractC16803z.feed_snackbar_background_default));
            View findViewById = m88025i.findViewById(AbstractC6918a0.snackbar_text);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            View findViewById2 = m88025i.findViewById(AbstractC6918a0.snackbar_action);
            AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            textView2.setTextColor(Color.parseColor("#4C9DFF"));
            if (AbstractC23309i.m122089kb() == 0 && (m76694c = C13718q1.m76694c(MainApplication.Companion.m35500c(), 5)) != null) {
                textView.setTypeface(m76694c);
                textView2.setTypeface(m76694c);
            }
            if (m88025i.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams2 = m88025i.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f));
            }
            return m88017q;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final String m148858c(String str) {
        Spanned fromHtml;
        AbstractC19074t.m100208f(str, "userId");
        String m108910o = AbstractC20833z.m108910o(str);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43873x23310409);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(m118743r0, 63);
            AbstractC19074t.m100205c(fromHtml);
        } else {
            fromHtml = Html.fromHtml(m118743r0);
            AbstractC19074t.m100205c(fromHtml);
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(fromHtml.toString(), Arrays.copyOf(new Object[]{m108910o}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: d */
    public final String m148859d(String str) {
        Spanned fromHtml;
        AbstractC19074t.m100208f(str, "userId");
        String m108910o = AbstractC20833z.m108910o(str);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43874xc1b4cdac);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(m118743r0, 63);
            AbstractC19074t.m100205c(fromHtml);
        } else {
            fromHtml = Html.fromHtml(m118743r0);
            AbstractC19074t.m100205c(fromHtml);
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(fromHtml.toString(), Arrays.copyOf(new Object[]{m108910o}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: e */
    public final boolean m148860e(NotificationBasicInfo notificationBasicInfo) {
        AbstractC19074t.m100208f(notificationBasicInfo, "notificationBasicInfo");
        return AbstractC19074t.m100204b(notificationBasicInfo.m40638b(), "70");
    }
}
