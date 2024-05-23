package qm0;

import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: qm0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC25334b implements Iterator, InterfaceC19517a {

    /* renamed from: p */
    private EnumC25333a1 f121519p = EnumC25333a1.f121514q;

    /* renamed from: q */
    private Object f121520q;

    /* renamed from: qm0.b$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f121521a;

        static {
            int[] iArr = new int[EnumC25333a1.values().length];
            try {
                iArr[EnumC25333a1.f121515r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25333a1.f121513p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121521a = iArr;
        }
    }

    /* renamed from: e */
    private final boolean m131230e() {
        this.f121519p = EnumC25333a1.f121516s;
        mo13902a();
        if (this.f121519p == EnumC25333a1.f121513p) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo13902a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m131231c() {
        this.f121519p = EnumC25333a1.f121515r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m131232d(Object obj) {
        this.f121520q = obj;
        this.f121519p = EnumC25333a1.f121513p;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        EnumC25333a1 enumC25333a1 = this.f121519p;
        if (enumC25333a1 != EnumC25333a1.f121516s) {
            int i11 = a.f121521a[enumC25333a1.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return true;
                }
                return m131230e();
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.f121519p = EnumC25333a1.f121514q;
            return this.f121520q;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
