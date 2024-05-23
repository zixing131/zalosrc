package qm0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ln0.AbstractC22543l;
import nn0.AbstractC23900i;
import nn0.AbstractC23902k;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29103k;

/* renamed from: qm0.z0 */
/* loaded from: classes7.dex */
public abstract class AbstractC25383z0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qm0.z0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29103k implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ boolean f121560A;

        /* renamed from: r */
        Object f121561r;

        /* renamed from: s */
        Object f121562s;

        /* renamed from: t */
        int f121563t;

        /* renamed from: u */
        int f121564u;

        /* renamed from: v */
        private /* synthetic */ Object f121565v;

        /* renamed from: w */
        final /* synthetic */ int f121566w;

        /* renamed from: x */
        final /* synthetic */ int f121567x;

        /* renamed from: y */
        final /* synthetic */ Iterator f121568y;

        /* renamed from: z */
        final /* synthetic */ boolean f121569z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, Iterator it, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f121566w = i11;
            this.f121567x = i12;
            this.f121568y = it;
            this.f121569z = z11;
            this.f121560A = z12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f121566w, this.f121567x, this.f121568y, this.f121569z, this.f121560A, continuation);
            aVar.f121565v = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014b -> B:12:0x014e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011d -> B:30:0x0120). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a6 -> B:50:0x0058). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m116584g;
            C25373u0 c25373u0;
            Iterator it;
            AbstractC23900i abstractC23900i;
            a aVar;
            AbstractC23900i abstractC23900i2;
            ArrayList arrayList;
            int i11;
            Iterator it2;
            int i12;
            a aVar2;
            C25373u0 c25373u02;
            AbstractC23900i abstractC23900i3;
            Object arrayList2;
            Object arrayList3;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f121564u;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                c25373u02 = (C25373u0) this.f121561r;
                                abstractC23900i3 = (AbstractC23900i) this.f121565v;
                                AbstractC24862s.m129228b(obj);
                                aVar = this;
                                c25373u02.m131522n(aVar.f121567x);
                                if (c25373u02.size() <= aVar.f121567x) {
                                    if (aVar.f121569z) {
                                        arrayList3 = c25373u02;
                                    } else {
                                        arrayList3 = new ArrayList(c25373u02);
                                    }
                                    aVar.f121565v = abstractC23900i3;
                                    aVar.f121561r = c25373u02;
                                    aVar.f121562s = null;
                                    aVar.f121564u = 4;
                                    if (abstractC23900i3.mo124992a(arrayList3, aVar) == m142578e) {
                                        return m142578e;
                                    }
                                    c25373u02.m131522n(aVar.f121567x);
                                    if (c25373u02.size() <= aVar.f121567x) {
                                        if (!c25373u02.isEmpty()) {
                                            aVar.f121565v = null;
                                            aVar.f121561r = null;
                                            aVar.f121562s = null;
                                            aVar.f121564u = 5;
                                            if (abstractC23900i3.mo124992a(c25373u02, aVar) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        return C24848g0.f119245a;
                                    }
                                }
                            }
                        } else {
                            it = (Iterator) this.f121562s;
                            c25373u0 = (C25373u0) this.f121561r;
                            abstractC23900i = (AbstractC23900i) this.f121565v;
                            AbstractC24862s.m129228b(obj);
                            aVar = this;
                            c25373u0.m131522n(aVar.f121567x);
                            while (it.hasNext()) {
                                c25373u0.m131519k(it.next());
                                if (c25373u0.m131521m()) {
                                    int size = c25373u0.size();
                                    int i14 = aVar.f121566w;
                                    if (size < i14) {
                                        c25373u0 = c25373u0.m131520l(i14);
                                    } else {
                                        if (aVar.f121569z) {
                                            arrayList2 = c25373u0;
                                        } else {
                                            arrayList2 = new ArrayList(c25373u0);
                                        }
                                        aVar.f121565v = abstractC23900i;
                                        aVar.f121561r = c25373u0;
                                        aVar.f121562s = it;
                                        aVar.f121564u = 3;
                                        if (abstractC23900i.mo124992a(arrayList2, aVar) == m142578e) {
                                            return m142578e;
                                        }
                                        c25373u0.m131522n(aVar.f121567x);
                                        while (it.hasNext()) {
                                        }
                                    }
                                }
                            }
                            if (aVar.f121560A) {
                                c25373u02 = c25373u0;
                                abstractC23900i3 = abstractC23900i;
                                if (c25373u02.size() <= aVar.f121567x) {
                                }
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                i12 = this.f121563t;
                it2 = (Iterator) this.f121562s;
                arrayList = (ArrayList) this.f121561r;
                abstractC23900i2 = (AbstractC23900i) this.f121565v;
                AbstractC24862s.m129228b(obj);
                aVar2 = this;
                i11 = i12;
                if (!aVar2.f121569z) {
                    arrayList.clear();
                } else {
                    arrayList = new ArrayList(aVar2.f121566w);
                }
                i12 = i11;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (i11 > 0) {
                        i11--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == aVar2.f121566w) {
                            aVar2.f121565v = abstractC23900i2;
                            aVar2.f121561r = arrayList;
                            aVar2.f121562s = it2;
                            aVar2.f121563t = i12;
                            aVar2.f121564u = 1;
                            if (abstractC23900i2.mo124992a(arrayList, aVar2) == m142578e) {
                                return m142578e;
                            }
                            i11 = i12;
                            if (!aVar2.f121569z) {
                            }
                            i12 = i11;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (aVar2.f121560A || arrayList.size() == aVar2.f121566w)) {
                    aVar2.f121565v = null;
                    aVar2.f121561r = null;
                    aVar2.f121562s = null;
                    aVar2.f121564u = 2;
                    if (abstractC23900i2.mo124992a(arrayList, aVar2) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            AbstractC23900i abstractC23900i4 = (AbstractC23900i) this.f121565v;
            m116584g = AbstractC22543l.m116584g(this.f121566w, 1024);
            int i15 = this.f121567x - this.f121566w;
            if (i15 >= 0) {
                abstractC23900i2 = abstractC23900i4;
                arrayList = new ArrayList(m116584g);
                i11 = 0;
                it2 = this.f121568y;
                i12 = i15;
                aVar2 = this;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    aVar2.f121565v = null;
                    aVar2.f121561r = null;
                    aVar2.f121562s = null;
                    aVar2.f121564u = 2;
                    if (abstractC23900i2.mo124992a(arrayList, aVar2) == m142578e) {
                    }
                }
                return C24848g0.f119245a;
            }
            c25373u0 = new C25373u0(m116584g);
            it = this.f121568y;
            abstractC23900i = abstractC23900i4;
            aVar = this;
            while (it.hasNext()) {
            }
            if (aVar.f121560A) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC23900i abstractC23900i, Continuation continuation) {
            return ((a) mo238a(abstractC23900i, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final void m131567a(int i11, int i12) {
        String str;
        if (i11 > 0 && i12 > 0) {
            return;
        }
        if (i11 != i12) {
            str = "Both size " + i11 + " and step " + i12 + " must be greater than zero.";
        } else {
            str = "size " + i11 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: b */
    public static final Iterator m131568b(Iterator it, int i11, int i12, boolean z11, boolean z12) {
        Iterator m125012a;
        AbstractC19074t.m100208f(it, "iterator");
        if (it.hasNext()) {
            m125012a = AbstractC23902k.m125012a(new a(i11, i12, it, z12, z11, null));
            return m125012a;
        }
        return C25335b0.f121522p;
    }
}
