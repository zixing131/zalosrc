package me0;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.ExternalCallSplashActivity;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import p207he.C20024r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* renamed from: me0.o5 */
/* loaded from: classes.dex */
public abstract class AbstractC23165o5 {
    /* renamed from: b */
    public static boolean m119333b() {
        boolean z11 = true;
        if (AbstractC0924m0.m3743d7() != 1 || TextUtils.isEmpty(CoreUtility.f89233i)) {
            z11 = false;
        }
        if (z11 && TextUtils.isEmpty(AbstractC23309i.m121338Q9())) {
            AbstractC0924m0.m3555Wp(0);
            try {
                SharedPreferences.Editor edit = MainApplication.getAppContext().getSharedPreferences("Zalo", 0).edit();
                edit.remove("USE_PASS_CODE");
                edit.apply();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public static void m119335d() {
        AbstractC23304d.f113266D0 = false;
        AbstractC23304d.f113282H0 = false;
        AbstractC23304d.f113334U0 = false;
        AbstractC23304d.f113298L0 = "";
        AbstractC23304d.f113310O0 = 0L;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.n5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23309i.m122020ih();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0002, B:7:0x0012, B:9:0x0023, B:11:0x0027, B:13:0x002b, B:14:0x0046, B:16:0x0050, B:18:0x005e, B:19:0x0060, B:21:0x0064, B:27:0x0038, B:29:0x0041, B:32:0x006b, B:34:0x007a, B:36:0x0082, B:38:0x0086, B:40:0x008f, B:42:0x0095, B:44:0x00a9, B:45:0x00d2, B:47:0x00dc, B:49:0x00ea, B:53:0x00af, B:57:0x00c4, B:59:0x00cd, B:62:0x00f1, B:64:0x00f5, B:66:0x00fd, B:68:0x0101, B:70:0x0109, B:72:0x010f, B:74:0x0123, B:76:0x0127, B:78:0x0137, B:88:0x013e, B:90:0x014d, B:91:0x0153, B:93:0x015d, B:99:0x0179, B:101:0x0185, B:105:0x0191, B:107:0x01a0, B:110:0x01c0, B:112:0x01c4, B:113:0x01ff, B:115:0x01cc, B:117:0x01d0, B:119:0x01d8, B:121:0x01e9, B:123:0x01ed, B:125:0x01f1, B:126:0x01e1, B:127:0x01a4, B:130:0x01b5, B:132:0x01ba, B:138:0x0175, B:96:0x0161, B:98:0x016f), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c4 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0002, B:7:0x0012, B:9:0x0023, B:11:0x0027, B:13:0x002b, B:14:0x0046, B:16:0x0050, B:18:0x005e, B:19:0x0060, B:21:0x0064, B:27:0x0038, B:29:0x0041, B:32:0x006b, B:34:0x007a, B:36:0x0082, B:38:0x0086, B:40:0x008f, B:42:0x0095, B:44:0x00a9, B:45:0x00d2, B:47:0x00dc, B:49:0x00ea, B:53:0x00af, B:57:0x00c4, B:59:0x00cd, B:62:0x00f1, B:64:0x00f5, B:66:0x00fd, B:68:0x0101, B:70:0x0109, B:72:0x010f, B:74:0x0123, B:76:0x0127, B:78:0x0137, B:88:0x013e, B:90:0x014d, B:91:0x0153, B:93:0x015d, B:99:0x0179, B:101:0x0185, B:105:0x0191, B:107:0x01a0, B:110:0x01c0, B:112:0x01c4, B:113:0x01ff, B:115:0x01cc, B:117:0x01d0, B:119:0x01d8, B:121:0x01e9, B:123:0x01ed, B:125:0x01f1, B:126:0x01e1, B:127:0x01a4, B:130:0x01b5, B:132:0x01ba, B:138:0x0175, B:96:0x0161, B:98:0x016f), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0002, B:7:0x0012, B:9:0x0023, B:11:0x0027, B:13:0x002b, B:14:0x0046, B:16:0x0050, B:18:0x005e, B:19:0x0060, B:21:0x0064, B:27:0x0038, B:29:0x0041, B:32:0x006b, B:34:0x007a, B:36:0x0082, B:38:0x0086, B:40:0x008f, B:42:0x0095, B:44:0x00a9, B:45:0x00d2, B:47:0x00dc, B:49:0x00ea, B:53:0x00af, B:57:0x00c4, B:59:0x00cd, B:62:0x00f1, B:64:0x00f5, B:66:0x00fd, B:68:0x0101, B:70:0x0109, B:72:0x010f, B:74:0x0123, B:76:0x0127, B:78:0x0137, B:88:0x013e, B:90:0x014d, B:91:0x0153, B:93:0x015d, B:99:0x0179, B:101:0x0185, B:105:0x0191, B:107:0x01a0, B:110:0x01c0, B:112:0x01c4, B:113:0x01ff, B:115:0x01cc, B:117:0x01d0, B:119:0x01d8, B:121:0x01e9, B:123:0x01ed, B:125:0x01f1, B:126:0x01e1, B:127:0x01a4, B:130:0x01b5, B:132:0x01ba, B:138:0x0175, B:96:0x0161, B:98:0x016f), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0002, B:7:0x0012, B:9:0x0023, B:11:0x0027, B:13:0x002b, B:14:0x0046, B:16:0x0050, B:18:0x005e, B:19:0x0060, B:21:0x0064, B:27:0x0038, B:29:0x0041, B:32:0x006b, B:34:0x007a, B:36:0x0082, B:38:0x0086, B:40:0x008f, B:42:0x0095, B:44:0x00a9, B:45:0x00d2, B:47:0x00dc, B:49:0x00ea, B:53:0x00af, B:57:0x00c4, B:59:0x00cd, B:62:0x00f1, B:64:0x00f5, B:66:0x00fd, B:68:0x0101, B:70:0x0109, B:72:0x010f, B:74:0x0123, B:76:0x0127, B:78:0x0137, B:88:0x013e, B:90:0x014d, B:91:0x0153, B:93:0x015d, B:99:0x0179, B:101:0x0185, B:105:0x0191, B:107:0x01a0, B:110:0x01c0, B:112:0x01c4, B:113:0x01ff, B:115:0x01cc, B:117:0x01d0, B:119:0x01d8, B:121:0x01e9, B:123:0x01ed, B:125:0x01f1, B:126:0x01e1, B:127:0x01a4, B:130:0x01b5, B:132:0x01ba, B:138:0x0175, B:96:0x0161, B:98:0x016f), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119336e(int i11, Activity activity, String str) {
        boolean z11;
        String m119380e;
        boolean z12;
        String str2;
        boolean m119377b;
        PowerManager powerManager;
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        if (activity != null) {
            try {
                if (m119333b()) {
                    if (i11 == 1) {
                        AbstractC23304d.f113310O0 = AbstractC23309i.m122457u6();
                        long currentTimeMillis = System.currentTimeMillis() - AbstractC23304d.f113310O0;
                        if (AbstractC23304d.f113334U0 && AbstractC23304d.f113314P0 != 0) {
                            if (!AbstractC23304d.f113266D0) {
                                AbstractC23304d.f113266D0 = true;
                                AbstractC23309i.m121506Ut(true);
                            }
                        } else if (currentTimeMillis >= 0 && currentTimeMillis < AbstractC23309i.m122339r()) {
                            AbstractC23304d.f113266D0 = false;
                            AbstractC23309i.m121506Ut(false);
                        }
                        if (str.equals(ExternalCallSplashActivity.class.getName()) && "android.intent.action.VIEW".equals(activity.getIntent().getAction())) {
                            AbstractC23304d.f113266D0 = false;
                        }
                        if (AbstractC23304d.f113270E0) {
                            AbstractC23304d.f113266D0 = false;
                            return;
                        }
                        return;
                    }
                    if (i11 == 2) {
                        AbstractC23304d.f113302M0 = str;
                        AbstractC23309i.m122617yi(str);
                        AbstractC23304d.f113266D0 = AbstractC23309i.m122048j9();
                        if (AbstractC23304d.f113270E0 && !TextUtils.isEmpty(AbstractC23304d.f113278G0) && (activity instanceof ZaloActivity) && (mo35579p2 = ((ZaloActivity) activity).mo35579p()) != null && mo35579p2.m93012K0() != null && mo35579p2.m93012K0().getClass().getSimpleName().equals(AbstractC23304d.f113278G0)) {
                            AbstractC23304d.f113266D0 = false;
                            AbstractC23309i.m121506Ut(false);
                        } else {
                            AbstractC23304d.f113310O0 = AbstractC23309i.m122457u6();
                            long currentTimeMillis2 = System.currentTimeMillis() - AbstractC23304d.f113310O0;
                            if (!AbstractC23304d.f113334U0 && currentTimeMillis2 >= 0 && currentTimeMillis2 < AbstractC23309i.m122339r()) {
                                AbstractC23304d.f113266D0 = false;
                                AbstractC23309i.m121506Ut(false);
                            }
                        }
                        if (str.equals(ExternalCallSplashActivity.class.getName()) && "android.intent.action.VIEW".equals(activity.getIntent().getAction())) {
                            AbstractC23304d.f113266D0 = false;
                            return;
                        }
                        return;
                    }
                    if (i11 == 3) {
                        if (AbstractC23304d.f113270E0 && !TextUtils.isEmpty(AbstractC23304d.f113278G0) && (activity instanceof ZaloActivity) && (mo35579p = ((ZaloActivity) activity).mo35579p()) != null && mo35579p.m93012K0() != null && mo35579p.m93012K0().getClass().getSimpleName().equals(AbstractC23304d.f113278G0)) {
                            if (!AbstractC23304d.f113274F0) {
                                AbstractC23304d.f113270E0 = false;
                                AbstractC23304d.f113278G0 = "";
                                AbstractC23309i.m121845dw(false);
                                AbstractC23309i.m121898fA(AbstractC23304d.f113278G0);
                                return;
                            }
                            AbstractC23304d.f113274F0 = false;
                            return;
                        }
                        return;
                    }
                    if (i11 == 5) {
                        AbstractC23304d.f113298L0 = str;
                        AbstractC23309i.m122580xi(str);
                        if (AbstractC23304d.f113298L0.equals(AbstractC23304d.f113302M0)) {
                            AbstractC23304d.f113302M0 = AbstractC23309i.m122266p0();
                        }
                        if (AbstractC23304d.f113298L0.equals(AbstractC23304d.f113302M0) && !AbstractC23304d.f113266D0) {
                            try {
                                powerManager = (PowerManager) MainApplication.getAppContext().getSystemService("power");
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            if (powerManager != null) {
                                z11 = powerManager.isInteractive();
                                m119380e = AbstractC23174p3.m119380e();
                                if (!m119380e.equals("zm.voip.ui.incall.ZmInCallActivity") && !m119380e.equals("zm.voip.ui.incall.GroupCallActivity")) {
                                    z12 = false;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("ActivityTop: ");
                                    sb2.append(m119380e);
                                    if (!z12 || AbstractC23304d.f113314P0 == 0) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("isScreenOn: ");
                                        if (!z11) {
                                            str2 = "ON";
                                        } else {
                                            str2 = "OFF";
                                        }
                                        sb3.append(str2);
                                        if (z11) {
                                            m119377b = AbstractC23174p3.m119377b();
                                            if (AbstractC23304d.f113290J0) {
                                                AbstractC23304d.f113290J0 = false;
                                                AbstractC23304d.f113266D0 = false;
                                                AbstractC23309i.m121506Ut(false);
                                            } else {
                                                if (AbstractC23304d.f113314P0 != 0) {
                                                    if (AbstractC23304d.f113294K0 != C20024r.m103941j()) {
                                                        boolean z13 = !AbstractC23304d.f113294K0;
                                                        AbstractC23304d.f113294K0 = z13;
                                                        AbstractC23309i.m122595xx(z13);
                                                    }
                                                } else {
                                                    AbstractC23304d.f113294K0 = AbstractC23309i.m122090kc();
                                                }
                                                if (m119377b && !AbstractC23304d.f113286I0 && !AbstractC23304d.f113294K0) {
                                                    AbstractC23304d.f113266D0 = true;
                                                    AbstractC23309i.m121506Ut(true);
                                                    long currentTimeMillis3 = System.currentTimeMillis();
                                                    AbstractC23304d.f113310O0 = currentTimeMillis3;
                                                    AbstractC23309i.m121429Sq(currentTimeMillis3);
                                                }
                                            }
                                            AbstractC23304d.f113286I0 = false;
                                        }
                                    }
                                    m119377b = true;
                                    if (AbstractC23304d.f113290J0) {
                                    }
                                    AbstractC23304d.f113286I0 = false;
                                }
                                z12 = true;
                                StringBuilder sb22 = new StringBuilder();
                                sb22.append("ActivityTop: ");
                                sb22.append(m119380e);
                                if (!z12) {
                                }
                                StringBuilder sb32 = new StringBuilder();
                                sb32.append("isScreenOn: ");
                                if (!z11) {
                                }
                                sb32.append(str2);
                                if (z11) {
                                }
                                m119377b = true;
                                if (AbstractC23304d.f113290J0) {
                                }
                                AbstractC23304d.f113286I0 = false;
                            }
                            z11 = true;
                            m119380e = AbstractC23174p3.m119380e();
                            if (!m119380e.equals("zm.voip.ui.incall.ZmInCallActivity")) {
                                z12 = false;
                                StringBuilder sb222 = new StringBuilder();
                                sb222.append("ActivityTop: ");
                                sb222.append(m119380e);
                                if (!z12) {
                                }
                                StringBuilder sb322 = new StringBuilder();
                                sb322.append("isScreenOn: ");
                                if (!z11) {
                                }
                                sb322.append(str2);
                                if (z11) {
                                }
                                m119377b = true;
                                if (AbstractC23304d.f113290J0) {
                                }
                                AbstractC23304d.f113286I0 = false;
                            }
                            z12 = true;
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append("ActivityTop: ");
                            sb2222.append(m119380e);
                            if (!z12) {
                            }
                            StringBuilder sb3222 = new StringBuilder();
                            sb3222.append("isScreenOn: ");
                            if (!z11) {
                            }
                            sb3222.append(str2);
                            if (z11) {
                            }
                            m119377b = true;
                            if (AbstractC23304d.f113290J0) {
                            }
                            AbstractC23304d.f113286I0 = false;
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }
}
