package xh0;

import android.hardware.Camera;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.List;
import p248iy.AbstractC20887g;
import p295kb.C21643a;
import xh0.InterfaceC29634a;
import zh0.AbstractC32212c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xh0.j */
/* loaded from: classes7.dex */
public final class C29652j implements InterfaceC29634a, Camera.PictureCallback, Camera.AutoFocusCallback {

    /* renamed from: a */
    Camera f136909a;

    /* renamed from: b */
    Camera.CameraInfo f136910b;

    /* renamed from: c */
    C21643a f136911c = new C21643a();

    /* renamed from: d */
    C21643a f136912d = new C21643a();

    /* renamed from: e */
    int f136913e = 0;

    /* renamed from: f */
    int f136914f = 0;

    /* renamed from: g */
    InterfaceC29634a.a f136915g;

    /* renamed from: h */
    boolean f136916h;

    /* renamed from: i */
    int f136917i;

    /* renamed from: j */
    boolean f136918j;

    /* renamed from: k */
    final C29655m f136919k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29652j(Camera camera, Camera.CameraInfo cameraInfo, C29655m c29655m) {
        this.f136916h = false;
        this.f136917i = 100;
        this.f136918j = false;
        this.f136909a = camera;
        this.f136910b = cameraInfo;
        this.f136919k = c29655m;
        try {
            Camera.Parameters parameters = camera.getParameters();
            try {
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (supportedFlashModes.contains("off")) {
                        this.f136911c.m111565a(0);
                    }
                    if (supportedFlashModes.contains("auto")) {
                        this.f136911c.m111565a(1);
                    }
                    if (supportedFlashModes.contains("on")) {
                        this.f136911c.m111565a(2);
                    }
                    if (supportedFlashModes.contains("torch")) {
                        this.f136911c.m111565a(3);
                    }
                }
                this.f136916h = this.f136911c.m111567c(2);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            try {
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null) {
                    if (supportedFocusModes.contains("auto")) {
                        this.f136912d.m111565a(0);
                    }
                    if (supportedFocusModes.contains("infinity")) {
                        this.f136912d.m111565a(1);
                    }
                    if (supportedFocusModes.contains("macro")) {
                        this.f136912d.m111565a(2);
                    }
                    if (supportedFocusModes.contains("fixed")) {
                        this.f136912d.m111565a(3);
                    }
                    if (supportedFocusModes.contains("edof")) {
                        this.f136912d.m111565a(4);
                    }
                    if (supportedFocusModes.contains("continuous-video")) {
                        this.f136912d.m111565a(5);
                    }
                    if (supportedFocusModes.contains("continuous-picture")) {
                        this.f136912d.m111565a(6);
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
            boolean isZoomSupported = parameters.isZoomSupported();
            this.f136918j = isZoomSupported;
            if (isZoomSupported) {
                this.f136917i = parameters.getMaxZoom();
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m147402A(boolean z11, long j11) {
        try {
            Camera camera = this.f136909a;
            if (camera == null) {
                return;
            }
            if (z11) {
                camera.takePicture(null, null, this);
                return;
            }
            if (this.f136913e != 0) {
                camera.takePicture(null, null, this);
                return;
            }
            InterfaceC29634a.a aVar = this.f136915g;
            if (aVar != null) {
                aVar.mo38620c(null, 0);
            }
            if (j11 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC20887g.m109221H(false, true, 99993, 99993, 0, currentTimeMillis - j11, "", j11, currentTimeMillis);
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m147403B(float f11, float f12, InterfaceC29634a.b bVar) {
        try {
            Camera.Parameters parameters = this.f136909a.getParameters();
            if (parameters != null && parameters.getMaxNumFocusAreas() > 0) {
                if (!TextUtils.isEmpty(AbstractC32212c.m155336f(parameters, (int) f11, (int) f12))) {
                    this.f136914f = 0;
                }
                if (bVar != null) {
                    bVar.mo39486a();
                }
                try {
                    this.f136909a.setParameters(parameters);
                } catch (RuntimeException e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m147404C(boolean z11) {
        Camera camera = this.f136909a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                int m155337g = AbstractC32212c.m155337g(parameters, 0, z11);
                if (this.f136914f != m155337g) {
                    this.f136909a.setParameters(parameters);
                    this.f136914f = m155337g;
                }
            } catch (RuntimeException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m147405D(String str, int i11) {
        try {
            Camera.Parameters parameters = this.f136909a.getParameters();
            parameters.setFlashMode(str);
            this.f136909a.setParameters(parameters);
            this.f136913e = i11;
            InterfaceC29634a.a aVar = this.f136915g;
            if (aVar != null) {
                aVar.mo38619b(str);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m147406E(int i11, String str) {
        try {
            this.f136914f = i11;
            Camera.Parameters parameters = this.f136909a.getParameters();
            parameters.setFocusMode(str);
            this.f136909a.setParameters(parameters);
        } catch (RuntimeException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m147407F(int i11) {
        try {
            Camera.Parameters parameters = this.f136909a.getParameters();
            parameters.setZoom(i11);
            this.f136909a.setParameters(parameters);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m147415z(boolean z11) {
        Camera camera = this.f136909a;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
                if (z11) {
                    this.f136909a.autoFocus(this);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: a */
    public int mo147370a() {
        return this.f136914f;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: b */
    public boolean mo147371b(final boolean z11) {
        C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.e
            @Override // java.lang.Runnable
            public final void run() {
                C29652j.this.m147415z(z11);
            }
        });
        return true;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: c */
    public void mo147372c(final int i11) {
        final String str;
        if (i11 == 0) {
            str = "off";
        } else {
            str = null;
        }
        if (i11 == 1) {
            str = "auto";
        }
        if (i11 == 2) {
            str = "on";
        }
        if (i11 == 3) {
            str = "torch";
        }
        if (str != null) {
            C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C29652j.this.m147405D(str, i11);
                }
            });
        }
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: d */
    public void mo147373d(final boolean z11) {
        final long currentTimeMillis = System.currentTimeMillis();
        C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.d
            @Override // java.lang.Runnable
            public final void run() {
                C29652j.this.m147402A(z11, currentTimeMillis);
            }
        });
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: e */
    public C29655m mo147374e() {
        return this.f136919k;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: f */
    public void mo147375f(int i11, float f11, float f12, int i12, int i13, final InterfaceC29634a.b bVar) {
        final float f13;
        float f14;
        float f15 = i13;
        float f16 = f12 + (f15 / 2.0f);
        float f17 = i12;
        float f18 = f11 + (f17 / 2.0f);
        float f19 = f17 - f18;
        if (i11 == 90) {
            f19 = f16;
            f16 = f18;
        } else if (i11 == 270) {
            f19 = f15 - f16;
            f16 = f19;
        }
        if (i11 != 90 && i11 != 270) {
            f13 = ((f16 / f15) * 2000.0f) - 1000.0f;
            f14 = f19 / f17;
        } else {
            f13 = ((f16 / f17) * 2000.0f) - 1000.0f;
            f14 = f19 / f15;
        }
        final float f21 = (f14 * 2000.0f) - 1000.0f;
        if (f13 < -1000.0f || f13 > 1000.0f || f21 < -1000.0f || f21 > 1000.0f || this.f136909a == null) {
            return;
        }
        C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.g
            @Override // java.lang.Runnable
            public final void run() {
                C29652j.this.m147403B(f13, f21, bVar);
            }
        });
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: g */
    public boolean mo147376g() {
        return this.f136916h;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: h */
    public boolean mo147377h() {
        if (m147416y() == 1) {
            return true;
        }
        return false;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: i */
    public C21643a mo147378i() {
        return this.f136912d;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: j */
    public int mo147379j() {
        return this.f136917i;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: k */
    public boolean mo147380k() {
        return this.f136918j;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: l */
    public void mo147381l(final boolean z11) {
        C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.c
            @Override // java.lang.Runnable
            public final void run() {
                C29652j.this.m147404C(z11);
            }
        });
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: m */
    public void mo147382m(InterfaceC29634a.a aVar) {
        this.f136915g = aVar;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: n */
    public void mo147383n(final int i11) {
        final String str;
        if (i11 == 0) {
            str = "auto";
        } else {
            str = null;
        }
        if (i11 == 1) {
            str = "infinity";
        }
        if (i11 == 2) {
            str = "macro";
        }
        if (i11 == 3) {
            str = "fixed";
        }
        if (i11 == 4) {
            str = "edof";
        }
        if (i11 == 5) {
            str = "continuous-video";
        }
        if (i11 == 6) {
            str = "continuous-picture";
        }
        if (str != null) {
            C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C29652j.this.m147406E(i11, str);
                }
            });
        }
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: o */
    public boolean mo147384o(boolean z11) {
        Camera camera = this.f136909a;
        if (camera != null) {
            try {
                if (z11) {
                    camera.autoFocus(this);
                } else {
                    camera.cancelAutoFocus();
                }
                return true;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return true;
            }
        }
        return true;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z11, Camera camera) {
        InterfaceC29634a.a aVar = this.f136915g;
        if (aVar != null) {
            aVar.mo38618a(z11);
        }
    }

    @Override // android.hardware.Camera.PictureCallback
    public void onPictureTaken(byte[] bArr, Camera camera) {
        InterfaceC29634a.a aVar = this.f136915g;
        if (aVar != null) {
            aVar.mo38620c(bArr, this.f136910b.orientation);
        }
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: p */
    public int mo147385p() {
        return this.f136913e;
    }

    @Override // xh0.InterfaceC29634a
    /* renamed from: q */
    public void mo147386q(final int i11) {
        C29667y.m147458p().m147470E(new Runnable() { // from class: xh0.h
            @Override // java.lang.Runnable
            public final void run() {
                C29652j.this.m147407F(i11);
            }
        });
    }

    /* renamed from: y */
    public int m147416y() {
        if (this.f136910b.facing == 0) {
            return 0;
        }
        return 1;
    }
}
