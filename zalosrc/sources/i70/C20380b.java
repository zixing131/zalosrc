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
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import vg.AbstractC28207v1;
import xb0.C29572a;

/* renamed from: i70.b */
/* loaded from: classes5.dex */
public final class C20380b {

    /* renamed from: a */
    public static final C20380b f100408a = new C20380b();

    /* renamed from: i70.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends ClickableSpan {

        /* renamed from: p */
        private boolean f100409p = true;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f100410q;

        /* renamed from: r */
        final /* synthetic */ ZaloView f100411r;

        /* renamed from: s */
        final /* synthetic */ String f100412s;

        /* renamed from: t */
        final /* synthetic */ Context f100413t;

        a(InterfaceC18494a interfaceC18494a, ZaloView zaloView, String str, Context context) {
            this.f100410q = interfaceC18494a;
            this.f100411r = zaloView;
            this.f100412s = str;
            this.f100413t = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC18494a interfaceC18494a = this.f100410q;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            } else {
                ZaloView zaloView = this.f100411r;
                if (zaloView != null) {
                    AbstractC28207v1.m141994i3("action.open.inapp", 3, zaloView.m92676n2(), this.f100411r, AbstractC23306f.m120583H().m110204g().m116320l(), null);
                }
            }
            C20380b.f100408a.m106166e(this.f100412s);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(this.f100413t, AbstractC16781w.LinkColor));
            if (this.f100409p) {
                this.f100409p = false;
                C20380b.f100408a.m106167f(this.f100412s);
            }
        }
    }

    private C20380b() {
    }

    /* renamed from: c */
    public static final CharSequence m106164c(Context context, ZaloView zaloView, String str, String str2, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(context, "viewContext");
        AbstractC19074t.m100208f(str, "baseTitle");
        AbstractC19074t.m100208f(str2, "entryPoint");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ". ");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_view_members_learn_more);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m118743r0);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new a(interfaceC18494a, zaloView, str2, context), length, length2, 33);
        spannableStringBuilder.setSpan(new C29572a(Typeface.DEFAULT_BOLD), length, length2, 33);
        return spannableStringBuilder;
    }

    /* renamed from: d */
    public static /* synthetic */ CharSequence m106165d(Context context, ZaloView zaloView, String str, String str2, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            interfaceC18494a = null;
        }
        return m106164c(context, zaloView, str, str2, interfaceC18494a);
    }

    /* renamed from: e */
    public final void m106166e(String str) {
        C0815e1.m2075D().m2100V(new C23648e(61, str, 0, "hide_mem_list_intro_tap", new String[0]), true);
    }

    /* renamed from: f */
    public final void m106167f(String str) {
        C0815e1.m2075D().m2100V(new C23648e(61, str, 1, "hide_mem_list_intro_view", new String[0]), true);
    }
}
