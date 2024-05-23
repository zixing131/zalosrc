package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Empty implements Incomplete {

    /* renamed from: p */
    private final boolean f105869p;

    public Empty(boolean z11) {
        this.f105869p = z11;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public NodeList mo112682a() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: c */
    public boolean mo112683c() {
        return this.f105869p;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        if (mo112683c()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
