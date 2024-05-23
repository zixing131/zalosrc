package p705z5;

import com.google.firebase.encoders.EncodingException;
import p520t8.C26583b;
import p520t8.InterfaceC26587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z5.p */
/* loaded from: classes2.dex */
public final class C31505p implements InterfaceC26587f {

    /* renamed from: a */
    private boolean f145022a = false;

    /* renamed from: b */
    private boolean f145023b = false;

    /* renamed from: c */
    private C26583b f145024c;

    /* renamed from: d */
    private final C31449l f145025d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31505p(C31449l c31449l) {
        this.f145025d = c31449l;
    }

    /* renamed from: b */
    private final void m152336b() {
        if (!this.f145022a) {
            this.f145022a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m152337a(C26583b c26583b, boolean z11) {
        this.f145022a = false;
        this.f145024c = c26583b;
        this.f145023b = z11;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: d */
    public final InterfaceC26587f mo760d(String str) {
        m152336b();
        this.f145025d.m152296g(this.f145024c, str, this.f145023b);
        return this;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: f */
    public final InterfaceC26587f mo761f(boolean z11) {
        m152336b();
        this.f145025d.m152297h(this.f145024c, z11 ? 1 : 0, this.f145023b);
        return this;
    }
}
