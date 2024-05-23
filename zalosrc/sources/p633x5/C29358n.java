package p633x5;

/* renamed from: x5.n */
/* loaded from: classes2.dex */
final class C29358n {

    /* renamed from: a */
    private final Object f135833a;

    /* renamed from: b */
    private final Object f135834b;

    /* renamed from: c */
    private final Object f135835c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29358n(Object obj, Object obj2, Object obj3) {
        this.f135833a = obj;
        this.f135834b = obj2;
        this.f135835c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m146499a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f135833a) + "=" + String.valueOf(this.f135834b) + " and " + String.valueOf(this.f135833a) + "=" + String.valueOf(this.f135835c));
    }
}
