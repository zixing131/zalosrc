package p575vf;

import android.opengl.GLES20;
import mm0.AbstractC23350e;
import se0.AbstractC26236a;

/* renamed from: vf.a */
/* loaded from: classes3.dex */
public class C27998a {

    /* renamed from: a */
    public final int[] f130577a = new int[2];

    /* renamed from: b */
    private C27999b f130578b;

    /* renamed from: c */
    private int f130579c;

    /* renamed from: d */
    private int[] f130580d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27998a(C27999b c27999b, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FrameBuffer(");
        sb2.append(c27999b);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(")");
        m141107h(c27999b);
        this.f130579c = i11;
    }

    /* renamed from: b */
    private int m141106b() {
        GLES20.glGetIntegerv(36006, this.f130580d, 0);
        GLES20.glBindFramebuffer(36160, this.f130577a[0]);
        return GLES20.glGetError();
    }

    /* renamed from: h */
    private void m141107h(C27999b c27999b) {
        this.f130578b = c27999b;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        GLES20.glGenFramebuffers(1, this.f130577a, 0);
        int i11 = this.f130577a[0];
        AbstractC26236a.m134903j(this.f130577a, 1, c27999b.f130581a, c27999b.f130582b, null);
        GLES20.glBindFramebuffer(36160, this.f130577a[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f130577a[1], 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        int i12 = iArr[0];
        if (i12 > 0) {
            GLES20.glBindFramebuffer(36160, i12);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* renamed from: a */
    public void m141108a() {
        this.f130580d = new int[1];
        int m141106b = m141106b();
        if (m141106b != 0) {
            AbstractC23350e.m122774d("FrameBuffer", "activeFrameBuffer: error " + m141106b);
        }
    }

    /* renamed from: c */
    public void m141109c() {
        m141108a();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        m141115j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m141110d() {
        if (this.f130577a[0] >= 0) {
            GLES20.glDeleteFramebuffers(1, this.f130577a, 0);
            this.f130577a[0] = -1;
        }
        int[] iArr = this.f130577a;
        if (iArr[1] >= 0) {
            AbstractC26236a.m134899f(iArr, 1);
            this.f130577a[1] = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C27999b m141111e() {
        return this.f130578b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m141112f() {
        return this.f130579c;
    }

    /* renamed from: g */
    public int m141113g() {
        return this.f130577a[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m141114i() {
        this.f130580d = null;
    }

    /* renamed from: j */
    public void m141115j() {
        int i11;
        int[] iArr = this.f130580d;
        if (iArr != null && (i11 = iArr[0]) > 0) {
            GLES20.glBindFramebuffer(36160, i11);
            this.f130580d = null;
        } else if (iArr != null) {
            GLES20.glBindFramebuffer(36160, 0);
            this.f130580d = null;
        }
    }
}
