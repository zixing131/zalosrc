package zm.voip.service;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import bf0.C2793a;
import bp0.AbstractC3079a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3106r;
import bp0.AbstractC3108t;
import bp0.C3084c0;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsErrorCode;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.plugin.IVoipZalo;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gp0.C19534b;
import gp0.C19540e;
import gp0.C19546h;
import gp0.C19548i;
import gp0.C19550j;
import gp0.C19552k;
import gp0.C19556m;
import gp0.C19561o0;
import gp0.C19564q;
import gp0.C19565q0;
import gp0.C19566r;
import gp0.C19568s;
import gp0.C19570t;
import gp0.C19572u;
import gu.AbstractC19601a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import je.C21228a;
import kotlinx.coroutines.flow.StateFlow;
import l50.C22080b;
import lo0.AbstractC22623r0;
import lo0.C22590b;
import lo0.C22592c;
import lo0.C22596e;
import lo0.C22600g;
import lo0.C22602h;
import lo0.C22604i;
import lo0.C22606j;
import lo0.C22608k;
import lo0.C22610l;
import lo0.C22611l0;
import lo0.C22612m;
import lo0.C22613m0;
import lo0.C22614n;
import lo0.C22615n0;
import lo0.C22616o;
import lo0.C22617o0;
import lo0.C22618p;
import lo0.C22619p0;
import lo0.C22620q;
import lo0.C22621q0;
import lo0.C22622r;
import lo0.C22624s;
import lo0.C22625s0;
import lo0.C22626t;
import lo0.C22627u;
import lo0.C22628v;
import lo0.C22629w;
import me0.AbstractC23041d2;
import me0.AbstractC23088h5;
import me0.AbstractC23095i1;
import me0.AbstractC23104j;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mo0.EnumC23410a;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.Constants;
import org.webrtc.EglBase;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.videofilter.ZVideoFilterManager;
import org.webrtc.videofilter.ZVideoFilterObserver;
import p097db.AbstractC17849h;
import p097db.C17843b;
import p097db.C17864w;
import p097db.EnumC17852k;
import p097db.EnumC17859r;
import p097db.EnumC17860s;
import p173fz.C19172a;
import p248iy.AbstractC20887g;
import p304ks.C21914b;
import p321le.C22453d;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p363nh.EnumC23747b0;
import p394oj.C24277c;
import p645xh.C29628e;
import p659xv.C30209h;
import qo0.C25443a;
import qo0.C25447g;
import qo0.C25448h;
import qo0.InterfaceC25444b;
import ro0.AbstractRunnableC25943g;
import ro0.AbstractRunnableC25946j;
import ro0.C25938b;
import ro0.C25940d;
import ro0.C25944h;
import ro0.C25945i;
import ro0.C25948l;
import th.AbstractC26681b;
import vg.C28203u6;
import zm.voip.service.C32296j1;

/* renamed from: zm.voip.service.j1 */
/* loaded from: classes7.dex */
public class C32296j1 extends AbstractC32273e3 {

    /* renamed from: A */
    private final Runnable f148969A;

    /* renamed from: B */
    private final Runnable f148970B;

    /* renamed from: C */
    private final Runnable f148971C;

    /* renamed from: D */
    ContactProfile f148972D;

    /* renamed from: E */
    C25940d f148973E;

    /* renamed from: F */
    int f148974F;

    /* renamed from: G */
    int f148975G;

    /* renamed from: H */
    int f148976H;

    /* renamed from: I */
    int f148977I;

    /* renamed from: J */
    long f148978J;

    /* renamed from: K */
    int f148979K;

    /* renamed from: L */
    int f148980L;

    /* renamed from: M */
    C25944h f148981M;

    /* renamed from: N */
    boolean f148982N;

    /* renamed from: O */
    int f148983O;

    /* renamed from: P */
    private int f148984P;

    /* renamed from: Q */
    private int f148985Q;

    /* renamed from: R */
    private int f148986R;

    /* renamed from: S */
    private int f148987S;

    /* renamed from: T */
    private int f148988T;

    /* renamed from: U */
    private boolean f148989U;

    /* renamed from: V */
    private ArrayList f148990V;

    /* renamed from: W */
    private final ArrayList f148991W;

    /* renamed from: X */
    long f148992X;

    /* renamed from: Y */
    C32284h f148993Y;

    /* renamed from: Z */
    C17864w f148994Z;

    /* renamed from: a0 */
    InterfaceC25444b f148995a0;

    /* renamed from: b0 */
    ZVideoFilterObserver f148996b0;

    /* renamed from: c0 */
    int f148997c0;

    /* renamed from: d0 */
    C25948l f148998d0;

    /* renamed from: e0 */
    private long f148999e0;

    /* renamed from: f0 */
    private final Runnable f149000f0;

    /* renamed from: g0 */
    private final Runnable f149001g0;

    /* renamed from: h0 */
    Runnable f149002h0;

    /* renamed from: i0 */
    Runnable f149003i0;

    /* renamed from: j0 */
    private Runnable f149004j0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$a */
    /* loaded from: classes7.dex */
    public class a extends Handler {

        /* renamed from: zm.voip.service.j1$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        class C33067a extends AbstractRunnableC25943g {
            C33067a() {
            }

            @Override // ro0.AbstractRunnableC25943g
            /* renamed from: a */
            protected void mo66462a() {
                C17843b.m94137o().m94150M(EnumC17852k.SEND_401_SUCCESS.ordinal());
            }
        }

        /* renamed from: zm.voip.service.j1$a$b */
        /* loaded from: classes7.dex */
        class b extends AbstractRunnableC25943g {
            b() {
            }

            @Override // ro0.AbstractRunnableC25943g
            /* renamed from: a */
            protected void mo66462a() {
                C17843b.m94137o().m94150M(EnumC17852k.SEND_402_SUCCESS.ordinal());
            }
        }

