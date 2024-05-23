package p281jy;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import dm0.C18028a;
import dm0.C18029b;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import my.C23479b;
import my.C23489l;
import p281jy.InterfaceC21399e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import sy.AbstractC26409a;

/* renamed from: jy.l */
/* loaded from: classes4.dex */
public abstract class AbstractC21406l implements InterfaceC21399e {

    /* renamed from: a */
    private int f104310a;

    /* renamed from: b */
    private int f104311b;

    /* renamed from: c */
    private int f104312c;

    /* renamed from: d */
    private InterfaceC21399e.a f104313d;

    /* renamed from: e */
    private final int[] f104314e = new int[4];

    /* renamed from: f */
    private final int[] f104315f = new int[4];

    /* renamed from: g */
    private final C18029b f104316g = new C18029b();

    /* renamed from: h */
    private ExecutorService f104317h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m110875c(AbstractC21406l abstractC21406l) {
        AbstractC19074t.m100208f(abstractC21406l, "this$0");
        try {
            C24861r.a aVar = C24861r.f119264q;
            ExecutorService executorService = abstractC21406l.f104317h;
            C24848g0 c24848g0 = null;
            abstractC21406l.f104317h = null;
            if (executorService != null) {
                executorService.shutdown();
                c24848g0 = C24848g0.f119245a;
            }
            C24861r.m129218b(c24848g0);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* renamed from: d */
    private final int m110876d(final byte[] bArr, final int i11, final int i12, final int i13, List list) {
        Object m129218b;
        final C19055h0 c19055h0 = new C19055h0();
        ExecutorService executorService = this.f104317h;
        if (executorService == null) {
            executorService = Executors.newSingleThreadExecutor();
            this.f104317h = executorService;
        }
        Future submit = executorService.submit(new Callable() { // from class: jy.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m110877e;
                m110877e = AbstractC21406l.m110877e(AbstractC21406l.this, bArr, i11, i12, i13, c19055h0);
                return m110877e;
            }
        });
        AbstractC19074t.m100207e(submit, "submit(...)");
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b((List) submit.get(10000L, TimeUnit.MILLISECONDS));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            c19055h0.f94931p = 2;
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = AbstractC25368s.m131502j();
        }
        List list2 = (List) m129218b;
        AbstractC19074t.m100205c(list2);
        list.addAll(list2);
        return c19055h0.f94931p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final List m110877e(AbstractC21406l abstractC21406l, byte[] bArr, int i11, int i12, int i13, C19055h0 c19055h0) {
        Object m129218b;
        AbstractC19074t.m100208f(abstractC21406l, "this$0");
        AbstractC19074t.m100208f(bArr, "$yuvData");
        AbstractC19074t.m100208f(c19055h0, "$emptyCode");
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b((List) abstractC21406l.f104316g.m13737c(bArr, i11, i12, i13));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            c19055h0.f94931p = 2;
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = AbstractC25368s.m131502j();
        }
        return (List) m129218b;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        System.arraycopy(iArr, 0, this.f104314e, 0, 4);
        Arrays.fill(this.f104315f, 0);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        Object m129218b;
        Object m129218b2;
        String m131374V;
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        try {
            C24861r.a aVar = C24861r.f119264q;
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            if (scanQRUIUtils.m49638w(this.f104315f)) {
                scanQRUIUtils.m49619D(this.f104315f, AbstractC26409a.m136209a(this.f104314e));
            }
            byte[] m136210b = AbstractC26409a.m136210b(scanQRUIUtils.m49623M(this.f104315f), scanQRUIUtils.m49637t(this.f104315f));
            AbstractC26409a.m136211c(bArr, m136210b, this.f104310a, this.f104315f);
            ArrayList<C18028a> arrayList = new ArrayList();
            int m110876d = m110876d(m136210b, scanQRUIUtils.m49623M(this.f104315f), scanQRUIUtils.m49637t(this.f104315f), 360 - this.f104312c, arrayList);
            for (C18028a c18028a : arrayList) {
                int length = c18028a.m95863a().length;
                for (int i11 = 0; i11 < length; i11++) {
                    float[] m95863a = c18028a.m95863a();
                    m95863a[i11] = m95863a[i11] + (this.f104315f[i11 % 2] - this.f104314e[i11 % 2]);
                }
            }
            ScanQRUIUtils scanQRUIUtils2 = ScanQRUIUtils.f49155a;
            m129218b = C24861r.m129218b(new C23489l(m110876d, arrayList, m136210b, scanQRUIUtils2.m49623M(this.f104315f), scanQRUIUtils2.m49637t(this.f104315f), this.f104312c));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Object obj = m129218b;
        Throwable m129221e = C24861r.m129221e(obj);
        if (m129221e != null) {
            AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
            try {
                int i12 = this.f104310a;
                int i13 = this.f104311b;
                int i14 = this.f104312c;
                m131374V = AbstractC25358n.m131374V(this.f104314e, null, null, null, 0, null, null, 63, null);
                m129218b2 = C24861r.m129218b("OpticalCharacterRecognizer scanCamera: frameWidth=" + i12 + ", frameHeight=" + i13 + ", frameRotation=" + i14 + ", cropRect=[" + m131374V + "]");
            } catch (Throwable th3) {
                C24861r.a aVar4 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
            }
            if (C24861r.m129221e(m129218b2) != null) {
                m129218b2 = "";
            }
            aVar3.mo104556o(9, (String) m129218b2, new Object[0]);
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        if (C24861r.m129223g(obj)) {
            obj = null;
        }
        Object obj2 = (C23489l) obj;
        if (obj2 == null) {
            obj2 = C23479b.f114006a;
        }
        InterfaceC21399e.a aVar5 = this.f104313d;
        if (aVar5 != null) {
            aVar5.mo49548a(obj2, this.f104310a, this.f104311b, this.f104312c);
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104313d = aVar;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        if (this.f104317h != null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jy.j
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21406l.m110875c(AbstractC21406l.this);
                }
            });
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        return true;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: T1 */
    public void mo110862T1(Bitmap bitmap, String str, InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        throw new UnsupportedOperationException();
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: U1 */
    public void mo110863U1() {
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: V1 */
    public boolean mo110864V1() {
        return false;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: W1 */
    public void mo110865W1(int i11, int i12, int i13) {
        this.f104310a = i11;
        this.f104311b = i12;
        this.f104312c = i13;
    }
}
