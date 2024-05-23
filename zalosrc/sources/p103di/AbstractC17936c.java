package p103di;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pm0.C24848g0;

/* renamed from: di.c */
/* loaded from: classes3.dex */
public abstract class AbstractC17936c {

    /* renamed from: b */
    private b f90544b;

    /* renamed from: a */
    private final List f90543a = new ArrayList();

    /* renamed from: c */
    private List f90545c = new ArrayList();

    /* renamed from: d */
    private final Map f90546d = new HashMap();

    /* renamed from: e */
    private final Map f90547e = new HashMap();

    /* renamed from: f */
    private final List f90548f = new ArrayList();

    /* renamed from: g */
    private final Object f90549g = new Object();

    /* renamed from: h */
    private Handler f90550h = new Handler(Looper.getMainLooper());

    /* renamed from: di.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private int f90551a = -1;

        /* renamed from: b */
        private MessageId f90552b;

        /* renamed from: a */
        public final MessageId m94605a() {
            return this.f90552b;
        }

        /* renamed from: b */
        public final int m94606b() {
            return this.f90551a;
        }

        /* renamed from: c */
        public final void m94607c(MessageId messageId) {
            this.f90552b = messageId;
        }

        /* renamed from: d */
        public final void m94608d(int i11) {
            this.f90551a = i11;
        }
    }

    /* renamed from: di.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo66899a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m94585r(AbstractC17936c abstractC17936c) {
        AbstractC19074t.m100208f(abstractC17936c, "this$0");
        b bVar = abstractC17936c.f90544b;
        if (bVar != null) {
            bVar.mo66899a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m94586t(AbstractC17936c abstractC17936c) {
        AbstractC19074t.m100208f(abstractC17936c, "this$0");
        b bVar = abstractC17936c.f90544b;
        if (bVar != null) {
            bVar.mo66899a();
        }
    }

    /* renamed from: v */
    private final void m94587v(int i11) {
        synchronized (this.f90549g) {
            if (i11 >= 0) {
                try {
                    if (i11 < this.f90548f.size()) {
                        this.f90548f.remove(i11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: c */
    public void mo94588c() {
    }

    /* renamed from: d */
    public final Handler m94589d() {
        return this.f90550h;
    }

    /* renamed from: e */
    public final List m94590e() {
        return this.f90548f;
    }

    /* renamed from: f */
    public final Map m94591f() {
        return this.f90547e;
    }

    /* renamed from: g */
    public final Map m94592g() {
        return this.f90546d;
    }

    /* renamed from: h */
    public final List m94593h() {
        return this.f90543a;
    }

    /* renamed from: i */
    public final b m94594i() {
        return this.f90544b;
    }

    /* renamed from: j */
    public final List m94595j() {
        return this.f90545c;
    }

    /* renamed from: k */
    public final Object m94596k() {
        return this.f90549g;
    }

    /* renamed from: l */
    public final SparseArray m94597l() {
        SparseArray sparseArray;
        synchronized (this.f90549g) {
            int size = this.f90548f.size();
            sparseArray = new SparseArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                sparseArray.put(i11, ((a) this.f90548f.get(i11)).m94605a());
            }
        }
        return sparseArray;
    }

    /* renamed from: m */
    public final SparseIntArray m94598m() {
        SparseIntArray sparseIntArray;
        synchronized (this.f90549g) {
            int size = this.f90548f.size();
            sparseIntArray = new SparseIntArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                sparseIntArray.put(i11, ((a) this.f90548f.get(i11)).m94606b());
            }
        }
        return sparseIntArray;
    }

    /* renamed from: n */
    public final List m94599n() {
        ArrayList arrayList;
        synchronized (this.f90549g) {
            arrayList = new ArrayList(this.f90543a);
        }
        return arrayList;
    }

    /* renamed from: o */
    public void mo94600o(List list, int i11, SparseIntArray sparseIntArray, SparseArray sparseArray, boolean z11) {
        MessageId messageId;
        synchronized (this.f90549g) {
            try {
                this.f90545c = list;
                this.f90543a.clear();
                if (list != null) {
                    this.f90543a.addAll(list);
                    this.f90546d.clear();
                    this.f90547e.clear();
                    this.f90548f.clear();
                    int size = list.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) list.get(i12);
                        a aVar = new a();
                        int i13 = -1;
                        if (sparseIntArray != null) {
                            i13 = sparseIntArray.get(i12, -1);
                        }
                        aVar.m94608d(i13);
                        if (sparseArray != null) {
                            messageId = (MessageId) sparseArray.get(i12);
                        } else {
                            messageId = null;
                        }
                        aVar.m94607c(messageId);
                        if (itemAlbumMobile.m40508S()) {
                            Map map = this.f90546d;
                            String m40495B = itemAlbumMobile.m40495B();
                            AbstractC19074t.m100207e(m40495B, "getGlobalMsgId(...)");
                            map.put(m40495B, aVar);
                        }
                        if (itemAlbumMobile.m40507R()) {
                            Map map2 = this.f90547e;
                            String m40534w = itemAlbumMobile.m40534w();
                            AbstractC19074t.m100207e(m40534w, "getClientMsgId(...)");
                            map2.put(m40534w, aVar);
                        }
                        this.f90548f.add(aVar);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public abstract void mo94601p();

    /* renamed from: q */
    public final boolean m94602q(MessageId messageId) {
        boolean z11 = false;
        if (messageId == null) {
            return false;
        }
        synchronized (this.f90549g) {
            try {
                Iterator it = this.f90543a.iterator();
                int i11 = -1;
                while (it.hasNext()) {
                    i11++;
                    if (AbstractC19074t.m100204b(messageId, ((ItemAlbumMobile) it.next()).m40496C())) {
                        it.remove();
                        m94587v(i11);
                        z11 = true;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.f90550h.post(new Runnable() { // from class: di.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC17936c.m94585r(AbstractC17936c.this);
                }
            });
        }
        return z11;
    }

    /* renamed from: s */
    public final boolean m94603s(List list, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(list, "deletedMessageIds");
        synchronized (this.f90549g) {
            try {
                Iterator it = this.f90543a.iterator();
                z12 = false;
                int i11 = -1;
                while (it.hasNext()) {
                    i11++;
                    MediaStoreItem mediaStoreItem = ((ItemAlbumMobile) it.next()).f42598s0;
                    if (mediaStoreItem != null && list.contains(mediaStoreItem.m40571M())) {
                        it.remove();
                        m94587v(i11);
                        z12 = true;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12 && z11) {
            this.f90550h.post(new Runnable() { // from class: di.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC17936c.m94586t(AbstractC17936c.this);
                }
            });
        }
        return z12;
    }

    /* renamed from: u */
    public final void m94604u(b bVar) {
        this.f90544b = bVar;
    }
}
