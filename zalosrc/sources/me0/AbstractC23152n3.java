package me0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import c30.C3229a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.IntentHandlerActivity;
import com.zing.zalo.p077ui.PasscodeActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.AcceptFriendView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.StickerDetailsView;
import com.zing.zalo.p077ui.zviews.StickerManageView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gu.AbstractC19601a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import jf0.C21242e;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18613b;
import p140ev.C18620i;
import p161fg.C18922m;
import p239ih.C20556f;
import p304ks.C21927m;
import p324lh.AbstractC22485a;
import p325lj.C22494a;
import p325lj.C22499f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p716zh.C31877d;
import p716zh.C31991k8;
import p716zh.C32002l4;
import sx.C26405g;
import th.AbstractC26681b;
import th.AbstractC26684e;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.C28203u6;

/* renamed from: me0.n3 */
/* loaded from: classes.dex */
public abstract class AbstractC23152n3 {

    /* renamed from: a */
    private static final HashMap f112277a = new HashMap();

    /* renamed from: b */
    static boolean f112278b = false;

    /* renamed from: me0.n3$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C22499f f112279a;

        /* renamed from: b */
        final /* synthetic */ Context f112280b;

        a(C22499f c22499f, Context context) {
            this.f112279a = c22499f;
            this.f112280b = context;
        }

