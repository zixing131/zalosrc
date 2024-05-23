package i70;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p361nb.C23648e;
import p656xs.AbstractC30200a;
import p716zh.C31973j5;
import vg.AbstractC28207v1;
import vg.C28212v6;

/* renamed from: i70.a */
/* loaded from: classes5.dex */
public final class C20379a {

    /* renamed from: a */
    public static final C20379a f100400a = new C20379a();

    /* renamed from: i70.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends ClickableSpan {

        /* renamed from: p */
        private boolean f100401p = true;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f100402q;

        /* renamed from: r */
        final /* synthetic */ ZaloView f100403r;

        /* renamed from: s */
        final /* synthetic */ String f100404s;

        /* renamed from: t */
        final /* synthetic */ String f100405t;

        /* renamed from: u */
        final /* synthetic */ String f100406u;

        /* renamed from: v */
        final /* synthetic */ Context f100407v;

        a(InterfaceC18494a interfaceC18494a, ZaloView zaloView, String str, String str2, String str3, Context context) {
            this.f100402q = interfaceC18494a;
            this.f100403r = zaloView;
            this.f100404s = str;
            this.f100405t = str2;
            this.f100406u = str3;
            this.f100407v = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC18494a interfaceC18494a = this.f100402q;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            } else {
                ZaloView zaloView = this.f100403r;
                if (zaloView != null) {
                    AbstractC28207v1.m141994i3("action.open.inapp", 3, zaloView.m92676n2(), this.f100403r, this.f100404s, null);
                }
            }
            C20379a.f100400a.m106159a(this.f100405t, 0, this.f100406u, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(this.f100407v, AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            if (this.f100401p) {
                this.f100401p = false;
            }
        }
    }

    private C20379a() {
    }

    /* renamed from: b */
    public static final CharSequence m106158b(Context context, ZaloView zaloView, String str, InterfaceC18494a interfaceC18494a, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(context, "viewContext");
        AbstractC19074t.m100208f(str, "baseTitle");
        AbstractC19074t.m100208f(str2, "supportInfo");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + " ");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m118743r0);
        spannableStringBuilder.setSpan(new a(interfaceC18494a, zaloView, str2, str3, str4, context), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final void m106159a(String str, int i11, String str2, String str3) {
        C0815e1.m2075D().m2100V(new C23648e(66, str, i11, str2, str3), false);
    }

    /* renamed from: c */
    public final boolean m106160c(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "group");
        if (c31973j5.m153778p0() && c31973j5.m153774n0() && c31973j5.m153732O() >= AbstractC30200a.m148946e() && AbstractC30200a.m148947f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C28212v6 m106161d() {
        C28212v6 c28212v6 = new C28212v6("");
        c28212v6.f131582h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tooltip_community_auto_upgraded);
        c28212v6.f131577c = "tip.community.auto_upgrade";
        c28212v6.f131590p = 3;
        return c28212v6;
    }
}
