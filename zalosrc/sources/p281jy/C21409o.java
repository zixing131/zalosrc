package p281jy;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.tflite.TensorflowLiteFeature;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;
import my.C23480c;
import my.C23481d;
import org.tensorflow.lite.InterfaceC24498e;
import p272jn.C21314e;
import p272jn.EnumC21310a;
import p281jy.InterfaceC21399e;
import pm0.AbstractC24862s;
import pm0.C24861r;
import qm0.AbstractC25358n;
import sy.AbstractC26409a;
import tz.C26906a;
import uy.C27384a;

/* renamed from: jy.o */
/* loaded from: classes4.dex */
public final class C21409o implements InterfaceC21399e {

    /* renamed from: a */
    private TensorflowLiteFeature f104319a;

    /* renamed from: b */
    private Boolean f104320b;

    /* renamed from: c */
    private C27384a f104321c;

    /* renamed from: d */
    private int f104322d;

    /* renamed from: e */
    private int f104323e;

    /* renamed from: f */
    private int f104324f;

    /* renamed from: g */
    private InterfaceC21399e.a f104325g;

    /* renamed from: k */
    private boolean f104329k;

    /* renamed from: l */
    private boolean f104330l;

    /* renamed from: m */
    private boolean f104331m;

    /* renamed from: h */
    private final int[] f104326h = new int[4];

    /* renamed from: i */
    private final int[] f104327i = new int[4];

    /* renamed from: j */
    private byte[] f104328j = new byte[0];

    /* renamed from: n */
    private final AtomicBoolean f104332n = new AtomicBoolean(false);

