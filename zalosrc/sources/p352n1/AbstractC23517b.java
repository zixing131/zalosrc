package p352n1;

import android.text.Spanned;
import android.widget.TextView;

/* renamed from: n1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC23517b {
    /* renamed from: a */
    private static boolean m123434a(CharSequence charSequence, CharSequence charSequence2) {
        boolean z11;
        boolean z12;
        if (charSequence == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (charSequence2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m123435b(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else if (!m123434a(charSequence, text)) {
                    return;
                }
                textView.setText(charSequence);
            }
        }
    }
}
