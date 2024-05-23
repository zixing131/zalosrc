package xn0;

import java.io.Closeable;
import okio.C24291a;
import okio.InterfaceC24292b;
import yn0.AbstractC31034a;

/* renamed from: xn0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC30178h implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xn0.h$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC30178h {

        /* renamed from: p */
        final /* synthetic */ long f140210p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC24292b f140211q;

        a(AbstractC30174d abstractC30174d, long j11, InterfaceC24292b interfaceC24292b) {
            this.f140210p = j11;
            this.f140211q = interfaceC24292b;
        }

        @Override // xn0.AbstractC30178h
        /* renamed from: c */
        public InterfaceC24292b mo148855c() {
            return this.f140211q;
        }
    }

    /* renamed from: a */
    public static AbstractC30178h m148853a(AbstractC30174d abstractC30174d, long j11, InterfaceC24292b interfaceC24292b) {
        if (interfaceC24292b != null) {
            return new a(abstractC30174d, j11, interfaceC24292b);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: b */
    public static AbstractC30178h m148854b(AbstractC30174d abstractC30174d, byte[] bArr) {
        return m148853a(abstractC30174d, bArr.length, new C24291a().m126816y(bArr));
    }

    /* renamed from: c */
    public abstract InterfaceC24292b mo148855c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC31034a.m150852c(mo148855c());
    }
}
