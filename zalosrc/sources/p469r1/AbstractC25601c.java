package p469r1;

import java.nio.ByteBuffer;

/* renamed from: r1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC25601c {

    /* renamed from: a */
    protected int f122400a;

    /* renamed from: b */
    protected ByteBuffer f122401b;

    /* renamed from: c */
    private int f122402c;

    /* renamed from: d */
    private int f122403d;

    /* renamed from: e */
    AbstractC25602d f122404e = AbstractC25602d.m132253a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m132248a(int i11) {
        return i11 + this.f122401b.getInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m132249b(int i11) {
        if (i11 < this.f122403d) {
            return this.f122401b.getShort(this.f122402c + i11);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m132250c(int i11, ByteBuffer byteBuffer) {
        this.f122401b = byteBuffer;
        if (byteBuffer != null) {
            this.f122400a = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.f122402c = i12;
            this.f122403d = this.f122401b.getShort(i12);
            return;
        }
        this.f122400a = 0;
        this.f122402c = 0;
        this.f122403d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public int m132251d(int i11) {
        int i12 = i11 + this.f122400a;
        return i12 + this.f122401b.getInt(i12) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m132252e(int i11) {
        int i12 = i11 + this.f122400a;
        return this.f122401b.getInt(i12 + this.f122401b.getInt(i12));
    }
}
