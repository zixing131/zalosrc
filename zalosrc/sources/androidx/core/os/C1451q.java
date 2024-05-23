package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.os.q */
/* loaded from: classes2.dex */
public final class C1451q implements InterfaceC1445k {

    /* renamed from: a */
    private final LocaleList f6280a;

    public C1451q(Object obj) {
        this.f6280a = AbstractC1448n.m7363a(obj);
    }

    @Override // androidx.core.os.InterfaceC1445k
    /* renamed from: a */
    public Object mo7360a() {
        return this.f6280a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f6280a.equals(((InterfaceC1445k) obj).mo7360a());
        return equals;
    }

    @Override // androidx.core.os.InterfaceC1445k
    public Locale get(int i11) {
        Locale locale;
        locale = this.f6280a.get(i11);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f6280a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.os.InterfaceC1445k
    public int size() {
        int size;
        size = this.f6280a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f6280a.toString();
        return localeList;
    }
}
