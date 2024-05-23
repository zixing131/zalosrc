package ik0;

import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.ScriptHelperImpl;
import com.zing.zalo.zinstant.zom.model.ExternalScriptData;
import com.zing.zalo.zinstant.zom.node.ZOMExternalScriptDataArray;
import com.zing.zalo.zinstant.zom.node.ZOMFontFace;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import ok0.InterfaceC24289f;
import ok0.InterfaceC24290g;
import pj0.InterfaceC24775a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vj0.C28273g;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: ik0.m */
/* loaded from: classes.dex */
public final class C20590m {

    /* renamed from: b */
    private static InterfaceC24289f f101273b;

    /* renamed from: c */
    private static InterfaceC24290g f101274c;

    /* renamed from: a */
    public static final C20590m f101272a = new C20590m();

    /* renamed from: d */
    private static final CoroutineExceptionHandler f101275d = new f(CoroutineExceptionHandler.f105837l);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.m$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101276t;

        /* renamed from: u */
        final /* synthetic */ C20589l f101277u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C20589l c20589l, Continuation continuation) {
            super(2, continuation);
            this.f101277u = c20589l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f101277u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f101276t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC24289f interfaceC24289f = C20590m.f101273b;
                if (interfaceC24289f != null) {
                    interfaceC24289f.mo107176e(this.f101277u.m107139c(), 0, true, this.f101277u.m107137a());
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.m$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101278t;

        /* renamed from: u */
        final /* synthetic */ C20589l f101279u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C20589l c20589l, Continuation continuation) {
            super(2, continuation);
            this.f101279u = c20589l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f101279u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f101278t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC24290g interfaceC24290g = C20590m.f101274c;
                if (interfaceC24290g != null) {
                    InterfaceC24290g.a.m126797b(interfaceC24290g, this.f101279u.m107139c(), null, 2, null);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.m$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101280t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC24290g f101281u;

        /* renamed from: v */
        final /* synthetic */ C20589l f101282v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC24290g interfaceC24290g, C20589l c20589l, Continuation continuation) {
            super(2, continuation);
            this.f101281u = interfaceC24290g;
            this.f101282v = c20589l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f101281u, this.f101282v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f101280t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC24290g.a.m126796a(this.f101281u, this.f101282v.m107139c(), null, 2, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ik0.m$d */
    /* loaded from: classes7.dex */
    public static final class d implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean[] f101283a;

        /* renamed from: b */
        final /* synthetic */ int f101284b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC24775a f101285c;

        /* renamed from: d */
        final /* synthetic */ AtomicBoolean f101286d;

        /* renamed from: e */
        final /* synthetic */ C20591n f101287e;

        d(AtomicBoolean[] atomicBooleanArr, int i11, InterfaceC24775a interfaceC24775a, AtomicBoolean atomicBoolean, C20591n c20591n) {
            this.f101283a = atomicBooleanArr;
            this.f101284b = i11;
            this.f101285c = interfaceC24775a;
            this.f101286d = atomicBoolean;
            this.f101287e = c20591n;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(Void r22) {
            this.f101283a[this.f101284b].set(true);
            ((ZOMFontFace) this.f101287e.m107150a()).requestInvalidate();
            this.f101286d.set(true);
            AtomicBoolean[] atomicBooleanArr = this.f101283a;
            if (AbstractC17201m.m91809a((AtomicBoolean[]) Arrays.copyOf(atomicBooleanArr, atomicBooleanArr.length))) {
                this.f101285c.onSuccess(Boolean.valueOf(this.f101286d.get()));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            this.f101283a[this.f101284b].set(true);
            AtomicBoolean[] atomicBooleanArr = this.f101283a;
            if (AbstractC17201m.m91809a((AtomicBoolean[]) Arrays.copyOf(atomicBooleanArr, atomicBooleanArr.length))) {
                this.f101285c.onSuccess(Boolean.valueOf(this.f101286d.get()));
            }
        }
    }

    /* renamed from: ik0.m$e */
    /* loaded from: classes7.dex */
    public static final class e implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f101288a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24775a f101289b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean[] f101290c;

        /* renamed from: d */
        final /* synthetic */ int f101291d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f101292e;

        e(AtomicBoolean atomicBoolean, InterfaceC24775a interfaceC24775a, AtomicBoolean[] atomicBooleanArr, int i11, AtomicBoolean atomicBoolean2) {
            this.f101288a = atomicBoolean;
            this.f101289b = interfaceC24775a;
            this.f101290c = atomicBooleanArr;
            this.f101291d = i11;
            this.f101292e = atomicBoolean2;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(Void r22) {
            this.f101290c[this.f101291d].set(true);
            AtomicBoolean[] atomicBooleanArr = this.f101290c;
            if (AbstractC17201m.m91809a((AtomicBoolean[]) Arrays.copyOf(atomicBooleanArr, atomicBooleanArr.length))) {
                this.f101289b.onSuccess(Boolean.valueOf(this.f101292e.get()));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            if (!this.f101288a.get()) {
                this.f101288a.set(true);
                this.f101289b.mo15338c(exc);
            }
        }
    }

    /* renamed from: ik0.m$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC27310a implements CoroutineExceptionHandler {
        public f(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    private C20590m() {
    }

    /* renamed from: c */
    public static final void m107142c(C20589l c20589l) {
        InterfaceC24290g interfaceC24290g;
        AbstractC19074t.m100208f(c20589l, "resourceHolder");
        int m107138b = c20589l.m107138b();
        if (m107138b == 0) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(f101275d)), null, null, new a(c20589l, null), 3, null);
            return;
        }
        if (m107138b == 1 || m107138b == 2) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(f101275d)), null, null, new b(c20589l, null), 3, null);
        } else if ((m107138b == 3 || m107138b == 7 || m107138b == 8) && (interfaceC24290g = f101274c) != null) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(f101275d)), null, null, new c(interfaceC24290g, c20589l, null), 3, null);
        }
    }

    /* renamed from: e */
    public static final void m107143e(List list, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(list, "preloadHolders");
        AbstractC19074t.m100208f(interfaceC24775a, "callback");
        int size = list.size();
        AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[size];
        for (int i11 = 0; i11 < size; i11++) {
            atomicBooleanArr[i11] = new AtomicBoolean(false);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            C20591n c20591n = (C20591n) obj;
            int m107151b = c20591n.m107151b();
            if (m107151b != 5) {
                if (m107151b == 6 && (c20591n.m107150a() instanceof ZOMExternalScriptDataArray) && ((ZOMExternalScriptDataArray) c20591n.m107150a()).mScript != null) {
                    ExternalScriptData[] externalScriptDataArr = ((ZOMExternalScriptDataArray) c20591n.m107150a()).mScript;
                    AbstractC19074t.m100207e(externalScriptDataArr, "preloadHolder.resource.mScript");
                    ScriptHelperImpl.downloadScripts(externalScriptDataArr, new e(atomicBoolean2, interfaceC24775a, atomicBooleanArr, i12, atomicBoolean));
                }
            } else if (c20591n.m107150a() instanceof ZOMFontFace) {
                C28273g.m142439i().m142457v((ZOMFontFace) c20591n.m107150a(), new d(atomicBooleanArr, i12, interfaceC24775a, atomicBoolean, c20591n), true);
            }
            i12 = i13;
        }
    }

    /* renamed from: d */
    public final void m107144d(InterfaceC24289f interfaceC24289f, InterfaceC24290g interfaceC24290g) {
        AbstractC19074t.m100208f(interfaceC24289f, "loader");
        AbstractC19074t.m100208f(interfaceC24290g, "fileLoader");
        f101273b = interfaceC24289f;
        f101274c = interfaceC24290g;
    }
}
