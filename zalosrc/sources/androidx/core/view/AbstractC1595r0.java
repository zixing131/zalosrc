package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import nn0.AbstractC23900i;
import nn0.AbstractC23902k;
import nn0.InterfaceC23898g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29103k;

/* renamed from: androidx.core.view.r0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1595r0 {

    /* renamed from: androidx.core.view.r0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC23898g {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6567a;

        a(ViewGroup viewGroup) {
            this.f6567a = viewGroup;
        }

        @Override // nn0.InterfaceC23898g
        public Iterator iterator() {
            return AbstractC1595r0.m8170c(this.f6567a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.r0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC29103k implements InterfaceC18509p {

        /* renamed from: r */
        Object f6568r;

        /* renamed from: s */
        Object f6569s;

        /* renamed from: t */
        int f6570t;

        /* renamed from: u */
        int f6571u;

        /* renamed from: v */
        int f6572v;

        /* renamed from: w */
        private /* synthetic */ Object f6573w;

        /* renamed from: x */
        final /* synthetic */ ViewGroup f6574x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.f6574x = viewGroup;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f6574x, continuation);
            bVar.f6573w = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:6:0x0091). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:7:0x009c). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC23900i abstractC23900i;
            ViewGroup viewGroup;
            int childCount;
            int i11;
            b bVar;
            b bVar2;
            AbstractC23900i abstractC23900i2;
            ViewGroup viewGroup2;
            View view;
            int i12;
            int i13;
            m142578e = AbstractC28298d.m142578e();
            int i14 = this.f6572v;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        i13 = this.f6571u;
                        i12 = this.f6570t;
                        ViewGroup viewGroup3 = (ViewGroup) this.f6568r;
                        AbstractC23900i abstractC23900i3 = (AbstractC23900i) this.f6573w;
                        AbstractC24862s.m129228b(obj);
                        bVar2 = this;
                        AbstractC23900i abstractC23900i4 = abstractC23900i3;
                        bVar = bVar2;
                        abstractC23900i = abstractC23900i4;
                        ViewGroup viewGroup4 = viewGroup3;
                        int i15 = i13;
                        viewGroup = viewGroup4;
                        int i16 = i15;
                        i11 = i12 + 1;
                        childCount = i16;
                        if (i11 >= childCount) {
                            View childAt = viewGroup.getChildAt(i11);
                            AbstractC19074t.m100207e(childAt, "getChildAt(index)");
                            bVar.f6573w = abstractC23900i;
                            bVar.f6568r = viewGroup;
                            bVar.f6569s = childAt;
                            bVar.f6570t = i11;
                            bVar.f6571u = childCount;
                            bVar.f6572v = 1;
                            if (abstractC23900i.mo124992a(childAt, bVar) == m142578e) {
                                return m142578e;
                            }
                            abstractC23900i2 = abstractC23900i;
                            bVar2 = bVar;
                            viewGroup2 = viewGroup;
                            i13 = childCount;
                            i12 = i11;
                            view = childAt;
                            if (!(view instanceof ViewGroup)) {
                                InterfaceC23898g m8169b = AbstractC1595r0.m8169b((ViewGroup) view);
                                bVar2.f6573w = abstractC23900i2;
                                bVar2.f6568r = viewGroup2;
                                bVar2.f6569s = null;
                                bVar2.f6570t = i12;
                                bVar2.f6571u = i13;
                                bVar2.f6572v = 2;
                                if (abstractC23900i2.m124995e(m8169b, bVar2) == m142578e) {
                                    return m142578e;
                                }
                                viewGroup3 = viewGroup2;
                                abstractC23900i3 = abstractC23900i2;
                                AbstractC23900i abstractC23900i42 = abstractC23900i3;
                                bVar = bVar2;
                                abstractC23900i = abstractC23900i42;
                                ViewGroup viewGroup42 = viewGroup3;
                                int i152 = i13;
                                viewGroup = viewGroup42;
                                int i162 = i152;
                                i11 = i12 + 1;
                                childCount = i162;
                                if (i11 >= childCount) {
                                    return C24848g0.f119245a;
                                }
                            } else {
                                i152 = i13;
                                viewGroup = viewGroup2;
                                bVar = bVar2;
                                abstractC23900i = abstractC23900i2;
                                int i1622 = i152;
                                i11 = i12 + 1;
                                childCount = i1622;
                                if (i11 >= childCount) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i13 = this.f6571u;
                    i12 = this.f6570t;
                    view = (View) this.f6569s;
                    viewGroup2 = (ViewGroup) this.f6568r;
                    abstractC23900i2 = (AbstractC23900i) this.f6573w;
                    AbstractC24862s.m129228b(obj);
                    bVar2 = this;
                    if (!(view instanceof ViewGroup)) {
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                abstractC23900i = (AbstractC23900i) this.f6573w;
                viewGroup = this.f6574x;
                childCount = viewGroup.getChildCount();
                i11 = 0;
                bVar = this;
                if (i11 >= childCount) {
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC23900i abstractC23900i, Continuation continuation) {
            return ((b) mo238a(abstractC23900i, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: androidx.core.view.r0$c */
    /* loaded from: classes2.dex */
    public static final class c implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private int f6575p;

        /* renamed from: q */
        final /* synthetic */ ViewGroup f6576q;

        c(ViewGroup viewGroup) {
            this.f6576q = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f6576q;
            int i11 = this.f6575p;
            this.f6575p = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6575p < this.f6576q.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f6576q;
            int i11 = this.f6575p - 1;
            this.f6575p = i11;
            viewGroup.removeViewAt(i11);
        }
    }

    /* renamed from: a */
    public static final InterfaceC23898g m8168a(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        return new a(viewGroup);
    }

    /* renamed from: b */
    public static final InterfaceC23898g m8169b(ViewGroup viewGroup) {
        InterfaceC23898g m125013b;
        AbstractC19074t.m100208f(viewGroup, "<this>");
        m125013b = AbstractC23902k.m125013b(new b(viewGroup, null));
        return m125013b;
    }

    /* renamed from: c */
    public static final Iterator m8170c(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        return new c(viewGroup);
    }
}
