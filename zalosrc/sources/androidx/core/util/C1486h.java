package androidx.core.util;

/* renamed from: androidx.core.util.h */
/* loaded from: classes.dex */
public class C1486h extends C1485g {

    /* renamed from: c */
    private final Object f6378c;

    public C1486h(int i11) {
        super(i11);
        this.f6378c = new Object();
    }

    @Override // androidx.core.util.C1485g, androidx.core.util.InterfaceC1484f
    /* renamed from: a */
    public boolean mo7483a(Object obj) {
        boolean mo7483a;
        synchronized (this.f6378c) {
            mo7483a = super.mo7483a(obj);
        }
        return mo7483a;
    }

    @Override // androidx.core.util.C1485g, androidx.core.util.InterfaceC1484f
    /* renamed from: b */
    public Object mo7484b() {
        Object mo7484b;
        synchronized (this.f6378c) {
            mo7484b = super.mo7484b();
        }
        return mo7484b;
    }
}
