package kotlinx.coroutines.internal;

import fn0.AbstractC19060k;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {

    /* renamed from: r */
    private final Throwable f107404r;

    /* renamed from: s */
    private final String f107405s;

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th2, String str, int i11, AbstractC19060k abstractC19060k) {
        this(th2, (i11 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:            if (r1 == null) goto L8;     */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Void m113690J0() {
        String str;
        if (this.f107404r != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Module with the Main dispatcher had failed to initialize");
            String str2 = this.f107405s;
            if (str2 != null) {
                str = ". " + str2;
            }
            str = "";
            sb2.append(str);
            throw new IllegalStateException(sb2.toString(), this.f107404r);
        }
        MainDispatchersKt.m113688d();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: E0 */
    public boolean mo9278E0(InterfaceC27315f interfaceC27315f) {
        m113690J0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        m113690J0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* renamed from: G0 */
    public MainCoroutineDispatcher mo112861G0() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public Void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        m113690J0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public Void mo112663q(long j11, CancellableContinuation cancellableContinuation) {
        m113690J0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f107404r != null) {
            str = ", cause=" + this.f107404r;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: y */
    public DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
        m113690J0();
        throw new KotlinNothingValueException();
    }

    public MissingMainCoroutineDispatcher(Throwable th2, String str) {
        this.f107404r = th2;
        this.f107405s = str;
    }
}
