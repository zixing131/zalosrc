package me0;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.zviews.GameManageDetailView;
import com.zing.zalo.p077ui.zviews.GameStarterView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zview.C17487o0;
import dj.C17945a0;
import jf0.C21242e;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p140ev.C18613b;
import p369ns.AbstractC23933a;
import p402os.C24546a;
import p402os.C24548c;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;

/* renamed from: me0.k2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23118k2 {
    /* renamed from: c */
    public static void m118590c(final Context context, String str, final long j11, C24548c c24548c, String str2, final int i11, final String str3, final String str4, final int i12, final String str5) {
        try {
            if (!TextUtils.isEmpty(str)) {
                final C24546a c24546a = new C24546a(j11);
                c24546a.m127886q(c24548c);
                c24546a.m127885p(str);
                c24546a.m127883n(str2);
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23118k2.m118598k(C24546a.this, context, i11, j11, str3, str4, i12, str5);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public static Intent m118591d(long j11, String str, int i11, String str2) {
        try {
            C21242e m110039d = C21242e.m110039d();
            C18613b c18613b = C18613b.f93600s;
            if (!m110039d.m110048i(c18613b)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FEATURE_ID", c18613b);
            bundle.putLong("extra_zapp_id", j11);
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("PATH", str);
            }
            bundle.putInt("EXTRA_SOURCE_LINK", i11);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("EXTRA_SOURCE_PARAM", str2);
            }
            return AbstractC23152n3.m119012O(ZaloWebView.class, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static void m118592e(C17487o0 c17487o0, long j11, C24546a c24546a, String str, int i11, String str2) {
        try {
            C21242e m110039d = C21242e.m110039d();
            C18613b c18613b = C18613b.f93600s;
            if (m110039d.m110048i(c18613b)) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_FEATURE_ID", c18613b);
                bundle.putLong("extra_zapp_id", j11);
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("PATH", str);
                }
                bundle.putInt("EXTRA_SOURCE_LINK", i11);
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("EXTRA_SOURCE_PARAM", str2);
                }
                bundle.putSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT", c24546a);
                c17487o0.m93069k2(ZaloWebView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static C24548c m118593f(C17945a0 c17945a0) {
        C24548c c24548c = new C24548c();
        try {
            c24548c.m127905f(c17945a0.m95029V3().m41045i());
            c24548c.m127907h(Integer.parseInt(c17945a0.m94862C4()));
            c24548c.m127906g((byte) 2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c24548c;
    }

    /* renamed from: g */
    public static String m118594g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("appReferrer")) {
                return "";
            }
            return AbstractC18069a.m96089h(jSONObject, "appReferrer");
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public static String m118595h(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("pkgname")) {
                return "";
            }
            return AbstractC18069a.m96089h(jSONObject, "pkgname");
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static C24548c m118596i() {
        C24548c c24548c = new C24548c();
        c24548c.m127906g((byte) 10);
        return c24548c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m118597j(C24546a c24546a, Context context, int i11, long j11, String str, String str2, int i12, String str3) {
        try {
            if (c24546a.m127882m()) {
                m118599l(context, c24546a);
                C28905e.m144373n().m144396r(1, i11, j11 + "", str, str2);
            } else {
                m118600m(context, j11, i12, str3);
                C28905e.m144373n().m144396r(2, i11, j11 + "", str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m118598k(final C24546a c24546a, final Context context, final int i11, final long j11, final String str, final String str2, final int i12, final String str3) {
        try {
            AbstractC23933a.m125289d(MainApplication.getAppContext());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: me0.j2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23118k2.m118597j(C24546a.this, context, i11, j11, str, str2, i12, str3);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m118599l(Context context, C24546a c24546a) {
        try {
            Bundle bundle = new Bundle();
            bundle.putSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT", c24546a);
            ((ZaloActivity) context).mo35579p().m93069k2(GameStarterView.class, bundle, 0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m118600m(Context context, long j11, int i11, String str) {
        try {
            Intent m118591d = m118591d(j11, "", i11, str);
            if (m118591d != null) {
                context.startActivity(m118591d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public static void m118601n(Context context, long j11) {
        try {
            C24546a c24546a = new C24546a(j11);
            Bundle bundle = new Bundle();
            bundle.putSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT", c24546a);
            ((ZaloActivity) context).mo35579p().m93069k2(GameManageDetailView.class, bundle, 0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static void m118602o(Context context, String str, int i11, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Bundle m87089QR = ZaloWebView.m87089QR(str);
                m87089QR.putInt("EXTRA_SOURCE_LINK", i11);
                if (!TextUtils.isEmpty(str2)) {
                    m87089QR.putString("EXTRA_SOURCE_PARAM", str2);
                }
                if (context instanceof InterfaceC27218a) {
                    ZaloWebView.m87105iS((InterfaceC27218a) context, str, m87089QR);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
