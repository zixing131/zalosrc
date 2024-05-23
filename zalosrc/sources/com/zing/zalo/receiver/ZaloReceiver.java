package com.zing.zalo.receiver;

import ag0.AbstractC0837p0;
import ag0.C0809c1;
import am.AbstractC0939u;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.core.app.C1347i1;
import ap0.C2279a;
import bp0.AbstractC3096i0;
import bp0.AbstractC3106r;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.location.AbstractC8998z;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p077ui.PasscodeActivity;
import com.zing.zalo.receiver.ZaloReceiver;
import com.zing.zalo.service.ZaloBackgroundService;
import com.zing.zalo.startup.NonBlockingBroadcastReceiver;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.C16783a;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ee.C18403k;
import f80.C18823a;
import f80.C18824b;
import ho0.AbstractC20110a;
import hu.C20128b;
import hu.C20131e;
import java.util.Map;
import lo0.C22626t;
import me0.AbstractC23041d2;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.AbstractC23279z3;
import me0.C23055e5;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import mv.C23450c;
import org.json.JSONObject;
import p087d0.C17686c;
import p207he.C20020n;
import p207he.C20024r;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p263jc.C21216s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23655l;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.EnumC23747b0;
import p369ns.AbstractC23933a;
import p406ow.C24574j;
import p420pb.C24709a;
import p604wb.C28905e;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p681yh.C30981a;
import p681yh.C30983c;
import p681yh.EnumC30982b;
import p695yw.C31088a;
import p716zh.C31930g7;
import si.C26263i;
import tg.C26664o;
import vg.AbstractC28105j8;
import vg.C28023b6;
import vg.C28157p5;
import vg.C28203u6;
import xd0.C29599o;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32257b4;

/* loaded from: classes.dex */
public class ZaloReceiver extends NonBlockingBroadcastReceiver implements C23744a.c {

    /* renamed from: r */
    static long f49207r = 0;

    /* renamed from: s */
    static int f49208s = -1;

    /* renamed from: t */
    static long f49209t = 0;

    /* renamed from: u */
    public static long f49210u = -1;

