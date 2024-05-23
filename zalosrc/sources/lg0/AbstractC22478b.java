package lg0;

import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.zalocloud.backup.GetBackupMetadataException;
import dh0.C17932a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gd.C19392a;
import id.C20512b;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: lg0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC22478b {

    /* renamed from: a */
    private static final CoroutineDispatcher f109917a = C17932a.f90528a.m94572a().mo112623F0(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f109918s;

        /* renamed from: t */
        /* synthetic */ Object f109919t;

        /* renamed from: u */
        int f109920u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109919t = obj;
            this.f109920u |= Integer.MIN_VALUE;
            return AbstractC22478b.m116229a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109921t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC22477a f109922u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC22477a interfaceC22477a, Continuation continuation) {
            super(2, continuation);
            this.f109922u = interfaceC22477a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f109922u, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC22477a interfaceC22477a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109921t;
            int i12 = 1;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        interfaceC22477a = this.f109922u;
                        this.f109921t = 3;
                        if (interfaceC22477a.mo116227e(true, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC22477a interfaceC22477a2 = this.f109922u;
                    this.f109921t = 1;
                    obj = interfaceC22477a2.mo116223a(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    String m132995l = AbstractC23306f.m120688m().m132995l(true);
                    C20512b c20512b = new C20512b();
                    c20512b.m101515f(m132995l);
                    Object m101509a = new C19392a(c20512b, AbstractC23306f.m120676j().m128419n(), null, 4, null).m101509a(new C20512b.b(false, i12, null));
                    AbstractC19074t.m100205c(m101509a);
                    C20512b.c cVar = (C20512b.c) m101509a;
                    InterfaceC22477a interfaceC22477a3 = this.f109922u;
                    ArrayList m106567a = cVar.m106567a();
                    HashMap m106569c = cVar.m106569c();
                    this.f109921t = 2;
                    if (interfaceC22477a3.mo116224b(m106567a, m106569c, this) == m142578e) {
                        return m142578e;
                    }
                    interfaceC22477a = this.f109922u;
                    this.f109921t = 3;
                    if (interfaceC22477a.mo116227e(true, this) == m142578e) {
                    }
                }
                return C24848g0.f119245a;
            } catch (BackupRestoreMediaException e11) {
                throw new GetBackupMetadataException(e11.m37267a(), e11.m37268b());
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m116229a(InterfaceC22477a interfaceC22477a, Continuation continuation) {
        a aVar;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f109920u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f109920u = i12 - Integer.MIN_VALUE;
                obj = aVar.f109919t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f109920u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC22477a = (InterfaceC22477a) aVar.f109918s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f109918s = interfaceC22477a;
                    aVar.f109920u = 1;
                    obj = interfaceC22477a.mo116223a(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return C24848g0.f119245a;
                }
                CoroutineDispatcher coroutineDispatcher = f109917a;
                b bVar = new b(interfaceC22477a, null);
                aVar.f109918s = null;
                aVar.f109920u = 2;
                if (BuildersKt.m112534g(coroutineDispatcher, bVar, aVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        aVar = new a(continuation);
        obj = aVar.f109919t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f109920u;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
