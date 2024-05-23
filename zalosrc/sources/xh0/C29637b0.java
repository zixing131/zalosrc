package xh0;

import android.graphics.Point;
import android.graphics.SurfaceTexture;

/* renamed from: xh0.b0 */
/* loaded from: classes7.dex */
public class C29637b0 {

    /* renamed from: a */
    Point f136877a = null;

    /* renamed from: b */
    int f136878b = -1;

    /* renamed from: c */
    boolean f136879c;

    /* renamed from: d */
    a f136880d;

    /* renamed from: xh0.b0$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo147186a(InterfaceC29654l interfaceC29654l);

        /* renamed from: g */
        void mo147187g(boolean z11, int i11, SurfaceTexture surfaceTexture);

        /* renamed from: n */
        void mo147188n(int i11, int i12, int i13, boolean z11);
    }

    /* renamed from: a */
    public void m147387a(a aVar) {
        this.f136880d = aVar;
    }

    /* renamed from: b */
    public void m147388b(int i11, int i12) {
        this.f136877a = new Point(Math.min(i11, i12), Math.max(i11, i12));
    }

    /* renamed from: c */
    public void m147389c(int i11) {
        this.f136878b = i11;
    }

    /* renamed from: d */
    public void m147390d(boolean z11) {
        this.f136879c = z11;
    }
}
