package ag0;

import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.C11318b;
import dj.C17945a0;
import dj.C17979l1;
import eg0.C18427b;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23016b;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p681yh.C30981a;
import p681yh.EnumC30982b;
import p716zh.C31897e4;
import p716zh.C31973j5;
import p716zh.C32163w8;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: ag0.e0 */
/* loaded from: classes6.dex */
public class C0814e0 extends Thread {

    /* renamed from: s */
    private static final ArrayList f2807s = new ArrayList();

    /* renamed from: t */
    private static volatile C0814e0 f2808t = null;

    /* renamed from: u */
    private static final Object f2809u = new Object();

    /* renamed from: p */
    private volatile boolean f2810p;

    /* renamed from: q */
    private int f2811q;

    /* renamed from: r */
    private final InterfaceC23792b f2812r;

    private C0814e0(InterfaceC23792b interfaceC23792b) {
        super("Z:ResendMsgWorker");
        this.f2810p = true;
        this.f2811q = 0;
        this.f2812r = interfaceC23792b;
        start();
    }

    /* renamed from: b */
    public static void m2056b(C17945a0 c17945a0) {
        if (c17945a0 != null && m2061g(c17945a0)) {
            if (c17945a0.m95270u8()) {
                m2067m(c17945a0);
                return;
            }
            if (c17945a0.m95184l3() != null) {
                c17945a0.m95184l3().m153261B();
                if (c17945a0.m95184l3().m153275p()) {
                    m2071q(c17945a0, null);
                    return;
                }
                return;
            }
            m2071q(c17945a0, null);
        }
    }