        a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m156133c(int i11) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "launchCallScreenWithTimeOuts");
            C32257b4.m155726m().m155741z(false);
            C32296j1.this.f148990V.clear();
            C22626t m155737l = C32257b4.m155726m().m155737l();
            m155737l.m117083Z0(1);
            m155737l.m117056Q0(true);
            m155737l.m117095c1(true);
            m155737l.m117087a1(C19561o0.m102161L().m102199F());
            m155737l.m117107f1(C8937j0.m47663l("call_video_call"));
            if (C32296j1.this.mo155861Z0(m155737l, true, i11)) {
                C19561o0.m102161L().m102283y1(C32296j1.this.f148902p);
            }
            ContactProfile contactProfile = C32296j1.this.f148972D;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && C32296j1.this.m155989H4()) {
                C32296j1 c32296j1 = C32296j1.this;
                c32296j1.m155863a0(c32296j1.f148972D.f42434r);
            }
            ContactProfile m141811g = C28203u6.f131407a.m141811g(C32296j1.this.f148972D.f42434r);
            if (m141811g != null && m141811g.m40368H0() != 0) {
                m155737l.m117091b1(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m156134d() {
            if (AbstractC3096i0.m15511R()) {
                C23744a.m124114c().m124116d(10035, new Object[0]);
            } else if (AbstractC26681b.f126360e && C32296j1.this.f148993Y != null && AbstractC3096i0.f13170n) {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "SEND ACTION_CALL_STOP_MINIVIEW");
                C32296j1.this.f148993Y.m155970r();
            }
            AbstractC3096i0.f13170n = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:150:0x060f  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x062b  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x063e  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            int i11;
            int i12 = message.what;
            switch (i12) {
                case -4160:
                    try {
                        C19561o0.m102161L().m102206I0(new C19568s(416, -4160, message.arg1, message.arg2));
                        return;
                    } catch (Exception e11) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOICE_REQUEST_CALL_ZRTP_FAILED failed: ", e11);
                        return;
                    }
                case -4090:
                    try {
                        Object obj = message.obj;
                        if (obj instanceof C25945i) {
                            C25945i c25945i = (C25945i) obj;
                            if (c25945i.m133679a() <= C32296j1.this.f148986R) {
                                C32296j1.this.m156008N5(c25945i.f123718a, c25945i.f123719b, c25945i.f123720c, c25945i.f123721d, c25945i.f123722e, c25945i.f123723f, c25945i.f123724g, c25945i, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return;
                    }
                case -4080:
                case 4080:
                    C19561o0.m102161L().m102206I0(new C19568s(408, message.what, message.arg1, message.arg2));
                    return;
                case -4070:
                case 4070:
                    C19561o0.m102161L().m102206I0(new C19568s(407, message.what, message.arg1, message.arg2));
                    return;
                case -4020:
                    C19561o0.m102161L().m102206I0(new C19568s(402, message.what, message.arg1, message.arg2));
                    return;
                case -4010:
                    int i13 = message.arg1;
                    int i14 = message.arg2;
                    if (C19561o0.m102161L().m102216O() != i14) {
                        return;
                    }
                    C32319o.m156293t().m156305T(3);
                    if (i13 > 0) {
                        if (i13 == 1) {
                            i11 = -1;
                        } else if (i13 == 9) {
                            i11 = -6;
                        } else if (i13 == 2 || i13 == 3 || i13 == 4) {
                            i11 = -2;
                        } else if (i13 == 6 || i13 == 7) {
                            i11 = -7;
                        } else if (i13 == 11) {
                            i11 = -14;
                        } else if (i13 == 12) {
                            i11 = -15;
                        } else if (i13 == 14) {
                            i11 = 115;
                        } else if (i13 == 15) {
                            i11 = 116;
                        }
                        if (i13 == 8) {
                            if (C23055e5.m118270e()) {
                                C32296j1.this.m155895l1(1, AbstractC8020f0.call_401_wifi_connect_error);
                            } else {
                                C32296j1.this.m155895l1(1, AbstractC8020f0.call_401_3g_connect_error);
                            }
                        }
                        C32296j1.this.mo116929a(i11, 4);
                        if (i13 != 8) {
                            Object obj2 = message.obj;
                            if (obj2 instanceof String) {
                                String str = (String) obj2;
                                if (TextUtils.isEmpty(str)) {
                                    return;
                                }
                                AbstractC3096i0.m15518U0(str);
                                return;
                            }
                            return;
                        }
                        if (i13 == 5 || i13 == 6 || i13 == 7 || i13 == 1 || i13 == 9 || i13 == 12 || i13 == 11) {
                            C22620q c22620q = (C22620q) message.obj;
                            if (c22620q != null) {
                                String str2 = c22620q.f110823V;
                                String str3 = c22620q.f110821T;
                                C32296j1.this.m156030U5(i14, str2, false, i13);
                                if (TextUtils.isEmpty(str3)) {
                                    return;
                                }
                                AbstractC3096i0.m15518U0(str3);
                                return;
                            }
                            return;
                        }
                        if (i13 == 2 || i13 == 4) {
                            C32296j1.this.m156030U5(i14, AbstractC22623r0.m117005b(AbstractC3096i0.m15574y(), 401, i13), false, i13);
                            return;
                        }
                        if (i13 == 14 || i13 == 15) {
                            C22620q c22620q2 = (C22620q) message.obj;
                            String str4 = c22620q2 != null ? c22620q2.f110821T : null;
                            if (TextUtils.isEmpty(str4)) {
                                return;
                            }
                            AbstractC3096i0.m15518U0(str4);
                            return;
                        }
                        return;
                    }
                    i11 = 0;
                    if (i13 == 8) {
                    }
                    C32296j1.this.mo116929a(i11, 4);
                    if (i13 != 8) {
                    }
                    break;
                case 402:
                    try {
                        C32296j1.this.m156077l4(message.arg1, (String) message.obj, message.arg2 == 1);
                        return;
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        return;
                    }
                case 403:
                    C32296j1.this.m156104x4(message.arg1, (String) message.obj);
                    return;
                case 405:
                    C32296j1.this.m156106y4(message.arg1, (String) message.obj, message.arg2 == 1);
                    return;
                case 407:
                    C22622r m15569v0 = AbstractC3096i0.m15569v0((String) message.obj, i12, true);
                    if (m15569v0 instanceof C22624s) {
                        C22624s c22624s = (C22624s) m15569v0;
                        if (c22624s.f110568h == 1) {
                            C32296j1.this.m156005M5(message.arg1, c22624s.f110563c, 407);
                        }
                        C19561o0.m102161L().m102206I0(new C19570t(0, message.arg1, c22624s.f110563c, c22624s.f110868k));
                        return;
                    }
                    return;
                case 408:
                    C22622r m15569v02 = AbstractC3096i0.m15569v0((String) message.obj, i12, true);
                    if (m15569v02 instanceof C22590b) {
                        C22590b c22590b = (C22590b) m15569v02;
                        if (c22590b.f110568h == 1) {
                            C32296j1.this.m156005M5(message.arg1, C19561o0.m102161L().m102190B(), 408);
                        }
                        C19561o0.m102161L().m102206I0(new C19568s(408, 0, message.arg1, c22590b.f110563c));
                        C32296j1 c32296j1 = C32296j1.this;
                        c32296j1.f148897k.removeCallbacks(c32296j1.f149003i0);
                        C32296j1 c32296j12 = C32296j1.this;
                        c32296j12.f148897k.postDelayed(c32296j12.f149003i0, c32296j12.f148980L);
                        return;
                    }
                    return;
                case 409:
                    C22622r m15569v03 = AbstractC3096i0.m15569v0((String) message.obj, i12, true);
                    if (m15569v03 instanceof C22590b) {
                        C22590b c22590b2 = (C22590b) m15569v03;
                        if (c22590b2.f110568h == 1) {
                            C32296j1.this.m156005M5(message.arg1, c22590b2.f110563c, 409);
                        }
                        C19561o0.m102161L().m102208J0(new C19550j(409, 0, message.arg1, c22590b2.f110563c, c22590b2.f110566f), true);
                        return;
                    }
                    return;
                case 411:
                case 413:
                    if (C19561o0.m102161L().m102253g0()) {
                        C22622r m15569v04 = AbstractC3096i0.m15569v0((String) message.obj, message.what, true);
                        if (m15569v04 instanceof C22590b) {
                            C19561o0.m102161L().m102206I0(new C19568s(message.what, 0, message.arg1, ((C22590b) m15569v04).f110563c));
                            return;
                        }
                        return;
                    }
                    return;
                case 412:
                    C32296j1.this.m156099v5(message.arg1, message.obj.toString());
                    return;
                case 415:
                    C22622r m15569v05 = AbstractC3096i0.m15569v0((String) message.obj, i12, true);
                    if (m15569v05 instanceof C22590b) {
                        C22590b c22590b3 = (C22590b) m15569v05;
                        C19561o0.m102161L().m102206I0(new C19568s(415, c22590b3.f110566f, message.arg1, c22590b3.f110563c));
                        return;
                    }
                    return;
                case 418:
                case 419:
                    C32296j1.this.m156108z4(message.arg1, (String) message.obj, i12 == 419);
                    return;
                case 421:
                    C32296j1.this.m156094t4(message.arg1, (String) message.obj);
                    return;
                case 426:
                    try {
                        if (C32296j1.this.m155830N0()) {
                            C32296j1.this.m156091s4((String) message.obj, message.arg1, message.arg2 == 1);
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("typeCall", 3);
                        Message message2 = new Message();
                        message2.copyFrom(message);
                        hashMap.put("msg", message2);
                        C32296j1.this.m155939y0(hashMap);
                        return;
                    } catch (Exception e14) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOICE_INCOMING_PRE_CALL failed: ", e14);
                        return;
                    }
                case 427:
                    C32296j1.this.m156089r4((String) message.obj, message.arg1);
                    return;
                case 428:
                    try {
                        if (C32296j1.this.m155830N0()) {
                            C32296j1.this.m156098v4(Integer.parseInt(AbstractC23304d.f113368c0.f42434r), message.arg1, (String) message.obj, message.arg2 == 1);
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("typeCall", 4);
                        Message message3 = new Message();
                        message3.copyFrom(message);
                        hashMap2.put("msg", message3);
                        C32296j1.this.m155939y0(hashMap2);
                        return;
                    } catch (Exception e15) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOIP_PRE_INCOMING failed: ", e15);
                        return;
                    }
                case 432:
                    C32296j1.this.m156092s5(message.arg1, (String) message.obj);
                    return;
                case 440:
                    try {
                        int i15 = message.arg1;
                        if (C19561o0.m102161L().m102216O() != i15) {
                            return;
                        }
                        C32296j1.this.m156101w4(i15, (String) message.obj);
                        return;
                    } catch (Exception e16) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOIP_REQUEST_NEW_SERVER failed: ", e16);
                        return;
                    }
                case 441:
                    try {
                        int i16 = message.arg1;
                        if (C19561o0.m102161L().m102216O() != i16) {
                            return;
                        }
                        C32296j1.this.m156087q4(i16, (String) message.obj);
                        return;
                    } catch (Exception e17) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOIP_ANSWER_NEW_SERVER failed: ", e17);
                        return;
                    }
                case 443:
                    C32296j1.this.m156096u4(message.arg1, (String) message.obj);
                    return;
                case 444:
                    C32296j1.this.m156127u5(message.arg1, (String) message.obj);
                    return;
                case 447:
                    C32296j1.this.m156102w5(message.arg1, (String) message.obj);
                    return;
                case 448:
                    C32296j1.this.m156126t5(message.arg1, (String) message.obj);
                    return;
                case 449:
                    C32296j1.this.m156128x5(message.arg1, (String) message.obj);
                    return;
                case 1000:
                    final int i17 = message.arg1;
                    AbstractC19444a.m101695c(new Runnable() { // from class: zm.voip.service.h1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.a.this.m156133c(i17);
                        }
                    });
                    return;
                case 1004:
                    int i18 = message.arg1;
                    int i19 = message.arg2;
                    C32296j1.this.m156020R5(i19, ((Boolean) message.obj).booleanValue() ? 3 : 1, C19561o0.m102161L().m102190B(), C19561o0.m102161L().m102212M(), C19561o0.m102161L().m102222R(), C19561o0.m102161L().m102205I(), C19561o0.m102161L().m102218P(i18, i19));
                    return;
                case 1005:
                    try {
                        ContactProfile contactProfile = new ContactProfile(new JSONObject((String) message.obj));
                        if (C32296j1.this.f148972D.f42434r.equalsIgnoreCase(contactProfile.f42434r) && C32296j1.this.m155989H4()) {
                            C32296j1 c32296j13 = C32296j1.this;
                            c32296j13.f148972D = contactProfile;
                            c32296j13.mo155801F2(C32257b4.m155726m().m155737l());
                            C32296j1.this.mo155898m1();
                            return;
                        }
                        return;
                    } catch (Exception e18) {
                        e18.printStackTrace();
                        return;
                    }
                case 1006:
                    try {
                        C32296j1.this.mo155909q0(3 == message.arg1);
                        return;
                    } catch (Exception e19) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOICE_REQUEST_CALL_RETRY failed: ", e19);
                        return;
                    }
                case 1007:
                    try {
                        boolean booleanValue = ((Boolean) message.obj).booleanValue();
                        C22626t m155737l = C32257b4.m155726m().m155737l();
                        if (m155737l == null) {
                            return;
                        }
                        if (booleanValue) {
                            if (m155737l.m117114h0()) {
                                return;
                            }
                            C32296j1.this.mo155855W().f123738c = true;
                            C32296j1.this.mo155781A2("offScreen", 3);
                            return;
                        }
                        if (m155737l.m117114h0() && C32296j1.this.mo155855W().f123738c) {
                            C32296j1.this.mo155785B2("onScreen", 6);
                            m155737l.m117015C1(System.currentTimeMillis());
                        }
                        C32296j1.this.mo155855W().f123738c = false;
                        return;
                    } catch (Exception e21) {
                        e21.printStackTrace();
                        return;
                    }
                case ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4 /* 2001 */:
                    if (AbstractC26681b.f126360e && AbstractC3096i0.m15538g() && C32296j1.this.f148993Y != null) {
                        C22626t m155737l2 = C32257b4.m155726m().m155737l();
                        if (C32296j1.this.m155851U() != null && m155737l2.m117044M0() && AbstractC3096i0.m15513S()) {
                            AbstractC3096i0.f13170n = true;
                            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "SEND ACTION_CALL_START_MINIVIEW");
                            AbstractC3096i0.f13171o = true;
                            C32296j1.this.f148993Y.m155969q();
                            return;
                        }
                        return;
                    }
                    return;
                case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP /* 2002 */:
                    C32296j1.this.f148897k.removeMessages(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
                    C32296j1.this.m155827M1(new Runnable() { // from class: zm.voip.service.i1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.a.this.m156134d();
                        }
                    });
                    return;
                case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE /* 2003 */:
                    C32296j1.this.m156121n5();
                    return;
                case 4010:
                    int i21 = message.arg1;
                    C22620q c22620q3 = (C22620q) message.obj;
                    if (i21 != 3) {
                        AbstractC3079a.m15406a("VOIP_CONTROLLER", "Using old protocol. Hangup");
                        C32296j1.this.mo116929a(-1, 3);
                        return;
                    }
                    long m102216O = C19561o0.m102161L().m102216O();
                    int i22 = c22620q3.f110818Q;
                    if (i22 == 0) {
                        i22 = C19561o0.m102161L().m102190B();
                    }
                    if (C19561o0.m102161L().m102216O() == -1) {
                        AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Invalid peer Zalo Id!!!");
                        return;
                    }
                    if (m102216O != c22620q3.f110819R) {
                        AbstractC3082b0.m15422d("VOIP_CONTROLLER", "mPeerZaloId is different than in response event");
                        return;
                    }
                    if (C19561o0.m102161L().m102190B() != i22) {
                        AbstractC3082b0.m15422d("VOIP_CONTROLLER", "mCallId is different than in response event");
                        return;
                    }
                    HandlerC32324p.m156351d(new C33067a());
                    Constants.forceEgl10 = c22620q3.f110560z;
                    C32296j1 c32296j14 = C32296j1.this;
                    c32296j14.f148898l = c22620q3.f110552r;
                    c32296j14.f148982N = c22620q3.f110553s;
                    c32296j14.f148984P = c22620q3.f110554t;
                    C32296j1.this.f148985Q = c22620q3.f110555u;
                    C32296j1.this.f148986R = c22620q3.f110556v;
                    C32296j1.this.f148987S = c22620q3.f110557w;
                    C32296j1.this.f148988T = c22620q3.f110558x;
                    C32296j1 c32296j15 = C32296j1.this;
                    c32296j15.f148978J = c22620q3.f110559y;
                    c32296j15.f148909w = c22620q3.f110827Z;
                    c32296j15.f148910x = c22620q3.f110828a0;
                    c32296j15.f148983O = c22620q3.f110521A;
                    c32296j15.f148973E = c22620q3.f110536P;
                    c32296j15.m155871c2(c22620q3.f110522B);
                    C19561o0.m102161L().m102262k1(c22620q3.f110546l);
                    C19561o0.m102161L().m102268n1(c22620q3.f110531K == 1);
                    C19561o0.m102161L().m102273r1(c22620q3.f110525E);
                    C19561o0.m102161L().m102229U0(c22620q3.f110530J);
                    C19561o0.m102161L().m102270o1(c22620q3.f110524D);
                    C19561o0.m102161L().m102271p1(System.nanoTime());
                    C32296j1.this.f148981M = C25944h.m133678b(c22620q3);
                    C19561o0.m102161L().m102206I0(new C19564q(401, i22, c22620q3, AbstractC3103o.m15621j(c22620q3.f110528H, c22620q3.f110526F, c22620q3.f110527G)));
                    return;
                case 4020:
                    try {
                        int i23 = message.arg1;
                        if (i23 == 0) {
                            if (message.arg2 == C19561o0.m102161L().m102190B()) {
                                HandlerC32324p.m156351d(new b());
                            }
                        } else if (i23 == 1) {
                            C22626t c22626t = (C22626t) message.obj;
                            C19561o0.m102161L().m102236Y0("");
                            C32296j1.this.mo155858X1(new C22621q0(c22626t));
                        }
                        return;
                    } catch (Exception e22) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOICE_REQUEST_ANSWER_SENT failed: ", e22);
                        return;
                    }
                case 4021:
                    Object obj3 = message.obj;
                    if (obj3 instanceof C22618p) {
                        C32296j1.this.m155972A4(message.arg1, message.arg2, (C22618p) obj3);
                        return;
                    }
                    return;
                case 4110:
                case 4130:
                    if (C19561o0.m102161L().m102253g0()) {
                        C19561o0.m102161L().m102204H0(new C19548i(message.what == 4110 ? 411 : 413));
                        return;
                    }
                    return;
                case 4160:
                    try {
                        C19561o0.m102161L().m102206I0(new C19568s(416, 4160, message.arg1, message.arg2, ((Integer) message.obj).intValue(), 0));
                        return;
                    } catch (Exception e23) {
                        AbstractC3082b0.m15423e("VOIP_CONTROLLER", "VOICE_REQUEST_CALL_ZRTP_SENT failed: ", e23);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: zm.voip.service.j1$a0 */
    /* loaded from: classes7.dex */
    class a0 implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149008a;

        a0(long j11) {
            this.f149008a = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipAnswerPreCall complete with value = " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipAnswerPreCall failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149008a));
        }
    }

    /* renamed from: zm.voip.service.j1$b */
    /* loaded from: classes7.dex */
    class b implements IVoipServiceRequestCallback {
        b() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
        }
    }

    /* renamed from: zm.voip.service.j1$b0 */
    /* loaded from: classes7.dex */
    class b0 implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149011a;

        b0(long j11) {
            this.f149011a = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipDataToPartner complete with value = " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipDataToPartner failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149011a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$c */
    /* loaded from: classes7.dex */
    public class c implements IVoipServiceRequestCallback {
        c() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
        }
    }

    /* renamed from: zm.voip.service.j1$c0 */
    /* loaded from: classes7.dex */
    class c0 implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149014a;

        c0(long j11) {
            this.f149014a = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendCalleeRequestNewServer complete with value = " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendCalleeRequestNewServer failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149014a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$d */
    /* loaded from: classes7.dex */
    public class d implements IVoipServiceRequestCallback {

        /* renamed from: zm.voip.service.j1$d$a */
        /* loaded from: classes7.dex */
        class a extends AbstractRunnableC25943g {
            a() {
            }

            @Override // ro0.AbstractRunnableC25943g
            /* renamed from: a */
            protected void mo66462a() {
                C17843b.m94137o().m94150M(EnumC17852k.SEND_415_SUCCESS.ordinal());
            }
        }

        d() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            HandlerC32324p.m156351d(new a());
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
        }
    }

    /* renamed from: zm.voip.service.j1$d0 */
    /* loaded from: classes7.dex */
    class d0 implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149018a;

        d0(long j11) {
            this.f149018a = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendCallerAnswerNewServer complete with value = " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendCallerAnswerNewServer failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149018a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$e */
    /* loaded from: classes7.dex */
    public class e extends AbstractRunnableC25943g {
        e() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_415.ordinal());
        }
    }

    /* renamed from: zm.voip.service.j1$e0 */
    /* loaded from: classes7.dex */
    class e0 extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ int f149021p;

        e0(int i11) {
            this.f149021p = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94146I(this.f149021p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$f */
    /* loaded from: classes7.dex */
    public class f implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149023a;

        /* renamed from: b */
        final /* synthetic */ int f149024b;

        /* renamed from: c */
        final /* synthetic */ int f149025c;

        /* renamed from: d */
        final /* synthetic */ int f149026d;

        f(long j11, int i11, int i12, int i13) {
            this.f149023a = j11;
            this.f149024b = i11;
            this.f149025c = i12;
            this.f149026d = i13;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 401, false);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceRequestCall complete with value = " + str);
            if (m15569v0 instanceof C22620q) {
                C22620q c22620q = (C22620q) m15569v0;
                long currentTimeMillis = System.currentTimeMillis() - this.f149023a;
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestCall time = " + currentTimeMillis + "  complete with status = " + c22620q.f110820S);
                C32296j1 c32296j1 = C32296j1.this;
                c32296j1.f148980L = c22620q.f110825X * 1000;
                Message obtainMessage = c32296j1.f148897k.obtainMessage(0, null);
                int i11 = c22620q.f110820S;
                if (i11 != 0 && i11 != 3 && i11 != 4) {
                    obtainMessage.what = -4010;
                    obtainMessage.arg1 = i11;
                    obtainMessage.arg2 = this.f149024b;
                    obtainMessage.obj = c22620q;
                    C32296j1.this.f148897k.sendMessageDelayed(obtainMessage, 1500L);
                    return;
                }
                obtainMessage.what = 4010;
                obtainMessage.arg1 = c22620q.f110822U;
                obtainMessage.arg2 = ((int) currentTimeMillis) / 1000;
                obtainMessage.obj = c22620q;
                C32296j1.this.f148897k.sendMessage(obtainMessage);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149023a;
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "voiceRequestCall failed: " + str + " , time = " + currentTimeMillis);
            if (C32296j1.this.mo155799F0() && C19561o0.m102161L().m102190B() == this.f149025c) {
                C32296j1 c32296j1 = C32296j1.this;
                int i11 = c32296j1.f148997c0;
                if (i11 < 1) {
                    c32296j1.f148997c0 = i11 + 1;
                    Message obtainMessage = c32296j1.f148897k.obtainMessage(1006, this.f149026d, 0);
                    long j11 = 3000 - currentTimeMillis;
                    Handler handler = C32296j1.this.f148897k;
                    if (j11 <= 0) {
                        j11 = 0;
                    }
                    handler.sendMessageDelayed(obtainMessage, j11);
                    return;
                }
                C32296j1.this.f148897k.sendMessage(c32296j1.f148897k.obtainMessage(-4010, 8, this.f149024b, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$f0 */
    /* loaded from: classes7.dex */
    public class f0 implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ C22626t f149028a;

        f0(C22626t c22626t) {
            this.f149028a = c22626t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m156136b(C22617o0 c22617o0, C22626t c22626t) {
            C17843b.m94137o().m94192o0(true, c22617o0.f110775h);
            C17843b.m94137o().m94179h0(0, 12);
            if (!c22626t.m117085a()) {
                AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C32296j1 c32296j1 = C32296j1.this;
            c32296j1.f148897k.removeCallbacks(c32296j1.f149001g0);
            C32296j1.this.f148989U = false;
            if (!C19561o0.m102161L().m102253g0() || !this.f149028a.m117041L0()) {
                return;
            }
            C32296j1.this.m156129y5(EnumC23410a.f113740D.ordinal(), true);
            this.f149028a.m117120i2(false);
            final C22617o0 c22617o0 = (C22617o0) AbstractC3096i0.m15569v0(str, 412, false);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send switchAudioToVideoCall successfully with retCode = " + c22617o0.f110866a);
            if (c22617o0.f110777j == 0) {
                if (this.f149028a.m117038K0()) {
                    C23744a.m124114c().m124116d(10027, 8);
                    C32296j1.this.m155996J5();
                    C32318n3.m156214E().m156257R();
                    return;
                } else {
                    if (this.f149028a.m117047N0()) {
                        C32318n3.m156214E().m156257R();
                        return;
                    }
                    this.f149028a.m117087a1(1);
                    C23744a.m124114c().m124116d(10027, 1);
                    final C22626t c22626t = this.f149028a;
                    HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.m1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.f0.m156136b(C22617o0.this, c22626t);
                        }
                    });
                    C32296j1.this.m155996J5();
                    C32318n3.m156214E().m156257R();
                    return;
                }
            }
            if (this.f149028a.m117047N0()) {
                C32296j1.this.m155996J5();
            } else if (TextUtils.isEmpty(c22617o0.f110779l)) {
                C23744a.m124114c().m124116d(10027, 4);
            } else {
                C23744a.m124114c().m124116d(10027, 3, c22617o0.f110779l);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send switchAudioToVideoCall error with msg = " + str + " with retry " + C32296j1.this.f148989U);
            if (!C19561o0.m102161L().m102253g0()) {
                C32296j1.this.f148989U = false;
                C32296j1 c32296j1 = C32296j1.this;
                c32296j1.f148897k.removeCallbacks(c32296j1.f149001g0);
                this.f149028a.m117120i2(false);
                C32296j1.this.m156129y5(EnumC23410a.f113740D.ordinal(), true);
                return;
            }
            if (this.f149028a.m117047N0()) {
                C32296j1.this.m155996J5();
                C32296j1.this.f148989U = false;
                C32296j1 c32296j12 = C32296j1.this;
                c32296j12.f148897k.removeCallbacks(c32296j12.f149001g0);
                this.f149028a.m117120i2(false);
                C32296j1.this.m156129y5(EnumC23410a.f113740D.ordinal(), true);
                return;
            }
            if (C32296j1.this.f148989U && C19561o0.m102161L().m102253g0()) {
                C32296j1 c32296j13 = C32296j1.this;
                c32296j13.f148897k.postDelayed(c32296j13.f149000f0, 1000L);
                return;
            }
            C23744a.m124114c().m124116d(10027, 2);
            C32296j1.this.f148989U = false;
            C32296j1 c32296j14 = C32296j1.this;
            c32296j14.f148897k.removeCallbacks(c32296j14.f149001g0);
            this.f149028a.m117120i2(false);
            C32296j1.this.m156129y5(EnumC23410a.f113740D.ordinal(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$g */
    /* loaded from: classes7.dex */
    public class g extends AbstractRunnableC25943g {
        g() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_401.ordinal());
        }
    }

    /* renamed from: zm.voip.service.j1$g0 */
    /* loaded from: classes7.dex */
    class g0 extends AbstractRunnableC25946j {
        g0() {
        }

        @Override // ro0.AbstractRunnableC25946j
        /* renamed from: a */
        protected Object mo133681a() {
            long m102216O = C19561o0.m102161L().m102216O();
            C32296j1.this.m156014P5((int) m102216O, C19561o0.m102161L().m102190B(), 0);
            return 0;
        }
    }

    /* renamed from: zm.voip.service.j1$h */
    /* loaded from: classes7.dex */
    class h implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149032a;

        /* renamed from: b */
        final /* synthetic */ int f149033b;

        /* renamed from: c */
        final /* synthetic */ long f149034c;

        h(int i11, int i12, long j11) {
            this.f149032a = i11;
            this.f149033b = i12;
            this.f149034c = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "voiceRequestCallZRTP successfully");
            int i11 = 0;
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
                if (optJSONObject != null && optJSONObject.has("status")) {
                    i11 = optJSONObject.optInt("status");
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C32296j1.this.f148897k.sendMessage(C32296j1.this.f148897k.obtainMessage(4160, this.f149032a, this.f149033b, Integer.valueOf(i11)));
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = C32296j1.this.f148978J - (System.currentTimeMillis() - this.f149034c);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Send voiceRequestCallZRTP error with msg = " + str + " , timeDelay = " + currentTimeMillis);
            C32296j1.this.f148897k.sendMessageDelayed(C32296j1.this.f148897k.obtainMessage(-4160, this.f149032a, this.f149033b), currentTimeMillis);
        }
    }

    /* renamed from: zm.voip.service.j1$h0 */
    /* loaded from: classes7.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C32296j1 c32296j1 = C32296j1.this;
            c32296j1.f148897k.removeCallbacks(c32296j1.f149002h0);
            if (!C19561o0.m102161L().m102253g0()) {
                return;
            }
            C32296j1.this.mo155919t(false);
            C23744a.m124114c().m124116d(10027, 7);
        }
    }

    /* renamed from: zm.voip.service.j1$i */
    /* loaded from: classes7.dex */
    class i extends AbstractRunnableC25943g {
        i() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_416.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$i0 */
    /* loaded from: classes7.dex */
    public class i0 implements IVoipServiceRequestCallback {
        i0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send voicePing successfully with retCode = " + AbstractC3096i0.m15569v0(str, 445, false).f110866a);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voicePing error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$j */
    /* loaded from: classes7.dex */
    public class j implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149039a;

        /* renamed from: b */
        final /* synthetic */ int f149040b;

        /* renamed from: c */
        final /* synthetic */ int f149041c;

        /* renamed from: d */
        final /* synthetic */ int f149042d;

        /* renamed from: e */
        final /* synthetic */ long f149043e;

        j(int i11, int i12, int i13, int i14, long j11) {
            this.f149039a = i11;
            this.f149040b = i12;
            this.f149041c = i13;
            this.f149042d = i14;
            this.f149043e = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m156138b(int i11, int i12, C22618p c22618p) {
            C19561o0.m102161L().m102206I0(new C19572u(4020, i11, i12, -1, c22618p.f110785V));
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 402, true);
            if (m15569v0 != null) {
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestAnswer complete status = " + m15569v0.f110866a);
                if (AbstractC3096i0.m15544j(m15569v0)) {
                    if (m15569v0 instanceof C22618p) {
                        final C22618p c22618p = (C22618p) m15569v0;
                        if (c22618p.f110784U == -1) {
                            Handler handler = C32296j1.this.f148897k;
                            final int i11 = this.f149039a;
                            final int i12 = this.f149040b;
                            handler.post(new Runnable() { // from class: zm.voip.service.k1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C32296j1.j.m156138b(i11, i12, c22618p);
                                }
                            });
                            return;
                        }
                        Message obtainMessage = C32296j1.this.f148897k.obtainMessage(4020, this.f149041c, 0);
                        if (this.f149041c == 1) {
                            C22626t m102196D0 = C19561o0.m102161L().m102196D0();
                            m102196D0.m117140n2(this.f149040b);
                            m102196D0.m117060R1(this.f149039a);
                            m102196D0.m117095c1(false);
                            int i13 = this.f149042d;
                            if (i13 <= 0) {
                                i13 = 155;
                            }
                            m102196D0.m117180z1(i13);
                            obtainMessage.obj = m102196D0;
                        }
                        C32296j1.this.f148897k.sendMessage(obtainMessage);
                        return;
                    }
                    return;
                }
                int i14 = this.f149041c;
                if (i14 != 6) {
                    C32296j1.this.f148897k.sendMessage(C32296j1.this.f148897k.obtainMessage(-4020, this.f149039a, this.f149040b, Integer.valueOf(i14)));
                }
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = C32296j1.this.f148978J - (System.currentTimeMillis() - this.f149043e);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceRequestAnswer error with msg = " + str + " , timeDelay = " + currentTimeMillis);
            C32296j1.this.f148897k.sendMessageDelayed(C32296j1.this.f148897k.obtainMessage(-4020, this.f149039a, this.f149040b, str), currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$j0 */
    /* loaded from: classes7.dex */
    public class j0 implements IVoipServiceRequestCallback {
        j0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendSticker onRequestComplete " + str);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendSticker onRequestComplete " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$k */
    /* loaded from: classes7.dex */
    public class k extends AbstractRunnableC25943g {
        k() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_402.ordinal());
        }
    }

    /* renamed from: zm.voip.service.j1$k0 */
    /* loaded from: classes7.dex */
    class k0 implements InterfaceC20094a {
        k0() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "getStickerTopics onRequestComplete " + c20096c.m104492d());
            C23744a.m124114c().m124116d(10030, Integer.valueOf(c20096c.m104491c()));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "getStickerTopics onRequestComplete " + obj.toString());
                JSONObject jSONObject = new JSONObject(obj.toString());
                if (jSONObject.has("data") && !jSONObject.isNull("data")) {
                    C32296j1.this.f148990V = new ArrayList();
                    JSONArray jSONArray = new JSONArray(jSONObject.optJSONObject("data").optString("key_words"));
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        C32296j1.this.f148990V.add(AbstractC3096i0.m15555o0(jSONArray.getJSONObject(i11).toString()));
                    }
                    C23744a.m124114c().m124116d(10030, new Object[0]);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zm.voip.service.j1$l */
    /* loaded from: classes7.dex */
    class l implements IVoipServiceRequestCallback {
        l() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send voiceCallCancel successfully");
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceCallCancel error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$l0 */
    /* loaded from: classes7.dex */
    public class l0 implements IVoipServiceRequestCallback {
        l0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendDeviceErrorState onRequestComplete " + str);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendDeviceErrorState onRequestComplete " + str);
        }
    }

    /* renamed from: zm.voip.service.j1$m */
    /* loaded from: classes7.dex */
    class m implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149050a;

        /* renamed from: b */
        final /* synthetic */ int f149051b;

        /* renamed from: c */
        final /* synthetic */ long f149052c;

        m(int i11, int i12, long j11) {
            this.f149050a = i11;
            this.f149051b = i12;
            this.f149052c = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 407, false);
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Send voiceCallRinging successfully with retCode = " + m15569v0.f110866a);
            if (AbstractC3096i0.m15544j(m15569v0)) {
                C32296j1.this.f148897k.sendMessage(C32296j1.this.f148897k.obtainMessage(4070, this.f149050a, this.f149051b, str));
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = C32296j1.this.f148978J - (System.currentTimeMillis() - this.f149052c);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceCallRinging error with msg = " + str + " , timeDelay = " + currentTimeMillis);
            C32296j1.this.f148897k.sendMessageDelayed(C32296j1.this.f148897k.obtainMessage(-4070, this.f149050a, this.f149051b, str), currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$m0 */
    /* loaded from: classes7.dex */
    public class m0 implements IVoipServiceRequestCallback {
        m0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send submitSnapshotUrl error with msg = " + str);
        }
    }

    /* renamed from: zm.voip.service.j1$n */
    /* loaded from: classes7.dex */
    class n extends AbstractRunnableC25943g {
        n() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_407.ordinal());
        }
    }

    /* renamed from: zm.voip.service.j1$n0 */
    /* loaded from: classes7.dex */
    class n0 implements IVoipServiceRequestCallback {
        n0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 4491, false);
            if (m15569v0 instanceof C22610l) {
                C23744a.m124114c().m124116d(10040, 1, ((C22610l) m15569v0).m116953a());
            } else {
                C23744a.m124114c().m124116d(10040, 0);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send submitSnapshotUrl error with msg = " + str);
            C23744a.m124114c().m124116d(10040, 0);
        }
    }

    /* renamed from: zm.voip.service.j1$o */
    /* loaded from: classes7.dex */
    class o implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149057a;

        /* renamed from: b */
        final /* synthetic */ int f149058b;

        /* renamed from: c */
        final /* synthetic */ long f149059c;

        o(int i11, int i12, long j11) {
            this.f149057a = i11;
            this.f149058b = i12;
            this.f149059c = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 408, false);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send voiceAnswerACK successfully with retCode = " + m15569v0.f110866a);
            Message obtainMessage = C32296j1.this.f148897k.obtainMessage(0, this.f149057a, this.f149058b, str);
            if (AbstractC3096i0.m15544j(m15569v0)) {
                obtainMessage.what = 4080;
            } else {
                obtainMessage.what = -4080;
            }
            C32296j1.this.f148897k.sendMessage(obtainMessage);
            C32296j1 c32296j1 = C32296j1.this;
            c32296j1.f148897k.removeCallbacks(c32296j1.f149003i0);
            C32296j1 c32296j12 = C32296j1.this;
            c32296j12.f148897k.postDelayed(c32296j12.f149003i0, c32296j12.f148980L);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = C32296j1.this.f148978J - (System.currentTimeMillis() - this.f149059c);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceAnswerACK error with msg = " + str + " , timeDelay = " + currentTimeMillis);
            C32296j1.this.f148897k.sendMessageDelayed(C32296j1.this.f148897k.obtainMessage(-4080, this.f149057a, this.f149058b, str), currentTimeMillis);
        }
    }

    /* renamed from: zm.voip.service.j1$o0 */
    /* loaded from: classes7.dex */
    class o0 extends AbstractRunnableC25946j {
        o0() {
        }

        @Override // ro0.AbstractRunnableC25946j
        /* renamed from: a */
        protected Object mo133681a() {
            long m102216O = C19561o0.m102161L().m102216O();
            C32296j1.this.m156026T5((int) m102216O, C19561o0.m102161L().m102190B(), 0);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$p */
    /* loaded from: classes7.dex */
    public class p implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149062a;

        /* renamed from: b */
        final /* synthetic */ C25945i f149063b;

        p(long j11, C25945i c25945i) {
            this.f149062a = j11;
            this.f149063b = c25945i;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceEndCall complete");
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = C32296j1.this.f148978J - (System.currentTimeMillis() - this.f149062a);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceEndCall error with msg = " + str + " , timeDelay = " + currentTimeMillis);
            C32296j1.this.f148897k.sendMessageDelayed(C32296j1.this.f148897k.obtainMessage(-4090, this.f149063b), currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$p0 */
    /* loaded from: classes7.dex */
    public class p0 implements InterfaceC17463d.d {

        /* renamed from: p */
        ProgressDialogView f149065p = null;

        /* renamed from: q */
        final /* synthetic */ ZaloView f149066q;

        /* renamed from: r */
        final /* synthetic */ int f149067r;

        /* renamed from: s */
        final /* synthetic */ String f149068s;

        /* renamed from: t */
        final /* synthetic */ String f149069t;

        /* renamed from: u */
        final /* synthetic */ boolean f149070u;

        /* renamed from: v */
        final /* synthetic */ int f149071v;

        /* renamed from: w */
        final /* synthetic */ String f149072w;

        /* renamed from: x */
        final /* synthetic */ boolean f149073x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zm.voip.service.j1$p0$a */
        /* loaded from: classes7.dex */
        public class a implements InterfaceC20094a {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m156141e(int i11, String str, String str2, boolean z11, int i12, String str3, boolean z12) {
                ProgressDialogView progressDialogView = p0.this.f149065p;
                if (progressDialogView != null) {
                    progressDialogView.dismiss();
                }
                C32296j1.this.m156116i5(i11, str, str2, z11, i12, str3, z12);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m156142f() {
                ProgressDialogView progressDialogView = p0.this.f149065p;
                if (progressDialogView != null) {
                    progressDialogView.dismiss();
                }
                AbstractC3096i0.m15518U0(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                C32296j1.this.m155827M1(new Runnable() { // from class: zm.voip.service.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32296j1.p0.a.this.m156142f();
                    }
                });
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                p0 p0Var = p0.this;
                C32296j1 c32296j1 = C32296j1.this;
                final int i11 = p0Var.f149067r;
                final String str = p0Var.f149068s;
                final String str2 = p0Var.f149069t;
                final boolean z11 = p0Var.f149070u;
                final int i12 = p0Var.f149071v;
                final String str3 = p0Var.f149072w;
                final boolean z12 = p0Var.f149073x;
                c32296j1.m155827M1(new Runnable() { // from class: zm.voip.service.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32296j1.p0.a.this.m156141e(i11, str, str2, z11, i12, str3, z12);
                    }
                });
            }
        }

        p0(ZaloView zaloView, int i11, String str, String str2, boolean z11, int i12, String str3, boolean z12) {
            this.f149066q = zaloView;
            this.f149067r = i11;
            this.f149068s = str;
            this.f149069t = str2;
            this.f149070u = z11;
            this.f149071v = i12;
            this.f149072w = str3;
            this.f149073x = z12;
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                try {
                    interfaceC17463d.dismiss();
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("VOIP_CONTROLLER", "APIUnBlockCall : " + e11.getMessage(), e11);
                    return;
                }
            }
            if (this.f149066q != null) {
                ProgressDialogView progressDialogView = new ProgressDialogView();
                this.f149065p = progressDialogView;
                progressDialogView.mo43041MK(true);
                this.f149065p.m92596NK(true);
                this.f149065p.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING));
                this.f149065p.mo83093TK(this.f149066q.m92649TI());
            }
            C21914b.f107731a.m114202m(String.valueOf(this.f149067r), 20, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$q */
    /* loaded from: classes7.dex */
    public class q implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149076a;

        /* renamed from: b */
        final /* synthetic */ int f149077b;

        q(int i11, int i12) {
            this.f149076a = i11;
            this.f149077b = i12;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 411, false);
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "Send voiceHoldCall successfully with retCode = " + m15569v0.f110866a);
            if (AbstractC3096i0.m15544j(m15569v0)) {
                C32296j1.this.f148897k.sendMessage(C32296j1.this.f148897k.obtainMessage(4110, this.f149076a, this.f149077b, str));
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceHoldCall error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$q0 */
    /* loaded from: classes7.dex */
    public class q0 extends AbstractRunnableC25943g {
        q0() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.START_CALL.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$r */
    /* loaded from: classes7.dex */
    public class r implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149080a;

        /* renamed from: b */
        final /* synthetic */ int f149081b;

        r(int i11, int i12) {
            this.f149080a = i11;
            this.f149081b = i12;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 413, false);
            if (m15569v0 == null) {
                return;
            }
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "Send voiceResumeCall successfully with retCode = " + m15569v0.f110866a);
            if (AbstractC3096i0.m15544j(m15569v0)) {
                C32296j1.this.f148897k.sendMessage(C32296j1.this.f148897k.obtainMessage(4130, this.f149080a, this.f149081b, str));
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceResumeCall error with msg = " + str);
        }
    }

    /* renamed from: zm.voip.service.j1$r0 */
    /* loaded from: classes7.dex */
    class r0 extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ Object f149083p;

        /* renamed from: q */
        final /* synthetic */ boolean f149084q;

        r0(Object obj, boolean z11) {
            this.f149083p = obj;
            this.f149084q = z11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19561o0.m102161L().m102274s1(this.f149083p, this.f149084q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$s */
    /* loaded from: classes7.dex */
    public class s implements IVoipServiceRequestCallback {
        s() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "Send voiceFinishCallZRTP successfully");
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send voiceFinishCallZRTP error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$s0 */
    /* loaded from: classes7.dex */
    public class s0 implements IVoipServiceRequestCallback {
        s0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send videoCallInteract successfully with retCode = " + AbstractC3096i0.m15569v0(str, 421, false).f110866a);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send videoCallInteract error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$t */
    /* loaded from: classes7.dex */
    public class t implements IVoipServiceRequestCallback {
        t() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 417, false);
            if (m15569v0 != null) {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceRequestChangeZRTP complete with status = " + m15569v0.f110866a + " ;value = " + str);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "Send voiceRequestChangeZRTP failed:" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$t0 */
    /* loaded from: classes7.dex */
    public class t0 implements IVoipServiceRequestCallback {
        t0() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Send muteCallRequest successfully with retCode = " + AbstractC3096i0.m15569v0(str, 443, false).f110866a);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Send muteCallRequest error with msg = " + str);
        }
    }

    /* renamed from: zm.voip.service.j1$u */
    /* loaded from: classes7.dex */
    class u implements IVoipServiceRequestCallback {
        u() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 419, false);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceChangeZRTPACK complete with status = " + m15569v0.f110866a + " ;value = " + str);
            Message obtainMessage = C32296j1.this.f148897k.obtainMessage(0, m15569v0);
            if (AbstractC3096i0.m15544j(m15569v0)) {
                obtainMessage.what = 4190;
            } else {
                obtainMessage.what = -4190;
            }
            C32296j1.this.f148897k.sendMessage(obtainMessage);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "Send voiceChangeZRTPACK failed:" + str);
            Message obtainMessage = C32296j1.this.f148897k.obtainMessage(0, str);
            obtainMessage.what = -4190;
            C32296j1.this.f148897k.sendMessage(obtainMessage);
        }
    }

    /* renamed from: zm.voip.service.j1$v */
    /* loaded from: classes7.dex */
    class v extends AbstractRunnableC25943g {
        v() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19561o0.m102161L().m102204H0(new C19534b(C19561o0.m102161L().m102216O(), 402, 15000));
        }
    }

    /* renamed from: zm.voip.service.j1$w */
    /* loaded from: classes7.dex */
    class w implements IVoipServiceRequestCallback {
        w() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendMessageLiveAnim onRequestComplete " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "sendMessageLiveAnim onRequestFailed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$x */
    /* loaded from: classes7.dex */
    public class x extends AbstractRunnableC25943g {
        x() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.START_INCOMING_CALL.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.j1$y */
    /* loaded from: classes7.dex */
    public class y implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149094a;

        /* renamed from: b */
        final /* synthetic */ long f149095b;

        y(int i11, long j11) {
            this.f149094a = i11;
            this.f149095b = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m156144b(int i11, C22611l0 c22611l0) {
            C17843b.m94137o().m94152O(i11, c22611l0.f110742i);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                final C22611l0 c22611l0 = (C22611l0) AbstractC3096i0.m15569v0(str, 425, false);
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voipRequestPreCall complete with value = " + str);
                if (c22611l0 != null && AbstractC3096i0.m15544j(c22611l0)) {
                    final int i11 = this.f149094a;
                    HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.y.m156144b(i11, c22611l0);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voipRequestPreCall failed 3433: ", e11);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voipRequestPreCall failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149095b));
        }
    }

    /* renamed from: zm.voip.service.j1$z */
    /* loaded from: classes7.dex */
    class z implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149097a;

        z(long j11) {
            this.f149097a = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipIncomingPreCall complete with value = " + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipIncomingPreCall failed: " + str + " , time = " + (System.currentTimeMillis() - this.f149097a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32296j1() {
        super("VOIP_CONTROLLER");
        this.f148969A = new Runnable() { // from class: zm.voip.service.a1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156123o5();
            }
        };
        this.f148970B = new Runnable() { // from class: zm.voip.service.b1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156124q5();
            }
        };
        this.f148971C = new Runnable() { // from class: zm.voip.service.c1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156125r5();
            }
        };
        this.f148974F = 0;
        this.f148975G = 0;
        this.f148976H = 0;
        this.f148977I = 0;
        this.f148978J = 3000L;
        this.f148979K = 0;
        this.f148981M = null;
        this.f148982N = false;
        this.f148983O = -1;
        this.f148984P = 0;
        this.f148985Q = 0;
        this.f148986R = 0;
        this.f148987S = 0;
        this.f148988T = 0;
        this.f148990V = new ArrayList();
        this.f148991W = new ArrayList();
        this.f148992X = 0L;
        this.f148997c0 = 0;
        this.f148998d0 = new C25948l();
        this.f148999e0 = 0L;
        this.f149000f0 = new Runnable() { // from class: zm.voip.service.d1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m155973A5();
            }
        };
        this.f149001g0 = new Runnable() { // from class: zm.voip.service.e1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m155999K5();
            }
        };
        this.f149002h0 = new h0();
        this.f149003i0 = new Runnable() { // from class: zm.voip.service.f1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156017Q5();
            }
        };
        this.f149004j0 = new Runnable() { // from class: zm.voip.service.g1
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156085p5();
            }
        };
        this.f148994Z = new C17864w();
        this.f148995a0 = new C25443a(C30209h.m148990e(), C30209h.m148988c(), C30209h.m148986a(), C25448h.f121862a);
        this.f148996b0 = new ZVideoFilterObserver();
        ZVideoFilterManager.register(this.f148994Z);
        this.f148993Y = new C32284h(AbstractC3096i0.m15574y());
        this.f148901o = AbstractC23309i.m122168me();
        this.f148902p = AbstractC23304d.f113323R1;
        this.f148896j = new HashSet(Arrays.asList(402, 405, 426, 428));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b0  */
    /* renamed from: A4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m155972A4(int i11, int i12, C22618p c22618p) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        Message obtainMessage;
        int i15;
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "handleVoiceRequestAnswer: callerId = " + i11 + ", autoAnswer = " + i12);
        int i16 = 1;
        boolean z16 = c22618p.f110797h0 ^ true;
        boolean z17 = c22618p.f110547m;
        boolean z18 = c22618p.f110548n;
        if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "402 isInBusyState: in native call!");
            mo155840P2(i11, 1, c22618p.f110780Q, c22618p.f110786W, c22618p.f110788Y, c22618p.f110787X, "", "{\"reason\":1}", 0);
            return;
        }
        int i17 = 2;
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 2);
            hashMap.put("callerId", Integer.valueOf(i11));
            hashMap.put("peerZaloId", Integer.valueOf(i11));
            hashMap.put("zaloCallId", Integer.valueOf(c22618p.f110780Q));
            hashMap.put("flag", Integer.valueOf(i12));
            hashMap.put("retMsg", c22618p);
            hashMap.put("SubmitLogWhenFail", Boolean.TRUE);
            C19561o0.m102161L().m102250e1(0L);
            m155939y0(hashMap);
            if (!c22618p.f110801l0) {
                return;
            }
        } else {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "402 isVoipControllerInited");
        }
        if (m156112G5() && this.f148895i != null) {
            String format = String.format("%d_%d_%d_%d", Integer.valueOf(C19561o0.m102161L().m102214N()), Integer.valueOf(i11), Integer.valueOf(c22618p.f110780Q), 0);
            Integer num = (Integer) this.f148888b.get(format);
            if (num != null && num.intValue() == 1) {
                AbstractC3082b0.m15422d("VOIP_CONTROLLER", "Dup message VOICE_REQUEST_ANSWER: " + format);
                return;
            }
            if (i12 == 0 && AbstractC3096i0.f13168l && (i15 = this.f148979K) < 4) {
                if (i15 == 0) {
                    AbstractC3096i0.f13172p = true;
                    AbstractC3082b0.m15424f("VOIP_CONTROLLER", "OldCall is quitting. immediateHangUp");
                    HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.x0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.m156022S4();
                        }
                    });
                }
                this.f148979K++;
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "OldCall is quitting. Wait");
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, i12, c22618p), 500L);
                return;
            }
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive Call id: " + c22618p.f110780Q + " Current call id: " + C19561o0.m102161L().m102190B() + ", from ZaloId: " + i11 + " Current partner: " + C19561o0.m102161L().m102216O());
            if (z18 && i12 == 2 && this.f148975G < 6 && AbstractC3096i0.m15505O()) {
                AbstractC3082b0.m15422d("VOIP_CONTROLLER", "402 ResumeCall countAutoAnswer: " + this.f148975G);
                this.f148975G = this.f148975G + 1;
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, i12, c22618p), 500L);
                return;
            }
            if (z17 && i12 == 1 && this.f148975G < 6 && AbstractC3096i0.m15505O()) {
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "402 BusyCall countAutoAnswer: " + this.f148975G);
                this.f148975G = this.f148975G + 1;
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, i12, c22618p), 500L);
                return;
            }
            if (m155987G4()) {
                if (m155977C4(z17, z16, i11, c22618p.f110780Q)) {
                    AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Busy but receive from same callee ; isOldVersion: " + z16);
                    this.f148992X = (long) c22618p.f110780Q;
                    C32257b4.m155726m().m155737l().m117066T1(true);
                    C32257b4.m155726m().m155737l().m117180z1(153);
                    mo116929a(0, 11);
                    this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, 1, c22618p), 500L);
                    return;
                }
                if (m155979D4(z18, i11, c22618p.f110795f0)) {
                    C32257b4.m155726m().m155737l().m117066T1(true);
                    C32257b4.m155726m().m155737l().m117180z1(153);
                    mo116929a(0, 11);
                    AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Busy call retry");
                    this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, 2, c22618p), 500L);
                    return;
                }
                if (z18 && C19561o0.m102161L().m102257i0(i11) && C19561o0.m102161L().m102259j0(c22618p.f110795f0) && c22618p.f110781R > C19561o0.m102161L().m102226T()) {
                    AbstractC3082b0.m15421c("VOIP_CONTROLLER", "VoipSession.getInstance().getState(): " + C19561o0.m102161L().m102224S());
                    if (C19561o0.m102161L().m102224S() == 3) {
                        C32257b4.m155726m().m155737l().m117180z1(153);
                        mo116929a(-16, 11);
                        c22618p.f110799j0 = true;
                        Message obtainMessage2 = this.f148897k.obtainMessage(4021, i11, 0, c22618p);
                        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive call from same caller 0 -> ring ring: ");
                        this.f148897k.sendMessageDelayed(obtainMessage2, 500L);
                        return;
                    }
                    if (C19561o0.m102161L().m102224S() == 4) {
                        C32257b4.m155726m().m155737l().m117180z1(153);
                        mo116929a(-16, 11);
                        c22618p.f110799j0 = true;
                        if (c22618p.f110796g0 == C19561o0.m102161L().m102267n0()) {
                            obtainMessage = this.f148897k.obtainMessage(4021, i11, 1, c22618p);
                        } else {
                            obtainMessage = this.f148897k.obtainMessage(4021, i11, 0, c22618p);
                            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive call from same caller 1 -> ring ring: ");
                        }
                        C19561o0.m102161L().m102260j1(true);
                        this.f148897k.sendMessageDelayed(obtainMessage, 500L);
                        return;
                    }
                } else {
                    if (AbstractC3096i0.f13164h) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("caller", 0);
                            jSONObject.put("videocall", c22618p.f110796g0 ? 1 : 0);
                            AbstractC20887g.m109234l(19751, jSONObject.toString());
                        } catch (Exception e11) {
                            AbstractC20110a.m104536e(e11);
                        }
                        i13 = 197;
                        AbstractC3079a.m15406a("VOIP_CONTROLLER", "Receive VOICE_REQUEST_ANSWER while in busy state -> Return busy!!!");
                        if (C19561o0.m102161L().m102257i0(i11)) {
                            i14 = 4;
                        } else {
                            if (!C19561o0.m102161L().m102259j0(c22618p.f110795f0)) {
                                i17 = 3;
                            }
                            i14 = i17;
                        }
                        mo155840P2(i11, 1, c22618p.f110780Q, c22618p.f110786W, c22618p.f110788Y, c22618p.f110787X, "", "{\"reason\": " + i14 + " }", i13);
                        return;
                    }
                    C22592c m156362c = C32328p3.m156358e().m156362c();
                    if (m156362c != null && m156362c.m116868R()) {
                        this.f148888b.remove(format);
                        C32257b4.m155726m().m155737l().m117066T1(true);
                        C32257b4.m155726m().m155737l().m117180z1(153);
                        mo116929a(0, 11);
                        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Busy call retry");
                        this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, 2, c22618p), 500L);
                    }
                }
                i13 = 0;
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "Receive VOICE_REQUEST_ANSWER while in busy state -> Return busy!!!");
                if (C19561o0.m102161L().m102257i0(i11)) {
                }
                mo155840P2(i11, 1, c22618p.f110780Q, c22618p.f110786W, c22618p.f110788Y, c22618p.f110787X, "", "{\"reason\": " + i14 + " }", i13);
                return;
            }
            if (this.f148976H >= 1 && C19561o0.m102161L().m102269o0()) {
                AbstractC3082b0.m15422d("VOIP_CONTROLLER", "weird incoming destroy oldcall");
                m156122o4();
                m155972A4(i11, 0, c22618p);
                return;
            }
            if (m155811I0()) {
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "Receive call while processing another incomming call " + this.f148974F);
                int i18 = this.f148974F;
                if (i18 < 2) {
                    this.f148974F = i18 + 1;
                    this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4021, i11, 0, c22618p), 1000L);
                    return;
                }
                return;
            }
            try {
                IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
                if (iVoipZalo != null) {
                    iVoipZalo.notifyIncomingCall();
                }
                this.f148888b.put(format, 1);
            } catch (Exception e12) {
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleVoiceRequestAnswer notifyIncomingCall: " + e12.getMessage(), e12);
            }
            HandlerC32324p.m156351d(new x());
            this.f148981M = C25944h.m133677a(c22618p);
            String str = c22618p.f110782S;
            try {
                str = AbstractC32273e3.f148885y.mUidToPhoneName(Long.toString(i11), str);
            } catch (Exception e13) {
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleVoiceRequestAnswer displayName: " + e13.getMessage(), e13);
            }
            m156080m4(i11, str, c22618p.f110783T);
            try {
                this.f148974F = 0;
                this.f148975G = 0;
                this.f148992X = 0L;
                this.f148997c0 = 0;
                m155975B4(i11, false);
                Constants.forceEgl10 = c22618p.f110560z;
                this.f148898l = c22618p.f110552r;
                this.f148982N = c22618p.f110553s;
                this.f148984P = c22618p.f110554t;
                this.f148985Q = c22618p.f110555u;
                this.f148986R = c22618p.f110556v;
                this.f148987S = c22618p.f110557w;
                this.f148988T = c22618p.f110558x;
                this.f148978J = c22618p.f110559y;
                this.f148983O = c22618p.f110521A;
                this.f148973E = c22618p.f110536P;
                this.f148980L = c22618p.f110802m0 * 1000;
                m155871c2(c22618p.f110522B);
                C19561o0.m102161L().m102262k1(c22618p.f110546l);
                C19561o0.m102161L().m102234X0(c22618p.f110780Q);
                C19561o0 m102161L = C19561o0.m102161L();
                if (c22618p.f110531K == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m102161L.m102268n1(z11);
                C19561o0.m102161L().m102258i1(true);
                C19561o0.m102161L().m102264l1(c22618p.f110793d0);
                C19561o0.m102161L().m102241a1(c22618p.f110795f0);
                C19561o0.m102161L().m102273r1(c22618p.f110525E);
                C19561o0.m102161L().m102238Z0(c22618p.f110796g0 ? 1 : 0);
                C19561o0.m102161L().m102229U0(c22618p.f110530J);
                C19561o0.m102161L().m102270o1(c22618p.f110781R);
                C19561o0.m102161L().m102271p1(System.nanoTime());
                C19561o0.m102161L().m102246c1(c22618p.f110798i0);
                C19561o0.m102161L().m102227T0(c22618p.f110799j0);
                C32257b4.m155726m().m155741z(false);
                AbstractC32273e3.f148886z = false;
                this.f148990V.clear();
                C22626t m155737l = C32257b4.m155726m().m155737l();
                m155737l.m117083Z0(2);
                m155737l.m117056Q0(true);
                m155737l.m117095c1(false);
                m155737l.m117087a1(c22618p.f110796g0 ? 1 : 0);
                m155737l.m117091b1(c22618p.f110803n0);
                if (c22618p.f110804o0 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m155737l.m117131l1(z12);
                if (c22618p.f110533M != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m155737l.m117147p1(z13);
                if (c22618p.f110534N == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                m155737l.m117135m1(z14);
                if (c22618p.f110532L != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                m155737l.m117143o1(z15);
                m155737l.m117108f2(c22618p.f110805p0);
                m155737l.m117077X0(c22618p.f110807r0);
                m155737l.m117042L1(c22618p.f110806q0);
                m155737l.m117148p2(c22618p.f110782S);
                m155737l.m117144o2(c22618p.f110783T);
                m155737l.m117139n1(c22618p.f110808s0);
                m155737l.m117107f1(C8937j0.m47663l("call_video_call"));
                mo155801F2(m155737l);
                C32246a.m155641D().m155687U(c22618p.f110530J);
                C32246a.m155641D().m155684P(false);
                if (c22618p.f110793d0 && mo155861Z0(m155737l, true, 1000)) {
                    C19561o0.m102161L().m102283y1(this.f148902p);
                }
                int i19 = c22618p.f110780Q;
                if (c22618p.f110798i0) {
                    i16 = 2;
                }
                m156038W5(i11, i19, i16);
                m156117j4();
                C19561o0.m102161L().m102204H0(new C19552k(i11, c22618p.f110780Q, c22618p.f110786W, c22618p.f110788Y, c22618p.f110791b0, c22618p.f110790a0, AbstractC23304d.f113323R1, c22618p.f110789Z, c22618p.f110545k, c22618p.f110523C, c22618p.f110549o, c22618p.f110550p, c22618p.f110792c0, c22618p.f110535O, AbstractC3103o.m15621j(c22618p.f110528H, c22618p.f110526F, c22618p.f110527G), c22618p.f110529I));
            } catch (Exception e14) {
                C19561o0.m102161L().m102285z1();
                C19561o0.m102161L().m102215N0();
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleVoiceRequestAnswer 2853: " + e14.getMessage(), e14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A5 */
    public void m155973A5() {
        int m102216O = (int) C19561o0.m102161L().m102216O();
        int m102190B = C19561o0.m102161L().m102190B();
        C22626t m155737l = C32257b4.m155726m().m155737l();
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendSwitchToVideoCmd: receiverID = " + m102216O + ", callId = " + m102190B);
        AbstractC32273e3.f148885y.switchToVideoCall(new f0(m155737l), m102216O, C19561o0.m102161L().m102214N(), m102190B, 0);
    }

    /* renamed from: B4 */
    private void m155975B4(int i11, boolean z11) {
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "setPeerZaloId: peerZaloId = " + i11 + " ; isCaller = " + z11);
        C19561o0.m102161L().m102256h1(i11);
        C19561o0.m102161L().m102219P0();
        C19561o0.m102161L().m102252f1(z11);
        if (z11) {
            C19561o0.m102161L().m102234X0(m155814J());
        }
    }

    /* renamed from: C4 */
    private boolean m155977C4(boolean z11, boolean z12, int i11, int i12) {
        if (z11 && C19561o0.m102161L().m102257i0(i11) && this.f148975G < 6 && C19561o0.m102161L().m102277v()) {
            int i13 = i12 % 100000;
            int m102190B = C19561o0.m102161L().m102190B() % 100000;
            if (z12) {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive from partner not support call busy -> return callee");
                return true;
            }
            if (i13 < m102190B) {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive from partner first -> return callee");
                return true;
            }
            if (i13 == m102190B && i11 > C19561o0.m102161L().m102214N()) {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive from partner same time, partner zalo id > local zalo id -> return callee");
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: D4 */
    private boolean m155979D4(boolean z11, int i11, int i12) {
        if (z11 && C19561o0.m102161L().m102257i0(i11) && C19561o0.m102161L().m102253g0() && C19561o0.m102161L().m102259j0(i12)) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "isCallerCanResumeCall true");
            return true;
        }
        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "isCallerCanResumeCall false");
        return false;
    }

    /* renamed from: D5 */
    private void m155980D5() {
        ((Vibrator) AbstractC3096i0.m15574y().getSystemService("vibrator")).vibrate(new long[]{1000, 400, 300, 800}, -1);
    }

    /* renamed from: E4 */
    private boolean m155982E4() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l.m117090b0()) {
            if (m155737l.m117113h() == 3) {
                return true;
            }
            if (m155737l.m117008A0() && m155737l.m117113h() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E5 */
    private void m155983E5() {
        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "start Call Activity");
        ZaloBubbleActivity.m57031a5();
        Intent m15531c0 = AbstractC3096i0.m15531c0();
        AbstractC3096i0.f13166j = false;
        AbstractC3096i0.f13167k = 0;
        AbstractC3096i0.f13170n = false;
        AbstractC3096i0.m15574y().startActivity(m15531c0);
    }

    /* renamed from: F4 */
    private boolean m155985F4() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && m155737l.m117035J0() && AbstractC23304d.f113259B1) {
            return true;
        }
        return false;
    }

    /* renamed from: G4 */
    private boolean m155987G4() {
        int i11;
        if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "isInBusyState: in native call!");
            return true;
        }
        if (AbstractC3096i0.m15505O()) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "isInBusyState: call screen is still showing!");
            return true;
        }
        if (AbstractC17849h.m94293b()) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "isInBusyState: current pj call still active!");
            return true;
        }
        if (AbstractC3096i0.f13164h) {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "isInBusyState: previous pj call is releasing!");
            return true;
        }
        if (C19561o0.m102161L().m102216O() != -1 && (i11 = this.f148977I) < 1) {
            this.f148977I = i11 + 1;
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "isInBusyState: in processing a request");
            return true;
        }
        this.f148976H = this.f148977I;
        this.f148977I = 0;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H4 */
    public boolean m155989H4() {
        ContactProfile contactProfile = this.f148972D;
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s) && !TextUtils.isEmpty(this.f148972D.f42446v)) {
            return false;
        }
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "isNeedUpdatePartnerProfile");
        return true;
    }

    /* renamed from: H5 */
    private void m155990H5() {
        this.f148897k.removeCallbacks(this.f149004j0);
        C22626t m155737l = C32257b4.m155726m().m155737l();
        m155737l.m117168v1(0);
        m155737l.m117165u1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I4 */
    public static /* synthetic */ void m155992I4(boolean z11) {
        C17843b.m94137o().m94194p0(z11);
    }

    /* renamed from: I5 */
    private void m155993I5(int i11) {
        try {
            int m102190B = C19561o0.m102161L().m102190B();
            AbstractC32273e3.f148885y.submitReceivedZinstantACK(new m0(), m102190B, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J4 */
    public static /* synthetic */ void m155995J4(C22615n0 c22615n0) {
        C17843b.m94137o().m94204u0(c22615n0.f110764g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J5 */
    public void m155996J5() {
        VoipAudioHelper.f148751a.m155636T0(true);
        if (VoipAudioHelper.m155577W()) {
            VoipAudioHelper.m155538B0(1);
            AbstractC32273e3.m155748Q().m155905o2(Integer.toString(40010));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K4 */
    public static /* synthetic */ void m155998K4(int i11, int i12, C22611l0 c22611l0) {
        C17843b.m94137o().m94149L(i11, i12, c22611l0.f110742i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K5 */
    public void m155999K5() {
        this.f148989U = false;
        C22626t m155737l = C32257b4.m155726m().m155737l();
        m155737l.m117120i2(false);
        m156129y5(EnumC23410a.f113740D.ordinal(), true);
        if (!m155737l.m117047N0()) {
            C23744a.m124114c().m124116d(10027, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L4 */
    public static /* synthetic */ void m156001L4(int i11, int i12, C22611l0 c22611l0) {
        C17843b.m94137o().m94151N(i11, i12, c22611l0.f110742i);
    }

    /* renamed from: L5 */
    private void m156002L5() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l == null) {
            return;
        }
        if (m155737l.m117130l0()) {
            if ((m155737l.m117125k() == EnumC17860s.POOR || m155737l.m117125k() == EnumC17860s.VERY_POOR || m155737l.m117125k() == EnumC17860s.NO_VOICE) && !m155737l.m117176y0()) {
                if (m155737l.m117046N() == 1) {
                    m156115i4(EnumC23410a.f113745r.ordinal(), false);
                } else if (m155737l.m117046N() == 2) {
                    m156115i4(EnumC23410a.f113744q.ordinal(), false);
                }
            }
        } else {
            m156129y5(EnumC23410a.f113745r.ordinal(), false);
            m156129y5(EnumC23410a.f113744q.ordinal(), false);
        }
        if (m155737l.m117176y0()) {
            m156120n4(EnumC23410a.f113750w.ordinal(), true);
        } else {
            m156113g4(EnumC23410a.f113750w.ordinal(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M4 */
    public static /* synthetic */ void m156004M4(int i11, int i12, C22613m0 c22613m0) {
        C17843b.m94137o().m94147J(i11, i12, c22613m0.f110753g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M5 */
    public void m156005M5(int i11, int i12, int i13) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceCommandACK: receiverID = " + i11 + ", callId = " + i12 + ", command = " + i13);
        try {
            AbstractC32273e3.f148885y.voiceCommandACK(new c(), i11, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceCommandACK error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public static /* synthetic */ void m156007N4(C22628v c22628v) {
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleReceiveForwardCoreData: " + c22628v.m117183g());
        C17843b.m94137o().m94153P(c22628v.m117183g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N5 */
    public void m156008N5(int i11, int i12, int i13, int i14, String str, String str2, String str3, C25945i c25945i, int i15) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceEndCall: senderID = " + i11 + ", receiverID = " + i12 + ", status = " + i13 + ", callId = " + i14);
        try {
            AbstractC32273e3.f148885y.voiceEndCall(new p(System.currentTimeMillis(), c25945i), i12, i13, i14, str, str2, str3, i15);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceEndCall send", e11);
            Handler handler = this.f148897k;
            handler.sendMessage(handler.obtainMessage(-4090, c25945i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public static /* synthetic */ void m156010O4() {
        C17843b.m94137o().m94179h0(1, 10);
    }

    /* renamed from: O5 */
    private void m156011O5(int i11, int i12, int i13, int i14, int i15, int i16, String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceFinishCallZRTP receiverId = " + i11 + ", status = " + i12 + ", duration = " + i13 + ", callId = " + i14 + ", protocol = " + i15 + ", sender = " + i16);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceFinishCallZRTP receiverId = " + i11 + ", status = " + i12 + ", duration = " + i13 + ", callId = " + i14 + ", protocol = " + i15 + ", sender = " + i16 + ", param = " + str2);
        s sVar = new s();
        try {
            IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
            Charset charset = StandardCharsets.UTF_8;
            iVoipZalo.finishCallZRTP(sVar, i11, i12, i13, i14, i15, i16, str2.getBytes(charset).length, str2.getBytes(charset));
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceFinishCallZRTP error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public static /* synthetic */ void m156013P4(C22602h c22602h) {
        C17843b.m94137o().m94192o0(false, c22602h.f110700y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P5 */
    public void m156014P5(int i11, int i12, int i13) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceHoldCall: receiverID = " + i11 + ", callId = " + i12 + ", status = " + i13);
        try {
            AbstractC32273e3.f148885y.voiceHoldCall(new q(i11, i12), i11, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceHoldCall error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4 */
    public static /* synthetic */ void m156016Q4(C22615n0 c22615n0) {
        C17843b.m94137o().m94208w0(c22615n0.f110764g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q5 */
    public void m156017Q5() {
        if (this.f148980L <= 0 || !C32257b4.m155726m().m155737l().m117126k0()) {
            return;
        }
        int m102216O = (int) C19561o0.m102161L().m102216O();
        int m102190B = C19561o0.m102161L().m102190B();
        int m102214N = C19561o0.m102161L().m102214N();
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voicePing: receiverID = " + m102216O + ", callId = " + m102190B);
        try {
            AbstractC32273e3.f148885y.pingCall11(new i0(), m102216O, m102214N, m102190B);
            this.f148897k.postDelayed(this.f149003i0, this.f148980L);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voicePing error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R4 */
    public static /* synthetic */ void m156019R4(C22604i c22604i) {
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleUpdateZrtcConfigInCall: " + c22604i.m116936g());
        C17843b.m94137o().m94212y0(c22604i.m116936g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R5 */
    public void m156020R5(int i11, int i12, int i13, String str, int i14, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        f fVar = new f(System.currentTimeMillis(), i11, i13, i12);
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestCall: receiverID = " + i11 + ", callId = " + i13 + ", type = " + i12 + ", protocol =  3, subCommand =  4, source = " + i14);
        try {
            str6 = "VOIP_CONTROLLER";
            try {
                AbstractC32273e3.f148885y.voiceRequestCall(fVar, i11, i12, "", i13, str, 3, 4, i14, str4, str5);
                try {
                    HandlerC32324p.m156351d(new g());
                } catch (Exception e11) {
                    e = e11;
                    AbstractC3082b0.m15423e(str6, "voiceRequestCall send", e);
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            str6 = "VOIP_CONTROLLER";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S4 */
    public static /* synthetic */ void m156022S4() {
        C19561o0.m102161L().m102233X();
    }

    /* renamed from: S5 */
    private void m156023S5(int i11, int i12, int i13, String str, String str2, String str3) {
        t tVar = new t();
        try {
            if (str != null && str2 != null && str3 != null) {
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestChangeZRTP: calleeId = " + i11 + ", callId = " + i12 + ", duration = " + i13 + ", sessionID = " + str + ", rtpIp = " + str2 + ", lengthRtp" + str2.length() + ", rtcpIp = " + str3 + ", lengthRtcp" + str3.length());
                AbstractC32273e3.f148885y.voiceRequestChangeZRTP(tVar, i11, i12, i13, str.length(), str.getBytes(), str2.length(), str2.getBytes(), str3.length(), str3.getBytes());
                return;
            }
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "session or rtpIp or rtcpIp is null");
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceRequestChangeZRTP error Exception", e11);
            this.f148897k.sendMessage(this.f148897k.obtainMessage(-4170));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T4 */
    public /* synthetic */ void m156025T4(int i11, int i12, String str) {
        if (!mo155791D0() && !m155811I0()) {
            AbstractC32273e3.f148886z = true;
            AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
        } else {
            AbstractC32273e3.m155750R(true).mo155920t0(i11, i12, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T5 */
    public void m156026T5(int i11, int i12, int i13) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceResumeCall: receiverID = " + i11 + ", callId = " + i12 + ", status = " + i13);
        try {
            AbstractC32273e3.f148885y.voiceResumeCall(new r(i11, i12), i11, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceResumeCall error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U4 */
    public /* synthetic */ void m156029U4() {
        m156070h5(AbstractC3096i0.m15574y());
        C32299k.f149103a.m156157h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5 */
    public void m156030U5(int i11, String str, boolean z11, int i12) {
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceShowMsgVoiceCall");
        if (i12 != 6 && str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    AbstractC32273e3.f148885y.showMsgVoiceCall(i11, str, z11);
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceShowMsgVoiceCall error Exception", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V4 */
    public static /* synthetic */ void m156033V4() {
        C19561o0.m102161L().m102193C0();
    }

    /* renamed from: V5 */
    private void m156034V5(final int i11, final int i12, final int i13, final long j11, final String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.b0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156063e5(i11, i12, i13, j11, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W4 */
    public static /* synthetic */ void m156037W4(int i11, long j11) {
        if (C17843b.m94137o().m94209x()) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "logNativeStackTrace");
            C22626t m155737l = C32257b4.m155726m().m155737l();
            if (m155737l.m117055Q() == i11 && m155737l.m117013C() == j11) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32296j1.m156033V4();
                    }
                });
            }
        }
    }

    /* renamed from: W5 */
    private void m156038W5(int i11, int i12, int i13) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voipIncomingAck: receiverID = " + i11 + ", callId = " + i12 + ", command = " + i13);
        try {
            AbstractC32273e3.f148885y.voipIncomingAck(new d(), i11, i12, i13);
            HandlerC32324p.m156351d(new e());
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voipIncomingAck error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X4 */
    public /* synthetic */ void m156041X4(int i11, String str, String str2, boolean z11, int i12, String str3) {
        m156116i5(i11, str, str2, z11, i12, str3, false);
    }

    /* renamed from: X5 */
    private void m156042X5(int i11, int i12, int i13) {
        y yVar = new y(i11, System.currentTimeMillis());
        try {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "voipRequestPreCall: receiverID = " + i12);
            AbstractC32273e3.f148885y.requestPreCall(yVar, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voipRequestPreCall failed: ", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public static /* synthetic */ void m156045Y4(int i11) {
        C17843b.m94137o().m94202t0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z4 */
    public /* synthetic */ void m156048Z4() {
        if (!((PowerManager) AbstractC3096i0.m15574y().getSystemService("power")).isInteractive() && !AbstractC3096i0.f13165i && !this.f148897k.hasMessages(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE)) {
            this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5 */
    public static /* synthetic */ void m156054b5(String str, IVoipServiceRequestCallback iVoipServiceRequestCallback, long j11, int i11, String str2, int i12, int i13) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendMessageLiveAnim: userId = " + str);
            AbstractC32273e3.f148885y.sendMessageLiveAnim(iVoipServiceRequestCallback, j11, str, i11, str2, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendMessageLiveAnim error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c5 */
    public /* synthetic */ void m156057c5(int i11, int i12, int i13) {
        try {
            int m102216O = (int) C19561o0.m102161L().m102216O();
            int m102190B = C19561o0.m102161L().m102190B();
            j0 j0Var = new j0();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Sticker_id", i11);
            jSONObject.put("Cate_id", i12);
            jSONObject.put("sticker_type", i13);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendSticker: userId = " + i11 + " " + i12);
            AbstractC32273e3.f148885y.sendSticker(j0Var, m102216O, m102190B, 0, jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d5 */
    public /* synthetic */ void m156060d5(String str, int i11) {
        mo155809H2(0, AbstractC3096i0.m15554o(str), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public static /* synthetic */ void m156063e5(int i11, int i12, int i13, long j11, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceUploadCallStat: callId = " + i11 + ", ownerId = " + i12 + ", partnerId = " + i13 + ", ts = " + currentTimeMillis + ", duration = " + j11 + ", filePath = " + str);
            AbstractC32273e3.f148885y.uploadCallLog(i11, i12, i13, currentTimeMillis, j11, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceUploadCallStat error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f5 */
    public static /* synthetic */ void m156066f5(String str, String str2, int i11, int i12, int i13, long j11) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceUploadSpectrumStat: filePath = " + str);
            AbstractC32273e3.f148885y.uploadSpectrumLog(str2, i11, i12, i13, currentTimeMillis, j11, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceUploadSpectrumStat error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g5 */
    public /* synthetic */ void m156068g5(String str, int i11, int i12, int i13) {
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 5);
            hashMap.put("receiverIdStr", str);
            hashMap.put("expireTimeMs", Integer.valueOf(i11));
            m155939y0(hashMap);
            return;
        }
        m156042X5(i12, i13, (int) (System.currentTimeMillis() & 2147483647L));
    }

    /* renamed from: h5 */
    private void m156070h5(Context context) {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        StatusBarNotification[] activeNotifications;
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            boolean isInteractive = powerManager.isInteractive();
            boolean isPowerSaveMode = powerManager.isPowerSaveMode();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 23) {
                z11 = powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
            } else {
                z11 = true;
            }
            boolean isKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            if (i13 >= 23) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                i12 = notificationManager.getCurrentInterruptionFilter();
                activeNotifications = notificationManager.getActiveNotifications();
                i11 = activeNotifications.length;
            } else {
                i11 = -1;
                i12 = -1;
            }
            if (i13 >= 28) {
                z12 = ((ActivityManager) context.getSystemService("activity")).isBackgroundRestricted();
            } else {
                z12 = false;
            }
            int i14 = Settings.Secure.getInt(context.getContentResolver(), "lock_screen_allow_private_notifications", -1);
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "noti_enabled_on_lock " + Settings.Secure.getInt(context.getContentResolver(), "lock_screen_show_notifications", -1) + " show_private_noti " + i14 + " \ninteractive " + isInteractive + " isPowerSaver " + isPowerSaveMode + " powerAllowed " + z11 + " \nlocked " + isKeyguardLocked + " dnd " + i12 + " \nbackgroundRestricted " + z12 + " \nactiveNotif " + i11 + " \nfullScreenIntent " + AbstractC23088h5.m118422c());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j5 */
    private void m156073j5(int i11) {
        int m102216O = (int) C19561o0.m102161L().m102216O();
        int m102190B = C19561o0.m102161L().m102190B();
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "muteCallRequest: receiverID = " + m102216O + ", callId = " + m102190B + ", status = " + i11);
        try {
            AbstractC32273e3.f148885y.voiceMuteCall(new t0(), m102216O, m102190B, i11);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "muteCallRequest error Exception", e11);
        }
    }

    /* renamed from: k4 */
    private void m156075k4() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l == null) {
            return;
        }
        if (m155737l.m117154r0()) {
            m156115i4(EnumC23410a.f113739C.ordinal(), true);
            return;
        }
        if (m155737l.m117161t0()) {
            m156115i4(EnumC23410a.f113748u.ordinal(), true);
            return;
        }
        if (m155737l.m117125k() != EnumC17860s.POOR && m155737l.m117125k() != EnumC17860s.VERY_POOR) {
            m156129y5(EnumC23410a.f113739C.ordinal(), false);
            m156129y5(EnumC23410a.f113745r.ordinal(), false);
            m156129y5(EnumC23410a.f113748u.ordinal(), false);
            m156129y5(EnumC23410a.f113744q.ordinal(), true);
            return;
        }
        if (m155737l.m117093c() == 1) {
            m156129y5(EnumC23410a.f113744q.ordinal(), false);
            m156115i4(EnumC23410a.f113745r.ordinal(), true);
        } else if (m155737l.m117093c() == 2) {
            m156129y5(EnumC23410a.f113745r.ordinal(), false);
            m156115i4(EnumC23410a.f113744q.ordinal(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l4 */
    public void m156077l4(int i11, String str, boolean z11) {
        String jSONObject;
        C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 402, true);
        if (!(m15569v0 instanceof C22618p)) {
            return;
        }
        C22618p c22618p = (C22618p) m15569v0;
        c22618p.f110798i0 = z11;
        if (m155942z(402, i11, c22618p.f110780Q)) {
            return;
        }
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = 402, firebase = " + z11 + ", sendID = " + i11);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = 402, firebase = " + z11 + ", sendID = " + i11 + ", value = " + str);
        if (!TextUtils.isEmpty(c22618p.f110788Y) && !TextUtils.isEmpty(c22618p.f110791b0) && !TextUtils.isEmpty(c22618p.f110786W)) {
            if (!c22618p.m116974a()) {
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "Only support protocol ZRTP, reject call !");
                mo155836O2(i11, 3, c22618p.f110780Q, c22618p.f110786W, c22618p.f110788Y, c22618p.f110787X, "");
                return;
            }
            long j11 = i11;
            if (C19561o0.m102161L().m102216O() == j11 && C19561o0.m102161L().m102190B() == c22618p.f110780Q && !C19561o0.m102161L().m102247d0()) {
                return;
            }
            C19561o0.m102161L().m102248d1(C23793c.m124316k().mo124311f() - c22618p.f110781R);
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Receive 402 delay = " + C19561o0.m102161L().m102207J());
            if (m155782B(c22618p.f110794e0, c22618p.f110781R)) {
                C22626t m102196D0 = C19561o0.m102161L().m102196D0();
                m102196D0.m117140n2(c22618p.f110780Q);
                m102196D0.m117060R1(j11);
                m102196D0.m117180z1(150);
                m102196D0.m117095c1(false);
                if (C19561o0.m102161L().m102207J() != 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("incomingDelay", C19561o0.m102161L().m102207J());
                        jSONObject2.put("fromNoti", z11);
                        jSONObject2.put("battery", BatteryInfoHelper.f148742a.m155522c());
                        jSONObject = jSONObject2.toString();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    C19561o0.m102161L().m102236Y0(jSONObject);
                    mo155858X1(new C22621q0(m102196D0));
                    AbstractC3079a.m15406a("VOIP_CONTROLLER", "Message VOICE_REQUEST_ANSWER is expired");
                    return;
                }
                jSONObject = "";
                C19561o0.m102161L().m102236Y0(jSONObject);
                mo155858X1(new C22621q0(m102196D0));
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "Message VOICE_REQUEST_ANSWER is expired");
                return;
            }
            this.f148979K = 0;
            if (z11 && c22618p.f110800k0 > 0) {
                C29628e.m147249E0().m147274c1();
            }
            m155972A4(i11, 0, c22618p);
        }
    }

    /* renamed from: l5 */
    private void m156078l5() {
        C25938b m156084p4 = m156084p4();
        C23744a.m124114c().m124116d(10033, Integer.valueOf(m156084p4.m133646b()), Integer.valueOf(m156084p4.m133645a()));
    }

    /* renamed from: m4 */
    private void m156080m4(int i11, String str, String str2) {
        ContactProfile contactProfile = new ContactProfile();
        this.f148972D = contactProfile;
        contactProfile.f42434r = String.valueOf(i11);
        ContactProfile contactProfile2 = this.f148972D;
        contactProfile2.f42437s = str;
        contactProfile2.f42446v = str2;
        this.f148973E = null;
    }

    /* renamed from: p4 */
    private C25938b m156084p4() {
        C25938b c25938b = new C25938b(EnumC23410a.f113743p.ordinal(), -1);
        for (int i11 = 0; i11 < this.f148991W.size(); i11++) {
            C25938b c25938b2 = (C25938b) this.f148991W.get(i11);
            if (c25938b2 != null && c25938b2.m133646b() > c25938b.m133646b() && c25938b2.m133647c()) {
                c25938b = c25938b2;
            }
        }
        return c25938b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p5 */
    public void m156085p5() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && !m155737l.m117029H0() && !m155737l.m117126k0()) {
            if (m155737l.m117017D0()) {
                m155737l.m117165u1(m155737l.m117149q() + 300);
            } else {
                m155737l.m117168v1(m155737l.m117153r() + 300);
            }
            this.f148897k.removeCallbacks(this.f149004j0);
            this.f148897k.postDelayed(this.f149004j0, 300L);
            return;
        }
        m155990H5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public void m156087q4(int i11, String str) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "handleAnswerNewServer: cmd = 441, senderID = " + i11);
        final C22615n0 c22615n0 = (C22615n0) AbstractC3096i0.m15569v0(str, 441, true);
        if (c22615n0 != null && c22615n0.f110764g != null) {
            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.m155995J4(C22615n0.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public void m156089r4(String str, final int i11) {
        final C22611l0 c22611l0 = (C22611l0) AbstractC3096i0.m15569v0(str, 427, true);
        final int parseInt = Integer.parseInt(AbstractC23304d.f113368c0.f42434r);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.p0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m155998K4(parseInt, i11, c22611l0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s4 */
    public void m156091s4(String str, final int i11, boolean z11) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = 426, firebase = " + z11 + ", sendID = " + i11);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = 426, firebase = " + z11 + ", sendID = " + i11 + ", value = " + str);
        final C22611l0 c22611l0 = (C22611l0) AbstractC3096i0.m15569v0(str, 426, true);
        if (m155942z(426, i11, c22611l0.f110739f) || m155782B(c22611l0.f110741h, c22611l0.f110740g)) {
            return;
        }
        final int parseInt = Integer.parseInt(AbstractC23304d.f113368c0.f42434r);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.s0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156001L4(parseInt, i11, c22611l0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public void m156092s5(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "receiveForwardCoreDataCmd: senderID = " + i11 + ", value = " + str);
            C22629w c22629w = (C22629w) AbstractC3096i0.m15569v0(str, 432, false);
            if (AbstractC3096i0.m15544j(c22629w)) {
                C19561o0.m102161L().m102206I0(new C22628v(432, c22629w.f110974e, i11, c22629w.f110972c, c22629w.f110975f));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "receiveForwardCoreDataCmd senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t4 */
    public void m156094t4(int i11, String str) {
        try {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "handleInteractRequest: senderID = " + i11 + ", value = " + str);
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 421, true);
            if (!(m15569v0 instanceof C22596e)) {
                return;
            }
            C22596e c22596e = (C22596e) m15569v0;
            if (AbstractC3096i0.m15544j(c22596e)) {
                C19561o0.m102161L().m102206I0(new C19556m(421, c22596e.f110651e, i11, c22596e.f110650d, c22596e.f110649c));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleInteractRequest: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u4 */
    public void m156096u4(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleMuteCallRequest: senderID = " + i11 + ", value = " + str);
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 443, true);
            if (!(m15569v0 instanceof C22596e)) {
                return;
            }
            C22596e c22596e = (C22596e) m15569v0;
            if (AbstractC3096i0.m15544j(c22596e)) {
                C19561o0.m102161L().m102206I0(new C19566r(443, c22596e.f110651e, i11, c22596e.f110650d));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleMuteCallRequest senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public void m156098v4(final int i11, final int i12, String str, boolean z11) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = 428, firebase = " + z11 + ", senderID = " + i12);
        final C22613m0 c22613m0 = (C22613m0) AbstractC3096i0.m15569v0(str, 428, true);
        if (m155942z(428, i12, c22613m0.f110750d) || m155782B(c22613m0.f110752f, c22613m0.f110751e)) {
            return;
        }
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.t0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156004M4(i11, i12, c22613m0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v5 */
    public void m156099v5(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "receiveSwitchToVideoCmd: senderID = " + i11 + ", value = " + str);
            C22617o0 c22617o0 = (C22617o0) AbstractC3096i0.m15569v0(str, 412, false);
            if (AbstractC3096i0.m15544j(c22617o0)) {
                if (c22617o0.f110778k == 1) {
                    m156005M5(c22617o0.f110771d, C19561o0.m102161L().m102190B(), 412);
                }
                C19561o0.m102161L().m102206I0(new C22602h(412, c22617o0.f110774g, i11, c22617o0.f110770c, c22617o0.f110777j, c22617o0.f110775h));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "receiveSwitchToVideoCmd senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w4 */
    public void m156101w4(int i11, String str) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "handleRequestNewServer: cmd = 440 senderID = " + i11);
        final C22615n0 c22615n0 = (C22615n0) AbstractC3096i0.m15569v0(str, 440, true);
        if (c22615n0 != null && c22615n0.f110764g != null) {
            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.o0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.m156016Q4(C22615n0.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w5 */
    public void m156102w5(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "receiveUpdateZrtcConfigInCallCmd: senderID = " + i11 + ", value = " + str);
            C22619p0 c22619p0 = (C22619p0) AbstractC3096i0.m15569v0(str, 447, false);
            if (AbstractC3096i0.m15544j(c22619p0)) {
                if (c22619p0.f110817k == 1) {
                    m156005M5(c22619p0.f110810d, C19561o0.m102161L().m102190B(), 447);
                }
                C19561o0.m102161L().m102206I0(new C22604i(447, c22619p0.f110813g, i11, c22619p0.f110809c, c22619p0.f110816j, c22619p0.f110814h, c22619p0.f110815i));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "receiveUpdateZrtcConfigInCallCmd senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x4 */
    public void m156104x4(int i11, String str) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "handleVoiceAnswer: senderID = " + i11);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceAnswer: senderID = " + i11 + ", value = " + str);
        C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 403, false);
        if (!(m15569v0 instanceof C22614n)) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "handleVoiceAnswer failed format");
            return;
        }
        C22614n c22614n = (C22614n) m15569v0;
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceAnswer: senderID = " + i11 + " callId = " + c22614n.f110754c + " busyCallIdProcessing = " + this.f148992X);
        long j11 = this.f148992X;
        if (j11 != 0 && j11 != c22614n.f110754c && AbstractC3096i0.m15544j(c22614n) && C19561o0.m102161L().m102216O() == i11) {
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "handleVoiceAnswer: receive busy from same call id return");
            return;
        }
        if (AbstractC3096i0.m15544j(c22614n)) {
            try {
                C19561o0.m102161L().m102206I0(new C19540e(i11, c22614n.f110754c, c22614n.f110756e, c22614n.f110757f, c22614n.f110758g, c22614n.f110759h));
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleVoiceAnswer: " + e11.getMessage(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y4 */
    public void m156106y4(int i11, String str, boolean z11) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "handleVoiceCancel: senderID = " + i11 + ", isFirebase = " + z11);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceCancel: senderID = " + i11 + ", isFirebase = " + z11 + ", value = " + str);
        C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 405, true);
        if (!(m15569v0 instanceof C22590b)) {
            return;
        }
        C22590b c22590b = (C22590b) m15569v0;
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceCancel: callId = " + c22590b.f110563c);
        if (m155942z(405, i11, c22590b.f110563c) || m155782B(c22590b.f110569i, c22590b.f110565e)) {
            return;
        }
        this.f148888b.put(String.format("%d_%d_%d_%d", Integer.valueOf(C19561o0.m102161L().m102214N()), Integer.valueOf(i11), Integer.valueOf(c22590b.f110563c), 0), 1);
        C19561o0.m102161L().m102206I0(new C19546h(c22590b.f110566f, i11, c22590b.f110563c, c22590b.f110570j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z4 */
    public void m156108z4(int i11, String str, boolean z11) {
        int i12;
        if (!z11) {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceChangeZRTP: senderID = " + i11 + ", value = " + str);
        } else {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "handleVoiceChangeZRTPACK: senderID = " + i11 + ", value = " + str);
        }
        if (z11) {
            i12 = 419;
        } else {
            i12 = 418;
        }
        C22622r m15569v0 = AbstractC3096i0.m15569v0(str, i12, true);
        if (!(m15569v0 instanceof C22616o)) {
            return;
        }
        C22616o c22616o = (C22616o) m15569v0;
        String m116967d = c22616o.m116967d();
        int m116964a = c22616o.m116964a();
        if (m116967d != null && m116964a == C19561o0.m102161L().m102190B()) {
            C19561o0.m102161L().m102206I0(new C19565q0(i12, 0, c22616o.m116968e(), c22616o.m116964a(), c22616o.m116967d(), c22616o.m116966c(), c22616o.m116965b()));
            return;
        }
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "callId not equal: " + m116964a + "  vs  " + C19561o0.m102161L().m102190B());
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: A0 */
    void mo155779A0() {
        if (this.f148897k != null) {
            return;
        }
        this.f148897k = new a(C2793a.f11144a.m13457b());
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: A1 */
    public void mo155780A1(String str, C24277c c24277c, ContactProfile contactProfile) {
        if (AbstractC3096i0.f13166j) {
            C23744a.m124114c().m124116d(64, str, c24277c, contactProfile);
        } else {
            C23744a.m124114c().m124116d(63, str, c24277c, contactProfile);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: A2 */
    public void mo155781A2(final String str, final int i11) {
        if (C19561o0.m102161L().m102253g0()) {
            m155918s2(true, i11);
            mo155809H2(0, AbstractC3096i0.m15554o(str), i11);
            m156120n4(EnumC23410a.f113753z.ordinal(), true);
        } else if (!C19561o0.m102161L().m102249e0(8) && !C19561o0.m102161L().m102249e0(0)) {
            m155918s2(true, i11);
            C3084c0.m15433a("UPDATE_CAMERA_TASK_KEY", new Runnable() { // from class: zm.voip.service.v0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.this.m156060d5(str, i11);
                }
            });
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: B0 */
    public boolean mo155783B0() {
        return this.f148982N;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: B2 */
    public void mo155785B2(String str, int i11) {
        if (C19561o0.m102161L().m102253g0()) {
            m155918s2(false, i11);
            mo155809H2(1, "", i11);
            C3084c0.m15436d("UPDATE_CAMERA_TASK_KEY");
            m156113g4(EnumC23410a.f113753z.ordinal(), true);
            return;
        }
        if (!C19561o0.m102161L().m102249e0(8) && !C19561o0.m102161L().m102249e0(0)) {
            m155918s2(false, i11);
            C3084c0.m15436d("UPDATE_CAMERA_TASK_KEY");
        }
    }

    /* renamed from: B5 */
    public void m156109B5(boolean z11) {
        if (!mo155791D0() && !mo155799F0()) {
            return;
        }
        ZaloBubbleActivity.m57031a5();
        try {
            Intent m15531c0 = AbstractC3096i0.m15531c0();
            m15531c0.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI", z11);
            PendingIntent.getActivity(AbstractC3096i0.m15574y(), 1, m15531c0, AbstractC19601a.m102572b(0)).send();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "showCallActivity: " + e11.getMessage(), e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: C */
    public boolean mo155786C(int i11) {
        return i11 <= this.f148984P;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: C1 */
    public void mo155788C1() {
        this.f148995a0.release();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: C2 */
    public void mo155789C2() {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "REINVITING");
        HandlerC32324p.m156351d(new o0());
    }

    /* renamed from: C5 */
    void m156110C5(int i11, String str, String str2, boolean z11, int i12, String str3, boolean z12) {
        Context appContext;
        ZaloView zaloView = null;
        try {
            try {
                if (ZaloLauncherActivity.m57061E5() != null) {
                    zaloView = ZaloLauncherActivity.m57061E5().mo35579p().m93012K0();
                }
                if (zaloView == null && ZaloBubbleActivity.m57028V4() != null) {
                    zaloView = ZaloBubbleActivity.m57028V4().mo35579p().m93012K0();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            ZaloView zaloView2 = zaloView;
            if (zaloView2 != null) {
                appContext = zaloView2.m92648SI();
            } else {
                appContext = MainApplication.getAppContext();
            }
            C8009j.a aVar = new C8009j.a(appContext);
            aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_unblock_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_unblock_call), new p0(zaloView2, i11, str, str2, z11, i12, str3, z12));
            aVar.m43152a().mo13822K();
        } catch (Exception e12) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "showPopupUnBlockCall : " + e12.getMessage(), e12);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: D */
    public boolean mo155790D(int i11) {
        return i11 <= this.f148988T;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: D0 */
    public boolean mo155791D0() {
        return mo155795E0(true);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: D1 */
    public void mo155792D1() {
        m156078l5();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: E */
    public boolean mo155794E(int i11) {
        return i11 <= this.f148985Q;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: E0 */
    public boolean mo155795E0(boolean z11) {
        if (z11 && AbstractC3096i0.m15505O()) {
            return true;
        }
        if (AbstractC3096i0.m15513S() && C17843b.m94137o().m94209x()) {
            return true;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && m155737l.f110960y != 0) {
            return true;
        }
        return false;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: E1 */
    public synchronized void mo155796E1() {
        ArrayList arrayList = this.f148991W;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: E2 */
    public void mo155797E2() {
        if (!AbstractC26681b.f126360e || !AbstractC3096i0.m15538g()) {
            return;
        }
        AbstractC3096i0.m15574y().sendBroadcast(new Intent("ACTION_CALL_UPDATE_STATE"));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: F */
    public boolean mo155798F(int i11) {
        return i11 <= this.f148987S;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: F0 */
    public boolean mo155799F0() {
        if (AbstractC3096i0.m15505O()) {
            return true;
        }
        if (AbstractC3096i0.m15513S() && C17843b.m94137o().m94209x()) {
            return true;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l == null) {
            return false;
        }
        if (m155737l.m117064T() || m155737l.f110960y != 0) {
            return true;
        }
        return false;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: F2 */
    public void mo155801F2(C22626t c22626t) {
        String str;
        String str2;
        try {
            c22626t.m117033I1(this.f148895i.f42446v);
            ContactProfile contactProfile = this.f148972D;
            if (contactProfile != null) {
                str = contactProfile.f42437s;
                str2 = contactProfile.f42446v;
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    long parseLong = Long.parseLong(this.f148972D.f42434r);
                    AbstractC3079a.m15406a("VOIP_CONTROLLER", "updateCalleeZaloInfo: set peerZaloId = " + parseLong);
                    c22626t.m117060R1(parseLong);
                }
            } else {
                str = "";
                str2 = "";
            }
            C25940d c25940d = this.f148973E;
            if (c25940d != null && c25940d.m133650a()) {
                c22626t.m117159s1(String.valueOf(this.f148973E.f123694b));
                c22626t.m117151q1(this.f148973E.f123695c);
                c22626t.m117155r1(this.f148973E.f123696d);
            }
            c22626t.m117057Q1(str);
            c22626t.m117054P1(str2);
            c22626t.m117140n2(C19561o0.m102161L().m102190B());
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "updateCalleeZaloInfo: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: F5 */
    void m156111F5() {
        if (mo155888i2()) {
            C32257b4.m155726m().m155737l().m117127k1(C22626t.b.PLAYED);
            C32319o.m156293t().m156312a0();
        } else {
            C32319o.m156293t().m156315d0();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: G */
    public void mo155802G() {
        this.f148897k.removeCallbacks(this.f149003i0);
        this.f148897k.removeCallbacks(this.f149002h0);
        this.f148897k.removeCallbacks(this.f149000f0);
        this.f148897k.removeCallbacks(this.f149001g0);
        m155990H5();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: G1 */
    public void mo155804G1() {
        this.f148994Z.resetState();
        this.f148995a0.resetState();
    }

    /* renamed from: G5 */
    public synchronized boolean m156112G5() {
        try {
            if (AbstractC32273e3.f148885y == null) {
                return false;
            }
            if (AbstractC23304d.f113368c0 == null) {
                return false;
            }
            this.f148895i = new ContactProfile(AbstractC23304d.f113368c0);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "getContactProfile: " + this.f148895i.m40373K());
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Start VOIP success");
            C19561o0.m102161L().m102254g1(Integer.parseInt(this.f148895i.f42434r));
            return true;
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "Start VOIP failed", e11);
            return false;
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: H */
    public void mo155806H(Context context) {
        C25448h.f121862a.m131806b();
        C30209h.m148987b().m148994c(context, true);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: H1 */
    public void mo155808H1() {
        this.f148990V.clear();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: H2 */
    public void mo155809H2(int i11, String str, int i12) {
        if (!C19561o0.m102161L().m102253g0()) {
            return;
        }
        int m102216O = (int) C19561o0.m102161L().m102216O();
        int m102190B = C19561o0.m102161L().m102190B();
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "videoCallInteract: receiverID = " + m102216O + ", callId = " + m102190B + ", status = " + i11 + " ,param = " + str);
        s0 s0Var = new s0();
        if (str == null) {
            str = "";
        }
        try {
            AbstractC32273e3.f148885y.voiceInteractCall(s0Var, m102216O, m102190B, i11, str, i12);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "videoCallInteract error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: I */
    public void mo155810I() {
        this.f148901o = AbstractC23309i.m122168me();
        this.f148902p = AbstractC23304d.f113323R1;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: I2 */
    public void mo155813I2(int i11, int i12, int i13) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceAnswerACK: receiverID = " + i11 + ", callId = " + i12 + ", status = " + i13);
        try {
            AbstractC32273e3.f148885y.voiceAnswerACK(new o(i11, i12, System.currentTimeMillis()), i11, i12, i13);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceAnswerACK error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: J2 */
    public void mo155816J2(int i11, boolean z11, boolean z12) {
        int i12;
        int m102190B = C19561o0.m102161L().m102190B();
        int m102216O = (int) C19561o0.m102161L().m102216O();
        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "voiceCallCancel: receiverID = " + m102216O + ", callId = " + m102190B + ", type = " + i11 + ", isVideo = " + z11);
        if (m102216O == -1) {
            return;
        }
        l lVar = new l();
        if (z11) {
            if (z12) {
                i12 = 3;
            } else {
                i12 = 1;
            }
        } else if (z12) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        try {
            AbstractC32273e3.f148885y.cancelCall(lVar, m102216O, m102190B, i11, i12);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceCallCancel error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: K */
    public int mo155817K() {
        return this.f148983O;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: K1 */
    public int mo155819K1() {
        C21228a c21228a;
        if (AbstractC23304d.f113380e2 == 2 && (c21228a = (C21228a) new C22453d().m101506a()) != null && !c21228a.m110002b().equals("0")) {
            return 1;
        }
        return AbstractC23304d.f113380e2;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: K2 */
    public void mo155820K2(int i11, int i12, int i13, int i14, String str) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceCallRinging: receiverID = " + i11 + ", callId = " + i12 + ", fromNoti = " + i14);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceCallRinging: receiverID = " + i11 + ", callId = " + i12 + ", fromNoti = " + i14 + ", data = " + str);
        try {
            AbstractC32273e3.f148885y.voiceCallRinging(new m(i11, i12, System.currentTimeMillis()), i11, i12, i13, i14, str);
            try {
                HandlerC32324p.m156351d(new n());
            } catch (Exception e11) {
                e = e11;
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceCallRinging error Exception", e);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: L0 */
    public boolean mo155822L0() {
        boolean z11;
        boolean z12;
        InterfaceC25444b.b bVar = (InterfaceC25444b.b) mo155837P().getValue();
        if (bVar != InterfaceC25444b.b.f121842q && bVar != InterfaceC25444b.b.f121843r) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (C19172a.m100599j("features@voip@display_videocall_filter") != 0 && (this.f148994Z.getStatus() == ZVideoFilter.StatusCode.ON || this.f148994Z.getStatus() == ZVideoFilter.StatusCode.OFF)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (C25448h.m131805a()) {
            if (z11 || z12) {
                return true;
            }
            return false;
        }
        return z11;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: L2 */
    public void mo155824L2(int i11, int i12, String str, String str2, String str3) {
        u uVar = new u();
        try {
            if (str != null && str2 != null && str3 != null) {
                AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceChangeZRTPACK: callerId = " + i11 + ", callId = " + i12 + ", sessionID = " + str + ", rtpIp = " + str2 + ", rtcpIp = " + str3);
                AbstractC32273e3.f148885y.voiceRequestChangeZRTPACK(uVar, i11, i12, str.length(), str.getBytes(), str2.length(), str2.getBytes(), str3.length(), str3.getBytes());
                return;
            }
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "session or rtpIp or rtcpIp is null");
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceChangeZRTPACK error Exception", e11);
            this.f148897k.sendMessage(this.f148897k.obtainMessage(-4190));
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: M0 */
    public boolean mo155826M0() {
        if (((InterfaceC25444b.b) mo155837P().getValue()) != InterfaceC25444b.b.f121841p && !this.f148995a0.mo131785b()) {
            if (this.f148995a0.getStatus() != ZVideoFilter.StatusCode.ON) {
                return false;
            }
            return true;
        }
        if (this.f148994Z.getStatus() != ZVideoFilter.StatusCode.ON) {
            return false;
        }
        return true;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: M2 */
    public void mo155828M2(int i11, int i12, int i13, int i14, String str, String str2, String str3, int i15) {
        m156008N5(i11, i12, i13, i14, str, str2, str3, new C25945i(i11, i12, i13, i14, str, str2, str3), i15);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: N1 */
    public void mo155831N1(int i11, int i12, int i13, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        c0 c0Var = new c0(currentTimeMillis);
        try {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "sendCalleeRequestNewServer: receiverID = " + i11 + " , type = " + i13 + " , extraData = " + str2);
            AbstractC32273e3.f148885y.calleeRequestNewServer(c0Var, i11, i12, i13, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendCalleeRequestNewServer failed: ", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: N2 */
    public void mo155832N2(int i11) {
        int m102216O = (int) C19561o0.m102161L().m102216O();
        int m102190B = C19561o0.m102161L().m102190B();
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceInAppACK: receiverID = " + m102216O + ", callId = " + m102190B + ", type = " + i11);
        try {
            AbstractC32273e3.f148885y.voiceInAppACK(new b(), m102216O, m102190B, 0, i11);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceInAppACK error Exception", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo155833O() {
        int i11;
        int i12;
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l.m117122j0()) {
            i11 = -1;
        } else {
            int i13 = 3;
            boolean z11 = false;
            if (m155737l.m117090b0()) {
                int m117157s = m155737l.m117157s();
                if (m117157s != -13) {
                    switch (m117157s) {
                        case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                            i12 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
                            break;
                        case -6:
                            i12 = 108;
                            break;
                        case -5:
                            i12 = 107;
                            break;
                        case -4:
                            i12 = 106;
                            break;
                        case -3:
                            i12 = 105;
                            i13 = 1;
                            break;
                        case -2:
                            i12 = 102;
                            break;
                        case -1:
                            i12 = 101;
                            break;
                        default:
                            i12 = 0;
                            break;
                    }
                    if (i12 == 0 && (m155737l.m117157s() < 0 || (m155737l.m117157s() >= 200 && m155737l.m117157s() < 300))) {
                        i12 = m155737l.m117157s();
                    }
                    if (i12 == 0) {
                        int m117113h = m155737l.m117113h();
                        if (C19561o0.m102161L().m102263l0() && C19561o0.m102161L().m102247d0() && m117113h == 6) {
                            z11 = true;
                        }
                        if (m155737l.m117156r2()) {
                            if (z11) {
                                i11 = 2;
                            } else if (m155737l.m117094c0()) {
                                i11 = 4;
                            }
                        } else if (!z11) {
                            if (m155737l.f110921e0) {
                                i11 = 5;
                            }
                        } else {
                            i11 = 6;
                        }
                    }
                    i11 = i13;
                } else {
                    i12 = 109;
                }
                i13 = 0;
                if (i12 == 0) {
                    i12 = m155737l.m117157s();
                }
                if (i12 == 0) {
                }
                i11 = i13;
            } else if (!m155737l.m117090b0() && m155737l.f110919d0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
        }
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "getEndCallType: " + i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: O1 */
    public void mo155835O1(int i11, int i12, int i13, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        d0 d0Var = new d0(currentTimeMillis);
        try {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "sendCallerAnswerNewServer: receiverID = " + i11 + " , type = " + i13 + " , extraData = " + str2);
            AbstractC32273e3.f148885y.callerAnswerNewServer(d0Var, i11, i12, i13, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendCallerAnswerNewServer failed: ", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: O2 */
    public void mo155836O2(int i11, int i12, int i13, String str, String str2, String str3, String str4) {
        mo155840P2(i11, i12, i13, str, str2, str3, str4, "", 0);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: P */
    public StateFlow mo155837P() {
        return this.f148995a0.mo131786c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: P1 */
    public void mo155839P1(String str) {
        char c11;
        if (!mo155791D0()) {
            return;
        }
        str.hashCode();
        int i11 = 15;
        switch (str.hashCode()) {
            case 35:
                if (str.equals("#")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 42:
                if (str.equals("*")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 48:
                if (str.equals("0")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 49:
                if (str.equals("1")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 52:
                if (str.equals("4")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 53:
                if (str.equals("5")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 54:
                if (str.equals("6")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 55:
                if (str.equals("7")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 56:
                if (str.equals("8")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 57:
                if (str.equals("9")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 65:
                if (str.equals("A")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                if (str.equals("B")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                if (str.equals("C")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 68:
                if (str.equals("D")) {
                    c11 = 15;
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
                i11 = 11;
                break;
            case 1:
                i11 = 10;
                break;
            case 2:
                i11 = 0;
                break;
            case 3:
                i11 = 1;
                break;
            case 4:
                i11 = 2;
                break;
            case 5:
                i11 = 3;
                break;
            case 6:
                i11 = 4;
                break;
            case 7:
                i11 = 5;
                break;
            case '\b':
                i11 = 6;
                break;
            case '\t':
                i11 = 7;
                break;
            case '\n':
                i11 = 8;
                break;
            case 11:
                i11 = 9;
                break;
            case '\f':
                i11 = 12;
                break;
            case '\r':
                i11 = 13;
                break;
            case 14:
                i11 = 14;
                break;
            case 15:
                break;
            default:
                i11 = -1;
                break;
        }
        if (i11 >= 0) {
            HandlerC32324p.m156351d(new e0(i11));
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: P2 */
    public void mo155840P2(int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, int i14) {
        String str6 = str5;
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestAnswer: receiverID = " + i11 + ", status = " + i12 + ", callId = " + i13);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceRequestAnswer: receiverID = " + i11 + ", status = " + i12 + ", callId = " + i13 + ", sessId = " + str + ", rtpIp = " + str2 + ", rtpSerIp = " + str3 + ", codec = " + str4 + ", extendData = " + str6);
        j jVar = new j(i11, i13, i12, i14, System.currentTimeMillis());
        if (str6 == null) {
            str6 = "";
        }
        try {
            AbstractC32273e3.f148885y.voiceRequestAnswer(jVar, i11, i12, i13, str, str2, str3, str4, str6);
            if (i12 == 0) {
                try {
                    HandlerC32324p.m156351d(new k());
                } catch (Exception e11) {
                    e = e11;
                    AbstractC3082b0.m15423e("VOIP_CONTROLLER", "voiceRequestAnswer send", e);
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Q2 */
    public void mo155842Q2(int i11, int i12, String str, String str2, String str3, String str4, String str5, boolean z11, int i13) {
        String str6;
        String str7 = str5;
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "voiceRequestCallZRTP: receiverID = " + i11 + ", callId = " + i12);
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voiceRequestCallZRTP: receiverID = " + i11 + ", callId = " + i12 + ", codec =  " + str + ", rtpAddr = " + str2 + ", rtcpAddr = " + str3 + ", sessionId = " + str4 + ", extendData = " + str7 + ", isVideoData = " + z11 + ", source = " + i13);
        h hVar = new h(i11, i12, System.currentTimeMillis());
        if (str7 == null) {
            str7 = "";
        }
        try {
            IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
            int length = str.length();
            byte[] bytes = str.getBytes();
            int length2 = str2.length();
            byte[] bytes2 = str2.getBytes();
            int length3 = str3.length();
            byte[] bytes3 = str3.getBytes();
            int length4 = str4.length();
            byte[] bytes4 = str4.getBytes();
            byte[] bytes5 = "".getBytes();
            byte[] bytes6 = "".getBytes();
            Charset charset = StandardCharsets.UTF_8;
            str6 = "VOIP_CONTROLLER";
            try {
                iVoipZalo.voiceRequestCallZRTPWithExtendData(hVar, i11, i12, length, bytes, length2, bytes2, length3, bytes3, length4, bytes4, 0, bytes5, 0, bytes6, str7.getBytes(charset).length, str7.getBytes(charset), z11, i13);
                try {
                    HandlerC32324p.m156351d(new i());
                } catch (Exception e11) {
                    e = e11;
                    AbstractC3082b0.m15423e(str6, "voiceRequestCallZRTP send", e);
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            str6 = "VOIP_CONTROLLER";
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: R1 */
    public void mo155843R1(final long j11, final String str, final int i11, final String str2, final int i12, final int i13) {
        final w wVar = new w();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.w0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156054b5(str, wVar, j11, i11, str2, i12, i13);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: S */
    public ArrayList mo155845S() {
        return this.f148990V;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: S2 */
    public void mo155847S2(final String str, final int i11, final int i12, final int i13, final long j11, final String str2) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.d0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156066f5(str2, str, i11, i12, i13, j11);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: T */
    public long mo155848T() {
        if (mo155791D0()) {
            return C19561o0.m102161L().m102216O();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: T2 */
    public void mo155850T2(final String str, final int i11, boolean z11) {
        try {
            if (AbstractC32273e3.f148885y == null || AbstractC23304d.f113368c0 == null) {
                return;
            }
            final int parseInt = Integer.parseInt(str);
            final int parseInt2 = Integer.parseInt(AbstractC23304d.f113368c0.f42434r);
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voipPreConnect currentId = " + parseInt2 + " , receiverId = " + parseInt + " , expireTimeMs = " + i11);
            if (parseInt != parseInt2 && i11 > 0) {
                if (mo155791D0() && C19561o0.m102161L().m102216O() == parseInt) {
                    AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voipPreConnect isIncall with user = " + parseInt);
                    return;
                }
                Long l11 = (Long) this.f148890d.get(str);
                if (l11 != null && z11) {
                    long currentTimeMillis = System.currentTimeMillis() - l11.longValue();
                    if (currentTimeMillis >= 0 && currentTimeMillis <= i11) {
                        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "voipPreConnect expire time = " + i11 + ", period = " + currentTimeMillis);
                        return;
                    }
                }
                this.f148890d.put(str, Long.valueOf(System.currentTimeMillis()));
                this.f148897k.post(new Runnable() { // from class: zm.voip.service.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32296j1.this.m156068g5(str, i11, parseInt2, parseInt);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: U1 */
    public void mo155852U1(int i11, int i12, int i13, int i14, int i15, HashSet hashSet, String str, IVoipServiceRequestCallback iVoipServiceRequestCallback, int i16) {
        int[] iArr;
        int i17;
        int i18 = 0;
        int[] iArr2 = new int[0];
        if (hashSet != null) {
            int size = hashSet.size();
            int[] iArr3 = new int[size];
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                iArr3[i18] = ((Integer) it.next()).intValue();
                i18++;
            }
            i17 = size;
            iArr = iArr3;
        } else {
            iArr = iArr2;
            i17 = 0;
        }
        m155849T1(i11, i12, i13, i14, i15, i17, iArr, str, iVoipServiceRequestCallback, i16);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: W */
    public C25948l mo155855W() {
        return this.f148998d0;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: W1 */
    public void mo155856W1(final int i11, final int i12, final int i13) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.y0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156057c5(i11, i12, i13);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: X */
    public void mo155857X() {
        try {
            ArrayList arrayList = this.f148990V;
            if (arrayList != null && arrayList.size() > 0) {
                C23744a.m124114c().m124116d(10030, new Object[0]);
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new k0());
            c0766k.mo1565W7();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: X1 */
    public void mo155858X1(C22621q0 c22621q0) {
        int i11;
        int i12;
        int m116987j = (int) c22621q0.m116987j();
        int m116979b = (int) c22621q0.m116979b();
        int m116990m = c22621q0.m116990m();
        int m116980c = c22621q0.m116980c();
        int i13 = !c22621q0.m116995r() ? 1 : 0;
        String m102192C = C19561o0.m102161L().m102192C();
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoiceFinishCall partnerId = " + m116987j + ", dur = " + m116979b + ", callId = " + m116990m + ", protocol = " + m116980c + ", finisCaller = " + i13);
        if (m116987j == -1) {
            AbstractC3082b0.m15422d("VOIP_CONTROLLER", "sendVoiceFinishCall partnerId is valid");
            return;
        }
        if (c22621q0.m116985h() != -12 && c22621q0.m116985h() != -13) {
            if (c22621q0.m116997t()) {
                int m15576z = AbstractC3096i0.m15576z(c22621q0.m116986i(), c22621q0.m116993p());
                if (m116987j > 0 && m116979b >= 0 && m116990m != 0 && m116980c == 3 && m15576z >= 0 && m15576z < 100) {
                    m156011O5(m116987j, m15576z, m116979b, m116990m, m116980c, i13, m102192C);
                    String m102197E = C19561o0.m102161L().m102197E();
                    if (!TextUtils.isEmpty(m102197E)) {
                        m156034V5(m116990m, C19561o0.m102161L().m102214N(), m116987j, m116979b, m102197E);
                    }
                }
            } else if (c22621q0.m116995r()) {
                int m116985h = c22621q0.m116985h();
                if (m116985h != 153) {
                    i11 = 196;
                    if (m116985h != 196) {
                        i11 = 197;
                        if (m116985h != 197) {
                            switch (m116985h) {
                                case -16:
                                    i11 = 104;
                                    break;
                                case -15:
                                    i11 = 113;
                                    break;
                                case -14:
                                    i11 = 112;
                                    break;
                                case -13:
                                    i11 = 109;
                                    break;
                                default:
                                    switch (m116985h) {
                                        case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                                            i11 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
                                            break;
                                        case -6:
                                            i11 = 108;
                                            break;
                                        case -5:
                                            i11 = 107;
                                            break;
                                        case -4:
                                            i11 = 106;
                                            break;
                                        case -3:
                                            i11 = 105;
                                            break;
                                        case -2:
                                            i11 = 102;
                                            break;
                                        case -1:
                                            i11 = 101;
                                            break;
                                        default:
                                            switch (m116985h) {
                                                case 114:
                                                    i11 = 114;
                                                    break;
                                                case 115:
                                                    i11 = 115;
                                                    break;
                                                case 116:
                                                    i11 = 116;
                                                    break;
                                                default:
                                                    i11 = 0;
                                                    break;
                                            }
                                    }
                            }
                        }
                    }
                } else {
                    i11 = 111;
                }
                if (i11 == 0 && (c22621q0.m116985h() < 0 || (c22621q0.m116985h() >= 200 && c22621q0.m116985h() < 300))) {
                    i11 = c22621q0.m116985h();
                }
                if (i11 == 0) {
                    if (c22621q0.m116998u()) {
                        i12 = 104;
                    } else {
                        i12 = 103;
                    }
                } else {
                    i12 = i11;
                }
                if (i12 < 0 || (i12 >= 100 && i12 < 300)) {
                    m156011O5(m116987j, i12, 0, m116990m, m116980c, i13, m102192C);
                }
            } else {
                int m116985h2 = c22621q0.m116985h();
                if (m116985h2 >= 0 && (m116985h2 < 150 || m116985h2 >= 300)) {
                    if (C19561o0.m102161L().m102230V() == 1) {
                        m156011O5(m116987j, 109, 0, m116990m, m116980c, i13, m102192C);
                    }
                } else {
                    m156011O5(m116987j, m116985h2, 0, m116990m, m116980c, i13, m102192C);
                }
            }
        } else if (C19561o0.m102161L().m102230V() == 1) {
            m156011O5(m116987j, 109, 0, m116990m, m116980c, i13, m102192C);
        }
        C19561o0.m102161L().m102217O0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Y1 */
    public void mo155859Y1(int i11, int i12, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        a0 a0Var = new a0(currentTimeMillis);
        try {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "sendVoipAnswerPreCall: receiverID = " + i11);
            AbstractC32273e3.f148885y.answerPreCall(a0Var, i11, i12, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendVoipAnswerPreCall failed: ", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Z */
    public int mo155860Z() {
        if (mo155791D0()) {
            return C19561o0.m102161L().m102190B();
        }
        return 0;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Z0 */
    public synchronized boolean mo155861Z0(C22626t c22626t, boolean z11, int i11) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "launchCallHandler");
            if (c22626t != null && (!c22626t.m117090b0() || this.f148999e0 + 1500 < elapsedRealtime)) {
                AbstractC3082b0.m15424f("VOIP_CONTROLLER", "launchCallHandler Conditional");
                if (!c22626t.m117090b0()) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32296j1.this.m156029U4();
                        }
                    });
                    m156119m5();
                }
                AbstractC32273e3.m155748Q().mo155801F2(c22626t);
                C32318n3.m156214E().m156258V();
                if (!c22626t.m117090b0()) {
                    C32257b4.m155726m().m155737l().m117180z1(156);
                }
                AbstractC3082b0.m15421c("VOIP_CONTROLLER", "Anounce call activity");
                AbstractC3096i0.f13160d = true;
                C32319o.m156293t().m156322k0(c22626t.m117090b0());
                VoipAudioHelper.f148751a.m155637p0(AbstractC3096i0.m15574y(), c22626t.m117047N0(), c22626t.m117090b0());
                if (c22626t.m117090b0()) {
                    this.f148897k.postDelayed(this.f148969A, 2000L);
                } else if (!AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
                    C32319o.m156293t().m156325n0((int) C32257b4.m155726m().m155737l().m117013C());
                    new C22080b().m101504a();
                } else {
                    C32319o.m156293t().m156305T(1);
                }
                C19561o0.m102161L().m102221Q0();
                AbstractC32273e3.m155748Q().mo155855W().m133682a();
                boolean m15540h = AbstractC3096i0.m15540h();
                if (AbstractC3103o.m15619h(29)) {
                    if (m15540h || i11 == 9 || i11 == 10 || i11 == 11 || i11 == 12 || i11 == 54 || i11 == 57 || i11 == 58 || i11 == 13 || i11 == 14 || i11 == 62 || i11 == 61 || i11 == 64 || i11 == 63 || i11 == 105 || i11 == 106) {
                        m155983E5();
                    }
                } else {
                    m155983E5();
                }
                AbstractC3096i0.m15510Q0(true);
                this.f148999e0 = elapsedRealtime;
                return true;
            }
            return false;
        } catch (Exception e11) {
            C32319o.m156293t().m156326o0();
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "launchCallHandler : " + e11.getMessage(), e11);
            return false;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Z1 */
    public void mo155862Z1(int i11, int i12, int i13, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        b0 b0Var = new b0(currentTimeMillis);
        try {
            AbstractC3079a.m15406a("VOIP_CONTROLLER", "sendVoipDataToPartner: receiverID = " + i11);
            AbstractC32273e3.f148885y.sendCoreDataToPartner(b0Var, i11, i12, i13, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendVoipDataToPartner failed: ", e11);
        }
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: a */
    public void mo116929a(int i11, int i12) {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "immediateHangUp status = " + i11);
        C19561o0.m102161L().m102204H0(new C19548i(409, i11, i12));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: a1 */
    public void mo155864a1() {
        if (this.f148897k == null) {
            return;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        final int m117055Q = m155737l.m117055Q();
        final long m117013C = m155737l.m117013C();
        this.f148897k.postDelayed(new Runnable() { // from class: zm.voip.service.e0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156037W4(m117055Q, m117013C);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: a2 */
    public void mo155865a2(int i11, int i12, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        z zVar = new z(currentTimeMillis);
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendVoipIncomingPreCall: receiverID = " + i11 + " , extraData = " + str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sendVoipIncomingPreCall: receiverID = ");
            sb2.append(i11);
            AbstractC3079a.m15406a("VOIP_CONTROLLER", sb2.toString());
            AbstractC32273e3.f148885y.incomingPreCall(zVar, i11, i12, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "sendVoipIncomingPreCall failed: ", e11);
        }
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: b */
    public void mo116930b(int i11) {
        mo116929a(i11, 0);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: b1 */
    public void mo155867b1(int i11) {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l == null) {
            return;
        }
        String str = "";
        int i12 = -1;
        if (i11 != 103) {
            if (i11 == 104) {
                try {
                    str = VoipAudioHelper.m155560N().replace("|", "-");
                    i12 = VoipAudioHelper.m155562O();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
        } else {
            str = "Headphones";
        }
        long j11 = 0;
        if (m155737l.m117121j() > 0) {
            j11 = (SystemClock.elapsedRealtime() - m155737l.m117121j()) / 1000;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(j11);
        jSONArray.put(i11);
        jSONArray.put(str);
        jSONArray.put(i12);
        m155737l.m117133m().put(jSONArray);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: b2 */
    public void mo155868b2(long j11) {
        C19561o0.m102161L().m102231V0(j11);
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: c */
    public boolean mo116931c(int i11) {
        if (!C8937j0.m47663l("micro_call")) {
            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_micro_block_title));
            return false;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l == null) {
            return false;
        }
        C19561o0.m102161L().m102225S0(i11);
        if (m155737l.m117170w0()) {
            HandlerC32324p.m156351d(new v());
        } else {
            m155737l.m117059R0(true);
        }
        return true;
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: d */
    public void mo116932d(boolean z11) {
        m156073j5(z11 ? 1 : 0);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: d1 */
    public void mo155873d1(final int i11, final String str, final String str2, final boolean z11, final int i12, final String str3) {
        if (AbstractC19444a.m101693a()) {
            m156116i5(i11, str, str2, z11, i12, str3, false);
        } else {
            m155827M1(new Runnable() { // from class: zm.voip.service.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.this.m156041X4(i11, str, str2, z11, i12, str3);
                }
            });
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: d2 */
    public void mo155874d2(boolean z11) {
        if (z11) {
            if (!this.f148995a0.start(this.f148996b0)) {
                this.f148994Z.start();
            }
        } else if (!this.f148995a0.stop()) {
            this.f148994Z.stop();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: e2 */
    public void mo155877e2(boolean z11) {
        String str;
        try {
            ContactProfile contactProfile = this.f148972D;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = "-1";
            }
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "setStateInCallToZaloProcess start = " + z11 + " -- partnerId = " + str);
            IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
            if (iVoipZalo != null) {
                iVoipZalo.setStateInCall(z11, str);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "setStateInCall error ", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: f2 */
    public void mo155880f2(Object obj, boolean z11) {
        HandlerC32324p.m156351d(new r0(obj, z11));
    }

    /* renamed from: g4 */
    public boolean m156113g4(int i11, boolean z11) {
        boolean z12 = false;
        for (int i12 = 0; i12 < this.f148991W.size(); i12++) {
            try {
                C25938b c25938b = (C25938b) this.f148991W.get(i12);
                if (c25938b != null && c25938b.m133646b() == i11) {
                    c25938b.m133648d(true);
                    z12 = true;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        if (z11) {
            m156078l5();
        }
        return z12;
    }

    /* renamed from: h4 */
    public synchronized void m156114h4(int i11, int i12, boolean z11) {
        m156129y5(i11, false);
        this.f148991W.add(new C25938b(i11, i12));
        if (z11) {
            m156078l5();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: i2 */
    public boolean mo155888i2() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155982E4() && m155737l.m117090b0() && m155737l.m117025G() != null && m155737l.m117129l().ordinal() >= C22626t.b.PREPARED.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: i4 */
    public void m156115i4(int i11, boolean z11) {
        m156114h4(i11, -1, z11);
    }

    /* renamed from: i5 */
    void m156116i5(int i11, String str, String str2, boolean z11, int i12, String str3, boolean z12) {
        String[] strArr;
        if (C21914b.f107731a.m114200k(String.valueOf(i11))) {
            m156110C5(i11, str, str2, z11, i12, str3, z12);
            return;
        }
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 1);
            hashMap.put("calleeZaloId", Integer.valueOf(i11));
            hashMap.put("displayName", str);
            hashMap.put("avatarUrl", str2);
            hashMap.put("isVideoCall", Boolean.valueOf(z11));
            hashMap.put("source", Integer.valueOf(i12));
            hashMap.put("extraInfo", str3);
            hashMap.put("SubmitLogWhenFail", Boolean.TRUE);
            C19561o0.m102161L().m102250e1(0L);
            m155943z0(hashMap, this.f148897k);
            return;
        }
        if (CoreUtility.f89233i.equals(String.valueOf(i11))) {
            return;
        }
        if (m156112G5() && this.f148895i != null) {
            m156080m4(i11, str, str2);
            HandlerC32324p.m156351d(new q0());
            try {
                if (m155987G4()) {
                    AbstractC3079a.m15406a("VOIP_CONTROLLER", "Receive Make call while in busy state -> Just return!!!");
                    if (AbstractC3096i0.f13164h) {
                        AbstractC3096i0.m15518U0(MainApplication.getAppContext().getString(AbstractC8020f0.str_general_error));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("caller", 1);
                        jSONObject.put("videocall", z11 ? 1 : 0);
                        AbstractC20887g.m109234l(19751, jSONObject.toString());
                        C22626t m102196D0 = C19561o0.m102161L().m102196D0();
                        m102196D0.m117095c1(true);
                        m102196D0.m117140n2(m155814J());
                        m102196D0.m117060R1(i11);
                        m102196D0.m117180z1(197);
                        mo155858X1(new C22621q0(m102196D0));
                        return;
                    }
                    return;
                }
                if (this.f148976H >= 1 && C19561o0.m102161L().m102269o0()) {
                    m156122o4();
                    mo155873d1(i11, str, str2, z11, i12, str3);
                    return;
                }
                if (C19561o0.m102161L().m102251f0(i11)) {
                    AbstractC3079a.m15406a("VOIP_CONTROLLER", "Receive Make call while calling with callee -> Just return!!!");
                    return;
                }
                this.f148992X = 0L;
                this.f148997c0 = 0;
                m155975B4(i11, true);
                C19561o0.m102161L().m102238Z0(z11 ? 1 : 0);
                C19561o0.m102161L().m102266m1(i12);
                C19561o0.m102161L().m102244b1(str3);
                C22626t m155737l = C32257b4.m155726m().m155737l();
                if (m155737l != null) {
                    m155737l.m117144o2(str2);
                    m155737l.m117148p2(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        C25940d c25940d = new C25940d();
                        this.f148973E = c25940d;
                        c25940d.f123693a = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                        this.f148973E.f123694b = jSONObject2.optInt("id");
                        this.f148973E.f123695c = jSONObject2.optString("avatar");
                        this.f148973E.f123696d = jSONObject2.optString("name");
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (z11) {
                    strArr = AbstractC3108t.f13194b;
                } else {
                    strArr = AbstractC3108t.f13193a;
                }
                if (AbstractC3108t.m15712a(AbstractC3096i0.m15574y(), strArr) == 0) {
                    AbstractC3096i0.f13169m = false;
                    m156117j4();
                    C19561o0.m102161L().m102204H0(new C19548i(401, 0, z11 ? 1 : 0));
                }
                this.f148897k.sendMessage(this.f148897k.obtainMessage(1000, i12, 0));
                C19561o0.m102161L().m102282x1(this.f148901o);
                mo155902n2();
                return;
            } catch (Exception e12) {
                C19561o0.m102161L().m102285z1();
                C19561o0.m102161L().m102215N0();
                AbstractC3082b0.m15423e("VOIP_CONTROLLER", "makeZaloCallMainThread : " + e12.getMessage(), e12);
                return;
            }
        }
        AbstractC3082b0.m15422d("VOIP_CONTROLLER", "makeZaloCall fail because startVoip failed");
    }

    /* renamed from: j4 */
    public void m156117j4() {
        C30209h.m148989d().m131794a();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: k1 */
    public void mo155892k1(int i11, int i12, int i13) {
        C23744a.m124114c().m124116d(10029, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: k2 */
    public void mo155893k2() {
        m156109B5(false);
    }

    /* renamed from: k5 */
    public void m156118k5(C22626t c22626t, int i11) {
        boolean z11;
        if (c22626t != null) {
            if (c22626t.m117157s() == -13) {
                C19561o0.m102161L().m102285z1();
            }
            if (c22626t.m117157s() == -12) {
                z11 = true;
            } else {
                z11 = false;
            }
            C19561o0.m102161L().m102223R0(true, this.f148976H, i11, z11);
            mo155858X1(new C22621q0(c22626t));
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: l2 */
    public void mo155896l2() {
        if (!m155985F4()) {
            return;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l.m117019E() <= 0 || m155737l.m117022F() == 0) {
            m155737l.m117075W1(C17843b.m94137o().m94195q() * 1000);
        }
        m155737l.m117174x1(true);
        this.f148897k.removeCallbacks(this.f148970B);
        this.f148897k.post(this.f148970B);
        if (m155737l.m117166v() == 1) {
            m156115i4(EnumC23410a.f113747t.ordinal(), false);
            m156129y5(EnumC23410a.f113746s.ordinal(), true);
        } else if (m155737l.m117166v() == 2) {
            m156115i4(EnumC23410a.f113746s.ordinal(), false);
            m156129y5(EnumC23410a.f113747t.ordinal(), true);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: m0 */
    public void mo155897m0(final C22628v c22628v) {
        if (c22628v == null) {
            return;
        }
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.j0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156007N4(C22628v.this);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: m1 */
    public void mo155898m1() {
        boolean z11;
        C22626t m155737l = C32257b4.m155726m().m155737l();
        AbstractC3082b0.m15421c("VOIP_CONTROLLER", "onBroadcastCallState: callInfo state = " + m155737l.m117113h());
        int m117113h = m155737l.m117113h();
        if (C19561o0.m102161L().m102247d0() && m117113h == 6) {
            z11 = C19561o0.m102161L().m102263l0();
            if (z11) {
                if (m155737l.m117156r2()) {
                    C32319o.m156293t().m156307V();
                } else {
                    C32319o.m156293t().m156306U();
                }
            }
        } else {
            z11 = false;
        }
        if (m155982E4()) {
            m156111F5();
        }
        C23744a.m124114c().m124116d(1001, Boolean.valueOf(z11));
        if (!m155737l.m117047N0()) {
            m156075k4();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: m2 */
    public void mo155899m2() {
        this.f148897k.sendEmptyMessageDelayed(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 300L);
    }

    /* renamed from: m5 */
    public void m156119m5() {
        AbstractC19444a.m101697e(new Runnable() { // from class: zm.voip.service.n0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.this.m156048Z4();
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: n0 */
    public void mo155900n0(final C22602h c22602h) {
        if (c22602h == null || !C19561o0.m102161L().m102253g0()) {
            return;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l.m117047N0()) {
            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.m156010O4();
                }
            });
            if (!m155737l.m117038K0()) {
                if (m155737l.m117114h0()) {
                    mo155781A2("offCam", 13);
                } else {
                    mo155785B2("onCam", 13);
                }
            }
            m155996J5();
            return;
        }
        m155737l.m117087a1(1);
        m155737l.m117116h2(true);
        m156002L5();
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.g0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156013P4(C22602h.this);
            }
        });
        C23744a.m124114c().m124116d(10027, 6);
        C32318n3.m156214E().m156257R();
        m155980D5();
        if (AbstractC3096i0.f13167k != 5 && AbstractC3096i0.f13167k != 6) {
            this.f148897k.postDelayed(this.f149002h0, 60000L);
        } else {
            C32318n3.m156214E().m156259W();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: n1 */
    public void mo155901n1(int i11) {
        C23744a.m124114c().m124116d(10014, Integer.valueOf(i11));
        if (i11 == EnumC17859r.PARTNER_AUTO_START_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_AUTO_STOP_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_MANUAL_START_CAPTURE.ordinal() || i11 == EnumC17859r.PARTNER_MANUAL_STOP_CAPTURE.ordinal() || i11 == EnumC17859r.DETECT_LOSS_VIDEO.ordinal() || i11 == EnumC17859r.DETECT_RECEIVE_VIDEO.ordinal()) {
            C22626t m155737l = C32257b4.m155726m().m155737l();
            if (m155737l.m117113h() == 5 && m155737l.m117047N0()) {
                m156002L5();
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: n2 */
    public void mo155902n2() {
        m156085p5();
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && m155737l.m117017D0()) {
            C23744a.m124114c().m124116d(10028, new Object[0]);
        }
    }

    /* renamed from: n4 */
    public boolean m156120n4(int i11, boolean z11) {
        boolean z12 = false;
        for (int i12 = 0; i12 < this.f148991W.size(); i12++) {
            try {
                C25938b c25938b = (C25938b) this.f148991W.get(i12);
                if (c25938b != null && c25938b.m133646b() == i11) {
                    c25938b.m133648d(false);
                    z12 = true;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        if (z11) {
            m156078l5();
        }
        return z12;
    }

    /* renamed from: n5 */
    public void m156121n5() {
        StatusBarNotification[] activeNotifications;
        StatusBarNotification[] activeNotifications2;
        String channelId;
        List notificationChannels;
        String id2;
        int importance;
        boolean areNotificationsEnabled;
        int currentInterruptionFilter;
        NotificationManager.Policy notificationPolicy;
        int i11;
        try {
            NotificationManager notificationManager = (NotificationManager) CoreUtility.getAppContext().getSystemService("notification");
            JSONObject jSONObject = new JSONObject();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                areNotificationsEnabled = notificationManager.areNotificationsEnabled();
                jSONObject.put("notifEnable", areNotificationsEnabled);
                currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                jSONObject.put("interruptionFilter", currentInterruptionFilter);
                notificationPolicy = notificationManager.getNotificationPolicy();
                i11 = notificationPolicy.suppressedVisualEffects;
                jSONObject.put("suppressedVisualEffects", i11);
            }
            if (i12 >= 26) {
                notificationChannels = notificationManager.getNotificationChannels();
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    NotificationChannel m118474a = AbstractC23095i1.m118474a(it.next());
                    id2 = m118474a.getId();
                    if (TextUtils.equals(id2, EnumC23747b0.f114855B.m124128g())) {
                        importance = m118474a.getImportance();
                        jSONObject.put("callNotifImportance", importance);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                activeNotifications = notificationManager.getActiveNotifications();
                jSONObject.put("activeNotif", activeNotifications.length);
                activeNotifications2 = notificationManager.getActiveNotifications();
                for (StatusBarNotification statusBarNotification : activeNotifications2) {
                    if (TextUtils.equals(statusBarNotification.getPackageName(), MainApplication.getAppContext().getPackageName())) {
                        channelId = statusBarNotification.getNotification().getChannelId();
                        if (TextUtils.equals(channelId, EnumC23747b0.f114855B.m124128g())) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(statusBarNotification.getId());
                            sb2.append("-");
                            sb2.append(statusBarNotification.getPostTime());
                            if (statusBarNotification.getNotification().fullScreenIntent != null) {
                                sb2.append("-hasFSI");
                            }
                            sb2.append("-");
                            sb2.append(statusBarNotification.getNotification().flags);
                            jSONObject.put("callNotif", sb2.toString());
                        }
                    }
                }
            }
            jSONObject.put("OS", AbstractC23104j.m118479a());
            jSONObject.put("brand", AbstractC3103o.m15617f());
            jSONObject.put("client_version", CoreUtility.f89234j);
            jSONObject.put("fullScreenIntent", AbstractC23088h5.m118422c());
            AbstractC20887g.m109234l(19750, jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: o0 */
    public void mo155903o0(C22625s0 c22625s0) {
        C23744a.m124114c().m124116d(10039, c22625s0.m117006g().m116956b());
    }

    /* renamed from: o4 */
    public void m156122o4() {
        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "Destroying Voip Service");
        C22626t m102196D0 = C19561o0.m102161L().m102196D0();
        m102196D0.m117180z1(-12);
        m156118k5(m102196D0, C32257b4.m155726m().m155737l().m117113h());
        C32257b4.m155726m().m155741z(false);
        C19561o0.m102161L().m102285z1();
        C19561o0.m102161L().m102215N0();
        this.f148977I = 0;
        this.f148976H = 0;
        this.f148891e = false;
        this.f148893g = false;
        this.f148906t = false;
        this.f148990V.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o5 */
    public void m156123o5() {
        if (C32257b4.m155726m().m155737l().m117090b0() && C32257b4.m155726m().m155737l().m117113h() == 1 && !C32319o.m156293t().m156303P() && !C32319o.m156293t().m156302O() && !m155982E4()) {
            C32319o.m156293t().m156313b0();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: p2 */
    public void mo155908p2() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            m155737l.m117092b2(C17843b.m94137o().m94182j() * 1000);
        }
        this.f148897k.removeCallbacks(this.f148971C);
        this.f148897k.post(this.f148971C);
        m156115i4(EnumC23410a.f113749v.ordinal(), true);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: q0 */
    public void mo155909q0(boolean z11) {
        try {
            int m102214N = C19561o0.m102161L().m102214N();
            int m102216O = (int) C19561o0.m102161L().m102216O();
            if (m102214N > 0 && m102216O > 0) {
                this.f148897k.sendMessage(this.f148897k.obtainMessage(1004, m102214N, m102216O, Boolean.valueOf(z11)));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "handleSendVoiceRequestCall fail : " + e11.getMessage(), e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: q2 */
    public void mo155911q2() {
        if (!C19561o0.m102161L().m102253g0()) {
            return;
        }
        this.f148897k.postDelayed(this.f149002h0, 60000L);
        C32318n3.m156214E().m156253I();
    }

    /* renamed from: q5 */
    public void m156124q5() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            int m117019E = m155737l.m117019E() + 200;
            m155737l.m117072V1(m117019E);
            if (!m155737l.m117164u0() || m117019E > m155737l.m117022F()) {
                return;
            }
        }
        this.f148897k.removeCallbacks(this.f148970B);
        this.f148897k.postDelayed(this.f148970B, 200L);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: r0 */
    public void mo155912r0(C22626t c22626t, String str, String str2) {
        if (c22626t != null && C19561o0.m102161L().m102247d0()) {
            String m102220Q = C19561o0.m102161L().m102220Q();
            AbstractC3082b0.m15424f("VOIP_CONTROLLER", "handleSendRequestChangeZRTP isOnGoing = " + C19561o0.m102161L().m102253g0() + ", sessionId = " + m102220Q + ", rtpIp = " + str + ", rtcpIp = " + str2 + ", callDuration = " + c22626t.m117097d());
            if (C19561o0.m102161L().m102253g0() && !TextUtils.isEmpty(m102220Q) && c22626t.m117097d() > 0) {
                m156023S5((int) C19561o0.m102161L().m102216O(), C19561o0.m102161L().m102190B(), (int) c22626t.m117097d(), m102220Q, str, str2);
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: r2 */
    public void mo155914r2() {
        this.f148897k.sendEmptyMessage(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
    }

    /* renamed from: r5 */
    public void m156125r5() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            int m117031I = m155737l.m117031I() + 200;
            m155737l.m117088a2(m117031I);
            if (!m155737l.m117020E0() || m117031I > m155737l.m117034J()) {
                return;
            }
        }
        this.f148897k.removeCallbacks(this.f148971C);
        this.f148897k.postDelayed(this.f148971C, 200L);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: s */
    public void mo155915s(Object obj, int i11, int i12) {
        if (obj instanceof C22626t) {
            C22626t c22626t = (C22626t) obj;
            if (!c22626t.m117090b0() && c22626t.m117082Z()) {
                C32319o.m156293t().m156328q0();
            } else if (VoipAudioHelper.m155575V()) {
                VoipAudioHelper.m155537B(6, i11, i12);
            } else {
                VoipAudioHelper.m155537B(AbstractC3103o.m15616e(), i11, i12);
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: s0 */
    public void mo155916s0(final C22604i c22604i) {
        if (c22604i == null) {
            return;
        }
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.k0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156019R4(C22604i.this);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: s1 */
    public void mo155917s1(final int i11) {
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.h0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m156045Y4(i11);
            }
        });
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t */
    public void mo155919t(final boolean z11) {
        this.f148897k.removeCallbacks(this.f149002h0);
        C32257b4.m155726m().m155737l().m117116h2(false);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.i0
            @Override // java.lang.Runnable
            public final void run() {
                C32296j1.m155992I4(z11);
            }
        });
        C32318n3.m156214E().m156253I();
        if (z11) {
            mo155785B2("AcceptSwitchVideo", 10);
        } else {
            mo155781A2("RejectSwitchVideo", 11);
        }
        m155996J5();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043 A[FALL_THROUGH] */
    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo155920t0(int i11, int i12, String str) {
        if (i11 != 465 && i11 != 470) {
            if (i11 != 402 && i11 != 403 && i11 != 405 && i11 != 421 && i11 != 432 && i11 != 418 && i11 != 419 && i11 != 440 && i11 != 441 && i11 != 443 && i11 != 444) {
                switch (i11) {
                    default:
                        switch (i11) {
                            default:
                                switch (i11) {
                                    default:
                                        switch (i11) {
                                        }
                                    case 426:
                                    case 427:
                                    case 428:
                                        this.f148897k.sendMessage(this.f148897k.obtainMessage(i11, i12, 0, str));
                                        break;
                                }
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 415:
                                break;
                        }
                    case 407:
                    case 408:
                    case 409:
                        break;
                }
                if (this.f148896j.contains(Integer.valueOf(i11))) {
                    AbstractC3082b0.m15421c("VOIP_CONTROLLER", "ZaloCallbackListener: cmd = " + i11 + ", sendID = " + i12 + ", value = " + str);
                    return;
                }
                return;
            }
            this.f148897k.sendMessage(this.f148897k.obtainMessage(i11, i12, 0, str));
            if (this.f148896j.contains(Integer.valueOf(i11))) {
            }
        } else if (mo155791D0()) {
            AbstractC32273e3.m155750R(true).mo155920t0(i11, i12, str);
        } else {
            AbstractC32273e3.f148886z = true;
            AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t1 */
    public void mo155921t1() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l.m117090b0() && m155737l.m117082Z()) {
            m155737l.m117127k1(C22626t.b.PREPARED);
        }
        if (mo155888i2()) {
            m155737l.m117127k1(C22626t.b.PLAYED);
            C32319o.m156293t().m156312a0();
            C23744a.m124114c().m124116d(10038, new Object[0]);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t2 */
    public void mo155922t2() {
        this.f148897k.removeCallbacks(this.f148971C);
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            m155737l.m117088a2(0);
            m155737l.m117092b2(0);
        }
        m156129y5(EnumC23410a.f113749v.ordinal(), true);
    }

    /* renamed from: t5 */
    public void m156126t5(int i11, String str) {
        C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 448, true);
        if (m15569v0 instanceof C22606j) {
            C22606j c22606j = (C22606j) m15569v0;
            if (AbstractC3096i0.m15544j(c22606j)) {
                C19561o0.m102161L().m102206I0(new C22627u(i11, c22606j.m116937a(), c22606j));
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: u */
    public void mo155923u(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("enable", 2);
                jSONObject.put("ev", 1.0700000524520874d);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        jSONObject.put("enable", jSONObject.optInt("enable", 2));
        this.f148994Z.applyConfig(jSONObject);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: u0 */
    public void mo155924u0(final int i11, final int i12, final String str) {
        if (AbstractC32273e3.m155750R(true).m155787C0(i11)) {
            this.f148897k.post(new Runnable() { // from class: zm.voip.service.z0
                @Override // java.lang.Runnable
                public final void run() {
                    C32296j1.this.m156025T4(i11, i12, str);
                }
            });
        } else if (this.f148896j.contains(Integer.valueOf(i11))) {
            Handler handler = this.f148897k;
            handler.sendMessage(handler.obtainMessage(i11, i12, 1, str));
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: u1 */
    public void mo155925u1(int i11, int i12) {
        if (!AbstractC23304d.f113388g2) {
            return;
        }
        if (i11 == 1) {
            if (C32278f3.m155948d(i12)) {
                m156115i4(EnumC23410a.f113738B.ordinal(), true);
            } else if (C32278f3.m155949e(i12)) {
                m156129y5(EnumC23410a.f113738B.ordinal(), true);
            } else if (C32278f3.m155950f(i12)) {
                m156115i4(EnumC23410a.f113737A.ordinal(), true);
            } else if (C32278f3.m155951g(i12)) {
                m156129y5(EnumC23410a.f113737A.ordinal(), true);
            }
        } else if (i11 == 2 && C19561o0.m102161L().m102267n0()) {
            if (C32278f3.m155946b(i12)) {
                m156115i4(EnumC23410a.f113753z.ordinal(), true);
            } else if (C32278f3.m155947c(i12)) {
                m156129y5(EnumC23410a.f113753z.ordinal(), true);
            }
        }
        m156130z5(i11, i12);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: u2 */
    public void mo155926u2() {
        this.f148897k.removeCallbacks(this.f148969A);
        C32319o.m156293t().m156319h0();
        C32319o.m156293t().m156316e0();
    }

    /* renamed from: u5 */
    public void m156127u5(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "receiveSticker: senderID = " + i11 + ", value = " + str);
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 444, true);
            if (!(m15569v0 instanceof C22608k)) {
                return;
            }
            C22608k c22608k = (C22608k) m15569v0;
            if (AbstractC3096i0.m15544j(c22608k)) {
                C19561o0.m102161L().m102206I0(new C22600g(444, c22608k.m116946d(), i11, c22608k.m116943a(), c22608k.m116945c(), c22608k.m116944b(), c22608k.m116946d()));
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "receiveSticker senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: v0 */
    public void mo155928v0() {
        if (!m155985F4()) {
            return;
        }
        this.f148897k.removeCallbacks(this.f148970B);
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            m155737l.m117075W1(0);
            m155737l.m117072V1(0);
            m155737l.m117174x1(false);
        }
        m156129y5(EnumC23410a.f113747t.ordinal(), false);
        m156129y5(EnumC23410a.f113746s.ordinal(), true);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: v1 */
    public void mo155929v1(int i11, int i12) {
        if (!AbstractC23304d.f113388g2) {
            return;
        }
        if (i11 == 1) {
            if (C32278f3.m155948d(i12)) {
                m156115i4(EnumC23410a.f113752y.ordinal(), true);
                return;
            }
            if (C32278f3.m155949e(i12)) {
                m156129y5(EnumC23410a.f113752y.ordinal(), true);
                return;
            } else if (C32278f3.m155950f(i12)) {
                m156115i4(EnumC23410a.f113751x.ordinal(), true);
                return;
            } else {
                if (C32278f3.m155951g(i12)) {
                    m156129y5(EnumC23410a.f113751x.ordinal(), true);
                    return;
                }
                return;
            }
        }
        if (i11 == 2 && C19561o0.m102161L().m102267n0()) {
            if (C32278f3.m155946b(i12)) {
                m156115i4(EnumC23410a.f113750w.ordinal(), true);
            } else if (C32278f3.m155947c(i12)) {
                m156129y5(EnumC23410a.f113750w.ordinal(), true);
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: v2 */
    public void mo155930v2(String str) {
        try {
            int m102216O = (int) C19561o0.m102161L().m102216O();
            int m102190B = C19561o0.m102161L().m102190B();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("capture_img", str);
            AbstractC32273e3.f148885y.submitZinstantInteraction(new n0(), m102216O, m102190B, 0, jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: w0 */
    public void mo155931w0() {
        AbstractC3079a.m15406a("VOIP_CONTROLLER", "HOLDING");
        HandlerC32324p.m156351d(new g0());
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: w1 */
    public void mo155932w1() {
        this.f148897k.removeMessages(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: w2 */
    public void mo155933w2() {
        try {
            if (!C19561o0.m102161L().m102253g0()) {
                return;
            }
            C22626t m155737l = C32257b4.m155726m().m155737l();
            this.f148897k.postDelayed(this.f149001g0, 30000L);
            this.f148897k.post(this.f149000f0);
            this.f148989U = true;
            m155737l.m117120i2(true);
            m156115i4(EnumC23410a.f113740D.ordinal(), true);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "switchAudioToVideoCall error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: x0 */
    public void mo155935x0(EglBase.Context context, Context context2, C25447g c25447g) {
        this.f148995a0.mo131787d(context, context2, "", c25447g);
    }

    /* renamed from: x5 */
    public void m156128x5(int i11, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "receiveZinstantView: senderID = " + i11 + ", value = " + str);
            C22622r m15569v0 = AbstractC3096i0.m15569v0(str, 449, true);
            if (!(m15569v0 instanceof C22612m)) {
                return;
            }
            C22612m c22612m = (C22612m) m15569v0;
            if (AbstractC3096i0.m15544j(c22612m)) {
                C19561o0.m102161L().m102206I0(new C22625s0(c22612m.m116957c(), i11, c22612m.m116955a(), c22612m));
                m155993I5(c22612m.m116958d());
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CONTROLLER", "receiveSticker senderID = " + i11 + " value = " + str + " cause: " + e11.getMessage(), e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: y1 */
    public void mo155940y1(String str, String str2) {
        C32319o.m156293t().m156310Y(str, str2);
    }

    /* renamed from: y5 */
    public synchronized boolean m156129y5(int i11, boolean z11) {
        boolean z12;
        z12 = false;
        for (int i12 = 0; i12 < this.f148991W.size(); i12++) {
            try {
                C25938b c25938b = (C25938b) this.f148991W.get(i12);
                if (c25938b != null && c25938b.m133646b() == i11) {
                    this.f148991W.remove(i12);
                    z12 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            m156078l5();
        }
        return z12;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: z1 */
    public void mo155944z1(final String str, int i11, int i12) {
        AbstractC3082b0.m15424f("VOIP_CONTROLLER", "prepareRingBackToneFailed errorCode " + i11 + " errorExtra " + i12);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.q0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23041d2.m118208g(str);
            }
        });
    }

    /* renamed from: z5 */
    public void m156130z5(int i11, int i12) {
        try {
            int m102216O = (int) C19561o0.m102161L().m102216O();
            int m102190B = C19561o0.m102161L().m102190B();
            l0 l0Var = new l0();
            AbstractC3082b0.m15421c("VOIP_CONTROLLER", "sendDeviceErrorState: errorType = " + i11 + " errorCode " + i12);
            AbstractC32273e3.f148885y.sendDeviceError(l0Var, m102216O, m102190B, i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
