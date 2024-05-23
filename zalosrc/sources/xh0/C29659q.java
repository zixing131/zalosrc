package xh0;

import ai0.AbstractC0866a;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import xh0.C29637b0;
import xh0.InterfaceC29653k;
import yh0.C30985b;
import zh0.C32211b;

/* renamed from: xh0.q */
/* loaded from: classes7.dex */
public class C29659q implements InterfaceC29653k, Camera.PreviewCallback, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: A */
    boolean f136928A;

    /* renamed from: B */
    boolean f136929B;

    /* renamed from: C */
    C30985b f136930C;

    /* renamed from: E */
    C29668z f136932E;

    /* renamed from: F */
    C29637b0 f136933F;

    /* renamed from: p */
    int f136935p;

    /* renamed from: q */
    Camera f136936q;

    /* renamed from: w */
    int f136942w;

    /* renamed from: x */
    boolean f136943x;

    /* renamed from: y */
    C29647g0 f136944y;

    /* renamed from: r */
    Camera.Parameters f136937r = null;

    /* renamed from: s */
    Camera.CameraInfo f136938s = new Camera.CameraInfo();

    /* renamed from: t */
    final C29655m f136939t = new C29655m();

    /* renamed from: u */
    boolean f136940u = true;

    /* renamed from: v */
    boolean f136941v = false;

    /* renamed from: z */
    int[] f136945z = null;

    /* renamed from: D */
    int f136931D = 0;

    /* renamed from: G */
    int f136934G = 0;

    /* renamed from: xh0.q$a */
    /* loaded from: classes7.dex */
    public class a extends b {

        /* renamed from: p */
        final /* synthetic */ int f136946p;

        /* renamed from: q */
        final /* synthetic */ int f136947q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12) {
            super(null);
            this.f136946p = i11;
            this.f136947q = i12;
        }

        @Override // xh0.C29659q.b
        /* renamed from: b */
        public int mo147435a(Camera.Size size) {
            return Math.abs(this.f136946p - size.width) + Math.abs(this.f136947q - size.height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xh0.q$b */
    /* loaded from: classes7.dex */
    public static abstract class b implements Comparator {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        abstract int mo147435a(Object obj);

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return mo147435a(obj) - mo147435a(obj2);
        }
    }

    public C29659q(int i11, boolean z11, boolean z12) {
        this.f136935p = i11;
        this.f136928A = z11;
        this.f136929B = z12;
    }

    /* renamed from: n */
    private Camera.Size m147431n(Camera.Parameters parameters, int i11, int i12) {
        return m147432o(parameters.getSupportedPictureSizes(), i11, i12);
    }

    /* renamed from: o */
    public static Camera.Size m147432o(List list, int i11, int i12) {
        return (Camera.Size) Collections.min(list, new a(i11, i12));
    }

    /* renamed from: p */
    public /* synthetic */ void m147433p(SurfaceTexture surfaceTexture) {
        surfaceTexture.updateTexImage();
        C29637b0.a aVar = this.f136933F.f136880d;
        if (aVar != null) {
            aVar.mo147186a(null);
        }
    }

    /* renamed from: q */
    public /* synthetic */ void m147434q(int i11, Camera camera) {
        InterfaceC29653k.a aVar;
        C29668z c29668z = this.f136932E;
        if (c29668z != null && (aVar = c29668z.f136973d) != null) {
            aVar.onError(i11);
            mo147417a();
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: a */
    public void mo147417a() {
        InterfaceC29653k.a aVar;
        if (this.f136934G == 2) {
            mo147424h();
        }
        if (this.f136934G == 3) {
            return;
        }
        if (C29667y.f136955m) {
            C29667y.f136955m = false;
        } else {
            C8937j0.m47656d().m40937b();
        }
        AbstractC20110a.m104535d("releaseCamera", new Object[0]);
        try {
            Camera camera = this.f136936q;
            if (camera != null) {
                camera.release();
                C32211b.m155326d(this.f136936q, "ZCamera");
                this.f136934G = 3;
            }
        } catch (Exception e11) {
            C29668z c29668z = this.f136932E;
            if (c29668z != null && (aVar = c29668z.f136973d) != null) {
                aVar.mo38609d(false, e11);
            }
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: b */
    public int mo147418b() {
        return this.f136935p;
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: c */
    public void mo147419c() {
        if (this.f136934G == 2 && !this.f136940u) {
            this.f136940u = true;
            this.f136936q.reconnect();
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: d */
    public void mo147420d() {
        if (this.f136934G == 2 && this.f136940u) {
            this.f136940u = false;
            this.f136936q.unlock();
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: e */
    public void mo147421e(C29668z c29668z) {
        this.f136932E = c29668z;
        if (c29668z == null) {
            mo147417a();
            return;
        }
        SensitiveData sensitiveData = c29668z.f136974e;
        if (sensitiveData == null || sensitiveData.m35528c().isEmpty()) {
            c29668z.f136974e = new SensitiveData("unknown", "unknown");
            AbstractC20110a.m104543l("SensitiveDataHub").mo104551d("Access sensitive camera data without define sourceId", new Object[0]);
        }
        if (!C8937j0.m47663l(c29668z.f136974e.m35528c())) {
            InterfaceC29653k.a aVar = c29668z.f136973d;
            if (aVar != null) {
                aVar.mo38607b(false, new SensitiveDataException("SourceId does not have permission to access sensitive data: Camera"));
            }
            mo147417a();
            return;
        }
        C8937j0.m47656d().m40938d(c29668z.f136974e);
        int i11 = this.f136934G;
        if (i11 > 0 && i11 < 3) {
            AbstractC20110a.m104535d("openCamera: reuse %s", Integer.valueOf(this.f136935p));
            InterfaceC29653k.a aVar2 = c29668z.f136973d;
            if (aVar2 != null || c29668z.f136972c != null) {
                this.f136932E = c29668z;
                if (aVar2 != null) {
                    aVar2.mo38607b(true, null);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC20110a.m104535d("openCamera: %s", Integer.valueOf(this.f136935p));
        try {
            C32211b.m155324b().m155328f();
            Camera open = Camera.open(this.f136935p);
            this.f136936q = open;
            C32211b.m155325c(open, "ZCamera");
            this.f136936q.setErrorCallback(new Camera.ErrorCallback() { // from class: xh0.p
                public /* synthetic */ C29658p() {
                }

                @Override // android.hardware.Camera.ErrorCallback
                public final void onError(int i12, Camera camera) {
                    C29659q.this.m147434q(i12, camera);
                }
            });
            Camera.getCameraInfo(this.f136935p, this.f136938s);
            this.f136934G = 1;
            this.f136937r = this.f136936q.getParameters();
            InterfaceC29653k.a aVar3 = c29668z.f136973d;
            if (aVar3 != null) {
                aVar3.mo38607b(true, null);
            } else {
                AbstractC20110a.m104535d("openCamera from preload", new Object[0]);
            }
        } catch (Exception e11) {
            InterfaceC29653k.a aVar4 = c29668z.f136973d;
            if (aVar4 != null) {
                aVar4.mo38607b(false, e11);
                mo147417a();
            }
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: f */
    public InterfaceC29634a mo147422f() {
        return new C29652j(this.f136936q, this.f136938s, this.f136939t);
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: g */
    public boolean mo147423g() {
        if (this.f136938s.facing == 1) {
            return true;
        }
        return false;
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: h */
    public void mo147424h() {
        InterfaceC29653k.a aVar;
        if (this.f136934G != 2) {
            return;
        }
        AbstractC20110a.m104535d("stopPreview", new Object[0]);
        try {
            this.f136936q.stopPreview();
            this.f136934G = 1;
            int[] iArr = this.f136945z;
            if (iArr != null) {
                AbstractC0866a.m2492a(iArr, 0);
                this.f136930C = null;
                this.f136945z = null;
            }
            C29647g0 c29647g0 = this.f136944y;
            if (c29647g0 != null) {
                c29647g0.setOnFrameAvailableListener(null);
            }
            this.f136944y = null;
        } catch (Exception e11) {
            C29668z c29668z = this.f136932E;
            if (c29668z != null && (aVar = c29668z.f136973d) != null) {
                aVar.mo38609d(false, e11);
            }
        }
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: i */
    public boolean mo147425i() {
        return this.f136931D == 1;
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: j */
    public boolean mo147426j(C30985b c30985b) {
        return this.f136931D == 2 && c30985b == this.f136930C;
    }

    @Override // xh0.InterfaceC29653k
    /* renamed from: k */
    public void mo147427k(C29637b0 c29637b0, C30985b c30985b) {
        InterfaceC29653k.a aVar;
        boolean z11;
        int[] iArr;
        try {
            if (this.f136934G == 2) {
                if (c29637b0.f136880d == null) {
                    return;
                }
                int i11 = this.f136931D;
                if (i11 == 1) {
                    AbstractC20110a.m104535d("startPreview reuse surfaceShared", new Object[0]);
                    this.f136933F = c29637b0;
                    this.f136941v = false;
                    if (c29637b0.f136880d != null) {
                        this.f136944y.setOnFrameAvailableListener(this);
                        C29637b0.a aVar2 = this.f136933F.f136880d;
                        C29655m c29655m = this.f136939t;
                        aVar2.mo147188n(c29655m.f136920a, c29655m.f136921b, this.f136942w, this.f136943x);
                        this.f136933F.f136880d.mo147187g(true, -1, this.f136944y);
                        return;
                    }
                    return;
                }
                if (i11 == 2 && this.f136945z != null && c29637b0.f136879c && c30985b == this.f136930C) {
                    AbstractC20110a.m104535d("startPreview reuse eglShared", new Object[0]);
                    this.f136933F = c29637b0;
                    this.f136941v = false;
                    if (c29637b0.f136880d != null) {
                        this.f136944y.setOnFrameAvailableListener(this);
                        C29637b0.a aVar3 = this.f136933F.f136880d;
                        C29655m c29655m2 = this.f136939t;
                        aVar3.mo147188n(c29655m2.f136920a, c29655m2.f136921b, this.f136942w, this.f136943x);
                        this.f136933F.f136880d.mo147187g(true, this.f136945z[0], null);
                        return;
                    }
                    return;
                }
                mo147424h();
            }
            if (this.f136934G != 1) {
                return;
            }
            C29637b0.a aVar4 = c29637b0.f136880d;
            if (aVar4 == null && ((!this.f136928A || c30985b == null) && !this.f136929B)) {
                AbstractC20110a.m104535d("can't preload camera in non-eglShared or non-surface texture shared", new Object[0]);
                return;
            }
            if (aVar4 == null) {
                AbstractC20110a.m104535d("startPreview from preload", new Object[0]);
            }
            this.f136933F = c29637b0;
            if (this.f136929B) {
                this.f136931D = 1;
            } else if (this.f136928A && c29637b0.f136879c && c30985b != null) {
                this.f136931D = 2;
            } else {
                this.f136931D = 0;
            }
            AbstractC20110a.m104535d("startPreview - shareMode: %s", Integer.valueOf(this.f136931D));
            Camera.Parameters parameters = this.f136936q.getParameters();
            AbstractC20110a.m104542k(8, "startPreview expectedPreviewSize: %d/%d", Integer.valueOf(c29637b0.f136877a.x), Integer.valueOf(c29637b0.f136877a.y));
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            Point point = c29637b0.f136877a;
            C29645f0 m147428a = C29656n.m147428a(supportedPreviewSizes, point.x, point.y);
            parameters.setPreviewSize(m147428a.f136895a, m147428a.f136896b);
            Camera.Size m147431n = m147431n(parameters, m147428a.f136895a, m147428a.f136896b);
            parameters.setPictureSize(m147431n.width, m147431n.height);
            AbstractC20110a.m104542k(8, "startPreview size: %d/%d", Integer.valueOf(m147428a.f136895a), Integer.valueOf(m147428a.f136896b));
            this.f136942w = this.f136938s.orientation % 360;
            this.f136936q.setDisplayOrientation(0);
            if (this.f136938s.facing == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f136943x = z11;
            int i12 = this.f136931D;
            if (i12 == 1) {
                this.f136945z = null;
                C29647g0 c29647g0 = new C29647g0(-1);
                this.f136944y = c29647g0;
                try {
                    c29647g0.detachFromGLContext();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else if (i12 == 2) {
                int[] iArr2 = new int[1];
                this.f136945z = iArr2;
                this.f136930C = c30985b;
                AbstractC0866a.m2493b(iArr2, 0);
                this.f136944y = new C29647g0(this.f136945z[0]);
            } else {
                this.f136945z = null;
                this.f136944y = new C29647g0(this.f136933F.f136878b);
            }
            this.f136936q.setPreviewTexture(this.f136944y);
            this.f136944y.setOnFrameAvailableListener(this);
            this.f136936q.addCallbackBuffer(new byte[((m147428a.f136895a * m147428a.f136896b) * ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())) / 8]);
            this.f136941v = false;
            this.f136936q.setPreviewCallbackWithBuffer(this);
            C29655m c29655m3 = this.f136939t;
            c29655m3.f136920a = m147428a.f136895a;
            c29655m3.f136921b = m147428a.f136896b;
            c29655m3.f136922c = (360 - Math.abs(this.f136942w)) % 360;
            this.f136939t.f136923d = this.f136943x;
            this.f136936q.setParameters(parameters);
            this.f136936q.startPreview();
            this.f136934G = 2;
            C29637b0.a aVar5 = this.f136933F.f136880d;
            if (aVar5 != null) {
                C29655m c29655m4 = this.f136939t;
                aVar5.mo147188n(c29655m4.f136920a, c29655m4.f136921b, this.f136942w, this.f136943x);
                int i13 = this.f136931D;
                if (i13 == 2 && (iArr = this.f136945z) != null) {
                    this.f136933F.f136880d.mo147187g(true, iArr[0], null);
                } else if (i13 == 1) {
                    this.f136933F.f136880d.mo147187g(true, -1, this.f136944y);
                } else {
                    this.f136933F.f136880d.mo147187g(false, -1, null);
                }
            }
        } catch (Exception e12) {
            C29668z c29668z = this.f136932E;
            if (c29668z != null && (aVar = c29668z.f136973d) != null) {
                aVar.mo38607b(false, e12);
                mo147417a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (surfaceTexture instanceof C29647g0) {
            if (this.f136931D == 2) {
                C29667y.m147458p().m147469D(this.f136930C, new Runnable() { // from class: xh0.o

                    /* renamed from: q */
                    public final /* synthetic */ SurfaceTexture f136926q;

                    public /* synthetic */ RunnableC29657o(SurfaceTexture surfaceTexture2) {
                        r2 = surfaceTexture2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29659q.this.m147433p(r2);
                    }
                });
                return;
            }
            C29637b0.a aVar = this.f136933F.f136880d;
            if (aVar != null) {
                aVar.mo147186a((InterfaceC29654l) surfaceTexture2);
            }
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        InterfaceC29653k.a aVar;
        C29668z c29668z = this.f136932E;
        if (c29668z != null && (aVar = c29668z.f136973d) != null) {
            if (!this.f136941v) {
                aVar.mo38606a(true);
            }
            this.f136932E.f136973d.mo38608c(bArr, !this.f136941v);
        }
        this.f136941v = true;
        this.f136936q.addCallbackBuffer(bArr);
    }
}
