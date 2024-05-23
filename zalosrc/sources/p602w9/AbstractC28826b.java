package p602w9;

import java.nio.ByteBuffer;

/* renamed from: w9.b */
/* loaded from: classes3.dex */
public abstract class AbstractC28826b {

    /* renamed from: a */
    protected int f133528a;

    /* renamed from: b */
    protected ByteBuffer f133529b;

    /* renamed from: c */
    private int f133530c;

    /* renamed from: d */
    private int f133531d;

    /* renamed from: e */
    AbstractC28827c f133532e = AbstractC28827c.m144120d();

    /* renamed from: e */
    protected static String m144113e(int i11, ByteBuffer byteBuffer, AbstractC28827c abstractC28827c) {
        int i12 = i11 + byteBuffer.getInt(i11);
        return abstractC28827c.mo101931a(byteBuffer, i12 + 4, byteBuffer.getInt(i12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m144114a(int i11) {
        return i11 + this.f133529b.getInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m144115b(int i11) {
        if (i11 < this.f133531d) {
            return this.f133529b.getShort(this.f133530c + i11);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m144116c(int i11, ByteBuffer byteBuffer) {
        this.f133529b = byteBuffer;
        if (byteBuffer != null) {
            this.f133528a = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.f133530c = i12;
            this.f133531d = this.f133529b.getShort(i12);
            return;
        }
        this.f133528a = 0;
        this.f133530c = 0;
        this.f133531d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m144117d(int i11) {
        return m144113e(i11, this.f133529b, this.f133532e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public int m144118f(int i11) {
        int i12 = i11 + this.f133528a;
        return i12 + this.f133529b.getInt(i12) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public int m144119g(int i11) {
        int i12 = i11 + this.f133528a;
        return this.f133529b.getInt(i12 + this.f133529b.getInt(i12));
    }
}
