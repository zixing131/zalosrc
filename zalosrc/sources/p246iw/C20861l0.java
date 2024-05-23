package p246iw;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kw.C21956b;
import ln0.AbstractC22543l;
import me0.AbstractC23160o0;
import mw.AbstractC23463h;
import p365nk.C23805a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: iw.l0 */
/* loaded from: classes4.dex */
public final class C20861l0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC24854k f102535a;

    /* renamed from: b */
    private final InterfaceC24854k f102536b;

    /* renamed from: c */
    private boolean f102537c;

    /* renamed from: d */
    private int f102538d;

    /* renamed from: iw.l0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: iw.l0$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f102539a;

        static {
            int[] iArr = new int[C23805a.d.values().length];
            try {
                iArr[C23805a.d.f115057q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C23805a.d.f115058r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C23805a.d.f115056p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C23805a.d.f115059s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C23805a.d.f115060t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f102539a = iArr;
        }
    }

    /* renamed from: iw.l0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C17945a0) obj2).m95313z4()), Long.valueOf(((C17945a0) obj).m95313z4()));
            return m135478b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iw.l0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f102540q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iw.l0$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f102541q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public C20861l0() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f102540q);
        this.f102535a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(e.f102541q);
        this.f102536b = m129210a2;
    }

    /* renamed from: a */
    public final List m109111a(int i11, C23805a.d dVar) {
        int m116584g;
        boolean z11;
        Object m131216p0;
        boolean m123190r;
        boolean m123190r2;
        AbstractC19074t.m100208f(dVar, "modeMessage");
        m116584g = AbstractC22543l.m116584g(m109113c().size(), this.f102538d + i11);
        List subList = m109113c().subList(this.f102538d, m116584g);
        ArrayList<C17945a0> arrayList = new ArrayList();
        List m41557s = C7956b.Companion.m41573b().m41557s(subList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : m41557s) {
            C17945a0 c17945a0 = (C17945a0) obj;
            int i12 = b.f102539a[dVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                m123190r2 = AbstractC23463h.m123186n(c17945a0);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            m123190r2 = AbstractC23463h.m123184l(c17945a0);
                        }
                    } else {
                        m123190r2 = AbstractC23463h.m123188p(c17945a0);
                    }
                } else {
                    m123190r2 = AbstractC23463h.m123192t(c17945a0);
                }
            } else {
                m123190r2 = AbstractC23463h.m123190r(c17945a0);
            }
            if (m123190r2) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        int i13 = this.f102538d;
        int i14 = m116584g - i13;
        this.f102538d = i13 + i14;
        if (arrayList.size() < i14) {
            int size = i14 - arrayList.size();
            while (size > 0 && this.f102538d < m109113c().size()) {
                C17945a0 m41553q = C7956b.Companion.m41573b().m41553q((MessageId) m109113c().get(this.f102538d));
                if (m41553q != null) {
                    int i15 = b.f102539a[dVar.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    if (i15 == 5) {
                                        m123190r = AbstractC23463h.m123186n(m41553q);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    m123190r = AbstractC23463h.m123184l(m41553q);
                                }
                            } else {
                                m123190r = AbstractC23463h.m123188p(m41553q);
                            }
                        } else {
                            m123190r = AbstractC23463h.m123192t(m41553q);
                        }
                    } else {
                        m123190r = AbstractC23463h.m123190r(m41553q);
                    }
                    if (m123190r) {
                        AbstractC19074t.m100205c(m41553q);
                        arrayList.add(m41553q);
                        size--;
                    }
                }
                this.f102538d++;
            }
        }
        int i16 = 0;
        if (this.f102538d < m109113c().size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f102537c = z11;
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                AbstractC25376w.m131534w(arrayList, new c());
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            m131216p0 = AbstractC25332a0.m131216p0(arrayList);
            long m119182A0 = AbstractC23160o0.m119182A0(((C17945a0) m131216p0).m95313z4());
            int i17 = 0;
            for (C17945a0 c17945a02 : arrayList) {
                i16++;
                long m119182A02 = AbstractC23160o0.m119182A0(c17945a02.m95313z4());
                if (i17 == 0 && m119182A0 == m119182A02) {
                    i17 = (arrayList.size() - i16) + 1;
                }
                if (this.f102537c && i17 != 0 && i17 < 50) {
                    this.f102538d--;
                } else {
                    arrayList3.add(c17945a02);
                }
            }
        }
        C21956b.m114657g("SMLSearchMyCloudResultDataController", "doLoadChatContents(): offset=" + this.f102538d + ", messageIds.size=" + m109113c().size() + ", numOfLoadingItem=" + i11 + ". Result: " + arrayList3.size() + " item(s)");
        return arrayList3;
    }

    /* renamed from: b */
    public final boolean m109112b() {
        return this.f102537c;
    }

    /* renamed from: c */
    public final List m109113c() {
        return (List) this.f102535a.getValue();
    }

    /* renamed from: d */
    public final List m109114d() {
        return (List) this.f102536b.getValue();
    }

    /* renamed from: e */
    public final void m109115e() {
        m109113c().clear();
        m109114d().clear();
        this.f102537c = false;
        this.f102538d = 0;
    }
}
