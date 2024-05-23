package p012a6;

import com.google.firebase.encoders.EncodingException;
import p520t8.C26583b;
import p520t8.InterfaceC26587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.i2 */
/* loaded from: classes2.dex */
public final class C0299i2 implements InterfaceC26587f {

    /* renamed from: a */
    private boolean f1480a = false;

    /* renamed from: b */
    private boolean f1481b = false;

    /* renamed from: c */
    private C26583b f1482c;

    /* renamed from: d */
    private final C0223e2 f1483d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0299i2(C0223e2 c0223e2) {
        this.f1483d = c0223e2;
    }

    /* renamed from: b */
    private final void m758b() {
        if (!this.f1480a) {
            this.f1480a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m759a(C26583b c26583b, boolean z11) {
        this.f1480a = false;
        this.f1482c = c26583b;
        this.f1481b = z11;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: d */
    public final InterfaceC26587f mo760d(String str) {
        m758b();
        this.f1483d.m677g(this.f1482c, str, this.f1481b);
        return this;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: f */
    public final InterfaceC26587f mo761f(boolean z11) {
        m758b();
        this.f1483d.m678h(this.f1482c, z11 ? 1 : 0, this.f1481b);
        return this;
    }
}
