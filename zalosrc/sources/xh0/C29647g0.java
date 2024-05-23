package xh0;

import android.graphics.SurfaceTexture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xh0.g0 */
/* loaded from: classes7.dex */
public class C29647g0 extends SurfaceTexture implements InterfaceC29654l {

    /* renamed from: a */
    final AtomicBoolean f136901a;

    public C29647g0(int i11) {
        super(i11);
        this.f136901a = new AtomicBoolean(true);
    }

    @Override // android.graphics.SurfaceTexture
    public void attachToGLContext(int i11) {
        synchronized (this.f136901a) {
            try {
                if (this.f136901a.get()) {
                    return;
                }
                super.attachToGLContext(i11);
                this.f136901a.set(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture
    public void detachFromGLContext() {
        synchronized (this.f136901a) {
            try {
                if (!this.f136901a.get()) {
                    return;
                }
                super.detachFromGLContext();
                this.f136901a.set(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture, xh0.InterfaceC29654l
    public void updateTexImage() {
        synchronized (this.f136901a) {
            try {
                if (!this.f136901a.get()) {
                    return;
                }
                super.updateTexImage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
