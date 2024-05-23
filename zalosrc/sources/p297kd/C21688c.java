package p297kd;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.text.TextUtils;
import com.zing.zalo.p062db.zadb.InterfaceC7968a;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ln0.AbstractC22543l;
import p320ld.C22438j;
import p320ld.C22440l;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p479rc.C25727d;
import p586vt.AbstractC28617b;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.C28624i;
import p586vt.InterfaceC28625j;
import pm0.C24848g0;
import sc.C26220b;
import wg0.C28988k;

/* renamed from: kd.c */
/* loaded from: classes.dex */
public final class C21688c {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static C21688c f105246q;

    /* renamed from: a */
    private final Map f105247a;

    /* renamed from: b */
    private final Object f105248b;

    /* renamed from: c */
    private AbstractC28627l f105249c;

    /* renamed from: d */
    private AbstractC28627l f105250d;

    /* renamed from: e */
    private int f105251e;

    /* renamed from: f */
    private int f105252f;

    /* renamed from: g */
    private int f105253g;

    /* renamed from: h */
    private volatile int f105254h;

    /* renamed from: i */
    private volatile int f105255i;

    /* renamed from: j */
    private volatile int f105256j;

    /* renamed from: k */
    private volatile int f105257k;

    /* renamed from: l */
    private volatile boolean f105258l;

    /* renamed from: m */
    private volatile int f105259m;

    /* renamed from: n */
    private volatile int f105260n;

    /* renamed from: o */
    private volatile boolean f105261o;

    /* renamed from: p */
    private boolean f105262p;

    /* renamed from: kd.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21688c m111854a() {
            if (C21688c.f105246q == null) {
                synchronized (C21688c.class) {
                    try {
                        if (C21688c.f105246q == null) {
                            C21688c.f105246q = new C21688c(null);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C21688c c21688c = C21688c.f105246q;
            AbstractC19074t.m100205c(c21688c);
            return c21688c;
        }
    }

    /* renamed from: kd.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC28627l {

        /* renamed from: d */
        public int f105263d;

        /* renamed from: e */
        private int f105264e;

        /* renamed from: f */
        public boolean f105265f;

        public b() {
            m143182e(CoreUtility.f89233i);
        }

        /* renamed from: f */
        public final int m111855f() {
            return this.f105264e;
        }

        /* renamed from: g */
        public final int m111856g() {
            if (m143178a() != null) {
                AbstractC28626k m143178a = m143178a();
                AbstractC19074t.m100206d(m143178a, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncSessionInfo");
                return ((C21690e) m143178a).f105269f;
            }
            return 0;
        }

        /* renamed from: h */
        public final void m111857h(int i11) {
            this.f105264e = i11;
        }
    }

