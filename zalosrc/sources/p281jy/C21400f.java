package p281jy;

import android.graphics.Bitmap;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.zqrcode.QRCodeManager;
import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import ky.C21969b;
import my.C23479b;
import my.C23485h;
import my.C23486i;
import p281jy.InterfaceC21399e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import th.C26691l;

/* renamed from: jy.f */
/* loaded from: classes4.dex */
public final class C21400f implements InterfaceC21399e {

    /* renamed from: a */
    private int f104287a;

    /* renamed from: b */
    private int f104288b;

    /* renamed from: c */
    private int f104289c;

    /* renamed from: d */
    private InterfaceC21399e.a f104290d;

    /* renamed from: e */
    private final int[] f104291e = new int[4];

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m110868a(byte[] bArr) {
        Object obj;
        int i11;
        Object m129218b;
        Object obj2;
        Throwable m129221e;
        Result result;
        InterfaceC21399e.a aVar;
        Object m129218b2;
        String m131374V;
        int[] iArr;
        QRCodeManager instance$default;
        Result result2;
        int i12 = this.f104287a;
        int i13 = this.f104288b;
        int i14 = this.f104289c;
        try {
            C24861r.a aVar2 = C24861r.f119264q;
            iArr = this.f104291e;
            instance$default = QRCodeManager.Companion.getInstance$default(QRCodeManager.Companion, null, 1, null);
        } catch (Throwable th2) {
            th = th2;
            obj = null;
            i11 = i14;
        }
        if (i12 != 0 && i13 != 0 && instance$default != null && bArr.length != 0) {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            if (!scanQRUIUtils.m49638w(iArr)) {
                obj = null;
                i11 = i14;
                try {
                    result2 = instance$default.decode(bArr, i12, i13, iArr[0], iArr[1], scanQRUIUtils.m49623M(iArr), scanQRUIUtils.m49637t(iArr), null, C26691l.m137133h(), C26691l.m137134i());
                    m129218b = C24861r.m129218b(result2);
                } catch (Throwable th3) {
                    th = th3;
                    C24861r.a aVar3 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                    obj2 = m129218b;
                    m129221e = C24861r.m129221e(obj2);
                    if (m129221e != null) {
                    }
                    if (C24861r.m129223g(obj2)) {
                    }
                    result = (Result) obj2;
                    if (result == null) {
                    }
                }
                obj2 = m129218b;
                m129221e = C24861r.m129221e(obj2);
                if (m129221e != null) {
                    AbstractC20110a.a aVar4 = AbstractC20110a.f98889a;
                    try {
                        int i15 = this.f104288b;
                        int i16 = this.f104289c;
                        m131374V = AbstractC25358n.m131374V(this.f104291e, null, null, null, 0, null, null, 63, null);
                        m129218b2 = C24861r.m129218b(C21400f.class + " scanCamera: frameWidth=" + i15 + ", frameHeight=" + i15 + ", frameRotation=" + i16 + ", cropRect=[" + m131374V + "]");
                    } catch (Throwable th4) {
                        C24861r.a aVar5 = C24861r.f119264q;
                        m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th4));
                    }
                    if (C24861r.m129221e(m129218b2) != null) {
                        m129218b2 = "";
                    }
                    aVar4.mo104556o(9, (String) m129218b2, new Object[0]);
                    AbstractC20110a.f98889a.mo104552e(m129221e);
                }
                if (C24861r.m129223g(obj2)) {
                    obj2 = obj;
                }
                result = (Result) obj2;
                if (result == null) {
                    return;
                }
                try {
                    if (result instanceof Result.Success) {
                        C21969b.f108146a.m114731k();
                    }
                    C21969b.f108146a.m114728e(result);
                    C24861r.m129218b(C24848g0.f119245a);
                } catch (Throwable th5) {
                    C24861r.a aVar6 = C24861r.f119264q;
                    C24861r.m129218b(AbstractC24862s.m129227a(th5));
                }
                if (result instanceof Result.Success) {
                    InterfaceC21399e.a aVar7 = this.f104290d;
                    if (aVar7 != null) {
                        aVar7.mo49548a(new C23486i((Result.Success) result, bArr), i12, i13, i11);
                        return;
                    }
                    return;
                }
                int i17 = i11;
                if ((result instanceof Result.Failed) && (aVar = this.f104290d) != null) {
                    aVar.mo49548a(C23479b.f114006a, i12, i13, i17);
                    return;
                }
                return;
            }
        }
        obj = null;
        i11 = i14;
        result2 = null;
        m129218b = C24861r.m129218b(result2);
        obj2 = m129218b;
        m129221e = C24861r.m129221e(obj2);
        if (m129221e != null) {
        }
        if (C24861r.m129223g(obj2)) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        ScanQRUIUtils.f49155a.m49619D(this.f104291e, iArr);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        m110868a(bArr);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104290d = aVar;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        this.f104290d = null;
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
        Result decode;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        Object obj = null;
        try {
            C24861r.a aVar2 = C24861r.f119264q;
            QRCodeManager instance$default = QRCodeManager.Companion.getInstance$default(QRCodeManager.Companion, null, 1, null);
            if (instance$default != null && (decode = instance$default.decode(bitmap, false, false)) != null && (decode instanceof Result.Success)) {
                c23485h = new C23485h((Result.Success) decode, bitmap);
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
        this.f104287a = i11;
        this.f104288b = i12;
        this.f104289c = i13;
    }
}
