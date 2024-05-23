package p281jy;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import bn0.AbstractC2933b;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import ky.C21969b;
import me0.AbstractC23041d2;
import me0.C23257x1;
import my.AbstractC23482e;
import my.AbstractC23487j;
import my.C23478a;
import my.C23479b;
import my.C23480c;
import my.C23481d;
import p281jy.AbstractC21410p;
import p281jy.InterfaceC21399e;
import p591vz.C28679c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import th.C26691l;
import uz.C27385a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: jy.u */
/* loaded from: classes4.dex */
public final class C21415u extends AbstractC21410p {
    public static final a Companion = new a(null);

    /* renamed from: h */
    private final int f104353h;

    /* renamed from: i */
    private InterfaceC21399e.a f104354i;

    /* renamed from: j */
    private boolean f104355j;

    /* renamed from: k */
    private boolean f104356k;

    /* renamed from: l */
    private Boolean f104357l;

    /* renamed from: m */
    private long f104358m;

    /* renamed from: n */
    private final Set f104359n;

    /* renamed from: o */
    private CoroutineScope f104360o;

    /* renamed from: p */
    private long f104361p;

    /* renamed from: q */
    private boolean f104362q;

    /* renamed from: r */
    private int f104363r;

    /* renamed from: s */
    private final int[] f104364s;

    /* renamed from: t */
    private final byte[][] f104365t;

    /* renamed from: u */
    private final boolean[] f104366u;

    /* renamed from: v */
    private int f104367v;

    /* renamed from: w */
    private AtomicBoolean[] f104368w;

    /* renamed from: x */
    private final b f104369x;

    /* renamed from: jy.u$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jy.u$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo110892a(InterfaceC21399e interfaceC21399e, Object obj, int i11, int i12, int i13);
    }

    /* renamed from: jy.u$c */
    /* loaded from: classes4.dex */
    private static final class c implements InterfaceC21399e.a {

        /* renamed from: p */
        private final InterfaceC21399e f104370p;

        /* renamed from: q */
        private final b f104371q;

        public c(InterfaceC21399e interfaceC21399e, b bVar) {
            AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
            AbstractC19074t.m100208f(bVar, "targetScanCallback");
            this.f104370p = interfaceC21399e;
            this.f104371q = bVar;
        }

        @Override // p281jy.InterfaceC21399e.a
        /* renamed from: a */
        public void mo49548a(Object obj, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(obj, "data");
            this.f104371q.mo110892a(this.f104370p, obj, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jy.u$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f104372t;

        /* renamed from: u */
        int f104373u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f104374v;

        /* renamed from: w */
        final /* synthetic */ C28679c f104375w;

        /* renamed from: x */
        final /* synthetic */ C27385a f104376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC18505l interfaceC18505l, C28679c c28679c, C27385a c27385a, Continuation continuation) {
            super(2, continuation);
            this.f104374v = interfaceC18505l;
            this.f104375w = c28679c;
            this.f104376x = c27385a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f104374v, this.f104375w, this.f104376x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC18505l interfaceC18505l;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104373u;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC18505l = (InterfaceC18505l) this.f104372t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l2 = this.f104374v;
                C28679c c28679c = this.f104375w;
                String m140303b = this.f104376x.m140303b();
                float m140302a = this.f104376x.m140302a();
                this.f104372t = interfaceC18505l2;
                this.f104373u = 1;
                Object m143638a = c28679c.m143638a(m140303b, m140302a, this);
                if (m143638a == m142578e) {
                    return m142578e;
                }
                interfaceC18505l = interfaceC18505l2;
                obj = m143638a;
            }
            interfaceC18505l.mo205i9(obj);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jy.u$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C27385a f104378r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C27385a c27385a) {
            super(1);
            this.f104378r = c27385a;
        }

