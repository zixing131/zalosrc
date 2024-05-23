package xk0;

import com.zing.zalo.zinstant.utils.InterfaceC17194f;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.util.LinkedList;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import xk0.InterfaceC29696c;

/* renamed from: xk0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC29695b implements InterfaceC29696c {

    /* renamed from: a */
    private final InterfaceC17194f f137149a;

    /* renamed from: b */
    private final LinkedList f137150b;

    /* renamed from: c */
    private InterfaceC29694a f137151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xk0.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f137152s;

        /* renamed from: t */
        /* synthetic */ Object f137153t;

        /* renamed from: v */
        int f137155v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137153t = obj;
            this.f137155v |= Integer.MIN_VALUE;
            return AbstractC29695b.m147691c(AbstractC29695b.this, this);
        }
    }

    public AbstractC29695b(InterfaceC17194f interfaceC17194f) {
        AbstractC19074t.m100208f(interfaceC17194f, "predicate");
        this.f137149a = interfaceC17194f;
        this.f137150b = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object m147691c(AbstractC29695b abstractC29695b, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        InterfaceC29697d interfaceC29697d;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f137155v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f137155v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f137153t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f137155v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        abstractC29695b = (AbstractC29695b) aVar.f137152s;
                        AbstractC24862s.m129228b(obj);
                        InterfaceC29694a interfaceC29694a = (InterfaceC29694a) obj;
                        abstractC29695b.f137151c = interfaceC29694a;
                        if (abstractC29695b.f137149a.mo91804a(interfaceC29694a)) {
                            return interfaceC29694a;
                        }
                        while (!abstractC29695b.f137150b.isEmpty()) {
                            InterfaceC18494a interfaceC18494a = (InterfaceC18494a) abstractC29695b.f137150b.poll();
                            if (interfaceC18494a != null && (interfaceC29697d = (InterfaceC29697d) interfaceC18494a.mo12V4()) != null) {
                                aVar.f137152s = abstractC29695b;
                                aVar.f137155v = 1;
                                obj = abstractC29695b.m147692a(interfaceC29697d, aVar);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                InterfaceC29694a interfaceC29694a2 = (InterfaceC29694a) obj;
                                abstractC29695b.f137151c = interfaceC29694a2;
                                if (abstractC29695b.f137149a.mo91804a(interfaceC29694a2)) {
                                }
                                while (!abstractC29695b.f137150b.isEmpty()) {
                                }
                            }
                        }
                        return abstractC29695b.f137151c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                while (!abstractC29695b.f137150b.isEmpty()) {
                }
                return abstractC29695b.f137151c;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f137153t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f137155v;
        if (i11 == 0) {
        }
    }

    /* renamed from: a */
    public Object m147692a(InterfaceC29697d interfaceC29697d, Continuation continuation) {
        return InterfaceC29696c.a.m147695a(this, interfaceC29697d, continuation);
    }

    /* renamed from: b */
    public Object m147693b(Continuation continuation) {
        return m147691c(this, continuation);
    }

    /* renamed from: d */
    public AbstractC29695b m147694d(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "lazy");
        this.f137150b.add(interfaceC18494a);
        return this;
    }
}
