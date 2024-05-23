package com.zing.zalo.webview;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.utils.ToastUtils;
import p006a0.C0012a;
import th.AbstractC26681b;

/* renamed from: com.zing.zalo.webview.m */
/* loaded from: classes5.dex */
public abstract class AbstractC16795m {
    /* renamed from: a */
    public static void m89712a(Context context, String str, String str2) {
        if (context != null) {
            try {
                new C0012a((ClipboardManager) context.getSystemService("clipboard"), new SensitiveData("clipboard_copy_text_webview", "web_view")).m16c(ClipData.newPlainText("", str));
                if (AbstractC26681b.f126359d && !TextUtils.isEmpty(str2)) {
                    ToastUtils.showMess(str2);
                }
            } catch (SensitiveDataException unused) {
                ToastUtils.showMess(context.getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
            }
        }
    }
}
