package b90;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: b90.c */
/* loaded from: classes6.dex */
public final class C2666c {

    /* renamed from: a */
    private String f10671a;

    /* renamed from: b */
    private long f10672b;

    /* renamed from: c */
    private final List f10673c;

    /* renamed from: d */
    private final InterfaceC24854k f10674d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b90.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final MyCloudItem mo12V4() {
            MyCloudItem myCloudItem = new MyCloudItem(-100);
            C2666c c2666c = C2666c.this;
            myCloudItem.m71023g(c2666c.m13097b());
            myCloudItem.m71024h(c2666c.m13100e());
            return myCloudItem;
        }
    }

    public C2666c(String str, long j11, List list) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "headerTitle");
        AbstractC19074t.m100208f(list, "itemList");
        this.f10671a = str;
        this.f10672b = j11;
        this.f10673c = list;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f10674d = m129210a;
    }

    /* renamed from: a */
    public final boolean m13096a(MyCloudMessageItem myCloudMessageItem) {
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        synchronized (this.f10673c) {
            try {
                List list = this.f10673c;
                int i11 = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((MyCloudMessageItem) it.next()).m71033m().m95135f9(myCloudMessageItem.m71033m().m95029V3())) {
                            return false;
                        }
                    }
                }
                int size = this.f10673c.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (((MyCloudMessageItem) this.f10673c.get(i12)).m71033m().m95313z4() >= myCloudMessageItem.m71033m().m95313z4() && (i12 == this.f10673c.size() - 1 || ((MyCloudMessageItem) this.f10673c.get(i12 + 1)).m71033m().m95313z4() <= myCloudMessageItem.m71033m().m95313z4())) {
                        i11 = i12 + 1;
                        break;
                    }
                }
                this.f10673c.add(i11, myCloudMessageItem);
                C24848g0 c24848g0 = C24848g0.f119245a;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final String m13097b() {
        return this.f10671a;
    }

    /* renamed from: c */
    public final List m13098c() {
        return this.f10673c;
    }

    /* renamed from: d */
    public final MyCloudItem m13099d() {
        return (MyCloudItem) this.f10674d.getValue();
    }

    /* renamed from: e */
    public final long m13100e() {
        return this.f10672b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2666c)) {
            return false;
        }
        C2666c c2666c = (C2666c) obj;
        return AbstractC19074t.m100204b(this.f10671a, c2666c.f10671a) && this.f10672b == c2666c.f10672b && AbstractC19074t.m100204b(this.f10673c, c2666c.f10673c);
    }

    /* renamed from: f */
    public final void m13101f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f10671a = str;
    }

    /* renamed from: g */
    public final void m13102g(long j11) {
        this.f10672b = j11;
    }

    public int hashCode() {
        return (((this.f10671a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f10672b)) * 31) + this.f10673c.hashCode();
    }

    public String toString() {
        return "MyCloudPickerMessageSection(headerTitle=" + this.f10671a + ", sectionTime=" + this.f10672b + ", itemList=" + this.f10673c + ")";
    }

    public /* synthetic */ C2666c(String str, long j11, List list, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? new CopyOnWriteArrayList() : list);
    }
}
