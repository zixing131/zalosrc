package p601w8;

import com.google.firebase.encoders.EncodingException;
import p520t8.C26583b;
import p520t8.InterfaceC26587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w8.i */
/* loaded from: classes.dex */
public class C28803i implements InterfaceC26587f {

    /* renamed from: a */
    private boolean f133476a = false;

    /* renamed from: b */
    private boolean f133477b = false;

    /* renamed from: c */
    private C26583b f133478c;

    /* renamed from: d */
    private final C28800f f133479d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28803i(C28800f c28800f) {
        this.f133479d = c28800f;
    }

    /* renamed from: a */
    private void m144069a() {
        if (!this.f133476a) {
            this.f133476a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m144070b(C26583b c26583b, boolean z11) {
        this.f133476a = false;
        this.f133478c = c26583b;
        this.f133477b = z11;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: d */
    public InterfaceC26587f mo760d(String str) {
        m144069a();
        this.f133479d.m144053h(this.f133478c, str, this.f133477b);
        return this;
    }

    @Override // p520t8.InterfaceC26587f
    /* renamed from: f */
    public InterfaceC26587f mo761f(boolean z11) {
        m144069a();
        this.f133479d.m144059n(this.f133478c, z11, this.f133477b);
        return this;
    }
}
