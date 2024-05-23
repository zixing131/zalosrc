package p010a4;

import android.util.Base64;
import p010a4.C0111d;
import p668y3.EnumC30278d;

/* renamed from: a4.p */
/* loaded from: classes.dex */
public abstract class AbstractC0123p {

    /* renamed from: a4.p$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0123p mo516a();

        /* renamed from: b */
        public abstract a mo517b(String str);

        /* renamed from: c */
        public abstract a mo518c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo519d(EnumC30278d enumC30278d);
    }

    /* renamed from: a */
    public static a m549a() {
        return new C0111d.b().mo519d(EnumC30278d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo513b();

    /* renamed from: c */
    public abstract byte[] mo514c();

    /* renamed from: d */
    public abstract EnumC30278d mo515d();

    /* renamed from: e */
    public boolean m550e() {
        if (mo514c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC0123p m551f(EnumC30278d enumC30278d) {
        return m549a().mo517b(mo513b()).mo519d(enumC30278d).mo518c(mo514c()).mo516a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = mo513b();
        objArr[1] = mo515d();
        if (mo514c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(mo514c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
