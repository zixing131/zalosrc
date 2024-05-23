package p502s3;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: s3.a */
/* loaded from: classes2.dex */
abstract class AbstractC26115a {

    /* renamed from: a */
    private final Queue f124331a = new ArrayDeque(20);

    /* renamed from: a */
    protected abstract InterfaceC26122h mo134445a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public InterfaceC26122h m134446b() {
        InterfaceC26122h interfaceC26122h = (InterfaceC26122h) this.f124331a.poll();
        if (interfaceC26122h == null) {
            return mo134445a();
        }
        return interfaceC26122h;
    }

    /* renamed from: c */
    public void m134447c(InterfaceC26122h interfaceC26122h) {
        if (this.f124331a.size() < 20) {
            this.f124331a.offer(interfaceC26122h);
        }
    }
}
