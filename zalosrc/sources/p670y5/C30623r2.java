package p670y5;

import com.google.firebase.encoders.EncodingException;
import p520t8.C26583b;
import p520t8.InterfaceC26587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.r2 */
/* loaded from: classes2.dex */
public final class C30623r2 implements InterfaceC26587f {

    /* renamed from: a */
    private boolean f141707a = false;

    /* renamed from: b */
    private boolean f141708b = false;

    /* renamed from: c */
    private C26583b f141709c;

    /* renamed from: d */
    private final C30547n2 f141710d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30623r2(C30547n2 c30547n2) {
        this.f141710d = c30547n2;
    }

    /* renamed from: b */
    private final void m149616b() {
        if (!this.f141707a) {
            this.f141707a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m149617a(C26583b c26583b, boolean z11) {
        this.f141707a = false;
        this.f141709c = c26583b;
        this.f141708b = z11;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: d */
    public final InterfaceC26587f mo760d(String str) {
        m149616b();
        this.f141710d.m149577g(this.f141709c, str, this.f141708b);
        return this;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: f */
    public final InterfaceC26587f mo761f(boolean z11) {
        m149616b();
        this.f141710d.m149578h(this.f141709c, z11 ? 1 : 0, this.f141708b);
        return this;
    }
}
