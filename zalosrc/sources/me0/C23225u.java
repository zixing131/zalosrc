package me0;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;

/* renamed from: me0.u */
/* loaded from: classes4.dex */
public final class C23225u {

    /* renamed from: a */
    public static final C23225u f112604a = new C23225u();

    /* renamed from: me0.u$a */
    /* loaded from: classes4.dex */
    public static final class a extends C10866e {

        /* renamed from: g0 */
        private Runnable f112605g0;

        public a(int i11, int i12, Runnable runnable) {
            AbstractC19074t.m100208f(runnable, "runnable");
            this.f54862y = i11;
            this.f54863z = i12;
            this.f112605g0 = runnable;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            Runnable runnable = this.f112605g0;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119606n(AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118639A(AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
        }
    }

    private C23225u() {
    }

    /* renamed from: a */
    public static final Spannable m119697a(int i11, int i12, String str, Runnable runnable) {
        AbstractC19074t.m100208f(str, "middleText");
        AbstractC19074t.m100208f(runnable, "runnableAction");
        try {
            String m118743r0 = AbstractC23136l9.m118743r0(i12);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(i11) + str + m118743r0);
            spannableString.setSpan(new a(spannableString.length() - m118743r0.length(), spannableString.length(), runnable), spannableString.length() - m118743r0.length(), spannableString.length(), 33);
            return spannableString;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m119698b(TextView textView, int i11, int i12, String str, Runnable runnable) {
        AbstractC19074t.m100208f(textView, "textView");
        AbstractC19074t.m100208f(str, "middleText");
        AbstractC19074t.m100208f(runnable, "runnableAction");
        try {
            Spannable m119697a = m119697a(i11, i12, str, runnable);
            if (m119697a != null) {
                textView.setText(m119697a);
                textView.setMovementMethod(CustomMovementMethod.m56305e());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m119699c(TextView textView, int i11, int i12, String str, Runnable runnable, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            str = " ";
        }
        m119698b(textView, i11, i12, str, runnable);
    }
}