    /* renamed from: q */
    public final String f49211q = getClass().getSimpleName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.receiver.ZaloReceiver$a */
    /* loaded from: classes4.dex */
    public class C9276a extends AbstractC0939u {
        C9276a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x01f9 A[Catch: Exception -> 0x0069, TryCatch #4 {Exception -> 0x0069, blocks: (B:3:0x0002, B:25:0x0025, B:27:0x0037, B:30:0x0058, B:32:0x005c, B:35:0x006e, B:37:0x007f, B:39:0x0091, B:42:0x0099, B:44:0x009d, B:45:0x00b3, B:47:0x00c8, B:48:0x00db, B:51:0x00f2, B:55:0x00af, B:66:0x0189, B:68:0x018d, B:70:0x0199, B:73:0x01ac, B:76:0x01c0, B:81:0x0185, B:10:0x01f4, B:12:0x01f9, B:14:0x0218, B:16:0x0224, B:17:0x023c, B:6:0x01cf, B:8:0x01d3, B:21:0x01de, B:84:0x0021, B:23:0x0016, B:63:0x0163, B:65:0x0173), top: B:2:0x0002, inners: #0, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: Exception -> 0x0069, TryCatch #4 {Exception -> 0x0069, blocks: (B:3:0x0002, B:25:0x0025, B:27:0x0037, B:30:0x0058, B:32:0x005c, B:35:0x006e, B:37:0x007f, B:39:0x0091, B:42:0x0099, B:44:0x009d, B:45:0x00b3, B:47:0x00c8, B:48:0x00db, B:51:0x00f2, B:55:0x00af, B:66:0x0189, B:68:0x018d, B:70:0x0199, B:73:0x01ac, B:76:0x01c0, B:81:0x0185, B:10:0x01f4, B:12:0x01f9, B:14:0x0218, B:16:0x0224, B:17:0x023c, B:6:0x01cf, B:8:0x01d3, B:21:0x01de, B:84:0x0021, B:23:0x0016, B:63:0x0163, B:65:0x0173), top: B:2:0x0002, inners: #0, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01ab  */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo928a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Location m141673c;
            double d11;
            double d12;
            long j11;
            int i11;
            try {
                C23655l c23655l = new C23655l();
                c23655l.f114657d = -1;
                String str6 = "";
                if (C23055e5.m118271f()) {
                    try {
                        str = String.valueOf(AbstractC23349d.m122766d());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        str = "";
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) MainApplication.getAppContext().getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int subtype = activeNetworkInfo.getSubtype();
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        NetworkHelper.m48302k().m48308e(activeNetworkInfo.getTypeName());
                        if (type == 1) {
                            if (ZaloReceiver.f49208s == 1) {
                                if (System.currentTimeMillis() - ZaloReceiver.f49209t > 2000) {
                                }
                            }
                            WifiManager wifiManager = (WifiManager) MainApplication.getAppContext().getApplicationContext().getSystemService("wifi");
                            try {
                                WifiInfo m93678e = new C17686c(wifiManager, new SensitiveData("wifi_get_connection_info_on_connectivity_change", "join_wifi")).m93678e();
                                if (m93678e == null) {
                                    str5 = "";
                                    str3 = str5;
                                    str4 = str3;
                                } else {
                                    str3 = Formatter.formatIpAddress(m93678e.getIpAddress());
                                    try {
                                        str4 = m93678e.getSSID();
                                    } catch (SensitiveDataException e12) {
                                        e = e12;
                                        str4 = "";
                                    }
                                    try {
                                        str5 = m93678e.getBSSID();
                                    } catch (SensitiveDataException e13) {
                                        e = e13;
                                        AbstractC20110a.m104539h(e);
                                        str5 = "";
                                        C31088a m151068a = C31088a.m151068a(wifiManager, str5, new SensitiveData("wifi_get_last_scan_results_on_connectivity_change", "join_wifi"));
                                        m141673c = C28157p5.m141667d().m141673c();
                                        if (m141673c == null) {
                                        }
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("MAC_ADDRESS", str5);
                                        jSONObject.put("SSID", str4);
                                        jSONObject.put("NAME", "");
                                        if (!TextUtils.isEmpty(str3)) {
                                        }
                                        jSONObject.put("IP_ADDRESS", str6);
                                        jSONObject.put("OS", 2);
                                        jSONObject.put("ORG", "Zalo");
                                        jSONObject.put("DOMAIN", Image.SCALE_TYPE_NONE);
                                        jSONObject.put("SIGNAL", 0);
                                        jSONObject.put("HISTORY", m151068a.m151069b());
                                        jSONObject.put("DEVICE_NAME", "Android");
                                        jSONObject.put("LONG", String.valueOf(d11));
                                        jSONObject.put("LAT", String.valueOf(d12));
                                        jSONObject.put("TIME", String.valueOf(j11));
                                        jSONObject.put("GPS_SETTING", String.valueOf(C28157p5.m141667d().m141675g()));
                                        jSONObject.put("SECURITY_MODE", m151068a.m151070c());
                                        jSONObject.put("MCC_MNC", str);
                                        c23655l.f114659f[0] = jSONObject.toString();
                                        c23655l.f114657d = 1;
                                        i11 = c23655l.f114657d;
                                        if (i11 != -1) {
                                        }
                                    }
                                }
                            } catch (SensitiveDataException e14) {
                                e = e14;
                                str3 = "";
                                str4 = str3;
                            }
                            C31088a m151068a2 = C31088a.m151068a(wifiManager, str5, new SensitiveData("wifi_get_last_scan_results_on_connectivity_change", "join_wifi"));
                            m141673c = C28157p5.m141667d().m141673c();
                            if (m141673c == null) {
                                d11 = m141673c.getLongitude();
                                d12 = m141673c.getLatitude();
                                j11 = m141673c.getTime();
                            } else {
                                d11 = 0.0d;
                                d12 = 0.0d;
                                j11 = -1;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("MAC_ADDRESS", str5);
                            jSONObject2.put("SSID", str4);
                            jSONObject2.put("NAME", "");
                            if (!TextUtils.isEmpty(str3)) {
                                str6 = str3;
                            }
                            jSONObject2.put("IP_ADDRESS", str6);
                            jSONObject2.put("OS", 2);
                            jSONObject2.put("ORG", "Zalo");
                            jSONObject2.put("DOMAIN", Image.SCALE_TYPE_NONE);
                            jSONObject2.put("SIGNAL", 0);
                            jSONObject2.put("HISTORY", m151068a2.m151069b());
                            jSONObject2.put("DEVICE_NAME", "Android");
                            jSONObject2.put("LONG", String.valueOf(d11));
                            jSONObject2.put("LAT", String.valueOf(d12));
                            jSONObject2.put("TIME", String.valueOf(j11));
                            jSONObject2.put("GPS_SETTING", String.valueOf(C28157p5.m141667d().m141675g()));
                            jSONObject2.put("SECURITY_MODE", m151068a2.m151070c());
                            jSONObject2.put("MCC_MNC", str);
                            c23655l.f114659f[0] = jSONObject2.toString();
                            c23655l.f114657d = 1;
                        } else {
                            try {
                            } catch (Exception e15) {
                                e15.printStackTrace();
                            }
                            if (MainApplication.getAppContext().getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                                str2 = ((TelephonyManager) MainApplication.getAppContext().getSystemService("phone")).getNetworkOperatorName();
                                if (ZaloReceiver.f49208s == 2 || System.currentTimeMillis() - ZaloReceiver.f49209t > 2000) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("MAC_ADDRESS", "");
                                    jSONObject3.put("SSID", "");
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = "";
                                    }
                                    jSONObject3.put("NAME", str2);
                                    jSONObject3.put("MCC_MNC", str);
                                    jSONObject3.put("SUB_TYPE", subtype);
                                    if (!TextUtils.isEmpty(subtypeName)) {
                                        str6 = subtypeName;
                                    }
                                    jSONObject3.put("SUB_TYPE_NAME", str6);
                                    c23655l.f114659f[0] = jSONObject3.toString();
                                    c23655l.f114657d = 2;
                                }
                            }
                            str2 = "";
                            if (ZaloReceiver.f49208s == 2) {
                            }
                            JSONObject jSONObject32 = new JSONObject();
                            jSONObject32.put("MAC_ADDRESS", "");
                            jSONObject32.put("SSID", "");
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            jSONObject32.put("NAME", str2);
                            jSONObject32.put("MCC_MNC", str);
                            jSONObject32.put("SUB_TYPE", subtype);
                            if (!TextUtils.isEmpty(subtypeName)) {
                            }
                            jSONObject32.put("SUB_TYPE_NAME", str6);
                            c23655l.f114659f[0] = jSONObject32.toString();
                            c23655l.f114657d = 2;
                        }
                    }
                } else if (ZaloReceiver.f49208s != 0 || System.currentTimeMillis() - ZaloReceiver.f49209t > 2000) {
                    c23655l.f114659f[0] = String.format("{\"MAC_ADDRESS\":\"%s\", \"SSID\":\"%s\", \"NAME\":\"%s\"}", "", "", "");
                    c23655l.f114657d = 0;
                }
                i11 = c23655l.f114657d;
                if (i11 != -1) {
                    ZaloReceiver.f49208s = i11;
                    long currentTimeMillis = System.currentTimeMillis();
                    ZaloReceiver.f49209t = currentTimeMillis;
                    c23655l.f114656c = currentTimeMillis;
                    c23655l.f114654a = 1;
                    c23655l.f114655b = 4;
                    long m128305K = C24709a.m128299t(MainApplication.getAppContext()).m128305K(c23655l);
                    if (c23655l.f114657d != 0) {
                        ZaloReceiver.f49210u = m128305K;
                        if (C29628e.m147249E0().m147256G0() != null) {
                            ZaloReceiver.f49210u = -1L;
                            C24709a.m128299t(MainApplication.getAppContext()).m128308O(m128305K, C29628e.m147249E0().m147256G0());
                        }
                    } else {
                        ZaloReceiver.f49210u = -1L;
                    }
                }
            } catch (Exception e16) {
                AbstractC23350e.m122774d(ZaloReceiver.this.f49211q, e16.getMessage());
            }
        }
    }

    /* renamed from: com.zing.zalo.receiver.ZaloReceiver$b */
    /* loaded from: classes4.dex */
    class C9277b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Intent f49213a;

        C9277b(Intent intent) {
            this.f49213a = intent;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String stringExtra = this.f49213a.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            int m49677i = ZaloReceiver.this.m49677i(stringExtra);
            boolean booleanExtra = this.f49213a.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (booleanExtra) {
                m49677i++;
            }
            AbstractC20887g.m109246x(m49677i, System.currentTimeMillis());
            AbstractC20110a.m104542k(8, "User turn on/off (%b) notification channel (%s)", Boolean.valueOf(booleanExtra), stringExtra);
        }
    }

    /* renamed from: com.zing.zalo.receiver.ZaloReceiver$c */
    /* loaded from: classes4.dex */
    class C9278c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f49215a;

        C9278c(long j11) {
            this.f49215a = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC20110a.m104535d("update publicIP to log db: %s", C29628e.m147249E0().m147256G0());
                C24709a.m128299t(MainApplication.getAppContext()).m128308O(this.f49215a, C29628e.m147249E0().m147256G0());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.receiver.ZaloReceiver$d */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C9279d {

        /* renamed from: a */
        static final /* synthetic */ int[] f49217a;

        static {
            int[] iArr = new int[EnumC23747b0.values().length];
            f49217a = iArr;
            try {
                iArr[EnumC23747b0.f114867z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49217a[EnumC23747b0.f114854A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49217a[EnumC23747b0.f114856C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49217a[EnumC23747b0.f114860G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49217a[EnumC23747b0.f114857D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49217a[EnumC23747b0.f114858E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49217a[EnumC23747b0.f114859F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f49217a[EnumC23747b0.f114861H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f49217a[EnumC23747b0.f114855B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f49217a[EnumC23747b0.f114862I.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f49217a[EnumC23747b0.f114863J.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f49217a[EnumC23747b0.f114864K.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f49217a[EnumC23747b0.f114865L.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ZaloReceiver() {
        MainApplication.Companion.m35498a(null);
        C23744a.m124114c().m124115b(this, 73);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public int m49677i(String str) {
        EnumC23747b0 m124124c = EnumC23747b0.m124124c(str);
        if (m124124c == null) {
            return -1;
        }
        switch (C9279d.f49217a[m124124c.ordinal()]) {
            case 1:
                return 19050;
            case 2:
                return 19052;
            case 3:
                return 19056;
            case 4:
                return 19058;
            case 5:
                return 19060;
            case 6:
                return 19062;
            case 7:
                return 19064;
            case 8:
                return 19066;
            case 9:
                return 19054;
            case 10:
                return 19068;
            case 11:
                return 19070;
            case 12:
                return 19072;
            case 13:
                return 19074;
            default:
                return -1;
        }
    }

    /* renamed from: j */
    private void m49678j(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("file_path");
            if (!TextUtils.isEmpty(stringExtra) && !AbstractC23041d2.m118195B(stringExtra)) {
                AbstractC23152n3.m119036c0(MainApplication.getAppContext(), new C20556f(stringExtra));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f49211q, e11);
        }
    }

    /* renamed from: n */
    private void m49679n(Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m49680p() {
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m121738b1())) {
                return;
            }
            AbstractC23933a.m125291f();
            AbstractC23304d.m120551v();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f49211q, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m49681q() {
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m121738b1())) {
                return;
            }
            AbstractC23933a.m125291f();
            C28905e.m144373n().m144387f();
            AbstractC23304d.m120551v();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f49211q, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m49682r() {
        boolean z11 = true;
        try {
            if (AbstractC23309i.m120962G3(1) == 1) {
                C0809c1.m2050b(new C9276a());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(this.f49211q, e11.getMessage());
        }
        try {
            C30981a.m150598f().m150604c();
            AbstractC8998z.m48096c();
            AbstractC8998z.m48095b();
            if (C23055e5.m118271f()) {
                f49207r = System.currentTimeMillis();
                AbstractC29633j.m147365n();
                if (C29628e.m147249E0().m93373A()) {
                    AbstractC20110a.m104535d("native handle connection change!", new Object[0]);
                }
                AbstractC23306f.m120684l().m126156g();
            } else {
                f49207r = 0L;
                AbstractC29633j.m147369r();
                m49691w();
                AbstractC23351f.m122784a("CONNECTIVITY_CHANGE: FALSE", true);
                z11 = false;
            }
            C24574j.m127992c().m127997g();
            C20024r.m103947s(z11);
            ((C21216s) C21216s.Companion.m122672a()).m109860N();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m49683s() {
        try {
            if (C23055e5.m118271f()) {
                C31930g7.m153408g().m153412d();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m49684t(Context context) {
        try {
            if (!ZaloBackgroundService.m50458i(context)) {
                AbstractC28105j8.m141584f(context);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    private void m49685v(String str, String str2, String str3, String str4) {
        try {
            if (C28203u6.f131407a.m141809c(str) == null) {
                ContactProfile contactProfile = new ContactProfile(str);
                contactProfile.f42437s = str2;
                contactProfile.f42446v = str3;
            }
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 0).m95382r(str4).m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a));
            C28023b6.m141250h0().m141293J(str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f49211q, e11);
        }
    }

    @Override // com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(final Context context, Intent intent) {
        String action;
        if (CoreUtility.getAppContext() == null) {
            return;
        }
        if (intent != null) {
            try {
                action = intent.getAction();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onNonBlockingReceive:");
                sb2.append(action);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f49211q, e11);
                return;
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                AlarmReceiver.m49667e(context);
                C18403k.m97443p().m97460G(System.currentTimeMillis());
            } else {
                if (!"android.intent.action.PACKAGE_REPLACED".equals(action) && !"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("ACTION_PACKAGE_REMOVED:");
                        sb3.append(intent.getData());
                        intent.getExtras();
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: az.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloReceiver.this.m49680p();
                            }
                        });
                    } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("ACTION_PACKAGE_ADDED:");
                        sb4.append(intent.getData());
                        intent.getExtras();
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: az.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloReceiver.this.m49681q();
                            }
                        });
                    } else if ("com.zing.zalo.browser.action.DOWNLOAD_CANCEL".equals(action)) {
                        m49690u(context, intent);
                    } else if ("com.zing.zalo.browser.action.DOWNLOAD_OPEN".equals(action)) {
                        m49678j(intent);
                    } else if (!"android.provider.Telephony.SMS_RECEIVED".equals(action)) {
                        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: az.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloReceiver.this.m49682r();
                                }
                            });
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: az.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloReceiver.m49683s();
                                }
                            });
                        } else {
                            if (intent.getAction().equals("android.intent.action.AIRPLANE_MODE")) {
                                try {
                                    C30981a.m150598f().m150604c();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            } else if (intent.getAction().equals("com.zing.zalo.intent.action.DELETE_NOTIFICATION")) {
                                m49689o(intent);
                            } else if (intent.getAction().equals("com.zing.zalo.intent.action.DELETE_CHAT_BUBBLE")) {
                                m49679n(intent);
                            } else if (intent.getAction().equals("com.zing.zalo.intent.action.CALL_DELETE_NOTIFICATION")) {
                                m49686k(intent);
                            } else if (intent.getAction().equals("com.zing.zalo.intent.action.CALL_NOTIFICATION")) {
                                m49687l(intent);
                            } else if (intent.getAction().equals("m.voip.api.action.ACTION_NOTI_END_CALL")) {
                                AbstractC32273e3.m155748Q().m155891k0(intent);
                            } else if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                                String str = "";
                                if ("com.zing.zalo.intent.action.FINISH_COCOS_EFFECT".equals(action)) {
                                    if (C26664o.m136836a().m136838c()) {
                                        C26664o.m136836a().m136844i("");
                                        C23744a.m124114c().m124116d(14, new Object[0]);
                                    }
                                    AbstractC23279z3.m120287a(intent.getStringExtra("extra_effect_id"));
                                } else if ("com.zing.zalo.intent.action.ACTION_COCOS_INPUT_TEXT_CHANGED".equals(action)) {
                                    try {
                                        if (C26664o.m136836a().m136838c()) {
                                            String stringExtra = intent.getStringExtra("text");
                                            int intExtra = intent.getIntExtra("selection", 0);
                                            if (stringExtra != null && intExtra >= 0) {
                                                C23744a.m124114c().m124116d(13, stringExtra, Integer.valueOf(intExtra));
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e13.printStackTrace();
                                    }
                                } else if ("com.zing.zalo.intent.action.ACTION_COCOS_PROCESS_ACTION_LIST".equals(action)) {
                                    try {
                                        if (C26664o.m136836a().m136838c()) {
                                            String stringExtra2 = intent.getStringExtra("actionId");
                                            String stringExtra3 = intent.getStringExtra("actionData");
                                            if (stringExtra3 != null) {
                                                str = stringExtra3;
                                            }
                                            if (!TextUtils.isEmpty(stringExtra2)) {
                                                C23744a.m124114c().m124116d(15, stringExtra2, str);
                                            }
                                        }
                                    } catch (Exception e14) {
                                        e14.printStackTrace();
                                    }
                                } else if ("com.zing.zalo.intent.action.ACTION_DEMAND_WEARABLE".equals(action)) {
                                    try {
                                        String stringExtra4 = intent.getStringExtra("uidNotif");
                                        String stringExtra5 = intent.getStringExtra("dpnNotif");
                                        String stringExtra6 = intent.getStringExtra("avtNotif");
                                        String charSequence = C1347i1.m6751j(intent).getCharSequence("com.zing.zalo.intent.action.EXTRA_VOICE_REPLY_WEARABLE").toString();
                                        if (TextUtils.isEmpty(stringExtra4)) {
                                            return;
                                        } else {
                                            m49685v(stringExtra4, stringExtra5, stringExtra6, charSequence);
                                        }
                                    } catch (Exception e15) {
                                        e15.printStackTrace();
                                    }
                                } else if ("android.intent.action.PHONE_STATE".equals(action)) {
                                    C23450c.m123139k(context);
                                    C22626t m155737l = C32257b4.m155726m().m155737l();
                                    if (!AbstractC3106r.m15710c(context) && AbstractC32273e3.m155748Q().mo155791D0() && m155737l != null && m155737l.m117158s0()) {
                                        AbstractC32273e3.m155748Q().mo155893k2();
                                    }
                                } else if (action.equals("com.zing.zalo.intent.action.ACTION_CANCEL_BACKUP_RESTORE")) {
                                    m49688m();
                                } else if ("com.zing.zalo.intent.action.START_COCOS_EFFECT".equals(action)) {
                                    AbstractC23279z3.m120288b(intent.getStringExtra("extra_effect_id"), intent.getBooleanExtra("extra_is_play_active", false));
                                } else if (action.equals("com.zing.zalo.intent.action.ACTION_CANCEL_SUGGEST_PROFILE_NOTIFICATION")) {
                                    try {
                                        AbstractC23775p0.m124198c(intent.getStringExtra("notiType"), intent.getStringExtra("subType"));
                                    } catch (Exception e16) {
                                        e16.printStackTrace();
                                    }
                                } else if (action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                                    C0809c1.m2050b(new C9277b(intent));
                                } else {
                                    if (!action.equals("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_ACCEPT") && !action.equals("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_DISMISS")) {
                                        if (!"android.intent.action.MEDIA_EJECT".equals(action) && !"android.intent.action.MEDIA_MOUNTED".equals(action) && !"android.intent.action.MEDIA_REMOVED".equals(action) && !"android.intent.action.MEDIA_BAD_REMOVAL".equals(action)) {
                                            if ("android.intent.action.ACTION_QUICK_MARK_AS_READ".equals(action)) {
                                                String stringExtra7 = intent.getStringExtra("EXTRA_UID");
                                                if (!TextUtils.isEmpty(stringExtra7)) {
                                                    C18823a.f94109a.m98806a(stringExtra7);
                                                    AbstractC20887g.m109245w(120013);
                                                }
                                            } else if ("android.intent.action.QUICK_REPLY_MESSAGE_CAR".equals(action)) {
                                                AbstractC20887g.m109245w(120014);
                                                new C18824b().m98807a(intent);
                                            }
                                        }
                                        C20131e.f99303a.m104974t0();
                                        C20128b.m104754a();
                                    }
                                    C26263i.m135055u().m135065C(action, intent.getStringExtra("extra_req_sync_from_pc_name"), intent.getStringExtra("extra_req_sync_from_pc_session"), true);
                                    if (action.equals("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_ACCEPT")) {
                                        C26263i.m135055u().m135085r0(5);
                                    }
                                }
                            }
                            AbstractC23350e.m122776f(this.f49211q, e11);
                            return;
                        }
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ACTION_PACKAGE_REPLACED | ACTION_PACKAGE_CHANGED:");
                sb5.append(intent.getData());
                intent.getExtras();
            }
            if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state")) && C7853b.m40052a0().m40137k0()) {
                C7853b.m40052a0().m40136j1();
                C7853b.m40052a0().m40144o1();
            }
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: az.g
            @Override // java.lang.Runnable
            public final void run() {
                ZaloReceiver.m49684t(context);
            }
        });
    }

    /* renamed from: k */
    void m49686k(Intent intent) {
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("notiType");
                String stringExtra2 = intent.getStringExtra("subType");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C28023b6.m141250h0().m141320W(stringExtra, stringExtra2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: l */
    void m49687l(Intent intent) {
        int i11;
        int i12;
        try {
            AbstractC3096i0.m15552n();
            if (intent != null) {
                ContactProfile contactProfile = (ContactProfile) intent.getParcelableExtra("contactProfile");
                String stringExtra = intent.getStringExtra("notiType");
                String stringExtra2 = intent.getStringExtra("subType");
                boolean booleanExtra = intent.getBooleanExtra("callType", false);
                if (!TextUtils.isEmpty(stringExtra)) {
                    C28023b6.m141250h0().m141296K(stringExtra, stringExtra2);
                }
                if (AbstractC23165o5.m119333b()) {
                    Intent intent2 = new Intent(MainApplication.getAppContext(), (Class<?>) PasscodeActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("contactProfile", contactProfile);
                    bundle.putString("notiType", stringExtra);
                    bundle.putBoolean("callType", booleanExtra);
                    bundle.putInt("sourceType", intent.getIntExtra("sourceType", 0));
                    intent2.putExtras(bundle);
                    MainApplication.getAppContext().startActivity(intent2);
                    return;
                }
                if (contactProfile != null && !AbstractC23057e7.m118300g(MainApplication.getAppContext()) && C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                            C20024r.m103949w();
                            return;
                        } else {
                            ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                            return;
                        }
                    }
                    if (!booleanExtra) {
                        if (intent.hasExtra("sourceType")) {
                            i12 = intent.getIntExtra("sourceType", 0);
                        } else if (C28023b6.m141250h0().m141297K0(stringExtra)) {
                            AbstractC23647d.m123897g("1608602");
                            i12 = 11;
                        } else {
                            i12 = 9;
                        }
                        AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, i12));
                        return;
                    }
                    if (intent.hasExtra("sourceType")) {
                        i11 = intent.getIntExtra("sourceType", 0);
                    } else if (C28023b6.m141250h0().m141297K0(stringExtra)) {
                        AbstractC23647d.m123897g("1608602");
                        i11 = 12;
                    } else {
                        i11 = 10;
                    }
                    AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, true, i11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    void m49688m() {
        AbstractC23775p0.m124197b("db");
    }

    /* renamed from: o */
    void m49689o(Intent intent) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("msgId", -1);
                if (intExtra != -1) {
                    Map map = AbstractC23304d.f113409m;
                    if (map.containsKey(Integer.valueOf(intExtra))) {
                        map.remove(Integer.valueOf(intExtra));
                    }
                }
                C28023b6.q.m141409f(intExtra);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: u */
    void m49690u(Context context, Intent intent) {
        try {
            int intExtra = intent.getIntExtra("download_id", 0);
            if (intExtra != 0) {
                C16783a.m89629b().m89630a(intExtra);
                AbstractC23775p0.m124198c("other", "download_file_from_web_" + intExtra);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122775e(this.f49211q, "onCancelDownload", e11);
        }
    }

    /* renamed from: w */
    void m49691w() {
        Intent intent = new Intent();
        intent.setAction("com.zing.zalo.ui.MAUpdateLayoutConnection");
        MainApplication.getAppContext().sendBroadcast(intent);
        C23744a.m124114c().m124116d(6071, new Object[0]);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 73) {
            return;
        }
        try {
            C30983c m150606e = C30981a.m150598f().m150606e();
            C20020n.m103908m().m103915r(m150606e.f142944a);
            if (m150606e.f142944a == EnumC30982b.CONNECTED) {
                long j11 = f49210u;
                if (j11 > 0) {
                    f49210u = -1L;
                    if (C29628e.m147249E0().m147256G0() != null) {
                        C0809c1.m2050b(new C9278c(j11));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
