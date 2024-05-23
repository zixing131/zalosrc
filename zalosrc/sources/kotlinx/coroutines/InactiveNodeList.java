package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class InactiveNodeList implements Incomplete {

    /* renamed from: p */
    private final NodeList f105888p;

    public InactiveNodeList(NodeList nodeList) {
        this.f105888p = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public NodeList mo112682a() {
        return this.f105888p;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: c */
    public boolean mo112683c() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
