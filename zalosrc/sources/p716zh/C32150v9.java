package p716zh;

import ae.C0766k;
import am.AbstractC0924m0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Timer;
import java.util.TimerTask;
import jm0.AbstractC21298h;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p645xh.C29628e;
import p716zh.C32150v9;

/* renamed from: zh.v9 */
/* loaded from: classes.dex */
public final class C32150v9 {

    /* renamed from: a */
    public static final C32150v9 f148254a = new C32150v9();

    /* renamed from: b */
    private static Timer f148255b;

    /* renamed from: c */
    private static boolean f148256c;

    /* renamed from: zh.v9$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f148257a;

        /* renamed from: b */
        final /* synthetic */ long f148258b;

        a(boolean z11, long j11) {
            this.f148257a = z11;
            this.f148258b = j11;
        }

        /* renamed from: d */
        public static final void m155134d() {
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104490b;
            long m116585h;
            String str = null;
            if (c20096c != null) {
                try {
                    m104490b = c20096c.m104490b();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } else {
                m104490b = null;
            }
            if (m104490b != null && m104490b.length() > 0) {
                JSONObject jSONObject = new JSONObject(m104490b);
                int optInt = jSONObject.optInt("error_code");
                if (optInt != 70) {
                    if (optInt == 71) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null) {
                            long j11 = this.f148258b;
                            C32150v9 c32150v9 = C32150v9.f148254a;
                            c32150v9.m155129i();
                            long optLong = optJSONObject.optLong("startTime");
                            long optLong2 = optJSONObject.optLong("endTime");
                            AbstractC0924m0.m3002Dn(optLong);
                            AbstractC0924m0.m2973Cn(optLong2);
                            AbstractC0924m0.m2944Bn(false);
                            C23744a.Companion.m124119a().m124116d(6050, new Object[0]);
                            c32150v9.m155128h(optLong - j11);
                            return;
                        }
                        return;
                    }
                } else {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                    if (optJSONObject2 != null) {
                        AbstractC0924m0.m2973Cn(optJSONObject2.optLong("endTime"));
                        AbstractC0924m0.m2944Bn(true);
                    }
                    if (!this.f148257a) {
                        C32150v9.f148256c = true;
                        AbstractC19444a.m101694b(new Runnable() { // from class: zh.u9
                            @Override // java.lang.Runnable
                            public final void run() {
                                C32150v9.a.m155134d();
                            }
                        }, 1000L);
                        return;
                    } else {
                        long m4131q5 = AbstractC0924m0.m4131q5();
                        C32150v9 c32150v92 = C32150v9.f148254a;
                        m116585h = AbstractC22543l.m116585h(m4131q5 - this.f148258b, 3600000L);
                        c32150v92.m155128h(m116585h);
                        return;
                    }
                }
            }
            if (c20096c != null) {
                str = c20096c.m104492d();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Check error: ");
            sb2.append(str);
            C32150v9.f148254a.m155128h(300000L);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    if (((JSONObject) obj).optInt("error_code") == 0) {
                        C32150v9.f148254a.m155129i();
                        AbstractC0924m0.m3002Dn(0L);
                        AbstractC0924m0.m2973Cn(0L);
                        AbstractC0924m0.m2944Bn(false);
                        C23744a.Companion.m124119a().m124116d(6050, new Object[0]);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: zh.v9$b */
    /* loaded from: classes3.dex */
    public static final class b extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C32150v9.f148254a.m155131e();
        }
    }

    private C32150v9() {
    }

    /* renamed from: f */
    private final void m155127f() {
        C29628e.m147249E0().m147270X0();
        AbstractC21298h.m110277d0(true);
    }

    /* renamed from: h */
    public final void m155128h(long j11) {
        Timer timer = new Timer();
        timer.schedule(new b(), j11);
        f148255b = timer;
    }

    /* renamed from: i */
    public final void m155129i() {
        C29628e.m147249E0().m147294w1();
        AbstractC21298h.m110277d0(false);
    }

    /* renamed from: d */
    public final void m155130d() {
        Timer timer = f148255b;
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
        f148255b = null;
    }

    /* renamed from: e */
    public final void m155131e() {
        boolean m3808fc = AbstractC0924m0.m3808fc();
        long m4161r5 = AbstractC0924m0.m4161r5();
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        if (m4161r5 > 0 && mo124314i > m4161r5) {
            if (m3808fc) {
                m155127f();
            }
            a aVar = new a(m3808fc, mo124314i);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(aVar);
            c0766k.m1847h();
            return;
        }
        if (m4161r5 > 0) {
            m155128h(m4161r5 - mo124314i);
        }
    }

    /* renamed from: g */
    public final boolean m155132g() {
        if (!f148256c && AbstractC0924m0.m3808fc()) {
            return true;
        }
        return false;
    }
}
