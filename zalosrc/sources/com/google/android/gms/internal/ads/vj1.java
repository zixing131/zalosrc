package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Collections;
import java.util.List;
import p665y0.C30245g;

/* loaded from: classes2.dex */
public final class vj1 {

    /* renamed from: a */
    private int f29349a;

    /* renamed from: b */
    private com.google.android.gms.ads.internal.client.zzdk f29350b;

    /* renamed from: c */
    private b00 f29351c;

    /* renamed from: d */
    private View f29352d;

    /* renamed from: e */
    private List f29353e;

    /* renamed from: g */
    private zzef f29355g;

    /* renamed from: h */
    private Bundle f29356h;

    /* renamed from: i */
    private zq0 f29357i;

    /* renamed from: j */
    private zq0 f29358j;

    /* renamed from: k */
    private zq0 f29359k;

    /* renamed from: l */
    private InterfaceC4271b f29360l;

    /* renamed from: m */
    private View f29361m;

    /* renamed from: n */
    private View f29362n;

    /* renamed from: o */
    private InterfaceC4271b f29363o;

    /* renamed from: p */
    private double f29364p;

    /* renamed from: q */
    private k00 f29365q;

    /* renamed from: r */
    private k00 f29366r;

    /* renamed from: s */
    private String f29367s;

    /* renamed from: v */
    private float f29370v;

    /* renamed from: w */
    private String f29371w;

    /* renamed from: t */
    private final C30245g f29368t = new C30245g();

    /* renamed from: u */
    private final C30245g f29369u = new C30245g();

    /* renamed from: f */
    private List f29354f = Collections.emptyList();

    /* renamed from: C */
    public static vj1 m27231C(ga0 ga0Var) {
        try {
            uj1 m27235G = m27235G(ga0Var.m22369E(), null);
            b00 m22372N = ga0Var.m22372N();
            View view = (View) m27237I(ga0Var.m22371I3());
            String zzo = ga0Var.zzo();
            List m22375X4 = ga0Var.m22375X4();
            String zzm = ga0Var.zzm();
            Bundle zzf = ga0Var.zzf();
            String zzn = ga0Var.zzn();
            View view2 = (View) m27237I(ga0Var.m22374W4());
            InterfaceC4271b zzl = ga0Var.zzl();
            String zzq = ga0Var.zzq();
            String zzp = ga0Var.zzp();
            double zze = ga0Var.zze();
            k00 m22373Q = ga0Var.m22373Q();
            vj1 vj1Var = new vj1();
            vj1Var.f29349a = 2;
            vj1Var.f29350b = m27235G;
            vj1Var.f29351c = m22372N;
            vj1Var.f29352d = view;
            vj1Var.m27285u("headline", zzo);
            vj1Var.f29353e = m22375X4;
            vj1Var.m27285u("body", zzm);
            vj1Var.f29356h = zzf;
            vj1Var.m27285u("call_to_action", zzn);
            vj1Var.f29361m = view2;
            vj1Var.f29363o = zzl;
            vj1Var.m27285u("store", zzq);
            vj1Var.m27285u("price", zzp);
            vj1Var.f29364p = zze;
            vj1Var.f29365q = m22373Q;
            return vj1Var;
        } catch (RemoteException e11) {
            yk0.zzk("Failed to get native ad from app install ad mapper", e11);
            return null;
        }
    }

    /* renamed from: D */
    public static vj1 m27232D(ha0 ha0Var) {
        try {
            uj1 m27235G = m27235G(ha0Var.m22756E(), null);
            b00 m22758N = ha0Var.m22758N();
            View view = (View) m27237I(ha0Var.zzi());
            String zzo = ha0Var.zzo();
            List m22761X4 = ha0Var.m22761X4();
            String zzm = ha0Var.zzm();
            Bundle zze = ha0Var.zze();
            String zzn = ha0Var.zzn();
            View view2 = (View) m27237I(ha0Var.m22757I3());
            InterfaceC4271b m22760W4 = ha0Var.m22760W4();
            String zzl = ha0Var.zzl();
            k00 m22759Q = ha0Var.m22759Q();
            vj1 vj1Var = new vj1();
            vj1Var.f29349a = 1;
            vj1Var.f29350b = m27235G;
            vj1Var.f29351c = m22758N;
            vj1Var.f29352d = view;
            vj1Var.m27285u("headline", zzo);
            vj1Var.f29353e = m22761X4;
            vj1Var.m27285u("body", zzm);
            vj1Var.f29356h = zze;
            vj1Var.m27285u("call_to_action", zzn);
            vj1Var.f29361m = view2;
            vj1Var.f29363o = m22760W4;
            vj1Var.m27285u("advertiser", zzl);
            vj1Var.f29366r = m22759Q;
            return vj1Var;
        } catch (RemoteException e11) {
            yk0.zzk("Failed to get native ad from content ad mapper", e11);
            return null;
        }
    }

