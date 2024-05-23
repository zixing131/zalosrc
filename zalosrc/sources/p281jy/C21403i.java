package p281jy;

import android.graphics.Bitmap;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.zqrcode.Result;
import dg0.AbstractC17930e;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import ky.C21969b;
import my.C23479b;
import my.C23485h;
import my.C23486i;
import p281jy.InterfaceC21399e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import sl0.C26321b;
import sy.AbstractC26409a;
import th.C26691l;

/* renamed from: jy.i */
/* loaded from: classes4.dex */
public final class C21403i implements InterfaceC21399e {

    /* renamed from: a */
    private int f104296a;

    /* renamed from: b */
    private int f104297b;

    /* renamed from: c */
    private int f104298c;

    /* renamed from: d */
    private final int[] f104299d = new int[4];

    /* renamed from: e */
    private final int[] f104300e = new int[4];

    /* renamed from: f */
    private byte[] f104301f = new byte[0];

    /* renamed from: g */
    private InterfaceC21399e.a f104302g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m110871c(C21403i c21403i) {
        AbstractC19074t.m100208f(c21403i, "this$0");
        try {
            C24861r.a aVar = C24861r.f119264q;
            C26321b.f124994a.m135468d();
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m110872d(C21403i c21403i, Future future, ExecutorService executorService) {
        AbstractC19074t.m100208f(c21403i, "this$0");
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (!future.isDone()) {
                future.cancel(true);
            }
            C24861r.m129218b(executorService.shutdownNow());
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        System.arraycopy(iArr, 0, this.f104299d, 0, 4);
        Arrays.fill(this.f104300e, 0);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        Object m129218b;
        String m131374V;
        String m131374V2;
        Result result;
        InterfaceC21399e.a aVar;
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        try {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            if (scanQRUIUtils.m49638w(this.f104300e)) {
                scanQRUIUtils.m49619D(this.f104300e, AbstractC26409a.m136209a(this.f104299d));
            }
            int[] iArr = this.f104300e;
            float f11 = iArr[0];
            int[] iArr2 = this.f104299d;
            float[] fArr = {f11 - iArr2[0], iArr[1] - iArr2[1]};
            if (this.f104301f.length != ((scanQRUIUtils.m49623M(iArr) * scanQRUIUtils.m49637t(this.f104300e)) * 3) / 2) {
                this.f104301f = AbstractC26409a.m136210b(scanQRUIUtils.m49623M(this.f104300e), scanQRUIUtils.m49637t(this.f104300e));
            }
            AbstractC26409a.m136211c(bArr, this.f104301f, this.f104296a, this.f104300e);
            try {
                result = C26321b.f124994a.m135467c(this.f104301f, scanQRUIUtils.m49623M(this.f104300e), scanQRUIUtils.m49637t(this.f104300e), 0, 0, scanQRUIUtils.m49623M(this.f104300e), scanQRUIUtils.m49637t(this.f104300e), null, C26691l.m137133h(), C26691l.m137134i());
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
                result = null;
            }
            if (result == null) {
                return;
            }
            if (result instanceof Result.Success) {
                int length = ((Result.Success) result).m92581a().length;
                for (int i11 = 0; i11 < length; i11++) {
                    float[] m92581a = ((Result.Success) result).m92581a();
                    m92581a[i11] = m92581a[i11] + fArr[i11 % 2];
                }
                int length2 = ((Result.Success) result).m92582b().length;
                for (int i12 = 0; i12 < length2; i12++) {
                    float[] m92582b = ((Result.Success) result).m92582b();
                    m92582b[i12] = m92582b[i12] + fArr[i12 % 2];
                }
                C21969b.f108146a.m114729f();
            }
            C21969b.f108146a.m114728e(result);
            if (result instanceof Result.Success) {
                InterfaceC21399e.a aVar2 = this.f104302g;
                if (aVar2 != null) {
                    aVar2.mo49548a(new C23486i((Result.Success) result, bArr), this.f104296a, this.f104297b, this.f104298c);
                    return;
                }
                return;
            }
            if ((result instanceof Result.Failed) && (aVar = this.f104302g) != null) {
                aVar.mo49548a(C23479b.f114006a, this.f104296a, this.f104297b, this.f104298c);
            }
        } catch (Exception e12) {
            AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
            try {
                C24861r.a aVar4 = C24861r.f119264q;
                int i13 = this.f104296a;
                int i14 = this.f104297b;
                int i15 = this.f104298c;
                m131374V = AbstractC25358n.m131374V(this.f104299d, null, null, null, 0, null, null, 63, null);
                m131374V2 = AbstractC25358n.m131374V(this.f104300e, null, null, null, 0, null, null, 63, null);
                m129218b = C24861r.m129218b(C21403i.class + " scanCamera: frameWidth=" + i13 + ", frameHeight=" + i14 + ", frameRotation=" + i15 + ", cropRect=[" + m131374V + "], adjustedRect=[" + m131374V2 + "]");
            } catch (Throwable th2) {
                C24861r.a aVar5 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129221e(m129218b) != null) {
                m129218b = "";
            }
            aVar3.mo104556o(9, (String) m129218b, new Object[0]);
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104302g = aVar;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        this.f104302g = null;
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Future<?> submit = newSingleThreadExecutor.submit(new Runnable() { // from class: jy.g
            @Override // java.lang.Runnable
            public final void run() {
                C21403i.m110871c(C21403i.this);
            }
        });
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: jy.h
            @Override // java.lang.Runnable
            public final void run() {
                C21403i.m110872d(C21403i.this, submit, newSingleThreadExecutor);
            }
        }, 5000L);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        return true;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: T1 */
    public void mo110862T1(Bitmap bitmap, String str, InterfaceC21399e.a aVar) {
        Object m129218b;
        C23485h c23485h;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        Object obj = null;
        try {
            C24861r.a aVar2 = C24861r.f119264q;
            Result m135466b = C26321b.f124994a.m135466b(bitmap, false, false);
            if (m135466b instanceof Result.Success) {
                c23485h = new C23485h((Result.Success) m135466b, bitmap);
            } else {
                c23485h = null;
            }
            m129218b = C24861r.m129218b(c23485h);
        } catch (Throwable th2) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        Object obj2 = (C23485h) obj;
        if (obj2 == null) {
            obj2 = C23479b.f114006a;
        }
        aVar.mo49548a(obj2, 0, 0, 0);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: U1 */
    public void mo110863U1() {
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: V1 */
    public boolean mo110864V1() {
        return true;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: W1 */
    public void mo110865W1(int i11, int i12, int i13) {
        this.f104296a = i11;
        this.f104297b = i12;
        this.f104298c = i13;
    }
}
