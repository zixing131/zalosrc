package nk0;

import android.text.SpannableStringBuilder;
import fn0.AbstractC19074t;

/* renamed from: nk0.i0 */
/* loaded from: classes7.dex */
public abstract class AbstractC23831i0 {
    /* renamed from: a */
    public static final boolean m124563a(SpannableStringBuilder spannableStringBuilder) {
        AbstractC19074t.m100208f(spannableStringBuilder, "<this>");
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        AbstractC19074t.m100207e(spannableStringBuilder2, "toString()");
        if (spannableStringBuilder2.length() == 0) {
            return false;
        }
        return C23828h0.f115145a.m124553a().matcher(spannableStringBuilder2).matches();
    }
}