    /* renamed from: E */
    public static vj1 m27233E(ga0 ga0Var) {
        try {
            return m27236H(m27235G(ga0Var.m22369E(), null), ga0Var.m22372N(), (View) m27237I(ga0Var.m22371I3()), ga0Var.zzo(), ga0Var.m22375X4(), ga0Var.zzm(), ga0Var.zzf(), ga0Var.zzn(), (View) m27237I(ga0Var.m22374W4()), ga0Var.zzl(), ga0Var.zzq(), ga0Var.zzp(), ga0Var.zze(), ga0Var.m22373Q(), null, 0.0f);
        } catch (RemoteException e11) {
            yk0.zzk("Failed to get native ad assets from app install ad mapper", e11);
            return null;
        }
    }

    /* renamed from: F */
    public static vj1 m27234F(ha0 ha0Var) {
        try {
            return m27236H(m27235G(ha0Var.m22756E(), null), ha0Var.m22758N(), (View) m27237I(ha0Var.zzi()), ha0Var.zzo(), ha0Var.m22761X4(), ha0Var.zzm(), ha0Var.zze(), ha0Var.zzn(), (View) m27237I(ha0Var.m22757I3()), ha0Var.m22760W4(), null, null, -1.0d, ha0Var.m22759Q(), ha0Var.zzl(), 0.0f);
        } catch (RemoteException e11) {
            yk0.zzk("Failed to get native ad assets from content ad mapper", e11);
            return null;
        }
    }

    /* renamed from: G */
    private static uj1 m27235G(com.google.android.gms.ads.internal.client.zzdk zzdkVar, ka0 ka0Var) {
        if (zzdkVar == null) {
            return null;
        }
        return new uj1(zzdkVar, ka0Var);
    }

    /* renamed from: H */
    private static vj1 m27236H(com.google.android.gms.ads.internal.client.zzdk zzdkVar, b00 b00Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC4271b interfaceC4271b, String str4, String str5, double d11, k00 k00Var, String str6, float f11) {
        vj1 vj1Var = new vj1();
        vj1Var.f29349a = 6;
        vj1Var.f29350b = zzdkVar;
        vj1Var.f29351c = b00Var;
        vj1Var.f29352d = view;
        vj1Var.m27285u("headline", str);
        vj1Var.f29353e = list;
        vj1Var.m27285u("body", str2);
        vj1Var.f29356h = bundle;
        vj1Var.m27285u("call_to_action", str3);
        vj1Var.f29361m = view2;
        vj1Var.f29363o = interfaceC4271b;
        vj1Var.m27285u("store", str4);
        vj1Var.m27285u("price", str5);
        vj1Var.f29364p = d11;
        vj1Var.f29365q = k00Var;
        vj1Var.m27285u("advertiser", str6);
        vj1Var.m27280p(f11);
        return vj1Var;
    }

    /* renamed from: I */
    private static Object m27237I(InterfaceC4271b interfaceC4271b) {
        if (interfaceC4271b == null) {
            return null;
        }
        return BinderC4273d.m19914Q(interfaceC4271b);
    }

