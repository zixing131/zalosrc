package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import nn0.AbstractC23900i;
import nn0.AbstractC23902k;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
public final class DebugCoroutineInfoImpl {
    private volatile WeakReference<InterfaceC29097e> _lastObservedFrame;
    private volatile String _state;

    /* renamed from: a */
    private final StackTraceFrame f106360a;

    /* renamed from: b */
    public final long f106361b;

    /* renamed from: c */
    private final WeakReference f106362c;
    public volatile Thread lastObservedThread;

    /* renamed from: b */
    private final List m113234b() {
        InterfaceC23898g m125013b;
        List m125032u;
        List m131502j;
        StackTraceFrame stackTraceFrame = this.f106360a;
        if (stackTraceFrame == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        m125013b = AbstractC23902k.m125013b(new DebugCoroutineInfoImpl$creationStackTrace$1(this, stackTraceFrame, null));
        m125032u = AbstractC23906o.m125032u(m125013b);
        return m125032u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:11:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m113235i(AbstractC23900i abstractC23900i, InterfaceC29097e interfaceC29097e, Continuation continuation) {
        DebugCoroutineInfoImpl$yieldFrames$1 debugCoroutineInfoImpl$yieldFrames$1;
        Object m142578e;
        int i11;
        DebugCoroutineInfoImpl debugCoroutineInfoImpl;
        if (continuation instanceof DebugCoroutineInfoImpl$yieldFrames$1) {
            debugCoroutineInfoImpl$yieldFrames$1 = (DebugCoroutineInfoImpl$yieldFrames$1) continuation;
            int i12 = debugCoroutineInfoImpl$yieldFrames$1.f106372x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                debugCoroutineInfoImpl$yieldFrames$1.f106372x = i12 - Integer.MIN_VALUE;
                Object obj = debugCoroutineInfoImpl$yieldFrames$1.f106370v;
                m142578e = AbstractC28298d.m142578e();
                i11 = debugCoroutineInfoImpl$yieldFrames$1.f106372x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        InterfaceC29097e interfaceC29097e2 = (InterfaceC29097e) debugCoroutineInfoImpl$yieldFrames$1.f106369u;
                        AbstractC23900i abstractC23900i2 = (AbstractC23900i) debugCoroutineInfoImpl$yieldFrames$1.f106368t;
                        debugCoroutineInfoImpl = (DebugCoroutineInfoImpl) debugCoroutineInfoImpl$yieldFrames$1.f106367s;
                        AbstractC24862s.m129228b(obj);
                        AbstractC23900i abstractC23900i3 = abstractC23900i2;
                        interfaceC29097e = interfaceC29097e2;
                        abstractC23900i = abstractC23900i3;
                        interfaceC29097e = interfaceC29097e.mo112582e();
                        if (interfaceC29097e == null) {
                            return C24848g0.f119245a;
                        }
                        if (interfaceC29097e == null) {
                            StackTraceElement mo112573C = interfaceC29097e.mo112573C();
                            if (mo112573C != null) {
                                debugCoroutineInfoImpl$yieldFrames$1.f106367s = debugCoroutineInfoImpl;
                                debugCoroutineInfoImpl$yieldFrames$1.f106368t = abstractC23900i;
                                debugCoroutineInfoImpl$yieldFrames$1.f106369u = interfaceC29097e;
                                debugCoroutineInfoImpl$yieldFrames$1.f106372x = 1;
                                if (abstractC23900i.mo124992a(mo112573C, debugCoroutineInfoImpl$yieldFrames$1) == m142578e) {
                                    return m142578e;
                                }
                                InterfaceC29097e interfaceC29097e3 = interfaceC29097e;
                                abstractC23900i2 = abstractC23900i;
                                interfaceC29097e2 = interfaceC29097e3;
                                AbstractC23900i abstractC23900i32 = abstractC23900i2;
                                interfaceC29097e = interfaceC29097e2;
                                abstractC23900i = abstractC23900i32;
                            }
                            interfaceC29097e = interfaceC29097e.mo112582e();
                            if (interfaceC29097e == null) {
                            }
                            if (interfaceC29097e == null) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    debugCoroutineInfoImpl = this;
                    if (interfaceC29097e == null) {
                    }
                }
            }
        }
        debugCoroutineInfoImpl$yieldFrames$1 = new DebugCoroutineInfoImpl$yieldFrames$1(this, continuation);
        Object obj2 = debugCoroutineInfoImpl$yieldFrames$1.f106370v;
        m142578e = AbstractC28298d.m142578e();
        i11 = debugCoroutineInfoImpl$yieldFrames$1.f106372x;
        if (i11 == 0) {
        }
    }

    /* renamed from: c */
    public final InterfaceC27315f m113236c() {
        return (InterfaceC27315f) this.f106362c.get();
    }

    /* renamed from: d */
    public final StackTraceFrame m113237d() {
        return this.f106360a;
    }

    /* renamed from: e */
    public final List m113238e() {
        return m113234b();
    }

    /* renamed from: f */
    public final InterfaceC29097e m113239f() {
        WeakReference<InterfaceC29097e> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    public final String m113240g() {
        return this._state;
    }

    /* renamed from: h */
    public final List m113241h() {
        List m131502j;
        InterfaceC29097e m113239f = m113239f();
        if (m113239f == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        while (m113239f != null) {
            StackTraceElement mo112573C = m113239f.mo112573C();
            if (mo112573C != null) {
                arrayList.add(mo112573C);
            }
            m113239f = m113239f.mo112582e();
        }
        return arrayList;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + m113240g() + ",context=" + m113236c() + ')';
    }
}
