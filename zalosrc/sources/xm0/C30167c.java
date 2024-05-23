package xm0;

import fn0.AbstractC19074t;
import java.io.Serializable;
import qm0.AbstractC25336c;
import qm0.AbstractC25358n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xm0.c */
/* loaded from: classes.dex */
public final class C30167c extends AbstractC25336c implements InterfaceC30165a, Serializable {

    /* renamed from: q */
    private final Enum[] f140174q;

    public C30167c(Enum[] enumArr) {
        AbstractC19074t.m100208f(enumArr, "entries");
        this.f140174q = enumArr;
    }

    private final Object writeReplace() {
        return new C30168d(this.f140174q);
    }

    @Override // qm0.AbstractC25331a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return m148797e((Enum) obj);
    }

    @Override // qm0.AbstractC25331a
    /* renamed from: d */
    public int mo127005d() {
        return this.f140174q.length;
    }

    /* renamed from: e */
    public boolean m148797e(Enum r32) {
        Object m131364L;
        AbstractC19074t.m100208f(r32, "element");
        m131364L = AbstractC25358n.m131364L(this.f140174q, r32.ordinal());
        if (((Enum) m131364L) == r32) {
            return true;
        }
        return false;
    }

    @Override // qm0.AbstractC25336c, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Enum get(int i11) {
        AbstractC25336c.f121523p.m131235a(i11, this.f140174q.length);
        return this.f140174q[i11];
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return m148799j((Enum) obj);
    }

    /* renamed from: j */
    public int m148799j(Enum r32) {
        Object m131364L;
        AbstractC19074t.m100208f(r32, "element");
        int ordinal = r32.ordinal();
        m131364L = AbstractC25358n.m131364L(this.f140174q, ordinal);
        if (((Enum) m131364L) != r32) {
            return -1;
        }
        return ordinal;
    }

    /* renamed from: k */
    public int m148800k(Enum r22) {
        AbstractC19074t.m100208f(r22, "element");
        return indexOf(r22);
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return m148800k((Enum) obj);
    }
}
