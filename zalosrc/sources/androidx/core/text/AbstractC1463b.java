package androidx.core.text;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: androidx.core.text.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1463b {

    /* renamed from: androidx.core.text.b$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static Spanned m7442a(String str, int i11) {
            return Html.fromHtml(str, i11);
        }

        /* renamed from: b */
        static Spanned m7443b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i11, imageGetter, tagHandler);
        }

        /* renamed from: c */
        static String m7444c(Spanned spanned, int i11) {
            return Html.toHtml(spanned, i11);
        }
    }

    /* renamed from: a */
    public static Spanned m7440a(String str, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m7442a(str, i11);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: b */
    public static Spanned m7441b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m7443b(str, i11, imageGetter, tagHandler);
        }
        return Html.fromHtml(str, imageGetter, tagHandler);
    }
}
