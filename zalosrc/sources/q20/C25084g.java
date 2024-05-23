package q20;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19074t;
import p006a0.C0012a;
import v00.AbstractC27413h;

/* renamed from: q20.g */
/* loaded from: classes5.dex */
public final class C25084g {

    /* renamed from: a */
    public static final C25084g f120484a = new C25084g();

    private C25084g() {
    }

    /* renamed from: c */
    private final C0012a m130016c(Context context) {
        ClipboardManager clipboardManager;
        Object systemService = context.getSystemService("clipboard");
        if (systemService instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) systemService;
        } else {
            clipboardManager = null;
        }
        if (clipboardManager == null) {
            return null;
        }
        try {
            return new C0012a(clipboardManager, new SensitiveData("clipboard_copy_text_short_video", "channel", null, 4, null));
        } catch (SensitiveDataException unused) {
            C25097t.f120556a.m130153n(context, AbstractC27413h.zch_error_access_sensitive_clipboard);
            return null;
        }
    }

    /* renamed from: a */
    public final void m130017a(Context context, String str) {
        C0012a m130016c;
        AbstractC19074t.m100208f(str, "link");
        if (context != null && (m130016c = m130016c(context)) != null) {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            AbstractC19074t.m100207e(newPlainText, "newPlainText(...)");
            m130016c.m16c(newPlainText);
            C25097t.f120556a.m130153n(context, AbstractC27413h.zch_action_copy_link);
        }
    }

    /* renamed from: b */
    public final void m130018b(Context context, String str) {
        C0012a m130016c;
        AbstractC19074t.m100208f(str, "text");
        if (context != null && (m130016c = m130016c(context)) != null) {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            AbstractC19074t.m100207e(newPlainText, "newPlainText(...)");
            m130016c.m16c(newPlainText);
            C25097t.f120556a.m130153n(context, AbstractC27413h.zch_action_copy_text);
        }
    }
}
