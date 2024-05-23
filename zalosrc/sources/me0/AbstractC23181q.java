package me0;

import android.content.Intent;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import mm0.AbstractC23350e;
import p304ks.C21933s;
import p363nh.C23744a;
import p594w1.C28685a;

/* renamed from: me0.q */
/* loaded from: classes4.dex */
public abstract class AbstractC23181q {

    /* renamed from: a */
    private static final String f112389a = "q";

    /* renamed from: a */
    public static void m119428a() {
        try {
            C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.ACTION_HAS_PRELOAD_INFO_UPDATED"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112389a, e11);
        }
    }

    /* renamed from: b */
    public static void m119429b() {
        C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.ACTION_SHOW_SUBTAB"));
    }

    /* renamed from: c */
    public static void m119430c() {
        C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.ACTION_SWITCH_TO_TAB_DEFAULT"));
    }

    /* renamed from: d */
    public static void m119431d(String str, boolean z11) {
        String str2;
        Intent intent = new Intent();
        if (z11) {
            str2 = "com.zing.zalo.ACTION_REFRESH_AFTER_FOLLOW_PAGE";
        } else {
            str2 = "com.zing.zalo.ACTION_REFRESH_AFTER_UNFOLLOW_PAGE";
        }
        intent.setAction(str2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("uid", str);
        }
        C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent);
    }

    /* renamed from: e */
    public static void m119432e() {
        try {
            C21933s.m114404I().m114415E0();
            C21933s.m114404I().m114413D0();
            C23744a.m124114c().m124116d(6096, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112389a, e11);
        }
    }

    /* renamed from: f */
    public static void m119433f() {
        try {
            C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.ACTION_NEW_NOTIFY_REDDOT"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112389a, e11);
        }
    }

    /* renamed from: g */
    public static void m119434g() {
        try {
            C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.action.ACTION_CHECK_REFRESH_STICKY_ADS_NOTIFY"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112389a, e11);
        }
    }

    /* renamed from: h */
    public static void m119435h() {
        try {
            C28685a.m143693b(MainApplication.getAppContext()).m143696d(new Intent("com.zing.zalo.ACTION_CHECK_REFRESH_STICKY_ADS"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112389a, e11);
        }
    }
}
