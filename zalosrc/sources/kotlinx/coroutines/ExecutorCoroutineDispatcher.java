package kotlinx.coroutines;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import java.io.Closeable;
import um0.AbstractC27311b;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: r */
    public static final Key f105884r = new Key(null);

    /* loaded from: classes.dex */
    public static final class Key extends AbstractC27311b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1 */
        /* loaded from: classes.dex */
        public static final class C217931 extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C217931 f105885q = new C217931();

            C217931() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final ExecutorCoroutineDispatcher mo205i9(InterfaceC27315f.b bVar) {
                if (bVar instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Key(AbstractC19060k abstractC19060k) {
            this();
        }

        private Key() {
            super(CoroutineDispatcher.f105835q, C217931.f105885q);
        }
    }
}