        /* renamed from: a */
        public final void m110909a(C28679c.a aVar) {
            AbstractC19074t.m100208f(aVar, "resultCode");
            if (aVar instanceof C28679c.a.b) {
                AbstractC21410p.a m110884d = C21415u.this.m110884d();
                if (m110884d != null) {
                    m110884d.mo49546c(this.f104378r);
                }
                if (this.f104378r.m140304c() == C27385a.a.f129025q) {
                    C21415u.this.f104359n.add(this.f104378r.m140303b());
                }
            }
            if (this.f104378r.m140304c() == C27385a.a.f129024p) {
                C21415u.this.m110900s();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m110909a((C28679c.a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21415u(InterfaceC21399e interfaceC21399e, InterfaceC21399e interfaceC21399e2, InterfaceC21399e interfaceC21399e3) {
        super(r1, r9, interfaceC21399e3 != null ? new C21397c(interfaceC21399e3, 100L, 1000L) : null);
        C21398d c21398d;
        C21398d c21398d2;
        if (interfaceC21399e != null) {
            c21398d = new C21398d(interfaceC21399e, 0L);
        } else {
            c21398d = null;
        }
        if (interfaceC21399e2 != null) {
            c21398d2 = new C21398d(interfaceC21399e2, 100L);
        } else {
            c21398d2 = null;
        }
        int length = m110866a().length;
        this.f104353h = length;
        this.f104359n = new LinkedHashSet();
        this.f104360o = CoroutineScopeKt.m112637a(Dispatchers.m112679a());
        this.f104364s = new int[length + 1];
        int i11 = length + 1;
        byte[][] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = new byte[0];
        }
        this.f104365t = bArr;
        int i13 = this.f104353h;
        this.f104366u = new boolean[i13 + 1];
        this.f104367v = -1;
        AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            atomicBooleanArr[i14] = new AtomicBoolean(true);
        }
        this.f104368w = atomicBooleanArr;
        this.f104369x = new b() { // from class: jy.r
            @Override // p281jy.C21415u.b
            /* renamed from: a */
            public final void mo110892a(InterfaceC21399e interfaceC21399e4, Object obj, int i15, int i16, int i17) {
                C21415u.m110899r(C21415u.this, interfaceC21399e4, obj, i15, i16, i17);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:45|(9:(2:48|(2:50|(1:(2:53|54))(1:55))(1:79))(1:80)|56|57|58|59|60|61|62|(2:64|65)(1:66))|81|56|57|58|59|60|61|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0151, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015c, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m110899r(C21415u c21415u, InterfaceC21399e interfaceC21399e, Object obj, int i11, int i12, int i13) {
        int i14;
        AbstractC21410p.a m110884d;
        AbstractC19074t.m100208f(c21415u, "this$0");
        AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
        AbstractC19074t.m100208f(obj, "data");
        if (interfaceC21399e != c21415u.m110883c() && interfaceC21399e != c21415u.m110882b()) {
            if (interfaceC21399e == c21415u.m110882b()) {
                if ((obj instanceof AbstractC23487j) && !c21415u.f104355j) {
                    c21415u.f104355j = true;
                }
                InterfaceC21399e.a aVar = c21415u.f104354i;
                if (aVar != null) {
                    aVar.mo49548a(obj, i11, i12, i13);
                    return;
                }
                return;
            }
            if (interfaceC21399e == c21415u.m110885e() && (obj instanceof C23481d)) {
                AbstractC21410p.a m110884d2 = c21415u.m110884d();
                if (m110884d2 != null) {
                    m110884d2.mo49547d((AbstractC23482e) obj, C27385a.a.f129024p);
                }
                if (!c21415u.f104362q && System.currentTimeMillis() - c21415u.f104361p >= 5000) {
                    c21415u.f104362q = true;
                }
                if (!c21415u.f104355j && c21415u.f104362q) {
                    C23481d c23481d = (C23481d) obj;
                    if (c23481d.m123264a() >= C26691l.m137128a()) {
                        if (!c21415u.f104356k) {
                            if (c21415u.f104358m == 0) {
                                c21415u.f104358m = System.currentTimeMillis();
                                return;
                            }
                            if (System.currentTimeMillis() - c21415u.f104358m < 3000) {
                                return;
                            }
                            String valueOf = String.valueOf(System.currentTimeMillis());
                            File m110901t = c21415u.m110901t();
                            m110901t.mkdirs();
                            File file = new File(m110901t, valueOf + ".jpg");
                            YuvImage yuvImage = new YuvImage(c23481d.m123263d(), 17, i11, i12, null);
                            Rect rect = new Rect(0, 0, i11, i12);
                            int i15 = 360 - i13;
                            try {
                                if (i15 != 0) {
                                    if (i15 != 90) {
                                        if (i15 != 180) {
                                            if (i15 != 270) {
                                                if (i15 != 360) {
                                                    AbstractC20110a.f98889a.mo104551d("Invalid rotation : " + i15, new Object[0]);
                                                    return;
                                                }
                                            } else {
                                                i14 = 8;
                                            }
                                        } else {
                                            i14 = 3;
                                        }
                                    } else {
                                        i14 = 6;
                                    }
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    yuvImage.compressToJpeg(rect, 90, fileOutputStream);
                                    AbstractC2933b.m13890a(fileOutputStream, null);
                                    C23257x1 c23257x1 = new C23257x1(file);
                                    c23257x1.m119905R("Orientation", String.valueOf(i14));
                                    c23257x1.m119904P();
                                    AbstractC20110a.f98889a.mo104554k("Saved bad qr to " + file.getAbsolutePath(), new Object[0]);
                                    c21415u.f104358m = 0L;
                                    c21415u.m110890j(true);
                                    c21415u.f104356k = true;
                                    m110884d = c21415u.m110884d();
                                    if (m110884d == null) {
                                        C27385a.a aVar2 = C27385a.a.f129024p;
                                        String absolutePath = file.getAbsolutePath();
                                        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                                        m110884d.mo49544a(new C27385a(aVar2, absolutePath, c23481d.m123264a(), false, 8, null));
                                        return;
                                    }
                                    return;
                                }
                                yuvImage.compressToJpeg(rect, 90, fileOutputStream);
                                AbstractC2933b.m13890a(fileOutputStream, null);
                                C23257x1 c23257x12 = new C23257x1(file);
                                c23257x12.m119905R("Orientation", String.valueOf(i14));
                                c23257x12.m119904P();
                                AbstractC20110a.f98889a.mo104554k("Saved bad qr to " + file.getAbsolutePath(), new Object[0]);
                                c21415u.f104358m = 0L;
                                c21415u.m110890j(true);
                                c21415u.f104356k = true;
                                m110884d = c21415u.m110884d();
                                if (m110884d == null) {
                                }
                            } finally {
                            }
                            i14 = 1;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        } else if (!c21415u.m110886f()) {
                            if (c21415u.f104358m == 0) {
                                c21415u.f104358m = System.currentTimeMillis();
                                return;
                            }
                            if (System.currentTimeMillis() - c21415u.f104358m >= 3000) {
                                c21415u.f104358m = 0L;
                                c21415u.m110890j(true);
                                AbstractC21410p.a m110884d3 = c21415u.m110884d();
                                if (m110884d3 != null) {
                                    m110884d3.mo49545b(C27385a.a.f129024p);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if ((obj instanceof AbstractC23487j) && !c21415u.f104355j) {
                c21415u.f104355j = true;
            }
            InterfaceC21399e.a aVar3 = c21415u.f104354i;
            if (aVar3 != null) {
                aVar3.mo49548a(obj, i11, i12, i13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m110900s() {
        try {
            AbstractC23041d2.m118210i(m110901t());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: t */
    private final File m110901t() {
        return new File(CoreUtility.getAppContext().getFilesDir(), "badqrcode");
    }

    /* renamed from: u */
    private final boolean m110902u(C23480c c23480c) {
        boolean z11;
        AbstractC21410p.a m110884d = m110884d();
        if (m110884d != null) {
            m110884d.mo49547d(c23480c, C27385a.a.f129025q);
        }
        boolean z12 = false;
        if (c23480c.m123264a() >= C26691l.m137128a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!this.f104359n.contains(c23480c.m123262e())) {
                this.f104359n.add(c23480c.m123262e());
                String m110904w = m110904w(c23480c.m123261d());
                if (m110904w != null) {
                    z12 = true;
                }
                if (z12) {
                    if (m110904w == null) {
                        m110904w = "";
                    }
                } else {
                    m110904w = c23480c.m123262e();
                }
                AbstractC21410p.a m110884d2 = m110884d();
                if (m110884d2 != null) {
                    m110884d2.mo49544a(new C27385a(C27385a.a.f129025q, m110904w, c23480c.m123264a(), z12));
                }
            } else {
                AbstractC21410p.a m110884d3 = m110884d();
                if (m110884d3 != null) {
                    m110884d3.mo49545b(C27385a.a.f129025q);
                }
            }
        }
        c23480c.m123261d().recycle();
        return z11;
    }

    /* renamed from: v */
    private final boolean m110903v() {
        if (!this.f104355j && System.currentTimeMillis() - this.f104361p >= 5000) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final String m110904w(Bitmap bitmap) {
        Object m129218b;
        FileOutputStream fileOutputStream;
        Object obj = null;
        try {
            C24861r.a aVar = C24861r.f119264q;
            String valueOf = String.valueOf(System.currentTimeMillis());
            File m110901t = m110901t();
            m110901t.mkdirs();
            File file = new File(m110901t, valueOf + ".jpg");
            Integer num = 1;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                AbstractC2933b.m13890a(fileOutputStream, null);
                if (num != null) {
                    C23257x1 c23257x1 = new C23257x1(file);
                    c23257x1.m119905R("Orientation", num.toString());
                    c23257x1.m119904P();
                }
                AbstractC20110a.f98889a.mo104554k("Saved bad qr to " + file.getAbsolutePath(), new Object[0]);
                m129218b = C24861r.m129218b(file.getAbsolutePath());
            } finally {
            }
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        return (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:            if (r1 == null) goto L36;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m110905x(C19055h0 c19055h0, C21415u c21415u, Object[] objArr, C19051f0 c19051f0, int i11, boolean z11, InterfaceC21399e.a aVar, InterfaceC21399e interfaceC21399e, Object obj, int i12, int i13, int i14) {
        boolean z12;
        Object obj2;
        AbstractC19074t.m100208f(c19055h0, "$responseCount");
        AbstractC19074t.m100208f(c21415u, "this$0");
        AbstractC19074t.m100208f(objArr, "$results");
        AbstractC19074t.m100208f(c19051f0, "$isHandled");
        AbstractC19074t.m100208f(aVar, "$callback");
        AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
        AbstractC19074t.m100208f(obj, "data");
        c19055h0.f94931p++;
        if (interfaceC21399e == c21415u.m110885e()) {
            objArr[1] = obj;
        } else {
            Object obj3 = objArr[0];
            if (!(obj3 instanceof AbstractC23487j) && (obj instanceof AbstractC23487j)) {
                objArr[0] = obj;
            } else if (!(obj3 instanceof C23479b)) {
                objArr[0] = obj;
            }
        }
        if (!c19051f0.f94928p) {
            if (c19055h0.f94931p == i11 || (objArr[0] instanceof AbstractC23487j)) {
                c19051f0.f94928p = true;
                if (z11 && !(objArr[0] instanceof AbstractC23487j)) {
                    Object obj4 = objArr[1];
                    if (obj4 instanceof C23480c) {
                        AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.BitmapClassifyResult");
                        if (c21415u.m110902u((C23480c) obj4)) {
                            z12 = true;
                            obj2 = objArr[0];
                            if (obj2 != null) {
                                if (!(!z12)) {
                                    obj2 = null;
                                }
                            }
                            obj2 = C23478a.f114005a;
                            aVar.mo49548a(obj2, 0, 0, 0);
                        }
                    }
                }
                z12 = false;
                obj2 = objArr[0];
                if (obj2 != null) {
                }
                obj2 = C23478a.f114005a;
                aVar.mo49548a(obj2, 0, 0, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m110906y(C21415u c21415u, int i11, boolean z11) {
        int i12;
        byte[] bArr;
        boolean z12;
        AbstractC19074t.m100208f(c21415u, "this$0");
        synchronized (c21415u.f104365t) {
            try {
                boolean[] zArr = c21415u.f104366u;
                int i13 = c21415u.f104353h;
                i12 = 0;
                if (zArr[i13]) {
                    int i14 = c21415u.f104363r;
                    c21415u.f104367v = i14;
                    for (int i15 = 0; i15 < i13; i15++) {
                        boolean[] zArr2 = c21415u.f104366u;
                        if (i15 != i11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zArr2[i15] = z12;
                    }
                    int[] iArr = c21415u.f104364s;
                    iArr[i14] = iArr[i14] + 1;
                    c21415u.f104366u[i14] = false;
                    int length = iArr.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length) {
                            if (iArr[i16] == 0) {
                                break;
                            } else {
                                i16++;
                            }
                        } else {
                            i16 = -1;
                            break;
                        }
                    }
                    c21415u.f104363r = i16;
                    c21415u.f104366u[c21415u.f104353h] = false;
                    bArr = c21415u.f104365t[i14];
                    i12 = i14;
                } else {
                    int i17 = c21415u.f104367v;
                    if (i17 != -1 && zArr[i11]) {
                        zArr[i11] = false;
                        int[] iArr2 = c21415u.f104364s;
                        iArr2[i17] = iArr2[i17] + 1;
                        i12 = i17;
                        bArr = c21415u.f104365t[i17];
                    } else {
                        bArr = null;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bArr != null) {
            c21415u.m110866a()[i11].mo110858P1(bArr, z11);
            synchronized (c21415u.f104365t) {
                int[] iArr3 = c21415u.f104364s;
                int i18 = iArr3[i12] - 1;
                iArr3[i12] = i18;
                if (c21415u.f104363r == -1 && i18 == 0) {
                    c21415u.f104363r = i12;
                }
            }
        }
        c21415u.f104368w[i11].set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m110907z(boolean z11, C27385a c27385a, C21415u c21415u) {
        AbstractC19074t.m100208f(c27385a, "$report");
        AbstractC19074t.m100208f(c21415u, "this$0");
        if (!z11) {
            if (c27385a.m140305d()) {
                c21415u.m110900s();
            }
        } else {
            C28679c c28679c = new C28679c();
            BuildersKt__Builders_commonKt.m112540d(c21415u.f104360o, null, null, new d(new e(c27385a), c28679c, c27385a, null), 3, null);
        }
    }

    @Override // p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, final boolean z11) {
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        if (z11) {
            C21969b.f108146a.m114730i();
        }
        if (this.f104361p == 0) {
            this.f104361p = System.currentTimeMillis();
        }
        synchronized (this.f104365t) {
            try {
                int i11 = this.f104363r;
                if (i11 == -1) {
                    return;
                }
                byte[][] bArr2 = this.f104365t;
                if (bArr2[i11].length != bArr.length) {
                    bArr2[i11] = new byte[bArr.length];
                }
                System.arraycopy(bArr, 0, bArr2[i11], 0, bArr.length);
                boolean[] zArr = this.f104366u;
                int i12 = this.f104353h;
                zArr[i12] = true;
                for (final int i13 = 0; i13 < i12; i13++) {
                    if ((m110866a()[i13] != m110885e() || m110903v()) && m110866a()[i13].mo110861S1() && this.f104368w[i13].getAndSet(false)) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jy.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                C21415u.m110906y(C21415u.this, i13, z11);
                            }
                        });
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104354i = aVar;
        for (InterfaceC21399e interfaceC21399e : m110866a()) {
            interfaceC21399e.mo110859Q1(new c(interfaceC21399e, this.f104369x));
        }
    }

    @Override // p281jy.AbstractC21410p, p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        super.mo110860R1();
        CoroutineScopeKt.m112639c(this.f104360o, null, 1, null);
    }

    @Override // p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        return true;
    }

    @Override // p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: T1 */
    public void mo110862T1(Bitmap bitmap, String str, final InterfaceC21399e.a aVar) {
        final boolean z11;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        InterfaceC21399e[] m110866a = m110866a();
        ArrayList<InterfaceC21399e> arrayList = new ArrayList();
        for (InterfaceC21399e interfaceC21399e : m110866a) {
            if (interfaceC21399e.mo110864V1()) {
                arrayList.add(interfaceC21399e);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.mo49548a(C23479b.f114006a, 0, 0, 0);
            return;
        }
        final Object[] objArr = new Object[2];
        if (m110885e() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        final int size = arrayList.size();
        final C19055h0 c19055h0 = new C19055h0();
        final C19051f0 c19051f0 = new C19051f0();
        b bVar = new b() { // from class: jy.s
            @Override // p281jy.C21415u.b
            /* renamed from: a */
            public final void mo110892a(InterfaceC21399e interfaceC21399e2, Object obj, int i11, int i12, int i13) {
                C21415u.m110905x(C19055h0.this, this, objArr, c19051f0, size, z11, aVar, interfaceC21399e2, obj, i11, i12, i13);
            }
        };
        for (InterfaceC21399e interfaceC21399e2 : arrayList) {
            interfaceC21399e2.mo110862T1(bitmap, str, new c(interfaceC21399e2, bVar));
        }
    }

    @Override // p281jy.AbstractC21410p
    /* renamed from: k */
    public void mo110891k(final C27385a c27385a, final boolean z11) {
        AbstractC19074t.m100208f(c27385a, "report");
        if (c27385a.m140304c() == C27385a.a.f129024p) {
            this.f104357l = Boolean.valueOf(z11);
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jy.t
            @Override // java.lang.Runnable
            public final void run() {
                C21415u.m110907z(z11, c27385a, this);
            }
        });
    }
}