    /* renamed from: kd.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC28627l {
        public c(String str, int i11, AbstractC28626k abstractC28626k) {
            super(str, i11, abstractC28626k);
        }
    }

    /* renamed from: kd.c$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f105266a;

        static {
            int[] iArr = new int[InterfaceC7968a.a.values().length];
            try {
                iArr[InterfaceC7968a.a.DBLOG_TYPE_RESTORE_DECRYPT_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC7968a.a.DBLOG_TYPE_RESTORE_DECOMPRESS_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC7968a.a.DBLOG_TYPE_RESTORE_TO_DB_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105266a = iArr;
        }
    }

    public /* synthetic */ C21688c(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: B */
    public static final void m111822B() {
        AbstractC23309i.m121694Zw(true);
        AbstractC23775p0.m124197b("db");
    }

    /* renamed from: j */
    public static final C21688c m111827j() {
        return Companion.m111854a();
    }

    /* renamed from: k */
    private final List m111828k(String str) {
        List list = (List) this.f105247a.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f105247a.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m111829l(int i11, int i12, int i13, C21690e c21690e) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        float f11;
        int i19;
        float f12;
        int i21;
        float f13;
        float f14;
        int min;
        if (c21690e != null) {
            i14 = c21690e.f105269f;
        } else {
            i14 = 0;
        }
        if (c21690e != null && c21690e.m111898x()) {
            i15 = 1;
        } else {
            i15 = 0;
        }
        if (!C22438j.m115946n(i14) && c21690e != null && !c21690e.m111868F()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!C22438j.m115948p(i14) && c21690e != null && !c21690e.m111868F()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i15 != 0 && c21690e != null) {
            c21690e.m111865C();
        }
        if (i15 != 0 && c21690e != null) {
            c21690e.m111866D();
        }
        int i22 = 80;
        int i23 = 10;
        if (!z11 && z12 && i15 != 0) {
            i17 = 10;
        } else {
            i16 = 45;
            if (z11 && !z12 && i15 != 0) {
                i17 = 0;
                i22 = 45;
            } else {
                if (!z11 || !z12 || i15 == 0) {
                    if ((m111836s() && ((C22447s.m116021W(i14) || m111837t()) && !z11 && z12)) || (!z11 && z12 && i15 == 0)) {
                        i17 = 20;
                        i23 = 0;
                    } else if (!z11 && !z12 && i15 != 0) {
                        i17 = 0;
                        i23 = 20;
                    } else if (z11 && !z12 && i15 == 0) {
                        i16 = 90;
                        i17 = 0;
                        i22 = 0;
                    } else if (z11 && z12 && i15 == 0) {
                        i22 = 35;
                        i17 = 10;
                    }
                }
                i17 = 10;
                i22 = 65;
                i16 = 15;
            }
            if (c21690e == null && c21690e.m111864B()) {
                i18 = (int) ((i22 - i15) * (((float) c21690e.m111893s()) / ((float) (c21690e.m111893s() + c21690e.m111892r()))));
                if (i11 == 14 && i12 != 0 && c21690e.m111896v() != 0 && (i12 <= c21690e.m111896v() || c21690e.m111896v() == 100)) {
                    f11 = (((i22 - i18) - i15) * 100) / c21690e.m111896v();
                } else if (i11 == 14 && i12 != 0) {
                    f11 = ((((i12 - c21690e.m111896v()) * i15) / (100.0f - c21690e.m111896v())) / i12) + ((((i22 - i18) - i15) * 100) / c21690e.m111896v());
                }
                if (i11 != 1) {
                    if (C22447s.m116041j0(i11)) {
                        i19 = i23;
                    } else if (i11 == 9) {
                        i19 = i23 + i16;
                    } else if (C22447s.m116039i0(i11)) {
                        i19 = i23 + i16 + i17;
                    } else if (i11 == 12 || i11 == 14) {
                        i19 = i23 + i16 + i17 + i18;
                    } else if (i11 == 15) {
                        i19 = i23 + i16 + i17 + i22;
                    }
                    if (i11 != 1) {
                        f13 = i12;
                        f14 = i23;
                    } else {
                        if (C22447s.m116041j0(i11)) {
                            i21 = (int) ((i16 * m111835r(i11, i12)) / 100.0f);
                        } else if (i11 == 9) {
                            f13 = i12;
                            f14 = i17;
                        } else if (i11 == 11) {
                            f13 = i12;
                            f14 = i18;
                        } else if (i11 == 12 || i11 != 14) {
                            i21 = 0;
                        } else {
                            f12 = i12 * f11;
                            i21 = (int) (f12 / 100.0f);
                        }
                        min = Math.min(Math.max(i19 + i21, 0), 100);
                        if (i11 == 17 && c21690e != null && c21690e.m143172f()) {
                            min = this.f105253g;
                        }
                        this.f105253g = min;
                        return min;
                    }
                    f12 = f13 * f14;
                    i21 = (int) (f12 / 100.0f);
                    min = Math.min(Math.max(i19 + i21, 0), 100);
                    if (i11 == 17) {
                        min = this.f105253g;
                    }
                    this.f105253g = min;
                    return min;
                }
                i19 = 0;
                if (i11 != 1) {
                }
                f12 = f13 * f14;
                i21 = (int) (f12 / 100.0f);
                min = Math.min(Math.max(i19 + i21, 0), 100);
                if (i11 == 17) {
                }
                this.f105253g = min;
                return min;
            }
            this.f105262p = true;
            i18 = (!z12 || z11 || i15 == 0) ? (i15 == 0 || !(z12 || z11)) ? i22 / 2 : i22 : 0;
            f11 = i22 - i18;
            if (i11 != 1) {
            }
            i19 = 0;
            if (i11 != 1) {
            }
            f12 = f13 * f14;
            i21 = (int) (f12 / 100.0f);
            min = Math.min(Math.max(i19 + i21, 0), 100);
            if (i11 == 17) {
            }
            this.f105253g = min;
            return min;
        }
        i16 = 0;
        if (c21690e == null) {
        }
        this.f105262p = true;
        if (z12) {
        }
        f11 = i22 - i18;
        if (i11 != 1) {
        }
        i19 = 0;
        if (i11 != 1) {
        }
        f12 = f13 * f14;
        i21 = (int) (f12 / 100.0f);
        min = Math.min(Math.max(i19 + i21, 0), 100);
        if (i11 == 17) {
        }
        this.f105253g = min;
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:            if (p320ld.C22438j.m115948p(r4) != false) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:            if (r15.f105270g == true) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:            if (r12 == 15) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002d, code lost:            r4 = 25;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003c, code lost:            if (r15.f105270g == true) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:            if (r15.m111865C() != false) goto L108;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005f, code lost:            if (r15.m111866D() == false) goto L118;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m111830m(int i11, int i12, int i13, C21690e c21690e) {
        int i14;
        int i15;
        int i16;
        int i17;
        int min;
        if (c21690e != null && c21690e.m111898x()) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        if (c21690e != null) {
            i15 = c21690e.f105269f;
        } else {
            i15 = 0;
        }
        int i18 = 25;
        if (!C22447s.m116041j0(i11)) {
            if (C22447s.m116039i0(i11)) {
                if (c21690e != null) {
                }
                i17 = 50;
            } else {
                if (i11 == 14 && i13 == 2) {
                    if (!C22438j.m115948p(i15)) {
                        if (c21690e != null) {
                        }
                        i16 = 25;
                    }
                    i16 = 50;
                } else {
                    if (i11 == 14 && i13 == 1) {
                        if (c21690e != null) {
                        }
                        i16 = 25;
                    } else if (i11 == 12) {
                        i16 = this.f105251e;
                    } else if (i11 != 15) {
                        i16 = 0;
                    }
                    i16 = 50;
                }
                if (!C22447s.m116041j0(i11)) {
                    if (C22447s.m116039i0(i11)) {
                        if (i16 != 25) {
                            if (i16 == 50) {
                                if (c21690e != null) {
                                }
                            }
                        }
                    } else if (i11 == 14) {
                        if (i13 != 2 && i16 == 25) {
                            i18 = 75;
                        }
                        i18 = 50;
                    } else if (i11 == 12) {
                        i18 = this.f105252f;
                    }
                    this.f105251e = i16;
                    this.f105252f = i18;
                    int m111835r = m111835r(i11, i12);
                    min = Math.min(Math.max(((i16 * m111835r) / 100) + i18, 0), 100);
                    if (i11 != 17 && c21690e != null && c21690e.m143172f()) {
                        min = this.f105253g;
                    } else {
                        this.f105253g = min;
                    }
                    AbstractC20110a.f98889a.mo104548a("phase=" + i11 + ", action=" + i13 + ", ratioProgressMediaFlow=" + i14 + ", ratioInTotalFlow=" + i16 + " , preProcessPercentDone=" + i18 + ", percentProgressSubFlow=" + m111835r + ", result=" + min, new Object[0]);
                    return min;
                }
                i18 = 0;
                this.f105251e = i16;
                this.f105252f = i18;
                int m111835r2 = m111835r(i11, i12);
                min = Math.min(Math.max(((i16 * m111835r2) / 100) + i18, 0), 100);
                if (i11 != 17) {
                }
                this.f105253g = min;
                AbstractC20110a.f98889a.mo104548a("phase=" + i11 + ", action=" + i13 + ", ratioProgressMediaFlow=" + i14 + ", ratioInTotalFlow=" + i16 + " , preProcessPercentDone=" + i18 + ", percentProgressSubFlow=" + m111835r2 + ", result=" + min, new Object[0]);
                return min;
            }
        }
        i16 = i17 * i14;
        if (!C22447s.m116041j0(i11)) {
        }
        i18 = 0;
        this.f105251e = i16;
        this.f105252f = i18;
        int m111835r22 = m111835r(i11, i12);
        min = Math.min(Math.max(((i16 * m111835r22) / 100) + i18, 0), 100);
        if (i11 != 17) {
        }
        this.f105253g = min;
        AbstractC20110a.f98889a.mo104548a("phase=" + i11 + ", action=" + i13 + ", ratioProgressMediaFlow=" + i14 + ", ratioInTotalFlow=" + i16 + " , preProcessPercentDone=" + i18 + ", percentProgressSubFlow=" + m111835r22 + ", result=" + min, new Object[0]);
        return min;
    }

    /* renamed from: n */
    private final int m111831n(InterfaceC7968a.a aVar, int i11) {
        int i12 = d.f105266a[aVar.ordinal()];
        if (i12 != 2) {
            if (i12 != 3) {
                return -1;
            }
            return (i11 / 2) + 50;
        }
        return i11 / 2;
    }

    /* renamed from: o */
    private final int m111832o(InterfaceC7968a.a aVar, int i11) {
        int i12 = d.f105266a[aVar.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    return -1;
                }
                return (i11 / 10) + 90;
            }
            return ((i11 * 3) / 10) + 60;
        }
        return (i11 * 3) / 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000a A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m111833p(int i11, int i12) {
        switch (i11) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 8;
            case 4:
            default:
                return -1;
            case 5:
                if (!this.f105258l) {
                    return 10;
                }
                break;
            case 6:
                if (!this.f105258l) {
                    return (i12 / 5) + 10;
                }
                return -1;
            case 7:
                if (!this.f105258l) {
                    return 30;
                }
                break;
            case 8:
                return ((i12 * 7) / 10) + 30;
        }
    }

