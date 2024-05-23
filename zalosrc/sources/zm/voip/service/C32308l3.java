package zm.voip.service;

import ag0.AbstractC0837p0;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bf0.C2793a;
import bp0.AbstractC3079a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3106r;
import bp0.AbstractC3108t;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.plugin.IVoipZalo;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import gg0.AbstractC19444a;
import gp0.C19536c;
import gp0.C19538d;
import gp0.C19544g;
import gp0.C19548i;
import gp0.C19554l;
import gp0.C19558n;
import gp0.C19560o;
import gp0.C19561o0;
import gp0.C19562p;
import gp0.C19568s;
import gp0.C19577z;
import gu.AbstractC19601a;
import gw.C19637j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import l50.C22080b;
import lo0.AbstractC22605i0;
import lo0.C22589a0;
import lo0.C22591b0;
import lo0.C22592c;
import lo0.C22593c0;
import lo0.C22595d0;
import lo0.C22597e0;
import lo0.C22599f0;
import lo0.C22601g0;
import lo0.C22603h0;
import lo0.C22607j0;
import lo0.C22621q0;
import lo0.C22630x;
import lo0.C22631y;
import lo0.C22632z;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p097db.C17846e;
import p097db.EnumC17859r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import qo0.InterfaceC25444b;
import ro0.AbstractRunnableC25943g;
import ro0.C25942f;
import ro0.C25948l;
import th.AbstractC26681b;
import vg.C28203u6;
import zm.voip.service.C32308l3;

/* renamed from: zm.voip.service.l3 */
/* loaded from: classes7.dex */
public class C32308l3 extends AbstractC32273e3 {

    /* renamed from: A */
    private long f149114A;

    /* renamed from: B */
    C32284h f149115B;

    /* renamed from: C */
    private final C25948l f149116C;

    /* renamed from: D */
    Runnable f149117D;

    /* renamed from: E */
    long f149118E;

    /* renamed from: zm.voip.service.l3$a */
    /* loaded from: classes7.dex */
    class a implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ String f149119a;

