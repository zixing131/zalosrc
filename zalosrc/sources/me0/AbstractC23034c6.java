package me0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.AbstractC1324b;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.LandingPageChatHeadView;
import com.zing.zalo.p077ui.zviews.OpenPermisionsSettingView;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p161fg.C18922m;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p542ub.InterfaceC27219b;
import th.AbstractC26683d;
import zl0.AbstractC32232i;

/* renamed from: me0.c6 */
/* loaded from: classes.dex */
public abstract class AbstractC23034c6 {

    /* renamed from: a */
    public static final String[] f112024a = {"android.permission.RECEIVE_SMS", "android.permission.READ_SMS"};

    /* renamed from: b */
    public static final String[] f112025b = m118191z();

    /* renamed from: c */
    public static final String[] f112026c = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: d */
    public static final String[] f112027d = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};

    /* renamed from: e */
    public static final String[] f112028e = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: f */
    public static final String[] f112029f = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: g */
    public static final String[] f112030g = {"android.permission.RECORD_AUDIO"};

    /* renamed from: h */
    public static final String[] f112031h = {"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: i */
    public static final String[] f112032i = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};

    /* renamed from: j */
    public static final String[] f112033j = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.VIBRATE"};

    /* renamed from: k */
    public static final String[] f112034k = {"android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: l */
    public static final String[] f112035l = {"android.permission.CALL_PHONE"};

    /* renamed from: m */
    public static final String[] f112036m = {"android.permission.BLUETOOTH_CONNECT"};

    /* renamed from: n */
    static final String f112037n = AbstractC23034c6.class.getSimpleName();

    /* renamed from: o */
    private static KeyEventCallbackC17462c f112038o;

    /* renamed from: A */
    public static boolean m118110A() {
        if (m118167n(MainApplication.getAppContext(), m118183v()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public static boolean m118111A0(Activity activity, String str) {
        return AbstractC1324b.m6641x(activity, str);
    }

    /* renamed from: B */
    public static boolean m118112B() {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            str = "android.permission.READ_CALL_LOG";
        } else {
            str = "android.permission.CALL_PHONE";
        }
        if (m118165m(MainApplication.getAppContext(), str) == 0 && C8937j0.m47663l("call_log_noti_call")) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    private static void m118113B0(Context context, int i11, int i12, int i13, int i14, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2, InterfaceC17463d.c cVar) {
        m118115C0(context, i11, i12, "", i13, i14, dVar, dVar2, cVar);
    }

    /* renamed from: C */
    public static boolean m118114C(Context context, String str) {
        if (m118165m(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    private static void m118115C0(Context context, int i11, int i12, String str, int i13, int i14, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2, InterfaceC17463d.c cVar) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = f112038o;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.cancel();
        }
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setText(i11);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        robotoTextView.setTextSize(1, 18.0f);
        robotoTextView.setTextStyleBold(true);
        robotoTextView.setSingleLine(false);
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43159h(4).m43158g(robotoTextView).m43176y(true).m43175x(false).m43162k(context.getString(i12, str)).m43165n(context.getString(i14), new InterfaceC17463d.d() { // from class: me0.q5
            public /* synthetic */ C23187q5() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                AbstractC23034c6.m118154g0(InterfaceC17463d.d.this, interfaceC17463d, i15);
            }
        }).m43170s(context.getString(i13), new InterfaceC17463d.d() { // from class: me0.r5
            public /* synthetic */ C23198r5() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                AbstractC23034c6.m118150e0(InterfaceC17463d.d.this, interfaceC17463d, i15);
            }
        }).m43167p(new InterfaceC17463d.c() { // from class: me0.s5
            public /* synthetic */ C23209s5() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                AbstractC23034c6.m118152f0(InterfaceC17463d.c.this, interfaceC17463d);
            }
        }).m43155d(true);
        C8009j m43152a = aVar.m43152a();
        f112038o = m43152a;
        m43152a.mo13822K();
    }

    /* renamed from: D */
    public static boolean m118116D(Context context, String[] strArr) {
        if (m118167n(context, strArr) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    private static void m118117D0(InterfaceC27218a interfaceC27218a, int i11, int i12, int i13, int i14, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        m118115C0(interfaceC27218a.getContext(), i11, i12, "", i13, i14, dVar, dVar2, null);
    }

    /* renamed from: E */
    public static boolean m118118E() {
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        return m118121G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E0 */
    public static void m118119E0(InterfaceC27218a interfaceC27218a, int i11) {
        try {
            if ((interfaceC27218a instanceof Activity) && m118192z0((Activity) interfaceC27218a)) {
                m118180t0(interfaceC27218a, i11);
                return;
            }
            C8009j.a aVar = new C8009j.a(interfaceC27218a.getContext());
            aVar.m43155d(true).m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_gallery_banner_option_select_more), AbstractC23136l9.m118743r0(AbstractC8020f0.str_gallery_banner_option_open_settings)}, new InterfaceC17463d.d() { // from class: me0.t5

                /* renamed from: q */
                public final /* synthetic */ int f112511q;

                public /* synthetic */ C23220t5(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC23034c6.m118156h0(InterfaceC27218a.this, r2, interfaceC17463d, i12);
                }
            });
            aVar.m43152a().mo13822K();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: F */
    public static boolean m118120F() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 33 || m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m118121G() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 33 || m118167n(MainApplication.getAppContext(), f112029f) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m118122H(int i11) {
        switch (i11) {
            case 113:
            case 117:
            case 124:
            case 125:
            case 126:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444 /* 144 */:
            case 145:
            case 146:
            case 148:
            case 149:
            case 152:
                return true;
            case 114:
            case 115:
            case 116:
            case 118:
            case 119:
            case 120:
            case 121:
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
            case 123:
            case 127:
            case 132:
            case 134:
            case 137:
            case 141:
            case 142:
            case 143:
            case 147:
            case 150:
            case 151:
            default:
                return false;
        }
    }

    /* renamed from: I */
    static boolean m118123I(String str) {
        if (!"android.permission.READ_CONTACTS".equals(str) && !"android.permission.WRITE_CONTACTS".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static boolean m118124J(Context context) {
        String[] m118187x = m118187x();
        if (m118135U() && !m118116D(context, m118187x)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m118125K() {
        NotificationManager notificationManager;
        boolean areBubblesAllowed;
        if (Build.VERSION.SDK_INT >= 30 && (notificationManager = (NotificationManager) MainApplication.getAppContext().getSystemService("notification")) != null) {
            areBubblesAllowed = notificationManager.areBubblesAllowed();
            if (!areBubblesAllowed) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m118126L(Context context) {
        return AbstractC32232i.m155459g(context);
    }

    /* renamed from: M */
    public static boolean m118127M() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) == 0 || m118165m(MainApplication.getAppContext(), "android.permission.READ_MEDIA_IMAGES") == 0) {
                return true;
            }
            return false;
        }
        if (i11 == 33) {
            if (m118165m(MainApplication.getAppContext(), "android.permission.READ_MEDIA_IMAGES") == 0) {
                return true;
            }
            return false;
        }
        return m118121G();
    }

    /* renamed from: N */
    public static boolean m118128N() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) == 0 || m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) == 0) {
                return true;
            }
            return false;
        }
        if (i11 == 33) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) == 0) {
                return true;
            }
            return false;
        }
        return m118121G();
    }

    /* renamed from: O */
    public static boolean m118129O() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) == 0 || m118165m(MainApplication.getAppContext(), "android.permission.READ_MEDIA_VIDEO") == 0) {
                return true;
            }
            return false;
        }
        if (i11 == 33) {
            if (m118165m(MainApplication.getAppContext(), "android.permission.READ_MEDIA_VIDEO") == 0) {
                return true;
            }
            return false;
        }
        return m118121G();
    }

    /* renamed from: P */
    public static boolean m118130P(Context context) {
        try {
            if (((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Q */
    public static boolean m118131Q() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) == 0 || m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) == 0) {
                return true;
            }
            return false;
        }
        if (i11 == 33) {
            if (m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) == 0) {
                return true;
            }
            return false;
        }
        return m118120F();
    }

    /* renamed from: R */
    public static boolean m118132R(String str) {
        Map map = AbstractC23304d.f113325S;
        if (map.containsKey(str) && ((Boolean) map.get(str)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    static boolean m118133S(String str) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (!"android.permission.READ_MEDIA_IMAGES".equals(str) && !"android.permission.READ_MEDIA_VIDEO".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    static boolean m118134T(String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str);
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m118135U() {
        if (Build.VERSION.SDK_INT >= 34) {
            return m118114C(MainApplication.getAppContext(), "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m118136V(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    public static /* synthetic */ void m118137W(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + interfaceC27218a.mo35575n1().getPackageName()));
        interfaceC27218a.startActivityForResult(intent, 3001);
        C18922m.m99141t().m99143L();
    }

    /* renamed from: X */
    public static /* synthetic */ void m118138X(InterfaceC27218a interfaceC27218a, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        m118186w0(interfaceC27218a, f112033j, i11);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m118139Y(ZaloView zaloView, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        m118184v0(zaloView, f112030g, i11);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m118140Z(InterfaceC27218a interfaceC27218a, InterfaceC17463d.c cVar, InterfaceC17463d interfaceC17463d, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + interfaceC27218a.getContext().getPackageName()));
        interfaceC27218a.startActivityForResult(intent, 3001);
        C18922m.m99141t().m99143L();
        if (cVar != null) {
            cVar.mo13013p7(interfaceC17463d);
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m118142a0(ZaloView zaloView, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        m118184v0(zaloView, f112033j, i11);
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m118144b0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.c cVar, InterfaceC17463d interfaceC17463d, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + interfaceC27218a.getContext().getPackageName()));
        interfaceC27218a.startActivityForResult(intent, 3001);
        C18922m.m99141t().m99143L();
        if (cVar != null) {
            interfaceC17463d.cancel();
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m118146c0(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + interfaceC27218a.mo35575n1().getPackageName()));
        interfaceC27218a.startActivityForResult(intent, 3001);
        C18922m.m99141t().m99143L();
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m118148d0(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        m118186w0(interfaceC27218a, f112033j, 138);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m118150e0(InterfaceC17463d.d dVar, InterfaceC17463d interfaceC17463d, int i11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = f112038o;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92854E(null);
        }
        if (dVar != null) {
            dVar.mo605K8(interfaceC17463d, i11);
        }
        f112038o = null;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m118152f0(InterfaceC17463d.c cVar, InterfaceC17463d interfaceC17463d) {
        if (cVar != null) {
            cVar.mo13013p7(interfaceC17463d);
        }
        f112038o = null;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m118154g0(InterfaceC17463d.d dVar, InterfaceC17463d interfaceC17463d, int i11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = f112038o;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92854E(null);
        }
        if (dVar != null) {
            dVar.mo605K8(interfaceC17463d, i11);
        }
        f112038o = null;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m118156h0(InterfaceC27218a interfaceC27218a, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        if (i12 == 0) {
            m118180t0(interfaceC27218a, i11);
            return;
        }
        if (i12 == 1) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + interfaceC27218a.getContext().getPackageName()));
            interfaceC27218a.startActivityForResult(intent, 3001);
        }
    }

    /* renamed from: i0 */
    public static void m118158i0(InterfaceC27218a interfaceC27218a, int i11, InterfaceC17463d.d dVar, InterfaceC17463d.c cVar) {
        if (m118167n(interfaceC27218a.getContext(), f112033j) == 0) {
            return;
        }
        if (!interfaceC27218a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_to_access_cam, AbstractC8020f0.str_call_subtitle_allow_to_access_cam, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, dVar, new InterfaceC17463d.d() { // from class: me0.z5
                public /* synthetic */ C23281z5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC23034c6.m118137W(InterfaceC27218a.this, interfaceC17463d, i12);
                }
            }, cVar);
            AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", "android.permission.CAMERA"));
        } else {
            m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_cam_access, AbstractC8020f0.str_call_subtitle_allow_cam_access_to_turn_on_cam, AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, dVar, new InterfaceC17463d.d() { // from class: me0.a6

                /* renamed from: q */
                public final /* synthetic */ int f111965q;

                public /* synthetic */ C23012a6(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC23034c6.m118138X(InterfaceC27218a.this, r2, interfaceC17463d, i12);
                }
            }, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:            if (r8 == false) goto L210;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:            if (r19 != 122) goto L210;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:            if (r7 == false) goto L205;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:            r0 = "38304";     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0173, code lost:            p361nb.AbstractC23647d.m123897g(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0171, code lost:            r0 = "38303";     */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m118160j0(ZaloActivity zaloActivity, int i11, String[] strArr, int[] iArr) {
        boolean z11 = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (strArr.length != 0 && iArr.length != 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (m118134T(strArr[i12]) && iArr[i12] == 0) {
                    z12 = true;
                }
                boolean m118123I = m118123I(strArr[i12]);
                if (m118123I) {
                    if (m118132R(strArr[i12])) {
                        z14 = true;
                    }
                    z15 = true;
                }
                if (iArr[i12] != 0) {
                    if (m118123I) {
                        z13 = true;
                    }
                    if (!zaloActivity.shouldShowRequestPermissionRationale(strArr[i12])) {
                        arrayList.add(strArr[i12]);
                        if (m118123I && !AbstractC26683d.f126398q) {
                            Map map = AbstractC23304d.f113325S;
                            if (map.containsKey(strArr[i12]) && ((Boolean) map.get(strArr[i12])).booleanValue()) {
                                arrayList.remove(strArr[i12]);
                            }
                        }
                    }
                }
            }
            if (z12 || m118135U()) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!m118133S(next)) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            }
            if (100 == i11 && !AbstractC26683d.f126398q) {
                arrayList.remove("android.permission.READ_CONTACTS");
                arrayList.remove("android.permission.WRITE_CONTACTS");
                arrayList.remove("android.permission.ACCESS_FINE_LOCATION");
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("extra_list_permssion", arrayList);
            if (12 == i11) {
                arrayList.remove("android.permission.CAMERA");
            }
            if (arrayList.size() > 0) {
                if (100 == i11) {
                    if (Math.abs(System.currentTimeMillis() - AbstractC23309i.m121076J6()) > 3600000) {
                        AbstractC23309i.m121992hr(System.currentTimeMillis());
                        bundle.putInt("str_request_code", i11);
                        zaloActivity.mo35579p().m93069k2(OpenPermisionsSettingView.class, bundle, 0, true);
                        Iterator<String> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", it2.next()));
                        }
                        z11 = true;
                    }
                } else if (i11 != 132 && i11 != 150 && !m118122H(i11)) {
                    bundle.putInt("str_request_code", i11);
                    zaloActivity.mo35579p().m93069k2(OpenPermisionsSettingView.class, bundle, 0, true);
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", it3.next()));
                    }
                    z11 = true;
                }
                e11.printStackTrace();
                return z11;
            }
            z14 = true;
            return z11;
        }
        return false;
    }

    /* renamed from: k0 */
    public static void m118162k0(ZaloView zaloView, int i11) {
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            m118164l0(m92676n2, null, new InterfaceC17463d.d() { // from class: me0.v5

                /* renamed from: q */
                public final /* synthetic */ int f112627q;

                public /* synthetic */ C23241v5(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC23034c6.m118139Y(ZaloView.this, r2, interfaceC17463d, i12);
                }
            }, null);
        }
    }

    /* renamed from: l0 */
    public static void m118164l0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2, InterfaceC17463d.c cVar) {
        if (m118165m(interfaceC27218a.getContext(), "android.permission.RECORD_AUDIO") == 0) {
            return;
        }
        if (!interfaceC27218a.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_to_access_mic, AbstractC8020f0.str_call_subtitle_allow_to_access_mic, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, dVar, new InterfaceC17463d.d() { // from class: me0.y5

                /* renamed from: q */
                public final /* synthetic */ InterfaceC17463d.c f112779q;

                public /* synthetic */ C23271y5(InterfaceC17463d.c cVar2) {
                    r2 = cVar2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23034c6.m118140Z(InterfaceC27218a.this, r2, interfaceC17463d, i11);
                }
            }, cVar2);
            AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", "android.permission.RECORD_AUDIO"));
        } else {
            m118115C0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_mic_access, AbstractC8020f0.str_call_subtitle_allow_mic_access, interfaceC27218a.getString(AbstractC8020f0.str_call_type_audio), AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, dVar, dVar2, cVar2);
        }
    }

    /* renamed from: m */
    public static int m118165m(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        return AbstractC1388a.m6959a(context, str);
    }

    /* renamed from: m0 */
    public static void m118166m0(ZaloView zaloView, int i11) {
        m118168n0(zaloView.m92676n2(), null, new InterfaceC17463d.d() { // from class: me0.u5

            /* renamed from: q */
            public final /* synthetic */ int f112613q;

            public /* synthetic */ C23231u5(int i112) {
                r2 = i112;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                AbstractC23034c6.m118142a0(ZaloView.this, r2, interfaceC17463d, i12);
            }
        });
    }

    /* renamed from: n */
    public static int m118167n(Context context, String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        for (String str : strArr) {
            if (AbstractC1388a.m6959a(context, str) != 0) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: n0 */
    public static void m118168n0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        m118170o0(interfaceC27218a, dVar, dVar2, null);
    }

    /* renamed from: o */
    public static List m118169o() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        try {
            strArr = CoreUtility.getAppContext().getPackageManager().getPackageInfo(CoreUtility.getAppContext().getPackageName(), 4096).requestedPermissions;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (strArr == null) {
            return arrayList;
        }
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static void m118170o0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2, InterfaceC17463d.c cVar) {
        boolean z11;
        boolean z12;
        if (m118167n(interfaceC27218a.getContext(), f112033j) == 0) {
            return;
        }
        boolean z13 = false;
        boolean z14 = true;
        if (m118165m(interfaceC27218a.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            if (!interfaceC27218a.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", "android.permission.RECORD_AUDIO"));
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = false;
        } else {
            z11 = false;
            z12 = true;
        }
        if (m118165m(interfaceC27218a.getContext(), "android.permission.CAMERA") != 0) {
            if (!interfaceC27218a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", "android.permission.CAMERA"));
            } else {
                z14 = z11;
            }
        } else {
            z14 = z11;
            z13 = true;
        }
        if (z14) {
            C23023b6 c23023b6 = new InterfaceC17463d.d() { // from class: me0.b6

                /* renamed from: q */
                public final /* synthetic */ InterfaceC17463d.c f111992q;

                public /* synthetic */ C23023b6(InterfaceC17463d.c cVar2) {
                    r2 = cVar2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23034c6.m118144b0(InterfaceC27218a.this, r2, interfaceC17463d, i11);
                }
            };
            if (!z12 && !z13) {
                m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_to_access_mic_cam, AbstractC8020f0.str_call_subtitle_allow_to_access_mic_cam, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, dVar, c23023b6, cVar2);
                return;
            } else if (!z12) {
                m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_to_access_mic, AbstractC8020f0.str_call_subtitle_allow_to_access_mic, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, dVar, c23023b6, cVar2);
                return;
            } else {
                m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_to_access_cam, AbstractC8020f0.str_call_subtitle_allow_to_access_cam, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, dVar, c23023b6, cVar2);
                return;
            }
        }
        if (!z12 && !z13) {
            m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_mic_cam_access, AbstractC8020f0.str_call_subtitle_allow_mic_cam_access, AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, dVar, dVar2, cVar2);
        } else if (!z12) {
            m118115C0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_mic_access, AbstractC8020f0.str_call_subtitle_allow_mic_access, interfaceC27218a.getString(AbstractC8020f0.str_call_type_video), AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, dVar, dVar2, cVar2);
        } else {
            m118113B0(interfaceC27218a.getContext(), AbstractC8020f0.str_call_title_allow_cam_access, AbstractC8020f0.str_call_subtitle_allow_cam_access, AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, dVar, dVar2, cVar2);
        }
    }

    /* renamed from: p */
    public static String[] m118171p() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f112026c));
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: p0 */
    public static void m118172p0(InterfaceC27218a interfaceC27218a) {
        if (m118167n(interfaceC27218a.getContext(), f112033j) == 0) {
            return;
        }
        if (!interfaceC27218a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            m118117D0(interfaceC27218a, AbstractC8020f0.str_call_title_allow_to_access_cam, AbstractC8020f0.str_call_subtitle_allow_to_access_cam, AbstractC8020f0.str_call_btn_visit_setting, AbstractC8020f0.str_call_btn_close_permission_popup, null, new InterfaceC17463d.d() { // from class: me0.w5
                public /* synthetic */ C23251w5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23034c6.m118146c0(InterfaceC27218a.this, interfaceC17463d, i11);
                }
            });
            AbstractC23647d.m123898h("38200", String.format("{\"permission\": \"%s\"}", "android.permission.CAMERA"));
        } else {
            m118117D0(interfaceC27218a, AbstractC8020f0.str_call_title_allow_cam_access, AbstractC8020f0.str_call_subtitle_allow_cam_access_to_switch_video, AbstractC8020f0.str_call_btn_allow_permission, AbstractC8020f0.str_call_btn_deny_permission, null, new InterfaceC17463d.d() { // from class: me0.x5
                public /* synthetic */ C23261x5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23034c6.m118148d0(InterfaceC27218a.this, interfaceC17463d, i11);
                }
            });
        }
    }

    /* renamed from: q */
    public static String[] m118173q() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f112027d));
        if (!AbstractC26683d.f126398q) {
            arrayList.remove("android.permission.READ_CONTACTS");
            arrayList.remove("android.permission.WRITE_CONTACTS");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: q0 */
    public static String[] m118174q0() {
        return m118183v();
    }

    /* renamed from: r */
    public static String[] m118175r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.RECORD_AUDIO");
        if (Build.VERSION.SDK_INT < 33) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: r0 */
    public static void m118176r0(Activity activity, int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            activity.startActivityForResult(new Intent("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName()), i11);
        }
    }

    /* renamed from: s */
    public static String[] m118177s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.CAMERA");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (!m118135U()) {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            } else {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            }
        } else if (i11 == 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        } else {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: s0 */
    public static void m118178s0(C17487o0 c17487o0, int i11) {
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", i11);
            bundle.putInt("extra_mode_guide", 3);
            c17487o0.m93066i2(LandingPageChatHeadView.class, bundle, i11, 1, true);
        }
    }

    /* renamed from: t */
    public static String[] m118179t() {
        return (String[]) new ArrayList(Arrays.asList("android.permission.CAMERA")).toArray(new String[0]);
    }

    /* renamed from: t0 */
    public static void m118180t0(InterfaceC27218a interfaceC27218a, int i11) {
        m118186w0(interfaceC27218a, m118187x(), i11);
    }

    /* renamed from: u */
    public static String[] m118181u() {
        return (String[]) new ArrayList(Arrays.asList("android.permission.CAMERA", "android.permission.RECORD_AUDIO")).toArray(new String[0]);
    }

    /* renamed from: u0 */
    public static void m118182u0(C17487o0 c17487o0, int i11) {
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", i11);
            if (i11 == 11121) {
                bundle.putInt("extra_mode_guide", 1);
            } else if (i11 == 11122) {
                bundle.putInt("extra_mode_guide", 2);
            }
            c17487o0.m93066i2(LandingPageChatHeadView.class, bundle, i11, 1, true);
        }
    }

    /* renamed from: v */
    public static String[] m118183v() {
        String[] strArr = f112025b;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String[] strArr2 = new String[strArr.length + 1];
                int length = strArr.length;
                System.arraycopy(strArr, 0, strArr2, 0, length);
                strArr2[length] = "android.permission.ANSWER_PHONE_CALLS";
                return strArr2;
            } catch (Exception e11) {
                e11.printStackTrace();
                return strArr;
            }
        }
        return strArr;
    }

    /* renamed from: v0 */
    public static void m118184v0(ZaloView zaloView, String[] strArr, int i11) {
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            m118186w0(m92676n2, strArr, i11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: w */
    public static int m118185w(String str) {
        char c11;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -2062386608:
                if (str.equals("android.permission.READ_SMS")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1142799244:
                if (str.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -909527021:
                if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -895673731:
                if (str.equals("android.permission.RECEIVE_SMS")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -798669607:
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 175802396:
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 214526995:
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 691260818:
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 710297143:
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 1382557199:
                if (str.equals("android.permission.VIBRATE")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return 18102;
            case 1:
                return 18126;
            case 2:
                return 18108;
            case 3:
                return 18118;
            case 4:
                return 18137;
            case 5:
                return 18134;
            case 6:
                return 18100;
            case 7:
                return 18136;
            case '\b':
                return 18110;
            case '\t':
                return 18106;
            case '\n':
                return 18104;
            case 11:
                return 18128;
            case '\f':
                return 18116;
            case '\r':
                return 18120;
            case 14:
                return 18132;
            case 15:
                return 18130;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 18112;
            case 17:
                return 18124;
            case 18:
                return 18122;
            case 19:
                return 18114;
            default:
                return -1;
        }
    }

    /* renamed from: w0 */
    public static void m118186w0(InterfaceC27218a interfaceC27218a, String[] strArr, int i11) {
        m118188x0(interfaceC27218a, interfaceC27218a.getContext(), strArr, i11);
    }

    /* renamed from: x */
    public static String[] m118187x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_MEDIA_IMAGES");
        arrayList.add("android.permission.READ_MEDIA_VIDEO");
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: x0 */
    static void m118188x0(InterfaceC27219b interfaceC27219b, Context context, String[] strArr, int i11) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            AbstractC23304d.f113325S.clear();
            KeyEventCallbackC17462c keyEventCallbackC17462c = f112038o;
            if (keyEventCallbackC17462c != null) {
                keyEventCallbackC17462c.cancel();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (m118165m(context, str) != 0) {
                    arrayList.add(str);
                    AbstractC23304d.f113325S.put(str, Boolean.valueOf(interfaceC27219b.shouldShowRequestPermissionRationale(str)));
                }
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (strArr2.length == 0) {
                return;
            }
            interfaceC27219b.requestPermissions(strArr2, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public static String[] m118189y() {
        ArrayList arrayList = new ArrayList();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (!m118135U()) {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
            } else {
                arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            }
        } else if (i11 == 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
            arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        } else if (i11 >= 29) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        } else {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: y0 */
    public static void m118190y0(C17487o0 c17487o0, int i11) {
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", i11);
            if (i11 == 157) {
                bundle.putInt("extra_mode_guide", 4);
            }
            c17487o0.m93066i2(LandingPageChatHeadView.class, bundle, i11, 1, true);
        }
    }

    /* renamed from: z */
    private static String[] m118191z() {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.CALL_PHONE");
        arrayList.add("android.permission.READ_PHONE_STATE");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 & true) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        if (i11 >= 30) {
            arrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: z0 */
    public static boolean m118192z0(Activity activity) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        if (!m118111A0(activity, "android.permission.READ_MEDIA_IMAGES") && !m118111A0(activity, "android.permission.READ_MEDIA_VIDEO")) {
            return false;
        }
        return true;
    }
}
