package p320ld;

import android.text.TextUtils;
import android.widget.EditText;

/* renamed from: ld.a */
/* loaded from: classes3.dex */
public abstract class AbstractC22429a {
    /* renamed from: a */
    public static boolean m115863a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 4 || str.length() > 16) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m115864b(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setInputType(129);
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: c */
    public static void m115865c(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setInputType(145);
        editText.setSelection(editText.getText().length());
    }
}