    /* renamed from: a0 */
    public static vj1 m27238a0(ka0 ka0Var) {
        try {
            return m27236H(m27235G(ka0Var.zzj(), ka0Var), ka0Var.zzk(), (View) m27237I(ka0Var.zzm()), ka0Var.zzs(), ka0Var.zzv(), ka0Var.zzq(), ka0Var.zzi(), ka0Var.zzr(), (View) m27237I(ka0Var.zzn()), ka0Var.zzo(), ka0Var.mo23149a(), ka0Var.zzt(), ka0Var.zze(), ka0Var.zzl(), ka0Var.zzp(), ka0Var.zzf());
        } catch (RemoteException e11) {
            yk0.zzk("Failed to get native ad assets from unified ad mapper", e11);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double m27239A() {
        return this.f29364p;
    }

    /* renamed from: B */
    public final synchronized void m27240B(InterfaceC4271b interfaceC4271b) {
        this.f29360l = interfaceC4271b;
    }

    /* renamed from: J */
    public final synchronized float m27241J() {
        return this.f29370v;
    }

    /* renamed from: K */
    public final synchronized int m27242K() {
        return this.f29349a;
    }

    /* renamed from: L */
    public final synchronized Bundle m27243L() {
        try {
            if (this.f29356h == null) {
                this.f29356h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29356h;
    }

    /* renamed from: M */
    public final synchronized View m27244M() {
        return this.f29352d;
    }

    /* renamed from: N */
    public final synchronized View m27245N() {
        return this.f29361m;
    }

    /* renamed from: O */
    public final synchronized View m27246O() {
        return this.f29362n;
    }

    /* renamed from: P */
    public final synchronized C30245g m27247P() {
        return this.f29368t;
    }

    /* renamed from: Q */
    public final synchronized C30245g m27248Q() {
        return this.f29369u;
    }

    /* renamed from: R */
    public final synchronized com.google.android.gms.ads.internal.client.zzdk m27249R() {
        return this.f29350b;
    }

    /* renamed from: S */
    public final synchronized zzef m27250S() {
        return this.f29355g;
    }

    /* renamed from: T */
    public final synchronized b00 m27251T() {
        return this.f29351c;
    }

    /* renamed from: U */
    public final k00 m27252U() {
        List list = this.f29353e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f29353e.get(0);
            if (obj instanceof IBinder) {
                return j00.m23497N((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized k00 m27253V() {
        return this.f29365q;
    }

    /* renamed from: W */
    public final synchronized k00 m27254W() {
        return this.f29366r;
    }

    /* renamed from: X */
    public final synchronized zq0 m27255X() {
        return this.f29358j;
    }

    /* renamed from: Y */
    public final synchronized zq0 m27256Y() {
        return this.f29359k;
    }

    /* renamed from: Z */
    public final synchronized zq0 m27257Z() {
        return this.f29357i;
    }

    /* renamed from: a */
    public final synchronized String m27258a() {
        return this.f29371w;
    }

    /* renamed from: b */
    public final synchronized String m27259b() {
        return m27263d("price");
    }

    /* renamed from: b0 */
    public final synchronized InterfaceC4271b m27260b0() {
        return this.f29363o;
    }

    /* renamed from: c */
    public final synchronized String m27261c() {
        return m27263d("store");
    }

    /* renamed from: c0 */
    public final synchronized InterfaceC4271b m27262c0() {
        return this.f29360l;
    }

    /* renamed from: d */
    public final synchronized String m27263d(String str) {
        return (String) this.f29369u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String m27264d0() {
        return m27263d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List m27265e() {
        return this.f29353e;
    }

    /* renamed from: e0 */
    public final synchronized String m27266e0() {
        return m27263d("body");
    }

    /* renamed from: f */
    public final synchronized List m27267f() {
        return this.f29354f;
    }

    /* renamed from: f0 */
    public final synchronized String m27268f0() {
        return m27263d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void m27269g() {
        try {
            zq0 zq0Var = this.f29357i;
            if (zq0Var != null) {
                zq0Var.destroy();
                this.f29357i = null;
            }
            zq0 zq0Var2 = this.f29358j;
            if (zq0Var2 != null) {
                zq0Var2.destroy();
                this.f29358j = null;
            }
            zq0 zq0Var3 = this.f29359k;
            if (zq0Var3 != null) {
                zq0Var3.destroy();
                this.f29359k = null;
            }
            this.f29360l = null;
            this.f29368t.clear();
            this.f29369u.clear();
            this.f29350b = null;
            this.f29351c = null;
            this.f29352d = null;
            this.f29353e = null;
            this.f29356h = null;
            this.f29361m = null;
            this.f29362n = null;
            this.f29363o = null;
            this.f29365q = null;
            this.f29366r = null;
            this.f29367s = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g0 */
    public final synchronized String m27270g0() {
        return this.f29367s;
    }

    /* renamed from: h */
    public final synchronized void m27271h(b00 b00Var) {
        this.f29351c = b00Var;
    }

    /* renamed from: h0 */
    public final synchronized String m27272h0() {
        return m27263d("headline");
    }

    /* renamed from: i */
    public final synchronized void m27273i(String str) {
        this.f29367s = str;
    }

    /* renamed from: j */
    public final synchronized void m27274j(zzef zzefVar) {
        this.f29355g = zzefVar;
    }

    /* renamed from: k */
    public final synchronized void m27275k(k00 k00Var) {
        this.f29365q = k00Var;
    }

    /* renamed from: l */
    public final synchronized void m27276l(String str, BinderC5150wz binderC5150wz) {
        if (binderC5150wz == null) {
            this.f29368t.remove(str);
        } else {
            this.f29368t.put(str, binderC5150wz);
        }
    }

    /* renamed from: m */
    public final synchronized void m27277m(zq0 zq0Var) {
        this.f29358j = zq0Var;
    }

    /* renamed from: n */
    public final synchronized void m27278n(List list) {
        this.f29353e = list;
    }

    /* renamed from: o */
    public final synchronized void m27279o(k00 k00Var) {
        this.f29366r = k00Var;
    }

    /* renamed from: p */
    public final synchronized void m27280p(float f11) {
        this.f29370v = f11;
    }

    /* renamed from: q */
    public final synchronized void m27281q(List list) {
        this.f29354f = list;
    }

    /* renamed from: r */
    public final synchronized void m27282r(zq0 zq0Var) {
        this.f29359k = zq0Var;
    }

    /* renamed from: s */
    public final synchronized void m27283s(String str) {
        this.f29371w = str;
    }

    /* renamed from: t */
    public final synchronized void m27284t(double d11) {
        this.f29364p = d11;
    }

    /* renamed from: u */
    public final synchronized void m27285u(String str, String str2) {
        if (str2 == null) {
            this.f29369u.remove(str);
        } else {
            this.f29369u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void m27286v(int i11) {
        this.f29349a = i11;
    }

    /* renamed from: w */
    public final synchronized void m27287w(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.f29350b = zzdkVar;
    }

    /* renamed from: x */
    public final synchronized void m27288x(View view) {
        this.f29361m = view;
    }

    /* renamed from: y */
    public final synchronized void m27289y(zq0 zq0Var) {
        this.f29357i = zq0Var;
    }

    /* renamed from: z */
    public final synchronized void m27290z(View view) {
        this.f29362n = view;
    }
}
