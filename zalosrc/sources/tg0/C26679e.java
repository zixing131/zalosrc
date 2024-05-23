package tg0;

import android.os.Build;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.coroutines.Continuation;
import ln0.AbstractC22543l;
import p452ql.InterfaceC25320d;
import p487rl.C25823d;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import pm0.C24848g0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25379x0;
import wm0.AbstractC29094b;

/* renamed from: tg0.e */
/* loaded from: classes7.dex */
public final class C26679e implements InterfaceC25320d {

    /* renamed from: a */
    private final ConcurrentHashMap f126345a;

    /* renamed from: b */
    private int f126346b;

    /* renamed from: tg0.e$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ EnumC25824e f126347q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC25824e enumC25824e) {
            super(2);
            this.f126347q = enumC25824e;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25823d mo240pC(String str, C25823d c25823d) {
            C25823d m133177b;
            AbstractC19074t.m100208f(str, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(c25823d, "migrationItem");
            m133177b = c25823d.m133177b((r33 & 1) != 0 ? c25823d.f123184a : null, (r33 & 2) != 0 ? c25823d.f123185b : null, (r33 & 4) != 0 ? c25823d.f123186c : null, (r33 & 8) != 0 ? c25823d.f123187d : null, (r33 & 16) != 0 ? c25823d.f123188e : 0L, (r33 & 32) != 0 ? c25823d.f123189f : null, (r33 & 64) != 0 ? c25823d.f123190g : 0, (r33 & 128) != 0 ? c25823d.f123191h : false, (r33 & 256) != 0 ? c25823d.f123192i : false, (r33 & 512) != 0 ? c25823d.f123193j : null, (r33 & 1024) != 0 ? c25823d.f123194k : this.f126347q, (r33 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c25823d.f123195l : 0L, (r33 & 4096) != 0 ? c25823d.f123196m : null, (r33 & 8192) != 0 ? c25823d.f123197n : null);
            return m133177b;
        }
    }

    /* renamed from: tg0.e$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ EnumC25825f f126348q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC25825f enumC25825f) {
            super(2);
            this.f126348q = enumC25825f;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25823d mo240pC(String str, C25823d c25823d) {
            C25823d m133177b;
            AbstractC19074t.m100208f(str, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(c25823d, "migrationItem");
            m133177b = c25823d.m133177b((r33 & 1) != 0 ? c25823d.f123184a : null, (r33 & 2) != 0 ? c25823d.f123185b : null, (r33 & 4) != 0 ? c25823d.f123186c : null, (r33 & 8) != 0 ? c25823d.f123187d : null, (r33 & 16) != 0 ? c25823d.f123188e : 0L, (r33 & 32) != 0 ? c25823d.f123189f : this.f126348q, (r33 & 64) != 0 ? c25823d.f123190g : 0, (r33 & 128) != 0 ? c25823d.f123191h : false, (r33 & 256) != 0 ? c25823d.f123192i : false, (r33 & 512) != 0 ? c25823d.f123193j : null, (r33 & 1024) != 0 ? c25823d.f123194k : null, (r33 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c25823d.f123195l : 0L, (r33 & 4096) != 0 ? c25823d.f123196m : null, (r33 & 8192) != 0 ? c25823d.f123197n : null);
            return m133177b;
        }
    }

    public C26679e(List list) {
        int m131511r;
        int m131400e;
        int m116580c;
        AbstractC19074t.m100208f(list, "migrateMsgList");
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        m131400e = AbstractC25361o0.m131400e(m131511r);
        m116580c = AbstractC22543l.m116580c(m131400e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
        for (Object obj : list2) {
            linkedHashMap.put(((C25823d) obj).m133186l(), obj);
        }
        this.f126345a = new ConcurrentHashMap(linkedHashMap);
        this.f126346b = 2;
    }

    /* renamed from: u */
    private final void m137018u(String str, final InterfaceC18509p interfaceC18509p) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f126345a.computeIfPresent(str, new BiFunction() { // from class: tg0.d
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    C25823d m137019v;
                    m137019v = C26679e.m137019v(InterfaceC18509p.this, obj, obj2);
                    return m137019v;
                }
            });
            return;
        }
        C25823d c25823d = (C25823d) this.f126345a.get(str);
        while (c25823d != null) {
            if (this.f126345a.replace(str, c25823d, (C25823d) interfaceC18509p.mo240pC(str, c25823d))) {
                return;
            } else {
                c25823d = (C25823d) this.f126345a.get(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final C25823d m137019v(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return (C25823d) interfaceC18509p.mo240pC(obj, obj2);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: a */
    public Object mo131119a(AbstractC16864d abstractC16864d, Continuation continuation) {
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: b */
    public Object mo131120b(Continuation continuation) {
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: c */
    public Object mo131121c(List list, List list2, Continuation continuation) {
        Collection values = this.f126345a.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            C25823d c25823d = (C25823d) obj;
            if (list.isEmpty() || list.contains(c25823d.m133191q())) {
                if (list2.isEmpty() || list2.contains(c25823d.m133188n())) {
                    arrayList.add(obj);
                }
            }
        }
        return AbstractC29094b.m145341c(arrayList.size());
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: d */
    public Object mo131122d(Continuation continuation) {
        Set m131551e;
        m131551e = AbstractC25379x0.m131551e();
        return m131551e;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: e */
    public Object mo131123e(Continuation continuation) {
        return null;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: f */
    public void mo131124f(int i11) {
        this.f126346b = i11;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: g */
    public Object mo131125g(Continuation continuation) {
        return AbstractC29094b.m145342d(0L);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: h */
    public Object mo131126h(String str, EnumC25825f enumC25825f, Continuation continuation) {
        m137018u(str, new b(enumC25825f));
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: i */
    public boolean mo131127i() {
        return false;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: j */
    public Object mo131128j(int i11, Continuation continuation) {
        return AbstractC29094b.m145341c(0);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: k */
    public Object mo131129k(List list, Continuation continuation) {
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: l */
    public Object mo131130l(Continuation continuation) {
        List m131502j;
        m131502j = AbstractC25368s.m131502j();
        return m131502j;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: m */
    public Object mo131131m(List list, List list2, int i11, int i12, Continuation continuation) {
        return InterfaceC25320d.a.m131140c(this, list, list2, i11, i12, continuation);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: n */
    public Object mo131132n(String str, Continuation continuation) {
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: o */
    public boolean mo131133o() {
        return InterfaceC25320d.a.m131143f(this);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: p */
    public Object mo131134p(List list, Continuation continuation) {
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: q */
    public Object mo131135q(String str, EnumC25824e enumC25824e, Continuation continuation) {
        m137018u(str, new a(enumC25824e));
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: r */
    public int mo131136r() {
        return this.f126346b;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: s */
    public Object mo131137s(List list, List list2, Continuation continuation) {
        Collection values = this.f126345a.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            C25823d c25823d = (C25823d) obj;
            if (list.isEmpty() || list.contains(c25823d.m133191q())) {
                if (list2.isEmpty() || list2.contains(c25823d.m133188n())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
