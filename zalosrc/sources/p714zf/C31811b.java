package p714zf;

import android.opengl.EGLContext;
import java.io.File;
import me0.AbstractC23041d2;
import p493rt.C25977a;
import p714zf.AbstractC31817h;

/* renamed from: zf.b */
/* loaded from: classes3.dex */
public class C31811b extends AbstractC31817h {

    /* renamed from: i */
    private C31819j f145960i;

    /* renamed from: j */
    private C31820k f145961j;

    /* renamed from: k */
    private C31822m f145962k;

    /* renamed from: l */
    private final InterfaceC31818i f145963l;

    /* renamed from: m */
    private final EGLContext f145964m;

    /* renamed from: n */
    private final C25977a f145965n;

    /* renamed from: o */
    private final double f145966o;

    /* renamed from: p */
    private final double f145967p;

    public C31811b(String str, long j11, AbstractC31817h.b bVar, InterfaceC31818i interfaceC31818i, EGLContext eGLContext, C25977a c25977a, double d11, double d12) {
        super(str, j11, bVar);
        this.f145963l = interfaceC31818i;
        this.f145964m = eGLContext;
        this.f145965n = c25977a;
        this.f145966o = d11;
        this.f145967p = d12;
    }

    @Override // p714zf.AbstractC31817h
    /* renamed from: g */
    protected void mo152840g() {
        int i11;
        try {
            File file = new File(this.f145979d);
            if (file.exists()) {
                file.delete();
            }
            C31822m c31822m = new C31822m(this.f145979d, this.f145966o, this.f145967p);
            this.f145962k = c31822m;
            c31822m.f146016c = false;
            c31822m.f146023j = this.f145982g;
            this.f145960i = new C31819j(new C31823n(), this.f145962k);
            InterfaceC31818i interfaceC31818i = this.f145963l;
            if (interfaceC31818i != null) {
                EGLContext eGLContext = this.f145964m;
                C31822m c31822m2 = this.f145962k;
                C25977a c25977a = this.f145965n;
                this.f145961j = new C31820k(interfaceC31818i, eGLContext, c31822m2, c25977a.f123940a, c25977a.f123941b, c25977a.f123942c);
                i11 = 2;
            } else {
                i11 = 1;
            }
            this.f145962k.f146024k = i11;
        } catch (Exception e11) {
            File file2 = new File(this.f145979d);
            if (file2.exists()) {
                file2.delete();
            }
            throw e11;
        }
    }

    @Override // p714zf.AbstractC31817h
    /* renamed from: h */
    public void mo152841h() {
        try {
            C31819j c31819j = this.f145960i;
            if (c31819j != null) {
                c31819j.m152865d();
            }
            C31820k c31820k = this.f145961j;
            if (c31820k != null) {
                c31820k.m152874f();
            }
        } catch (Exception e11) {
            throw new RuntimeException("CaptureVideoSession onRelease failed", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p714zf.AbstractC31817h
    /* renamed from: i */
    public void mo152842i() {
        try {
            C31819j c31819j = this.f145960i;
            if (c31819j != null) {
                c31819j.m152866g();
            }
            C31820k c31820k = this.f145961j;
            if (c31820k != null) {
                c31820k.m152875h();
            }
            m152855e();
        } catch (Exception e11) {
            AbstractC23041d2.m118208g(this.f145979d);
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p714zf.AbstractC31817h
    /* renamed from: j */
    public void mo152843j() {
        try {
            C31819j c31819j = this.f145960i;
            if (c31819j != null) {
                c31819j.m152867h();
            }
            C31820k c31820k = this.f145961j;
            if (c31820k != null) {
                c31820k.m152876i();
            }
        } catch (Exception e11) {
            throw new RuntimeException("CaptureVideoSession onStopRecord failed", e11);
        }
    }
}
