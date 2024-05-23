package me0;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.C1335e1;
import androidx.core.text.AbstractC1463b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.social.controls.C10866e;
import gg0.AbstractC19444a;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p304ks.AbstractC21935u;
import p363nh.C23744a;

/* renamed from: me0.h5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23088h5 {
    /* renamed from: b */
    public static boolean m118421b() {
        return C1335e1.m6691e(MainApplication.getAppContext()).m6695a();
    }

    /* renamed from: c */
    public static boolean m118422c() {
        boolean canUseFullScreenIntent;
        if (Build.VERSION.SDK_INT >= 34) {
            canUseFullScreenIntent = ((NotificationManager) MainApplication.getAppContext().getSystemService("notification")).canUseFullScreenIntent();
            return canUseFullScreenIntent;
        }
        return true;
    }

    /* renamed from: d */
    public static int m118423d(String str, String str2) {
        return Objects.hash(str, str2);
    }

    /* renamed from: e */
    public static void m118424e(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            context.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268468224).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()));
            return;
        }
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        context.startActivity(intent);
    }

    /* renamed from: f */
    public static /* synthetic */ void m118425f(int i11, boolean z11, View view, TextView textView) {
        try {
            if (i11 > 0) {
                if (!z11) {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (textView != null) {
                        if (i11 > 5) {
                            textView.setText(MainApplication.getAppContext().getString(AbstractC8020f0.str_noti_over_5));
                        } else {
                            textView.setText("" + i11);
                        }
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (view != null) {
                view.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m118426g() {
        try {
            C23744a.m124114c().m124116d(6099, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m118427h(Context context) {
        context.startActivity(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + context.getPackageName())));
    }

    /* renamed from: i */
    public static void m118428i(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: j */
    public static SpannableString m118429j(String str, int i11, StyleSpan styleSpan) {
        String str2;
        String group;
        ?? replaceAll = str.replaceAll("(\r\n|\n)", "<br/>");
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(replaceAll);
            replaceAll = replaceAll;
            if (matcher.find()) {
                if (replaceAll.contains("<a href=\"http")) {
                    replaceAll = replaceAll;
                } else if (matcher.group().startsWith("https://")) {
                    replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                } else if (matcher.group().startsWith("http://")) {
                    replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                } else {
                    replaceAll = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(replaceAll);
            while (matcher2.find()) {
                ?? group2 = matcher2.group(0);
                if (group2 != 0 && group2.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group2);
                    String str3 = "";
                    if (matcher3.find() && (group = matcher3.group(1)) != null) {
                        String replace = group.replace("\"", "");
                        str3 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group3 = matcher2.group(1);
                    String m114542i = AbstractC21935u.m114542i(str3, group3);
                    if (group3 != null && !group3.equals(m114542i)) {
                        str2 = group2.replace(group3, m114542i);
                    } else {
                        str2 = group2;
                    }
                    if (replaceAll.contains(group2) && !group2.equals(str2)) {
                        replaceAll = replaceAll.replace(group2, str2);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned m7440a = AbstractC1463b.m7440a(replaceAll, 0);
        SpannableString spannableString = new SpannableString(m7440a.toString());
        try {
            for (Object obj : m7440a.getSpans(0, m7440a.length(), Object.class)) {
                int spanStart = m7440a.getSpanStart(obj);
                int spanEnd = m7440a.getSpanEnd(obj);
                int spanFlags = m7440a.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    if (c10866e.m56406u() == i11) {
                        spannableString.setSpan(styleSpan, spanStart, spanEnd, 33);
                    }
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return spannableString;
    }

    /* renamed from: k */
    public static void m118430k(String str) {
        Intent intent = new Intent();
        intent.putExtra("uid", str);
        intent.setAction("com.zing.zalo.broadcast.intent.LOGINPHONE");
        MainApplication.getAppContext().sendBroadcast(intent);
    }

    /* renamed from: l */
    public static void m118431l() {
        try {
            m118426g();
            C23744a.m124114c().m124116d(6087, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m118432m(TextView textView, int i11, boolean z11, View view) {
        AbstractC19444a.m101695c(new Runnable() { // from class: me0.g5

            /* renamed from: p */
            public final /* synthetic */ int f112123p;

            /* renamed from: q */
            public final /* synthetic */ boolean f112124q;

            /* renamed from: r */
            public final /* synthetic */ View f112125r;

            /* renamed from: s */
            public final /* synthetic */ TextView f112126s;

            public /* synthetic */ RunnableC23077g5(int i112, boolean z112, View view2, TextView textView2) {
                r1 = i112;
                r2 = z112;
                r3 = view2;
                r4 = textView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23088h5.m118425f(r1, r2, r3, r4);
            }
        });
    }
}
