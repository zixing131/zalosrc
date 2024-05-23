package gm;

import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import p602w9.AbstractC28827c;
import p602w9.C28828d;

/* renamed from: gm.c */
/* loaded from: classes.dex */
public final class C19492c extends AbstractC28827c {

    /* renamed from: b */
    C28828d f96794b = new C28828d();

    @Override // p602w9.AbstractC28827c
    /* renamed from: a */
    public String mo101931a(ByteBuffer byteBuffer, int i11, int i12) {
        try {
            return this.f96794b.mo101931a(byteBuffer, i11, i12);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return new String(byteBuffer.array(), i11, i12);
        }
    }

    @Override // p602w9.AbstractC28827c
    /* renamed from: b */
    public void mo101932b(CharSequence charSequence, ByteBuffer byteBuffer) {
        this.f96794b.mo101932b(charSequence, byteBuffer);
    }

    @Override // p602w9.AbstractC28827c
    /* renamed from: c */
    public int mo101933c(CharSequence charSequence) {
        return this.f96794b.mo101933c(charSequence);
    }
}
