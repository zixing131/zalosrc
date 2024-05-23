package xn0;

import yn0.AbstractC31034a;

/* renamed from: xn0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC30176f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xn0.f$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC30176f {

        /* renamed from: a */
        final /* synthetic */ int f140207a;

        /* renamed from: b */
        final /* synthetic */ byte[] f140208b;

        /* renamed from: c */
        final /* synthetic */ int f140209c;

        a(AbstractC30174d abstractC30174d, int i11, byte[] bArr, int i12) {
            this.f140207a = i11;
            this.f140208b = bArr;
            this.f140209c = i12;
        }
    }

    /* renamed from: a */
    public static AbstractC30176f m148851a(AbstractC30174d abstractC30174d, byte[] bArr) {
        return m148852b(abstractC30174d, bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static AbstractC30176f m148852b(AbstractC30174d abstractC30174d, byte[] bArr, int i11, int i12) {
        if (bArr != null) {
            AbstractC31034a.m150851b(bArr.length, i11, i12);
            return new a(abstractC30174d, i12, bArr, i11);
        }
        throw new NullPointerException("content == null");
    }
}
