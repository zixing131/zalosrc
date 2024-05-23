package p403ot;

import android.opengl.GLES20;
import ho0.AbstractC20110a;
import se0.AbstractC26236a;

/* renamed from: ot.f */
/* loaded from: classes4.dex */
public abstract class AbstractC24554f {

    /* renamed from: a */
    int f118233a;

    /* renamed from: b */
    int f118234b;

    /* renamed from: d */
    private int f118236d = 0;

    /* renamed from: e */
    private int f118237e = 0;

    /* renamed from: c */
    int f118235c = AbstractC26236a.m134907n(AbstractC26236a.m134897d(mo127909e()), AbstractC26236a.m134895b(mo127908c()));

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC24554f() {
        this.f118233a = 0;
        this.f118234b = 0;
        this.f118233a = m127930d("vPosition");
        this.f118234b = m127930d("vColor");
    }

    /* renamed from: a */
    private void m127928a() {
        GLES20.glDetachShader(this.f118235c, this.f118236d);
        GLES20.glDetachShader(this.f118235c, this.f118237e);
        GLES20.glDeleteShader(this.f118236d);
        GLES20.glDeleteShader(this.f118237e);
        GLES20.glDeleteProgram(this.f118235c);
        AbstractC26236a.m134894a("deleteProgram");
        this.f118237e = 0;
        this.f118236d = 0;
        this.f118235c = 0;
    }

    /* renamed from: b */
    public void m127929b() {
        AbstractC20110a.m104535d("Destroy GLSprite: " + Thread.currentThread().getName(), new Object[0]);
        m127928a();
    }

    /* renamed from: c */
    protected abstract String mo127908c();

    /* renamed from: d */
    public int m127930d(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f118235c, str);
        if (glGetAttribLocation == -1) {
            return GLES20.glGetUniformLocation(this.f118235c, str);
        }
        return glGetAttribLocation;
    }

    /* renamed from: e */
    protected abstract String mo127909e();
}
