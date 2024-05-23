package p018ah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.a81;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p140ev.C18613b;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;
import p716zh.C31877d;
import vg.AbstractC28127m2;

/* renamed from: ah.b */
/* loaded from: classes3.dex */
public final class C0859b implements InterfaceC28970f {

    /* renamed from: a */
    private final InterfaceC27218a f3148a;

    /* renamed from: b */
    private final InterfaceC25792a.c f3149b;

    /* renamed from: c */
    private final String f3150c;

    /* renamed from: d */
    private final String f3151d;

    /* renamed from: e */
    private final int f3152e;

    /* renamed from: f */
    private final C31877d f3153f;

    /* renamed from: g */
    private final InterfaceC25792a.b f3154g;

    /* renamed from: h */
    private final a81 f3155h;

    public C0859b(InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, String str, String str2, int i11, C31877d c31877d, InterfaceC25792a.b bVar, a81 a81Var) {
        AbstractC19074t.m100208f(str, "strAction");
        AbstractC19074t.m100208f(a81Var, "zaloWebViewWrapper");
        this.f3148a = interfaceC27218a;
        this.f3149b = cVar;
        this.f3150c = str;
        this.f3151d = str2;
        this.f3152e = i11;
        this.f3153f = c31877d;
        this.f3154g = bVar;
        this.f3155h = a81Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m2445c(C0859b c0859b, Bundle bundle, int i11) {
        AbstractC19074t.m100208f(c0859b, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        c0859b.f3148a.mo35581q(ZaloWebView.class, bundle, i11, 1, true);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        final int i11;
        Bundle bundle;
        if (this.f3148a == null) {
            return;
        }
        JSONObject m131571b = AbstractC25384a.m131571b(this.f3151d);
        String str = this.f3150c;
        if (AbstractC19074t.m100204b(str, "action.open.inapp")) {
            final Bundle m2448e = m2448e(new Bundle());
            C31877d c31877d = this.f3153f;
            if (c31877d != null) {
                i11 = c31877d.f146422h;
            } else {
                i11 = 0;
            }
            if (m131571b != null) {
                String optString = m131571b.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString, "optString(...)");
                int optInt = m131571b.optInt("feature", 0);
                String optString2 = m131571b.optString("extra_data");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                m2448e.putString("extra_param_info", optString2);
                if (optInt > C18613b.f93598q.m98348a()) {
                    m2448e.putSerializable("EXTRA_FEATURE_ID", new C18613b(optInt));
                    m2448e.putString("EXTRA_WEB_URL", optString);
                    C31877d c31877d2 = this.f3153f;
                    if (c31877d2 != null) {
                        bundle = c31877d2.f146417c;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null) {
                        m2448e.putAll(c31877d2.f146417c);
                        Bundle bundle2 = this.f3153f.f146417c;
                        AbstractC19074t.m100205c(bundle2);
                        i11 = bundle2.getInt(C31877d.f146414i, 0);
                    }
                    AbstractC19444a.m101697e(new Runnable() { // from class: ah.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0859b.m2445c(C0859b.this, m2448e, i11);
                        }
                    });
                } else {
                    m2448e.putString("BUNDLE_ALL_H5_DATA", this.f3151d);
                    this.f3155h.m87260a(this.f3148a, optString, m2448e, true, i11, this.f3149b);
                }
                InterfaceC25792a.c cVar = this.f3149b;
                if (cVar != null) {
                    InterfaceC25792a.c.a.m132932a(cVar, mo2446a(this.f3150c), null, 2, null);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.f3151d)) {
                try {
                    m2448e.putString("BUNDLE_ALL_H5_DATA", this.f3151d);
                    this.f3155h.m87260a(this.f3148a, this.f3151d, m2448e, true, i11, this.f3149b);
                    InterfaceC25792a.c cVar2 = this.f3149b;
                    if (cVar2 != null) {
                        InterfaceC25792a.c.a.m132932a(cVar2, mo2446a(this.f3150c), null, 2, null);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            return;
        }
        if (AbstractC19074t.m100204b(str, "action.open.outapp")) {
            if (this.f3152e == 2) {
                if (m131571b != null) {
                    String optString3 = m131571b.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(optString3));
                        intent.addFlags(268435456);
                        this.f3148a.getContext().startActivity(intent);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        ToastUtils.showMess(this.f3148a.getString(AbstractC8020f0.str_warning_cannot_open_link));
                    }
                }
                InterfaceC25792a.c cVar3 = this.f3149b;
                if (cVar3 != null) {
                    InterfaceC25792a.c.a.m132932a(cVar3, mo2446a(this.f3150c), null, 2, null);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.f3151d)) {
                try {
                    this.f3148a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f3151d)));
                } catch (Exception e13) {
                    e13.printStackTrace();
                    ToastUtils.showMess(this.f3148a.getString(AbstractC8020f0.str_warning_cannot_open_link));
                }
            }
            InterfaceC25792a.c cVar4 = this.f3149b;
            if (cVar4 != null) {
                InterfaceC25792a.c.a.m132932a(cVar4, mo2446a(this.f3150c), null, 2, null);
            }
        }
    }

    /* renamed from: e */
    public final Bundle m2448e(Bundle bundle) {
        Object obj;
        TrackingSource trackingSource;
        int i11;
        AbstractC19074t.m100208f(bundle, "bundle");
        C31877d c31877d = this.f3153f;
        if (c31877d == null || c31877d.f146422h == 0) {
            int i12 = this.f3152e;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4 || i12 == 5 || i12 == 7) {
                            if (i12 == 5) {
                                i11 = 15;
                            } else {
                                i11 = 224;
                            }
                            bundle.putInt("EXTRA_SOURCE_LINK", i11);
                        }
                    } else {
                        int m40666e = TrackingSource.m40666e();
                        String m40669h = TrackingSource.m40669h(m40666e);
                        AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
                        bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
                        if (!TextUtils.isEmpty(m40669h)) {
                            bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
                        }
                        try {
                            C31877d c31877d2 = this.f3153f;
                            if (c31877d2 != null && (trackingSource = c31877d2.f146415a) != null) {
                                obj = trackingSource.m40679l("CHAT_PAGE_MENU_VERSION");
                            } else {
                                obj = null;
                            }
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                            bundle.putInt("CHAT_PAGE_MENU_VERSION", ((Integer) obj).intValue());
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    bundle.putInt("EXTRA_SOURCE_LINK", 260);
                    InterfaceC25792a.b bVar = this.f3154g;
                    if (bVar != null) {
                        bundle.putInt("SOURCE_EXTRA_FEATURE_ID", bVar.mo40739d());
                    }
                }
            } else {
                bundle.putInt("EXTRA_SOURCE_LINK", 261);
            }
        }
        if (this.f3148a instanceof WebViewMPActivity) {
            bundle.putBoolean("EXTRA_OPEN_FROM_MINI_APP", true);
            if (m2449f(this.f3148a, this.f3154g, bundle)) {
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            }
        }
        return bundle;
    }

    /* renamed from: f */
    public final boolean m2449f(InterfaceC27218a interfaceC27218a, InterfaceC25792a.b bVar, Bundle bundle) {
        AbstractC19074t.m100208f(interfaceC27218a, "act");
        AbstractC19074t.m100208f(bundle, "bundle");
        if (!(interfaceC27218a instanceof WebViewMPActivity)) {
            return false;
        }
        if (((WebViewMPActivity) interfaceC27218a).mo35579p().m93018M0() >= 2) {
            return true;
        }
        String m141612c = AbstractC28127m2.a.m141609d().m141612c();
        if (m141612c != null && bVar != null) {
            bVar.mo40751p(m141612c);
            bundle.putString("EXTRA_ACTION_LIST_TASK_ID", m141612c);
        }
        return false;
    }
}