    /* renamed from: q */
    private final int m111834q(int i11, int i12, int i13, C21690e c21690e) {
        if (c21690e != null && c21690e.m111863A()) {
            return m111829l(i11, i12, i13, c21690e);
        }
        return m111830m(i11, i12, i13, c21690e);
    }

    /* renamed from: r */
    private final int m111835r(int i11, int i12) {
        switch (i11) {
            case 3:
                return (i12 / 10) + 5;
            case 4:
                return ((i12 * 4) / 5) + 15;
            case 5:
                return 35;
            case 6:
            case 10:
            case 13:
            default:
                return 0;
            case 7:
                return (i12 / 2) + 45;
            case 8:
                return 95;
            case 9:
                return ((i12 * 3) / 5) + 10;
            case 11:
                return 70;
            case 12:
            case 15:
                return 100;
            case 14:
                return i12;
        }
    }

    /* renamed from: s */
    private final boolean m111836s() {
        return AbstractC23306f.m120633X1().m89807v();
    }

    /* renamed from: t */
    private final boolean m111837t() {
        return AbstractC23306f.m120691m2().m2461l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:            if ((r7.f105249c instanceof p297kd.C21688c.c) != false) goto L89;     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m111838v(C21688c c21688c, ArrayList arrayList, InterfaceC28625j interfaceC28625j, String[] strArr, String str) {
        AbstractC28627l abstractC28627l;
        AbstractC28617b m143160e;
        AbstractC19074t.m100208f(c21688c, "this$0");
        AbstractC19074t.m100208f(arrayList, "$queueList");
        AbstractC19074t.m100208f(interfaceC28625j, "$observer");
        AbstractC19074t.m100208f(strArr, "$queues");
        try {
            synchronized (c21688c.f105248b) {
                try {
                    if (c21688c.f105249c != null) {
                        if (arrayList.contains("SYNC_MES")) {
                            if (!(c21688c.f105249c instanceof b)) {
                            }
                            interfaceC28625j.mo57172lk(c21688c.f105249c);
                            return;
                        }
                        if (arrayList.contains("PC_TRANSFER")) {
                        }
                    }
                    if (c21688c.f105250d != null && ((arrayList.contains("SYNC_MES") && (c21688c.f105250d instanceof b)) || (arrayList.contains("PC_TRANSFER") && (c21688c.f105250d instanceof c)))) {
                        interfaceC28625j.mo57172lk(c21688c.f105250d);
                        return;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    if (arrayList.contains("SYNC_MES")) {
                        abstractC28627l = new b();
                        abstractC28627l.f132722a = 0;
                        abstractC28627l.m143181d(AbstractC23306f.m120692n().m133053o());
                        AbstractC20110a.f98889a.mo104548a("Load job result of sync message", new Object[0]);
                    } else {
                        abstractC28627l = null;
                    }
                    if (arrayList.contains("PC_TRANSFER") && (m143160e = C28624i.Companion.m143166a().m143160e("PC_TRANSFER")) != null && m143160e.m143127f() == 4 && m143160e.m143128g() > AbstractC0924m0.m3474U2()) {
                        abstractC28627l = new c(m143160e.m143129h(), 0, m143160e.m143126e());
                    }
                    synchronized (c21688c.f105248b) {
                        try {
                            c21688c.f105250d = abstractC28627l;
                            if (c21688c.m111846g(interfaceC28625j, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                                interfaceC28625j.mo57172lk(abstractC28627l);
                                AbstractC20110a.f98889a.mo104548a("updateJobStatus to observer: " + str, new Object[0]);
                            } else {
                                AbstractC20110a.f98889a.mo104559s("Observer " + str + " has just register but unregistered now !!", new Object[0]);
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: A */
    public final void m111839A() {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: kd.b
            @Override // java.lang.Runnable
            public final void run() {
                C21688c.m111822B();
            }
        });
    }

    /* renamed from: C */
    public final void m111840C(boolean z11) {
        try {
            AbstractC28627l abstractC28627l = this.f105250d;
            if (abstractC28627l != null && (abstractC28627l instanceof c)) {
                AbstractC19074t.m100205c(abstractC28627l);
                if (abstractC28627l.m143178a() != null) {
                    AbstractC28627l abstractC28627l2 = this.f105250d;
                    AbstractC19074t.m100205c(abstractC28627l2);
                    AbstractC28626k m143178a = abstractC28627l2.m143178a();
                    AbstractC19074t.m100205c(m143178a);
                    m143178a.m143176k(z11);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: D */
    public final void m111841D(int i11, int i12, int i13, C21690e c21690e) {
        int i14;
        int m111834q;
        boolean z11;
        synchronized (this.f105248b) {
            if (i11 == this.f105254h && i13 <= this.f105255i) {
                return;
            }
            List m111828k = m111828k("SYNC_MES");
            this.f105254h = i11;
            this.f105255i = i13;
            b bVar = new b();
            bVar.f132722a = i11;
            if (c21690e != null) {
                i14 = c21690e.f105269f;
            } else {
                i14 = 0;
            }
            if (C22447s.f109797a.m116072X(i14)) {
                m111834q = C25727d.Companion.m132782e();
            } else {
                m111834q = m111834q(i11, i13, i12, c21690e);
            }
            bVar.f105263d = m111834q;
            bVar.m143181d(c21690e);
            bVar.m111857h(i12);
            if (c21690e != null && c21690e.m111863A()) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.f105265f = z11;
            if (i11 == 0) {
                this.f105249c = null;
                this.f105256j = 0;
                this.f105257k = 0;
                this.f105258l = false;
                this.f105259m = 0;
                this.f105260n = 0;
                this.f105261o = false;
                this.f105250d = bVar;
            } else {
                this.f105249c = bVar;
                this.f105250d = null;
            }
            Iterator it = m111828k.iterator();
            while (it.hasNext()) {
                ((InterfaceC28625j) it.next()).mo57172lk(bVar);
            }
            AbstractC20110a.f98889a.mo104548a("updateSyncStatus phase: %d - progress: %d - childProgress: %d", Integer.valueOf(i11), Integer.valueOf(bVar.f105263d), Integer.valueOf(i13));
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: E */
    public final void m111842E(int i11, int i12, C21690e c21690e) {
        m111841D(i11, i12, 0, c21690e);
    }

    /* renamed from: F */
    public final void m111843F(c cVar) {
        AbstractC19074t.m100208f(cVar, "message");
        synchronized (this.f105248b) {
            try {
                Iterator it = m111828k("PC_TRANSFER").iterator();
                while (it.hasNext()) {
                    ((InterfaceC28625j) it.next()).mo57172lk(cVar);
                }
                if (cVar.f132722a == 0) {
                    this.f105249c = null;
                    this.f105250d = cVar;
                } else {
                    this.f105249c = cVar;
                    this.f105250d = null;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m111844e() {
        boolean m116076s0 = C22447s.f109797a.m116076s0();
        List<InterfaceC28625j> m111828k = m111828k("SYNC_MES");
        if (f105246q == null) {
            return;
        }
        int i11 = 0;
        for (InterfaceC28625j interfaceC28625j : m111828k) {
            if (m116076s0) {
                if (interfaceC28625j instanceof C28988k) {
                    i11++;
                }
            } else if (interfaceC28625j instanceof C22440l) {
                i11++;
            }
        }
        if (i11 == 0) {
            if (C22447s.m116054q0(false, 1, null)) {
                C26220b.m134827j("Register noti observer bk/restore", null, 2, null);
                if (m116076s0) {
                    Companion.m111854a().m111849u(C28988k.f134117p, "SYNC_MES");
                    return;
                } else {
                    Companion.m111854a().m111849u(C22440l.m115973c(), "SYNC_MES");
                    return;
                }
            }
            C26220b.m134827j("Ignore noti observer bk/restore", null, 2, null);
            return;
        }
        if (i11 > 1) {
            C26220b.m134820c("Exception (-8) Multiple observer instance of SyncDbNotification registered");
        }
    }

    /* renamed from: f */
    public final void m111845f() {
        List m111828k = m111828k("SYNC_MES");
        AbstractC19074t.m100206d(m111828k, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.jobs.JobObserver>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.jobs.JobObserver> }");
        ArrayList arrayList = (ArrayList) m111828k;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            Object obj = arrayList.get(size);
            AbstractC19074t.m100207e(obj, "get(...)");
            InterfaceC28625j interfaceC28625j = (InterfaceC28625j) obj;
            if (interfaceC28625j instanceof C22440l) {
                ((C22440l) interfaceC28625j).m115980b();
            }
            arrayList.remove(size);
            if (i11 >= 0) {
                size = i11;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean m111846g(InterfaceC28625j interfaceC28625j, String... strArr) {
        AbstractC19074t.m100208f(interfaceC28625j, "observer");
        AbstractC19074t.m100208f(strArr, "queues");
        for (String str : strArr) {
            if (m111828k(str).contains(interfaceC28625j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m111847h(Class cls) {
        AbstractC19074t.m100208f(cls, "observerClass");
        synchronized (this.f105248b) {
            Iterator it = m111828k("SYNC_MES").iterator();
            while (it.hasNext()) {
                if (cls.isInstance((InterfaceC28625j) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: i */
    public final int m111848i() {
        return this.f105255i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: kd.a.<init>(kd.c, java.util.ArrayList, vt.j, java.lang.String[], java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: u */
    public final void m111849u(p586vt.InterfaceC28625j r12, java.lang.String... r13) {
        /*
            r11 = this;
            java.lang.String r0 = "observer"
            fn0.AbstractC19074t.m100208f(r12, r0)
            java.lang.String r0 = "queues"
            fn0.AbstractC19074t.m100208f(r13, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r13.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r13, r0)
            java.util.List r0 = qm0.AbstractC25364q.m131468m(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r6 = r0.getSimpleName()
            java.lang.Object r0 = r11.f105248b
            monitor-enter(r0)
            int r1 = r13.length     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            r4 = 0
            r5 = 0
        L29:
            if (r4 >= r1) goto L61
            r7 = r13[r4]     // Catch: java.lang.Throwable -> L5c
            java.util.List r8 = r11.m111828k(r7)     // Catch: java.lang.Throwable -> L5c
            boolean r9 = r8.contains(r12)     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L5e
            ho0.a$a r5 = ho0.AbstractC20110a.f98889a     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "Observer "
            r9.append(r10)     // Catch: java.lang.Throwable -> L5c
            r9.append(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = " register to queue "
            r9.append(r10)     // Catch: java.lang.Throwable -> L5c
            r9.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5c
            r5.mo104554k(r7, r9)     // Catch: java.lang.Throwable -> L5c
            r8.add(r12)     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            goto L5e
        L5c:
            r12 = move-exception
            goto L81
        L5e:
            int r4 = r4 + 1
            goto L29
        L61:
            if (r5 != 0) goto L65
            monitor-exit(r0)
            return
        L65:
            boolean r1 = r12 instanceof p320ld.C22440l     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L6b
            monitor-exit(r0)
            return
        L6b:
            ag0.p0$e r1 = ag0.AbstractC0837p0.Companion     // Catch: java.lang.Throwable -> L5c
            ag0.b1 r7 = r1.m2236a()     // Catch: java.lang.Throwable -> L5c
            kd.a r8 = new kd.a     // Catch: java.lang.Throwable -> L5c
            r1 = r8
            r2 = r11
            r4 = r12
            r5 = r13
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            r7.mo2040a(r8)     // Catch: java.lang.Throwable -> L5c
            pm0.g0 r12 = pm0.C24848g0.f119245a     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
            return
        L81:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p297kd.C21688c.m111849u(vt.j, java.lang.String[]):void");
    }

    /* renamed from: w */
    public final void m111850w() {
        synchronized (this.f105248b) {
            this.f105250d = null;
            this.f105249c = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: x */
    public final void m111851x(InterfaceC28625j interfaceC28625j, String... strArr) {
        AbstractC19074t.m100208f(interfaceC28625j, "observer");
        AbstractC19074t.m100208f(strArr, "queues");
        synchronized (this.f105248b) {
            try {
                for (String str : strArr) {
                    m111828k(str).remove(interfaceC28625j);
                    AbstractC20110a.f98889a.mo104554k("Observer %s unregister successfully from queue %s", interfaceC28625j.getClass().getSimpleName(), str);
                }
                if (strArr.length == 1 && this.f105250d != null) {
                    this.f105250d = null;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public final void m111852y(int i11, String str, C21690e c21690e) {
        int i12;
        int m116588k;
        AbstractC19074t.m100208f(c21690e, "currentSessionInfo");
        synchronized (this.f105248b) {
            try {
                if (i11 != 6) {
                    if (i11 != 8) {
                        i12 = 0;
                    } else {
                        this.f105257k++;
                        i12 = this.f105257k;
                    }
                } else {
                    this.f105256j++;
                    if (str != null && str.length() != 0 && TextUtils.isDigitsOnly(str)) {
                        long parseLong = Long.parseLong(str);
                        if (parseLong <= 0) {
                            return;
                        } else {
                            i12 = (int) ((this.f105256j * 100.0f) / ((float) parseLong));
                        }
                    }
                    return;
                }
                m116588k = AbstractC22543l.m116588k(i12, 0, 100);
                if (!this.f105258l && i11 == 4) {
                    this.f105258l = true;
                }
                int m111833p = m111833p(i11, m116588k);
                AbstractC20110a.f98889a.mo104548a("childProgressStatusExport=" + m116588k + ", progressExport=" + m111833p, new Object[0]);
                if (m111833p == -1) {
                    return;
                }
                m111841D(9, 1, m111833p, c21690e);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x002a, B:21:0x007c, B:23:0x0084, B:29:0x0093, B:33:0x0089, B:34:0x0040, B:35:0x0047, B:36:0x0048, B:37:0x0050, B:38:0x0058, B:40:0x005c, B:42:0x0060, B:45:0x0067, B:48:0x006e), top: B:13:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #0 {all -> 0x004e, blocks: (B:14:0x002a, B:21:0x007c, B:23:0x0084, B:29:0x0093, B:33:0x0089, B:34:0x0040, B:35:0x0047, B:36:0x0048, B:37:0x0050, B:38:0x0058, B:40:0x005c, B:42:0x0060, B:45:0x0067, B:48:0x006e), top: B:13:0x002a }] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m111853z(InterfaceC7968a.a aVar, String str, String str2, C21690e c21690e) {
        float f11;
        int i11;
        int m116588k;
        int m111831n;
        int i12;
        AbstractC19074t.m100208f(aVar, "dbEventType");
        AbstractC19074t.m100208f(c21690e, "currentSessionInfo");
        if (str2 != null && str2.length() != 0 && TextUtils.isDigitsOnly(str2)) {
            long parseLong = Long.parseLong(str2);
            if (parseLong <= 0) {
                return;
            }
            synchronized (this.f105248b) {
                try {
                    int i13 = d.f105266a[aVar.ordinal()];
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                i11 = 0;
                                m116588k = AbstractC22543l.m116588k(i11, 0, 100);
                                if (!this.f105261o) {
                                    m111831n = m111832o(aVar, m116588k);
                                } else {
                                    m111831n = m111831n(aVar, m116588k);
                                }
                                if (m111831n != -1) {
                                    return;
                                }
                                m111841D(4, 2, m111831n, c21690e);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                return;
                            }
                            this.f105260n++;
                            i12 = this.f105260n;
                        } else {
                            this.f105259m++;
                            i12 = this.f105259m;
                        }
                        f11 = i12;
                    } else {
                        if (!this.f105261o) {
                            this.f105261o = true;
                        }
                        if (str != null && str.length() != 0 && TextUtils.isDigitsOnly(str)) {
                            long parseLong2 = Long.parseLong(str);
                            if (parseLong2 < 0) {
                                return;
                            } else {
                                f11 = (float) parseLong2;
                            }
                        }
                        return;
                    }
                    i11 = (int) ((f11 * 100.0f) / ((float) parseLong));
                    m116588k = AbstractC22543l.m116588k(i11, 0, 100);
                    if (!this.f105261o) {
                    }
                    if (m111831n != -1) {
                    }
                } finally {
                }
            }
        }
    }

    private C21688c() {
        this.f105248b = new Object();
        this.f105254h = -1;
        this.f105255i = -1;
        this.f105262p = true;
        this.f105247a = new HashMap();
    }
}
