package d00;

import e00.EnumC18157a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d00.d */
/* loaded from: classes4.dex */
public abstract class AbstractC17690d extends AbstractC17688b implements Iterable {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    public List f89692p;

    /* renamed from: q */
    public EnumC18157a f89693q;

    public AbstractC17690d() {
        this.f89693q = EnumC18157a.f91819p;
        this.f89692p = new ArrayList();
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC17690d clone() {
        AbstractC17690d mo93695m = mo93695m();
        Iterator it = iterator();
        while (it.hasNext()) {
            mo93695m.f89692p.add(((AbstractC17691e) it.next()).mo93685e());
        }
        mo93695m.f89693q = this.f89693q;
        return mo93695m;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.f89692p.size() != ((AbstractC17690d) obj).f89692p.size()) {
            return false;
        }
        Iterator it = this.f89692p.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!((AbstractC17691e) it.next()).equals(r7.m93701g(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }

    /* renamed from: g */
    public AbstractC17691e m93701g(int i11) {
        return (AbstractC17691e) this.f89692p.get(i11);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f89692p.iterator();
    }

    /* renamed from: j */
    public int m93702j() {
        if (this.f89692p.size() <= 0) {
            return 0;
        }
        return ((AbstractC17691e) this.f89692p.get(0)).m93706g();
    }

    /* renamed from: k */
    public int m93703k() {
        if (this.f89692p.size() <= 0) {
            return 0;
        }
        return ((AbstractC17691e) this.f89692p.get(0)).m93707j();
    }

    /* renamed from: l */
    public AbstractC17690d m93704l(AbstractC17690d abstractC17690d) {
        this.f89692p = abstractC17690d.f89692p;
        return this;
    }

    /* renamed from: m */
    public abstract AbstractC17690d mo93695m();

    /* renamed from: n */
    public int m93705n() {
        return this.f89692p.size();
    }

    public AbstractC17690d(EnumC18157a enumC18157a) {
        this();
        this.f89693q = enumC18157a;
    }
}
