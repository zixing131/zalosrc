package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.core.os.AbstractC1440f;
import com.google.android.gms.common.AbstractC4149c;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.Locale;
import p229i5.AbstractC20289j;
import p289k5.C21472e;
import p567v4.AbstractC27523c;
import p632x4.AbstractC29321g;
import p665y0.C30245g;

/* renamed from: com.google.android.gms.common.internal.y */
/* loaded from: classes2.dex */
public abstract class AbstractC4235y {

    /* renamed from: a */
    private static final C30245g f16674a = new C30245g();

    /* renamed from: b */
    private static Locale f16675b;

    /* renamed from: a */
    public static String m19812a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C21472e.m111067a(context).m111062d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m19813b(Context context) {
        return context.getResources().getString(AbstractC27523c.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m19814c(Context context, int i11) {
        Resources resources = context.getResources();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(AbstractC27523c.common_google_play_services_enable_button);
            }
            return resources.getString(AbstractC27523c.common_google_play_services_update_button);
        }
        return resources.getString(AbstractC27523c.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m19815d(Context context, int i11) {
        Resources resources = context.getResources();
        String m19812a = m19812a(context);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 7) {
                            if (i11 != 9) {
                                if (i11 != 20) {
                                    switch (i11) {
                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                            return m19819h(context, "common_google_play_services_api_unavailable_text", m19812a);
                                        case 17:
                                            return m19819h(context, "common_google_play_services_sign_in_failed_text", m19812a);
                                        case 18:
                                            return resources.getString(AbstractC27523c.common_google_play_services_updating_text, m19812a);
                                        default:
                                            return resources.getString(AbstractC29321g.common_google_play_services_unknown_issue, m19812a);
                                    }
                                }
                                return m19819h(context, "common_google_play_services_restricted_profile_text", m19812a);
                            }
                            return resources.getString(AbstractC27523c.common_google_play_services_unsupported_text, m19812a);
                        }
                        return m19819h(context, "common_google_play_services_network_error_text", m19812a);
                    }
                    return m19819h(context, "common_google_play_services_invalid_account_text", m19812a);
                }
                return resources.getString(AbstractC27523c.common_google_play_services_enable_text, m19812a);
            }
            if (AbstractC20289j.m105933g(context)) {
                return resources.getString(AbstractC27523c.common_google_play_services_wear_update_text);
            }
            return resources.getString(AbstractC27523c.common_google_play_services_update_text, m19812a);
        }
        return resources.getString(AbstractC27523c.common_google_play_services_install_text, m19812a);
    }

    /* renamed from: e */
    public static String m19816e(Context context, int i11) {
        if (i11 != 6 && i11 != 19) {
            return m19815d(context, i11);
        }
        return m19819h(context, "common_google_play_services_resolution_required_text", m19812a(context));
    }

    /* renamed from: f */
    public static String m19817f(Context context, int i11) {
        String m19818g;
        if (i11 == 6) {
            m19818g = m19820i(context, "common_google_play_services_resolution_required_title");
        } else {
            m19818g = m19818g(context, i11);
        }
        if (m19818g == null) {
            return context.getResources().getString(AbstractC27523c.common_google_play_services_notification_ticker);
        }
        return m19818g;
    }

    /* renamed from: g */
    public static String m19818g(Context context, int i11) {
        Resources resources = context.getResources();
        switch (i11) {
            case 1:
                return resources.getString(AbstractC27523c.common_google_play_services_install_title);
            case 2:
                return resources.getString(AbstractC27523c.common_google_play_services_update_title);
            case 3:
                return resources.getString(AbstractC27523c.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m19820i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m19820i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected error code ");
                sb2.append(i11);
                return null;
            case 17:
                return m19820i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m19820i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m19819h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m19820i = m19820i(context, str);
        if (m19820i == null) {
            m19820i = resources.getString(AbstractC29321g.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m19820i, str2);
    }

    /* renamed from: i */
    private static String m19820i(Context context, String str) {
        C30245g c30245g = f16674a;
        synchronized (c30245g) {
            try {
                Locale m7354c = AbstractC1440f.m7346a(context.getResources().getConfiguration()).m7354c(0);
                if (!m7354c.equals(f16675b)) {
                    c30245g.clear();
                    f16675b = m7354c;
                }
                String str2 = (String) c30245g.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources m19575f = AbstractC4149c.m19575f(context);
                if (m19575f == null) {
                    return null;
                }
                int identifier = m19575f.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing resource: ");
                    sb2.append(str);
                    return null;
                }
                String string = m19575f.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Got empty resource: ");
                    sb3.append(str);
                    return null;
                }
                c30245g.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