        a(String str) {
            this.f149119a = str;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupAddUser return: " + str);
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 470);
            if (!(m15508P0 instanceof C22630x)) {
                return;
            }
            C22630x c22630x = (C22630x) m15508P0;
            if (c22630x.f110709a != 0) {
                C32308l3.this.m156194t3(this.f149119a);
                return;
            }
            C19577z.m102341J().m102418g0(c22630x.f110983k);
            if (!c22630x.f110982j) {
                C25942f c25942f = new C25942f();
                c25942f.m133675y(c22630x.f110984l);
                c25942f.m133667q(c22630x.f110986n);
                c25942f.m133670t(c22630x.f110985m);
                C19577z.m102341J().m102431n0(c22630x.f110987o, c22630x.f110978f, c25942f);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            C32308l3.this.m156194t3(this.f149119a);
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupAddUser error with msg = " + str);
        }
    }

    /* renamed from: zm.voip.service.l3$b */
    /* loaded from: classes7.dex */
    class b extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ int f149121p;

        b(int i11) {
            this.f149121p = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C32308l3.this.m156191n3(true);
            Runnable runnable = C32308l3.this.f149117D;
            if (runnable != null) {
                HandlerC32324p.m156352e(runnable, this.f149121p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$c */
    /* loaded from: classes7.dex */
    public class c extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C22603h0 f149123p;

        c(C22603h0 c22603h0) {
            this.f149123p = c22603h0;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (this.f149123p.f110709a == 0) {
                C32308l3.this.f149118E = System.currentTimeMillis();
            }
            C19577z.m102341J().m102429m0(this.f149123p.f110706h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$d */
    /* loaded from: classes7.dex */
    public class d implements IVoipServiceRequestCallback {
        d() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 460);
            if (!(m15508P0 instanceof C22603h0)) {
                C32308l3.this.m156197w3(2);
                return;
            }
            C22603h0 c22603h0 = (C22603h0) m15508P0;
            if (c22603h0.f110704f != 0) {
                C32308l3.this.m156197w3(7);
            } else if (C32308l3.this.m156166I3()) {
                C32308l3.this.m156197w3(2);
            } else {
                C32308l3.this.m156199y3(c22603h0);
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            if (C32308l3.this.m156166I3()) {
                C32308l3.this.m156197w3(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$e */
    /* loaded from: classes7.dex */
    public class e implements IVoipServiceRequestCallback {
        e() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "Send broadCastState return: " + str);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send broadCastState error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$f */
    /* loaded from: classes7.dex */
    public class f implements IVoipServiceRequestCallback {
        f() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupFinishCall return: " + str);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupFinishCall error with msg = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$g */
    /* loaded from: classes7.dex */
    public class g extends Handler {
        g(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m156209b() {
            if (AbstractC3096i0.m15511R()) {
                C23744a.m124114c().m124116d(10035, new Object[0]);
            } else if (AbstractC26681b.f126360e && C32308l3.this.f149115B != null && AbstractC3096i0.f13170n) {
                AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "SEND ACTION_CALL_STOP_MINIVIEW");
                C32308l3.this.f149115B.m155970r();
            }
            AbstractC3096i0.f13170n = false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 2001) {
                if (i11 != 2002) {
                    if (i11 != 4500) {
                        if (i11 != 4501) {
                            switch (i11) {
                                case -4540:
                                case -3:
                                    C19577z.m102341J().m102363C0(new C19568s(454, message.what, 0L, message.arg2, ((Integer) message.obj).intValue(), message.arg1));
                                    return;
                                case -4510:
                                    try {
                                        C19577z.m102341J().m102363C0(new C19568s(4510, -4510, message.arg1, message.arg2));
                                        return;
                                    } catch (Exception e11) {
                                        AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "VOICE_REQUEST_CALL_ZRTP_FAILED failed: ", e11);
                                        return;
                                    }
                                case -4500:
                                    int i12 = message.arg1;
                                    int i13 = message.arg2;
                                    Object obj = message.obj;
                                    if (obj instanceof C22601g0) {
                                        C22601g0 c22601g0 = (C22601g0) obj;
                                        String str = c22601g0.f110686i;
                                        C19577z.m102341J().m102418g0(c22601g0.f110694q);
                                    } else if (obj instanceof String) {
                                    }
                                    if (i12 != 0) {
                                        C32328p3.m156358e().m156362c().m116916t0(-1);
                                    } else if (i13 == 0) {
                                        C32328p3.m156358e().m156362c().m116916t0(-2);
                                    }
                                    C19577z.m102341J().m102361B0(new C19548i(455, message.arg1));
                                    return;
                                case -4070:
                                case 4070:
                                    C19577z.m102341J().m102363C0(new C19568s(452, message.what, message.arg2, message.arg1));
                                    return;
                                case 462:
                                    AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", (String) message.obj);
                                    C32308l3.this.m156161D3(message.arg1, (String) message.obj);
                                    return;
                                case 1000:
                                    AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "launchCallScreenWithTimeOuts");
                                    if (C32308l3.this.m156201N3(C32328p3.m156358e().m156362c())) {
                                        C19577z.m102341J().m102430m1(C32308l3.this.f148901o);
                                        return;
                                    }
                                    return;
                                case 1007:
                                    try {
                                        boolean booleanValue = ((Boolean) message.obj).booleanValue();
                                        C22592c m156362c = C32328p3.m156358e().m156362c();
                                        if (m156362c == null) {
                                            return;
                                        }
                                        if (booleanValue) {
                                            if (!m156362c.m116850H()) {
                                                C32308l3.this.mo155855W().f123738c = true;
                                                C32308l3.this.mo155781A2("offScreen", 3);
                                                return;
                                            }
                                            return;
                                        }
                                        if (m156362c.m116850H() && C32308l3.this.mo155855W().f123738c) {
                                            C32308l3.this.mo155785B2("onScreen", 6);
                                        }
                                        C32308l3.this.mo155855W().f123738c = false;
                                        return;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                case 4511:
                                    C32308l3.this.m156163F3(message.arg1, (String) message.obj);
                                    return;
                                case 4540:
                                    C22631y c22631y = (C22631y) message.obj;
                                    C19577z.m102341J().m102363C0(new C19538d(message.what, message.arg1, message.arg2, c22631y.f110991g, c22631y.f110989e, c22631y.f110992h));
                                    if (message.arg1 == 1) {
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("groupId", C19577z.m102341J().m102368F());
                                            C32308l3.this.m156206q3(message.arg2, C19561o0.m102161L().m102214N(), c22631y.f110993i, 153, 0, c22631y.f110989e, c22631y.f110990f, jSONObject.toString(), 1);
                                            return;
                                        } catch (JSONException e13) {
                                            e13.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                case 4571:
                                    C19577z m102341J = C19577z.m102341J();
                                    C32308l3.this.mo155841Q1(m102341J.m102449x(), m102341J.m102372H(), m102341J.m102403Y(), m102341J.m102409b0(), m102341J.m102364D());
                                    return;
                                case 4652:
                                    C32308l3.this.m156162E3(message.arg1, message.arg2, (String) message.obj);
                                    return;
                                default:
                                    switch (i11) {
                                        case 465:
                                            C32308l3.this.m156162E3(message.arg1, 0, (String) message.obj);
                                            return;
                                        case 466:
                                            C32308l3.this.m156200z3(message.arg1, (String) message.obj);
                                            return;
                                        case 467:
                                            C32308l3.this.m156158A3(message.arg1, (String) message.obj, false);
                                            return;
                                        case 468:
                                            C32308l3.this.m156159B3(message.arg1, (String) message.obj, false);
                                            return;
                                        case 469:
                                            C32308l3.this.m156198x3(message.arg1, (String) message.obj);
                                            return;
                                        case 470:
                                            C32308l3.this.m156160C3(message.arg1, (String) message.obj);
                                            return;
                                        case 471:
                                            C32308l3.this.m156196v3(message.arg1, (String) message.obj);
                                            return;
                                        default:
                                            return;
                                    }
                            }
                        }
                        C32308l3.this.mo155854V1();
                        return;
                    }
                    Object obj2 = message.obj;
                    if (obj2 instanceof C22601g0) {
                        C22601g0 c22601g02 = (C22601g0) obj2;
                        C32308l3 c32308l3 = C32308l3.this;
                        c32308l3.f148898l = c22601g02.f110689l;
                        c32308l3.m155871c2(c22601g02.f110690m);
                        C19577z.m102341J().m102363C0(new C19562p(4500, c22601g02.f110711c, c22601g02.f110682e, c22601g02.f110684g, c22601g02.f110688k, c22601g02.f110681d, c22601g02.f110685h, c22601g02.f110683f, c22601g02.f110687j, c22601g02.f110694q, C32308l3.this.f148898l, c22601g02.f110691n, c22601g02.f110695r, c22601g02.f110696s));
                        return;
                    }
                    return;
                }
                C32308l3.this.f148897k.removeMessages(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
                C32308l3.this.m155827M1(new Runnable() { // from class: zm.voip.service.k3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32308l3.g.this.m156209b();
                    }
                });
                return;
            }
            if (AbstractC26681b.f126360e && AbstractC3096i0.m15538g() && C32308l3.this.f149115B != null) {
                C22592c m156362c2 = C32328p3.m156358e().m156362c();
                if (C32308l3.this.m155851U() != null && m156362c2.m116854J()) {
                    AbstractC3096i0.f13170n = true;
                    AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "SEND ACTION_CALL_START_MINIVIEW");
                    C32308l3.this.f149115B.m155968p();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$h */
    /* loaded from: classes7.dex */
    public class h implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149129a;

        /* renamed from: b */
        final /* synthetic */ long f149130b;

        h(int i11, long j11) {
            this.f149129a = i11;
            this.f149130b = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                if (AbstractC3096i0.f13163g && C19577z.m102341J().m102449x() == this.f149129a) {
                    AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 457);
                    if (m15508P0 instanceof C22599f0) {
                        C22599f0 c22599f0 = (C22599f0) m15508P0;
                        C19577z.m102341J().m102363C0(new C19558n(4500, c22599f0.f110709a, c22599f0.f110711c, c22599f0.f110666g, c22599f0.f110663d, c22599f0.f110668i, c22599f0.f110672m, c22599f0.f110671l, c22599f0.f110664e, c22599f0.f110669j, c22599f0.f110670k, c22599f0.f110667h, C32308l3.this.f148898l, c22599f0.f110674o, c22599f0.f110675p, c22599f0.f110676q, c22599f0.f110677r));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send joinGroupCall error with msg = " + str);
            long currentTimeMillis = System.currentTimeMillis() - this.f149130b;
            if (AbstractC3096i0.f13163g && !AbstractC3096i0.f13169m && C19577z.m102341J().m102449x() == this.f149129a) {
                if (C19577z.m102341J().m102446v0()) {
                    C19577z.m102341J().m102363C0(C19558n.m102143g(this.f149129a, 6, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_join_fail_general)));
                    return;
                }
                Message obtainMessage = C32308l3.this.f148897k.obtainMessage(4571);
                long j11 = 5000 - currentTimeMillis;
                Handler handler = C32308l3.this.f148897k;
                if (j11 <= 0) {
                    j11 = 0;
                }
                handler.sendMessageDelayed(obtainMessage, j11);
            }
        }
    }

    /* renamed from: zm.voip.service.l3$i */
    /* loaded from: classes7.dex */
    class i extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ Object f149132p;

        /* renamed from: q */
        final /* synthetic */ boolean f149133q;

        /* renamed from: r */
        final /* synthetic */ int f149134r;

        i(Object obj, boolean z11, int i11) {
            this.f149132p = obj;
            this.f149133q = z11;
            this.f149134r = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19577z.m102341J().m102428l1(this.f149132p, this.f149133q, this.f149134r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$j */
    /* loaded from: classes7.dex */
    public class j implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ long f149136a;

        /* renamed from: b */
        final /* synthetic */ int f149137b;

        j(long j11, int i11) {
            this.f149136a = j11;
            this.f149137b = i11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            int i11;
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 450);
            if (m15508P0 instanceof C22601g0) {
                C22601g0 c22601g0 = (C22601g0) m15508P0;
                try {
                    i11 = new JSONArray(c22601g0.f110681d).length();
                } catch (Exception unused) {
                    i11 = 0;
                }
                AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupMakeRequest return: " + str);
                if (c22601g0.f110709a == 0 && c22601g0.f110711c == 0 && i11 > 0) {
                    C32308l3.this.f148897k.sendMessage(C32308l3.this.f148897k.obtainMessage(4500, c22601g0));
                } else {
                    C32308l3.this.f148897k.sendMessageDelayed(C32308l3.this.f148897k.obtainMessage(-4500, c22601g0.f110711c, i11, c22601g0), 1500L);
                }
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149136a;
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupMakeRequest error with msg = " + str);
            if (!AbstractC3096i0.f13169m && C19577z.m102341J().m102449x() == this.f149137b) {
                if (!C19577z.m102341J().m102446v0()) {
                    Message obtainMessage = C32308l3.this.f148897k.obtainMessage(4501);
                    long j11 = 5000 - currentTimeMillis;
                    Handler handler = C32308l3.this.f148897k;
                    if (j11 <= 0) {
                        j11 = 0;
                    }
                    handler.sendMessageDelayed(obtainMessage, j11);
                    return;
                }
                C32308l3.this.f148897k.sendMessage(C32308l3.this.f148897k.obtainMessage(-4500, 8, 0, str));
            }
        }
    }

    /* renamed from: zm.voip.service.l3$k */
    /* loaded from: classes7.dex */
    class k implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149139a;

        /* renamed from: b */
        final /* synthetic */ long f149140b;

        k(int i11, long j11) {
            this.f149139a = i11;
            this.f149140b = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            C32308l3.this.f148897k.sendMessage(C32308l3.this.f148897k.obtainMessage(4511, this.f149139a, 0, str));
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupInitZRTPRequest return: " + str);
            if (C32328p3.m156358e().m156362c().m116851H0(1)) {
                AbstractC32273e3.m155748Q().m155882g1();
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149140b;
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupInitZRTPRequest error with msg = " + str);
            long j11 = 5000 - currentTimeMillis;
            Message obtainMessage = C32308l3.this.f148897k.obtainMessage(-4510, 0, this.f149139a, str);
            Handler handler = C32308l3.this.f148897k;
            if (j11 <= 0) {
                j11 = 0;
            }
            handler.sendMessageDelayed(obtainMessage, j11);
        }
    }

    /* renamed from: zm.voip.service.l3$l */
    /* loaded from: classes7.dex */
    class l implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149142a;

        l(int i11) {
            this.f149142a = i11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            int i11;
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 452);
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupRingRingRequest return: " + str);
            if (m15508P0 != null && m15508P0.f110709a == 0 && m15508P0.f110711c == 0) {
                i11 = 4070;
            } else {
                i11 = -4070;
            }
            Message obtainMessage = C32308l3.this.f148897k.obtainMessage(i11);
            obtainMessage.arg1 = this.f149142a;
            C32308l3.this.f148897k.sendMessage(obtainMessage);
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupRingRingRequest error with msg = " + str);
        }
    }

    /* renamed from: zm.voip.service.l3$m */
    /* loaded from: classes7.dex */
    class m implements IVoipServiceRequestCallback {
        m() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupCancelRequest return: " + str);
            C32308l3.this.mo155858X1(new C22621q0());
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupCancelRequest error with msg = " + str);
            C32308l3.this.mo155858X1(new C22621q0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.l3$n */
    /* loaded from: classes7.dex */
    public class n implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ int f149145a;

        /* renamed from: b */
        final /* synthetic */ String f149146b;

        /* renamed from: c */
        final /* synthetic */ int f149147c;

        /* renamed from: d */
        final /* synthetic */ int f149148d;

        /* renamed from: e */
        final /* synthetic */ int f149149e;

        /* renamed from: f */
        final /* synthetic */ long f149150f;

        n(int i11, String str, int i12, int i13, int i14, long j11) {
            this.f149145a = i11;
            this.f149146b = str;
            this.f149147c = i12;
            this.f149148d = i13;
            this.f149149e = i14;
            this.f149150f = j11;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            int i11;
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupAnswerCall return: " + str);
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 454);
            if (m15508P0 != null && (m15508P0 instanceof C22631y)) {
                C22631y c22631y = (C22631y) m15508P0;
                AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "voiceRequestAnswer complete status = " + c22631y.f110709a + " requestType " + this.f149145a);
                int i12 = this.f149145a;
                if (i12 == 0) {
                    c22631y.f110993i = this.f149146b;
                    int i13 = c22631y.f110711c;
                    if (i13 == -3 && c22631y.f110709a == 0) {
                        Message obtainMessage = C32308l3.this.f148897k.obtainMessage(-3, i12, this.f149147c);
                        obtainMessage.obj = Integer.valueOf(c22631y.f110711c);
                        C32308l3.this.f148897k.sendMessage(obtainMessage);
                        return;
                    }
                    if (i13 == 0 && c22631y.f110709a == 0) {
                        i11 = 4540;
                    } else {
                        i11 = -4540;
                    }
                    Message obtainMessage2 = C32308l3.this.f148897k.obtainMessage(i11, i12, this.f149147c);
                    Object obj = c22631y;
                    if (i11 != 4540) {
                        obj = Integer.valueOf(c22631y.f110711c);
                    }
                    obtainMessage2.obj = obj;
                    C32308l3.this.f148897k.sendMessage(obtainMessage2);
                    return;
                }
                if (this.f149147c == C19577z.m102341J().m102449x()) {
                    C32308l3.this.mo155858X1(new C22621q0());
                    return;
                }
                C22592c c22592c = new C22592c();
                c22592c.m116875Y(this.f149147c);
                c22592c.m116910q0(this.f149148d);
                c22592c.m116916t0(153);
                C19577z.m102341J().m102411c1(this.f149149e);
                C32308l3.this.mo155858X1(new C22621q0(c22592c));
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupAnswerCall error with msg = " + str);
            long currentTimeMillis = 5000 - (System.currentTimeMillis() - this.f149150f);
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            C32308l3.this.f148897k.sendMessageDelayed(C32308l3.this.f148897k.obtainMessage(-4540, this.f149145a, this.f149147c, -1), currentTimeMillis);
            if (C19577z.m102341J().m102405Z() == 8) {
                C32308l3.this.mo155858X1(new C22621q0());
            }
        }
    }

    /* renamed from: zm.voip.service.l3$o */
    /* loaded from: classes7.dex */
    class o implements IVoipServiceRequestCallback {
        o() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send groupEndCall return: " + str);
            C32308l3.this.mo155858X1(new C22621q0());
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "Send groupEndCall error with msg = " + str);
            C32308l3.this.mo155858X1(new C22621q0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32308l3() {
        super("VOIP_GROUP_CONTROLLER");
        this.f149114A = 0L;
        this.f149116C = new C25948l();
        this.f149115B = new C32284h(AbstractC3096i0.m15574y());
        this.f148901o = AbstractC23309i.m122603y4();
        this.f148896j = new HashSet(Collections.singletonList(465));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3 */
    public void m156158A3(int i11, String str, boolean z11) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "handleVoiceCancel: senderID = " + i11 + ", isFirebase = " + z11);
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "handleVoiceCancel: senderID = " + i11 + ", isFirebase = " + z11 + ", value = " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 453);
        if (!(m15508P0 instanceof C22589a0)) {
            return;
        }
        C22589a0 c22589a0 = (C22589a0) m15508P0;
        C19577z.m102341J().m102363C0(new C19568s(453, c22589a0.f110711c, i11, c22589a0.f110561d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B3 */
    public void m156159B3(int i11, String str, boolean z11) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "handleVoiceEnd: senderID = " + i11 + ", isFirebase = " + z11);
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "handleVoiceEnd: senderID = " + i11 + ", isFirebase = " + z11 + ", value = " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 455);
        if (!(m15508P0 instanceof C22591b0)) {
            return;
        }
        C22591b0 c22591b0 = (C22591b0) m15508P0;
        if (m155778A(468, i11, c22591b0.f110571d, c22591b0.f110574g)) {
            return;
        }
        if (i11 == C19577z.m102341J().m102388Q()) {
            C22592c m156362c = C32328p3.m156358e().m156362c();
            if (m156362c != null) {
                m156362c.m116896j0(8);
                int i12 = c22591b0.f110575h;
                if (i12 != 1) {
                    if (i12 == 2) {
                        m156362c.m116916t0(159);
                    }
                } else {
                    m156362c.m116916t0(158);
                }
            }
            C19577z.m102341J().mo102242b(false);
            return;
        }
        C19577z.m102341J().m102363C0(new C19568s(455, c22591b0.f110711c, i11, c22591b0.f110571d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3 */
    public void m156160C3(int i11, String str) {
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "470 Receiver REC: " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 470);
        if (!(m15508P0 instanceof C22630x)) {
            return;
        }
        C22630x c22630x = (C22630x) m15508P0;
        if ((AbstractC3106r.m15710c(AbstractC3096i0.m15574y()) || mo155791D0()) && c22630x.f110980h != C19577z.m102341J().m102449x()) {
            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "470 isInBusyState: in native call! " + C19577z.m102341J().m102449x());
            C22595d0 c22595d0 = new C22595d0();
            c22595d0.f110634k = C19577z.m102341J().m102390R();
            c22595d0.f110631h = c22630x.f110979g;
            c22595d0.f110632i = c22630x.f110981i;
            c22595d0.f110633j = c22630x.f110980h;
            JSONArray jSONArray = new JSONArray();
            for (C25942f c25942f : c22630x.f110978f) {
                jSONArray.put(c25942f.m133661k());
            }
            c22595d0.f110639p = jSONArray.toString();
            m156195u3(c22595d0);
            return;
        }
        C25942f c25942f2 = new C25942f();
        c25942f2.m133675y(c22630x.f110984l);
        c25942f2.m133667q(c22630x.f110986n);
        c25942f2.m133670t(c22630x.f110985m);
        if (!c22630x.f110982j) {
            C19577z.m102341J().m102431n0(c22630x.f110987o, c22630x.f110978f, c25942f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D3 */
    public void m156161D3(int i11, String str) {
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "handleVoipGroupBroadcast: " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 462);
        if (!(m15508P0 instanceof C22632z)) {
            return;
        }
        C22632z c22632z = (C22632z) m15508P0;
        if (c22632z.f110996d != C19577z.m102341J().m102449x()) {
            return;
        }
        C25942f c25942f = new C25942f();
        c25942f.m133675y(c22632z.f110997e);
        c25942f.m133666p(c22632z.f110998f);
        c25942f.m133676z(c22632z.f110999g);
        c25942f.m133673w(c22632z.f111000h);
        C19577z.m102341J().m102427l0(c25942f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E3 */
    public void m156162E3(int i11, int i12, String str) {
        int i13;
        int i14;
        int i15;
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 Receiver REC sender: " + i11 + " value: " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 465);
        if (!(m15508P0 instanceof C22595d0)) {
            return;
        }
        C22595d0 c22595d0 = (C22595d0) m15508P0;
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 7);
            hashMap.put("callerId", Integer.valueOf(i11));
            hashMap.put("retMsg", str);
            hashMap.put("flag", Integer.valueOf(i12));
            hashMap.put("SubmitLogWhenFail", Boolean.TRUE);
            hashMap.put("zaloCallId", Integer.valueOf(c22595d0.f110633j));
            hashMap.put("hostId", Integer.valueOf(c22595d0.f110632i));
            m155943z0(hashMap, this.f148897k);
            return;
        }
        AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "451 isVoipControllerInited");
        if (m156203R3() && this.f148895i != null) {
            if (m155782B(c22595d0.f110647x, c22595d0.f110638o)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("groupId", c22595d0.f110631h);
                    m156206q3(c22595d0.f110633j, Integer.parseInt(this.f148895i.f42434r), c22595d0.f110639p, 150, 0, c22595d0.f110632i, 0L, jSONObject.toString(), 1);
                    return;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (m155778A(465, i11, c22595d0.f110633j, c22595d0.f110638o)) {
                if (i12 > 0) {
                    i13 = i12 - 1;
                    if (i13 <= 0) {
                        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 countRetry fail");
                        if (mo155791D0()) {
                            AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "465 isInBusyState: in native call!");
                            m156195u3(c22595d0);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } else {
                i13 = i12;
            }
            if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
                AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "465 isInBusyState: in native call!");
                m156195u3(c22595d0);
                return;
            }
            boolean z11 = false;
            if (!mo155791D0() && !m155811I0()) {
                IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
                if (iVoipZalo != null) {
                    iVoipZalo.notifyIncomingCall();
                }
                m156164G3(false, false, null, c22595d0.f110646w, c22595d0.f110634k, c22595d0.f110631h, c22595d0.f110630g, c22595d0.f110629f, null);
                this.f148898l = c22595d0.f110642s;
                C19577z.m102341J().m102391R0(c22595d0.f110633j);
                C19577z.m102341J().m102419g1(c22595d0.f110635l);
                C19577z.m102341J().m102421h1(true);
                C32328p3.m156358e().m156365h(false);
                C22592c m156362c = C32328p3.m156358e().m156362c();
                m156362c.m116876Z(3);
                m156362c.m116873W(true);
                m156362c.m116882c0(false);
                if (c22595d0.f110631h != 0) {
                    z11 = true;
                }
                m156362c.m116849G0(z11);
                m156362c.m116884d0(i11);
                m156362c.m116875Y(c22595d0.f110633j);
                m156362c.m116910q0(c22595d0.f110632i);
                m156362c.m116906o0(c22595d0.f110631h);
                m156362c.m116908p0(c22595d0.f110630g);
                m156362c.m116904n0(c22595d0.f110629f);
                m156362c.m116918u0(C19577z.m102341J().m102374I());
                m156362c.m116902m0(c22595d0.f110640q);
                m156362c.m116888f0(C8937j0.m47663l("call_video_call_group"));
                m155871c2(c22595d0.f110648y);
                AbstractC32273e3.f148886z = true;
                if (m156201N3(m156362c)) {
                    C19577z.m102341J().m102430m1(this.f148901o);
                }
                C19577z.m102341J().m102361B0(new C19554l(c22595d0.f110628e, c22595d0.f110629f, c22595d0.f110630g, c22595d0.f110631h, c22595d0.f110632i, c22595d0.f110633j, c22595d0.f110634k, c22595d0.f110635l, c22595d0.f110636m, c22595d0.f110637n, c22595d0.f110638o, c22595d0.f110644u, c22595d0.f110641r, c22595d0.f110642s, c22595d0.f110643t, c22595d0.f110639p, c22595d0.f110645v));
                return;
            }
            C22592c m156362c2 = C32328p3.m156358e().m156362c();
            if (i13 == 0) {
                i14 = 15;
            } else {
                i14 = i13;
            }
            if (!AbstractC32273e3.f148886z) {
                if (i13 == 0) {
                    i15 = 5;
                } else {
                    i15 = i13;
                }
                AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 maybe invalid call + callID RETRY " + i15 + ", " + i13);
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4652, i11, i15, str), 500L);
                return;
            }
            if (AbstractC3096i0.f13163g && m156362c2.m116883d() == c22595d0.f110633j) {
                AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "465 same call with join gCall + callID RETRY");
                C19577z.m102341J().mo102242b(false);
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4652, i11, i14, str), 500L);
                return;
            }
            if (m156362c2.m116868R()) {
                AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 isShowBackScreen RETRY");
                C23744a.m124114c().m124116d(40016, 0);
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4652, i11, i14, str), 500L);
            } else if (m156362c2.m116901m() == c22595d0.f110632i && m156362c2.m116883d() == c22595d0.f110633j) {
                AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 same host + callID RETRY");
                mo116930b(0);
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4652, i11, i14, str), 500L);
            } else if (!m156362c2.m116842D() && !C19577z.m102341J().m102444u0()) {
                AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "465 maybe invalid call + callID RETRY");
                this.f148897k.sendMessageDelayed(this.f148897k.obtainMessage(4652, i11, i14, str), 500L);
            } else {
                AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "465 isInBusyState: in native call!");
                m156195u3(c22595d0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F3 */
    public void m156163F3(int i11, String str) {
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "451 Sender RES: " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 4511);
        if (!(m15508P0 instanceof C22597e0)) {
            return;
        }
        C32328p3.m156358e().m156362c().m116912r0(false);
        C22597e0 c22597e0 = (C22597e0) m15508P0;
        C19577z.m102341J().m102417f1(c22597e0.f110658j);
        AbstractC32273e3.m155748Q().mo155823L1(c22597e0.f110657i);
    }

    /* renamed from: G3 */
    private void m156164G3(boolean z11, boolean z12, List list, C25942f[] c25942fArr, int i11, int i12, String str, String str2, String str3) {
        C19577z.m102341J().m102408a1(z11);
        C19577z.m102341J().m102413d1(i11);
        C19577z.m102341J().m102402X0(i12);
        C19577z.m102341J().m102400W0(str2);
        if (!z11 && !z12) {
            C19577z.m102341J().m102437q0(c25942fArr);
        } else {
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                C25942f[] c25942fArr2 = new C25942f[list.size()];
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ContactProfile contactProfile = (ContactProfile) list.get(i13);
                    jSONArray.put(contactProfile.f42434r);
                    C25942f c25942f = new C25942f();
                    c25942fArr2[i13] = c25942f;
                    c25942f.m133670t(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
                    c25942fArr2[i13].m133667q(contactProfile.f42446v);
                    c25942fArr2[i13].m133675y(Integer.parseInt(contactProfile.f42434r));
                    c25942fArr2[i13].m133673w(1);
                }
                C19577z.m102341J().m102437q0(c25942fArr2);
                C19577z.m102341J().m102397U0(jSONArray.toString());
            }
            if (!z12) {
                C19577z.m102341J().m102391R0(m155814J());
            }
        }
        if (TextUtils.isEmpty(str3)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("groupId", i12);
                jSONObject.put("groupName", str);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("groupAvatar", str2);
                str3 = jSONObject.toString();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        C19577z.m102341J().m102398V0(str3);
        C19577z.m102341J().m102404Y0(str);
    }

    /* renamed from: H3 */
    private boolean m156165H3() {
        if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
            AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "isInBusyState: in native call!");
            return true;
        }
        if (C17846e.m94223f().m94239j()) {
            AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "isInBusyState: current pj call still active!");
            return true;
        }
        if (C32328p3.m156358e().m156362c().m116925y()) {
            AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "isInBusyState: current call still process!");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I3 */
    public boolean m156166I3() {
        if (System.currentTimeMillis() - this.f149118E > C19577z.m102341J().m102396U()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m156167J3(int i11, int i12, String str) {
        if (!mo155791D0() && !m155811I0()) {
            AbstractC32273e3.f148886z = false;
            AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
        } else {
            AbstractC32273e3.m155750R(false).mo155920t0(i11, i12, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K3 */
    public static /* synthetic */ void m156168K3(boolean z11) {
        C17846e.m94223f().m94240k(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M3 */
    public static /* synthetic */ void m156170M3(int i11, long j11, int i12, long j12, int i13, String str) {
        try {
            AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "voiceUploadCallStat: callId = " + i11 + ", duration = " + j11 + ", hostCall = " + i12 + ", join_time = " + j12 + ", owner_id = " + i13 + ", filePath = " + str);
            AbstractC32273e3.f148885y.uploadCallGroupLog(i11, j11, i12, j12, i13, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "voiceUploadCallStat error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void m156169L3(int i11, int i12, int i13, String str, String str2, String str3, List list) {
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 6);
            hashMap.put("selectedProfiles", list);
            hashMap.put("maxUser", Integer.valueOf(i12));
            hashMap.put("groupId", Integer.valueOf(i13));
            hashMap.put("groupName", str);
            hashMap.put("source", Integer.valueOf(i11));
            hashMap.put("groupAvatar", str2);
            hashMap.put("data", str3);
            hashMap.put("SubmitLogWhenFail", Boolean.TRUE);
            m155943z0(hashMap, this.f148897k);
            return;
        }
        if (m156203R3() && this.f148895i != null) {
            try {
                if (m156165H3()) {
                    AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "Receive Make call while in busy state -> Just return!!!");
                    return;
                }
                boolean z11 = false;
                C23744a.m124114c().m124116d(10037, new Object[0]);
                m156164G3(true, false, list, null, i12, i13, str, str2, str3);
                C19577z.m102341J().m102425j1(i11);
                if (AbstractC3108t.m15712a(AbstractC3096i0.m15574y(), AbstractC3108t.f13194b) == 0) {
                    AbstractC3096i0.f13169m = false;
                    mo155909q0(true);
                }
                C32328p3.m156358e().m156365h(false);
                C22592c m156362c = C32328p3.m156358e().m156362c();
                m156362c.m116876Z(1);
                m156362c.m116873W(true);
                m156362c.m116882c0(true);
                if (i13 != 0) {
                    z11 = true;
                }
                m156362c.m116849G0(z11);
                m156362c.m116906o0(i13);
                m156362c.m116875Y(C19577z.m102341J().m102449x());
                m156362c.m116908p0(C19577z.m102341J().m102370G());
                m156362c.m116904n0(str2);
                m156362c.m116918u0(C19577z.m102341J().m102374I());
                m156362c.m116888f0(C8937j0.m47663l("call_video_call_group"));
                this.f148897k.sendMessage(this.f148897k.obtainMessage(1000));
                return;
            } catch (Exception e11) {
                C19577z.m102341J().m102432n1();
                C19577z.m102341J().m102380L0();
                AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "makeZaloCallMainThread : " + e11.getMessage(), e11);
                return;
            }
        }
        AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "makeZaloCall fail because startVoip failed");
    }

    /* renamed from: Q3 */
    private void m156172Q3() {
        ZaloBubbleActivity.m57031a5();
        Intent m15533d0 = AbstractC3096i0.m15533d0();
        AbstractC3096i0.f13166j = false;
        AbstractC3096i0.f13167k = 0;
        AbstractC3096i0.f13170n = false;
        AbstractC3096i0.m15574y().startActivity(m15533d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3 */
    public void m156191n3(boolean z11) {
        int i11;
        int m102372H = C19577z.m102341J().m102372H();
        int m102449x = C19577z.m102341J().m102449x();
        int m102405Z = C19577z.m102341J().m102405Z();
        int m102445v = C19577z.m102341J().m102445v();
        int m102409b0 = C19577z.m102341J().m102409b0();
        if (m102405Z == 7) {
            i11 = 3;
        } else if (m102405Z < 7) {
            i11 = 2;
        } else {
            i11 = 4;
        }
        int m102388Q = C19577z.m102341J().m102388Q();
        if (z11) {
            m156207s3(m102372H, m102449x, m102388Q, i11, m102445v, m102409b0, "");
        } else {
            m156204m3(m102372H, m102449x, m102388Q, i11, m102445v, m102409b0, "");
        }
    }

    /* renamed from: p3 */
    private void m156192p3(int i11, int i12, int i13, int i14, String str, String str2) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupAnswerCall: ");
        try {
            AbstractC32273e3.f148885y.groupAnswerCall(new n(i14, str, i12, i11, i13, System.currentTimeMillis()), i11, i12, i13, str, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupAnswerCall error Exception", e11);
        }
    }

    /* renamed from: r3 */
    private void m156193r3(int i11, int i12, String str, int i13, int i14, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupMakeRequest: ");
        try {
            AbstractC32273e3.f148885y.groupRequestCall(new j(currentTimeMillis, i11), i11, i12, str, i13, i14, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupMakeRequest error Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t3 */
    public void m156194t3(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONObject jSONObject = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                jSONObject.put("" + jSONArray.getInt(i11), -1000);
            }
            C19577z.m102341J().m102418g0(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u3 */
    private void m156195u3(C22595d0 c22595d0) {
        C32328p3.m156358e().m156362c().m116916t0(153);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callType", 1);
            jSONObject.put("maxUsers", c22595d0.f110634k);
            jSONObject.put("status", 1);
            jSONObject.put("groupId", c22595d0.f110631h);
            jSONObject.put("platform", 1);
            jSONObject.put("audiostate", 0);
            jSONObject.put("videostate", AbstractC23304d.f113327S1 ? 1 : 0);
            C32328p3.m156358e().m156362c().m116924x0(false);
            m156192p3(c22595d0.f110632i, c22595d0.f110633j, C19577z.m102341J().m102388Q(), 1, c22595d0.f110639p, jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3 */
    public void m156196v3(int i11, String str) {
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "471 Receiver REC sender: " + i11 + " value: " + str);
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 471);
        if (!(m15508P0 instanceof C22593c0)) {
            return;
        }
        C22593c0 c22593c0 = (C22593c0) m15508P0;
        C19577z.m102341J().m102363C0(new C19544g(471, 0, c22593c0.f110625f, c22593c0.f110623d, c22593c0.f110626g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3 */
    public void m156197w3(int i11) {
        mo155938y();
        C32328p3.m156358e().m156362c().m116896j0(i11);
        mo116930b(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3 */
    public void m156198x3(int i11, String str) {
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 452);
        if (!(m15508P0 instanceof C22607j0)) {
            return;
        }
        AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Send GROUP_RING_RING return: " + str);
        C22607j0 c22607j0 = (C22607j0) m15508P0;
        if (m155778A(452, i11, c22607j0.f110715d, c22607j0.f110716e)) {
            return;
        }
        C19577z.m102341J().m102363C0(new C19568s(452, c22607j0.f110711c, i11, c22607j0.f110715d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y3 */
    public void m156199y3(C22603h0 c22603h0) {
        HandlerC32324p.m156351d(new c(c22603h0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z3 */
    public void m156200z3(int i11, String str) {
        AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 454);
        if (!(m15508P0 instanceof C22631y)) {
            return;
        }
        C22631y c22631y = (C22631y) m15508P0;
        if (c22631y.f110991g == C19577z.m102341J().m102388Q()) {
            return;
        }
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "handleVoiceAnswer: senderID = " + c22631y.f110991g);
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "handleVoiceAnswer: senderID = " + c22631y.f110991g + ", value = " + str);
        if (!m155778A(466, c22631y.f110991g, c22631y.f110988d, c22631y.f110990f) && c22631y.f110988d == C19577z.m102341J().m102449x() && AbstractC3096i0.m15546k(m15508P0)) {
            try {
                C19577z.m102341J().m102363C0(new C19536c(c22631y.f110991g, c22631y.f110988d, c22631y.f110711c, 0, c22631y.f110989e, c22631y.f110994j, c22631y.f110995k, c22631y.f110990f));
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "handleVoiceAnswer: " + e11.getMessage(), e11);
            }
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: A0 */
    void mo155779A0() {
        if (this.f148897k != null) {
            return;
        }
        this.f148897k = new g(C2793a.f11144a.m13457b());
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: A2 */
    public void mo155781A2(String str, int i11) {
        if (C19577z.m102341J().m102440s0()) {
            m155918s2(true, i11);
            C19577z.m102341J().m102426k1(1);
            mo155927v();
        } else if (C19577z.m102341J().m102405Z() != 0 && C19577z.m102341J().m102405Z() != 8) {
            m155918s2(true, i11);
            C19577z.m102341J().m102426k1(1);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: B2 */
    public void mo155785B2(String str, int i11) {
        if (C19577z.m102341J().m102440s0()) {
            m155918s2(false, i11);
            C19577z.m102341J().m102426k1(0);
            mo155927v();
        } else if (C19577z.m102341J().m102405Z() != 0 && C19577z.m102341J().m102405Z() != 8) {
            m155918s2(false, i11);
            C19577z.m102341J().m102426k1(0);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: H1 */
    public void mo155808H1() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: L1 */
    public void mo155823L1(int i11) {
        if (this.f149117D == null) {
            this.f149117D = new b(i11);
        }
        this.f149118E = System.currentTimeMillis();
        HandlerC32324p.m156351d(this.f149117D);
    }

    /* renamed from: N3 */
    public synchronized boolean m156201N3(C22592c c22592c) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c22592c != null && (!c22592c.m116842D() || this.f149114A + 1500 < elapsedRealtime)) {
                if (!AbstractC3096i0.f13163g) {
                    C32318n3.m156214E().m156258V();
                }
                AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "Anounce call activity");
                AbstractC3096i0.f13160d = true;
                C32319o.m156293t().m156322k0(c22592c.m116842D());
                VoipAudioHelper.f148751a.m155637p0(AbstractC3096i0.m15574y(), true, c22592c.m116842D());
                if (!c22592c.m116842D() && !AbstractC3096i0.f13163g && !c22592c.m116864O()) {
                    if (!AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
                        C32319o.m156293t().m156325n0(0);
                        new C22080b().m101504a();
                    } else {
                        C32319o.m156293t().m156305T(1);
                    }
                }
                C19577z.m102341J().m102384N0();
                boolean m15540h = AbstractC3096i0.m15540h();
                if (AbstractC3103o.m15619h(29)) {
                    if (m15540h) {
                        m156172Q3();
                    }
                } else {
                    m156172Q3();
                }
                AbstractC3096i0.m15510Q0(true);
                this.f149114A = elapsedRealtime;
                return true;
            }
            return false;
        } catch (Exception e11) {
            C32319o.m156293t().m156326o0();
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "launchCallHandler : " + e11.getMessage(), e11);
            return false;
        } finally {
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: O0 */
    public void mo155834O0(int i11, int i12, List list, int i13, String str, int i14, String str2) {
        if (m156165H3()) {
            AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "Can't join group call (cmd 457) while in busy state -> Just return!!!");
            return;
        }
        if (!m155830N0()) {
            HashMap hashMap = new HashMap();
            hashMap.put("typeCall", 8);
            hashMap.put("selectedProfiles", list);
            hashMap.put("groupName", str);
            hashMap.put("groupId", Integer.valueOf(i13));
            hashMap.put("source", Integer.valueOf(i14));
            hashMap.put("zaloCallId", Integer.valueOf(i11));
            hashMap.put("hostId", Integer.valueOf(i12));
            hashMap.put("data", str2);
            hashMap.put("SubmitLogWhenFail", Boolean.TRUE);
            m155943z0(hashMap, this.f148897k);
            return;
        }
        if (m156203R3() && this.f148895i != null) {
            boolean z11 = false;
            C23744a.m124114c().m124116d(10037, new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.mo2478b());
                if (m141811g == null) {
                    m141811g = new ContactProfile(contactProfile.mo2478b());
                }
                arrayList.add(m141811g);
            }
            AbstractC3096i0.f13163g = true;
            m156164G3(false, true, arrayList, null, C19637j.f97466a.m102831L(), i13, str, "", str2);
            C19577z.m102341J().m102391R0(i11);
            C19577z.m102341J().m102425j1(i14);
            C19577z.m102341J().m102426k1(AbstractC23304d.f113327S1 ? 1 : 0);
            if (AbstractC3108t.m15712a(AbstractC3096i0.m15574y(), AbstractC3108t.f13194b) == 0) {
                AbstractC3096i0.f13169m = false;
                C19577z.m102341J().m102361B0(new C19560o(i11, i12, i14, C19577z.m102341J().m102409b0(), str2));
            }
            C32328p3.m156358e().m156365h(false);
            C22592c m156362c = C32328p3.m156358e().m156362c();
            m156362c.m116876Z(1);
            m156362c.m116914s0(true);
            m156362c.m116873W(true);
            m156362c.m116882c0(false);
            m156362c.m116906o0(i13);
            if (i13 != 0) {
                z11 = true;
            }
            m156362c.m116849G0(z11);
            m156362c.m116875Y(i11);
            m156362c.m116908p0(C19577z.m102341J().m102370G());
            m156362c.m116918u0(C19577z.m102341J().m102374I());
            m156362c.m116888f0(C8937j0.m47663l("call_video_call_group"));
            this.f148897k.sendMessage(this.f148897k.obtainMessage(1000));
            return;
        }
        AbstractC3082b0.m15422d("VOIP_GROUP_CONTROLLER", "joinGroupCall fail because startVoip failed");
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: P */
    public StateFlow mo155837P() {
        return StateFlowKt.m113503a(InterfaceC25444b.b.f121841p);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: P0 */
    public void mo155838P0(final boolean z11) {
        if (C19577z.m102341J().m102440s0()) {
            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.g3
                @Override // java.lang.Runnable
                public final void run() {
                    C32308l3.m156168K3(z11);
                }
            });
            C19577z.m102341J().m102426k1(!z11 ? 1 : 0);
            if (z11) {
                mo155901n1(EnumC17859r.START_CAPTURE.ordinal());
            }
            mo155927v();
        }
    }

    /* renamed from: P3 */
    public void m156202P3(boolean z11) {
        if (!mo155791D0()) {
            return;
        }
        ZaloBubbleActivity.m57031a5();
        try {
            Intent m15533d0 = AbstractC3096i0.m15533d0();
            m15533d0.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI", z11);
            PendingIntent.getActivity(AbstractC3096i0.m15574y(), 1, m15533d0, AbstractC19601a.m102572b(0)).send();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "showCallActivity: " + e11.getMessage(), e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Q1 */
    public void mo155841Q1(int i11, int i12, int i13, int i14, String str) {
        int intValue = Integer.valueOf(AbstractC23304d.f113368c0.f42434r).intValue();
        try {
            AbstractC32273e3.f148885y.groupJoin(new h(i11, System.currentTimeMillis()), intValue, i11, i12, i13, i14, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "joinGroupCall error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: R2 */
    public void mo155844R2(final int i11, final long j11, final int i12, final long j12, final int i13, final String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.h3
            @Override // java.lang.Runnable
            public final void run() {
                C32308l3.m156170M3(i11, j11, i12, j12, i13, str);
            }
        });
    }

    /* renamed from: R3 */
    public synchronized boolean m156203R3() {
        try {
            if (AbstractC32273e3.f148885y == null) {
                return false;
            }
            if (AbstractC23304d.f113368c0 == null) {
                return false;
            }
            this.f148895i = new ContactProfile(AbstractC23304d.f113368c0);
            AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "getContactProfile: " + this.f148895i.m40373K());
            AbstractC3082b0.m15424f("VOIP_GROUP_CONTROLLER", "Start VOIP success");
            C19577z.m102341J().m102411c1(Integer.parseInt(this.f148895i.f42434r));
            return true;
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "Start VOIP failed", e11);
            return false;
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: S */
    public ArrayList mo155845S() {
        return null;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: V1 */
    public void mo155854V1() {
        m156193r3(C19577z.m102341J().m102449x(), C19577z.m102341J().m102358A(), C19577z.m102341J().m102362C(), C19577z.m102341J().m102390R(), C19577z.m102341J().m102403Y(), C19577z.m102341J().m102364D());
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: W */
    public C25948l mo155855W() {
        return this.f149116C;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: W1 */
    public void mo155856W1(int i11, int i12, int i13) {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: X */
    public void mo155857X() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: X1 */
    public void mo155858X1(C22621q0 c22621q0) {
        int i11;
        int i12;
        C19577z m102341J = C19577z.m102341J();
        int m116979b = (int) c22621q0.m116979b();
        long j11 = m116979b;
        int m156205o3 = m156205o3(j11);
        int m116990m = c22621q0.m116990m();
        int m116984g = c22621q0.m116984g();
        int m102388Q = m102341J.m102388Q();
        String m102394T = m102341J.m102394T();
        long m102377K = m102341J.m102377K();
        String m102450y = C19577z.m102341J().m102450y();
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "sendVoiceFinishCall dur = " + m116979b + ", callId = " + m116990m);
        if (c22621q0.m116997t()) {
            int m116986i = c22621q0.m116986i();
            if (m116979b > 0 && m116990m != 0) {
                m156206q3(m116990m, m102388Q, m102394T, m116986i, m156205o3, m116984g, m102377K, m102450y, 1);
                String m102451z = m102341J.m102451z();
                if (!TextUtils.isEmpty(m102451z)) {
                    AbstractC32273e3.m155748Q().mo155844R2(m116990m, j11, m116984g, m102377K, m102388Q, m102451z);
                }
            }
        } else {
            int i13 = 299;
            if (c22621q0.m116995r()) {
                int m116985h = c22621q0.m116985h();
                if (m116985h != -2) {
                    if (m116985h != -1) {
                        if (m116985h != 99) {
                            i13 = 0;
                        }
                    } else {
                        i13 = 101;
                    }
                } else {
                    i13 = 102;
                }
                if (i13 == 0 && c22621q0.m116985h() < 0) {
                    i13 = c22621q0.m116985h();
                }
                if (i13 == 0) {
                    if (c22621q0.m116988k() >= 2) {
                        i12 = 104;
                    } else {
                        i12 = 103;
                    }
                } else {
                    i12 = i13;
                }
                if (i12 < 0 || (i12 >= 100 && i12 < 300)) {
                    m156206q3(m116990m, m102388Q, m102394T, i12, m156205o3, m116984g, m102377K, m102450y, 1);
                }
            } else {
                int m116985h2 = c22621q0.m116985h();
                if (m116985h2 == 99) {
                    i11 = 299;
                } else {
                    i11 = m116985h2;
                }
                if (i11 >= 0 && (i11 < 150 || i11 >= 300)) {
                    if (C19561o0.m102161L().m102230V() == 1) {
                        m156206q3(m116990m, m102388Q, m102394T, 109, m156205o3, m116984g, m102341J.m102377K(), m102450y, 1);
                    }
                } else {
                    m156206q3(m116990m, m102388Q, m102394T, i11, m156205o3, m116984g, m102377K, m102450y, 1);
                }
            }
        }
        m102341J.m102382M0();
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: Z */
    public int mo155860Z() {
        if (mo155791D0()) {
            return C19577z.m102341J().m102449x();
        }
        return 0;
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: a */
    public void mo116929a(int i11, int i12) {
        if (i11 == 100) {
            C32328p3.m156358e().m156362c().m116894i0(true);
        }
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "immediateHangUp status = " + i11);
        C19577z.m102341J().m102361B0(new C19548i(455, i11));
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: b */
    public void mo116930b(int i11) {
        mo116929a(i11, 0);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: b0 */
    public void mo155866b0(int i11, String str, int i12, int i13, int i14, String str2, String str3) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupAddUser: ");
        try {
            AbstractC32273e3.f148885y.groupAddUser(new a(str3), i11, str, i12, i13, i14, str2, str3);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupAddUser error Exception", e11);
        }
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: c */
    public boolean mo116931c(int i11) {
        if (!C8937j0.m47663l("micro_call_group")) {
            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_micro_block_title));
            return false;
        }
        C19577z.m102341J().m102361B0(new C19548i(4542));
        return false;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: c0 */
    public void mo155869c0(int i11) {
        AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "groupAnswerCall status: " + i11);
        C19577z m102341J = C19577z.m102341J();
        JSONObject jSONObject = new JSONObject();
        try {
            int i12 = 1;
            jSONObject.put("callType", 1);
            jSONObject.put("maxUsers", m102341J.m102390R());
            jSONObject.put("status", i11);
            jSONObject.put("groupId", m102341J.m102368F());
            jSONObject.put("platform", 1);
            jSONObject.put("audiostate", 0);
            jSONObject.put("videostate", AbstractC23304d.f113327S1 ? 1 : 0);
            if (!AbstractC23304d.f113327S1 && !C32328p3.m156358e().m156362c().m116850H()) {
                i12 = 0;
            }
            m102341J.m102426k1(i12);
            m156192p3(m102341J.m102372H(), m102341J.m102449x(), m102341J.m102388Q(), i11, m102341J.m102394T(), jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: c1 */
    public void mo155870c1(final int i11, final int i12, final int i13, final String str, final String str2, final String str3, final List list) {
        if (AbstractC19444a.m101693a()) {
            m156169L3(i11, i12, i13, str, str2, str3, list);
        } else {
            m155827M1(new Runnable() { // from class: zm.voip.service.i3
                @Override // java.lang.Runnable
                public final void run() {
                    C32308l3.this.m156169L3(i11, i12, i13, str, str2, str3, list);
                }
            });
        }
    }

    @Override // lo0.InterfaceC22594d
    /* renamed from: d */
    public void mo116932d(boolean z11) {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: d0 */
    public void mo155872d0(int i11, int i12, int i13, String str, String str2) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupCancelRequest: ");
        try {
            AbstractC32273e3.f148885y.groupCancelCall(new m(), i11, i12, i13, str, str2);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupCancelRequest error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: e0 */
    public void mo155875e0(int i11, int i12, int i13, int i14, int i15, String str) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupEndCall: ");
        try {
            AbstractC32273e3.f148885y.groupEndCall(new o(), i11, i12, i13, i14, i15, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupEndCall error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: e2 */
    public void mo155877e2(boolean z11) {
        try {
            AbstractC3082b0.m15421c("VOIP_GROUP_CONTROLLER", "setStateInCallToZaloProcess start = " + z11 + " -- partnerId = -1");
            IVoipZalo iVoipZalo = AbstractC32273e3.f148885y;
            if (iVoipZalo != null) {
                iVoipZalo.setStateInCall(z11, "-1");
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "setStateInCall error ", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: f0 */
    public void mo155878f0(int i11, String str, int i12, int i13, String str2, String str3, int i14) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupInitZRTPRequest: userId = " + i11 + " sessionId = " + str + " callType=" + i13 + " data = " + str2 + " groupId = " + i14);
        try {
            AbstractC32273e3.f148885y.groupInitCall(new k(i12, System.currentTimeMillis()), i11, str, i12, i13, str2, str3, i14);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupInitZRTPRequest error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: g0 */
    public void mo155881g0(int i11, int i12, int i13, int i14, String str) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupRingRingRequest: ");
        try {
            AbstractC32273e3.f148885y.groupSentRingRing(new l(i11), i11, i12, i13, i14, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupRingRingRequest error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: g2 */
    public void mo155883g2(Object obj, boolean z11, int i11) {
        HandlerC32324p.m156351d(new i(obj, z11, i11));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: k1 */
    public void mo155892k1(int i11, int i12, int i13) {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: k2 */
    public void mo155893k2() {
        m156202P3(false);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: l2 */
    public void mo155896l2() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: m2 */
    public void mo155899m2() {
        this.f148897k.sendEmptyMessageDelayed(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 300L);
    }

    /* renamed from: m3 */
    public void m156204m3(int i11, int i12, int i13, int i14, int i15, int i16, String str) {
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "broadCastState: ");
        try {
            AbstractC32273e3.f148885y.broadCastState(new e(), i11, i12, i13, i14, i15, i16, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "broadCastState error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: n1 */
    public void mo155901n1(int i11) {
        C23744a.m124114c().m124116d(10018, Integer.valueOf(i11));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: o1 */
    public void mo155904o1(int i11) {
        C23744a.m124114c().m124116d(10019, Integer.valueOf(i11));
    }

    /* renamed from: o3 */
    public int m156205o3(long j11) {
        if (j11 < 0 || j11 >= 500000) {
            try {
                long m102447w = C19577z.m102341J().m102447w();
                if (m102447w != 0) {
                    j11 = (int) ((SystemClock.elapsedRealtime() - m102447w) / 1000);
                }
            } catch (Exception unused) {
            }
            if (j11 < 0 || j11 >= 500000) {
                j11 = 0;
            }
        }
        return (int) j11;
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: p1 */
    public void mo155907p1(int i11) {
        C23744a.m124114c().m124116d(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, Integer.valueOf(i11));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: p2 */
    public void mo155908p2() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: q0 */
    public void mo155909q0(boolean z11) {
        try {
            C19577z.m102341J().m102361B0(new C19548i(450));
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "handleSendVoiceRequestCall fail : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: q3 */
    public void m156206q3(int i11, int i12, String str, int i13, int i14, int i15, long j11, String str2, int i16) {
        String str3;
        String str4;
        AbstractC3079a.m15406a("VOIP_GROUP_CONTROLLER", "groupFinishCall: " + i11);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        try {
            AbstractC32273e3.f148885y.groupSendLogCall(new f(), i11, i12, str4, i13, i14, i15, j11, str3, i16);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupFinishCall error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: r2 */
    public void mo155914r2() {
        this.f148897k.sendEmptyMessage(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: s */
    public void mo155915s(Object obj, int i11, int i12) {
        if (obj instanceof C22592c) {
            C22592c c22592c = (C22592c) obj;
            if (!c22592c.m116842D() && c22592c.m116838B()) {
                C32319o.m156293t().m156328q0();
            }
        }
    }

    /* renamed from: s3 */
    public void m156207s3(int i11, int i12, int i13, int i14, int i15, int i16, String str) {
        try {
            AbstractC32273e3.f148885y.groupPing(new d(), i11, i12, i13, i14, i15, i16, str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GROUP_CONTROLLER", "groupPing error Exception", e11);
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t0 */
    public void mo155920t0(int i11, int i12, String str) {
        if (i11 == 402) {
            if (mo155791D0()) {
                C22592c m156362c = C32328p3.m156358e().m156362c();
                if (m156362c != null && m156362c.m116868R()) {
                    AbstractC32273e3.f148886z = false;
                    AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
                    return;
                } else {
                    AbstractC32273e3.m155750R(false).mo155920t0(i11, i12, str);
                    return;
                }
            }
            AbstractC32273e3.f148886z = false;
            AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
            return;
        }
        if (i11 != 462) {
            switch (i11) {
                case 465:
                case 466:
                case 467:
                case 468:
                case 469:
                case 470:
                case 471:
                    break;
                default:
                    return;
            }
        }
        this.f148897k.sendMessage(this.f148897k.obtainMessage(i11, i12, 0, str));
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: t2 */
    public void mo155922t2() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: u0 */
    public void mo155924u0(final int i11, final int i12, final String str) {
        if (AbstractC32273e3.m155750R(false).m155787C0(i11)) {
            this.f148897k.post(new Runnable() { // from class: zm.voip.service.j3
                @Override // java.lang.Runnable
                public final void run() {
                    C32308l3.this.m156167J3(i11, i12, str);
                }
            });
        } else if (this.f148896j.contains(Integer.valueOf(i11))) {
            Handler handler = this.f148897k;
            handler.sendMessage(handler.obtainMessage(i11, i12, 1, str));
        }
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: v */
    public void mo155927v() {
        m156191n3(false);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: v0 */
    public void mo155928v0() {
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: x */
    public void mo155934x() {
        this.f148897k.removeMessages(1000);
    }

    @Override // zm.voip.service.AbstractC32273e3
    /* renamed from: y */
    public void mo155938y() {
        try {
            Runnable runnable = this.f149117D;
            if (runnable != null) {
                HandlerC32324p.m156348a(runnable);
                this.f149117D = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
