package p232i8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p292k8.AbstractC21569b0;
import p292k8.C21571c0;
import p418p8.InterfaceC24673i;
import p440q8.C25161e;
import p440q8.InterfaceC25160d;

/* renamed from: i8.o */
/* loaded from: classes.dex */
public class C20409o {

    /* renamed from: f */
    private static final Map f100540f;

    /* renamed from: g */
    static final String f100541g;

    /* renamed from: a */
    private final Context f100542a;

    /* renamed from: b */
    private final C20422w f100543b;

    /* renamed from: c */
    private final C20381a f100544c;

    /* renamed from: d */
    private final InterfaceC25160d f100545d;

    /* renamed from: e */
    private final InterfaceC24673i f100546e;

    static {
        HashMap hashMap = new HashMap();
        f100540f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f100541g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.6");
    }

    public C20409o(Context context, C20422w c20422w, C20381a c20381a, InterfaceC25160d interfaceC25160d, InterfaceC24673i interfaceC24673i) {
        this.f100542a = context;
        this.f100543b = c20422w;
        this.f100544c = c20381a;
        this.f100545d = interfaceC25160d;
        this.f100546e = interfaceC24673i;
    }

    /* renamed from: a */
    private AbstractC21569b0.a m106359a(AbstractC21569b0.a aVar) {
        C21571c0 c21571c0;
        if (this.f100546e.mo128225b().f118586b.f118595c && this.f100544c.f100416c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (C20389e c20389e : this.f100544c.f100416c) {
                arrayList.add(AbstractC21569b0.a.AbstractC32854a.m111273a().mo111280d(c20389e.m106187c()).mo111278b(c20389e.m106185a()).mo111279c(c20389e.m106186b()).mo111277a());
            }
            c21571c0 = C21571c0.m111495d(arrayList);
        } else {
            c21571c0 = null;
        }
        return AbstractC21569b0.a.m111263a().mo111283c(aVar.mo111265c()).mo111285e(aVar.mo111267e()).mo111287g(aVar.mo111269g()).mo111289i(aVar.mo111271i()).mo111284d(aVar.mo111266d()).mo111286f(aVar.mo111268f()).mo111288h(aVar.mo111270h()).mo111290j(aVar.mo111272j()).mo111282b(c21571c0).mo111281a();
    }

    /* renamed from: b */
    private AbstractC21569b0.b m106360b() {
        return AbstractC21569b0.m111258b().mo111255i("18.3.6").mo111251e(this.f100544c.f100414a).mo111252f(this.f100543b.mo106427a()).mo111249c(this.f100544c.f100419f).mo111250d(this.f100544c.f100420g).mo111254h(4);
    }

    /* renamed from: f */
    private static int m106361f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f100540f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: g */
    private AbstractC21569b0.e.d.a.b.AbstractC32858a m106362g() {
        return AbstractC21569b0.e.d.a.b.AbstractC32858a.m111399a().mo111406b(0L).mo111408d(0L).mo111407c(this.f100544c.f100418e).mo111409e(this.f100544c.f100415b).mo111405a();
    }

    /* renamed from: h */
    private C21571c0 m106363h() {
        return C21571c0.m111496e(m106362g());
    }

    /* renamed from: i */
    private AbstractC21569b0.e.d.a m106364i(int i11, AbstractC21569b0.a aVar) {
        boolean z11;
        if (aVar.mo111265c() != 100) {
            z11 = true;
        } else {
            z11 = false;
        }
        return AbstractC21569b0.e.d.a.m111380a().mo111388b(Boolean.valueOf(z11)).mo111392f(i11).mo111390d(m106369n(aVar)).mo111387a();
    }

    /* renamed from: j */
    private AbstractC21569b0.e.d.a m106365j(int i11, C25161e c25161e, Thread thread, int i12, int i13, boolean z11) {
        Boolean bool;
        boolean z12;
        ActivityManager.RunningAppProcessInfo m106214j = AbstractC20395h.m106214j(this.f100544c.f100418e, this.f100542a);
        if (m106214j != null) {
            if (m106214j.importance != 100) {
                z12 = true;
            } else {
                z12 = false;
            }
            bool = Boolean.valueOf(z12);
        } else {
            bool = null;
        }
        return AbstractC21569b0.e.d.a.m111380a().mo111388b(bool).mo111392f(i11).mo111390d(m106370o(c25161e, thread, i12, i13, z11)).mo111387a();
    }

