package vn0;

import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import pm0.AbstractC24837b;
import pm0.AbstractC24839c;
import pm0.AbstractC24862s;
import pm0.C24835a;
import pm0.C24848g0;
import un0.C27328f;
import un0.C27337o;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29103k;

/* renamed from: vn0.o0 */
/* loaded from: classes7.dex */
public final class C28335o0 {

    /* renamed from: a */
    private final AbstractC28305a f132074a;

    /* renamed from: b */
    private final boolean f132075b;

    /* renamed from: c */
    private int f132076c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vn0.o0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29103k implements InterfaceC18510q {

        /* renamed from: r */
        int f132077r;

        /* renamed from: s */
        private /* synthetic */ Object f132078s;

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132077r;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC24839c abstractC24839c = (AbstractC24839c) this.f132078s;
                byte m142599E = C28335o0.this.f132074a.m142599E();
                if (m142599E == 1) {
                    return C28335o0.this.m142757j(true);
                }
                if (m142599E == 0) {
                    return C28335o0.this.m142757j(false);
                }
                if (m142599E == 6) {
                    C28335o0 c28335o0 = C28335o0.this;
                    this.f132077r = 1;
                    obj = c28335o0.m142755h(abstractC24839c, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                } else {
                    if (m142599E == 8) {
                        return C28335o0.this.m142753f();
                    }
                    AbstractC28305a.m142595y(C28335o0.this.f132074a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return (JsonElement) obj;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(AbstractC24839c abstractC24839c, C24848g0 c24848g0, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f132078s = abstractC24839c;
            return aVar.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vn0.o0$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f132080s;

        /* renamed from: t */
        Object f132081t;

        /* renamed from: u */
        Object f132082u;

        /* renamed from: v */
        Object f132083v;

        /* renamed from: w */
        /* synthetic */ Object f132084w;

        /* renamed from: y */
        int f132086y;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f132084w = obj;
            this.f132086y |= Integer.MIN_VALUE;
            return C28335o0.this.m142755h(null, this);
        }
    }

    public C28335o0(C27328f c27328f, AbstractC28305a abstractC28305a) {
        AbstractC19074t.m100208f(c27328f, "configuration");
        AbstractC19074t.m100208f(abstractC28305a, "lexer");
        this.f132074a = abstractC28305a;
        this.f132075b = c27328f.m139896m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final JsonElement m142753f() {
        boolean z11;
        int i11;
        byte mo142614m = this.f132074a.mo142614m();
        if (this.f132074a.m142599E() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f132074a.mo142609f()) {
                arrayList.add(m142758e());
                mo142614m = this.f132074a.mo142614m();
                if (mo142614m != 4) {
                    AbstractC28305a abstractC28305a = this.f132074a;
                    if (mo142614m == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i11 = abstractC28305a.f132016a;
                    if (!z11) {
                        AbstractC28305a.m142595y(abstractC28305a, "Expected end of the array or comma", i11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (mo142614m == 8) {
                this.f132074a.m142615n((byte) 9);
            } else if (mo142614m == 4) {
                AbstractC28305a.m142595y(this.f132074a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new JsonArray(arrayList);
        }
        AbstractC28305a.m142595y(this.f132074a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    private final JsonElement m142754g() {
        return (JsonElement) AbstractC24837b.m129148b(new C24835a(new a(null)), C24848g0.f119245a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009c -> B:10:0x00a6). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m142755h(AbstractC24839c abstractC24839c, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C28335o0 c28335o0;
        LinkedHashMap linkedHashMap;
        Object obj;
        b bVar2;
        byte b11;
        AbstractC24839c abstractC24839c2;
        String m142618q;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f132086y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f132086y = i12 - Integer.MIN_VALUE;
                Object obj2 = bVar.f132084w;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f132086y;
                if (i11 == 0) {
                    if (i11 == 1) {
                        String str = (String) bVar.f132083v;
                        linkedHashMap = (LinkedHashMap) bVar.f132082u;
                        c28335o0 = (C28335o0) bVar.f132081t;
                        AbstractC24839c abstractC24839c3 = (AbstractC24839c) bVar.f132080s;
                        AbstractC24862s.m129228b(obj2);
                        bVar2 = bVar;
                        Object obj3 = m142578e;
                        linkedHashMap.put(str, (JsonElement) obj2);
                        byte mo142614m = c28335o0.f132074a.mo142614m();
                        if (mo142614m == 4) {
                            if (mo142614m == 7) {
                                b11 = mo142614m;
                                if (b11 == 6) {
                                    c28335o0.f132074a.m142615n((byte) 7);
                                } else if (b11 == 4) {
                                    AbstractC28305a.m142595y(c28335o0.f132074a, "Unexpected trailing comma", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                                return new JsonObject(linkedHashMap);
                            }
                            AbstractC28305a.m142595y(c28335o0.f132074a, "Expected end of the object or comma", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        obj = obj3;
                        b11 = mo142614m;
                        abstractC24839c2 = abstractC24839c3;
                        if (c28335o0.f132074a.mo142609f()) {
                            if (c28335o0.f132075b) {
                                m142618q = c28335o0.f132074a.m142620s();
                            } else {
                                m142618q = c28335o0.f132074a.m142618q();
                            }
                            c28335o0.f132074a.m142615n((byte) 5);
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            bVar2.f132080s = abstractC24839c2;
                            bVar2.f132081t = c28335o0;
                            bVar2.f132082u = linkedHashMap;
                            bVar2.f132083v = m142618q;
                            bVar2.f132086y = 1;
                            Object mo129155a = abstractC24839c2.mo129155a(c24848g0, bVar2);
                            if (mo129155a == obj) {
                                return obj;
                            }
                            abstractC24839c3 = abstractC24839c2;
                            obj2 = mo129155a;
                            Object obj4 = obj;
                            str = m142618q;
                            obj3 = obj4;
                            linkedHashMap.put(str, (JsonElement) obj2);
                            byte mo142614m2 = c28335o0.f132074a.mo142614m();
                            if (mo142614m2 == 4) {
                            }
                        }
                        if (b11 == 6) {
                        }
                        return new JsonObject(linkedHashMap);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj2);
                byte m142615n = this.f132074a.m142615n((byte) 6);
                if (this.f132074a.m142599E() != 4) {
                    c28335o0 = this;
                    linkedHashMap = new LinkedHashMap();
                    obj = m142578e;
                    bVar2 = bVar;
                    b11 = m142615n;
                    abstractC24839c2 = abstractC24839c;
                    if (c28335o0.f132074a.mo142609f()) {
                    }
                    if (b11 == 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                AbstractC28305a.m142595y(this.f132074a, "Unexpected leading comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        bVar = new b(continuation);
        Object obj22 = bVar.f132084w;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f132086y;
        if (i11 == 0) {
        }
    }

    /* renamed from: i */
    private final JsonElement m142756i() {
        String m142618q;
        byte m142615n = this.f132074a.m142615n((byte) 6);
        if (this.f132074a.m142599E() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f132074a.mo142609f()) {
                    break;
                }
                if (this.f132075b) {
                    m142618q = this.f132074a.m142620s();
                } else {
                    m142618q = this.f132074a.m142618q();
                }
                this.f132074a.m142615n((byte) 5);
                linkedHashMap.put(m142618q, m142758e());
                m142615n = this.f132074a.mo142614m();
                if (m142615n != 4) {
                    if (m142615n != 7) {
                        AbstractC28305a.m142595y(this.f132074a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (m142615n == 6) {
                this.f132074a.m142615n((byte) 7);
            } else if (m142615n == 4) {
                AbstractC28305a.m142595y(this.f132074a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractC28305a.m142595y(this.f132074a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final JsonPrimitive m142757j(boolean z11) {
        String m142620s;
        if (!this.f132075b && z11) {
            m142620s = this.f132074a.m142618q();
        } else {
            m142620s = this.f132074a.m142620s();
        }
        String str = m142620s;
        if (!z11 && AbstractC19074t.m100204b(str, "null")) {
            return JsonNull.INSTANCE;
        }
        return new C27337o(str, z11, null, 4, null);
    }

    /* renamed from: e */
    public final JsonElement m142758e() {
        JsonElement m142756i;
        byte m142599E = this.f132074a.m142599E();
        if (m142599E == 1) {
            return m142757j(true);
        }
        if (m142599E == 0) {
            return m142757j(false);
        }
        if (m142599E == 6) {
            int i11 = this.f132076c + 1;
            this.f132076c = i11;
            if (i11 == 200) {
                m142756i = m142754g();
            } else {
                m142756i = m142756i();
            }
            this.f132076c--;
            return m142756i;
        }
        if (m142599E == 8) {
            return m142753f();
        }
        AbstractC28305a.m142595y(this.f132074a, "Cannot begin reading element, unexpected token: " + ((int) m142599E), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
