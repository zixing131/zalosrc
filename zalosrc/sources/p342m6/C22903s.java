package p342m6;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.s */
/* loaded from: classes.dex */
public final class C22903s implements InterfaceC22902r {

    /* renamed from: a */
    private final Object f111528a = new Object();

    /* renamed from: b */
    private final int f111529b;

    /* renamed from: c */
    private final C22897n0 f111530c;

    /* renamed from: d */
    private int f111531d;

    /* renamed from: e */
    private int f111532e;

    /* renamed from: f */
    private int f111533f;

    /* renamed from: g */
    private Exception f111534g;

    /* renamed from: h */
    private boolean f111535h;

    public C22903s(int i11, C22897n0 c22897n0) {
        this.f111529b = i11;
        this.f111530c = c22897n0;
    }

    /* renamed from: a */
    private final void m117622a() {
        if (this.f111531d + this.f111532e + this.f111533f == this.f111529b) {
            if (this.f111534g != null) {
                this.f111530c.m117615t(new ExecutionException(this.f111532e + " out of " + this.f111529b + " underlying tasks failed", this.f111534g));
                return;
            }
            if (this.f111535h) {
                this.f111530c.m117617v();
            } else {
                this.f111530c.m117616u(null);
            }
        }
    }

    @Override // p342m6.InterfaceC22880f
    /* renamed from: b */
    public final void mo839b(Exception exc) {
        synchronized (this.f111528a) {
            this.f111532e++;
            this.f111534g = exc;
            m117622a();
        }
    }

    @Override // p342m6.InterfaceC22876d
    /* renamed from: l */
    public final void mo34377l() {
        synchronized (this.f111528a) {
            this.f111533f++;
            this.f111535h = true;
            m117622a();
        }
    }

    @Override // p342m6.InterfaceC22882g
    public final void onSuccess(Object obj) {
        synchronized (this.f111528a) {
            this.f111531d++;
            m117622a();
        }
    }
}