    /* renamed from: k */
    private AbstractC21569b0.e.d.c m106366k(int i11) {
        Double d11;
        C20387d m106179a = C20387d.m106179a(this.f100542a);
        Float m106182b = m106179a.m106182b();
        if (m106182b != null) {
            d11 = Double.valueOf(m106182b.doubleValue());
        } else {
            d11 = null;
        }
        int m106183c = m106179a.m106183c();
        boolean m106220p = AbstractC20395h.m106220p(this.f100542a);
        long m106224t = AbstractC20395h.m106224t() - AbstractC20395h.m106205a(this.f100542a);
        return AbstractC21569b0.e.d.c.m111463a().mo111471b(d11).mo111472c(m106183c).mo111475f(m106220p).mo111474e(i11).mo111476g(m106224t).mo111473d(AbstractC20395h.m106206b(Environment.getDataDirectory().getPath())).mo111470a();
    }

    /* renamed from: l */
    private AbstractC21569b0.e.d.a.b.c m106367l(C25161e c25161e, int i11, int i12) {
        return m106368m(c25161e, i11, i12, 0);
    }

    /* renamed from: m */
    private AbstractC21569b0.e.d.a.b.c m106368m(C25161e c25161e, int i11, int i12, int i13) {
        String str = c25161e.f120732b;
        String str2 = c25161e.f120731a;
        StackTraceElement[] stackTraceElementArr = c25161e.f120733c;
        int i14 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C25161e c25161e2 = c25161e.f120734d;
        if (i13 >= i12) {
            C25161e c25161e3 = c25161e2;
            while (c25161e3 != null) {
                c25161e3 = c25161e3.f120734d;
                i14++;
            }
        }
        AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111426d = AbstractC21569b0.e.d.a.b.c.m111417a().mo111428f(str).mo111427e(str2).mo111425c(C21571c0.m111495d(m106372q(stackTraceElementArr, i11))).mo111426d(i14);
        if (c25161e2 != null && i14 == 0) {
            mo111426d.mo111424b(m106368m(c25161e2, i11, i12, i13 + 1));
        }
        return mo111426d.mo111423a();
    }

    /* renamed from: n */
    private AbstractC21569b0.e.d.a.b m106369n(AbstractC21569b0.a aVar) {
        return AbstractC21569b0.e.d.a.b.m111393a().mo111412b(aVar).mo111415e(m106377v()).mo111413c(m106363h()).mo111411a();
    }

    /* renamed from: o */
    private AbstractC21569b0.e.d.a.b m106370o(C25161e c25161e, Thread thread, int i11, int i12, boolean z11) {
        return AbstractC21569b0.e.d.a.b.m111393a().mo111416f(m106380y(c25161e, thread, i11, z11)).mo111414d(m106367l(c25161e, i11, i12)).mo111415e(m106377v()).mo111413c(m106363h()).mo111411a();
    }