    /* renamed from: c */
    private void m2057c() {
        try {
            if (!C29628e.m147249E0().m93432x()) {
                if (C23055e5.m118271f() && !C29628e.m147249E0().m93433y()) {
                    try {
                        int m122768f = AbstractC23349d.m122768f();
                        if (m122768f == 2) {
                            AbstractC29633j.m147368q();
                            Thread.sleep(3500L);
                        } else if (m122768f == 3) {
                            AbstractC29633j.m147366o();
                            Thread.sleep(5500L);
                        } else {
                            AbstractC29633j.m147367p();
                            Thread.sleep(1500L);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122774d("ResendMsgWorker", e11.toString());
                    }
                }
                Thread.sleep(500L);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ResendMsgWorker", e12);
        }
    }

    /* renamed from: d */
    public static C17945a0 m2058d(C17945a0 c17945a0) {
        int i11 = 0;
        while (true) {
            try {
                ArrayList arrayList = f2807s;
                if (i11 < arrayList.size()) {
                    C17945a0 c17945a02 = (C17945a0) arrayList.get(i11);
                    if (c17945a02.m95135f9(c17945a0.m95029V3())) {
                        return c17945a02;
                    }
                    i11++;
                } else {
                    return null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ResendMsgWorker", e11);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static boolean m2059e(MessageId messageId) {
        int i11 = 0;
        while (true) {
            try {
                ArrayList arrayList = f2807s;
                if (i11 >= arrayList.size()) {
                    break;
                }
                C17945a0 c17945a0 = (C17945a0) arrayList.get(i11);
                if (c17945a0 != null && c17945a0.m95135f9(messageId)) {
                    return true;
                }
                i11++;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ResendMsgWorker", e11);
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m2060f(long j11) {
        long mo124314i = this.f2812r.mo124314i();
        if (mo124314i < C32163w8.m155135a().m155138d() + j11 || mo124314i > j11 + C32163w8.m155135a().m155138d() + C32163w8.m155135a().m155137c() || System.currentTimeMillis() - AbstractC23309i.m121150L6() <= C32163w8.m155135a().m155139e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m2061g(C17945a0 c17945a0) {
        if ((c17945a0.m95089b4() == 1 || c17945a0.m95207n6()) && !m2059e(c17945a0.m95029V3()) && !c17945a0.m95219o8()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static /* synthetic */ void m2062h(C17945a0 c17945a0) {
        C7956b.m41474B().m41507F0(c17945a0);
    }

    /* renamed from: i */
    private static ContactProfile m2063i(String str) {
        if (AbstractC25495a.m132079d(str)) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = m4472f.m153793y();
            contactProfile.f42446v = m4472f.m153756e();
            return contactProfile;
        }
        return C28203u6.f131407a.m141809c(str);
    }

    /* renamed from: j */
    public static void m2064j(C17945a0 c17945a0) {
        ContactProfile m2063i;
        if (!c17945a0.m95031V5() && !C11318b.m60507e().m60515j(c17945a0.mo95039W2()) && (m2063i = m2063i(c17945a0.mo95039W2())) != null) {
            String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_retry_msg_title_noti);
            String format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_retry_msg_noti2), m2063i.m40383Q(true, false));
            C28023b6.m141250h0().m141295J1(m2063i, c17945a0.m95029V3(), string, format.toString(), format.toString());
        }
    }

    /* renamed from: k */
    private void m2065k(C17945a0 c17945a0) {
        try {
            if (c17945a0.m95031V5() || C11318b.m60507e().m60515j(c17945a0.mo95039W2())) {
                return;
            }
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && C21927m.m114302u().m114345m(c17945a0.mo95039W2())) {
                return;
            }
            AbstractC23309i.m122067jr(System.currentTimeMillis());
            if (m2063i(c17945a0.mo95039W2()) != null) {
                String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_retry_msg_title_noti);
                String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_retry_msg_warning);
                C28023b6.m141250h0().m141298K1(string, string2, string2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ResendMsgWorker", e11);
        }
    }

    /* renamed from: l */
    public static void m2066l() {
        if (f2808t != null) {
            try {
                synchronized (f2809u) {
                    f2807s.clear();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ResendMsgWorker", e11);
            }
        }
    }

    /* renamed from: m */
    private static void m2067m(C17945a0 c17945a0) {
        m2072r();
        if (f2808t != null) {
            Object obj = f2809u;
            synchronized (obj) {
                try {
                    if (!c17945a0.m95098c6() && !m2059e(c17945a0.m95029V3())) {
                        f2807s.add(c17945a0);
                        obj.notifyAll();
                        AbstractC20110a.m104543l("[Message]").mo104556o(8, "ResendMsgWorker queueResend %s", c17945a0.m95029V3().m41044h());
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* renamed from: n */
    private static void m2068n(C17945a0 c17945a0, boolean z11) {
        try {
            C23744a.m124114c().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            if (!z11) {
                m2064j(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104538g(e11.toString(), new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:            vg.C28023b6.m141250h0().m141293J(r4.mo95039W2());     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:            monitor-enter(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:            r2.remove(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:            monitor-exit(r2);     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2069o(C17945a0 c17945a0) {
        if (f2808t != null) {
            synchronized (f2809u) {
                int i11 = 0;
                while (true) {
                    try {
                        ArrayList arrayList = f2807s;
                        if (i11 < arrayList.size()) {
                            C17945a0 c17945a02 = (C17945a0) arrayList.get(i11);
                            if (c17945a02 != null && c17945a02.equals(c17945a0)) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("ResendMsgWorker", e11);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public static void m2070p(C17945a0 c17945a0, String str) {
        try {
            if (c17945a0.m95089b4() != 0) {
                c17945a0.m95193lc(0);
            }
            if (!TextUtils.isEmpty(str)) {
                if (c17945a0.m95051X3() == null) {
                    c17945a0.m94989Qa(new C17979l1());
                }
                c17945a0.m95051X3().m95625g(str);
                C23288a.f113033a.mo13474a(new C18427b(c17945a0.mo95039W2(), new Runnable() { // from class: ag0.d0
                    public /* synthetic */ RunnableC0811d0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0814e0.m2062h(C17945a0.this);
                    }
                }));
            }
            c17945a0.m95182kb(false);
            c17945a0.m95096c1();
            AbstractC23016b.m118014h();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public static void m2071q(C17945a0 c17945a0, String str) {
        try {
            m2070p(c17945a0, str);
            m2064j(c17945a0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public static synchronized void m2072r() {
        synchronized (C0814e0.class) {
            if (f2808t == null) {
                synchronized (C0814e0.class) {
                    try {
                        if (f2808t == null) {
                            f2808t = new C0814e0(AbstractC23306f.m120579F1());
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m2073s(String str) {
        if (!TextUtils.isEmpty(str) && f2808t != null) {
            synchronized (f2809u) {
                int i11 = 0;
                while (true) {
                    try {
                        ArrayList arrayList = f2807s;
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        C17945a0 c17945a0 = (C17945a0) arrayList.get(i11);
                        if (c17945a0 != null && TextUtils.equals(c17945a0.mo95039W2(), str)) {
                            c17945a0.m94875E1();
                        }
                        i11++;
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("ResendMsgWorker", e11);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:32|(2:34|(1:92)(2:38|(1:42)))(3:93|(1:100)|101)|43|44|(10:49|(1:55)|56|(1:58)|59|60|61|63|(3:69|70|71)(3:65|66|67)|68)|(1:91)|109|60|61|63|(0)(0)|68) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011d, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0126, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:            m2070p(r0, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:            if (r0.m95184l3() == null) goto L210;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f9, code lost:            r0.m95184l3().m153261B();     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:            m2068n(r0, false);     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2 A[Catch: Exception -> 0x0036, TryCatch #3 {Exception -> 0x0036, blocks: (B:4:0x0005, B:5:0x0007, B:11:0x0021, B:13:0x0027, B:15:0x0033, B:16:0x0039, B:18:0x0047, B:20:0x004d, B:23:0x0054, B:25:0x005a, B:27:0x0060, B:29:0x0066, B:32:0x006d, B:34:0x0073, B:36:0x007d, B:38:0x0083, B:40:0x0089, B:49:0x00bd, B:51:0x00c3, B:53:0x00cf, B:55:0x00d9, B:56:0x00dc, B:58:0x00e2, B:59:0x00ea, B:74:0x0126, B:77:0x00f0, B:79:0x00f9, B:80:0x0100, B:81:0x0109, B:88:0x012d, B:91:0x0106, B:93:0x0095, B:95:0x009c, B:97:0x00a3, B:116:0x012f, B:61:0x0110, B:70:0x0116, B:66:0x011f, B:7:0x0008, B:109:0x0011, B:10:0x0020, B:112:0x001b, B:83:0x010a, B:84:0x010f), top: B:3:0x0005, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106 A[Catch: Exception -> 0x0036, TryCatch #3 {Exception -> 0x0036, blocks: (B:4:0x0005, B:5:0x0007, B:11:0x0021, B:13:0x0027, B:15:0x0033, B:16:0x0039, B:18:0x0047, B:20:0x004d, B:23:0x0054, B:25:0x005a, B:27:0x0060, B:29:0x0066, B:32:0x006d, B:34:0x0073, B:36:0x007d, B:38:0x0083, B:40:0x0089, B:49:0x00bd, B:51:0x00c3, B:53:0x00cf, B:55:0x00d9, B:56:0x00dc, B:58:0x00e2, B:59:0x00ea, B:74:0x0126, B:77:0x00f0, B:79:0x00f9, B:80:0x0100, B:81:0x0109, B:88:0x012d, B:91:0x0106, B:93:0x0095, B:95:0x009c, B:97:0x00a3, B:116:0x012f, B:61:0x0110, B:70:0x0116, B:66:0x011f, B:7:0x0008, B:109:0x0011, B:10:0x0020, B:112:0x001b, B:83:0x010a, B:84:0x010f), top: B:3:0x0005, inners: #0, #2, #4 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        boolean z11;
        boolean z12;
        boolean z13;
        while (this.f2810p) {
            try {
                Object obj = f2809u;
                synchronized (obj) {
                    if (f2807s.isEmpty()) {
                        try {
                            this.f2811q = 0;
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("ResendMsgWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("ResendMsgWorker", e12);
            }
            if (!this.f2810p) {
                break;
            }
            int i11 = this.f2811q;
            ArrayList arrayList = f2807s;
            if (i11 > arrayList.size() - 1) {
                this.f2811q = 0;
            }
            C17945a0 c17945a0 = (C17945a0) arrayList.get(this.f2811q);
            if (!c17945a0.m95189l8() && !c17945a0.m95219o8() && !c17945a0.m95091b6()) {
                if (c17945a0.m95089b4() != 0 && (c17945a0.m95089b4() != 1 || c17945a0.m95270u8() || c17945a0.m95055X7())) {
                    if (c17945a0.m95184l3() != null) {
                        C31897e4 m95184l3 = c17945a0.m95184l3();
                        if (m95184l3.m153270k() && !m95184l3.m153280u()) {
                            if (m95184l3.m153273n() || m95184l3.m153274o()) {
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        if (c17945a0.m95089b4() != 2 && c17945a0.m95089b4() != 3 && c17945a0.m95089b4() != 4) {
                            z11 = false;
                        }
                        z11 = true;
                    }
                    z12 = false;
                    z13 = false;
                    if (!z11 && !z12 && !z13) {
                        if (c17945a0.m95089b4() == 1 && C30981a.m150598f().m150605d() != EnumC30982b.CONNECTED && m2060f(c17945a0.m94974P4())) {
                            m2065k(c17945a0);
                        }
                        if (C23055e5.m118271f()) {
                            c17945a0.m95230pc();
                            this.f2811q++;
                        }
                        m2057c();
                        if (AbstractC23349d.m122770h()) {
                            Thread.sleep(50L);
                        } else {
                            Thread.sleep(100L);
                        }
                    }
                    if (z11) {
                        m2068n(c17945a0, true);
                    }
                    synchronized (arrayList) {
                        arrayList.remove(this.f2811q);
                    }
                    if (AbstractC23349d.m122770h()) {
                    }
                }
                z11 = false;
                z12 = true;
                z13 = false;
                if (!z11) {
                    if (c17945a0.m95089b4() == 1) {
                        m2065k(c17945a0);
                    }
                    if (C23055e5.m118271f()) {
                    }
                    m2057c();
                    if (AbstractC23349d.m122770h()) {
                    }
                }
                if (z11) {
                }
                synchronized (arrayList) {
                }
            }
            z11 = false;
            z12 = false;
            z13 = true;
            if (!z11) {
            }
            if (z11) {
            }
            synchronized (arrayList) {
            }
        }
        f2808t = null;
    }
}