        /* renamed from: d */
        public static /* synthetic */ void m119084d(Context context, String str, String str2, C22499f c22499f) {
            AbstractC23152n3.m118989C0(context, str, str2, c22499f.m116330f());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(this.f112280b.getString(AbstractC8020f0.unknown_error));
            AbstractC23152n3.f112278b = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            String str3;
            String str4 = "";
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    jSONObject = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject2 = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject2 = null;
                    }
                } catch (Throwable th2) {
                    AbstractC23152n3.f112278b = false;
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                str = "";
            }
            if (jSONObject2 != null) {
                if (!jSONObject2.isNull("data")) {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                if (jSONObject != null) {
                    String m116332h = this.f112279a.m116332h();
                    String m116334j = this.f112279a.m116334j();
                    if (TextUtils.isEmpty(m116332h)) {
                        str3 = "";
                    } else {
                        if (jSONObject.isNull(m116332h)) {
                            str3 = "";
                        } else {
                            str3 = jSONObject.getString(m116332h);
                        }
                        try {
                            if (!TextUtils.isEmpty(str3)) {
                                AbstractC23152n3.f112277a.put(m116332h, str3);
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = str4;
                            str4 = str3;
                            e.printStackTrace();
                            AbstractC23152n3.f112278b = false;
                            str2 = str;
                            AbstractC19444a.m101695c(new Runnable() { // from class: me0.m3

                                /* renamed from: p */
                                public final /* synthetic */ Context f112267p;

                                /* renamed from: q */
                                public final /* synthetic */ String f112268q;

                                /* renamed from: r */
                                public final /* synthetic */ String f112269r;

                                /* renamed from: s */
                                public final /* synthetic */ C22499f f112270s;

                                public /* synthetic */ RunnableC23141m3(Context context, String str42, String str22, C22499f c22499f) {
                                    r1 = context;
                                    r2 = str42;
                                    r3 = str22;
                                    r4 = c22499f;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC23152n3.a.m119084d(r1, r2, r3, r4);
                                }
                            });
                        }
                    }
                    if (!TextUtils.isEmpty(m116334j)) {
                        if (!jSONObject.isNull(m116334j)) {
                            str42 = jSONObject.getString(m116334j);
                        }
                        if (!TextUtils.isEmpty(str42)) {
                            AbstractC23152n3.f112277a.put(m116334j, str42);
                        }
                    }
                    str22 = str42;
                    str42 = str3;
                    AbstractC23152n3.f112278b = false;
                    AbstractC19444a.m101695c(new Runnable() { // from class: me0.m3

                        /* renamed from: p */
                        public final /* synthetic */ Context f112267p;

                        /* renamed from: q */
                        public final /* synthetic */ String f112268q;

                        /* renamed from: r */
                        public final /* synthetic */ String f112269r;

                        /* renamed from: s */
                        public final /* synthetic */ C22499f f112270s;

                        public /* synthetic */ RunnableC23141m3(Context context, String str42, String str22, C22499f c22499f) {
                            r1 = context;
                            r2 = str42;
                            r3 = str22;
                            r4 = c22499f;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC23152n3.a.m119084d(r1, r2, r3, r4);
                        }
                    });
                }
            }
            str22 = "";
            AbstractC23152n3.f112278b = false;
            AbstractC19444a.m101695c(new Runnable() { // from class: me0.m3

                /* renamed from: p */
                public final /* synthetic */ Context f112267p;

                /* renamed from: q */
                public final /* synthetic */ String f112268q;

                /* renamed from: r */
                public final /* synthetic */ String f112269r;

                /* renamed from: s */
                public final /* synthetic */ C22499f f112270s;

                public /* synthetic */ RunnableC23141m3(Context context, String str42, String str22, C22499f c22499f) {
                    r1 = context;
                    r2 = str42;
                    r3 = str22;
                    r4 = c22499f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23152n3.a.m119084d(r1, r2, r3, r4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.n3$b */
    /* loaded from: classes4.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ InterfaceC27218a f112281l1;

        /* renamed from: m1 */
        final /* synthetic */ String f112282m1;

        /* renamed from: n1 */
        final /* synthetic */ String f112283n1;

        /* renamed from: me0.n3$b$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42152I7(b.this.f112282m1);
            }
        }

        b(InterfaceC27218a interfaceC27218a, String str, String str2) {
            this.f112281l1 = interfaceC27218a;
            this.f112282m1 = str;
            this.f112283n1 = str2;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        AbstractC23178p7.m119406e(this.f112281l1, this.f112282m1, this.f112283n1, Bitmap.createBitmap(c3979l.m18839c()));
                        if (!AbstractC26681b.f126361f) {
                            AbstractC23304d.f113321R.put(this.f112282m1, Boolean.TRUE);
                            C0824j.m2153b(new a());
                            return;
                        }
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (!AbstractC26681b.f126361f) {
                AbstractC23304d.f113321R.put(this.f112282m1, Boolean.FALSE);
            }
            ToastUtils.showMess(this.f112281l1.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.n3$c */
    /* loaded from: classes4.dex */
    public class c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ InterfaceC27218a f112285l1;

        /* renamed from: m1 */
        final /* synthetic */ String f112286m1;

        /* renamed from: n1 */
        final /* synthetic */ String f112287n1;

        c(InterfaceC27218a interfaceC27218a, String str, String str2) {
            this.f112285l1 = interfaceC27218a;
            this.f112286m1 = str;
            this.f112287n1 = str2;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        AbstractC23152n3.m119063q(this.f112285l1, this.f112286m1, this.f112287n1, Bitmap.createBitmap(c3979l.m18839c()));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            ToastUtils.showMess(this.f112285l1.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m118984A(C20556f c20556f) {
        try {
            String m106842o = c20556f.m106842o();
            String m106835h = c20556f.m106835h();
            if (m106842o != null && m106835h != null) {
                AbstractC23280z4.m120300L(m106842o, m106835h, true, null);
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_save_msg_successfully, AbstractC20130d.f99272c));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: A0 */
    public static void m118985A0(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                ((AlarmManager) MainApplication.getAppContext().getSystemService("alarm")).set(1, System.currentTimeMillis() + 300, PendingIntent.getActivity(MainApplication.getAppContext(), 0, m119018R(MainTabView.class, bundle), AbstractC19601a.m102572b(268435456)));
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        AbstractC20110a.m104545n("Should restart app but can't do on Android Q", new Object[0]);
    }

    /* renamed from: B */
    public static /* synthetic */ void m118986B(Context context, String str, InterfaceC17463d interfaceC17463d, int i11) {
        m119046h0(context, "file " + str);
    }

    /* renamed from: B0 */
    private static void m118987B0(C20556f c20556f) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.l3
            public /* synthetic */ RunnableC23130l3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23152n3.m118984A(C20556f.this);
            }
        });
    }

    /* renamed from: C0 */
    static void m118989C0(Context context, String str, String str2, int i11) {
        String format;
        try {
            if (i11 == 1) {
                format = String.format("zalopay-zapi-28://app/transfer?sender=%s&receiver=%s", str, str2);
            } else {
                format = String.format("zalopay-zapi-29://app/mywallet?sender=%s", str);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse(format));
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m118990D(Context context, C20556f c20556f, InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        if (!AbstractC23034c6.m118118E()) {
            if (context instanceof ZaloActivity) {
                AbstractC23034c6.m118186w0((ZaloActivity) context, AbstractC23034c6.f112029f, 109);
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_save_apk_no_storage_permission));
                return;
            }
        }
        m118987B0(c20556f);
    }

    /* renamed from: D0 */
    public static void m118991D0() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.giaidieuvui.intent.LOGOUT");
            MainApplication.getAppContext().sendBroadcast(intent);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: E0 */
    public static void m118993E0(Context context, String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    public static IntentFilter m118994F() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* renamed from: F0 */
    public static void m118995F0(ZaloView zaloView, String str, String str2, int i11) {
        try {
            if (str.trim().equals("")) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_the_phone_number_invalid));
                return;
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            zaloView.startActivityForResult(intent, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G */
    public static void m118996G(Context context, String str) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:" + str));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (str2.equalsIgnoreCase("com.android.phone") || str2.equalsIgnoreCase("com.android.server.telecom") || m119073v(resolveInfo.activityInfo.applicationInfo)) {
                intent.setClassName(str2, resolveInfo.activityInfo.name);
                context.startActivity(intent);
                return;
            }
        }
        m119003J0(context, intent, context.getPackageName());
    }

    /* renamed from: G0 */
    public static void m118997G0(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.SEND");
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                builder.scheme("file");
                intent.putExtra("android.intent.extra.STREAM", builder.build());
                intent.setType("video/*");
                intent.addFlags(268435456);
                intent.putExtra("bol_share_in_app", true);
                context.startActivity(Intent.createChooser(intent, "Share video using"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H */
    public static Intent m118998H(C31991k8 c31991k8) {
        boolean z11;
        Class cls;
        int i11;
        String str;
        if (c31991k8 == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            boolean m121815d3 = AbstractC23309i.m121815d3();
            TrackingSource m114310H = C21927m.m114302u().m114310H(c31991k8.f147205a);
            boolean m114318P = C21927m.m114302u().m114318P(c31991k8.f147205a);
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c31991k8.f147205a);
            if (!m114318P && (m141809c == null || !m141809c.m40387S0())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (m121815d3 && z11) {
                cls = ZaloWebView.class;
                bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93604w);
                if (m114310H != null) {
                    i11 = m114310H.m40683t();
                } else {
                    i11 = 0;
                }
                bundle.putInt("EXTRA_SOURCE_LINK", i11);
                if (m114310H != null) {
                    str = m114310H.m40682o();
                } else {
                    str = "";
                }
                bundle.putString("EXTRA_SOURCE_PARAM", str);
                bundle.putString("id_oa_profile", c31991k8.f147205a);
                bundle.putBoolean("use_subtitle", false);
                int i12 = c31991k8.f147215k;
                if (i12 != -1) {
                    bundle.putInt("SHOW_WITH_FLAGS", i12);
                }
            } else {
                bundle.putString("userID", c31991k8.f147205a);
                bundle.putBoolean("fromChat", c31991k8.f147206b);
                bundle.putBoolean("fromFriendRequest", c31991k8.f147207c);
                bundle.putBoolean("fromFriendSuggest", c31991k8.f147208d);
                bundle.putBoolean("extra_show_profile_photo", c31991k8.f147209e);
                C32002l4 c32002l4 = c31991k8.f147216l;
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                ContactProfile contactProfile = c31991k8.f147213i;
                if (contactProfile != null) {
                    bundle.putParcelable("profile", contactProfile);
                }
                C8050a.d0 d0Var = c31991k8.f147210f;
                if (d0Var != null) {
                    bundle.putSerializable("extra_default_tab", d0Var);
                }
                if (!TextUtils.isEmpty(c31991k8.f147211g)) {
                    bundle.putString("SOURCE_ACTION", c31991k8.f147211g);
                }
                if (!TextUtils.isEmpty(c31991k8.f147212h)) {
                    bundle.putString("STR_EXTRA_PHONE_NUM_FROM_SEARCH", c31991k8.f147212h);
                }
                int i13 = c31991k8.f147215k;
                if (i13 != -1) {
                    bundle.putInt("SHOW_WITH_FLAGS", i13);
                }
                int i14 = c31991k8.f147214j;
                if (i14 != -1) {
                    bundle.putInt("extra_source_friend", i14);
                }
                cls = c31991k8.f147205a.equals(CoreUtility.f89233i) ? MyInfoView.class : UserDetailsView.class;
            }
            return m119012O(cls, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: H0 */
    public static void m118999H0(Context context, String str) {
        new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(AbstractC23136l9.m118746s0(AbstractC8020f0.str_no_app_to_open_file_title, str)).m90949z(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_app_to_open_file_description)).m90931h("POPUP_ACTIVITY_NOT_FOUND").m90942s(AbstractC8020f0.str_no_app_to_open_file_open_store, new InterfaceC17463d.d() { // from class: me0.h3

            /* renamed from: p */
            public final /* synthetic */ Context f112144p;

            /* renamed from: q */
            public final /* synthetic */ String f112145q;

            public /* synthetic */ C23086h3(Context context2, String str2) {
                r1 = context2;
                r2 = str2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC23152n3.m118986B(r1, r2, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_no_app_to_open_file_cancel, new InterfaceC17463d.d() { // from class: me0.i3
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90947x("POPUP_ACTIVITY_NOT_FOUND_BTN_POSITIVE").m90937n("POPUP_ACTIVITY_NOT_FOUND_BTN_NEGATIVE").m90923G();
    }

    /* renamed from: I */
    public static Intent m119000I(Bundle bundle) {
        return m119016Q(MyCalendarView.class, bundle, true, false);
    }

    /* renamed from: I0 */
    public static void m119001I0(Context context, ContactProfile contactProfile) {
        try {
            Intent intent = new Intent(context, (Class<?>) IntentHandlerActivity.class);
            intent.setAction("android.intent.action.ACTION_SHOW_CREATE_SHORTCUT_CALL");
            intent.putExtra("EXTRA_CONTACT", contactProfile);
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static Intent m119002J(Bundle bundle) {
        return m119016Q(ChatView.class, bundle, true, false);
    }

    /* renamed from: J0 */
    public static void m119003J0(Context context, Intent intent, String str) {
        try {
            Intent intent2 = new Intent(intent.getAction(), intent.getData());
            intent2.putExtras(intent);
            if (TextUtils.isEmpty(str)) {
                context.startActivity(Intent.createChooser(intent2, null));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent2, 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && !activityInfo.packageName.equals(str)) {
                    Intent intent3 = new Intent(intent2);
                    ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent3.setPackage(resolveInfo.activityInfo.packageName);
                    arrayList.add(intent3);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(0), null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                context.startActivity(createChooser);
                return;
            }
            context.startActivity(Intent.createChooser(intent2, null));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public static Intent m119004K(Bundle bundle, boolean z11) {
        return m119016Q(ChatView.class, bundle, true, z11);
    }

    /* renamed from: K0 */
    public static void m119005K0(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            String str2 = activityInfo.packageName;
            if (m119073v(activityInfo.applicationInfo)) {
                intent.setClassName(str2, resolveInfo.activityInfo.name);
                context.startActivity(intent);
                return;
            }
        }
        m119003J0(context, intent, context.getPackageName());
    }

    /* renamed from: L */
    public static Intent m119006L(ContactProfile contactProfile, int i11) {
        if (contactProfile == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("uid", contactProfile.f42434r);
            bundle.putString("dpn", contactProfile.f42437s);
            bundle.putString("avatar", contactProfile.f42446v);
            bundle.putString("phone", contactProfile.m40416m0());
            bundle.putInt("inviteFrom", i11);
            return m119012O(WriteInvitationView.class, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: L0 */
    public static void m119007L0(Context context, C20556f c20556f) {
        new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B("").m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_save_apk_dialog_des, AbstractC20130d.f99272c)).m90942s(AbstractC8020f0.save, new InterfaceC17463d.d() { // from class: me0.j3

            /* renamed from: p */
            public final /* synthetic */ Context f112191p;

            /* renamed from: q */
            public final /* synthetic */ C20556f f112192q;

            public /* synthetic */ C23108j3(Context context2, C20556f c20556f2) {
                r1 = context2;
                r2 = c20556f2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC23152n3.m118990D(r1, r2, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.back, new InterfaceC17463d.d() { // from class: me0.k3
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90923G();
    }

    /* renamed from: M */
    public static Intent m119008M(Class cls, Bundle bundle) {
        C16786d.Companion.m89646b(null).m47800U(false);
        return m119016Q(cls, bundle, true, false);
    }

    /* renamed from: M0 */
    public static void m119009M0(InterfaceC27218a interfaceC27218a, C27373c c27373c, int i11, int i12) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_VIDEO_INFO", c27373c);
        bundle.putInt("extra_source_log", i12);
        interfaceC27218a.mo35579p().m93066i2(ShareView.class, bundle, i11, 0, true);
    }

    /* renamed from: N */
    public static Intent m119010N(String str, boolean z11, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("userID", str);
            bundle.putBoolean("fromChat", z11);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("SOURCE_ACTION", str2);
            }
            return m119012O(MyInfoView.class, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: N0 */
    public static void m119011N0(InterfaceC27218a interfaceC27218a, String str, boolean z11, boolean z12, int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("imagePathUri", str);
            bundle.putBoolean("bol_share_in_app", z11);
            bundle.putBoolean("bol_extra_photo_hd", z12);
            bundle.putInt("extra_source_log", i11);
            interfaceC27218a.mo35579p().m93069k2(ShareView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    public static Intent m119012O(Class cls, Bundle bundle) {
        return m119016Q(cls, bundle, false, false);
    }

    /* renamed from: O0 */
    public static void m119013O0(InterfaceC27218a interfaceC27218a, String str, boolean z11, boolean z12, int i11, int i12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("imagePathUri", str);
            bundle.putBoolean("bol_share_in_app", z11);
            bundle.putBoolean("bol_extra_photo_hd", z12);
            bundle.putInt("extra_source_log", i12);
            interfaceC27218a.mo35579p().m93066i2(ShareView.class, bundle, i11, 0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public static Intent m119014P(Class cls, Bundle bundle, boolean z11) {
        return m119016Q(cls, bundle, false, z11);
    }

    /* renamed from: P0 */
    public static void m119015P0(InterfaceC27218a interfaceC27218a, String str, String str2, boolean z11, boolean z12, String str3) {
        m119017Q0(interfaceC27218a, null, str, str2, z11, z12, str3);
    }

    /* renamed from: Q */
    private static Intent m119016Q(Class cls, Bundle bundle, boolean z11, boolean z12) {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
        intent.setAction("com.zing.zalo.action.ACTION_SHOW_ZALO_VIEW");
        intent.putExtra("zalo_view_class", cls);
        intent.putExtra("zalo_view_show_main", z11);
        intent.putExtra("zalo_view_from_noti", z12);
        if (bundle != null) {
            intent.putExtra("zalo_view_bundle", bundle);
        }
        intent.addFlags(67108864);
        AbstractC23224t9.m119693h(intent);
        return intent;
    }

    /* renamed from: Q0 */
    public static void m119017Q0(InterfaceC27218a interfaceC27218a, C26405g c26405g, String str, String str2, boolean z11, boolean z12, String str3) {
        String m136176c;
        try {
            Bundle bundle = new Bundle();
            if (c26405g == null) {
                m136176c = "";
            } else {
                m136176c = c26405g.m136176c();
            }
            bundle.putString("shareLinkAttachmentForChat", m136176c);
            if (str == null) {
                str = "";
            }
            bundle.putString("linktoShare", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("subjectForLink", str2);
            bundle.putBoolean("bol_share_in_app", z11);
            bundle.putBoolean("btn_extra_show_hide_post_feed", !z12);
            bundle.putString("STR_SOURCE_START_VIEW", str3);
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35579p().m93069k2(ShareView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static Intent m119018R(Class cls, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        return m119016Q(cls, bundle, false, false);
    }

    /* renamed from: R0 */
    private static String m119019R0(C20556f c20556f) {
        if (c20556f == null) {
            return "null";
        }
        return c20556f.m106842o();
    }

    /* renamed from: S */
    public static Intent m119020S(Class cls, Bundle bundle, boolean z11) {
        return m119016Q(cls, bundle, true, z11);
    }

    /* renamed from: S0 */
    public static boolean m119021S0(Intent intent) {
        try {
            return TextUtils.equals(AbstractC23224t9.m119686a(intent), intent.getStringExtra("intent_sig"));
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: T */
    public static Intent m119022T(ContactProfile contactProfile, int i11) {
        if (contactProfile == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("data", contactProfile.m40373K());
            bundle.putString("message", contactProfile.m40378N());
            bundle.putInt("accept_mode", i11);
            return m119012O(AcceptFriendView.class, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: T0 */
    public static boolean m119023T0(Intent intent) {
        try {
            String m119686a = AbstractC23224t9.m119686a(intent);
            String stringExtra = intent.getStringExtra("intent_sig");
            if (stringExtra == null) {
                return false;
            }
            if (!stringExtra.equals(m119686a)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public static IntentFilter m119024U() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    /* renamed from: U0 */
    public static boolean m119025U0(Intent intent) {
        try {
            String m119686a = AbstractC23224t9.m119686a(intent);
            String stringExtra = intent.getStringExtra("intent_sig");
            if (stringExtra == null) {
                return false;
            }
            if (!stringExtra.equals(m119686a)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V */
    public static PendingIntent m119026V(String str, Bundle bundle) {
        String string;
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
        intent.setAction("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT");
        intent.putExtra("handle_zalo_ui_event_sub_action", str);
        if (bundle == null) {
            bundle = new Bundle();
            string = "";
        } else {
            string = bundle.getString("notificationId");
        }
        intent.putExtra("handle_zalo_ui_event_bundle", bundle);
        intent.putExtra("handle_zalo_ui_event_show_main", true);
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier(string);
        } else {
            intent.setType(string);
        }
        AbstractC23224t9.m119692g(intent);
        return PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102571a(134217728));
    }

    /* renamed from: W */
    public static PendingIntent m119027W(String str, Bundle bundle) {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
        intent.setAction("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT");
        intent.putExtra("handle_zalo_ui_event_sub_action", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtra("handle_zalo_ui_event_bundle", bundle);
        intent.putExtra("handle_zalo_ui_event_show_main", true);
        AbstractC23224t9.m119692g(intent);
        return PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102571a(134217728));
    }

    /* renamed from: X */
    public static IntentFilter m119028X() {
        IntentFilter intentFilter = new IntentFilter();
        boolean z11 = AbstractC26684e.f126408a;
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        intentFilter.setPriority(Integer.MAX_VALUE);
        return intentFilter;
    }

    /* renamed from: Y */
    public static IntentFilter m119029Y() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(999);
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        return intentFilter;
    }

    /* renamed from: Z */
    public static void m119030Z(InterfaceC27218a interfaceC27218a, ZaloView zaloView) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"url\":\"");
            C3229a c3229a = C3229a.f13790a;
            sb2.append(c3229a.m16392f());
            sb2.append("\"}");
            String sb3 = sb2.toString();
            C31877d c31877d = new C31877d();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", c3229a.m16392f());
            c31877d.m153185d(bundle);
            AbstractC28207v1.m141984g3("action.open.inapp", 2, interfaceC27218a, zaloView, sb3, null, c31877d);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a0 */
    public static void m119032a0(ContactProfile contactProfile, InterfaceC27218a interfaceC27218a) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            Intent intent = new Intent();
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            intent.putExtras(m140776b);
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* renamed from: b0 */
    public static void m119034b0(InterfaceC27218a interfaceC27218a, int i11, String str) {
        C17487o0 mo35579p;
        if (interfaceC27218a != null) {
            try {
                mo35579p = interfaceC27218a.mo35579p();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo35579p = null;
        }
        if (mo35579p != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FEATURE_ID", C18613b.f93602u);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("EXTRA_SOURCE_PARAM", str);
            }
            intent.putExtra("EXTRA_SOURCE_LINK", i11);
            mo35579p.m93069k2(ZaloWebView.class, intent.getExtras(), 1, true);
        }
    }

    /* renamed from: c0 */
    public static void m119036c0(Context context, C20556f c20556f) {
        String str;
        Uri parse;
        String m106842o;
        if (c20556f != null) {
            try {
                if (c20556f.m106830b()) {
                    String m106834f = c20556f.m106834f();
                    String str2 = "text/plain";
                    if (TextUtils.isEmpty(m106834f)) {
                        str = "text/plain";
                    } else {
                        str = AbstractC22485a.m116269b(m106834f);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str;
                    }
                    if (!c20556f.m106844q()) {
                        if (c20556f.m106844q()) {
                            m106842o = c20556f.m106831c();
                        } else {
                            m106842o = c20556f.m106842o();
                        }
                        File file = new File(m106842o);
                        if (Build.VERSION.SDK_INT >= 24) {
                            parse = FileProvider.m6950f(MainApplication.getAppContext(), "com.zing.zalo.provider", file);
                        } else {
                            parse = Uri.fromFile(file);
                        }
                    } else {
                        parse = Uri.parse(c20556f.m106842o());
                    }
                    AbstractC20110a.m104542k(8, "openFile(): fileExt=" + m106834f + ", mimeType=" + str2 + ", fileUri=" + parse, new Object[0]);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 26 && m119069t(c20556f)) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: me0.d3

                            /* renamed from: p */
                            public final /* synthetic */ Context f112043p;

                            /* renamed from: q */
                            public final /* synthetic */ C20556f f112044q;

                            public /* synthetic */ RunnableC23042d3(Context context2, C20556f c20556f2) {
                                r1 = context2;
                                r2 = c20556f2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC23152n3.m119007L0(r1, r2);
                            }
                        });
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(parse, str2);
                    if (i11 >= 24) {
                        intent.setFlags(1);
                    }
                    ComponentName resolveActivity = intent.resolveActivity(context2.getPackageManager());
                    if (resolveActivity != null) {
                        AbstractC20110a.m104542k(8, "openFile(): componentName=" + resolveActivity, new Object[0]);
                        context2.startActivity(intent);
                        return;
                    }
                    AbstractC19444a.m101697e(new Runnable() { // from class: me0.e3

                        /* renamed from: p */
                        public final /* synthetic */ Context f112059p;

                        /* renamed from: q */
                        public final /* synthetic */ String f112060q;

                        public /* synthetic */ RunnableC23053e3(Context context2, String m106834f2) {
                            r1 = context2;
                            r2 = m106834f2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC23152n3.m118999H0(r1, r2);
                        }
                    });
                    throw new ActivityNotFoundException("No suitable app to open FILE {" + m106834f2 + "}. Path: " + c20556f2.m106836i());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                throw e11;
            }
        }
        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
        throw new FileNotFoundException("Input file " + m119019R0(c20556f2) + " not found");
    }

    /* renamed from: d0 */
    public static void m119038d0(Context context, C20556f c20556f, String str) {
        String str2;
        Uri parse;
        String m106842o;
        if (c20556f != null) {
            try {
                if (c20556f.m106830b()) {
                    String str3 = "text/plain";
                    if (TextUtils.isEmpty(str)) {
                        str2 = "text/plain";
                    } else {
                        str2 = AbstractC22485a.m116269b(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = str2;
                    }
                    if (!c20556f.m106844q()) {
                        if (c20556f.m106844q()) {
                            m106842o = c20556f.m106831c();
                        } else {
                            m106842o = c20556f.m106842o();
                        }
                        File file = new File(m106842o);
                        if (Build.VERSION.SDK_INT >= 24) {
                            parse = FileProvider.m6950f(MainApplication.getAppContext(), "com.zing.zalo.provider", file);
                        } else {
                            parse = Uri.fromFile(file);
                        }
                    } else {
                        parse = Uri.parse(c20556f.m106842o());
                    }
                    AbstractC20110a.m104542k(8, "openFile(): fileExt=" + str + ", mimeType=" + str3 + ", fileUri=" + parse, new Object[0]);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 26 && str.toLowerCase(Locale.getDefault()).equals("apk")) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: me0.f3

                            /* renamed from: p */
                            public final /* synthetic */ Context f112100p;

                            /* renamed from: q */
                            public final /* synthetic */ C20556f f112101q;

                            public /* synthetic */ RunnableC23064f3(Context context2, C20556f c20556f2) {
                                r1 = context2;
                                r2 = c20556f2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC23152n3.m119007L0(r1, r2);
                            }
                        });
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(parse, str3);
                    if (i11 >= 24) {
                        intent.setFlags(1);
                    }
                    ComponentName resolveActivity = intent.resolveActivity(context2.getPackageManager());
                    if (resolveActivity != null) {
                        AbstractC20110a.m104542k(8, "openFile(): componentName=" + resolveActivity, new Object[0]);
                        context2.startActivity(intent);
                        return;
                    }
                    AbstractC19444a.m101697e(new Runnable() { // from class: me0.g3

                        /* renamed from: p */
                        public final /* synthetic */ Context f112117p;

                        /* renamed from: q */
                        public final /* synthetic */ String f112118q;

                        public /* synthetic */ RunnableC23075g3(Context context2, String str4) {
                            r1 = context2;
                            r2 = str4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC23152n3.m118999H0(r1, r2);
                        }
                    });
                    throw new ActivityNotFoundException("No suitable app to open FILE {" + str4 + "}. Path: " + c20556f2.m106836i());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                throw e11;
            }
        }
        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
        throw new FileNotFoundException("Input file " + m119019R0(c20556f2) + " not found");
    }

    /* renamed from: e0 */
    public static void m119040e0(InterfaceC27218a interfaceC27218a, ZaloView zaloView, C18620i c18620i) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"url\":\"");
            C22494a c22494a = C22494a.f110026a;
            sb2.append(c22494a.m116288c());
            sb2.append("\"}");
            String sb3 = sb2.toString();
            C31877d c31877d = new C31877d();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", c22494a.m116288c());
            bundle.putSerializable("EXTRA_SOURCE_OPEN_MA", c18620i);
            c31877d.m153185d(bundle);
            AbstractC28207v1.m141984g3("action.open.inapp", 2, interfaceC27218a, zaloView, sb3, null, c31877d);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f0 */
    public static void m119042f0(Context context, String str, double d11, double d12) {
        boolean z11;
        if (context != null) {
            try {
                ZaloBubbleActivity.m57031a5();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d12 + "," + d11 + "?z=18&q=" + d12 + "," + d11 + "(" + str + ")"));
                intent.setPackage("com.google.android.apps.maps");
                try {
                    z11 = context.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0).enabled;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    z11 = true;
                }
                if (intent.resolveActivity(context.getPackageManager()) != null && z11) {
                    context.startActivity(intent);
                } else {
                    String encode = Uri.encode(str + "@" + d12 + "," + d11);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://maps.google.com/maps?z=16&q=");
                    sb2.append(encode);
                    sb2.append("&t=m");
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
                }
                AbstractC23647d.m123906p("917820");
                AbstractC23647d.m123893c();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: g0 */
    public static void m119044g0(Context context, String str) {
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse("market://details?id=" + str));
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: h0 */
    public static void m119046h0(Context context, String str) {
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(String.format(Locale.US, "market://search?q=%s", str)));
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "https://play.google.com/store/search?q=%s", str))));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: i0 */
    public static void m119048i0(Context context, String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    String scheme = new URI(str).getScheme();
                    if (scheme != null) {
                        String lowerCase = scheme.toLowerCase();
                        if (lowerCase.equals("http") && lowerCase.equals("https")) {
                            Intent m119012O = m119012O(ZaloWebView.class, ZaloWebView.m87089QR("http://" + str));
                            if (m119012O != null) {
                                context.startActivity(m119012O);
                            }
                        }
                        context.startActivity(m119012O(ZaloWebView.class, ZaloWebView.m87089QR(str.replace(scheme, lowerCase))));
                    } else {
                        context.startActivity(m119012O(ZaloWebView.class, ZaloWebView.m87089QR("http://" + str)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: j0 */
    public static void m119050j0(Context context, String str) {
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                str = "http://" + str;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_cannot_open_link));
        }
    }

    /* renamed from: k */
    public static boolean m119051k(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 25) {
            try {
                if (context.getPackageManager().resolveActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"), 0) == null) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static void m119052k0(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* renamed from: l */
    public static Intent m119053l(Context context, Intent intent, CharSequence charSequence) {
        try {
            Stack stack = new Stack();
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "info@domain.com", null)), 0)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                stack.add(intent2);
            }
            if (!stack.isEmpty()) {
                Intent createChooser = Intent.createChooser(intent, charSequence);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) stack.toArray(new Parcelable[stack.size()]));
                return createChooser;
            }
            return Intent.createChooser(intent, charSequence);
        } catch (Exception e11) {
            e11.printStackTrace();
            return intent;
        }
    }

    /* renamed from: l0 */
    public static void m119054l0(Context context, String str) {
        PackageManager packageManager;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && (packageManager = context.getPackageManager()) != null) {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                    } else {
                        m119044g0(context, str);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public static Bundle m119055m(boolean z11, int i11, String str, String str2, int i12, String str3, int i13) {
        Intent intent = new Intent();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_source", i13);
            intent.putExtra("extra_param_info", jSONObject.toString());
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (!z11) {
            Bundle bundle = new Bundle();
            bundle.putInt("sid", i11);
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("SOURCE_ACTION", str);
            }
            intent.putExtras(bundle);
        } else {
            intent.putExtra("EXTRA_FEATURE_ID", C18613b.f93601t);
            intent.putExtra("extra_cate_id", i11);
            intent.putExtra("EXTRA_SOURCE_LINK", i12);
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("EXTRA_SOURCE_PARAM", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("PATH", str2);
            }
        }
        return intent.getExtras();
    }

    /* renamed from: m0 */
    public static void m119056m0(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.WIFI_SETTINGS");
        context.startActivity(intent);
    }

    /* renamed from: n */
    public static void m119057n(InterfaceC27218a interfaceC27218a, int i11, String str, String str2, int i12, String str3, Bundle bundle, int i13, int i14) {
        C17487o0 mo35579p;
        if (interfaceC27218a != null) {
            try {
                mo35579p = interfaceC27218a.mo35579p();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo35579p = null;
        }
        if (mo35579p != null) {
            boolean m110048i = C21242e.m110039d().m110048i(C18613b.f93601t);
            Bundle m119055m = m119055m(m110048i, i11, str, str2, i12, str3, i14);
            if (bundle != null) {
                m119055m.putAll(bundle);
            }
            if (!m110048i) {
                mo35579p.m93066i2(StickerDetailsView.class, m119055m, i13, 1, true);
            } else {
                mo35579p.m93066i2(ZaloWebView.class, m119055m, i13, 1, true);
            }
        }
    }

    /* renamed from: n0 */
    public static void m119058n0(Context context, ContactProfile contactProfile, boolean z11, int i11) {
        Intent intent = new Intent(context, (Class<?>) PasscodeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("contactProfile", contactProfile);
        bundle.putBoolean("callType", z11);
        bundle.putInt("sourceType", i11);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: o */
    public static void m119059o(C17487o0 c17487o0, int i11, String str, String str2, int i12, String str3) {
        C21242e m110039d = C21242e.m110039d();
        C18613b c18613b = C18613b.f93601t;
        boolean m110048i = m110039d.m110048i(c18613b);
        Bundle bundle = new Bundle();
        if (!m110048i) {
            bundle.putInt("sid", i11);
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("SOURCE_ACTION", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("PATH", str2);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_source", 0);
                bundle.putString("extra_param_info", jSONObject.toString());
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            c17487o0.m93069k2(StickerDetailsView.class, bundle, 1, true);
            return;
        }
        bundle.putSerializable("EXTRA_FEATURE_ID", c18613b);
        bundle.putInt("extra_cate_id", i11);
        bundle.putInt("EXTRA_SOURCE_LINK", i12);
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("EXTRA_SOURCE_PARAM", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("PATH", str2);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("open_source", 0);
            bundle.putString("extra_param_info", jSONObject2.toString());
        } catch (JSONException e12) {
            AbstractC20110a.m104539h(e12);
        }
        c17487o0.m93069k2(ZaloWebView.class, bundle, 1, true);
    }

    /* renamed from: o0 */
    public static void m119060o0(C17487o0 c17487o0, C31991k8 c31991k8, int i11, int i12) {
        m119062p0(c17487o0, c31991k8, i11, i12, false);
    }

    /* renamed from: p */
    public static void m119061p(InterfaceC27218a interfaceC27218a, String str, String str2, String str3) {
        ((C23528a) new C23528a(CoreUtility.getAppContext()).m123612r(new C3977j(CoreUtility.getAppContext()))).m123579C(str3, C23278z2.m120143n(), new b(interfaceC27218a, str, str2));
    }

    /* renamed from: p0 */
    public static void m119062p0(C17487o0 c17487o0, C31991k8 c31991k8, int i11, int i12, boolean z11) {
        try {
            Intent m118998H = m118998H(c31991k8);
            if (m118998H != null) {
                Bundle bundleExtra = m118998H.getBundleExtra("zalo_view_bundle");
                if (z11) {
                    bundleExtra.putInt("SHOW_WITH_FLAGS", 33554432);
                }
                Serializable serializable = m118998H.getExtras().getSerializable("zalo_view_class");
                if (serializable instanceof Class) {
                    Class cls = (Class) serializable;
                    if (ZaloView.class.isAssignableFrom(cls) && c17487o0 != null) {
                        c17487o0.m93066i2(cls, bundleExtra, i11, i12, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public static void m119063q(InterfaceC27218a interfaceC27218a, String str, String str2, Bitmap bitmap) {
        AbstractC23178p7.m119405d(interfaceC27218a, str, str2, bitmap, 0);
    }

    /* renamed from: q0 */
    public static void m119064q0(InterfaceC27218a interfaceC27218a, C22499f c22499f, int i11) {
        if (c22499f != null) {
            try {
                if (c22499f.m116335k() != null) {
                    if (c22499f.m116335k().m116304a() != 1 || !c22499f.m116338n()) {
                        String m40669h = TrackingSource.m40669h(TrackingSource.m40666e());
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_param_info", c22499f.m116331g());
                        if (!TextUtils.isEmpty(m40669h)) {
                            bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
                        }
                        ZaloWebView.m87107jS(interfaceC27218a, c22499f.m116335k().m116305b(), bundle, i11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: r */
    public static void m119065r(InterfaceC27218a interfaceC27218a, String str, String str2, String str3) {
        ((C23528a) new C23528a(CoreUtility.getAppContext()).m123612r(new C3977j(CoreUtility.getAppContext()))).m123579C(str3, C23278z2.m120143n(), new c(interfaceC27218a, str, str2));
    }

    /* renamed from: r0 */
    public static void m119066r0(InterfaceC27218a interfaceC27218a, int i11, String str, int i12, String str2, int i13) {
        m119070t0(interfaceC27218a, i11, "", str, i12, str2, null, -1, i13);
    }

    /* renamed from: s */
    private static void m119067s(Context context, C22499f c22499f) {
        try {
            if (f112278b) {
                return;
            }
            f112278b = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c22499f, context));
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(c22499f.m116332h())) {
                arrayList.add(c22499f.m116332h());
            }
            if (!TextUtils.isEmpty(c22499f.m116334j())) {
                arrayList.add(c22499f.m116334j());
            }
            c0766k.mo1508P6(arrayList, 1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s0 */
    public static void m119068s0(InterfaceC27218a interfaceC27218a, int i11, String str, int i12, String str2, Bundle bundle, int i13, int i14) {
        m119070t0(interfaceC27218a, i11, "", str, i12, str2, bundle, i13, i14);
    }

    /* renamed from: t */
    public static boolean m119069t(C20556f c20556f) {
        if (c20556f == null) {
            return false;
        }
        try {
            return c20556f.m106834f().toLowerCase(Locale.getDefault()).equals("apk");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: t0 */
    private static void m119070t0(InterfaceC27218a interfaceC27218a, int i11, String str, String str2, int i12, String str3, Bundle bundle, int i13, int i14) {
        try {
            m119057n(interfaceC27218a, i11, str, str2, i12, str3, bundle, i13, i14);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public static boolean m119071u(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: u0 */
    public static void m119072u0(InterfaceC27218a interfaceC27218a, int i11, String str, int i12, String str2, int i13, String str3, int i14) {
        C17487o0 mo35579p;
        if (interfaceC27218a != null) {
            try {
                mo35579p = interfaceC27218a.mo35579p();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo35579p = null;
        }
        C17487o0 c17487o0 = mo35579p;
        if (c17487o0 != null) {
            boolean m110048i = C21242e.m110039d().m110048i(C18613b.f93601t);
            Bundle m119055m = m119055m(m110048i, i11, str, str2, i13, str3, i14);
            if (!m110048i) {
                c17487o0.m93066i2(StickerDetailsView.class, m119055m, i12, 1, true);
            } else {
                c17487o0.m93066i2(ZaloWebView.class, m119055m, i12, 1, true);
            }
        }
    }

    /* renamed from: v */
    public static boolean m119073v(ApplicationInfo applicationInfo) {
        if ((applicationInfo.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public static void m119074v0(InterfaceC27218a interfaceC27218a, String str, String str2, int i11, String str3, int i12) {
        C17487o0 mo35579p;
        if (interfaceC27218a != null) {
            try {
                mo35579p = interfaceC27218a.mo35579p();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo35579p = null;
        }
        if (mo35579p != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FEATURE_ID", C18613b.f93601t);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("SOURCE_ACTION", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("PATH", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("EXTRA_SOURCE_PARAM", str3);
            }
            intent.putExtra("EXTRA_SOURCE_LINK", i11);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_source", i12);
                intent.putExtra("extra_param_info", jSONObject.toString());
            } catch (JSONException e12) {
                AbstractC20110a.m104539h(e12);
            }
            mo35579p.m93069k2(ZaloWebView.class, intent.getExtras(), 1, true);
        }
    }

    /* renamed from: w0 */
    public static void m119076w0(InterfaceC27218a interfaceC27218a, String str, int i11, Bundle bundle) {
        C17487o0 mo35579p;
        if (interfaceC27218a != null) {
            try {
                mo35579p = interfaceC27218a.mo35579p();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            mo35579p = null;
        }
        C17487o0 c17487o0 = mo35579p;
        if (c17487o0 != null) {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("SOURCE_ACTION", str);
            }
            intent.putExtra("EXTRA_FEATURE_ID", C18613b.f93601t);
            if (bundle != null) {
                intent.putExtras(bundle);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("open_source", bundle.getInt(StickerManageView.f77869j1, 0));
                    intent.putExtra("extra_param_info", jSONObject.toString());
                } catch (JSONException e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
            c17487o0.m93066i2(ZaloWebView.class, intent.getExtras(), i11, 1, true);
        }
    }

    /* renamed from: x0 */
    public static void m119078x0(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 25) {
            try {
                context.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
        }
    }

    /* renamed from: y0 */
    public static void m119080y0(Context context, InterfaceC27218a interfaceC27218a, C22499f c22499f) {
        String str;
        if (c22499f == null) {
            return;
        }
        try {
            if (c22499f.m116326b() == 1 && c22499f.m116338n()) {
                if (TextUtils.isEmpty(c22499f.m116332h()) && TextUtils.isEmpty(c22499f.m116334j())) {
                    m119054l0(context, c22499f.m116333i());
                } else {
                    String str2 = "";
                    if (TextUtils.isEmpty(c22499f.m116332h())) {
                        str = "";
                    } else {
                        str = (String) f112277a.get(c22499f.m116332h());
                    }
                    if (!TextUtils.isEmpty(c22499f.m116334j())) {
                        str2 = (String) f112277a.get(c22499f.m116334j());
                    }
                    if ((c22499f.m116330f() == 0 && !TextUtils.isEmpty(str)) || (c22499f.m116330f() == 1 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2))) {
                        m118989C0(context, str, str2, c22499f.m116330f());
                    } else {
                        m119067s(context, c22499f);
                    }
                }
                C18922m.m99141t().m99143L();
                return;
            }
            String m40669h = TrackingSource.m40669h(TrackingSource.m40666e());
            Bundle bundle = new Bundle();
            bundle.putString("extra_param_info", c22499f.m116331g());
            if (!TextUtils.isEmpty(m40669h)) {
                bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
            }
            ZaloWebView.m87105iS(interfaceC27218a, c22499f.m116327c(), bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z0 */
    public static void m119082z0() {
        Intent intent = new Intent("android.settings.NOTIFICATION_SETTINGS");
        if (intent.resolveActivity(MainApplication.getAppContext().getPackageManager()) != null) {
            MainApplication.getAppContext().startActivity(intent);
        }
    }
}