    /* renamed from: p */
    private AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b m106371p(StackTraceElement stackTraceElement, AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a abstractC32867a) {
        long j11;
        long j12 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j11 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j11 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j12 = stackTraceElement.getLineNumber();
        }
        return abstractC32867a.mo111455e(j11).mo111456f(str).mo111452b(fileName).mo111454d(j12).mo111451a();
    }

    /* renamed from: q */
    private C21571c0 m106372q(StackTraceElement[] stackTraceElementArr, int i11) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m106371p(stackTraceElement, AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.m111445a().mo111453c(i11)));
        }
        return C21571c0.m111495d(arrayList);
    }

    /* renamed from: r */
    private AbstractC21569b0.e.a m106373r() {
        return AbstractC21569b0.e.a.m111325a().mo111337e(this.f100543b.m106428f()).mo111339g(this.f100544c.f100419f).mo111336d(this.f100544c.f100420g).mo111338f(this.f100543b.mo106427a()).mo111334b(this.f100544c.f100421h.m98790d()).mo111335c(this.f100544c.f100421h.m98791e()).mo111333a();
    }

    /* renamed from: s */
    private AbstractC21569b0.e m106374s(String str, long j11) {
        return AbstractC21569b0.e.m111309a().mo111351l(j11).mo111348i(str).mo111346g(f100541g).mo111341b(m106373r()).mo111350k(m106376u()).mo111343d(m106375t()).mo111347h(3).mo111340a();
    }

    /* renamed from: t */
    private AbstractC21569b0.e.c m106375t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m106361f = m106361f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m106224t = AbstractC20395h.m106224t();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m106230z = AbstractC20395h.m106230z();
        int m106218n = AbstractC20395h.m106218n();
        return AbstractC21569b0.e.c.m111353a().mo111364b(m106361f).mo111368f(Build.MODEL).mo111365c(availableProcessors).mo111370h(m106224t).mo111366d(blockCount).mo111371i(m106230z).mo111372j(m106218n).mo111367e(Build.MANUFACTURER).mo111369g(Build.PRODUCT).mo111363a();
    }

    /* renamed from: u */
    private AbstractC21569b0.e.AbstractC32869e m106376u() {
        return AbstractC21569b0.e.AbstractC32869e.m111481a().mo111489d(3).mo111490e(Build.VERSION.RELEASE).mo111487b(Build.VERSION.CODENAME).mo111488c(AbstractC20395h.m106201A()).mo111486a();
    }

    /* renamed from: v */
    private AbstractC21569b0.e.d.a.b.AbstractC32862d m106377v() {
        return AbstractC21569b0.e.d.a.b.AbstractC32862d.m111429a().mo111436d("0").mo111435c("0").mo111434b(0L).mo111433a();
    }

    /* renamed from: w */
    private AbstractC21569b0.e.d.a.b.AbstractC32864e m106378w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m106379x(thread, stackTraceElementArr, 0);
    }

    /* renamed from: x */
    private AbstractC21569b0.e.d.a.b.AbstractC32864e m106379x(Thread thread, StackTraceElement[] stackTraceElementArr, int i11) {
        return AbstractC21569b0.e.d.a.b.AbstractC32864e.m111437a().mo111444d(thread.getName()).mo111443c(i11).mo111442b(C21571c0.m111495d(m106372q(stackTraceElementArr, i11))).mo111441a();
    }

    /* renamed from: y */
    private C21571c0 m106380y(C25161e c25161e, Thread thread, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m106379x(thread, c25161e.f120733c, i11));
        if (z11) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m106378w(key, this.f100545d.mo130299a(entry.getValue())));
                }
            }
        }
        return C21571c0.m111495d(arrayList);
    }

    /* renamed from: c */
    public AbstractC21569b0.e.d m106381c(AbstractC21569b0.a aVar) {
        int i11 = this.f100542a.getResources().getConfiguration().orientation;
        return AbstractC21569b0.e.d.m111373a().mo111462f("anr").mo111461e(aVar.mo111271i()).mo111458b(m106364i(i11, m106359a(aVar))).mo111459c(m106366k(i11)).mo111457a();
    }

    /* renamed from: d */
    public AbstractC21569b0.e.d m106382d(Throwable th2, Thread thread, String str, long j11, int i11, int i12, boolean z11) {
        int i13 = this.f100542a.getResources().getConfiguration().orientation;
        return AbstractC21569b0.e.d.m111373a().mo111462f(str).mo111461e(j11).mo111458b(m106365j(i13, new C25161e(th2, this.f100545d), thread, i11, i12, z11)).mo111459c(m106366k(i13)).mo111457a();
    }

    /* renamed from: e */
    public AbstractC21569b0 m106383e(String str, long j11) {
        return m106360b().mo111256j(m106374s(str, j11)).mo111247a();
    }
}