    /* renamed from: b */
    private final boolean m110879b() {
        TensorflowLiteFeature tensorflowLiteFeature;
        if (this.f104320b == null && (tensorflowLiteFeature = (TensorflowLiteFeature) C21314e.Companion.m110366a().m110361j(EnumC21310a.f103787q, "default_feature", TensorflowLiteFeature.InterfaceC10920a.class)) != null) {
            AbstractC20110a.f98889a.mo104554k("Get tflite dynamic feature successful", new Object[0]);
            this.f104320b = Boolean.valueOf(tensorflowLiteFeature.initialize());
            this.f104319a = tensorflowLiteFeature;
            if (this.f104321c == null) {
                this.f104321c = C27384a.Companion.m140301a();
            }
        }
        Boolean bool = this.f104320b;
        if (bool == null || !AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m110880c() {
        C27384a c27384a = this.f104321c;
        if (c27384a != null) {
            c27384a.m140293c();
        }
        AbstractC20110a.f98889a.mo104554k("classifier closed", new Object[0]);
    }

    /* renamed from: d */
    private final synchronized void m110881d(C27384a c27384a) {
        InterfaceC24498e.a createInterpreterOptions;
        InterfaceC24498e createInterpreter;
        try {
            if (!this.f104331m) {
                TensorflowLiteFeature tensorflowLiteFeature = this.f104319a;
                if (tensorflowLiteFeature != null && (createInterpreterOptions = tensorflowLiteFeature.createInterpreterOptions()) != null) {
                    createInterpreterOptions.m127829e(-1);
                    TensorflowLiteFeature tensorflowLiteFeature2 = this.f104319a;
                    if (tensorflowLiteFeature2 != null && (createInterpreter = tensorflowLiteFeature2.createInterpreter(C26906a.f127330a.m138701h(), createInterpreterOptions)) != null) {
                        int[] m127832a = createInterpreter.m127823Y(0).m127832a();
                        c27384a.m140300k(m127832a[1], m127832a[2]);
                        c27384a.m140299j(createInterpreter);
                        this.f104331m = true;
                        AbstractC20110a.f98889a.mo104554k("set model info to classifier", new Object[0]);
                    } else {
                        throw new IllegalStateException("Cannot create Interpreter");
                    }
                } else {
                    throw new IllegalStateException("Cannot create Interpreter");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        ScanQRUIUtils.f49155a.m49619D(this.f104326h, iArr);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        Object m129218b;
        String m131374V;
        String m131374V2;
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        boolean[] zArr = new boolean[2];
        try {
            C26906a.f127330a.m138700d(this.f104332n.getAndSet(true), zArr);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            zArr[0] = false;
            zArr[1] = false;
        }
        boolean z12 = zArr[0];
        boolean z13 = zArr[1];
        if (!z12) {
            AbstractC20110a.f98889a.mo104554k("Skip analyze due to model file not available", new Object[0]);
            return;
        }
        if (this.f104331m && z13) {
            this.f104331m = false;
        }
        try {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            if (scanQRUIUtils.m49638w(this.f104327i)) {
                scanQRUIUtils.m49619D(this.f104327i, AbstractC26409a.m136209a(this.f104326h));
            }
            if (this.f104328j.length != ((scanQRUIUtils.m49623M(this.f104327i) * scanQRUIUtils.m49637t(this.f104327i)) * 3) / 2) {
                this.f104328j = AbstractC26409a.m136210b(scanQRUIUtils.m49623M(this.f104327i), scanQRUIUtils.m49637t(this.f104327i));
            }
            AbstractC26409a.m136211c(bArr, this.f104328j, this.f104322d, this.f104327i);
            if (!this.f104329k) {
                try {
                    if (!m110879b()) {
                        AbstractC20110a.f98889a.mo104554k("Skip analyze QR due to tflite runtime not available", new Object[0]);
                        return;
                    }
                    C27384a c27384a = this.f104321c;
                    if (c27384a == null) {
                        return;
                    }
                    if (!this.f104330l) {
                        c27384a.m140298i(scanQRUIUtils.m49623M(this.f104327i), scanQRUIUtils.m49637t(this.f104327i), false, 0);
                        this.f104330l = true;
                    }
                    m110881d(c27384a);
                    C23481d c23481d = new C23481d(this.f104328j, c27384a.m140292b(this.f104328j), c27384a.m140295f(), c27384a.m140294e());
                    InterfaceC21399e.a aVar = this.f104325g;
                    if (aVar != null) {
                        aVar.mo49548a(c23481d, scanQRUIUtils.m49623M(this.f104327i), scanQRUIUtils.m49637t(this.f104327i), this.f104324f);
                    }
                } catch (Exception e12) {
                    AbstractC20110a.f98889a.mo104552e(e12);
                }
            }
            this.f104332n.set(false);
        } catch (Exception e13) {
            this.f104332n.set(false);
            AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
            try {
                C24861r.a aVar3 = C24861r.f119264q;
                int i11 = this.f104322d;
                int i12 = this.f104323e;
                int i13 = this.f104324f;
                m131374V = AbstractC25358n.m131374V(this.f104326h, null, null, null, 0, null, null, 63, null);
                m131374V2 = AbstractC25358n.m131374V(this.f104327i, null, null, null, 0, null, null, 63, null);
                m129218b = C24861r.m129218b(C21409o.class + " scanCamera: frameWidth=" + i11 + ", frameHeight=" + i12 + ", frameRotation=" + i13 + ", cropRect=[" + m131374V + "], adjustedRect=[" + m131374V2 + "]");
            } catch (Throwable th2) {
                C24861r.a aVar4 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129221e(m129218b) != null) {
                m129218b = "";
            }
            aVar2.mo104556o(9, (String) m129218b, new Object[0]);
            AbstractC20110a.f98889a.mo104552e(e13);
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104325g = aVar;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        this.f104329k = true;
        this.f104325g = null;
        this.f104331m = false;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jy.n
            @Override // java.lang.Runnable
            public final void run() {
                C21409o.this.m110880c();
            }
        });
        AbstractC20110a.f98889a.mo104554k("Destroy classifier qr", new Object[0]);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:20:0x003a, B:22:0x0040, B:13:0x0048, B:17:0x005f, B:18:0x0066), top: B:19:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:20:0x003a, B:22:0x0040, B:13:0x0048, B:17:0x005f, B:18:0x0066), top: B:19:0x003a }] */
    @Override // p281jy.InterfaceC21399e
    /* renamed from: T1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo110862T1(Bitmap bitmap, String str, InterfaceC21399e.a aVar) {
        C27384a c27384a;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        boolean[] zArr = new boolean[2];
        try {
            C26906a.f127330a.m138700d(this.f104332n.getAndSet(true), zArr);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            zArr[0] = false;
            zArr[1] = false;
        }
        boolean z11 = zArr[0];
        boolean z12 = zArr[1];
        if (z11 && this.f104331m && z12) {
            this.f104330l = false;
        }
        if (z11) {
            try {
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                aVar.mo49548a(new C23480c(bitmap, str, 0.0f, 0L, 0L), 0, 0, 0);
            }
            if (m110879b()) {
                c27384a = this.f104321c;
                if (c27384a == null) {
                    m110881d(c27384a);
                    aVar.mo49548a(new C23480c(bitmap, str, c27384a.m140291a(bitmap), 0L, 0L), 0, 0, 0);
                    this.f104332n.set(false);
                    return;
                }
                throw new IllegalStateException("Classifier is unavailable");
            }
        }
        c27384a = null;
        if (c27384a == null) {
        }
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
        this.f104322d = i11;
        this.f104323e = i12;
        this.f104324f = i13;
    }
}
