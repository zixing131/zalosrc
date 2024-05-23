package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class qj1 extends v31 {

    /* renamed from: G */
    public static final c83 f26798G = c83.m20825C("3010", "3008", "1005", "1009", "2011", "2007");

    /* renamed from: A */
    private final Context f26799A;

    /* renamed from: B */
    private final sj1 f26800B;

    /* renamed from: C */
    private final qa2 f26801C;

    /* renamed from: D */
    private final Map f26802D;

    /* renamed from: E */
    private final List f26803E;

    /* renamed from: F */
    private final C4954rp f26804F;

    /* renamed from: i */
    private final Executor f26805i;

    /* renamed from: j */
    private final vj1 f26806j;

    /* renamed from: k */
    private final dk1 f26807k;

    /* renamed from: l */
    private final wk1 f26808l;

    /* renamed from: m */
    private final ak1 f26809m;

    /* renamed from: n */
    private final hk1 f26810n;

    /* renamed from: o */
    private final d04 f26811o;

    /* renamed from: p */
    private final d04 f26812p;

    /* renamed from: q */
    private final d04 f26813q;

    /* renamed from: r */
    private final d04 f26814r;

    /* renamed from: s */
    private final d04 f26815s;

    /* renamed from: t */
    private sl1 f26816t;

    /* renamed from: u */
    private boolean f26817u;

    /* renamed from: v */
    private boolean f26818v;

    /* renamed from: w */
    private boolean f26819w;

    /* renamed from: x */
    private final li0 f26820x;

    /* renamed from: y */
    private final C4830od f26821y;

    /* renamed from: z */
    private final zzcgv f26822z;

    public qj1(u31 u31Var, Executor executor, vj1 vj1Var, dk1 dk1Var, wk1 wk1Var, ak1 ak1Var, hk1 hk1Var, d04 d04Var, d04 d04Var2, d04 d04Var3, d04 d04Var4, d04 d04Var5, li0 li0Var, C4830od c4830od, zzcgv zzcgvVar, Context context, sj1 sj1Var, qa2 qa2Var, C4954rp c4954rp) {
        super(u31Var);
        this.f26805i = executor;
        this.f26806j = vj1Var;
        this.f26807k = dk1Var;
        this.f26808l = wk1Var;
        this.f26809m = ak1Var;
        this.f26810n = hk1Var;
        this.f26811o = d04Var;
        this.f26812p = d04Var2;
        this.f26813q = d04Var3;
        this.f26814r = d04Var4;
        this.f26815s = d04Var5;
        this.f26820x = li0Var;
        this.f26821y = c4830od;
        this.f26822z = zzcgvVar;
        this.f26799A = context;
        this.f26800B = sj1Var;
        this.f26801C = qa2Var;
        this.f26802D = new HashMap();
        this.f26803E = new ArrayList();
        this.f26804F = c4954rp;
    }

    /* renamed from: A */
    public final synchronized void m25735O(sl1 sl1Var) {
        Iterator<String> keys;
        View view;
        InterfaceC4681kd m25160c;
        try {
            if (this.f26817u) {
                return;
            }
            this.f26816t = sl1Var;
            this.f26808l.m27647e(sl1Var);
            this.f26807k.mo21444M(sl1Var.zzf(), sl1Var.zzm(), sl1Var.zzn(), sl1Var, sl1Var);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21259h2)).booleanValue() && (m25160c = this.f26821y.m25160c()) != null) {
                m25160c.zzn(sl1Var.zzf());
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21428y1)).booleanValue()) {
                iq2 iq2Var = this.f29153b;
                if (iq2Var.f22338m0 && (keys = iq2Var.f22336l0.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.f26816t.zzl().get(next);
                        this.f26802D.put(next, Boolean.FALSE);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            ViewOnAttachStateChangeListenerC4917qp viewOnAttachStateChangeListenerC4917qp = new ViewOnAttachStateChangeListenerC4917qp(this.f26799A, view);
                            this.f26803E.add(viewOnAttachStateChangeListenerC4917qp);
                            viewOnAttachStateChangeListenerC4917qp.m25850c(new pj1(this, next));
                        }
                    }
                }
            }
            if (sl1Var.zzi() != null) {
                sl1Var.zzi().m25850c(this.f26820x);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public final void m25736P(sl1 sl1Var) {
        this.f26807k.mo21439H(sl1Var.zzf(), sl1Var.zzl());
        if (sl1Var.zzh() != null) {
            sl1Var.zzh().setClickable(false);
            sl1Var.zzh().removeAllViews();
        }
        if (sl1Var.zzi() != null) {
            sl1Var.zzi().m25852e(this.f26820x);
        }
        this.f26816t = null;
    }

    /* renamed from: I */
    public static /* synthetic */ void m25722I(qj1 qj1Var) {
        try {
            vj1 vj1Var = qj1Var.f26806j;
            int m27242K = vj1Var.m27242K();
            if (m27242K != 1) {
                if (m27242K != 2) {
                    if (m27242K != 3) {
                        if (m27242K != 6) {
                            if (m27242K != 7) {
                                yk0.zzg("Wrong native template id!");
                                return;
                            }
                            hk1 hk1Var = qj1Var.f26810n;
                            if (hk1Var.m22954g() != null) {
                                hk1Var.m22954g().mo26573X((p60) qj1Var.f26814r.zzb());
                                return;
                            }
                            return;
                        }
                        if (qj1Var.f26810n.m22953f() != null) {
                            qj1Var.m25732L("Google", true);
                            qj1Var.f26810n.m22953f().mo20861s3((j20) qj1Var.f26813q.zzb());
                            return;
                        }
                        return;
                    }
                    if (qj1Var.f26810n.m22951d(vj1Var.m27270g0()) != null) {
                        if (qj1Var.f26806j.m27257Z() != null) {
                            qj1Var.m25732L("Google", true);
                        }
                        qj1Var.f26810n.m22951d(qj1Var.f26806j.m27270g0()).mo25628y4((e10) qj1Var.f26815s.zzb());
                        return;
                    }
                    return;
                }
                if (qj1Var.f26810n.m22948a() != null) {
                    qj1Var.m25732L("Google", true);
                    qj1Var.f26810n.m22948a().mo22674d1((z00) qj1Var.f26812p.zzb());
                    return;
                }
                return;
            }
            if (qj1Var.f26810n.m22949b() != null) {
                qj1Var.m25732L("Google", true);
                qj1Var.f26810n.m22949b().mo23794m0((b10) qj1Var.f26811o.zzb());
            }
        } catch (RemoteException e11) {
            yk0.zzh("RemoteException when notifyAdLoad is called", e11);
        }
    }

    /* renamed from: w */
    public static boolean m25723w(View view) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21335o8)).booleanValue()) {
            zzt.zzp();
            long zzt = zzs.zzt(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (zzt >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21345p8)).intValue()) {
                    return true;
                }
            }
            return false;
        }
        if (!view.isShown() || !view.getGlobalVisibleRect(new Rect(), null)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private final synchronized View m25724y(Map map) {
        if (map == null) {
            return null;
        }
        c83 c83Var = f26798G;
        int size = c83Var.size();
        int i11 = 0;
        while (i11 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) c83Var.get(i11));
            i11++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    /* renamed from: z */
    private final synchronized void m25725z(View view, Map map, Map map2) {
        this.f26808l.m27646d(this.f26816t);
        this.f26807k.mo21438G(view, map, map2);
        this.f26818v = true;
    }

    /* renamed from: C */
    public final sj1 m25726C() {
        return this.f26800B;
    }

    /* renamed from: E */
    public final String m25727E() {
        return this.f26809m.mo20162b();
    }

    /* renamed from: G */
    public final synchronized JSONObject m25728G(View view, Map map, Map map2) {
        return this.f26807k.mo21441J(view, map, map2);
    }

    /* renamed from: H */
    public final synchronized JSONObject m25729H(View view, Map map, Map map2) {
        return this.f26807k.mo21447P(view, map, map2);
    }

    /* renamed from: J */
    public final void m25730J(View view) {
        InterfaceC4271b m27262c0 = this.f26806j.m27262c0();
        if (this.f26809m.mo20164d() && m27262c0 != null && view != null) {
            zzt.zzA();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() && rx2.m26203b()) {
                Object m19914Q = BinderC4273d.m19914Q(m27262c0);
                if (m19914Q instanceof tx2) {
                    ((tx2) m19914Q).mo26793b(view, zx2.NOT_VISIBLE, "Ad overlay");
                }
            }
        }
    }

    /* renamed from: K */
    public final synchronized void m25731K() {
        this.f26807k.zzg();
    }

    /* renamed from: L */
    public final void m25732L(String str, boolean z11) {
        boolean z12;
        boolean z13;
        String str2;
        a32 a32Var;
        b32 b32Var;
        String str3;
        if (this.f26809m.mo20164d() && !TextUtils.isEmpty(str)) {
            vj1 vj1Var = this.f26806j;
            zq0 m27256Y = vj1Var.m27256Y();
            zq0 m27257Z = vj1Var.m27257Z();
            if (m27256Y == null && m27257Z == null) {
                yk0.zzj("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z14 = false;
            if (m27256Y != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (m27257Z != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21291k4)).booleanValue()) {
                this.f26809m.mo20161a();
                int m22516b = this.f26809m.mo20161a().m22516b();
                int i11 = m22516b - 1;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (m22516b != 1) {
                            if (m22516b != 2) {
                                str3 = "UNKNOWN";
                            } else {
                                str3 = "DISPLAY";
                            }
                        } else {
                            str3 = "VIDEO";
                        }
                        yk0.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                        return;
                    }
                    if (m27256Y != null) {
                        z14 = true;
                        z13 = false;
                    } else {
                        yk0.zzj("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (m27257Z != null) {
                    z13 = true;
                } else {
                    yk0.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z14 = z12;
            }
            if (z14) {
                str2 = null;
            } else {
                str2 = "javascript";
                m27256Y = m27257Z;
            }
            String str4 = str2;
            m27256Y.mo26701m();
            if (!zzt.zzA().mo27818d(this.f26799A)) {
                yk0.zzj("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzcgv zzcgvVar = this.f26822z;
            String str5 = zzcgvVar.f32031q + "." + zzcgvVar.f32032r;
            if (z13) {
                a32Var = a32.VIDEO;
                b32Var = b32.DEFINED_BY_JAVASCRIPT;
            } else {
                a32Var = a32.NATIVE_DISPLAY;
                if (this.f26806j.m27242K() == 3) {
                    b32Var = b32.UNSPECIFIED;
                } else {
                    b32Var = b32.ONE_PIXEL;
                }
            }
            InterfaceC4271b mo27816b = zzt.zzA().mo27816b(str5, m27256Y.mo26701m(), "", "javascript", str4, str, b32Var, a32Var, this.f29153b.f22340n0);
            if (mo27816b == null) {
                yk0.zzj("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.f26806j.m27240B(mo27816b);
            m27256Y.mo26698g0(mo27816b);
            if (z13) {
                zzt.zzA().mo27817c(mo27816b, m27257Z.mo23737i());
                this.f26819w = true;
            }
            if (z11) {
                zzt.zzA().zzd(mo27816b);
                m27256Y.mo23552V("onSdkLoaded", new C30239a());
            }
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m25733M() {
        this.f26807k.zzh();
        this.f26806j.m27269g();
    }

    /* renamed from: N */
    public final /* synthetic */ void m25734N(boolean z11) {
        this.f26807k.mo21440I(this.f26816t.zzf(), this.f26816t.zzl(), this.f26816t.zzm(), z11);
    }

    /* renamed from: Q */
    public final synchronized void m25737Q(View view, Map map, Map map2, boolean z11) {
        if (this.f26818v) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21428y1)).booleanValue() && this.f29153b.f22338m0) {
            Iterator it = this.f26802D.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.f26802D.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z11) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21180Z2)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && m25723w(view2)) {
                        m25725z(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View m25724y = m25724y(map);
        if (m25724y == null) {
            m25725z(view, map, map2);
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21190a3)).booleanValue()) {
            if (m25723w(m25724y)) {
                m25725z(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21200b3)).booleanValue()) {
            Rect rect = new Rect();
            if (m25724y.getGlobalVisibleRect(rect, null) && m25724y.getHeight() == rect.height() && m25724y.getWidth() == rect.width()) {
                m25725z(view, map, map2);
                return;
            }
            return;
        }
        m25725z(view, map, map2);
    }

    /* renamed from: R */
    public final synchronized void m25738R(zzcu zzcuVar) {
        this.f26807k.mo21433B(zzcuVar);
    }

    /* renamed from: S */
    public final synchronized void m25739S(View view, View view2, Map map, Map map2, boolean z11) {
        this.f26808l.m27645c(this.f26816t);
        this.f26807k.mo21437F(view, view2, map, map2, z11);
        if (this.f26819w) {
            vj1 vj1Var = this.f26806j;
            if (vj1Var.m27257Z() != null) {
                vj1Var.m27257Z().mo23552V("onSdkAdUserInteractionClick", new C30239a());
            }
        }
    }

    /* renamed from: T */
    public final synchronized void m25740T(String str) {
        this.f26807k.mo21436E(str);
    }

    /* renamed from: U */
    public final synchronized void m25741U(Bundle bundle) {
        this.f26807k.mo21432A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.v31
    /* renamed from: a */
    public final synchronized void mo23795a() {
        this.f26817u = true;
        this.f26805i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oj1
            public /* synthetic */ oj1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                qj1.this.m25733M();
            }
        });
        super.mo23795a();
    }

    @Override // com.google.android.gms.internal.ads.v31
    /* renamed from: b */
    public final void mo20375b() {
        this.f26805i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kj1
            public /* synthetic */ kj1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                qj1.m25722I(qj1.this);
            }
        });
        if (this.f26806j.m27242K() != 7) {
            Executor executor = this.f26805i;
            dk1 dk1Var = this.f26807k;
            dk1Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lj1
                public /* synthetic */ lj1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dk1.this.zzo();
                }
            });
        }
        super.mo20375b();
    }

    /* renamed from: h */
    public final synchronized void m25742h() {
        sl1 sl1Var = this.f26816t;
        if (sl1Var == null) {
            yk0.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f26805i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mj1

                /* renamed from: q */
                public final /* synthetic */ boolean f24599q;

                public /* synthetic */ mj1(boolean z11) {
                    r2 = z11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    qj1.this.m25734N(r2);
                }
            });
        }
    }

    /* renamed from: i */
    public final synchronized void m25743i() {
        if (this.f26818v) {
            return;
        }
        this.f26807k.zzq();
    }

    /* renamed from: j */
    public final void m25744j(View view) {
        vj1 vj1Var = this.f26806j;
        InterfaceC4271b m27262c0 = vj1Var.m27262c0();
        zq0 m27256Y = vj1Var.m27256Y();
        if (this.f26809m.mo20164d() && m27262c0 != null && m27256Y != null && view != null) {
            zzt.zzA().mo27817c(m27262c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void m25745k(View view, MotionEvent motionEvent, View view2) {
        this.f26807k.mo21435D(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void m25746l(Bundle bundle) {
        this.f26807k.mo21446O(bundle);
    }

    /* renamed from: m */
    public final synchronized void m25747m(View view) {
        this.f26807k.mo21443L(view);
    }

    /* renamed from: n */
    public final synchronized void m25748n() {
        this.f26807k.mo21448a();
    }

    /* renamed from: o */
    public final synchronized void m25749o(zzcq zzcqVar) {
        this.f26807k.mo21442K(zzcqVar);
    }

    /* renamed from: p */
    public final synchronized void m25750p(zzde zzdeVar) {
        this.f26801C.m25675a(zzdeVar);
    }

    /* renamed from: q */
    public final synchronized void m25751q(f20 f20Var) {
        this.f26807k.mo21434C(f20Var);
    }

    /* renamed from: r */
    public final synchronized void m25752r(sl1 sl1Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21408w1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nj1

                /* renamed from: q */
                public final /* synthetic */ sl1 f25214q;

                public /* synthetic */ nj1(sl1 sl1Var2) {
                    r2 = sl1Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    qj1.this.m25735O(r2);
                }
            });
        } else {
            m25735O(sl1Var2);
        }
    }

    /* renamed from: s */
    public final synchronized void m25753s(sl1 sl1Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21408w1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jj1

                /* renamed from: q */
                public final /* synthetic */ sl1 f22843q;

                public /* synthetic */ jj1(sl1 sl1Var2) {
                    r2 = sl1Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    qj1.this.m25736P(r2);
                }
            });
        } else {
            m25736P(sl1Var2);
        }
    }

    /* renamed from: t */
    public final boolean m25754t() {
        return this.f26809m.mo20165e();
    }

    /* renamed from: u */
    public final synchronized boolean m25755u() {
        return this.f26807k.zzz();
    }

    /* renamed from: v */
    public final boolean m25756v() {
        return this.f26809m.mo20164d();
    }

    /* renamed from: x */
    public final synchronized boolean m25757x(Bundle bundle) {
        if (this.f26818v) {
            return true;
        }
        boolean mo21445N = this.f26807k.mo21445N(bundle);
        this.f26818v = mo21445N;
        return mo21445N;
    }
}
